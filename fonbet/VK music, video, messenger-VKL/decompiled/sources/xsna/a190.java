package xsna;

import androidx.compose.material3.internal.TextFieldType;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.internal.PropertyReference0Impl;
import xsna.kgo0;
import xsna.q630;
import xsna.qfo0;

/* compiled from: TextFieldDefaults.kt */
/* loaded from: classes11.dex */
public final class a190 {
    public static final a190 a = new a190();
    public static final float b = 56;
    public static final float c = 280;
    public static final float d = 1;
    public static final float e = 2;

    /* compiled from: TextFieldDefaults.kt */
    public /* synthetic */ class a extends PropertyReference0Impl {
        @Override // kotlin.jvm.internal.PropertyReference0Impl, xsna.rcy
        public final Object get() {
            return ((mtk0) this.receiver).getValue();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x013e  */
    /* JADX WARN: Type inference failed for: r12v32, types: [xsna.mtk0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final boolean z, final boolean z2, final wax waxVar, q630 q630Var, final mfo0 mfo0Var, final r5j0 r5j0Var, float f, float f2, androidx.compose.runtime.a aVar, final int i, final int i2) {
        q630 q630Var2;
        int i3;
        float f3;
        float f4;
        final q630 q630Var3;
        final float f5;
        final float f6;
        androidx.compose.runtime.f s;
        wh50 wh50Var;
        mtk0 c2;
        int i4;
        int i5;
        androidx.compose.runtime.a M = aVar.M(1035477640);
        int i6 = (M.l(z) ? 4 : 2) | i | (M.l(z2) ? 32 : 16) | (M.J(waxVar) ? 256 : 128);
        int i7 = i2 & 8;
        if (i7 != 0) {
            i6 |= 3072;
        } else if ((i & 3072) == 0) {
            q630Var2 = q630Var;
            i6 |= M.J(q630Var2) ? 2048 : 1024;
            i3 = i6 | (!M.J(mfo0Var) ? 16384 : 8192) | (!M.J(r5j0Var) ? 131072 : 65536);
            if ((1572864 & i) != 0) {
                if ((i2 & 64) == 0) {
                    f3 = f;
                    if (M.n(f3)) {
                        i5 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        i3 |= i5;
                    }
                } else {
                    f3 = f;
                }
                i5 = 524288;
                i3 |= i5;
            } else {
                f3 = f;
            }
            if ((12582912 & i) != 0) {
                if ((i2 & 128) == 0) {
                    f4 = f2;
                    if (M.n(f4)) {
                        i4 = 8388608;
                        i3 |= i4;
                    }
                } else {
                    f4 = f2;
                }
                i4 = 4194304;
                i3 |= i4;
            } else {
                f4 = f2;
            }
            if (M.t(i3 & 1, (38347923 & i3) == 38347922)) {
                M.h();
                q630Var3 = q630Var2;
                f5 = f3;
                f6 = f4;
            } else {
                M.V();
                if ((i & 1) == 0 || M.i()) {
                    q630Var3 = i7 != 0 ? q630.a.a : q630Var2;
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        f5 = e;
                    } else {
                        f5 = f3;
                    }
                    if ((i2 & 128) != 0) {
                        i3 &= -29360129;
                        f6 = d;
                        M.S();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1035477640, i3, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.Container (TextFieldDefaults.kt:1054)");
                        }
                        int i8 = i3 >> 6;
                        boolean booleanValue = ((Boolean) sa30.j(waxVar, M, i8 & 14).getValue()).booleanValue();
                        int i9 = ((i3 >> 3) & 7168) | (i3 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | (57344 & i8) | (i8 & 458752);
                        float f7 = fgo0.a;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(2047013045, i9, -1, "androidx.compose.material3.internal.animateBorderStrokeAsState (TextFieldImpl.kt:472)");
                        }
                        long j = z ? mfo0Var.n : z2 ? mfo0Var.o : booleanValue ? mfo0Var.l : mfo0Var.m;
                        MotionSchemeKeyTokens motionSchemeKeyTokens = MotionSchemeKeyTokens.FastEffects;
                        phr a2 = lb30.a(motionSchemeKeyTokens, M);
                        if (z) {
                            M.K(-1674427244);
                            wh50 c3 = androidx.compose.runtime.k.c(new l5g(j), M, 0);
                            M.j();
                            wh50Var = c3;
                        } else {
                            M.K(-1674507999);
                            motionSchemeKeyTokens = motionSchemeKeyTokens;
                            ?? b2 = lwj0.b(j, a2, null, M, 0, 12);
                            M = M;
                            M.j();
                            wh50Var = b2;
                        }
                        phr a3 = lb30.a(MotionSchemeKeyTokens.FastSpatial, M);
                        if (z) {
                            M.K(-1674063769);
                            c2 = androidx.compose.runtime.k.c(new pco(f6), M, (i9 >> 15) & 14);
                            M.j();
                        } else {
                            M.K(-1674245832);
                            c2 = hg2.a(booleanValue ? f5 : f6, a3, null, M, 0, 12);
                            M.j();
                        }
                        wh50 c4 = androidx.compose.runtime.k.c(aqw.a(((pco) c2.getValue()).b, ((l5g) wh50Var.getValue()).a), M, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        androidx.compose.runtime.a aVar2 = M;
                        mtk0 b3 = lwj0.b(z ? mfo0Var.g : z2 ? mfo0Var.h : booleanValue ? mfo0Var.e : mfo0Var.f, lb30.a(motionSchemeKeyTokens, M), null, aVar2, 0, 12);
                        M = aVar2;
                        y18 y18Var = (y18) c4.getValue();
                        ja8.a(bu00.e(r18.b(y18Var.a, y18Var.b, q630Var3, r5j0Var), new vfo0(0, r5j0Var, new qfo0.a(new a(b3, mtk0.class, "value", "getValue()Ljava/lang/Object;", 0)))), M, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    }
                } else {
                    M.h();
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                    if ((i2 & 128) != 0) {
                        i3 &= -29360129;
                    }
                    q630Var3 = q630Var2;
                    f5 = f3;
                }
                f6 = f4;
                M.S();
                if (androidx.compose.runtime.b.d()) {
                }
                int i82 = i3 >> 6;
                boolean booleanValue2 = ((Boolean) sa30.j(waxVar, M, i82 & 14).getValue()).booleanValue();
                int i92 = ((i3 >> 3) & 7168) | (i3 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | (57344 & i82) | (i82 & 458752);
                float f72 = fgo0.a;
                if (androidx.compose.runtime.b.d()) {
                }
                if (z) {
                }
                MotionSchemeKeyTokens motionSchemeKeyTokens2 = MotionSchemeKeyTokens.FastEffects;
                phr a22 = lb30.a(motionSchemeKeyTokens2, M);
                if (z) {
                }
                phr a32 = lb30.a(MotionSchemeKeyTokens.FastSpatial, M);
                if (z) {
                }
                wh50 c42 = androidx.compose.runtime.k.c(aqw.a(((pco) c2.getValue()).b, ((l5g) wh50Var.getValue()).a), M, 0);
                if (androidx.compose.runtime.b.d()) {
                }
                androidx.compose.runtime.a aVar22 = M;
                mtk0 b32 = lwj0.b(z ? mfo0Var.g : z2 ? mfo0Var.h : booleanValue2 ? mfo0Var.e : mfo0Var.f, lb30.a(motionSchemeKeyTokens2, M), null, aVar22, 0, 12);
                M = aVar22;
                y18 y18Var2 = (y18) c42.getValue();
                ja8.a(bu00.e(r18.b(y18Var2.a, y18Var2.b, q630Var3, r5j0Var), new vfo0(0, r5j0Var, new qfo0.a(new a(b32, mtk0.class, "value", "getValue()Ljava/lang/Object;", 0)))), M, 0);
                if (androidx.compose.runtime.b.d()) {
                }
            }
            s = M.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.y090
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        a190.this.a(z, z2, waxVar, q630Var3, mfo0Var, r5j0Var, f5, f6, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        q630Var2 = q630Var;
        i3 = i6 | (!M.J(mfo0Var) ? 16384 : 8192) | (!M.J(r5j0Var) ? 131072 : 65536);
        if ((1572864 & i) != 0) {
        }
        if ((12582912 & i) != 0) {
        }
        if (M.t(i3 & 1, (38347923 & i3) == 38347922)) {
        }
        s = M.s();
        if (s == null) {
        }
    }

    public final void b(final String str, final wzs wzsVar, final boolean z, final boolean z2, final b6u0 b6u0Var, final wax waxVar, final boolean z3, final wzs wzsVar2, final wzs wzsVar3, final wzs wzsVar4, final mfo0 mfo0Var, s890 s890Var, final jai jaiVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        wzs wzsVar5;
        boolean z4;
        boolean z5;
        androidx.compose.runtime.a aVar2;
        final s890 s890Var2;
        int i3;
        s890 s890Var3;
        String str2;
        jai jaiVar2;
        androidx.compose.runtime.a M = aVar.M(-1732281618);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            wzsVar5 = wzsVar;
            i2 |= M.y(wzsVar5) ? 32 : 16;
        } else {
            wzsVar5 = wzsVar;
        }
        if ((i & 384) == 0) {
            z4 = z;
            i2 |= M.l(z4) ? 256 : 128;
        } else {
            z4 = z;
        }
        if ((i & 3072) == 0) {
            z5 = z2;
            i2 |= M.l(z5) ? 2048 : 1024;
        } else {
            z5 = z2;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(b6u0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(waxVar) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= M.l(z3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= M.y(wzsVar2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= M.y(wzsVar3) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= M.y(null) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        int i4 = 14155776 | (M.y(null) ? 4 : 2) | (M.y(null) ? 32 : 16) | (M.y(null) ? 256 : 128) | (M.y(wzsVar4) ? 2048 : 1024) | (M.J(mfo0Var) ? 16384 : 8192) | 65536;
        if (M.t(i2 & 1, ((i2 & 306783379) == 306783378 && (i4 & 4793491) == 4793490) ? false : true)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                float f = fgo0.a;
                u890 u890Var = new u890(f, f, f, f);
                i3 = i4 & (-458753);
                s890Var3 = u890Var;
            } else {
                M.h();
                i3 = i4 & (-458753);
                s890Var3 = s890Var;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1732281618, i2, i3, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1168)");
            }
            int i5 = i3;
            boolean z6 = ((i2 & 14) == 4) | ((i2 & 57344) == 16384);
            Object x = M.x();
            if (z6 || x == a.C0011a.a) {
                x = b6u0Var.a(new us2(str));
                M.R(x);
            }
            String str3 = ((klp0) x).a.c;
            TextFieldType textFieldType = TextFieldType.Outlined;
            kgo0.b bVar = new kgo0.b(0);
            if (wzsVar2 == null) {
                M.K(1927058812);
                M.j();
                str2 = str3;
                jaiVar2 = null;
            } else {
                M.K(1927058813);
                str2 = str3;
                jai c2 = kai.c(-1459717586, new b190(wzsVar2), M);
                M.j();
                jaiVar2 = c2;
            }
            int i6 = i2 >> 9;
            int i7 = i5 << 21;
            aVar2 = M;
            fgo0.a(textFieldType, str2, wzsVar5, bVar, jaiVar2, wzsVar3, wzsVar4, z5, z4, z3, waxVar, s890Var3, mfo0Var, jaiVar, aVar2, ((i2 << 3) & 896) | 6 | (i6 & 458752) | (i6 & 3670016) | (i7 & 29360128) | (i7 & 234881024) | (i7 & 1879048192), ((i5 >> 9) & 14) | ((i2 >> 6) & 112) | (i2 & 896) | (i6 & 7168) | ((i2 >> 3) & 57344) | ((i5 << 6) & 3670016) | 12582912);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            s890Var2 = s890Var3;
        } else {
            aVar2 = M;
            aVar2.h();
            s890Var2 = s890Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.z090
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    a190.this.b(str, wzsVar, z, z2, b6u0Var, waxVar, z3, wzsVar2, wzsVar3, wzsVar4, mfo0Var, s890Var2, jaiVar, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
