package com.yandex.passport.common.mvi;

import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.ui.bouncer.model.BouncerUiState$SocialAction;
import com.yandex.passport.internal.ui.bouncer.model.ChallengeState;
import com.yandex.passport.internal.ui.bouncer.model.a0;
import com.yandex.passport.internal.ui.bouncer.model.b0;
import com.yandex.passport.internal.ui.bouncer.model.b2;
import com.yandex.passport.internal.ui.bouncer.model.c0;
import com.yandex.passport.internal.ui.bouncer.model.c2;
import com.yandex.passport.internal.ui.bouncer.model.d0;
import com.yandex.passport.internal.ui.bouncer.model.e0;
import com.yandex.passport.internal.ui.bouncer.model.f0;
import com.yandex.passport.internal.ui.bouncer.model.g0;
import com.yandex.passport.internal.ui.bouncer.model.h0;
import com.yandex.passport.internal.ui.bouncer.model.h1;
import com.yandex.passport.internal.ui.bouncer.model.i0;
import com.yandex.passport.internal.ui.bouncer.model.j0;
import com.yandex.passport.internal.ui.bouncer.model.k0;
import com.yandex.passport.internal.ui.bouncer.model.l;
import com.yandex.passport.internal.ui.bouncer.model.l0;
import com.yandex.passport.internal.ui.bouncer.model.m;
import com.yandex.passport.internal.ui.bouncer.model.m0;
import com.yandex.passport.internal.ui.bouncer.model.n;
import com.yandex.passport.internal.ui.bouncer.model.n0;
import com.yandex.passport.internal.ui.bouncer.model.o;
import com.yandex.passport.internal.ui.bouncer.model.p;
import com.yandex.passport.internal.ui.bouncer.model.q;
import com.yandex.passport.internal.ui.bouncer.model.r;
import com.yandex.passport.internal.ui.bouncer.model.s;
import com.yandex.passport.internal.ui.bouncer.model.s1;
import com.yandex.passport.internal.ui.bouncer.model.t;
import com.yandex.passport.internal.ui.bouncer.model.u;
import com.yandex.passport.internal.ui.bouncer.model.u1;
import com.yandex.passport.internal.ui.bouncer.model.v;
import com.yandex.passport.internal.ui.bouncer.model.v1;
import com.yandex.passport.internal.ui.bouncer.model.w;
import com.yandex.passport.internal.ui.bouncer.model.w1;
import com.yandex.passport.internal.ui.bouncer.model.x;
import com.yandex.passport.internal.ui.bouncer.model.y;
import com.yandex.passport.internal.ui.bouncer.model.z;
import com.yandex.passport.internal.ui.bouncer.model.z1;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vuu0;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n"}, d2 = {"A", "action", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.common.mvi.Store$wireWith$1", f = "Store.kt", l = {36}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class Store$wireWith$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Store$wireWith$1(k kVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Store$wireWith$1 store$wireWith$1 = new Store$wireWith$1(this.this$0, continuation);
        store$wireWith$1.L$0 = obj;
        return store$wireWith$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((Store$wireWith$1) create(obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0187, code lost:
    
        if ((r8 != null ? java.lang.Boolean.valueOf(r8.isMailish()) : null) != null) goto L68;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        s1 a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Object obj2 = this.L$0;
        Object value = this.this$0.e.getValue();
        k kVar = this.this$0;
        h1 h1Var = kVar.a;
        s1 s1Var = (s1) kVar.e.getValue();
        n0 n0Var = (n0) obj2;
        c2 c2Var = s1Var.a;
        if (n0Var instanceof r) {
            LoginProperties loginProperties = ((r) n0Var).a;
            a = s1.a(s1Var, h1.a(s1.a(s1Var, null, null, loginProperties, null, null, null, 59), true), null, loginProperties, null, null, null, 58);
        } else if (n0Var instanceof z) {
            LoginProperties loginProperties2 = ((z) n0Var).b;
            a = s1.a(s1Var, h1.a(s1.a(s1Var, null, null, loginProperties2, null, null, null, 59), true), null, loginProperties2, null, null, null, 58);
        } else if ((n0Var instanceof com.yandex.passport.internal.ui.bouncer.model.d) || (n0Var instanceof com.yandex.passport.internal.ui.bouncer.model.j) || (n0Var instanceof i0) || (n0Var instanceof d0) || (n0Var instanceof q) || (n0Var instanceof l0) || (n0Var instanceof j0) || (n0Var instanceof v) || (n0Var instanceof x) || (n0Var instanceof n) || (n0Var instanceof com.yandex.passport.internal.ui.bouncer.model.g) || (n0Var instanceof com.yandex.passport.internal.ui.bouncer.model.k) || (n0Var instanceof t) || (n0Var instanceof h0)) {
            a = s1.a(s1Var, h1.a(s1Var, true), null, null, null, null, null, 62);
        } else if (n0Var instanceof m0) {
            a = s1.a(s1Var, ((m0) n0Var).a, null, null, null, null, null, 62);
        } else {
            if ((n0Var instanceof m) || (n0Var instanceof u) || (n0Var instanceof a0)) {
                a = s1.a(s1Var, h1.a(s1Var, false), null, null, null, null, null, 62);
            } else if (n0Var instanceof com.yandex.passport.internal.ui.bouncer.model.e) {
                a = s1.a(s1Var, h1.a(s1Var, false), null, null, null, ChallengeState.PASSED, null, 46);
            } else if (n0Var instanceof com.yandex.passport.internal.ui.bouncer.model.f) {
                a = s1.a(s1Var, h1.a(s1Var, false), null, null, null, ChallengeState.REQUIRED, null, 46);
            } else if (n0Var instanceof y) {
                a = s1.a(s1Var, h1.a(s1Var, true), null, null, ((y) n0Var).a, null, null, 54);
            } else if (n0Var instanceof o) {
                o oVar = (o) n0Var;
                a = s1.a(s1Var, new v1(oVar.a, oVar.b, oVar.c), null, null, null, null, null, 62);
            } else {
                if (!n0Var.equals(l.b)) {
                    if (n0Var instanceof e0) {
                        a = s1.a(s1Var, ((e0) n0Var).a, null, null, null, null, null, 62);
                    } else if (n0Var instanceof f0) {
                        z1 z1Var = ((f0) n0Var).a;
                        if (c2Var instanceof w1) {
                            w1 w1Var = (w1) c2Var;
                            ModernAccount modernAccount = w1Var.w;
                            if (w1Var.x) {
                                if ((modernAccount != null ? Boolean.valueOf(modernAccount.isSocial()) : null) == null) {
                                }
                            }
                        }
                        a = z1Var.a.getVariant() instanceof com.yandex.passport.sloth.data.o ? s1.a(s1Var, z1Var, null, null, null, ChallengeState.UNKNOWN, null, 46) : s1.a(s1Var, z1Var, null, null, null, null, null, 62);
                    } else if (n0Var instanceof p) {
                        a = s1.a(s1Var, ((p) n0Var).a, null, null, null, null, null, 62);
                    } else if (n0Var instanceof b0) {
                        a = s1.a(s1Var, ((b0) n0Var).a, null, null, null, null, null, 62);
                    } else if (n0Var.equals(l.a)) {
                        a = s1.a(s1Var, b2.a, null, null, null, null, null, 62);
                    } else if (n0Var instanceof k0) {
                        a = s1.a(s1Var, null, null, null, null, null, ((k0) n0Var).a, 31);
                    } else if (n0Var instanceof s) {
                        a = s1.a(s1Var, h1.a(s1Var, false), ((s) n0Var).a, null, null, null, null, 60);
                    } else if (n0Var instanceof w) {
                        a = s1.a(s1Var, h1.a(s1Var, true), null, null, null, null, null, 62);
                    } else if (n0Var instanceof c0) {
                        LoginProperties loginProperties3 = s1Var.c;
                        a = s1.a(s1Var, new u1(loginProperties3 != null ? loginProperties3.getCreateMasterEnterPhoneNumberOption() : false, ((c0) n0Var).a), null, null, null, null, null, 62);
                    } else {
                        if (!(n0Var instanceof g0)) {
                            w511.b();
                            return null;
                        }
                        a = s1.a(s1Var, new BouncerUiState$SocialAction(((g0) n0Var).a), null, null, null, null, null, 62);
                    }
                }
                a = s1Var;
            }
        }
        LogLevel logLevel = LogLevel.DEBUG;
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(logLevel, null, vuu0.c("\n                REDUCE:\n                    originalState: " + com.yandex.passport.internal.properties.u.t(s1Var) + "\n                    action: " + n0Var.getClass().getName() + "\n                    newState: " + com.yandex.passport.internal.properties.u.t(a) + "\n            "), 10);
        }
        if (!jl40.l(value, a)) {
            r0 r0Var = this.this$0.e;
            this.label = 1;
            r0Var.emit(a, this);
            if (zy11Var == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11Var;
    }
}
