package com.ybsdk.feature.webview.internal.utils;

import com.ybsdk.rconfig.configs.YbWebCookieCheckExistingConfig;
import defpackage.hz51;
import defpackage.if8;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.um41;
import defpackage.uyj;
import defpackage.ynh;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class b {
    public final um41 a;
    public final ynh.a b = new ynh().a;

    public b(um41 um41Var) {
        this.a = um41Var;
    }

    public final Object a(String str, ContinuationImpl continuationImpl) {
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new WebViewCookieHelper$getCookiesNamesList$2(this, str, null), continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        WebViewCookieHelper$hasPassportCookiesInCookieStorage$1 webViewCookieHelper$hasPassportCookiesInCookieStorage$1;
        int i;
        if (continuationImpl instanceof WebViewCookieHelper$hasPassportCookiesInCookieStorage$1) {
            webViewCookieHelper$hasPassportCookiesInCookieStorage$1 = (WebViewCookieHelper$hasPassportCookiesInCookieStorage$1) continuationImpl;
            int i2 = webViewCookieHelper$hasPassportCookiesInCookieStorage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webViewCookieHelper$hasPassportCookiesInCookieStorage$1.label = i2 - Integer.MIN_VALUE;
                Object obj = webViewCookieHelper$hasPassportCookiesInCookieStorage$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webViewCookieHelper$hasPassportCookiesInCookieStorage$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    webViewCookieHelper$hasPassportCookiesInCookieStorage$1.label = 1;
                    obj = a(str, webViewCookieHelper$hasPassportCookiesInCookieStorage$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return Boolean.valueOf(((List) obj).containsAll(((YbWebCookieCheckExistingConfig) ((if8) this.a).a.d(hz51.a).getData()).getPassportCookies()));
            }
        }
        webViewCookieHelper$hasPassportCookiesInCookieStorage$1 = new WebViewCookieHelper$hasPassportCookiesInCookieStorage$1(this, continuationImpl);
        Object obj3 = webViewCookieHelper$hasPassportCookiesInCookieStorage$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webViewCookieHelper$hasPassportCookiesInCookieStorage$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((List) obj3).containsAll(((YbWebCookieCheckExistingConfig) ((if8) this.a).a.d(hz51.a).getData()).getPassportCookies()));
    }
}
