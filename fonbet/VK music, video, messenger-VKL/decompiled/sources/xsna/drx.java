package xsna;

import com.vk.api.generated.groups.dto.GroupsFriendInvitationDto;
import com.vk.api.generated.groups.dto.GroupsGetFriendsInvitationListInvitationStatusDto;
import com.vk.api.generated.groups.dto.GroupsGetFriendsInvitationListResponseDto;
import com.vk.dto.common.id.UserId;
import com.vk.friends.groupinvite.api.domain.InviteFriendsAnalytics;
import com.vk.friends.groupinvite.impl.models.FriendInvitationState;
import com.vk.friends.groupinvite.impl.models.InviteFriendsTabIndex;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.a7f0;
import xsna.asx;
import xsna.brx;
import xsna.erx;
import xsna.gqx;
import xsna.kis;
import xsna.orx;
import xsna.tlo0;

/* compiled from: InviteFriendsFeature.kt */
/* loaded from: classes14.dex */
public final class drx extends wk50<lsx, erx, gqx, orx> {
    public final UserId f;
    public final InviteFriendsAnalytics.InviteFriendsSource g;
    public final uy9 h;
    public final mzp0 i;
    public final boolean j;
    public final f4z k;
    public final kis l;
    public final vqx m;
    public io.reactivex.rxjava3.disposables.c n;
    public final io.reactivex.rxjava3.subjects.d<s3q0> o;

