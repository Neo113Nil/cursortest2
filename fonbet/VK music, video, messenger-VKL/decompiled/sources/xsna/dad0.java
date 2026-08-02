package xsna;

import androidx.viewpager2.widget.ViewPager2;
import com.vk.voip.dto.call_member.CallMember;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import com.vk.voip.ui.groupcalls.list.ListGroupCallView;
import com.vk.voip.ui.groupcalls.list.primary.tab.a;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.webrtc.participant.movie.Movie;
import xsna.bbd0;
import xsna.el90;
import xsna.t9d0;
import xsna.tad0;

/* compiled from: PrimaryParticipantViewPagerHelper.kt */
/* loaded from: classes7.dex */
public final class dad0 {
    public final qfu a;
    public final ViewPager2 b;
    public final com.vk.voip.ui.groupcalls.list.primary.tab.c c;
    public final ha90 d;
    public final z9d0 e;
    public final t9d0 f;
    public final io.reactivex.rxjava3.disposables.b g;
    public io.reactivex.rxjava3.disposables.c h;
    public y990 i;
    public t9d0.a j;
    public tad0 k;
    public com.vk.voip.ui.groupcalls.list.primary.tab.a l;
    public kiu m;

    public dad0(ListGroupCallView listGroupCallView, u2x0 u2x0Var, qfu qfuVar, mc0 mc0Var) {
        this.a = qfuVar;
        ViewPager2 viewPager2 = (ViewPager2) listGroupCallView.findViewById(R.id.view_pager);
        this.b = viewPager2;
        this.c = new com.vk.voip.ui.groupcalls.list.primary.tab.c();
        ha90 ha90Var = new ha90(GroupCallViewModel.b, GroupCallViewModel.GroupCallViewMode.MainSpeakerAndThumbsViewMode);
        this.d = ha90Var;
        z9d0 z9d0Var = new z9d0(u2x0Var, new b630(this, 7), ha90Var, qfuVar, mc0Var);
        this.e = z9d0Var;
        this.f = new t9d0();
        this.g = new io.reactivex.rxjava3.disposables.b();
        this.j = new t9d0.a(0);
        viewPager2.setOffscreenPageLimit(2);
        viewPager2.b(new bad0(this));
        viewPager2.setAdapter(z9d0Var);
        viewPager2.setClipToOutline(true);
        ((cfn) qfuVar.b).c(new uh40(this, 15));
    }

    public final void a(kiu kiuVar) {
        if (epx.f(this.m, kiuVar)) {
            return;
        }
        this.m = kiuVar;
        c();
        io.reactivex.rxjava3.disposables.c cVar = this.h;
        if (cVar != null) {
            cVar.dispose();
        }
        this.h = null;
        if (kiuVar != null) {
            GroupCallViewModel groupCallViewModel = GroupCallViewModel.b;
            tju tjuVar = new tju(kiuVar, 22);
            groupCallViewModel.getClass();
            this.h = GroupCallViewModel.f(tjuVar).subscribe(new jsb0(new ggb0(this, 5), 5));
        }
        ((cfn) this.a.b).a();
    }

    public final void b() {
        tad0 tad0Var = this.k;
        if (tad0Var != null && tad0Var.c) {
            tad0Var.c = false;
            tad0.a aVar = tad0Var.d;
            if (aVar != null) {
                tad0Var.a.g(aVar);
            }
            tad0Var.d = null;
        }
        this.k = null;
        this.l = null;
    }

    public final void c() {
        t9d0.a aVar;
        kiu kiuVar = this.m;
        this.f.getClass();
        boolean z = true;
        if (kiuVar == null) {
            aVar = new t9d0.a(0);
        } else {
            ArrayList arrayList = new ArrayList();
            CallMemberId callMemberId = kiuVar.a.a;
            ParticipantId H = mnh0.H(callMemberId);
            Movie movie = (Movie) j5g.a0(kiuVar.a.s);
            el90.e eVar = movie == null ? null : new el90.e(H, movie);
            CallMember callMember = kiuVar.a;
            el90.b bVar = (!callMember.i || callMember.n) ? null : new el90.b(H);
            el90.a aVar2 = kiuVar.a.h ? new el90.a(H) : null;
            el90.d dVar = kiuVar.a.g ? new el90.d(H) : null;
            if (eVar != null) {
                arrayList.add(new bbd0.d(mnh0.E(eVar.a), eVar.b));
            }
            if (bVar != null) {
                arrayList.add(new bbd0.b(mnh0.E(bVar.b)));
            }
            if (aVar2 != null) {
                CallMemberId E = mnh0.E(aVar2.b);
                sew0 sew0Var = kiuVar.h;
                CallMember callMember2 = kiuVar.a;
                arrayList.add(new bbd0.a(E, (callMember2.k || callMember2.n) ? false : true, sew0Var));
            }
            if (dVar != null || (bVar == null && eVar == null && aVar2 == null)) {
                CallMember callMember3 = kiuVar.a;
                arrayList.add(new bbd0.c(callMemberId, callMember3.g, (callMember3.k || callMember3.n) ? false : true, kiuVar.h));
            }
            aVar = new t9d0.a(arrayList, bVar != null, eVar != null, kiuVar.a.a);
        }
        t9d0.a aVar3 = this.j;
        if (epx.f(aVar3.d, aVar.d)) {
            boolean z2 = aVar3.c;
            boolean z3 = aVar.c;
            if (z2 || !z3) {
                z = (aVar3.b || !aVar.b) ? false : true ^ z3;
            }
        }
        this.j = aVar;
        this.e.setItems(aVar.a);
        if (z) {
            this.b.post(new mf3(this, 9));
        }
        d();
    }

    public final void d() {
        a.C2055a c2055a;
        com.vk.voip.ui.groupcalls.list.primary.tab.a aVar = this.l;
        if (aVar != null) {
            List<bbd0> list = this.j.a;
            com.vk.voip.ui.groupcalls.list.primary.tab.c cVar = this.c;
            cVar.getClass();
            List<bbd0> list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            for (bbd0 bbd0Var : list2) {
                if (bbd0Var instanceof bbd0.b) {
                    c2055a = cVar.b;
                } else if (bbd0Var instanceof bbd0.c) {
                    c2055a = cVar.a;
                } else if (bbd0Var instanceof bbd0.d) {
                    c2055a = cVar.c;
                } else {
                    if (!(bbd0Var instanceof bbd0.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c2055a = cVar.d;
                }
                arrayList.add(c2055a);
            }
            aVar.setItems(arrayList);
        }
    }
}
