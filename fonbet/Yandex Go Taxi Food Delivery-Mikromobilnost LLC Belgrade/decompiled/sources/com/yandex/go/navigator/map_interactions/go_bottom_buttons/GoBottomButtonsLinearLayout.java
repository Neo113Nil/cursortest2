package com.yandex.go.navigator.map_interactions.go_bottom_buttons;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.bdc;
import defpackage.cma1;
import defpackage.dya1;
import defpackage.fuh0;
import defpackage.ijs;
import defpackage.kyh0;
import defpackage.ny61;
import defpackage.sls;
import defpackage.smt;
import defpackage.xng0;
import defpackage.z5h0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.ButtonComponent;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\rJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\rJ\u001b\u0010\u0013\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011¢\u0006\u0004\b\u0015\u0010\u0014J\u001b\u0010\u0016\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011¢\u0006\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/yandex/go/navigator/map_interactions/go_bottom_buttons/GoBottomButtonsLinearLayout;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrsAttributeSet", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lzy11;", "hideGoFrom", "()V", "showGoFrom", "setLoadingState", "setNormalState", "Lkotlin/Function0;", "listener", "setOnGoViaDebounceClickListener", "(Lsls;)V", "setOnGoHereDebounceClickListener", "setOnFromDebounceClickListener", "Lsmt;", "binding", "Lsmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GoBottomButtonsLinearLayout extends GoLinearLayout {
    public static final int $stable = 8;
    private final smt binding;

    public GoBottomButtonsLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        View inflate = LayoutInflater.from(context).inflate(fuh0.go_bottom_button_layout, (ViewGroup) this, false);
        addView(inflate);
        LinearLayout linearLayout = (LinearLayout) inflate;
        int i3 = z5h0.go_from_btn;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i3, inflate);
        if (buttonComponent != null) {
            i3 = z5h0.go_here_btn;
            ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i3, inflate);
            if (buttonComponent2 != null) {
                i3 = z5h0.go_via_btn;
                ButtonComponent buttonComponent3 = (ButtonComponent) cma1.O(i3, inflate);
                if (buttonComponent3 != null) {
                    this.binding = new smt(linearLayout, buttonComponent, buttonComponent2, buttonComponent3);
                    setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
        throw null;
    }

    public final void hideGoFrom() {
        this.binding.b.setVisibility(8);
    }

    public final void setLoadingState() {
        smt smtVar = this.binding;
        dya1.b(smtVar.b);
        dya1.b(smtVar.d);
        dya1.b(smtVar.c);
    }

    public final void setNormalState() {
        smt smtVar = this.binding;
        dya1.c(smtVar.c, new bdc(xng0.textOnControl), new bdc(xng0.controlMain), kyh0.navigator_map_interaction_go_here_button_title);
        dya1.c(smtVar.b, new bdc(xng0.textOnControlMinor), new bdc(xng0.controlMinor), kyh0.navigator_map_interaction_from_button_title);
        dya1.c(smtVar.d, new bdc(xng0.textOnControlMinor), new bdc(xng0.controlMinor), kyh0.navigator_map_interaction_go_via_button_title);
    }

    public final void setOnFromDebounceClickListener(sls listener) {
        this.binding.b.setDebounceClickListener(new ijs(5, listener));
    }

    public final void setOnGoHereDebounceClickListener(sls listener) {
        this.binding.c.setDebounceClickListener(new ijs(3, listener));
    }

    public final void setOnGoViaDebounceClickListener(sls listener) {
        this.binding.d.setDebounceClickListener(new ijs(4, listener));
    }

    public final void showGoFrom() {
        this.binding.b.setVisibility(0);
    }

    public GoBottomButtonsLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public GoBottomButtonsLinearLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public GoBottomButtonsLinearLayout(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ GoBottomButtonsLinearLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
