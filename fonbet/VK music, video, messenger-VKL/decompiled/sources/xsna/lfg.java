package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.api.comments.CommentsOrder;
import com.vk.api.generated.video.dto.VideoGetCommentsExtendedSortDto;
import com.vk.api.likes.LikesGetList;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.badges.BadgeInfo;
import com.vk.dto.common.data.LikeInfo;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.lists.ListDataSet;
import com.vk.newsfeed.api.data.CommentThread;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.api.data.WallNegativeRepliesPlaceholder;
import com.vk.newsfeed.impl.fragments.CommentThreadFragment;
import com.vk.newsfeed.impl.helpers.CommentScreenMode;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipCommentSortItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsClipItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedCommentThreadButtonShowMore;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeScreenMode;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoSortCommentsClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.d9c0;
import xsna.hcg;
import xsna.phi0;
import xsna.rdg;
import xsna.vqt;

/* compiled from: CommentsListPresenter.kt */
/* loaded from: classes4.dex */
public class lfg<T extends d9c0> extends mdg<T> {
    public final c9c0 h0;
    public final dbg i0;
    public final phi0.a j0;
    public final ArrayList<NewsComment> k0;
    public boolean l0;
    public final sa30 m0;
    public final Object n0;

    public lfg(ics0 ics0Var, fae faeVar, Lazy<? extends b25> lazy, T t, c9c0 c9c0Var, Lazy<? extends fgg> lazy2) {
        super(ics0Var, faeVar, lazy, t, lazy2);
        this.h0 = c9c0Var;
        this.i0 = new dbg();
        this.j0 = phi0.a.a;
        this.k0 = new ArrayList<>();
        this.m0 = new sa30();
        this.n0 = msy.a(LazyThreadSafetyMode.NONE, new kfg(this, t, faeVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0049 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int B8(iag iagVar) {
        int i;
        int i2;
        CommentThread commentThread;
        int f4 = iagVar.f4();
        if ((iagVar instanceof NewsComment) && (commentThread = ((NewsComment) iagVar).L) != null) {
            List<NewsComment> list = commentThread.f;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                i = 0;
                for (NewsComment newsComment : list) {
                    if (newsComment.v || newsComment.u) {
                        i++;
                        if (i < 0) {
                            e43.s();
                            throw null;
                        }
                    }
                }
                i2 = f4 - i;
                if (i2 >= 0) {
                    return 0;
                }
                return i2;
            }
        }
        i = 0;
        i2 = f4 - i;
        if (i2 >= 0) {
        }
    }

    public Integer A8(NewsComment newsComment) {
        CommentThread commentThread;
        NewsComment newsComment2;
        if (newsComment != null && (commentThread = newsComment.L) != null) {
            List<NewsComment> list = commentThread.f;
            ListIterator<NewsComment> listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    newsComment2 = null;
                    break;
                }
                newsComment2 = listIterator.previous();
                NewsComment newsComment3 = newsComment2;
                if (!newsComment3.u && !newsComment3.y) {
                    break;
                }
            }
            NewsComment newsComment4 = newsComment2;
            if (newsComment4 != null) {
                return Integer.valueOf(newsComment4.i);
            }
        }
        return null;
    }

