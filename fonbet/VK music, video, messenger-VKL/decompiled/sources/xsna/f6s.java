package xsna;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.actions.Action;
import com.vk.dto.newsfeed.PostDonut;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.common.domain.model.AddLikeAction;
import com.vkontakte.android.R;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.attachments.ShitAttachment;
import kotlin.LazyThreadSafetyMode;
import xsna.ikv0;
import xsna.mut0;
import xsna.q630;
import xsna.xyq;

/* compiled from: FooterComposeHolder.kt */
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes4.dex */
public final class f6s extends rp6<q6s, NewsEntry> implements uj, p2f0 {
    public final h3f0 E;
    public final h170 F;
    public final ComposeView G;
    public final wh50 H;
    public final wh50 I;
    public final wh50 J;
    public final boolean K;
    public final y2c0 L;
    public final huu0 M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final zqf R;
    public final m2h S;
    public final bzj T;
    public final jcg U;
    public final g4g V;
    public final ugm W;
    public final r5i X;
    public final sje Y;

    public f6s(ViewGroup viewGroup, h3f0 h3f0Var, h170 h170Var) {
        super(R.layout.news_item_footer_compose, viewGroup);
        this.E = h3f0Var;
        this.F = h170Var;
        ComposeView composeView = (ComposeView) this.itemView.findViewById(R.id.feed_footer_root);
        this.G = composeView;
        hg10 hg10Var = hg10.g;
        this.H = androidx.compose.runtime.k.a(null, hg10Var);
        this.I = androidx.compose.runtime.k.a(null, hg10Var);
        this.J = androidx.compose.runtime.k.b(null);
        getContext();
        BuildInfo.Client client = BuildInfo.a;
        VKApplication vKApplication = com.vk.core.apps.a.a;
        this.K = BuildInfo.h();
        this.L = new y2c0(h170Var.b());
        this.M = new huu0();
        int i = 13;
        n5i n5iVar = new n5i(this, i);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.N = msy.a(lazyThreadSafetyMode, n5iVar);
        this.O = msy.a(lazyThreadSafetyMode, new z3i(this, i));
        this.P = msy.a(lazyThreadSafetyMode, new z4f(this, 22));
        this.Q = msy.a(lazyThreadSafetyMode, new yqf(this, 18));
        this.R = new zqf(this, 24);
        this.S = new m2h(this, 2);
        this.T = new bzj(this, 10);
        this.U = new jcg(this, 18);
        this.V = new g4g(this, 18);
        this.W = new ugm(this, 6);
        this.X = new r5i(this, 15);
        this.Y = new sje(this, 28);
        composeView.setViewCompositionStrategy(mut0.b.a);
        composeView.setContent(new jai(-274897854, new cd4(this, 8), true));
    }

    public static boolean h7(q6s q6sVar) {
        ReactionMeta reactionMeta;
        return q6sVar.j && (reactionMeta = q6sVar.k) != null && reactionMeta.g();
    }

    public static boolean i7(q6s q6sVar) {
        ReactionMeta reactionMeta;
        return (!q6sVar.j || (reactionMeta = q6sVar.k) == null || reactionMeta.g()) ? false : true;
    }

    @Override // xsna.uj
    public final void E(String str) {
        ((zak0) this.J).setValue(str);
    }

    @Override // xsna.qi6
    public final void I6() {
        super.I6();
        ((zak0) this.H).setValue(null);
        ((zak0) this.I).setValue(null);
        E(null);
    }

    @Override // xsna.rp6
    public final void R6(q6s q6sVar) {
        ((zak0) this.H).setValue(q6sVar);
        ((zak0) this.I).setValue(null);
    }

