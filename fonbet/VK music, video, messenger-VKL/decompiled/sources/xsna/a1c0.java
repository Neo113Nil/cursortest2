package xsna;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.api.comments.CommentsOrder;
import com.vk.common.links.LinksParserData;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.data.LikeInfo;
import com.vk.dto.newsfeed.CommentsInfo;
import com.vk.dto.newsfeed.PostDonut;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.photo.Photo;
import com.vk.dto.user.UserProfile;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.lists.ListDataSet;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.newsfeed.impl.newsfeed_post.presentation.fragment.PostFragment;
import com.vk.newsfeed.impl.presenters.PostCommentsPresenter$receiver$1;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.PodcastAttachment;
import java.util.Iterator;
import java.util.List;
import xsna.a1c0;
import xsna.epx;
import xsna.lfg;
import xsna.pij0;
import xsna.t4c0;
import xsna.zou;

/* compiled from: PostCommentsPresenter.kt */
/* loaded from: classes4.dex */
public final class a1c0 implements c9c0 {
    public final PostFragment b;
    public final zf20 c;
    public NewsEntry d;
    public String e;
    public int f;
    public lfg i;
    public final pij0.a g = new pij0.a(new gd70(this, 11));
    public final yfg h = new yfg(new qw6(this, 13));
    public final ListDataSet<u1c0> j = new ListDataSet<>();
    public final PostCommentsPresenter$receiver$1 k = new BroadcastReceiver() { // from class: com.vk.newsfeed.impl.presenters.PostCommentsPresenter$receiver$1
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            lfg lfgVar;
            String action = intent.getAction();
            boolean f = epx.f(action, zou.a);
            a1c0 a1c0Var = a1c0.this;
            if (!f) {
                if (epx.f(action, "com.vkontakte.android.STICKERS_ANIMATION_ENABLED_CHANGED")) {
                    a1c0Var.b.c4();
                }
            } else {
                UserProfile userProfile = (UserProfile) intent.getParcelableExtra(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
                if (userProfile == null || (lfgVar = a1c0Var.i) == null) {
                    return;
                }
                lfgVar.e8(userProfile.c, true);
            }
        }
    };
    public final ek40 l = new ek40();
    public final io.reactivex.rxjava3.disposables.b m = new io.reactivex.rxjava3.disposables.b();
    public final MusicPlaybackLaunchContext n = MusicPlaybackLaunchContext.r.Eb(128);
    public final LinksParserData o = hd60.a().W0();

    /* JADX WARN: Type inference failed for: r3v4, types: [com.vk.newsfeed.impl.presenters.PostCommentsPresenter$receiver$1] */
    public a1c0(PostFragment postFragment, zf20 zf20Var) {
        this.b = postFragment;
        this.c = zf20Var;
        his0.d++;
        if (his0.c == null || !(!r3.h())) {
            his0.c = wjs0.b.a0(asu0.a.d()).subscribe(new e7q0(new puq0(4), 5));
        }
    }

    @Override // xsna.c9c0
    public final void D1(List<LikeInfo> list) {
        y8c0 y8c0Var = (y8c0) this.c.invoke();
        y8c0Var.c().b(new t4c0.d.a(list));
    }

    @Override // xsna.c9c0
    public final void H3() {
        z0c0 z0c0Var = new z0c0(0);
        ListDataSet<u1c0> listDataSet = this.j;
        int w = listDataSet.w(z0c0Var);
        if (w >= 0) {
            u1c0 c = listDataSet.c(w);
            pij0.a aVar = this.g;
            aVar.a = false;
            c.g = aVar;
            listDataSet.d(w);
        }
    }

    @Override // xsna.c9c0
    public final void J4(Post post) {
        ce60.b.getClass();
        p870.f().e(101, post);
    }

    @Override // xsna.c9c0
    public final void P3() {
        NewsEntry newsEntry = this.d;
        if (newsEntry == null) {
            return;
        }
        wxk wxkVar = new wxk(1);
        ListDataSet<u1c0> listDataSet = this.j;
        if (listDataSet.w(wxkVar) >= 0) {
            H3();
            return;
        }
        u1c0 u1c0Var = new u1c0(newsEntry, newsEntry, 74);
        pij0.a aVar = this.g;
        aVar.a = false;
        u1c0Var.g = aVar;
        u1c0Var.n = this.b.M0();
        listDataSet.s(u1c0Var);
    }

