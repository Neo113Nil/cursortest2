package androidx.compose.foundation.text.selection;

import defpackage.tje;
import defpackage.tse;
import defpackage.vpr;
import defpackage.wu60;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class f implements vpr {
    public final /* synthetic */ androidx.compose.animation.core.a a;
    public final /* synthetic */ tse b;

    public f(tse tseVar, androidx.compose.animation.core.a aVar) {
        this.a = aVar;
        this.b = tseVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        long j = ((wu60) obj).a;
        androidx.compose.animation.core.a aVar = this.a;
        long j2 = ((wu60) aVar.e()).a & 9223372034707292159L;
        zy11 zy11Var = zy11.a;
        if (j2 == 9205357640488583168L || (9223372034707292159L & j) == 9205357640488583168L || Float.intBitsToFloat((int) (((wu60) aVar.e()).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) == Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) {
            Object f = aVar.f(new wu60(j), continuation);
            return f == CoroutineSingletons.COROUTINE_SUSPENDED ? f : zy11Var;
        }
        tje.N(this.b, null, null, new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1(aVar, j, null), 3);
        return zy11Var;
    }
}
