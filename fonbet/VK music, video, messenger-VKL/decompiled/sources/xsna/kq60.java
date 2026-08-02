package xsna;

import android.support.v4.media.session.PlaybackStateCompat;
import com.vk.api.likes.LikesGetList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Flags;
import com.vk.dto.newsfeed.activities.Comment;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.MyTargetBrandLiftSurvey;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import xsna.ds60;
import xsna.i6c0;
import xsna.qn60;
import xsna.qr60;
import xsna.xa60;
import xsna.yo60;

/* compiled from: NewsfeedListExternalTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class kq60 extends evg0<ur60, on50, ds60.b, ds60, qr60, yo60> {
    public final qn60 f;
    public final pn60 g;
    public final mtx h;
    public final p960 i;
    public final Lazy j;

    /* compiled from: NewsfeedListExternalTaskExecutor.kt */
    public static final class a implements qn60.b {
        public final NewsEntry a;
        public final pn60 b;

        public a(NewsEntry newsEntry, pn60 pn60Var) {
            this.a = newsEntry;
            this.b = pn60Var;
        }

        @Override // xsna.qn60.b
        public final void a(qn60.a aVar) {
            NewsEntry newsEntry = this.a;
            if (aVar.b(newsEntry)) {
                qn60 qn60Var = aVar.a;
                ux80<Object, List<ol60>> ux80Var = qn60Var.b;
                List<ol60> d = ux80Var.b.d(newsEntry);
                List<ol60> c = pn60.c(this.b, newsEntry, new dmy(newsEntry), null, 12);
                qn60.a.n(c, d);
                ux80Var.put(newsEntry, c);
                qn60Var.c.a(newsEntry);
            }
        }
    }

    public kq60(qn60 qn60Var, pn60 pn60Var, Lazy lazy, jm50 jm50Var, eht ehtVar) {
        super(jm50Var, ehtVar);
        this.f = qn60Var;
        this.g = pn60Var;
        this.h = new mtx();
        this.i = new p960(lazy);
        this.j = lazy;
    }

    @Override // xsna.mn50
    public final /* bridge */ /* synthetic */ jn50 d(hn50 hn50Var) {
        s((ds60.b) hn50Var);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:494:0x08bb, code lost:
    
        if (r4 != (-1)) goto L453;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x08bd, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x08c3, code lost:
    
        if (r3 == null) goto L636;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x08c5, code lost:
    
        r3 = r3.intValue() + 1;
        r2 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x08d2, code lost:
    
        if (r3 >= r0.size()) goto L458;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x08d5, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x08d6, code lost:
    
        if (r2 == null) goto L466;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x08d8, code lost:
    
        r0 = (com.vk.feed.core.models.MyTargetBrandLiftSurvey.Question) xsna.j5g.b0(r2.intValue(), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x08e2, code lost:
    
        if (r0 == null) goto L466;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x08e4, code lost:
    
        r0 = r0.b;
        r2 = r15.E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x08e8, code lost:
    
        if (r2 != null) goto L465;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x08ea, code lost:
    
        r15.E = new com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry.b(r0, xsna.pn00.m(new kotlin.Pair(r0, new java.util.LinkedHashSet())), false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0904, code lost:
    
        r15.E = com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry.b.a(r2, r0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x090a, code lost:
    
        a(new xsna.ds60.b(new com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction.c.f0(r15)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x08bf, code lost:
    
        r3 = java.lang.Integer.valueOf(r4);
     */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(ds60.b bVar) {
        Object obj;
        Object obj2;
        MyTargetBrandLiftSurvey myTargetBrandLiftSurvey;
        MyTargetBrandLiftSurvey.Question question;
        MyTargetBrandLiftSurvey myTargetBrandLiftSurvey2;
        Map<String, Set<String>> map;
        Set<String> set;
        Map<String, Set<String>> map2;
        Object obj3;
        Object obj4;
        bp50 bp50Var;
        Object obj5;
        b520 b520Var;
        ArrayList arrayList;
        ArrayList<b520> arrayList2;
        b520 b520Var2;
        Integer N;
        NewsfeedExternalAction.c cVar = bVar.b;
        boolean z = cVar instanceof NewsfeedExternalAction.c.r;
        pn60 pn60Var = this.g;
        qn60 qn60Var = this.f;
        if (z) {
            Object f = qn60Var.f(new mxf0(((NewsfeedExternalAction.c.r) cVar).a, pn60Var));
            if (!(f instanceof Result.Failure)) {
                qn60.c cVar2 = (qn60.c) f;
                e(new qr60.a.c(cVar2.a, cVar2.b, false, null, 24));
            }
            Throwable a2 = Result.a(f);
            if (a2 != null) {
                com.vk.metrics.eventtracking.b.a.a(a2);
                return;
            }
            return;
        }
        if (cVar instanceof NewsfeedExternalAction.c.w) {
            NewsfeedExternalAction.c.w wVar = (NewsfeedExternalAction.c.w) cVar;
            t(wVar.b, wVar.a);
            return;
        }
        r5 = null;
        r5 = null;
        xa60.a aVar = null;
        Object obj6 = null;
        r5 = null;
        ajx ajxVar = null;
        if (cVar instanceof NewsfeedExternalAction.c.x) {
            NewsfeedExternalAction.c.x xVar = (NewsfeedExternalAction.c.x) cVar;
            v(xVar.a, xVar.b, null);
            return;
        }
        if (cVar instanceof NewsfeedExternalAction.c.f0) {
            NewsfeedExternalAction.c.f0 f0Var = (NewsfeedExternalAction.c.f0) cVar;
            NewsEntry newsEntry = f0Var.a;
            v(newsEntry, newsEntry, f0Var.b);
            return;
        }
        if (cVar instanceof NewsfeedExternalAction.c.u) {
            Object f2 = qn60Var.f(new lxf0(((NewsfeedExternalAction.c.u) cVar).a));
            if (!(f2 instanceof Result.Failure)) {
                qn60.c cVar3 = (qn60.c) f2;
                e(new qr60.a.c(cVar3.a, cVar3.b, false, null, 24));
            }
            Throwable a3 = Result.a(f2);
            if (a3 != null) {
                com.vk.metrics.eventtracking.b.a.a(a3);
                return;
            }
            return;
        }
        if (cVar instanceof NewsfeedExternalAction.c.m) {
            return;
        }
        if (cVar instanceof NewsfeedExternalAction.c.g0) {
            Object f3 = qn60Var.f(new e8q0(((NewsfeedExternalAction.c.g0) cVar).a, pn60Var));
            if (!(f3 instanceof Result.Failure)) {
                qn60.c cVar4 = (qn60.c) f3;
                e(new qr60.a.c(cVar4.a, cVar4.b, false, null, 24));
            }
            Throwable a4 = Result.a(f3);
            if (a4 != null) {
                com.vk.metrics.eventtracking.b.a.a(a4);
                return;
            }
            return;
        }
        if (cVar instanceof NewsfeedExternalAction.c.i0) {
            Object f4 = qn60Var.f(new c8q0(((NewsfeedExternalAction.c.i0) cVar).a, pn60Var));
            if (!(f4 instanceof Result.Failure)) {
                qn60.c cVar5 = (qn60.c) f4;
                e(new qr60.a.c(cVar5.a, cVar5.b, false, null, 24));
            }
            Throwable a5 = Result.a(f4);
            if (a5 != null) {
                com.vk.metrics.eventtracking.b.a.a(a5);
                return;
            }
            return;
        }
        if (cVar instanceof NewsfeedExternalAction.c.l0) {
            Object f5 = qn60Var.f(new y8q0(((NewsfeedExternalAction.c.l0) cVar).a, pn60Var));
            if (!(f5 instanceof Result.Failure)) {
                qn60.c cVar6 = (qn60.c) f5;
                e(new qr60.a.c(cVar6.a, cVar6.b, false, null, 24));
            }
            Throwable a6 = Result.a(f5);
            if (a6 != null) {
                com.vk.metrics.eventtracking.b.a.a(a6);
                return;
            }
            return;
        }
        if (cVar instanceof NewsfeedExternalAction.c.k0) {
            return;
        }
        if (cVar instanceof NewsfeedExternalAction.c.l) {
            NewsfeedExternalAction.c.l lVar = (NewsfeedExternalAction.c.l) cVar;
            iag iagVar = lVar.a;
            int i = lVar.c;
            UserId userId = lVar.b;
            NewsComment newsComment = iagVar instanceof NewsComment ? (NewsComment) iagVar : null;
            if (newsComment == null) {
                return;
            }
            Object f6 = qn60Var.f(newsComment.u ? new jxf0(newsComment, userId, i, pn60Var) : new j8q0(newsComment, userId, i, pn60Var));
            if (!(f6 instanceof Result.Failure)) {
                qn60.c cVar7 = (qn60.c) f6;
                e(new qr60.a.c(cVar7.a, cVar7.b, false, null, 24));
            }
            Throwable a7 = Result.a(f6);
            if (a7 != null) {
                com.vk.metrics.eventtracking.b.a.a(a7);
                return;
            }
            return;
        }
        if (cVar instanceof NewsfeedExternalAction.c.j) {
            Object f7 = qn60Var.f(new p7q(((NewsfeedExternalAction.c.j) cVar).a, pn60Var));
            if (!(f7 instanceof Result.Failure)) {
                qn60.c cVar8 = (qn60.c) f7;
                e(new qr60.a.c(cVar8.a, cVar8.b, false, null, 24));
            }
            Throwable a8 = Result.a(f7);
            if (a8 != null) {
                com.vk.metrics.eventtracking.b.a.a(a8);
                return;
            }
            return;
        }
        if (cVar instanceof NewsfeedExternalAction.c.g) {
            Object f8 = qn60Var.f(new bcn(((NewsfeedExternalAction.c.g) cVar).a, pn60Var));
            if (!(f8 instanceof Result.Failure)) {
                qn60.c cVar9 = (qn60.c) f8;
                e(new qr60.a.c(cVar9.a, cVar9.b, false, null, 24));
            }
            Throwable a9 = Result.a(f8);
            if (a9 != null) {
                com.vk.metrics.eventtracking.b.a.a(a9);
                return;
            }
            return;
        }
        if (cVar instanceof NewsfeedExternalAction.c.s) {
            Object f9 = qn60Var.f(new iwf0(((NewsfeedExternalAction.c.s) cVar).a, pn60Var));
            if (!(f9 instanceof Result.Failure)) {
                qn60.c cVar10 = (qn60.c) f9;
                e(new qr60.a.c(cVar10.a, cVar10.b, false, null, 24));
            }
            Throwable a10 = Result.a(f9);
            if (a10 != null) {
                com.vk.metrics.eventtracking.b.a.a(a10);
                return;
            }
            return;
        }
        if (cVar instanceof NewsfeedExternalAction.c.q) {
            Object b = qn60Var.b(new i6c0.a(((NewsfeedExternalAction.c.q) cVar).a));
            if (!(b instanceof Result.Failure)) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj7 : (Set) b) {
                    if (((Post) obj7).Tb()) {
                        arrayList3.add(obj7);
                    }
                }
                b = arrayList3;
            }
            if (!(b instanceof Result.Failure)) {
                Object f10 = qn60Var.f(new s8q0((List) b, pn60Var));
                kotlin.a.a(f10);
                b = (qn60.c) f10;
            }
            if (!(b instanceof Result.Failure)) {
                qn60.c cVar11 = (qn60.c) b;
                e(new qr60.a.c(cVar11.a, cVar11.b, false, null, 24));
            }
            Throwable a11 = Result.a(b);
            if (a11 != null) {
                com.vk.metrics.eventtracking.b.a.a(a11);
                return;
            }
            return;
        }
        if (cVar instanceof NewsfeedExternalAction.c.v) {
            Object f11 = qn60Var.f(new kxf0(((NewsfeedExternalAction.c.v) cVar).a));
            if (!(f11 instanceof Result.Failure)) {
                qn60.c cVar12 = (qn60.c) f11;
                e(new qr60.a.c(cVar12.a, cVar12.b, false, null, 24));
            }
            Throwable a12 = Result.a(f11);
            if (a12 != null) {
                com.vk.metrics.eventtracking.b.a.a(a12);
                return;
            }
            return;
        }
        if (cVar instanceof NewsfeedExternalAction.c.k) {
            Object f12 = qn60Var.f(new s7q(((NewsfeedExternalAction.c.k) cVar).a, pn60Var));
            if (!(f12 instanceof Result.Failure)) {
                qn60.c cVar13 = (qn60.c) f12;
                e(new qr60.a.c(cVar13.a, cVar13.b, false, null, 24));
            }
            Throwable a13 = Result.a(f12);
            if (a13 != null) {
                com.vk.metrics.eventtracking.b.a.a(a13);
                return;
            }
            return;
        }
        if (cVar instanceof NewsfeedExternalAction.c.t) {
            Object f13 = qn60Var.f(new kwf0(((NewsfeedExternalAction.c.t) cVar).a, pn60Var));
            if (!(f13 instanceof Result.Failure)) {
                qn60.c cVar14 = (qn60.c) f13;
                e(new qr60.a.c(cVar14.a, cVar14.b, false, null, 24));
            }
            Throwable a14 = Result.a(f13);
            if (a14 != null) {
                com.vk.metrics.eventtracking.b.a.a(a14);
                return;
            }
            return;
        }
        if (cVar instanceof NewsfeedExternalAction.c.h0) {
            Object f14 = qn60Var.f(new t7q0(((NewsfeedExternalAction.c.h0) cVar).a, pn60Var));
            if (!(f14 instanceof Result.Failure)) {
                qn60.c cVar15 = (qn60.c) f14;
                e(new qr60.a.c(cVar15.a, cVar15.b, false, null, 24));
            }
            Throwable a15 = Result.a(f14);
            if (a15 != null) {
                com.vk.metrics.eventtracking.b.a.a(a15);
                return;
            }
            return;
        }
        if (cVar instanceof NewsfeedExternalAction.c.h) {
            Object f15 = qn60Var.f(new gmo(((NewsfeedExternalAction.c.h) cVar).a, pn60Var));
            if (!(f15 instanceof Result.Failure)) {
                qn60.c cVar16 = (qn60.c) f15;
                e(new qr60.a.c(cVar16.a, cVar16.b, false, null, 24));
            }
            Throwable a16 = Result.a(f15);
            if (a16 != null) {
                com.vk.metrics.eventtracking.b.a.a(a16);
                return;
            }
            return;
        }
        if (cVar instanceof NewsfeedExternalAction.c.i) {
            Object f16 = qn60Var.f(new fmo(((NewsfeedExternalAction.c.i) cVar).b, pn60Var));
            if (!(f16 instanceof Result.Failure)) {
                qn60.c cVar17 = (qn60.c) f16;
                e(new qr60.a.c(cVar17.a, cVar17.b, false, null, 24));
            }
            Throwable a17 = Result.a(f16);
            if (a17 != null) {
                com.vk.metrics.eventtracking.b.a.a(a17);
                return;
            }
            return;
        }
        if (cVar instanceof NewsfeedExternalAction.c.a0) {
            Object f17 = qn60Var.f(new iij0(((NewsfeedExternalAction.c.a0) cVar).a, pn60Var));
            if (!(f17 instanceof Result.Failure)) {
                qn60.c cVar18 = (qn60.c) f17;
                e(new qr60.a.c(cVar18.a, cVar18.b, false, null, 24));
            }
            Throwable a18 = Result.a(f17);
            if (a18 != null) {
                com.vk.metrics.eventtracking.b.a.a(a18);
                return;
            }
            return;
        }
        if (cVar instanceof NewsfeedExternalAction.c.j0) {
            Object f18 = qn60Var.f(new f8q0(((NewsfeedExternalAction.c.j0) cVar).a, pn60Var));
            if (!(f18 instanceof Result.Failure)) {
                qn60.c cVar19 = (qn60.c) f18;
                e(new qr60.a.c(cVar19.a, cVar19.b, false, null, 24));
            }
            Throwable a19 = Result.a(f18);
            if (a19 != null) {
                com.vk.metrics.eventtracking.b.a.a(a19);
                return;
            }
            return;
        }
        if (cVar instanceof NewsfeedExternalAction.c.f) {
            Object f19 = qn60Var.f(new lsa(((NewsfeedExternalAction.c.f) cVar).a, pn60Var));
            if (!(f19 instanceof Result.Failure)) {
                qn60.c cVar20 = (qn60.c) f19;
                e(new qr60.a.c(cVar20.a, cVar20.b, false, null, 24));
            }
            Throwable a20 = Result.a(f19);
            if (a20 != null) {
                com.vk.metrics.eventtracking.b.a.a(a20);
                return;
            }
            return;
        }
        if (cVar instanceof NewsfeedExternalAction.c.e) {
            NewsfeedExternalAction.c.e eVar = (NewsfeedExternalAction.c.e) cVar;
            UserId userId2 = eVar.b;
            Integer num = eVar.c;
            Integer num2 = eVar.d;
            if (userId2 != null && num != null && num2 != null) {
                aVar = new xa60.a(userId2, num.intValue(), num2.intValue());
            }
            Object f20 = qn60Var.f(new ksa(new xa60(eVar.a, aVar, eVar.e), pn60Var));
            if (!(f20 instanceof Result.Failure)) {
                qn60.c cVar21 = (qn60.c) f20;
                e(new qr60.a.c(cVar21.a, cVar21.b, false, null, 24));
            }
            Throwable a21 = Result.a(f20);
            if (a21 != null) {
                com.vk.metrics.eventtracking.b.a.a(a21);
                return;
            }
            return;
        }
        if (cVar instanceof NewsfeedExternalAction.c.b0) {
            Object f21 = qn60Var.f(new t0p0(((NewsfeedExternalAction.c.b0) cVar).a, pn60Var));
            if (!(f21 instanceof Result.Failure)) {
                qn60.c cVar22 = (qn60.c) f21;
                e(new qr60.a.c(cVar22.a, cVar22.b, false, null, 24));
            }
            Throwable a22 = Result.a(f21);
            if (a22 != null) {
                com.vk.metrics.eventtracking.b.a.a(a22);
                return;
            }
            return;
        }
        if (cVar instanceof NewsfeedExternalAction.c.b) {
            Post post = ((NewsfeedExternalAction.c.b) cVar).a;
            t(post.n, post.m);
            return;
        }
        if (cVar instanceof NewsfeedExternalAction.c.e0) {
            return;
        }
        if (cVar instanceof NewsfeedExternalAction.c.d0) {
            Post post2 = ((NewsfeedExternalAction.c.d0) cVar).a;
            v(post2, post2, null);
            return;
        }
        if (cVar instanceof NewsfeedExternalAction.c.z) {
            return;
        }
        if (cVar instanceof NewsfeedExternalAction.c.n) {
            NewsfeedExternalAction.c.n nVar = (NewsfeedExternalAction.c.n) cVar;
            NewsEntry newsEntry2 = nVar.a;
            Comment comment = nVar.b;
            c(new yo60.f.a.C4118a(newsEntry2, comment, nVar.c, comment.b, nVar.d));
            return;
        }
        if (cVar instanceof NewsfeedExternalAction.c.o) {
            NewsfeedExternalAction.c.o oVar = (NewsfeedExternalAction.c.o) cVar;
            Post post3 = oVar.a;
            Comment comment2 = oVar.b;
            int[] iArr = comment2.l;
            int intValue = (iArr == null || (N = rl3.N(iArr)) == null) ? comment2.b : N.intValue();
            UserId userId3 = post3.m;
            Flags flags = post3.l;
            c(new yo60.f.a.b(userId3, post3.n, new NewsfeedRouter.a(intValue, comment2.b, flags.zb(2L), flags.zb(1L), flags.zb(PlaybackStateCompat.ACTION_PREPARE_FROM_URI), LikesGetList.Type.POST)));
            return;
        }
        if (cVar instanceof com.vk.newsfeed.presentation.model.actions.a) {
            Object f22 = qn60Var.f(new a(((com.vk.newsfeed.presentation.model.actions.a) cVar).a, pn60Var));
            if (!(f22 instanceof Result.Failure)) {
                qn60.c cVar23 = (qn60.c) f22;
                e(new qr60.a.c(cVar23.a, cVar23.b, false, null, 24));
            }
            Throwable a23 = Result.a(f22);
            if (a23 != null) {
                com.vk.metrics.eventtracking.b.a.a(a23);
                return;
            }
            return;
        }
        if (cVar instanceof NewsfeedExternalAction.c.a) {
            this.h.getClass();
            c(mtx.a((NewsfeedExternalAction.c.a) cVar));
            return;
        }
        if (cVar instanceof NewsfeedExternalAction.c.p) {
            c(new yo60.f.a.c(((NewsfeedExternalAction.c.p) cVar).a));
            return;
        }
        boolean z2 = cVar instanceof NewsfeedExternalAction.c.y;
        Lazy lazy = this.j;
        if (z2) {
            NewsfeedExternalAction.c.y yVar = (NewsfeedExternalAction.c.y) cVar;
            NewsEntry newsEntry3 = yVar.a;
            String str = yVar.b;
            if (!(newsEntry3 instanceof MyTargetNativeAdEntry)) {
                if (di60.v(newsEntry3)) {
                    Object f23 = qn60Var.f(new mxf0(newsEntry3, pn60Var));
                    if (!(f23 instanceof Result.Failure)) {
                        qn60.c cVar24 = (qn60.c) f23;
                        e(new qr60.a.c(cVar24.a, cVar24.b, false, null, 24));
                    }
                    Throwable a24 = Result.a(f23);
                    if (a24 != null) {
                        com.vk.metrics.eventtracking.b.a.a(a24);
                        return;
                    }
                    return;
                }
                return;
            }
            Iterator it = qn60Var.c().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj5 = it.next();
                    if (epx.f(obj5, newsEntry3)) {
                        break;
                    }
                } else {
                    obj5 = null;
                    break;
                }
            }
            MyTargetNativeAdEntry myTargetNativeAdEntry = obj5 instanceof MyTargetNativeAdEntry ? (MyTargetNativeAdEntry) obj5 : null;
            if (myTargetNativeAdEntry == null) {
                return;
            }
            bp50 bp50Var2 = myTargetNativeAdEntry.A;
            gjx gjxVar = myTargetNativeAdEntry.B;
            if (bp50Var2 == null || (arrayList2 = bp50Var2.c) == null) {
                b520Var = null;
            } else {
                Iterator<b520> it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        b520Var2 = null;
                        break;
                    }
                    b520Var2 = it2.next();
                    b520 b520Var3 = b520Var2;
                    if (epx.f(b520Var3.a, str) && epx.f(b520Var3.b, "complain")) {
                        break;
                    }
                }
                b520Var = b520Var2;
            }
            if (gjxVar != null) {
                fkz0 b2 = ((NewsFeedComponent) lazy.getValue()).ib().b(gjxVar);
                egz0 c = gjxVar.c();
                if (c != null && (arrayList = c.b) != null) {
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next = it3.next();
                        ajx ajxVar2 = (ajx) next;
                        if (epx.f(ajxVar2.getTitle(), str) && epx.f(ajxVar2.getType(), "complain")) {
                            obj6 = next;
                            break;
                        }
                    }
                    ajxVar = (ajx) obj6;
                }
                if (ajxVar != null) {
                    b2.b(ajxVar);
                }
            } else if (b520Var != null && bp50Var2 != null) {
                bp50Var2.d(b520Var);
            }
            Object f24 = qn60Var.f(new mxf0(newsEntry3, pn60Var));
            if (!(f24 instanceof Result.Failure)) {
                qn60.c cVar25 = (qn60.c) f24;
                e(new qr60.a.c(cVar25.a, cVar25.b, false, null, 24));
            }
            Throwable a25 = Result.a(f24);
            if (a25 != null) {
                com.vk.metrics.eventtracking.b.a.a(a25);
                return;
            }
            return;
        }
        if (cVar instanceof NewsfeedExternalAction.c.d) {
            NewsEntry newsEntry4 = ((NewsfeedExternalAction.c.d) cVar).a;
            Iterator it4 = qn60Var.c().iterator();
            while (true) {
                if (it4.hasNext()) {
                    obj4 = it4.next();
                    if (epx.f(obj4, newsEntry4)) {
                        break;
                    }
                } else {
                    obj4 = null;
                    break;
                }
            }
            MyTargetNativeAdEntry myTargetNativeAdEntry2 = obj4 instanceof MyTargetNativeAdEntry ? (MyTargetNativeAdEntry) obj4 : null;
            if (myTargetNativeAdEntry2 == null || (bp50Var = myTargetNativeAdEntry2.A) == null) {
                return;
            }
            bp50Var.a();
            return;
        }
        if (!(cVar instanceof NewsfeedExternalAction.c.InterfaceC1439c)) {
            if (!(cVar instanceof NewsfeedExternalAction.c.c0)) {
                throw new NoWhenBranchMatchedException();
            }
            NewsfeedExternalAction.c.c0 c0Var = (NewsfeedExternalAction.c.c0) cVar;
            this.i.g(c0Var.b, c0Var.a);
            return;
        }
        NewsfeedExternalAction.c.InterfaceC1439c interfaceC1439c = (NewsfeedExternalAction.c.InterfaceC1439c) cVar;
        if (interfaceC1439c instanceof NewsfeedExternalAction.c.InterfaceC1439c.b) {
            NewsEntry newsEntry5 = ((NewsfeedExternalAction.c.InterfaceC1439c.b) interfaceC1439c).b;
            MyTargetNativeAdEntry myTargetNativeAdEntry3 = newsEntry5 instanceof MyTargetNativeAdEntry ? (MyTargetNativeAdEntry) newsEntry5 : null;
            if (myTargetNativeAdEntry3 == null) {
                return;
            }
            gjx gjxVar2 = myTargetNativeAdEntry3.B;
            if (gjxVar2 == null) {
                Iterator it5 = qn60Var.c().iterator();
                while (true) {
                    if (it5.hasNext()) {
                        obj3 = it5.next();
                        if (epx.f(obj3, myTargetNativeAdEntry3)) {
                            break;
                        }
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                MyTargetNativeAdEntry myTargetNativeAdEntry4 = obj3 instanceof MyTargetNativeAdEntry ? (MyTargetNativeAdEntry) obj3 : null;
                gjxVar2 = myTargetNativeAdEntry4 != null ? myTargetNativeAdEntry4.B : null;
                if (gjxVar2 == null) {
                    return;
                }
            }
            fkz0 b3 = ((NewsFeedComponent) lazy.getValue()).ib().b(gjxVar2);
            if (b3.t) {
                return;
            }
            h8z0.e(b3.c.a, "click", 2, null);
            b3.t = true;
            return;
        }
        if (interfaceC1439c instanceof NewsfeedExternalAction.c.InterfaceC1439c.f) {
            NewsfeedExternalAction.c.InterfaceC1439c.f fVar = (NewsfeedExternalAction.c.InterfaceC1439c.f) interfaceC1439c;
            NewsEntry newsEntry6 = fVar.a;
            MyTargetNativeAdEntry myTargetNativeAdEntry5 = newsEntry6 instanceof MyTargetNativeAdEntry ? (MyTargetNativeAdEntry) newsEntry6 : null;
            if (myTargetNativeAdEntry5 == null || myTargetNativeAdEntry5.v == null) {
                return;
            }
            String str2 = fVar.b;
            String str3 = fVar.c;
            boolean z3 = fVar.d;
            if (myTargetNativeAdEntry5.E == null) {
                myTargetNativeAdEntry5.E = new MyTargetNativeAdEntry.b(str2, pn00.m(new Pair(str2, new LinkedHashSet())), false);
            }
            if (z3) {
                MyTargetNativeAdEntry.b bVar2 = myTargetNativeAdEntry5.E;
                if (bVar2 != null && (map2 = bVar2.c) != null) {
                    Set<String> set2 = map2.get(str2);
                    if (set2 == null) {
                        set2 = new LinkedHashSet<>();
                        map2.put(str2, set2);
                    }
                    set2.add(str3);
                }
            } else {
                MyTargetNativeAdEntry.b bVar3 = myTargetNativeAdEntry5.E;
                if (bVar3 != null && (map = bVar3.c) != null && (set = map.get(str2)) != null) {
                    set.remove(str3);
                }
            }
            a(new ds60.b(new NewsfeedExternalAction.c.f0(myTargetNativeAdEntry5)));
            return;
        }
        if (!(interfaceC1439c instanceof NewsfeedExternalAction.c.InterfaceC1439c.C1440c)) {
            if (interfaceC1439c instanceof NewsfeedExternalAction.c.InterfaceC1439c.d) {
                NewsEntry newsEntry7 = ((NewsfeedExternalAction.c.InterfaceC1439c.d) interfaceC1439c).a;
                MyTargetNativeAdEntry myTargetNativeAdEntry6 = newsEntry7 instanceof MyTargetNativeAdEntry ? (MyTargetNativeAdEntry) newsEntry7 : null;
                if (myTargetNativeAdEntry6 == null || (myTargetBrandLiftSurvey = myTargetNativeAdEntry6.v) == null) {
                    return;
                }
                List<MyTargetBrandLiftSurvey.Question> list = myTargetBrandLiftSurvey.b;
                Iterator<T> it6 = list.iterator();
                int i2 = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    Object next2 = it6.next();
                    if (i2 < 0) {
                        e43.t();
                        throw null;
                    }
                    String str4 = ((MyTargetBrandLiftSurvey.Question) next2).b;
                    MyTargetNativeAdEntry.b bVar4 = myTargetNativeAdEntry6.E;
                    if (str4.equals(bVar4 != null ? bVar4.a : null)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                Integer valueOf = i2 == -1 ? null : Integer.valueOf(i2);
                if (valueOf != null) {
                    int intValue2 = valueOf.intValue() - 1;
                    Integer valueOf2 = Integer.valueOf(intValue2);
                    if (intValue2 < 0) {
                        valueOf2 = null;
                    }
                    if (valueOf2 != null && (question = (MyTargetBrandLiftSurvey.Question) j5g.b0(valueOf2.intValue(), list)) != null) {
                        String str5 = question.b;
                        MyTargetNativeAdEntry.b bVar5 = myTargetNativeAdEntry6.E;
                        if (bVar5 == null) {
                            myTargetNativeAdEntry6.E = new MyTargetNativeAdEntry.b(str5, pn00.m(new Pair(str5, new LinkedHashSet())), false);
                        } else {
                            myTargetNativeAdEntry6.E = MyTargetNativeAdEntry.b.a(bVar5, str5, null, 6);
                        }
                    }
                    a(new ds60.b(new NewsfeedExternalAction.c.f0(myTargetNativeAdEntry6)));
                    return;
                }
                return;
            }
            if (!(interfaceC1439c instanceof NewsfeedExternalAction.c.InterfaceC1439c.a)) {
                if (!(interfaceC1439c instanceof NewsfeedExternalAction.c.InterfaceC1439c.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                NewsfeedExternalAction.c.InterfaceC1439c.e eVar2 = (NewsfeedExternalAction.c.InterfaceC1439c.e) interfaceC1439c;
                NewsEntry newsEntry8 = eVar2.a;
                ?? r15 = eVar2.b;
                Iterator it7 = qn60Var.c().iterator();
                while (true) {
                    if (it7.hasNext()) {
                        obj = it7.next();
                        if (epx.f(obj, newsEntry8)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                MyTargetNativeAdEntry myTargetNativeAdEntry7 = obj instanceof MyTargetNativeAdEntry ? (MyTargetNativeAdEntry) obj : null;
                LinkedHashMap linkedHashMap = new LinkedHashMap(on00.e(r15.size()));
                for (Map.Entry entry : r15.entrySet()) {
                    linkedHashMap.put(entry.getKey(), j5g.R0((Set) entry.getValue()));
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                if (myTargetNativeAdEntry7 != null) {
                    MyTargetNativeAdEntry.b bVar6 = myTargetNativeAdEntry7.E;
                    myTargetNativeAdEntry7.E = bVar6 != null ? MyTargetNativeAdEntry.b.a(bVar6, null, linkedHashMap2, 3) : null;
                }
                if ((myTargetNativeAdEntry7 != null ? myTargetNativeAdEntry7.E : null) != null) {
                    a(new ds60.b(new NewsfeedExternalAction.c.f0(myTargetNativeAdEntry7)));
                    return;
                }
                return;
            }
            NewsfeedExternalAction.c.InterfaceC1439c.a aVar2 = (NewsfeedExternalAction.c.InterfaceC1439c.a) interfaceC1439c;
            NewsEntry newsEntry9 = aVar2.a;
            Map<String, Set<String>> map3 = aVar2.b;
            MyTargetNativeAdEntry myTargetNativeAdEntry8 = newsEntry9 instanceof MyTargetNativeAdEntry ? (MyTargetNativeAdEntry) newsEntry9 : null;
            if (myTargetNativeAdEntry8 == null) {
                return;
            }
            gjx gjxVar3 = myTargetNativeAdEntry8.B;
            if (gjxVar3 == null) {
                Iterator it8 = qn60Var.c().iterator();
                while (true) {
                    if (it8.hasNext()) {
                        obj2 = it8.next();
                        if (epx.f(obj2, myTargetNativeAdEntry8)) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                MyTargetNativeAdEntry myTargetNativeAdEntry9 = obj2 instanceof MyTargetNativeAdEntry ? (MyTargetNativeAdEntry) obj2 : null;
                gjxVar3 = myTargetNativeAdEntry9 != null ? myTargetNativeAdEntry9.B : null;
                if (gjxVar3 == null) {
                    return;
                }
            }
            ArrayList arrayList4 = new ArrayList(map3.size());
            for (Map.Entry<String, Set<String>> entry2 : map3.entrySet()) {
                arrayList4.add(new ymx(entry2.getKey(), j5g.O0(entry2.getValue())));
            }
            njw njwVar = ((NewsFeedComponent) lazy.getValue()).ib().b(gjxVar3).c.b0;
            if (njwVar == null) {
                gu8.e("IntrNativeAdCtrlImpl", "Survey object is null");
            } else {
                o8z0.c(new nm30((String) njwVar.a, arrayList4, (String) njwVar.b, 3));
            }
            MyTargetNativeAdEntry.b bVar7 = myTargetNativeAdEntry8.E;
            MyTargetNativeAdEntry.b a26 = bVar7 != null ? MyTargetNativeAdEntry.b.a(bVar7, null, null, 5) : null;
            myTargetNativeAdEntry8.E = a26;
            if (a26 != null) {
                a(new ds60.b(new NewsfeedExternalAction.c.f0(myTargetNativeAdEntry8)));
                return;
            }
            Object f25 = qn60Var.f(new mxf0(myTargetNativeAdEntry8, pn60Var));
            if (!(f25 instanceof Result.Failure)) {
                qn60.c cVar26 = (qn60.c) f25;
                e(new qr60.a.c(cVar26.a, cVar26.b, false, null, 24));
            }
            Throwable a27 = Result.a(f25);
            if (a27 != null) {
                com.vk.metrics.eventtracking.b.a.a(a27);
                return;
            }
            return;
        }
        NewsEntry newsEntry10 = ((NewsfeedExternalAction.c.InterfaceC1439c.C1440c) interfaceC1439c).a;
        MyTargetNativeAdEntry myTargetNativeAdEntry10 = newsEntry10 instanceof MyTargetNativeAdEntry ? (MyTargetNativeAdEntry) newsEntry10 : null;
        if (myTargetNativeAdEntry10 != null && (myTargetBrandLiftSurvey2 = myTargetNativeAdEntry10.v) != null) {
            List<MyTargetBrandLiftSurvey.Question> list2 = myTargetBrandLiftSurvey2.b;
            Iterator<T> it9 = list2.iterator();
            int i3 = 0;
            while (true) {
                if (!it9.hasNext()) {
                    i3 = -1;
                    break;
                }
                Object next3 = it9.next();
                if (i3 < 0) {
                    e43.t();
                    throw null;
                }
                String str6 = ((MyTargetBrandLiftSurvey.Question) next3).b;
                MyTargetNativeAdEntry.b bVar8 = myTargetNativeAdEntry10.E;
                if (str6.equals(bVar8 != null ? bVar8.a : null)) {
                    break;
                } else {
                    i3++;
                }
            }
        }
    }

    public final void t(int i, UserId userId) {
        Object f = this.f.f(new pxf0(i, userId));
        if (!(f instanceof Result.Failure)) {
            qn60.c cVar = (qn60.c) f;
            e(new qr60.a.c(cVar.a, cVar.b, false, null, 24));
        }
        Throwable a2 = Result.a(f);
        if (a2 != null) {
            com.vk.metrics.eventtracking.b.a.a(a2);
        }
    }

    public final void v(NewsEntry newsEntry, NewsEntry newsEntry2, k8q0 k8q0Var) {
        Object f = this.f.f(new c1g0(newsEntry, newsEntry2, this.g, k8q0Var));
        if (!(f instanceof Result.Failure)) {
            qn60.c cVar = (qn60.c) f;
            e(new qr60.a.c(cVar.a, cVar.b, false, null, 24));
        }
        Throwable a2 = Result.a(f);
        if (a2 != null) {
            com.vk.metrics.eventtracking.b.a.a(a2);
        }
    }
}
