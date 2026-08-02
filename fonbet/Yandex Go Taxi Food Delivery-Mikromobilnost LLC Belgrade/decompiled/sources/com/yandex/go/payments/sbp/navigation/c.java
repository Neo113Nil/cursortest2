package com.yandex.go.payments.sbp.navigation;

import android.content.Context;
import com.yandex.go.payments.sbp.domain.ErrorType;
import com.yandex.go.payments.sbp.domain.d;
import com.yandex.go.payments.sbp.domain.e;
import com.yandex.go.payments.sbp.ui.home.SbpHomeModalView;
import defpackage.dpb;
import defpackage.eao;
import defpackage.g1a0;
import defpackage.jpj0;
import defpackage.m230;
import defpackage.m950;
import defpackage.ny61;
import defpackage.sy60;
import defpackage.tim0;
import defpackage.u45;
import defpackage.uim0;
import defpackage.vfg0;
import defpackage.w030;
import defpackage.ygm0;
import defpackage.yvf0;
import defpackage.zi60;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class c extends m230 implements m950 {
    public final String E;
    public final w030 F;
    public final Context G;
    public final ygm0 H;
    public final g1a0 I;
    public final yvf0 J;
    public final d K;
    public final e L;
    public final tim0 M;
    public final yvf0 N;
    public final yvf0 O;
    public final boolean P;

    public c(String str, w030 w030Var, Context context, ygm0 ygm0Var, g1a0 g1a0Var, zi60 zi60Var, d dVar, e eVar, tim0 tim0Var, jpj0 jpj0Var, vfg0 vfg0Var) {
        super(null);
        this.E = str;
        this.F = w030Var;
        this.G = context;
        this.H = ygm0Var;
        this.I = g1a0Var;
        this.J = zi60Var;
        this.K = dVar;
        this.L = eVar;
        this.M = tim0Var;
        this.N = jpj0Var;
        this.O = vfg0Var;
        this.P = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object T(c cVar, String str, ContinuationImpl continuationImpl) {
        SbpTokenBindingRouterImpl$unbindSbpToken$1 sbpTokenBindingRouterImpl$unbindSbpToken$1;
        int i;
        cVar.getClass();
        if (continuationImpl instanceof SbpTokenBindingRouterImpl$unbindSbpToken$1) {
            sbpTokenBindingRouterImpl$unbindSbpToken$1 = (SbpTokenBindingRouterImpl$unbindSbpToken$1) continuationImpl;
            int i2 = sbpTokenBindingRouterImpl$unbindSbpToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sbpTokenBindingRouterImpl$unbindSbpToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sbpTokenBindingRouterImpl$unbindSbpToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sbpTokenBindingRouterImpl$unbindSbpToken$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar = cVar.L;
                    sbpTokenBindingRouterImpl$unbindSbpToken$1.L$0 = null;
                    sbpTokenBindingRouterImpl$unbindSbpToken$1.label = 1;
                    if (eVar.a(str, sbpTokenBindingRouterImpl$unbindSbpToken$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                eao a = cVar.M.a(ErrorType.REDIRECTION_ERROR);
                cVar.j(dpb.a);
                cVar.A((m950) cVar.O.get(), new uim0(a), sy60.Q2);
                return zy11.a;
            }
        }
        sbpTokenBindingRouterImpl$unbindSbpToken$1 = new SbpTokenBindingRouterImpl$unbindSbpToken$1(cVar, continuationImpl);
        Object obj2 = sbpTokenBindingRouterImpl$unbindSbpToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sbpTokenBindingRouterImpl$unbindSbpToken$1.label;
        if (i != 0) {
        }
        eao a2 = cVar.M.a(ErrorType.REDIRECTION_ERROR);
        cVar.j(dpb.a);
        cVar.A((m950) cVar.O.get(), new uim0(a2), sy60.Q2);
        return zy11.a;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.F;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return this.P;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        return new SbpHomeModalView(this.G, this.H, this.I, new SbpTokenBindingRouterImpl$provideModalView$1(1, this, c.class, "showOpeningBankDialogModalView", "showOpeningBankDialogModalView(Lcom/yandex/go/payments/sbp/domain/model/BankInfo;)V", 0));
    }
}
