package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: DashManifestParserWithFilter.kt */
@b6l(c = "one.video.exo.datasource.dash.parser.DashManifestParserWithFilter$periodsSequence$1", f = "DashManifestParserWithFilter.kt", l = {95}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class atk extends RestrictedSuspendLambda implements wzs<ali0<? super jx90>, spj<? super s3q0>, Object> {
    final /* synthetic */ rsk $this_periodsSequence;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atk(rsk rskVar, spj<? super atk> spjVar) {
        super(2, spjVar);
        this.$this_periodsSequence = rskVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        atk atkVar = new atk(this.$this_periodsSequence, spjVar);
        atkVar.L$0 = obj;
        return atkVar;
    }

    @Override // xsna.wzs
    public final Object invoke(ali0<? super jx90> ali0Var, spj<? super s3q0> spjVar) {
        return ((atk) create(ali0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x003f -> B:5:0x0042). Please report as a decompilation issue!!! */
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
            size = this.$this_periodsSequence.m.size();
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
                jx90 b = this.$this_periodsSequence.b(i);
                this.L$0 = ali0Var;
                this.I$0 = i;
                this.I$1 = size;
                this.label = 1;
                if (ali0Var.a(b, this) == coroutineSingletons) {
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
