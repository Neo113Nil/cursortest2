package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class rdj implements io.reactivex.rxjava3.functions.m {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ rdj(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.m
    public final boolean test(Object obj) {
        switch (this.b) {
            case 0:
                return ((Boolean) ((yqd) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((npe) this.c).invoke(obj)).booleanValue();
        }
    }
}
