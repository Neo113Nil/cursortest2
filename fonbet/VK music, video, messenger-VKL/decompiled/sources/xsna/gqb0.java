package xsna;

import android.content.Context;
import android.os.Handler;
import android.view.ViewGroup;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.polls.PhotoPoll;
import com.vk.dto.polls.Poll;
import com.vk.dto.polls.PollBackground;
import com.vk.dto.user.UserSex;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.poll.fragments.PollEditorFragment;
import com.vk.poll.fragments.PollResultsFragment;
import com.vk.sharing.api.di.SharingComponent;
import com.vk.sharing.api.dto.ActionsInfo;
import com.vk.sharing.api.dto.AttachmentInfo;
import com.vk.stories.design.view.polls.AbstractPollView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PollAttachment;
import java.util.Collections;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.gd60;

/* compiled from: PollHolder.kt */
/* loaded from: classes4.dex */
public final class gqb0 extends m56<PollAttachment> implements AbstractPollView.c, w8i {
    public final String D;
    public final AbstractPollView E;
    public final Object F;
    public final Object G;

    /* compiled from: PollHolder.kt */
    public static final class a implements asb0 {
        public static final Handler d = new Handler();
        public final PollAttachment b;
        public final p870 c;

        public a(PollAttachment pollAttachment, p870 p870Var) {
            this.b = pollAttachment;
            this.c = p870Var;
        }

        @Override // xsna.asb0
        public final void b0(Poll poll) {
            PollAttachment pollAttachment = this.b;
            Poll poll2 = pollAttachment.f;
            if (poll2.b == poll.b && epx.f(poll2.c, poll.c)) {
                pollAttachment.f = poll;
                ysg0.b.a(new zrb0(poll));
                d.postDelayed(new hv1(this, 12), 600L);
            }
        }
    }

    public gqb0(ViewGroup viewGroup, String str) {
        super(R.layout.attach_poll, viewGroup);
        this.D = str;
        AbstractPollView abstractPollView = (AbstractPollView) this.itemView.findViewById(R.id.poll_view);
        abstractPollView.setPollViewCallback(this);
        this.E = abstractPollView;
        k7y k7yVar = new k7y(this, 25);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.F = msy.a(lazyThreadSafetyMode, k7yVar);
        this.G = msy.a(lazyThreadSafetyMode, new ubw(this, 26));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.stories.design.view.polls.AbstractPollView.c
    public final void C3(Poll poll) {
        ?? r0 = this.F;
        AttachmentInfo e = ((SharingComponent) r0.getValue()).u().e(poll);
        ActionsInfo h = ((SharingComponent) r0.getValue()).v().h();
        tbj0 a2 = ((SharingComponent) r0.getValue()).F2().a(this.itemView.getContext());
        a2.c = e;
        a2.d = h;
        a2.c();
    }

    @Override // com.vk.stories.design.view.polls.AbstractPollView.c
    public final boolean G4() {
        return hd60.a().a().w() == UserSex.FEMALE;
    }

    @Override // com.vk.stories.design.view.polls.AbstractPollView.c
    public final void J3(Poll poll, String str) {
        int i = PollEditorFragment.a.m;
        PollEditorFragment.a.C1520a.b(new PollAttachment(poll), str).k(this.itemView.getContext());
    }

    @Override // com.vk.stories.design.view.polls.AbstractPollView.c
    public final void J4(Poll poll) {
        new PollResultsFragment.a(poll, true).k(this.itemView.getContext());
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.stories.design.view.polls.AbstractPollView.c
    public final asb0 K2() {
        PollAttachment pollAttachment = (PollAttachment) this.C;
        if (pollAttachment != null) {
            return new a(pollAttachment, (p870) this.G.getValue());
        }
        return null;
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        AbstractPollView abstractPollView = this.E;
        abstractPollView.H = s6oVar;
        og ogVar = abstractPollView.I;
        ba baVar = s6oVar.e;
        abstractPollView.N = s6oVar.a(ogVar, baVar);
        abstractPollView.O = s6oVar.a(abstractPollView.J, baVar);
        abstractPollView.P = s6oVar.a(abstractPollView.K, baVar);
        abstractPollView.Q = s6oVar.a(abstractPollView.L, baVar);
        abstractPollView.R = s6oVar.a(abstractPollView.M, baVar);
        abstractPollView.n();
    }

    @Override // xsna.m56
    public final void T6(PollAttachment pollAttachment) {
        String str;
        Poll poll = pollAttachment.f;
        sr10 sr10Var = dy2.a;
        if (!(sr10Var != null ? sr10Var.c() : true) && !this.t) {
            PollBackground pollBackground = poll.s;
            if (pollBackground instanceof PhotoPoll) {
                PhotoPoll photoPoll = (PhotoPoll) pollBackground;
                int i = photoPoll.b;
                List<ImageSize> list = photoPoll.d;
                int i2 = photoPoll.c;
                ImageSize imageSize = (ImageSize) ixj0.m(list);
                if (imageSize == null) {
                    imageSize = list.get(0);
                }
                poll = Poll.zb(poll, null, null, null, 0, 0L, false, new PhotoPoll(i, i2, Collections.singletonList(imageSize)), null, null, 4063231);
            }
        }
        int i3 = AbstractPollView.S;
        AbstractPollView abstractPollView = this.E;
        abstractPollView.f(poll, false);
        String str2 = this.D;
        if (str2 == null && (str2 = this.u) == null) {
            str2 = "poll";
        }
        abstractPollView.setRef(str2);
        u1c0 j6 = j6();
        NewsEntry newsEntry = j6 != null ? j6.a : null;
        if (newsEntry == null) {
            newsEntry = null;
        }
        if (newsEntry == null) {
            newsEntry = this.p;
        }
        Post post = newsEntry instanceof Post ? (Post) newsEntry : null;
        abstractPollView.setTrackCode(post != null ? post.L.b : null);
        u1c0 j62 = j6();
        NewsEntry newsEntry2 = j62 != null ? j62.a : null;
        NewsEntry newsEntry3 = newsEntry2 != null ? newsEntry2 : null;
        if (newsEntry3 == null) {
            newsEntry3 = this.p;
        }
        if (newsEntry3 == null || (str = newsEntry3.Ab()) == null) {
            str = "wall";
        }
        abstractPollView.setVoteContext(str);
    }

    @Override // com.vk.stories.design.view.polls.AbstractPollView.c
    public final void h3(Poll poll) {
        gd60 a2 = hd60.a();
        Context context = this.itemView.getContext();
        String str = poll.j ? "board_poll" : "poll";
        Integer valueOf = Integer.valueOf(poll.b);
        UserId userId = poll.c;
        gd60.a aVar = gd60.a;
        a2.L0(context, str, valueOf, userId);
    }

    @Override // com.vk.stories.design.view.polls.AbstractPollView.c
    public final void s3(UserId userId) {
        gd60.Z0(hd60.a(), this.itemView.getContext(), userId, null, null, 12);
    }
}
