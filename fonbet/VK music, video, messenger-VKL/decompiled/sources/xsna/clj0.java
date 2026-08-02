package xsna;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.metrics.trackers.my.event.SingleEvent;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.dto.profiles.VoipFriendStatus;
import com.vk.voip.dto.profiles.VoipSex;
import com.vk.voip.ui.members.VoipDataProvider;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.ffw0;
import xsna.gh8;
import xsna.ij20;
import xsna.rmy;

/* compiled from: SideEffectHandler.kt */
/* loaded from: classes7.dex */
public final class clj0 {
    public final com.vk.voip.b a;
    public final se8 b;
    public final xj8 c;
    public final bpn0 d;
    public final xv2 e;
    public final io.reactivex.rxjava3.core.w f;
    public final io.reactivex.rxjava3.core.w g;
    public io.reactivex.rxjava3.disposables.c h;
    public io.reactivex.rxjava3.disposables.c i;
    public io.reactivex.rxjava3.disposables.c j;
    public io.reactivex.rxjava3.disposables.c k;
    public io.reactivex.rxjava3.disposables.c l;
    public io.reactivex.rxjava3.disposables.c m;
    public io.reactivex.rxjava3.disposables.c n;
    public io.reactivex.rxjava3.disposables.c o;
    public final io.reactivex.rxjava3.disposables.b p;

    /* compiled from: SideEffectHandler.kt */
    public static final class a extends Exception {
        private final Throwable error;
        private final String id;
        private final String ownerId;

        public a(String str, String str2, Throwable th) {
            this.id = str;
            this.ownerId = str2;
            this.error = th;
        }

        public final Throwable d() {
            return this.error;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.id, aVar.id) && epx.f(this.ownerId, aVar.ownerId) && epx.f(this.error, aVar.error);
        }

        public final String g() {
            return this.id;
        }

        public final String h() {
            return this.ownerId;
        }

        public final int hashCode() {
            String str = this.id;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.ownerId;
            return this.error.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @Override // java.lang.Throwable
        public final String toString() {
            StringBuilder sb = new StringBuilder("LaunchException(id=");
            sb.append(this.id);
            sb.append(", ownerId=");
            sb.append(this.ownerId);
            sb.append(", error=");
            return oq.c(sb, this.error, ')');
        }
    }

    public clj0(com.vk.voip.b bVar, se8 se8Var, xj8 xj8Var, bpn0 bpn0Var, xv2 xv2Var) {
        this.a = bVar;
        this.b = se8Var;
        this.c = xj8Var;
        this.d = bpn0Var;
        this.e = xv2Var;
        asu0 asu0Var = asu0.a;
        this.f = asu0Var.c();
        this.g = asu0Var.d();
        this.p = new io.reactivex.rxjava3.disposables.b();
    }

    public static svw0 d(whr0 whr0Var) {
        int i;
        String str = whr0Var.a;
        bpn0 bpn0Var = cqm0.a;
        try {
            i = Integer.parseInt(str);
        } catch (Throwable unused) {
            i = 0;
        }
        if (i < 0) {
            return null;
        }
        String str2 = whr0Var.a;
        boolean z = false;
        sew0 sew0Var = whr0Var.b;
        VoipSex voipSex = whr0Var.c ? VoipSex.FEMALE : VoipSex.MALE;
        boolean z2 = whr0Var.d;
        if (whr0Var.g == VoipFriendStatus.FRIENDS) {
            z = true;
        }
        return new svw0(str2, sew0Var, voipSex, z2, z, whr0Var.e, false, false, whr0Var.f, whr0Var.h, whr0Var.i, whr0Var.l, whr0Var.m, whr0Var.q);
    }

