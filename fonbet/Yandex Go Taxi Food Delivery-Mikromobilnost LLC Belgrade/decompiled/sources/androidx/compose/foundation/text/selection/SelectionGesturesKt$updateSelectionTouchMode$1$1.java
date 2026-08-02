package androidx.compose.foundation.text.selection;

import defpackage.mvg;
import defpackage.tls;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/f;", "Lzy11;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/f;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1", f = "SelectionGestures.kt", l = {HProv.PP_SIGNATUREOID}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class SelectionGesturesKt$updateSelectionTouchMode$1$1 extends RestrictedSuspendLambda implements wls {
    final /* synthetic */ tls $updateTouchMode;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionGesturesKt$updateSelectionTouchMode$1$1(tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$updateTouchMode = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SelectionGesturesKt$updateSelectionTouchMode$1$1 selectionGesturesKt$updateSelectionTouchMode$1$1 = new SelectionGesturesKt$updateSelectionTouchMode$1$1(this.$updateTouchMode, continuation);
        selectionGesturesKt$updateSelectionTouchMode$1$1.L$0 = obj;
        return selectionGesturesKt$updateSelectionTouchMode$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SelectionGesturesKt$updateSelectionTouchMode$1$1) create((androidx.compose.ui.input.pointer.f) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x002a -> B:5:0x002d). Please report as a decompilation issue!!! */
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
            if (r1 == 0) goto L18
            if (r1 != r2) goto L11
            java.lang.Object r1 = r4.L$0
            androidx.compose.ui.input.pointer.f r1 = (androidx.compose.ui.input.pointer.f) r1
            kotlin.b.b(r5)
            goto L2d
        L11:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ny61.r(r4)
            r4 = 0
            return r4
        L18:
            kotlin.b.b(r5)
            java.lang.Object r5 = r4.L$0
            androidx.compose.ui.input.pointer.f r5 = (androidx.compose.ui.input.pointer.f) r5
            r1 = r5
        L20:
            androidx.compose.ui.input.pointer.PointerEventPass r5 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
            r4.L$0 = r1
            r4.label = r2
            java.lang.Object r5 = r1.a(r5, r4)
            if (r5 != r0) goto L2d
            return r0
        L2d:
            tvd0 r5 = (defpackage.tvd0) r5
            tls r3 = r4.$updateTouchMode
            boolean r5 = defpackage.okq0.a(r5)
            r5 = r5 ^ r2
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r3.invoke(r5)
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
