package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: NonTouchScrollingLogic.kt */
@b6l(c = "androidx.compose.foundation.gestures.NonTouchScrollingLogicKt$untilNull$1", f = "NonTouchScrollingLogic.kt", l = {TsExtractor.TS_STREAM_TYPE_DVBSUBS}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class l670 extends RestrictedSuspendLambda implements wzs<ali0<Object>, spj<? super s3q0>, Object> {
    final /* synthetic */ gzs<Object> $builderAction;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l670(gzs<Object> gzsVar, spj<? super l670> spjVar) {
        super(2, spjVar);
        this.$builderAction = gzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        l670 l670Var = new l670(this.$builderAction, spjVar);
        l670Var.L$0 = obj;
        return l670Var;
    }

    @Override // xsna.wzs
    public final Object invoke(ali0<Object> ali0Var, spj<? super s3q0> spjVar) {
        return ((l670) create(ali0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0038 -> B:5:0x0039). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0035 -> B:5:0x0039). Please report as a decompilation issue!!! */
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
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r1 = r4.L$1
            java.lang.Object r3 = r4.L$0
            xsna.ali0 r3 = (xsna.ali0) r3
            kotlin.a.a(r5)
            goto L39
        L13:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1b:
            kotlin.a.a(r5)
            java.lang.Object r5 = r4.L$0
            xsna.ali0 r5 = (xsna.ali0) r5
            r3 = r5
        L23:
            xsna.gzs<java.lang.Object> r5 = r4.$builderAction
            java.lang.Object r1 = r5.invoke()
            if (r1 == 0) goto L38
            r4.L$0 = r3
            r4.L$1 = r1
            r4.label = r2
            kotlin.coroutines.intrinsics.CoroutineSingletons r5 = r3.a(r1, r4)
            if (r5 != r0) goto L39
            return r0
        L38:
            r1 = 0
        L39:
            if (r1 != 0) goto L23
            xsna.s3q0 r5 = xsna.s3q0.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.l670.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
