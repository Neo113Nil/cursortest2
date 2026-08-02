package xsna;

import com.vk.newsfeed.posting.impl.domain.model.CropFitContainerMode;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CropEditorScreen.kt */
@b6l(c = "com.vk.newsfeed.posting.crop_editor.presentation.base.view.CropEditorScreenKt$CropEditorScreen$2$1", f = "CropEditorScreen.kt", l = {Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ngk extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ ygk $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ngk(ygk ygkVar, spj<? super ngk> spjVar) {
        super(2, spjVar);
        this.$state = ygkVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ngk(this.$state, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ngk) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        float f;
        float f2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ygk ygkVar = this.$state;
            zhf0 zhf0Var = (zhf0) ((zak0) ygkVar.p).getValue();
            if (zhf0Var != null) {
                long d = zhf0Var.d();
                long j = ygkVar.y;
                float d2 = w65.d(ygkVar.b);
                long d3 = ((zhf0) ((zak0) ygkVar.q).getValue()).d();
                int i2 = (int) (j >> 32);
                float intBitsToFloat = Float.intBitsToFloat((int) (d3 >> 32)) - Float.intBitsToFloat(i2);
                int i3 = (int) (j & 4294967295L);
                float intBitsToFloat2 = Float.intBitsToFloat((int) (d3 & 4294967295L)) - Float.intBitsToFloat(i3);
                float i4 = jcr.i(Float.intBitsToFloat((int) (d >> 32)) - Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (d & 4294967295L)) - Float.intBitsToFloat(i3));
                if (i4 > d2) {
                    f2 = jcr.i(intBitsToFloat, i4);
                    f = intBitsToFloat;
                } else {
                    f = intBitsToFloat2 * i4;
                    f2 = intBitsToFloat2;
                }
                ((zak0) ygkVar.t).setValue(Float.valueOf(i4 < d2 ? jcr.i(f, intBitsToFloat) : jcr.i(f2, intBitsToFloat2)));
                ((zak0) ygkVar.u).setValue(Float.valueOf((ygkVar.c() + 1.0f) / 2.0f));
            }
            this.$state.b();
            ygk ygkVar2 = this.$state;
            this.label = 1;
            if (ygkVar2.f(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        ygk ygkVar3 = this.$state;
        if (ygkVar3.a == CropFitContainerMode.FIT && ygkVar3.c == null) {
            ygkVar3.h(ygkVar3.c());
            ygkVar3.g(0L);
        }
        return s3q0.a;
    }
}