    public final cfw0 a(rmy rmyVar) {
        boolean z = rmyVar instanceof rmy.a;
        se8 se8Var = this.b;
        if (!z) {
            if (!(rmyVar instanceof rmy.b)) {
                throw new NoWhenBranchMatchedException();
            }
            rmy.b bVar = (rmy.b) rmyVar;
            dfw0 a2 = se8Var.a(bVar.a, bVar.b);
            if (a2 != null) {
                return new cfw0(a2.a, a2.b, a2.c);
            }
            throw new IllegalArgumentException("Broadcast not found or created");
        }
        rmy.a aVar = (rmy.a) rmyVar;
        String str = aVar.a;
        String str2 = aVar.b;
        ffw0 ffw0Var = aVar.c;
        boolean z2 = aVar.d;
        se8Var.getClass();
        long parseLong = Long.parseLong(str);
        String str3 = "all";
        if (!ffw0Var.equals(ffw0.c.a.a)) {
            if (ffw0Var.equals(ffw0.c.b.a)) {
                str3 = "friends";
            } else if (ffw0Var.equals(ffw0.c.C2868c.a)) {
                str3 = "only_me";
            } else if (!ffw0Var.equals(ffw0.b.a.a)) {
                if (ffw0Var.equals(ffw0.b.C2867b.a)) {
                    str3 = "by_link";
                } else if (ffw0Var.equals(ffw0.b.e.a)) {
                    str3 = "members";
                } else if (ffw0Var.equals(ffw0.b.f.a)) {
                    str3 = "['members', 'by_link']";
                } else if (ffw0Var.equals(ffw0.b.d.a)) {
                    str3 = "editors";
                } else if (ffw0Var.equals(ffw0.b.c.a)) {
                    str3 = "donut";
                } else {
                    if (!ffw0Var.equals(ffw0.a.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str3 = null;
                }
            }
        }
        ij20.a aVar2 = new ij20.a();
        aVar2.c = "video.startStreaming";
        aVar2.b("name", str2);
        aVar2.b("is_call_record", z2 ? "1" : "0");
        if (parseLong < 0) {
            aVar2.f.put("group_id", Long.valueOf(-parseLong).toString());
        }
        if (parseLong > 0) {
            aVar2.f.put("user_id", Long.valueOf(parseLong).toString());
        }
        if (str3 != null) {
            aVar2.b("privacy_view", str3);
        }
        Integer num = 1;
        aVar2.f.put(NotificationCompat.CATEGORY_CALL, num.toString());
        aVar2.i = false;
        aVar2.g = 0;
        return (cfw0) se8Var.a.d(new ij20(aVar2), re8.b);
    }

    public final void b(gh8 gh8Var) {
        boolean z = gh8Var instanceof gh8.c;
        io.reactivex.rxjava3.disposables.b bVar = this.p;
        if (z) {
            io.reactivex.rxjava3.disposables.c cVar = this.h;
            if (cVar != null) {
                cVar.dispose();
            }
            this.h = null;
            io.reactivex.rxjava3.disposables.c cVar2 = this.i;
            if (cVar2 != null) {
                cVar2.dispose();
            }
            this.i = null;
            io.reactivex.rxjava3.disposables.c cVar3 = this.j;
            if (cVar3 != null) {
                cVar3.dispose();
            }
            this.j = null;
            io.reactivex.rxjava3.disposables.c cVar4 = this.k;
            if (cVar4 != null) {
                cVar4.dispose();
            }
            this.k = null;
            io.reactivex.rxjava3.disposables.c cVar5 = this.l;
            if (cVar5 != null) {
                cVar5.dispose();
            }
            this.l = null;
            io.reactivex.rxjava3.disposables.c cVar6 = this.m;
            if (cVar6 != null) {
                cVar6.dispose();
            }
            this.m = null;
            io.reactivex.rxjava3.disposables.c cVar7 = this.n;
            if (cVar7 != null) {
                cVar7.dispose();
            }
            this.n = null;
            io.reactivex.rxjava3.disposables.c cVar8 = this.o;
            if (cVar8 != null) {
                cVar8.dispose();
            }
            this.o = null;
            bVar.e();
            return;
        }
        boolean z2 = gh8Var instanceof gh8.i;
        xj8 xj8Var = this.c;
        if (z2) {
            io.reactivex.rxjava3.disposables.c cVar9 = this.h;
            if (cVar9 != null) {
                cVar9.dispose();
            }
            io.reactivex.rxjava3.core.q l = xj8Var.l(new x750(this, 25));
            l.getClass();
            this.h = new io.reactivex.rxjava3.internal.operators.observable.y(l, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).subscribe(new bdz(new mga0(this, 15), 21));
            return;
        }
        if (gh8Var instanceof gh8.l) {
            io.reactivex.rxjava3.disposables.c cVar10 = this.h;
            if (cVar10 != null) {
                cVar10.dispose();
            }
            this.h = null;
            return;
        }
        boolean z3 = gh8Var instanceof gh8.h;
        io.reactivex.rxjava3.core.w wVar = this.f;
        io.reactivex.rxjava3.core.w wVar2 = this.g;
        if (z3) {
            io.reactivex.rxjava3.disposables.c cVar11 = this.i;
            if (cVar11 != null) {
                cVar11.dispose();
            }
            this.i = io.reactivex.rxjava3.kotlin.c.e(new io.reactivex.rxjava3.internal.operators.single.n(xa4.I(new io.reactivex.rxjava3.internal.operators.single.b(new qca0(new e550(this, 29), 3)).q(wVar).m(wVar2), 0, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE), new f2u(new hij0(this, 1), 18)), new q130(this, 27), new zb60(this, 23));
            return;
        }
        if (gh8Var instanceof gh8.k) {
            io.reactivex.rxjava3.disposables.c cVar12 = this.i;
            if (cVar12 != null) {
                cVar12.dispose();
            }
            this.i = null;
            return;
        }
        if (gh8Var instanceof gh8.g) {
            gh8.g gVar = (gh8.g) gh8Var;
            io.reactivex.rxjava3.disposables.c cVar13 = this.j;
            if (cVar13 != null) {
                cVar13.dispose();
            }
            io.reactivex.rxjava3.disposables.c cVar14 = this.k;
            if (cVar14 != null) {
                cVar14.dispose();
            }
            this.j = io.reactivex.rxjava3.kotlin.c.f(1, io.reactivex.rxjava3.core.q.S(1L, 4, 0L, 1L, TimeUnit.SECONDS).U(new gs00(new gz30(19), 10)).a0(wVar2), new fy0(20, this, gVar), null, new mz80(13, this, gVar));
            return;
        }
        if (gh8Var instanceof gh8.j) {
            io.reactivex.rxjava3.disposables.c cVar15 = this.j;
            if (cVar15 != null) {
                cVar15.dispose();
            }
            this.j = null;
            io.reactivex.rxjava3.disposables.c cVar16 = this.k;
            if (cVar16 != null) {
                cVar16.dispose();
            }
            this.k = null;
            return;
        }
        if (gh8Var instanceof gh8.b.a) {
            bVar.e();
            CallMemberId c = xj8Var.c();
            hd8 a2 = xj8Var.a();
            if (a2 == null) {
                return;
            }
            bVar.b(new io.reactivex.rxjava3.internal.operators.observable.i0(xa4.H(new io.reactivex.rxjava3.internal.operators.observable.z1(new io.reactivex.rxjava3.internal.operators.observable.v(new io.reactivex.rxjava3.internal.operators.single.b(new qca0(new hse0(this, a2.a, a2.b, a2.d.equals(c)), 3)).w(), io.reactivex.rxjava3.core.q.C0(5000L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.a.a())), new hi70(new acc0(7), 5)), 0, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW).r0(wVar), new oe40(new j6e0(10), 10)).a0(wVar2).subscribe(new cp50(new k170(this, 25), 13)));
            bVar.b(xj8Var.l(new su80(this, 20)).a0(wVar2).subscribe(new y730(new alj0(this, 0), 12)));
            return;
        }
        if (gh8Var instanceof gh8.b.C2945b) {
            bVar.e();
            return;
        }
        if (gh8Var instanceof gh8.a.C2944a) {
            io.reactivex.rxjava3.disposables.c cVar17 = this.l;
            if (cVar17 != null) {
                cVar17.dispose();
            }
            hd8 a3 = xj8Var.a();
            CallMemberId callMemberId = a3 != null ? a3.d : null;
            if (callMemberId == null) {
                return;
            }
            io.reactivex.rxjava3.core.q l2 = xj8Var.l(new xk(29, this, callMemberId));
            igj0 igj0Var = new igj0(1, new z410(23));
            l2.getClass();
            this.l = new io.reactivex.rxjava3.internal.operators.observable.q2(new io.reactivex.rxjava3.internal.operators.mixed.o(new io.reactivex.rxjava3.internal.operators.observable.i0(l2, igj0Var).r0(wVar), new xhb0(new ya(29, this, callMemberId), 5)), new xb20(new nc90(13), 15)).a0(wVar2).subscribe(new fs00(new gda0(this, 16), 21));
            return;
        }
        if (gh8Var instanceof gh8.a.b) {
            io.reactivex.rxjava3.disposables.c cVar18 = this.l;
            if (cVar18 != null) {
                cVar18.dispose();
            }
            this.l = null;
            return;
        }
        if (gh8Var instanceof gh8.e.a) {
            io.reactivex.rxjava3.disposables.c cVar19 = this.m;
            if (cVar19 != null) {
                cVar19.dispose();
            }
            this.m = io.reactivex.rxjava3.kotlin.c.e(new io.reactivex.rxjava3.internal.operators.single.n(new io.reactivex.rxjava3.internal.operators.single.b(new qca0(new hbj0(this, 2), 3)).q(wVar).m(wVar2), new m330(new h630(this, 28), 22)), new qz40(this, 25), new qhg0(this, 4));
            return;
        }
        if (gh8Var instanceof gh8.e.b) {
            io.reactivex.rxjava3.disposables.c cVar20 = this.m;
            if (cVar20 != null) {
                cVar20.dispose();
            }
            this.m = null;
            return;
        }
        boolean z4 = gh8Var instanceof gh8.f.a;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        if (z4) {
            gh8.f.a aVar = (gh8.f.a) gh8Var;
            io.reactivex.rxjava3.disposables.c cVar21 = this.n;
            if (cVar21 != null) {
                cVar21.dispose();
            }
            final String str = aVar.a;
            final String str2 = aVar.b;
            final boolean z5 = aVar.c;
            final boolean z6 = aVar.d;
            final boolean d0 = drm0.d0(str2, '-');
            this.n = io.reactivex.rxjava3.kotlin.c.d(new io.reactivex.rxjava3.internal.operators.completable.w(new io.reactivex.rxjava3.internal.operators.completable.e(new cxd0(new gzs() { // from class: xsna.blj0
                @Override // xsna.gzs
                public final Object invoke() {
                    se8 se8Var = clj0.this.b;
                    String str3 = str;
                    String str4 = str2;
                    if (z5) {
                        se8Var.getClass();
                        ij20.a aVar2 = new ij20.a();
                        aVar2.c = "stories.createFromLive";
                        aVar2.b("video_id", str3);
                        aVar2.b("owner_id", str4);
                        aVar2.i = false;
                        aVar2.g = 0;
                        se8Var.a.f(new ij20(aVar2));
                    }
                    if (z6) {
                        UiTracker uiTracker = UiTracker.a;
                        String d = UiTracker.d();
                        se8Var.getClass();
                        ij20.a aVar3 = new ij20.a();
                        aVar3.c = "wall.post";
                        aVar3.b("owner_id", str4);
                        aVar3.b("attachments", "video" + str4 + '_' + str3);
                        aVar3.j("from_group", d0);
                        if (d.equals("nowhere")) {
                            com.vk.metrics.eventtracking.b.a.a(new IllegalArgumentException("Posting entryPoint screen is not set for UiTracker"));
                        } else {
                            aVar3.b("entry_point", d);
                        }
                        aVar3.b("entry_point", d);
                        aVar3.i = false;
                        aVar3.g = 0;
                        se8Var.a.f(new ij20(aVar3));
                        ConcurrentHashMap.KeySetView<Object, Boolean> keySetView = jt50.a;
                        jt50.a(SingleEvent.POST);
                    }
                    return s3q0.a;
                }
            }, 3)).q(wVar).o(wVar2), new uu60(new b7(25, this, aVar), 14), lVar, kVar, kVar, kVar, kVar), new jl4(20, this, aVar), new zkj0(0, this, aVar));
            return;
        }
        if (gh8Var instanceof gh8.f.b) {
            io.reactivex.rxjava3.disposables.c cVar22 = this.n;
            if (cVar22 != null) {
                cVar22.dispose();
            }
            this.n = null;
            return;
        }
        if (gh8Var instanceof gh8.d.a) {
            gh8.d.a aVar2 = (gh8.d.a) gh8Var;
            io.reactivex.rxjava3.disposables.c cVar23 = this.o;
            if (cVar23 != null) {
                cVar23.dispose();
            }
            this.o = io.reactivex.rxjava3.kotlin.c.d(new io.reactivex.rxjava3.internal.operators.completable.w(new io.reactivex.rxjava3.internal.operators.completable.e(new cxd0(new hj3(this, aVar2.a, aVar2.b, 4), 3)).q(wVar).o(wVar2), new m1r(new k22(22, this, aVar2), 28), lVar, kVar, kVar, kVar, kVar), new hn9(27, this, aVar2), new yl0(24, this, aVar2));
            return;
        }
        if (!(gh8Var instanceof gh8.d.b)) {
            throw new NoWhenBranchMatchedException();
        }
        io.reactivex.rxjava3.disposables.c cVar24 = this.o;
        if (cVar24 != null) {
            cVar24.dispose();
        }
        this.o = null;
    }

    public final fvw c() {
        qvw0 d;
        svw0 d2;
        boolean e = this.a.d().e();
        xj8 xj8Var = this.c;
        hd8 a2 = xj8Var.a();
        dfw0 dfw0Var = null;
        if (a2 == null) {
            return null;
        }
        CallMemberId callMemberId = a2.d;
        String str = a2.b;
        String str2 = callMemberId.b;
        bpn0 bpn0Var = this.d;
        if (e) {
            whr0 a3 = ((VoipDataProvider) bpn0Var.getValue()).a(str2);
            svw0 d3 = a3 != null ? d(a3) : null;
            boolean f = epx.f(str2, str);
            if (f) {
                d2 = d3;
            } else {
                if (f) {
                    throw new NoWhenBranchMatchedException();
                }
                whr0 a4 = ((VoipDataProvider) bpn0Var.getValue()).a(str);
                d2 = a4 != null ? d(a4) : null;
            }
            return new fvw(a2.a, a2.b, callMemberId, null, d2, d3, xj8Var.j(), xj8Var.h());
        }
        CallMemberId c = xj8Var.c();
        whr0 a5 = ((VoipDataProvider) bpn0Var.getValue()).a(str2);
        qvw0 d4 = a5 != null ? d(a5) : null;
        se8 se8Var = this.b;
        if (d4 == null) {
            d4 = se8Var.d(str2);
        }
        if (d4 == null) {
            throw new IllegalArgumentException("Unknown or non-existing initiator (initiatorId=" + callMemberId + ')');
        }
        boolean f2 = epx.f(str2, str);
        if (f2) {
            d = d4;
        } else {
            if (f2) {
                throw new NoWhenBranchMatchedException();
            }
            whr0 a6 = ((VoipDataProvider) bpn0Var.getValue()).a(str);
            d = a6 != null ? d(a6) : null;
            if (d == null) {
                d = se8Var.d(str);
            }
        }
        if (d == null) {
            throw new IllegalArgumentException(air.b(')', "Unknown or non-existing owner (ownerId=", str));
        }
        boolean equals = callMemberId.equals(c);
        if (equals) {
            dfw0Var = se8Var.a(a2.a, str);
        } else if (equals) {
            throw new NoWhenBranchMatchedException();
        }
        return new fvw(a2.a, a2.b, callMemberId, dfw0Var, d, d4, xj8Var.j(), xj8Var.h());
    }
}
