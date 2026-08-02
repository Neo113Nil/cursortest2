package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.external.miniapp.net.app.WebAdConfig;
import com.vk.superapp.bridges.advertisement.AdRequestEvent;
import xsna.gwf;

/* compiled from: ClosingBannerAdsDelegateImpl.kt */
/* loaded from: classes6.dex */
public final class iwf implements gwf {
    public final del0 a;
    public final mel0 b;
    public final izs<Bundle, s3q0> c;
    public final gzs<Boolean> d;
    public final gwf.a e;
    public final bpn0 f = new bpn0(new na(this, 29));
    public final bpn0 g = new bpn0(new ra0(this, 29));

    /* JADX WARN: Multi-variable type inference failed */
    public iwf(del0 del0Var, mel0 mel0Var, izs<? super Bundle, s3q0> izsVar, gzs<Boolean> gzsVar, gwf.a aVar) {
        this.a = del0Var;
        this.b = mel0Var;
        this.c = izsVar;
        this.d = gzsVar;
        this.e = aVar;
    }

    @Override // xsna.gwf
    public final void a(Context context, Long l, WebAdConfig webAdConfig) {
        bpn0 bpn0Var = this.f;
        if (context == null) {
            ((yu0) bpn0Var.getValue()).b(new AdRequestEvent(AdRequestEvent.AdFormat.BANNER, null, AdRequestEvent.EventType.REQUEST, AdRequestEvent.RequestType.CLOSE, AdRequestEvent.RequestSubtype.SHOW, 101, "Missing container", null, null, null, null));
            return;
        }
        if (l == null) {
            ((yu0) bpn0Var.getValue()).b(new AdRequestEvent(AdRequestEvent.AdFormat.BANNER, null, AdRequestEvent.EventType.REQUEST, AdRequestEvent.RequestType.CLOSE, AdRequestEvent.RequestSubtype.SHOW, 105, "Received app id is empty", null, null, null, null));
        } else if (webAdConfig != null) {
            qro0.c(new ox(1, webAdConfig, this, l, context));
        } else {
            ((yu0) bpn0Var.getValue()).b(new AdRequestEvent(AdRequestEvent.AdFormat.BANNER, null, AdRequestEvent.EventType.REQUEST, AdRequestEvent.RequestType.CLOSE, AdRequestEvent.RequestSubtype.SHOW, 1302, gq.d(Integer.valueOf((int) l.longValue()), "Failed to get ad config id for app with id: "), null, null, null, null));
        }
    }

    @Override // xsna.gwf
    public final void destroy() {
        ((eel0) this.g.getValue()).destroy();
    }
}
