package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ContentBadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeMode;
import com.vk.core.compose.component.defaults.ContentBadgeSize;
import com.vk.core.compose.component.defaults.e;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: VkContentBadge.kt */
/* loaded from: classes17.dex */
public final class rnu0 {
    public static final void a(final ContentBadgeSize contentBadgeSize, final ContentBadgeMode contentBadgeMode, final ContentBadgeAppearance contentBadgeAppearance, final jfj jfjVar, final kfj kfjVar, final lfj lfjVar, final lg90 lg90Var, final l5g l5gVar, final pco pcoVar, final boolean z, final boolean z2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        ContentBadgeSize contentBadgeSize2;
        boolean z3;
        androidx.compose.runtime.a M = aVar.M(-1632846401);
        int i3 = (M.J(pcoVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456) | i | (M.o(contentBadgeSize.ordinal()) ? 32 : 16) | (M.o(contentBadgeMode.ordinal()) ? 256 : 128) | (M.J(contentBadgeAppearance) ? 2048 : 1024) | (M.J(jfjVar) ? 16384 : 8192) | (M.J(kfjVar) ? 131072 : 65536) | (M.J(lfjVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.y(lg90Var) ? 8388608 : 4194304) | (M.J(l5gVar) ? 67108864 : 33554432);
        int i4 = (M.l(z) ? 4 : 2) | (M.l(z2) ? 32 : 16);
        if (M.t(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1632846401, i3, i4, "com.vk.core.compose.component.BadgeContent (VkContentBadge.kt:358)");
            }
            int i5 = i3 >> 9;
            int i6 = i3 >> 3;
            long a = com.vk.core.compose.component.defaults.e.a(contentBadgeAppearance, contentBadgeMode, M, (i5 & 14) | 384 | (i6 & 112));
            boolean z4 = kfjVar == null;
            if (jfjVar == null) {
                M.K(673034380);
                M.j();
                contentBadgeSize2 = contentBadgeSize;
                i2 = i6;
                z3 = z4;
            } else {
                M.K(673034381);
                i2 = i6;
                contentBadgeSize2 = contentBadgeSize;
                jfjVar.a(((i3 << 3) & 896) | 6 | (i3 & 7168) | ((i3 << 6) & 57344), M, contentBadgeAppearance, contentBadgeMode, contentBadgeSize2, z4);
                z3 = z4;
                if (z3) {
                    M.K(1663506867);
                    M.j();
                } else {
                    M.K(1677190763);
                    com.vk.core.compose.component.defaults.e.c(contentBadgeSize2, (i2 & 14) | 48);
                    mq.d(q630.a.a, kqu0.r, M, 0);
                }
                M.j();
            }
            if (kfjVar == null) {
                M.K(673387563);
            } else {
                M.K(673387564);
                kfjVar.a(((i4 << 15) & 458752) | 54 | (i2 & 896) | ((i3 << 3) & 7168) | ((i3 << 9) & 57344), M, contentBadgeAppearance, contentBadgeMode, contentBadgeSize2, z);
            }
            M.j();
            M.K(contentBadgeSize2 != ContentBadgeSize.Small ? -1502286171 : 673770192);
            M.j();
            M.K(659573251);
            M.j();
            if (lg90Var != null) {
                M.K(674301010);
                b(lg90Var, z3, contentBadgeSize2, a, pcoVar, l5gVar, M, ((i3 >> 21) & 14) | 8 | ((i3 << 3) & 896) | ((i3 >> 15) & 57344) | (i5 & 458752));
                M = M;
            } else {
                M.K(659573251);
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
            s.d = new wzs(contentBadgeMode, contentBadgeAppearance, jfjVar, kfjVar, lfjVar, lg90Var, l5gVar, pcoVar, z, z2, i) { // from class: xsna.jnu0
                public final /* synthetic */ ContentBadgeMode c;
                public final /* synthetic */ ContentBadgeAppearance d;
                public final /* synthetic */ jfj e;
                public final /* synthetic */ kfj f;
                public final /* synthetic */ lfj g;
                public final /* synthetic */ lg90 h;
                public final /* synthetic */ l5g i;
                public final /* synthetic */ pco j;
                public final /* synthetic */ boolean k;
                public final /* synthetic */ boolean l;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(16777223);
                    rnu0.a(ContentBadgeSize.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final lg90 lg90Var, final boolean z, final ContentBadgeSize contentBadgeSize, final long j, final pco pcoVar, final l5g l5gVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(639788575);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.o(contentBadgeSize.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.p(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(pcoVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(l5gVar) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(639788575, i2, -1, "com.vk.core.compose.component.ContentBadgeAfter (VkContentBadge.kt:422)");
            }
            q630.a aVar2 = q630.a.a;
            if (z) {
                M.K(-1138354397);
                M.j();
            } else {
                M.K(-1123159933);
                com.vk.core.compose.component.defaults.e.c(contentBadgeSize, ((i2 >> 6) & 14) | 48);
                mq.d(aVar2, kqu0.r, M, 0);
            }
            float b = com.vk.core.compose.component.defaults.e.b(contentBadgeSize, !z, M, ((i2 >> 6) & 14) | 384);
            vqv.a(lg90Var, null, txj0.s(aVar2, pcoVar != null ? pcoVar.b : b, b), l5gVar != null ? l5gVar.a : j, M, 56 | (i2 & 14), 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.knu0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    rnu0.b(lg90.this, z, contentBadgeSize, j, pcoVar, l5gVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final ContentBadgeSize contentBadgeSize, final ContentBadgeMode contentBadgeMode, final ContentBadgeAppearance contentBadgeAppearance, q630 q630Var, lg90 lg90Var, l5g l5gVar, final String str, String str2, lg90 lg90Var2, l5g l5gVar2, boolean z, pco pcoVar, boolean z2, rv5 rv5Var, androidx.compose.runtime.a aVar, final int i, final int i2, final int i3) {
        int i4;
        q630 q630Var2;
        int i5;
        int i6;
        l5g l5gVar3;
        int i7;
        String str3;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        androidx.compose.runtime.a aVar2;
        final lg90 lg90Var3;
        final lg90 lg90Var4;
        final boolean z3;
        final pco pcoVar2;
        final rv5 rv5Var2;
        final q630 q630Var3;
        final l5g l5gVar4;
        final String str4;
        final l5g l5gVar5;
        final boolean z4;
        androidx.compose.runtime.f s;
        us2 a;
        androidx.compose.runtime.a M = aVar.M(-151027302);
        if ((i & 6) == 0) {
            i4 = (M.o(contentBadgeSize.ordinal()) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= M.o(contentBadgeMode.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= (i & 512) == 0 ? M.J(contentBadgeAppearance) : M.y(contentBadgeAppearance) ? 256 : 128;
        }
        int i20 = i3 & 8;
        if (i20 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            q630Var2 = q630Var;
            i4 |= M.J(q630Var2) ? 2048 : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                i4 |= (i & 32768) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 16384 : 8192;
            }
            i6 = i3 & 32;
            if (i6 == 0) {
                i4 |= 196608;
                l5gVar3 = l5gVar;
            } else {
                l5gVar3 = l5gVar;
                if ((i & 196608) == 0) {
                    i4 |= M.J(l5gVar3) ? 131072 : 65536;
                }
            }
            if ((i & 1572864) == 0) {
                i4 |= M.J(str) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            }
            i7 = i3 & 128;
            if (i7 == 0) {
                i4 |= 12582912;
                str3 = str2;
            } else {
                str3 = str2;
                if ((i & 12582912) == 0) {
                    i4 |= M.J(str3) ? 8388608 : 4194304;
                }
            }
            i8 = i3 & 256;
            int i21 = 100663296;
            if (i8 == 0) {
                if ((i & 100663296) == 0) {
                    i21 = (i & 134217728) == 0 ? M.J(lg90Var2) : M.y(lg90Var2) ? 67108864 : 33554432;
                }
                i9 = i3 & 512;
                if (i9 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i10 = i9;
                    i4 |= M.J(l5gVar2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                    i11 = i3 & 1024;
                    if (i11 == 0) {
                        i13 = i2 | 6;
                        i12 = i11;
                    } else if ((i2 & 6) == 0) {
                        i12 = i11;
                        i13 = i2 | (M.l(z) ? 4 : 2);
                    } else {
                        i12 = i11;
                        i13 = i2;
                    }
                    i14 = i3 & 2048;
                    if (i14 == 0) {
                        i13 |= 48;
                        i15 = i14;
                    } else if ((i2 & 48) == 0) {
                        i15 = i14;
                        i13 |= M.J(pcoVar) ? 32 : 16;
                    } else {
                        i15 = i14;
                    }
                    int i22 = i13;
                    i16 = i3 & 4096;
                    if (i16 == 0) {
                        i17 = i22 | 384;
                    } else if ((i2 & 384) == 0) {
                        i17 = i22 | (M.l(z2) ? 256 : 128);
                    } else {
                        i17 = i22;
                    }
                    i18 = i3 & 8192;
                    if (i18 == 0) {
                        i19 = i17 | 3072;
                    } else {
                        int i23 = i17;
                        if ((i2 & 3072) == 0) {
                            i19 = i23 | (M.J(rv5Var) ? 2048 : 1024);
                        } else {
                            i19 = i23;
                        }
                    }
                    if (M.t(i4 & 1, (i4 & 306783379) == 306783378 || (i19 & 1171) != 1170)) {
                        aVar2 = M;
                        aVar2.h();
                        lg90Var3 = lg90Var;
                        lg90Var4 = lg90Var2;
                        z3 = z;
                        pcoVar2 = pcoVar;
                        rv5Var2 = rv5Var;
                        q630Var3 = q630Var2;
                        l5gVar4 = l5gVar3;
                        str4 = str3;
                        l5gVar5 = l5gVar2;
                        z4 = z2;
                    } else {
                        q630 q630Var4 = i20 != 0 ? q630.a.a : q630Var2;
                        lg90 lg90Var5 = i5 != 0 ? null : lg90Var;
                        l5g l5gVar6 = i6 != 0 ? null : l5gVar3;
                        if (i7 != 0) {
                            str3 = null;
                        }
                        lg90 lg90Var6 = i8 != 0 ? null : lg90Var2;
                        l5g l5gVar7 = i10 != 0 ? null : l5gVar2;
                        boolean z5 = i12 != 0 ? false : z;
                        pco pcoVar3 = i15 != 0 ? null : pcoVar;
                        String str5 = str3;
                        boolean z6 = i16 != 0 ? false : z2;
                        rv5 rv5Var3 = i18 != 0 ? null : rv5Var;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-151027302, i4, i19, "com.vk.core.compose.component.VkContentBadge (VkContentBadge.kt:74)");
                        }
                        if (str == null) {
                            M.K(1872354190);
                            M.j();
                            a = null;
                        } else {
                            M.K(891682515);
                            a = ws2.a(str, M, (i4 >> 18) & 14);
                            M.j();
                        }
                        int i24 = i19;
                        int i25 = i4 >> 15;
                        int i26 = i24 << 15;
                        aVar2 = M;
                        g(contentBadgeSize, contentBadgeMode, contentBadgeAppearance, q630Var4, lg90Var5, l5gVar6, null, a, str5, null, null, lg90Var6, l5gVar7, z5, pcoVar3, z6, false, rv5Var3, aVar2, (i4 & 896) | (i4 & 14) | 806879232 | (i4 & 112) | (i4 & 7168) | 32768 | (i4 & 57344) | (i4 & 458752) | ((i4 << 3) & 234881024), (i25 & 57344) | 4096 | (i25 & 7168) | (i26 & 458752) | (3670016 & i26) | (i26 & 29360128) | (1879048192 & (i24 << 18)), 269312);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        l5gVar4 = l5gVar6;
                        str4 = str5;
                        lg90Var4 = lg90Var6;
                        l5gVar5 = l5gVar7;
                        z3 = z5;
                        pcoVar2 = pcoVar3;
                        z4 = z6;
                        rv5Var2 = rv5Var3;
                        lg90Var3 = lg90Var5;
                        q630Var3 = q630Var4;
                    }
                    s = aVar2.s();
                    if (s == null) {
                        s.d = new wzs() { // from class: xsna.mnu0
                            @Override // xsna.wzs
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int I = ne7.I(i | 1);
                                int I2 = ne7.I(i2);
                                rnu0.c(ContentBadgeSize.this, contentBadgeMode, contentBadgeAppearance, q630Var3, lg90Var3, l5gVar4, str, str4, lg90Var4, l5gVar5, z3, pcoVar2, z4, rv5Var2, (androidx.compose.runtime.a) obj, I, I2, i3);
                                return s3q0.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                i10 = i9;
                i11 = i3 & 1024;
                if (i11 == 0) {
                }
                i14 = i3 & 2048;
                if (i14 == 0) {
                }
                int i222 = i13;
                i16 = i3 & 4096;
                if (i16 == 0) {
                }
                i18 = i3 & 8192;
                if (i18 == 0) {
                }
                if (M.t(i4 & 1, (i4 & 306783379) == 306783378 || (i19 & 1171) != 1170)) {
                }
                s = aVar2.s();
                if (s == null) {
                }
            }
            i4 |= i21;
            i9 = i3 & 512;
            if (i9 != 0) {
            }
            i10 = i9;
            i11 = i3 & 1024;
            if (i11 == 0) {
            }
            i14 = i3 & 2048;
            if (i14 == 0) {
            }
            int i2222 = i13;
            i16 = i3 & 4096;
            if (i16 == 0) {
            }
            i18 = i3 & 8192;
            if (i18 == 0) {
            }
            if (M.t(i4 & 1, (i4 & 306783379) == 306783378 || (i19 & 1171) != 1170)) {
            }
            s = aVar2.s();
            if (s == null) {
            }
        }
        q630Var2 = q630Var;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        i6 = i3 & 32;
        if (i6 == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i3 & 256;
        int i212 = 100663296;
        if (i8 == 0) {
        }
        i4 |= i212;
        i9 = i3 & 512;
        if (i9 != 0) {
        }
        i10 = i9;
        i11 = i3 & 1024;
        if (i11 == 0) {
        }
        i14 = i3 & 2048;
        if (i14 == 0) {
        }
        int i22222 = i13;
        i16 = i3 & 4096;
        if (i16 == 0) {
        }
        i18 = i3 & 8192;
        if (i18 == 0) {
        }
        if (M.t(i4 & 1, (i4 & 306783379) == 306783378 || (i19 & 1171) != 1170)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }

    public static final void d(final ContentBadgeSize contentBadgeSize, final ContentBadgeMode contentBadgeMode, final ContentBadgeAppearance contentBadgeAppearance, final q630 q630Var, final jfj jfjVar, final String str, final String str2, final lg90 lg90Var, final boolean z, final boolean z2, final rv5 rv5Var, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        us2 a;
        androidx.compose.runtime.a M = aVar.M(584608569);
        int i2 = i | (M.o(contentBadgeSize.ordinal()) ? 4 : 2) | (M.o(contentBadgeMode.ordinal()) ? 32 : 16) | (M.J(contentBadgeAppearance) ? 256 : 128) | (M.J(q630Var) ? 2048 : 1024) | (M.J(jfjVar) ? 16384 : 8192) | (M.J(str) ? 131072 : 65536) | 1572864 | (M.J(str2) ? 8388608 : 4194304) | 100663296 | (M.y(lg90Var) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        int i3 = (M.l(z) ? 32 : 16) | 3462 | (M.l(z2) ? 16384 : 8192) | (M.J(rv5Var) ? 131072 : 65536);
        if (M.t(i2 & 1, ((306783379 & i2) == 306783378 && (74899 & i3) == 74898) ? false : true)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(584608569, i2, i3, "com.vk.core.compose.component.VkContentBadge (VkContentBadge.kt:119)");
            }
            us2 us2Var = null;
            if (str == null) {
                M.K(-17447953);
                M.j();
                a = null;
            } else {
                M.K(-831846830);
                a = ws2.a(str, M, (i2 >> 15) & 14);
                M.j();
            }
            if (str2 == null) {
                M.K(-17317009);
            } else {
                M.K(-831842606);
                us2Var = ws2.a(str2, M, (i2 >> 21) & 14);
            }
            M.j();
            us2 us2Var2 = us2Var;
            int i4 = (i2 & 14) | 805527552 | (i2 & 112) | (i2 & 896) | (i2 & 7168) | (3670016 & (i2 << 6)) | 100663296;
            int i5 = (i2 >> 18) & 7168;
            int i6 = i3 << 12;
            aVar2 = M;
            g(contentBadgeSize, contentBadgeMode, contentBadgeAppearance, q630Var, null, null, jfjVar, a, null, null, us2Var2, lg90Var, null, z, null, false, z2, rv5Var, aVar2, i4, i5 | 29056 | (458752 & i6) | 14155776 | (234881024 & i6) | (i6 & 1879048192), 1024);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(contentBadgeMode, contentBadgeAppearance, q630Var, jfjVar, str, str2, lg90Var, z, z2, rv5Var, i) { // from class: xsna.inu0
                public final /* synthetic */ ContentBadgeMode c;
                public final /* synthetic */ ContentBadgeAppearance d;
                public final /* synthetic */ q630 e;
                public final /* synthetic */ jfj f;
                public final /* synthetic */ String g;
                public final /* synthetic */ String h;
                public final /* synthetic */ lg90 i;
                public final /* synthetic */ boolean j;
                public final /* synthetic */ boolean k;
                public final /* synthetic */ rv5 l;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1073741825);
                    rnu0.d(ContentBadgeSize.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void e(ContentBadgeSize contentBadgeSize, ContentBadgeMode contentBadgeMode, ContentBadgeAppearance contentBadgeAppearance, q630 q630Var, jfj jfjVar, us2 us2Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        jfj jfjVar2;
        us2 us2Var2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-522411079);
        if ((i & 6) == 0) {
            i2 = (M.o(contentBadgeSize.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.o(contentBadgeMode.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? M.J(contentBadgeAppearance) : M.y(contentBadgeAppearance) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(q630Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            jfjVar2 = jfjVar;
            i2 |= M.J(jfjVar2) ? 16384 : 8192;
        } else {
            jfjVar2 = jfjVar;
        }
        if ((196608 & i) == 0) {
            us2Var2 = us2Var;
            i2 |= M.J(us2Var2) ? 131072 : 65536;
        } else {
            us2Var2 = us2Var;
        }
        int i3 = i2 | 920125440;
        if (M.t(i3 & 1, (306783379 & i3) != 306783378)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-522411079, i3, 224694, "com.vk.core.compose.component.VkContentBadge (VkContentBadge.kt:167)");
            }
            int i4 = i3 << 6;
            int i5 = i3 >> 18;
            aVar2 = M;
            g(contentBadgeSize, contentBadgeMode, contentBadgeAppearance, q630Var, null, null, jfjVar2, us2Var2, null, null, null, null, null, false, null, false, false, null, aVar2, (i3 & 14) | 805527552 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (3670016 & i4) | (29360128 & i4) | (i4 & 234881024), (i5 & 7168) | (i5 & 1008) | 4096 | 920346624, 1024);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new bu50(contentBadgeSize, contentBadgeMode, contentBadgeAppearance, q630Var, jfjVar, us2Var, i);
        }
    }

    public static final void f(final ContentBadgeSize contentBadgeSize, final ContentBadgeMode contentBadgeMode, final ContentBadgeAppearance.a aVar, final q630 q630Var, final kfj kfjVar, final rv5 rv5Var, androidx.compose.runtime.a aVar2, final int i) {
        androidx.compose.runtime.a aVar3;
        androidx.compose.runtime.a M = aVar2.M(-1733901642);
        int i2 = i | (M.J(aVar) ? 256 : 128) | (M.J(q630Var) ? 2048 : 1024) | 24576 | (M.J(kfjVar) ? 131072 : 65536) | 920125440;
        int i3 = 438 | (M.J(rv5Var) ? 2048 : 1024);
        if (M.t(i2 & 1, ((306783379 & i2) == 306783378 && (i3 & 1171) == 1170) ? false : true)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1733901642, i2, i3, "com.vk.core.compose.component.VkContentBadge (VkContentBadge.kt:214)");
            }
            aVar3 = M;
            g(contentBadgeSize, contentBadgeMode, aVar, q630Var, null, null, null, null, null, kfjVar, null, null, null, false, null, false, false, rv5Var, aVar3, (i2 & 896) | 113467446 | (i2 & 7168) | 1572864 | ((i2 << 12) & 1879048192), 115047430 | ((i3 << 18) & 1879048192), 6144);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar3 = M;
            aVar3.h();
        }
        androidx.compose.runtime.f s = aVar3.s();
        if (s != null) {
            s.d = new wzs(contentBadgeMode, aVar, q630Var, kfjVar, rv5Var, i) { // from class: xsna.lnu0
                public final /* synthetic */ ContentBadgeMode c;
                public final /* synthetic */ ContentBadgeAppearance.a d;
                public final /* synthetic */ q630 e;
                public final /* synthetic */ kfj f;
                public final /* synthetic */ rv5 g;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(55);
                    rnu0.f(ContentBadgeSize.this, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x07d3  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x080f  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0822  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x083b  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0913  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0966  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0984  */
    /* JADX WARN: Removed duplicated region for block: B:249:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x08f2  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0819  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0791  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0976  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(final ContentBadgeSize contentBadgeSize, final ContentBadgeMode contentBadgeMode, final ContentBadgeAppearance contentBadgeAppearance, final q630 q630Var, final lg90 lg90Var, final l5g l5gVar, final jfj jfjVar, final us2 us2Var, final String str, final kfj kfjVar, us2 us2Var2, final lg90 lg90Var2, final l5g l5gVar2, final boolean z, final pco pcoVar, final boolean z2, boolean z3, final rv5 rv5Var, androidx.compose.runtime.a aVar, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        androidx.compose.runtime.a aVar2;
        final us2 us2Var3;
        final boolean z4;
        androidx.compose.runtime.f s;
        int i9;
        long a;
        boolean z5;
        int i10;
        u890 u890Var;
        int i11;
        uog0 uog0Var;
        int i12;
        y18 y18Var;
        long j;
        u890 u890Var2;
        androidx.compose.runtime.a M = aVar.M(-269706126);
        if ((i & 6) == 0) {
            i4 = (M.o(contentBadgeSize.ordinal()) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= M.o(contentBadgeMode.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= (i & 512) == 0 ? M.J(contentBadgeAppearance) : M.y(contentBadgeAppearance) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= M.J(q630Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= (32768 & i) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i5 = 196608;
            i4 |= M.J(l5gVar) ? 131072 : 65536;
        } else {
            i5 = 196608;
        }
        if ((i & 1572864) == 0) {
            i4 |= M.J(jfjVar) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= M.J(us2Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= M.J(str) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i4 |= M.J(kfjVar) ? 536870912 : 268435456;
        }
        if ((i3 & 1024) != 0) {
            i6 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i6 = i2 | (M.J(null) ? 4 : 2);
        } else {
            i6 = i2;
        }
        int i13 = i3 & 2048;
        if (i13 != 0) {
            i6 |= 48;
            i7 = i13;
        } else if ((i2 & 48) == 0) {
            i7 = i13;
            i6 |= M.J(us2Var2) ? 32 : 16;
        } else {
            i7 = i13;
        }
        int i14 = i6;
        if ((i3 & 4096) != 0) {
            i14 |= 384;
        } else if ((i2 & 384) == 0) {
            i14 |= M.J(null) ? 256 : 128;
            if ((i2 & 3072) == 0) {
                i14 |= (i2 & 4096) == 0 ? M.J(lg90Var2) : M.y(lg90Var2) ? 2048 : 1024;
            }
            if ((i2 & 24576) == 0) {
                i14 |= M.J(l5gVar2) ? 16384 : 8192;
            }
            if ((i2 & i5) == 0) {
                i14 |= M.l(z) ? 131072 : 65536;
            }
            if ((i2 & 1572864) == 0) {
                i14 |= M.J(pcoVar) ? 1048576 : 524288;
            }
            if ((i2 & 12582912) == 0) {
                i14 |= M.l(z2) ? 8388608 : 4194304;
            }
            i8 = i3 & SQLiteDatabase.OPEN_PRIVATECACHE;
            if (i8 == 0) {
                i14 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                i14 |= M.l(z3) ? 67108864 : 33554432;
            }
            if ((i2 & 805306368) == 0) {
                i14 |= M.J(rv5Var) ? 536870912 : 268435456;
            }
            if (M.t(i4 & 1, (i4 & 306783379) == 306783378 || (i14 & 306783379) != 306783378)) {
                aVar2 = M;
                aVar2.h();
                us2Var3 = us2Var2;
                z4 = z3;
            } else {
                us2 us2Var4 = i7 != 0 ? null : us2Var2;
                final boolean z6 = i8 != 0 ? false : z3;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-269706126, i4, i14, "com.vk.core.compose.component.VkContentBadge (VkContentBadge.kt:259)");
                }
                int i15 = (i4 >> 6) & 14;
                int i16 = i4 & 112;
                int i17 = i15 | 384 | i16;
                final long a2 = com.vk.core.compose.component.defaults.e.a(contentBadgeAppearance, contentBadgeMode, M, i17);
                if (androidx.compose.runtime.b.d()) {
                    i9 = i14;
                    androidx.compose.runtime.b.f(-1644656349, i17, -1, "com.vk.core.compose.component.defaults.VkContentBadgeDefaults.backgroundColor (VkContentBadgeDefaults.kt:144)");
                } else {
                    i9 = i14;
                }
                if (contentBadgeAppearance == ContentBadgeAppearance.Design.Accent) {
                    M.K(33219265);
                    int i18 = (i17 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-909708049, i18, -1, "com.vk.core.compose.component.defaults.VkContentBadgeDefaults.getBackgroundColorAccent (VkContentBadgeDefaults.kt:397)");
                    }
                    M.K(131603533);
                    int i19 = e.a.$EnumSwitchMapping$1[contentBadgeMode.ordinal()];
                    if (i19 == 1) {
                        M.K(1943913255);
                        a = wlb0.h(M).getBackground().z;
                        M.j();
                    } else if (i19 == 2) {
                        M.K(1943916186);
                        a = wlb0.h(M).d().a;
                        M.j();
                    } else {
                        if (i19 != 3) {
                            throw alb0.c(1943908229, M);
                        }
                        M.K(1943910527);
                        a = wlb0.h(M).getBackground().b;
                        M.j();
                    }
                    M.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                } else if (contentBadgeAppearance == ContentBadgeAppearance.Design.Neutral) {
                    M.K(33221826);
                    int i20 = (i17 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1873444914, i20, -1, "com.vk.core.compose.component.defaults.VkContentBadgeDefaults.getBackgroundColorNeutral (VkContentBadgeDefaults.kt:415)");
                    }
                    M.K(-1302124301);
                    int i21 = e.a.$EnumSwitchMapping$1[contentBadgeMode.ordinal()];
                    if (i21 == 1) {
                        M.K(789285034);
                        a = wlb0.h(M).getBackground().z;
                        M.j();
                    } else if (i21 == 2) {
                        M.K(789287965);
                        a = wlb0.h(M).d().a;
                        M.j();
                    } else {
                        if (i21 != 3) {
                            throw alb0.c(789280287, M);
                        }
                        a = vcl0.a(M, 789282399, M).l;
                        M.j();
                    }
                    M.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                } else if (contentBadgeAppearance == ContentBadgeAppearance.Design.Positive) {
                    M.K(33224451);
                    int i22 = (i17 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1535882594, i22, -1, "com.vk.core.compose.component.defaults.VkContentBadgeDefaults.getBackgroundColorPositive (VkContentBadgeDefaults.kt:450)");
                    }
                    int i23 = e.a.$EnumSwitchMapping$1[contentBadgeMode.ordinal()];
                    if (i23 == 1) {
                        M.K(1485586132);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        a = ylu0Var.getBackground().w;
                        M.j();
                    } else if (i23 == 2) {
                        M.K(1485588873);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        a = ylu0Var2.d().a;
                        M.j();
                    } else {
                        if (i23 != 3) {
                            throw alb0.c(1485581625, M);
                        }
                        M.K(1485583689);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var3 = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        a = ylu0Var3.q().e;
                        M.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                } else if (contentBadgeAppearance == ContentBadgeAppearance.Design.Negative) {
                    M.K(33227107);
                    int i24 = (i17 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1289200678, i24, -1, "com.vk.core.compose.component.defaults.VkContentBadgeDefaults.getBackgroundColorNegative (VkContentBadgeDefaults.kt:459)");
                    }
                    int i25 = e.a.$EnumSwitchMapping$1[contentBadgeMode.ordinal()];
                    if (i25 == 1) {
                        M.K(-1971261232);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var4 = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        a = ylu0Var4.getBackground().u;
                        M.j();
                    } else if (i25 == 2) {
                        M.K(-1971258491);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var5 = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        a = ylu0Var5.d().a;
                        M.j();
                    } else {
                        if (i25 != 3) {
                            throw alb0.c(-1971265677, M);
                        }
                        M.K(-1971263613);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var6 = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        a = ylu0Var6.q().m;
                        M.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                } else if (contentBadgeAppearance == ContentBadgeAppearance.Design.Overlay) {
                    M.K(33229730);
                    int i26 = (i17 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1771382011, i26, -1, "com.vk.core.compose.component.defaults.VkContentBadgeDefaults.getBackgroundColorOverlay (VkContentBadgeDefaults.kt:433)");
                    }
                    M.K(-1021230190);
                    int i27 = e.a.$EnumSwitchMapping$1[contentBadgeMode.ordinal()];
                    if (i27 == 1) {
                        M.K(1491082827);
                        a = wlb0.h(M).j().b;
                        M.j();
                    } else if (i27 == 2) {
                        M.K(1491085385);
                        a = wlb0.h(M).j().a;
                        M.j();
                    } else {
                        if (i27 != 3) {
                            throw alb0.c(1491078048, M);
                        }
                        M.K(1491080265);
                        a = wlb0.h(M).j().a;
                        M.j();
                    }
                    M.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                } else if (contentBadgeAppearance instanceof ContentBadgeAppearance.a) {
                    M.K(1030202449);
                    M.j();
                    a = contentBadgeMode == ContentBadgeMode.Secondary ? l5g.c(14, ((ContentBadgeAppearance.a) contentBadgeAppearance).b, 0.16f) : ((ContentBadgeAppearance.a) contentBadgeAppearance).b;
                } else {
                    if (!(contentBadgeAppearance instanceof ContentBadgeAppearance.b)) {
                        throw alb0.c(33217836, M);
                    }
                    M.K(33241235);
                    a = ((ContentBadgeAppearance.b) contentBadgeAppearance).b.a(0, M);
                    M.j();
                }
                long j2 = a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (lg90Var != null || jfjVar != null) {
                    if ((us2Var == null || us2Var.c.length() == 0) && kfjVar == null && lg90Var2 == null) {
                        if (us2Var4 == null || us2Var4.c.length() == 0) {
                            z5 = true;
                            int i28 = (i4 & 14) | 3072 | ((i9 >> 9) & 896);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(258120993, i28, -1, "com.vk.core.compose.component.defaults.VkContentBadgeDefaults.contentPaddings (VkContentBadgeDefaults.kt:77)");
                            }
                            i10 = e.a.$EnumSwitchMapping$0[contentBadgeSize.ordinal()];
                            if (i10 != 1) {
                                M.K(-1053821013);
                                int i29 = (i28 >> 3) & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-179506363, i29, -1, "com.vk.core.compose.component.defaults.VkContentBadgeDefaults.getSmallContentPaddings (VkContentBadgeDefaults.kt:208)");
                                }
                                if (z5) {
                                    float f = 3;
                                    u890Var = new u890(f, f, f, f);
                                } else if (z) {
                                    float f2 = kqu0.r;
                                    float f3 = 1;
                                    u890Var = new u890(f2, f3, f2, f3);
                                } else {
                                    float f4 = kqu0.r;
                                    float f5 = 1;
                                    u890Var = new u890(f4, f5, f4, f5);
                                }
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                M.j();
                            } else if (i10 == 2) {
                                M.K(-1053818388);
                                int i30 = (i28 >> 3) & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(446916611, i30, -1, "com.vk.core.compose.component.defaults.VkContentBadgeDefaults.getMediumContentPaddings (VkContentBadgeDefaults.kt:226)");
                                }
                                if (z5) {
                                    float f6 = kqu0.r;
                                    u890Var = new u890(f6, f6, f6, f6);
                                } else {
                                    if (z) {
                                        float f7 = kqu0.s;
                                        float f8 = 3;
                                        u890Var2 = new u890(f7, f8, f7, f8);
                                    } else {
                                        float f9 = kqu0.s;
                                        float f10 = 3;
                                        u890Var2 = new u890(f9, f10, f9, f10);
                                    }
                                    u890Var = u890Var2;
                                }
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                M.j();
                            } else {
                                if (i10 != 3) {
                                    throw alb0.c(-1053822451, M);
                                }
                                M.K(-1053815765);
                                int i31 = (i28 >> 3) & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(183547769, i31, -1, "com.vk.core.compose.component.defaults.VkContentBadgeDefaults.getLargeContentPaddings (VkContentBadgeDefaults.kt:241)");
                                }
                                if (z5) {
                                    float f11 = kqu0.r;
                                    u890Var = new u890(f11, f11, f11, f11);
                                } else if (z) {
                                    float f12 = kqu0.s;
                                    u890Var = new u890(f12, f12, f12, f12);
                                } else {
                                    float f13 = kqu0.s;
                                    u890Var = new u890(f13, f13, f13, f13);
                                }
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                M.j();
                            }
                            wh50 c = androidx.compose.runtime.k.c(u890Var, M, 0);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            final s890 s890Var = (s890) c.getValue();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(808198359, i28, -1, "com.vk.core.compose.component.defaults.VkContentBadgeDefaults.shape (VkContentBadgeDefaults.kt:38)");
                            }
                            i11 = e.a.$EnumSwitchMapping$0[contentBadgeSize.ordinal()];
                            if (i11 != 1) {
                                M.K(-710452777);
                                int i32 = (i28 >> 3) & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-1741306819, i32, -1, "com.vk.core.compose.component.defaults.VkContentBadgeDefaults.getSmallShape (VkContentBadgeDefaults.kt:256)");
                                }
                                uog0Var = z5 ? vog0.a : z ? com.vk.core.compose.component.defaults.e.b : com.vk.core.compose.component.defaults.e.a;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                M.j();
                            } else if (i11 == 2) {
                                M.K(-710450600);
                                int i33 = (i28 >> 3) & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(389861567, i33, -1, "com.vk.core.compose.component.defaults.VkContentBadgeDefaults.getMediumShape (VkContentBadgeDefaults.kt:272)");
                                }
                                uog0Var = z5 ? vog0.a : z ? com.vk.core.compose.component.defaults.e.d : com.vk.core.compose.component.defaults.e.c;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                M.j();
                            } else {
                                if (i11 != 3) {
                                    throw alb0.c(-710454123, M);
                                }
                                M.K(-710448425);
                                int i34 = (i28 >> 3) & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(489500553, i34, -1, "com.vk.core.compose.component.defaults.VkContentBadgeDefaults.getLargeShape (VkContentBadgeDefaults.kt:288)");
                                }
                                uog0Var = z5 ? vog0.a : z ? com.vk.core.compose.component.defaults.e.f : com.vk.core.compose.component.defaults.e.e;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                M.j();
                            }
                            uog0 uog0Var2 = uog0Var;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            int i35 = i15 | i16;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-1217558211, i35, -1, "com.vk.core.compose.component.isBlurAllowed (VkContentBadge.kt:340)");
                            }
                            M.K(((contentBadgeMode == ContentBadgeMode.Secondary || contentBadgeAppearance != ContentBadgeAppearance.Design.Overlay) && !((contentBadgeAppearance instanceof ContentBadgeAppearance.a) && ((ContentBadgeAppearance.a) contentBadgeAppearance).e)) ? -1277550158 : -1842326653);
                            M.j();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            if (oq.h(-1489502470, M)) {
                                i12 = -1;
                            } else {
                                i12 = -1;
                                androidx.compose.runtime.b.f(2010352738, i17, -1, "com.vk.core.compose.component.defaults.VkContentBadgeDefaults.border (VkContentBadgeDefaults.kt:128)");
                            }
                            int i36 = i17 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(2045513553, i36, i12, "com.vk.core.compose.component.defaults.VkContentBadgeDefaults.getBorder (VkContentBadgeDefaults.kt:314)");
                            }
                            M.K(898743703);
                            if (e.a.$EnumSwitchMapping$1[contentBadgeMode.ordinal()] != 2) {
                                M.K(898803905);
                                if (contentBadgeAppearance == ContentBadgeAppearance.Design.Accent) {
                                    M.K(-1356476195);
                                    j = wlb0.h(M).m().a;
                                    M.j();
                                } else if (contentBadgeAppearance == ContentBadgeAppearance.Design.Neutral) {
                                    j = vcl0.a(M, -1356473186, M).l;
                                    M.j();
                                } else if (contentBadgeAppearance == ContentBadgeAppearance.Design.Positive) {
                                    M.K(-1356470052);
                                    j = wlb0.h(M).q().e;
                                    M.j();
                                } else if (contentBadgeAppearance == ContentBadgeAppearance.Design.Negative) {
                                    M.K(-1356466982);
                                    j = wlb0.h(M).q().m;
                                    M.j();
                                } else if (contentBadgeAppearance == ContentBadgeAppearance.Design.Overlay) {
                                    M.K(-1356463844);
                                    j = wlb0.h(M).d().a;
                                    M.j();
                                } else if (contentBadgeAppearance instanceof ContentBadgeAppearance.a) {
                                    M.K(-1356461316);
                                    M.j();
                                    j = ((ContentBadgeAppearance.a) contentBadgeAppearance).d;
                                } else {
                                    if (!(contentBadgeAppearance instanceof ContentBadgeAppearance.b)) {
                                        throw alb0.c(-1356478773, M);
                                    }
                                    M.K(-1356458207);
                                    long a3 = ((ContentBadgeAppearance.b) contentBadgeAppearance).d.a(0, M);
                                    M.j();
                                    j = a3;
                                }
                                y18Var = aqw.a(1, j);
                                M.j();
                            } else {
                                M.K(899579276);
                                M.j();
                                y18Var = null;
                            }
                            M.j();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            wh50 c2 = androidx.compose.runtime.k.c(y18Var, M, 0);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            final us2 us2Var5 = us2Var4;
                            final String str2 = null;
                            final lfj lfjVar = null;
                            boolean z7 = z6;
                            aVar2 = M;
                            uov0.a(q630Var, uog0Var2, j2, j2, (y18) c2.getValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(504536715, new wzs() { // from class: xsna.nnu0
                                @Override // xsna.wzs
                                public final Object invoke(Object obj, Object obj2) {
                                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                                    int intValue = ((Integer) obj2).intValue();
                                    if (aVar3.t(intValue & 1, (intValue & 3) != 2)) {
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(504536715, intValue, -1, "com.vk.core.compose.component.VkContentBadge.<anonymous> (VkContentBadge.kt:285)");
                                        }
                                        pqo pqoVar = hfj.a;
                                        long j3 = a2;
                                        c9e0[] c9e0VarArr = {pqoVar.b(Float.valueOf(l5g.e(j3))), vcl0.b(l5g.c(14, j3, 1.0f), yfj.a)};
                                        final ContentBadgeSize contentBadgeSize2 = contentBadgeSize;
                                        final s890 s890Var2 = s890Var;
                                        final ContentBadgeMode contentBadgeMode2 = contentBadgeMode;
                                        final ContentBadgeAppearance contentBadgeAppearance2 = contentBadgeAppearance;
                                        final lg90 lg90Var3 = lg90Var;
                                        final l5g l5gVar3 = l5gVar;
                                        final jfj jfjVar2 = jfjVar;
                                        final us2 us2Var6 = us2Var;
                                        final String str3 = str;
                                        final kfj kfjVar2 = kfjVar;
                                        final us2 us2Var7 = us2Var5;
                                        final String str4 = str2;
                                        final lfj lfjVar2 = lfjVar;
                                        final lg90 lg90Var4 = lg90Var2;
                                        final l5g l5gVar4 = l5gVar2;
                                        final pco pcoVar2 = pcoVar;
                                        final boolean z8 = z2;
                                        final boolean z9 = z6;
                                        rvi.b(c9e0VarArr, kai.c(1854292811, new wzs() { // from class: xsna.pnu0
                                            @Override // xsna.wzs
                                            public final Object invoke(Object obj3, Object obj4) {
                                                frv0 frv0Var;
                                                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj3;
                                                int intValue2 = ((Integer) obj4).intValue();
                                                if (aVar4.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.f(1854292811, intValue2, -1, "com.vk.core.compose.component.VkContentBadge.<anonymous>.<anonymous> (VkContentBadge.kt:289)");
                                                    }
                                                    uog0 uog0Var3 = com.vk.core.compose.component.defaults.e.a;
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.f(22455353, 48, -1, "com.vk.core.compose.component.defaults.VkContentBadgeDefaults.textStyleMiddle (VkContentBadgeDefaults.kt:94)");
                                                    }
                                                    aVar4.K(-1047239522);
                                                    int[] iArr = e.a.$EnumSwitchMapping$0;
                                                    final ContentBadgeSize contentBadgeSize3 = ContentBadgeSize.this;
                                                    int i37 = iArr[contentBadgeSize3.ordinal()];
                                                    if (i37 == 1) {
                                                        aVar4.K(104767751);
                                                        frv0Var = wlb0.l(aVar4).v0;
                                                        aVar4.j();
                                                    } else if (i37 == 2) {
                                                        aVar4.K(104770087);
                                                        frv0Var = wlb0.l(aVar4).v0;
                                                        aVar4.j();
                                                    } else {
                                                        if (i37 != 3) {
                                                            throw alb0.c(104765705, aVar4);
                                                        }
                                                        aVar4.K(104772391);
                                                        frv0Var = wlb0.l(aVar4).l0;
                                                        aVar4.j();
                                                    }
                                                    frv0 b = frv0Var.b(aVar4);
                                                    aVar4.j();
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.e();
                                                    }
                                                    final s890 s890Var3 = s890Var2;
                                                    final ContentBadgeMode contentBadgeMode3 = contentBadgeMode2;
                                                    final ContentBadgeAppearance contentBadgeAppearance3 = contentBadgeAppearance2;
                                                    final lg90 lg90Var5 = lg90Var3;
                                                    final l5g l5gVar5 = l5gVar3;
                                                    final jfj jfjVar3 = jfjVar2;
                                                    final us2 us2Var8 = us2Var6;
                                                    final String str5 = str3;
                                                    final kfj kfjVar3 = kfjVar2;
                                                    final us2 us2Var9 = us2Var7;
                                                    final String str6 = str4;
                                                    final lfj lfjVar3 = lfjVar2;
                                                    final lg90 lg90Var6 = lg90Var4;
                                                    final l5g l5gVar6 = l5gVar4;
                                                    final pco pcoVar3 = pcoVar2;
                                                    final boolean z10 = z8;
                                                    final boolean z11 = z9;
                                                    grv0.a(b, kai.c(808947143, new wzs() { // from class: xsna.qnu0
                                                        @Override // xsna.wzs
                                                        public final Object invoke(Object obj5, Object obj6) {
                                                            float f14;
                                                            jfj jfjVar4;
                                                            kfj kfjVar4;
                                                            lfj lfjVar4;
                                                            androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj5;
                                                            int intValue3 = ((Integer) obj6).intValue();
                                                            if (aVar5.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                                if (androidx.compose.runtime.b.d()) {
                                                                    androidx.compose.runtime.b.f(808947143, intValue3, -1, "com.vk.core.compose.component.VkContentBadge.<anonymous>.<anonymous>.<anonymous> (VkContentBadge.kt:290)");
                                                                }
                                                                uog0 uog0Var4 = com.vk.core.compose.component.defaults.e.a;
                                                                if (androidx.compose.runtime.b.d()) {
                                                                    androidx.compose.runtime.b.f(1979121626, 48, -1, "com.vk.core.compose.component.defaults.VkContentBadgeDefaults.minHeight (VkContentBadgeDefaults.kt:46)");
                                                                }
                                                                int[] iArr2 = e.a.$EnumSwitchMapping$0;
                                                                ContentBadgeSize contentBadgeSize4 = ContentBadgeSize.this;
                                                                int i38 = iArr2[contentBadgeSize4.ordinal()];
                                                                if (i38 == 1) {
                                                                    aVar5.K(-734625683);
                                                                    if (androidx.compose.runtime.b.d()) {
                                                                        androidx.compose.runtime.b.f(-1388536672, 6, -1, "com.vk.core.compose.component.defaults.VkContentBadgeDefaults.getSmallMinHeight (VkContentBadgeDefaults.kt:163)");
                                                                    }
                                                                    f14 = 16;
                                                                    if (androidx.compose.runtime.b.d()) {
                                                                        androidx.compose.runtime.b.e();
                                                                    }
                                                                    aVar5.j();
                                                                } else if (i38 == 2) {
                                                                    aVar5.K(-734623922);
                                                                    if (androidx.compose.runtime.b.d()) {
                                                                        androidx.compose.runtime.b.f(723880286, 6, -1, "com.vk.core.compose.component.defaults.VkContentBadgeDefaults.getMediumMinHeight (VkContentBadgeDefaults.kt:172)");
                                                                    }
                                                                    f14 = 20;
                                                                    if (androidx.compose.runtime.b.d()) {
                                                                        androidx.compose.runtime.b.e();
                                                                    }
                                                                    aVar5.j();
                                                                } else {
                                                                    if (i38 != 3) {
                                                                        throw alb0.c(-734627055, aVar5);
                                                                    }
                                                                    aVar5.K(-734622163);
                                                                    if (androidx.compose.runtime.b.d()) {
                                                                        androidx.compose.runtime.b.f(1046360276, 6, -1, "com.vk.core.compose.component.defaults.VkContentBadgeDefaults.getLargeMinHeight (VkContentBadgeDefaults.kt:181)");
                                                                    }
                                                                    f14 = 28;
                                                                    if (androidx.compose.runtime.b.d()) {
                                                                        androidx.compose.runtime.b.e();
                                                                    }
                                                                    aVar5.j();
                                                                }
                                                                if (androidx.compose.runtime.b.d()) {
                                                                    androidx.compose.runtime.b.e();
                                                                }
                                                                q630 C = s200.C(txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f14, 1, q630.a.a), s890Var3);
                                                                a.c cVar = androidx.compose.foundation.layout.a.e;
                                                                dt1.a.getClass();
                                                                androidx.compose.foundation.layout.k a4 = androidx.compose.foundation.layout.j.a(cVar, dt1.a.l, aVar5, 54);
                                                                int hashCode = Long.hashCode(n34.n(aVar5));
                                                                sy90 D = aVar5.D();
                                                                q630 c3 = qri.c(aVar5, C);
                                                                cri.h7.getClass();
                                                                LayoutNode.a aVar6 = cri.a.b;
                                                                if (aVar5.N() == null) {
                                                                    n34.r();
                                                                    throw null;
                                                                }
                                                                aVar5.H();
                                                                if (aVar5.L()) {
                                                                    aVar5.I(aVar6);
                                                                } else {
                                                                    aVar5.f();
                                                                }
                                                                k9q0.w(aVar5, a4, cri.a.f);
                                                                k9q0.w(aVar5, D, cri.a.e);
                                                                k9q0.w(aVar5, Integer.valueOf(hashCode), cri.a.g);
                                                                k9q0.t(aVar5, cri.a.h);
                                                                k9q0.w(aVar5, c3, cri.a.d);
                                                                lg90 lg90Var7 = lg90Var5;
                                                                if (lg90Var7 != null) {
                                                                    aVar5.K(-1382356703);
                                                                    jfjVar4 = lmc.f(lg90Var7, l5gVar5, aVar5, 392, 0);
                                                                    aVar5.j();
                                                                } else {
                                                                    aVar5.K(-1382142927);
                                                                    aVar5.j();
                                                                    jfjVar4 = jfjVar3;
                                                                }
                                                                us2 us2Var10 = us2Var8;
                                                                a.C0011a.C0012a c0012a = a.C0011a.a;
                                                                if (us2Var10 != null) {
                                                                    aVar5.K(-1382011828);
                                                                    if (androidx.compose.runtime.b.d()) {
                                                                        androidx.compose.runtime.b.f(-1962529281, 384, -1, "com.vk.core.compose.component.contentbadge.ContentBadge.Middle.Text.Companion.invoke (ContentBadge.kt:112)");
                                                                    }
                                                                    if (androidx.compose.runtime.b.d()) {
                                                                        androidx.compose.runtime.b.f(-773012736, 6, -1, "com.vk.core.compose.component.contentbadge.remember (MiddleTextImpl.kt:80)");
                                                                    }
                                                                    Object x = aVar5.x();
                                                                    String str7 = str5;
                                                                    if (x == c0012a) {
                                                                        x = new bm20(str7, us2Var10);
                                                                        aVar5.R(x);
                                                                    }
                                                                    bm20 bm20Var = (bm20) x;
                                                                    ((zak0) bm20Var.a).setValue(us2Var10);
                                                                    ((zak0) bm20Var.b).setValue(str7);
                                                                    if (androidx.compose.runtime.b.d()) {
                                                                        androidx.compose.runtime.b.e();
                                                                    }
                                                                    if (androidx.compose.runtime.b.d()) {
                                                                        androidx.compose.runtime.b.e();
                                                                    }
                                                                    aVar5.j();
                                                                    kfjVar4 = bm20Var;
                                                                } else {
                                                                    aVar5.K(-1381777871);
                                                                    aVar5.j();
                                                                    kfjVar4 = kfjVar3;
                                                                }
                                                                us2 us2Var11 = us2Var9;
                                                                if (us2Var11 != null) {
                                                                    aVar5.K(-1381636294);
                                                                    if (androidx.compose.runtime.b.d()) {
                                                                        androidx.compose.runtime.b.f(1042856668, 384, -1, "com.vk.core.compose.component.contentbadge.ContentBadge.Subtitle.Text.Companion.invoke (ContentBadge.kt:148)");
                                                                    }
                                                                    if (androidx.compose.runtime.b.d()) {
                                                                        androidx.compose.runtime.b.f(-626955811, 6, -1, "com.vk.core.compose.component.contentbadge.remember (SubtitleTextImpl.kt:55)");
                                                                    }
                                                                    Object x2 = aVar5.x();
                                                                    String str8 = str6;
                                                                    if (x2 == c0012a) {
                                                                        x2 = new d1n0(str8, us2Var11);
                                                                        aVar5.R(x2);
                                                                    }
                                                                    d1n0 d1n0Var = (d1n0) x2;
                                                                    ((zak0) d1n0Var.a).setValue(us2Var11);
                                                                    ((zak0) d1n0Var.b).setValue(str8);
                                                                    if (androidx.compose.runtime.b.d()) {
                                                                        androidx.compose.runtime.b.e();
                                                                    }
                                                                    if (androidx.compose.runtime.b.d()) {
                                                                        androidx.compose.runtime.b.e();
                                                                    }
                                                                    aVar5.j();
                                                                    lfjVar4 = d1n0Var;
                                                                } else {
                                                                    aVar5.K(-1381384977);
                                                                    aVar5.j();
                                                                    lfjVar4 = lfjVar3;
                                                                }
                                                                rnu0.a(contentBadgeSize4, contentBadgeMode3, contentBadgeAppearance3, jfjVar4, kfjVar4, lfjVar4, lg90Var6, l5gVar6, pcoVar3, z10, z11, aVar5, 16777222);
                                                                aVar5.G();
                                                                if (androidx.compose.runtime.b.d()) {
                                                                    androidx.compose.runtime.b.e();
                                                                }
                                                            } else {
                                                                aVar5.h();
                                                            }
                                                            return s3q0.a;
                                                        }
                                                    }, aVar4), aVar4, 48);
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.e();
                                                    }
                                                } else {
                                                    aVar4.h();
                                                }
                                                return s3q0.a;
                                            }
                                        }, aVar3), aVar3, 56);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                    } else {
                                        aVar3.h();
                                    }
                                    return s3q0.a;
                                }
                            }, aVar2), aVar2, 1572864, 32);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            us2Var3 = us2Var5;
                            z4 = z7;
                        }
                    }
                }
                z5 = false;
                int i282 = (i4 & 14) | 3072 | ((i9 >> 9) & 896);
                if (androidx.compose.runtime.b.d()) {
                }
                i10 = e.a.$EnumSwitchMapping$0[contentBadgeSize.ordinal()];
                if (i10 != 1) {
                }
                wh50 c3 = androidx.compose.runtime.k.c(u890Var, M, 0);
                if (androidx.compose.runtime.b.d()) {
                }
                final s890 s890Var2 = (s890) c3.getValue();
                if (androidx.compose.runtime.b.d()) {
                }
                i11 = e.a.$EnumSwitchMapping$0[contentBadgeSize.ordinal()];
                if (i11 != 1) {
                }
                uog0 uog0Var22 = uog0Var;
                if (androidx.compose.runtime.b.d()) {
                }
                int i352 = i15 | i16;
                if (androidx.compose.runtime.b.d()) {
                }
                M.K(((contentBadgeMode == ContentBadgeMode.Secondary || contentBadgeAppearance != ContentBadgeAppearance.Design.Overlay) && !((contentBadgeAppearance instanceof ContentBadgeAppearance.a) && ((ContentBadgeAppearance.a) contentBadgeAppearance).e)) ? -1277550158 : -1842326653);
                M.j();
                if (androidx.compose.runtime.b.d()) {
                }
                if (oq.h(-1489502470, M)) {
                }
                int i362 = i17 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW;
                if (androidx.compose.runtime.b.d()) {
                }
                M.K(898743703);
                if (e.a.$EnumSwitchMapping$1[contentBadgeMode.ordinal()] != 2) {
                }
                M.j();
                if (androidx.compose.runtime.b.d()) {
                }
                wh50 c22 = androidx.compose.runtime.k.c(y18Var, M, 0);
                if (androidx.compose.runtime.b.d()) {
                }
                final us2 us2Var52 = us2Var4;
                final String str22 = null;
                final lfj lfjVar2 = null;
                boolean z72 = z6;
                aVar2 = M;
                uov0.a(q630Var, uog0Var22, j2, j2, (y18) c22.getValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(504536715, new wzs() { // from class: xsna.nnu0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if (aVar3.t(intValue & 1, (intValue & 3) != 2)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(504536715, intValue, -1, "com.vk.core.compose.component.VkContentBadge.<anonymous> (VkContentBadge.kt:285)");
                            }
                            pqo pqoVar = hfj.a;
                            long j3 = a2;
                            c9e0[] c9e0VarArr = {pqoVar.b(Float.valueOf(l5g.e(j3))), vcl0.b(l5g.c(14, j3, 1.0f), yfj.a)};
                            final ContentBadgeSize contentBadgeSize2 = contentBadgeSize;
                            final s890 s890Var22 = s890Var2;
                            final ContentBadgeMode contentBadgeMode2 = contentBadgeMode;
                            final ContentBadgeAppearance contentBadgeAppearance2 = contentBadgeAppearance;
                            final lg90 lg90Var3 = lg90Var;
                            final l5g l5gVar3 = l5gVar;
                            final jfj jfjVar2 = jfjVar;
                            final us2 us2Var6 = us2Var;
                            final String str3 = str;
                            final kfj kfjVar2 = kfjVar;
                            final us2 us2Var7 = us2Var52;
                            final String str4 = str22;
                            final lfj lfjVar22 = lfjVar2;
                            final lg90 lg90Var4 = lg90Var2;
                            final l5g l5gVar4 = l5gVar2;
                            final pco pcoVar2 = pcoVar;
                            final boolean z8 = z2;
                            final boolean z9 = z6;
                            rvi.b(c9e0VarArr, kai.c(1854292811, new wzs() { // from class: xsna.pnu0
                                @Override // xsna.wzs
                                public final Object invoke(Object obj3, Object obj4) {
                                    frv0 frv0Var;
                                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj3;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    if (aVar4.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(1854292811, intValue2, -1, "com.vk.core.compose.component.VkContentBadge.<anonymous>.<anonymous> (VkContentBadge.kt:289)");
                                        }
                                        uog0 uog0Var3 = com.vk.core.compose.component.defaults.e.a;
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(22455353, 48, -1, "com.vk.core.compose.component.defaults.VkContentBadgeDefaults.textStyleMiddle (VkContentBadgeDefaults.kt:94)");
                                        }
                                        aVar4.K(-1047239522);
                                        int[] iArr = e.a.$EnumSwitchMapping$0;
                                        final ContentBadgeSize contentBadgeSize3 = ContentBadgeSize.this;
                                        int i37 = iArr[contentBadgeSize3.ordinal()];
                                        if (i37 == 1) {
                                            aVar4.K(104767751);
                                            frv0Var = wlb0.l(aVar4).v0;
                                            aVar4.j();
                                        } else if (i37 == 2) {
                                            aVar4.K(104770087);
                                            frv0Var = wlb0.l(aVar4).v0;
                                            aVar4.j();
                                        } else {
                                            if (i37 != 3) {
                                                throw alb0.c(104765705, aVar4);
                                            }
                                            aVar4.K(104772391);
                                            frv0Var = wlb0.l(aVar4).l0;
                                            aVar4.j();
                                        }
                                        frv0 b = frv0Var.b(aVar4);
                                        aVar4.j();
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                        final s890 s890Var3 = s890Var22;
                                        final ContentBadgeMode contentBadgeMode3 = contentBadgeMode2;
                                        final ContentBadgeAppearance contentBadgeAppearance3 = contentBadgeAppearance2;
                                        final lg90 lg90Var5 = lg90Var3;
                                        final l5g l5gVar5 = l5gVar3;
                                        final jfj jfjVar3 = jfjVar2;
                                        final us2 us2Var8 = us2Var6;
                                        final String str5 = str3;
                                        final kfj kfjVar3 = kfjVar2;
                                        final us2 us2Var9 = us2Var7;
                                        final String str6 = str4;
                                        final lfj lfjVar3 = lfjVar22;
                                        final lg90 lg90Var6 = lg90Var4;
                                        final l5g l5gVar6 = l5gVar4;
                                        final pco pcoVar3 = pcoVar2;
                                        final boolean z10 = z8;
                                        final boolean z11 = z9;
                                        grv0.a(b, kai.c(808947143, new wzs() { // from class: xsna.qnu0
                                            @Override // xsna.wzs
                                            public final Object invoke(Object obj5, Object obj6) {
                                                float f14;
                                                jfj jfjVar4;
                                                kfj kfjVar4;
                                                lfj lfjVar4;
                                                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj5;
                                                int intValue3 = ((Integer) obj6).intValue();
                                                if (aVar5.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.f(808947143, intValue3, -1, "com.vk.core.compose.component.VkContentBadge.<anonymous>.<anonymous>.<anonymous> (VkContentBadge.kt:290)");
                                                    }
                                                    uog0 uog0Var4 = com.vk.core.compose.component.defaults.e.a;
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.f(1979121626, 48, -1, "com.vk.core.compose.component.defaults.VkContentBadgeDefaults.minHeight (VkContentBadgeDefaults.kt:46)");
                                                    }
                                                    int[] iArr2 = e.a.$EnumSwitchMapping$0;
                                                    ContentBadgeSize contentBadgeSize4 = ContentBadgeSize.this;
                                                    int i38 = iArr2[contentBadgeSize4.ordinal()];
                                                    if (i38 == 1) {
                                                        aVar5.K(-734625683);
                                                        if (androidx.compose.runtime.b.d()) {
                                                            androidx.compose.runtime.b.f(-1388536672, 6, -1, "com.vk.core.compose.component.defaults.VkContentBadgeDefaults.getSmallMinHeight (VkContentBadgeDefaults.kt:163)");
                                                        }
                                                        f14 = 16;
                                                        if (androidx.compose.runtime.b.d()) {
                                                            androidx.compose.runtime.b.e();
                                                        }
                                                        aVar5.j();
                                                    } else if (i38 == 2) {
                                                        aVar5.K(-734623922);
                                                        if (androidx.compose.runtime.b.d()) {
                                                            androidx.compose.runtime.b.f(723880286, 6, -1, "com.vk.core.compose.component.defaults.VkContentBadgeDefaults.getMediumMinHeight (VkContentBadgeDefaults.kt:172)");
                                                        }
                                                        f14 = 20;
                                                        if (androidx.compose.runtime.b.d()) {
                                                            androidx.compose.runtime.b.e();
                                                        }
                                                        aVar5.j();
                                                    } else {
                                                        if (i38 != 3) {
                                                            throw alb0.c(-734627055, aVar5);
                                                        }
                                                        aVar5.K(-734622163);
                                                        if (androidx.compose.runtime.b.d()) {
                                                            androidx.compose.runtime.b.f(1046360276, 6, -1, "com.vk.core.compose.component.defaults.VkContentBadgeDefaults.getLargeMinHeight (VkContentBadgeDefaults.kt:181)");
                                                        }
                                                        f14 = 28;
                                                        if (androidx.compose.runtime.b.d()) {
                                                            androidx.compose.runtime.b.e();
                                                        }
                                                        aVar5.j();
                                                    }
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.e();
                                                    }
                                                    q630 C = s200.C(txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f14, 1, q630.a.a), s890Var3);
                                                    a.c cVar = androidx.compose.foundation.layout.a.e;
                                                    dt1.a.getClass();
                                                    androidx.compose.foundation.layout.k a4 = androidx.compose.foundation.layout.j.a(cVar, dt1.a.l, aVar5, 54);
                                                    int hashCode = Long.hashCode(n34.n(aVar5));
                                                    sy90 D = aVar5.D();
                                                    q630 c32 = qri.c(aVar5, C);
                                                    cri.h7.getClass();
                                                    LayoutNode.a aVar6 = cri.a.b;
                                                    if (aVar5.N() == null) {
                                                        n34.r();
                                                        throw null;
                                                    }
                                                    aVar5.H();
                                                    if (aVar5.L()) {
                                                        aVar5.I(aVar6);
                                                    } else {
                                                        aVar5.f();
                                                    }
                                                    k9q0.w(aVar5, a4, cri.a.f);
                                                    k9q0.w(aVar5, D, cri.a.e);
                                                    k9q0.w(aVar5, Integer.valueOf(hashCode), cri.a.g);
                                                    k9q0.t(aVar5, cri.a.h);
                                                    k9q0.w(aVar5, c32, cri.a.d);
                                                    lg90 lg90Var7 = lg90Var5;
                                                    if (lg90Var7 != null) {
                                                        aVar5.K(-1382356703);
                                                        jfjVar4 = lmc.f(lg90Var7, l5gVar5, aVar5, 392, 0);
                                                        aVar5.j();
                                                    } else {
                                                        aVar5.K(-1382142927);
                                                        aVar5.j();
                                                        jfjVar4 = jfjVar3;
                                                    }
                                                    us2 us2Var10 = us2Var8;
                                                    a.C0011a.C0012a c0012a = a.C0011a.a;
                                                    if (us2Var10 != null) {
                                                        aVar5.K(-1382011828);
                                                        if (androidx.compose.runtime.b.d()) {
                                                            androidx.compose.runtime.b.f(-1962529281, 384, -1, "com.vk.core.compose.component.contentbadge.ContentBadge.Middle.Text.Companion.invoke (ContentBadge.kt:112)");
                                                        }
                                                        if (androidx.compose.runtime.b.d()) {
                                                            androidx.compose.runtime.b.f(-773012736, 6, -1, "com.vk.core.compose.component.contentbadge.remember (MiddleTextImpl.kt:80)");
                                                        }
                                                        Object x = aVar5.x();
                                                        String str7 = str5;
                                                        if (x == c0012a) {
                                                            x = new bm20(str7, us2Var10);
                                                            aVar5.R(x);
                                                        }
                                                        bm20 bm20Var = (bm20) x;
                                                        ((zak0) bm20Var.a).setValue(us2Var10);
                                                        ((zak0) bm20Var.b).setValue(str7);
                                                        if (androidx.compose.runtime.b.d()) {
                                                            androidx.compose.runtime.b.e();
                                                        }
                                                        if (androidx.compose.runtime.b.d()) {
                                                            androidx.compose.runtime.b.e();
                                                        }
                                                        aVar5.j();
                                                        kfjVar4 = bm20Var;
                                                    } else {
                                                        aVar5.K(-1381777871);
                                                        aVar5.j();
                                                        kfjVar4 = kfjVar3;
                                                    }
                                                    us2 us2Var11 = us2Var9;
                                                    if (us2Var11 != null) {
                                                        aVar5.K(-1381636294);
                                                        if (androidx.compose.runtime.b.d()) {
                                                            androidx.compose.runtime.b.f(1042856668, 384, -1, "com.vk.core.compose.component.contentbadge.ContentBadge.Subtitle.Text.Companion.invoke (ContentBadge.kt:148)");
                                                        }
                                                        if (androidx.compose.runtime.b.d()) {
                                                            androidx.compose.runtime.b.f(-626955811, 6, -1, "com.vk.core.compose.component.contentbadge.remember (SubtitleTextImpl.kt:55)");
                                                        }
                                                        Object x2 = aVar5.x();
                                                        String str8 = str6;
                                                        if (x2 == c0012a) {
                                                            x2 = new d1n0(str8, us2Var11);
                                                            aVar5.R(x2);
                                                        }
                                                        d1n0 d1n0Var = (d1n0) x2;
                                                        ((zak0) d1n0Var.a).setValue(us2Var11);
                                                        ((zak0) d1n0Var.b).setValue(str8);
                                                        if (androidx.compose.runtime.b.d()) {
                                                            androidx.compose.runtime.b.e();
                                                        }
                                                        if (androidx.compose.runtime.b.d()) {
                                                            androidx.compose.runtime.b.e();
                                                        }
                                                        aVar5.j();
                                                        lfjVar4 = d1n0Var;
                                                    } else {
                                                        aVar5.K(-1381384977);
                                                        aVar5.j();
                                                        lfjVar4 = lfjVar3;
                                                    }
                                                    rnu0.a(contentBadgeSize4, contentBadgeMode3, contentBadgeAppearance3, jfjVar4, kfjVar4, lfjVar4, lg90Var6, l5gVar6, pcoVar3, z10, z11, aVar5, 16777222);
                                                    aVar5.G();
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.e();
                                                    }
                                                } else {
                                                    aVar5.h();
                                                }
                                                return s3q0.a;
                                            }
                                        }, aVar4), aVar4, 48);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                    } else {
                                        aVar4.h();
                                    }
                                    return s3q0.a;
                                }
                            }, aVar3), aVar3, 56);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar3.h();
                        }
                        return s3q0.a;
                    }
                }, aVar2), aVar2, 1572864, 32);
                if (androidx.compose.runtime.b.d()) {
                }
                us2Var3 = us2Var52;
                z4 = z72;
            }
            s = aVar2.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.onu0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int I = ne7.I(i | 1);
                        int I2 = ne7.I(i2);
                        rnu0.g(ContentBadgeSize.this, contentBadgeMode, contentBadgeAppearance, q630Var, lg90Var, l5gVar, jfjVar, us2Var, str, kfjVar, us2Var3, lg90Var2, l5gVar2, z, pcoVar, z2, z4, rv5Var, (androidx.compose.runtime.a) obj, I, I2, i3);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        if ((i2 & 3072) == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if ((i2 & i5) == 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        i8 = i3 & SQLiteDatabase.OPEN_PRIVATECACHE;
        if (i8 == 0) {
        }
        if ((i2 & 805306368) == 0) {
        }
        if (M.t(i4 & 1, (i4 & 306783379) == 306783378 || (i14 & 306783379) != 306783378)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }
}
