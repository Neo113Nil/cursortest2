package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.coauthors.list.common.mvi.entity.viewstate.ClipCoauthorListVS;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.cri;
import xsna.d16;
import xsna.dt1;
import xsna.kpv;
import xsna.phw;
import xsna.q630;
import xsna.xpv;

/* compiled from: ClipsCoauthorsListContent.kt */
/* loaded from: classes16.dex */
public final class pmd {

    /* compiled from: ClipsCoauthorsListContent.kt */
    @b6l(c = "com.vk.clips.coauthors.list.common.mvi.ClipsCoauthorsListContentKt$Onboarding$1$1", f = "ClipsCoauthorsListContent.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ gzs<s3q0> $onShown;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gzs<s3q0> gzsVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$onShown = gzsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$onShown, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            this.$onShown.invoke();
            return s3q0.a;
        }
    }

    /* compiled from: ClipsCoauthorsListContent.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipCoauthorListVS.Owner.Type.values().length];
            try {
                iArr[ClipCoauthorListVS.Owner.Type.Male.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipCoauthorListVS.Owner.Type.Female.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipCoauthorListVS.Owner.Type.Community.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(ClipCoauthorListVS clipCoauthorListVS, boolean z, izs<? super coc, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        boolean z2;
        androidx.compose.runtime.a M = aVar.M(-318185955);
        int i2 = (M.J(clipCoauthorListVS) ? 4 : 2) | i | (M.l(z) ? 32 : 16) | (M.y(izsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-318185955, i2, -1, "com.vk.clips.coauthors.list.common.mvi.ClipsCoauthorsListContent (ClipsCoauthorsListContent.kt:58)");
            }
            z2 = z;
            rrv0.e(z2, null, null, null, null, null, kai.c(1820928858, new gx(izsVar, clipCoauthorListVS), M), M, ((i2 >> 3) & 14) | 1572864, 62);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            z2 = z;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new lmd(clipCoauthorListVS, z2, izsVar, i);
        }
    }

    public static final void b(final boolean z, final gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, final int i) {
        com.vk.core.compose.component.cell.content.u0 u0Var;
        androidx.compose.runtime.a M = aVar.M(1285155332);
        int i2 = (M.l(z) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1285155332, i2, -1, "com.vk.clips.coauthors.list.common.mvi.EditCell (ClipsCoauthorsListContent.kt:247)");
            }
            q630 c = ojc.c(txj0.j(60, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630.a.a), false, null, null, gzsVar, 15);
            qzu0.a.getClass();
            lg90 X0 = qzu0.X0(M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            com.vk.core.compose.component.cell.content.t a2 = com.vk.core.compose.component.cell.content.e.a(xpv.a.a(X0, ylu0Var.getIcon().b, null, M, 24584, 12), Cell$Left.Main.Size.Medium, null, null, null, null, null, M, 100663344, 252);
            com.vk.core.compose.component.cell.content.h1 a3 = Cell$Middle.d.b.a(z ? zq.a(M, 724597747, R.string.clips_coauthors_bs_edit_coauthors_redesign, M, 0) : zq.a(M, 724709564, R.string.clips_coauthors_bs_edit_coauthors, M, 0), null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            androidx.compose.runtime.a aVar2 = M;
            com.vk.core.compose.component.cell.content.k0 a4 = Cell$Middle.a.a(a3, null, null, null, aVar2, 196608, 30);
            if (z) {
                aVar2.K(724873554);
                u0Var = o.b.a.a(null, null, 0L, false, aVar2, 196608, 31);
                aVar2 = aVar2;
                aVar2.j();
            } else {
                aVar2.K(724922658);
                aVar2.j();
                u0Var = null;
            }
            androidx.compose.runtime.a aVar3 = aVar2;
            wiu0.b(c, false, a2, a4, u0Var, null, null, aVar3, 0, 98);
            M = aVar3;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.omd
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    pmd.b(z, gzsVar, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x039c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final boolean z, final ArrayList arrayList, final izs izsVar, final izs izsVar2, final gzs gzsVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        int i2;
        a.C0011a.C0012a c0012a;
        SemanticsConfiguration.Mode mode;
        iy5 iy5Var;
        int i3;
        int i4;
        int i5;
        String a2;
        androidx.compose.runtime.a aVar3;
        ClipCoauthorListVS.Owner owner;
        int i6;
        com.vk.core.compose.component.cell.content.y0 y0Var;
        int i7;
        Object x;
        Object x2;
        int i8;
        int i9;
        String str;
        int i10;
        int i11;
        ArrayList arrayList2 = arrayList;
        androidx.compose.runtime.a M = aVar.M(-904266840);
        char c = 256;
        int i12 = i | (M.l(z) ? 4 : 2) | (M.J(arrayList2) ? 32 : 16) | (M.y(izsVar) ? 256 : 128) | (M.y(izsVar2) ? 2048 : 1024) | (M.y(gzsVar) ? 16384 : 8192);
        int i13 = 0;
        if (M.t(i12 & 1, (i12 & 9363) != 9362)) {
            int i14 = -1;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-904266840, i12, -1, "com.vk.clips.coauthors.list.common.mvi.ItemsList (ClipsCoauthorsListContent.kt:137)");
            }
            u890 n = s200.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16, 5);
            q630.a aVar4 = q630.a.a;
            q630 E = ahn.E(s200.C(aVar4, n), "ClipsCoauthorsItemsList");
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, E);
            cri.h7.getClass();
            LayoutNode.a aVar5 = cri.a.b;
            int i15 = i12;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            k9q0.w(M, a3, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            M.K(1846789654);
            int size = arrayList2.size();
            int i16 = 0;
            while (i16 < size) {
                ClipCoauthorListVS.Owner owner2 = (ClipCoauthorListVS.Owner) arrayList2.get(i16);
                UserId userId = owner2.a;
                ClipCoauthorListVS.Owner.a aVar6 = owner2.d;
                M.W(730493906, userId);
                int i17 = (!owner2.e || gzsVar == null) ? i13 : 1;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1735599350, i13, i14, "com.vk.clips.coauthors.list.common.mvi.itemLeft (ClipsCoauthorsListContent.kt:220)");
                }
                q630.a aVar7 = aVar4;
                androidx.compose.runtime.a aVar8 = M;
                int i18 = i13;
                int i19 = i14;
                int i20 = i16;
                int i21 = i15;
                phw a4 = phw.a.a(fwu0.l(null, owner2.c, null, null, aVar8, 0, 61), null, null, null, null, aVar8, 196616, 30);
                androidx.compose.runtime.a aVar9 = aVar8;
                a.C0011a.C0012a c0012a2 = a.C0011a.a;
                if (i17 != 0) {
                    aVar9.K(1871345922);
                    String N = d370.N(R.string.clips_coauthors_viewers_bottom_sheet_main_coauthor_accessibility_description, i18, aVar9);
                    qzu0.a.getClass();
                    lg90 t1 = qzu0.t1(aVar9);
                    long j = l5g.k;
                    boolean J = aVar9.J(N);
                    Object x3 = aVar9.x();
                    if (J || x3 == c0012a2) {
                        x3 = new ux9(N, 1);
                        aVar9.R(x3);
                    }
                    i2 = size;
                    mode = null;
                    c0012a = c0012a2;
                    iy5Var = kpv.a.a(t1, j, 0L, null, false, com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3), null, aVar9, 100663352, 188);
                    aVar9 = aVar9;
                    aVar9.j();
                } else {
                    i2 = size;
                    c0012a = c0012a2;
                    mode = null;
                    aVar9.K(1871804598);
                    aVar9.j();
                    iy5Var = rep.a;
                }
                androidx.compose.runtime.a aVar10 = aVar9;
                com.vk.core.compose.component.cell.content.t a5 = com.vk.core.compose.component.cell.content.e.a(a4, Cell$Left.Main.Size.Medium, iy5Var, null, null, null, null, aVar10, 100663344, 248);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                String str2 = owner2.b;
                boolean y = aVar10.y(owner2);
                Object x4 = aVar10.x();
                if (y || x4 == c0012a) {
                    x4 = new r6(owner2, 21);
                    aVar10.R(x4);
                }
                com.vk.core.compose.component.cell.content.h1 a6 = Cell$Middle.d.b.a(str2, null, null, 1, com.vk.core.compose.component.semantics.b.a(mode, (izs) x4, 3), null, aVar10, 12610560, 70);
                int i22 = b.$EnumSwitchMapping$0[owner2.h.ordinal()];
                if (i22 == 1) {
                    i3 = 0;
                    i4 = 730517755;
                    i5 = R.string.clips_coauthors_bs_user_pending_male;
                } else if (i22 == 2) {
                    i3 = 0;
                    i4 = 730522045;
                    i5 = R.string.clips_coauthors_bs_user_pending_female;
                } else {
                    if (i22 != 3) {
                        throw alb0.c(730515605, aVar10);
                    }
                    aVar10.K(730526735);
                    if (z) {
                        i10 = 1171511868;
                        i11 = R.string.clips_coauthors_bs_user_pending_channel;
                        i3 = 0;
                    } else {
                        i3 = 0;
                        i10 = 1171652794;
                        i11 = R.string.clips_coauthors_bs_user_pending_community;
                    }
                    a2 = zq.a(aVar10, i10, i11, aVar10, i3);
                    aVar10.j();
                    int i23 = i3;
                    aVar3 = aVar10;
                    com.vk.core.compose.component.cell.content.k0 a7 = Cell$Middle.a.a(a6, owner2.g ? Cell$Middle.c.b.b(a2, 0, null, null, null, aVar10, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) : null, null, null, aVar3, 196608, 28);
                    if (aVar6 instanceof ClipCoauthorListVS.Owner.a.b) {
                        owner = owner2;
                        i6 = i21;
                        aVar3.K(1173348432);
                        aVar3.j();
                        y0Var = null;
                    } else {
                        aVar3.K(1172039674);
                        ClipCoauthorListVS.Owner.a.b bVar = (ClipCoauthorListVS.Owner.a.b) aVar6;
                        if (bVar.a) {
                            i8 = 1172174524;
                            i9 = R.string.clips_coauthors_bs_user_subscribed;
                        } else {
                            i8 = 1172315512;
                            i9 = R.string.clips_coauthors_bs_user_not_subscribed;
                        }
                        String a8 = zq.a(aVar3, i8, i9, aVar3, i23);
                        boolean z2 = bVar.a;
                        ButtonStyle buttonStyle = z2 ? ButtonStyle.Secondary : ButtonStyle.Primary;
                        boolean z3 = bVar.b;
                        if (z2) {
                            str = zq.a(aVar3, 1172872365, R.string.clips_coauthors_bs_user_unsubscribe_accessibility, aVar3, i23);
                        } else {
                            aVar3.K(1173023551);
                            aVar3.j();
                            str = null;
                        }
                        boolean y2 = aVar3.y(owner2);
                        Object x5 = aVar3.x();
                        if (y2 || x5 == c0012a) {
                            x5 = new s6(owner2, 18);
                            aVar3.R(x5);
                        }
                        com.vk.core.compose.component.semantics.a a9 = com.vk.core.compose.component.semantics.b.a(null, (izs) x5, 3);
                        int i24 = ((i21 & 7168) == 2048 ? 1 : i23) | (aVar3.y(owner2) ? 1 : 0);
                        Object x6 = aVar3.x();
                        if (i24 != 0 || x6 == c0012a) {
                            x6 = new qg1(6, izsVar2, owner2);
                            aVar3.R(x6);
                        }
                        owner = owner2;
                        i6 = i21;
                        y0Var = o.c.a(com.vk.core.compose.component.cell.content.k.a(buttonStyle, null, null, a8, null, null, null, z3, str, a9, (gzs) x6, aVar3, 0, 1572864, 6134), null, null, null, null, aVar3, 62);
                        aVar3 = aVar3;
                        aVar3.j();
                    }
                    String N2 = d370.N(R.string.clips_coauthors_bottom_sheet_goto_author_accessibility_click_label, i23, aVar3);
                    int i25 = i6;
                    ClipCoauthorListVS.Owner owner3 = owner;
                    i7 = ((i25 & 896) != 256 ? 1 : i23) | (aVar3.y(owner3) ? 1 : 0);
                    x = aVar3.x();
                    if (i7 == 0 || x == c0012a) {
                        x = new com.vk.movika.sdk.base.ui.z(1, izsVar, owner3);
                        aVar3.R(x);
                    }
                    q630 c3 = ojc.c(aVar7, false, N2, null, (gzs) x, 13);
                    x2 = aVar3.x();
                    if (x2 != c0012a) {
                        x2 = new ci7(12);
                        aVar3.R(x2);
                    }
                    androidx.compose.runtime.a aVar11 = aVar3;
                    wiu0.b(egi0.b(c3, true, (izs) x2), false, a5, a7, y0Var, null, null, aVar11, 0, 98);
                    aVar11.a0();
                    i16 = i20 + 1;
                    size = i2;
                    i13 = i23;
                    M = aVar11;
                    c = 256;
                    aVar4 = aVar7;
                    i14 = i19;
                    i15 = i25;
                    arrayList2 = arrayList;
                }
                a2 = zq.a(aVar10, i4, i5, aVar10, i3);
                int i232 = i3;
                aVar3 = aVar10;
                com.vk.core.compose.component.cell.content.k0 a72 = Cell$Middle.a.a(a6, owner2.g ? Cell$Middle.c.b.b(a2, 0, null, null, null, aVar10, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) : null, null, null, aVar3, 196608, 28);
                if (aVar6 instanceof ClipCoauthorListVS.Owner.a.b) {
                }
                String N22 = d370.N(R.string.clips_coauthors_bottom_sheet_goto_author_accessibility_click_label, i232, aVar3);
                int i252 = i6;
                ClipCoauthorListVS.Owner owner32 = owner;
                i7 = ((i252 & 896) != 256 ? 1 : i232) | (aVar3.y(owner32) ? 1 : 0);
                x = aVar3.x();
                if (i7 == 0) {
                }
                x = new com.vk.movika.sdk.base.ui.z(1, izsVar, owner32);
                aVar3.R(x);
                q630 c32 = ojc.c(aVar7, false, N22, null, (gzs) x, 13);
                x2 = aVar3.x();
                if (x2 != c0012a) {
                }
                androidx.compose.runtime.a aVar112 = aVar3;
                wiu0.b(egi0.b(c32, true, (izs) x2), false, a5, a72, y0Var, null, null, aVar112, 0, 98);
                aVar112.a0();
                i16 = i20 + 1;
                size = i2;
                i13 = i232;
                M = aVar112;
                c = 256;
                aVar4 = aVar7;
                i14 = i19;
                i15 = i252;
                arrayList2 = arrayList;
            }
            aVar2 = M;
            int i26 = i15;
            aVar2.j();
            if (gzsVar != null) {
                aVar2.K(1419372925);
                aVar2.W(1846901965, null);
                b(z, gzsVar, aVar2, (i26 & 14) | ((i26 >> 9) & 112));
                aVar2.a0();
            } else {
                aVar2.K(1410113380);
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
            s.d = new wzs(z, arrayList, izsVar, izsVar2, gzsVar, i) { // from class: xsna.nmd
                public final /* synthetic */ boolean b;
                public final /* synthetic */ ArrayList c;
                public final /* synthetic */ izs d;
                public final /* synthetic */ izs e;
                public final /* synthetic */ gzs f;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    pmd.c(this.b, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(String str, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(698990554);
        int i2 = (M.J(str) ? 4 : 2) | i | (M.y(gzsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(698990554, i2, -1, "com.vk.clips.coauthors.list.common.mvi.Onboarding (ClipsCoauthorsListContent.kt:105)");
            }
            if (str != null) {
                M.K(1626268448);
                float f = 12;
                float f2 = 8;
                q630 H = s200.H(q630.a.a, f, f2, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                y18 a2 = aqw.a(0.5f, ylu0Var.getImage().a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-484701964, 0, -1, "com.vk.core.compose.component.defaults.VkBannerDefaults.shape (VkBannerDefaults.kt:19)");
                }
                uog0 b2 = vog0.b(f2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                beu0.a(d16.b.a(null, null, d16.c.b.a.a(str, null, M, (i2 & 14) | 384, 2), null, null, null, null, null, M, 100663296, 250), r18.b(a2.a, a2.b, H, b2), null, null, null, null, null, null, null, null, null, null, M, 0, 0, 4092);
                M = M;
                s3q0 s3q0Var = s3q0.a;
                boolean z = (i2 & 112) == 32;
                Object x = M.x();
                if (z || x == a.C0011a.a) {
                    x = new a(gzsVar, null);
                    M.R(x);
                }
                bap.g(s3q0Var, (wzs) x, M, 6);
            } else {
                M.K(1621706984);
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
            s.d = new ud6(str, gzsVar, i, 2);
        }
    }
}
