package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import android.os.Handler;
import defpackage.bvf0;
import defpackage.du71;
import defpackage.fp71;
import defpackage.gn61;
import defpackage.mj31;
import defpackage.n291;
import defpackage.nl61;
import defpackage.nn81;
import defpackage.nx71;
import defpackage.tje;
import defpackage.uq81;
import defpackage.ys81;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlinx.coroutines.a;
import yads.j5;
import yads.kc1;
import yads.u00;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/mobile/ads/nativeads/NativeAdLoader;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "adUnitId", "readyResponse", "Lcom/yandex/mobile/ads/nativeads/NativeAdLoadListener;", "listener", "Lzy11;", "loadAd", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/mobile/ads/nativeads/NativeAdLoadListener;)V", "Lcom/yandex/mobile/ads/nativeads/NativeAdOptions;", "options", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/mobile/ads/nativeads/NativeAdOptions;Lcom/yandex/mobile/ads/nativeads/NativeAdLoadListener;)V", "cancelLoading", "()V", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NativeAdLoader {
    private final uq81 a;
    private final k b = new k();
    private final nx71 c = new nx71();

    public NativeAdLoader(Context context) {
        this.a = new uq81(context, new n291(context));
    }

    public final void cancelLoading() {
        uq81 uq81Var = this.a;
        fp71 fp71Var = uq81Var.d;
        Iterator it = ((CopyOnWriteArrayList) fp71Var.c).iterator();
        while (it.hasNext()) {
            du71 du71Var = ((nn81) it.next()).b;
            a.g(du71Var.B.c.getCoroutineContext(), null);
            mj31 mj31Var = du71Var.H;
            Object obj = mj31Var.c;
            ys81.a((String) mj31Var.w);
            ((Handler) du71Var.Q.c).removeCallbacksAndMessages(null);
            du71Var.T.a(kc1.b, du71Var);
            du71Var.e(j5.b);
            du71Var.U.a();
        }
        ((CopyOnWriteArrayList) fp71Var.c).clear();
        bvf0.j(uq81Var.c, null);
    }

    public final void loadAd(String adUnitId, String readyResponse, NativeAdOptions options, NativeAdLoadListener listener) {
        this.b.getClass();
        nl61 a = k.a(options, adUnitId, readyResponse);
        gn61 gn61Var = new gn61(listener);
        uq81 uq81Var = this.a;
        tje.N(uq81Var.c, null, null, new u00(uq81Var, a, gn61Var, null), 3);
    }

    public final void loadAd(String adUnitId, String readyResponse, NativeAdLoadListener listener) {
        loadAd(adUnitId, readyResponse, new NativeAdOptions(false, 1, null), listener);
    }
}
