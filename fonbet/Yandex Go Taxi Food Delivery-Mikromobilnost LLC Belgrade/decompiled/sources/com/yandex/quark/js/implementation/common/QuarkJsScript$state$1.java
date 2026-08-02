package com.yandex.quark.js.implementation.common;

import defpackage.hig0;
import defpackage.iig0;
import defpackage.jyj0;
import defpackage.k93;
import defpackage.l93;
import defpackage.lyj0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.syj0;
import defpackage.vpr;
import defpackage.vuu0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Ljig0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.quark.js.implementation.common.QuarkJsScript$state$1", f = "QuarkJsScript.kt", l = {17, 18, 26}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class QuarkJsScript$state$1 extends SuspendLambda implements wls {
    final /* synthetic */ l93 $assetReader;
    final /* synthetic */ boolean $loggingEnabled;
    final /* synthetic */ boolean $routeWebDirectiveViaNative;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuarkJsScript$state$1(l93 l93Var, boolean z, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.$assetReader = l93Var;
        this.$routeWebDirectiveViaNative = z;
        this.$loggingEnabled = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        QuarkJsScript$state$1 quarkJsScript$state$1 = new QuarkJsScript$state$1(this.$assetReader, this.$routeWebDirectiveViaNative, this.$loggingEnabled, continuation);
        quarkJsScript$state$1.L$0 = obj;
        return quarkJsScript$state$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((QuarkJsScript$state$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b8, code lost:
    
        if (r1.emit(r4, r11) != r0) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar;
        syj0 syj0Var;
        Object obj2;
        vpr vprVar2;
        syj0 syj0Var2;
        boolean z;
        boolean z2;
        lyj0 lyj0Var;
        Object obj3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            vpr vprVar3 = (vpr) this.L$0;
            l93 l93Var = this.$assetReader;
            this.L$0 = vprVar3;
            this.label = 1;
            Object a = ((com.yandex.quark.utils.assets.internal.a) l93Var).a(this);
            if (a != coroutineSingletons) {
                vprVar = vprVar3;
                obj = a;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return zy11.a;
            }
            syj0Var2 = (syj0) this.L$1;
            vprVar2 = (vpr) this.L$0;
            b.b(obj);
            syj0Var = syj0Var2;
            vprVar = vprVar2;
            z = this.$routeWebDirectiveViaNative;
            z2 = this.$loggingEnabled;
            lyj0Var = !(syj0Var instanceof lyj0) ? (lyj0) syj0Var : null;
            if (lyj0Var != null && (obj3 = lyj0Var.a) != null) {
                StringBuilder u = qv10.u("\n                    window.__routeWebDirectiveViaNative = ", ";\n                    window.__loggingEnabled = ", ";\n\n                    ", z, z2);
                u.append((String) obj3);
                u.append("\n                ");
                iig0 iig0Var = new iig0(vuu0.c(u.toString()));
                this.L$0 = syj0Var;
                this.L$1 = null;
                this.label = 3;
            }
            return zy11.a;
        }
        vprVar = (vpr) this.L$0;
        b.b(obj);
        syj0Var = (syj0) obj;
        jyj0 jyj0Var = syj0Var instanceof jyj0 ? (jyj0) syj0Var : null;
        if (jyj0Var != null && (obj2 = jyj0Var.a) != null) {
            hig0 hig0Var = new hig0(((k93) obj2).a());
            this.L$0 = vprVar;
            this.L$1 = syj0Var;
            this.label = 2;
            if (vprVar.emit(hig0Var, this) != coroutineSingletons) {
                vprVar2 = vprVar;
                syj0Var2 = syj0Var;
                syj0Var = syj0Var2;
                vprVar = vprVar2;
            }
            return coroutineSingletons;
        }
        z = this.$routeWebDirectiveViaNative;
        z2 = this.$loggingEnabled;
        if (!(syj0Var instanceof lyj0)) {
        }
        if (lyj0Var != null) {
            StringBuilder u2 = qv10.u("\n                    window.__routeWebDirectiveViaNative = ", ";\n                    window.__loggingEnabled = ", ";\n\n                    ", z, z2);
            u2.append((String) obj3);
            u2.append("\n                ");
            iig0 iig0Var2 = new iig0(vuu0.c(u2.toString()));
            this.L$0 = syj0Var;
            this.L$1 = null;
            this.label = 3;
        }
        return zy11.a;
    }
}
