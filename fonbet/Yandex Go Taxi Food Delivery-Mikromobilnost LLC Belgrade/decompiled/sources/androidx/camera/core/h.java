package androidx.camera.core;

import android.view.Surface;
import defpackage.d6z;
import defpackage.e9e;
import defpackage.gl7;
import defpackage.iqs;
import defpackage.v84;

/* loaded from: classes10.dex */
public final class h implements iqs {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.iqs
    public final void onFailure(Throwable th) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                if (!(th instanceof SurfaceRequest$RequestCancelledException)) {
                    d6z.y(null, ((androidx.concurrent.futures.b) obj2).b(null));
                    break;
                } else {
                    d6z.y(null, ((gl7) obj).cancel(false));
                    break;
                }
            default:
                d6z.y("Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th, th instanceof SurfaceRequest$RequestCancelledException);
                ((e9e) obj2).accept(new v84(1, (Surface) obj));
                break;
        }
    }

    @Override // defpackage.iqs
    public final void onSuccess(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                d6z.y(null, ((androidx.concurrent.futures.b) obj2).b(null));
                break;
            default:
                ((e9e) obj2).accept(new v84(0, (Surface) this.c));
                break;
        }
    }
}
