package xsna;

import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: TextFieldSelectionManager.kt */
@b6l(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$2", f = "TextFieldSelectionManager.kt", l = {241, 243}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class zgo0 extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ gho0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zgo0(gho0 gho0Var, spj<? super zgo0> spjVar) {
        super(1, spjVar);
        this.this$0 = gho0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new zgo0(this.this$0, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((zgo0) create(spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r8.b(r4, r5, r7) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0027, code lost:
    
        if (r8.u(r7) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            gho0 gho0Var = this.this$0;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                this.this$0.C = true;
                return s3q0.a;
            }
            kotlin.a.a(obj);
        }
        Pair a = gho0.a(this.this$0);
        if (a != null) {
            gho0 gho0Var2 = this.this$0;
            String str = (String) a.d();
            long j = ((qko0) a.g()).a;
            aua0 aua0Var = gho0Var2.j;
            if (aua0Var != null) {
                this.label = 2;
            }
        }
        this.this$0.C = true;
        return s3q0.a;
    }
}
