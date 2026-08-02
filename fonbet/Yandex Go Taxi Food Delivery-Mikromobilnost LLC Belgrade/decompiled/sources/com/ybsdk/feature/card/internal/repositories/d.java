package com.ybsdk.feature.card.internal.repositories;

import com.ybsdk.feature.card.internal.network.CardApi;
import defpackage.ny61;
import defpackage.wm8;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class d {
    public final wm8 a;
    public final CardApi b;

    public d(wm8 wm8Var, CardApi cardApi) {
        this.a = wm8Var;
        this.b = cardApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        CardSettingsTermRepository$getSettingsTerm$1 cardSettingsTermRepository$getSettingsTerm$1;
        int i;
        if (continuationImpl instanceof CardSettingsTermRepository$getSettingsTerm$1) {
            cardSettingsTermRepository$getSettingsTerm$1 = (CardSettingsTermRepository$getSettingsTerm$1) continuationImpl;
            int i2 = cardSettingsTermRepository$getSettingsTerm$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardSettingsTermRepository$getSettingsTerm$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cardSettingsTermRepository$getSettingsTerm$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardSettingsTermRepository$getSettingsTerm$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                CardSettingsTermRepository$getSettingsTerm$2 cardSettingsTermRepository$getSettingsTerm$2 = new CardSettingsTermRepository$getSettingsTerm$2(this, str, null);
                cardSettingsTermRepository$getSettingsTerm$1.label = 1;
                Object c = com.ybsdk.core.utils.ext.c.c(cardSettingsTermRepository$getSettingsTerm$2, cardSettingsTermRepository$getSettingsTerm$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        cardSettingsTermRepository$getSettingsTerm$1 = new CardSettingsTermRepository$getSettingsTerm$1(this, continuationImpl);
        Object obj2 = cardSettingsTermRepository$getSettingsTerm$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardSettingsTermRepository$getSettingsTerm$1.label;
        if (i == 0) {
        }
    }
}
