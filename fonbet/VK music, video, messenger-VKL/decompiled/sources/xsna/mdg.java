package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.wall.dto.WallCreateCommentEntryPointDto;
import com.vk.api.generated.wall.dto.WallRestoreThreadResponseDto;
import com.vk.api.likes.LikesGetList;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.articles.Article;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.newsfeed.CommentDonut;
import com.vk.dto.photo.Photo;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.dto.stickers.popup.PopupStickerAnimation;
import com.vk.dto.user.ObsceneTextFilter;
import com.vk.dto.user.UserProfile;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.lists.ListDataSet;
import com.vk.lists.c;
import com.vk.newsfeed.api.data.CommentThread;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.api.data.TypeReply;
import com.vk.newsfeed.api.data.VideoStatistic;
import com.vk.newsfeed.api.data.WallNegativeRepliesPlaceholder;
import com.vk.newsfeed.impl.feedback.NewsEntryFeedbackCommentsFragment;
import com.vk.newsfeed.impl.fragments.CommentThreadFragment;
import com.vk.newsfeed.impl.fragments.PostViewFragment;
import com.vk.newsfeed.impl.fragments.VideoBottomSheetTreeCommentsFragment;
import com.vk.newsfeed.impl.fragments.VideoCommentThreadFragment;
import com.vk.newsfeed.impl.fragments.VideoPostViewFragment;
import com.vk.newsfeed.impl.fragments.video.thread.VideoCommentsThreadInPlayerFragment;
import com.vk.newsfeed.impl.fragments.video.tree.VideoCommentsTreeInPlayerFragment;
import com.vk.newsfeed.impl.helpers.CommentScreenMode;
import com.vk.newsfeed.impl.newsfeed_post.presentation.fragment.PostFragment;
import com.vk.sharing.api.dto.AttachmentInfo;
import com.vk.sharing.api.dto.SharingDataType;
import com.vk.sharing.api.dto.Target;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipCommentSharingItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsClipItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.story.api.di.StoriesComponent;
import com.vk.toggle.features.ComFeatures;
import com.vk.webapp.fragments.ReportFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.LinkAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.PodcastAttachment;
import com.vkontakte.android.attachments.PostAttachment;
import com.vkontakte.android.attachments.StickerAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vkontakte.android.data.b;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Predicate;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.bbj0;
import xsna.bfg;
import xsna.bja0;
import xsna.c70;
import xsna.d9x0;
import xsna.ej90;
import xsna.h7u0;
import xsna.it80;
import xsna.phi0;
import xsna.rdg;
import xsna.xa60;

/* compiled from: CommentThreadPresenter.kt */
/* loaded from: classes4.dex */
public class mdg<T extends bfg<?>> implements afg, w8i {
    public boolean A;
    public boolean B;
    public boolean C;
    public LikesGetList.Type D;
    public boolean E;
    public boolean F;
    public boolean G;
    public VideoStatistic H;
    public final boolean I;
    public boolean J;
    public final ListDataSet<cbg> K;
    public final sp L;
    public final el3<Integer> M;
    public final sa30 N;
    public NewsComment O;
    public com.vk.lists.c P;
    public sd90 Q;
    public final dbg R;
    public m3g0 S;
    public boolean T;
    public xcg U;
    public long V;
    public final vpa W;
    public io.reactivex.rxjava3.disposables.c X;
    public final Object Y;
    public final Object Z;
    public final Object a0;
    public final ics0 b;
    public final Object b0;
    public final fae c;
    public final Object c0;
    public final Object d;
    public final Object d0;
    public final FragmentImpl e;
    public final Object e0;
    public final Lazy<fgg> f;
    public final d02 f0;
    public final Object g0;
    public UserId i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public int p;
    public String q;
    public String r;
    public String s;
    public String t;
    public UserId u;
    public boolean v;
    public boolean w;
    public boolean x;
    public String y;
    public boolean z;
    public final cgg g = new cgg();
    public final phi0.c h = phi0.c.a;

    /* compiled from: CommentThreadPresenter.kt */
    public static final class a implements c.m<vqt> {
        public final /* synthetic */ mdg<T> b;

        public a(mdg<T> mdgVar) {
            this.b = mdgVar;
        }

        @Override // com.vk.lists.c.m
        public final io.reactivex.rxjava3.core.q<vqt> O9(String str, com.vk.lists.c cVar) {
            return this.b.Q.d();
        }

        @Override // com.vk.lists.c.k
        public final io.reactivex.rxjava3.core.q<vqt> hj(com.vk.lists.c cVar, boolean z) {
            return this.b.hj(cVar, z);
        }

        @Override // com.vk.lists.c.k
        public final void wd(io.reactivex.rxjava3.core.q<vqt> qVar, boolean z, com.vk.lists.c cVar) {
            this.b.wd(qVar, z, cVar);
        }
    }

