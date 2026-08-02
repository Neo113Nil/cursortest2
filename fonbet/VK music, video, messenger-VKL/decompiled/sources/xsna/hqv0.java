package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.input.InputSelect$State;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabase;
import org.chromium.net.NetError;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.b6u0;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: VkTextArea.kt */
/* loaded from: classes17.dex */
public final class hqv0 {
    public static final void a(gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(50799767);
        int i2 = (M.y(gzsVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(50799767, i2, -1, "com.vk.core.compose.component.input.ClearIcon (VkTextArea.kt:240)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1243383292, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Cancel24> (VkSdkIcons.kt:226)");
            }
            lg90 b = or.b(M, 1833859693, R.drawable.vk_icon_cancel_24, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            s1v.k();
            on20 on20Var = on20.a;
            nzu0.c(gzsVar, b, d370.N(R.string.vk_accessibility_clear_input, 0, M), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, sd9.i(M), false, null, false, null, null, M, (i2 & 14) | 64, 2008);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fne(gzsVar, i, 13);
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-305947137);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-305947137, i, -1, "com.vk.core.compose.component.input.DefaultIconSpacer (VkTextArea.kt:235)");
            }
            f9t.e(txj0.v(q630.a.a, kqu0.t), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new nfi(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final String str, final izs izsVar, final q630 q630Var, String str2, InputSelect$State inputSelect$State, int i, int i2, boolean z, boolean z2, long j, long j2, frv0 frv0Var, rgy rgyVar, uey ueyVar, b6u0 b6u0Var, sg50 sg50Var, izs izsVar2, xbo0 xbo0Var, androidx.compose.runtime.a aVar, final int i3, final int i4) {
        int i5;
        q630 q630Var2;
        String str3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z3;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        androidx.compose.runtime.a aVar2;
        final InputSelect$State inputSelect$State2;
        final boolean z4;
        final frv0 frv0Var2;
        final rgy rgyVar2;
        final uey ueyVar2;
        final b6u0 b6u0Var2;
        final sg50 sg50Var2;
        final izs izsVar3;
        final xbo0 xbo0Var2;
        final boolean z5;
        final int i19;
        final int i20;
        final String str4;
        final long j3;
        final long j4;
        androidx.compose.runtime.f s;
        long u;
        int i21;
        boolean z6;
        izs izsVar4;
        b6u0 b6u0Var3;
        long j5;
        boolean z7;
        sg50 sg50Var3;
        xbo0 xbo0Var3;
        int i22;
        uey ueyVar3;
        boolean z8;
        frv0 frv0Var3;
        izs izsVar5;
        rgy rgyVar3;
        boolean z9;
        InputSelect$State inputSelect$State3;
        boolean z10;
        boolean z11;
        int i23;
        androidx.compose.runtime.a M = aVar.M(710136943);
        if ((i3 & 6) == 0) {
            i5 = (M.J(str) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            q630Var2 = q630Var;
            i5 |= M.J(q630Var2) ? 256 : 128;
        } else {
            q630Var2 = q630Var;
        }
        int i24 = i4 & 8;
        if (i24 != 0) {
            i5 |= 3072;
        } else if ((i3 & 3072) == 0) {
            str3 = str2;
            i5 |= M.J(str3) ? 2048 : 1024;
            i6 = i4 & 16;
            if (i6 == 0) {
                i5 |= 24576;
            } else if ((i3 & 24576) == 0) {
                i5 |= M.o(inputSelect$State == null ? -1 : inputSelect$State.ordinal()) ? 16384 : 8192;
            }
            i7 = i4 & 32;
            if (i7 == 0) {
                i5 |= 196608;
                i8 = i;
            } else {
                i8 = i;
                if ((i3 & 196608) == 0) {
                    i5 |= M.o(i8) ? 131072 : 65536;
                }
            }
            i9 = i4 & 64;
            int i25 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            if (i9 == 0) {
                i5 |= 1572864;
                i10 = i2;
            } else {
                i10 = i2;
                if ((i3 & 1572864) == 0) {
                    i5 |= M.o(i10) ? 1048576 : 524288;
                }
            }
            i11 = i4 & 128;
            if (i11 == 0) {
                i5 |= 12582912;
                z3 = z;
            } else {
                z3 = z;
                if ((i3 & 12582912) == 0) {
                    i5 |= M.l(z3) ? 8388608 : 4194304;
                }
            }
            if ((i3 & 100663296) == 0) {
                i5 |= 33554432;
            }
            if ((i3 & 805306368) == 0) {
                i5 |= 268435456;
            }
            i12 = i4 & 4096;
            if (i12 == 0) {
                i13 = 402;
            } else {
                i13 = 18 | (M.J(rgyVar) ? 256 : 128);
            }
            int i26 = i13 | 224256;
            i14 = i4 & 65536;
            if (i14 == 0) {
                i15 = i13 | 1797120;
            } else {
                if (!M.y(izsVar2)) {
                    i25 = 524288;
                }
                i15 = i26 | i25;
            }
            i16 = i4 & 131072;
            if (i16 == 0) {
                i17 = i15 | 12582912;
            } else {
                i17 = i15 | (M.J(xbo0Var) ? 8388608 : 4194304);
            }
            i18 = i17 | 905969664;
            if (M.t(i5 & 1, (i5 & 306783379) == 306783378 || (i18 & 306783379) != 306783378)) {
                aVar2 = M;
                aVar2.h();
                inputSelect$State2 = inputSelect$State;
                z4 = z2;
                frv0Var2 = frv0Var;
                rgyVar2 = rgyVar;
                ueyVar2 = ueyVar;
                b6u0Var2 = b6u0Var;
                sg50Var2 = sg50Var;
                izsVar3 = izsVar2;
                xbo0Var2 = xbo0Var;
                z5 = z3;
                i19 = i8;
                i20 = i10;
                str4 = str3;
                j3 = j;
                j4 = j2;
            } else {
                M.V();
                int i27 = i3 & 1;
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (i27 == 0 || M.i()) {
                    if (i24 != 0) {
                        str3 = null;
                    }
                    InputSelect$State inputSelect$State4 = i6 != 0 ? InputSelect$State.Default : inputSelect$State;
                    if (i7 != 0) {
                        i8 = 1;
                    }
                    if (i9 != 0) {
                        i10 = Integer.MAX_VALUE;
                    }
                    if (i11 != 0) {
                        z3 = true;
                    }
                    boolean z12 = !z3;
                    s1v.k();
                    on20 on20Var = on20.a;
                    u = sd9.u(M);
                    i21 = i5 & (-2113929217);
                    s1v.k();
                    long p = sd9.p(M);
                    s1v.k();
                    frv0 f = on20.a.f(M);
                    int i28 = i18 & NetError.ERR_PROXY_AUTH_REQUESTED;
                    rgy rgyVar4 = i12 != 0 ? rgy.e : rgyVar;
                    uey ueyVar4 = uey.d;
                    Object x = M.x();
                    if (x == c0012a) {
                        x = ir.h(M);
                    }
                    sg50 sg50Var4 = (sg50) x;
                    if (i14 != 0) {
                        Object x2 = M.x();
                        if (x2 == c0012a) {
                            z6 = z3;
                            x2 = new pzt0(4);
                            M.R(x2);
                        } else {
                            z6 = z3;
                        }
                        izsVar4 = (izs) x2;
                    } else {
                        z6 = z3;
                        izsVar4 = izsVar2;
                    }
                    xbo0 xbo0Var4 = i16 != 0 ? null : xbo0Var;
                    b6u0Var3 = b6u0.a.a;
                    j5 = p;
                    z7 = true;
                    sg50Var3 = sg50Var4;
                    xbo0Var3 = xbo0Var4;
                    i22 = i28;
                    ueyVar3 = ueyVar4;
                    z8 = false;
                    frv0Var3 = f;
                    izsVar5 = izsVar4;
                    rgyVar3 = rgyVar4;
                    z9 = z12;
                    inputSelect$State3 = inputSelect$State4;
                    z10 = z6;
                } else {
                    M.h();
                    int i29 = i5 & (-2113929217);
                    int i30 = i18 & NetError.ERR_PROXY_AUTH_REQUESTED;
                    inputSelect$State3 = inputSelect$State;
                    u = j;
                    j5 = j2;
                    frv0Var3 = frv0Var;
                    rgyVar3 = rgyVar;
                    ueyVar3 = ueyVar;
                    sg50Var3 = sg50Var;
                    xbo0Var3 = xbo0Var;
                    z10 = z3;
                    i22 = i30;
                    z7 = true;
                    z8 = false;
                    b6u0Var3 = b6u0Var;
                    izsVar5 = izsVar2;
                    i21 = i29;
                    z9 = z2;
                }
                M.S();
                if (androidx.compose.runtime.b.d()) {
                    z11 = z9;
                    androidx.compose.runtime.b.f(710136943, i21, i22, "com.vk.core.compose.component.input.VkTextArea (VkTextArea.kt:83)");
                } else {
                    z11 = z9;
                }
                Object x3 = M.x();
                if (x3 == c0012a) {
                    i23 = i21;
                    x3 = or.a(str, 0L, 6, M);
                } else {
                    i23 = i21;
                }
                wh50 wh50Var = (wh50) x3;
                tho0 a = tho0.a((tho0) wh50Var.getValue(), str);
                boolean z13 = (i23 & 14) == 4 ? z7 : z8;
                Object x4 = M.x();
                if (z13 || x4 == c0012a) {
                    x4 = androidx.compose.runtime.k.b(str);
                    M.R(x4);
                }
                wh50 wh50Var2 = (wh50) x4;
                boolean J = M.J(wh50Var2);
                int i31 = i22;
                if ((i23 & 112) != 32) {
                    z7 = z8;
                }
                boolean z14 = J | z7;
                Object x5 = M.x();
                if (z14 || x5 == c0012a) {
                    x5 = new tv7(izsVar, wh50Var, wh50Var2);
                    M.R(x5);
                }
                int i32 = i31 & 2147483646;
                aVar2 = M;
                q630 q630Var3 = q630Var2;
                String str5 = str3;
                boolean z15 = z11;
                d(a, (izs) x5, q630Var3, str5, inputSelect$State3, i8, i10, z10, z15, u, j5, frv0Var3, rgyVar3, ueyVar3, b6u0Var3, sg50Var3, izsVar5, xbo0Var3, null, false, aVar2, i23 & 2147483520, i32, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                str4 = str5;
                inputSelect$State2 = inputSelect$State3;
                i19 = i8;
                i20 = i10;
                z5 = z10;
                z4 = z15;
                j3 = u;
                j4 = j5;
                frv0Var2 = frv0Var3;
                rgyVar2 = rgyVar3;
                ueyVar2 = ueyVar3;
                b6u0Var2 = b6u0Var3;
                sg50Var2 = sg50Var3;
                izsVar3 = izsVar5;
                xbo0Var2 = xbo0Var3;
            }
            s = aVar2.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.eqv0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int I = ne7.I(i3 | 1);
                        hqv0.c(str, izsVar, q630Var, str4, inputSelect$State2, i19, i20, z5, z4, j3, j4, frv0Var2, rgyVar2, ueyVar2, b6u0Var2, sg50Var2, izsVar3, xbo0Var2, (androidx.compose.runtime.a) obj, I, i4);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        str3 = str2;
        i6 = i4 & 16;
        if (i6 == 0) {
        }
        i7 = i4 & 32;
        if (i7 == 0) {
        }
        i9 = i4 & 64;
        int i252 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        if (i9 == 0) {
        }
        i11 = i4 & 128;
        if (i11 == 0) {
        }
        if ((i3 & 100663296) == 0) {
        }
        if ((i3 & 805306368) == 0) {
        }
        i12 = i4 & 4096;
        if (i12 == 0) {
        }
        int i262 = i13 | 224256;
        i14 = i4 & 65536;
        if (i14 == 0) {
        }
        i16 = i4 & 131072;
        if (i16 == 0) {
        }
        i18 = i17 | 905969664;
        if (M.t(i5 & 1, (i5 & 306783379) == 306783378 || (i18 & 306783379) != 306783378)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final tho0 tho0Var, final izs<? super tho0, s3q0> izsVar, final q630 q630Var, final String str, final InputSelect$State inputSelect$State, int i, int i2, final boolean z, boolean z2, long j, long j2, frv0 frv0Var, rgy rgyVar, uey ueyVar, b6u0 b6u0Var, sg50 sg50Var, izs<? super ljo0, s3q0> izsVar2, xbo0 xbo0Var, wbo0 wbo0Var, boolean z3, androidx.compose.runtime.a aVar, final int i3, final int i4, final int i5) {
        int i6;
        String str2;
        int i7;
        int i8;
        boolean z4;
        long j3;
        int i9;
        frv0 frv0Var2;
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
        final long j4;
        final rgy rgyVar2;
        final uey ueyVar2;
        final b6u0 b6u0Var2;
        final sg50 sg50Var2;
        final izs<? super ljo0, s3q0> izsVar3;
        final wbo0 wbo0Var2;
        final boolean z5;
        final frv0 frv0Var3;
        androidx.compose.runtime.a aVar2;
        final xbo0 xbo0Var2;
        final int i20;
        final int i21;
        final boolean z6;
        final long j5;
        androidx.compose.runtime.f s;
        long j6;
        frv0 frv0Var4;
        sg50 sg50Var3;
        izs<? super ljo0, s3q0> izsVar4;
        wbo0 wbo0Var3;
        sg50 sg50Var4;
        boolean z7;
        uey ueyVar3;
        final xbo0 xbo0Var3;
        long j7;
        izs<? super ljo0, s3q0> izsVar5;
        int i22;
        b6u0 b6u0Var3;
        boolean z8;
        int i23;
        int i24;
        rgy rgyVar3;
        int i25;
        int i26;
        androidx.compose.runtime.a M = aVar.M(-1351223620);
        if ((i3 & 6) == 0) {
            i6 = (M.J(tho0Var) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i6 |= M.J(q630Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            str2 = str;
            i6 |= M.J(str2) ? 2048 : 1024;
        } else {
            str2 = str;
        }
        if ((i3 & 24576) == 0) {
            i6 |= M.o(inputSelect$State == null ? -1 : inputSelect$State.ordinal()) ? 16384 : 8192;
        }
        int i27 = i5 & 32;
        if (i27 != 0) {
            i6 |= 196608;
            i7 = i;
        } else {
            i7 = i;
            if ((i3 & 196608) == 0) {
                i6 |= M.o(i7) ? 131072 : 65536;
            }
        }
        int i28 = i5 & 64;
        int i29 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        if (i28 != 0) {
            i6 |= 1572864;
            i8 = i2;
        } else {
            i8 = i2;
            if ((i3 & 1572864) == 0) {
                i6 |= M.o(i8) ? 1048576 : 524288;
            }
        }
        if ((i3 & 12582912) == 0) {
            i6 |= M.l(z) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            if ((i5 & 256) == 0) {
                z4 = z2;
                if (M.l(z4)) {
                    i26 = 67108864;
                    i6 |= i26;
                }
            } else {
                z4 = z2;
            }
            i26 = 33554432;
            i6 |= i26;
        } else {
            z4 = z2;
        }
        if ((i3 & 805306368) == 0) {
            i6 |= ((i5 & 512) == 0 && M.p(j)) ? 536870912 : 268435456;
        }
        if ((i4 & 6) == 0) {
            j3 = j2;
            i9 = i4 | (((i5 & 1024) == 0 && M.p(j3)) ? 4 : 2);
        } else {
            j3 = j2;
            i9 = i4;
        }
        if ((i4 & 48) == 0) {
            if ((i5 & 2048) == 0) {
                frv0Var2 = frv0Var;
                if (M.J(frv0Var2)) {
                    i25 = 32;
                    i9 |= i25;
                }
            } else {
                frv0Var2 = frv0Var;
            }
            i25 = 16;
            i9 |= i25;
        } else {
            frv0Var2 = frv0Var;
        }
        int i30 = i5 & 4096;
        if (i30 != 0) {
            i9 |= 384;
            i10 = i30;
        } else {
            i10 = i30;
            if ((i4 & 384) == 0) {
                i9 |= M.J(rgyVar) ? 256 : 128;
                i11 = i5 & 8192;
                if (i11 == 0) {
                    i9 |= 3072;
                    i12 = i11;
                } else {
                    i12 = i11;
                    if ((i4 & 3072) == 0) {
                        i9 |= M.J(ueyVar) ? 2048 : 1024;
                        i13 = i5 & 16384;
                        if (i13 != 0) {
                            i9 |= 24576;
                            i14 = i13;
                        } else {
                            i14 = i13;
                            if ((i4 & 24576) == 0) {
                                i9 |= M.J(b6u0Var) ? 16384 : 8192;
                                i15 = i5 & 32768;
                                if (i15 == 0) {
                                    i9 |= 196608;
                                } else if ((i4 & 196608) == 0) {
                                    i9 |= M.J(sg50Var) ? 131072 : 65536;
                                }
                                i16 = i5 & 65536;
                                if (i16 == 0) {
                                    i9 |= 1572864;
                                } else if ((i4 & 1572864) == 0) {
                                    if (!M.y(izsVar2)) {
                                        i29 = 524288;
                                    }
                                    i9 |= i29;
                                }
                                i17 = i5 & 131072;
                                if (i17 == 0) {
                                    i9 |= 12582912;
                                } else if ((i4 & 12582912) == 0) {
                                    i9 |= M.J(xbo0Var) ? 8388608 : 4194304;
                                }
                                i18 = i5 & SQLiteDatabase.OPEN_PRIVATECACHE;
                                if (i18 == 0) {
                                    i9 |= 100663296;
                                } else if ((i4 & 100663296) == 0) {
                                    i9 |= M.J(wbo0Var) ? 67108864 : 33554432;
                                }
                                i19 = i5 & 524288;
                                if (i19 == 0) {
                                    i9 |= 805306368;
                                } else if ((i4 & 805306368) == 0) {
                                    i9 |= M.l(z3) ? 536870912 : 268435456;
                                }
                                if (M.t(i6 & 1, (i6 & 306783379) == 306783378 || (i9 & 306783379) != 306783378)) {
                                    M.h();
                                    j4 = j;
                                    rgyVar2 = rgyVar;
                                    ueyVar2 = ueyVar;
                                    b6u0Var2 = b6u0Var;
                                    sg50Var2 = sg50Var;
                                    izsVar3 = izsVar2;
                                    wbo0Var2 = wbo0Var;
                                    z5 = z3;
                                    frv0Var3 = frv0Var2;
                                    aVar2 = M;
                                    xbo0Var2 = xbo0Var;
                                    long j8 = j3;
                                    i20 = i7;
                                    i21 = i8;
                                    z6 = z4;
                                    j5 = j8;
                                } else {
                                    M.V();
                                    if ((i3 & 1) == 0 || M.i()) {
                                        if (i27 != 0) {
                                            i7 = 1;
                                        }
                                        if (i28 != 0) {
                                            i8 = Integer.MAX_VALUE;
                                        }
                                        if ((i5 & 256) != 0) {
                                            i6 &= -234881025;
                                            z4 = !z;
                                        }
                                        if ((i5 & 512) != 0) {
                                            s1v.k();
                                            on20 on20Var = on20.a;
                                            j6 = sd9.u(M);
                                            i6 &= -1879048193;
                                        } else {
                                            j6 = j;
                                        }
                                        if ((i5 & 1024) != 0) {
                                            s1v.k();
                                            on20 on20Var2 = on20.a;
                                            i9 &= -15;
                                            j3 = sd9.p(M);
                                        }
                                        if ((i5 & 2048) != 0) {
                                            s1v.k();
                                            frv0Var4 = on20.a.f(M);
                                            i9 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                                        } else {
                                            frv0Var4 = frv0Var2;
                                        }
                                        rgy rgyVar4 = i10 != 0 ? rgy.e : rgyVar;
                                        uey ueyVar4 = i12 != 0 ? uey.d : ueyVar;
                                        b6u0 b6u0Var4 = i14 != 0 ? b6u0.a.a : b6u0Var;
                                        frv0 frv0Var5 = frv0Var4;
                                        a.C0011a.C0012a c0012a = a.C0011a.a;
                                        rgy rgyVar5 = rgyVar4;
                                        if (i15 != 0) {
                                            Object x = M.x();
                                            if (x == c0012a) {
                                                x = ir.h(M);
                                            }
                                            sg50Var3 = (sg50) x;
                                        } else {
                                            sg50Var3 = sg50Var;
                                        }
                                        sg50 sg50Var5 = sg50Var3;
                                        if (i16 != 0) {
                                            Object x2 = M.x();
                                            if (x2 == c0012a) {
                                                x2 = new zzl0(10);
                                                M.R(x2);
                                            }
                                            izsVar4 = (izs) x2;
                                        } else {
                                            izsVar4 = izsVar2;
                                        }
                                        xbo0 xbo0Var4 = i17 != 0 ? null : xbo0Var;
                                        wbo0Var3 = i18 == 0 ? wbo0Var : null;
                                        sg50Var4 = sg50Var5;
                                        z7 = i19 == 0 ? z3 : false;
                                        ueyVar3 = ueyVar4;
                                        xbo0Var3 = xbo0Var4;
                                        j7 = j6;
                                        frv0Var2 = frv0Var5;
                                        izsVar5 = izsVar4;
                                        i22 = i9;
                                        b6u0Var3 = b6u0Var4;
                                        z8 = z4;
                                        i23 = i8;
                                        i24 = i6;
                                        rgyVar3 = rgyVar5;
                                    } else {
                                        M.h();
                                        if ((i5 & 256) != 0) {
                                            i6 &= -234881025;
                                        }
                                        if ((i5 & 512) != 0) {
                                            i6 &= -1879048193;
                                        }
                                        if ((i5 & 1024) != 0) {
                                            i9 &= -15;
                                        }
                                        if ((i5 & 2048) != 0) {
                                            i9 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                                        }
                                        j7 = j;
                                        ueyVar3 = ueyVar;
                                        sg50Var4 = sg50Var;
                                        izsVar5 = izsVar2;
                                        xbo0Var3 = xbo0Var;
                                        wbo0Var3 = wbo0Var;
                                        z7 = z3;
                                        z8 = z4;
                                        i22 = i9;
                                        b6u0Var3 = b6u0Var;
                                        i23 = i8;
                                        i24 = i6;
                                        rgyVar3 = rgyVar;
                                    }
                                    M.S();
                                    final wbo0 wbo0Var4 = wbo0Var3;
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(-1351223620, i24, i22, "com.vk.core.compose.component.input.VkTextArea (VkTextArea.kt:160)");
                                    }
                                    nmo0 d = frv0Var2.a.d(new nmo0(j7, 0L, null, null, 0L, null, null, 0, 0L, null, null, 0, 16777214));
                                    s1v.k();
                                    on20 on20Var3 = on20.a;
                                    int i31 = i22;
                                    float f = on20.d;
                                    s1v.k();
                                    q630 a = o19.a(txj0.i(q630Var, f, on20.e), z ? 1.0f : 0.64f);
                                    s1v.k();
                                    final frv0 frv0Var6 = frv0Var2;
                                    final long j9 = j3;
                                    final int i32 = i7;
                                    final int i33 = i23;
                                    final String str3 = str2;
                                    final sg50 sg50Var6 = sg50Var4;
                                    final boolean z9 = z7;
                                    xbo0 xbo0Var5 = xbo0Var3;
                                    int i34 = i24 >> 12;
                                    int i35 = (i24 & 14) | 100663296 | (i24 & 112) | (i34 & 7168) | (i34 & 57344);
                                    int i36 = i31 << 12;
                                    wt6.a(tho0Var, izsVar, a, z, z8, d, rgyVar3, ueyVar3, false, i23, i32, b6u0Var3, izsVar5, sg50Var4, new rek0(on20Var3.b(M)), kai.c(-963056417, new yzs() { // from class: xsna.fqv0
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // xsna.yzs
                                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                                            final wzs wzsVar = (wzs) obj;
                                            androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                                            int intValue = ((Integer) obj3).intValue();
                                            if ((intValue & 6) == 0) {
                                                intValue |= aVar3.y(wzsVar) ? 4 : 2;
                                            }
                                            if (aVar3.t(intValue & 1, (intValue & 19) != 18)) {
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.f(-963056417, intValue, -1, "com.vk.core.compose.component.input.VkTextArea.<anonymous> (VkTextArea.kt:184)");
                                                }
                                                boolean booleanValue = ((Boolean) sa30.j(sg50.this, aVar3, 0).getValue()).booleanValue();
                                                s1v.k();
                                                q630 C = s200.C(q630.a.a, on20.g);
                                                dt1.a.getClass();
                                                ty6.b bVar = dt1.a.k;
                                                final xbo0 xbo0Var6 = xbo0Var3;
                                                final wbo0 wbo0Var5 = wbo0Var4;
                                                final boolean z10 = z9;
                                                final izs izsVar6 = izsVar;
                                                final tho0 tho0Var2 = tho0Var;
                                                final String str4 = str3;
                                                final long j10 = j9;
                                                final int i37 = i32;
                                                final int i38 = i33;
                                                final frv0 frv0Var7 = frv0Var6;
                                                rqv0.a(inputSelect$State, booleanValue, z, C, null, bVar, null, kai.c(424476922, new yzs() { // from class: xsna.dqv0
                                                    @Override // xsna.yzs
                                                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                                        tho0 tho0Var3;
                                                        androidx.compose.runtime.a aVar4;
                                                        int i39;
                                                        androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj5;
                                                        int intValue2 = ((Integer) obj6).intValue();
                                                        if (aVar5.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                                                            if (androidx.compose.runtime.b.d()) {
                                                                androidx.compose.runtime.b.f(424476922, intValue2, -1, "com.vk.core.compose.component.input.VkTextArea.<anonymous>.<anonymous> (VkTextArea.kt:193)");
                                                            }
                                                            dt1.a.getClass();
                                                            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.k, aVar5, 48);
                                                            int hashCode = Long.hashCode(n34.n(aVar5));
                                                            sy90 D = aVar5.D();
                                                            q630 c = qri.c(aVar5, q630.a.a);
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
                                                            cri.a.c cVar = cri.a.f;
                                                            k9q0.w(aVar5, a2, cVar);
                                                            cri.a.e eVar = cri.a.e;
                                                            k9q0.w(aVar5, D, eVar);
                                                            Integer valueOf = Integer.valueOf(hashCode);
                                                            cri.a.b bVar2 = cri.a.g;
                                                            k9q0.w(aVar5, valueOf, bVar2);
                                                            cri.a.C2678a c2678a = cri.a.h;
                                                            k9q0.t(aVar5, c2678a);
                                                            cri.a.d dVar = cri.a.d;
                                                            k9q0.w(aVar5, c, dVar);
                                                            xbo0 xbo0Var7 = xbo0.this;
                                                            if (xbo0Var7 == null) {
                                                                aVar5.K(-165329702);
                                                            } else {
                                                                aVar5.K(-165329701);
                                                                xbo0Var7.a(0, aVar5);
                                                                hqv0.b(0, aVar5);
                                                            }
                                                            aVar5.j();
                                                            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                                                                szw.a("invalid weight; must be greater than zero");
                                                            }
                                                            q630 b = txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24, 1, new xpy(1.0f, true));
                                                            cp10 d2 = ja8.d(dt1.a.e, false);
                                                            int hashCode2 = Long.hashCode(n34.n(aVar5));
                                                            sy90 D2 = aVar5.D();
                                                            q630 c2 = qri.c(aVar5, b);
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
                                                            k9q0.w(aVar5, d2, cVar);
                                                            k9q0.w(aVar5, D2, eVar);
                                                            ur.d(hashCode2, aVar5, bVar2, aVar5, c2678a);
                                                            k9q0.w(aVar5, c2, dVar);
                                                            wzsVar.invoke(aVar5, 0);
                                                            tho0 tho0Var4 = tho0Var2;
                                                            String str5 = str4;
                                                            if (str5 == null) {
                                                                aVar5.K(629320200);
                                                                aVar5.j();
                                                                tho0Var3 = tho0Var4;
                                                                aVar4 = aVar5;
                                                                i39 = 0;
                                                            } else {
                                                                aVar5.K(629320201);
                                                                if (tho0Var4.a.c.length() == 0) {
                                                                    aVar5.K(-1858394179);
                                                                    tho0Var3 = tho0Var4;
                                                                    i39 = 0;
                                                                    yqv0.c(str5, null, j10, null, null, 0, 0, null, 0, false, i37, i38, null, frv0Var7, aVar5, 0, 0, 5114);
                                                                    aVar4 = aVar5;
                                                                } else {
                                                                    tho0Var3 = tho0Var4;
                                                                    aVar4 = aVar5;
                                                                    i39 = 0;
                                                                    aVar4.K(-1866553348);
                                                                }
                                                                aVar4.j();
                                                                aVar4.j();
                                                            }
                                                            aVar4.G();
                                                            wbo0 wbo0Var6 = wbo0Var5;
                                                            if (wbo0Var6 == null) {
                                                                aVar4.K(-164386310);
                                                            } else {
                                                                aVar4.K(-164386309);
                                                                hqv0.b(i39, aVar4);
                                                                wbo0Var6.a(i39, aVar4);
                                                            }
                                                            aVar4.j();
                                                            if (z10) {
                                                                aVar4.K(-164239338);
                                                                hqv0.b(i39, aVar4);
                                                                izs izsVar7 = izsVar6;
                                                                tho0 tho0Var5 = tho0Var3;
                                                                boolean J = aVar4.J(izsVar7) | aVar4.J(tho0Var5);
                                                                Object x3 = aVar4.x();
                                                                if (J || x3 == a.C0011a.a) {
                                                                    x3 = new com.vk.movika.sdk.base.flow.binding.g(29, izsVar7, tho0Var5);
                                                                    aVar4.R(x3);
                                                                }
                                                                hqv0.a((gzs) x3, aVar4, i39);
                                                            } else {
                                                                aVar4.K(-172993180);
                                                            }
                                                            aVar4.j();
                                                            aVar4.G();
                                                            if (androidx.compose.runtime.b.d()) {
                                                                androidx.compose.runtime.b.e();
                                                            }
                                                        } else {
                                                            aVar5.h();
                                                        }
                                                        return s3q0.a;
                                                    }
                                                }, aVar3), aVar3, 12779520, 80);
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.e();
                                                }
                                            } else {
                                                aVar3.h();
                                            }
                                            return s3q0.a;
                                        }
                                    }, M), M, i35 | (3670016 & i36) | (i36 & 29360128) | ((i24 << 9) & 1879048192), ((i24 >> 15) & 14) | 196608 | ((i31 >> 9) & 112) | ((i31 >> 12) & 896) | ((i31 >> 6) & 7168), 0);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    z6 = z8;
                                    i21 = i23;
                                    i20 = i32;
                                    izsVar3 = izsVar5;
                                    sg50Var2 = sg50Var4;
                                    aVar2 = M;
                                    frv0Var3 = frv0Var6;
                                    xbo0Var2 = xbo0Var5;
                                    wbo0Var2 = wbo0Var4;
                                    z5 = z7;
                                    j5 = j9;
                                    ueyVar2 = ueyVar3;
                                    b6u0Var2 = b6u0Var3;
                                    rgyVar2 = rgyVar3;
                                    j4 = j7;
                                }
                                s = aVar2.s();
                                if (s == null) {
                                    s.d = new wzs() { // from class: xsna.gqv0
                                        @Override // xsna.wzs
                                        public final Object invoke(Object obj, Object obj2) {
                                            ((Integer) obj2).getClass();
                                            int I = ne7.I(i3 | 1);
                                            int I2 = ne7.I(i4);
                                            hqv0.d(tho0.this, izsVar, q630Var, str, inputSelect$State, i20, i21, z, z6, j4, j5, frv0Var3, rgyVar2, ueyVar2, b6u0Var2, sg50Var2, izsVar3, xbo0Var2, wbo0Var2, z5, (androidx.compose.runtime.a) obj, I, I2, i5);
                                            return s3q0.a;
                                        }
                                    };
                                    return;
                                }
                                return;
                            }
                        }
                        i15 = i5 & 32768;
                        if (i15 == 0) {
                        }
                        i16 = i5 & 65536;
                        if (i16 == 0) {
                        }
                        i17 = i5 & 131072;
                        if (i17 == 0) {
                        }
                        i18 = i5 & SQLiteDatabase.OPEN_PRIVATECACHE;
                        if (i18 == 0) {
                        }
                        i19 = i5 & 524288;
                        if (i19 == 0) {
                        }
                        if (M.t(i6 & 1, (i6 & 306783379) == 306783378 || (i9 & 306783379) != 306783378)) {
                        }
                        s = aVar2.s();
                        if (s == null) {
                        }
                    }
                }
                i13 = i5 & 16384;
                if (i13 != 0) {
                }
                i15 = i5 & 32768;
                if (i15 == 0) {
                }
                i16 = i5 & 65536;
                if (i16 == 0) {
                }
                i17 = i5 & 131072;
                if (i17 == 0) {
                }
                i18 = i5 & SQLiteDatabase.OPEN_PRIVATECACHE;
                if (i18 == 0) {
                }
                i19 = i5 & 524288;
                if (i19 == 0) {
                }
                if (M.t(i6 & 1, (i6 & 306783379) == 306783378 || (i9 & 306783379) != 306783378)) {
                }
                s = aVar2.s();
                if (s == null) {
                }
            }
        }
        i11 = i5 & 8192;
        if (i11 == 0) {
        }
        i13 = i5 & 16384;
        if (i13 != 0) {
        }
        i15 = i5 & 32768;
        if (i15 == 0) {
        }
        i16 = i5 & 65536;
        if (i16 == 0) {
        }
        i17 = i5 & 131072;
        if (i17 == 0) {
        }
        i18 = i5 & SQLiteDatabase.OPEN_PRIVATECACHE;
        if (i18 == 0) {
        }
        i19 = i5 & 524288;
        if (i19 == 0) {
        }
        if (M.t(i6 & 1, (i6 & 306783379) == 306783378 || (i9 & 306783379) != 306783378)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }
}
