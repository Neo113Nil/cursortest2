package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter;
import com.yandex.messaging.internal.authorized.chat.b;
import com.yandex.passport.sloth.ui.dependencies.m;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.credit.deposit.internal.screens.deposit.CreditDepositFragment;
import java.util.Set;
import ru.yandex.taxi.masstransit.geopayment.checkout.network.a;

/* loaded from: classes5.dex */
public final class p6f implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ p6f(s0h s0hVar, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    public static p6f a(eqh eqhVar) {
        return new p6f(eqhVar, 22);
    }

    public static p6f b(xvf0 xvf0Var) {
        return new p6f(xvf0Var, 26);
    }

    public static p6f c(eqh eqhVar) {
        return new p6f(eqhVar, 27);
    }

    public static tc9 d(tw51 tw51Var) {
        oxf oxfVar = new oxf(tw51Var, 16);
        int i = 1;
        oaf oafVar = new oaf(oxfVar, i);
        int i2 = 2;
        oaf oafVar2 = new oaf(oxfVar, i2);
        oaf oafVar3 = new oaf(oxfVar, 3);
        oaf oafVar4 = new oaf(oxfVar, 0);
        oxf oxfVar2 = new oxf(tw51Var, 14);
        dx9 dx9Var = new dx9(new qrb((xvf0) oafVar, (xvf0) oafVar2, (xvf0) oafVar3, (xvf0) oafVar4, (xvf0) new srb(oxfVar2, 22), 8, (byte) 0), new oxf(tw51Var, 15), 28);
        oxf oxfVar3 = new oxf(tw51Var, 12);
        oxf oxfVar4 = new oxf(tw51Var, 7);
        int i3 = 10;
        n3w a = n3w.a(new hbf(new m(dx9Var, oxfVar3, oxfVar4, new oxf(tw51Var, 17), new oxf(tw51Var, 11), new oxf(tw51Var, 9), new oxf(tw51Var, i3), new oxf(tw51Var, 6), new oxf(tw51Var, 13), new dx9(oxfVar4, oxfVar2, 29))));
        oxf oxfVar5 = new oxf(tw51Var, 18);
        oxf oxfVar6 = new oxf(tw51Var, 8);
        return new tc9(ImmutableMap.g(CreditDepositFragment.class, new f2b(a, oxfVar5, new xea(n3w.a(new eaf(new sae(i3, oxfVar6))), new baf(oxfVar6, i), new baf(oxfVar6, i2), new baf(oxfVar6, 0), 29), 21)), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 0;
        Object[] objArr = 0;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new a((on2) xvf0Var.get());
            case 1:
                return d((tw51) xvf0Var.get());
            case 2:
                return new com.yandex.fintechsdk.logic.yb.impl.upgrade.internal.a((fp51) xvf0Var.get());
            case 3:
                return new vff((uyd) xvf0Var.get());
            case 4:
                return new o61((pho) xvf0Var.get());
            case 5:
                return new gyc((FlexAdapter) xvf0Var.get());
            case 6:
                return new mmf((xdf) xvf0Var.get());
            case 7:
                return new lhg((jwh) xvf0Var.get());
            case 8:
                return new tjg((i650) xvf0Var.get());
            case 9:
                return new tgg((Set) xvf0Var.get());
            case 10:
                return new arg((Context) xvf0Var.get());
            case 11:
                return new wbz0();
            case 12:
                return new mxg((dqe0) xvf0Var.get());
            case 13:
                return new izg((b) xvf0Var.get());
            case 14:
                return new zgf(15, (y50) xvf0Var.get());
            case 15:
                return new c0h((pev0) xvf0Var.get());
            case 16:
                return new p0h((n3h) xvf0Var.get());
            case 17:
                return new sae(26, (fke) xvf0Var.get());
            case 18:
                return new r0h((np51) xvf0Var.get());
            case 19:
                return new cyf((tw51) xvf0Var.get());
            case 20:
                cyf cyfVar = (cyf) xvf0Var.get();
                epf epfVar = cyfVar.c;
                h9g h9gVar = (h9g) cyfVar.a;
                a3h a3hVar = (a3h) h9gVar.v.T0.get();
                q5z.h(a3hVar);
                AppAnalyticsReporter d = h9gVar.d();
                q5z.h(d);
                return new b3z(epfVar, a3hVar, new xjg(d, new m501(18), objArr == true ? 1 : 0, 2));
            case 21:
                return new w2h((wnt) xvf0Var.get());
            case 22:
                return new b1((pho) xvf0Var.get());
            case 23:
                return new j7h((zuj0) xvf0Var.get());
            case 24:
                return new gfh(i2, (mo40) xvf0Var.get());
            case 25:
                return new nkh((j0x) xvf0Var.get());
            case 26:
                return new ru.yandex.taxi.experiments.storage.a((tt2) xvf0Var.get());
            case 27:
                return new iph((pho) xvf0Var.get());
            case 28:
                return new a22((zuj0) xvf0Var.get());
            default:
                return new gwh((dqe0) xvf0Var.get());
        }
    }

    public /* synthetic */ p6f(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }
}