    /* compiled from: InviteFriendsFeature.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InviteFriendsTabIndex.values().length];
            try {
                iArr[InviteFriendsTabIndex.NOT_INVITED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InviteFriendsTabIndex.SELECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InviteFriendsTabIndex.INVITED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public drx(UserId userId, InviteFriendsAnalytics.InviteFriendsSource inviteFriendsSource, uy9 uy9Var, mzp0 mzp0Var, boolean z) {
        super(gqx.b.b, new prx(erx.b.b));
        this.f = userId;
        this.g = inviteFriendsSource;
        this.h = uy9Var;
        this.i = mzp0Var;
        this.j = z;
        this.k = new f4z();
        this.l = new kis();
        this.m = new vqx();
        this.o = io.reactivex.rxjava3.subjects.d.O0(s3q0.a);
    }

    @Override // xsna.wk50
    public final void N(erx erxVar, gqx gqxVar) {
        erx erxVar2 = erxVar;
        gqx gqxVar2 = gqxVar;
        if (gqxVar2 instanceof gqx.b) {
            this.m.a(Math.abs(this.f.b), this.g);
            T(new orx.b());
            U(null, new crx(this, erxVar2, this.j, 0));
            return;
        }
        if (gqxVar2 instanceof gqx.d) {
            InviteFriendsTabIndex inviteFriendsTabIndex = ((gqx.d) gqxVar2).b;
            T(new orx.c.b(inviteFriendsTabIndex));
            InviteFriendsTabIndex inviteFriendsTabIndex2 = InviteFriendsTabIndex.INVITED;
            if (inviteFriendsTabIndex == inviteFriendsTabIndex2 && (frx.e(erxVar2, inviteFriendsTabIndex2).c instanceof asx.b)) {
                T(new orx.c.C3467c(inviteFriendsTabIndex2, asx.d.a));
                V(null, erxVar2);
                return;
            }
            return;
        }
        boolean z = gqxVar2 instanceof gqx.a;
        f4z f4zVar = this.k;
        if (z) {
            f4zVar.b(brx.a.a);
            return;
        }
        if (gqxVar2 instanceof gqx.c) {
            gqx.c cVar = (gqx.c) gqxVar2;
            InviteFriendsTabIndex inviteFriendsTabIndex3 = cVar.b;
            String str = cVar.c;
            if (str == null) {
                return;
            }
            int i = a.$EnumSwitchMapping$0[inviteFriendsTabIndex3.ordinal()];
            if (i == 1) {
                U(str, new ju(8, this, erxVar2));
                return;
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    V(str, erxVar2);
                    return;
                }
                return;
            }
        }
        boolean z2 = gqxVar2 instanceof iqx;
        uy9 uy9Var = this.h;
        if (z2) {
            iqx iqxVar = (iqx) gqxVar2;
            UserId userId = iqxVar.b;
            a7f0.a.e(this, rsg0.T(yfb.x(((zqu) uy9Var.c).k((UserId) uy9Var.b, userId))).U(new rj4(new af2(29), 18)), null, new uad(this, userId, iqxVar.c, iqxVar.d, 1), new frg(this, 25), null, 9);
            return;
        }
        if (gqxVar2 instanceof jqx) {
            UserId userId2 = ((jqx) gqxVar2).b;
            if (!frx.a(erxVar2, userId2)) {
                tlo0.Companion.getClass();
                Y(new tlo0.f(R.string.invite_friends_error_user_not_allowed_to_invite));
                return;
            }
            lps g = frx.g(erxVar2);
            if (g.a <= g.b.size()) {
                tlo0.Companion.getClass();
                Y(new tlo0.f(R.string.invite_friends_error_limit_overflow));
                return;
            } else {
                ArrayList arrayList = new ArrayList(frx.d(erxVar2));
                arrayList.add(userId2);
                T(new orx.c.a(arrayList));
                return;
            }
        }
        if (gqxVar2 instanceof hqx) {
            UserId userId3 = ((hqx) gqxVar2).b;
            ArrayList arrayList2 = new ArrayList(frx.d(erxVar2));
            arrayList2.remove(userId3);
            T(new orx.c.a(arrayList2));
            return;
        }
        if (gqxVar2 instanceof tqx) {
            List<UserId> d = frx.d(erxVar2);
            if (d.isEmpty()) {
                return;
            }
            UserId userId4 = (UserId) uy9Var.b;
            if20 if20Var = new if20("groups.invite", 2);
            if20Var.F(userId4, "group_id");
            if20Var.M("user_ids_list", d);
            a7f0.a.e(this, rsg0.T(if20Var).U(new qj4(new g53(23), 19)), null, new igh(this, 20), new dwg(this, 25), null, 9);
            return;
        }
        if (gqxVar2 instanceof kqx) {
            T(orx.d.b.b);
            return;
        }
        if (gqxVar2.equals(mqx.b)) {
            T(orx.d.h.b);
            return;
        }
        if (gqxVar2.equals(nqx.b)) {
            T(orx.d.c.b);
            return;
        }
        if (gqxVar2 instanceof oqx) {
            X(((oqx) gqxVar2).b, erxVar2);
            return;
        }
        if (gqxVar2 instanceof lqx) {
            String str2 = ((lqx) gqxVar2).c;
            if (str2 == null) {
                return;
            }
            String str3 = erxVar2 instanceof erx.c ? ((erx.c) erxVar2).d.c : "";
            io.reactivex.rxjava3.disposables.c cVar2 = this.n;
            if (cVar2 != null) {
                cVar2.dispose();
            }
            a7f0.a.e(this, uy9Var.d(str3, str2), null, new zq0(new wqb(9, this, erxVar2), 4), new rop(this, 10), null, 9);
            return;
        }
        if (gqxVar2 instanceof pqx) {
            jis jisVar = ((pqx) gqxVar2).b;
            if (!frx.a(erxVar2, jisVar.a)) {
                tlo0.Companion.getClass();
                Y(new tlo0.f(R.string.invite_friends_error_user_not_allowed_to_invite));
                return;
            }
            lps g2 = frx.g(erxVar2);
            if (g2.a > g2.b.size()) {
                T(new orx.d.i(jisVar));
                return;
            } else {
                tlo0.Companion.getClass();
                Y(new tlo0.f(R.string.invite_friends_error_limit_overflow));
                return;
            }
        }
        if (gqxVar2.equals(qqx.b)) {
            f4zVar.b(brx.b.a);
            return;
        }
        if (gqxVar2 instanceof rqx) {
            String str4 = ((rqx) gqxVar2).b;
            if (str4 == null || drm0.N(str4)) {
                return;
            }
            if (!(erxVar2 instanceof erx.c ? ((erx.c) erxVar2).d : new uyh0(0)).a) {
                T(orx.d.h.b);
            }
            X(str4, erxVar2);
            return;
        }
        if (gqxVar2 instanceof sqx) {
            T(new orx.c.a(EmptyList.b));
        } else {
            if (!(gqxVar2 instanceof uqx)) {
                throw new NoWhenBranchMatchedException();
            }
            lps lpsVar = erxVar2 instanceof erx.c ? ((erx.c) erxVar2).c : null;
            T(new orx.c.a(rli0.A(new ulp0(rli0.y(rli0.j(new i5g(frx.c(erxVar2)), new qm0(21)), lpsVar != null ? lpsVar.a : Integer.MAX_VALUE), new ht(27)))));
        }
    }

    public final void U(String str, izs<? super GroupsGetFriendsInvitationListResponseDto, s3q0> izsVar) {
        a7f0.a.e(this, new io.reactivex.rxjava3.internal.operators.observable.c0(this.h.d(null, str), new qs2(new l2i(this, 21), 20), io.reactivex.rxjava3.internal.functions.a.c), null, new defpackage.c(19, this, izsVar), new wpg(this, 21), null, 9);
    }

    public final void V(String str, erx erxVar) {
        cq3 cq3Var = new cq3(16, this, erxVar);
        uy9 uy9Var = this.h;
        a7f0.a.e(this, rsg0.T(yfb.x(((zqu) uy9Var.c).n((UserId) uy9Var.b, GroupsGetFriendsInvitationListInvitationStatusDto.INVITED, null, str, null))), null, new zkh(cq3Var, 26), new m1k(this, 18), null, 9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [xsna.jis] */
    public final ArrayList W(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GroupsFriendInvitationDto groupsFriendInvitationDto = (GroupsFriendInvitationDto) it.next();
            this.l.getClass();
            UserId d = groupsFriendInvitationDto.d();
            GroupsGetFriendsInvitationListInvitationStatusDto groupsGetFriendsInvitationListInvitationStatusDto = null;
            if (d != null) {
                String g = groupsFriendInvitationDto.g();
                if (g == null) {
                    g = "";
                }
                StringBuilder sb = new StringBuilder();
                String f = groupsFriendInvitationDto.f();
                if (f == null) {
                    f = "";
                }
                sb.append(f);
                sb.append(' ');
                String i = groupsFriendInvitationDto.i();
                sb.append(i != null ? i : "");
                String obj = drm0.p0(sb.toString()).toString();
                String e = groupsFriendInvitationDto.e();
                if (e != null) {
                    GroupsGetFriendsInvitationListInvitationStatusDto[] values = GroupsGetFriendsInvitationListInvitationStatusDto.values();
                    int length = values.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        }
                        GroupsGetFriendsInvitationListInvitationStatusDto groupsGetFriendsInvitationListInvitationStatusDto2 = values[i2];
                        if (epx.f(groupsGetFriendsInvitationListInvitationStatusDto2.i(), e)) {
                            groupsGetFriendsInvitationListInvitationStatusDto = groupsGetFriendsInvitationListInvitationStatusDto2;
                            break;
                        }
                        i2++;
                    }
                }
                int i3 = groupsGetFriendsInvitationListInvitationStatusDto == null ? -1 : kis.a.$EnumSwitchMapping$0[groupsGetFriendsInvitationListInvitationStatusDto.ordinal()];
                groupsGetFriendsInvitationListInvitationStatusDto = new jis(d, g, obj, i3 != 1 ? i3 != 2 ? i3 != 3 ? FriendInvitationState.NOT_INVITED : FriendInvitationState.NOT_INVITED : FriendInvitationState.ACCEPTED : FriendInvitationState.INVITED, false, true, epx.f(groupsFriendInvitationDto.j(), Boolean.TRUE));
            }
            if (groupsGetFriendsInvitationListInvitationStatusDto != null) {
                arrayList.add(groupsGetFriendsInvitationListInvitationStatusDto);
            }
        }
        return arrayList;
    }

    public final void X(String str, erx erxVar) {
        if (epx.f(str, erxVar instanceof erx.c ? ((erx.c) erxVar).d.c : "")) {
            return;
        }
        T(new orx.d.f(str));
        s3q0 s3q0Var = s3q0.a;
        io.reactivex.rxjava3.subjects.d<s3q0> dVar = this.o;
        dVar.onNext(s3q0Var);
        io.reactivex.rxjava3.disposables.c cVar = this.n;
        if (cVar != null) {
            cVar.dispose();
        }
        this.n = a7f0.a.e(this, dVar.y(1000L, TimeUnit.MILLISECONDS), null, new defpackage.l(this, str, erxVar, 2), new y8(25), null, 9);
    }

    public final void Y(tlo0 tlo0Var) {
        if (tlo0Var == null) {
            tlo0Var = tq.h(tlo0.Companion, R.string.error);
        }
        this.k.b(new brx.c(tlo0Var));
    }
}
