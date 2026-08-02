package defpackage;

import android.content.Context;

/* loaded from: classes7.dex */
public final class gi81 {
    public final mdh a;
    public final a441 b;
    public final s421 c;
    public final g191 d;
    public final ep61 e;

    public gi81(Context context) {
        sjh sjhVar = uyj.a;
        mdh mdhVar = mdh.b;
        a441 a441Var = new a441(context);
        s421 s421Var = new s421(context, 29);
        if (qca1.a == null) {
            synchronized (qca1.b) {
                if (qca1.a == null) {
                    qca1.a = new g191(s881.a(context, "YadPreferenceFile"));
                }
            }
        }
        g191 g191Var = qca1.a;
        if (g191Var == null) {
            ny61.g("Required value was null.");
            throw null;
        }
        ep61 ep61Var = new ep61(context);
        this.a = mdhVar;
        this.b = a441Var;
        this.c = s421Var;
        this.d = g191Var;
        this.e = ep61Var;
    }
}
