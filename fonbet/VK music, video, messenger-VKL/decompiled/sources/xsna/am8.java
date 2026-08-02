package xsna;

import kotlin.jvm.internal.Lambda;
import xsna.em8;

/* compiled from: BufferEmitProcessor.kt */
/* loaded from: classes9.dex */
public abstract class am8<T> implements hgn {
    public final vq70<T> b;
    public final int c;
    public final pcn d;
    public final Object e;
    public final wl8<T> f;
    public boolean g;
    public boolean h;

    /* compiled from: BufferEmitProcessor.kt */
    public static final class a extends Lambda implements gzs<s3q0> {
        final /* synthetic */ am8<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(am8<T> am8Var) {
            super(0);
            this.this$0 = am8Var;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            this.this$0.c();
            return s3q0.a;
        }
    }

    public am8(vq70<T> vq70Var, int i, pcn pcnVar) {
        this.b = vq70Var;
        this.c = i;
        this.d = pcnVar;
        Object obj = new Object();
        this.e = obj;
        this.f = new wl8<>(obj);
    }

    public final void a() {
        synchronized (this.e) {
            if (this.h) {
                return;
            }
            this.h = true;
            s3q0 s3q0Var = s3q0.a;
            pcn pcnVar = this.d;
            if (pcnVar != null) {
                pcnVar.b(new a(this));
            } else {
                c();
            }
        }
    }

    public final void b(T t) {
        int size;
        synchronized (this.e) {
            try {
                if (this.g) {
                    return;
                }
                wl8<T> wl8Var = this.f;
                synchronized (wl8Var.a) {
                    size = wl8Var.b.size();
                }
                if (size >= this.c) {
                    d(this.f, new em8.c<>(t));
                } else {
                    this.f.a(new em8.c(t));
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        em8 b;
        while (true) {
            synchronized (this.e) {
                b = this.f.b();
                if (b == null) {
                    this.h = false;
                    return;
                }
            }
            if (b instanceof em8.c) {
                this.b.onNext(((em8.c) b).a);
            } else if (b instanceof em8.b) {
                this.b.onError(null);
            } else if (b.equals(em8.a.a)) {
                this.b.onComplete();
            }
        }
    }

    public abstract void d(wl8<T> wl8Var, em8.c<T> cVar);

    @Override // xsna.hgn
    public final void dispose() {
        synchronized (this.e) {
            this.g = true;
            wl8<T> wl8Var = this.f;
            synchronized (wl8Var.a) {
                wl8Var.b.clear();
                s3q0 s3q0Var = s3q0.a;
            }
        }
    }
}
