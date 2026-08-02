package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: ClipDiscoverCatalogRouter.kt */
@b6l(c = "com.vk.catalog2.common.ui.mvp.clip.discover.ClipDiscoverCatalogRouter$sequence$1", f = "ClipDiscoverCatalogRouter.kt", l = {233}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class vqc extends RestrictedSuspendLambda implements wzs<ali0<? super yg5>, spj<? super s3q0>, Object> {
    final /* synthetic */ ai5 $this_sequence;
    int I$0;
    int I$1;
    int I$2;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vqc(ai5 ai5Var, spj<? super vqc> spjVar) {
        super(2, spjVar);
        this.$this_sequence = ai5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        vqc vqcVar = new vqc(this.$this_sequence, spjVar);
        vqcVar.L$0 = obj;
        return vqcVar;
    }

    @Override // xsna.wzs
    public final Object invoke(ali0<? super yg5> ali0Var, spj<? super s3q0> spjVar) {
        return ((vqc) create(ali0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        if (0 != 0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0033  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0054 -> B:5:0x0057). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int itemCount;
        int i;
        ali0 ali0Var = (ali0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.a.a(obj);
            itemCount = this.$this_sequence.getItemCount();
            i = 0;
            if (i >= itemCount) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$1;
            itemCount = this.I$0;
            kotlin.a.a(obj);
            i++;
            if (i >= itemCount) {
                return s3q0.a;
            }
            y9t0 Eh = this.$this_sequence.Eh(i);
            if (Eh != null) {
                yg5 yg5Var = Eh.a;
                if (yg5Var != null) {
                    this.L$0 = ali0Var;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.I$0 = itemCount;
                    this.I$1 = i;
                    this.I$2 = 0;
                    this.label = 1;
                    if (ali0Var.a(yg5Var, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            i++;
            if (i >= itemCount) {
            }
        }
    }
}
