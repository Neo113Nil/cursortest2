package defpackage;

import android.content.Context;
import com.monetization.ads.mediation.interstitial.a;
import com.monetization.ads.mediation.interstitial.b;
import com.monetization.ads.mediation.interstitial.c;
import yads.qp1;

/* loaded from: classes7.dex */
public final class e291 implements qe71 {
    public final d881 a;
    public final qp1 b;
    public final Context c;

    public e291(Context context, d881 d881Var, qp1 qp1Var) {
        this.a = d881Var;
        this.b = qp1Var;
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext != null ? applicationContext : context;
    }

    @Override // defpackage.qe71
    public final mb71 k(kh61 kh61Var, bq71 bq71Var) {
        f171 f171Var = new f171();
        b bVar = new b();
        fe81 fe81Var = bq71Var.b;
        v981 v981Var = bq71Var.c;
        gr81 gr81Var = new gr81(fe81Var);
        d881 d881Var = this.a;
        z581 z581Var = new z581(fe81Var, v981Var, d881Var);
        qp1 qp1Var = this.b;
        ey61 ey61Var = new ey61(new s1n(qp1Var.b, gr81Var, z581Var, (cf71) null, 24), 0);
        aj81 aj81Var = new aj81(this.c, fe81Var, bq71Var.a, bVar, z581Var, ey61Var, new i371(kh61Var, qp1Var));
        return new c(bq71Var, aj81Var, bVar, new a(kh61Var, bq71Var, aj81Var, f171Var), new z581(bq71Var.b, v981Var, d881Var), f171Var);
    }

    @Override // defpackage.qe71
    public final mb71 t(hd71 hd71Var, bq71 bq71Var) {
        fe81 fe81Var = bq71Var.b;
        v981 v981Var = bq71Var.c;
        gr81 gr81Var = new gr81(fe81Var);
        z581 z581Var = new z581(fe81Var, v981Var, this.a);
        qp1 qp1Var = this.b;
        j171 j171Var = new j171(new s1n(qp1Var.b, gr81Var, z581Var, (cf71) null, 24), 1);
        e971 e971Var = bq71Var.a;
        i371 i371Var = new i371(hd71Var, qp1Var);
        com.monetization.ads.mediation.appopenad.c cVar = new com.monetization.ads.mediation.appopenad.c();
        aj81 aj81Var = new aj81(this.c, fe81Var, e971Var, cVar, z581Var, j171Var, i371Var);
        return new com.monetization.ads.mediation.appopenad.b(aj81Var, cVar, new com.monetization.ads.mediation.appopenad.a(hd71Var, aj81Var), z581Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qe71
    public final mb71 u(bt81 bt81Var, bq71 bq71Var) {
        f171 f171Var = new f171();
        n471 n471Var = new n471();
        fe81 fe81Var = bq71Var.b;
        v981 v981Var = bq71Var.c;
        gr81 gr81Var = new gr81(fe81Var);
        d881 d881Var = this.a;
        z581 z581Var = new z581(fe81Var, v981Var, d881Var);
        rr41 rr41Var = new rr41(z581Var);
        cf71 cf71Var = new cf71((Object) rr41Var, (Object) new a441(28, rr41Var, d881Var), false, 8);
        qp1 qp1Var = this.b;
        j171 j171Var = new j171(new s1n(qp1Var.b, gr81Var, z581Var, cf71Var, 16), 0 == true ? 1 : 0);
        aj81 aj81Var = new aj81(this.c, fe81Var, bq71Var.a, n471Var, z581Var, j171Var, new i371(bt81Var, qp1Var));
        j181 j181Var = bq71Var.d;
        zg71 zg71Var = new zg71(bt81Var, j181Var, aj81Var);
        new z581(bq71Var.b, v981Var, d881Var);
        return new mj31(j181Var, aj81Var, zg71Var, f171Var);
    }
}
