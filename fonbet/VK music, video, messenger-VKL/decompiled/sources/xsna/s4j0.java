package xsna;

import android.graphics.Bitmap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ShaderCpuGenerator.kt */
@b6l(c = "com.vk.music.bottomsheets.track.redesigned.presentation.components.shaders.ShaderCpuGeneratorKt$ShaderCpuGenerator$1$1$1$1", f = "ShaderCpuGenerator.kt", l = {48}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class s4j0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wh50<Bitmap> $bitmap$delegate;
    final /* synthetic */ long $color;
    final /* synthetic */ tm6 $shaderGenerator;
    final /* synthetic */ va8 $this_BoxWithConstraints;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4j0(tm6 tm6Var, va8 va8Var, long j, wh50<Bitmap> wh50Var, spj<? super s4j0> spjVar) {
        super(2, spjVar);
        this.$shaderGenerator = tm6Var;
        this.$this_BoxWithConstraints = va8Var;
        this.$color = j;
        this.$bitmap$delegate = wh50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        s4j0 s4j0Var = new s4j0(this.$shaderGenerator, this.$this_BoxWithConstraints, this.$color, this.$bitmap$delegate, spjVar);
        s4j0Var.L$0 = obj;
        return s4j0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((s4j0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            tm6 tm6Var = this.$shaderGenerator;
            int i2 = o6j.i(this.$this_BoxWithConstraints.f());
            int h = o6j.h(this.$this_BoxWithConstraints.f());
            int H = f870.H(this.$color);
            this.L$0 = yvjVar;
            this.label = 1;
            obj = tm6Var.a(i2, h, H, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        wh50<Bitmap> wh50Var = this.$bitmap$delegate;
        Bitmap bitmap = (Bitmap) obj;
        if (zvj.f(yvjVar)) {
            wh50Var.setValue(bitmap);
        }
        return s3q0.a;
    }
}
