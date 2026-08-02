package xsna;

import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.modal.Mode;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.NoWhenBranchMatchedException;
import org.chromium.net.NetError;
import ru.ok.gl.tf.Tensorflow;
import xsna.f5v0;
import xsna.q630;

/* compiled from: Modal.kt */
/* loaded from: classes17.dex */
public final class a030 {
    public static final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1523241926);
        int i2 = i | 6;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1523241926, i2, -1, "com.vk.core.compose.component.modal.VkDragHandle (Modal.kt:356)");
            }
            String N = d370.N(R.string.vk_modal_drag_handle_description, 0, M);
            q630.a aVar2 = q630.a.a;
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, 1, aVar2);
            boolean J = M.J(N);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new kf5(N, 6);
                M.R(x);
            }
            q630 b = egi0.b(F, false, (izs) x);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            uov0.a(b, f5v0.d, ylu0Var.getIcon().o, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rhi.b, M, 1572912, 56);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.m(q630Var, i, 7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final Mode mode, final gzs gzsVar, q630 q630Var, fdj0 fdj0Var, r5j0 r5j0Var, long j, long j2, float f, long j3, boolean z, wzs wzsVar, boolean z2, gzs gzsVar2, gzs gzsVar3, boolean z3, Boolean bool, wzs wzsVar2, final jai jaiVar, androidx.compose.runtime.a aVar, final int i, final int i2, final int i3) {
        int i4;
        q630 q630Var2;
        fdj0 fdj0Var2;
        int i5;
        boolean z4;
        wzs wzsVar3;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z5;
        int i10;
        int i11;
        int i12;
        androidx.compose.runtime.a aVar2;
        final r5j0 r5j0Var2;
        final long j4;
        final gzs gzsVar4;
        final gzs gzsVar5;
        final Boolean bool2;
        final wzs wzsVar4;
        final boolean z6;
        final boolean z7;
        final q630 q630Var3;
        final fdj0 fdj0Var3;
        final long j5;
        final long j6;
        final boolean z8;
        final wzs wzsVar5;
        final float f2;
        androidx.compose.runtime.f s;
        uog0 uog0Var;
        androidx.compose.runtime.a aVar3;
        int i13;
        int i14;
        boolean z9;
        boolean z10;
        wzs wzsVar6;
        int i15;
        gzs gzsVar6;
        Boolean bool3;
        long j7;
        wzs wzsVar7;
        gzs gzsVar7;
        wzs wzsVar8;
        boolean z11;
        boolean z12;
        gzs gzsVar8;
        q630 q630Var4;
        fdj0 fdj0Var4;
        int i16;
        long j8;
        boolean z13;
        int i17;
        r5j0 r5j0Var3;
        float f3;
        boolean z14;
        long j9;
        boolean z15;
        boolean z16;
        int i18;
        int i19;
        androidx.compose.runtime.a M = aVar.M(-195515011);
        if ((i & 6) == 0) {
            i4 = (M.o(mode.ordinal()) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= M.y(gzsVar) ? 32 : 16;
        }
        int i20 = i3 & 4;
        if (i20 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            q630Var2 = q630Var;
            i4 |= M.J(q630Var2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    fdj0Var2 = fdj0Var;
                    if (M.J(fdj0Var2)) {
                        i19 = 2048;
                        i4 |= i19;
                    }
                } else {
                    fdj0Var2 = fdj0Var;
                }
                i19 = 1024;
                i4 |= i19;
            } else {
                fdj0Var2 = fdj0Var;
            }
            if ((i & 24576) == 0) {
                i4 |= 8192;
            }
            if ((i & 196608) == 0) {
                i4 |= 65536;
            }
            if ((i & 1572864) == 0) {
                i4 |= 524288;
            }
            if ((i & 12582912) == 0) {
                i4 |= 4194304;
            }
            if ((i & 100663296) == 0) {
                i4 |= 33554432;
            }
            if ((i & 805306368) != 0) {
                i5 = 196608;
                if ((i3 & 512) == 0) {
                    z4 = z;
                    if (M.l(z4)) {
                        i18 = SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
                        i4 |= i18;
                    }
                } else {
                    z4 = z;
                }
                i18 = 268435456;
                i4 |= i18;
            } else {
                i5 = 196608;
                z4 = z;
            }
            int i21 = i2 | 6;
            if ((i3 & 2048) != 0) {
                wzsVar3 = wzsVar;
                if (M.y(wzsVar3)) {
                    i6 = 32;
                    int i22 = i21 | i6;
                    i7 = i3 & 4096;
                    if (i7 != 0) {
                        i22 |= 384;
                    } else if ((i2 & 384) == 0) {
                        i22 |= M.l(z2) ? 256 : 128;
                        i8 = i3 & 8192;
                        if (i8 == 0) {
                            i22 |= 3072;
                        } else if ((i2 & 3072) == 0) {
                            i22 |= M.y(gzsVar2) ? 2048 : 1024;
                            int i23 = i22 | 24576;
                            i9 = i3 & 32768;
                            if (i9 != 0) {
                                i23 = 221184 | i22;
                            } else if ((i2 & i5) == 0) {
                                z5 = z3;
                                i23 |= M.l(z5) ? 131072 : 65536;
                                i10 = i3 & 65536;
                                if (i10 == 0) {
                                    i23 |= 1572864;
                                } else if ((i2 & 1572864) == 0) {
                                    i11 = i23 | (M.J(bool) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
                                    i12 = i3 & 131072;
                                    if (i12 != 0) {
                                        i11 |= 12582912;
                                    } else if ((i2 & 12582912) == 0) {
                                        i11 |= M.y(wzsVar2) ? 8388608 : 4194304;
                                    }
                                    if (M.t(i4 & 1, (i4 & 306783379) == 306783378 || (i11 & 38347923) != 38347922)) {
                                        M.V();
                                        if ((i & 1) == 0 || M.i()) {
                                            if (i20 != 0) {
                                                q630Var2 = q630.a.a;
                                            }
                                            if ((i3 & 8) != 0) {
                                                fdj0 H = nr2.H(mode, M, i4 & 14);
                                                i4 &= -7169;
                                                fdj0Var2 = H;
                                            }
                                            uog0 uog0Var2 = f5v0.a;
                                            int[] iArr = f5v0.a.$EnumSwitchMapping$0;
                                            int i24 = iArr[mode.ordinal()];
                                            if (i24 == 1 || i24 == 2) {
                                                uog0Var = f5v0.b;
                                            } else {
                                                if (i24 != 3) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                uog0Var = f5v0.a;
                                            }
                                            uog0 uog0Var3 = uog0Var;
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                            }
                                            iyk0 iyk0Var = rrv0.a;
                                            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.e();
                                            }
                                            long j10 = ylu0Var.getBackground().r;
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                            }
                                            aVar3 = M;
                                            ylu0 ylu0Var2 = (ylu0) aVar3.r(iyk0Var);
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.e();
                                            }
                                            long j11 = ylu0Var2.getText().m;
                                            if (androidx.compose.runtime.b.d()) {
                                                i13 = i4;
                                                i14 = i8;
                                                androidx.compose.runtime.b.f(-1412929589, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-elevation> (VkTheme.kt:170)");
                                            } else {
                                                i13 = i4;
                                                i14 = i8;
                                            }
                                            squ0 squ0Var = (squ0) aVar3.r(rrv0.b);
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.e();
                                            }
                                            squ0Var.getClass();
                                            float f4 = tqu0.c;
                                            if (androidx.compose.runtime.b.d()) {
                                                z9 = false;
                                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                            } else {
                                                z9 = false;
                                            }
                                            ylu0 ylu0Var3 = (ylu0) aVar3.r(iyk0Var);
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.e();
                                            }
                                            long j12 = ylu0Var3.j().a;
                                            int i25 = i13 & (-268427265);
                                            if ((i3 & 512) != 0) {
                                                int i26 = iArr[mode.ordinal()];
                                                z10 = true;
                                                if (i26 == 1 || i26 == 2) {
                                                    z15 = true;
                                                } else {
                                                    if (i26 != 3) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    z15 = z9;
                                                }
                                                z4 = z15;
                                                i25 = i13 & (-2147475457);
                                            } else {
                                                z10 = true;
                                            }
                                            if ((i3 & 2048) != 0) {
                                                wzsVar6 = new hre(3);
                                                i11 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                                            } else {
                                                wzsVar6 = wzsVar3;
                                            }
                                            boolean z17 = i7 != 0 ? z10 : z2;
                                            a.C0011a.C0012a c0012a = a.C0011a.a;
                                            if (i14 != 0) {
                                                Object x = aVar3.x();
                                                if (x == c0012a) {
                                                    i15 = i25;
                                                    x = new aq0(10);
                                                    aVar3.R(x);
                                                } else {
                                                    i15 = i25;
                                                }
                                                gzsVar6 = (gzs) x;
                                            } else {
                                                i15 = i25;
                                                gzsVar6 = gzsVar2;
                                            }
                                            Object x2 = aVar3.x();
                                            if (x2 == c0012a) {
                                                x2 = new aq0(10);
                                                aVar3.R(x2);
                                            }
                                            gzs gzsVar9 = (gzs) x2;
                                            if (i9 != 0) {
                                                z5 = false;
                                            }
                                            bool3 = i10 != 0 ? null : bool;
                                            if (i12 != 0) {
                                                j7 = j12;
                                                gzsVar7 = gzsVar9;
                                                wzsVar8 = wzsVar6;
                                                z11 = z4;
                                                z12 = z17;
                                                wzsVar7 = null;
                                            } else {
                                                j7 = j12;
                                                wzsVar7 = wzsVar2;
                                                gzsVar7 = gzsVar9;
                                                wzsVar8 = wzsVar6;
                                                z11 = z4;
                                                z12 = z17;
                                            }
                                            gzsVar8 = gzsVar6;
                                            q630Var4 = q630Var2;
                                            fdj0Var4 = fdj0Var2;
                                            i16 = i11;
                                            j8 = j10;
                                            z13 = false;
                                            i17 = i15;
                                            r5j0Var3 = uog0Var3;
                                            f3 = f4;
                                            z14 = z5;
                                            j9 = j11;
                                        } else {
                                            M.h();
                                            if ((i3 & 8) != 0) {
                                                i4 &= -7169;
                                            }
                                            int i27 = i4 & (-268427265);
                                            if ((i3 & 512) != 0) {
                                                i27 = i4 & (-2147475457);
                                            }
                                            if ((i3 & 2048) != 0) {
                                                i11 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                                            }
                                            j7 = j3;
                                            z12 = z2;
                                            gzsVar8 = gzsVar2;
                                            gzsVar7 = gzsVar3;
                                            wzsVar7 = wzsVar2;
                                            i17 = i27;
                                            aVar3 = M;
                                            z11 = z4;
                                            wzsVar8 = wzsVar3;
                                            z14 = z5;
                                            q630Var4 = q630Var2;
                                            fdj0Var4 = fdj0Var2;
                                            i16 = i11;
                                            z13 = false;
                                            r5j0Var3 = r5j0Var;
                                            j8 = j;
                                            j9 = j2;
                                            f3 = f;
                                            bool3 = bool;
                                        }
                                        aVar3.S();
                                        boolean z18 = z11;
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(-195515011, i17, i16, "com.vk.core.compose.component.modal.VkModal (Modal.kt:76)");
                                        }
                                        if (epx.f(bool3, Boolean.FALSE)) {
                                            aVar3.K(-614223707);
                                        } else {
                                            aVar3.K(-610687661);
                                            aVar3.K(-614223707);
                                            aVar3.j();
                                        }
                                        aVar3.j();
                                        Mode mode2 = Mode.Card;
                                        if (mode == mode2 || !z18) {
                                            z16 = z13;
                                        } else {
                                            z16 = z13;
                                            z13 = true;
                                        }
                                        aVar2 = aVar3;
                                        Boolean bool4 = bool3;
                                        d(gzsVar, q630Var4, null, fdj0Var4, r5j0Var3, j8, j9, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j7, z13, mode == mode2 ? true : z16, null, wzsVar8, z12, gzsVar8, gzsVar7, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, jaiVar, aVar2, ((i17 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | (i17 & 7168), (i16 << 6) & 4194176, 6, 917764);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                        bool2 = bool4;
                                        z7 = z14;
                                        q630Var3 = q630Var4;
                                        fdj0Var3 = fdj0Var4;
                                        r5j0Var2 = r5j0Var3;
                                        j4 = j8;
                                        j5 = j9;
                                        f2 = f3;
                                        j6 = j7;
                                        wzsVar5 = wzsVar8;
                                        z8 = z12;
                                        gzsVar4 = gzsVar8;
                                        gzsVar5 = gzsVar7;
                                        wzsVar4 = wzsVar7;
                                        z6 = z18;
                                    } else {
                                        aVar2 = M;
                                        aVar2.h();
                                        r5j0Var2 = r5j0Var;
                                        j4 = j;
                                        gzsVar4 = gzsVar2;
                                        gzsVar5 = gzsVar3;
                                        bool2 = bool;
                                        wzsVar4 = wzsVar2;
                                        z6 = z4;
                                        z7 = z5;
                                        q630Var3 = q630Var2;
                                        fdj0Var3 = fdj0Var2;
                                        j5 = j2;
                                        j6 = j3;
                                        z8 = z2;
                                        wzsVar5 = wzsVar3;
                                        f2 = f;
                                    }
                                    s = aVar2.s();
                                    if (s != null) {
                                        s.d = new wzs() { // from class: xsna.uz20
                                            @Override // xsna.wzs
                                            public final Object invoke(Object obj, Object obj2) {
                                                ((Integer) obj2).getClass();
                                                int I = ne7.I(i | 1);
                                                int I2 = ne7.I(i2);
                                                a030.b(Mode.this, gzsVar, q630Var3, fdj0Var3, r5j0Var2, j4, j5, f2, j6, z6, wzsVar5, z8, gzsVar4, gzsVar5, z7, bool2, wzsVar4, jaiVar, (androidx.compose.runtime.a) obj, I, I2, i3);
                                                return s3q0.a;
                                            }
                                        };
                                        return;
                                    }
                                    return;
                                }
                                i11 = i23;
                                i12 = i3 & 131072;
                                if (i12 != 0) {
                                }
                                if (M.t(i4 & 1, (i4 & 306783379) == 306783378 || (i11 & 38347923) != 38347922)) {
                                }
                                s = aVar2.s();
                                if (s != null) {
                                }
                            }
                            z5 = z3;
                            i10 = i3 & 65536;
                            if (i10 == 0) {
                            }
                            i11 = i23;
                            i12 = i3 & 131072;
                            if (i12 != 0) {
                            }
                            if (M.t(i4 & 1, (i4 & 306783379) == 306783378 || (i11 & 38347923) != 38347922)) {
                            }
                            s = aVar2.s();
                            if (s != null) {
                            }
                        }
                        int i232 = i22 | 24576;
                        i9 = i3 & 32768;
                        if (i9 != 0) {
                        }
                        z5 = z3;
                        i10 = i3 & 65536;
                        if (i10 == 0) {
                        }
                        i11 = i232;
                        i12 = i3 & 131072;
                        if (i12 != 0) {
                        }
                        if (M.t(i4 & 1, (i4 & 306783379) == 306783378 || (i11 & 38347923) != 38347922)) {
                        }
                        s = aVar2.s();
                        if (s != null) {
                        }
                    }
                    i8 = i3 & 8192;
                    if (i8 == 0) {
                    }
                    int i2322 = i22 | 24576;
                    i9 = i3 & 32768;
                    if (i9 != 0) {
                    }
                    z5 = z3;
                    i10 = i3 & 65536;
                    if (i10 == 0) {
                    }
                    i11 = i2322;
                    i12 = i3 & 131072;
                    if (i12 != 0) {
                    }
                    if (M.t(i4 & 1, (i4 & 306783379) == 306783378 || (i11 & 38347923) != 38347922)) {
                    }
                    s = aVar2.s();
                    if (s != null) {
                    }
                }
            } else {
                wzsVar3 = wzsVar;
            }
            i6 = 16;
            int i222 = i21 | i6;
            i7 = i3 & 4096;
            if (i7 != 0) {
            }
            i8 = i3 & 8192;
            if (i8 == 0) {
            }
            int i23222 = i222 | 24576;
            i9 = i3 & 32768;
            if (i9 != 0) {
            }
            z5 = z3;
            i10 = i3 & 65536;
            if (i10 == 0) {
            }
            i11 = i23222;
            i12 = i3 & 131072;
            if (i12 != 0) {
            }
            if (M.t(i4 & 1, (i4 & 306783379) == 306783378 || (i11 & 38347923) != 38347922)) {
            }
            s = aVar2.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((i & 196608) == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) != 0) {
        }
        int i212 = i2 | 6;
        if ((i3 & 2048) != 0) {
        }
        i6 = 16;
        int i2222 = i212 | i6;
        i7 = i3 & 4096;
        if (i7 != 0) {
        }
        i8 = i3 & 8192;
        if (i8 == 0) {
        }
        int i232222 = i2222 | 24576;
        i9 = i3 & 32768;
        if (i9 != 0) {
        }
        z5 = z3;
        i10 = i3 & 65536;
        if (i10 == 0) {
        }
        i11 = i232222;
        i12 = i3 & 131072;
        if (i12 != 0) {
        }
        if (M.t(i4 & 1, (i4 & 306783379) == 306783378 || (i11 & 38347923) != 38347922)) {
        }
        s = aVar2.s();
        if (s != null) {
        }
    }

    @ozl
    public static final void c(final gzs gzsVar, q630 q630Var, fdj0 fdj0Var, r5j0 r5j0Var, long j, long j2, float f, long j3, final boolean z, wzs wzsVar, boolean z2, gzs gzsVar2, gzs gzsVar3, final jai jaiVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        final q630 q630Var2;
        final fdj0 fdj0Var2;
        final r5j0 r5j0Var2;
        final long j4;
        final long j5;
        final float f2;
        final long j6;
        final wzs wzsVar2;
        final boolean z3;
        final gzs gzsVar4;
        final gzs gzsVar5;
        fdj0 G;
        wzs wzsVar3;
        gzs gzsVar6;
        gzs gzsVar7;
        boolean z4;
        float f3;
        int i2;
        q630 q630Var3;
        r5j0 r5j0Var3;
        long j7;
        long j8;
        androidx.compose.runtime.a M = aVar.M(1208875429);
        int i3 = i | (M.y(gzsVar) ? 4 : 2) | 810101936;
        if (M.t(i3 & 1, (306783379 & i3) != 306783378)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                G = nr2.G(0, 3, M, null);
                uog0 uog0Var = f5v0.b;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var = rrv0.a;
                ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j9 = ylu0Var.getBackground().r;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j10 = ylu0Var2.getText().m;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1412929589, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-elevation> (VkTheme.kt:170)");
                }
                squ0 squ0Var = (squ0) M.r(rrv0.b);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                squ0Var.getClass();
                float f4 = tqu0.c;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var3 = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j11 = ylu0Var3.j().a;
                int i4 = i3 & (-33547137);
                i60 i60Var = new i60(5);
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = new aq0(10);
                    M.R(x);
                }
                gzs gzsVar8 = (gzs) x;
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = new aq0(10);
                    M.R(x2);
                }
                wzsVar3 = i60Var;
                gzsVar6 = gzsVar8;
                gzsVar7 = (gzs) x2;
                z4 = true;
                f3 = f4;
                i2 = i4;
                q630Var3 = q630.a.a;
                r5j0Var3 = uog0Var;
                j7 = j10;
                j8 = j9;
                j6 = j11;
            } else {
                M.h();
                G = fdj0Var;
                r5j0Var3 = r5j0Var;
                j8 = j;
                j7 = j2;
                f3 = f;
                j6 = j3;
                wzsVar3 = wzsVar;
                z4 = z2;
                gzsVar6 = gzsVar2;
                gzsVar7 = gzsVar3;
                i2 = i3 & (-33547137);
                q630Var3 = q630Var;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1208875429, i2, 224688, "com.vk.core.compose.component.modal.VkModalBottomSheet (Modal.kt:228)");
            }
            aVar2 = M;
            d(gzsVar, q630Var3, null, G, r5j0Var3, j8, j7, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j6, z, false, wzsVar3, null, z4, gzsVar6, gzsVar7, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, jaiVar, aVar2, (i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | 24576, 1797174, 6, 917764);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            f2 = f3;
            wzsVar2 = wzsVar3;
            z3 = z4;
            gzsVar4 = gzsVar6;
            gzsVar5 = gzsVar7;
            j5 = j7;
            j4 = j8;
            r5j0Var2 = r5j0Var3;
            fdj0Var2 = G;
            q630Var2 = q630Var3;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
            fdj0Var2 = fdj0Var;
            r5j0Var2 = r5j0Var;
            j4 = j;
            j5 = j2;
            f2 = f;
            j6 = j3;
            wzsVar2 = wzsVar;
            z3 = z2;
            gzsVar4 = gzsVar2;
            gzsVar5 = gzsVar3;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(q630Var2, fdj0Var2, r5j0Var2, j4, j5, f2, j6, z, wzsVar2, z3, gzsVar4, gzsVar5, jaiVar, i) { // from class: xsna.sz20
                public final /* synthetic */ q630 c;
                public final /* synthetic */ fdj0 d;
                public final /* synthetic */ r5j0 e;
                public final /* synthetic */ long f;
                public final /* synthetic */ long g;
                public final /* synthetic */ float h;
                public final /* synthetic */ long i;
                public final /* synthetic */ boolean j;
                public final /* synthetic */ wzs k;
                public final /* synthetic */ boolean l;
                public final /* synthetic */ gzs m;
                public final /* synthetic */ gzs n;
                public final /* synthetic */ jai o;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(100663297);
                    a030.c(gzs.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final gzs gzsVar, final q630 q630Var, q630 q630Var2, final fdj0 fdj0Var, final r5j0 r5j0Var, final long j, final long j2, final float f, float f2, final long j3, final boolean z, final boolean z2, final wzs wzsVar, final wzs wzsVar2, final boolean z3, final gzs gzsVar2, final gzs gzsVar3, wzs wzsVar3, float f3, wzs wzsVar4, final jai jaiVar, androidx.compose.runtime.a aVar, final int i, final int i2, final int i3, final int i4) {
        int i5;
        q630 q630Var3;
        q630 q630Var4;
        fdj0 fdj0Var2;
        r5j0 r5j0Var2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        androidx.compose.runtime.a aVar2;
        final float f4;
        final wzs wzsVar5;
        final float f5;
        final wzs wzsVar6;
        final q630 q630Var5;
        androidx.compose.runtime.f s;
        wzs wzsVar7;
        float f6;
        q630 q630Var6;
        wzs wzsVar8;
        float f7;
        androidx.compose.runtime.a M = aVar.M(-590755109);
        if ((i & 6) == 0) {
            i5 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i5 = i;
        }
        if ((i & 48) == 0) {
            q630Var3 = q630Var;
            i5 |= M.J(q630Var3) ? 32 : 16;
        } else {
            q630Var3 = q630Var;
        }
        int i15 = i4 & 4;
        if (i15 != 0) {
            i5 |= 384;
        } else if ((i & 384) == 0) {
            q630Var4 = q630Var2;
            i5 |= M.J(q630Var4) ? 256 : 128;
            if ((i & 3072) != 0) {
                fdj0Var2 = fdj0Var;
                i5 |= M.J(fdj0Var2) ? 2048 : 1024;
            } else {
                fdj0Var2 = fdj0Var;
            }
            if ((i & 24576) != 0) {
                r5j0Var2 = r5j0Var;
                i5 |= M.J(r5j0Var2) ? 16384 : 8192;
            } else {
                r5j0Var2 = r5j0Var;
            }
            int i16 = i5;
            if ((i & 196608) == 0) {
                i16 |= M.p(j) ? 131072 : 65536;
            }
            i6 = i & 1572864;
            int i17 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            if (i6 == 0) {
                i16 |= M.p(j2) ? 1048576 : 524288;
            }
            if ((i & 12582912) == 0) {
                i16 |= M.n(f) ? 8388608 : 4194304;
            }
            i7 = i4 & 256;
            if (i7 == 0) {
                i16 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i8 = i7;
                i16 |= M.n(f2) ? 67108864 : 33554432;
                if ((i & 805306368) == 0) {
                    i16 |= M.p(j3) ? 536870912 : 268435456;
                }
                i9 = i16;
                if ((i2 & 6) == 0) {
                    i10 = (M.l(z) ? 4 : 2) | i2;
                } else {
                    i10 = i2;
                }
                if ((i2 & 48) == 0) {
                    i10 |= M.l(z2) ? 32 : 16;
                }
                if ((i2 & 384) == 0) {
                    i10 |= M.y(wzsVar) ? 256 : 128;
                }
                if ((i2 & 3072) == 0) {
                    i10 |= M.y(wzsVar2) ? 2048 : 1024;
                }
                if ((i2 & 24576) == 0) {
                    i10 |= M.l(z3) ? 16384 : 8192;
                }
                if ((i2 & 196608) == 0) {
                    i10 |= M.y(gzsVar2) ? 131072 : 65536;
                }
                if ((i2 & 1572864) == 0) {
                    if (!M.y(gzsVar3)) {
                        i17 = 524288;
                    }
                    i10 |= i17;
                }
                i11 = i4 & 131072;
                if (i11 != 0) {
                    i10 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i10 |= M.y(wzsVar3) ? 8388608 : 4194304;
                }
                i12 = i4 & SQLiteDatabase.OPEN_PRIVATECACHE;
                if (i12 != 0) {
                    i10 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    i10 |= M.n(f3) ? 67108864 : 33554432;
                }
                i13 = i4 & 524288;
                if (i13 != 0) {
                    i10 |= 805306368;
                } else if ((i2 & 805306368) == 0) {
                    i10 |= M.y(wzsVar4) ? 536870912 : 268435456;
                }
                if ((i3 & 6) == 0) {
                    i14 = i3 | (M.y(jaiVar) ? 4 : 2);
                } else {
                    i14 = i3;
                }
                if (M.t(i9 & 1, ((i9 & 306783379) != 306783378 && (i10 & 306783379) == 306783378 && (i14 & 3) == 2) ? false : true)) {
                    M.V();
                    if ((i & 1) == 0 || M.i()) {
                        if (i15 != 0) {
                            q630Var4 = q630.a.a;
                        }
                        float f8 = i8 != 0 ? Tensorflow.FRAME_WIDTH : f2;
                        wzs wzsVar9 = i11 != 0 ? null : wzsVar3;
                        float f9 = i12 != 0 ? 0.5f : f3;
                        if (i13 != 0) {
                            f6 = f8;
                            wzsVar7 = null;
                        } else {
                            wzsVar7 = wzsVar4;
                            f6 = f8;
                        }
                        q630Var6 = q630Var4;
                        wzsVar8 = wzsVar9;
                        f7 = f9;
                    } else {
                        M.h();
                        f6 = f2;
                        wzsVar8 = wzsVar3;
                        f7 = f3;
                        wzsVar7 = wzsVar4;
                        q630Var6 = q630Var4;
                    }
                    M.S();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-590755109, i9, i10, "com.vk.core.compose.component.modal.VkModalSheetImpl (Modal.kt:273)");
                    }
                    int i18 = (i9 & 14) | ((i9 >> 9) & 112) | ((i9 >> 3) & 896);
                    int i19 = i9 << 6;
                    aVar2 = M;
                    nix.b(gzsVar, r5j0Var2, fdj0Var2, q630Var3, q630Var6, new xx20(gzsVar2, gzsVar3, z3, j, j2, f, j3, f6, z2 ? 8 : 0, wzsVar, wzsVar2, 1), z ? rhi.a : null, wzsVar8, f7, wzsVar7, jaiVar, aVar2, (i19 & 57344) | i18 | (i19 & 7168) | (29360128 & i10) | (234881024 & i10) | (1879048192 & i10), i14 & 14);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    q630Var5 = q630Var6;
                    wzsVar5 = wzsVar8;
                    f5 = f7;
                    wzsVar6 = wzsVar7;
                    f4 = f6;
                } else {
                    aVar2 = M;
                    aVar2.h();
                    f4 = f2;
                    wzsVar5 = wzsVar3;
                    f5 = f3;
                    wzsVar6 = wzsVar4;
                    q630Var5 = q630Var4;
                }
                s = aVar2.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.vz20
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int I = ne7.I(i | 1);
                            int I2 = ne7.I(i2);
                            int I3 = ne7.I(i3);
                            a030.d(gzs.this, q630Var, q630Var5, fdj0Var, r5j0Var, j, j2, f, f4, j3, z, z2, wzsVar, wzsVar2, z3, gzsVar2, gzsVar3, wzsVar5, f5, wzsVar6, jaiVar, (androidx.compose.runtime.a) obj, I, I2, I3, i4);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            i8 = i7;
            if ((i & 805306368) == 0) {
            }
            i9 = i16;
            if ((i2 & 6) == 0) {
            }
            if ((i2 & 48) == 0) {
            }
            if ((i2 & 384) == 0) {
            }
            if ((i2 & 3072) == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            if ((i2 & 196608) == 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            i11 = i4 & 131072;
            if (i11 != 0) {
            }
            i12 = i4 & SQLiteDatabase.OPEN_PRIVATECACHE;
            if (i12 != 0) {
            }
            i13 = i4 & 524288;
            if (i13 != 0) {
            }
            if ((i3 & 6) == 0) {
            }
            if (M.t(i9 & 1, ((i9 & 306783379) != 306783378 && (i10 & 306783379) == 306783378 && (i14 & 3) == 2) ? false : true)) {
            }
            s = aVar2.s();
            if (s != null) {
            }
        }
        q630Var4 = q630Var2;
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        int i162 = i5;
        if ((i & 196608) == 0) {
        }
        i6 = i & 1572864;
        int i172 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        if (i6 == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i7 = i4 & 256;
        if (i7 == 0) {
        }
        i8 = i7;
        if ((i & 805306368) == 0) {
        }
        i9 = i162;
        if ((i2 & 6) == 0) {
        }
        if ((i2 & 48) == 0) {
        }
        if ((i2 & 384) == 0) {
        }
        if ((i2 & 3072) == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if ((i2 & 196608) == 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        i11 = i4 & 131072;
        if (i11 != 0) {
        }
        i12 = i4 & SQLiteDatabase.OPEN_PRIVATECACHE;
        if (i12 != 0) {
        }
        i13 = i4 & 524288;
        if (i13 != 0) {
        }
        if ((i3 & 6) == 0) {
        }
        if (M.t(i9 & 1, ((i9 & 306783379) != 306783378 && (i10 & 306783379) == 306783378 && (i14 & 3) == 2) ? false : true)) {
        }
        s = aVar2.s();
        if (s != null) {
        }
    }
}
