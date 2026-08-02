package defpackage;

import com.yandex.go.morphlex.router.b;

/* loaded from: classes12.dex */
public final class lhr extends mhr {
    public final /* synthetic */ int c = 1;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lhr(b bVar) {
        super(bVar.D);
        this.d = bVar;
    }

    @Override // defpackage.mhr
    public final void d(cgl0 cgl0Var) {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                ((mhr) obj).b(cgl0Var);
                break;
            default:
                ((b) obj).r(new qu(9));
                cgl0Var.invoke();
                break;
        }
    }

    @Override // defpackage.mhr
    public final void e(khr khrVar, Object obj, gpa gpaVar) {
        int i = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                ((mhr) obj2).e(khrVar, obj, gpaVar);
                break;
            default:
                ((b) obj2).E(khrVar, obj, gpaVar, hxx.a);
                break;
        }
    }

    public lhr(yvf0 yvf0Var, mhr mhrVar) {
        super(yvf0Var);
        this.d = mhrVar;
    }
}
