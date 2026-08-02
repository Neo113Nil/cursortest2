package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.e;
import com.vk.games.model.GamesHeaderSectionInfo;
import com.vk.games.model.SectionIdType;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.bbt;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: GamesCatalogDetailScreen.kt */
/* loaded from: classes17.dex */
public final class dbt {

    /* compiled from: LazyDsl.kt */
    public static final class a implements izs<Integer, Object> {
        public final /* synthetic */ log b;
        public final /* synthetic */ wow c;

        public a(log logVar, wow wowVar) {
            this.b = logVar;
            this.c = wowVar;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            int intValue = num.intValue();
            return this.b.invoke(Integer.valueOf(intValue), this.c.b.get(intValue));
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class b implements izs<Integer, Object> {
        public final /* synthetic */ wow b;

        public b(wow wowVar) {
            this.b = wowVar;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            this.b.get(num.intValue());
            return null;
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class c implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ wow b;
        public final /* synthetic */ xvy c;
        public final /* synthetic */ rha d;
        public final /* synthetic */ izs e;

        public c(wow wowVar, xvy xvyVar, rha rhaVar, izs izsVar) {
            this.b = wowVar;
            this.c = xvyVar;
            this.d = rhaVar;
            this.e = izsVar;
        }

        @Override // xsna.zzs
        public final s3q0 invoke(ksy ksyVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
            int i;
            ksy ksyVar2 = ksyVar;
            int intValue = num.intValue();
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue2 = num2.intValue();
            if ((intValue2 & 6) == 0) {
                i = (aVar2.J(ksyVar2) ? 4 : 2) | intValue2;
            } else {
                i = intValue2;
            }
            if ((intValue2 & 48) == 0) {
                i |= aVar2.o(intValue) ? 32 : 16;
            }
            if (aVar2.t(i & 1, (i & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2039820996, i, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                Object obj = this.b.b.get(intValue);
                int i2 = i & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
                aVar2.K(-554493868);
                nft.a(ksyVar2, (ebt) obj, this.c, this.d, this.e, intValue, aVar2, (i & 14) | ((i2 << 12) & 458752));
                aVar2.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }

    public static final void a(bbt.b bVar, rha rhaVar, bbt.d dVar, izs<? super mat, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        izs<? super mat, s3q0> izsVar2 = izsVar;
        androidx.compose.runtime.a M = aVar.M(2058040936);
        if ((i & 6) == 0) {
            i2 = (M.J(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(rhaVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(dVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar2) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2058040936, i2, -1, "com.vk.games.presentation.detail.screen.GamesCatalogDetailContent (GamesCatalogDetailScreen.kt:71)");
            }
            boolean isEmpty = bVar.b.isEmpty();
            q630.a aVar2 = q630.a.a;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (!isEmpty) {
                M.K(439704934);
                boolean z = dVar.c && dVar.e == null;
                int i3 = i2 & 7168;
                boolean z2 = i3 == 2048;
                Object x = M.x();
                if (z2 || x == c0012a) {
                    x = new tzo(izsVar2, 1);
                    M.R(x);
                }
                xvy z3 = crx0.z(z, (gzs) x, 4, M, 3072, 52);
                q630 d = txj0.d(aVar2, 1.0f);
                boolean z4 = !dVar.a;
                u890 n = s200.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.r, 7);
                boolean J = (i3 == 2048) | ((i2 & 112) == 32) | ((i2 & 14) == 4) | M.J(z3) | ((i2 & 896) == 256);
                Object x2 = M.x();
                if (J || x2 == c0012a) {
                    arq arqVar = new arq(rhaVar, bVar, dVar, z3, izsVar2, 1);
                    izsVar2 = izsVar2;
                    M.R(arqVar);
                    x2 = arqVar;
                }
                lqy.a(d, z3, n, null, null, null, z4, null, (izs) x2, M, 6, 376);
                M = M;
                M.j();
            } else if (dVar.b != null) {
                M.K(441244270);
                kbt kbtVar = dVar.b;
                boolean z5 = (i2 & 7168) == 2048;
                Object x3 = M.x();
                if (z5 || x3 == c0012a) {
                    x3 = new a97(izsVar2, 5);
                    M.R(x3);
                }
                jbt.a(kbtVar, (gzs) x3, txj0.d(aVar2, 1.0f), M, 384);
                M.j();
            } else {
                M.K(441447723);
                pat.a(null, M, 0);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new cbt(bVar, rhaVar, dVar, izsVar2, i, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(bbt.a aVar, rha rhaVar, izs<? super mat, s3q0> izsVar, androidx.compose.runtime.a aVar2, int i) {
        int i2;
        rha rhaVar2;
        String str;
        androidx.compose.runtime.a M = aVar2.M(-1005722879);
        if ((i & 6) == 0) {
            i2 = (M.J(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            rhaVar2 = rhaVar;
            i2 |= M.J(rhaVar2) ? 32 : 16;
        } else {
            rhaVar2 = rhaVar;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1005722879, i2, -1, "com.vk.games.presentation.detail.screen.GamesCatalogDetailScreen (GamesCatalogDetailScreen.kt:34)");
            }
            q630.a aVar3 = q630.a.a;
            q630 d = txj0.d(aVar3, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, d);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            String str2 = null;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            wh50 a3 = jk50.a(aVar.d, M, 0, 3);
            wh50 a4 = jk50.a(aVar.c, M, 0, 3);
            q630 f = txj0.f(aVar3, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getIcon().b;
            String N = d370.N(R.string.vk_accessibility_back, 0, M);
            boolean z = (i2 & 896) == 256;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new z8c(izsVar, 3);
                M.R(x);
            }
            TopBar$Before.e a5 = e.a.a((gzs) x, N, null, new l5g(j), null, M, 196608, 20);
            GamesHeaderSectionInfo gamesHeaderSectionInfo = (GamesHeaderSectionInfo) a3.getValue();
            String str3 = (String) a4.getValue();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(215083459, 0, -1, "com.vk.games.presentation.utils.resolveDetailScreenTitle (StringHelper.kt:12)");
            }
            String title = gamesHeaderSectionInfo != null ? gamesHeaderSectionInfo.getTitle() : null;
            if (title == null) {
                M.K(536780615);
                M.K(-603242945);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-603242945, 0, -1, "com.vk.games.presentation.utils.processTitleFromSection (StringHelper.kt:18)");
                }
                if (gamesHeaderSectionInfo == null) {
                    String str4 = new String();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    title = str4;
                } else {
                    if (gamesHeaderSectionInfo instanceof GamesHeaderSectionInfo.Collection) {
                        M.K(-1067187682);
                        M.j();
                    } else if (gamesHeaderSectionInfo instanceof GamesHeaderSectionInfo.Genre) {
                        M.K(-1067140066);
                        M.j();
                    } else if (gamesHeaderSectionInfo instanceof GamesHeaderSectionInfo.FriendlyUrl) {
                        M.K(-1067086498);
                        M.j();
                    } else {
                        if (!(gamesHeaderSectionInfo instanceof GamesHeaderSectionInfo.Section)) {
                            throw alb0.c(104120755, M);
                        }
                        M.K(-1067015538);
                        SectionIdType sectionIdType = ((GamesHeaderSectionInfo.Section) gamesHeaderSectionInfo).c;
                        if (sectionIdType instanceof SectionIdType.Custom) {
                            M.K(-1066949602);
                            M.j();
                        } else if (epx.f(sectionIdType, SectionIdType.CategoriesScreen.c)) {
                            str2 = zq.a(M, 104131407, R.string.vk_games_tab_categories, M, 0);
                        } else if (epx.f(sectionIdType, SectionIdType.FriendsActivity.c)) {
                            str2 = zq.a(M, 104134533, R.string.vk_games_feed, M, 0);
                        } else if (epx.f(sectionIdType, SectionIdType.Installed.c)) {
                            str2 = zq.a(M, 104137174, R.string.vk_games_installed_games_title, M, 0);
                        } else if (epx.f(sectionIdType, SectionIdType.New.c)) {
                            str2 = zq.a(M, 104140144, R.string.vk_games_new_games_title, M, 0);
                        } else if (epx.f(sectionIdType, SectionIdType.Notifications.c)) {
                            str2 = zq.a(M, 104143252, R.string.vk_games_notifications_title, M, 0);
                        } else {
                            if (!epx.f(sectionIdType, SectionIdType.Recommended.c)) {
                                throw alb0.c(104127900, M);
                            }
                            str2 = zq.a(M, 104146424, R.string.vk_games_recommended_games_title, M, 0);
                        }
                        M.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    title = str2;
                }
            } else {
                M.K(536779871);
            }
            M.j();
            if (title == null) {
                if (str3 == null) {
                    str3 = new String();
                }
                str = str3;
            } else {
                str = title;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            muv0.h(TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(str, null, null, null, null, M, 196608, 30), null, null, null, M, 14), f, null, null, a5, null, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 48, 0, 8172);
            M = M;
            a((bbt.b) jk50.c(aVar.b, M).getValue(), rhaVar2, (bbt.d) jk50.c(aVar.a, M).getValue(), izsVar, M, (i2 & 112) | ((i2 << 3) & 7168));
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new iu6(i, 2, aVar, rhaVar, izsVar);
        }
    }
}
