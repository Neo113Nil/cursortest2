package androidx.camera.core;

import defpackage.d6z;
import defpackage.euy;
import defpackage.iqs;
import defpackage.ni91;
import java.util.concurrent.CancellationException;

/* loaded from: classes10.dex */
public final class i implements iqs {
    public final /* synthetic */ euy a;
    public final /* synthetic */ androidx.concurrent.futures.b b;
    public final /* synthetic */ String c;

    public i(euy euyVar, androidx.concurrent.futures.b bVar, String str) {
        this.a = euyVar;
        this.b = bVar;
        this.c = str;
    }

    @Override // defpackage.iqs
    public final void onFailure(Throwable th) {
        boolean z = th instanceof CancellationException;
        androidx.concurrent.futures.b bVar = this.b;
        if (z) {
            d6z.y(null, bVar.d(new SurfaceRequest$RequestCancelledException(this.c.concat(" cancelled."), th)));
        } else {
            bVar.b(null);
        }
    }

    @Override // defpackage.iqs
    public final void onSuccess(Object obj) {
        ni91.h(this.a, this.b);
    }
}
