package xsna;

import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import xsna.z2o0;

/* compiled from: SelectionManager.kt */
/* loaded from: classes11.dex */
public final class zdi0 implements PointerInputEventHandler {
    public final /* synthetic */ bei0 a;
    public final /* synthetic */ bi80 b;

    /* compiled from: SelectionManager.kt */
    @b6l(c = "androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1$1", f = "SelectionManager.kt", l = {1001, 1007}, m = "invokeSuspend", v = 1)
    public static final class a extends RestrictedSuspendLambda implements wzs<eu5, spj<? super s3q0>, Object> {
        final /* synthetic */ gzs<s3q0> $block;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ bei0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(bei0 bei0Var, gzs<s3q0> gzsVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = bei0Var;
            this.$block = gzsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.this$0, this.$block, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(eu5 eu5Var, spj<? super s3q0> spjVar) {
            return ((a) create(eu5Var, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
        
            if (r6 == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
        
            if (r6 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            eu5 eu5Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                eu5Var = (eu5) this.L$0;
                this.L$0 = eu5Var;
                this.label = 1;
                z2o0.a aVar = z2o0.a;
                obj = z2o0.c(eu5Var, PointerEventPass.Main, this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    if (!((Boolean) obj).booleanValue() && this.this$0.e() == null) {
                        this.$block.invoke();
                    }
                    return s3q0.a;
                }
                eu5Var = (eu5) this.L$0;
                kotlin.a.a(obj);
            }
            PointerEventPass pointerEventPass = PointerEventPass.Initial;
            this.L$0 = null;
            this.label = 2;
            obj = lgo.a(eu5Var, (xlb0) obj, pointerEventPass, this);
        }
    }

    public zdi0(bei0 bei0Var, bi80 bi80Var) {
        this.a = bei0Var;
        this.b = bi80Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
        Object c = d7s.c(dmb0Var, new a(this.a, this.b, null), spjVar);
        return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : s3q0.a;
    }
}
