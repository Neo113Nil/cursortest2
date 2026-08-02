package sg.bigo.ads.z;

import android.os.SystemClock;
import android.webkit.URLUtil;
import androidx.annotation.NonNull;
import com.ironsource.mediationsdk.logger.IronSourceError;
import sg.bigo.ads.aj.d;
import sg.bigo.ads.api.NativeAd;

/* loaded from: classes9.dex */
public final class g extends sg.bigo.ads.y.c {
    public g(@NonNull sg.bigo.ads.api.core.g gVar) {
        super(gVar);
    }

    @Override // sg.bigo.ads.y.c, sg.bigo.ads.y.b
    public final void a(@NonNull d.a<NativeAd> aVar, int i) {
        if (this.e || this.f) {
            return;
        }
        super.a(aVar, i);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [sg.bigo.ads.api.core.b] */
    @Override // sg.bigo.ads.y.c, sg.bigo.ads.y.b, sg.bigo.ads.d.d, sg.bigo.ads.d.c
    public final void destroyInMainThread() {
        super.destroyInMainThread();
        if (this.q) {
            return;
        }
        this.q = true;
        sg.bigo.ads.da.b.a((sg.bigo.ads.api.core.b) f(), SystemClock.elapsedRealtime() - this.k);
    }

    @Override // sg.bigo.ads.y.c
    public final void a(@NonNull d.a<NativeAd> aVar, @NonNull sg.bigo.ads.api.core.b bVar, int i, boolean z) {
        String a = this.b.a.O().a();
        if (!URLUtil.isNetworkUrl(a)) {
            a = null;
        }
        if (a != null) {
            aVar.a(this);
        } else {
            aVar.a(this, 1005, IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES, "Illegal Land Url");
        }
    }
}
