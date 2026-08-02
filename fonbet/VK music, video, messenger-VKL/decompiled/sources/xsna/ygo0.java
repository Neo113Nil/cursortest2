package xsna;

import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: TextFieldSelectionManager.kt */
@b6l(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$1", f = "TextFieldSelectionManager.kt", l = {228, 230}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class ygo0 extends SuspendLambda implements wzs<ov70, spj<? super s3q0>, Object> {
    /* synthetic */ long J$0;
    int label;
    final /* synthetic */ gho0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ygo0(gho0 gho0Var, spj<? super ygo0> spjVar) {
        super(2, spjVar);
        this.this$0 = gho0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        ygo0 ygo0Var = new ygo0(this.this$0, spjVar);
        ygo0Var.J$0 = ((ov70) obj).a;
        return ygo0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(ov70 ov70Var, spj<? super s3q0> spjVar) {
        long j = ov70Var.a;
        ygo0 ygo0Var = new ygo0(this.this$0, spjVar);
        ygo0Var.J$0 = j;
        return ygo0Var.invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        if (r7.a(r3, r4, r6) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002b, code lost:
    
        if (r7.u(r6) == r0) goto L19;
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
            long j = this.J$0;
            gho0 gho0Var = this.this$0;
            this.J$0 = j;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
            kotlin.a.a(obj);
        }
        Pair a = gho0.a(this.this$0);
        if (a != null) {
            gho0 gho0Var2 = this.this$0;
            String str = (String) a.d();
            long j2 = ((qko0) a.g()).a;
            aua0 aua0Var = gho0Var2.j;
            if (aua0Var != null) {
                this.label = 2;
            }
        }
        return s3q0.a;
    }
}
