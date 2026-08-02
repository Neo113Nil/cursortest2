package xsna;

import android.location.Location;

/* compiled from: LiveSwipePresenter.java */
/* loaded from: classes3.dex */
public final class omz extends io.reactivex.rxjava3.observers.a<Location> {
    public final /* synthetic */ pmz c;

    public omz(pmz pmzVar) {
        this.c = pmzVar;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onComplete() {
        this.c.n = null;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
        this.c.n = null;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onNext(Object obj) {
        Location location = (Location) obj;
        double latitude = location.getLatitude();
        pmz pmzVar = this.c;
        pmzVar.E = latitude;
        pmzVar.F = location.getLongitude();
    }
}
