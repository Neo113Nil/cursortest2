package xsna;

import androidx.compose.runtime.a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.q630;

/* compiled from: VkTextSkeleton.kt */
/* loaded from: classes17.dex */
public final class erv0 {
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final int i, final frv0 frv0Var, q630 q630Var, float f, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        q630 q630Var2;
        int i4;
        float f2;
        androidx.compose.runtime.a aVar2;
        final q630 q630Var3;
        androidx.compose.runtime.f s;
        int i5;
        q630 q630Var4;
        androidx.compose.runtime.a M = aVar.M(974617095);
        int i6 = (i2 & 6) == 0 ? (M.o(i) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i6 |= M.J(frv0Var) ? 32 : 16;
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i6 |= 384;
        } else if ((i2 & 384) == 0) {
            q630Var2 = q630Var;
            i6 |= M.J(q630Var2) ? 256 : 128;
            i4 = i3 & 8;
            if (i4 == 0) {
                i6 |= 3072;
            } else if ((i2 & 3072) == 0) {
                f2 = f;
                i6 |= M.n(f2) ? 2048 : 1024;
                if (M.t(i6 & 1, (i6 & 1171) != 1170)) {
                    if (i7 != 0) {
                        q630Var4 = q630.a.a;
                        i5 = i4;
                    } else {
                        i5 = i4;
                        q630Var4 = q630Var2;
                    }
                    if (i5 != 0) {
                        f2 = Float.NaN;
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(974617095, i6, -1, "com.vk.core.compose.component.skeleton.text.VkTextSkeleton (VkTextSkeleton.kt:87)");
                    }
                    String[] strArr = new String[i];
                    for (int i8 = 0; i8 < i; i8++) {
                        strArr[i8] = "";
                    }
                    aVar2 = M;
                    b(rl3.Z(strArr, "\n", null, null, null, 62), q630Var4, f2, null, 0, false, 0, 0, null, frv0Var, aVar2, (i6 >> 3) & 1008, i6 & 112, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    q630Var3 = q630Var4;
                } else {
                    aVar2 = M;
                    aVar2.h();
                    q630Var3 = q630Var2;
                }
                final float f3 = f2;
                s = aVar2.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.arv0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            erv0.a(i, frv0Var, q630Var3, f3, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1), i3);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            f2 = f;
            if (M.t(i6 & 1, (i6 & 1171) != 1170)) {
            }
            final float f32 = f2;
            s = aVar2.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        i4 = i3 & 8;
        if (i4 == 0) {
        }
        f2 = f;
        if (M.t(i6 & 1, (i6 & 1171) != 1170)) {
        }
        final float f322 = f2;
        s = aVar2.s();
        if (s != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final String str, final q630 q630Var, float f, t7z t7zVar, int i, boolean z, int i2, int i3, izs izsVar, final frv0 frv0Var, androidx.compose.runtime.a aVar, final int i4, final int i5, final int i6) {
        int i7;
        float f2;
        int i8;
        int i9;
        int i10;
        int i11;
        frv0 frv0Var2;
        androidx.compose.runtime.a aVar2;
        final t7z t7zVar2;
        final int i12;
        final boolean z2;
        final int i13;
        final float f3;
        final int i14;
        final izs izsVar2;
        androidx.compose.runtime.f s;
        final float f4;
        int i15;
        t7z t7zVar3;
        int i16;
        int i17;
        boolean z3;
        int i18;
        androidx.compose.runtime.a M = aVar.M(-1396744462);
        if ((i4 & 6) == 0) {
            i7 = (M.J(str) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        if ((i4 & 48) == 0) {
            i7 |= M.J(q630Var) ? 32 : 16;
        }
        int i19 = i6 & 4;
        if (i19 != 0) {
            i7 |= 384;
        } else if ((i4 & 384) == 0) {
            f2 = f;
            i7 |= M.n(f2) ? 256 : 128;
            int i20 = i7 | 3072;
            if ((i4 & 24576) == 0) {
                i20 = i7 | 11264;
            }
            if ((196608 & i4) == 0) {
                i20 |= 65536;
            }
            i8 = 114819072 | i20;
            i9 = i6 & 512;
            if (i9 == 0) {
                i8 = 920125440 | i20;
            } else if ((805306368 & i4) == 0) {
                i10 = i3;
                i8 |= M.o(i10) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                i11 = i5 | 6;
                if ((i5 & 48) == 0) {
                    frv0Var2 = frv0Var;
                    i11 |= M.J(frv0Var2) ? 32 : 16;
                } else {
                    frv0Var2 = frv0Var;
                }
                if (M.t(i8 & 1, (306783379 & i8) == 306783378 || (i11 & 19) != 18)) {
                    M.V();
                    int i21 = i4 & 1;
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (i21 == 0 || M.i()) {
                        f4 = i19 != 0 ? Float.NaN : f2;
                        t7z t7zVar4 = t7z.d;
                        i15 = i8 & (-516097);
                        int i22 = i9 != 0 ? Integer.MAX_VALUE : i10;
                        Object x = M.x();
                        if (x == c0012a) {
                            x = new g2h0(12);
                            M.R(x);
                        }
                        izsVar2 = (izs) x;
                        t7zVar3 = t7zVar4;
                        i16 = i22;
                        i17 = 1;
                        z3 = true;
                        i18 = 1;
                    } else {
                        M.h();
                        i15 = i8 & (-516097);
                        t7zVar3 = t7zVar;
                        i17 = i;
                        z3 = z;
                        i18 = i2;
                        f4 = f2;
                        i16 = i10;
                        izsVar2 = izsVar;
                    }
                    M.S();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1396744462, i15, i11, "com.vk.core.compose.component.skeleton.text.VkTextSkeleton (VkTextSkeleton.kt:51)");
                    }
                    Object x2 = M.x();
                    if (x2 == c0012a) {
                        x2 = androidx.compose.runtime.k.b(null);
                        M.R(x2);
                    }
                    final wh50 wh50Var = (wh50) x2;
                    q630 e = bu00.e(txj0.f(q630Var, 1.0f), new izs() { // from class: xsna.crv0
                        @Override // xsna.izs
                        public final Object invoke(Object obj) {
                            final ljo0 ljo0Var = (ljo0) wh50Var.getValue();
                            final float f5 = f4;
                            return ((kw8) obj).e(new izs() { // from class: xsna.drv0
                                /* JADX WARN: Removed duplicated region for block: B:20:0x010d  */
                                /* JADX WARN: Removed duplicated region for block: B:23:0x0110  */
                                @Override // xsna.izs
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object invoke(Object obj2) {
                                    long l;
                                    float intBitsToFloat;
                                    drv0 drv0Var = this;
                                    ggj ggjVar = (ggj) obj2;
                                    ljo0 ljo0Var2 = ljo0.this;
                                    if (ljo0Var2 != null) {
                                        kjo0 kjo0Var = ljo0Var2.a;
                                        m540 m540Var = ljo0Var2.b;
                                        int i23 = 0;
                                        long J = fno0.e(kjo0Var.b.a.b) ? kjo0Var.b.a.b : ggjVar.J(m540Var.b(0) - m540Var.g(0));
                                        float f6 = fyj0.a;
                                        long l2 = l2l0.l(14);
                                        l2l0.h(J, l2);
                                        if (Float.compare(fno0.d(J), fno0.d(l2)) <= 0) {
                                            l = l2l0.l(8);
                                        } else {
                                            long l3 = l2l0.l(16);
                                            l2l0.h(J, l3);
                                            l = Float.compare(fno0.d(J), fno0.d(l3)) <= 0 ? l2l0.l(12) : l2l0.l(16);
                                        }
                                        float u0 = ggjVar.u0(l);
                                        int i24 = m540Var.f;
                                        while (i23 < i24) {
                                            float u02 = ggjVar.u0(l2l0.j(1.5d)) + ((ggjVar.u0(J) - u0) / 2) + m540Var.g(i23);
                                            if (i24 == 1) {
                                                float f7 = f5;
                                                if (!Float.isNaN(f7)) {
                                                    intBitsToFloat = Math.min(Float.intBitsToFloat((int) (ggjVar.d() >> 32)), ggjVar.I0(f7));
                                                    long j = l;
                                                    long j2 = l5g.b;
                                                    long floatToRawIntBits = (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(u02) & 4294967295L);
                                                    long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(u0) & 4294967295L);
                                                    float f8 = fyj0.a;
                                                    float I0 = ggjVar.I0(pco.a(fno0.d(j), 10.0f) > 0 ? 2.0f : 4.0f);
                                                    ggjVar = ggjVar;
                                                    oio.C1(ggjVar, j2, floatToRawIntBits, floatToRawIntBits2, (Float.floatToRawIntBits(I0) << 32) | (Float.floatToRawIntBits(I0) & 4294967295L), null, PsExtractor.VIDEO_STREAM_MASK);
                                                    i23++;
                                                    i24 = i24;
                                                    l = j;
                                                    drv0Var = this;
                                                }
                                            }
                                            if (i23 != i24 - 1 || i24 <= 1) {
                                                intBitsToFloat = Float.intBitsToFloat((int) (ggjVar.d() >> 32));
                                            } else {
                                                float intBitsToFloat2 = Float.intBitsToFloat((int) (ggjVar.d() >> 32));
                                                float f9 = fyj0.a;
                                                intBitsToFloat = intBitsToFloat2 * 0.75f;
                                            }
                                            long j3 = l;
                                            long j22 = l5g.b;
                                            long floatToRawIntBits3 = (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(u02) & 4294967295L);
                                            long floatToRawIntBits22 = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(u0) & 4294967295L);
                                            float f82 = fyj0.a;
                                            float I02 = ggjVar.I0(pco.a(fno0.d(j3), 10.0f) > 0 ? 2.0f : 4.0f);
                                            ggjVar = ggjVar;
                                            oio.C1(ggjVar, j22, floatToRawIntBits3, floatToRawIntBits22, (Float.floatToRawIntBits(I02) << 32) | (Float.floatToRawIntBits(I02) & 4294967295L), null, PsExtractor.VIDEO_STREAM_MASK);
                                            i23++;
                                            i24 = i24;
                                            l = j3;
                                            drv0Var = this;
                                        }
                                    }
                                    return s3q0.a;
                                }
                            });
                        }
                    });
                    boolean z4 = (i11 & 14) == 4;
                    Object x3 = M.x();
                    if (z4 || x3 == c0012a) {
                        x3 = new fgm0(5, wh50Var, izsVar2);
                        M.R(x3);
                    }
                    izs izsVar3 = (izs) x3;
                    int i23 = i15 << 6;
                    t7z t7zVar5 = t7z.d;
                    aVar2 = M;
                    yqv0.c(str, e, 0L, null, null, 0, 0, t7zVar3, i17, z3, i18, i16, izsVar3, frv0Var2, aVar2, (i15 & 14) | (458752 & i23) | (234881024 & i23) | (i23 & 1879048192), ((i15 >> 24) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i11 << 6) & 7168), 28);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    f3 = f4;
                    t7zVar2 = t7zVar3;
                    i12 = i17;
                    z2 = z3;
                    i13 = i18;
                    i14 = i16;
                } else {
                    aVar2 = M;
                    aVar2.h();
                    t7zVar2 = t7zVar;
                    i12 = i;
                    z2 = z;
                    i13 = i2;
                    f3 = f2;
                    i14 = i10;
                    izsVar2 = izsVar;
                }
                s = aVar2.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.brv0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            erv0.b(str, q630Var, f3, t7zVar2, i12, z2, i13, i14, izsVar2, frv0Var, (androidx.compose.runtime.a) obj, ne7.I(i4 | 1), ne7.I(i5), i6);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            i10 = i3;
            i11 = i5 | 6;
            if ((i5 & 48) == 0) {
            }
            if (M.t(i8 & 1, (306783379 & i8) == 306783378 || (i11 & 19) != 18)) {
            }
            s = aVar2.s();
            if (s != null) {
            }
        }
        f2 = f;
        int i202 = i7 | 3072;
        if ((i4 & 24576) == 0) {
        }
        if ((196608 & i4) == 0) {
        }
        i8 = 114819072 | i202;
        i9 = i6 & 512;
        if (i9 == 0) {
        }
        i10 = i3;
        i11 = i5 | 6;
        if ((i5 & 48) == 0) {
        }
        if (M.t(i8 & 1, (306783379 & i8) == 306783378 || (i11 & 19) != 18)) {
        }
        s = aVar2.s();
        if (s != null) {
        }
    }
}
