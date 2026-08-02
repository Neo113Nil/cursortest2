package defpackage;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.yandex.go.vault.domain.prize.ActionButtonType;
import java.util.Locale;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.requirements.ui.selector.usual.UsualOptionSelectorView;

/* loaded from: classes6.dex */
public final /* synthetic */ class mr21 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ mr21(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 listDelegate$lambda$0;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                vul0 vul0Var = (vul0) obj;
                switch (vul0Var.a) {
                    case 0:
                        ((ivl0) vul0Var.b).invoke(Boolean.TRUE);
                        return zy11Var;
                    default:
                        ((sls) vul0Var.b).invoke();
                        return zy11Var;
                }
            case 1:
                oll0 oll0Var = (oll0) obj;
                ull0 T0 = oll0Var.T0("DELETE FROM users_to_talk WHERE has_contact = 1 AND has_private_chat = 0");
                try {
                    T0.q();
                    int x = jx81.x(oll0Var);
                    T0.close();
                    return Integer.valueOf(x);
                } catch (Throwable th) {
                    T0.close();
                    throw th;
                }
            case 2:
                listDelegate$lambda$0 = UsualOptionSelectorView.listDelegate$lambda$0((ListItemComponent) obj);
                return listDelegate$lambda$0;
            case 3:
                ListItemComponent listItemComponent = new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                listItemComponent.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                listItemComponent.setTrailMode(2);
                listItemComponent.setSubtitleMaxLines(1);
                listItemComponent.setSubTitleEllipsizeMode(1);
                return listItemComponent;
            case 4:
                ListItemComponent listItemComponent2 = new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                int u = tje.u(16, listItemComponent2.getContext());
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                marginLayoutParams.setMargins(u, 0, u, 0);
                listItemComponent2.setLayoutParams(marginLayoutParams);
                listItemComponent2.setTrailMode(2);
                listItemComponent2.setSubtitleMaxLines(1);
                listItemComponent2.setSubTitleEllipsizeMode(1);
                listItemComponent2.setLeadFrameMinimumWidth(tje.u(56, listItemComponent2.getContext()));
                return listItemComponent2;
            case 5:
                nrg nrgVar = (nrg) obj;
                nrg.i(nrgVar);
                ooc.v(nrgVar, "", new mr21(6));
                return zy11Var;
            case 6:
                nrg nrgVar2 = (nrg) obj;
                nrg.f(nrgVar2);
                ooc.v(nrgVar2, "", new mr21(8));
                return zy11Var;
            case 7:
                nrg nrgVar3 = (nrg) obj;
                ooc.f(nrgVar3, ':');
                nrg.n(nrgVar3);
                return zy11Var;
            case 8:
                nrg.n((nrg) obj);
                return zy11Var;
            case 9:
                ooc.b((nrg) obj, new tls[]{new mr21(11)}, new mr21(12));
                return zy11Var;
            case 10:
                ooc.b((nrg) obj, new tls[]{new mr21(13)}, new mr21(14));
                return zy11Var;
            case 11:
                ((nrg) obj).b("z");
                return zy11Var;
            case 12:
                ooc.v((nrg) obj, "Z", new mr21(15));
                return zy11Var;
            case 13:
                ((nrg) obj).b("z");
                return zy11Var;
            case 14:
                ooc.v((nrg) obj, "Z", new mr21(5));
                return zy11Var;
            case 15:
                nrg nrgVar4 = (nrg) obj;
                nrg.i(nrgVar4);
                ooc.f(nrgVar4, ':');
                nrg.f(nrgVar4);
                ooc.v(nrgVar4, "", new mr21(7));
                return zy11Var;
            case 16:
                wj00 b = ((y3x) obj).b();
                return new ny21(b.p("verification_id"), b.p("binding_id"), b.h(ACSPConstants.STATUS), b.h("message_code"));
            case 17:
                return ((ActionButtonType) obj).toString().toLowerCase(Locale.ROOT);
            case 18:
                wj00 b2 = ((y3x) obj).b();
                return new g831(b2.p("id"), b2.p("binding_id"), b2.n("need_cvv_challenge"));
            case 19:
                return ((j831) obj).h;
            case 20:
                return ((j831) obj).i;
            case 21:
                ((l931) obj).getClass();
                return null;
            case 22:
                ((l931) obj).getClass();
                return null;
            case 23:
                return ((j831) obj).h;
            case 24:
                return ((j831) obj).i;
            case 25:
                return new n931(((y3x) obj).b().p("purchase_token"));
            case 26:
                wj00 b3 = ((y3x) obj).b();
                String p = b3.p(ACSPConstants.STATUS);
                int o = b3.o("attempts_left");
                b3.p("currency");
                b3.h("format");
                b3.p("id");
                b3.h("amount");
                b3.h("status_code");
                return new t931(p, o, b3.h("deny_resend_until"));
            case 27:
                return Integer.valueOf(((Integer) obj).intValue() * 2);
            case 28:
                return ((mi31) obj).a;
            default:
                ((vw20) obj).getClass();
                return zy11Var;
        }
    }
}