    @Override // xsna.mdg
    public void C7(iag iagVar, iag iagVar2, int[] iArr) {
        NewsComment newsComment;
        cbg cbgVar;
        grj0 grj0Var;
        cbg cbgVar2;
        boolean z = false;
        boolean z2 = (iArr == null || iArr.length == 0) ? false : true;
        ListDataSet<cbg> listDataSet = this.K;
        if (iagVar2 != null && z2 && iArr != null) {
            Iterator<cbg> it = listDataSet.d.iterator();
            while (true) {
                newsComment = null;
                if (!it.hasNext()) {
                    cbgVar = null;
                    break;
                } else {
                    cbgVar = it.next();
                    if (rl3.E(cbgVar.a.getId(), iArr)) {
                        break;
                    }
                }
            }
            cbg cbgVar3 = cbgVar;
            grj0 grj0Var2 = cbgVar3 != null ? cbgVar3.a : null;
            if (grj0Var2 == null) {
                Iterator<cbg> it2 = listDataSet.d.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        cbgVar2 = null;
                        break;
                    } else {
                        cbgVar2 = it2.next();
                        if (epx.f(cbgVar2.a, iagVar2)) {
                            break;
                        }
                    }
                }
                cbg cbgVar4 = cbgVar2;
                grj0Var = cbgVar4 != null ? cbgVar4.b : null;
            } else {
                grj0Var = grj0Var2;
            }
            if (grj0Var2 instanceof NewsComment) {
                newsComment = (NewsComment) grj0Var2;
            } else if (grj0Var instanceof NewsComment) {
                newsComment = (NewsComment) grj0Var;
            } else if (iagVar2 instanceof NewsComment) {
                newsComment = (NewsComment) iagVar2;
            }
            if (newsComment != null) {
                CommentThread commentThread = newsComment.L;
                CommentThread commentThread2 = commentThread != null ? new CommentThread(commentThread.b, commentThread.c, commentThread.d, commentThread.e, new ArrayList(commentThread.f), commentThread.g, commentThread.h, commentThread.i, commentThread.j) : new CommentThread(0, false, false, false, new ArrayList(), null, null, false, null);
                commentThread2.f.add((NewsComment) iagVar);
                commentThread2.b++;
                newsComment.L = commentThread2;
            }
            ((d9c0) this.e).ge(D7(new cbg(iagVar, newsComment, d4().g())));
        } else if (!P8() || (z2 && iagVar2 != null)) {
            O8(iagVar.getId(), iagVar2);
            E8(this.Q.r(iagVar.getId(), this.k0), iagVar.getId(), iagVar2);
        } else {
            listDataSet.z(new ifg(this, 0));
            dbg d4 = d4();
            int i = d4.j;
            cbg cbgVar5 = new cbg(iagVar, i == 0 ? 445 : (i != 2 || d4.g) ? 410 : t11.d() ? 436 : 434, 2);
            sd90 sd90Var = this.Q;
            if (sd90Var != null && sd90Var.p()) {
                z = true;
            }
            w8(cbgVar5, z);
            D8(iagVar, z);
        }
        this.h0.T5();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final nfg C8() {
        return (nfg) this.n0.getValue();
    }

    public void D8(iag iagVar, boolean z) {
        androidx.lifecycle.f fVar = this.e;
        if (!z) {
            ((d9c0) fVar).Ah();
            return;
        }
        d9c0 d9c0Var = (d9c0) fVar;
        d9c0Var.wf(0);
        d9c0Var.bm(iagVar.getId());
    }

    public void E8(io.reactivex.rxjava3.core.q<vqt> qVar, int i, iag iagVar) {
        F8(qVar, i, true);
    }

    public final void F8(io.reactivex.rxjava3.core.q<vqt> qVar, int i, boolean z) {
        d9c0 d9c0Var = (d9c0) this.e;
        d9c0Var.a(hg1.m(qVar, d9c0Var.getContext(), 0L, false, 62).subscribe(new defpackage.p(new gfg(this, i, z), 16), new sv(new sm(13), 20)));
    }

    @Override // xsna.mdg
    public final boolean G7() {
        return false;
    }

    public final void G8(io.reactivex.rxjava3.core.q<vqt> qVar, boolean z) {
        int i = 15;
        ((d9c0) this.e).a(qVar.subscribe(new b00(new jfg(this, z), i), new cw(new sd4(this, i), 14)));
    }

    public final void H8(Throwable th, boolean z, boolean z2) {
        if (z && this.E) {
            this.E = false;
        }
        if (!z2 && (th instanceof VKApiExecutionException)) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            j03.i(context, (VKApiExecutionException) th);
        }
        this.h0.q6();
    }

    @Override // xsna.mdg
    public final io.reactivex.rxjava3.core.q I7() {
        return this.Q.p0();
    }

    public final void J8(vqt vqtVar, boolean z, boolean z2) {
        if (z) {
            K8(vqtVar);
        } else {
            VKList<NewsComment> vKList = vqtVar.a;
            g5g.D(vKList, true, new com.vk.movika.sdk.base.observable.w(this, 27));
            String str = vqtVar.d;
            c9c0 c9c0Var = this.h0;
            if (str != null && str.length() != 0) {
                c9c0Var.P3();
            } else if (this.p == 0 || vKList.isEmpty()) {
                c9c0Var.j1();
            } else {
                if (Math.min(vqtVar.b - (vKList.size() + vqtVar.c), 50) > 0) {
                    c9c0Var.H3();
                } else {
                    c9c0Var.j1();
                }
            }
            if (!vKList.isEmpty()) {
                this.k0.addAll(0, vKList);
                this.K.y(0, x8(vqtVar.a, false, j7(vqtVar)));
            }
        }
        if (z2 || this.E) {
            this.E = false;
            ((d9c0) this.e).Ah();
        }
    }

    @Override // xsna.mdg
    public final void K7(UserId userId) {
        ArrayList<NewsComment> arrayList = this.k0;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator<NewsComment> it = arrayList.iterator();
        while (it.hasNext()) {
            NewsComment next = it.next();
            if (epx.f(next.j, userId)) {
                next.R = Boolean.FALSE;
            }
            arrayList2.add(next);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.K.setItems(x8(arrayList, false, null));
    }

    public void K8(vqt vqtVar) {
        int i;
        ArrayList<NewsComment> arrayList = this.k0;
        arrayList.clear();
        VKList<NewsComment> vKList = vqtVar.a;
        arrayList.addAll(vKList);
        S8(vqtVar);
        List<LikeInfo> list = vqtVar.h.a;
        c9c0 c9c0Var = this.h0;
        c9c0Var.D1(list);
        CommentsOrder commentsOrder = vqtVar.f;
        if (commentsOrder != null) {
            c9c0Var.m4(commentsOrder);
        }
        int size = arrayList.size();
        String str = vqtVar.d;
        if (str != null && str.length() != 0) {
            c9c0Var.P3();
        } else if (this.p == 0 || (i = vqtVar.b) <= size) {
            c9c0Var.j1();
        } else if (Math.min(i - size, 50) > 0) {
            c9c0Var.P3();
        } else {
            c9c0Var.j1();
        }
        sd90 sd90Var = this.Q;
        this.m0.getClass();
        this.K.setItems(x8(vKList, sa30.Q(vqtVar, sd90Var), j7(vqtVar)));
        c9c0Var.a1();
    }

    public void L8(vqt vqtVar, boolean z) {
        com.vk.lists.c cVar;
        VKList<NewsComment> vKList = vqtVar.a;
        String str = vqtVar.d;
        boolean z2 = !(str == null || str.length() == 0) || vqtVar.c > 0;
        ArrayList<NewsComment> arrayList = this.k0;
        arrayList.clear();
        arrayList.addAll(vKList);
        S8(vqtVar);
        List<LikeInfo> list = vqtVar.h.a;
        c9c0 c9c0Var = this.h0;
        c9c0Var.D1(list);
        CommentsOrder commentsOrder = vqtVar.f;
        if (commentsOrder != null) {
            c9c0Var.m4(commentsOrder);
        }
        sd90 sd90Var = this.Q;
        this.m0.getClass();
        ArrayList x8 = x8(vKList, sa30.Q(vqtVar, sd90Var), j7(vqtVar));
        if ((sa30.Q(vqtVar, this.Q) || q8(vqtVar)) && (cVar = this.P) != null) {
            cVar.r(false);
        }
        if (z2) {
            c9c0Var.P3();
        } else {
            c9c0Var.j1();
        }
        ListDataSet<cbg> listDataSet = this.K;
        listDataSet.setItems(x8);
        if (z) {
            int w = listDataSet.w(new hfg(new l5(this, 26), 0));
            androidx.lifecycle.f fVar = this.e;
            if (w >= 0) {
                ((d9c0) fVar).wf(w);
            } else {
                ((d9c0) fVar).wf(0);
            }
        }
        this.l0 = false;
        this.o = false;
    }

    @Override // xsna.mdg
    public void M7(iag iagVar) {
        this.h0.W3(1);
    }

    public void M8(vqt vqtVar, boolean z) {
        com.vk.lists.c cVar;
        VKList<NewsComment> vKList = vqtVar.a;
        j8();
        ArrayList<NewsComment> arrayList = this.k0;
        boolean z2 = z || arrayList.isEmpty();
        if (z2) {
            arrayList.clear();
        } else {
            g5g.D(vKList, true, new com.vk.newsfeed.posting.impl.presentation.base.fragment.a(this, 25));
        }
        arrayList.addAll(vKList);
        if (!vKList.isEmpty() || vqtVar.c <= 0) {
            sd90 sd90Var = this.Q;
            this.m0.getClass();
            ArrayList x8 = x8(vKList, sa30.Q(vqtVar, sd90Var), j7(vqtVar));
            if ((sa30.Q(vqtVar, this.Q) || (x7() && vqtVar.j != null)) && (cVar = this.P) != null) {
                cVar.r(false);
            }
            ListDataSet<cbg> listDataSet = this.K;
            c9c0 c9c0Var = this.h0;
            if (z2) {
                S8(vqtVar);
                c9c0Var.j1();
                c9c0Var.D1(vqtVar.h.a);
                CommentsOrder commentsOrder = vqtVar.f;
                if (commentsOrder != null) {
                    c9c0Var.m4(commentsOrder);
                }
                listDataSet.setItems(x8);
                c9c0Var.a1();
            } else {
                listDataSet.n0(x8);
            }
            boolean z3 = this.l0;
            androidx.lifecycle.f fVar = this.e;
            if (z3) {
                if (c9c0Var.p2()) {
                    ((d9c0) fVar).Rb(0);
                } else {
                    ((d9c0) fVar).wf(0);
                }
                this.l0 = false;
            }
            ((d9c0) fVar).z(rdg.c.a);
        }
    }

    @Override // xsna.mdg
    public void N7(iag iagVar) {
        h1(iagVar);
        this.h0.f1(1);
    }

    public void N8(Context context, int i, Integer num, NewsComment newsComment, String str) {
        BadgeInfo badgeInfo;
        boolean z = (newsComment == null || (badgeInfo = newsComment.X) == null) ? false : badgeInfo.b;
        CommentThreadFragment.a aVar = new CommentThreadFragment.a(this.i, this.j, this.p);
        Bundle bundle = aVar.j;
        bundle.putInt("comment_id", i);
        bundle.putParcelable("uid", this.u);
        bundle.putString("ref_source", this.s);
        bundle.putString("referrer", str);
        bundle.putString("track_code", this.r);
        bundle.putString("access_key", this.q);
        bundle.putBoolean("arg_can_comment", this.w);
        bundle.putBoolean("arg_can_share_comments", this.A);
        bundle.putBoolean("arg_can_share_comments_link", this.B);
        bundle.putBoolean("arg_can_share_on_wall", this.z);
        bundle.putBoolean("arg_can_group_comment", this.v);
        bundle.putBoolean("arg_without_negative_replies_placeholder", this.G);
        LikesGetList.Type type = this.D;
        if (type == null) {
            type = LikesGetList.Type.POST;
        }
        bundle.putString("arg_item_likes_type", type.i());
        if (num != null) {
            bundle.putInt("arg_start_comment_id", num.intValue());
        }
        bundle.putBoolean("arg_badgeable_disabled", this.F || z);
        bundle.putParcelable("arg_badgeable_info", newsComment != null ? newsComment.X : null);
        aVar.k(context);
    }

    @Override // xsna.mdg
    public void O7(iag iagVar) {
        h1(iagVar);
        this.h0.W3(1);
    }

    public void O8(int i, iag iagVar) {
        ((d9c0) this.e).bm(i);
    }

    public boolean P8() {
        boolean G = rl3.G(new Integer[]{0, 6, 2}, Integer.valueOf(this.p));
        boolean z = a6() == 1;
        sd90 sd90Var = this.Q;
        boolean z2 = sd90Var != null && sd90Var.p() && this.p == 6;
        sd90 sd90Var2 = this.Q;
        return (z && !G) || z2 || (sd90Var2 != null && sd90Var2.p() && this.p == 2);
    }

    @Override // xsna.mdg, xsna.afg
    public void Q1(String str) {
        io.reactivex.rxjava3.core.q n;
        sd90 sd90Var = this.Q;
        if (sd90Var == null || (n = sd90Var.n(y8(str, sd90Var))) == null) {
            return;
        }
        G8(n, true);
    }

    public final void Q8(String str) {
        MobileOfficialAppsVideoStat$TypeVideoSortCommentsClick.EventType eventType;
        fgg value;
        MobileOfficialAppsClipsStat$TypeClipCommentSortItem.EventSubtype eventSubtype;
        int i = this.p;
        MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode = null;
        cgg cggVar = this.g;
        if (i != 2) {
            if (i != 6) {
                return;
            }
            int i2 = this.j;
            long j = this.i.b;
            String str2 = this.r;
            cggVar.getClass();
            if (str.equals(VideoGetCommentsExtendedSortDto.MOST_INTERESTING_COMMENTS_FIRST.i())) {
                eventSubtype = MobileOfficialAppsClipsStat$TypeClipCommentSortItem.EventSubtype.SORT_POPULAR;
            } else if (str.equals(VideoGetCommentsExtendedSortDto.OLDEST_COMMENT_FIRST.i())) {
                eventSubtype = MobileOfficialAppsClipsStat$TypeClipCommentSortItem.EventSubtype.SORT_OLDEST;
            } else if (!str.equals(VideoGetCommentsExtendedSortDto.NEWEST_COMMENT_FIRST.i())) {
                return;
            } else {
                eventSubtype = MobileOfficialAppsClipsStat$TypeClipCommentSortItem.EventSubtype.SORT_LATEST;
            }
            new iid0(MobileOfficialAppsCoreNavStat$EventScreen.COMMENTS_LIST_CLIP, SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsClipsStat$TypeClipCommentSortItem(eventSubtype, new MobileOfficialAppsClipsStat$TypeClipsClipItem(i2, j, str2)), 3)).q();
            return;
        }
        int i3 = this.j;
        long j2 = this.i.b;
        String str3 = this.r;
        Lazy<fgg> lazy = this.f;
        CommentScreenMode a = (lazy == null || (value = lazy.getValue()) == null) ? null : value.a();
        if (a != null) {
            int i4 = hcg.a.$EnumSwitchMapping$0[a.ordinal()];
            if (i4 == 1) {
                mobileOfficialAppsVideoStat$TypeScreenMode = MobileOfficialAppsVideoStat$TypeScreenMode.DISCOVERY;
            } else if (i4 == 2) {
                mobileOfficialAppsVideoStat$TypeScreenMode = MobileOfficialAppsVideoStat$TypeScreenMode.FULLSCREEN_LANDSCAPE;
            } else {
                if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                mobileOfficialAppsVideoStat$TypeScreenMode = MobileOfficialAppsVideoStat$TypeScreenMode.FULLSCREEN_PORTRAIT;
            }
        }
        cggVar.getClass();
        if (str.equals(VideoGetCommentsExtendedSortDto.MOST_INTERESTING_COMMENTS_FIRST.i())) {
            eventType = MobileOfficialAppsVideoStat$TypeVideoSortCommentsClick.EventType.SORT_POPULAR;
        } else if (str.equals(VideoGetCommentsExtendedSortDto.OLDEST_COMMENT_FIRST.i())) {
            eventType = MobileOfficialAppsVideoStat$TypeVideoSortCommentsClick.EventType.SORT_OLDEST;
        } else if (!str.equals(VideoGetCommentsExtendedSortDto.NEWEST_COMMENT_FIRST.i())) {
            return;
        } else {
            eventType = MobileOfficialAppsVideoStat$TypeVideoSortCommentsClick.EventType.SORT_LATEST;
        }
        new bjc(MobileOfficialAppsCoreNavStat$EventScreen.COMMENTS_LIST_VIDEO, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, Long.valueOf(i3), Long.valueOf(j2), null, str3, null, 40, null), new MobileOfficialAppsVideoStat$TypeVideoSortCommentsClick(eventType, mobileOfficialAppsVideoStat$TypeScreenMode), 2)).q();
    }

    public final void R8() {
        if (this.p == 0) {
            String str = this.r;
            this.g.getClass();
            SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null);
            bpn0 bpn0Var = cqm0.a;
            if (str == null) {
                str = "";
            }
            SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(schemeStat$EventItem, new MobileOfficialAppsFeedStat$TypeFeedCommentThreadButtonShowMore(str), 2);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c, b, uzp0Var.a).q();
        }
    }

    public final void S8(vqt vqtVar) {
        int i = this.p;
        c9c0 c9c0Var = this.h0;
        if (i != 0) {
            vqt.a aVar = vqtVar.h;
            c9c0Var.u3(new q1c0(aVar.b, aVar.d, aVar.c, aVar.e, aVar.f, aVar.g));
        }
        c9c0Var.k1(vqtVar.a.i(), vqtVar.b);
        c9c0Var.e7();
    }

    public boolean T8() {
        return false;
    }

    @Override // xsna.mdg
    public final void U7(io.reactivex.rxjava3.core.q<vqt> qVar, boolean z, boolean z2) {
        ((d9c0) this.e).a(qVar.subscribe(new hv(new cfg(this, z, z2), 13), new jv(new dfg(this, z, z2), 17)));
    }

    @Override // xsna.mdg
    public final ArrayList V2(NewsComment newsComment) {
        return dbg.a(d4(), newsComment, this.K.d.size() == 0, null, 12);
    }

    @Override // xsna.mdg
    public final void X7(io.reactivex.rxjava3.core.q qVar) {
        ((d9c0) this.e).a(qVar.subscribe(new defpackage.n(new pcg(this, 1), 17), new k41(new vr0(21), 14)));
    }

    @Override // xsna.mdg, xsna.b3g0
    public final String Y0() {
        int i = this.p;
        StringBuilder e = fw3.e(i != 1 ? i != 2 ? i != 6 ? "wall" : "clip" : "video" : "photo");
        e.append(this.i);
        e.append('_');
        e.append(this.j);
        return e.toString();
    }

    @Override // xsna.mdg, xsna.tdg
    public final boolean a4(cbg cbgVar) {
        NewsComment newsComment;
        iag iagVar;
        if (this.l <= 0) {
            m3g0 m3g0Var = this.S;
            if (m3g0Var != null && (newsComment = m3g0Var.g) != null) {
                if (!newsComment.equals(cbgVar != null ? cbgVar.a : null)) {
                    if (!newsComment.equals(cbgVar != null ? cbgVar.b : null)) {
                        iag iagVar2 = cbgVar != null ? cbgVar.a : null;
                        NewsComment newsComment2 = iagVar2 instanceof NewsComment ? (NewsComment) iagVar2 : null;
                        grj0 grj0Var = cbgVar != null ? cbgVar.b : null;
                        NewsComment newsComment3 = grj0Var instanceof NewsComment ? (NewsComment) grj0Var : null;
                        if ((newsComment2 == null || !newsComment2.zb(newsComment)) && (newsComment3 == null || !newsComment3.zb(newsComment))) {
                            return false;
                        }
                    }
                }
            }
        } else if (cbgVar == null || (iagVar = cbgVar.a) == null || iagVar.getId() != this.l) {
            return false;
        }
        return true;
    }

    @Override // xsna.mdg, xsna.ud60
    public void bi(int i, Context context) {
        NewsComment newsComment;
        R8();
        String z8 = z8();
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
        NewsComment newsComment2 = newsComment;
        N8(context, i, A8(newsComment2), newsComment2, z8);
    }

    @Override // xsna.mdg
    public final void c8(iag iagVar) {
        super.c8(iagVar);
        this.h0.f1(B8(iagVar));
    }

    @Override // xsna.mdg
    public dbg d4() {
        return this.i0;
    }

    @Override // xsna.mdg
    public final void d8(iag iagVar) {
        super.d8(iagVar);
        this.h0.W3(B8(iagVar));
    }

    @Override // xsna.mdg, com.vk.lists.c.k
    public io.reactivex.rxjava3.core.q<vqt> hj(com.vk.lists.c cVar, boolean z) {
        lg();
        boolean Pj = ((d9c0) this.e).Pj();
        io.reactivex.rxjava3.core.q<vqt> h = this.o ? this.Q.h(b6()) : this.Q.a(z, Pj);
        if (!z || Pj || this.p != 0) {
            return h;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.i);
        sb.append('_');
        sb.append(this.j);
        return rsg0.y0(new i730(sb.toString()), null, null, 3).L(new gv(new o9(13, h, this), 14), false);
    }

    @Override // xsna.mdg
    public final String i7(iag iagVar) {
        int[] iArr;
        Integer N;
        int i = this.p;
        String str = i != 1 ? i != 2 ? i != 6 ? "wall" : "clip" : "video" : "photo";
        int i2 = 0;
        if ((iagVar instanceof NewsComment) && (iArr = ((NewsComment) iagVar).l) != null && (N = rl3.N(iArr)) != null) {
            i2 = N.intValue();
        }
        StringBuilder sb = new StringBuilder("https://");
        sb.append(a0a.d);
        sb.append('/');
        sb.append(str);
        sb.append(this.i);
        sb.append('_');
        sb.append(this.j);
        sb.append("?reply=");
        sb.append(iagVar.getId());
        sb.append(i2 > 0 ? lhg.a(i2, "&thread=") : "");
        return sb.toString();
    }

    @Override // xsna.mdg, xsna.tdg
    public final CharSequence mb(int i, CharSequence charSequence) {
        super.mb(i, charSequence);
        return this.h0.o6(charSequence);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r9.getBoolean("scroll_to_comments") == true) goto L8;
     */
    @Override // xsna.mdg, xsna.afg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(Bundle bundle) {
        boolean z;
        Context context;
        super.onCreate(bundle);
        if (bundle != null) {
            z = true;
        }
        z = false;
        this.l0 = z;
        if (this.n == 0 || (context = ((d9c0) this.e).getContext()) == null) {
            return;
        }
        int i = this.n;
        int i2 = this.m;
        Integer valueOf = Integer.valueOf(i2);
        NewsComment newsComment = null;
        if (i2 == 0) {
            valueOf = null;
        }
        Iterator<NewsComment> it = this.k0.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            NewsComment next = it.next();
            if (next.i == this.n) {
                newsComment = next;
                break;
            }
        }
        N8(context, i, valueOf, newsComment, z8());
        if (this.J) {
            return;
        }
        this.n = 0;
    }

    @Override // xsna.mdg
    public final void p3(cbg cbgVar) {
        iag iagVar = cbgVar.a;
        if (iagVar instanceof NewsComment) {
            CommentThread commentThread = ((NewsComment) iagVar).L;
            ArrayList v0 = j5g.v0(iagVar, commentThread != null ? commentThread.f : new ArrayList());
            ArrayList arrayList = new ArrayList(c5g.u(v0, 10));
            Iterator it = v0.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((NewsComment) it.next()).i));
            }
            this.K.z(new s53(12, cbgVar, j5g.S0(arrayList)));
        }
    }

    @Override // xsna.mdg
    public final void u8(UserId userId, boolean z) {
        boolean z2;
        if (!z) {
            Iterator<NewsComment> it = this.k0.iterator();
            while (it.hasNext()) {
                if (mdg.A7(it.next(), userId, epx.f(this.i, userId))) {
                }
            }
            z2 = false;
            super.u8(userId, z2);
        }
        z2 = true;
        super.u8(userId, z2);
    }

    @Override // xsna.mdg
    public phi0 w7() {
        return this.j0;
    }

    public void w8(cbg cbgVar, boolean z) {
        ListDataSet<cbg> listDataSet = this.K;
        if (!z) {
            listDataSet.s(cbgVar);
            return;
        }
        listDataSet.j(0);
        listDataSet.d.add(0, cbgVar);
        listDataSet.f(0);
    }

    @Override // xsna.mdg, xsna.ud60
    public final void wb(int i, iag iagVar) {
        R8();
        C8().d = this.i;
        C8().e = this.j;
        C8().f = this.p;
        C8().g = this.q;
        C8().h = this.r;
        C8().c(i, iagVar);
    }

    @Override // xsna.mdg, com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<vqt> qVar, boolean z, com.vk.lists.c cVar) {
        if (!x7() && a6() == 1) {
            U7(qVar, true, a6() == 1);
            return;
        }
        if (this.o) {
            X7(qVar);
        } else if (!x7()) {
            G8(qVar, z);
        } else {
            boolean z2 = a6() == 1;
            ((d9c0) this.e).a(qVar.subscribe(new v8(new efg(this, z, z2), 17), new x8(new ffg(this, z, z2), 13)));
        }
    }

    public final ArrayList x8(List list, boolean z, WallNegativeRepliesPlaceholder wallNegativeRepliesPlaceholder) {
        return d4().d(list, this.K.d.size() == 0, z, wallNegativeRepliesPlaceholder);
    }

    public io.reactivex.rxjava3.internal.operators.observable.c0 y8(String str, sd90 sd90Var) {
        return new io.reactivex.rxjava3.internal.operators.observable.c0(hg1.m(sd90Var.Q1(str), ((d9c0) this.e).getContext(), 0L, false, 60), new k5(new defpackage.s(7, this, str), 15), io.reactivex.rxjava3.internal.functions.a.c);
    }

    public final String z8() {
        String str = this.s;
        if (epx.f(str, "discover") || epx.f(str, "discover_full")) {
            return "discover_comment";
        }
        String str2 = this.s;
        return (str2 == null || !brm0.B(str2, "feed_", false)) ? "post_comment" : "feed_comment";
    }
}
