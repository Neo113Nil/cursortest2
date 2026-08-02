package com.yandex.go.scooters.zones.info.ui;

import defpackage.k7x0;
import defpackage.l9p0;
import defpackage.ny61;
import defpackage.x9p0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes13.dex */
public final class c {
    public final k7x0 a;
    public final ru.yandex.taxi.widget.utils.e b;

    public c(k7x0 k7x0Var, ru.yandex.taxi.widget.utils.e eVar) {
        this.a = k7x0Var;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(x9p0 x9p0Var, ContinuationImpl continuationImpl) {
        ScootersZonesInfoContentItemMapper$mapButtonItem$1 scootersZonesInfoContentItemMapper$mapButtonItem$1;
        int i;
        if (continuationImpl instanceof ScootersZonesInfoContentItemMapper$mapButtonItem$1) {
            scootersZonesInfoContentItemMapper$mapButtonItem$1 = (ScootersZonesInfoContentItemMapper$mapButtonItem$1) continuationImpl;
            int i2 = scootersZonesInfoContentItemMapper$mapButtonItem$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersZonesInfoContentItemMapper$mapButtonItem$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersZonesInfoContentItemMapper$mapButtonItem$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersZonesInfoContentItemMapper$mapButtonItem$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText = x9p0Var.g;
                    scootersZonesInfoContentItemMapper$mapButtonItem$1.L$0 = null;
                    scootersZonesInfoContentItemMapper$mapButtonItem$1.label = 1;
                    obj = this.b.t(formattedText, scootersZonesInfoContentItemMapper$mapButtonItem$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return new l9p0((CharSequence) obj);
            }
        }
        scootersZonesInfoContentItemMapper$mapButtonItem$1 = new ScootersZonesInfoContentItemMapper$mapButtonItem$1(this, continuationImpl);
        Object obj2 = scootersZonesInfoContentItemMapper$mapButtonItem$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersZonesInfoContentItemMapper$mapButtonItem$1.label;
        if (i != 0) {
        }
        return new l9p0((CharSequence) obj2);
    }
}
