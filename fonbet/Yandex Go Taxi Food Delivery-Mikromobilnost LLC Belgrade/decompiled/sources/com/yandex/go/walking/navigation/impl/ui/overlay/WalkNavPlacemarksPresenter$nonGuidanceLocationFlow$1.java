package com.yandex.go.walking.navigation.impl.ui.overlay;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.location.Location;
import defpackage.iwc;
import defpackage.mo21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lmo21;", "location", "Liwc;", "azimuth", "Lcom/yandex/mapkit/location/Location;", "<anonymous>", "(Lmo21;Liwc;)Lcom/yandex/mapkit/location/Location;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.walking.navigation.impl.ui.overlay.WalkNavPlacemarksPresenter$nonGuidanceLocationFlow$1", f = "WalkNavPlacemarksPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class WalkNavPlacemarksPresenter$nonGuidanceLocationFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ long J$0;
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((iwc) obj2).a;
        WalkNavPlacemarksPresenter$nonGuidanceLocationFlow$1 walkNavPlacemarksPresenter$nonGuidanceLocationFlow$1 = new WalkNavPlacemarksPresenter$nonGuidanceLocationFlow$1(3, (Continuation) obj3);
        walkNavPlacemarksPresenter$nonGuidanceLocationFlow$1.L$0 = (mo21) obj;
        walkNavPlacemarksPresenter$nonGuidanceLocationFlow$1.J$0 = j;
        return walkNavPlacemarksPresenter$nonGuidanceLocationFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        mo21 mo21Var = (mo21) this.L$0;
        long j = this.J$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (mo21Var != null) {
            return new Location(new Point(mo21Var.a, mo21Var.b), new Double(mo21Var.c), null, null, new Double(Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))), new Double(mo21Var.g), null, 0L, 0L);
        }
        return null;
    }
}
