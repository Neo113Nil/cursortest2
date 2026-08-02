package xsna;

import java.util.ArrayList;
import kotlin.Pair;

/* compiled from: MediaEntriesSelection.kt */
/* loaded from: classes4.dex */
public final class vq10 {
    public final io.reactivex.rxjava3.subjects.f<Pair<wci0, vq10>> a;
    public final ArrayList b;
    public final io.reactivex.rxjava3.internal.operators.observable.j1 c;

    public vq10(int i) {
        io.reactivex.rxjava3.subjects.f<Pair<wci0, vq10>> fVar = new io.reactivex.rxjava3.subjects.f<>();
        ArrayList arrayList = new ArrayList();
        this.a = fVar;
        this.b = arrayList;
        this.c = ktr.c(fVar).U(new e40(new p2u(6), 19));
    }

    public final void a(wci0 wci0Var) {
        wq10 wq10Var = wci0Var.a;
        boolean z = wci0Var.b;
        ArrayList arrayList = this.b;
        if (z) {
            arrayList.add(wq10Var);
        } else {
            arrayList.remove(wq10Var);
        }
        this.a.onNext(new Pair<>(wci0Var, this));
    }
}
