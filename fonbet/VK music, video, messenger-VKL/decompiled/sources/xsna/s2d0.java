package xsna;

import java.util.ArrayList;
import xsna.o2d0;

/* compiled from: FeedFooter.kt */
/* loaded from: classes18.dex */
public final class s2d0<T> implements lsr {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ t2d0 c;

    public s2d0(ArrayList arrayList, t2d0 t2d0Var) {
        this.b = arrayList;
        this.c = t2d0Var;
    }

    @Override // xsna.lsr
    public final Object emit(Object obj, spj spjVar) {
        vax vaxVar = (vax) obj;
        boolean z = vaxVar instanceof o2d0.b;
        ArrayList arrayList = this.b;
        if (z) {
            arrayList.add(vaxVar);
        } else if (vaxVar instanceof o2d0.c) {
            arrayList.remove(((o2d0.c) vaxVar).a);
        } else if (vaxVar instanceof o2d0.a) {
            arrayList.remove(((o2d0.a) vaxVar).a);
        }
        boolean isEmpty = arrayList.isEmpty();
        t2d0 t2d0Var = this.c;
        myc0.h(t2d0Var.W1(), null, null, new r2d0(t2d0Var, !isEmpty ? t2d0Var.q : 1.0f, null), 3);
        return s3q0.a;
    }
}
