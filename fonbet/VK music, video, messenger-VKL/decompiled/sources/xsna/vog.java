package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.mvp.holder.group.topbar.CommunitiesSearchTopBarVh;
import com.vk.catalog2.common.ui.mvp.holder.group.topbar.CommunitiesTopBarSearchState;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.compose.component.topbar.e;
import com.vkontakte.android.R;
import java.util.HashSet;
import xsna.b78;
import xsna.phw;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class vog implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vog(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0815  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0841  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x06a8  */
    @Override // xsna.yzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        gkg0 gkg0Var;
        TopBar$Middle a;
        int i;
        long j;
        TopBar$Before.e eVar;
        TopBar$Before.e eVar2;
        int i2;
        TopBar$Before.a aVar;
        int i3;
        com.vk.core.compose.component.topbar.a a2;
        com.vk.core.compose.component.topbar.a aVar2;
        int i4 = this.b;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        q630.a aVar3 = q630.a.a;
        Object obj4 = this.c;
        switch (i4) {
            case 0:
                CommunitiesSearchTopBarVh communitiesSearchTopBarVh = (CommunitiesSearchTopBarVh) obj4;
                wh50 wh50Var = communitiesSearchTopBarVh.j;
                wh50 wh50Var2 = communitiesSearchTopBarVh.g;
                CommunitiesTopBarSearchState communitiesTopBarSearchState = (CommunitiesTopBarSearchState) obj;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar4.o(communitiesTopBarSearchState.ordinal()) ? 4 : 2;
                }
                int i5 = intValue;
                if (aVar4.t(i5 & 1, (i5 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1313260820, i5, -1, "com.vk.catalog2.common.ui.mvp.holder.group.topbar.CommunitiesSearchTopBarVh.bindData.<anonymous>.<anonymous>.<anonymous> (CommunitiesSearchTopBarVh.kt:102)");
                    }
                    int i6 = i5 & 14;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1351475922, i6, -1, "com.vk.catalog2.common.ui.mvp.holder.group.topbar.CommunitiesSearchTopBarVh.resolveMiddle (CommunitiesSearchTopBarVh.kt:204)");
                    }
                    int[] iArr = CommunitiesSearchTopBarVh.a.$EnumSwitchMapping$0;
                    int i7 = iArr[communitiesTopBarSearchState.ordinal()];
                    if (i7 == 1 || i7 == 2) {
                        aVar4.K(796072824);
                        String N = d370.N(R.string.community_catalog_search_hint, 0, aVar4);
                        tho0 tho0Var = (tho0) ((zak0) wh50Var2).getValue();
                        String N2 = d370.N(R.string.search_voice, 0, aVar4);
                        boolean y = aVar4.y(communitiesSearchTopBarVh);
                        Object x = aVar4.x();
                        if (y || x == c0012a) {
                            x = new w40(communitiesSearchTopBarVh, 24);
                            aVar4.R(x);
                        }
                        gzs gzsVar = (gzs) x;
                        Object x2 = aVar4.x();
                        if (x2 == c0012a) {
                            x2 = new ak(13);
                            aVar4.R(x2);
                        }
                        lkg0 a3 = vlh0.a(3072, 0, aVar4, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), N2, gzsVar);
                        if (communitiesSearchTopBarVh.c || ((tho0) ((zak0) wh50Var2).getValue()).a.c.length() <= 0) {
                            aVar4.K(797833500);
                            aVar4.j();
                            gkg0Var = null;
                        } else {
                            aVar4.K(796997554);
                            if (androidx.compose.runtime.b.d()) {
                                i = 0;
                                androidx.compose.runtime.b.f(1794058044, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Filter24> (VkSdkIcons.kt:890)");
                            } else {
                                i = 0;
                            }
                            lg90 b = or.b(aVar4, 210325805, R.drawable.vk_icon_filter_24, aVar4, i);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            if (((Boolean) ((zak0) communitiesSearchTopBarVh.i).getValue()).booleanValue()) {
                                aVar4.K(797134450);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var = (ylu0) aVar4.r(rrv0.a);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                j = ylu0Var.getIcon().a;
                                aVar4.j();
                            } else {
                                aVar4.K(797233743);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var2 = (ylu0) aVar4.r(rrv0.a);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                j = ylu0Var2.getIcon().l;
                                aVar4.j();
                            }
                            long j2 = j;
                            String N3 = d370.N(R.string.accessibility_navigation_drawer, 0, aVar4);
                            boolean y2 = aVar4.y(communitiesSearchTopBarVh);
                            Object x3 = aVar4.x();
                            if (y2 || x3 == c0012a) {
                                x3 = new px0(communitiesSearchTopBarVh, 25);
                                aVar4.R(x3);
                            }
                            gzs gzsVar2 = (gzs) x3;
                            Object x4 = aVar4.x();
                            if (x4 == c0012a) {
                                x4 = new wq3(15);
                                aVar4.R(x4);
                            }
                            gkg0 e = lmc.e(b, j2, N3, gzsVar2, com.vk.core.compose.component.semantics.b.a(null, (izs) x4, 3), aVar4, 0);
                            aVar4.j();
                            gkg0Var = e;
                        }
                        boolean booleanValue = ((Boolean) ((zak0) communitiesSearchTopBarVh.h).getValue()).booleanValue();
                        Object x5 = aVar4.x();
                        if (x5 == c0012a) {
                            x5 = new d40(17);
                            aVar4.R(x5);
                        }
                        com.vk.core.compose.component.semantics.a a4 = com.vk.core.compose.component.semantics.b.a(null, (izs) x5, 3);
                        boolean y3 = aVar4.y(communitiesSearchTopBarVh);
                        Object x6 = aVar4.x();
                        if (y3 || x6 == c0012a) {
                            x6 = new j9(communitiesSearchTopBarVh, 28);
                            aVar4.R(x6);
                        }
                        izs izsVar = (izs) x6;
                        boolean y4 = aVar4.y(communitiesSearchTopBarVh);
                        Object x7 = aVar4.x();
                        if (y4 || x7 == c0012a) {
                            x7 = new com.vk.movika.sdk.base.data.a(communitiesSearchTopBarVh, 28);
                            aVar4.R(x7);
                        }
                        izs izsVar2 = (izs) x7;
                        boolean y5 = aVar4.y(communitiesSearchTopBarVh);
                        Object x8 = aVar4.x();
                        if (y5 || x8 == c0012a) {
                            x8 = new com.vk.newsfeed.posting.impl.presentation.base.fragment.a(communitiesSearchTopBarVh, 26);
                            aVar4.R(x8);
                        }
                        a = TopBar$Middle.b.a.a(N, tho0Var, izsVar, a3, gkg0Var, null, izsVar2, null, a4, booleanValue, (izs) x8, false, aVar4, 0, 384, 2208);
                        aVar4.j();
                    } else {
                        if (i7 != 3) {
                            throw alb0.c(1688244144, aVar4);
                        }
                        aVar4.K(798439023);
                        String N4 = d370.N(R.string.communities, 0, aVar4);
                        Object x9 = aVar4.x();
                        if (x9 == c0012a) {
                            x9 = new tc(15);
                            aVar4.R(x9);
                        }
                        a = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(N4, null, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x9, 3), aVar4, 196608, 14), null, null, null, aVar4, 14);
                        aVar4 = aVar4;
                        aVar4.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    q630 f = txj0.f(aVar3, 1.0f);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(202419318, i6, -1, "com.vk.catalog2.common.ui.mvp.holder.group.topbar.CommunitiesSearchTopBarVh.resolveBack (CommunitiesSearchTopBarVh.kt:132)");
                    }
                    int i8 = iArr[communitiesTopBarSearchState.ordinal()];
                    if (i8 == 1) {
                        aVar4.K(140024796);
                        Context context = (Context) aVar4.r(AndroidCompositionLocals_androidKt.b);
                        if (((Boolean) ((zak0) wh50Var).getValue()).booleanValue()) {
                            HashSet hashSet = iah0.a;
                            if (!fnj.d(context)) {
                                aVar4.K(140138132);
                                String N5 = d370.N(R.string.talkback_ic_back, 0, aVar4);
                                Object x10 = aVar4.x();
                                if (x10 == c0012a) {
                                    x10 = new wr0(11);
                                    aVar4.R(x10);
                                }
                                com.vk.core.compose.component.semantics.a a5 = com.vk.core.compose.component.semantics.b.a(null, (izs) x10, 3);
                                boolean y6 = aVar4.y(communitiesSearchTopBarVh);
                                Object x11 = aVar4.x();
                                if (y6 || x11 == c0012a) {
                                    x11 = new ng1(communitiesSearchTopBarVh, 28);
                                    aVar4.R(x11);
                                }
                                eVar = e.a.a((gzs) x11, N5, null, null, a5, aVar4, 196608, 12);
                                aVar4.j();
                                aVar4.j();
                            }
                        }
                        aVar4.K(140599040);
                        aVar4.j();
                        eVar = null;
                        aVar4.j();
                    } else if (i8 == 2) {
                        aVar4.K(140727566);
                        if (((Boolean) ((zak0) wh50Var).getValue()).booleanValue()) {
                            aVar4.K(140762100);
                            String N6 = d370.N(R.string.talkback_ic_back, 0, aVar4);
                            Object x12 = aVar4.x();
                            if (x12 == c0012a) {
                                x12 = new sd4(16);
                                aVar4.R(x12);
                            }
                            com.vk.core.compose.component.semantics.a a6 = com.vk.core.compose.component.semantics.b.a(null, (izs) x12, 3);
                            boolean y7 = aVar4.y(communitiesSearchTopBarVh);
                            Object x13 = aVar4.x();
                            if (y7 || x13 == c0012a) {
                                x13 = new q5f(communitiesSearchTopBarVh, 4);
                                aVar4.R(x13);
                            }
                            eVar = e.a.a((gzs) x13, N6, null, null, a6, aVar4, 196608, 12);
                            aVar4.j();
                        } else {
                            aVar4.K(141223008);
                            aVar4.j();
                            eVar = null;
                        }
                        aVar4.j();
                    } else {
                        if (i8 != 3) {
                            throw alb0.c(1251441137, aVar4);
                        }
                        aVar4.K(141334855);
                        aVar4.j();
                        eVar2 = null;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1460819366, i6, -1, "com.vk.catalog2.common.ui.mvp.holder.group.topbar.CommunitiesSearchTopBarVh.resolveBefore (CommunitiesSearchTopBarVh.kt:171)");
                        }
                        i2 = iArr[communitiesTopBarSearchState.ordinal()];
                        if (i2 != 1) {
                            aVar4.K(-1633688265);
                            aVar4.j();
                        } else if (i2 == 2) {
                            aVar4.K(-1633629737);
                            aVar4.j();
                        } else {
                            if (i2 != 3) {
                                throw alb0.c(-606890364, aVar4);
                            }
                            aVar4.K(-1633541169);
                            if (((Boolean) ((zak0) communitiesSearchTopBarVh.k).getValue()).booleanValue()) {
                                aVar4.K(-1633509518);
                                phw a7 = phw.a.a(fwu0.l(null, (String) ((zak0) communitiesSearchTopBarVh.l).getValue(), null, null, aVar4, 0, 61), null, null, null, null, aVar4, 196616, 30);
                                boolean y8 = aVar4.y(communitiesSearchTopBarVh);
                                Object x14 = aVar4.x();
                                if (y8 || x14 == c0012a) {
                                    x14 = new hd(communitiesSearchTopBarVh, 27);
                                    aVar4.R(x14);
                                }
                                gzs gzsVar3 = (gzs) x14;
                                boolean y9 = aVar4.y(communitiesSearchTopBarVh);
                                Object x15 = aVar4.x();
                                if (y9 || x15 == c0012a) {
                                    x15 = new yce(communitiesSearchTopBarVh, 5);
                                    aVar4.R(x15);
                                }
                                gzs gzsVar4 = (gzs) x15;
                                Object x16 = aVar4.x();
                                if (x16 == c0012a) {
                                    x16 = new cj1(14);
                                    aVar4.R(x16);
                                }
                                aVar = TopBar$Before.a.C0750a.b(a7, gzsVar3, gzsVar4, com.vk.core.compose.component.semantics.b.a(null, (izs) x16, 3), aVar4, 100663296, 30);
                                ((zak0) communitiesSearchTopBarVh.n).setValue(aVar.d());
                                aVar4.j();
                            } else {
                                aVar4.K(-1632693040);
                                aVar4.j();
                                aVar = null;
                            }
                            aVar4.j();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-1946062130, i6, -1, "com.vk.catalog2.common.ui.mvp.holder.group.topbar.CommunitiesSearchTopBarVh.resolveAfter (CommunitiesSearchTopBarVh.kt:271)");
                            }
                            i3 = iArr[communitiesTopBarSearchState.ordinal()];
                            if (i3 == 1) {
                                aVar4.K(-1668142961);
                                String N7 = d370.N(R.string.community_catalog_accessibility_create_community, 0, aVar4);
                                String N8 = d370.N(R.string.community_catalog_create_community, 0, aVar4);
                                boolean y10 = aVar4.y(communitiesSearchTopBarVh);
                                Object x17 = aVar4.x();
                                if (y10 || x17 == c0012a) {
                                    x17 = new h9(communitiesSearchTopBarVh, 25);
                                    aVar4.R(x17);
                                }
                                gzs gzsVar5 = (gzs) x17;
                                boolean J = aVar4.J(N7);
                                Object x18 = aVar4.x();
                                if (J || x18 == c0012a) {
                                    x18 = new l00(N7, 24);
                                    aVar4.R(x18);
                                }
                                a2 = d.a.a(d.c.b.a.a(N8, gzsVar5, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, com.vk.core.compose.component.semantics.b.a(null, (izs) x18, 3), aVar4, 196608, 12), null, null, null, aVar4, 24576, 14);
                                aVar4.j();
                            } else if (i3 == 2) {
                                aVar4.K(-1667375184);
                                aVar4.j();
                                aVar2 = null;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                muv0.h(a, f, null, null, eVar2, aVar, aVar2, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar4, 48, 0, 8076);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            } else {
                                if (i3 != 3) {
                                    throw alb0.c(-1854927493, aVar4);
                                }
                                aVar4.K(-1667247495);
                                lg90 k = m200.k(aVar4);
                                String N9 = d370.N(R.string.community_catalog_accessibility_create_community, 0, aVar4);
                                boolean y11 = aVar4.y(communitiesSearchTopBarVh);
                                Object x19 = aVar4.x();
                                if (y11 || x19 == c0012a) {
                                    x19 = new we0(communitiesSearchTopBarVh, 28);
                                    aVar4.R(x19);
                                }
                                gzs gzsVar6 = (gzs) x19;
                                Object x20 = aVar4.x();
                                if (x20 == c0012a) {
                                    x20 = new oj(12);
                                    aVar4.R(x20);
                                }
                                d.c.C0760d a8 = d.c.C0760d.a.a(k, N9, gzsVar6, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x20, 3), aVar4, 1572872, 24);
                                lg90 p = m200.p(aVar4);
                                String N10 = d370.N(R.string.search, 0, aVar4);
                                boolean y12 = aVar4.y(communitiesSearchTopBarVh);
                                Object x21 = aVar4.x();
                                if (y12 || x21 == c0012a) {
                                    x21 = new u40(communitiesSearchTopBarVh, 26);
                                    aVar4.R(x21);
                                }
                                gzs gzsVar7 = (gzs) x21;
                                Object x22 = aVar4.x();
                                if (x22 == c0012a) {
                                    x22 = new f57(9);
                                    aVar4.R(x22);
                                }
                                a2 = d.a.a(a8, d.b.a.C0757a.a(p, N10, gzsVar7, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x22, 3), aVar4, 12582920, 88), null, null, aVar4, 24576, 12);
                                aVar4.j();
                            }
                            aVar2 = a2;
                            if (androidx.compose.runtime.b.d()) {
                            }
                            muv0.h(a, f, null, null, eVar2, aVar, aVar2, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar4, 48, 0, 8076);
                            if (androidx.compose.runtime.b.d()) {
                            }
                        }
                        aVar = null;
                        if (androidx.compose.runtime.b.d()) {
                        }
                        if (androidx.compose.runtime.b.d()) {
                        }
                        i3 = iArr[communitiesTopBarSearchState.ordinal()];
                        if (i3 == 1) {
                        }
                        aVar2 = a2;
                        if (androidx.compose.runtime.b.d()) {
                        }
                        muv0.h(a, f, null, null, eVar2, aVar, aVar2, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar4, 48, 0, 8076);
                        if (androidx.compose.runtime.b.d()) {
                        }
                    }
                    eVar2 = eVar;
                    if (androidx.compose.runtime.b.d()) {
                    }
                    if (androidx.compose.runtime.b.d()) {
                    }
                    i2 = iArr[communitiesTopBarSearchState.ordinal()];
                    if (i2 != 1) {
                    }
                    aVar = null;
                    if (androidx.compose.runtime.b.d()) {
                    }
                    if (androidx.compose.runtime.b.d()) {
                    }
                    i3 = iArr[communitiesTopBarSearchState.ordinal()];
                    if (i3 == 1) {
                    }
                    aVar2 = a2;
                    if (androidx.compose.runtime.b.d()) {
                    }
                    muv0.h(a, f, null, null, eVar2, aVar, aVar2, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar4, 48, 0, 8076);
                    if (androidx.compose.runtime.b.d()) {
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 1:
                v0r v0rVar = (v0r) obj4;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar5.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1398909910, intValue2, -1, "com.vk.design.demo.presentation.screens.feed.FeedInlineCommentsScreenContent.InlineCommentsList.<anonymous>.<anonymous>.<anonymous> (FeedInlineCommentsScreenContent.kt:141)");
                    }
                    v0rVar.h(0, aVar5);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 2:
                wzs wzsVar = (wzs) obj4;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2099626159, intValue3, -1, "com.vk.catalog2.common.ui.mvp.holder.video.playlist.search.ExpandableVideos.<anonymous> (SearchPlaylistCard.kt:399)");
                }
                wzsVar.invoke(aVar6, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return s3q0.a;
            default:
                b78.b bVar = (b78.b) obj4;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= aVar7.l(booleanValue2) ? 4 : 2;
                }
                if (aVar7.t(intValue4 & 1, (intValue4 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1876980134, intValue4, -1, "com.vk.music.stickyplayer.presentation.components.AudioBookButtons.<anonymous>.<anonymous> (VkAppBottomPlayer.kt:601)");
                    }
                    if (booleanValue2) {
                        aVar7.K(-935887801);
                        q630 E = ahn.E(aVar3, "fastForwardBtn");
                        qzu0.a.getClass();
                        lg90 V = qzu0.V(aVar7);
                        String N11 = d370.N(R.string.accessibility_rewind_on_15_sec_forward, 0, aVar7);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var3 = (ylu0) aVar7.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j3 = ylu0Var3.getIcon().a;
                        boolean J2 = aVar7.J(bVar);
                        Object x23 = aVar7.x();
                        if (J2 || x23 == c0012a) {
                            x23 = new w2j0(bVar, 22);
                            aVar7.R(x23);
                        }
                        nzu0.c((gzs) x23, V, N11, E, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j3, false, null, false, null, null, aVar7, 3136, 2000);
                        aVar7.j();
                    } else {
                        aVar7.K(-935373573);
                        q630 E2 = ahn.E(aVar3, "closeBtn");
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1243383292, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Cancel24> (VkSdkIcons.kt:226)");
                        }
                        lg90 b2 = or.b(aVar7, 1833859693, R.drawable.vk_icon_cancel_24, aVar7, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        String N12 = d370.N(R.string.ui_accessibility_close, 0, aVar7);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var4 = (ylu0) aVar7.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j4 = ylu0Var4.getIcon().l;
                        boolean J3 = aVar7.J(bVar);
                        Object x24 = aVar7.x();
                        if (J3 || x24 == c0012a) {
                            x24 = new qah0(bVar, 22);
                            aVar7.R(x24);
                        }
                        nzu0.c((gzs) x24, b2, N12, E2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j4, false, null, false, null, null, aVar7, 3136, 2000);
                        aVar7.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar7.h();
                }
                return s3q0.a;
        }
    }
}
