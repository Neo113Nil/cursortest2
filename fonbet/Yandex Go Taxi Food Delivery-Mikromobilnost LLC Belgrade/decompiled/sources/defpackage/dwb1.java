package defpackage;

import com.google.android.play.core.splitinstall.internal.c;

/* loaded from: classes11.dex */
public final class dwb1 extends cub1 {
    public final /* synthetic */ c b;

    public dwb1(c cVar) {
        this.b = cVar;
    }

    @Override // defpackage.cub1
    public final void a() {
        synchronized (this.b.f) {
            try {
                if (this.b.k.get() > 0 && this.b.k.decrementAndGet() > 0) {
                    this.b.b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                c cVar = this.b;
                if (cVar.m != null) {
                    cVar.b.d("Unbind from service.", new Object[0]);
                    c cVar2 = this.b;
                    cVar2.a.unbindService(cVar2.l);
                    c cVar3 = this.b;
                    cVar3.g = false;
                    cVar3.m = null;
                    cVar3.l = null;
                }
                this.b.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
