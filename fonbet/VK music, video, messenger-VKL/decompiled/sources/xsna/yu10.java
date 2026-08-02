package xsna;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: MediaPipelineAnalyticsListenerImpl.kt */
/* loaded from: classes3.dex */
public final class yu10 implements xu10 {
    public final irk0 a;
    public volatile String b;
    public volatile int c;

    public yu10(irk0 irk0Var) {
        this.a = irk0Var;
    }

    public static String j(Throwable th) {
        StringBuilder sb = new StringBuilder();
        do {
            sb.append(String.valueOf(th));
            sb.append("\n");
            th = th != null ? th.getCause() : null;
            if (th == null) {
                break;
            }
        } while (!th.equals(th.getCause()));
        return sb.toString();
    }

    @Override // xsna.xu10
    public final void a(wnv wnvVar) {
        SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem;
        irk0 irk0Var = this.a;
        if (irk0Var != null) {
            l5m l5mVar = new l5m(irk0Var, null, 2);
            if (wnvVar instanceof awa0) {
                String h = DevNullEventKey.MEDIA_PIPELINE.h();
                String D0 = erm0.D0(1024, j(((awa0) wnvVar).a));
                int i = this.c;
                schemeStat$TypeDevNullItem = new SchemeStat$TypeDevNullItem(h, D0, "playback-error", Integer.valueOf(i), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.b, null, -16, 2, null);
            } else {
                if (!(wnvVar instanceof n690)) {
                    throw new NoWhenBranchMatchedException();
                }
                n690 n690Var = (n690) wnvVar;
                String h2 = DevNullEventKey.MEDIA_PIPELINE.h();
                String D02 = erm0.D0(1024, j(n690Var.a));
                int i2 = this.c;
                chd0 chd0Var = n690Var.b;
                int i3 = chd0Var.e;
                int i4 = chd0Var.f;
                int i5 = chd0Var.g;
                schemeStat$TypeDevNullItem = new SchemeStat$TypeDevNullItem(h2, D02, "playback-error", Integer.valueOf(i2), null, Integer.valueOf(i3), null, Integer.valueOf(i4), null, Integer.valueOf(i5), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.b, null, -688, 2, null);
            }
            l5mVar.g = schemeStat$TypeDevNullItem;
            l5mVar.q();
        }
    }

    @Override // xsna.xu10
    public final void b() {
        irk0 irk0Var = this.a;
        if (irk0Var != null) {
            l5m l5mVar = new l5m(irk0Var, null, 2);
            String h = DevNullEventKey.MEDIA_PIPELINE.h();
            int i = this.c;
            l5mVar.g = new SchemeStat$TypeDevNullItem(h, null, "copy", Integer.valueOf(i), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.b, null, -14, 2, null);
            l5mVar.q();
        }
    }

    @Override // xsna.xu10
    public final void c(zu10 zu10Var) {
        irk0 irk0Var = this.a;
        if (irk0Var != null) {
            l5m l5mVar = new l5m(irk0Var, null, 2);
            l5mVar.g = k(zu10Var, "error");
            l5mVar.q();
        }
    }

    @Override // xsna.xu10
    public final void d(mya0 mya0Var) {
        irk0 irk0Var = this.a;
        if (irk0Var != null) {
            l5m l5mVar = new l5m(irk0Var, null, 2);
            String h = DevNullEventKey.MEDIA_PIPELINE.h();
            int i = this.c;
            int i2 = mya0Var.a;
            int i3 = mya0Var.b;
            int i4 = mya0Var.c;
            int i5 = mya0Var.d;
            int i6 = mya0Var.e;
            int i7 = mya0Var.g;
            int i8 = mya0Var.h;
            int i9 = mya0Var.j;
            int i10 = mya0Var.k;
            int i11 = mya0Var.m;
            int i12 = mya0Var.n;
            int i13 = mya0Var.f;
            int i14 = mya0Var.i;
            l5mVar.g = new SchemeStat$TypeDevNullItem(h, null, "playback", Integer.valueOf(i), erm0.D0(256, j5g.g0(mya0Var.l, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, null, null, 0, new p2u(7), 30)), Integer.valueOf(i2), erm0.D0(256, j5g.g0(mya0Var.o, " ", null, null, 0, new quz(3), 30)), Integer.valueOf(i3), null, Integer.valueOf(i4), null, Integer.valueOf(i5), null, Integer.valueOf(i6), null, Integer.valueOf(i7), null, Integer.valueOf(i8), null, Integer.valueOf(i9), null, Integer.valueOf(i10), null, Integer.valueOf(i11), null, Integer.valueOf(i12), null, Integer.valueOf(i13), null, Integer.valueOf(i14), null, null, this.b, null, -715827966, 2, null);
            l5mVar.q();
        }
        l("playback", mya0Var.l);
    }

    @Override // xsna.xu10
    public final void e(dkp0 dkp0Var) {
        irk0 irk0Var = this.a;
        if (irk0Var != null) {
            l5m l5mVar = new l5m(irk0Var, null, 2);
            l5mVar.g = k(dkp0Var.a, "fallback");
            l5mVar.q();
        }
    }

    @Override // xsna.xu10
    public final void f(int i) {
        this.c = i;
    }

