package xsna;

/* compiled from: SearchCommunitiesOnMapGeoDataSource.kt */
/* loaded from: classes5.dex */
public final class ooh0 implements izs<Throwable, s3q0> {
    public final /* synthetic */ io.reactivex.rxjava3.disposables.c b;

    public ooh0(io.reactivex.rxjava3.disposables.c cVar) {
        this.b = cVar;
    }

    @Override // xsna.izs
    public final s3q0 invoke(Throwable th) {
        this.b.dispose();
        return s3q0.a;
    }
}
