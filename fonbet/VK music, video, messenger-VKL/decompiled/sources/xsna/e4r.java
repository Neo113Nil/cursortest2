package xsna;

import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class e4r implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.core.a0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ e4r(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (List) this.c.invoke(obj);
            default:
                return (u2o) this.c.invoke(obj);
        }
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(io.reactivex.rxjava3.core.y yVar) {
        this.c.invoke(yVar);
    }
}
