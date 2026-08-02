package xsna;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SnapshotFlow.kt */
@b6l(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1", f = "SnapshotFlow.kt", l = {476, 479, 484}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class gbk0 extends SuspendLambda implements wzs<lsr<Object>, spj<? super s3q0>, Object> {
    final /* synthetic */ gzs<Object> $block;
    final /* synthetic */ iak0 $externalManager;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbk0(iak0 iak0Var, gzs<Object> gzsVar, spj<? super gbk0> spjVar) {
        super(2, spjVar);
        this.$externalManager = iak0Var;
        this.$block = gzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        gbk0 gbk0Var = new gbk0(this.$externalManager, this.$block, spjVar);
        gbk0Var.L$0 = obj;
        return gbk0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(lsr<Object> lsrVar, spj<? super s3q0> spjVar) {
        return ((gbk0) create(lsrVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009a A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #0 {all -> 0x0022, blocks: (B:8:0x001e, B:9:0x007d, B:14:0x008e, B:16:0x009a, B:23:0x003b), top: B:2:0x0008 }] */
    /* JADX WARN: Type inference failed for: r0v1, types: [xsna.jak0] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2, types: [xsna.qta] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, xsna.b9f0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0098 -> B:9:0x007d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00ab -> B:9:0x007d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.gbk0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
