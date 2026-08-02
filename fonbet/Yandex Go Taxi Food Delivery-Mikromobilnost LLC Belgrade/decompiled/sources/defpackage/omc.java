package defpackage;

import android.view.View;
import kotlin.a;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes6.dex */
public final class omc extends lys {
    public static final /* synthetic */ int W = 0;
    public static final /* synthetic */ int Z = 0;
    public static final /* synthetic */ int a0 = 0;
    public final /* synthetic */ int S;
    public final i3y T;
    public final i3y U;
    public kij0 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public omc(ListItemComponent listItemComponent, int i) {
        super(listItemComponent);
        this.S = i;
        final int i2 = 1;
        final int i3 = 0;
        switch (i) {
            case 1:
                super(listItemComponent);
                this.T = a.a(new sls(this) { // from class: vxe
                    public final /* synthetic */ omc b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i4 = i3;
                        omc omcVar = this.b;
                        switch (i4) {
                            case 0:
                                return Float.valueOf(c.d(usg0.toggle_buttons_corner_radius, omcVar.a));
                            default:
                                return Integer.valueOf(c.h(8, omcVar.a));
                        }
                    }
                });
                this.U = a.a(new sls(this) { // from class: vxe
                    public final /* synthetic */ omc b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i4 = i2;
                        omc omcVar = this.b;
                        switch (i4) {
                            case 0:
                                return Float.valueOf(c.d(usg0.toggle_buttons_corner_radius, omcVar.a));
                            default:
                                return Integer.valueOf(c.h(8, omcVar.a));
                        }
                    }
                });
                break;
            case 2:
                super(listItemComponent);
                this.T = a.a(new sls(this) { // from class: tiy0
                    public final /* synthetic */ omc b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i4 = i3;
                        omc omcVar = this.b;
                        switch (i4) {
                            case 0:
                                return Float.valueOf(c.d(usg0.toggle_buttons_corner_radius, omcVar.a));
                            default:
                                return Integer.valueOf(c.h(8, omcVar.a));
                        }
                    }
                });
                this.U = a.a(new sls(this) { // from class: tiy0
                    public final /* synthetic */ omc b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i4 = i2;
                        omc omcVar = this.b;
                        switch (i4) {
                            case 0:
                                return Float.valueOf(c.d(usg0.toggle_buttons_corner_radius, omcVar.a));
                            default:
                                return Integer.valueOf(c.h(8, omcVar.a));
                        }
                    }
                });
                break;
            default:
                this.T = a.a(new sls(this) { // from class: nmc
                    public final /* synthetic */ omc b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i4 = i3;
                        omc omcVar = this.b;
                        switch (i4) {
                            case 0:
                                return Float.valueOf(c.d(usg0.toggle_buttons_corner_radius, omcVar.a));
                            default:
                                return Integer.valueOf(c.h(8, omcVar.a));
                        }
                    }
                });
                this.U = a.a(new sls(this) { // from class: nmc
                    public final /* synthetic */ omc b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i4 = i2;
                        omc omcVar = this.b;
                        switch (i4) {
                            case 0:
                                return Float.valueOf(c.d(usg0.toggle_buttons_corner_radius, omcVar.a));
                            default:
                                return Integer.valueOf(c.h(8, omcVar.a));
                        }
                    }
                });
                break;
        }
    }

    @Override // defpackage.xwy0, defpackage.nwy0
    public final void applyTheme(ThemeType themeType) {
        int i = this.S;
        Object obj = this.R;
        switch (i) {
            case 0:
                super.applyTheme(themeType);
                vhj0 vhj0Var = (vhj0) this.V;
                if (vhj0Var != null) {
                    ((ListItemComponent) ((View) obj)).getLeadImageView().setImageResource(p0h0.ic_chat_outline_24);
                    c0(vhj0Var);
                    break;
                }
                break;
            case 1:
                super.applyTheme(themeType);
                whj0 whj0Var = (whj0) this.V;
                if (whj0Var != null) {
                    ((ListItemComponent) ((View) obj)).getLeadImageView().setImageResource(p0h0.ic_coins_outline_24);
                    d0(whj0Var);
                    break;
                }
                break;
            default:
                super.applyTheme(themeType);
                fij0 fij0Var = (fij0) this.V;
                if (fij0Var != null) {
                    e0(fij0Var);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        int i = this.S;
        Object obj2 = this.R;
        i3y i3yVar = this.U;
        switch (i) {
            case 0:
                vhj0 vhj0Var = (vhj0) obj;
                this.V = vhj0Var;
                View view = (View) obj2;
                ListItemComponent listItemComponent = (ListItemComponent) view;
                listItemComponent.setTitle(vhj0Var.a.a);
                listItemComponent.setSubtitle(vhj0Var.a.b);
                ((ListItemComponent) view).getLeadImageView().setImageResource(p0h0.ic_chat_outline_24);
                boolean z = vhj0Var.c;
                listItemComponent.setDividers(z ? DividerPosition.NONE : DividerPosition.BOTTOM, DividerType.ICON_HALF_MARGIN);
                c0(vhj0Var);
                xw31.E(view, null, Integer.valueOf(vhj0Var.b ? ((Number) i3yVar.getValue()).intValue() : 0), null, Integer.valueOf(z ? ((Number) i3yVar.getValue()).intValue() : 0));
                break;
            case 1:
                whj0 whj0Var = (whj0) obj;
                this.V = whj0Var;
                View view2 = (View) obj2;
                ListItemComponent listItemComponent2 = (ListItemComponent) view2;
                listItemComponent2.setTitle(whj0Var.a.a);
                listItemComponent2.setSubtitle(whj0Var.a.b);
                ((ListItemComponent) view2).getLeadImageView().setImageResource(p0h0.ic_coins_outline_24);
                boolean z2 = whj0Var.c;
                listItemComponent2.setDividers(z2 ? DividerPosition.NONE : DividerPosition.BOTTOM, DividerType.ICON_HALF_MARGIN);
                d0(whj0Var);
                xw31.E(view2, null, Integer.valueOf(whj0Var.b ? ((Number) i3yVar.getValue()).intValue() : 0), null, Integer.valueOf(z2 ? ((Number) i3yVar.getValue()).intValue() : 0));
                break;
            default:
                fij0 fij0Var = (fij0) obj;
                this.V = fij0Var;
                View view3 = (View) obj2;
                ListItemComponent listItemComponent3 = (ListItemComponent) view3;
                listItemComponent3.setTitle("Testing commands 🔧");
                listItemComponent3.setDividers(fij0Var.b ? DividerPosition.NONE : DividerPosition.BOTTOM, DividerType.ICON_HALF_MARGIN);
                e0(fij0Var);
                xw31.E(view3, null, Integer.valueOf(fij0Var.a ? ((Number) i3yVar.getValue()).intValue() : 0), null, Integer.valueOf(fij0Var.b ? ((Number) i3yVar.getValue()).intValue() : 0));
                break;
        }
    }

    public void c0(vhj0 vhj0Var) {
        View view = (View) this.R;
        boolean z = vhj0Var.b;
        i3y i3yVar = this.T;
        float floatValue = z ? ((Number) i3yVar.getValue()).floatValue() : 0.0f;
        float floatValue2 = vhj0Var.c ? ((Number) i3yVar.getValue()).floatValue() : 0.0f;
        v891.h((ListItemComponent) view, c.c(xng0.bgMinor, view), floatValue, floatValue, floatValue2, floatValue2);
    }

    public void d0(whj0 whj0Var) {
        View view = (View) this.R;
        boolean z = whj0Var.b;
        i3y i3yVar = this.T;
        float floatValue = z ? ((Number) i3yVar.getValue()).floatValue() : 0.0f;
        float floatValue2 = whj0Var.c ? ((Number) i3yVar.getValue()).floatValue() : 0.0f;
        v891.h((ListItemComponent) view, c.c(xng0.bgMinor, view), floatValue, floatValue, floatValue2, floatValue2);
    }

    public void e0(fij0 fij0Var) {
        View view = (View) this.R;
        boolean z = fij0Var.a;
        i3y i3yVar = this.T;
        float floatValue = z ? ((Number) i3yVar.getValue()).floatValue() : 0.0f;
        float floatValue2 = fij0Var.b ? ((Number) i3yVar.getValue()).floatValue() : 0.0f;
        v891.h((ListItemComponent) view, c.c(xng0.bgMinor, view), floatValue, floatValue, floatValue2, floatValue2);
    }
}