    @Override // xsna.rp6
    public final void T6(q6s q6sVar, Object obj) {
        q6s q6sVar2 = q6sVar;
        p6s M = f9t.M(obj);
        wh50 wh50Var = this.I;
        if (M != null) {
            boolean z = q6sVar2.h;
            ((zak0) wh50Var).setValue(new q6s(z, true, q6sVar2.j, q6sVar2.k, q6sVar2.l, q6sVar2.m, q6sVar2.n, q6sVar2.o, q6sVar2.p, q6sVar2.q, q6sVar2.r, q6sVar2.s, q6sVar2.t, q6sVar2.u, q6sVar2.v, q6sVar2.w, q6sVar2.x, q6sVar2.y, q6sVar2.z, q6sVar2.A, q6sVar2.B, (z || q6sVar2.j) ? 0 : R.string.accessibility_reaction_deleted, q6sVar2.D, q6sVar2.E, q6sVar2.F, q6sVar2.G, q6sVar2.H, q6sVar2.I, q6sVar2.J, q6sVar2.K, q6sVar2.L, q6sVar2.M, q6sVar2.N, q6sVar2.O, q6sVar2.P, q6sVar2.Q, q6sVar2.R, q6sVar2.S, q6sVar2.T, q6sVar2.U, q6sVar2.V, q6sVar2.W, q6sVar2.X, q6sVar2.Y, q6sVar2.Z, q6sVar2.a0, q6sVar2.b0, q6sVar2.c0, q6sVar2.d0, q6sVar2.e0, q6sVar2.f0, q6sVar2.g0, q6sVar2.h0, q6sVar2.i0));
        } else {
            ((zak0) this.H).setValue(q6sVar2);
            ((zak0) wh50Var).setValue(null);
        }
    }

