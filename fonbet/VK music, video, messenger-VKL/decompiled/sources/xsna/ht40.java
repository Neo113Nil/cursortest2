package xsna;

/* compiled from: LazyDsl.kt */
/* loaded from: classes4.dex */
public final class ht40 implements izs<Integer, Object> {
    public final /* synthetic */ v3l b;
    public final /* synthetic */ wow c;

    public ht40(v3l v3lVar, wow wowVar) {
        this.b = v3lVar;
        this.c = wowVar;
    }

    @Override // xsna.izs
    public final Object invoke(Integer num) {
        int intValue = num.intValue();
        return this.b.invoke(Integer.valueOf(intValue), this.c.b.get(intValue));
    }
}
