package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: FeedFooter.kt */
/* loaded from: classes18.dex */
public interface xyq {

    /* compiled from: FeedFooter.kt */
    public static final class a {
        public static final void a(q630 q630Var, xyq xyqVar, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a M = aVar.M(646757834);
            if ((i & 6) == 0) {
                i2 = (M.J(q630Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= (i & 64) == 0 ? M.J(xyqVar) : M.y(xyqVar) ? 32 : 16;
            }
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(646757834, i2, -1, "com.vk.feed.design.compose.newsfeed.footer.FeedFooter.Item.ComposeDefaultImpls.Content$default (FeedFooter.kt:-1)");
                }
                xyqVar.a(q630Var, M, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new rbh(q630Var, xyqVar, i, 2);
            }
        }
    }

    /* compiled from: FeedFooter.kt */
    public static final class b implements xyq {
        public final wh50 a;
        public final wh50 b;
        public final wh50 c;
        public final wh50 d;

        public b() {
            throw null;
        }

        public b(Integer num, r5i r5iVar, sje sjeVar, String str) {
            this.a = androidx.compose.runtime.k.b(num);
            this.b = androidx.compose.runtime.k.b(r5iVar);
            this.c = androidx.compose.runtime.k.b(sjeVar);
            this.d = androidx.compose.runtime.k.b(str);
        }

