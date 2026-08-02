package com.yandex.go.navigator.map_interactions.long_taps;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.PlainAddress;
import defpackage.avj0;
import defpackage.dpa1;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.vpr;
import defpackage.ynz;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ zzs b;
    public final /* synthetic */ ynz c;

    public b(vpr vprVar, zzs zzsVar, ynz ynzVar) {
        this.a = vprVar;
        this.b = zzsVar;
        this.c = ynzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        LongTapPresenter$getPointAddress$1$invokeSuspend$lambda$0$$inlined$map$1$2$1 longTapPresenter$getPointAddress$1$invokeSuspend$lambda$0$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof LongTapPresenter$getPointAddress$1$invokeSuspend$lambda$0$$inlined$map$1$2$1) {
            longTapPresenter$getPointAddress$1$invokeSuspend$lambda$0$$inlined$map$1$2$1 = (LongTapPresenter$getPointAddress$1$invokeSuspend$lambda$0$$inlined$map$1$2$1) continuation;
            int i2 = longTapPresenter$getPointAddress$1$invokeSuspend$lambda$0$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                longTapPresenter$getPointAddress$1$invokeSuspend$lambda$0$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = longTapPresenter$getPointAddress$1$invokeSuspend$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = longTapPresenter$getPointAddress$1$invokeSuspend$lambda$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Address address = ((pv0) obj).a;
                    if (address.D1().length() == 0 || jl40.l(address.D1(), Extension.DOT_CHAR)) {
                        address = dpa1.c(PlainAddress.Companion, this.b, ((avj0) this.c.D).h(kyh0.navigator_map_interaction_point_on_the_map_title));
                    }
                    longTapPresenter$getPointAddress$1$invokeSuspend$lambda$0$$inlined$map$1$2$1.L$0 = null;
                    longTapPresenter$getPointAddress$1$invokeSuspend$lambda$0$$inlined$map$1$2$1.L$1 = null;
                    longTapPresenter$getPointAddress$1$invokeSuspend$lambda$0$$inlined$map$1$2$1.L$2 = null;
                    longTapPresenter$getPointAddress$1$invokeSuspend$lambda$0$$inlined$map$1$2$1.L$3 = null;
                    longTapPresenter$getPointAddress$1$invokeSuspend$lambda$0$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(address, longTapPresenter$getPointAddress$1$invokeSuspend$lambda$0$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        longTapPresenter$getPointAddress$1$invokeSuspend$lambda$0$$inlined$map$1$2$1 = new LongTapPresenter$getPointAddress$1$invokeSuspend$lambda$0$$inlined$map$1$2$1(this, continuation);
        Object obj22 = longTapPresenter$getPointAddress$1$invokeSuspend$lambda$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = longTapPresenter$getPointAddress$1$invokeSuspend$lambda$0$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
