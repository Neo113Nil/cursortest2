package com.yandex.go.location.provider;

import defpackage.iwc;
import defpackage.qwc;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class CompassProviderImpl$azimuthFlow$2$1$2 extends FunctionReferenceImpl implements wls {
    public CompassProviderImpl$azimuthFlow$2$1$2(Object obj) {
        super(2, obj, qwc.class, "areAzimuthsSimilar", "areAzimuthsSimilar-tUQn9yY(JJ)Z", 0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        long j = ((iwc) obj).a;
        long j2 = ((iwc) obj2).a;
        ((qwc) this.receiver).getClass();
        long j3 = j & Long.MIN_VALUE;
        boolean z = false;
        if ((j3 != 0) == ((Long.MIN_VALUE & j2) != 0)) {
            if (((j & 4611686018427387904L) != 0) == ((4611686018427387904L & j2) != 0) && (j3 == 0 || Math.abs(Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - Float.intBitsToFloat((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) < 1.0f)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
