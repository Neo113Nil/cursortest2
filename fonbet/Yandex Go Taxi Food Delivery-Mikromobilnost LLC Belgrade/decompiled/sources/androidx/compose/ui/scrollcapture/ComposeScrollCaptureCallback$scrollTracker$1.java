package androidx.compose.ui.scrollcapture;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.wu60;
import defpackage.x4e;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "delta"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$scrollTracker$1", f = "ComposeScrollCaptureCallback.android.kt", l = {HProv.ALG_SID_KECCAK_256}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
public final class ComposeScrollCaptureCallback$scrollTracker$1 extends SuspendLambda implements wls {
    /* synthetic */ float F$0;
    boolean Z$0;
    int label;
    final /* synthetic */ ComposeScrollCaptureCallback this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback$scrollTracker$1(ComposeScrollCaptureCallback composeScrollCaptureCallback, Continuation continuation) {
        super(2, continuation);
        this.this$0 = composeScrollCaptureCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ComposeScrollCaptureCallback$scrollTracker$1 composeScrollCaptureCallback$scrollTracker$1 = new ComposeScrollCaptureCallback$scrollTracker$1(this.this$0, continuation);
        composeScrollCaptureCallback$scrollTracker$1.F$0 = ((Number) obj).floatValue();
        return composeScrollCaptureCallback$scrollTracker$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ComposeScrollCaptureCallback$scrollTracker$1) create(Float.valueOf(((Number) obj).floatValue()), (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        androidx.compose.ui.semantics.c cVar;
        androidx.compose.ui.semantics.c cVar2;
        boolean z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            float f = this.F$0;
            cVar = this.this$0.node;
            wls wlsVar = (wls) androidx.compose.ui.semantics.b.a(cVar.d, androidx.compose.ui.semantics.a.e);
            if (wlsVar == null) {
                throw x4e.v("Required value was null.");
            }
            cVar2 = this.this$0.node;
            wu60 wu60Var = new wu60((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
            this.Z$0 = false;
            this.label = 1;
            obj = wlsVar.invoke(wu60Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            z = false;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = this.Z$0;
            kotlin.b.b(obj);
        }
        long j = ((wu60) obj).a;
        return new Float(z ? -Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) : Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
    }
}
