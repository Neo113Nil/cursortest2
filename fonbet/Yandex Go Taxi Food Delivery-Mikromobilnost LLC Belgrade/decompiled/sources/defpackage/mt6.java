package defpackage;

import android.view.View;
import android.view.ViewGroup;
import defpackage.mt6;
import defpackage.tls;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemCheckComponent;
import ru.yandex.taxi.design.ListItemSwitchComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.surge.dialog.GradientComponentView;

/* loaded from: classes14.dex */
public final class mt6 extends wys {
    public static final /* synthetic */ int U = 0;
    public static final /* synthetic */ int V = 0;
    public static final /* synthetic */ int W = 0;
    public static final /* synthetic */ int Z = 0;
    public static final /* synthetic */ int a0 = 0;
    public final /* synthetic */ int R;
    public final Object S;
    public final Object T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mt6(yss0 yss0Var, ur70 ur70Var) {
        super(yss0Var.asView());
        this.R = 0;
        this.S = yss0Var;
        this.T = ur70Var;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        int i = this.R;
        int i2 = 19;
        Object obj2 = this.S;
        switch (i) {
            case 0:
                ((yss0) obj2).render(((zq70) obj).a, false, new lt6(this, r2));
                break;
            case 1:
                ButtonComponent buttonComponent = (ButtonComponent) this.T;
                buttonComponent.setText(kyh0.order_add_route_point);
                buttonComponent.setDebounceClickListener(new h60(13, (sls) obj2));
                break;
            case 2:
                final cyt cytVar = (cyt) obj;
                GradientComponentView gradientComponentView = (GradientComponentView) obj2;
                gradientComponentView.getBinding().a.setOnClickListener(new View.OnClickListener() { // from class: ru.yandex.taxi.surge.dialog.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ((SurgeInfoModalView$createAdapter$2) ((tls) mt6.this.T)).invoke(cytVar.e);
                    }
                });
                ViewGroup.LayoutParams layoutParams = gradientComponentView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    int i3 = tsg0.gradient_component_bottom_margin;
                    View view = this.a;
                    marginLayoutParams.bottomMargin = c.d(i3, view) + (cytVar.g ? tje.u(4, view.getContext()) : 0);
                    gradientComponentView.setLayoutParams(marginLayoutParams);
                }
                gradientComponentView.render(cytVar);
                break;
            case 3:
                nlr0 nlr0Var = (nlr0) obj;
                ListItemCheckComponent listItemCheckComponent = (ListItemCheckComponent) obj2;
                listItemCheckComponent.setDividers(DividerPosition.TOP, DividerType.MARGIN);
                listItemCheckComponent.setTitle(nlr0Var.b.b);
                listItemCheckComponent.setCheckToggleByClickEnabled(false);
                listItemCheckComponent.setDebounceClickListener(new epo0(i2, this, nlr0Var));
                listItemCheckComponent.setChecked(jl40.l(nlr0Var.a, nlr0Var.b.a));
                break;
            default:
                tlr0 tlr0Var = (tlr0) obj;
                ListItemSwitchComponent listItemSwitchComponent = (ListItemSwitchComponent) obj2;
                listItemSwitchComponent.setTitle(tlr0Var.a.b);
                listItemSwitchComponent.setCheckedWithAnimation(tlr0Var.a.c);
                listItemSwitchComponent.setDividers(DividerPosition.BOTTOM, tlr0Var.b ? DividerType.MARGIN : DividerType.NONE);
                listItemSwitchComponent.setOnClickListener(new tai0(i2, this, tlr0Var));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mt6(sls slsVar, ButtonComponent buttonComponent) {
        super(buttonComponent);
        this.R = 1;
        this.S = slsVar;
        this.T = buttonComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mt6(ViewGroup viewGroup, cms cmsVar, int i) {
        super(viewGroup);
        this.R = i;
        this.S = viewGroup;
        this.T = cmsVar;
    }
}
