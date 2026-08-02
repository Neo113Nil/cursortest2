package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class wzl0 implements io.reactivex.rxjava3.functions.e {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wzl0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.e
    public final void cancel() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((f8f0) obj).cancel();
                break;
            default:
                int i2 = ify.a;
                ify.g((qbs0) obj);
                break;
        }
    }
}
