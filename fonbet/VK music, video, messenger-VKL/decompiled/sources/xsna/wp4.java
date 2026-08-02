package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: AudioKeysExtractor.kt */
@b6l(c = "one.video.exo.offline.AudioKeysExtractor$adaptationSetsSequence$1", f = "AudioKeysExtractor.kt", l = {54}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class wp4 extends RestrictedSuspendLambda implements wzs<ali0<? super cj0>, spj<? super s3q0>, Object> {
    final /* synthetic */ jx90 $this_adaptationSetsSequence;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp4(jx90 jx90Var, spj<? super wp4> spjVar) {
        super(2, spjVar);
        this.$this_adaptationSetsSequence = jx90Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        wp4 wp4Var = new wp4(this.$this_adaptationSetsSequence, spjVar);
        wp4Var.L$0 = obj;
        return wp4Var;
    }

    @Override // xsna.wzs
    public final Object invoke(ali0<? super cj0> ali0Var, spj<? super s3q0> spjVar) {
        return ((wp4) create(ali0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0041 -> B:5:0x0044). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int size;
        ali0 ali0Var = (ali0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.a.a(obj);
            i = 0;
            size = this.$this_adaptationSetsSequence.c.size();
            if (i < size) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            size = this.I$1;
            i = this.I$0;
            kotlin.a.a(obj);
            i++;
            if (i < size) {
                cj0 cj0Var = this.$this_adaptationSetsSequence.c.get(i);
                this.L$0 = ali0Var;
                this.I$0 = i;
                this.I$1 = size;
                this.label = 1;
                if (ali0Var.a(cj0Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                i++;
                if (i < size) {
                    return s3q0.a;
                }
            }
        }
    }
}
