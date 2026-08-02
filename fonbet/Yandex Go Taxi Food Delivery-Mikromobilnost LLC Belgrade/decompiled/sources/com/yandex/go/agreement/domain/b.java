package com.yandex.go.agreement.domain;

import defpackage.mq61;
import defpackage.ny61;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes12.dex */
public final class b {
    public final h a;
    public final ru.yandex.taxi.am.token.a b;

    public b(h hVar, ru.yandex.taxi.am.token.a aVar) {
        this.a = hVar;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        AgreementWebConfigFactory$createConfig$1 agreementWebConfigFactory$createConfig$1;
        int i;
        String str2;
        Object d;
        String str3;
        if (continuationImpl instanceof AgreementWebConfigFactory$createConfig$1) {
            agreementWebConfigFactory$createConfig$1 = (AgreementWebConfigFactory$createConfig$1) continuationImpl;
            int i2 = agreementWebConfigFactory$createConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                agreementWebConfigFactory$createConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj = agreementWebConfigFactory$createConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = agreementWebConfigFactory$createConfig$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    str2 = str;
                    agreementWebConfigFactory$createConfig$1.L$0 = str2;
                    agreementWebConfigFactory$createConfig$1.label = 1;
                    d = this.b.d(false, agreementWebConfigFactory$createConfig$1);
                    if (d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str4 = (String) agreementWebConfigFactory$createConfig$1.L$0;
                    kotlin.b.b(obj);
                    d = ((Result) obj).getValue();
                    str2 = str4;
                }
                if (d instanceof Result.Failure) {
                    d = null;
                }
                str3 = (String) d;
                if (str3 != null) {
                    return null;
                }
                String c = mq61.c(str2, "user_id=" + this.a.Hg());
                CoreWebViewConfig.a aVar = new CoreWebViewConfig.a();
                aVar.b = c;
                aVar.c = str3;
                UiWebViewConfig uiWebViewConfig = new UiWebViewConfig(aVar.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
                uiWebViewConfig.setHasTitleFromWeb(true);
                uiWebViewConfig.setShouldShowCloseButton(true);
                return uiWebViewConfig;
            }
        }
        agreementWebConfigFactory$createConfig$1 = new AgreementWebConfigFactory$createConfig$1(this, continuationImpl);
        Object obj2 = agreementWebConfigFactory$createConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = agreementWebConfigFactory$createConfig$1.label;
        if (i != 0) {
        }
        if (d instanceof Result.Failure) {
        }
        str3 = (String) d;
        if (str3 != null) {
        }
    }
}
