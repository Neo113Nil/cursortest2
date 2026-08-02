package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.api.likes.LikesGetList;
import com.vk.core.serialize.Serializer;
import com.vk.dto.badges.BadgeInfo;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.libvideo.api.onboarding.Onboarding;
import com.vk.libvideo.autoplay.b;
import com.vk.lists.ListDataSet;
import com.vk.newsfeed.api.data.CommentThread;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.api.data.TypeReply;
import com.vk.newsfeed.api.data.VideoStatistic;
import com.vk.newsfeed.impl.fragments.VideoCommentThreadFragment;
import com.vk.newsfeed.impl.helpers.CommentScreenMode;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoScreenCommentClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.vts0;

/* compiled from: VideoCommentsListPresenter.kt */
/* loaded from: classes4.dex */
public final class gcs0 extends lfg<d9c0> {
    public final v5t0 o0;
    public final bpn0 p0;
    public final Object q0;
    public io.reactivex.rxjava3.disposables.c r0;
    public io.reactivex.rxjava3.disposables.c s0;

    /* compiled from: VideoCommentsListPresenter.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<NewsComment, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(NewsComment newsComment) {
            ((gcs0) this.receiver).n8(newsComment);
            return s3q0.a;
        }
    }

    public gcs0(ics0 ics0Var, fae faeVar, Lazy lazy, d9c0 d9c0Var, v5t0 v5t0Var, Lazy lazy2) {
        super(ics0Var, faeVar, lazy, d9c0Var, v5t0Var, lazy2);
        this.o0 = v5t0Var;
        this.p0 = new bpn0(new fcs0(ics0Var, 0));
        this.q0 = msy.a(LazyThreadSafetyMode.NONE, new acp0(this, 5));
    }

    @Override // xsna.lfg
    public final /* bridge */ /* synthetic */ Integer A8(NewsComment newsComment) {
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.lfg, xsna.mdg
    public final void C7(iag iagVar, iag iagVar2, int[] iArr) {
        super.C7(iagVar, iagVar2, iArr);
        Context context = ((d9c0) this.e).getContext();
        if (context == null || e3m.h(context) == null) {
            return;
        }
        be80 be80Var = (be80) this.q0.getValue();
        Onboarding onboarding = Onboarding.TwoStep;
        be80Var.getClass();
    }

    @Override // xsna.lfg
    public final void D8(iag iagVar, boolean z) {
        androidx.lifecycle.f fVar = this.e;
        if (z) {
            ((d9c0) fVar).bm(iagVar.getId());
        } else {
            ((d9c0) fVar).Ah();
        }
    }

    @Override // xsna.lfg
    public final void E8(io.reactivex.rxjava3.core.q<vqt> qVar, int i, iag iagVar) {
        F8(qVar, i, iagVar == null);
    }

    @Override // xsna.lfg, xsna.mdg
    public final void M7(iag iagVar) {
        super.M7(iagVar);
        X8(iagVar);
    }

    @Override // xsna.lfg
    public final void M8(vqt vqtVar, boolean z) {
        super.M8(vqtVar, z);
        ListDataSet<cbg> listDataSet = this.K;
        ListDataSet.ArrayListImpl<cbg> arrayListImpl = listDataSet.d;
        if (arrayListImpl.isEmpty()) {
            return;
        }
        Iterator<cbg> it = arrayListImpl.iterator();
        while (it.hasNext()) {
            int i = it.next().c;
            if (i != 430 && i != 431) {
                listDataSet.z(new o7j0(9));
                return;
            }
        }
    }

    @Override // xsna.mdg, xsna.tdg
    public final void N3(iag iagVar, aa aaVar, ReactionMeta reactionMeta, boolean z) {
        if (o25.a().b()) {
            super.N3(iagVar, aaVar, reactionMeta, z);
        } else {
            if (aaVar == null || aaVar.itemView.getContext() == null) {
                return;
            }
            o25.a().getClass();
        }
    }

    @Override // xsna.lfg, xsna.mdg
    public final void N7(iag iagVar) {
        super.N7(iagVar);
        iag V8 = V8(iagVar);
        NewsComment newsComment = V8 instanceof NewsComment ? (NewsComment) V8 : null;
        if (newsComment != null) {
            CommentThread commentThread = newsComment.L;
            CommentThread commentThread2 = commentThread != null ? new CommentThread(commentThread.b, commentThread.c, commentThread.d, commentThread.e, new ArrayList(commentThread.f), commentThread.g, commentThread.h, commentThread.i, commentThread.j) : new CommentThread(0, false, false, false, new ArrayList(), null, null, false, null);
            int i = 0;
            commentThread2.f.removeIf(new icg(new dsc((NewsComment) iagVar, 9), 0));
            commentThread2.b--;
            newsComment.L = commentThread2;
            ListDataSet<cbg> listDataSet = this.K;
            Iterator<cbg> it = listDataSet.d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (it.next().a.getId() == newsComment.i) {
                    break;
                } else {
                    i++;
                }
            }
            if (i > -1) {
                dbg dbgVar = this.i0;
                int i2 = dbgVar.j;
                listDataSet.F(i, new cbg(newsComment, i2 == 0 ? 445 : (i2 != 2 || dbgVar.g) ? 410 : t11.d() ? 436 : 434, 2));
            }
        }
    }

