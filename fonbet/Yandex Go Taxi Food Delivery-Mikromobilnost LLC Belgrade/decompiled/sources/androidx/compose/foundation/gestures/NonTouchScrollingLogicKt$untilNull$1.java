package androidx.compose.foundation.gestures;

import defpackage.mvg;
import defpackage.sls;
import defpackage.srq0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "Lsrq0;", "Lzy11;", "<anonymous>", "(Lsrq0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.gestures.NonTouchScrollingLogicKt$untilNull$1", f = "NonTouchScrollingLogic.kt", l = {HProv.ALG_SID_KECCAK_256}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class NonTouchScrollingLogicKt$untilNull$1 extends RestrictedSuspendLambda implements wls {
    final /* synthetic */ sls $builderAction;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonTouchScrollingLogicKt$untilNull$1(sls slsVar, Continuation continuation) {
        super(2, continuation);
        this.$builderAction = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NonTouchScrollingLogicKt$untilNull$1 nonTouchScrollingLogicKt$untilNull$1 = new NonTouchScrollingLogicKt$untilNull$1(this.$builderAction, continuation);
        nonTouchScrollingLogicKt$untilNull$1.L$0 = obj;
        return nonTouchScrollingLogicKt$untilNull$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NonTouchScrollingLogicKt$untilNull$1) create((srq0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0037 -> B:5:0x0038). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0034 -> B:5:0x0038). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1a
            if (r1 != r3) goto L14
            java.lang.Object r1 = r5.L$1
            java.lang.Object r4 = r5.L$0
            srq0 r4 = (defpackage.srq0) r4
            kotlin.b.b(r6)
            goto L38
        L14:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ny61.r(r5)
            return r2
        L1a:
            kotlin.b.b(r6)
            java.lang.Object r6 = r5.L$0
            srq0 r6 = (defpackage.srq0) r6
            r4 = r6
        L22:
            sls r6 = r5.$builderAction
            java.lang.Object r1 = r6.invoke()
            if (r1 == 0) goto L37
            r5.L$0 = r4
            r5.L$1 = r1
            r5.label = r3
            kotlin.coroutines.intrinsics.CoroutineSingletons r6 = r4.a(r1, r5)
            if (r6 != r0) goto L38
            return r0
        L37:
            r1 = r2
        L38:
            if (r1 != 0) goto L22
            zy11 r5 = defpackage.zy11.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.NonTouchScrollingLogicKt$untilNull$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
