package androidx.compose.animation;

import defpackage.jw01;
import defpackage.pj2;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljw01;", "it", "Lpj2;", "invoke-__ExYCQ", "(J)Lpj2;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
/* loaded from: classes.dex */
final class EnterExitTransitionKt$TransformOriginVectorConverter$1 extends Lambda implements tls {
    public static final EnterExitTransitionKt$TransformOriginVectorConverter$1 w = new EnterExitTransitionKt$TransformOriginVectorConverter$1(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        long j = ((jw01) obj).a;
        return new pj2(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
    }
}
