package com.yandex.go.account.deeplink;

import defpackage.ggb0;
import defpackage.h3y;
import defpackage.hgb0;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.v770;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.am.j;
import ru.yandex.taxi.am.s0;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes.dex */
public final class a extends hgb0 {
    public final h3y b;

    public a(h3y h3yVar) {
        this.b = h3yVar;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final /* bridge */ /* synthetic */ Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        return d((ggb0) obj, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ggb0 ggb0Var, ContinuationImpl continuationImpl) {
        PhonishUpgradeTypedDeeplinkHandler$handleDeeplink$1 phonishUpgradeTypedDeeplinkHandler$handleDeeplink$1;
        int i;
        if (continuationImpl instanceof PhonishUpgradeTypedDeeplinkHandler$handleDeeplink$1) {
            phonishUpgradeTypedDeeplinkHandler$handleDeeplink$1 = (PhonishUpgradeTypedDeeplinkHandler$handleDeeplink$1) continuationImpl;
            int i2 = phonishUpgradeTypedDeeplinkHandler$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                phonishUpgradeTypedDeeplinkHandler$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = phonishUpgradeTypedDeeplinkHandler$handleDeeplink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = phonishUpgradeTypedDeeplinkHandler$handleDeeplink$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Boolean a = ggb0Var.a();
                    ?? booleanValue = a != null ? a.booleanValue() : 0;
                    j jVar = (j) this.b.get();
                    phonishUpgradeTypedDeeplinkHandler$handleDeeplink$1.L$0 = null;
                    phonishUpgradeTypedDeeplinkHandler$handleDeeplink$1.L$1 = null;
                    phonishUpgradeTypedDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    phonishUpgradeTypedDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    phonishUpgradeTypedDeeplinkHandler$handleDeeplink$1.I$0 = booleanValue;
                    phonishUpgradeTypedDeeplinkHandler$handleDeeplink$1.label = 1;
                    if (((s0) jVar).h(booleanValue, phonishUpgradeTypedDeeplinkHandler$handleDeeplink$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    ((Result) obj).getClass();
                }
                return zy11.a;
            }
        }
        phonishUpgradeTypedDeeplinkHandler$handleDeeplink$1 = new PhonishUpgradeTypedDeeplinkHandler$handleDeeplink$1(this, continuationImpl);
        Object obj2 = phonishUpgradeTypedDeeplinkHandler$handleDeeplink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = phonishUpgradeTypedDeeplinkHandler$handleDeeplink$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
