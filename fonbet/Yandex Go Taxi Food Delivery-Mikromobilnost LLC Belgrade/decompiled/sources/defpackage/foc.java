package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.ui.semantics.e;
import androidx.compose.ui.semantics.g;
import androidx.compose.ui.tooling.ComposeViewAdapter;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import java.util.Map;
import kotlin.Pair;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes10.dex */
public final /* synthetic */ class foc implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ foc(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 processViewInfos$lambda$0;
        int i = this.a;
        boolean z = false;
        int i2 = 2;
        int i3 = 9;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                gj70 gj70Var = (gj70) obj;
                return g8e.p(gj70Var.a, " ", gj70Var.b ? "asc" : "desc");
            case 1:
                ((upc) obj).b1();
                return zy11Var;
            case 2:
                ((upc) obj).f0();
                return zy11Var;
            case 3:
                ((xpc) obj).a.r(new foc(i2));
                return zy11Var;
            case 4:
                n70 n70Var = (n70) obj;
                n70Var.W(new ns3(n70Var, 5));
                return zy11Var;
            case 5:
                ((kzc) obj).l1();
                return zy11Var;
            case 6:
                ued uedVar = ued.a;
                return zy11Var;
            case 7:
                kgx[] kgxVarArr = lnq0.a;
                g gVar = e.a;
                kgx kgxVar = lnq0.a[0];
                ((mnq0) obj).a(gVar, Boolean.TRUE);
                return zy11Var;
            case 8:
                processViewInfos$lambda$0 = ComposeViewAdapter.processViewInfos$lambda$0((cud) obj);
                return processViewInfos$lambda$0;
            case 9:
                return ((PlusPayCompositeOfferDetails.PaymentMethodsGroup) obj).getPaymentMethods();
            case 10:
                return ((PlusPayCompositeOfferDetails.PaymentMethodsGroup) obj).getPaymentMethods();
            case 11:
                h0c h0cVar = (h0c) obj;
                kv90 kv90Var = lv90.Companion;
                h0cVar.a("base", kv90Var.serializer().getDescriptor(), (r3 & 8) == 0);
                h0cVar.a("complement", kv90Var.serializer().getDescriptor(), (r3 & 8) == 0);
                return zy11Var;
            case 12:
                Map.Entry entry = (Map.Entry) obj;
                if (((CharSequence) entry.getKey()).length() > 0 && ((CharSequence) entry.getValue()).length() > 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 13:
                return zy11Var;
            case 14:
                v9e v9eVar = (v9e) obj;
                return new Pair(v9eVar.a, v9eVar.b.b);
            case 15:
                return obj instanceof ck7 ? vmx.a.a().c(obj, bk7.a) : vmx.a.a().c(obj, gtq0.J(qoi0.a(obj.getClass())));
            case 16:
                return zy11Var;
            case 17:
                return ((lqe) obj).a;
            case 18:
                pw1 pw1Var = ((ite) obj).a;
                pw1Var.r(new qu(i3));
                ((ave) pw1Var.F).invoke();
                return zy11Var;
            case 19:
                pw1 pw1Var2 = ((ite) obj).a;
                pw1Var2.r(new qu(i3));
                ((ave) pw1Var2.F).invoke();
                return zy11Var;
            case 20:
                return ((jve) obj).c;
            case 21:
                que queVar = (que) obj;
                switch (queVar.a) {
                    case 0:
                        y4c0 y4c0Var = (y4c0) queVar.b;
                        y4c0Var.r(new qu(i3));
                        ((bve) y4c0Var.G).invoke();
                        return zy11Var;
                    default:
                        y4c0 y4c0Var2 = (y4c0) queVar.b;
                        y4c0Var2.r(new qu(i3));
                        ((a4f) y4c0Var2.G).invoke();
                        return zy11Var;
                }
            case 22:
                que queVar2 = (que) obj;
                switch (queVar2.a) {
                    case 0:
                        y4c0 y4c0Var3 = (y4c0) queVar2.b;
                        y4c0Var3.r(new qu(i3));
                        ((ave) y4c0Var3.F).invoke();
                        return zy11Var;
                    default:
                        y4c0 y4c0Var4 = (y4c0) queVar2.b;
                        y4c0Var4.r(new qu(i3));
                        ((lyc) y4c0Var4.F).invoke();
                        return zy11Var;
                }
            case 23:
                ListItemComponent listItemComponent = new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                int u = tje.u(16, listItemComponent.getContext());
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                marginLayoutParams.setMargins(u, 0, u, 0);
                listItemComponent.setLayoutParams(marginLayoutParams);
                listItemComponent.setBackgroundResource(dzg0.bg_transparent_ripple);
                listItemComponent.setSubTitleEllipsizeMode(1);
                listItemComponent.setSubtitleMaxLines(3);
                listItemComponent.setTrailMode(2);
                listItemComponent.setLeadFrameMinimumWidth(tje.u(56, listItemComponent.getContext()));
                return listItemComponent;
            case 24:
                return new omc((ListItemComponent) obj, 1);
            case 25:
                ListItemComponent listItemComponent2 = new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                listItemComponent2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                listItemComponent2.setBackgroundResource(dzg0.bg_transparent_ripple);
                listItemComponent2.setSubTitleEllipsizeMode(1);
                listItemComponent2.setSubtitleMaxLines(3);
                listItemComponent2.setTrailMode(2);
                return listItemComponent2;
            case 26:
                return new ca1((ListItemComponent) obj, 8);
            case 27:
                return new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
            case 28:
                ca1 ca1Var = new ca1((ListItemComponent) obj, i3);
                ListItemComponent listItemComponent3 = (ListItemComponent) ((View) ca1Var.R);
                nzs.s(listItemComponent3, -1, -2);
                listItemComponent3.setLeadImage(d1h0.coupon_badge_icon);
                return ca1Var;
            default:
                return kp50.i();
        }
    }
}