    @Override // xsna.xu10
    public final void g(pkp0 pkp0Var) {
        String obj;
        irk0 irk0Var = this.a;
        if (irk0Var != null) {
            l5m l5mVar = new l5m(irk0Var, null, 2);
            String h = DevNullEventKey.MEDIA_PIPELINE.h();
            String description = pkp0Var.n.getDescription();
            List<String> list = pkp0Var.q;
            String D0 = (list == null || (obj = list.toString()) == null) ? null : erm0.D0(256, obj);
            String str = pkp0Var.r;
            String D02 = str != null ? erm0.D0(256, str) : null;
            String str2 = pkp0Var.s;
            String D03 = str2 != null ? erm0.D0(256, str2) : null;
            String str3 = pkp0Var.t;
            String D04 = str3 != null ? erm0.D0(256, str3) : null;
            String str4 = pkp0Var.u;
            l5mVar.g = new SchemeStat$TypeDevNullItem(h, null, "transform", Integer.valueOf(this.c), description, Integer.valueOf(pkp0Var.a), D0, Integer.valueOf(pkp0Var.b), D02, Integer.valueOf(pkp0Var.c), D03, Integer.valueOf(pkp0Var.d), D04, Integer.valueOf(pkp0Var.e), str4 != null ? erm0.D0(256, str4) : null, Integer.valueOf(pkp0Var.f), null, Integer.valueOf(pkp0Var.g ? 1 : 0), null, Integer.valueOf(pkp0Var.h ? 1 : 0), null, Integer.valueOf(pkp0Var.p ? 1 : 0), null, Integer.valueOf((int) pkp0Var.i), null, Integer.valueOf((int) pkp0Var.j), null, Integer.valueOf((int) pkp0Var.k), null, Integer.valueOf((int) pkp0Var.l), null, Integer.valueOf((int) pkp0Var.m), this.b, null, 1431633922, 2, null);
            l5mVar.q();
        }
        l("transform", pkp0Var.o);
    }

    @Override // xsna.xu10
    public final void h(qts0 qts0Var, int i) {
        irk0 irk0Var = this.a;
        if (irk0Var != null) {
            l5m l5mVar = new l5m(irk0Var, null, 2);
            float f = 1000;
            l5mVar.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.MEDIA_PIPELINE.h(), null, "video-quality-metrics", Integer.valueOf(this.c), String.valueOf(qts0Var.a), Integer.valueOf(an10.b(qts0Var.a * f)), String.valueOf(qts0Var.b), Integer.valueOf(an10.b(qts0Var.b * f)), null, Integer.valueOf(qts0Var.c.getWidth()), null, Integer.valueOf(qts0Var.c.getHeight()), null, Integer.valueOf(qts0Var.d), null, Integer.valueOf(qts0Var.e), null, Integer.valueOf(qts0Var.g), null, Integer.valueOf(i), null, Integer.valueOf(qts0Var.f), null, Integer.valueOf(qts0Var.h), null, null, null, null, null, null, null, null, null, null, -11184894, 3, null);
            l5mVar.q();
        }
    }

    @Override // xsna.xu10
    public final void i(String str) {
        this.b = str;
    }

    public final SchemeStat$TypeDevNullItem k(zu10 zu10Var, String str) {
        String h = DevNullEventKey.MEDIA_PIPELINE.h();
        String D0 = erm0.D0(1024, j(zu10Var.a));
        int i = this.c;
        int i2 = zu10Var.h;
        int i3 = zu10Var.j;
        int i4 = zu10Var.k;
        String obj = zu10Var.b.toString();
        String str2 = zu10Var.c;
        String obj2 = zu10Var.e.toString();
        String str3 = zu10Var.f;
        String obj3 = zu10Var.l.toString();
        String D02 = erm0.D0(256, zu10Var.m.toString());
        String D03 = erm0.D0(256, zu10Var.n);
        String D04 = erm0.D0(256, zu10Var.i);
        String description = zu10Var.o.getDescription();
        String str4 = zu10Var.d;
        String D05 = str4 != null ? erm0.D0(256, str4) : null;
        String str5 = zu10Var.g;
        String D06 = str5 != null ? erm0.D0(256, str5) : null;
        String str6 = zu10Var.p;
        String D07 = str6 != null ? erm0.D0(256, str6) : null;
        String str7 = zu10Var.q;
        String D08 = str7 != null ? erm0.D0(256, str7) : null;
        String str8 = zu10Var.r;
        return new SchemeStat$TypeDevNullItem(h, D0, str, Integer.valueOf(i), obj, Integer.valueOf(i2), str2, Integer.valueOf(i3), obj2, Integer.valueOf(i4), str3, null, obj3, null, D02, null, D03, null, D04, null, description, null, D05, null, D06, null, D07, null, D08, null, str8 != null ? erm0.D0(256, str8) : null, null, this.b, null, -1431656448, 2, null);
    }

    public final void l(String str, List<ems0> list) {
        irk0 irk0Var = this.a;
        if (irk0Var != null) {
            for (ems0 ems0Var : list) {
                l5m l5mVar = new l5m(irk0Var, null, 2);
                String h = DevNullEventKey.MEDIA_PIPELINE.h();
                int i = this.c;
                int i2 = ems0Var.a;
                int i3 = ems0Var.b;
                int i4 = ems0Var.c;
                gye0 gye0Var = ems0Var.d;
                l5mVar.g = new SchemeStat$TypeDevNullItem(h, null, "video-fragment-format", Integer.valueOf(i), str, Integer.valueOf(i2), gye0Var.a, Integer.valueOf(i3), gye0Var.b, Integer.valueOf(i4), gye0Var.c, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.b, null, -2046, 2, null);
                l5mVar.q();
            }
        }
    }
}
