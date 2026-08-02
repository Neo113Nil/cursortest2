package defpackage;

import com.yandex.payment.sdk.core.impl.bind.a;
import com.yandex.xplat.payment.sdk.NetworkServiceRetryingStrategy;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public final class bx5 {
    public final rbh a;
    public final ag1 b;
    public final qdh c;
    public final a d;
    public final knz0 e;
    public final qs20 f;
    public final nhj g;
    public final String h;
    public final String i;
    public final int j;
    public final boolean k;
    public final rwo l;
    public final y22 m;
    public final tt4 n;
    public final pgb o;
    public final zu5 p;
    public w18 q;

    public bx5(rbh rbhVar, ag1 ag1Var, qdh qdhVar, a aVar, knz0 knz0Var, qs20 qs20Var, nhj nhjVar, String str, String str2, int i, boolean z, rwo rwoVar, y22 y22Var, tt4 tt4Var, pgb pgbVar, zu5 zu5Var) {
        this.a = rbhVar;
        this.b = ag1Var;
        this.c = qdhVar;
        this.d = aVar;
        this.e = knz0Var;
        this.f = qs20Var;
        this.g = nhjVar;
        this.h = str;
        this.i = str2;
        this.j = i;
        this.k = z;
        this.l = rwoVar;
        this.m = y22Var;
        this.n = tt4Var;
        this.o = pgbVar;
        this.p = zu5Var;
    }

    public final md51 a(String str, us20 us20Var) {
        dt20 dt20Var = new dt20(new ts5(us20Var, 4), new ts5(us20Var, 5), this.l);
        w18 w18Var = new w18();
        this.q = w18Var;
        return mz91.c(new zw5(this, str, 2), new ys5(dt20Var, 1), new kdd0((Object) null, new wdz(), this.o.a, w18Var)).f(new ar5(12)).d(new yw5(this, 3));
    }

    public final md51 b(String str, String str2, String str3, goz0 goz0Var, wj00 wj00Var, boolean z, String str4, String str5) {
        my21 my21Var = new my21(str, this.h, str3, str2, goz0Var.a, goz0Var.b, wj00Var, z, str4, str5);
        iho f = vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Верификация новой карты при привязке через Vera", "verify_binding");
        md51 f2 = this.f.a.f(my21Var, new rv10(19), NetworkServiceRetryingStrategy.retryOnce);
        ((y22) this.l).b(f, f2);
        return f2;
    }

    public final md51 c(String str, yeb yebVar) {
        w18 w18Var = new w18();
        this.q = w18Var;
        return mz91.c(new zw5(this, str, 1), new kv5(5, yebVar), new kdd0((Object) null, new wdz(), this.o.a, w18Var)).h(new ar5(10)).f(new ar5(11)).d(new yw5(this, 2));
    }

    public final md51 d(String str, String str2, yeb yebVar) {
        w18 w18Var = new w18();
        this.q = w18Var;
        return mz91.c(new sb0(8, this, str, str2), new kv5(3, yebVar), new kdd0((Object) null, new wdz(), this.o.a, w18Var)).h(new h0(str, 20)).f(new ar5(6)).d(new yw5(this, 0));
    }
}
