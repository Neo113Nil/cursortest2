package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.mt6;

/* compiled from: BasicTextContextMenuProvider.kt */
@b6l(c = "androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider$showTextContextMenu$2", f = "BasicTextContextMenuProvider.kt", l = {130}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class nt6 extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    final /* synthetic */ mt6.a $localSession;
    int label;
    final /* synthetic */ mt6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt6(mt6 mt6Var, mt6.a aVar, spj<? super nt6> spjVar) {
        super(1, spjVar);
        this.this$0 = mt6Var;
        this.$localSession = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new nt6(this.this$0, this.$localSession, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((nt6) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                mt6 mt6Var = this.this$0;
                ((zak0) mt6Var.c).setValue(this.$localSession);
                mt6.a aVar = this.$localSession;
                this.label = 1;
                Object a = aVar.b.a(this);
                if (a != coroutineSingletons) {
                    a = s3q0.a;
                }
                if (a == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            ((zak0) this.this$0.c).setValue(null);
            return s3q0.a;
        } catch (Throwable th) {
            ((zak0) this.this$0.c).setValue(null);
            throw th;
        }
    }
}
