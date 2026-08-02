package com.yandex.go.location.provider;

import defpackage.iwc;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "magneticAzimuth", "declination", "Liwc;", "<anonymous>", "(FF)Liwc;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.location.provider.CompassProviderImpl$azimuthFlow$2$1$1", f = "CompassProviderImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class CompassProviderImpl$azimuthFlow$2$1$1 extends SuspendLambda implements zls {
    /* synthetic */ float F$0;
    /* synthetic */ float F$1;
    int label;

    public CompassProviderImpl$azimuthFlow$2$1$1() {
        super(3, null);
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float floatValue = ((Number) obj).floatValue();
        float floatValue2 = ((Number) obj2).floatValue();
        CompassProviderImpl$azimuthFlow$2$1$1 compassProviderImpl$azimuthFlow$2$1$1 = new CompassProviderImpl$azimuthFlow$2$1$1(3, (Continuation) obj3);
        compassProviderImpl$azimuthFlow$2$1$1.F$0 = floatValue;
        compassProviderImpl$azimuthFlow$2$1$1.F$1 = floatValue2;
        return compassProviderImpl$azimuthFlow$2$1$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        float f = this.F$0;
        float f2 = this.F$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        boolean z = Math.abs(f2) <= Float.MAX_VALUE;
        if (!z) {
            f2 = 0.0f;
        }
        float f3 = (f + f2) % 360.0f;
        if (f3 != 0.0f && Math.signum(f3) != Math.signum(360.0f)) {
            f3 += 360.0f;
        }
        return new iwc((z ? 4611686018427387904L : 0L) | (Float.floatToRawIntBits(f3) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | Long.MIN_VALUE);
    }
}