        @Override // xsna.xyq
        public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
            aVar.K(-695910375);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-695910375, i, -1, "com.vk.feed.design.compose.newsfeed.footer.FeedFooter.Item.Donut.Content (FeedFooter.kt:339)");
            }
            q630 H = s200.H(q630Var, 6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            int i2 = (i & 112) ^ 48;
            boolean z = true;
            boolean z2 = (i2 > 32 && aVar.J(this)) || (i & 48) == 32;
            Object x = aVar.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new j6e(this, 23);
                aVar.R(x);
            }
            q630 b = egi0.b(H, false, (izs) x);
            Integer num = (Integer) ((zak0) this.a).getValue();
            gzs gzsVar = (gzs) ((zak0) this.c).getValue();
            if ((i2 <= 32 || !aVar.J(this)) && (i & 48) != 32) {
                z = false;
            }
            Object x2 = aVar.x();
            if (z || x2 == c0012a) {
                x2 = new tbh(this, 15);
                aVar.R(x2);
            }
            o2o.a(num, b, (gzs) x2, gzsVar, aVar, 0, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
        }
    }

    /* compiled from: FeedFooter.kt */
    public static final class c implements xyq {
        public final wh50 a;
        public final wh50 b;
        public final wh50 c;
        public final wh50 d;
        public final wh50 e;
        public final wh50 f;
        public final wh50 g;

        /* compiled from: FeedFooter.kt */
        public static final class a {
            public static c a(gzs gzsVar, lg90 lg90Var, long j, String str, String str2, String str3, String str4, androidx.compose.runtime.a aVar, int i, int i2) {
                long j2;
                if ((i2 & 4) != 0) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j2 = ylu0Var.getText().m;
                } else {
                    j2 = j;
                }
                String str5 = (i2 & 8) != 0 ? null : str;
                String str6 = (i2 & 64) != 0 ? null : str4;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1070702657, i, -1, "com.vk.feed.design.compose.newsfeed.footer.FeedFooter.Item.IconButton.Companion.invoke (FeedFooter.kt:253)");
                }
                Object x = aVar.x();
                if (x == a.C0011a.a) {
                    c cVar = new c(gzsVar, lg90Var, new l5g(j2), str5, str2, str3, str6);
                    aVar.R(cVar);
                    x = cVar;
                }
                c cVar2 = (c) x;
                ((zak0) cVar2.a).setValue(gzsVar);
                ((zak0) cVar2.b).setValue(lg90Var);
                ((zak0) cVar2.c).setValue(new l5g(j2));
                ((zak0) cVar2.d).setValue(str5);
                ((zak0) cVar2.e).setValue(str2);
                ((zak0) cVar2.f).setValue(str3);
                ((zak0) cVar2.g).setValue(str6);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return cVar2;
            }
        }

        public c() {
            throw null;
        }

        public c(gzs gzsVar, lg90 lg90Var, l5g l5gVar, String str, String str2, String str3, String str4) {
            this.a = androidx.compose.runtime.k.b(gzsVar);
            this.b = androidx.compose.runtime.k.b(lg90Var);
            this.c = androidx.compose.runtime.k.b(l5gVar);
            this.d = androidx.compose.runtime.k.b(str);
            this.e = androidx.compose.runtime.k.b(str2);
            this.f = androidx.compose.runtime.k.b(str3);
            this.g = androidx.compose.runtime.k.b(str4);
        }

        @Override // xsna.xyq
        public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
            aVar.K(-602484296);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-602484296, i, -1, "com.vk.feed.design.compose.newsfeed.footer.FeedFooter.Item.IconButton.Content (FeedFooter.kt:230)");
            }
            xzq.d((gzs) ((zak0) this.a).getValue(), q630Var, (lg90) ((zak0) this.b).getValue(), (l5g) ((zak0) this.c).getValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (String) ((zak0) this.d).getValue(), 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, (String) ((zak0) this.e).getValue(), (String) ((zak0) this.f).getValue(), (String) ((zak0) this.g).getValue(), aVar, ((i << 3) & 112) | 512);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
        }
    }

    /* compiled from: FeedFooter.kt */
    public static final class d implements xyq {
        public final wh50 a;
        public final wh50 b;
        public final wh50 c;
        public final wh50 d;

        public d() {
            throw null;
        }

        public d(String str, ugm ugmVar, String str2) {
            this.a = androidx.compose.runtime.k.b(ugmVar);
            this.b = androidx.compose.runtime.k.b(str);
            this.c = androidx.compose.runtime.k.b(str2);
            this.d = androidx.compose.runtime.k.b("feed_footer_date_label");
        }

        @Override // xsna.xyq
        public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
            aVar.K(1625023595);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1625023595, i, -1, "com.vk.feed.design.compose.newsfeed.footer.FeedFooter.Item.Label.Content (FeedFooter.kt:292)");
            }
            xzq.c((String) ((zak0) this.b).getValue(), (izs) ((zak0) this.a).getValue(), null, 0L, null, (String) ((zak0) this.c).getValue(), (String) ((zak0) this.d).getValue(), aVar, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
        }
    }

    /* compiled from: FeedFooter.kt */
    public static final class e implements xyq {
        public final wh50 a;
        public final wh50 b;
        public final wh50 c;
        public final wh50 d;
        public final wh50 e;
        public final wh50 f;
        public final wh50 g;
        public final wh50 h;
        public final wh50 i;
        public final wh50 j;
        public final wh50 k;
        public final wh50 l;
        public final wh50 m;
        public final wh50 n;

        public e() {
            throw null;
        }

        public e(zqf zqfVar, m2h m2hVar, lg90 lg90Var, String str, long j, float f, long j2, String str2, String str3, yyq yyqVar, boolean z, Integer num) {
            this.a = androidx.compose.runtime.k.b(zqfVar);
            this.b = androidx.compose.runtime.k.b(m2hVar);
            this.c = androidx.compose.runtime.k.b(lg90Var);
            this.d = zy60.d(j);
            this.e = cq.f(f);
            this.f = androidx.compose.runtime.k.b(str);
            this.g = zy60.d(j2);
            this.h = androidx.compose.runtime.k.b(str2);
            this.i = androidx.compose.runtime.k.b(str3);
            this.j = androidx.compose.runtime.k.b("feed_footer_like_button");
            this.k = androidx.compose.runtime.k.b("feed_footer_like_counter");
            this.l = androidx.compose.runtime.k.b(yyqVar);
            this.m = androidx.compose.runtime.k.b(Boolean.valueOf(z));
            this.n = androidx.compose.runtime.k.b(num);
        }

        @Override // xsna.xyq
        public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
            aVar.K(-1456582075);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1456582075, i, -1, "com.vk.feed.design.compose.newsfeed.footer.FeedFooter.Item.LikesButton.Content (FeedFooter.kt:134)");
            }
            xzq.f((lg90) ((zak0) this.c).getValue(), (String) ((zak0) this.f).getValue(), (gzs) ((zak0) this.a).getValue(), (wzs) ((zak0) this.b).getValue(), q630Var, ((l5g) ((zak0) this.d).getValue()).a, ((pco) ((zak0) this.e).getValue()).b, ((l5g) ((zak0) this.g).getValue()).a, (String) ((zak0) this.h).getValue(), (String) ((zak0) this.i).getValue(), (String) ((zak0) this.j).getValue(), (String) ((zak0) this.k).getValue(), (yyq) ((zak0) this.l).getValue(), ((Boolean) ((zak0) this.m).getValue()).booleanValue(), (Integer) ((zak0) this.n).getValue(), aVar, 8 | ((i << 12) & 57344));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
        }
    }

    void a(q630 q630Var, androidx.compose.runtime.a aVar, int i);
}
