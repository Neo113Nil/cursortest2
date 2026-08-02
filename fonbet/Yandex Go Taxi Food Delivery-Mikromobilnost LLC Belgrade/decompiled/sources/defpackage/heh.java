package defpackage;

import android.util.Log;

/* loaded from: classes8.dex */
public final class heh implements qgz {
    public final qez a;

    public heh() {
        this(pez.b);
    }

    @Override // defpackage.qgz
    public final void a(String str, String str2, Throwable th) {
        if (this.a.a <= 5) {
            Log.e(str, str2, th);
        }
    }

    @Override // defpackage.qgz
    public final void b(String str, String str2) {
        this.a.getClass();
    }

    @Override // defpackage.qgz
    public final void c(String str, String str2) {
        this.a.getClass();
    }

    @Override // defpackage.qgz
    public final void e(String str, String str2) {
        this.a.getClass();
    }

    @Override // defpackage.qgz
    public final void f(String str, String str2) {
        if (this.a.a <= 5) {
            Log.e(str, str2);
        }
    }

    @Override // defpackage.qgz
    public final void info(String str, String str2) {
        if (this.a.a <= 3) {
            Log.i(str, str2);
        }
    }

    public heh(qez qezVar) {
        this.a = qezVar;
    }
}
