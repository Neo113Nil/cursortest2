package com.yandex.go.mainscreen.superapp.popup.data;

import android.os.SystemClock;
import defpackage.a2t;
import defpackage.b2t;
import defpackage.b3w0;
import defpackage.c2t;
import defpackage.c3w0;
import defpackage.jl40;
import defpackage.lcw0;
import defpackage.mcw0;
import defpackage.mvg;
import defpackage.ncw0;
import defpackage.ny61;
import defpackage.ocw0;
import defpackage.y1t;
import defpackage.z1t;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lb3w0;", ClidProvider.STATE, "Lc3w0;", "triggers", "<anonymous>", "(Lb3w0;Lc3w0;)Lb3w0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.popup.data.SuperAppMainScreenPopupRepository$observeUiState$4", f = "SuperAppMainScreenPopupRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SuperAppMainScreenPopupRepository$observeUiState$4 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppMainScreenPopupRepository$observeUiState$4(c cVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SuperAppMainScreenPopupRepository$observeUiState$4 superAppMainScreenPopupRepository$observeUiState$4 = new SuperAppMainScreenPopupRepository$observeUiState$4(this.this$0, (Continuation) obj3);
        superAppMainScreenPopupRepository$observeUiState$4.L$0 = (b3w0) obj;
        superAppMainScreenPopupRepository$observeUiState$4.L$1 = (c3w0) obj2;
        return superAppMainScreenPopupRepository$observeUiState$4.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b3w0 b3w0Var = (b3w0) this.L$0;
        c3w0 c3w0Var = (c3w0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Long l = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.getClass();
        ocw0 ocw0Var = c3w0Var.a;
        ocw0 ocw0Var2 = c3w0Var.a;
        c2t c2tVar = c3w0Var.b;
        boolean z = false;
        boolean z2 = (ocw0Var instanceof ncw0) || jl40.l(c2tVar, z1t.a);
        boolean z3 = (ocw0Var2 instanceof mcw0) && jl40.l(c2tVar, a2t.a);
        boolean z4 = (ocw0Var2 instanceof lcw0) || (c2tVar instanceof y1t);
        boolean l2 = jl40.l(c2tVar, b2t.a);
        if (z2 || l2) {
            Long l3 = b3w0Var.b;
            l = Long.valueOf(l3 != null ? l3.longValue() : SystemClock.elapsedRealtime());
        }
        boolean z5 = b3w0Var.c || z3;
        if (!z3 && (b3w0Var.d || z4)) {
            z = true;
        }
        return new b3w0(c3w0Var, l, z5, z);
    }
}
