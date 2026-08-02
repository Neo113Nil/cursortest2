package com.yandex.go.scooters.offers.v2.surge.info;

import defpackage.c3p0;
import defpackage.k7x0;
import defpackage.ny61;
import defpackage.v2p0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes13.dex */
public final class e {
    public final k7x0 a;
    public final ru.yandex.taxi.widget.utils.e b;

    public e(k7x0 k7x0Var, ru.yandex.taxi.widget.utils.e eVar) {
        this.a = k7x0Var;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(v2p0 v2p0Var, ContinuationImpl continuationImpl) {
        ScootersSurgeInfoContentItemMapper$mapSeparatorItem$1 scootersSurgeInfoContentItemMapper$mapSeparatorItem$1;
        int i;
        if (continuationImpl instanceof ScootersSurgeInfoContentItemMapper$mapSeparatorItem$1) {
            scootersSurgeInfoContentItemMapper$mapSeparatorItem$1 = (ScootersSurgeInfoContentItemMapper$mapSeparatorItem$1) continuationImpl;
            int i2 = scootersSurgeInfoContentItemMapper$mapSeparatorItem$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSurgeInfoContentItemMapper$mapSeparatorItem$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersSurgeInfoContentItemMapper$mapSeparatorItem$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSurgeInfoContentItemMapper$mapSeparatorItem$1.label;
                CharSequence charSequence = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText = v2p0Var.a;
                    if (formattedText != null) {
                        scootersSurgeInfoContentItemMapper$mapSeparatorItem$1.L$0 = null;
                        scootersSurgeInfoContentItemMapper$mapSeparatorItem$1.L$1 = null;
                        scootersSurgeInfoContentItemMapper$mapSeparatorItem$1.label = 1;
                        obj = this.b.t(formattedText, scootersSurgeInfoContentItemMapper$mapSeparatorItem$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return new c3p0(charSequence);
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                charSequence = (CharSequence) obj;
                return new c3p0(charSequence);
            }
        }
        scootersSurgeInfoContentItemMapper$mapSeparatorItem$1 = new ScootersSurgeInfoContentItemMapper$mapSeparatorItem$1(this, continuationImpl);
        Object obj2 = scootersSurgeInfoContentItemMapper$mapSeparatorItem$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSurgeInfoContentItemMapper$mapSeparatorItem$1.label;
        CharSequence charSequence2 = null;
        if (i != 0) {
        }
        charSequence2 = (CharSequence) obj2;
        return new c3p0(charSequence2);
    }
}
