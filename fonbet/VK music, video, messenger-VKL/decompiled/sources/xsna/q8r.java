package xsna;

import android.content.Context;
import com.vk.log.L;

/* compiled from: SbpAppsListUpdaterImpl.kt */
/* loaded from: classes.dex */
public final class q8r extends tsl implements w8i {
    public final fyx c;
    public final bpn0 d;
    public final bpn0 e;

    public q8r(fyx fyxVar) {
        super(fyxVar);
        this.c = fyxVar;
        this.d = new bpn0(new np(this, 4));
        this.e = new bpn0(new a67(this, 3));
    }

    @Override // xsna.tsl
    public final void a(Context context) {
        L.e("NSPK_LIST_DOWNLOADER", "Start update NSPK bank list");
        if (!((b25) this.e.getValue()).b()) {
            L.e("NSPK_LIST_DOWNLOADER", "NSPK request: not logged in");
            return;
        }
        if (((rm70) this.d.getValue()).c()) {
            L.e("NSPK_LIST_DOWNLOADER", "NSPK bank list cached value is valid, skipping download");
            return;
        }
        L.e("NSPK_LIST_DOWNLOADER", "File with NSPK bank is not valid, downloading");
        int i = 0;
        io.reactivex.rxjava3.internal.operators.maybe.b0 g = new io.reactivex.rxjava3.internal.operators.observable.h2(rsg0.a0(yfb.x(m200.a().n()))).g(new n8r(new m8r(this, i), i));
        final o8r o8rVar = new o8r(i);
        io.reactivex.rxjava3.internal.operators.maybe.b0 f = g.f(new io.reactivex.rxjava3.functions.f() { // from class: xsna.p8r
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                o8r.this.invoke(obj);
            }
        });
        l7x l7xVar = itg0.a;
        int i2 = kwg0.a;
        f.subscribe(new iwg0(), new hwg0());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q8r) && epx.f(this.c, ((q8r) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "FileDownloadDelayedJob(args=" + this.c + ')';
    }
}
