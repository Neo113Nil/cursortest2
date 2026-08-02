package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ComposeScrollCaptureCallback.android.kt */
@b6l(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$scrollTracker$1", f = "ComposeScrollCaptureCallback.android.kt", l = {TsExtractor.TS_STREAM_TYPE_DVBSUBS}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class nqi extends SuspendLambda implements wzs<Float, spj<? super Float>, Object> {
    /* synthetic */ float F$0;
    boolean Z$0;
    int label;
    final /* synthetic */ kqi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nqi(kqi kqiVar, spj<? super nqi> spjVar) {
        super(2, spjVar);
        this.this$0 = kqiVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        nqi nqiVar = new nqi(this.this$0, spjVar);
        nqiVar.F$0 = ((Number) obj).floatValue();
        return nqiVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Float f, spj<? super Float> spjVar) {
        return ((nqi) create(Float.valueOf(f.floatValue()), spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            float f = this.F$0;
            wzs wzsVar = (wzs) zfi0.a(this.this$0.a.d, wfi0.e);
            if (wzsVar == null) {
                throw pm0.f("Required value was null.");
            }
            ov70 ov70Var = new ov70((Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
            this.Z$0 = false;
            this.label = 1;
            obj = wzsVar.invoke(ov70Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            z = false;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = this.Z$0;
            kotlin.a.a(obj);
        }
        long j = ((ov70) obj).a;
        return new Float(z ? -Float.intBitsToFloat((int) (j & 4294967295L)) : Float.intBitsToFloat((int) (j & 4294967295L)));
    }
}
