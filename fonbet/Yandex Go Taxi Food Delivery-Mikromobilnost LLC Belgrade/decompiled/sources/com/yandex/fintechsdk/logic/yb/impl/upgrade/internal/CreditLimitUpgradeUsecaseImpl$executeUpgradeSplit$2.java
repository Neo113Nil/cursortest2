package com.yandex.fintechsdk.logic.yb.impl.upgrade.internal;

import android.net.Uri;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.yandex.fintechsdk.adapters.yb.sdk.impl.c;
import com.ybsdk.api.YBSdk;
import defpackage.bv51;
import defpackage.fp51;
import defpackage.fu91;
import defpackage.fyc;
import defpackage.gp51;
import defpackage.gwk0;
import defpackage.i3y;
import defpackage.ib21;
import defpackage.jl40;
import defpackage.l8x;
import defpackage.lyc;
import defpackage.mg51;
import defpackage.mvg;
import defpackage.ng51;
import defpackage.ny61;
import defpackage.ph51;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tse;
import defpackage.vh51;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lib21;", "<anonymous>", "(Ltse;)Lib21;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.logic.yb.impl.upgrade.internal.CreditLimitUpgradeUsecaseImpl$executeUpgradeSplit$2", f = "CreditLimitUpgradeUsecaseImpl.kt", l = {70}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class CreditLimitUpgradeUsecaseImpl$executeUpgradeSplit$2 extends SuspendLambda implements wls {
    final /* synthetic */ ViewGroup $container;
    final /* synthetic */ String $deeplink;
    final /* synthetic */ FragmentActivity $fragmentActivity;
    final /* synthetic */ fp51 $ybAdapter;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditLimitUpgradeUsecaseImpl$executeUpgradeSplit$2(fp51 fp51Var, String str, ViewGroup viewGroup, FragmentActivity fragmentActivity, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$ybAdapter = fp51Var;
        this.$deeplink = str;
        this.$container = viewGroup;
        this.$fragmentActivity = fragmentActivity;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CreditLimitUpgradeUsecaseImpl$executeUpgradeSplit$2 creditLimitUpgradeUsecaseImpl$executeUpgradeSplit$2 = new CreditLimitUpgradeUsecaseImpl$executeUpgradeSplit$2(this.$ybAdapter, this.$deeplink, this.$container, this.$fragmentActivity, this.this$0, continuation);
        creditLimitUpgradeUsecaseImpl$executeUpgradeSplit$2.L$0 = obj;
        return creditLimitUpgradeUsecaseImpl$executeUpgradeSplit$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CreditLimitUpgradeUsecaseImpl$executeUpgradeSplit$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object failure;
        bv51 bv51Var;
        l8x l8xVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            tse tseVar = (tse) this.L$0;
            fp51 fp51Var = this.$ybAdapter;
            String str = this.$deeplink;
            i3y i3yVar = ((c) fp51Var).a;
            if ((i3yVar != null ? (mg51) i3yVar.getValue() : null) != null) {
                try {
                    failure = YBSdk.INSTANCE.resolveUri(Uri.parse(str));
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                if (failure instanceof Result.Failure) {
                    failure = null;
                }
                vh51 vh51Var = (vh51) failure;
                if (vh51Var != null) {
                    bv51Var = new bv51(vh51Var);
                    if (bv51Var != null) {
                        return ib21.e;
                    }
                    fyc b = gwk0.b();
                    pzt0 N = tje.N(tseVar, null, null, new CreditLimitUpgradeUsecaseImpl$executeUpgradeSplit$2$eventJob$1(this.$ybAdapter, b, this.this$0, null), 3);
                    fp51 fp51Var2 = this.$ybAdapter;
                    ViewGroup viewGroup = this.$container;
                    FragmentActivity fragmentActivity = this.$fragmentActivity;
                    lyc lycVar = new lyc(28, b);
                    i3y i3yVar2 = ((c) fp51Var2).a;
                    mg51 mg51Var = i3yVar2 != null ? (mg51) i3yVar2.getValue() : null;
                    if (mg51Var != null) {
                        ph51 g = fu91.g(((ng51) mg51Var).b, fragmentActivity, bv51Var.a);
                        bv51Var.b = g;
                        g.b(viewGroup, new gp51(0, lycVar));
                    }
                    this.L$0 = bv51Var;
                    this.L$1 = N;
                    this.label = 1;
                    Object s = b.s(this);
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (s == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    l8xVar = N;
                    obj = s;
                }
            }
            bv51Var = null;
            if (bv51Var != null) {
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l8xVar = (l8x) this.L$1;
            bv51Var = (bv51) this.L$0;
            b.b(obj);
        }
        ib21 ib21Var = (ib21) obj;
        l8xVar.a(null);
        if (!jl40.l(ib21Var, ib21.d)) {
            ((c) this.$ybAdapter).getClass();
            ph51 ph51Var = bv51Var.b;
            if (ph51Var != null) {
                try {
                    ph51.class.getMethod("dismiss", null).invoke(ph51Var, null);
                } catch (Throwable unused) {
                }
            }
            bv51Var.b = null;
        }
        return ib21Var;
    }
}
