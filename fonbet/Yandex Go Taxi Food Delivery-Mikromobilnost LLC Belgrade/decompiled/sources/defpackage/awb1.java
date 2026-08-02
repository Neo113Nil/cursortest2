package defpackage;

import com.google.android.play.core.splitinstall.internal.c;

/* loaded from: classes11.dex */
public final class awb1 extends cub1 {
    public final /* synthetic */ atx0 b;
    public final /* synthetic */ cub1 c;
    public final /* synthetic */ c w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awb1(c cVar, atx0 atx0Var, atx0 atx0Var2, cub1 cub1Var) {
        super(atx0Var);
        this.w = cVar;
        this.b = atx0Var2;
        this.c = cub1Var;
    }

    @Override // defpackage.cub1
    public final void a() {
        synchronized (this.w.f) {
            try {
                c cVar = this.w;
                atx0 atx0Var = this.b;
                cVar.e.add(atx0Var);
                atx0Var.a.b(new gr81(12, cVar, atx0Var));
                if (this.w.k.getAndIncrement() > 0) {
                    this.w.b.d("Already connected to the service.", new Object[0]);
                }
                c.b(this.w, this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
