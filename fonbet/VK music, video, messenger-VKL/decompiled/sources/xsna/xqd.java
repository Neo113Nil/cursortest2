package xsna;

import android.content.Context;
import java.util.LinkedHashSet;

/* compiled from: ClipsDiskCachePreloader.kt */
/* loaded from: classes17.dex */
public final class xqd implements xmf<sht0> {
    public final Context b;
    public final LinkedHashSet<dbn> c = new LinkedHashSet<>();

    public xqd(Context context) {
        this.b = context;
    }

    @Override // xsna.xmf
    public final void a(sht0 sht0Var) {
        if (sht0Var instanceof dbn) {
            if (!d()) {
                this.c.add(sht0Var);
                return;
            }
            io.reactivex.rxjava3.subjects.e eVar = frd.a;
            asu0.a.getClass();
            asu0.n().execute(new w9c(1, this.b, (dbn) sht0Var));
        }
    }

    @Override // xsna.xmf
    public final io.reactivex.rxjava3.subjects.e c() {
        return frd.a;
    }

    @Override // xsna.xmf
    public final boolean d() {
        z0d0 z0d0Var = frd.b;
        if (z0d0Var != null) {
            return z0d0Var.d;
        }
        return false;
    }

    @Override // xsna.xmf
    public final void f(sht0 sht0Var) {
        if (sht0Var instanceof dbn) {
            io.reactivex.rxjava3.subjects.e eVar = frd.a;
            asu0.a.getClass();
            asu0.n().execute(new ard((dbn) sht0Var));
            this.c.remove(sht0Var);
        }
    }

    @Override // xsna.xmf
    public final void stop() {
        this.c.clear();
        io.reactivex.rxjava3.subjects.e eVar = frd.a;
        asu0.a.getClass();
        asu0.n().execute(new brd());
    }
}
