package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class hna0 implements io.reactivex.rxjava3.functions.l {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ hna0(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (kna0) this.c.invoke(obj);
            default:
                return (nak) this.c.invoke(obj);
        }
    }
}
