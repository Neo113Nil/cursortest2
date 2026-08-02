package xsna;

import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.q630;

/* compiled from: Button.kt */
/* loaded from: classes11.dex */
public final class lq8 {
    public static final void a(final gzs gzsVar, final q630 q630Var, final boolean z, final r5j0 r5j0Var, final gp8 gp8Var, final sp8 sp8Var, final s890 s890Var, final jai jaiVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        r5j0 r5j0Var2;
        androidx.compose.runtime.a M = aVar.M(-1310015664);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            r5j0Var2 = r5j0Var;
            i2 |= M.J(r5j0Var2) ? 2048 : 1024;
        } else {
            r5j0Var2 = r5j0Var;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(gp8Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(sp8Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.J(null) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= M.J(s890Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= M.J(null) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= M.y(jaiVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if (M.t(i2 & 1, (306783379 & i2) != 306783378)) {
            M.V();
            if ((i & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1310015664, i2, -1, "androidx.compose.material3.Button (Button.kt:121)");
            }
            M.K(1691738187);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = ir.h(M);
            }
            sg50 sg50Var = (sg50) x;
            M.j();
            long j = z ? gp8Var.a : gp8Var.c;
            long j2 = z ? gp8Var.b : gp8Var.d;
            M.K(1691921830);
            M.j();
            long j3 = j;
            float f = 0;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new d40(4);
                M.R(x2);
            }
            xjn0.c(gzsVar, egi0.b(q630Var, false, (izs) x2), z, r5j0Var2, j3, j2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, sg50Var, kai.c(-535639973, new kq8(j2, s890Var, jaiVar), M), M, ((i2 << 6) & 234881024) | (i2 & 8078), 64);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(q630Var, z, r5j0Var, gp8Var, sp8Var, s890Var, jaiVar, i) { // from class: xsna.gq8
                public final /* synthetic */ q630 c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ r5j0 e;
                public final /* synthetic */ gp8 f;
                public final /* synthetic */ s890 g;
                public final /* synthetic */ jai h;
                public final /* synthetic */ int i;

                {
                    this.g = s890Var;
                    this.h = jaiVar;
                    this.i = i;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lq8.a(gzs.this, this.c, this.d, this.e, this.f, null, this.g, this.h, (androidx.compose.runtime.a) obj, ne7.I(this.i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final gzs gzsVar, q630 q630Var, boolean z, r5j0 r5j0Var, gp8 gp8Var, s890 s890Var, final jai jaiVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        int i4;
        boolean z2;
        r5j0 r5j0Var2;
        gp8 gp8Var2;
        int i5;
        s890 s890Var2;
        int i6;
        androidx.compose.runtime.a aVar2;
        final q630 q630Var3;
        final boolean z3;
        final r5j0 r5j0Var3;
        final gp8 gp8Var3;
        final s890 s890Var3;
        androidx.compose.runtime.f s;
        boolean z4;
        gp8 gp8Var4;
        s890 s890Var4;
        q630 q630Var4;
        r5j0 r5j0Var4;
        int i7;
        int i8;
        int i9;
        androidx.compose.runtime.a M = aVar.M(-1061374109);
        if ((i & 6) == 0) {
            i3 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= M.l(z2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        r5j0Var2 = r5j0Var;
                        if (M.J(r5j0Var2)) {
                            i9 = 2048;
                            i3 |= i9;
                        }
                    } else {
                        r5j0Var2 = r5j0Var;
                    }
                    i9 = 1024;
                    i3 |= i9;
                } else {
                    r5j0Var2 = r5j0Var;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        gp8Var2 = gp8Var;
                        if (M.J(gp8Var2)) {
                            i8 = 16384;
                            i3 |= i8;
                        }
                    } else {
                        gp8Var2 = gp8Var;
                    }
                    i8 = 8192;
                    i3 |= i8;
                } else {
                    gp8Var2 = gp8Var;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    i3 |= M.J(null) ? 131072 : 65536;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= M.J(null) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                }
                i5 = i2 & 128;
                if (i5 != 0) {
                    i3 |= 12582912;
                } else if ((12582912 & i) == 0) {
                    s890Var2 = s890Var;
                    i3 |= M.J(s890Var2) ? 8388608 : 4194304;
                    i6 = i3 | 100663296;
                    if ((805306368 & i) == 0) {
                        i6 |= M.y(jaiVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                    }
                    if (M.t(i6 & 1, (306783379 & i6) == 306783378)) {
                        aVar2 = M;
                        aVar2.h();
                        q630Var3 = q630Var2;
                        z3 = z2;
                        r5j0Var3 = r5j0Var2;
                        gp8Var3 = gp8Var2;
                        s890Var3 = s890Var2;
                    } else {
                        M.V();
                        if ((i & 1) == 0 || M.i()) {
                            q630 q630Var5 = i10 != 0 ? q630.a.a : q630Var2;
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                u890 u890Var = np8.a;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-349121587, 6, -1, "androidx.compose.material3.ButtonDefaults.<get-textShape> (Button.kt:566)");
                                }
                                r5j0 a = p6j0.a(pr8.b, M);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                i6 &= -7169;
                                r5j0Var2 = a;
                            }
                            if ((i2 & 16) != 0) {
                                u890 u890Var2 = np8.a;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1880341584, 6, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:752)");
                                }
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-561618718, 6, -1, "androidx.compose.material3.MaterialTheme.<get-colorScheme> (MaterialTheme.kt:121)");
                                }
                                t7g t7gVar = (t7g) M.r(u7g.a);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                gp8 a2 = np8.a(t7gVar);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                i6 &= -57345;
                                gp8Var2 = a2;
                            }
                            if (i5 != 0) {
                                s890Var2 = np8.a;
                            }
                            z4 = z2;
                            gp8Var4 = gp8Var2;
                            s890Var4 = s890Var2;
                            q630Var4 = q630Var5;
                            r5j0Var4 = r5j0Var2;
                            i7 = -1061374109;
                        } else {
                            M.h();
                            if ((i2 & 8) != 0) {
                                i6 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i6 &= -57345;
                            }
                            z4 = z2;
                            gp8Var4 = gp8Var2;
                            s890Var4 = s890Var2;
                            i7 = -1061374109;
                            q630Var4 = q630Var2;
                            r5j0Var4 = r5j0Var2;
                        }
                        M.S();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(i7, i6, -1, "androidx.compose.material3.TextButton (Button.kt:429)");
                        }
                        aVar2 = M;
                        a(gzsVar, q630Var4, z4, r5j0Var4, gp8Var4, null, s890Var4, jaiVar, aVar2, i6 & 2147483646);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        q630Var3 = q630Var4;
                        z3 = z4;
                        r5j0Var3 = r5j0Var4;
                        gp8Var3 = gp8Var4;
                        s890Var3 = s890Var4;
                    }
                    s = aVar2.s();
                    if (s == null) {
                        s.d = new wzs() { // from class: xsna.fq8
                            @Override // xsna.wzs
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                lq8.b(gzs.this, q630Var3, z3, r5j0Var3, gp8Var3, s890Var3, jaiVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                                return s3q0.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                s890Var2 = s890Var;
                i6 = i3 | 100663296;
                if ((805306368 & i) == 0) {
                }
                if (M.t(i6 & 1, (306783379 & i6) == 306783378)) {
                }
                s = aVar2.s();
                if (s == null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            i5 = i2 & 128;
            if (i5 != 0) {
            }
            s890Var2 = s890Var;
            i6 = i3 | 100663296;
            if ((805306368 & i) == 0) {
            }
            if (M.t(i6 & 1, (306783379 & i6) == 306783378)) {
            }
            s = aVar2.s();
            if (s == null) {
            }
        }
        q630Var2 = q630Var;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        i5 = i2 & 128;
        if (i5 != 0) {
        }
        s890Var2 = s890Var;
        i6 = i3 | 100663296;
        if ((805306368 & i) == 0) {
        }
        if (M.t(i6 & 1, (306783379 & i6) == 306783378)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }
}
