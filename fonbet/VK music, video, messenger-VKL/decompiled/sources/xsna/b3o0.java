package xsna;

import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: TapGestureDetector.kt */
@b6l(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", f = "TapGestureDetector.kt", l = {254}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class b3o0 extends RestrictedSuspendLambda implements wzs<eu5, spj<? super xlb0>, Object> {
    final /* synthetic */ xlb0 $firstUp;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3o0(xlb0 xlb0Var, spj<? super b3o0> spjVar) {
        super(2, spjVar);
        this.$firstUp = xlb0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        b3o0 b3o0Var = new b3o0(this.$firstUp, spjVar);
        b3o0Var.L$0 = obj;
        return b3o0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(eu5 eu5Var, spj<? super xlb0> spjVar) {
        return ((b3o0) create(eu5Var, spjVar)).invokeSuspend(s3q0.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x003e -> B:5:0x0041). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            long r3 = r7.J$0
            java.lang.Object r1 = r7.L$0
            xsna.eu5 r1 = (xsna.eu5) r1
            kotlin.a.a(r8)
            goto L41
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            kotlin.a.a(r8)
            java.lang.Object r8 = r7.L$0
            xsna.eu5 r8 = (xsna.eu5) r8
            xsna.xlb0 r1 = r7.$firstUp
            long r3 = r1.b
            xsna.rut0 r1 = r8.getViewConfiguration()
            r1.getClass()
            r5 = 40
            long r5 = r5 + r3
            r1 = r8
            r3 = r5
        L32:
            r7.L$0 = r1
            r7.J$0 = r3
            r7.label = r2
            r8 = 0
            r5 = 3
            java.lang.Object r8 = xsna.z2o0.b(r1, r8, r7, r5)
            if (r8 != r0) goto L41
            return r0
        L41:
            xsna.xlb0 r8 = (xsna.xlb0) r8
            long r5 = r8.b
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 < 0) goto L32
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.b3o0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
