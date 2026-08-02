package xsna;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.soloader.MinElf;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.polls.PhotoPoll;
import com.vk.dto.polls.Poll;
import com.vk.dto.user.UserSex;
import com.vk.im.engine.models.attaches.AttachPoll;
import com.vk.im.engine.models.messages.CnvMsgId;
import com.vk.im.engine.models.messages.Msg;
import com.vk.poll.fragments.PollEditorFragment;
import com.vk.poll.fragments.PollResultsFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stories.design.view.polls.AbstractPollView;
import com.vk.webapp.fragments.ReportFragment;
import com.vkontakte.android.attachments.PollAttachment;
import xsna.kqb0;
import xsna.o0r0;

/* compiled from: MsgPartPollHolder.kt */
/* loaded from: classes2.dex */
public final class zs30 extends hr30<AttachPoll, at30> implements AbstractPollView.c, kqb0.a {
    public static final /* synthetic */ int j = 0;
    public final AbstractPollView d;
    public final Context e;
    public final fk30 f;
    public final PorterDuffColorFilter g;
    public at30 h;
    public pk30 i;

    /* compiled from: MsgPartPollHolder.kt */
    public static final class a implements asb0 {
        public static final a b = new a();

        @Override // xsna.asb0
        public final void b0(Poll poll) {
            ysg0.b.a(new zrb0(poll));
        }
    }

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class b implements View.OnLongClickListener {
        public b() {
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            zs30 zs30Var = zs30.this;
            pk30 pk30Var = zs30Var.i;
            at30 at30Var = zs30Var.h;
            Boolean bool = null;
            bool = null;
            bool = null;
            Msg msg = at30Var != null ? at30Var.p : null;
            Attach attach = at30Var != null ? at30Var.r : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.X(attach, msg, at30Var != null ? at30Var.q : null);
                bool = Boolean.TRUE;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
    }

    public zs30(AbstractPollView abstractPollView, Context context) {
        this.d = abstractPollView;
        this.e = context;
        abstractPollView.setPollViewCallback(this);
        abstractPollView.setRef(com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.IM));
        this.f = new fk30(context);
        this.g = new PorterDuffColorFilter(-1728053248, PorterDuff.Mode.SRC_ATOP);
    }

    @Override // com.vk.stories.design.view.polls.AbstractPollView.c
    public final void C3(Poll poll) {
        g2v.c().getClass();
        AttachPoll attachPoll = new AttachPoll(0, null, poll, 0L, 11, null);
        Serializer.c<Peer> cVar = Peer.CREATOR;
        Peer.Unknown unknown = Peer.Unknown.e;
        kbj0.e(nr4.b(), this.e, wdw.b(attachPoll, null, false, 6), false, null, false, unknown, 28);
    }

    @Override // com.vk.stories.design.view.polls.AbstractPollView.c
    public final boolean G4() {
        return o25.a().o().d == UserSex.FEMALE;
    }

    @Override // com.vk.stories.design.view.polls.AbstractPollView.c
    public final void J3(Poll poll, String str) {
        g2v.c().getClass();
        int i = PollEditorFragment.a.m;
        PollEditorFragment.a.C1520a.b(new PollAttachment(poll), str).k(this.e);
    }

    @Override // com.vk.stories.design.view.polls.AbstractPollView.c
    public final void J4(Poll poll) {
        g2v.c().getClass();
        new PollResultsFragment.a(poll, true).k(this.e);
    }

    @Override // com.vk.stories.design.view.polls.AbstractPollView.c
    public final /* bridge */ /* synthetic */ asb0 K2() {
        return a.b;
    }

    @Override // xsna.kqb0.a
    public final void d(kqb0 kqb0Var) {
        boolean a2 = kqb0Var.a();
        AbstractPollView abstractPollView = this.d;
        if (a2) {
            jjc.g(abstractPollView, new lw20(this, 2));
        } else {
            abstractPollView.n();
        }
    }

    @Override // com.vk.stories.design.view.polls.AbstractPollView.c
    public final void h3(Poll poll) {
        g2v.c().getClass();
        String str = poll.j ? "board_poll" : "poll";
        int i = poll.b;
        UserId userId = poll.c;
        int i2 = ReportFragment.a0;
        ReportFragment.a a2 = ReportFragment.b.a();
        a2.K(str);
        a2.D(i);
        a2.G(userId);
        a2.k(this.e);
    }

    @Override // xsna.hr30
    public final void p(at30 at30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        Poll poll;
        at30 at30Var2 = at30Var;
        kqb0 kqb0Var = at30Var2.o;
        this.i = pk30Var;
        this.h = at30Var2;
        f14 e = at30Var2.e(this.e);
        int i = e.a;
        int i2 = e.b;
        AbstractPollView abstractPollView = this.d;
        abstractPollView.m = i;
        abstractPollView.n = i2;
        CnvMsgId cnvMsgId = at30Var2.g;
        if (cnvMsgId != null) {
            abstractPollView.setVoteContext("peer_message" + at30Var2.f.d + '_' + cnvMsgId.b + '_' + cnvMsgId.c);
        }
        abstractPollView.f(at30Var2.h, false);
        abi0 abi0Var = at30Var2.n;
        boolean d = abi0Var != null ? abi0Var.d(Integer.valueOf(at30Var2.i)) : at30Var2.e;
        final boolean z = !d;
        abstractPollView.l(new wzs() { // from class: xsna.sg
            @Override // xsna.wzs
            public final Object invoke(Object obj, Object obj2) {
                com.vk.stories.design.view.polls.a aVar = (com.vk.stories.design.view.polls.a) obj;
                ((Integer) obj2).intValue();
                int i3 = AbstractPollView.S;
                boolean z2 = z;
                aVar.setClickable(z2);
                aVar.setLongClickable(z2);
                aVar.e.setClickable(z2);
                return s3q0.a;
            }
        });
        abstractPollView.r.setClickable(z);
        abstractPollView.x.setClickable(z);
        abstractPollView.C.setClickable(z);
        at30 at30Var3 = this.h;
        abstractPollView.setColorFilter(d ? ((at30Var3 == null || (poll = at30Var3.h) == null) ? null : poll.s) instanceof PhotoPoll ? this.g : this.f : null);
        if (kqb0Var != null) {
            if (kqb0Var.a()) {
                jjc.g(abstractPollView, new lw20(this, 2));
            } else {
                abstractPollView.n();
            }
        }
        if (kqb0Var != null) {
            kqb0Var.c(this);
        }
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        b bVar = new b();
        AbstractPollView abstractPollView = this.d;
        abstractPollView.setOnLongClickListener(bVar);
        return abstractPollView;
    }

    @Override // xsna.hr30
    public final void r() {
        kqb0 kqb0Var;
        at30 at30Var = this.h;
        if (at30Var != null && (kqb0Var = at30Var.o) != null) {
            kqb0Var.b(this);
        }
        this.i = null;
        this.h = null;
    }

    @Override // com.vk.stories.design.view.polls.AbstractPollView.c
    public final void s3(UserId userId) {
        g2v.c().d().m(this.e, userId, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
    }
}
