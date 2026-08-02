package com.yandex.messaging.internal.authorized.chat;

import android.os.Looper;
import defpackage.cd0;
import defpackage.ey4;
import defpackage.h3t0;
import defpackage.kqr;
import defpackage.m150;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o1b0;
import defpackage.sb7;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wls;
import defpackage.z83;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lm150;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.chat.NameController$flow$1", f = "NameController.kt", l = {50, 60}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class NameController$flow$1 extends SuspendLambda implements wls {
    final /* synthetic */ h3t0 $snapshot;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NameController$flow$1(l lVar, h3t0 h3t0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lVar;
        this.$snapshot = h3t0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NameController$flow$1 nameController$flow$1 = new NameController$flow$1(this.this$0, this.$snapshot, continuation);
        nameController$flow$1.L$0 = obj;
        return nameController$flow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NameController$flow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004a, code lost:
    
        if (r1.emit(r11, r10) == r0) goto L35;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar;
        tpr ey4Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            vprVar = (vpr) this.L$0;
            z83.g(null, this.this$0.n, Looper.myLooper());
            if (this.$snapshot.a()) {
                m150 i2 = this.this$0.i();
                this.L$0 = vprVar;
                this.label = 1;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$0;
            kotlin.b.b(obj);
        }
        l lVar = this.this$0;
        o1b0 o1b0Var = lVar.l;
        sb7 sb7Var = lVar.m;
        boolean z = o1b0Var.e;
        String str = o1b0Var.b;
        if (z) {
            ey4Var = null;
        } else if (o1b0Var.d) {
            ey4Var = com.yandex.messaging.internal.storage.h.i(sb7Var, lVar.d.a(lVar.b));
        } else if (o1b0Var.p) {
            ey4 ey4Var2 = new ey4(new cd0(11, com.yandex.messaging.internal.storage.h.d(sb7Var), str), 1);
            l lVar2 = this.this$0;
            ey4Var = kotlinx.coroutines.flow.e.E(new kotlinx.coroutines.flow.h(new tpr[]{ey4Var2, com.yandex.messaging.internal.storage.h.i(lVar2.m, lVar2.d.a(lVar2.b))}), kqr.a);
        } else {
            ey4Var = new ey4(new cd0(11, com.yandex.messaging.internal.storage.h.d(sb7Var), str), 1);
        }
        if (ey4Var != null) {
            l lVar3 = this.this$0;
            this.L$0 = null;
            this.label = 2;
            kotlinx.coroutines.flow.e.w(vprVar);
            Object collect = ey4Var.collect(new k(vprVar, lVar3), this);
            if (collect != coroutineSingletons) {
                collect = zy11Var;
            }
            if (collect != coroutineSingletons) {
                collect = zy11Var;
            }
            if (collect == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11Var;
    }
}
