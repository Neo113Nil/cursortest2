package com.yandex.mobile.ads.common;

import android.content.Context;
import android.os.SystemClock;
import defpackage.ae71;
import defpackage.dn61;
import defpackage.kx6;
import defpackage.n291;
import kotlin.Metadata;
import yads.vt1;
import yads.wt1;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yandex/mobile/ads/common/YandexAds;", "", "Landroid/content/Context;", "context", "Lcom/yandex/mobile/ads/common/InitializationListener;", "initializationListener", "Lzy11;", "initialize", "(Landroid/content/Context;Lcom/yandex/mobile/ads/common/InitializationListener;)V", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class YandexAds {
    public static final YandexAds INSTANCE = new YandexAds();

    private YandexAds() {
    }

    public static final void initialize(Context context, InitializationListener initializationListener) {
        ae71 ae71Var = new ae71(initializationListener);
        n291 n291Var = new n291(context);
        dn61 dn61Var = new dn61();
        dn61Var.a.a.post(new kx6(SystemClock.elapsedRealtime(), new vt1(context, n291Var, ae71Var), new wt1(context, n291Var, ae71Var), 6));
    }
}
