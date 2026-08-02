package xsna;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: PosterFeedPlugin.kt */
/* loaded from: classes4.dex */
public final class fac0<T> implements m2r<T> {
    public final yac0 a;
    public final qy3 b;
    public final py3<T> c;

    public fac0() {
        ArrayList arrayList = new ArrayList();
        this.a = new yac0(arrayList);
        qy3 qy3Var = new qy3(arrayList);
        this.b = qy3Var;
        this.c = new py3<>(arrayList, qy3Var);
    }

    @Override // xsna.m2r
    public final void a(Context context) {
        qy3 qy3Var = this.b;
        if (qy3Var.d > 0) {
            qy3Var.a(context);
        }
    }

    @Override // xsna.m2r
    public final void b(eg00<T> eg00Var) {
        eg00Var.b.add(this.c);
    }

    @Override // xsna.m2r
    public final void c(kb80 kb80Var) {
        kb80Var.a(this.a);
    }

    @Override // xsna.m2r
    public final void pause() {
        qy3 qy3Var = this.b;
        qy3Var.e = false;
        io.reactivex.rxjava3.disposables.g gVar = qy3Var.c;
        if (gVar != null && !gVar.h()) {
            gVar.dispose();
        }
        qy3Var.c = null;
    }
}
