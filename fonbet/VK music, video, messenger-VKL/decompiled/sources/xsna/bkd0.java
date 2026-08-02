package xsna;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.utils.a;
import com.vk.ecomm.market.good.ui.holder.goodquickmessages.QuickMessageItem;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.phw;
import xsna.q630;

/* compiled from: ProductCardCommunityInfoHolder.kt */
/* loaded from: classes18.dex */
public final class bkd0 extends vif0<ikd0> {
    public final izs<ejd0, s3q0> n;
    public final l7u o;
    public final ComposeView p;

    /* compiled from: ProductCardCommunityInfoHolder.kt */
    public static final class a implements gzs<s3q0> {
        public final /* synthetic */ izs<QuickMessageItem, s3q0> b;
        public final /* synthetic */ QuickMessageItem c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(izs<? super QuickMessageItem, s3q0> izsVar, QuickMessageItem quickMessageItem) {
            this.b = izsVar;
            this.c = quickMessageItem;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            this.b.invoke(this.c);
            return s3q0.a;
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class b implements izs<Integer, Object> {
        public final /* synthetic */ wow b;

        public b(byo byoVar, wow wowVar) {
            this.b = wowVar;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            return ((QuickMessageItem) this.b.b.get(num.intValue())).d;
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class c implements izs<Integer, Object> {
        public final /* synthetic */ wow b;

        public c(wow wowVar) {
            this.b = wowVar;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            this.b.get(num.intValue());
            return null;
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class d implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ wow b;
        public final /* synthetic */ bkd0 c;
        public final /* synthetic */ izs d;

        public d(wow wowVar, bkd0 bkd0Var, izs izsVar) {
            this.b = wowVar;
            this.c = bkd0Var;
            this.d = izsVar;
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
                    androidx.compose.runtime.b.f(802480018, i, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                QuickMessageItem quickMessageItem = (QuickMessageItem) this.b.b.get(intValue);
                aVar2.K(-1427121364);
                izs izsVar = this.d;
                boolean J = aVar2.J(izsVar) | aVar2.J(quickMessageItem);
                Object x = aVar2.x();
                if (J || x == a.C0011a.a) {
                    x = new a(izsVar, quickMessageItem);
                    aVar2.R(x);
                }
                this.c.s6(quickMessageItem, (gzs) x, aVar2, 0);
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

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bkd0(ViewGroup viewGroup, frg frgVar, l7u l7uVar) {
        super(r0);
        ComposeView composeView = new ComposeView(viewGroup.getContext(), null, 6);
        composeView.setTag("product_card_community_info_compose_view");
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.n = frgVar;
        this.o = l7uVar;
        this.p = (ComposeView) this.itemView;
    }

    public final void A6(int i, androidx.compose.runtime.a aVar, List list, izs izsVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-163800817);
        if ((i & 6) == 0) {
            i2 = (M.J(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-163800817, i2, -1, "com.vk.ecomm.market.good.good2.presentation.community.ProductCardCommunityInfoHolder.QuickMessagesBubbles (ProductCardCommunityInfoHolder.kt:144)");
            }
            a.j g = androidx.compose.foundation.layout.a.g(6);
            u890 n = s200.n(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            q630 E = ahn.E(txj0.f(q630.a.a, 1.0f), "quick_message_list");
            boolean y = ((i2 & 14) == 4) | M.y(this) | ((i2 & 112) == 32);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new ihb(list, this, izsVar, 9);
                M.R(x);
            }
            lqy.b(E, null, n, g, null, null, false, null, (izs) x, M, 24966, 490);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new urx(i, 2, this, list, izsVar);
        }
    }

    @Override // xsna.vif0
    public final void i6(ikd0 ikd0Var) {
        ikd0 ikd0Var2 = ikd0Var;
        if (ikd0Var2 == null) {
            return;
        }
        this.p.setContent(new jai(182326814, new o9d(7, this, ikd0Var2), true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02fa  */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12, types: [com.vk.core.compose.component.semantics.a] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v24, types: [xsna.ckd0] */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28, types: [com.vk.core.compose.component.cell.content.Cell$Middle$d] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v17, types: [com.vk.core.compose.component.cell.content.Cell$Middle$d$a] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q6(ikd0 ikd0Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        lg90 lg90Var;
        int i2;
        androidx.compose.runtime.a aVar3;
        int i3;
        SemanticsConfiguration.Mode mode;
        String str;
        a.C0011a.C0012a c0012a;
        com.vk.core.compose.component.cell.content.x a2;
        Object obj;
        Cell$Middle.c cVar;
        ?? r10;
        androidx.compose.runtime.a aVar4;
        String str2;
        String str3;
        ?? r6;
        ?? r4;
        boolean y;
        Object x;
        androidx.compose.runtime.a M = aVar.M(852703001);
        int i4 = i | (M.J(ikd0Var) ? 4 : 2) | (M.y(this) ? 32 : 16);
        int i5 = 0;
        if (M.t(i4 & 1, (i4 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(852703001, i4, -1, "com.vk.ecomm.market.good.good2.presentation.community.ProductCardCommunityInfoHolder.CommunityInfoCell (ProductCardCommunityInfoHolder.kt:89)");
            }
            int i6 = (i4 >> 3) & 14;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1929810541, i6, -1, "com.vk.ecomm.market.good.good2.presentation.community.ProductCardCommunityInfoHolder.getVerificationTick (ProductCardCommunityInfoHolder.kt:267)");
            }
            if (((ikd0) this.m).c.Cb()) {
                M.K(-1446310988);
                Object obj2 = com.vk.core.utils.a.a;
                a.b d2 = com.vk.core.utils.a.d(this.itemView.getContext(), ((ikd0) this.m).c, VerifyInfoHelper.ColorTheme.normal, 24);
                lg90 p = w65.p(d2 != null ? d2.a : null, M, 0);
                M.j();
                lg90Var = p;
            } else {
                M.K(-1446057936);
                M.j();
                lg90Var = null;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-310170678, i6, -1, "com.vk.ecomm.market.good.good2.presentation.community.ProductCardCommunityInfoHolder.getSubscribeButtonIcon (ProductCardCommunityInfoHolder.kt:278)");
            }
            boolean z = ((ikd0) this.m).d;
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (z) {
                M.K(-1819928079);
                qzu0.a.getClass();
                lg90 w = qzu0.w(M);
                String g6 = g6(R.string.market_accessibility_unsubscribe);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getIcon().n;
                Object x2 = M.x();
                if (x2 == c0012a2) {
                    x2 = new ev60(7);
                    M.R(x2);
                }
                com.vk.core.compose.component.semantics.a a3 = com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3);
                boolean y2 = M.y(this);
                Object x3 = M.x();
                if (y2 || x3 == c0012a2) {
                    x3 = new wp40(this, 17);
                    M.R(x3);
                }
                aVar3 = M;
                i2 = i4;
                a2 = com.vk.core.compose.component.cell.content.p.a(w, j, 0L, g6, (gzs) x3, a3, aVar3, 1572872, 4);
                aVar3.j();
                str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                c0012a = c0012a2;
                mode = null;
            } else {
                i2 = i4;
                aVar3 = M;
                aVar3.K(-1819502604);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-2089848644, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-AddSquareOutline28> (VkSdkIcons.kt:66)");
                }
                lg90 b2 = or.b(aVar3, 1165150113, R.drawable.vk_icon_add_square_outline_28, aVar3, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                String g62 = g6(R.string.market_accessibility_subscribe);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) aVar3.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j2 = ylu0Var2.getIcon().a;
                Object x4 = aVar3.x();
                if (x4 == c0012a2) {
                    i3 = 8;
                    x4 = new e750(i3);
                    aVar3.R(x4);
                } else {
                    i3 = 8;
                }
                mode = null;
                com.vk.core.compose.component.semantics.a a4 = com.vk.core.compose.component.semantics.b.a(null, (izs) x4, 3);
                boolean y3 = aVar3.y(this);
                Object x5 = aVar3.x();
                if (y3 || x5 == c0012a2) {
                    x5 = new akd0(this, i5);
                    aVar3.R(x5);
                }
                str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                c0012a = c0012a2;
                a2 = com.vk.core.compose.component.cell.content.p.a(b2, j2, 0L, g62, (gzs) x5, a4, aVar3, 1572872, 4);
                aVar3.j();
            }
            com.vk.core.compose.component.cell.content.x xVar = a2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2117273820, i6, -1, "com.vk.ecomm.market.good.good2.presentation.community.ProductCardCommunityInfoHolder.getSubtitle (ProductCardCommunityInfoHolder.kt:229)");
            }
            ikd0 ikd0Var2 = (ikd0) this.m;
            if (ikd0Var2.g != null) {
                Integer num = ikd0Var2.h;
                if ((num != null ? num.intValue() : 0) > 0) {
                    aVar3.K(-185198368);
                    Object x6 = aVar3.x();
                    if (x6 == c0012a) {
                        x6 = new ckd0();
                        aVar3.R(x6);
                    }
                    cVar = (ckd0) x6;
                    ((zak0) cVar.a).setValue(new xig0(((ikd0) this.m).g.floatValue(), ((ikd0) this.m).h.intValue()));
                    aVar3.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    q630 H = s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 5);
                    phw a5 = phw.a.a(fwu0.l(null, ikd0Var.b, null, null, aVar3, 0, 61), null, null, null, null, aVar3, 196616, 30);
                    Cell$Left.Main.Size size = Cell$Left.Main.Size.Small;
                    if (ikd0Var.b != null) {
                        aVar3.K(-1855873472);
                        aVar3.j();
                        r10 = mode;
                    } else {
                        aVar3.K(-1855873471);
                        boolean z2 = (i2 & 14) == 4;
                        Object x7 = aVar3.x();
                        if (z2 || x7 == c0012a) {
                            x7 = new w910(ikd0Var, 15);
                            aVar3.R(x7);
                        }
                        com.vk.core.compose.component.semantics.a a6 = com.vk.core.compose.component.semantics.b.a(mode, (izs) x7, 3);
                        aVar3.j();
                        r10 = a6;
                    }
                    androidx.compose.runtime.a aVar5 = aVar3;
                    com.vk.core.compose.component.cell.content.t a7 = com.vk.core.compose.component.cell.content.e.a(a5, size, null, null, null, null, r10, aVar5, 100663344, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                    aVar4 = aVar5;
                    str2 = ikd0Var.a;
                    if (str2 != null) {
                        aVar4.K(-1855556931);
                        aVar4.j();
                        r4 = mode;
                    } else {
                        aVar4.K(-1855556930);
                        if (lg90Var == null) {
                            aVar4.K(1978584150);
                            aVar4.j();
                            r6 = mode;
                            str3 = str2;
                        } else {
                            aVar4.K(1978584151);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, str);
                            }
                            ylu0 ylu0Var3 = (ylu0) aVar4.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            long j3 = ylu0Var3.getIcon().a;
                            str3 = str2;
                            com.vk.core.compose.component.cell.content.x a8 = Cell$Middle.d.a.InterfaceC0732a.C0733a.a(lg90Var, j3, null, null, aVar4, 24584, 12);
                            aVar4.j();
                            r6 = a8;
                        }
                        com.vk.core.compose.component.cell.content.h1 a9 = Cell$Middle.d.b.a(str3, null, r6, 0, null, null, aVar4, 12582912, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
                        aVar4 = aVar4;
                        aVar4.j();
                        r4 = a9;
                    }
                    com.vk.core.compose.component.cell.content.k0 a10 = Cell$Middle.a.a(r4, cVar, null, null, aVar4, 196608, 28);
                    y = aVar4.y(this);
                    x = aVar4.x();
                    if (!y || x == c0012a) {
                        x = new fr20(this, 24);
                        aVar4.R(x);
                    }
                    androidx.compose.runtime.a aVar6 = aVar4;
                    wiu0.b(H, false, a7, a10, xVar, (gzs) x, null, aVar6, 6, 66);
                    aVar2 = aVar6;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                }
            }
            aVar3.K(-184223883);
            String str4 = ((ikd0) this.m).e;
            if (str4 == null) {
                aVar3.K(-184188637);
                aVar3.j();
                obj = mode;
            } else {
                aVar3.K(-184188636);
                Object x8 = aVar3.x();
                if (x8 == c0012a) {
                    x8 = new hyu(14);
                    aVar3.R(x8);
                }
                Object b3 = Cell$Middle.c.b.b(str4, 0, null, null, com.vk.core.compose.component.semantics.b.a(mode, (izs) x8, 3), aVar3, 12582912, 94);
                aVar3.j();
                obj = b3;
            }
            aVar3.j();
            cVar = obj;
            if (androidx.compose.runtime.b.d()) {
            }
            q630 H2 = s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 5);
            phw a52 = phw.a.a(fwu0.l(null, ikd0Var.b, null, null, aVar3, 0, 61), null, null, null, null, aVar3, 196616, 30);
            Cell$Left.Main.Size size2 = Cell$Left.Main.Size.Small;
            if (ikd0Var.b != null) {
            }
            androidx.compose.runtime.a aVar52 = aVar3;
            com.vk.core.compose.component.cell.content.t a72 = com.vk.core.compose.component.cell.content.e.a(a52, size2, null, null, null, null, r10, aVar52, 100663344, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            aVar4 = aVar52;
            str2 = ikd0Var.a;
            if (str2 != null) {
            }
            com.vk.core.compose.component.cell.content.k0 a102 = Cell$Middle.a.a(r4, cVar, null, null, aVar4, 196608, 28);
            y = aVar4.y(this);
            x = aVar4.x();
            if (!y) {
            }
            x = new fr20(this, 24);
            aVar4.R(x);
            androidx.compose.runtime.a aVar62 = aVar4;
            wiu0.b(H2, false, a72, a102, xVar, (gzs) x, null, aVar62, 6, 66);
            aVar2 = aVar62;
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new at0(this, ikd0Var, i, 5);
        }
    }

    public final void s6(QuickMessageItem quickMessageItem, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1977480810);
        int i2 = i | (M.J(quickMessageItem) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1977480810, i2, -1, "com.vk.ecomm.market.good.good2.presentation.community.ProductCardCommunityInfoHolder.QuickMessageBubbleItem (ProductCardCommunityInfoHolder.kt:171)");
            }
            aVar2 = M;
            bhu0.c(gzsVar, ButtonSize.Medium, ButtonStyle.Secondary, ButtonAppearance.Accent, null, null, null, false, null, null, null, false, kai.c(1302841457, new s0r(quickMessageItem, 1), M), aVar2, ((i2 >> 3) & 14) | X2.b.f, 384, 4080);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new n9d(i, 4, this, quickMessageItem, gzsVar);
        }
    }

