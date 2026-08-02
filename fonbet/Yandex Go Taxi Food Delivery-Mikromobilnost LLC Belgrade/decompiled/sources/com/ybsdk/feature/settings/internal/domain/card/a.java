package com.ybsdk.feature.settings.internal.domain.card;

import defpackage.ny61;
import defpackage.o8r0;
import defpackage.uc5;
import defpackage.wls;
import kotlin.Pair;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final com.ybsdk.feature.settings.internal.data.a a;

    public a(com.ybsdk.feature.settings.internal.data.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z, o8r0 o8r0Var, String str, uc5 uc5Var, ContinuationImpl continuationImpl) {
        CardSettingsInteractorImpl$setSetting$1 cardSettingsInteractorImpl$setSetting$1;
        int i;
        if (continuationImpl instanceof CardSettingsInteractorImpl$setSetting$1) {
            cardSettingsInteractorImpl$setSetting$1 = (CardSettingsInteractorImpl$setSetting$1) continuationImpl;
            int i2 = cardSettingsInteractorImpl$setSetting$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardSettingsInteractorImpl$setSetting$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cardSettingsInteractorImpl$setSetting$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardSettingsInteractorImpl$setSetting$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                Object pair = new Pair(o8r0Var.a, Boolean.valueOf(z));
                wls cardSettingsInteractorImpl$setSetting$2 = new CardSettingsInteractorImpl$setSetting$2(this, z, o8r0Var, str, null);
                cardSettingsInteractorImpl$setSetting$1.label = 1;
                Object O = uc5Var.O(cardSettingsInteractorImpl$setSetting$2, pair, cardSettingsInteractorImpl$setSetting$1);
                return O == obj2 ? obj2 : O;
            }
        }
        cardSettingsInteractorImpl$setSetting$1 = new CardSettingsInteractorImpl$setSetting$1(this, continuationImpl);
        Object obj3 = cardSettingsInteractorImpl$setSetting$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardSettingsInteractorImpl$setSetting$1.label;
        if (i == 0) {
        }
    }
}
