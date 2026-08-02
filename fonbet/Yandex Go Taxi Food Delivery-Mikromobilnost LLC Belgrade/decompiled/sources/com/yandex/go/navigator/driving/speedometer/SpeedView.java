package com.yandex.go.navigator.driving.speedometer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoFrameLayout;
import defpackage.cma1;
import defpackage.fuh0;
import defpackage.npt0;
import defpackage.ny61;
import defpackage.qtg0;
import defpackage.tje;
import defpackage.z5h0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/yandex/go/navigator/driving/speedometer/SpeedView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrsAttributeSet", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lzy11;", "updateStyle", "()V", "onFinishInflate", "", "speed", "setSpeed", "(Ljava/lang/String;)V", "Lnpt0;", "binding", "Lnpt0;", "", "smallTextSize", "F", "largeTextSize", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SpeedView extends GoFrameLayout {
    public static final int $stable = 8;
    private final npt0 binding;
    private final float largeTextSize;
    private final float smallTextSize;

    public SpeedView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        View inflate = LayoutInflater.from(context).inflate(fuh0.speed_view, (ViewGroup) this, false);
        addView(inflate);
        int i3 = z5h0.text_speed_value;
        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i3, inflate);
        if (robotoTextView == null) {
            ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
            throw null;
        }
        this.binding = new npt0((GoFrameLayout) inflate, robotoTextView);
        this.smallTextSize = getResources().getDimensionPixelSize(qtg0.textsize_map_speedvalue_min);
        this.largeTextSize = getResources().getDimensionPixelSize(qtg0.textsize_map_speedvalue_max);
    }

    private final void updateStyle() {
        int r = tje.r(qtg0.size_map_speed, getContext());
        ViewGroup.LayoutParams layoutParams = this.binding.a.getLayoutParams();
        layoutParams.width = r;
        layoutParams.height = r;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        updateStyle();
    }

    public final void setSpeed(String speed) {
        this.binding.a.setVisibility(speed.length() > 0 ? 0 : 8);
        RobotoTextView robotoTextView = this.binding.b;
        robotoTextView.setText(speed);
        robotoTextView.setTextSize(0, speed.length() > 2 ? this.smallTextSize : this.largeTextSize);
    }

    public SpeedView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public SpeedView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public SpeedView(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ SpeedView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
