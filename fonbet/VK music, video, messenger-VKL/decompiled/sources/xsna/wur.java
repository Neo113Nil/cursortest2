package xsna;

import android.graphics.Bitmap;
import com.vk.log.L;

/* compiled from: FlyPresenter.java */
/* loaded from: classes3.dex */
public final class wur extends io.reactivex.rxjava3.observers.a<Bitmap> {
    public final /* synthetic */ xur c;

    public wur(xur xurVar) {
        this.c = xurVar;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onComplete() {
        this.c.d.remove(this);
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
        L.i(th);
        this.c.d.remove(this);
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onNext(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        uur uurVar = this.c.c;
        if (uurVar != null) {
            uurVar.D4(bitmap);
        }
    }
}
