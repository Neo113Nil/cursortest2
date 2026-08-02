package yads;

import android.content.Context;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.dez0;
import xsna.epx;

/* loaded from: classes10.dex */
public final class y5 {
    public final d4 a;
    public final jp2 b;
    public final rd2 c;
    public final we d;
    public fq2 e;
    public gr2 f;
    public boolean g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ y5(Context context, d4 d4Var, ov2 ov2Var, w5 w5Var) {
        this(d4Var, cf.a(context, r4.b()), new x5(w5Var), new we(context));
        mv3 mv3Var = (mv3) ov2Var;
        mv3Var.d();
        tv3 tv3Var = tv3.a;
    }

    public final void a(Object... objArr) {
        int length = objArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (objArr[i] != null) {
                z = true;
                break;
            }
            i++;
        }
        this.g = z;
    }

    public final void a(String str, String str2) {
        HashMap a = xsna.hq.a("status", "error", "failure_reason", str);
        a.put("reason", str2);
        a.put("durations", this.c.a());
        a.put("load_listener_available", Boolean.valueOf(this.g));
        a(a);
    }

    public y5(d4 d4Var, jp2 jp2Var, rd2 rd2Var, we weVar) {
        this.a = d4Var;
        this.b = jp2Var;
        this.c = rd2Var;
        this.d = weVar;
    }

    public final void a(HashMap hashMap) {
        gp2 gp2Var = new gp2(hashMap, 2);
        fq2 fq2Var = this.e;
        if (fq2Var != null) {
            gp2Var.a.putAll(fq2Var.a());
        }
        gr2 gr2Var = this.f;
        if (gr2Var != null) {
            gp2Var = hp2.a(gp2Var, ((j22) gr2Var).a());
        }
        dp2 dp2Var = dp2.c;
        Map map = gp2Var.a;
        c cVar = gp2Var.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        this.b.a(new fp2("ad_loading_result", linkedHashMap, cVar));
        if (epx.f(hashMap.get("status"), "success")) {
            we weVar = this.d;
            String str = this.a.l;
            if (str == null) {
                str = cp2.a;
            }
            weVar.a(dp2Var, linkedHashMap, str, null);
        }
    }

    public final void a() {
        HashMap a = dez0.a("status", "success");
        a.put("durations", this.c.a());
        a.put("load_listener_available", Boolean.valueOf(this.g));
        a(a);
    }
}
