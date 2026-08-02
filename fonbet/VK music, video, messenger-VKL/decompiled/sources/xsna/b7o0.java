package xsna;

import com.vk.network.eventhub.api.ConnectionState;
import kotlin.LazyThreadSafetyMode;
import xsna.a500;

/* compiled from: TaskSocketLiveImplEventHub.kt */
/* loaded from: classes2.dex */
public final class b7o0 implements w8i {
    public final a500.a b;
    public final boolean c;
    public final io.reactivex.rxjava3.disposables.b d = new io.reactivex.rxjava3.disposables.b();
    public final Object e;
    public final Object f;
    public final Object g;
    public oya h;

    public b7o0(a500.a aVar, boolean z) {
        this.b = aVar;
        this.c = z;
        dac0 dac0Var = new dac0(this, 19);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.e = msy.a(lazyThreadSafetyMode, dac0Var);
        this.f = msy.a(lazyThreadSafetyMode, new hri0(this, 7));
        this.g = msy.a(lazyThreadSafetyMode, new mll0(this, 6));
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    public final synchronized void a() {
        try {
            if (this.h == null) {
                return;
            }
            if (this.c) {
                ((wzp) this.g.getValue()).a();
                this.d.dispose();
            } else {
                c().d();
                this.d.dispose();
                c().g();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    public final void b(w2w w2wVar, x3i x3iVar) {
        synchronized (this) {
            try {
                if (!this.c) {
                    c().c(new w550(0, this, b7o0.class, "cancel", "cancel()V", 0, 1));
                }
                oya oyaVar = new oya(w2wVar, c(), x3iVar, this.b);
                this.d.b(oyaVar);
                if (this.c) {
                    ((wzp) this.g.getValue()).b(oyaVar.d);
                    qzp c = c();
                    jz70 jz70Var = new jz70(oyaVar, 27);
                    if (c.b() == ConnectionState.CONNECTED) {
                        jz70Var.invoke();
                    } else {
                        c.h(new psx0(c, jz70Var));
                    }
                } else {
                    qzp c2 = c();
                    com.vk.movika.sdk.base.ui.z zVar = new com.vk.movika.sdk.base.ui.z(15, this, oyaVar);
                    if (c2.b() == ConnectionState.CONNECTED) {
                        zVar.invoke();
                    } else {
                        c2.h(new psx0(c2, zVar));
                    }
                }
                this.h = oyaVar;
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        c().i(new yni0((byte) 1), new d6a(0, this, b7o0.class, "cancel", "cancel()V", 0, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final qzp c() {
        return (qzp) this.f.getValue();
    }
}
