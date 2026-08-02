package com.yandex.messaging.internal.authorized.online;

import defpackage.mvg;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.online.OnlineStatusReporterImpl$1", f = "OnlineStatusReporter.kt", l = {50}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class OnlineStatusReporterImpl$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnlineStatusReporterImpl$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OnlineStatusReporterImpl$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OnlineStatusReporterImpl$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0022 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0043 A[LOOP:0: B:6:0x003d->B:8:0x0043, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0020 -> B:5:0x0023). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r12.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L14
            if (r1 != r3) goto Le
            kotlin.b.b(r13)
            goto L23
        Le:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ny61.r(r12)
            return r2
        L14:
            kotlin.b.b(r13)
        L17:
            r12.label = r3
            r4 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r13 = kotlinx.coroutines.a.i(r4, r12)
            if (r13 != r0) goto L23
            return r0
        L23:
            com.yandex.messaging.internal.authorized.online.b r13 = r12.this$0
            kse r1 = r13.b
            defpackage.kse.a(r1)
            java.util.HashMap r1 = r13.c
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = r1.size()
            r4.<init>(r5)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L3d:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L9d
            java.lang.Object r5 = r1.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            kotlinx.serialization.json.c r6 = new kotlinx.serialization.json.c
            java.lang.Object r7 = r5.getKey()
            java.lang.String r7 = (java.lang.String) r7
            kotlinx.serialization.json.d r7 = defpackage.qcx.c(r7)
            kotlin.Pair r8 = new kotlin.Pair
            java.lang.String r9 = "guid"
            r8.<init>(r9, r7)
            java.lang.Object r7 = r5.getValue()
            h370 r7 = (defpackage.h370) r7
            boolean r7 = r7.a
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            kotlinx.serialization.json.d r7 = defpackage.qcx.a(r7)
            kotlin.Pair r9 = new kotlin.Pair
            java.lang.String r10 = "isOnline"
            r9.<init>(r10, r7)
            java.lang.Object r5 = r5.getValue()
            h370 r5 = (defpackage.h370) r5
            long r10 = r5.b
            java.lang.Long r5 = java.lang.Long.valueOf(r10)
            kotlinx.serialization.json.d r5 = defpackage.qcx.b(r5)
            kotlin.Pair r7 = new kotlin.Pair
            java.lang.String r10 = "lastSeenMs"
            r7.<init>(r10, r5)
            kotlin.Pair[] r5 = new kotlin.Pair[]{r8, r9, r7}
            java.util.Map r5 = kotlin.collections.b.i(r5)
            r6.<init>(r5)
            java.lang.String r5 = r6.toString()
            r4.add(r5)
            goto L3d
        L9d:
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r1 = r4.toArray(r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            x22 r13 = r13.a
            java.lang.String r4 = ", "
            r5 = 62
            java.lang.String r1 = defpackage.j73.L(r1, r4, r2, r2, r5)
            java.lang.String r4 = "["
            java.lang.String r5 = "]"
            java.lang.String r1 = defpackage.oyr.p(r4, r1, r5)
            kotlin.Pair r4 = new kotlin.Pair
            java.lang.String r5 = "info"
            r4.<init>(r5, r1)
            java.util.Map r1 = defpackage.gw00.e(r4)
            java.lang.String r4 = "online_current_state"
            r13.reportEvent(r4, r1)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.messaging.internal.authorized.online.OnlineStatusReporterImpl$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
