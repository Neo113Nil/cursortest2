package defpackage;

import android.util.Log;

/* loaded from: classes15.dex */
public final class apq0 {
    public final o5e a;
    public final cjw0 b;
    public final cjw0 c;

    public apq0(o5e o5eVar, w3c w3cVar) {
        this.a = o5eVar;
        this.b = new cjw0(w3cVar);
        this.c = new cjw0(w3cVar);
    }

    public final void a(long j, String str) {
        if (!this.b.z(j, str)) {
            qa2 qa2Var = ydz.a;
            if (qa2Var.a()) {
                String p = oyr.p("track for outgoing message id ", str, " not found");
                if (qa2Var.a()) {
                    Log.i("MsgTime2SendProfiler", p);
                }
            }
        }
        if (this.c.z(j, str)) {
            return;
        }
        qa2 qa2Var2 = ydz.a;
        if (qa2Var2.a()) {
            String p2 = oyr.p("track for outgoing message id ", str, " not found");
            if (qa2Var2.a()) {
                Log.i("MsgTime2SendProfiler", p2);
            }
        }
    }
}
