package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.vk.dto.group.AdminLeaveAction;
import com.vk.profile.community.core.communityleave.LeaveAction;
import kotlin.Pair;
import xsna.dw20;
import xsna.mk50;
import xsna.t7h;

/* compiled from: CommunityLeaveBottomSheet.kt */
/* loaded from: classes5.dex */
public final class u6h extends tl50<k7h, t7h, t6h> {
    public static final /* synthetic */ int m1 = 0;
    public s7h i1;
    public x6h j1;
    public xqi<t7h.a> k1;
    public izs<? super b, s3q0> l1;

    /* compiled from: CommunityLeaveBottomSheet.kt */
    public static final class a extends dw20.b {
        public final String e;
        public final String f;
        public final String g;
        public final boolean h;
        public final izs<b, s3q0> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, String str, String str2, boolean z, nvg nvgVar, int i) {
            super(context, tzp0.a(null, 3));
            String str3 = (i & 2) != 0 ? null : "LEAVE_ACTION_REQUEST";
            str = (i & 4) != 0 ? null : str;
            str2 = (i & 8) != 0 ? null : str2;
            nvgVar = (i & 32) != 0 ? null : nvgVar;
            this.e = str3;
            this.f = str;
            this.g = str2;
            this.h = z;
            this.i = nvgVar;
            x(0);
            F0(true);
            B(cn70.b(12), true, true);
            c(new cpo(false, 0, 6));
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            u6h u6hVar = new u6h();
            u6hVar.setArguments(yfb.b(new Pair("request_key", this.e), new Pair("source", this.f), new Pair("track_code", this.g), new Pair("has_payment_cabinet", Boolean.valueOf(this.h))));
            u6hVar.l1 = this.i;
            return u6hVar;
        }
    }

    /* compiled from: CommunityLeaveBottomSheet.kt */
    public static final class b {
        public final AdminLeaveAction a;

        public b(AdminLeaveAction adminLeaveAction, String str, String str2) {
            this.a = adminLeaveAction;
        }
    }

    /* compiled from: CommunityLeaveBottomSheet.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LeaveAction.values().length];
            try {
                iArr[LeaveAction.STAY_ADMIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LeaveAction.REJECT_ADMIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        Context requireContext = requireContext();
        xqi<t7h.a> xqiVar = this.k1;
        if (xqiVar == null) {
            xqiVar = null;
        }
        s7h s7hVar = new s7h(requireContext, this, xqiVar);
        this.i1 = s7hVar;
        return new mk50.c(s7hVar.c());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        t7h t7hVar = (t7h) ao50Var;
        s7h s7hVar = this.i1;
        if (s7hVar == null) {
            s7hVar = null;
        }
        s7hVar.f(t7hVar, new e15(1, this, u6h.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 5));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((k7h) vk50Var).f.a(new o1g(1, this, u6h.class, "dispatchSideEffect", "dispatchSideEffect(Lcom/vk/profile/community/core/communityleave/CommunityLeaveSideEffect;)V", 0, 1), this);
    }

    @Override // xsna.tl50
    public final void Yn(t7h t7hVar, View view) {
        t7h t7hVar2 = t7hVar;
        x6h x6hVar = this.j1;
        if (x6hVar == null) {
            x6hVar = null;
        }
        x6hVar.f(t7hVar2, new vze(1, this, u6h.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 1));
    }

    @Override // xsna.tl50
    public final mk50 Zn() {
        Context requireContext = requireContext();
        xqi<t7h.a> xqiVar = this.k1;
        if (xqiVar == null) {
            xqiVar = null;
        }
        x6h x6hVar = new x6h(requireContext, this, xqiVar);
        this.j1 = x6hVar;
        return new mk50.c(x6hVar.c());
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Bundle arguments = getArguments();
        k7h k7hVar = new k7h(arguments != null ? arguments.getBoolean("has_payment_cabinet", false) : false);
        cm50<VS, P, S> cm50Var = k7hVar.c;
        this.k1 = new xqi<>(t7h.a.b.a, this, e43.l(((t7h) cm50Var.g()).a, ((t7h) cm50Var.g()).b));
        return k7hVar;
    }
}
