package xsna;

/* compiled from: LazyDsl.kt */
/* loaded from: classes17.dex */
public final class d9d0 implements izs<Integer, Object> {
    public final /* synthetic */ x9d b;
    public final /* synthetic */ wow c;

    public d9d0(x9d x9dVar, wow wowVar) {
        this.b = x9dVar;
        this.c = wowVar;
    }

    @Override // xsna.izs
    public final Object invoke(Integer num) {
        int intValue = num.intValue();
        return this.b.invoke(Integer.valueOf(intValue), this.c.b.get(intValue));
    }
}
