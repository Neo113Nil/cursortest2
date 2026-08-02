package defpackage;

import com.google.android.play.core.integrity.a;
import com.google.android.play.integrity.internal.e;

/* loaded from: classes11.dex */
public final class jo81 extends ue81 {
    public final /* synthetic */ atx0 b;
    public final /* synthetic */ a c;
    public final /* synthetic */ e w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo81(e eVar, atx0 atx0Var, atx0 atx0Var2, a aVar) {
        super(atx0Var);
        this.w = eVar;
        this.b = atx0Var2;
        this.c = aVar;
    }

    @Override // defpackage.ue81
    public final void b() {
        synchronized (this.w.f) {
            try {
                e eVar = this.w;
                atx0 atx0Var = this.b;
                eVar.e.add(atx0Var);
                atx0Var.a.b(new cf71((Object) eVar, (Object) atx0Var, false, 26));
                if (this.w.l.getAndIncrement() > 0) {
                    this.w.b.a("Already connected to the service.", new Object[0]);
                }
                e.b(this.w, this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
