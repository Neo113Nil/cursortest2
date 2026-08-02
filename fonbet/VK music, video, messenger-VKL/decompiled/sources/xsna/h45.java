package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class h45 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m {
    public final /* synthetic */ izs b;

    public /* synthetic */ h45(izs izsVar) {
        this.b = izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return (io.reactivex.rxjava3.core.t) ((g45) this.b).invoke(obj);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((lak0) this.b).invoke(obj)).booleanValue();
    }
}
