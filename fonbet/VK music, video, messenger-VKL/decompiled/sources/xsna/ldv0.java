package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.PlaceholderMode;
import com.vk.core.compose.component.defaults.PlaceholderSize;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabase;
import ru.ok.gl.tf.Tensorflow;
import xsna.bsa0;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;
import xsna.wra0;
import xsna.zra0;

/* compiled from: VkPlaceholder.kt */
/* loaded from: classes17.dex */
public final class ldv0 {

    /* compiled from: VkPlaceholder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PlaceholderMode.values().length];
            try {
                iArr[PlaceholderMode.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PlaceholderSize.values().length];
            try {
                iArr2[PlaceholderSize.Large.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final void a(final q630 q630Var, final bsa0 bsa0Var, final zra0 zra0Var, final wra0 wra0Var, final boolean z, final PlaceholderMode placeholderMode, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1907795981);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(bsa0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(zra0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(wra0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.l(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.o(placeholderMode == null ? -1 : placeholderMode.ordinal()) ? 131072 : 65536;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (74899 & i3) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1907795981, i3, -1, "com.vk.core.compose.component.placeholder.MilkshakePlaceholder (VkPlaceholder.kt:148)");
            }
            q630 z2 = txj0.z(txj0.f(q630Var, 1.0f), null, 3);
            q630.a aVar2 = q630.a.a;
            if (z) {
                z2 = z2.g(s200.E(aVar2, 32, 48));
            }
            dt1.a.getClass();
            ty6.a aVar3 = dt1.a.o;
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, aVar3, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, z2);
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
            if (bsa0Var == null) {
                M.K(1057570529);
            } else {
                M.K(1835230496);
                bsa0.a.a(placeholderMode, bsa0Var, M, ((i3 >> 12) & 112) | 6 | ((i3 << 3) & 896));
            }
            M.j();
            if (bsa0Var == null || zra0Var == null) {
                M.K(1052114251);
                M.j();
            } else {
                M.K(1057656183);
                ck70.b(aVar2, kqu0.v, M, 0);
            }
            if (zra0Var == null) {
                M.K(1057756343);
            } else {
                M.K(1835236490);
                zra0.b.a(aVar3, placeholderMode, null, zra0Var, M, ((i3 >> 9) & 896) | 54 | ((i3 << 6) & 57344), 8);
            }
            M.j();
            if (wra0Var == null || zra0Var == null) {
                M.K(1052114251);
                M.j();
            } else {
                M.K(1057885366);
                ck70.b(aVar2, kqu0.w, M, 0);
            }
            if (wra0Var == null) {
                M.K(1057985185);
            } else {
                M.K(1835243872);
                wra0.c.a(aVar2, placeholderMode, null, wra0Var, M, ((i3 >> 12) & 112) | 6 | (i3 & 7168), 4);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.idv0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ldv0.a(q630.this, bsa0Var, zra0Var, wra0Var, z, placeholderMode, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(q630 q630Var, boolean z, PlaceholderMode placeholderMode, final gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        q630 q630Var2;
        int i3;
        gzs<s3q0> gzsVar2;
        final PlaceholderMode placeholderMode2;
        final q630 q630Var3;
        final boolean z2;
        lg90 a2;
        androidx.compose.runtime.a M = aVar.M(-88402626);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            q630Var2 = q630Var;
        } else if ((i & 6) == 0) {
            q630Var2 = q630Var;
            i3 = (M.J(q630Var2) ? 4 : 2) | i;
        } else {
            q630Var2 = q630Var;
            i3 = i;
        }
        int i5 = i3 | Tensorflow.FRAME_WIDTH;
        if ((i & 3072) == 0) {
            gzsVar2 = gzsVar;
            i5 |= M.y(gzsVar2) ? 2048 : 1024;
        } else {
            gzsVar2 = gzsVar;
        }
        if (M.t(i5 & 1, (i5 & 1171) != 1170)) {
            q630 q630Var4 = i4 != 0 ? q630.a.a : q630Var2;
            PlaceholderMode placeholderMode3 = PlaceholderMode.Primary;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-88402626, i5, -1, "com.vk.core.compose.component.placeholder.NoNetworkPlaceholder (VkPlaceholder.kt:184)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (ylu0Var.s()) {
                M.K(-787262913);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1159337732, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-IllustrationAntennaLight56> (VkSdkIcons.kt:1088)");
                }
                a2 = pg90.a(R.drawable.vk_icon_illustration_antenna_light_56, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            } else {
                M.K(-787188544);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1060812596, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-IllustrationAntennaDark56> (VkSdkIcons.kt:1084)");
                }
                a2 = pg90.a(R.drawable.vk_icon_illustration_antenna_dark_56, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            }
            t8p0 a3 = csa0.a(a2, 0L, 0L, null, null, M, 199688, 22);
            vl20 a4 = zra0.a.a(d370.N(R.string.vk_placeholder_no_network_title, 0, M), null, d370.N(R.string.vk_placeholder_no_network_subtitle, 0, M), null, M, 196608, 26);
            r48 a5 = wra0.a.C3954a.a(d370.N(R.string.vk_placeholder_no_network_retry_action, 0, M), gzsVar2, null, ButtonStyle.Tertiary, null, false, null, null, null, null, null, null, false, false, null, null, M, ((i5 >> 6) & 112) | 3072, 12582912, 131060);
            M = M;
            q630 q630Var5 = q630Var4;
            d(q630Var5, a3, a4, wra0.b.a(a5, null, null, M, 14), placeholderMode3, null, true, M, (i5 & 14) | (57344 & (i5 << 6)) | ((i5 << 15) & 3670016), 32);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var3 = q630Var5;
            placeholderMode2 = placeholderMode3;
            z2 = true;
        } else {
            M.h();
            placeholderMode2 = placeholderMode;
            q630Var3 = q630Var2;
            z2 = z;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.kdv0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ldv0.b(q630.this, z2, placeholderMode2, gzsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(q630 q630Var, bsa0 bsa0Var, PlaceholderMode placeholderMode, PlaceholderSize placeholderSize, final zra0 zra0Var, wra0 wra0Var, final boolean z, boolean z2, boolean z3, wzs wzsVar, wzs wzsVar2, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        bsa0 bsa0Var2;
        int i4;
        int i5;
        int i6;
        wra0 wra0Var2;
        int i7;
        wzs wzsVar3;
        int i8;
        int i9;
        int i10;
        final q630 q630Var2;
        final PlaceholderMode placeholderMode2;
        final boolean z4;
        final wzs wzsVar4;
        androidx.compose.runtime.a aVar2;
        final bsa0 bsa0Var3;
        final wra0 wra0Var3;
        final PlaceholderSize placeholderSize2;
        final wzs wzsVar5;
        final boolean z5;
        androidx.compose.runtime.f s;
        ty6.a aVar3;
        PlaceholderMode placeholderMode3;
        PlaceholderSize placeholderSize3;
        ty6.a aVar4;
        q630.a aVar5;
        PlaceholderSize placeholderSize4;
        PlaceholderSize placeholderSize5;
        q630 q630Var3;
        float f;
        int i11;
        boolean z6;
        PlaceholderMode placeholderMode4;
        wzs wzsVar6;
        androidx.compose.runtime.a M = aVar.M(-1242492919);
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            bsa0Var2 = bsa0Var;
            i3 |= M.J(bsa0Var2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= M.o(placeholderMode == null ? -1 : placeholderMode.ordinal()) ? 256 : 128;
            }
            i5 = i2 & 8;
            if (i5 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= M.o(placeholderSize == null ? -1 : placeholderSize.ordinal()) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                i3 |= M.J(zra0Var) ? 16384 : 8192;
            }
            i6 = i2 & 32;
            if (i6 == 0) {
                i3 |= 196608;
                wra0Var2 = wra0Var;
            } else {
                wra0Var2 = wra0Var;
                if ((i & 196608) == 0) {
                    i3 |= M.J(wra0Var2) ? 131072 : 65536;
                }
            }
            if ((i & 1572864) == 0) {
                i3 |= M.l(z) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            }
            int i14 = i3 | 113246208;
            i7 = i2 & 512;
            if (i7 == 0) {
                i14 = i3 | 918552576;
            } else if ((805306368 & i) == 0) {
                wzsVar3 = wzsVar;
                i14 |= M.y(wzsVar3) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                i8 = i14;
                i9 = i2 & 1024;
                if (i9 != 0) {
                    i10 = 6;
                } else {
                    i10 = M.y(wzsVar2) ? 4 : 2;
                }
                if (M.t(i8 & 1, (i8 & 306783379) == 306783378 || (i10 & 3) != 2)) {
                    q630.a aVar6 = q630.a.a;
                    q630 q630Var4 = i12 != 0 ? aVar6 : q630Var;
                    if (i13 != 0) {
                        bsa0Var2 = null;
                    }
                    PlaceholderMode placeholderMode5 = i4 != 0 ? PlaceholderMode.Neutral : placeholderMode;
                    PlaceholderSize placeholderSize6 = i5 != 0 ? PlaceholderSize.Large : placeholderSize;
                    wra0 wra0Var4 = i6 != 0 ? null : wra0Var2;
                    if (i7 != 0) {
                        wzsVar3 = null;
                    }
                    wzs wzsVar7 = i9 != 0 ? null : wzsVar2;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1242492919, i8, i10, "com.vk.core.compose.component.placeholder.VkPlaceholder (VkPlaceholder.kt:91)");
                    }
                    PlaceholderMode placeholderMode6 = a.$EnumSwitchMapping$0[placeholderMode5.ordinal()] == 1 ? PlaceholderMode.Neutral : placeholderMode5;
                    if (a.$EnumSwitchMapping$1[placeholderSize6.ordinal()] == 1) {
                        dt1.a.getClass();
                        aVar3 = z ? dt1.a.o : dt1.a.n;
                    } else {
                        dt1.a.getClass();
                        aVar3 = dt1.a.o;
                    }
                    ty6.a aVar7 = aVar3;
                    q630 q630Var5 = q630Var4;
                    q630 z7 = txj0.z(txj0.f(q630Var4, 1.0f), null, 3);
                    float f2 = kqu0.w;
                    int i15 = i10;
                    q630 g = z7.g(s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar6)).g(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 1, aVar6));
                    int i16 = (i8 >> 9) & 14;
                    sdy.m().getClass();
                    M.K(928323741);
                    if (androidx.compose.runtime.b.d()) {
                        placeholderMode3 = placeholderMode5;
                        androidx.compose.runtime.b.f(928323741, i16, -1, "com.vk.core.compose.component.defaults.milkshake.MilkShakePlaceholderDefaults.verticalArrangement (MilkShakePlaceholderDefaults.kt:46)");
                    } else {
                        placeholderMode3 = placeholderMode5;
                    }
                    a.l lVar = androidx.compose.foundation.layout.a.a;
                    float f3 = kqu0.v;
                    a.j g2 = androidx.compose.foundation.layout.a.g(f3);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(g2, aVar7, M, 0);
                    int hashCode = Long.hashCode(n34.n(M));
                    sy90 D = M.D();
                    q630 c = qri.c(M, g);
                    cri.h7.getClass();
                    LayoutNode.a aVar8 = cri.a.b;
                    if (M.N() == null) {
                        n34.r();
                        throw null;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar8);
                    } else {
                        M.f();
                    }
                    cri.a.c cVar = cri.a.f;
                    k9q0.w(M, a2, cVar);
                    cri.a.e eVar = cri.a.e;
                    k9q0.w(M, D, eVar);
                    Integer valueOf = Integer.valueOf(hashCode);
                    cri.a.b bVar = cri.a.g;
                    k9q0.w(M, valueOf, bVar);
                    cri.a.C2678a c2678a = cri.a.h;
                    k9q0.t(M, c2678a);
                    wzs wzsVar8 = wzsVar7;
                    cri.a.d dVar = cri.a.d;
                    k9q0.w(M, c, dVar);
                    PlaceholderSize placeholderSize7 = PlaceholderSize.Large;
                    if (placeholderSize6 != placeholderSize7 || wzsVar3 == null) {
                        M.K(-1688939709);
                    } else {
                        M.K(-1684810974);
                        wzsVar3.invoke(M, Integer.valueOf((i8 >> 27) & 14));
                    }
                    M.j();
                    wzs wzsVar9 = wzsVar3;
                    q630 f4 = txj0.f(aVar6, 1.0f);
                    sdy.m().getClass();
                    M.K(1166520793);
                    if (androidx.compose.runtime.b.d()) {
                        placeholderSize3 = placeholderSize7;
                        androidx.compose.runtime.b.f(1166520793, i16, -1, "com.vk.core.compose.component.defaults.milkshake.MilkShakePlaceholderDefaults.gapTopMiddle (MilkShakePlaceholderDefaults.kt:51)");
                    } else {
                        placeholderSize3 = placeholderSize7;
                    }
                    a.j g3 = androidx.compose.foundation.layout.a.g(f3);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(g3, aVar7, M, 0);
                    int hashCode2 = Long.hashCode(n34.n(M));
                    sy90 D2 = M.D();
                    q630 c2 = qri.c(M, f4);
                    if (M.N() == null) {
                        n34.r();
                        throw null;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar8);
                    } else {
                        M.f();
                    }
                    k9q0.w(M, a3, cVar);
                    k9q0.w(M, D2, eVar);
                    ur.d(hashCode2, M, bVar, M, c2678a);
                    k9q0.w(M, c2, dVar);
                    if (bsa0Var2 == null) {
                        M.K(1388545155);
                        M.j();
                    } else {
                        M.K(-1202134210);
                        bsa0.a.a(placeholderMode6, bsa0Var2, M, ((i8 << 3) & 896) | 6);
                        M.j();
                        s3q0 s3q0Var = s3q0.a;
                    }
                    if (zra0Var == null) {
                        M.K(1388612363);
                        M.j();
                        aVar5 = aVar6;
                        placeholderSize4 = placeholderSize3;
                        placeholderMode4 = placeholderMode6;
                        placeholderSize5 = placeholderSize6;
                        q630Var3 = q630Var5;
                        f = 1.0f;
                        i11 = -1688939709;
                        z6 = true;
                    } else {
                        M.K(-1202132042);
                        PlaceholderSize placeholderSize8 = placeholderSize3;
                        if (placeholderSize6 == placeholderSize8) {
                            aVar4 = aVar7;
                        } else {
                            dt1.a.getClass();
                            aVar4 = dt1.a.o;
                        }
                        aVar5 = aVar6;
                        placeholderSize4 = placeholderSize8;
                        ty6.a aVar9 = aVar4;
                        PlaceholderMode placeholderMode7 = placeholderMode6;
                        placeholderSize5 = placeholderSize6;
                        q630Var3 = q630Var5;
                        f = 1.0f;
                        i11 = -1688939709;
                        z6 = true;
                        zra0.b.a(aVar9, placeholderMode7, placeholderSize5, zra0Var, M, (i8 & 7168) | 6 | (57344 & i8), 0);
                        placeholderMode4 = placeholderMode7;
                        M.j();
                        s3q0 s3q0Var2 = s3q0.a;
                    }
                    M.G();
                    if (placeholderSize5 != placeholderSize4 || wzsVar8 == null) {
                        wzsVar6 = wzsVar8;
                        M.K(i11);
                    } else {
                        M.K(-1684204769);
                        wzsVar6 = wzsVar8;
                        wzsVar6.invoke(M, Integer.valueOf(i15 & 14));
                    }
                    M.j();
                    if (placeholderSize5 != PlaceholderSize.Small) {
                        M.K(1192599438);
                        if (wra0Var4 == null) {
                            M.K(-1684102253);
                            M.j();
                        } else {
                            M.K(1192600110);
                            wra0.c.a(txj0.f(aVar5, f), placeholderMode4, aVar7, wra0Var4, M, ((i8 >> 6) & 7168) | 6, 0);
                            M.j();
                            s3q0 s3q0Var3 = s3q0.a;
                        }
                    } else {
                        M.K(i11);
                    }
                    M.j();
                    M.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    placeholderMode2 = placeholderMode3;
                    wzsVar4 = wzsVar6;
                    aVar2 = M;
                    q630Var2 = q630Var3;
                    z5 = z6;
                    z4 = z5;
                    wra0Var3 = wra0Var4;
                    placeholderSize2 = placeholderSize5;
                    bsa0Var3 = bsa0Var2;
                    wzsVar5 = wzsVar9;
                } else {
                    M.h();
                    q630Var2 = q630Var;
                    placeholderMode2 = placeholderMode;
                    z4 = z3;
                    wzsVar4 = wzsVar2;
                    aVar2 = M;
                    bsa0Var3 = bsa0Var2;
                    wra0Var3 = wra0Var2;
                    placeholderSize2 = placeholderSize;
                    wzsVar5 = wzsVar3;
                    z5 = z2;
                }
                s = aVar2.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.jdv0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ldv0.c(q630.this, bsa0Var3, placeholderMode2, placeholderSize2, zra0Var, wra0Var3, z, z5, z4, wzsVar5, wzsVar4, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            wzsVar3 = wzsVar;
            i8 = i14;
            i9 = i2 & 1024;
            if (i9 != 0) {
            }
            if (M.t(i8 & 1, (i8 & 306783379) == 306783378 || (i10 & 3) != 2)) {
            }
            s = aVar2.s();
            if (s != null) {
            }
        }
        bsa0Var2 = bsa0Var;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        int i142 = i3 | 113246208;
        i7 = i2 & 512;
        if (i7 == 0) {
        }
        wzsVar3 = wzsVar;
        i8 = i142;
        i9 = i2 & 1024;
        if (i9 != 0) {
        }
        if (M.t(i8 & 1, (i8 & 306783379) == 306783378 || (i10 & 3) != 2)) {
        }
        s = aVar2.s();
        if (s != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(q630 q630Var, bsa0 bsa0Var, zra0 zra0Var, wra0 wra0Var, PlaceholderMode placeholderMode, PlaceholderSize placeholderSize, boolean z, androidx.compose.runtime.a aVar, int i, int i2) {
        q630 q630Var2;
        int i3;
        bsa0 bsa0Var2;
        int i4;
        wra0 wra0Var2;
        int i5;
        int i6;
        int i7;
        PlaceholderSize placeholderSize2;
        q630 q630Var3;
        bsa0 bsa0Var3;
        wra0 wra0Var3;
        PlaceholderMode placeholderMode2;
        boolean z2;
        androidx.compose.runtime.f s;
        int i8;
        q630 q630Var4;
        int i9;
        wra0 wra0Var4;
        androidx.compose.runtime.a M = aVar.M(-1555624705);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
            q630Var2 = q630Var;
        } else if ((i & 6) == 0) {
            q630Var2 = q630Var;
            i3 = (M.J(q630Var2) ? 4 : 2) | i;
        } else {
            q630Var2 = q630Var;
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            bsa0Var2 = bsa0Var;
            i3 |= M.J(bsa0Var2) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= M.J(zra0Var) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                wra0Var2 = wra0Var;
                i3 |= M.J(wra0Var2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= M.o(placeholderMode == null ? -1 : placeholderMode.ordinal()) ? 16384 : 8192;
                }
                i6 = i2 & 32;
                int i12 = 196608;
                if (i6 == 0) {
                    if ((196608 & i) == 0) {
                        i12 = M.o(placeholderSize == null ? -1 : placeholderSize.ordinal()) ? 131072 : 65536;
                    }
                    i7 = i2 & 64;
                    if (i7 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        i3 |= M.l(z) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                        if (M.t(i3 & 1, (i3 & 599187) != 599186)) {
                            if (i10 != 0) {
                                q630Var4 = q630.a.a;
                                i8 = i5;
                            } else {
                                i8 = i5;
                                q630Var4 = q630Var2;
                            }
                            bsa0 bsa0Var4 = i11 != 0 ? null : bsa0Var2;
                            if (i4 != 0) {
                                wra0Var4 = null;
                                i9 = i6;
                            } else {
                                i9 = i6;
                                wra0Var4 = wra0Var2;
                            }
                            PlaceholderMode placeholderMode3 = i8 != 0 ? PlaceholderMode.Primary : placeholderMode;
                            PlaceholderSize placeholderSize3 = i9 != 0 ? PlaceholderSize.Large : placeholderSize;
                            boolean z3 = i7 != 0 ? true : z;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-1555624705, i3, -1, "com.vk.core.compose.component.placeholder.VkPlaceholder (VkPlaceholder.kt:52)");
                            }
                            M.K(-917535572);
                            a(q630Var4, bsa0Var4, zra0Var, wra0Var4, z3, placeholderMode3, M, (i3 & 8190) | (57344 & (i3 >> 6)) | ((i3 << 3) & 458752));
                            M.j();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            placeholderSize2 = placeholderSize3;
                            q630Var3 = q630Var4;
                            bsa0Var3 = bsa0Var4;
                            wra0Var3 = wra0Var4;
                            z2 = z3;
                            placeholderMode2 = placeholderMode3;
                        } else {
                            M.h();
                            placeholderSize2 = placeholderSize;
                            q630Var3 = q630Var2;
                            bsa0Var3 = bsa0Var2;
                            wra0Var3 = wra0Var2;
                            placeholderMode2 = placeholderMode;
                            z2 = z;
                        }
                        s = M.s();
                        if (s != null) {
                            s.d = new zou0(q630Var3, bsa0Var3, zra0Var, wra0Var3, placeholderMode2, placeholderSize2, z2, i, i2);
                            return;
                        }
                        return;
                    }
                    if (M.t(i3 & 1, (i3 & 599187) != 599186)) {
                    }
                    s = M.s();
                    if (s != null) {
                    }
                }
                i3 |= i12;
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                if (M.t(i3 & 1, (i3 & 599187) != 599186)) {
                }
                s = M.s();
                if (s != null) {
                }
            }
            wra0Var2 = wra0Var;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            i6 = i2 & 32;
            int i122 = 196608;
            if (i6 == 0) {
            }
            i3 |= i122;
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            if (M.t(i3 & 1, (i3 & 599187) != 599186)) {
            }
            s = M.s();
            if (s != null) {
            }
        }
        bsa0Var2 = bsa0Var;
        if ((i & 384) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        wra0Var2 = wra0Var;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        i6 = i2 & 32;
        int i1222 = 196608;
        if (i6 == 0) {
        }
        i3 |= i1222;
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        if (M.t(i3 & 1, (i3 & 599187) != 599186)) {
        }
        s = M.s();
        if (s != null) {
        }
    }
}
