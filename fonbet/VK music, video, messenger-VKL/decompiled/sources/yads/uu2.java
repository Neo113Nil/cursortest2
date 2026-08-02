package yads;

import android.content.Context;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import io.appmetrica.analytics.AppMetrica;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import ru.ok.tracer.base.deviceid.DeviceIdUtils;
import xsna.drm0;
import xsna.epx;
import xsna.erm0;
import xsna.fw3;
import xsna.j5g;
import xsna.tdj;

/* loaded from: classes10.dex */
public final class uu2 {
    public final rd a;
    public final mm0 b;
    public final w5 c;
    public final fv2 d;
    public final av2 e;
    public final yp2 f;
    public final cv2 g;
    public final u43 h;
    public final Context i;

    public uu2(Context context, rd rdVar, mm0 mm0Var, w5 w5Var, fv2 fv2Var, av2 av2Var, yp2 yp2Var, cv2 cv2Var, u43 u43Var) {
        this.a = rdVar;
        this.b = mm0Var;
        this.c = w5Var;
        this.d = fv2Var;
        this.e = av2Var;
        this.f = yp2Var;
        this.g = cv2Var;
        this.h = u43Var;
        this.i = context.getApplicationContext();
    }

    public final void a(sy2 sy2Var, t61 t61Var, wu2 wu2Var) {
        String str;
        String str2;
        qu2 a = gx2.a().a(this.i);
        if (a != null && !this.d.a()) {
            xy xyVar = xy.d;
            if (wu2Var.a.isActive()) {
                wu2Var.a.resumeWith(new kv2(a, xyVar));
                return;
            }
            return;
        }
        gv2 gv2Var = new gv2(this.i, this.e, wu2Var, this.c);
        jp2 jp2Var = this.h.a;
        dp2 dp2Var = dp2.c;
        jp2Var.a(new fp2("sdk_configuration_request", new LinkedHashMap(xsna.dt.b("call_source", t61Var.b)), null));
        km0 km0Var = this.b.a;
        Context context = this.i;
        String str3 = km0Var.e;
        if (str3 == null || str3.length() == 0) {
            str = null;
        } else {
            cv2 cv2Var = this.g;
            rd rdVar = this.a;
            cv2Var.getClass();
            boolean b = sy2Var.b(context);
            vu0 vu0Var = new vu0(b);
            vu0Var.u = km0Var.b();
            vu0Var.m = km0Var.d;
            td tdVar = rdVar.a;
            boolean z = rdVar.c;
            if (tdVar != null) {
                vu0Var.N = Boolean.valueOf(tdVar.b);
                vu0Var.O = Boolean.valueOf(z);
                String str4 = tdVar.a;
                vu0Var.e.getClass();
                boolean z2 = (str4 == null || str4.length() == 0 || DeviceIdUtils.NULL_UUID.equals(str4)) ? false : true;
                if (!b && epx.f(vu0Var.N, Boolean.FALSE) && z2) {
                    vu0Var.P = str4;
                }
            }
            td tdVar2 = rdVar.b;
            if (tdVar2 != null) {
                vu0Var.Q = Boolean.valueOf(tdVar2.b);
                String str5 = tdVar2.a;
                vu0Var.e.getClass();
                boolean z3 = (str5 == null || str5.length() == 0 || DeviceIdUtils.NULL_UUID.equals(str5)) ? false : true;
                if (!b && epx.f(vu0Var.Q, Boolean.FALSE) && z3) {
                    vu0Var.R = str5;
                }
            }
            vu0Var.c.getClass();
            pg.a(context);
            try {
                str2 = AppMetrica.getLibraryVersion();
            } catch (Throwable unused) {
                str2 = null;
            }
            vu0Var.C0 = str2;
            vu0Var.C = Integer.valueOf(om3.d(context));
            vu0Var.D = Integer.valueOf(om3.b(context));
            vu0Var.E = Float.valueOf(context.getResources().getDisplayMetrics().density);
            vu0Var.r0 = om3.a(context);
            wg0 b2 = zp3.b(context);
            vu0Var.s0 = b2.a;
            vu0Var.t0 = b2.b;
            vu0Var.u0 = b2.c;
            vu0Var.v0 = b2.d;
            vu0Var.w0 = b2.e;
            vu0Var.x0 = b2.f;
            vu0Var.k = gx2.a().b();
            vu0Var.g = sy2.a(context);
            vu0 a2 = vu0Var.a(context, km0Var.a);
            a2.n0 = context.getPackageName();
            a2.o0 = og.a(context);
            a2.p0 = og.b(context);
            a2.A0 = a2.d.a("%d.%d%d");
            a2.B0 = a2.d.a("%d.%d.%d");
            a2.j = gx2.a().d();
            a2.f = true;
            String[] strArr = {new zu0(a2).toString(), j5g.g0(km0Var.b, "&", null, null, 0, bv2.b, 30)};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 2; i++) {
                String str6 = strArr[i];
                if (!drm0.N(str6)) {
                    arrayList.add(str6);
                }
            }
            String a3 = cv2Var.a.a(context, j5g.g0(arrayList, "&", null, null, 0, null, 62));
            StringBuilder e = fw3.e(str3);
            if (!epx.f(String.valueOf(erm0.A0(e)), DomExceptionUtils.SEPARATOR)) {
                e.append(DomExceptionUtils.SEPARATOR);
            }
            str = tdj.a(e, "v1/startup", "?", a3);
        }
        if (str == null || str.length() == 0) {
            gv2Var.a((mn3) new h4(m4.j, null));
            return;
        }
        ev2 ev2Var = new ev2(this.i, str, this.d, km0Var.c, gv2Var, gv2Var);
        ev2Var.q = this;
        this.c.a(v5.l, null);
        yp2 yp2Var = this.f;
        Context context2 = this.i;
        synchronized (yp2Var) {
            t92.a(context2).a(ev2Var);
        }
    }

    public /* synthetic */ uu2(Context context, bu1 bu1Var, rd rdVar, mm0 mm0Var, w5 w5Var) {
        this(context, rdVar, mm0Var, w5Var, new fv2(context, bu1Var), zu2.a(), xp2.a(), new cv2(), new u43(bu1Var));
    }
}
