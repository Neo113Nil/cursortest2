package com.ybsdk.di.modules.features.kyc;

import android.net.Uri;
import com.ybsdk.common.repositiories.auth.f;
import com.ybsdk.rconfig.YbCommonUrlsImpl;
import com.ybsdk.rconfig.b;
import defpackage.np41;
import defpackage.ny61;
import defpackage.ppp0;
import defpackage.sbo;
import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.Util.ClearCryptoProPrefs;

/* loaded from: classes3.dex */
public final class a {
    public final b a;
    public final np41 b;
    public final f c;
    public final ppp0 d;

    public a(b bVar, np41 np41Var, f fVar, ppp0 ppp0Var) {
        this.a = bVar;
        this.b = np41Var;
        this.c = fVar;
        this.d = ppp0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a4, code lost:
    
        if (r2 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        EsiaUrlProviderImpl$createOpenEsiaUrl$1 esiaUrlProviderImpl$createOpenEsiaUrl$1;
        int i;
        String uri;
        Object a;
        Long l;
        Serializable d;
        Object obj;
        String str;
        if (continuationImpl instanceof EsiaUrlProviderImpl$createOpenEsiaUrl$1) {
            esiaUrlProviderImpl$createOpenEsiaUrl$1 = (EsiaUrlProviderImpl$createOpenEsiaUrl$1) continuationImpl;
            int i2 = esiaUrlProviderImpl$createOpenEsiaUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                esiaUrlProviderImpl$createOpenEsiaUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = esiaUrlProviderImpl$createOpenEsiaUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = esiaUrlProviderImpl$createOpenEsiaUrl$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    String a2 = ((com.ybsdk.feature.webview.internal.a) this.b).b.a("/finish-esia");
                    b bVar = this.a;
                    com.ybsdk.rconfig.a aVar = bVar.i;
                    YbCommonUrlsImpl ybCommonUrlsImpl = (YbCommonUrlsImpl) bVar.d(aVar.e).getData();
                    YbCommonUrlsImpl ybCommonUrlsImpl2 = (YbCommonUrlsImpl) aVar.e.c.getData();
                    String ybFrontendUrl = ybCommonUrlsImpl.getYbFrontendUrl();
                    if (ybFrontendUrl.length() == 0) {
                        ybFrontendUrl = ybCommonUrlsImpl2.getYbFrontendUrl();
                    }
                    uri = Uri.parse(ybFrontendUrl).buildUpon().path("webview-sdk/simplified-identification/esia/start").appendQueryParameter("retpath", a2).build().toString();
                    esiaUrlProviderImpl$createOpenEsiaUrl$1.L$0 = uri;
                    esiaUrlProviderImpl$createOpenEsiaUrl$1.label = 1;
                    a = this.c.a(esiaUrlProviderImpl$createOpenEsiaUrl$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = (String) esiaUrlProviderImpl$createOpenEsiaUrl$1.L$0;
                        kotlin.b.b(obj2);
                        obj = ((Result) obj2).getValue();
                        return obj instanceof Result.Failure ? new sbo((String) obj, str) : obj;
                    }
                    String str2 = (String) esiaUrlProviderImpl$createOpenEsiaUrl$1.L$0;
                    kotlin.b.b(obj2);
                    a = obj2;
                    uri = str2;
                }
                l = (Long) a;
                if (l != null) {
                    return new Result.Failure(new Exception("getAuthorizationUrl error: no uid"));
                }
                long longValue = l.longValue();
                esiaUrlProviderImpl$createOpenEsiaUrl$1.L$0 = uri;
                esiaUrlProviderImpl$createOpenEsiaUrl$1.label = 2;
                d = ((com.ybsdk.feature.passport.impl.a) this.d).d(longValue, uri, ClearCryptoProPrefs.COUNTRY, esiaUrlProviderImpl$createOpenEsiaUrl$1);
                if (d != coroutineSingletons) {
                    String str3 = uri;
                    obj = d;
                    str = str3;
                    if (obj instanceof Result.Failure) {
                    }
                }
                return coroutineSingletons;
            }
        }
        esiaUrlProviderImpl$createOpenEsiaUrl$1 = new EsiaUrlProviderImpl$createOpenEsiaUrl$1(this, continuationImpl);
        Object obj22 = esiaUrlProviderImpl$createOpenEsiaUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = esiaUrlProviderImpl$createOpenEsiaUrl$1.label;
        if (i != 0) {
        }
        l = (Long) a;
        if (l != null) {
        }
    }
}
