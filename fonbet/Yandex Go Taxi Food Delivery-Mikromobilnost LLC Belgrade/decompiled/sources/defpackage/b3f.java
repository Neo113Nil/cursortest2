package defpackage;

import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class b3f implements y2f {
    public static final a3f c = new a3f();
    public final cg70 a;
    public final AtomicReference b = new AtomicReference(null);

    public b3f(cg70 cg70Var) {
        this.a = cg70Var;
        cg70Var.a(new s59(this));
    }

    @Override // defpackage.y2f
    public final j450 a(String str) {
        y2f y2fVar = (y2f) this.b.get();
        return y2fVar == null ? c : y2fVar.a(str);
    }

    @Override // defpackage.y2f
    public final boolean b() {
        y2f y2fVar = (y2f) this.b.get();
        return y2fVar != null && y2fVar.b();
    }

    @Override // defpackage.y2f
    public final void c(String str, long j, k84 k84Var) {
        Log.isLoggable("FirebaseCrashlytics", 2);
        this.a.a(new z2f(str, j, k84Var));
    }

    @Override // defpackage.y2f
    public final boolean d(String str) {
        y2f y2fVar = (y2f) this.b.get();
        return y2fVar != null && y2fVar.d(str);
    }
}
