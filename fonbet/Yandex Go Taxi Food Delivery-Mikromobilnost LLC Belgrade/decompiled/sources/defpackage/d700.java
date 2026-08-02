package defpackage;

import com.yandex.go.payments.paymentlist.domain.i;
import com.yandex.go.safety.center.SafetyCenterParams$Source;
import com.yandex.go.taxi.order.provider.a;
import kotlin.Pair;
import ru.yandex.taxi.cashback.analytics.CashbackCardContext;
import ru.yandex.taxi.settings.main.MainMenuProcessor$MenuEntry;
import ru.yandex.taxi.settings.main.f;

/* loaded from: classes13.dex */
public final /* synthetic */ class d700 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i700 b;

    public /* synthetic */ d700(i700 i700Var, int i) {
        this.a = i;
        this.b = i700Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar;
        f fVar2;
        f fVar3;
        f fVar4;
        f fVar5;
        f fVar6;
        f fVar7;
        f fVar8;
        f fVar9;
        f fVar10;
        int i = this.a;
        String str = null;
        i700 i700Var = this.b;
        switch (i) {
            case 0:
                if (!i700Var.s0 && !i700Var.t0 && (fVar = i700Var.r0) != null) {
                    i700Var.s0 = true;
                    fVar.A.a("Menu.Cashback", new Pair[0]);
                    u500 u500Var = fVar.D;
                    qxx0 qxx0Var = new qxx0(CashbackCardContext.MENU.getValue(), w2d0.f, null);
                    u500Var.getClass();
                    u500Var.d(MainMenuProcessor$MenuEntry.PLUS_HOME, qxx0Var);
                    break;
                }
                break;
            case 1:
                if (!i700Var.s0 && !i700Var.t0 && (fVar2 = i700Var.r0) != null) {
                    i700Var.s0 = true;
                    u500 u500Var2 = fVar2.D;
                    hb0 hb0Var = u500Var2.d;
                    boolean z = !((i) ((cba0) u500Var2.a.get())).f();
                    m2v m2vVar = new m2v(((i) hb0Var.a).v.a());
                    m2vVar.A(z);
                    u500Var2.d(MainMenuProcessor$MenuEntry.ADD_CARD, new Pair(m2vVar.e(), v770.q));
                    break;
                }
                break;
            case 2:
                if (!i700Var.s0 && !i700Var.t0 && (fVar3 = i700Var.r0) != null) {
                    i700Var.s0 = true;
                    u500 u500Var3 = fVar3.D;
                    u500Var3.getClass();
                    u500Var3.d(MainMenuProcessor$MenuEntry.INFO, null);
                    break;
                }
                break;
            case 3:
                i700Var.bh(new iez(13));
                break;
            case 4:
                if (!i700Var.s0 && !i700Var.t0 && (fVar4 = i700Var.r0) != null) {
                    i700Var.s0 = true;
                    u500 u500Var4 = fVar4.D;
                    u500Var4.getClass();
                    u500Var4.d(MainMenuProcessor$MenuEntry.SETTINGS, null);
                    break;
                }
                break;
            case 5:
                i700Var.bh(new iez(15));
                break;
            case 6:
                f fVar11 = i700Var.r0;
                if (fVar11 != null) {
                    ((f600) fVar11.F.get()).f();
                    ((pep0) fVar11.I).f((m950) fVar11.H.get(), iku.a, hxx.a);
                    break;
                }
                break;
            case 7:
                i700Var.bh(new iez(16));
                break;
            case 8:
                if (!i700Var.s0 && !i700Var.t0 && (fVar5 = i700Var.r0) != null) {
                    i700Var.s0 = true;
                    fVar5.D.f(false, false, null, null);
                    break;
                }
                break;
            case 9:
                i700Var.bh(new iez(14));
                break;
            case 10:
                if (!i700Var.s0 && !i700Var.t0 && (fVar6 = i700Var.r0) != null) {
                    i700Var.s0 = true;
                    fVar6.Mg();
                    break;
                }
                break;
            case 11:
                if (!i700Var.s0 && !i700Var.t0 && (fVar7 = i700Var.r0) != null) {
                    i700Var.s0 = true;
                    o2y0 u = ((a) fVar7.J).u();
                    if (u != null && u.e()) {
                        str = u.b().a;
                    }
                    itl0 itl0Var = new itl0(SafetyCenterParams$Source.MENU, str, dab1.O);
                    u500 u500Var5 = fVar7.D;
                    u500Var5.getClass();
                    u500Var5.c(MainMenuProcessor$MenuEntry.SAFETY_CENTER, itl0Var);
                    break;
                }
                break;
            case 12:
                if (!i700Var.s0 && !i700Var.t0 && (fVar8 = i700Var.r0) != null) {
                    i700Var.s0 = true;
                    fVar8.D.b(MainMenuProcessor$MenuEntry.CURRENT_ADDRESS, null);
                    break;
                }
                break;
            case 13:
                if (!i700Var.s0 && !i700Var.t0 && (fVar9 = i700Var.r0) != null) {
                    i700Var.s0 = true;
                    fVar9.Lg();
                    break;
                }
                break;
            case 14:
                i700Var.bh(new e700(i700Var, 3));
                break;
            case 15:
                if (!i700Var.s0 && !i700Var.t0 && (fVar10 = i700Var.r0) != null) {
                    i700Var.s0 = true;
                    fVar10.Lg();
                    break;
                }
                break;
            default:
                f fVar12 = i700Var.r0;
                if (fVar12 != null) {
                    u500 u500Var6 = fVar12.D;
                    u500Var6.getClass();
                    u500Var6.d(MainMenuProcessor$MenuEntry.BUG_REPORT, null);
                    break;
                }
                break;
        }
    }
}
