package defpackage;

import com.google.android.play.core.review.internal.c;

/* loaded from: classes11.dex */
public final class j3b1 extends zfa1 {
    public final /* synthetic */ c b;

    public j3b1(c cVar) {
        this.b = cVar;
    }

    @Override // defpackage.zfa1
    public final void a() {
        synchronized (this.b.f) {
            try {
                if (this.b.k.get() > 0 && this.b.k.decrementAndGet() > 0) {
                    this.b.b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                c cVar = this.b;
                if (cVar.m != null) {
                    cVar.b.a("Unbind from service.", new Object[0]);
                    c cVar2 = this.b;
                    cVar2.a.unbindService(cVar2.l);
                    c cVar3 = this.b;
                    cVar3.g = false;
                    cVar3.m = null;
                    cVar3.l = null;
                }
                this.b.c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
