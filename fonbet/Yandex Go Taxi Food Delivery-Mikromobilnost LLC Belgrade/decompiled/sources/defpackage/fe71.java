package defpackage;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.ViewGroup;
import io.appmetrica.analytics.IReporter;
import io.appmetrica.analytics.billing.impl.j;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.idsync.impl.n;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import io.appmetrica.analytics.impl.C0204b0;
import io.appmetrica.analytics.impl.C0736td;
import java.util.Arrays;
import java.util.List;
import yads.gn0;
import yads.l03;
import yads.oa1;
import yads.rn0;
import yads.t52;
import yads.w4;
import yads.yl2;

/* loaded from: classes7.dex */
public final /* synthetic */ class fe71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fe71(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        long j;
        boolean z;
        long j2 = -9223372036854775807L;
        switch (this.a) {
            case 0:
                ge71 ge71Var = (ge71) this.b;
                Throwable th = (Throwable) this.c;
                try {
                    a441 a441Var = ge71Var.a;
                    if (((gg71) a441Var.b).a()) {
                        hk71 hk71Var = (hk71) ((i3y) a441Var.c).getValue();
                        switch (hk71Var.a) {
                            case 0:
                                ((IReporter) ((ryh) hk71Var.b).b).reportUnhandledException(th);
                                break;
                            default:
                                ((IReporter) hk71Var.b).reportUnhandledException(th);
                                break;
                        }
                    }
                    break;
                } catch (Throwable unused) {
                    return;
                }
            case 1:
                ng71 ng71Var = (ng71) this.b;
                a871 a871Var = (a871) this.c;
                ng71Var.R = ng71Var.K == null ? a871Var : new w471(-9223372036854775807L, 0L);
                ng71Var.S = a871Var.c();
                boolean z2 = !ng71Var.a0 && a871Var.c() == -9223372036854775807L;
                ng71Var.T = z2;
                ng71Var.U = z2 ? 7 : 1;
                vp71 vp71Var = ng71Var.z;
                long j3 = ng71Var.S;
                boolean b = a871Var.b();
                boolean z3 = ng71Var.T;
                if (j3 == -9223372036854775807L) {
                    j3 = vp71Var.X;
                }
                if (vp71Var.W || vp71Var.X != j3 || vp71Var.Y != b || vp71Var.Z != z3) {
                    vp71Var.X = j3;
                    vp71Var.Y = b;
                    vp71Var.Z = z3;
                    vp71Var.W = false;
                    yn81 pq81Var = new pq81(vp71Var.X, vp71Var.Y, vp71Var.Z, vp71Var.P);
                    if (vp71Var.W) {
                        pq81Var = new oj71(pq81Var);
                    }
                    vp71Var.a(pq81Var);
                }
                if (!ng71Var.O) {
                    ng71Var.o();
                    break;
                }
                break;
            case 2:
                j.a((j) this.b, (ProductInfo) this.c);
                break;
            case 3:
                ek71 ek71Var = (ek71) this.b;
                lw71 lw71Var = (lw71) this.c;
                int i = ek71Var.B - lw71Var.c;
                ek71Var.B = i;
                if (lw71Var.d) {
                    ek71Var.C = lw71Var.e;
                    ek71Var.D = true;
                }
                if (lw71Var.f) {
                    ek71Var.E = lw71Var.g;
                }
                if (i == 0) {
                    yn81 yn81Var = lw71Var.b.a;
                    if (!ek71Var.b0.a.c() && yn81Var.c()) {
                        ek71Var.c0 = -1;
                        ek71Var.d0 = 0L;
                    }
                    if (!yn81Var.c()) {
                        List asList = Arrays.asList(((ii81) yn81Var).B);
                        if (asList.size() != ek71Var.n.size()) {
                            ny61.k();
                            break;
                        } else {
                            for (int i2 = 0; i2 < asList.size(); i2++) {
                                ((vg71) ek71Var.n.get(i2)).b = (yn81) asList.get(i2);
                            }
                        }
                    }
                    if (ek71Var.D) {
                        if (lw71Var.b.b.equals(ek71Var.b0.b) && lw71Var.b.d == ek71Var.b0.r) {
                            r6 = 0;
                        }
                        if (r6 != 0) {
                            if (yn81Var.c() || lw71Var.b.b.a()) {
                                j2 = lw71Var.b.d;
                            } else {
                                hp71 hp71Var = lw71Var.b;
                                v281 v281Var = hp71Var.b;
                                long j4 = hp71Var.d;
                                yn81Var.a(v281Var.a, ek71Var.m);
                                j2 = j4 + ek71Var.m.x;
                            }
                        }
                        j = j2;
                        z = r6;
                    } else {
                        j = -9223372036854775807L;
                        z = 0;
                    }
                    ek71Var.D = false;
                    ek71Var.h(lw71Var.b, 1, ek71Var.E, z, ek71Var.C, j);
                    break;
                }
                break;
            case 4:
                ((l03) this.b).a((SurfaceTexture) this.c);
                break;
            case 5:
                ((ViewGroup) this.b).removeView((ViewGroup) this.c);
                break;
            case 6:
                n.a((n) this.b, (RequestConfig) this.c);
                break;
            case 7:
                oa1.a((oa1) this.b, (nl61) this.c);
                break;
            case 8:
                kz kzVar = (kz) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                vi71 vi71Var = (vi71) kzVar.c;
                em81 em81Var = (em81) ((cr71) vi71Var.b).x;
                t52 t52Var = (t52) vi71Var.c;
                yl2 yl2Var = (yl2) vi71Var.w;
                em81Var.getClass();
                yl2Var.setAlpha(0.0f);
                yl2Var.animate().alpha(1.0f).setDuration(700L).withStartAction(new uqs(19, yl2Var, bitmap)).withEndAction(new tqs(20, t52Var, yl2Var)).start();
                break;
            case 9:
                ((rn0) this.b).b((s371) this.c);
                break;
            case 10:
                C0736td.a((C0736td) this.b, (C0204b0) this.c);
                break;
            case 11:
                cr71 cr71Var = (cr71) this.b;
                n581 n581Var = (n581) this.c;
                lm71 lm71Var = (lm71) cr71Var.x;
                if (lm71Var != null) {
                    ((fk71) lm71Var.b).b(n581Var);
                    break;
                }
                break;
            case 12:
                fp71 fp71Var = (fp71) this.b;
                sc71 sc71Var = (sc71) this.c;
                i971 i971Var = (i971) fp71Var.w;
                if (i971Var != null) {
                    ((fk71) i971Var.b).b(sc71Var);
                    break;
                }
                break;
            case 13:
                dl61 dl61Var = (dl61) this.b;
                cr71 cr71Var2 = (cr71) this.c;
                int i3 = dl61Var.a;
                nr41 nr41Var = (nr41) cr71Var2.x;
                if (nr41Var != null) {
                    ((fk71) nr41Var.b).a();
                    break;
                }
                break;
            case 14:
                cr71 cr71Var3 = (cr71) this.b;
                o471 o471Var = (o471) this.c;
                nr41 nr41Var2 = (nr41) cr71Var3.x;
                if (nr41Var2 != null) {
                    ((fk71) nr41Var2.b).b(o471Var);
                    break;
                }
                break;
            case 15:
                hn71 hn71Var = (hn71) this.b;
                synchronized (((h881) this.c)) {
                }
                gn0 gn0Var = (gn0) hn71Var.c;
                int i4 = rf71.a;
                ep71 ep71Var = gn0Var.a.p;
                ep71Var.y(ep71Var.w((v281) ep71Var.w.x), 1013, new dp71(8));
                gn0Var.a.getClass();
                gn0Var.a.getClass();
                break;
            default:
                d391 d391Var = (d391) this.b;
                w4 w4Var = (w4) this.c;
                nr41 nr41Var3 = d391Var.b;
                if (nr41Var3 != null) {
                    switch (nr41Var3.a) {
                        case 22:
                            mj31 mj31Var = ((j471) nr41Var3.b).V;
                            ((Handler) mj31Var.b).post(new bo31(24, mj31Var, w4Var));
                            break;
                    }
                }
                break;
        }
    }
}
