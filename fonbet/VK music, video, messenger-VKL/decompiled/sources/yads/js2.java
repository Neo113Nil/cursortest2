package yads;

import android.content.Context;

/* loaded from: classes10.dex */
public final class js2 implements kz {
    public final Context a;
    public final ow b;
    public final kz c;
    public boolean d;

    public js2(Context context, fi0 fi0Var, kz kzVar) {
        this.a = context;
        this.b = fi0Var;
        this.c = kzVar;
    }

    @Override // yads.kz
    public final void e() {
        if (this.d) {
            this.c.e();
            return;
        }
        ((fi0) this.b).a(this.a);
    }
}
