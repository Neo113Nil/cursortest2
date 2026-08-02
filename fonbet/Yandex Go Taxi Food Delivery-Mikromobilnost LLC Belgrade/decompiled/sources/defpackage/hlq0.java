package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.animation.AnimatedContentTransitionScope$slideIntoContainer$1;
import androidx.compose.animation.AnimatedContentTransitionScope$slideOutOfContainer$1;
import androidx.compose.animation.e;
import androidx.compose.animation.i;
import com.yandex.go.design.divider.CardDivider;
import com.yandex.go.design.view.GoView;
import ru.yandex.taxi.design.ListGroupHeaderComponent;
import ru.yandex.taxi.design.ListItemCheckComponent;
import ru.yandex.taxi.design.ListItemSwitchComponent;
import ru.yandex.taxi.favorites.rides.settings_modal.ui.adapter.holder.a;
import ru.yandex.taxi.settings.model.PushSettingsOpenReason;

/* loaded from: classes13.dex */
public final /* synthetic */ class hlq0 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ hlq0(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        w2o f;
        zmo h;
        int i = this.a;
        int i2 = 16;
        final int i3 = 0;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                e eVar = (e) obj;
                r0 = ((qe31) eVar.b()).b > ((qe31) eVar.c()).b ? 0 : 1;
                ldf ldfVar = ubn.a;
                f = eVar.f(r0, AnimatedContentTransitionScope$slideIntoContainer$1.w, sb2.K(500, 0, ldfVar, 2));
                h = eVar.h(r0, AnimatedContentTransitionScope$slideOutOfContainer$1.w, sb2.K(500, 0, ldfVar, 2));
                return new i(f, h);
            case 1:
                return ((qe31) obj).a;
            case 2:
                return ljs0.q((f530) obj, 160.0f);
            case 3:
                return ljs0.c((f530) obj, 1.0f);
            case 4:
                ((m2k0) obj).b(0.5f);
                return zy11Var;
            case 5:
                ca1 ca1Var = new ca1((ListGroupHeaderComponent) obj, 21);
                ((ListGroupHeaderComponent) ((View) ca1Var.R)).setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return ca1Var;
            case 6:
                return ((Iterable) obj).iterator();
            case 7:
                return ((hrv) obj).b;
            case 8:
                return new pbv((String) obj, (ccv) null, rev.f, (dcv) null, (vfv) null, 58);
            case 9:
                ListItemCheckComponent listItemCheckComponent = new ListItemCheckComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                listItemCheckComponent.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return listItemCheckComponent;
            case 10:
                CardDivider cardDivider = new CardDivider(((ViewGroup) obj).getContext(), null, 0, 6, null);
                cardDivider.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                cardDivider.setType(CardDivider.Type.BOTH);
                cardDivider.setFocusable(false);
                return cardDivider;
            case 11:
                ListGroupHeaderComponent listGroupHeaderComponent = new ListGroupHeaderComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                listGroupHeaderComponent.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return listGroupHeaderComponent;
            case 12:
                ListItemSwitchComponent listItemSwitchComponent = new ListItemSwitchComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                listItemSwitchComponent.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return listItemSwitchComponent;
            case 13:
                return zy11Var;
            case 14:
                return zy11Var;
            case 15:
                return zy11Var;
            case 16:
                n70 n70Var = (n70) obj;
                n70Var.W(new ns3(n70Var, 13));
                return zy11Var;
            case 17:
                n70 n70Var2 = (n70) obj;
                n70Var2.W(new ns3(n70Var2, 14));
                return zy11Var;
            case 18:
                int i4 = w9r0.S;
                return a.d(16, ((ViewGroup) obj).getContext());
            case 19:
                int i5 = w9r0.S;
                return a.d(56, ((ViewGroup) obj).getContext());
            case 20:
                GoView goView = new GoView(((ViewGroup) obj).getContext(), null, 0, 0, 14, null);
                goView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                goView.setBackgroundColor(goView.getContext().getColor(xqg0.transparent));
                goView.setFocusable(false);
                goView.setImportantForAccessibility(4);
                return goView;
            case 21:
                final edr0 edr0Var = (edr0) obj;
                final gdr0 gdr0Var = edr0Var.b;
                gdr0Var.z((m950) gdr0Var.I.get(), new sy60() { // from class: ddr0
                    @Override // defpackage.sy60
                    public final void a() {
                        int i6 = r3;
                        edr0 edr0Var2 = edr0Var;
                        gdr0 gdr0Var2 = gdr0Var;
                        switch (i6) {
                            case 0:
                                gdr0Var2.Q(edr0Var2.a);
                                break;
                            default:
                                gdr0Var2.Q(edr0Var2.a);
                                break;
                        }
                    }
                });
                return zy11Var;
            case 22:
                final edr0 edr0Var2 = (edr0) obj;
                final gdr0 gdr0Var2 = edr0Var2.b;
                gdr0Var2.A((m950) gdr0Var2.H.get(), PushSettingsOpenReason.MENU, new sy60() { // from class: ddr0
                    @Override // defpackage.sy60
                    public final void a() {
                        int i6 = i3;
                        edr0 edr0Var22 = edr0Var2;
                        gdr0 gdr0Var22 = gdr0Var2;
                        switch (i6) {
                            case 0:
                                gdr0Var22.Q(edr0Var22.a);
                                break;
                            default:
                                gdr0Var22.Q(edr0Var22.a);
                                break;
                        }
                    }
                });
                return zy11Var;
            case 23:
                edr0 edr0Var3 = (edr0) obj;
                gdr0 gdr0Var3 = edr0Var3.b;
                gdr0Var3.z((m950) gdr0Var3.D.get(), new srn(new nao0(28, gdr0Var3, edr0Var3), 0));
                return zy11Var;
            case 24:
                a2u0 a2u0Var = (a2u0) obj;
                c2u0 c2u0Var = a2u0Var.a;
                c2u0Var.z((m950) c2u0Var.E.get(), new y1u0(c2u0Var, a2u0Var.b));
                return zy11Var;
            case 25:
                a2u0 a2u0Var2 = (a2u0) obj;
                c2u0 c2u0Var2 = a2u0Var2.a;
                c2u0Var2.z((m950) c2u0Var2.G.get(), new z1u0(c2u0Var2, a2u0Var2.b));
                return zy11Var;
            case 26:
                n70 n70Var3 = (n70) obj;
                n70Var3.W(new ns3(n70Var3, 15));
                return zy11Var;
            case 27:
                n70 n70Var4 = (n70) obj;
                n70Var4.W(new ns3(n70Var4, i2));
                return zy11Var;
            case 28:
                CardDivider cardDivider2 = new CardDivider(((ViewGroup) obj).getContext(), null, 0, 6, null);
                cardDivider2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return cardDivider2;
            default:
                return new rkr0((CardDivider) obj);
        }
    }
}