    /* compiled from: CommentThreadPresenter.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<UserId, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(UserId userId) {
            ((mdg) this.receiver).K7(userId);
            return s3q0.a;
        }
    }

    /* compiled from: CommentThreadPresenter.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<WallRestoreThreadResponseDto, it80<WallRestoreThreadResponseDto>> {
        @Override // xsna.izs
        public final it80<WallRestoreThreadResponseDto> invoke(WallRestoreThreadResponseDto wallRestoreThreadResponseDto) {
            ((it80.a) this.receiver).getClass();
            return new it80<>(wallRestoreThreadResponseDto);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public mdg(ics0 ics0Var, fae faeVar, Lazy<? extends b25> lazy, T t, Lazy<? extends fgg> lazy2) {
        this.b = ics0Var;
        this.c = faeVar;
        this.d = lazy;
        this.e = (FragmentImpl) t;
        this.f = lazy2;
        UserId userId = UserId.d;
        this.i = userId;
        this.u = userId;
        this.z = true;
        this.I = true;
        this.K = new ListDataSet<>();
        this.L = new sp(10);
        this.M = new el3<>(0);
        this.N = new sa30();
        dbg dbgVar = new dbg();
        dbgVar.b = false;
        this.R = dbgVar;
        this.T = true;
        this.V = System.currentTimeMillis();
        this.W = new vpa();
        bu0 bu0Var = new bu0(7);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.Y = msy.a(lazyThreadSafetyMode, bu0Var);
        this.Z = msy.a(lazyThreadSafetyMode, new kr6(6));
        this.a0 = msy.a(lazyThreadSafetyMode, new d4(11));
        this.b0 = msy.a(lazyThreadSafetyMode, new nh0(7));
        this.c0 = msy.a(lazyThreadSafetyMode, new e4(this, 24));
        this.d0 = msy.a(lazyThreadSafetyMode, new jcg(this, 1));
        this.e0 = msy.a(lazyThreadSafetyMode, new g4g(this, 1));
        this.f0 = new d02();
        this.g0 = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.model.props.d(17));
    }

    public static boolean A7(NewsComment newsComment, UserId userId, boolean z) {
        CommentDonut commentDonut;
        if (z && (commentDonut = newsComment.M) != null && commentDonut.c != null) {
            return true;
        }
        Iterator<Attachment> it = newsComment.J.iterator();
        while (true) {
            if (!it.hasNext()) {
                CommentThread commentThread = newsComment.L;
                if (commentThread == null) {
                    return false;
                }
                Iterator<NewsComment> it2 = commentThread.f.iterator();
                while (it2.hasNext()) {
                    if (A7(it2.next(), userId, z)) {
                    }
                }
                return false;
            }
            Attachment next = it.next();
            if (next instanceof PodcastAttachment) {
                PodcastAttachment podcastAttachment = (PodcastAttachment) next;
                if (epx.f(podcastAttachment.f.c, userId) && podcastAttachment.Db()) {
                    break;
                }
            } else if (next instanceof ArticleAttachment) {
                Article article = ((ArticleAttachment) next).f;
                if (!epx.f(article.c, userId)) {
                    continue;
                } else if (article.d() || article.k()) {
                    break;
                }
            } else {
                continue;
            }
        }
        return true;
    }

    @Override // xsna.afg
    public final void B7(m3g0 m3g0Var) {
        this.S = m3g0Var;
    }

    /* JADX WARN: Type inference failed for: r15v1, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    public void C7(iag iagVar, iag iagVar2, int[] iArr) {
        int a6 = a6();
        ?? r15 = this.e;
        if (a6 == 0) {
            r15.bm(((NewsComment) iagVar).i);
            H7();
            return;
        }
        NewsComment newsComment = this.O;
        if (newsComment != null) {
            CommentThread commentThread = newsComment.L;
            CommentThread commentThread2 = commentThread != null ? new CommentThread(commentThread.b, commentThread.c, commentThread.d, commentThread.e, new ArrayList(commentThread.f), commentThread.g, commentThread.h, commentThread.i, commentThread.j) : new CommentThread(0, false, false, false, new ArrayList(), null, null, false, null);
            commentThread2.f.add((NewsComment) iagVar);
            commentThread2.b++;
            newsComment.L = commentThread2;
        }
        D7(new cbg(iagVar, this.O, d4().g()));
        r15.bm(((NewsComment) iagVar).i);
        r15.Ah();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    @Override // xsna.f420
    public final void D0(b420 b420Var) {
        ?? r0 = this.e;
        if (r0.t2()) {
            io.reactivex.rxjava3.internal.operators.observable.j1 U = wmi0.a.e("mentionProfiles").U(new bk1(new nk(27), 22));
            com.vk.newsfeed.impl.util.b bVar = new com.vk.newsfeed.impl.util.b(b420Var);
            int i = kwg0.a;
            U.subscribe(bVar, new iwg0());
            String str = b420Var.c;
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                if (charAt != '(' && charAt != ')') {
                    sb.append(charAt);
                }
            }
            r0.Nh(b420Var.a, sb.toString());
        }
    }

    public final int D7(cbg cbgVar) {
        int size;
        grj0 grj0Var = (NewsComment) cbgVar.b;
        ListDataSet<cbg> listDataSet = this.K;
        if (grj0Var == null) {
            listDataSet.s(cbgVar);
            size = listDataSet.d.size();
        } else {
            int size2 = listDataSet.d.size();
            int i = -1;
            for (int i2 = 0; i2 < size2; i2++) {
                cbg c2 = listDataSet.c(i2);
                if (c2 != null) {
                    if (ogg.a.contains(Integer.valueOf(c2.c))) {
                        if (!epx.f(grj0Var, c2.b)) {
                            if (!epx.f(grj0Var, c2.a)) {
                                if (i != -1) {
                                    break;
                                }
                            } else {
                                grj0 grj0Var2 = c2.b;
                                if (grj0Var2 != null) {
                                    grj0Var = grj0Var2;
                                }
                            }
                        }
                        i = i2;
                    } else {
                        continue;
                    }
                }
            }
            if (i != -1) {
                cbg c3 = listDataSet.c(i);
                iag iagVar = c3.b;
                if (iagVar == null) {
                    iagVar = c3.a;
                }
                cbgVar.b = iagVar;
                int i3 = i + 1;
                listDataSet.x(i3, cbgVar);
                return i3;
            }
            listDataSet.s(cbgVar);
            size = listDataSet.d.size();
        }
        return size - 1;
    }

    public final boolean E7() {
        return this.p == 0 && fkq0.b(this.i);
    }

    @Override // xsna.ud60
    public final boolean F4(iag iagVar) {
        if (!iagVar.d5()) {
            return false;
        }
        UserId uid = iagVar.getUid();
        return fkq0.b(this.i) ? i1(uid) : epx.f(hd60.a().a().y(), uid) ^ true;
    }

    public final boolean F7() {
        t6g0 t6g0Var = t6g0.b;
        return t6g0.b().m(this.i);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    @Override // xsna.afg
    public final void Fm(iag iagVar) {
        if (iagVar instanceof NewsComment) {
            io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(yfb.x(y7().d(((NewsComment) iagVar).i, this.i)), null, null, 3);
            ?? r0 = this.e;
            r0.a(hg1.m(y0, r0.getContext(), 0L, false, 62).subscribe(new bw(new h1(5, this, iagVar), 17), new om1(new z13(9), 9)));
        }
    }

    public boolean G7() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    public final void H7() {
        lg();
        this.e.B3();
        this.E = true;
        io.reactivex.rxjava3.core.q n = this.Q.n(J7());
        if (n != null) {
            U7(n, true, false);
        }
    }

    public io.reactivex.rxjava3.core.q I7() {
        jdg jdgVar = new jdg(new k60(19), 0);
        ListDataSet<cbg> listDataSet = this.K;
        int w = listDataSet.w(jdgVar);
        if (w >= 0) {
            listDataSet.c(w).d = Boolean.TRUE;
        }
        return this.Q.p0();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.afg
    public final void I8(iag iagVar) {
        tfx l;
        if (i1(iagVar.getUid())) {
            l = ((xqu) this.b0.getValue()).t(fkq0.e(this.i), iagVar.getUid());
        } else {
            if (epx.f(hd60.a().a().y(), iagVar.getUid())) {
                return;
            } else {
                l = ((bs) this.a0.getValue()).l(iagVar.getUid());
            }
        }
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(yfb.x(l), null, null, 3);
        ?? r0 = this.e;
        r0.a(hg1.m(y0, r0.getContext(), 0L, false, 62).subscribe(new c40(new mm1(7, this, iagVar), 13), new j41(new tr0(9), 10)));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    public io.reactivex.rxjava3.core.q<vqt> J7() {
        return hg1.m(this.Q.l(), this.e.getContext(), 0L, false, 60);
    }

    public void K7(UserId userId) {
        NewsComment newsComment = this.O;
        if (newsComment != null && epx.f(newsComment.j, userId)) {
            newsComment.R = Boolean.FALSE;
            n8(newsComment);
        }
    }

    public final void L7(iag iagVar) {
        Integer valueOf = Integer.valueOf(iagVar.y4());
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            ListDataSet<cbg> listDataSet = this.K;
            int size = listDataSet.d.size();
            for (int i = 0; i < size; i++) {
                cbg c2 = listDataSet.c(i);
                if (c2 != null && intValue == ((NewsComment) c2.a).i) {
                    listDataSet.d(i);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    public void N3(iag iagVar, aa aaVar, ReactionMeta reactionMeta, boolean z) {
        iag iagVar2;
        UserId userId;
        boolean z2;
        ?? r8 = this.e;
        if (r8.t2()) {
            d2f0 d2f0Var = new d2f0();
            if (z) {
                iagVar2 = iagVar;
                z2 = !iagVar.Q6();
                userId = fkq0.a(this.i);
            } else {
                iagVar2 = iagVar;
                a2f0 b2 = d2f0.b(iagVar2, reactionMeta, false);
                boolean z3 = b2.a;
                UserId userId2 = UserId.d;
                if (!b2.b) {
                    return;
                }
                userId = userId2;
                z2 = z3;
            }
            s9x0 s9x0Var = new s9x0(z2, reactionMeta != null ? Integer.valueOf(reactionMeta.getId()) : null, this.i, iagVar2.getId(), 4, this.p, this.q, userId, v7());
            s9x0Var.s = iagVar2.s4();
            s9x0Var.j("ref", this.t);
            r8.a(hg1.m(rsg0.y0(s9x0Var, null, null, 3), r8.getContext(), 0L, false, 62).subscribe(new cp0(new zcg(z, iagVar2, d2f0Var, z2, reactionMeta, this, aaVar), 14), new is1(new pe1(15), 14)));
        }
    }

    public void N7(iag iagVar) {
        h1(iagVar);
    }

    public void O7(iag iagVar) {
        h1(iagVar);
    }

    public final int P6() {
        return this.K.d.size();
    }

    public void P7(int i, Context context) {
        if (Build.VERSION.SDK_INT <= 32) {
            cvk.u(R.string.text_copied, false);
        }
    }

    public final void Q7() {
        xcg xcgVar = this.U;
        if (xcgVar != null) {
            xcgVar.invoke();
        }
        this.U = null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    public final void R7(boolean z) {
        this.l = 0;
        ?? r0 = this.e;
        r0.k6(z);
        r0.nf();
        if (this.w || !r0.W1()) {
            return;
        }
        r0.k0();
    }

    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.afg
    public jag Ra(NewsComment newsComment, udg udgVar) {
        kag kagVar = new kag(newsComment);
        boolean z = udgVar.a;
        boolean z2 = false;
        kagVar.b = !z && this.w;
        kagVar.c = t6g0.b().g0(this.i);
        kagVar.d = F7();
        kagVar.k = this.p;
        kagVar.l = this.i;
        kagVar.m = this.u;
        kagVar.f = !z && this.B;
        kagVar.e = !z && this.A;
        m3g0 m3g0Var = this.S;
        kagVar.g = m3g0Var != null ? m3g0Var.g() : true;
        kagVar.h = Xa(newsComment);
        if (!z && (this.p != 2 || !((Boolean) this.g0.getValue()).booleanValue())) {
            z2 = true;
        }
        kagVar.j = z2;
        if (E7()) {
            kagVar.n = i1(newsComment.j);
            kagVar.o = true;
            kagVar.p = true;
            kagVar.i = !newsComment.w;
        }
        return kagVar;
    }

    @Override // xsna.ud60
    public final boolean Rf(iag iagVar) {
        UserId b2 = t11.b();
        return (!fkq0.d(b2) || iagVar.i3() || epx.f(iagVar.getUid(), b2) || epx.f(iagVar.getUid(), this.i)) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    public final void S7(Throwable th, boolean z) {
        if (!z && (th instanceof VKApiExecutionException)) {
            j03.a.getClass();
            j03.k((VKApiExecutionException) th);
        }
        ?? r0 = this.e;
        if (z) {
            r0.k0();
        }
        if ((th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).s() == 15) {
            r0.P5();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0116, code lost:
    
        if (r4 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0118, code lost:
    
        r3 = (xsna.cbg) xsna.j5g.k0(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x011e, code lost:
    
        if (r3 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0122, code lost:
    
        if (r3.c != 441) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0125, code lost:
    
        r2.add(r4);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v19, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v20, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v7, types: [xsna.dbg] */
    /* JADX WARN: Type inference failed for: r4v7, types: [xsna.dbg] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T7(vqt vqtVar, boolean z) {
        boolean z2;
        com.vk.lists.c cVar;
        boolean z3;
        com.vk.lists.c cVar2;
        int i = this.p;
        ?? r5 = this.e;
        ListDataSet listDataSet = this.K;
        if (i != 6) {
            NewsComment newsComment = this.O;
            if (newsComment == null) {
                return;
            }
            if (z) {
                n8(newsComment);
            }
            VKList<NewsComment> vKList = vqtVar.a;
            VKList<NewsComment> vKList2 = vqtVar.a;
            g5g.D(vKList, true, new odg(1, newsComment, NewsComment.class, "containsComment", "containsComment(Lcom/vk/newsfeed/api/data/NewsComment;)Z", 0, 0));
            CommentThread commentThread = newsComment.L;
            CommentThread commentThread2 = commentThread != null ? new CommentThread(commentThread.b, commentThread.c, commentThread.d, commentThread.e, new ArrayList(commentThread.f), commentThread.g, commentThread.h, commentThread.i, commentThread.j) : new CommentThread(0, false, false, false, new ArrayList(), null, null, false, null);
            commentThread2.b = vqtVar.b;
            commentThread2.f.addAll(vKList2);
            if (q8(vqtVar)) {
                commentThread2.g = j7(vqtVar);
            }
            newsComment.L = commentThread2;
            ArrayList arrayList = new ArrayList(vKList2.size());
            d4().b(newsComment, vKList2, arrayList);
            if (q8(vqtVar)) {
                z2 = false;
                d4().e(arrayList, j7(vqtVar), false);
            } else {
                z2 = false;
            }
            listDataSet.n0(arrayList);
            if (q8(vqtVar) && (cVar = this.P) != null) {
                cVar.r(z2);
            }
            this.G = z2;
            r5.z(rdg.c.a);
            return;
        }
        NewsComment newsComment2 = this.O;
        if (newsComment2 == null) {
            return;
        }
        VKList<NewsComment> vKList3 = vqtVar.a;
        VKList<NewsComment> vKList4 = vqtVar.a;
        g5g.D(vKList3, true, new odg(1, newsComment2, NewsComment.class, "containsComment", "containsComment(Lcom/vk/newsfeed/api/data/NewsComment;)Z", 0, 0));
        CommentThread commentThread3 = newsComment2.L;
        CommentThread commentThread4 = commentThread3 != null ? new CommentThread(commentThread3.b, commentThread3.c, commentThread3.d, commentThread3.e, new ArrayList(commentThread3.f), commentThread3.g, commentThread3.h, commentThread3.i, commentThread3.j) : new CommentThread(0, false, false, false, new ArrayList(), null, null, false, null);
        commentThread4.b = vqtVar.b;
        commentThread4.f.addAll(vKList4);
        if (q8(vqtVar)) {
            commentThread4.g = j7(vqtVar);
        }
        newsComment2.L = commentThread4;
        ?? arrayList2 = new ArrayList(vKList4.size());
        d4().b(newsComment2, vKList4, arrayList2);
        sd90 sd90Var = this.Q;
        this.N.getClass();
        if (sa30.Q(vqtVar, sd90Var)) {
            cbg cbgVar = null;
            d4().e(arrayList2, null, true);
            d4().getClass();
            if (!arrayList2.isEmpty()) {
                Iterator it = j5g.y0(listDataSet.d).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    cbg cbgVar2 = (cbg) it.next();
                    if (cbgVar2.c == 441) {
                        if (arrayList2.size() == 1 && ((cbg) j5g.Y(arrayList2)).c == 441) {
                            arrayList2 = EmptyList.b;
                        } else {
                            ArrayList arrayList3 = listDataSet.d;
                            int size = arrayList3.size();
                            int i2 = 0;
                            while (true) {
                                if (i2 < size) {
                                    Object obj = arrayList3.get(i2);
                                    if (obj != null && obj.equals(cbgVar2)) {
                                        break;
                                    } else {
                                        i2++;
                                    }
                                } else {
                                    i2 = -1;
                                    break;
                                }
                            }
                            if (i2 >= 0) {
                                listDataSet.k(i2);
                                arrayList3.remove(i2);
                                listDataSet.p(i2);
                            }
                            cbgVar = cbgVar2;
                        }
                    }
                }
            } else {
                arrayList2 = EmptyList.b;
            }
        }
        listDataSet.n0(arrayList2);
        if (!q8(vqtVar) || (cVar2 = this.P) == null) {
            z3 = false;
        } else {
            z3 = false;
            cVar2.r(false);
        }
        this.G = z3;
        r5.z(rdg.c.a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    public void U7(io.reactivex.rxjava3.core.q<vqt> qVar, boolean z, boolean z2) {
        this.e.a(qVar.subscribe(new sf(new fdg(this, z, z2), 17), new tf(new gdg(this, z, z2), 15)));
    }

    public ArrayList V2(NewsComment newsComment) {
        CommentThread commentThread;
        WallNegativeRepliesPlaceholder wallNegativeRepliesPlaceholder = null;
        if (x7() && (commentThread = newsComment.L) != null) {
            wallNegativeRepliesPlaceholder = commentThread.g;
        }
        return dbg.a(d4(), newsComment, this.K.d.size() == 0, wallNegativeRepliesPlaceholder, 4);
    }

    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [xsna.jx2, xsna.qyn0] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object, kotlin.Lazy] */
    public io.reactivex.rxjava3.core.q<NewsComment> V5(l7k l7kVar) {
        String join;
        Integer num;
        String str;
        xy2 o;
        ?? r1;
        WallCreateCommentEntryPointDto wallCreateCommentEntryPointDto;
        List<Attachment> list = l7kVar.c;
        long j = l7kVar.e;
        boolean z = l7kVar.f;
        int i = l7kVar.b;
        if (i == -1) {
            i = this.k;
        }
        int i2 = i;
        int i3 = this.p;
        if (i3 != 6 && (i3 != 2 || !((Boolean) this.g0.getValue()).booleanValue())) {
            boolean z2 = ((fcg) ((bxx) hd60.a().a().a(m6r0.X0))) != null;
            UserId userId = this.i;
            int i4 = this.j;
            int i5 = this.p;
            d9x0.b bVar = new d9x0.b(userId, i4, i5);
            d9x0.a aVar = new d9x0.a(l7kVar.a, list);
            String str2 = this.q;
            UserId userId2 = l7kVar.d;
            String str3 = this.t;
            String str4 = this.r;
            WallCreateCommentEntryPointDto wallCreateCommentEntryPointDto2 = WallCreateCommentEntryPointDto.COMMENTS_THREAD;
            if (i5 == 0) {
                wallCreateCommentEntryPointDto = wallCreateCommentEntryPointDto2;
                r1 = 0;
            } else {
                r1 = 0;
                wallCreateCommentEntryPointDto = null;
            }
            return rsg0.y0(new d9x0(bVar, aVar, i2, str2, userId2, z2, z, str3, str4, j, wallCreateCommentEntryPointDto), r1, r1, 3);
        }
        UserId userId3 = this.i;
        int i6 = this.j;
        String str5 = l7kVar.a;
        String str6 = this.q;
        UserId userId4 = l7kVar.d;
        String str7 = this.t;
        String str8 = this.r;
        jod jodVar = new jod(this.c);
        VideoStatistic videoStatistic = this.H;
        Attachment attachment = (Attachment) j5g.a0(list);
        if (attachment instanceof StickerAttachment) {
            StickerAttachment stickerAttachment = (StickerAttachment) attachment;
            num = Integer.valueOf(stickerAttachment.f.b);
            String str9 = stickerAttachment.h;
            if (str9 == null || !myc0.f(str9)) {
                str9 = null;
            }
            join = "";
            str = str9;
        } else {
            join = TextUtils.join(StringUtils.COMMA, list);
            num = null;
            str = null;
        }
        o = new uft0().o(i6, userId3, str6, str5, Collections.singletonList(join), Boolean.valueOf(!(userId4 != null && userId4.b == 0)), Integer.valueOf(i2), num, (r33 & 256) != 0 ? null : null, str, null, str7, str8, (r33 & 8192) != 0 ? null : (userId4 == null || !fkq0.c(userId4)) ? null : userId4, null);
        return new io.reactivex.rxjava3.internal.operators.single.r(rsg0.w0(yfb.x(o)), new v20(new rr3(jodVar, userId3, videoStatistic, 1), 12)).w().a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    public final void V7(boolean z, boolean z2) {
        if (z && this.E) {
            this.E = false;
        }
        if (!z2) {
            cvk.u(R.string.live_network_error_description, false);
        }
        ycg ycgVar = new ycg(new d40(16), 0);
        ListDataSet<cbg> listDataSet = this.K;
        int w = listDataSet.w(ycgVar);
        if (w >= 0) {
            listDataSet.c(w).d = Boolean.FALSE;
            listDataSet.d(w);
        }
    }

    @Override // xsna.ud60
    public final void Vj() {
        j8();
        com.vk.lists.c cVar = this.P;
        if (cVar != null) {
            cVar.r(true);
        }
        com.vk.lists.c cVar2 = this.P;
        if (cVar2 != null) {
            cVar2.n(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0372  */
    /* JADX WARN: Type inference failed for: r1v17, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W7(vqt vqtVar, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        com.vk.lists.c cVar;
        com.vk.lists.c cVar2;
        NewsComment newsComment = this.O;
        if (newsComment == null) {
            return;
        }
        int i = this.p;
        ListDataSet<cbg> listDataSet = this.K;
        if (i == 6) {
            CommentThread commentThread = newsComment.L;
            CommentThread commentThread2 = commentThread != null ? new CommentThread(commentThread.b, commentThread.c, commentThread.d, commentThread.e, new ArrayList(commentThread.f), commentThread.g, commentThread.h, commentThread.i, commentThread.j) : new CommentThread(0, false, false, false, new ArrayList(), null, null, false, null);
            int i2 = vqtVar.b;
            VKList<NewsComment> vKList = vqtVar.a;
            commentThread2.b = i2;
            commentThread2.f.clear();
            newsComment.L = commentThread2;
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(dbg.a(d4(), newsComment, listDataSet.d.size() == 0, null, 12));
            d4().b(newsComment, vKList, arrayList);
            if (q8(vqtVar)) {
                d4().e(arrayList, j7(vqtVar), false);
            }
            sd90 sd90Var = this.Q;
            this.N.getClass();
            if (sa30.Q(vqtVar, sd90Var)) {
                d4().e(arrayList, null, true);
            }
            listDataSet.setItems(arrayList);
            if (q8(vqtVar) && (cVar2 = this.P) != null) {
                cVar2.r(false);
            }
            CommentThread commentThread3 = newsComment.L;
            CommentThread commentThread4 = commentThread3 != null ? new CommentThread(commentThread3.b, commentThread3.c, commentThread3.d, commentThread3.e, new ArrayList(commentThread3.f), commentThread3.g, commentThread3.h, commentThread3.i, commentThread3.j) : new CommentThread(0, false, false, false, new ArrayList(), null, null, false, null);
            commentThread4.f.addAll(vKList);
            if (q8(vqtVar)) {
                commentThread4.g = j7(vqtVar);
            }
            newsComment.L = commentThread4;
        } else {
            if (!z) {
                CommentThread commentThread5 = newsComment.L;
                CommentThread commentThread6 = commentThread5 != null ? new CommentThread(commentThread5.b, commentThread5.c, commentThread5.d, commentThread5.e, new ArrayList(commentThread5.f), commentThread5.g, commentThread5.h, commentThread5.i, commentThread5.j) : new CommentThread(0, false, false, false, new ArrayList(), null, null, false, null);
                int i3 = vqtVar.b;
                VKList<NewsComment> vKList2 = vqtVar.a;
                commentThread6.b = i3;
                newsComment.L = commentThread6;
                g5g.D(vKList2, true, new odg(1, newsComment, NewsComment.class, "containsComment", "containsComment(Lcom/vk/newsfeed/api/data/NewsComment;)Z", 0, 0));
                final arf arfVar = new arf(this, 1);
                int w = listDataSet.w(new Predicate() { // from class: xsna.bdg
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return ((Boolean) arf.this.invoke(obj)).booleanValue();
                    }
                });
                if (w >= 0) {
                    if (x7()) {
                        String str = vqtVar.d;
                        if (str == null || str.length() == 0) {
                            listDataSet.A(w);
                            w = -1;
                        } else {
                            listDataSet.A(w);
                            listDataSet.x(w, new cbg(newsComment, 424, 2));
                        }
                    } else if (vKList2.size() + vqtVar.c >= newsComment.f4() || vKList2.isEmpty()) {
                        listDataSet.A(w);
                        w = -1;
                    } else {
                        listDataSet.c(w).d = Boolean.FALSE;
                        listDataSet.d(w);
                    }
                    ?? r1 = this.e;
                    if (!z2 || this.E) {
                        this.E = z3;
                        r1.Ah();
                    }
                    r1.z(rdg.c.a);
                }
                listDataSet.y(w >= 0 ? w + 1 : listDataSet.d.size() > 0 ? 1 : 0, dbg.c(d4(), newsComment, vKList2));
                CommentThread commentThread7 = newsComment.L;
                CommentThread commentThread8 = commentThread7 != null ? new CommentThread(commentThread7.b, commentThread7.c, commentThread7.d, commentThread7.e, new ArrayList(commentThread7.f), commentThread7.g, commentThread7.h, commentThread7.i, commentThread7.j) : new CommentThread(0, false, false, false, new ArrayList(), null, null, false, null);
                z3 = false;
                commentThread8.f.addAll(0, vKList2);
                newsComment.L = commentThread8;
                ?? r12 = this.e;
                if (!z2) {
                }
                this.E = z3;
                r12.Ah();
                r12.z(rdg.c.a);
            }
            CommentThread commentThread9 = newsComment.L;
            CommentThread commentThread10 = commentThread9 != null ? new CommentThread(commentThread9.b, commentThread9.c, commentThread9.d, commentThread9.e, new ArrayList(commentThread9.f), commentThread9.g, commentThread9.h, commentThread9.i, commentThread9.j) : new CommentThread(0, false, false, false, new ArrayList(), null, null, false, null);
            int i4 = vqtVar.b;
            VKList<NewsComment> vKList3 = vqtVar.a;
            commentThread10.b = i4;
            commentThread10.f.clear();
            newsComment.L = commentThread10;
            int size = vKList3.size();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(dbg.a(d4(), newsComment, listDataSet.d.size() == 0, null, 12));
            if (x7()) {
                String str2 = vqtVar.d;
                if (str2 != null && str2.length() != 0) {
                    d4().getClass();
                    arrayList2.add(new cbg(newsComment, 424, 2));
                }
            } else if (newsComment.f4() > size) {
                d4().getClass();
                arrayList2.add(new cbg(newsComment, 424, 2));
            }
            d4().b(newsComment, vKList3, arrayList2);
            if (q8(vqtVar)) {
                z4 = false;
                d4().e(arrayList2, j7(vqtVar), false);
            } else {
                z4 = false;
            }
            listDataSet.setItems(arrayList2);
            if (q8(vqtVar) && (cVar = this.P) != null) {
                cVar.r(z4);
            }
            CommentThread commentThread11 = newsComment.L;
            CommentThread commentThread12 = commentThread11 != null ? new CommentThread(commentThread11.b, commentThread11.c, commentThread11.d, commentThread11.e, new ArrayList(commentThread11.f), commentThread11.g, commentThread11.h, commentThread11.i, commentThread11.j) : new CommentThread(0, false, false, false, new ArrayList(), null, null, false, null);
            commentThread12.f.addAll(vKList3);
            if (q8(vqtVar)) {
                commentThread12.g = j7(vqtVar);
            }
            newsComment.L = commentThread12;
        }
        z3 = false;
        ?? r122 = this.e;
        if (!z2) {
        }
        this.E = z3;
        r122.Ah();
        r122.z(rdg.c.a);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    @Override // xsna.tdg
    public final boolean X3(VideoAttachment videoAttachment) {
        Activity h;
        VideoRestriction O = videoAttachment.k.O();
        if (O != null && !O.f) {
            return true;
        }
        ?? r0 = this.e;
        Context context = r0.getContext();
        if (context == null || (h = e3m.h(context)) == null) {
            return false;
        }
        VideoFile videoFile = videoAttachment.k;
        fcn fcnVar = r0 instanceof fcn ? (fcn) r0 : null;
        xcg xcgVar = new xcg(h, videoFile, this, videoAttachment, 0);
        if (!this.C || fcnVar == null) {
            xcgVar.invoke();
            return true;
        }
        this.U = xcgVar;
        fcnVar.b(true);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    public void X7(io.reactivex.rxjava3.core.q qVar) {
        this.e.a(qVar.subscribe(new c60(new mmf(this, 3), 11), new bn3(new j6e(this, 4), 13)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        if (r3.length() != 0) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean Xa(iag iagVar) {
        boolean z;
        NewsComment newsComment;
        boolean f;
        boolean z2;
        if ((iagVar instanceof NewsComment) && this.p != 6) {
            if (x7()) {
                CommentThread commentThread = ((NewsComment) iagVar).L;
                if ((commentThread != null ? commentThread.g : null) == null) {
                    String str = commentThread != null ? commentThread.h : null;
                    if (str != null) {
                    }
                }
                z = true;
                newsComment = (NewsComment) iagVar;
                if (newsComment.f4() <= 0 || z) {
                    UserId b2 = t11.b();
                    if (fkq0.b(this.i)) {
                        if (fkq0.d(this.i)) {
                            f = epx.f(b2, this.i);
                            if (f) {
                            }
                        }
                        f = false;
                        if (f) {
                        }
                    } else {
                        if (F7() || epx.f(b2, this.i)) {
                            f = true;
                            if (f) {
                                CommentThread commentThread2 = newsComment.L;
                                if (commentThread2 != null) {
                                    List<NewsComment> list = commentThread2.f;
                                    if (!(list instanceof Collection) || !list.isEmpty()) {
                                        for (NewsComment newsComment2 : list) {
                                            if (!(newsComment2.v || ((newsComment2.s || newsComment2.u) && newsComment2.f4() == 0))) {
                                                z2 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                z2 = false;
                                CommentThread commentThread3 = newsComment.L;
                                boolean z3 = (commentThread3 != null ? commentThread3.f.size() : 0) < newsComment.f4();
                                if (z2 || z3 || z) {
                                    return true;
                                }
                            }
                        }
                        f = false;
                        if (f) {
                        }
                    }
                }
            }
            z = false;
            newsComment = (NewsComment) iagVar;
            if (newsComment.f4() <= 0) {
            }
            UserId b22 = t11.b();
            if (fkq0.b(this.i)) {
            }
        }
        return false;
    }

    public String Y0() {
        int i = this.p;
        StringBuilder e = fw3.e(i != 1 ? i != 2 ? i != 6 ? "wall" : "clip" : "video" : "photo");
        e.append(this.i);
        e.append('_');
        e.append(this.j);
        e.append("_r");
        e.append(this.k);
        return e.toString();
    }

    public final void Y7(Photo photo) {
        r8(new op1(photo, 29));
    }

    @Override // xsna.b3g0, xsna.ud60
    public final boolean Z() {
        return this.w;
    }

    public final void Z3(Intent intent) {
        UserProfile userProfile;
        String action = intent.getAction();
        if (epx.f(action, "com.vkontakte.android.DONUT_SUBSCRIPTION_PAID")) {
            UserId userId = (UserId) intent.getParcelableExtra("id");
            if (userId == null) {
                return;
            }
            u8(userId, false);
            return;
        }
        if (!epx.f(action, zou.a) || (userProfile = (UserProfile) intent.getParcelableExtra(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)) == null) {
            return;
        }
        e8(userProfile.c, true);
    }

    public boolean a4(cbg cbgVar) {
        return true;
    }

    public final int a6() {
        sd90 sd90Var = this.Q;
        if (sd90Var != null) {
            return sd90Var.b();
        }
        return 0;
    }

    public final void a8(Photo photo) {
        r8(new r9(photo, 24));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    @Override // xsna.b3g0
    public final void b(String str) {
        if (g0()) {
            this.e.Ch(str);
        }
    }

    public final int b6() {
        return (!this.J || G7()) ? this.m : this.n;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    public final void b8(Target target) {
        m3g0 m3g0Var;
        if (this.e.t2() && (m3g0Var = this.S) != null) {
            m3g0Var.f0(target);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    public void c8(iag iagVar) {
        h1(iagVar);
        if (E7()) {
            this.e.Lm(iagVar);
        }
    }

    public dbg d4() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    public void d8(iag iagVar) {
        h1(iagVar);
        if (E7()) {
            this.e.Lm(iagVar);
        }
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    public final void e8(UserId userId, boolean z) {
        ListDataSet<cbg> listDataSet = this.K;
        int size = listDataSet.d.size();
        iag iagVar = null;
        for (int i = 0; i < size; i++) {
            cbg c2 = listDataSet.c(i);
            iag iagVar2 = c2 != null ? c2.a : null;
            if (iagVar2 instanceof NewsComment) {
                NewsComment newsComment = (NewsComment) iagVar2;
                if (epx.f(newsComment.j, userId)) {
                    newsComment.x = z;
                    listDataSet.d(i);
                    iagVar = !newsComment.s ? iagVar2 : null;
                }
            }
        }
        if (iagVar == null || !E7()) {
            return;
        }
        this.e.Za(iagVar);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    public void ei(iag iagVar, TypeReply typeReply) {
        ?? r4 = this.e;
        if (r4.t2()) {
            if (this.l > 0) {
                R7(false);
            }
            if (iagVar instanceof NewsComment) {
                m3g0 m3g0Var = this.S;
                if (m3g0Var != null) {
                    m3g0Var.i0((NewsComment) iagVar);
                }
                r4.eg((NewsComment) iagVar);
            }
            r4.nf();
        }
    }

    @Override // xsna.b3g0
    public final boolean f0() {
        return (this.p == 0 && hd60.a().a().e(m6r0.M) && this.v) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    @Override // xsna.ud60
    public final void f8(int i, iag iagVar, aa aaVar) {
        m3g0 m3g0Var;
        String str;
        Context context;
        Context context2;
        ?? r3 = this.e;
        Context context3 = r3.getContext();
        if (context3 == null) {
            return;
        }
        int i2 = 13;
        int i3 = 17;
        int i4 = 19;
        int i5 = 12;
        int i6 = 11;
        int i7 = 6;
        int i8 = 0;
        int i9 = 1;
        switch (i) {
            case 0:
                gd60.Z0(hd60.a(), context3, iagVar.getUid(), null, null, 12);
                break;
            case 1:
                ei(iagVar, TypeReply.Click);
                break;
            case 2:
                if (r3.t2()) {
                    if (this.l > 0) {
                        R7(false);
                    }
                    if (iagVar instanceof NewsComment) {
                        m3g0 m3g0Var2 = this.S;
                        if (m3g0Var2 != null) {
                            m3g0Var2.p0((NewsComment) iagVar, true, true);
                        }
                        r3.eg((NewsComment) iagVar);
                    }
                    r3.nf();
                    break;
                }
                break;
            case 3:
                fvr.l(context3, iagVar instanceof NewsComment ? ((NewsComment) iagVar).I.a : brm0.y(cqm0.f(iagVar.getText()), "<br/>", "\n"));
                P7(iagVar.getId(), context3);
                break;
            case 4:
                fvr.l(context3, i7(iagVar));
                cvk.u(R.string.link_copied, false);
                break;
            case 5:
                N3(iagVar, aaVar, null, false);
                break;
            case 6:
                if (r3.getContext() != null) {
                    hd60.a().i0(new fg1(5, this, iagVar));
                    break;
                }
                break;
            case 7:
                int id = iagVar.getId();
                if (id == this.l) {
                    R7(true);
                }
                io.reactivex.rxjava3.internal.operators.observable.m1 T = rsg0.T(new zh7(this.j, id, this.p, this.i, this.q, this.t, v7()));
                np3 np3Var = new np3(new np5(5, this, iagVar), i6);
                a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                r3.a(hg1.m(T.E(np3Var, lVar, kVar, kVar).a0(io.reactivex.rxjava3.android.schedulers.a.b()), r3.getContext(), 0L, false, 62).subscribe(new pp3(new g21(this, id, iagVar, i9), i6), new b60(new a60(16), i2)));
                break;
            case 8:
                this.l = iagVar.getId();
                if (!r3.W1()) {
                    r3.y2();
                }
                String text = iagVar.getText();
                this.f0.getClass();
                r3.Xh(d02.t(text, false), iagVar.u());
                if (fkq0.b(iagVar.getUid()) && (m3g0Var = this.S) != null) {
                    m3g0Var.I1();
                }
                if (iagVar instanceof NewsComment) {
                    r3.eg((NewsComment) iagVar);
                }
                r3.nf();
                break;
            case 9:
                gd60 a2 = hd60.a();
                int i10 = this.p;
                if (i10 != 1) {
                    str = "video_comment";
                    if (i10 != 2) {
                        if (i10 == 5) {
                            str = "market_comment";
                        } else if (i10 != 6) {
                            str = "comment";
                        }
                    }
                } else {
                    str = "photo_comment";
                }
                a2.v0(r3, str, iagVar.getId(), this.i, this.t);
                break;
            case 10:
                if (r3.t2() && (context = r3.getContext()) != null && hd60.a().S(context)) {
                    bbj0.a.getClass();
                    tbj0 a3 = bbj0.b.d.a(context);
                    UserId userId = this.i;
                    int i11 = this.j;
                    String str2 = this.r;
                    z74.b.getClass();
                    AttachmentInfo.b j = s84.j(33, new PostAttachment(userId, iagVar.getId(), iagVar.getText(), false, iagVar.getUid(), EmptyList.b), userId, iagVar.getId(), null);
                    Bundle bundle = j.e;
                    bundle.putInt("postId", i11);
                    bundle.putInt("parent_comment_id", iagVar.y4());
                    bundle.putString("authorName", iagVar.y1());
                    bundle.putString("authorPhotoUrl", iagVar.va());
                    bundle.putString("trackCode", str2);
                    a3.c = j.a();
                    c70.b bVar = new c70.b();
                    bVar.f = false;
                    bVar.b = false;
                    bVar.c = false;
                    bVar.k(false);
                    a3.d = bVar.b();
                    a3.h = Integer.valueOf(SharingDataType.COMMENT.ordinal());
                    a3.q = this.t;
                    a3.c();
                    break;
                }
                break;
            case 11:
                N3(iagVar, aaVar, null, true);
                break;
            case 12:
                int id2 = iagVar.getId();
                r3.a(hg1.m(rsg0.y0(new hax0(this.j, id2, this.p, this.i, this.q, this.t, v7()), null, null, 3), r3.getContext(), 0L, false, 62).subscribe(new p41(new j76(this, id2, i9), i5), new ir0(new qb(17), 7)));
                break;
            case 13:
                Context context4 = r3.getContext();
                if (context4 != null) {
                    UserId uid = iagVar.getUid();
                    if (!fkq0.d(uid)) {
                        if (fkq0.b(uid)) {
                            g2v.c().getClass();
                            int i12 = ReportFragment.a0;
                            ReportFragment.a a4 = ReportFragment.b.a();
                            a4.K("community");
                            a4.C(uid);
                            a4.k(context4);
                            break;
                        }
                    } else {
                        g2v.c().getClass();
                        int i13 = ReportFragment.a0;
                        ReportFragment.a a5 = ReportFragment.b.a();
                        a5.K("user");
                        a5.L(uid);
                        a5.k(context4);
                        break;
                    }
                }
                break;
            case 14:
                if (!i1(iagVar.getUid())) {
                    if (!epx.f(hd60.a().a().y(), iagVar.getUid())) {
                        ew3 ew3Var = new ew3(4, this, iagVar);
                        Context context5 = r3.getContext();
                        Activity h = context5 != null ? e3m.h(context5) : null;
                        if (h != null) {
                            h7u0.a aVar = new h7u0.a(h);
                            String N1 = iagVar.N1();
                            if (N1 == null) {
                                N1 = iagVar.y1();
                            }
                            aVar.a.f = h.getString(R.string.comments_user_ban_dialog, N1);
                            aVar.g0(R.string.confirm);
                            aVar.c0(R.string.yes, new nr1(ew3Var, 1));
                            aVar.W(R.string.no, null);
                            aVar.m();
                            break;
                        } else {
                            ew3Var.invoke();
                            break;
                        }
                    }
                } else {
                    nh3 nh3Var = new nh3(8, this, iagVar);
                    Context context6 = r3.getContext();
                    Activity h2 = context6 != null ? e3m.h(context6) : null;
                    if (iagVar.K8() && h2 != null) {
                        h7u0.a aVar2 = new h7u0.a(h2);
                        aVar2.g0(R.string.warning);
                        aVar2.U(R.string.don_ban_confirm);
                        aVar2.c0(R.string.don_delete, new tcg(i8, nh3Var));
                        aVar2.W(R.string.don_ban_cancel, null);
                        aVar2.m();
                        break;
                    } else {
                        nh3Var.invoke();
                        break;
                    }
                }
                break;
            case 15:
                if (iagVar instanceof NewsComment) {
                    r3.a(hg1.m(rsg0.y0(yfb.x(y7().i(((NewsComment) iagVar).i, this.i)), null, null, 3), r3.getContext(), 0L, false, 62).subscribe(new j50(new b7(i7, this, iagVar), i5), new sh6(new pf(i3), i2)));
                    break;
                }
                break;
            case 16:
                Fm(iagVar);
                break;
            case 17:
                I8(iagVar);
                break;
            case 18:
                if (r3.t2() && (context2 = r3.getContext()) != null && hd60.a().S(context2)) {
                    String i72 = i7(iagVar);
                    bbj0.a.getClass();
                    tbj0 a6 = bbj0.b.d.a(context2);
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("attachments", new LinkAttachment(i72));
                    bundle2.putString("link", i72);
                    bundle2.putInt("type_link", 2);
                    a6.c = new AttachmentInfo(11, 0L, 0L, null, bundle2);
                    a6.d = c70.i(a6.u, i72);
                    a6.x(SharingDataType.LINK.ordinal());
                    a6.c();
                    if (this.p == 6) {
                        int i14 = this.j;
                        long j2 = this.i.b;
                        String str3 = this.r;
                        this.g.getClass();
                        new iid0(MobileOfficialAppsCoreNavStat$EventScreen.COMMENTS_LIST_CLIP, SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsClipsStat$TypeClipCommentSharingItem(new MobileOfficialAppsClipsStat$TypeClipsClipItem(i14, j2, str3)), 3)).q();
                        break;
                    }
                }
                break;
            case 19:
                wg(iagVar, true);
                break;
            case 20:
                r3.a(hg1.n(io.reactivex.rxjava3.core.x.B(rsg0.D0(yfb.x(y7().d(iagVar.getId(), this.i))), rsg0.D0(new hax0(this.j, iagVar.getId(), this.p, this.i, this.q, this.t, v7())), new zq(10, new hkb(i9))), r3.getContext(), false, null, 62).subscribe(new defpackage.p(new vcg(this, iagVar, i9), 15), new sv(new sm(i5), i4)));
                break;
            case 21:
                r3.a(hg1.m(rsg0.y0(yfb.x(y7().f(this.i, Integer.valueOf(iagVar.getId()))), null, null, 3), r3.getContext(), 0L, false, 62).subscribe(new xz(new s53(i6, this, iagVar), i4), new f40(new tc(14), i6)));
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    @Override // xsna.tdg
    public final void fd(StickerAttachment stickerAttachment, o4l0 o4l0Var) {
        PopupStickerAnimation popupStickerAnimation = stickerAttachment.f.k;
        if (popupStickerAnimation != null) {
            this.e.Ql(popupStickerAnimation, o4l0Var);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    @Override // xsna.b3g0
    public final FragmentImpl g() {
        return this.e.g();
    }

    @Override // xsna.b3g0
    public final boolean g0() {
        UserId userId = this.i;
        int i = this.p;
        boolean z = this.w;
        ComFeatures comFeatures = ComFeatures.COM_DEFAULT_AUTHOR;
        comFeatures.getClass();
        if (com.vk.toggle.b.A.a(comFeatures) && fkq0.b(userId) && z) {
            t6g0 t6g0Var = t6g0.b;
            if (t6g0.b().g0(userId) && e43.l(0, 2, 6).contains(Integer.valueOf(i))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    public final void g8(UserProfile userProfile) {
        Activity h;
        Context context = this.e.getContext();
        if (context == null || (h = e3m.h(context)) == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("id", fkq0.e(this.i));
        bundle.putParcelable(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE, userProfile);
        hd60.a().b1(h, bundle);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    public void gm(iag iagVar, aa aaVar) {
        if (iagVar instanceof NewsComment) {
            NewsComment newsComment = (NewsComment) iagVar;
            if (newsComment.u) {
                return;
            }
            this.e.Jg(newsComment, aaVar);
        }
    }

    @Override // xsna.b3g0
    public final void h0(String str) {
        if (this.p != 0 || str == null || str.length() == 0) {
            return;
        }
        b.d a2 = io.reactivex.rxjava3.processors.b.a("comment_restriction", "type", "cancel_timer");
        a2.b(hd60.a().a().y(), "user_id");
        a2.b(String.valueOf(this.V), "timestamp");
        StringBuilder sb = new StringBuilder();
        sb.append(this.i);
        sb.append('_');
        sb.append(this.j);
        a2.b(sb.toString(), "post_id");
        a2.b(str, "reason");
        a2.e();
    }

    public final void h1(iag iagVar) {
        zeg zegVar = new zeg(this.j, this.i, iagVar);
        ce60.b.getClass();
        p870.f().e(116, zegVar);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    public io.reactivex.rxjava3.core.q<vqt> hj(com.vk.lists.c cVar, boolean z) {
        lg();
        ?? r2 = this.e;
        r2.A7();
        boolean Pj = r2.Pj();
        io.reactivex.rxjava3.core.q<vqt> h = this.o ? this.Q.h(b6()) : this.Q.a(z, Pj);
        return !Pj ? v8(h) : h;
    }

    @Override // xsna.b3g0
    public final boolean i0() {
        return this.p == 0;
    }

    public final boolean i1(UserId userId) {
        return fkq0.b(this.i) && !epx.f(userId, this.i) && F7() && !epx.f(hd60.a().a().y(), userId);
    }

    public String i7(iag iagVar) {
        String str;
        int i = this.p;
        String str2 = i != 1 ? i != 2 ? i != 6 ? "wall" : "clip" : "video" : "photo";
        StringBuilder sb = new StringBuilder("https://");
        sb.append(a0a.d);
        sb.append('/');
        sb.append(str2);
        sb.append(this.i);
        sb.append('_');
        sb.append(this.j);
        sb.append("?thread=");
        sb.append(this.k);
        if (iagVar.f4() == 0) {
            str = "&reply=" + iagVar.getId();
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    public void i8(int i, String str, List<? extends Attachment> list, Integer num) {
        UserId userId = this.i;
        int i2 = this.p;
        int i3 = this.j;
        String str2 = this.q;
        String str3 = this.t;
        this.L.getClass();
        String g0 = j5g.g0(list, StringUtils.COMMA, null, null, 0, null, 62);
        if (str2 == null) {
            str2 = "";
        }
        Map k = pn00.k(new Pair(0, new f9x0()), new Pair(1, new u5a0()), new Pair(2, new ubs0()), new Pair(6, new ubs0()));
        rzo rzoVar = new rzo(userId, i, i2, i3, str, g0, str2, str3);
        v960 v960Var = new v960(new u960(i2));
        if (i <= 0) {
            com.vk.metrics.eventtracking.b.a.q(new IllegalArgumentException("commentId must be positive"));
        }
        if (drm0.N(str) && drm0.N(g0)) {
            com.vk.metrics.eventtracking.b.a.q(new IllegalArgumentException("message or attachments must be provided"));
        }
        dcg dcgVar = (dcg) k.get(Integer.valueOf(i2));
        if (dcgVar == null) {
            throw new IllegalArgumentException(lhg.a(i2, "Unsupported itemType: "));
        }
        io.reactivex.rxjava3.internal.operators.observable.j1 U = dcgVar.a(rzoVar).U(new y7(new ic1(1, v960Var, ecg.class, "parse", "parse(Lorg/json/JSONObject;)Lcom/vk/newsfeed/api/data/NewsComment;", 0, 3), 19));
        ?? r1 = this.e;
        r1.a(hg1.m(U, r1.getContext(), 0L, false, 62).subscribe(new defpackage.d(new wze(this, 3), 16), new defpackage.z(new u4e(this, 4), 15)));
    }

    public final WallNegativeRepliesPlaceholder j7(vqt vqtVar) {
        if (x7() && !this.G) {
            return vqtVar.j;
        }
        return null;
    }

    public final void j8() {
        if (x7()) {
            this.K.z(new yad(this, 10));
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    public final void k8(boolean z) {
        this.w = z;
        d4().c = z || !((b25) this.d.getValue()).b();
        d4().d = t3();
    }

    public final void l8(int i) {
        n3g0 n3g0Var;
        m3g0 m3g0Var = this.S;
        if (m3g0Var == null || (n3g0Var = m3g0Var.l) == null) {
            return;
        }
        n3g0Var.i(i);
    }

    @Override // xsna.afg
    public void lg() {
        m3g0 m3g0Var = this.S;
        if (m3g0Var == null || !m3g0Var.e0()) {
            if (this.l > 0) {
                R7(true);
            }
        } else {
            m3g0 m3g0Var2 = this.S;
            if (m3g0Var2 != null) {
                m3g0Var2.u0();
            }
        }
    }

    public final void m8(int i) {
        n3g0 n3g0Var;
        m3g0 m3g0Var = this.S;
        if (m3g0Var == null || (n3g0Var = m3g0Var.l) == null) {
            return;
        }
        n3g0Var.j(i);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    public CharSequence mb(int i, CharSequence charSequence) {
        if (charSequence != null) {
            ce60.b.getClass();
            vag vagVar = new vag(p870.f(), new xa60.a(this.i, this.j, i));
            vpa vpaVar = this.W;
            vpaVar.getClass();
            io.reactivex.rxjava3.internal.operators.completable.m mVar = new io.reactivex.rxjava3.internal.operators.completable.m(new upa(vpaVar, charSequence, vagVar));
            asu0.a.getClass();
            this.e.a(itg0.l(mVar.q(asu0.i()).o(io.reactivex.rxjava3.android.schedulers.a.b())));
        }
        return charSequence;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    public final void n8(NewsComment newsComment) {
        this.O = newsComment;
        CommentThread commentThread = newsComment.L;
        boolean z = commentThread != null ? commentThread.c : false;
        this.w = z;
        boolean z2 = z || !((b25) this.d.getValue()).b();
        boolean z3 = this.w;
        d4().c = z2;
        d4().d = t3();
        CommentThread commentThread2 = newsComment.L;
        this.v = commentThread2 != null ? commentThread2.d : false;
        CommentDonut commentDonut = newsComment.M;
        ?? r4 = this.e;
        if (commentDonut != null && commentDonut.c != null) {
            r4.Ec(this.i, newsComment);
            r4.k0();
            return;
        }
        r4.ub();
        dbg d4 = d4();
        ListDataSet<cbg> listDataSet = this.K;
        listDataSet.setItems(dbg.a(d4, newsComment, listDataSet.d.size() == 0, null, 12));
        if (z3) {
            r4.y2();
        } else {
            r4.k0();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    @Override // xsna.tdg
    public final void nc() {
        this.e.D();
    }

    public final void o8() {
        n3g0 n3g0Var;
        m3g0 m3g0Var = this.S;
        if (m3g0Var == null || (n3g0Var = m3g0Var.l) == null) {
            return;
        }
        n3g0Var.k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [com.vk.core.fragments.FragmentImpl, java.lang.Object, xsna.bfg] */
    /* JADX WARN: Type inference failed for: r10v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v23, types: [android.os.Parcelable] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.afg
    public void onCreate(Bundle bundle) {
        UserId userId;
        UserId userId2;
        c.h hVar;
        sd90 t1t0Var;
        Parcelable parcelable;
        Object parcelable2;
        if (bundle == null || (userId = (UserId) bundle.getParcelable("owner_id")) == null) {
            userId = UserId.d;
        }
        this.i = userId;
        this.j = bundle != null ? bundle.getInt("id") : 0;
        this.k = bundle != null ? bundle.getInt("comment_id") : 0;
        this.n = bundle != null ? bundle.getInt("arg_parent_comment_id") : 0;
        this.J = bundle != null && bundle.getBoolean("arg_start_from_parent") && this.n > 0;
        int i = bundle != null ? bundle.getInt("arg_start_comment_id") : 0;
        this.m = i;
        this.o = i > 0;
        this.p = bundle != null ? bundle.getInt("type") : 0;
        this.s = bundle != null ? bundle.getString("ref_source") : null;
        this.t = bundle != null ? bundle.getString("referrer") : null;
        this.q = bundle != null ? bundle.getString("access_key") : null;
        this.r = bundle != null ? bundle.getString("track_code") : null;
        if (bundle == null || (userId2 = (UserId) bundle.getParcelable("uid")) == null) {
            userId2 = UserId.d;
        }
        this.u = userId2;
        this.v = bundle != null && bundle.getBoolean("arg_can_group_comment");
        this.w = bundle != null && bundle.getBoolean("arg_can_comment");
        this.x = bundle != null && bundle.getBoolean("arg_show_only_comments");
        this.y = bundle != null ? bundle.getString("arg_on_comment_mytracker_event") : null;
        this.z = bundle != null ? bundle.getBoolean("arg_can_share_on_wall", true) : true;
        this.A = bundle != null && bundle.getBoolean("arg_can_share_comments");
        this.B = bundle != null && bundle.getBoolean("arg_can_share_comments_link");
        LikesGetList.Type.a aVar = LikesGetList.Type.Companion;
        String string = bundle != null ? bundle.getString("arg_item_likes_type") : null;
        aVar.getClass();
        this.D = LikesGetList.Type.a.a(string);
        this.C = bundle != null && bundle.getBoolean("arg_dismiss_on_opening_video");
        if (bundle != null) {
            bundle.getInt("arg_badgeable_post_type");
        }
        this.F = bundle != null && bundle.getBoolean("arg_badgeable_disabled");
        this.G = bundle != null && bundle.getBoolean("arg_without_negative_replies_placeholder");
        if (bundle != null && bundle.containsKey("arg_without_negative_replies_placeholder")) {
            bundle.remove("arg_without_negative_replies_placeholder");
        }
        if (bundle != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = bundle.getParcelable("video_statistic", VideoStatistic.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                ?? parcelable3 = bundle.getParcelable("video_statistic");
                parcelable = parcelable3 instanceof VideoStatistic ? parcelable3 : null;
            }
            r2 = (VideoStatistic) parcelable;
        }
        this.H = r2;
        if (x7()) {
            hVar = new c.h((a) this.e0.getValue());
            hVar.i = 50;
            hVar.c = 10;
        } else {
            hVar = new c.h(this);
            hVar.i = 50;
            hVar.c = 10;
        }
        ?? r10 = this.e;
        com.vk.lists.c gj = r10.gj(hVar);
        this.P = gj;
        fae faeVar = this.c;
        ics0 ics0Var = this.b;
        dge dgeVar = new dge(faeVar, ics0Var);
        int i2 = this.p;
        if (r10 instanceof VideoCommentsThreadInPlayerFragment) {
            t1t0Var = new mcs0(gj, ics0Var);
        } else if (r10 instanceof VideoCommentThreadFragment) {
            t1t0Var = i2 == 2 ? new mcs0(gj, ics0Var) : dgeVar.b(i2, gj);
        } else if (r10 instanceof CommentThreadFragment) {
            t1t0Var = dgeVar.b(i2, gj);
        } else if ((r10 instanceof VideoBottomSheetTreeCommentsFragment) || (r10 instanceof VideoCommentsTreeInPlayerFragment) || (r10 instanceof VideoPostViewFragment)) {
            t1t0Var = i2 == 2 ? new t1t0(gj, ics0Var) : dgeVar.c(i2, gj, true, true);
        } else if ((r10 instanceof NewsEntryFeedbackCommentsFragment) || (r10 instanceof PostViewFragment)) {
            PostViewFragment postViewFragment = (PostViewFragment) r10;
            t1t0Var = dgeVar.c(i2, gj, !postViewFragment.qo(), !postViewFragment.qo());
        } else {
            if (!(r10 instanceof PostFragment)) {
                throw new IllegalArgumentException("Unsupported view type: ".concat(r10.getClass().getSimpleName()));
            }
            t1t0Var = i2 == 2 ? new t1t0(gj, ics0Var) : dgeVar.c(i2, gj, true, true);
        }
        t1t0Var.c(this.i);
        t1t0Var.k(this.j);
        t1t0Var.j(this.p);
        t1t0Var.E(this.q);
        t1t0Var.setTrackCode(this.r);
        t1t0Var.o(u7());
        t1t0Var.m(r2);
        t1t0Var.f(E7());
        this.Q = t1t0Var;
        r10.u1(gj);
        r10.bm(b6());
        d4().c = this.w || !((b25) this.d.getValue()).b();
        d4().d = t3();
        d4().j = this.p;
        d4().e = this.p == 6;
        d4().i = this.p == 2;
        d4().k = G7();
        d4().h = this.x;
        this.X = ((StoriesComponent) ((k7m) m7m.f(this)).a(fpf0.a(StoriesComponent.class))).Pa().a(new b(1, this, mdg.class, "markStoriesAsSeenLocal", "markStoriesAsSeenLocal(Lcom/vk/dto/common/id/UserId;)V", 0));
        m3g0 m3g0Var = this.S;
        if (m3g0Var != null) {
            m3g0Var.r1();
        }
    }

    @Override // xsna.cc6
    public void onDestroy() {
        io.reactivex.rxjava3.disposables.c cVar = this.X;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // xsna.cc6
    public final void onPause() {
        throw null;
    }

    @Override // xsna.cc6
    public final void onResume() {
        throw null;
    }

    @Override // xsna.afg, xsna.b3g0, xsna.tdg
    public final UserId p() {
        return this.i;
    }

    @Override // xsna.ud60
    public final void p0() {
        U7(I7(), false, false);
    }

    public void p3(cbg cbgVar) {
        iag iagVar = cbgVar.a;
        if (iagVar instanceof NewsComment) {
            CommentThread commentThread = ((NewsComment) iagVar).L;
            ArrayList v0 = j5g.v0(iagVar, commentThread != null ? commentThread.f : new ArrayList());
            ArrayList arrayList = new ArrayList(c5g.u(v0, 10));
            Iterator it = v0.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((NewsComment) it.next()).i));
            }
            this.K.z(new com.vk.movika.sdk.base.logic.processor.d(4, cbgVar, j5g.S0(arrayList)));
            j8();
        }
    }

    public final void p8(int i) {
        n3g0 n3g0Var;
        m3g0 m3g0Var = this.S;
        if (m3g0Var == null || (n3g0Var = m3g0Var.l) == null) {
            return;
        }
        n3g0Var.n(i);
    }

    public final boolean q8(vqt vqtVar) {
        return j7(vqtVar) != null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    @Override // xsna.b3g0
    public final void r1(bja0.a aVar) {
        this.e.r1(aVar);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    public final void r8(final izs<? super PhotoAttachment, Boolean> izsVar) {
        io.reactivex.rxjava3.internal.operators.observable.s0 s0Var = new io.reactivex.rxjava3.internal.operators.observable.s0(new Callable() { // from class: xsna.edg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ArrayList arrayList = new ArrayList();
                mdg.this.K.u(new iq8(1, arrayList, izsVar));
                return arrayList;
            }
        });
        asu0.a.getClass();
        this.e.a(s0Var.r0(asu0.i()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new f50(new com.vk.movika.sdk.base.logic.interactor.e(this, 21), 17), new zl0(new z90(20), 12)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    public void s2() {
        this.e.nf();
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    public final NewsComment s8(String str, ArrayList arrayList, int i) {
        ListDataSet<cbg> listDataSet = this.K;
        int size = listDataSet.d.size();
        for (int i2 = 0; i2 < size; i2++) {
            cbg c2 = listDataSet.c(i2);
            if (c2 != null) {
                NewsComment newsComment = (NewsComment) c2.a;
                if (newsComment.i == i) {
                    if (ogg.a.contains(Integer.valueOf(c2.c))) {
                        newsComment.Bb(str, true);
                        ArrayList<Attachment> arrayList2 = new ArrayList<>(arrayList.size());
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Attachment attachment = ((EntryAttachment) it.next()).b;
                            arrayList2.add(attachment);
                            if (attachment instanceof SnippetAttachment) {
                                ((SnippetAttachment) attachment).t = true;
                            } else if (attachment instanceof ArticleAttachment) {
                                ((ArticleAttachment) attachment).h = true;
                            }
                        }
                        newsComment.J = arrayList2;
                        int i3 = newsComment.i;
                        ?? r8 = this.e;
                        r8.bm(i3);
                        r8.Rb(i2);
                        h1(newsComment);
                        return newsComment;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    @Override // xsna.ud60
    public final boolean sd(iag iagVar) {
        if (iagVar.d5()) {
            return false;
        }
        UserId uid = iagVar.getUid();
        return fkq0.b(this.i) ? i1(uid) : epx.f(hd60.a().a().y(), uid) ^ true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    @Override // xsna.tdg
    public final boolean t2() {
        return this.e.t2();
    }

    public boolean t3() {
        return this.I;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    public final void t8(NewsComment newsComment) {
        NewsComment newsComment2 = this.O;
        if (newsComment2 != null) {
            CommentThread commentThread = newsComment2.L;
            CommentThread commentThread2 = commentThread != null ? new CommentThread(commentThread.b, commentThread.c, commentThread.d, commentThread.e, new ArrayList(commentThread.f), commentThread.g, commentThread.h, commentThread.i, commentThread.j) : new CommentThread(0, false, false, false, new ArrayList(), null, null, false, null);
            List<NewsComment> list = commentThread2.f;
            Iterator<NewsComment> it = list.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (it.next().i == newsComment.i) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                list.set(i, newsComment);
            }
            newsComment2.L = commentThread2;
        }
        final l00 l00Var = new l00(newsComment, 23);
        Predicate<? super cbg> predicate = new Predicate() { // from class: xsna.ldg
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((Boolean) l00.this.invoke(obj)).booleanValue();
            }
        };
        ListDataSet<cbg> listDataSet = this.K;
        int w = listDataSet.w(predicate);
        if (w != -1) {
            cbg c2 = listDataSet.c(w);
            listDataSet.F(w, new cbg(newsComment, c2.b, c2.c));
            int i2 = newsComment.i;
            ?? r1 = this.e;
            r1.bm(i2);
            r1.wf(w);
        }
        h1(newsComment);
    }

    @Override // xsna.ud60
    public final boolean tf(iag iagVar) {
        UserId b2 = t11.b();
        if (fkq0.d(b2)) {
            boolean f = epx.f(iagVar.getUid(), b2);
            boolean z = (F7() && (iagVar.getUid().b == 101 || epx.f(iagVar.getUid(), this.i))) ? false : true;
            if (!f && z) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    @Override // xsna.b3g0
    public final void u0(String str, int i, List<? extends Attachment> list, UserId userId, boolean z, boolean z2) {
        ?? r0 = this.e;
        if (z2) {
            r0.I9();
            lg();
        }
        int i2 = this.l;
        if (i2 > 0) {
            i8(i2, str, list, Integer.valueOf(i));
        } else {
            r0.a(hg1.m(V5(new l7k(str, i, list, userId, this.V, this.T, w7())), r0.getContext(), 0L, false, 62).subscribe(new lf1(new cdg(this, z, 0), 12), new f60(new az2(9, this, userId), 16)));
        }
    }

    public final int u7() {
        Integer valueOf = Integer.valueOf(this.k);
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        Integer valueOf2 = Integer.valueOf(this.m);
        Integer num = valueOf2.intValue() > 0 ? valueOf2 : null;
        return num != null ? num.intValue() : this.n;
    }

    public void u8(UserId userId, boolean z) {
        com.vk.lists.c cVar;
        NewsComment newsComment = this.O;
        boolean f = epx.f(this.i, userId);
        if ((z || (newsComment != null && A7(newsComment, userId, f))) && (cVar = this.P) != null) {
            cVar.p(true);
        }
    }

    @Override // com.vk.lists.c.l
    public final io.reactivex.rxjava3.core.q<vqt> ui(int i, com.vk.lists.c cVar) {
        return this.Q.d();
    }

    public final String v7() {
        fgg value;
        CommentScreenMode a2;
        Lazy<fgg> lazy = this.f;
        if (lazy == null || (value = lazy.getValue()) == null || (a2 = value.a()) == null) {
            return null;
        }
        return a2.h();
    }

    public io.reactivex.rxjava3.core.q<vqt> v8(io.reactivex.rxjava3.core.q<vqt> qVar) {
        int i = this.p;
        return (i == 2 || i == 6) ? new eae(this.c).a(u7(), this.i, this.H).w().a0(io.reactivex.rxjava3.android.schedulers.a.b()).L(new kb(new bi0(7, this, qVar), 19), false) : rsg0.y0(new o9x0(this.i, u7()), null, null, 3).L(new l8(new k8(9, this, qVar), 17), false);
    }

    public phi0 w7() {
        return this.h;
    }

    @Override // xsna.ud60
    public final void w9() {
        sd90 sd90Var = this.Q;
        mdp0 mdp0Var = sd90Var instanceof mdp0 ? (mdp0) sd90Var : null;
        if (mdp0Var != null) {
            mdp0Var.c = true;
            mdp0Var.a.q(1);
            com.vk.lists.c cVar = this.P;
            if (cVar != null) {
                cVar.n(false);
            }
            com.vk.lists.c cVar2 = this.P;
            if (cVar2 != null) {
                cVar2.r(true);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    public void wd(io.reactivex.rxjava3.core.q<vqt> qVar, boolean z, com.vk.lists.c cVar) {
        if (!x7() && a6() == 1) {
            U7(qVar, true, true);
            return;
        }
        if (this.o) {
            X7(qVar);
            return;
        }
        boolean x7 = x7();
        ?? r1 = this.e;
        if (!x7) {
            r1.a(qVar.subscribe(new ph3(new ucg(this, z), 16), new oz(new no1(this, z, 1), 11)));
        } else {
            boolean z2 = a6() == 1;
            r1.a(qVar.subscribe(new xf1(new hdg(this, z, z2), 14), new ho1(new idg(this, z, z2), 13)));
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    @Override // xsna.afg
    public final void wg(iag iagVar, boolean z) {
        io.reactivex.rxjava3.core.b0 b2;
        if (iagVar.z3() && z) {
            b2 = rsg0.D0(yfb.x(y7().d(iagVar.getId(), this.i))).l(new pb(new c(1, it80.b, it80.a.class, "of", "of(Ljava/lang/Object;)Lcom/vk/core/util/Optional;", 0), 13));
        } else {
            b2 = tr.b(it80.b);
        }
        io.reactivex.rxjava3.core.x B = io.reactivex.rxjava3.core.x.B(b2, rsg0.D0(yfb.x(y7().e(this.i, Integer.valueOf(iagVar.getId()), Boolean.valueOf(z)))), new wq(12, new cc5(2)));
        ?? r1 = this.e;
        r1.a(hg1.n(B, r1.getContext(), false, null, 62).subscribe(new lz(new kdg(this, iagVar, z, 0), 12), new ph3(new p60(16), 17)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    @Override // xsna.tdg
    public final void x(int i) {
        ?? r0 = this.e;
        if (r0.t2()) {
            if (this.w) {
                r0.x(i);
            } else {
                r0.d6(i);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    @Override // xsna.bd70
    public final void x0(int i, int i2, Object obj) {
        UserId userId;
        Long e;
        cbg t;
        final xa60 xa60Var;
        xa60.a aVar;
        int i3 = 0;
        ?? r3 = this.e;
        final ListDataSet<cbg> listDataSet = this.K;
        if (i == 9) {
            Bundle bundle = (Bundle) obj;
            String string = bundle.getString("type");
            if (string != null) {
                int hashCode = string.hashCode();
                if (hashCode == 3599307) {
                    if (!string.equals("user") || (userId = (UserId) bundle.getParcelable("uid")) == null) {
                        return;
                    }
                    int size = listDataSet.d.size();
                    while (i3 < size) {
                        cbg c2 = listDataSet.c(i3);
                        iag iagVar = c2 != null ? c2.a : null;
                        if (iagVar instanceof NewsComment) {
                            NewsComment newsComment = (NewsComment) iagVar;
                            if (epx.f(newsComment.j, userId)) {
                                newsComment.w = true;
                                listDataSet.d(i3);
                            }
                        }
                        i3++;
                    }
                    return;
                }
                if (hashCode == 950398559 && string.equals("comment") && E7() && (e = bo8.e(bundle, "item_id")) != null) {
                    int longValue = (int) e.longValue();
                    int size2 = listDataSet.d.size();
                    while (i3 < size2) {
                        cbg c3 = listDataSet.c(i3);
                        iag iagVar2 = c3 != null ? c3.a : null;
                        if (iagVar2 instanceof NewsComment) {
                            NewsComment newsComment2 = (NewsComment) iagVar2;
                            if (newsComment2.i == longValue && !newsComment2.w) {
                                newsComment2.w = true;
                                listDataSet.d(i3);
                                r3.jl();
                                return;
                            }
                        }
                        i3++;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i != 116) {
            if (i == 133) {
                com.vk.lists.c cVar = this.P;
                if (cVar != null) {
                    cVar.p(true);
                    return;
                }
                return;
            }
            if (i == 140) {
                final boolean f = epx.f(obj, Boolean.TRUE);
                final t960 t960Var = new t960();
                r3.a(t960.a(new io.reactivex.rxjava3.internal.operators.single.v(new Callable(t960Var, listDataSet, f) { // from class: xsna.s960
                    public final /* synthetic */ ListDataSet b;
                    public final /* synthetic */ boolean c;

                    {
                        this.b = listDataSet;
                        this.c = f;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ArrayList arrayList = new ArrayList();
                        ObsceneTextFilter.a aVar2 = ObsceneTextFilter.Companion;
                        Boolean valueOf = Boolean.valueOf(this.c);
                        aVar2.getClass();
                        ej90.b bVar = new ej90.b(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, ObsceneTextFilter.a.a(valueOf), null, 0, 0, null, null, 503);
                        ej90.c cVar2 = new ej90.c(0);
                        AbstractList abstractList = this.b.d;
                        for (int i4 = 0; i4 < abstractList.size(); i4++) {
                            Integer valueOf2 = Integer.valueOf(i4);
                            iag iagVar3 = ((cbg) abstractList.get(i4)).a;
                            NewsComment newsComment3 = iagVar3 instanceof NewsComment ? (NewsComment) iagVar3 : null;
                            if (newsComment3 == null) {
                                s3q0 s3q0Var = s3q0.a;
                            } else {
                                if (t960.c(newsComment3, bVar, cVar2)) {
                                    arrayList.add(valueOf2);
                                }
                                s3q0 s3q0Var2 = s3q0.a;
                            }
                        }
                        return arrayList;
                    }
                }), listDataSet));
                return;
            } else {
                if (i == 147 && (aVar = (xa60Var = (xa60) obj).b) != null && epx.f(aVar.a, this.i) && aVar.b == this.j) {
                    final t960 t960Var2 = new t960();
                    r3.a(t960.a(new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.r960
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            ArrayList arrayList = new ArrayList();
                            xa60 xa60Var2 = xa60Var;
                            xa60.a aVar2 = xa60Var2.b;
                            if (aVar2 == null) {
                                return arrayList;
                            }
                            boolean z = !xa60Var2.c;
                            ObsceneTextFilter.a aVar3 = ObsceneTextFilter.Companion;
                            Boolean valueOf = Boolean.valueOf(z);
                            aVar3.getClass();
                            listDataSet.u(new le0(t960.this, aVar2, new ej90.b(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, ObsceneTextFilter.a.a(valueOf), null, 0, 0, null, null, 503), new ej90.c(0), arrayList));
                            return arrayList;
                        }
                    }), listDataSet));
                    return;
                }
                return;
            }
        }
        iag iagVar3 = ((zeg) obj).a;
        Iterator<cbg> it = listDataSet.d.iterator();
        while (it.hasNext()) {
            cbg next = it.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                e43.t();
                throw null;
            }
            cbg cbgVar = next;
            if (epx.f(cbgVar.a, iagVar3)) {
                iag iagVar4 = cbgVar.a;
                NewsComment.Ab(iagVar4 instanceof NewsComment ? (NewsComment) iagVar4 : null, iagVar3 instanceof NewsComment ? (NewsComment) iagVar3 : null);
                listDataSet.d(i3);
            } else if (epx.f(cbgVar.b, iagVar3)) {
                iag iagVar5 = cbgVar.b;
                NewsComment.Ab(iagVar5 instanceof NewsComment ? (NewsComment) iagVar5 : null, iagVar3 instanceof NewsComment ? (NewsComment) iagVar3 : null);
                listDataSet.d(i3);
            }
            i3 = i4;
        }
        if (iagVar3.z3() && (iagVar3 instanceof NewsComment) && (t = listDataSet.t(new ddg(new cqf(iagVar3, 3), 0))) != null) {
            p3(t);
        }
    }

    public final boolean x7() {
        return this.p == 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    public void xh(iag iagVar) {
        NewsComment newsComment;
        ?? r0 = this.e;
        if (r0.t2()) {
            if (this.l > 0) {
                R7(false);
            }
            if (iagVar instanceof NewsComment) {
                NewsComment newsComment2 = (NewsComment) iagVar;
                CommentThread commentThread = newsComment2.L;
                if (commentThread == null || (newsComment = (NewsComment) j5g.k0(commentThread.f)) == null) {
                    newsComment = newsComment2;
                }
                m3g0 m3g0Var = this.S;
                if (m3g0Var != null) {
                    m3g0Var.p0(newsComment2, false, false);
                }
                r0.eg(newsComment);
            }
            r0.nf();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final lax0 y7() {
        return (lax0) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    @Override // xsna.tdg
    public final boolean z(rdg rdgVar) {
        boolean z = rdgVar instanceof rdg.a;
        sp spVar = this.L;
        el3<Integer> el3Var = this.M;
        ?? r11 = this.e;
        if (z) {
            rdg.a aVar = (rdg.a) rdgVar;
            NewsComment newsComment = aVar.b;
            aa aaVar = aVar.c;
            if (r11.t2() && !el3Var.contains(Integer.valueOf(newsComment.i))) {
                el3Var.add(Integer.valueOf(newsComment.i));
                newsComment.C = true;
                newsComment.p++;
                h1(newsComment);
                UserId userId = this.i;
                int i = newsComment.i;
                String str = this.q;
                String str2 = this.t;
                spVar.getClass();
                s9x0 s9x0Var = new s9x0(true, null, userId, i, 4, 0, str, null, null);
                s9x0Var.R("from_group", true);
                s9x0Var.j("ref", str2);
                r11.a(rsg0.y0(s9x0Var, null, null, 3).subscribe(new da(new it8(newsComment, this, aaVar, 1), 16), new ea(new na7(10, this, newsComment), 20)));
                return true;
            }
        } else {
            if (!(rdgVar instanceof rdg.b)) {
                return r11.z(rdgVar);
            }
            rdg.b bVar = (rdg.b) rdgVar;
            NewsComment newsComment2 = bVar.a;
            aa aaVar2 = bVar.b;
            if (r11.t2() && !el3Var.contains(Integer.valueOf(newsComment2.i))) {
                el3Var.add(Integer.valueOf(newsComment2.i));
                newsComment2.C = false;
                newsComment2.p--;
                h1(newsComment2);
                UserId userId2 = this.i;
                int i2 = newsComment2.i;
                String str3 = this.q;
                String str4 = this.t;
                spVar.getClass();
                s9x0 s9x0Var2 = new s9x0(false, null, userId2, i2, 4, 0, str3, null, null);
                s9x0Var2.R("from_group", true);
                s9x0Var2.j("ref", str4);
                r11.a(rsg0.y0(s9x0Var2, null, null, 3).subscribe(new js1(new eo6(newsComment2, this, aaVar2, 3), 16), new i22(new fo6(7, this, newsComment2), 11)));
                return true;
            }
        }
        return false;
    }

    public final void z7(Throwable th) {
        if (th instanceof VKApiExecutionException) {
            rte0.n((VKApiExecutionException) th, new com.vk.movika.sdk.base.observable.g(this, 23), null);
        } else {
            cvk.u(R.string.live_network_error_description, false);
        }
    }

    @Override // xsna.f420
    public final void S1() {
    }

    @Override // xsna.f420
    public final void e0() {
    }

    public void M7(iag iagVar) {
    }

    @Override // xsna.afg
    public void Q1(String str) {
    }

    @Override // xsna.f420
    public final void s5(Attachment attachment) {
    }

    @Override // xsna.f420
    public final void v5(Throwable th) {
    }

    @Override // xsna.f420
    public final void x4(boolean z) {
    }

    public void bi(int i, Context context) {
    }

    public void wb(int i, iag iagVar) {
    }
}
