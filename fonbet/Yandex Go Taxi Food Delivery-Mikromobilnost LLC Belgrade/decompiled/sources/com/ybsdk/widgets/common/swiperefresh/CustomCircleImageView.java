package com.ybsdk.widgets.common.swiperefresh;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import com.ybsdk.core.utils.ui.core.CoreShapeDrawable;
import defpackage.p2i0;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes11.dex */
class CustomCircleImageView extends AppCompatImageView {
    private static final int DEFAULT_BACKGROUND_COLOR = -328966;
    private static final int FILL_SHADOW_COLOR = 1023410176;
    private static final int KEY_SHADOW_COLOR = 503316480;
    private static final int SHADOW_ELEVATION = 4;
    private static final float SHADOW_RADIUS = 3.5f;
    private static final float X_OFFSET = 0.0f;
    private static final float Y_OFFSET = 1.75f;
    private int mBackgroundColor;
    private Animation.AnimationListener mListener;
    private int mShadowRadius;

    /* loaded from: classes6.dex */
    public static class OvalShadow extends OvalShape {
        private CustomCircleImageView mCircleImageView;
        private Paint mShadowPaint = new Paint();
        private int mShadowRadius;

        public OvalShadow(CustomCircleImageView customCircleImageView, int i) {
            this.mCircleImageView = customCircleImageView;
            this.mShadowRadius = i;
            updateRadialGradient((int) rect().width());
        }

        private void updateRadialGradient(int i) {
            float f = i / 2;
            this.mShadowPaint.setShader(new RadialGradient(f, f, this.mShadowRadius, new int[]{CustomCircleImageView.FILL_SHADOW_COLOR, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            float width = this.mCircleImageView.getWidth() / 2;
            float height = this.mCircleImageView.getHeight() / 2;
            canvas.drawCircle(width, height, width, this.mShadowPaint);
            canvas.drawCircle(width, height, r0 - this.mShadowRadius, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void onResize(float f, float f2) {
            super.onResize(f, f2);
            updateRadialGradient((int) f);
        }
    }

    public CustomCircleImageView(Context context) {
        super(context);
        float f = getContext().getResources().getDisplayMetrics().density;
        this.mShadowRadius = (int) (3.5f * f);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(p2i0.SwipeRefreshLayout);
        this.mBackgroundColor = obtainStyledAttributes.getColor(p2i0.SwipeRefreshLayout_swipeRefreshLayoutProgressSpinnerBackgroundColor, DEFAULT_BACKGROUND_COLOR);
        obtainStyledAttributes.recycle();
        float[] fArr = new float[8];
        Arrays.fill(fArr, getMeasuredHeight() / 2.0f);
        CoreShapeDrawable oval = CoreShapeDrawable.oval(fArr);
        WeakHashMap weakHashMap = b.a;
        ViewCompat$Api21Impl.m(this, f * 4.0f);
        oval.getPaint().setColor(this.mBackgroundColor);
        setBackground(oval);
    }

    public int getBackgroundColor() {
        return this.mBackgroundColor;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.mListener;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.mListener;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension((this.mShadowRadius * 2) + getMeasuredWidth(), (this.mShadowRadius * 2) + getMeasuredHeight());
    }

    public void setAnimationListener(Animation.AnimationListener animationListener) {
        this.mListener = animationListener;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (getBackground() instanceof CoreShapeDrawable) {
            ((CoreShapeDrawable) getBackground()).getPaint().setColor(i);
            this.mBackgroundColor = i;
        }
    }
}
