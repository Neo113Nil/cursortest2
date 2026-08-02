package xsna;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: SelectionGestures.kt */
/* loaded from: classes11.dex */
public final class edi0 implements PointerInputEventHandler {
    public final /* synthetic */ izs<Boolean, s3q0> a;

    /* compiled from: SelectionGestures.kt */
    @b6l(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1", f = "SelectionGestures.kt", l = {MBSupportMuteAdType.REWARD_VIDEO}, m = "invokeSuspend", v = 1)
    public static final class a extends RestrictedSuspendLambda implements wzs<eu5, spj<? super s3q0>, Object> {
        final /* synthetic */ izs<Boolean, s3q0> $updateTouchMode;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(izs<? super Boolean, s3q0> izsVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$updateTouchMode = izsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.$updateTouchMode, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(eu5 eu5Var, spj<? super s3q0> spjVar) {
            return ((a) create(eu5Var, spjVar)).invokeSuspend(s3q0.a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002d A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x002b -> B:5:0x002e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L19
                if (r1 != r2) goto L11
                java.lang.Object r1 = r4.L$0
                xsna.eu5 r1 = (xsna.eu5) r1
                kotlin.a.a(r5)
                goto L2e
            L11:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L19:
                kotlin.a.a(r5)
                java.lang.Object r5 = r4.L$0
                xsna.eu5 r5 = (xsna.eu5) r5
                r1 = r5
            L21:
                androidx.compose.ui.input.pointer.PointerEventPass r5 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                r4.L$0 = r1
                r4.label = r2
                java.lang.Object r5 = r1.I1(r5, r4)
                if (r5 != r0) goto L2e
                return r0
            L2e:
                xsna.plb0 r5 = (xsna.plb0) r5
                xsna.izs<java.lang.Boolean, xsna.s3q0> r3 = r4.$updateTouchMode
                boolean r5 = xsna.gdi0.a(r5)
                r5 = r5 ^ r2
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                r3.invoke(r5)
                goto L21
            */
            throw new UnsupportedOperationException("Method not decompiled: xsna.edi0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public edi0(izs<? super Boolean, s3q0> izsVar) {
        this.a = izsVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
        Object Z0 = dmb0Var.Z0(new a(this.a, null), spjVar);
        return Z0 == CoroutineSingletons.COROUTINE_SUSPENDED ? Z0 : s3q0.a;
    }
}
