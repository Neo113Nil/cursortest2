package androidx.compose.foundation;

import defpackage.mvg;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.MagnifierNode$onAttach$1", f = "Magnifier.android.kt", l = {382, 386}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class MagnifierNode$onAttach$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagnifierNode$onAttach$1(i iVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MagnifierNode$onAttach$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MagnifierNode$onAttach$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0031 -> B:8:0x001e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004d -> B:6:0x0050). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto L10
            kotlin.b.b(r6)
            goto L50
        L10:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ny61.r(r5)
            r5 = 0
            return r5
        L17:
            kotlin.b.b(r6)
            goto L2d
        L1b:
            kotlin.b.b(r6)
        L1e:
            androidx.compose.foundation.i r6 = r5.this$0
            kotlinx.coroutines.channels.a r6 = r6.J
            if (r6 == 0) goto L2d
            r5.label = r3
            java.lang.Object r6 = kotlinx.coroutines.channels.a.J(r6, r5)
            if (r6 != r0) goto L2d
            goto L4f
        L2d:
            androidx.compose.foundation.i r6 = r5.this$0
            v5c0 r6 = r6.E
            if (r6 == 0) goto L1e
            iez r6 = new iez
            r1 = 11
            r6.<init>(r1)
            r5.label = r2
            fse r1 = r5.get_context()
            r630 r1 = defpackage.jl40.z(r1)
            gm5 r4 = new gm5
            r4.<init>(r3, r6)
            java.lang.Object r6 = r1.v(r4, r5)
            if (r6 != r0) goto L50
        L4f:
            return r0
        L50:
            androidx.compose.foundation.i r6 = r5.this$0
            v5c0 r6 = r6.E
            if (r6 == 0) goto L1e
            java.lang.Object r6 = r6.b
            android.widget.Magnifier r6 = (android.widget.Magnifier) r6
            r6.update()
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MagnifierNode$onAttach$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
