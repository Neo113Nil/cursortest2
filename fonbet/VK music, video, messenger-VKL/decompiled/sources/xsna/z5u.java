package xsna;

import android.view.ViewGroup;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.ComposeView;
import com.ironsource.X2;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: GoodPreviewButtonsItemRefactoredViewHolder.kt */
/* loaded from: classes18.dex */
public final class z5u extends vfz<q5u> {
    public final sop l;
    public final ComposeView m;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GoodPreviewButtonsItemRefactoredViewHolder.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a Multiple;
        public static final a Single;

        static {
            a aVar = new a("Single", 0);
            Single = aVar;
            a aVar2 = new a("Multiple", 1);
            Multiple = aVar2;
            a[] aVarArr = {aVar, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* compiled from: GoodPreviewButtonsItemRefactoredViewHolder.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.Single.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.Multiple.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z5u(ViewGroup viewGroup, sop sopVar) {
        super(r0);
        ComposeView composeView = new ComposeView(viewGroup.getContext(), null, 6);
        vq.b(-1, -2, composeView);
        this.l = sopVar;
        this.m = (ComposeView) this.itemView;
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(q5u q5uVar) {
        this.m.setContent(new jai(-1396470444, new ljf(2, this, q5uVar), true));
    }

    public final void h6(boolean z, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        lg90 a2;
        androidx.compose.runtime.a M = aVar.M(786259389);
        if ((i & 6) == 0) {
            i2 = i | (M.l(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(786259389, i2, -1, "com.vk.ecomm.market.goodpreview.presentation.viewholder.GoodPreviewButtonsItemRefactoredViewHolder.BookmarkButton (GoodPreviewButtonsItemRefactoredViewHolder.kt:293)");
            }
            if (z) {
                M.K(-318964207);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-705460798, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-BookmarkCheckBadge24> (VkIcons.kt:772)");
                }
                a2 = pg90.a(R.drawable.vk_icon_bookmark_check_badge_24, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            } else {
                M.K(-318962634);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2103491550, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-BookmarkAddBadgeOutline24> (VkIcons.kt:760)");
                }
                a2 = pg90.a(R.drawable.vk_icon_bookmark_add_badge_outline_24, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            }
            aVar2 = M;
            nzu0.a(gzsVar, a2, z ? zq.a(M, -318959263, R.string.fave_accessibility_remove_from_favorite, M, 0) : zq.a(M, -318956420, R.string.fave_accessibility_add_to_favorite, M, 0), ahn.E(q630.a.a, "bookmark_button"), null, null, null, true, false, null, false, null, null, aVar2, ((i2 >> 3) & 14) | 12586048, 8048);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new e0h(i, 1, this, gzsVar, z);
        }
    }

    public final void i6(final qx9 qx9Var, final boolean z, gzs gzsVar, gzs gzsVar2, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        gzs gzsVar3;
        gzs gzsVar4;
        androidx.compose.runtime.a aVar2;
        int i3;
        int i4;
        androidx.compose.runtime.a M = aVar.M(-50903263);
        if ((i & 6) == 0) {
            i2 = (M.J(qx9Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            gzsVar3 = gzsVar;
            i2 |= M.y(gzsVar3) ? 256 : 128;
        } else {
            gzsVar3 = gzsVar;
        }
        if ((i & 3072) == 0) {
            gzsVar4 = gzsVar2;
            i2 |= M.y(gzsVar4) ? 2048 : 1024;
        } else {
            gzsVar4 = gzsVar2;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-50903263, i2, -1, "com.vk.ecomm.market.goodpreview.presentation.viewholder.GoodPreviewButtonsItemRefactoredViewHolder.CartButton (GoodPreviewButtonsItemRefactoredViewHolder.kt:239)");
            }
            boolean z2 = qx9Var.a;
            if (z2) {
                i3 = -1673384719;
                i4 = R.string.product_card_go_to_cart;
            } else {
                i3 = -1673382519;
                i4 = R.string.market_cart_add;
            }
            aVar2 = M;
            bhu0.e(z2 ? gzsVar4 : gzsVar3, ButtonSize.Medium, z2 ? ButtonStyle.Primary : z ? ButtonStyle.Secondary : ButtonStyle.Primary, z2 ? ButtonAppearance.Positive : ButtonAppearance.Accent, q630Var, null, false, false, null, null, null, zq.a(M, i3, i4, M, 0), null, null, null, null, false, null, null, null, aVar2, (57344 & i2) | 48, 0, 0, 4190176);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            final gzs gzsVar5 = gzsVar3;
            final gzs gzsVar6 = gzsVar4;
            s.d = new wzs() { // from class: xsna.s5u
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    z5u.this.i6(qx9Var, z, gzsVar5, gzsVar6, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void j6(final r3d0 r3d0Var, final gzs<s3q0> gzsVar, final gzs<s3q0> gzsVar2, final gzs<s3q0> gzsVar3, final gzs<s3q0> gzsVar4, final gzs<s3q0> gzsVar5, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(-65583032);
        int i2 = i | (M.J(r3d0Var) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | (M.y(gzsVar2) ? 256 : 128) | (M.y(gzsVar3) ? 2048 : 1024) | (M.y(gzsVar4) ? 16384 : 8192) | (M.y(gzsVar5) ? 131072 : 65536) | (M.y(this) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-65583032, i2, -1, "com.vk.ecomm.market.goodpreview.presentation.viewholder.GoodPreviewButtonsItemRefactoredViewHolder.Content (GoodPreviewButtonsItemRefactoredViewHolder.kt:93)");
            }
            q630 E = s200.E(q630.a.a, 16, 12);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                int i3 = r3d0Var.a != null ? 1 : 0;
                if (r3d0Var.b != null) {
                    i3++;
                }
                if (r3d0Var.c != null) {
                    i3++;
                }
                x = i3 == 1 ? a.Single : a.Multiple;
                M.R(x);
            }
            int i4 = b.$EnumSwitchMapping$0[((a) x).ordinal()];
            if (i4 == 1) {
                M.K(-523673136);
                int i5 = i2 >> 3;
                q6(r3d0Var, gzsVar, gzsVar3, gzsVar4, gzsVar5, M, (i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & 458752));
                M = M;
                M.j();
            } else {
                if (i4 != 2) {
                    throw alb0.c(-155441492, M);
                }
                M.K(-523258108);
                l6(r3d0Var, gzsVar, gzsVar2, gzsVar3, gzsVar4, gzsVar5, M, i2 & 4194302);
                M.j();
            }
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(r3d0Var, gzsVar, gzsVar2, gzsVar3, gzsVar4, gzsVar5, i) { // from class: xsna.v5u
                public final /* synthetic */ r3d0 c;
                public final /* synthetic */ gzs d;
                public final /* synthetic */ gzs e;
                public final /* synthetic */ gzs f;
                public final /* synthetic */ gzs g;
                public final /* synthetic */ gzs h;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    z5u.this.j6(this.c, this.d, this.e, this.f, this.g, this.h, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public final void l6(final r3d0 r3d0Var, final gzs<s3q0> gzsVar, final gzs<s3q0> gzsVar2, final gzs<s3q0> gzsVar3, final gzs<s3q0> gzsVar4, final gzs<s3q0> gzsVar5, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1065858397);
        int i2 = (M.y(this) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | i | (M.J(r3d0Var) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | (M.y(gzsVar2) ? 256 : 128) | (M.y(gzsVar3) ? 2048 : 1024) | (M.y(gzsVar4) ? 16384 : 8192) | (M.y(gzsVar5) ? 131072 : 65536);
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1065858397, i2, -1, "com.vk.ecomm.market.goodpreview.presentation.viewholder.GoodPreviewButtonsItemRefactoredViewHolder.MultipleButtonsContent (GoodPreviewButtonsItemRefactoredViewHolder.kt:163)");
            }
            q630.a aVar3 = q630.a.a;
            q630 f = txj0.f(aVar3, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
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
            k9q0.w(M, c, cri.a.d);
            aVar2 = M;
            int i3 = i2 >> 9;
            s6(((i2 >> 6) & 57344) | (i3 & 896) | 3078, aVar2, kai.c(-89821821, new yzs() { // from class: xsna.w5u
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    q630 q630Var;
                    androidx.compose.runtime.a aVar5;
                    s3q0 s3q0Var;
                    q630 q630Var2 = (q630) obj;
                    androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar6.J(q630Var2) ? 4 : 2;
                    }
                    if (aVar6.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-89821821, intValue, -1, "com.vk.ecomm.market.goodpreview.presentation.viewholder.GoodPreviewButtonsItemRefactoredViewHolder.MultipleButtonsContent.<anonymous>.<anonymous> (GoodPreviewButtonsItemRefactoredViewHolder.kt:167)");
                        }
                        r3d0 r3d0Var2 = r3d0.this;
                        qx9 qx9Var = r3d0Var2.c;
                        z5u z5uVar = this;
                        if (qx9Var == null) {
                            aVar6.K(-117174128);
                            aVar6.j();
                            s3q0Var = null;
                            q630Var = q630Var2;
                            aVar5 = aVar6;
                        } else {
                            aVar6.K(-117174127);
                            q630Var = q630Var2;
                            aVar5 = aVar6;
                            z5uVar.i6(qx9Var, true, gzsVar3, gzsVar4, q630Var, aVar5, ((intValue << 12) & 57344) | 48);
                            aVar5.j();
                            s3q0Var = s3q0.a;
                        }
                        if (s3q0Var == null) {
                            aVar5.K(-116749489);
                            a1i0 a1i0Var = r3d0Var2.b;
                            if (a1i0Var == null) {
                                aVar5.K(-116749490);
                                aVar5.j();
                            } else {
                                aVar5.K(-116749489);
                                z5uVar.o6(a1i0Var, gzsVar2, q630Var, aVar5, (intValue << 6) & 896);
                                aVar5.j();
                                s3q0 s3q0Var2 = s3q0.a;
                            }
                            aVar5.j();
                        } else {
                            aVar5.K(-419422214);
                            aVar5.j();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar6.h();
                    }
                    return s3q0.a;
                }
            }, M), gzsVar5, txj0.f(aVar3, 1.0f), r3d0Var.d);
            f9t.e(txj0.h(aVar3, 12), aVar2, 6);
            oad0 oad0Var = r3d0Var.a;
            if (oad0Var == null) {
                aVar2.K(1569639753);
            } else {
                aVar2.K(1569639754);
                m6(oad0Var, gzsVar, txj0.f(aVar3, 1.0f), aVar2, (i2 & 112) | 384 | (i3 & 7168));
                aVar2 = aVar2;
            }
            aVar2.j();
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(r3d0Var, gzsVar, gzsVar2, gzsVar3, gzsVar4, gzsVar5, i) { // from class: xsna.x5u
                public final /* synthetic */ r3d0 c;
                public final /* synthetic */ gzs d;
                public final /* synthetic */ gzs e;
                public final /* synthetic */ gzs f;
                public final /* synthetic */ gzs g;
                public final /* synthetic */ gzs h;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    z5u.this.l6(this.c, this.d, this.e, this.f, this.g, this.h, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public final void m6(oad0 oad0Var, gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1053597615);
        if ((i & 6) == 0) {
            i2 = (M.J(oad0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1053597615, i2, -1, "com.vk.ecomm.market.goodpreview.presentation.viewholder.GoodPreviewButtonsItemRefactoredViewHolder.PrimaryButton (GoodPreviewButtonsItemRefactoredViewHolder.kt:203)");
            }
            aVar2 = M;
            bhu0.e(gzsVar, ButtonSize.Medium, ButtonStyle.Primary, ButtonAppearance.Accent, q630Var, null, false, false, null, null, null, oad0Var.a, null, null, null, null, false, null, null, null, aVar2, ((i2 >> 3) & 14) | X2.b.f | ((i2 << 6) & 57344), 0, 0, 4190176);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new u5u(this, oad0Var, gzsVar, q630Var, i);
        }
    }

    public final void o6(a1i0 a1i0Var, gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1213283019);
        if ((i & 6) == 0) {
            i2 = (M.J(a1i0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1213283019, i2, -1, "com.vk.ecomm.market.goodpreview.presentation.viewholder.GoodPreviewButtonsItemRefactoredViewHolder.SecondaryButton (GoodPreviewButtonsItemRefactoredViewHolder.kt:220)");
            }
            aVar2 = M;
            bhu0.e(gzsVar, ButtonSize.Medium, ButtonStyle.Secondary, ButtonAppearance.Accent, q630Var, null, false, false, null, null, null, a1i0Var.a, null, null, null, null, false, null, null, null, aVar2, ((i2 >> 3) & 14) | X2.b.f | ((i2 << 6) & 57344), 0, 0, 4190176);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new n48(this, a1i0Var, gzsVar, q630Var, i);
        }
    }

    public final void q6(final r3d0 r3d0Var, final gzs<s3q0> gzsVar, final gzs<s3q0> gzsVar2, final gzs<s3q0> gzsVar3, final gzs<s3q0> gzsVar4, androidx.compose.runtime.a aVar, final int i) {
        Object obj;
        Object obj2;
        androidx.compose.runtime.a M = aVar.M(-1664489906);
        int i2 = (M.J(r3d0Var) ? 4 : 2) | i | (M.y(gzsVar) ? 32 : 16);
        if ((i & 384) == 0) {
            obj = gzsVar2;
            i2 |= M.y(obj) ? 256 : 128;
        } else {
            obj = gzsVar2;
        }
        if ((i & 3072) == 0) {
            obj2 = gzsVar3;
            i2 |= M.y(obj2) ? 2048 : 1024;
        } else {
            obj2 = gzsVar3;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(gzsVar4) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.y(this) ? 131072 : 65536;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (74899 & i3) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1664489906, i3, -1, "com.vk.ecomm.market.goodpreview.presentation.viewholder.GoodPreviewButtonsItemRefactoredViewHolder.SingleButtonContent (GoodPreviewButtonsItemRefactoredViewHolder.kt:130)");
            }
            s6(((i3 >> 6) & 896) | 3078 | ((i3 >> 3) & 57344), M, kai.c(1382238366, new y5u(r3d0Var, this, gzsVar, obj, obj2, 0), M), gzsVar4, txj0.f(q630.a.a, 1.0f), r3d0Var.d);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.r5u
                @Override // xsna.wzs
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    z5u.this.q6(r3d0Var, gzsVar, gzsVar2, gzsVar3, gzsVar4, (androidx.compose.runtime.a) obj3, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void s6(final int i, androidx.compose.runtime.a aVar, final jai jaiVar, final gzs gzsVar, final q630 q630Var, final boolean z) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1957632848);
        if ((i & 6) == 0) {
            i2 = (M.y(jaiVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(gzsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(q630Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(this) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1957632848, i2, -1, "com.vk.ecomm.market.goodpreview.presentation.viewholder.GoodPreviewButtonsItemRefactoredViewHolder.SlotWithBookmark (GoodPreviewButtonsItemRefactoredViewHolder.kt:274)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            jaiVar.invoke(new xpy(1.0f, true), M, Integer.valueOf((i2 << 3) & 112));
            f9t.e(txj0.v(q630.a.a, 12), M, 6);
            h6(z, gzsVar, M, ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i2 >> 6) & 896));
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.t5u
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    z5u.this.s6(I, (androidx.compose.runtime.a) obj, jaiVar, gzsVar, q630Var, z);
                    return s3q0.a;
                }
            };
        }
    }
}
