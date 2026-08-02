package xsna;

import com.vk.voip.dto.call_member.CallMember;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.miniapps.impl.picture_in_picture.feature.data.MiniAppNetworkState;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;
import kotlin.NoWhenBranchMatchedException;
import xsna.it80;
import xsna.qo20;
import xsna.ro20;

/* compiled from: MiniAppCallPiPFeature.kt */
/* loaded from: classes7.dex */
public final class po20 {
    public final com.vk.voip.ui.c a;
    public final GroupCallViewModel b;
    public final io.reactivex.rxjava3.subjects.d<ro20> c = io.reactivex.rxjava3.subjects.d.O0(ro20.b.a);
    public final io.reactivex.rxjava3.subjects.f<dp20> d = new io.reactivex.rxjava3.subjects.f<>();
    public final io.reactivex.rxjava3.core.w e = asu0.a.d();
    public final io.reactivex.rxjava3.disposables.b f = new io.reactivex.rxjava3.disposables.b();
    public final jgz g = new jgz(18);
    public boolean h = true;

    /* compiled from: MiniAppCallPiPFeature.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CallMember.NetworkStatus.values().length];
            try {
                iArr[CallMember.NetworkStatus.GOOD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CallMember.NetworkStatus.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CallMember.NetworkStatus.BAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public po20(com.vk.voip.ui.c cVar, GroupCallViewModel groupCallViewModel) {
        this.a = cVar;
        this.b = groupCallViewModel;
    }

    public static MiniAppNetworkState d(CallMember.NetworkStatus networkStatus) {
        int i = a.$EnumSwitchMapping$0[networkStatus.ordinal()];
        if (i == 1) {
            return MiniAppNetworkState.GOOD;
        }
        if (i == 2) {
            return MiniAppNetworkState.MEDIUM;
        }
        if (i == 3) {
            return MiniAppNetworkState.BAD;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final synchronized void a(qo20 qo20Var) {
        if (!this.h) {
            throw new IllegalStateException("Instance is destroyed");
        }
        c(qo20Var);
    }

    public final CallMemberId b() {
        dhw0 L = this.a.L();
        CallMemberId a2 = com.vk.voip.ui.c.r.a();
        this.g.getClass();
        if (L != null) {
            CallMemberId callMemberId = L.m;
            CallMemberId callMemberId2 = (CallMemberId) j5g.Z(L.l);
            if (callMemberId != null) {
                return callMemberId;
            }
            if (callMemberId2 != null) {
                return callMemberId2;
            }
        }
        return a2;
    }

    public final void c(qo20 qo20Var) {
        boolean z = qo20Var instanceof qo20.d;
        com.vk.voip.ui.c cVar = this.a;
        if (!z) {
            if (epx.f(qo20Var, qo20.e.a)) {
                cVar.getClass();
                if (com.vk.voip.ui.c.v) {
                    cVar.A0();
                    return;
                } else {
                    cVar.B0();
                    return;
                }
            }
            if (epx.f(qo20Var, qo20.a.a)) {
                com.vk.voip.ui.c.C(this.a, null, 0L, false, false, true, null, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);
                return;
            } else if (epx.f(qo20Var, qo20.c.a)) {
                com.vk.voip.ui.c.C(this.a, null, 0L, false, false, false, null, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);
                return;
            } else {
                if (!epx.f(qo20Var, qo20.b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                com.vk.voip.ui.c.C(this.a, null, 0L, true, false, true, null, Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE);
                return;
            }
        }
        io.reactivex.rxjava3.disposables.b bVar = this.f;
        bVar.e();
        cVar.getClass();
        io.reactivex.rxjava3.subjects.f<mlp> fVar = com.vk.voip.ui.c.U;
        io.reactivex.rxjava3.core.w wVar = this.e;
        bVar.b(fVar.a0(wVar).subscribe(new oo20(new pb00(this, 4), 0)));
        io.reactivex.rxjava3.internal.operators.observable.j1 U = com.vk.voip.ui.c.H0(true).U(new z8(new x620(2), 20));
        nly nlyVar = new nly(this, 6);
        this.b.getClass();
        io.reactivex.rxjava3.internal.operators.observable.j1 U2 = GroupCallViewModel.f(nlyVar).U(new dg1(new f1s(this, 9), 28));
        io.reactivex.rxjava3.core.q o0 = com.vk.voip.ui.c.G0(true).U(new t34(new f410(this, 4), 20)).o0(new io.reactivex.rxjava3.internal.operators.single.v(new okb(this, 1)));
        o0.getClass();
        a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
        b.a aVar = io.reactivex.rxjava3.internal.functions.b.a;
        io.reactivex.rxjava3.internal.operators.observable.j1 U3 = new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.y(o0, qVar, aVar), qVar, aVar).s0(new ed(new zl20(this, 1), 25)).U(new m40(new z8f(this, 29), 25));
        it80.b.getClass();
        io.reactivex.rxjava3.core.q j = io.reactivex.rxjava3.core.q.j(U, U2, U3.o0(io.reactivex.rxjava3.core.x.k(it80.a.a())), io.reactivex.rxjava3.core.q.m(com.vk.voip.ui.c.k0.U(new d9(new n9w(4), 21)).o0(io.reactivex.rxjava3.core.x.k(Boolean.FALSE)), GroupCallViewModel.m.U(new lr(new sd4(26), 17)).U(new x34(new quz(4), 17)).o0(io.reactivex.rxjava3.core.x.k(1)), new b9(new id4(this, 8), 23)), new y34(new bki(1), 24));
        j.getClass();
        bVar.b(new io.reactivex.rxjava3.internal.operators.observable.y(j, qVar, aVar).a0(wVar).subscribe(new k5(new p010(this, 7), 28)));
    }
}