    public final void t6(ose0 ose0Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-425449961);
        int i2 = (M.J(ose0Var) ? 4 : 2) | i | (M.y(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-425449961, i2, -1, "com.vk.ecomm.market.good.good2.presentation.community.ProductCardCommunityInfoHolder.QuickMessageResponseTimeBlock (ProductCardCommunityInfoHolder.kt:196)");
            }
            us2 a2 = sbg0.a(ose0Var.a, ose0Var.b, M);
            if (drm0.N(a2)) {
                a2 = null;
            }
            if (a2 == null) {
                M.K(-130905008);
            } else {
                M.K(-130905007);
                q630.a aVar2 = q630.a.a;
                f9t.e(txj0.h(aVar2, 8), M, 6);
                v6(a2, s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar2, 1.0f)), M, ((i2 << 3) & 896) | 48);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xs8(this, ose0Var, i, 5);
        }
    }

    public final void v6(us2 us2Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        us2 us2Var2;
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1688867457);
        if ((i & 6) == 0) {
            us2Var2 = us2Var;
            i2 = i | (M.J(us2Var2) ? 4 : 2);
        } else {
            us2Var2 = us2Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1688867457, i2, -1, "com.vk.ecomm.market.good.good2.presentation.community.ProductCardCommunityInfoHolder.QuickMessageResponseTimeMessage (ProductCardCommunityInfoHolder.kt:217)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.m0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.d(us2Var2, q630Var, ylu0Var.getText().p, 5, null, 0, false, 0, null, null, frv0Var, M, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 0, 8120);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new n00(this, us2Var, q630Var, i, 2);
        }
    }

    public final void x6(ikd0 ikd0Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> ys0Var;
        androidx.compose.runtime.a M = aVar.M(-1868127006);
        int i2 = (M.J(ikd0Var) ? 4 : 2) | i | (M.y(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1868127006, i2, -1, "com.vk.ecomm.market.good.good2.presentation.community.ProductCardCommunityInfoHolder.QuickMessagesBlock (ProductCardCommunityInfoHolder.kt:127)");
            }
            pse0 pse0Var = ikd0Var.f;
            if (pse0Var == null) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    ys0Var = new ud6(this, ikd0Var, i, 9);
                    s.d = ys0Var;
                }
                return;
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c2 = qri.c(M, aVar2);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            List list = pse0Var.a;
            boolean y = M.y(this) | M.y(context);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new u9(27, this, context);
                M.R(x);
            }
            A6((i2 << 3) & 896, M, list, (izs) x);
            ose0 ose0Var = pse0Var.b;
            if (ose0Var == null) {
                M.K(1175638240);
            } else {
                M.K(1175638241);
                t6(ose0Var, M, i2 & 112);
            }
            M.j();
            if (xga0.c(aVar2, 12, M, 6)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        s = M.s();
        if (s != null) {
            ys0Var = new ys0(this, ikd0Var, i, 4);
            s.d = ys0Var;
        }
    }
}
