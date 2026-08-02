package com.yx360.design.compose.atoms.utils;

import androidx.compose.ui.input.pointer.f;
import defpackage.mvg;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/f;", "Lzy11;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/f;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yx360.design.compose.atoms.utils.ModifiersKt$gesturesEnabled$1$1", f = "Modifiers.kt", l = {16}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ModifiersKt$gesturesEnabled$1$1 extends RestrictedSuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ModifiersKt$gesturesEnabled$1$1 modifiersKt$gesturesEnabled$1$1 = new ModifiersKt$gesturesEnabled$1$1(2, continuation);
        modifiersKt$gesturesEnabled$1$1.L$0 = obj;
        return modifiersKt$gesturesEnabled$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ModifiersKt$gesturesEnabled$1$1) create((f) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003d A[LOOP:0: B:6:0x0037->B:8:0x003d, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x002a -> B:5:0x002d). Please report as a decompilation issue!!! */
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
            java.util.List r5 = r5.a
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L37:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L20
            java.lang.Object r3 = r5.next()
            zvd0 r3 = (defpackage.zvd0) r3
            r3.a()
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yx360.design.compose.atoms.utils.ModifiersKt$gesturesEnabled$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
