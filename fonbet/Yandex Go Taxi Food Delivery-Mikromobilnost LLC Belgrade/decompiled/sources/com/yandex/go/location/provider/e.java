package com.yandex.go.location.provider;

import defpackage.iwc;
import defpackage.l8x;
import defpackage.tje;
import defpackage.vpr;
import defpackage.x6f0;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes12.dex */
public final class e implements vpr {
    public final /* synthetic */ Ref$ObjectRef a;
    public final /* synthetic */ Ref$LongRef b;
    public final /* synthetic */ y6f0 c;

    public e(Ref$ObjectRef ref$ObjectRef, Ref$LongRef ref$LongRef, y6f0 y6f0Var) {
        this.a = ref$ObjectRef;
        this.b = ref$LongRef;
        this.c = y6f0Var;
    }

    /* JADX WARN: Type inference failed for: r12v6, types: [T, pzt0] */
    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        long j = ((iwc) obj).a;
        Ref$ObjectRef ref$ObjectRef = this.a;
        l8x l8xVar = (l8x) ref$ObjectRef.element;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        long j2 = j & Long.MIN_VALUE;
        Ref$LongRef ref$LongRef = this.b;
        zy11 zy11Var = zy11.a;
        if (j2 != 0) {
            y6f0 y6f0Var = this.c;
            ref$ObjectRef.element = tje.N(y6f0Var, null, null, new CompassProviderImpl$interpolateForUi$1$1$1(ref$LongRef, j, y6f0Var, null), 3);
            return zy11Var;
        }
        if ((ref$LongRef.element & Long.MIN_VALUE) != 0) {
            ref$LongRef.element = 0L;
            Object o = ((x6f0) this.c).y.o(new iwc(0L), continuation);
            if (o == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return o;
            }
        }
        return zy11Var;
    }
}