    @Override // xsna.c9c0
    public final void W3(int i) {
        int g = g() + i;
        Parcelable parcelable = this.d;
        c6z c6zVar = parcelable instanceof c6z ? (c6z) parcelable : null;
        if (c6zVar != null) {
            c6zVar.v6(g);
        }
        b();
    }

    @Override // xsna.yrn.a
    public final boolean Z(RecyclerView.e0 e0Var) {
        lfg lfgVar = this.i;
        return (lfgVar != null ? lfgVar.P6() : 0) > 0 && (e0Var.getItemViewType() == 73 || e0Var.getItemViewType() == 341);
    }

    @Override // xsna.c9c0
    public final void a1() {
        this.b.a1();
    }

    public final void b() {
        NewsEntry newsEntry = this.d;
        if (newsEntry != null) {
            NewsEntry h = na60.h(newsEntry);
            this.d = h;
            ce60 ce60Var = ce60.b;
            qr.d(ce60Var, 102, h);
            Photos photos = h instanceof Photos ? (Photos) h : null;
            if (photos != null) {
                PhotoAttachment Mb = photos.Mb();
                Photo photo = Mb != null ? Mb.l : null;
                if (photo != null) {
                    ce60Var.getClass();
                    p870.f().e(113, photo);
                }
            }
        }
    }

    @Override // xsna.c9c0
    public final void e7() {
        b();
    }

    @Override // xsna.c9c0
    public final void f1(int i) {
        int max = Math.max(0, g() - i);
        Parcelable parcelable = this.d;
        c6z c6zVar = parcelable instanceof c6z ? (c6z) parcelable : null;
        if (c6zVar != null) {
            c6zVar.v6(max);
        }
        b();
    }

    public final int g() {
        Parcelable parcelable = this.d;
        c6z c6zVar = parcelable instanceof c6z ? (c6z) parcelable : null;
        if (c6zVar != null) {
            return c6zVar.E1();
        }
        return 0;
    }

    @Override // xsna.c9c0
    public final void j1() {
        y0c0 y0c0Var = new y0c0();
        ListDataSet<u1c0> listDataSet = this.j;
        int w = listDataSet.w(y0c0Var);
        if (w >= 0) {
            listDataSet.A(w);
        }
    }

    @Override // xsna.c9c0
    public final void k1(int i, int i2) {
        Parcelable parcelable = this.d;
        c6z c6zVar = parcelable instanceof c6z ? (c6z) parcelable : null;
        if (c6zVar == null) {
            return;
        }
        this.f = i2;
        c6zVar.v6(i);
    }

    @Override // xsna.c9c0
    public final void m4(CommentsOrder commentsOrder) {
        x(commentsOrder.b, commentsOrder.c);
    }

