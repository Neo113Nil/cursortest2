package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.AdminLeaveAction;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupLeaveMode;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import io.reactivex.rxjava3.internal.functions.a;
import kotlin.NoWhenBranchMatchedException;
import xsna.e4h;
import xsna.oap;
import xsna.u6h;

/* compiled from: CommunityLeaveDelegateImpl.kt */
/* loaded from: classes5.dex */
public final class j7h implements b7h {
    public final Context a;
    public final gxh b;
    public final o0r0 c;
    public final a1w d;
    public final b3i e;
    public final wzs<UserId, Integer, s3q0> f;
    public final x2i g;
    public oap<ExtendedCommunityProfile, ? extends Group> h;
    public boolean i;

    /* JADX WARN: Multi-variable type inference failed */
    public j7h(Context context, gxh gxhVar, o0r0 o0r0Var, a1w a1wVar, b3i b3iVar, wzs<? super UserId, ? super Integer, s3q0> wzsVar, Fragment fragment, x2i x2iVar) {
        this.a = context;
        this.b = gxhVar;
        this.c = o0r0Var;
        this.d = a1wVar;
        this.e = b3iVar;
        this.f = wzsVar;
        this.g = x2iVar;
        if (fragment == null || !fragment.isAdded()) {
            return;
        }
        fragment.getParentFragmentManager().l0("LEAVE_ACTION_REQUEST", fragment, new iw3(this, 6));
    }

    @Override // xsna.b7h
    public final void a(Group group, String str, String str2) {
        e(new oap.b(group), str, str2, false);
    }

    @Override // xsna.b7h
    public final void c(ExtendedCommunityProfile extendedCommunityProfile, String str, String str2, boolean z) {
        e(new oap.a(extendedCommunityProfile), str, str2, z);
    }

    @SuppressLint({"CheckResult"})
    public final void d(oap<ExtendedCommunityProfile, ? extends Group> oapVar, String str, AdminLeaveAction adminLeaveAction, String str2) {
        boolean i = xus.i(oapVar);
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(new hqu(fkq0.a(xus.t(oapVar)), str, str2, adminLeaveAction, 16), null, null, 3);
        defpackage.n nVar = new defpackage.n(new defpackage.m(9, this, oapVar), 18);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        io.reactivex.rxjava3.internal.operators.observable.b0 E = y0.E(nVar, lVar, kVar, kVar);
        (this.i ? new io.reactivex.rxjava3.internal.operators.observable.c0(E, new defpackage.d(new pcg(this, 4), 18), kVar).C(new k66(this, 2)).F(new ir0(new com.vk.movika.sdk.base.observable.p(this, 29), 9)) : hg1.m(E, this.a, 0L, false, 62)).subscribe(new defpackage.p(new i7h(oapVar, this, i, 0), 17), new bg1(new lb(this, 29), 20));
        o1e0.a.a(new h8q0(xus.t(oapVar), true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(oap<ExtendedCommunityProfile, ? extends Group> oapVar, String str, String str2, boolean z) {
        boolean z2;
        this.h = oapVar;
        this.i = z;
        String str3 = str == null ? "community_page" : str;
        boolean p = xus.p(oapVar);
        if (oapVar instanceof oap.b) {
            z2 = ((Group) ((oap.b) oapVar).a).i;
        } else {
            if (!(oapVar instanceof oap.a)) {
                throw new NoWhenBranchMatchedException();
            }
            z2 = ((ExtendedCommunityProfile) ((oap.a) oapVar).a).s2;
        }
        if (z2 && xus.k(oapVar) == GroupLeaveMode.OPTIONS_SELECTOR) {
            oap<ExtendedCommunityProfile, ? extends Group> oapVar2 = this.h;
            if (oapVar2 == null) {
                oapVar2 = null;
            }
            new u6h.a(this.a, str3, str2, xus.j(oapVar2).booleanValue(), null, 96).I0(null);
            return;
        }
        if (!z2 || p || xus.k(oapVar) != GroupLeaveMode.NO_MODE_ALERT) {
            f(oapVar, str, null, str2);
            return;
        }
        yy0 yy0Var = new yy0(this, str3, str2, 2);
        oap<ExtendedCommunityProfile, ? extends Group> oapVar3 = this.h;
        lzy.a(this.a, yy0Var, xus.j(oapVar3 != null ? oapVar3 : null).booleanValue()).m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        if (r4.p == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0063, code lost:
    
        if (r4.Z == 2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x001d, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x002c, code lost:
    
        if (((com.vkontakte.android.api.ExtendedCommunityProfile) ((xsna.oap.a) r10).a).a1 == 4) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (((com.vk.dto.group.Group) ((xsna.oap.b) r10).a).C == 4) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(oap<ExtendedCommunityProfile, ? extends Group> oapVar, String str, AdminLeaveAction adminLeaveAction, String str2) {
        boolean z;
        boolean z2;
        if (str == null) {
            str = "community_page";
        }
        String str3 = str;
        boolean p = xus.p(oapVar);
        boolean z3 = oapVar instanceof oap.b;
        boolean z4 = true;
        if (!z3) {
            if (!(oapVar instanceof oap.a)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        boolean z5 = p || z;
        if (!xus.n(oapVar)) {
            if (z3) {
                Group group = (Group) ((oap.b) oapVar).a;
                if (group.C()) {
                }
                z2 = false;
                boolean z6 = xus.k(oapVar) == null;
                o0r0 o0r0Var = this.c;
                if (!z5) {
                    o0r0Var.h0().f(xus.o(oapVar), new iy7(this, oapVar, str3, adminLeaveAction, str2, 1));
                    return;
                }
                if (z2) {
                    o0r0Var.h0().g(this.a, new e7h(this, oapVar, str3, str2, 0), xus.n(oapVar));
                    return;
                }
                e4h h0 = o0r0Var.h0();
                boolean o = xus.o(oapVar);
                if (z3) {
                    z4 = ((Group) ((oap.b) oapVar).a).C();
                } else {
                    if (!(oapVar instanceof oap.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (((ExtendedCommunityProfile) ((oap.a) oapVar).a).Z != 2) {
                        z4 = false;
                    }
                }
                h0.d(new e4h.a(o, z4, z6), new g7h(this, oapVar, str3, adminLeaveAction, str2), new h7h(this, oapVar, str3, adminLeaveAction, str2));
                return;
            }
            if (!(oapVar instanceof oap.a)) {
                throw new NoWhenBranchMatchedException();
            }
            ExtendedCommunityProfile extendedCommunityProfile = (ExtendedCommunityProfile) ((oap.a) oapVar).a;
            if (extendedCommunityProfile.Y == 0) {
            }
            z2 = false;
            if (xus.k(oapVar) == null) {
            }
            o0r0 o0r0Var2 = this.c;
            if (!z5) {
            }
        }
        if (xus.i(oapVar)) {
            z2 = true;
            if (xus.k(oapVar) == null) {
            }
            o0r0 o0r0Var22 = this.c;
            if (!z5) {
            }
        }
        z2 = false;
        if (xus.k(oapVar) == null) {
        }
        o0r0 o0r0Var222 = this.c;
        if (!z5) {
        }
    }
}
