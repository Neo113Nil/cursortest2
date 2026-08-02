package xsna;

/* compiled from: CategoriesScreenContent.kt */
/* loaded from: classes18.dex */
public final class yja implements izs<Integer, Integer> {
    public final /* synthetic */ int b;

    public yja(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Integer invoke(Integer num) {
        return Integer.valueOf(((-num.intValue()) * this.b) / 2);
    }
}
