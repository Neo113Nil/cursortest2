package xsna;

import android.content.Context;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* compiled from: AudioConfigInfoSyncJob.kt */
/* loaded from: classes3.dex */
public final class em4 extends tsl {
    public final bpn0 c;
    public final bpn0 d;
    public io.reactivex.rxjava3.disposables.c e;
    public io.reactivex.rxjava3.disposables.c f;

    public em4(fyx fyxVar) {
        super(fyxVar);
        this.c = new bpn0(new lg(3));
        this.d = new bpn0(new mg(1));
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        this.e = emptyDisposable;
        this.f = emptyDisposable;
    }

    @Override // xsna.tsl
    public final void a(Context context) {
        this.e = new io.reactivex.rxjava3.internal.operators.completable.h(((mw4) this.c.getValue()).b().q(io.reactivex.rxjava3.schedulers.a.b()), new cm4(this, 0)).subscribe();
        this.f = new io.reactivex.rxjava3.internal.operators.completable.h(((bu4) this.d.getValue()).L().q(io.reactivex.rxjava3.schedulers.a.b()), new dm4(this, 0)).subscribe();
    }
}
