package com.yandex.go.navigator.driving;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoView;
import defpackage.cma1;
import defpackage.fuh0;
import defpackage.h901;
import defpackage.ny61;
import defpackage.qtg0;
import defpackage.tje;
import defpackage.xw31;
import defpackage.z5h0;
import defpackage.zjf0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u000fJ\u0015\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0013\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/yandex/go/navigator/driving/ProgressView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrsAttributeSet", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "doubleProgress", "Lzy11;", "setProgress", "(D)V", "updateShade", "()V", "updateArrow", "progress", "maxProgress", "getArrowMargin", "(II)I", "setRouteProgress", "Lh901;", "trafficLineContent", "updateTrafficLine", "(Lh901;)V", "Lzjf0;", "binding", "Lzjf0;", CA20Status.STATUS_USER_I, "", "trafficLineCornerRadius", "F", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProgressView extends GoFrameLayout {
    public static final int $stable = 8;
    private final zjf0 binding;
    private int progress;
    private float trafficLineCornerRadius;

    public ProgressView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        View inflate = LayoutInflater.from(context).inflate(fuh0.progress_view, (ViewGroup) this, false);
        addView(inflate);
        int i3 = z5h0.dot_at_end;
        if (((GoImageView) cma1.O(i3, inflate)) != null) {
            i3 = z5h0.imageview_progress_arrow;
            GoImageView goImageView = (GoImageView) cma1.O(i3, inflate);
            if (goImageView != null) {
                GoFrameLayout goFrameLayout = (GoFrameLayout) inflate;
                int i4 = z5h0.view_progress_jams;
                GoView goView = (GoView) cma1.O(i4, inflate);
                if (goView != null) {
                    i4 = z5h0.view_progress_shade;
                    GoView goView2 = (GoView) cma1.O(i4, inflate);
                    if (goView2 != null) {
                        this.binding = new zjf0(goFrameLayout, goImageView, goView, goView2);
                        this.trafficLineCornerRadius = tje.r(qtg0.radius_contextprogress_background, context);
                        setScaleX(xw31.n(context) ? -1.0f : 1.0f);
                        return;
                    }
                }
                i3 = i4;
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
        throw null;
    }

    private final int getArrowMargin(int progress, int maxProgress) {
        return progress > maxProgress ? maxProgress : progress;
    }

    private final void setProgress(double doubleProgress) {
        int width = (int) (((getWidth() - getPaddingRight()) - getPaddingLeft()) * doubleProgress);
        if (Math.abs(this.progress - width) > 4) {
            this.progress = width;
            updateShade();
            updateArrow();
        }
    }

    private final void updateArrow() {
        int width = this.binding.b.getWidth() / 2;
        Pair pair = new Pair(Integer.valueOf(getArrowMargin(this.progress - width, ((getWidth() - getPaddingStart()) - getPaddingEnd()) - width)), Integer.valueOf(-(getWidth() - width)));
        xw31.E(this.binding.b, Integer.valueOf(((Number) pair.getFirst()).intValue()), null, Integer.valueOf(((Number) pair.getSecond()).intValue()), null);
    }

    private final void updateShade() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.binding.d.getLayoutParams();
        layoutParams.width = this.progress;
        this.binding.d.setLayoutParams(layoutParams);
    }

    public final void setRouteProgress(double progress) {
        setProgress(progress);
    }

    public final void updateTrafficLine(final h901 trafficLineContent) {
        if (trafficLineContent.a.length < 2) {
            return;
        }
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.setShape(new RectShape());
        paintDrawable.setCornerRadius(this.trafficLineCornerRadius);
        paintDrawable.setShaderFactory(new ShapeDrawable.ShaderFactory() { // from class: com.yandex.go.navigator.driving.ProgressView$updateTrafficLine$1
            @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
            public Shader resize(int width, int height) {
                Pair pair = new Pair(Float.valueOf(0.0f), Float.valueOf(width));
                float floatValue = ((Number) pair.getFirst()).floatValue();
                float floatValue2 = ((Number) pair.getSecond()).floatValue();
                h901 h901Var = h901.this;
                return new LinearGradient(floatValue, 0.0f, floatValue2, 0.0f, h901Var.a, h901Var.b, Shader.TileMode.REPEAT);
            }
        });
        this.binding.c.setBackground(paintDrawable);
    }

    public ProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public ProgressView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public ProgressView(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ ProgressView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
