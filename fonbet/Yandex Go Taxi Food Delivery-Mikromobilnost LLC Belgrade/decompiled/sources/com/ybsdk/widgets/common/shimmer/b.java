package com.ybsdk.widgets.common.shimmer;

import defpackage.bvf0;
import defpackage.bwb0;
import defpackage.jq60;
import defpackage.jur0;
import defpackage.l8x;
import defpackage.rol0;
import defpackage.tls;
import defpackage.tpr;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes4.dex */
public final class b {
    public final bwb0 a;
    public final r0 b;
    public final r0 c;
    public l8x d;

    public b(bwb0 bwb0Var) {
        this.a = bwb0Var;
        Boolean bool = Boolean.FALSE;
        this.b = bvf0.c(bool);
        this.c = bvf0.c(bool);
    }

    public final jur0 a() {
        return new jur0(this.a);
    }

    public final Object b(tls tlsVar, SuspendLambda suspendLambda) {
        l8x l8xVar = this.d;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        Boolean bool = Boolean.FALSE;
        r0 r0Var = this.b;
        r0Var.getClass();
        r0Var.m(null, bool);
        r0 r0Var2 = this.c;
        r0Var2.getClass();
        r0Var2.m(null, bool);
        this.d = kotlinx.coroutines.a.n(suspendLambda.get_context());
        Object collect = new rol0(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1(new tpr[]{new rol0(new ShimmerHandlerImpl$startShimmerFlow$1(this, null)), r0Var2}, null, new ShimmerHandlerImpl$initShimmerTimeoutsWithCollect$2(this, null))).collect(new jq60(2, tlsVar), suspendLambda);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11.a;
    }

    public final void c() {
        Boolean bool = Boolean.TRUE;
        r0 r0Var = this.b;
        r0Var.getClass();
        r0Var.m(null, bool);
    }

    public final void d() {
        Boolean bool = Boolean.TRUE;
        r0 r0Var = this.c;
        r0Var.getClass();
        r0Var.m(null, bool);
    }
}