    @Override // xsna.lfg
    public final void N8(Context context, int i, Integer num, NewsComment newsComment, String str) {
        BadgeInfo badgeInfo;
        yg5 yg5Var;
        VideoFile A;
        Videos videos;
        yg5 yg5Var2;
        VideoFile A2;
        BadgeInfo badgeInfo2;
        d9c0 d9c0Var = (d9c0) this.e;
        androidx.lifecycle.f g = d9c0Var.g();
        com.vk.libvideo.miniplayer.dialog.a aVar = g instanceof com.vk.libvideo.miniplayer.dialog.a ? (com.vk.libvideo.miniplayer.dialog.a) g : null;
        if (aVar != null) {
            boolean z = (newsComment == null || (badgeInfo2 = newsComment.X) == null) ? false : badgeInfo2.b;
            UserId userId = this.i;
            int i2 = this.j;
            int i3 = this.p;
            Bundle bundle = new Bundle();
            bundle.putParcelable("owner_id", userId);
            bundle.putInt("id", i2);
            bundle.putInt("type", i3);
            bundle.putInt("comment_id", i);
            bundle.putParcelable("uid", this.u);
            bundle.putString("ref_source", this.s);
            bundle.putString("referrer", str);
            bundle.putString("track_code", this.r);
            bundle.putString("access_key", this.q);
            bundle.putBoolean("arg_can_comment", this.w);
            bundle.putBoolean("arg_can_share_comments", this.A);
            bundle.putBoolean("arg_can_group_comment", this.v);
            bundle.putBoolean("arg_without_negative_replies_placeholder", this.G);
            LikesGetList.Type type = this.D;
            if (type == null) {
                type = LikesGetList.Type.POST;
            }
            bundle.putString("arg_item_likes_type", type.i());
            bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
            xh5 xh5Var = b.C1208b.a().c;
            if (xh5Var == null || (yg5Var2 = xh5Var.a) == null || (A2 = yg5Var2.A()) == null) {
                videos = null;
            } else {
                Serializer.c<Videos> cVar = Videos.CREATOR;
                videos = Videos.a.a(A2);
            }
            bundle.putParcelable("entry", videos);
            if (num != null) {
                bundle.putInt("arg_start_comment_id", num.intValue());
            }
            bundle.putBoolean("arg_badgeable_disabled", this.F || z);
            bundle.putParcelable("arg_badgeable_info", newsComment != null ? newsComment.X : null);
            wts0 k7 = aVar.k7(d9c0Var.g());
            if (k7 != null) {
                k7.T4(new vts0.e(bundle));
            }
        } else {
            dhr0.a.getClass();
            int i4 = dhr0.u().c;
            boolean z2 = (newsComment == null || (badgeInfo = newsComment.X) == null) ? false : badgeInfo.b;
            UserId userId2 = this.i;
            int i5 = this.j;
            int i6 = this.p;
            VideoCommentThreadFragment.a aVar2 = new VideoCommentThreadFragment.a(VideoCommentThreadFragment.class, null, null);
            Bundle bundle2 = aVar2.j;
            bundle2.putParcelable("owner_id", userId2);
            bundle2.putInt("id", i5);
            bundle2.putInt("type", i6);
            bundle2.putInt("comment_id", i);
            bundle2.putParcelable("uid", this.u);
            bundle2.putString("ref_source", this.s);
            bundle2.putString("referrer", str);
            bundle2.putString("track_code", this.r);
            bundle2.putString("access_key", this.q);
            bundle2.putBoolean("arg_can_comment", this.w);
            bundle2.putBoolean("arg_can_share_comments", this.A);
            bundle2.putBoolean("arg_can_group_comment", this.v);
            bundle2.putBoolean("arg_without_negative_replies_placeholder", this.G);
            LikesGetList.Type type2 = this.D;
            if (type2 == null) {
                type2 = LikesGetList.Type.POST;
            }
            bundle2.putString("arg_item_likes_type", type2.i());
            if (num != null) {
                bundle2.putInt("arg_start_comment_id", num.intValue());
            }
            bundle2.putBoolean("arg_badgeable_disabled", this.F || z2);
            bundle2.putParcelable("arg_badgeable_info", newsComment != null ? newsComment.X : null);
            bundle2.putInt("forced_theme", i4);
            aVar2.k(context);
        }
        bpn0 bpn0Var2 = com.vk.libvideo.autoplay.b.B;
        xh5 xh5Var2 = b.C1208b.a().c;
        if (xh5Var2 == null || (yg5Var = xh5Var2.a) == null || (A = yg5Var.A()) == null) {
            return;
        }
        int o0 = A.o0();
        long j = A.I0().b;
        String r = A.r();
        this.g.getClass();
        new bjc(MobileOfficialAppsCoreNavStat$EventScreen.COMMENTS_LIST_VIDEO, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, Long.valueOf(o0), Long.valueOf(j), null, r, null, 40, null), new MobileOfficialAppsVideoStat$TypeVideoScreenCommentClick(MobileOfficialAppsVideoStat$TypeVideoScreenCommentClick.Event.OPEN_COMMENT_NEXT_LEVEL), 2)).q();
    }

    @Override // xsna.lfg, xsna.mdg
    public final void O7(iag iagVar) {
        super.O7(iagVar);
        X8(iagVar);
    }

    @Override // xsna.lfg
    public final void O8(int i, iag iagVar) {
        if (iagVar == null) {
            ((d9c0) this.e).bm(i);
        }
    }

    @Override // xsna.mdg
    public final void P7(int i, Context context) {
        W8().c(i, context);
    }

    @Override // xsna.lfg
    public final boolean P8() {
        sd90 sd90Var;
        boolean G = rl3.G(new Integer[]{0, 6, 2}, Integer.valueOf(this.p));
        boolean z = a6() == 1;
        int i = this.p;
        return (z && !G) || ((sd90Var = this.Q) != null && sd90Var.p() && (i == 6 || i == 2));
    }

    @Override // xsna.mdg, xsna.afg
    public final jag Ra(NewsComment newsComment, udg udgVar) {
        kng W8 = W8();
        boolean z = this.w;
        boolean g0 = t6g0.b().g0(this.i);
        boolean F7 = F7();
        int i = this.p;
        UserId userId = this.i;
        UserId userId2 = this.u;
        boolean z2 = this.A;
        m3g0 m3g0Var = this.S;
        Boolean valueOf = m3g0Var != null ? Boolean.valueOf(m3g0Var.g()) : null;
        W8.getClass();
        return new pdg(new qdg(newsComment, z && !epx.f(newsComment.j, hd60.a().a().y()), g0, F7, z2, valueOf != null ? valueOf.booleanValue() : true, newsComment.q, i, userId, userId2));
    }

    @Override // xsna.mdg
    public final io.reactivex.rxjava3.core.q<NewsComment> V5(l7k l7kVar) {
        fgg value;
        int i = l7kVar.b;
        if (i == -1) {
            i = this.k;
        }
        kng W8 = W8();
        String str = l7kVar.a;
        Integer valueOf = Integer.valueOf(i);
        CommentScreenMode commentScreenMode = null;
        if (i <= 0) {
            valueOf = null;
        }
        int i2 = this.k;
        Integer valueOf2 = Integer.valueOf(i2);
        if (i2 <= 0) {
            valueOf2 = null;
        }
        List<Attachment> list = l7kVar.c;
        int i3 = this.j;
        UserId userId = this.i;
        String str2 = this.q;
        String str3 = this.r;
        String str4 = this.t;
        VideoStatistic videoStatistic = this.H;
        UserId userId2 = l7kVar.d;
        Lazy<fgg> lazy = this.f;
        if (lazy != null && (value = lazy.getValue()) != null) {
            commentScreenMode = value.a();
        }
        return W8.a(new pak(str, valueOf, valueOf2, list, i3, userId, str2, str4, str3, videoStatistic, userId2, hcg.a(commentScreenMode)), new y2(this, 10));
    }

    public final iag V8(iag iagVar) {
        cbg cbgVar;
        if (iagVar.Ta() && (iagVar instanceof NewsComment)) {
            Iterator<cbg> it = this.K.d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    cbgVar = null;
                    break;
                }
                cbgVar = it.next();
                cbg cbgVar2 = cbgVar;
                int[] iArr = ((NewsComment) iagVar).l;
                if (iArr != null) {
                    int id = cbgVar2.a.getId();
                    Integer N = rl3.N(iArr);
                    if (N != null && id == N.intValue()) {
                        break;
                    }
                }
            }
            cbg cbgVar3 = cbgVar;
            if (cbgVar3 != null) {
                return cbgVar3.a;
            }
        }
        return null;
    }

    public final kng W8() {
        return (kng) this.p0.getValue();
    }

    public final void X8(iag iagVar) {
        iag V8 = V8(iagVar);
        NewsComment newsComment = V8 instanceof NewsComment ? (NewsComment) V8 : null;
        if (newsComment != null) {
            CommentThread commentThread = newsComment.L;
            CommentThread commentThread2 = commentThread != null ? new CommentThread(commentThread.b, commentThread.c, commentThread.d, commentThread.e, new ArrayList(commentThread.f), commentThread.g, commentThread.h, commentThread.i, commentThread.j) : new CommentThread(0, false, false, false, new ArrayList(), null, null, false, null);
            commentThread2.f.add((NewsComment) iagVar);
            commentThread2.b++;
            newsComment.L = commentThread2;
            ListDataSet<cbg> listDataSet = this.K;
            Iterator<cbg> it = listDataSet.d.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (it.next().a.getId() == newsComment.i) {
                    break;
                } else {
                    i++;
                }
            }
            if (i > -1) {
                dbg dbgVar = this.i0;
                int i2 = dbgVar.j;
                listDataSet.F(i, new cbg(newsComment, i2 == 0 ? 445 : (i2 != 2 || dbgVar.g) ? 410 : t11.d() ? 436 : 434, 2));
            }
        }
    }

    @Override // xsna.mdg, xsna.ud60
    public final boolean Xa(iag iagVar) {
        return false;
    }

    @Override // xsna.lfg, xsna.mdg, xsna.ud60
    public final void bi(int i, Context context) {
        String str;
        NewsComment newsComment;
        String str2 = this.s;
        if (epx.f(str2, "discover") || epx.f(str2, "discover_full")) {
            str = "discover_comment";
        } else {
            String str3 = this.s;
            str = (str3 == null || !brm0.B(str3, "feed_", false)) ? "post_comment" : "feed_comment";
        }
        String str4 = str;
        Iterator<NewsComment> it = this.k0.iterator();
        while (true) {
            if (!it.hasNext()) {
                newsComment = null;
                break;
            } else {
                newsComment = it.next();
                if (newsComment.i == i) {
                    break;
                }
            }
        }
        N8(context, i, null, newsComment, str4);
    }

    @Override // xsna.mdg, xsna.tdg
    public final void ei(iag iagVar, TypeReply typeReply) {
        super.ei(iagVar, typeReply);
        W8().d(iagVar, typeReply);
        ((d9c0) this.e).Df();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    @Override // xsna.mdg, xsna.tdg
    public final void gm(iag iagVar, aa aaVar) {
        W8().f(iagVar, aaVar, this.e);
    }

    @Override // xsna.mdg
    public final void i8(int i, String str, List<? extends Attachment> list, Integer num) {
        kng W8 = W8();
        io.reactivex.rxjava3.core.q<NewsComment> a2 = W8.a.a(new x1p(str, v7(), this.i, i, list), new iue(this, num, i, 1));
        d9c0 d9c0Var = (d9c0) this.e;
        d9c0Var.a(hg1.m(a2, d9c0Var.getContext(), 0L, false, 62).subscribe(new ux00(new c4q0(this, 3), 29), new fv70(new waf0(this, 20), 26)));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    @Override // xsna.mdg, xsna.afg
    public final void lg() {
        super.lg();
        W8().getClass();
        this.e.d0();
    }

    @Override // xsna.lfg, xsna.mdg, xsna.afg
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.r0 = kng.b.a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new o060(new alj0(this, 19), 20));
        io.reactivex.rxjava3.disposables.c cVar = this.s0;
        if (cVar != null) {
            cVar.dispose();
        }
        this.s0 = W8().b(this.j, this.i, this.q).subscribe(new h4f0(new gqe0(this, 19), 14));
        kng W8 = W8();
        int i = this.p;
        W8.getClass();
        this.i0.f = i == 2;
    }

    @Override // xsna.mdg, xsna.cc6
    public final void onDestroy() {
        super.onDestroy();
        io.reactivex.rxjava3.disposables.c cVar = this.r0;
        if (cVar != null) {
            cVar.dispose();
        }
        this.r0 = null;
        io.reactivex.rxjava3.disposables.c cVar2 = this.s0;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        this.s0 = null;
    }

    @Override // xsna.mdg, xsna.b3g0
    public final void s2() {
        super.s2();
        ((d9c0) this.e).s2();
    }

    @Override // xsna.mdg
    public final io.reactivex.rxjava3.core.q<vqt> v8(io.reactivex.rxjava3.core.q<vqt> qVar) {
        kng W8 = W8();
        owt owtVar = new owt(this.j, this.i, this.q, Integer.valueOf(this.k), null, 0, null, null, this.H, 1008);
        return W8.a.c(owtVar).U(new cyh0(new b1o0(3), 3)).L(new h8(new n15(owtVar, new a(1, this, gcs0.class, "setCommentItem", "setCommentItem(Lcom/vk/newsfeed/api/data/NewsComment;)V", 0), qVar), 9), false);
    }

    @Override // xsna.lfg
    public final void w8(cbg cbgVar, boolean z) {
        iag iagVar = cbgVar.a;
        ListDataSet<cbg> listDataSet = this.K;
        if (!z) {
            listDataSet.s(cbgVar);
            return;
        }
        ListDataSet.ArrayListImpl<cbg> arrayListImpl = listDataSet.d;
        ListDataSet.ArrayListImpl<cbg> arrayListImpl2 = listDataSet.d;
        int i = 0;
        if (!arrayListImpl.isEmpty()) {
            Iterator<cbg> it = arrayListImpl.iterator();
            while (it.hasNext()) {
                if (it.next().a.getId() == iagVar.getId()) {
                    int size = arrayListImpl2.size();
                    while (true) {
                        if (i >= size) {
                            i = -1;
                            break;
                        } else if (arrayListImpl2.get(i).a.getId() == iagVar.getId()) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i >= 0) {
                        listDataSet.h(i);
                        arrayListImpl2.set(i, cbgVar);
                        listDataSet.d(i);
                        return;
                    }
                    return;
                }
            }
        }
        listDataSet.j(0);
        arrayListImpl2.add(0, cbgVar);
        listDataSet.f(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    @Override // xsna.mdg, xsna.ud60
    public final void xh(iag iagVar) {
        if (this.e.t2()) {
            super.xh(iagVar);
            W8().e(iagVar);
        }
    }

    @Override // xsna.lfg
    public final io.reactivex.rxjava3.internal.operators.observable.c0 y8(String str, sd90 sd90Var) {
        io.reactivex.rxjava3.core.q<vqt> Q1 = sd90Var.Q1(str);
        acd acdVar = new acd(0, this, gcs0.class, "showProgress", "showProgress()V", 0, 6);
        jn2 jn2Var = new jn2(0, this, gcs0.class, "hideProgress", "hideProgress()V", 0, 5);
        o330 o330Var = new o330(new qjl0(acdVar, 10), 25);
        Q1.getClass();
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.internal.operators.observable.c0(Q1, o330Var, kVar).C(new lcb(jn2Var, 4)).F(new j720(new n7b0(jn2Var, 22), 16)), io.reactivex.rxjava3.internal.functions.a.d, new bpk(jn2Var, 4)), new xvq0(new ecs0(0, this, str), 3), kVar);
    }
}
