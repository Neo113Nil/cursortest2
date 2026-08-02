package defpackage;

import android.content.Context;
import com.google.android.gms.tasks.zzw;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ich implements teu, ueu {
    public final j3y a;
    public final Context b;
    public final zvf0 c;
    public final Set d;
    public final Executor e;

    public ich(Context context, String str, Set set, zvf0 zvf0Var, Executor executor) {
        this.a = new j3y(new m1d(1, context, str));
        this.d = set;
        this.e = executor;
        this.c = zvf0Var;
        this.b = context;
    }

    public final zzw a() {
        if (!wwg.w(this.b)) {
            return udq0.p("");
        }
        return udq0.h(this.e, new hch(this, 0));
    }

    public final void b() {
        if (this.d.size() <= 0) {
            udq0.p(null);
        } else if (!wwg.w(this.b)) {
            udq0.p(null);
        } else {
            udq0.h(this.e, new hch(this, 1));
        }
    }
}
