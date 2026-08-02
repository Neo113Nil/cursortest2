package xsna;

import java.util.concurrent.Future;
import xsna.i360;

/* compiled from: HttpUrlConnectionNetworkFetcher.java */
/* loaded from: classes12.dex */
public final class wkv extends uk6 {
    public final /* synthetic */ Future a;
    public final /* synthetic */ i360.a b;

    public wkv(Future future, i360.a aVar) {
        this.a = future;
        this.b = aVar;
    }

    @Override // xsna.vhd0
    public final void c() {
        if (this.a.cancel(false)) {
            this.b.a();
        }
    }
}
