package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class qk90 implements Runnable {
    public final /* synthetic */ int b;

    public /* synthetic */ qk90(int i) {
        this.b = i;
        switch (i) {
            case 1:
                break;
            default:
                io.reactivex.rxjava3.subjects.e eVar = sk90.a;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                io.reactivex.rxjava3.subjects.e eVar = sk90.a;
                sk90.a();
                break;
            default:
                hhx0.b();
                break;
        }
    }
}
