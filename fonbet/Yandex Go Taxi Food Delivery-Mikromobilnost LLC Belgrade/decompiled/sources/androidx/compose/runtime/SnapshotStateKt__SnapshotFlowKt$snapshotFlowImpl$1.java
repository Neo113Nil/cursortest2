package androidx.compose.runtime;

import defpackage.mvg;
import defpackage.n2t0;
import defpackage.sls;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lvpr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1", f = "SnapshotFlow.kt", l = {467, 470, 475}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
final class SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1 extends SuspendLambda implements wls {
    final /* synthetic */ sls $block;
    final /* synthetic */ n2t0 $externalManager;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1(n2t0 n2t0Var, sls slsVar, Continuation continuation) {
        super(2, continuation);
        this.$externalManager = n2t0Var;
        this.$block = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1 snapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1 = new SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1(this.$externalManager, this.$block, continuation);
        snapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1.L$0 = obj;
        return snapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089 A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #0 {all -> 0x0022, blocks: (B:11:0x0039, B:12:0x007d, B:14:0x006c, B:18:0x0089, B:23:0x001e), top: B:2:0x0008 }] */
    /* JADX WARN: Type inference failed for: r0v1, types: [o2t0] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2, types: [ioq0] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v7, types: [ci9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [n2t0] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, n2t0] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, n2t0] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0087 -> B:14:0x006c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x009a -> B:14:0x006c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r9.label
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L3d
            if (r1 == r4) goto L10
            if (r1 == r3) goto L2b
            if (r1 != r2) goto L25
        L10:
            java.lang.Object r1 = r9.L$3
            java.lang.Object r4 = r9.L$2
            ci9 r4 = (defpackage.ci9) r4
            java.lang.Object r6 = r9.L$1
            n2t0 r6 = (defpackage.n2t0) r6
            java.lang.Object r7 = r9.L$0
            vpr r7 = (defpackage.vpr) r7
            kotlin.b.b(r10)     // Catch: java.lang.Throwable -> L22
            goto L6c
        L22:
            r10 = move-exception
            goto L9f
        L25:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ny61.r(r9)
            return r5
        L2b:
            java.lang.Object r1 = r9.L$3
            java.lang.Object r4 = r9.L$2
            ci9 r4 = (defpackage.ci9) r4
            java.lang.Object r6 = r9.L$1
            n2t0 r6 = (defpackage.n2t0) r6
            java.lang.Object r7 = r9.L$0
            vpr r7 = (defpackage.vpr) r7
            kotlin.b.b(r10)     // Catch: java.lang.Throwable -> L22
            goto L7d
        L3d:
            kotlin.b.b(r10)
            java.lang.Object r10 = r9.L$0
            r7 = r10
            vpr r7 = (defpackage.vpr) r7
            n2t0 r10 = r9.$externalManager
            if (r10 != 0) goto L4e
            n2t0 r10 = new n2t0
            r10.<init>()
        L4e:
            r6 = r10
            r10 = 6
            kotlinx.coroutines.channels.a r10 = defpackage.sb2.a(r4, r5, r5, r10)
            sls r1 = r9.$block     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r1 = r6.a(r10, r1)     // Catch: java.lang.Throwable -> L9c
            r9.L$0 = r7     // Catch: java.lang.Throwable -> L9c
            r9.L$1 = r6     // Catch: java.lang.Throwable -> L9c
            r9.L$2 = r10     // Catch: java.lang.Throwable -> L9c
            r9.L$3 = r1     // Catch: java.lang.Throwable -> L9c
            r9.label = r4     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r4 = r7.emit(r1, r9)     // Catch: java.lang.Throwable -> L9c
            if (r4 != r0) goto L6b
            goto L99
        L6b:
            r4 = r10
        L6c:
            r9.L$0 = r7     // Catch: java.lang.Throwable -> L22
            r9.L$1 = r6     // Catch: java.lang.Throwable -> L22
            r9.L$2 = r4     // Catch: java.lang.Throwable -> L22
            r9.L$3 = r1     // Catch: java.lang.Throwable -> L22
            r9.label = r3     // Catch: java.lang.Throwable -> L22
            java.lang.Object r10 = r4.e(r9)     // Catch: java.lang.Throwable -> L22
            if (r10 != r0) goto L7d
            goto L99
        L7d:
            sls r10 = r9.$block     // Catch: java.lang.Throwable -> L22
            java.lang.Object r10 = r6.a(r4, r10)     // Catch: java.lang.Throwable -> L22
            boolean r8 = defpackage.jl40.l(r10, r1)     // Catch: java.lang.Throwable -> L22
            if (r8 != 0) goto L6c
            r9.L$0 = r7     // Catch: java.lang.Throwable -> L22
            r9.L$1 = r6     // Catch: java.lang.Throwable -> L22
            r9.L$2 = r4     // Catch: java.lang.Throwable -> L22
            r9.L$3 = r10     // Catch: java.lang.Throwable -> L22
            r9.label = r2     // Catch: java.lang.Throwable -> L22
            java.lang.Object r1 = r7.emit(r10, r9)     // Catch: java.lang.Throwable -> L22
            if (r1 != r0) goto L9a
        L99:
            return r0
        L9a:
            r1 = r10
            goto L6c
        L9c:
            r0 = move-exception
            r4 = r10
            r10 = r0
        L9f:
            o2t0 r0 = r6.a
            if (r0 == 0) goto La9
            r0.a(r4)
            r0.b()
        La9:
            n2t0 r9 = r9.$externalManager
            if (r9 != 0) goto Lbc
            o2t0 r9 = r6.a
            if (r9 == 0) goto Lb2
            goto Lb7
        Lb2:
            java.lang.String r0 = "Called dispose on a manager that has been disposed of"
            defpackage.khe0.b(r0)
        Lb7:
            r9.c()
            r6.a = r5
        Lbc:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
