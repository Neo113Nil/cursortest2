package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class bej implements io.reactivex.rxjava3.functions.m {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ bej(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.m
    public final boolean test(Object obj) {
        switch (this.b) {
            case 0:
                return ((Boolean) ((aej) this.c).invoke(obj)).booleanValue();
            case 1:
                return ((Boolean) ((aej) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((ezc0) this.c).invoke(obj)).booleanValue();
        }
    }
}
