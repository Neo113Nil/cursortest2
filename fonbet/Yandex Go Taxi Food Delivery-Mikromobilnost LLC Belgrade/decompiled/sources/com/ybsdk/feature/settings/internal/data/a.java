package com.ybsdk.feature.settings.internal.data;

import com.ybsdk.core.utils.dto.SecondAuthorizationResponse;
import com.ybsdk.core.utils.dto.e;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.settings.internal.network.SettingsApi;
import defpackage.ny61;
import defpackage.o8r0;
import defpackage.sd8;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final SettingsApi a;

    public a(SettingsApi settingsApi) {
        this.a = settingsApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z, o8r0 o8r0Var, String str, String str2, ContinuationImpl continuationImpl) {
        CardSettingsRepository$setSetting$1 cardSettingsRepository$setSetting$1;
        int i;
        Object c;
        if (continuationImpl instanceof CardSettingsRepository$setSetting$1) {
            cardSettingsRepository$setSetting$1 = (CardSettingsRepository$setSetting$1) continuationImpl;
            int i2 = cardSettingsRepository$setSetting$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardSettingsRepository$setSetting$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cardSettingsRepository$setSetting$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardSettingsRepository$setSetting$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    CardSettingsRepository$setSetting$2 cardSettingsRepository$setSetting$2 = new CardSettingsRepository$setSetting$2(this, o8r0Var, z, str, str2, null);
                    cardSettingsRepository$setSetting$1.label = 1;
                    c = c.c(cardSettingsRepository$setSetting$2, cardSettingsRepository$setSetting$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                Throwable a = Result.a(c);
                return a != null ? e.a((SecondAuthorizationResponse) c, new sd8(23)) : new Result.Failure(a);
            }
        }
        cardSettingsRepository$setSetting$1 = new CardSettingsRepository$setSetting$1(this, continuationImpl);
        Object obj2 = cardSettingsRepository$setSetting$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardSettingsRepository$setSetting$1.label;
        if (i != 0) {
        }
        Throwable a2 = Result.a(c);
        if (a2 != null) {
        }
    }
}
