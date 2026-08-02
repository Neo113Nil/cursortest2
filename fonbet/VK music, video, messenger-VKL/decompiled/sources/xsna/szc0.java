package xsna;

import android.net.Uri;

/* compiled from: PrefetchDelegate.kt */
/* loaded from: classes15.dex */
public final class szc0 implements Runnable {
    public final /* synthetic */ pzc0 b;
    public final /* synthetic */ ur4 c;
    public final /* synthetic */ Uri d;
    public final /* synthetic */ Throwable e;

    public szc0(pzc0 pzc0Var, ur4 ur4Var, Uri uri, Throwable th) {
        this.b = pzc0Var;
        this.c = ur4Var;
        this.d = uri;
        this.e = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tzc0 tzc0Var = this.b.b;
        if (tzc0Var != null) {
            tzc0Var.b(this.c, this.d, this.e);
        }
    }
}
