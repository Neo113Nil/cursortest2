package xsna;

import kotlin.Pair;
import xsna.h8z0;
import xsna.hjz0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class ggz0 implements h8z0.b, io.reactivex.rxjava3.functions.c {
    public final /* synthetic */ Object b;

    public /* synthetic */ ggz0(Object obj) {
        this.b = obj;
    }

    @Override // xsna.h8z0.b
    public void a() {
        igz0 igz0Var = (igz0) this.b;
        hjz0.a aVar = igz0Var.a;
        String str = igz0Var.o.F;
        yil0.d(aVar);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (Pair) ((wzs) this.b).invoke(obj, obj2);
    }
}
