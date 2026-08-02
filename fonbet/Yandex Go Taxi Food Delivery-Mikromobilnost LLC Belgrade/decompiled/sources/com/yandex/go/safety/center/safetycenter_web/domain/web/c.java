package com.yandex.go.safety.center.safetycenter_web.domain.web;

import android.net.Uri;
import defpackage.fn21;
import defpackage.ny61;
import java.util.Locale;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes13.dex */
public final class c {
    public final ru.yandex.taxi.am.token.a a;
    public final fn21 b;

    public c(fn21 fn21Var, ru.yandex.taxi.am.token.a aVar) {
        this.a = aVar;
        this.b = fn21Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, SafetyCenterWebJsApi safetyCenterWebJsApi, String str3, ContinuationImpl continuationImpl) {
        SafetyCenterWebConfigFactory$getWebConfig$1 safetyCenterWebConfigFactory$getWebConfig$1;
        int i;
        Object d;
        Object obj;
        String str4;
        String str5;
        String str6;
        SafetyCenterWebJsApi safetyCenterWebJsApi2;
        String str7;
        String str8;
        if (continuationImpl instanceof SafetyCenterWebConfigFactory$getWebConfig$1) {
            safetyCenterWebConfigFactory$getWebConfig$1 = (SafetyCenterWebConfigFactory$getWebConfig$1) continuationImpl;
            int i2 = safetyCenterWebConfigFactory$getWebConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                safetyCenterWebConfigFactory$getWebConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = safetyCenterWebConfigFactory$getWebConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = safetyCenterWebConfigFactory$getWebConfig$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    String Hg = ((h) this.b).Hg();
                    if (Hg != null) {
                        safetyCenterWebConfigFactory$getWebConfig$1.L$0 = str;
                        safetyCenterWebConfigFactory$getWebConfig$1.L$1 = str2;
                        safetyCenterWebConfigFactory$getWebConfig$1.L$2 = safetyCenterWebJsApi;
                        safetyCenterWebConfigFactory$getWebConfig$1.L$3 = str3;
                        safetyCenterWebConfigFactory$getWebConfig$1.L$4 = Hg;
                        safetyCenterWebConfigFactory$getWebConfig$1.label = 1;
                        d = this.a.d(false, safetyCenterWebConfigFactory$getWebConfig$1);
                        if (d == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        obj = d;
                        str4 = Hg;
                        str5 = str;
                        str6 = str2;
                        safetyCenterWebJsApi2 = safetyCenterWebJsApi;
                        str7 = str3;
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str4 = (String) safetyCenterWebConfigFactory$getWebConfig$1.L$4;
                str7 = (String) safetyCenterWebConfigFactory$getWebConfig$1.L$3;
                safetyCenterWebJsApi2 = (SafetyCenterWebJsApi) safetyCenterWebConfigFactory$getWebConfig$1.L$2;
                str6 = (String) safetyCenterWebConfigFactory$getWebConfig$1.L$1;
                str5 = (String) safetyCenterWebConfigFactory$getWebConfig$1.L$0;
                kotlin.b.b(obj2);
                obj = ((Result) obj2).getValue();
                if (obj instanceof Result.Failure) {
                    obj = null;
                }
                str8 = (String) obj;
                if (str8 != null) {
                    Uri.Builder buildUpon = Uri.parse(str5).buildUpon();
                    if (str6 != null && str6.length() != 0) {
                        buildUpon.appendQueryParameter("order_id", str6);
                    }
                    if (str7 != null && str7.length() != 0) {
                        buildUpon.appendQueryParameter("nearest_zone", str7);
                    }
                    String uri = buildUpon.build().toString();
                    CoreWebViewConfig.Companion.getClass();
                    CoreWebViewConfig.a aVar = new CoreWebViewConfig.a();
                    aVar.b("X-YaTaxi-UserId".toLowerCase(Locale.ROOT), str4);
                    aVar.k = safetyCenterWebJsApi2;
                    aVar.c = str8;
                    aVar.b = uri;
                    return new UiWebViewConfig(aVar.a(), null, false, false, false, false, null, false, false, null, false, false, UiWebViewConfig.SignalForLoaded.External.INSTANCE, null, null, 0, 0, false, false, null, false, false, 4190198, null);
                }
                return null;
            }
        }
        safetyCenterWebConfigFactory$getWebConfig$1 = new SafetyCenterWebConfigFactory$getWebConfig$1(this, continuationImpl);
        Object obj22 = safetyCenterWebConfigFactory$getWebConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = safetyCenterWebConfigFactory$getWebConfig$1.label;
        if (i != 0) {
        }
        if (obj instanceof Result.Failure) {
        }
        str8 = (String) obj;
        if (str8 != null) {
        }
        return null;
    }
}
