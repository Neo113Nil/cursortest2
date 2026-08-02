package defpackage;

import android.content.Context;
import com.monetization.ads.mediation.base.a;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import yads.f5;
import yads.hm2;
import yads.im2;
import yads.j5;
import yads.zp1;

/* loaded from: classes7.dex */
public final class aj81 {
    public final fe81 a;
    public final e971 b;
    public final cy61 c;
    public final z581 d;
    public final gm81 e;
    public final i371 f;
    public final Context g;
    public cr71 h;

    public aj81(Context context, fe81 fe81Var, e971 e971Var, cy61 cy61Var, z581 z581Var, gm81 gm81Var, i371 i371Var) {
        this.a = fe81Var;
        this.b = e971Var;
        this.c = cy61Var;
        this.d = z581Var;
        this.e = gm81Var;
        this.f = i371Var;
        Context applicationContext = context.getApplicationContext();
        this.g = applicationContext != null ? applicationContext : context;
    }

    public final void a(Context context) {
        cr71 cr71Var = this.h;
        if (cr71Var != null) {
            try {
                this.c.a((a) cr71Var.b);
            } catch (Throwable th) {
                this.d.a(context, hm2.e, (zp1) cr71Var.c, ((sp81) cr71Var.w).a().getNetworkName(), gw00.e(new Pair(CRLReasonCodeExtension.REASON, g8e.z("exception_in_adapter", th.toString()))));
            }
        }
    }

    public final void b(Context context, Object obj) {
        zp1 zp1Var;
        cr71 a = this.e.a(context);
        this.h = a;
        if (a == null) {
            i371 i371Var = this.f;
            r581 r581Var = i371Var.b;
            kgx kgxVar = i371.c[0];
            dj81 dj81Var = (dj81) r581Var.a.get();
            if (dj81Var == null || dj81Var.J == j5.b) {
                return;
            }
            a441 a441Var = i371Var.a;
            dj81Var.e(j5.d);
            dj81Var.d(a441Var);
            return;
        }
        gr81 gr81Var = (gr81) a.x;
        sp81 sp81Var = (sp81) a.w;
        zp1 zp1Var2 = (zp1) a.c;
        fe81 fe81Var = this.a;
        fe81Var.k = zp1Var2;
        fe81Var.l = sp81Var.a().getNetworkName();
        f5 f5Var = f5.c;
        e971 e971Var = this.b;
        e971Var.b(f5Var, null);
        zp1 zp1Var3 = (zp1) a.c;
        String networkName = sp81Var.a().getNetworkName();
        hm2 hm2Var = hm2.f;
        Map f = b.f();
        z581 z581Var = this.d;
        z581Var.a(context, hm2Var, zp1Var3, networkName, f);
        try {
            this.c.a(context, (a) a.b, obj, gr81Var.b(context), zp1Var2.c);
        } catch (Throwable th) {
            z581Var.a(context, hm2.e, zp1Var3, networkName, gw00.e(new Pair(CRLReasonCodeExtension.REASON, g8e.z("exception_in_adapter", th.toString()))));
            cr71 cr71Var = this.h;
            e971Var.c(f5.c, new cf71(23, im2.d, (cr71Var == null || (zp1Var = (zp1) cr71Var.c) == null) ? null : zp1Var.b), null);
            b(context, obj);
        }
    }
}
