package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class sbm implements izs {
    public final /* synthetic */ dcm b;
    public final /* synthetic */ long c;

    public /* synthetic */ sbm(dcm dcmVar, long j) {
        this.b = dcmVar;
        this.c = j;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        io.reactivex.rxjava3.disposables.c put = this.b.i.put(Long.valueOf(this.c), (io.reactivex.rxjava3.disposables.c) obj);
        if (put != null) {
            put.dispose();
        }
        return s3q0.a;
    }
}
