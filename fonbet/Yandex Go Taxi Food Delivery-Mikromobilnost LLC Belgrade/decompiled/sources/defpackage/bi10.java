package defpackage;

import com.yandex.go.payments.shared.SharedPaymentAnalytics$Button;
import com.yandex.go.payments.shared.SharedPaymentAnalytics$CloseReason;
import com.yandex.go.payments.shared.data.model.Member;
import com.yandex.go.payments.shared.data.model.SetCommonLimitRequest;
import com.yandex.go.payments.shared.members.list.MemberListMode;
import com.yandex.go.payments.shared.members.list.b;
import com.yandex.go.payments.shared.y;
import com.yandex.go.sharedpayments.api.analytics.SharedPaymentsOpenReason;
import com.yandex.go.sharedpayments.api.model.SharedAccountScreen;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.widget.dialog.AlertDialog;

/* loaded from: classes13.dex */
public final /* synthetic */ class bi10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ bi10(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = 1;
        b bVar = this.b;
        switch (i) {
            case 0:
                bVar.Qg(new SetCommonLimitRequest(0L, false));
                break;
            case 1:
                bVar.Og();
                break;
            case 2:
                hwo0 hwo0Var = bVar.G;
                vnr0 vnr0Var = bVar.B;
                String str = bVar.Mg().a;
                SharedPaymentsOpenReason Kg = bVar.Kg();
                SharedPaymentAnalytics$Button sharedPaymentAnalytics$Button = SharedPaymentAnalytics$Button.ACTION_BUTTON;
                boolean z = bVar.J;
                ai10 ai10Var = bVar.x;
                vnr0Var.p(str, Kg, sharedPaymentAnalytics$Button, z, ai10Var.a, bVar.Mg().d.size());
                bVar.B.o(bVar.Mg().a, bVar.Kg(), SharedPaymentAnalytics$CloseReason.ACTION_BUTTON, bVar.J, ai10Var.a, bVar.Mg().d.size());
                ((zh10) bVar.Dg()).S4(bVar.D);
                int i3 = ci10.a[ai10Var.a.ordinal()];
                if (i3 == 1) {
                    y yVar = (y) hwo0Var.c;
                    yVar.c.a().d(new bm((il) hwo0Var.w, new tor0(yVar, (ynr0) hwo0Var.x)));
                    break;
                } else if (i3 == 2) {
                    y yVar2 = (y) hwo0Var.c;
                    at20 at20Var = new at20((il) hwo0Var.w, SharedAccountScreen.DETAILS);
                    yVar2.getClass();
                    yVar2.i(at20Var, SharedPaymentsOpenReason.MENU);
                    break;
                }
                break;
            case 3:
                bVar.Og();
                break;
            case 4:
                vnr0 vnr0Var2 = bVar.B;
                ai10 ai10Var2 = bVar.x;
                if (ai10Var2.a == MemberListMode.LIMITS) {
                    vnr0Var2.t(bVar.Lg(), SharedPaymentAnalytics$Button.DONE, bVar.Mg().d.size());
                }
                String str2 = ai10Var2.g;
                if (str2 == null) {
                    str2 = "";
                }
                if (str2.length() == 0) {
                    if (bVar.Mg().n) {
                        bVar.Pg();
                        break;
                    } else {
                        bVar.Sg();
                        break;
                    }
                } else {
                    int i4 = 10;
                    Long m = bvu0.m(10, str2);
                    if (m == null || m.longValue() <= 0) {
                        bVar.Sg();
                        break;
                    } else {
                        long longValue = m.longValue();
                        Long l = bVar.Mg().o;
                        if (l != null && longValue == l.longValue()) {
                            ai10Var2.g = "";
                            bVar.Tg();
                            bVar.Pg();
                            break;
                        } else {
                            List<Member> list = bVar.Mg().d;
                            if (!(list instanceof Collection) || !list.isEmpty()) {
                                for (Member member : list) {
                                    Member.Limits limits = member.f;
                                    if (limits != null && limits.b && member.a() != null) {
                                        Long a = member.a();
                                        long longValue2 = m.longValue();
                                        if (a == null || a.longValue() != longValue2) {
                                            ((zh10) bVar.Dg()).closeKeyboard();
                                            p500 p500Var = new p500(18, bVar, m);
                                            bi10 bi10Var = new bi10(bVar, 6);
                                            g9h g9hVar = new g9h(i2, bVar);
                                            t8 t8Var = new t8(i4, bVar);
                                            hwo0 hwo0Var2 = bVar.G;
                                            y yVar3 = (y) hwo0Var2.c;
                                            qfy qfyVar = ((ynr0) hwo0Var2.x).h;
                                            yVar3.getClass();
                                            AlertDialog show = new AlertDialog(yVar3.a).setTitle(qfyVar.g).setMessage(qfyVar.h).setPositiveButton(qfyVar.i, p500Var).setNegativeButton(qfyVar.j, bi10Var).setDismissListener(new yue(yVar3, 4)).setCancelableOnTouchOutside(true).show();
                                            show.setOnKeyListener(g9hVar);
                                            show.setOnTouchListener(t8Var);
                                            vnr0Var2.getClass();
                                            List g = scc.g(SharedPaymentAnalytics$Button.YES, SharedPaymentAnalytics$Button.NO);
                                            cug cugVar = vnr0Var2.k;
                                            List list2 = g;
                                            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                                            Iterator it = list2.iterator();
                                            while (it.hasNext()) {
                                                arrayList.add(((SharedPaymentAnalytics$Button) it.next()).getAnalyticsName());
                                            }
                                            cugVar.getClass();
                                            HashMap hashMap = new HashMap();
                                            hashMap.put("button_list", arrayList);
                                            cugVar.a.a("MonthLimitsAlert.Shown", hashMap, 1, new HashMap());
                                            break;
                                        }
                                    }
                                }
                            }
                            bVar.Qg(new SetCommonLimitRequest(m, true));
                            break;
                        }
                    }
                }
                break;
            case 5:
                bVar.Og();
                break;
            case 6:
                vnr0 vnr0Var3 = bVar.B;
                vnr0Var3.s(SharedPaymentAnalytics$Button.NO);
                vnr0Var3.r(SharedPaymentAnalytics$CloseReason.NO_BUTTON);
                break;
            default:
                ai10 ai10Var3 = bVar.x;
                boolean z2 = bVar.J;
                bVar.J = !z2;
                vnr0 vnr0Var4 = bVar.B;
                if (z2) {
                    vnr0Var4.p(bVar.Mg().a, bVar.Kg(), SharedPaymentAnalytics$Button.DONE, bVar.J, ai10Var3.a, bVar.Mg().d.size());
                } else {
                    vnr0Var4.p(bVar.Mg().a, bVar.Kg(), SharedPaymentAnalytics$Button.EDIT, bVar.J, ai10Var3.a, bVar.Mg().d.size());
                }
                bVar.Tg();
                break;
        }
    }
}
