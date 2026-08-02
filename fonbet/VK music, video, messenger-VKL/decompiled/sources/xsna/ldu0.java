package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.List;
import xsna.q630;

/* compiled from: VkAvatar.kt */
/* loaded from: classes17.dex */
public final class ldu0 {
    /* JADX WARN: Removed duplicated region for block: B:105:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final efj efjVar, final float f, final List list, q630 q630Var, final k18 k18Var, boolean z, z190 z190Var, gzs gzsVar, wzs wzsVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        List list2;
        q630 q630Var2;
        k18 k18Var2;
        boolean z2;
        int i4;
        z190 z190Var2;
        int i5;
        int i6;
        gzs gzsVar2;
        int i7;
        int i8;
        int i9;
        androidx.compose.runtime.a aVar2;
        final q630 q630Var3;
        final boolean z3;
        final z190 z190Var3;
        final gzs gzsVar3;
        final wzs wzsVar2;
        androidx.compose.runtime.f s;
        int i10;
        wzs wzsVar3;
        gzs gzsVar4;
        boolean z4;
        q630 q630Var4;
        z190 z190Var4;
        int i11;
        androidx.compose.runtime.a M = aVar.M(1463156939);
        if ((i & 6) == 0) {
            i3 = (M.J(efjVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.n(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            list2 = list;
            i3 |= M.J(list2) ? 256 : 128;
        } else {
            list2 = list;
        }
        int i12 = i2 & 8;
        if (i12 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 2048 : 1024;
            if ((i & 24576) != 0) {
                k18Var2 = k18Var;
                i3 |= M.J(k18Var2) ? 16384 : 8192;
            } else {
                k18Var2 = k18Var;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    z2 = z;
                    if (M.l(z2)) {
                        i11 = 131072;
                        i3 |= i11;
                    }
                } else {
                    z2 = z;
                }
                i11 = 65536;
                i3 |= i11;
            } else {
                z2 = z;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else if ((1572864 & i) == 0) {
                z190Var2 = z190Var;
                i3 |= M.J(z190Var2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                i5 = i2 & 128;
                if (i5 != 0) {
                    i3 |= 12582912;
                    i6 = 12582912;
                    gzsVar2 = gzsVar;
                } else {
                    i6 = 12582912;
                    gzsVar2 = gzsVar;
                    if ((i & 12582912) == 0) {
                        i3 |= M.y(gzsVar2) ? 8388608 : 4194304;
                    }
                }
                i7 = i2 & 256;
                if (i7 != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i8 = i7;
                    i3 |= M.y(wzsVar) ? 67108864 : 33554432;
                    i9 = i3;
                    if (M.t(i9 & 1, (i3 & 38347923) == 38347922)) {
                        aVar2 = M;
                        aVar2.h();
                        q630Var3 = q630Var2;
                        z3 = z2;
                        z190Var3 = z190Var2;
                        gzsVar3 = gzsVar2;
                        wzsVar2 = wzsVar;
                    } else {
                        M.V();
                        if ((i & 1) == 0 || M.i()) {
                            if (i12 != 0) {
                                q630Var2 = q630.a.a;
                            }
                            if ((i2 & 32) != 0) {
                                f870.A().c((i9 >> 3) & 14, M);
                                i10 = i9 & (-458753);
                                z2 = true;
                            } else {
                                i10 = i9;
                            }
                            if (i4 != 0) {
                                z190Var2 = tgp.a;
                            }
                            if (i5 != 0) {
                                gzsVar2 = null;
                            }
                            if (i8 != 0) {
                                wzsVar3 = oni.a;
                                q630Var4 = q630Var2;
                                z4 = z2;
                                z190Var4 = z190Var2;
                                gzsVar4 = gzsVar2;
                                M.S();
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1463156939, i10, -1, "com.vk.core.compose.component.VkAvatar (VkAvatar.kt:54)");
                                }
                                zm20 A = f870.A();
                                int i13 = (i10 >> 3) & 14;
                                r5j0 e = A.e(i13, M);
                                r5j0 e2 = A.e(i13, M);
                                int i14 = i10 << 6;
                                aVar2 = M;
                                hhx.a(efjVar, e, e2, f, list2, k18Var2, z190Var4, true, wzsVar3, q630Var4, z4, gzsVar4, aVar2, (i10 & 14) | i6 | (i14 & 7168) | (i14 & 57344) | (458752 & (i10 << 3)) | (3670016 & i10) | (234881024 & i10) | ((i10 << 18) & 1879048192), ((i10 >> 15) & 14) | ((i10 >> 18) & 112), 0);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                z190Var3 = z190Var4;
                                wzsVar2 = wzsVar3;
                                q630Var3 = q630Var4;
                                z3 = z4;
                                gzsVar3 = gzsVar4;
                            }
                        } else {
                            M.h();
                            if ((i2 & 32) != 0) {
                                i10 = i9 & (-458753);
                            } else {
                                wzsVar3 = wzsVar;
                                q630Var4 = q630Var2;
                                z4 = z2;
                                gzsVar4 = gzsVar2;
                                i10 = i9;
                                z190Var4 = z190Var2;
                                M.S();
                                if (androidx.compose.runtime.b.d()) {
                                }
                                zm20 A2 = f870.A();
                                int i132 = (i10 >> 3) & 14;
                                r5j0 e3 = A2.e(i132, M);
                                r5j0 e22 = A2.e(i132, M);
                                int i142 = i10 << 6;
                                aVar2 = M;
                                hhx.a(efjVar, e3, e22, f, list2, k18Var2, z190Var4, true, wzsVar3, q630Var4, z4, gzsVar4, aVar2, (i10 & 14) | i6 | (i142 & 7168) | (i142 & 57344) | (458752 & (i10 << 3)) | (3670016 & i10) | (234881024 & i10) | ((i10 << 18) & 1879048192), ((i10 >> 15) & 14) | ((i10 >> 18) & 112), 0);
                                if (androidx.compose.runtime.b.d()) {
                                }
                                z190Var3 = z190Var4;
                                wzsVar2 = wzsVar3;
                                q630Var3 = q630Var4;
                                z3 = z4;
                                gzsVar3 = gzsVar4;
                            }
                        }
                        wzsVar3 = wzsVar;
                        q630Var4 = q630Var2;
                        z4 = z2;
                        z190Var4 = z190Var2;
                        gzsVar4 = gzsVar2;
                        M.S();
                        if (androidx.compose.runtime.b.d()) {
                        }
                        zm20 A22 = f870.A();
                        int i1322 = (i10 >> 3) & 14;
                        r5j0 e32 = A22.e(i1322, M);
                        r5j0 e222 = A22.e(i1322, M);
                        int i1422 = i10 << 6;
                        aVar2 = M;
                        hhx.a(efjVar, e32, e222, f, list2, k18Var2, z190Var4, true, wzsVar3, q630Var4, z4, gzsVar4, aVar2, (i10 & 14) | i6 | (i1422 & 7168) | (i1422 & 57344) | (458752 & (i10 << 3)) | (3670016 & i10) | (234881024 & i10) | ((i10 << 18) & 1879048192), ((i10 >> 15) & 14) | ((i10 >> 18) & 112), 0);
                        if (androidx.compose.runtime.b.d()) {
                        }
                        z190Var3 = z190Var4;
                        wzsVar2 = wzsVar3;
                        q630Var3 = q630Var4;
                        z3 = z4;
                        gzsVar3 = gzsVar4;
                    }
                    s = aVar2.s();
                    if (s == null) {
                        s.d = new wzs() { // from class: xsna.jdu0
                            @Override // xsna.wzs
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                ldu0.a(efj.this, f, list, q630Var3, k18Var, z3, z190Var3, gzsVar3, wzsVar2, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                                return s3q0.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                i8 = i7;
                i9 = i3;
                if (M.t(i9 & 1, (i3 & 38347923) == 38347922)) {
                }
                s = aVar2.s();
                if (s == null) {
                }
            }
            z190Var2 = z190Var;
            i5 = i2 & 128;
            if (i5 != 0) {
            }
            i7 = i2 & 256;
            if (i7 != 0) {
            }
            i8 = i7;
            i9 = i3;
            if (M.t(i9 & 1, (i3 & 38347923) == 38347922)) {
            }
            s = aVar2.s();
            if (s == null) {
            }
        }
        q630Var2 = q630Var;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        z190Var2 = z190Var;
        i5 = i2 & 128;
        if (i5 != 0) {
        }
        i7 = i2 & 256;
        if (i7 != 0) {
        }
        i8 = i7;
        i9 = i3;
        if (M.t(i9 & 1, (i3 & 38347923) == 38347922)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final efj efjVar, final float f, q630 q630Var, iy5 iy5Var, k18 k18Var, boolean z, z190 z190Var, gzs<s3q0> gzsVar, wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        int i4;
        iy5 iy5Var2;
        int i5;
        k18 k18Var2;
        boolean z2;
        int i6;
        z190 z190Var2;
        int i7;
        int i8;
        int i9;
        androidx.compose.runtime.a aVar2;
        final q630 q630Var3;
        final iy5 iy5Var3;
        final k18 k18Var3;
        final boolean z3;
        final z190 z190Var3;
        final gzs<s3q0> gzsVar2;
        final wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar2;
        androidx.compose.runtime.f s;
        int i10;
        gzs<s3q0> gzsVar3;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar3;
        int i11;
        androidx.compose.runtime.a M = aVar.M(58890016);
        if ((i & 6) == 0) {
            i3 = (M.J(efjVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.n(f) ? 32 : 16;
        }
        int i12 = i2 & 4;
        if (i12 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                iy5Var2 = iy5Var;
                i3 |= M.J(iy5Var2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    k18Var2 = k18Var;
                    i3 |= M.J(k18Var2) ? 16384 : 8192;
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            z2 = z;
                            if (M.l(z2)) {
                                i11 = 131072;
                                i3 |= i11;
                            }
                        } else {
                            z2 = z;
                        }
                        i11 = 65536;
                        i3 |= i11;
                    } else {
                        z2 = z;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        z190Var2 = z190Var;
                        i3 |= M.J(z190Var2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                        i7 = i2 & 128;
                        if (i7 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i8 = i7;
                            i3 |= M.y(gzsVar) ? 8388608 : 4194304;
                            i9 = i3 | 100663296;
                            if (M.t(i9 & 1, (i9 & 38347923) == 38347922)) {
                                aVar2 = M;
                                aVar2.h();
                                q630Var3 = q630Var2;
                                iy5Var3 = iy5Var2;
                                k18Var3 = k18Var2;
                                z3 = z2;
                                z190Var3 = z190Var2;
                                gzsVar2 = gzsVar;
                                wzsVar2 = wzsVar;
                            } else {
                                M.V();
                                if ((i & 1) == 0 || M.i()) {
                                    if (i12 != 0) {
                                        q630Var2 = q630.a.a;
                                    }
                                    if (i4 != 0) {
                                        iy5Var2 = rep.a;
                                    }
                                    if (i5 != 0) {
                                        k18Var2 = wep.a;
                                    }
                                    if ((i2 & 32) != 0) {
                                        f870.A().c((i9 >> 3) & 14, M);
                                        i10 = i9 & (-458753);
                                        z2 = true;
                                    } else {
                                        i10 = i9;
                                    }
                                    if (i6 != 0) {
                                        z190Var2 = tgp.a;
                                    }
                                    gzsVar3 = i8 != 0 ? null : gzsVar;
                                    wzsVar3 = oni.b;
                                } else {
                                    M.h();
                                    if ((i2 & 32) != 0) {
                                        i10 = i9 & (-458753);
                                        gzsVar3 = gzsVar;
                                        wzsVar3 = wzsVar;
                                    } else {
                                        gzsVar3 = gzsVar;
                                        wzsVar3 = wzsVar;
                                        i10 = i9;
                                    }
                                }
                                k18 k18Var4 = k18Var2;
                                boolean z4 = z2;
                                z190 z190Var4 = z190Var2;
                                q630 q630Var4 = q630Var2;
                                M.S();
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(58890016, i10, -1, "com.vk.core.compose.component.VkAvatar (VkAvatar.kt:103)");
                                }
                                aVar2 = M;
                                a(efjVar, f, Collections.singletonList(iy5Var2), q630Var4, k18Var4, z4, z190Var4, gzsVar3, wzsVar3, aVar2, (i10 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i10 << 3) & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | (29360128 & i10) | (i10 & 234881024), 0);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                iy5Var3 = iy5Var2;
                                q630Var3 = q630Var4;
                                k18Var3 = k18Var4;
                                z3 = z4;
                                z190Var3 = z190Var4;
                                gzsVar2 = gzsVar3;
                                wzsVar2 = wzsVar3;
                            }
                            s = aVar2.s();
                            if (s == null) {
                                s.d = new wzs() { // from class: xsna.kdu0
                                    @Override // xsna.wzs
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        ldu0.b(efj.this, f, q630Var3, iy5Var3, k18Var3, z3, z190Var3, gzsVar2, wzsVar2, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                                        return s3q0.a;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        i8 = i7;
                        i9 = i3 | 100663296;
                        if (M.t(i9 & 1, (i9 & 38347923) == 38347922)) {
                        }
                        s = aVar2.s();
                        if (s == null) {
                        }
                    }
                    z190Var2 = z190Var;
                    i7 = i2 & 128;
                    if (i7 != 0) {
                    }
                    i8 = i7;
                    i9 = i3 | 100663296;
                    if (M.t(i9 & 1, (i9 & 38347923) == 38347922)) {
                    }
                    s = aVar2.s();
                    if (s == null) {
                    }
                }
                k18Var2 = k18Var;
                if ((196608 & i) != 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                z190Var2 = z190Var;
                i7 = i2 & 128;
                if (i7 != 0) {
                }
                i8 = i7;
                i9 = i3 | 100663296;
                if (M.t(i9 & 1, (i9 & 38347923) == 38347922)) {
                }
                s = aVar2.s();
                if (s == null) {
                }
            }
            iy5Var2 = iy5Var;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            k18Var2 = k18Var;
            if ((196608 & i) != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            z190Var2 = z190Var;
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            i8 = i7;
            i9 = i3 | 100663296;
            if (M.t(i9 & 1, (i9 & 38347923) == 38347922)) {
            }
            s = aVar2.s();
            if (s == null) {
            }
        }
        q630Var2 = q630Var;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        iy5Var2 = iy5Var;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        k18Var2 = k18Var;
        if ((196608 & i) != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        z190Var2 = z190Var;
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        i8 = i7;
        i9 = i3 | 100663296;
        if (M.t(i9 & 1, (i9 & 38347923) == 38347922)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }
}
