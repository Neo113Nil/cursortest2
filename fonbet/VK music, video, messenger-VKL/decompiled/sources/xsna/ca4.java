package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class ca4 implements io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.l {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ ca4(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return (io.reactivex.rxjava3.core.b0) ((iqa) this.c).invoke(obj);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
        }
        return ((Boolean) ((ba4) this.c).invoke(obj)).booleanValue();
    }
}
