package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ImageCropper.kt */
@b6l(c = "com.vk.profile.user.impl.ui.edit.cover.crop.cropper.ImageCropperKt$ImageCropper$8$1$1$1", f = "ImageCropper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class giw extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ gzs<Boolean> $crop;
    final /* synthetic */ ajk $cropperState;
    final /* synthetic */ izs<zhf0, s3q0> $onCrop;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public giw(gzs<Boolean> gzsVar, ajk ajkVar, izs<? super zhf0, s3q0> izsVar, spj<? super giw> spjVar) {
        super(2, spjVar);
        this.$crop = gzsVar;
        this.$cropperState = ajkVar;
        this.$onCrop = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new giw(this.$crop, this.$cropperState, this.$onCrop, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((giw) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        if (this.$crop.invoke().booleanValue()) {
            ajk ajkVar = this.$cropperState;
            long j = ajkVar.a;
            zhf0 zhf0Var = ajkVar.b;
            float d = ajkVar.d();
            float intBitsToFloat = Float.intBitsToFloat((int) (egi.j(j) >> 32)) - this.$cropperState.b();
            float f = (zhf0Var.c - zhf0Var.a) / d;
            int i = (int) (j >> 32);
            float intBitsToFloat2 = Float.intBitsToFloat(i);
            if (f > intBitsToFloat2) {
                f = intBitsToFloat2;
            }
            float intBitsToFloat3 = Float.intBitsToFloat((int) (egi.j(j) & 4294967295L)) - this.$cropperState.c();
            float f2 = (zhf0Var.d - zhf0Var.b) / d;
            int i2 = (int) (j & 4294967295L);
            float intBitsToFloat4 = Float.intBitsToFloat(i2);
            if (f2 > intBitsToFloat4) {
                f2 = intBitsToFloat4;
            }
            float f3 = 2;
            float f4 = f / f3;
            float intBitsToFloat5 = Float.intBitsToFloat((int) (egi.j(j) >> 32));
            if (f4 > intBitsToFloat5) {
                f4 = intBitsToFloat5;
            }
            float f5 = intBitsToFloat - f4;
            float f6 = f2 / f3;
            float intBitsToFloat6 = Float.intBitsToFloat((int) (egi.j(j) & 4294967295L));
            if (f6 > intBitsToFloat6) {
                f6 = intBitsToFloat6;
            }
            izs<zhf0, s3q0> izsVar = this.$onCrop;
            float f7 = swe0.f(f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.intBitsToFloat(i) - f) / Float.intBitsToFloat(i);
            float f8 = swe0.f(intBitsToFloat3 - f6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.intBitsToFloat(i2) - f2) / Float.intBitsToFloat(i2);
            long floatToRawIntBits = Float.floatToRawIntBits(f7);
            float intBitsToFloat7 = f / Float.intBitsToFloat(i);
            float intBitsToFloat8 = f2 / Float.intBitsToFloat(i2);
            izsVar.invoke(p490.e((Float.floatToRawIntBits(f8) & 4294967295L) | (floatToRawIntBits << 32), (Float.floatToRawIntBits(intBitsToFloat7) << 32) | (Float.floatToRawIntBits(intBitsToFloat8) & 4294967295L)));
        }
        return s3q0.a;
    }
}
