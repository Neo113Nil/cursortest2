package xsna;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import xsna.lsw;

/* compiled from: InactiveTask.kt */
/* loaded from: classes4.dex */
public final class ksw implements io.reactivex.rxjava3.disposables.c {
    public final zqh b;
    public final lsw.a c;
    public final ArrayList d;
    public WeakReference<lsw> e;
    public int f;
    public long g;
    public io.reactivex.rxjava3.disposables.c h;
    public long i;
    public final o93 j;

    public ksw(m50 m50Var, zqh zqhVar, lsw.a aVar) {
        this.b = zqhVar;
        this.c = aVar;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f = aVar.c;
        this.g = aVar.b;
        this.i = System.currentTimeMillis();
        this.j = new o93(this, 19);
        arrayList.add(new WeakReference(m50Var));
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final void dispose() {
        if (this.h != null) {
            this.i = System.currentTimeMillis();
        }
        io.reactivex.rxjava3.disposables.c cVar = this.h;
        if (cVar != null) {
            cVar.dispose();
        }
        this.h = null;
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final boolean h() {
        io.reactivex.rxjava3.disposables.c cVar = this.h;
        if (cVar != null) {
            return cVar.h();
        }
        return true;
    }
}
