package xsna;

import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.bi40;

/* compiled from: MusicDownloadingIndication.kt */
/* loaded from: classes3.dex */
public final class ki40 {
    /* JADX WARN: Removed duplicated region for block: B:102:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final bi40 bi40Var, final lg90 lg90Var, final yzs<? super bi40, ? super androidx.compose.runtime.a, ? super Integer, l5g> yzsVar, final izs<? super bi40, Integer> izsVar, final q630 q630Var, lg90 lg90Var2, boolean z, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        boolean z2;
        final lg90 lg90Var3;
        androidx.compose.runtime.a aVar2;
        final boolean z3;
        androidx.compose.runtime.f s;
        String f;
        String f2;
        String f3;
        lg90 lg90Var4 = lg90Var2;
        androidx.compose.runtime.a M = aVar.M(-431890531);
        int i4 = (M.J(bi40Var) ? 4 : 2) | i | (M.y(lg90Var) ? 32 : 16) | (M.y(yzsVar) ? 256 : 128);
        if ((i & 3072) == 0) {
            i4 |= M.y(izsVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= M.J(q630Var) ? 16384 : 8192;
        }
        int i5 = i2 & 32;
        if (i5 != 0) {
            i3 = 196608;
        } else {
            i3 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) == 0 ? M.J(lg90Var4) : M.y(lg90Var4) ? 131072 : 65536;
        }
        int i6 = i4 | i3;
        int i7 = i2 & 64;
        if (i7 != 0) {
            i6 |= 1572864;
        } else if ((1572864 & i) == 0) {
            z2 = z;
            i6 |= M.l(z2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            if (M.t(i6 & 1, (599187 & i6) == 599186)) {
                M.h();
                lg90Var3 = lg90Var4;
                aVar2 = M;
                z3 = z2;
            } else {
                if (i5 != 0) {
                    lg90Var4 = null;
                }
                lg90 lg90Var5 = lg90Var4;
                boolean z4 = i7 != 0 ? false : z2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-431890531, i6, -1, "com.vk.music.design.compose.download.MusicDownloadingIndication (MusicDownloadingIndication.kt:45)");
                }
                int i8 = i6 & 14;
                int i9 = i6 >> 3;
                long j = yzsVar.invoke(bi40Var, M, Integer.valueOf((i9 & 112) | i8)).a;
                if (bi40Var.equals(bi40.a.a)) {
                    M.K(1271720739);
                    q630 E = ahn.E(q630Var, "MusicDownloadingIndication:downloaded");
                    Integer invoke = izsVar.invoke(bi40Var);
                    if (invoke == null) {
                        M.K(1271981386);
                        M.j();
                        f3 = null;
                    } else {
                        f3 = l4.f(M, 1271981387, invoke, M, 0);
                    }
                    pzu0.b(lg90Var, f3, E, j, M, 8 | (i9 & 14), 0);
                    M.j();
                } else if (bi40Var.equals(bi40.c.a)) {
                    M.K(1272082261);
                    q630 E2 = ahn.E(q630Var, "MusicDownloadingIndication:notLoaded");
                    lg90 lg90Var6 = lg90Var5 == null ? ugp.g : lg90Var5;
                    Integer invoke2 = izsVar.invoke(bi40Var);
                    if (invoke2 == null) {
                        M.K(1272356362);
                        M.j();
                        f2 = null;
                    } else {
                        f2 = l4.f(M, 1272356363, invoke2, M, 0);
                    }
                    pzu0.b(lg90Var6, f2, E2, j, M, 8, 0);
                    M.j();
                } else if (bi40Var.equals(bi40.d.a)) {
                    M.K(1272460492);
                    b(bi40Var, z4, j, izsVar, q630Var, lg90Var5, M, i8 | ((i6 >> 15) & 112) | (i6 & 7168) | (57344 & i6) | SQLiteDatabase.OPEN_PRIVATECACHE | (i6 & 458752));
                    lg90Var5 = lg90Var5;
                    M.j();
                } else {
                    if (!(bi40Var instanceof bi40.b)) {
                        throw alb0.c(1565043175, M);
                    }
                    M.K(1272765656);
                    Integer invoke3 = izsVar.invoke(bi40Var);
                    if (invoke3 == null) {
                        M.K(1272827562);
                        M.j();
                        f = null;
                    } else {
                        f = l4.f(M, 1272827563, invoke3, M, 0);
                    }
                    if (f == null) {
                        f = "";
                    }
                    q630 q = txj0.q(q630Var, 12);
                    boolean J = M.J(f);
                    Object x = M.x();
                    if (J || x == a.C0011a.a) {
                        x = new f410(f, 11);
                        M.R(x);
                    }
                    q630 a = egi0.a(q, (izs) x);
                    float f4 = 2;
                    float f5 = ((bi40.b) bi40Var).a;
                    if (f5 < 0.02f) {
                        f5 = 0.02f;
                    }
                    long j2 = l5g.j;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(763204687, 3072, -1, "com.vk.core.compose.component.VkCircularProgressIndicator (VkCircularProgressIndicator.kt:41)");
                    }
                    x2e0.a(f5, f4, 3072, 0, j, j2, M, a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2 = M;
                lg90Var3 = lg90Var5;
                z3 = z4;
            }
            s = aVar2.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.hi40
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ki40.a(bi40.this, lg90Var, yzsVar, izsVar, q630Var, lg90Var3, z3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        z2 = z;
        if (M.t(i6 & 1, (599187 & i6) == 599186)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }

    public static final void b(final bi40 bi40Var, final boolean z, final long j, final izs izsVar, final q630 q630Var, final lg90 lg90Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(11913538);
        if ((i & 6) == 0) {
            i2 = (M.J(bi40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.p(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= (262144 & i) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(11913538, i2, -1, "com.vk.music.design.compose.download.PendingDownloadIcon (MusicDownloadingIndication.kt:103)");
            }
            String str = null;
            if (z) {
                M.K(-1565762993);
                Integer num = (Integer) izsVar.invoke(bi40Var);
                if (num == null) {
                    M.K(-1565688315);
                    M.j();
                } else {
                    str = l4.f(M, -1565688314, num, M, 0);
                }
                if (str == null) {
                    str = "";
                }
                q630 q = txj0.q(q630Var, 12);
                boolean J = M.J(str);
                Object x = M.x();
                if (J || x == a.C0011a.a) {
                    x = new ii40(str, 0);
                    M.R(x);
                }
                zfr0.e(egi0.a(q, (izs) x), j, null, M, (i2 >> 3) & 112, 4);
                M.j();
            } else {
                M.K(-1565299078);
                q630 E = ahn.E(o19.a(q630Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), "MusicDownloadingIndication:pending");
                lg90 lg90Var2 = lg90Var == null ? ugp.g : lg90Var;
                Integer num2 = (Integer) izsVar.invoke(bi40Var);
                if (num2 == null) {
                    M.K(-1564995899);
                    M.j();
                } else {
                    str = l4.f(M, -1564995898, num2, M, 0);
                }
                pzu0.b(lg90Var2, str, E, j, M, 8 | ((i2 << 3) & 7168), 0);
                M = M;
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.ji40
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ki40.b(bi40.this, z, j, izsVar, q630Var, lg90Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