    public final void b7(q6s q6sVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(169807669);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(169807669, i, -1, "com.vk.newsfeed.common.recycler.holders.FooterComposeHolder.Content (FooterComposeHolder.kt:174)");
        }
        rrv0.d(null, null, null, null, kai.c(1840829168, new yn7(2, this, q6sVar), M), M, 24576, 15);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new mq1(this, q6sVar, i, 5);
        }
    }

    public final void c7(q6s q6sVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1829432276);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1829432276, i, -1, "com.vk.newsfeed.common.recycler.holders.FooterComposeHolder.Donut (FooterComposeHolder.kt:212)");
        }
        if (q6sVar.R && q6sVar.W && !q6sVar.Y) {
            M.K(-1776734423);
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1075117982, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-DonutColor16> (VkIcons.kt:2086)");
            }
            lg90 b = or.b(M, -1268505019, R.drawable.vk_icon_donut_color_16, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i2 = q6sVar.U;
            String F = d370.F(R.plurals.n_donuts_gifted, i2, new Object[]{Integer.valueOf(i2)}, M, 0);
            q630 H = s200.H(q630.a.a, 12, 10, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
            boolean y = M.y(this) | M.J(q6sVar);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new y4(10, this, q6sVar);
                M.R(x);
            }
            juu0.a(392, M, F, (gzs) x, H, b);
        } else {
            M.K(-1786127082);
        }
        M.j();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new m9c(this, q6sVar, i, 5);
        }
    }

    public final xyq.c d7(q6s q6sVar, androidx.compose.runtime.a aVar) {
        String a;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-2101937115, 0, -1, "com.vk.newsfeed.common.recycler.holders.FooterComposeHolder.comments (FooterComposeHolder.kt:277)");
        }
        boolean z = q6sVar.D;
        int i = q6sVar.r;
        xyq.c cVar = null;
        if (z) {
            aVar.K(-1326932119);
            qzu0.a.getClass();
            lg90 z2 = qzu0.z(aVar);
            CharSequence charSequence = q6sVar.w;
            String obj = charSequence != null ? charSequence.toString() : null;
            if (i > 0) {
                aVar.K(-1326924567);
                a = d370.F(R.plurals.accessibility_comments_count, i, new Object[]{Integer.valueOf(i)}, aVar, 0);
                aVar.j();
            } else {
                a = zq.a(aVar, -1326917499, R.string.accessibility_add_comment, aVar, 0);
            }
            cVar = xyq.c.a.a(this.T, z2, 0L, obj, a, "feed_footer_comment_button", "feed_footer_comment_counter", aVar, 14352448, 4);
            aVar.j();
        } else {
            aVar.K(1815478616);
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return cVar;
    }

    public final xyq.b e7(q6s q6sVar, androidx.compose.runtime.a aVar) {
        String a;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1867669464, 0, -1, "com.vk.newsfeed.common.recycler.holders.FooterComposeHolder.donut (FooterComposeHolder.kt:324)");
        }
        boolean z = q6sVar.X;
        int i = q6sVar.U;
        xyq.b bVar = null;
        if (z && q6sVar.Y) {
            aVar.K(-1560115999);
            Integer valueOf = i > 0 ? Integer.valueOf(i) : null;
            if (valueOf != null) {
                aVar.K(-1559818895);
                a = d370.F(R.plurals.n_donuts_gifted, i, new Object[]{Integer.valueOf(i)}, aVar, 0);
                aVar.j();
            } else {
                a = zq.a(aVar, -1559662469, R.string.accessibility_send_donut, aVar, 0);
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-706763439, 24576, -1, "com.vk.feed.design.compose.newsfeed.footer.FeedFooter.Item.Donut.Companion.invoke (FeedFooter.kt:359)");
            }
            Object x = aVar.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            r5i r5iVar = this.X;
            sje sjeVar = this.Y;
            if (x == c0012a) {
                x = new xyq.b(valueOf, r5iVar, sjeVar, a);
                aVar.R(x);
            }
            xyq.b bVar2 = (xyq.b) x;
            ((zak0) bVar2.a).setValue(valueOf);
            ((zak0) bVar2.b).setValue(r5iVar);
            ((zak0) bVar2.c).setValue(sjeVar);
            ((zak0) bVar2.d).setValue(a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
            bVar = bVar2;
        } else {
            aVar.K(-1559502107);
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final xyq f7(q6s q6sVar, androidx.compose.runtime.a aVar) {
        lg90 H;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(214022317, 0, -1, "com.vk.newsfeed.common.recycler.holders.FooterComposeHolder.extra (FooterComposeHolder.kt:344)");
        }
        boolean z = q6sVar.K;
        int i = q6sVar.d0;
        xyq.c cVar = null;
        if (z) {
            aVar.K(-2087444072);
            String a = this.L.a(i);
            String i2 = i > 0 ? pvo0.i(false, i, false, false) : null;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(985819109, 27648, -1, "com.vk.feed.design.compose.newsfeed.footer.FeedFooter.Item.Label.Companion.invoke (FeedFooter.kt:308)");
            }
            Object x = aVar.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            ugm ugmVar = this.W;
            if (x == c0012a) {
                x = new xyq.d(a, ugmVar, i2);
                aVar.R(x);
            }
            xyq.d dVar = (xyq.d) x;
            ((zak0) dVar.a).setValue(ugmVar);
            ((zak0) dVar.b).setValue(a);
            ((zak0) dVar.c).setValue(i2);
            ((zak0) dVar.d).setValue("feed_footer_date_label");
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
            cVar = dVar;
        } else if (q6sVar.A) {
            aVar.K(-2086991534);
            if (q6sVar.z) {
                aVar.K(-482959239);
                qzu0.a.getClass();
                H = qzu0.d(aVar);
                aVar.j();
            } else {
                aVar.K(-482957542);
                qzu0.a.getClass();
                H = qzu0.H(aVar);
                aVar.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            cVar = xyq.c.a.a(this.V, H, ylu0Var.getIcon().l, null, d370.N(q6sVar.B, 0, aVar), "feed_footer_add_button", null, aVar, 12779584, 72);
            aVar.j();
        } else {
            aVar.K(-2086475664);
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return cVar;
    }

    @Override // xsna.qi6, me.grishka.appkit.views.UsableRecyclerView.j
    public final boolean isEnabled() {
        return false;
    }

    public final q6s j7() {
        return (q6s) ((zak0) this.H).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0314  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final xyq.e k7(q6s q6sVar, androidx.compose.runtime.a aVar) {
        long j;
        long j2;
        String v6;
        String a;
        Integer num;
        int i;
        boolean z;
        a.C0011a.C0012a c0012a;
        Object x;
        boolean z2;
        zqf zqfVar;
        m2h m2hVar;
        lg90 lg90Var;
        String str;
        long j3;
        float f;
        long j4;
        String str2;
        String str3;
        yyq yyqVar;
        Integer num2;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1358674718, 0, -1, "com.vk.newsfeed.common.recycler.holders.FooterComposeHolder.likes (FooterComposeHolder.kt:226)");
        }
        q6s q6sVar2 = (q6s) ((zak0) this.I).getValue();
        q6s q6sVar3 = q6sVar2 == null ? q6sVar : q6sVar2;
        boolean i7 = i7(q6sVar3);
        String str4 = q6sVar3.m;
        int i2 = q6sVar3.C;
        ReactionMeta reactionMeta = q6sVar3.k;
        boolean z3 = q6sVar3.h;
        xyq.e eVar = null;
        yyq yyqVar2 = null;
        lg90 l = fwu0.l(null, i7 ? q6sVar3.l : null, null, null, aVar, 0, 61);
        if (q6sVar3.e0) {
            aVar.K(507154453);
            if (i7(q6sVar3)) {
                aVar.K(16363341);
                aVar.j();
            } else if (h7(q6sVar3)) {
                aVar.K(16365604);
                qzu0.a.getClass();
                l = qzu0.x0(aVar);
                aVar.j();
            } else if (z3) {
                aVar.K(16367332);
                qzu0.a.getClass();
                l = qzu0.x0(aVar);
                aVar.j();
            } else {
                aVar.K(16368715);
                qzu0.a.getClass();
                l = qzu0.y0(aVar);
                aVar.j();
            }
            lg90 lg90Var2 = l;
            if (i7(q6sVar3)) {
                aVar.K(16372649);
                aVar.j();
                j = l5g.k;
            } else if (h7(q6sVar3)) {
                aVar.K(16375239);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var.q().m;
                aVar.j();
            } else if (z3) {
                aVar.K(16377511);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var2.q().m;
                aVar.j();
            } else {
                aVar.K(16379369);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var3 = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var3.getIcon().j;
                aVar.j();
            }
            long j5 = j;
            float f2 = i7(q6sVar3) ? 1 : 0;
            CharSequence charSequence = q6sVar3.v;
            String obj = charSequence != null ? charSequence.toString() : null;
            if (q6sVar3.j) {
                aVar.K(16388039);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var4 = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j2 = ylu0Var4.q().m;
                aVar.j();
            } else if (z3) {
                aVar.K(16390311);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var5 = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j2 = ylu0Var5.q().m;
                aVar.j();
            } else {
                aVar.K(16392169);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var6 = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j2 = ylu0Var6.getText().m;
                aVar.j();
            }
            long j6 = j2;
            boolean z4 = q6sVar3.O;
            int i3 = q6sVar3.q;
            if (z4) {
                String title = reactionMeta != null ? reactionMeta.getTitle() : null;
                v6 = (title == null || title.length() == 0) ? reactionMeta != null ? v6(R.string.accessibility_reaction_delete) : i3 > 0 ? s6(R.plurals.accessibility_likes, i3, Integer.valueOf(i3)) : v6(R.string.accessibility_add_like) : x6(R.string.accessibility_reaction_delete_definite, title);
            } else {
                v6 = i3 > 0 ? z3 ? v6(R.string.accessibility_reaction_delete_like) : s6(R.plurals.accessibility_likes, i3, Integer.valueOf(i3)) : v6(R.string.accessibility_add_like);
            }
            String str5 = v6;
            if (i2 == 0) {
                aVar.K(508370303);
                aVar.j();
                a = null;
            } else {
                a = zq.a(aVar, 16400138, i2, aVar, 0);
            }
            if (reactionMeta != null) {
                i = Integer.valueOf(reactionMeta.getId());
            } else if (z3) {
                i = 0;
            } else {
                num = null;
                z = q6sVar3.i;
                c0012a = a.C0011a.a;
                if (z || !h7(q6sVar3) || str4 == null || str4.length() == 0) {
                    aVar.K(509009151);
                    aVar.j();
                } else {
                    aVar.K(16415525);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1905491507, 48, -1, "com.vk.feed.design.compose.newsfeed.footer.FeedFooter.ReactionsOverlay.Companion.invoke (FeedFooter.kt:400)");
                    }
                    Object x2 = aVar.x();
                    if (x2 == c0012a) {
                        x2 = new yyq(str4);
                        aVar.R(x2);
                    }
                    yyqVar2 = (yyq) x2;
                    ((zak0) yyqVar2.a).setValue(str4);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar.j();
                }
                yyq yyqVar3 = yyqVar2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(446879052, 805306880, 24582, "com.vk.feed.design.compose.newsfeed.footer.FeedFooter.Item.LikesButton.Companion.invoke (FeedFooter.kt:171)");
                }
                x = aVar.x();
                zqf zqfVar2 = this.R;
                m2h m2hVar2 = this.S;
                if (x != c0012a) {
                    z2 = z;
                    x = new xyq.e(zqfVar2, m2hVar2, lg90Var2, obj, j5, f2, j6, str5, a, yyqVar3, z2, num);
                    zqfVar = zqfVar2;
                    m2hVar = m2hVar2;
                    lg90Var = lg90Var2;
                    str = obj;
                    j3 = j5;
                    f = f2;
                    j4 = j6;
                    str2 = str5;
                    str3 = a;
                    yyqVar = yyqVar3;
                    num2 = num;
                    aVar.R(x);
                } else {
                    z2 = z;
                    zqfVar = zqfVar2;
                    m2hVar = m2hVar2;
                    lg90Var = lg90Var2;
                    str = obj;
                    j3 = j5;
                    f = f2;
                    j4 = j6;
                    str2 = str5;
                    str3 = a;
                    yyqVar = yyqVar3;
                    num2 = num;
                }
                xyq.e eVar2 = (xyq.e) x;
                ((zak0) eVar2.a).setValue(zqfVar);
                ((zak0) eVar2.b).setValue(m2hVar);
                ((zak0) eVar2.c).setValue(lg90Var);
                ((zak0) eVar2.d).setValue(new l5g(j3));
                ((zak0) eVar2.e).setValue(new pco(f));
                ((zak0) eVar2.f).setValue(str);
                ((zak0) eVar2.g).setValue(new l5g(j4));
                ((zak0) eVar2.h).setValue(str2);
                ((zak0) eVar2.i).setValue(str3);
                ((zak0) eVar2.j).setValue("feed_footer_like_button");
                ((zak0) eVar2.k).setValue("feed_footer_like_counter");
                ((zak0) eVar2.l).setValue(yyqVar);
                ((zak0) eVar2.m).setValue(Boolean.valueOf(z2));
                ((zak0) eVar2.n).setValue(num2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
                eVar = eVar2;
            }
            num = i;
            z = q6sVar3.i;
            c0012a = a.C0011a.a;
            if (z) {
            }
            aVar.K(509009151);
            aVar.j();
            yyq yyqVar32 = yyqVar2;
            if (androidx.compose.runtime.b.d()) {
            }
            x = aVar.x();
            zqf zqfVar22 = this.R;
            m2h m2hVar22 = this.S;
            if (x != c0012a) {
            }
            xyq.e eVar22 = (xyq.e) x;
            ((zak0) eVar22.a).setValue(zqfVar);
            ((zak0) eVar22.b).setValue(m2hVar);
            ((zak0) eVar22.c).setValue(lg90Var);
            ((zak0) eVar22.d).setValue(new l5g(j3));
            ((zak0) eVar22.e).setValue(new pco(f));
            ((zak0) eVar22.f).setValue(str);
            ((zak0) eVar22.g).setValue(new l5g(j4));
            ((zak0) eVar22.h).setValue(str2);
            ((zak0) eVar22.i).setValue(str3);
            ((zak0) eVar22.j).setValue("feed_footer_like_button");
            ((zak0) eVar22.k).setValue("feed_footer_like_counter");
            ((zak0) eVar22.l).setValue(yyqVar);
            ((zak0) eVar22.m).setValue(Boolean.valueOf(z2));
            ((zak0) eVar22.n).setValue(num2);
            if (androidx.compose.runtime.b.d()) {
            }
            aVar.j();
            eVar = eVar22;
        } else {
            aVar.K(509065695);
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return eVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void o7(NewsEntry newsEntry) {
        Post R = di60.R(newsEntry);
        if (R != null && !R.J() && R.ic()) {
            ikv0.a aVar = new ikv0.a(this.itemView.getContext());
            aVar.u = new ikv0.d(this.itemView.getContext().getString(R.string.newsfeed_post_removed), (String) null, (ikv0.d.a) null, 6);
            aVar.n();
            return;
        }
        c6z Q = di60.Q(newsEntry);
        if (Q == null) {
            return;
        }
        NewsEntry t6 = t6();
        if (t6 instanceof PromoPost) {
            hd60.a().m0((PromoPost) t6);
        }
        if (t6 instanceof ShitAttachment) {
            ShitAttachment shitAttachment = (ShitAttachment) t6;
            if (shitAttachment.Gb()) {
                ((rv0) this.N.getValue()).f(shitAttachment);
            }
        }
        this.E.e(new v5f0(this.G, this, Q, t6, this.u, AddLikeAction.TriggerType.BUTTON.h()));
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }

    public final gzs<s3q0> p7(q6s q6sVar, gzs<s3q0> gzsVar) {
        Post R;
        PostDonut.Paywall paywall;
        PostDonut.Snippet snippet;
        LinkButton linkButton;
        Action action;
        PostDonut.Placeholder placeholder;
        LinkButton linkButton2;
        if (!q6sVar.Z || (R = di60.R(q6sVar.h0)) == null) {
            return gzsVar;
        }
        PostDonut postDonut = R.R;
        if (postDonut == null || (placeholder = postDonut.c) == null || (linkButton2 = placeholder.c) == null || (action = linkButton2.c) == null) {
            if (postDonut == null || (paywall = postDonut.g) == null || (snippet = paywall.d) == null || (linkButton = snippet.e) == null) {
                return gzsVar;
            }
            action = linkButton.c;
        }
        return new a31(this, R, action, 1);
    }

    @Override // xsna.p2f0
    public final boolean r4(Object obj) {
        return obj == q6();
    }

    public final xyq.c r7(q6s q6sVar, androidx.compose.runtime.a aVar) {
        lg90 l1;
        String a;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-865131995, 0, -1, "com.vk.newsfeed.common.recycler.holders.FooterComposeHolder.shares (FooterComposeHolder.kt:299)");
        }
        boolean z = q6sVar.H;
        int i = q6sVar.s;
        xyq.c cVar = null;
        if (z) {
            aVar.K(1831814533);
            if (q6sVar.I == R.drawable.vk_icon_message_forward_outline_24) {
                aVar.K(1831819996);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-201971950, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-MessageForwardOutline24> (VkIcons.kt:7436)");
                }
                l1 = or.b(aVar, 303001993, R.drawable.vk_icon_message_forward_outline_24, aVar, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
            } else {
                aVar.K(1831821907);
                qzu0.a.getClass();
                l1 = qzu0.l1(aVar);
                aVar.j();
            }
            CharSequence charSequence = q6sVar.x;
            String obj = charSequence != null ? charSequence.toString() : null;
            if (i > 0) {
                aVar.K(1831827774);
                a = d370.F(R.plurals.accessibility_reposts, i, new Object[]{Integer.valueOf(i)}, aVar, 0);
                aVar.j();
            } else {
                a = zq.a(aVar, 1831834489, R.string.accessibility_share, aVar, 0);
            }
            cVar = xyq.c.a.a(this.U, l1, 0L, obj, a, "feed_footer_share_button", "feed_footer_share_counter", aVar, 14352448, 4);
            aVar.j();
        } else {
            aVar.K(952526936);
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return cVar;
    }

    @Override // xsna.p2f0
    public final void S4(boolean z) {
    }

    @Override // xsna.p2f0
    public final void T1(u5f0 u5f0Var, ReactionMeta reactionMeta, a2f0 a2f0Var) {
    }
}
