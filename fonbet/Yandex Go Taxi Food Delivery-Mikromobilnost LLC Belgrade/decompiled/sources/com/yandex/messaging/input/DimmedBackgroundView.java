package com.yandex.messaging.input;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import defpackage.drb1;
import defpackage.jng0;
import defpackage.sls;
import defpackage.tls;
import defpackage.u90;
import defpackage.vkj;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0019\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000e0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R*\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R0\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0012\u0018\u0001058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lcom/yandex/messaging/input/DimmedBackgroundView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "view", "", "extractCornerRadius", "(Landroid/view/View;)F", "Lvkj;", "cutout", "Landroid/graphics/RectF;", "outRect", "Lzy11;", "calculateCutoutRect", "(Lvkj;Landroid/graphics/RectF;)V", "", "respectPadding", "", "customCornerRadii", "addCutoutView", "(Landroid/view/View;Z[F)V", "clearCutouts", "()V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/graphics/Paint;", "dimPaint", "Landroid/graphics/Paint;", "clearPaint", "", "cutouts", "Ljava/util/List;", "tempRect", "Landroid/graphics/RectF;", "Lkotlin/Function0;", "onDimmedAreaClickListener", "Lsls;", "getOnDimmedAreaClickListener", "()Lsls;", "setOnDimmedAreaClickListener", "(Lsls;)V", "Lkotlin/Function1;", "onCutoutAreaClickListener", "Ltls;", "getOnCutoutAreaClickListener", "()Ltls;", "setOnCutoutAreaClickListener", "(Ltls;)V", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DimmedBackgroundView extends View {
    public static final int $stable = 8;
    private final Paint clearPaint;
    private final List<vkj> cutouts;
    private final Paint dimPaint;
    private tls onCutoutAreaClickListener;
    private sls onDimmedAreaClickListener;
    private final RectF tempRect;

    public DimmedBackgroundView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint(1);
        paint.setColor(drb1.c(jng0.messagingFadeColor, context));
        paint.setStyle(Paint.Style.FILL);
        this.dimPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.clearPaint = paint2;
        this.cutouts = new ArrayList();
        this.tempRect = new RectF();
        setLayerType(1, null);
    }

    public static /* synthetic */ void addCutoutView$default(DimmedBackgroundView dimmedBackgroundView, View view, boolean z, float[] fArr, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            fArr = null;
        }
        dimmedBackgroundView.addCutoutView(view, z, fArr);
    }

    private final void calculateCutoutRect(vkj cutout, RectF outRect) {
        View view = cutout.a;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        getLocationOnScreen(iArr2);
        int i = iArr[0] - iArr2[0];
        int i2 = iArr[1] - iArr2[1];
        int width = view.getWidth() + i;
        int height = view.getHeight() + i2;
        if (cutout.b) {
            outRect.set(view.getPaddingLeft() + i, view.getPaddingTop() + i2, width - view.getPaddingRight(), height - view.getPaddingBottom());
        } else {
            outRect.set(i, i2, width, height);
        }
    }

    private final float extractCornerRadius(View view) {
        float f;
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            Float valueOf = Float.valueOf(((GradientDrawable) background).getCornerRadius());
            if (valueOf.floatValue() < 0.0f) {
                valueOf = null;
            }
            if (valueOf != null) {
                return valueOf.floatValue();
            }
            f = getContext().getResources().getDisplayMetrics().density;
        } else {
            f = getContext().getResources().getDisplayMetrics().density;
        }
        return f * 16.0f;
    }

    public final void addCutoutView(View view, boolean respectPadding, float[] customCornerRadii) {
        u90 u90Var = new u90(26, this);
        view.addOnLayoutChangeListener(u90Var);
        this.cutouts.add(new vkj(view, respectPadding, customCornerRadii, u90Var));
        invalidate();
    }

    public final void clearCutouts() {
        for (vkj vkjVar : this.cutouts) {
            vkjVar.a.removeOnLayoutChangeListener(vkjVar.d);
        }
        this.cutouts.clear();
        invalidate();
    }

    public final tls getOnCutoutAreaClickListener() {
        return this.onCutoutAreaClickListener;
    }

    public final sls getOnDimmedAreaClickListener() {
        return this.onDimmedAreaClickListener;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.dimPaint);
        for (vkj vkjVar : this.cutouts) {
            calculateCutoutRect(vkjVar, this.tempRect);
            if (vkjVar.c != null) {
                Path path = new Path();
                float f = getContext().getResources().getDisplayMetrics().density;
                float[] fArr = vkjVar.c;
                float f2 = fArr[0] * f;
                float f3 = fArr[1] * f;
                float f4 = fArr[2] * f;
                float f5 = fArr[3] * f;
                path.addRoundRect(this.tempRect, new float[]{f2, f2, f3, f3, f4, f4, f5, f5}, Path.Direction.CW);
                canvas.drawPath(path, this.clearPaint);
            } else {
                float extractCornerRadius = extractCornerRadius(vkjVar.a);
                canvas.drawRoundRect(this.tempRect, extractCornerRadius, extractCornerRadius, this.clearPaint);
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() != 0) {
            return super.onTouchEvent(event);
        }
        float x = event.getX();
        float y = event.getY();
        for (vkj vkjVar : this.cutouts) {
            calculateCutoutRect(vkjVar, this.tempRect);
            if (this.tempRect.contains(x, y)) {
                tls tlsVar = this.onCutoutAreaClickListener;
                if (tlsVar == null) {
                    return false;
                }
                tlsVar.invoke(vkjVar.a);
                return false;
            }
        }
        sls slsVar = this.onDimmedAreaClickListener;
        if (slsVar == null) {
            return true;
        }
        slsVar.invoke();
        return true;
    }

    public final void setOnCutoutAreaClickListener(tls tlsVar) {
        this.onCutoutAreaClickListener = tlsVar;
    }

    public final void setOnDimmedAreaClickListener(sls slsVar) {
        this.onDimmedAreaClickListener = slsVar;
    }

    public DimmedBackgroundView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ DimmedBackgroundView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public DimmedBackgroundView(Context context) {
        this(context, null, 0, 6, null);
    }
}
