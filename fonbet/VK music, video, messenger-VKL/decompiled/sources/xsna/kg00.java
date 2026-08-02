package xsna;

import android.os.Handler;
import android.os.Looper;
import xsna.uni0;

/* compiled from: MainThreadWrapper.kt */
/* loaded from: classes6.dex */
public final class kg00 implements uni0.a {
    public final uni0.a a;
    public final Handler b = new Handler(Looper.getMainLooper());

    public kg00(uni0.a aVar) {
        this.a = aVar;
    }

    @Override // xsna.uni0.a
    public final void a(final long j) {
        this.b.post(new Runnable() { // from class: xsna.jg00
            @Override // java.lang.Runnable
            public final void run() {
                kg00.this.a.a(j);
            }
        });
    }

    @Override // xsna.uni0.a
    public final void b() {
        this.b.post(new cs2(this, 11));
    }
}
