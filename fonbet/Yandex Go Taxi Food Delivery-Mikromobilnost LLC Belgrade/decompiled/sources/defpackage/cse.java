package defpackage;

import com.arkivanov.mvikotlin.core.utils.internal.AtomicKt$atomic$1;

/* loaded from: classes10.dex */
public abstract class cse implements la6 {
    public final AtomicKt$atomic$1 a;
    public final ike b;

    public cse(int i) {
        sjh sjhVar = uyj.a;
        g6u g6uVar = o400.a;
        this.a = new AtomicKt$atomic$1(null);
        this.b = bvf0.a(g6uVar);
    }

    public final void a(Object obj) {
        ((tls) kp50.N(this.a)).invoke(obj);
    }

    @Override // defpackage.la6
    public final void c(tls tlsVar) {
        kp50.A(this.a, tlsVar);
    }

    @Override // defpackage.la6
    public final void dispose() {
        bvf0.j(this.b, null);
    }

    public cse() {
        this(0);
    }
}
