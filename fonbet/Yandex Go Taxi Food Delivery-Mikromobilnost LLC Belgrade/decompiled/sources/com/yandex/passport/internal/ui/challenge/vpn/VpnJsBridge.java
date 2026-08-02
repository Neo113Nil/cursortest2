package com.yandex.passport.internal.ui.challenge.vpn;

import android.webkit.JavascriptInterface;
import defpackage.tls;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\tR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/passport/internal/ui/challenge/vpn/VpnJsBridge;", "", "Lkotlin/Function1;", "Lcom/yandex/passport/internal/ui/challenge/vpn/z;", "Lzy11;", "onWish", "<init>", "(Ltls;)V", "onClose", "()V", "onSettings", "onReload", "Ltls;", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VpnJsBridge {
    public static final int $stable = 0;
    private final tls onWish;

    public VpnJsBridge(tls tlsVar) {
        this.onWish = tlsVar;
    }

    @JavascriptInterface
    public final void onClose() {
        this.onWish.invoke(t.a);
    }

    @JavascriptInterface
    public final void onReload() {
        this.onWish.invoke(u.a);
    }

    @JavascriptInterface
    public final void onSettings() {
        this.onWish.invoke(v.a);
    }
}
