package com.yandex.go.navigator.driving.speedometer;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.lgr0;
import defpackage.lpt0;
import defpackage.mrg0;
import defpackage.xw31;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/yandex/go/navigator/driving/speedometer/SpeedGroupView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrsAttributeSet", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/graphics/Canvas;", "canvas", "Landroid/view/View;", "view", "Lzy11;", "redrawView", "(Landroid/graphics/Canvas;Landroid/view/View;)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "onDraw", "(Landroid/graphics/Canvas;)V", "onFinishInflate", "()V", "Llpt0;", ClidProvider.STATE, "render", "(Llpt0;)V", "Llgr0;", "shadowHelper", "Llgr0;", "Lcom/yandex/go/navigator/driving/speedometer/SpeedView;", "speedView", "Lcom/yandex/go/navigator/driving/speedometer/SpeedView;", "Lcom/yandex/go/navigator/driving/speedometer/SpeedLimitView;", "speedLimitView", "Lcom/yandex/go/navigator/driving/speedometer/SpeedLimitView;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SpeedGroupView extends GoLinearLayout {
    public static final int $stable = 8;
    private lgr0 shadowHelper;
    private final SpeedLimitView speedLimitView;
    private final SpeedView speedView;

    public SpeedGroupView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.shadowHelper = new lgr0(context, 0.0f);
        int i3 = 14;
        DefaultConstructorMarker defaultConstructorMarker = null;
        AttributeSet attributeSet2 = null;
        int i4 = 0;
        int i5 = 0;
        SpeedView speedView = new SpeedView(context, attributeSet2, i4, i5, i3, defaultConstructorMarker);
        speedView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        speedView.setClipChildren(false);
        this.speedView = speedView;
        SpeedLimitView speedLimitView = new SpeedLimitView(context, attributeSet2, i4, i5, i3, defaultConstructorMarker);
        speedLimitView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        speedLimitView.setClipChildren(false);
        this.speedLimitView = speedLimitView;
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setOrientation(0);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setAnimateParentHierarchy(true);
        setLayoutTransition(layoutTransition);
        setClipChildren(false);
        setWillNotDraw(false);
        addView(speedView);
        addView(speedLimitView);
        xw31.F(speedLimitView, Integer.valueOf(-((int) getResources().getDimension(mrg0.go_design_s_space))), null, null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (r7.getHeight() == r11) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void redrawView(Canvas canvas, View view) {
        canvas.save();
        canvas.translate(view.getX(), 0.0f);
        lgr0 lgr0Var = this.shadowHelper;
        float measuredHeight = getMeasuredHeight();
        float measuredHeight2 = getMeasuredHeight();
        float f = lgr0Var.d;
        float f2 = lgr0Var.c;
        float f3 = lgr0Var.b;
        int i = (int) measuredHeight;
        int i2 = (int) measuredHeight2;
        float f4 = lgr0Var.a;
        Canvas canvas2 = lgr0Var.g;
        RectF rectF = lgr0Var.f;
        Bitmap bitmap = lgr0Var.h;
        if (bitmap != null && bitmap.getWidth() == i) {
            Bitmap bitmap2 = lgr0Var.h;
            if (bitmap2 == null) {
                bitmap2 = null;
            }
        }
        int i3 = (int) lgr0Var.e;
        Bitmap createBitmap = Bitmap.createBitmap(i + i3, i3 + i2, Bitmap.Config.ARGB_8888);
        lgr0Var.h = createBitmap;
        if (createBitmap == null) {
            createBitmap = null;
        }
        canvas2.setBitmap(createBitmap);
        rectF.set(f3, f3, i + f3, i2 + f3);
        canvas2.drawRoundRect(rectF, f4, f4, lgr0Var.i);
        canvas2.save();
        canvas2.translate(-f2, -f);
        canvas2.drawRoundRect(rectF, f4, f4, lgr0Var.j);
        canvas2.restore();
        canvas.save();
        canvas.translate(f2, f);
        Bitmap bitmap3 = lgr0Var.h;
        if (bitmap3 == null) {
            bitmap3 = null;
        }
        float f5 = -f3;
        canvas.drawBitmap(bitmap3, f5, f5, (Paint) null);
        canvas.restore();
        canvas.restore();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.speedView.getVisibility() == 0) {
            redrawView(canvas, this.speedView);
        }
        if (this.speedLimitView.getVisibility() == 0) {
            redrawView(canvas, this.speedLimitView);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.speedView.onFinishInflate();
        this.speedLimitView.onFinishInflate();
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.shadowHelper = new lgr0(getContext(), getMeasuredHeight() / 2.0f);
    }

    public final void render(lpt0 state) {
        this.speedView.setSpeed(state.a);
        SpeedLimitView speedLimitView = this.speedLimitView;
        String str = state.b;
        speedLimitView.setVisibility(str.length() > 0 ? 0 : 8);
        this.speedLimitView.setSpeedLimit(str);
        this.speedLimitView.setSpeedLimitExceeded(state.c);
    }

    public SpeedGroupView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public SpeedGroupView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public SpeedGroupView(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ SpeedGroupView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
