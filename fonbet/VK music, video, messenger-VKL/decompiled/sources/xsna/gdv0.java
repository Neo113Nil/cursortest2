package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.compose.component.defaults.PictureRadius;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.q630;

/* compiled from: VkPicture.kt */
/* loaded from: classes17.dex */
public final class gdv0 {
    public static final void a(final phw phwVar, final float f, final q630 q630Var, List list, final boolean z, z190 z190Var, wzs wzsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final List list2;
        final z190 z190Var2;
        final wzs wzsVar2;
        r5j0 r5j0Var;
        androidx.compose.runtime.a M = aVar.M(942521089);
        if ((i & 6) == 0) {
            i2 = (M.J(phwVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.n(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= M.l(z) ? 16384 : 8192;
        }
        int i4 = i3 | 1769472;
        if (M.t(i4 & 1, (599187 & i4) != 599186)) {
            list2 = EmptyList.b;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(942521089, i4, -1, "com.vk.core.compose.component.VkPicture (VkPicture.kt:178)");
            }
            if (z) {
                M.K(-1849957753);
                r5j0Var = xcv0.b(f, null, ((i4 >> 3) & 14) | 384, 2);
                M.j();
            } else {
                M.K(-1849895133);
                M.j();
                r5j0Var = androidx.compose.ui.graphics.e.a;
            }
            int i5 = i4 << 6;
            int i6 = i4 << 3;
            int i7 = (i4 & 14) | 12779520 | (i5 & 7168) | (57344 & i6) | (i6 & 3670016) | (i5 & 234881024) | ((i4 << 21) & 1879048192);
            wep wepVar = wep.a;
            z190Var2 = tgp.a;
            jai jaiVar = xni.e;
            hhx.a(phwVar, r5j0Var, r5j0Var, f, list2, wepVar, z190Var2, false, jaiVar, q630Var, false, null, M, i7, 0, 3072);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            wzsVar2 = jaiVar;
        } else {
            M.h();
            list2 = list;
            z190Var2 = z190Var;
            wzsVar2 = wzsVar;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.zcv0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    gdv0.a(phw.this, f, q630Var, list2, z, z190Var2, wzsVar2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final efj efjVar, final float f, final List list, q630 q630Var, final PictureRadius pictureRadius, z190 z190Var, wzs wzsVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        int i4;
        z190 z190Var2;
        int i5;
        androidx.compose.runtime.a aVar2;
        final wzs wzsVar2;
        final q630 q630Var3;
        final z190 z190Var3;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(-2116841887);
        if ((i & 6) == 0) {
            i3 = (M.J(efjVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.n(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.J(list) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 2048 : 1024;
            if ((i & 24576) == 0) {
                i3 |= M.o(pictureRadius == null ? -1 : pictureRadius.ordinal()) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else if ((196608 & i) == 0) {
                z190Var2 = z190Var;
                i3 |= M.J(z190Var2) ? 131072 : 65536;
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    i3 |= M.y(wzsVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                    if (M.t(i3 & 1, (599187 & i3) == 599186)) {
                        aVar2 = M;
                        aVar2.h();
                        wzsVar2 = wzsVar;
                        q630Var3 = q630Var2;
                        z190Var3 = z190Var2;
                    } else {
                        q630 q630Var4 = i6 != 0 ? q630.a.a : q630Var2;
                        z190 z190Var4 = i4 != 0 ? tgp.a : z190Var2;
                        wzs wzsVar3 = i5 != 0 ? xni.a : wzsVar;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-2116841887, i3, -1, "com.vk.core.compose.component.VkPicture (VkPicture.kt:56)");
                        }
                        aVar2 = M;
                        d(efjVar, byc0.b(f, f), list, q630Var4, pictureRadius, z190Var4, wzsVar3, aVar2, i3 & 4194190, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        q630Var3 = q630Var4;
                        z190Var3 = z190Var4;
                        wzsVar2 = wzsVar3;
                    }
                    s = aVar2.s();
                    if (s == null) {
                        s.d = new wzs() { // from class: xsna.ddv0
                            @Override // xsna.wzs
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                gdv0.b(efj.this, f, list, q630Var3, pictureRadius, z190Var3, wzsVar2, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                                return s3q0.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                if (M.t(i3 & 1, (599187 & i3) == 599186)) {
                }
                s = aVar2.s();
                if (s == null) {
                }
            }
            z190Var2 = z190Var;
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            if (M.t(i3 & 1, (599187 & i3) == 599186)) {
            }
            s = aVar2.s();
            if (s == null) {
            }
        }
        q630Var2 = q630Var;
        if ((i & 24576) == 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        z190Var2 = z190Var;
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        if (M.t(i3 & 1, (599187 & i3) == 599186)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final efj efjVar, final float f, q630 q630Var, final PictureRadius pictureRadius, m2k0 m2k0Var, z190 z190Var, wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        int i4;
        m2k0 m2k0Var2;
        int i5;
        int i6;
        androidx.compose.runtime.a aVar2;
        final z190 z190Var2;
        final q630 q630Var3;
        final m2k0 m2k0Var3;
        final wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar2;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(-1862983682);
        if ((i & 6) == 0) {
            i3 = (M.J(efjVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.n(f) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 256 : 128;
            if ((i & 3072) == 0) {
                i3 |= M.o(pictureRadius == null ? -1 : pictureRadius.ordinal()) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                m2k0Var2 = m2k0Var;
                i3 |= M.J(m2k0Var2) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    i3 |= M.J(z190Var) ? 131072 : 65536;
                    i6 = i3 | 1572864;
                    if (M.t(i6 & 1, (599187 & i6) == 599186)) {
                        aVar2 = M;
                        aVar2.h();
                        z190Var2 = z190Var;
                        q630Var3 = q630Var2;
                        m2k0Var3 = m2k0Var2;
                        wzsVar2 = wzsVar;
                    } else {
                        q630 q630Var4 = i7 != 0 ? q630.a.a : q630Var2;
                        if (i4 != 0) {
                            m2k0Var2 = rep.a;
                        }
                        z190 z190Var3 = i5 != 0 ? tgp.a : z190Var;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1862983682, i6, -1, "com.vk.core.compose.component.VkPicture (VkPicture.kt:118)");
                        }
                        List singletonList = Collections.singletonList(m2k0Var2);
                        int i8 = i6 << 3;
                        int i9 = (i6 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | (i8 & 7168) | (i8 & 57344) | (458752 & i6) | (i6 & 3670016);
                        jai jaiVar = xni.c;
                        aVar2 = M;
                        b(efjVar, f, singletonList, q630Var4, pictureRadius, z190Var3, jaiVar, aVar2, i9, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        m2k0Var3 = m2k0Var2;
                        q630Var3 = q630Var4;
                        z190Var2 = z190Var3;
                        wzsVar2 = jaiVar;
                    }
                    s = aVar2.s();
                    if (s == null) {
                        s.d = new wzs() { // from class: xsna.edv0
                            @Override // xsna.wzs
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                gdv0.c(efj.this, f, q630Var3, pictureRadius, m2k0Var3, z190Var2, wzsVar2, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                                return s3q0.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                i6 = i3 | 1572864;
                if (M.t(i6 & 1, (599187 & i6) == 599186)) {
                }
                s = aVar2.s();
                if (s == null) {
                }
            }
            m2k0Var2 = m2k0Var;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i3 | 1572864;
            if (M.t(i6 & 1, (599187 & i6) == 599186)) {
            }
            s = aVar2.s();
            if (s == null) {
            }
        }
        q630Var2 = q630Var;
        if ((i & 3072) == 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        m2k0Var2 = m2k0Var;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i6 = i3 | 1572864;
        if (M.t(i6 & 1, (599187 & i6) == 599186)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final efj efjVar, final long j, final List list, q630 q630Var, PictureRadius pictureRadius, z190 z190Var, wzs wzsVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        int i4;
        int i5;
        z190 z190Var2;
        int i6;
        wzs wzsVar2;
        androidx.compose.runtime.a aVar2;
        final PictureRadius pictureRadius2;
        final q630 q630Var3;
        final z190 z190Var3;
        final wzs wzsVar3;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(-1133635262);
        if ((i & 6) == 0) {
            i3 = (M.J(efjVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.p(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.J(list) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= M.o(pictureRadius == null ? -1 : pictureRadius.ordinal()) ? 16384 : 8192;
            }
            i5 = i2 & 32;
            if (i5 == 0) {
                i3 |= 196608;
            } else if ((196608 & i) == 0) {
                z190Var2 = z190Var;
                i3 |= M.J(z190Var2) ? 131072 : 65536;
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    wzsVar2 = wzsVar;
                    i3 |= M.y(wzsVar2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                    if (M.t(i3 & 1, (i3 & 599187) == 599186)) {
                        aVar2 = M;
                        aVar2.h();
                        pictureRadius2 = pictureRadius;
                        q630Var3 = q630Var2;
                        z190Var3 = z190Var2;
                        wzsVar3 = wzsVar2;
                    } else {
                        q630 q630Var4 = i7 != 0 ? q630.a.a : q630Var2;
                        PictureRadius pictureRadius3 = i4 != 0 ? PictureRadius.Medium : pictureRadius;
                        z190 z190Var4 = i5 != 0 ? tgp.a : z190Var2;
                        wzs wzsVar4 = i6 != 0 ? xni.b : wzsVar2;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1133635262, i3, -1, "com.vk.core.compose.component.VkPicture (VkPicture.kt:83)");
                        }
                        uog0 b = xcv0.b(xcv0.e(j), pictureRadius3, ((i3 >> 9) & 112) | 384, 0);
                        int i8 = i3 << 6;
                        aVar2 = M;
                        hhx.b(efjVar, b, b, j, list, wep.a, z190Var4, false, wzsVar4, q630Var4, false, null, aVar2, (i3 & 14) | 12779520 | (i8 & 7168) | (57344 & i8) | ((i3 << 3) & 3670016) | (i8 & 234881024) | ((i3 << 18) & 1879048192), 0, 3072);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        pictureRadius2 = pictureRadius3;
                        z190Var3 = z190Var4;
                        wzsVar3 = wzsVar4;
                        q630Var3 = q630Var4;
                    }
                    s = aVar2.s();
                    if (s == null) {
                        s.d = new wzs() { // from class: xsna.fdv0
                            @Override // xsna.wzs
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                gdv0.d(efj.this, j, list, q630Var3, pictureRadius2, z190Var3, wzsVar3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                                return s3q0.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                wzsVar2 = wzsVar;
                if (M.t(i3 & 1, (i3 & 599187) == 599186)) {
                }
                s = aVar2.s();
                if (s == null) {
                }
            }
            z190Var2 = z190Var;
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            wzsVar2 = wzsVar;
            if (M.t(i3 & 1, (i3 & 599187) == 599186)) {
            }
            s = aVar2.s();
            if (s == null) {
            }
        }
        q630Var2 = q630Var;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        z190Var2 = z190Var;
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        wzsVar2 = wzsVar;
        if (M.t(i3 & 1, (i3 & 599187) == 599186)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }

    public static final void e(final phw phwVar, q630 q630Var, List list, final PictureRadius pictureRadius, z190 z190Var, wzs wzsVar, androidx.compose.runtime.a aVar, int i) {
        List list2;
        z190 z190Var2;
        androidx.compose.runtime.a aVar2;
        wzs wzsVar2;
        androidx.compose.runtime.a M = aVar.M(1487198585);
        int i2 = i | (M.J(phwVar) ? 4 : 2) | (M.J(q630Var) ? 32 : 16) | 221568;
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            final EmptyList emptyList = EmptyList.b;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1487198585, i2, -1, "com.vk.core.compose.component.VkPicture (VkPicture.kt:144)");
            }
            ua8.a(q630Var, null, false, kai.c(-417166257, new yzs() { // from class: xsna.adv0
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    va8 va8Var = (va8) obj;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar3.J(va8Var) ? 4 : 2;
                    }
                    if (aVar3.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-417166257, intValue, -1, "com.vk.core.compose.component.VkPicture.<anonymous> (VkPicture.kt:146)");
                        }
                        float f = xcv0.a;
                        uog0 b = xcv0.b(Math.min(va8Var.h(), va8Var.i()), PictureRadius.this, 384, 0);
                        hhx.b(phwVar, b, b, byc0.b(va8Var.h(), va8Var.i()), emptyList, wep.a, tgp.a, false, xni.d, q630.a.a, false, null, aVar3, 818085888, 0, 3072);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), M, ((i2 >> 3) & 14) | 3072, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            z190Var2 = tgp.a;
            aVar2 = M;
            list2 = emptyList;
            wzsVar2 = xni.d;
        } else {
            M.h();
            list2 = list;
            z190Var2 = z190Var;
            aVar2 = M;
            wzsVar2 = wzsVar;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new rug(phwVar, q630Var, list2, pictureRadius, z190Var2, wzsVar2, i);
        }
    }

    public static final void f(final phw phwVar, final q630 q630Var, List list, final boolean z, z190 z190Var, wzs wzsVar, androidx.compose.runtime.a aVar, final int i) {
        final List list2;
        final z190 z190Var2;
        androidx.compose.runtime.a aVar2;
        final wzs wzsVar2;
        androidx.compose.runtime.a M = aVar.M(-973106111);
        int i2 = i | (M.J(phwVar) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        int i3 = i2 | 221568;
        if (M.t(i3 & 1, (74899 & i3) != 74898)) {
            final EmptyList emptyList = EmptyList.b;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-973106111, i3, -1, "com.vk.core.compose.component.VkPicture (VkPicture.kt:214)");
            }
            ua8.a(q630Var, null, false, kai.c(-1508270185, new yzs() { // from class: xsna.bdv0
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    r5j0 r5j0Var;
                    va8 va8Var = (va8) obj;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar3.J(va8Var) ? 4 : 2;
                    }
                    if (aVar3.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1508270185, intValue, -1, "com.vk.core.compose.component.VkPicture.<anonymous> (VkPicture.kt:216)");
                        }
                        if (z) {
                            aVar3.K(1070815516);
                            float f = xcv0.a;
                            r5j0Var = xcv0.b(Math.min(va8Var.h(), va8Var.i()), null, 384, 2);
                            aVar3.j();
                        } else {
                            aVar3.K(1070898565);
                            aVar3.j();
                            r5j0Var = androidx.compose.ui.graphics.e.a;
                        }
                        r5j0 r5j0Var2 = r5j0Var;
                        hhx.b(phwVar, r5j0Var2, r5j0Var2, byc0.b(va8Var.h(), va8Var.i()), emptyList, wep.a, tgp.a, false, xni.f, q630.a.a, false, null, aVar3, 818085888, 0, 3072);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), M, ((i3 >> 3) & 14) | 3072, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            z190Var2 = tgp.a;
            aVar2 = M;
            list2 = emptyList;
            wzsVar2 = xni.f;
        } else {
            M.h();
            list2 = list;
            z190Var2 = z190Var;
            aVar2 = M;
            wzsVar2 = wzsVar;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.cdv0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    gdv0.f(phw.this, q630Var, list2, z, z190Var2, wzsVar2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