    @Override // xsna.c9c0
    public final CharSequence o6(CharSequence charSequence) {
        Post R;
        Object obj;
        NewsEntry newsEntry = this.d;
        Attachment attachment = null;
        if (newsEntry != null && (R = di60.R(newsEntry)) != null) {
            Iterator<T> it = R.z.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((EntryAttachment) obj).b instanceof PodcastAttachment) {
                    break;
                }
            }
            EntryAttachment entryAttachment = (EntryAttachment) obj;
            if (entryAttachment != null) {
                attachment = entryAttachment.b;
            }
        }
        if (!(attachment instanceof PodcastAttachment)) {
            return charSequence;
        }
        return this.b.Hf(charSequence, (PodcastAttachment) attachment, this.o, this.n);
    }

    @Override // xsna.cc6
    public final void onDestroy() {
        io.reactivex.rxjava3.disposables.c cVar;
        this.l.a();
        int i = his0.d - 1;
        his0.d = i;
        if (i == 0 && (cVar = his0.c) != null) {
            cVar.dispose();
        }
        this.m.dispose();
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        PostCommentsPresenter$receiver$1 postCommentsPresenter$receiver$1 = this.k;
        enj.s(context, postCommentsPresenter$receiver$1);
        Context context2 = e43.a;
        cuz.a(context2 != null ? context2 : null).d(postCommentsPresenter$receiver$1);
        lfg lfgVar = this.i;
        if (lfgVar != null) {
            lfgVar.onDestroy();
        }
        ce60.b.getClass();
        p870.f().g(this.i);
    }

    @Override // xsna.cc6
    public final void onPause() {
        throw null;
    }

    @Override // xsna.cc6
    public final void onResume() {
        throw null;
    }

    @Override // xsna.c9c0
    public final boolean p2() {
        return this.j.w(new xxk(1)) >= 0;
    }

    @Override // xsna.c9c0
    public final void q6() {
        d0m d0mVar = new d0m(1);
        ListDataSet<u1c0> listDataSet = this.j;
        int w = listDataSet.w(d0mVar);
        if (w >= 0) {
            u1c0 c = listDataSet.c(w);
            pij0.a aVar = this.g;
            aVar.a = false;
            c.g = aVar;
            listDataSet.d(w);
        }
        this.b.pa();
    }

    @Override // xsna.c9c0
    public final void u3(q1c0 q1c0Var) {
        Parcelable parcelable = this.d;
        c6z c6zVar = parcelable instanceof c6z ? (c6z) parcelable : null;
        if (c6zVar == null) {
            return;
        }
        c6zVar.f(q1c0Var.a);
        c6zVar.U8(q1c0Var.b);
        int i = q1c0Var.c;
        if (i > 0) {
            c6zVar.sb(i);
        }
        Parcelable parcelable2 = this.d;
        o2f0 o2f0Var = parcelable2 instanceof o2f0 ? (o2f0) parcelable2 : null;
        if (o2f0Var != null) {
            o2f0Var.hb(q1c0Var.e);
        }
        if (o2f0Var != null) {
            o2f0Var.b4(q1c0Var.f);
        }
        c6zVar.f0(q1c0Var.d);
    }

    public final void x(String str, List<CommentsOrder.Item> list) {
        NewsEntry newsEntry = this.d;
        if (newsEntry == null) {
            return;
        }
        x0c0 x0c0Var = new x0c0();
        ListDataSet<u1c0> listDataSet = this.j;
        int w = listDataSet.w(x0c0Var);
        yfg yfgVar = this.h;
        if (w >= 0) {
            if (g() <= 1) {
                listDataSet.A(w);
                return;
            }
            u1c0 c = listDataSet.c(w);
            if (c != null) {
                yfgVar.a = g();
                yfgVar.b = this.f;
                yfgVar.c = str;
                yfgVar.d = list;
                c.g = yfgVar;
            }
            listDataSet.d(w);
            return;
        }
        if (g() > 1) {
            s1c0 M0 = this.b.M0();
            u1c0 u1c0Var = new u1c0(newsEntry, newsEntry, 93);
            yfgVar.a = g();
            yfgVar.b = this.f;
            yfgVar.c = str;
            yfgVar.d = list;
            u1c0Var.g = yfgVar;
            u1c0Var.n = M0;
            listDataSet.s(u1c0Var);
        }
    }

    public final void z(Post post) {
        PostDonut postDonut;
        CommentsInfo commentsInfo = post.B;
        PostDonut.Placeholder placeholder = (commentsInfo == null || (postDonut = commentsInfo.b) == null) ? null : postDonut.c;
        PostFragment postFragment = this.b;
        if (placeholder == null) {
            postFragment.o0();
            postFragment.g0 = true;
        } else {
            postFragment.Cd(b1c0.a(post), placeholder.b, placeholder.c);
            postFragment.V0();
            postFragment.g0 = false;
        }
    }

    @Override // xsna.c9c0
    public final void T5() {
    }

    @Override // xsna.c9c0
    public final void e4(String str) {
    }

    @Override // xsna.bd70
    public final void x0(int i, int i2, Object obj) {
    }
}
