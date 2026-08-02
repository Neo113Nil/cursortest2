package xsna;

/* compiled from: LazyDsl.kt */
/* loaded from: classes17.dex */
public final class idf implements izs<Integer, Object> {
    public final /* synthetic */ adf b;
    public final /* synthetic */ wow c;

    public idf(adf adfVar, wow wowVar) {
        this.b = adfVar;
        this.c = wowVar;
    }

    @Override // xsna.izs
    public final Object invoke(Integer num) {
        int intValue = num.intValue();
        return this.b.invoke(Integer.valueOf(intValue), this.c.b.get(intValue));
    }
}
