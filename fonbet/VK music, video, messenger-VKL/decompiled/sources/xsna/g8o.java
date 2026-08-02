package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.graphics.BlendModeCompat;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.DownloadingState;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.h700;
import xsna.u700;

/* compiled from: DownloadAnimatedIcon.kt */
/* loaded from: classes3.dex */
public final class g8o {

    /* compiled from: DownloadAnimatedIcon.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[y7o.values().length];
            try {
                iArr[y7o.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y7o.PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[y7o.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0208  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final long j, final Object obj, final izs izsVar, final q630 q630Var, float f, final Object obj2, final boolean z, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        long j2;
        Object obj3;
        androidx.compose.runtime.a aVar2;
        final float f2;
        float f3;
        float d;
        Object x;
        Object obj4;
        wh50 wh50Var;
        boolean J;
        Object x2;
        s600 s600Var;
        h700.a aVar3;
        Integer num;
        boolean J2;
        Object x3;
        boolean n;
        Object x4;
        androidx.compose.runtime.a M = aVar.M(-2122411255);
        if ((i & 6) == 0) {
            i2 = (M.o(R.raw.download_to_check_outline_20) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            j2 = j;
            i2 |= M.p(j2) ? 32 : 16;
        } else {
            j2 = j;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(obj) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        int i3 = i2 | 196608;
        if ((1572864 & i) == 0) {
            obj3 = obj2;
            i3 |= M.y(obj3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            obj3 = obj2;
        }
        if ((12582912 & i) == 0) {
            i3 |= M.l(z) ? 8388608 : 4194304;
        }
        if (M.t(i3 & 1, (4793491 & i3) != 4793490)) {
            M.V();
            float f4 = 1.0f;
            if ((i & 1) == 0 || M.i()) {
                f3 = 1.0f;
            } else {
                M.h();
                f3 = f;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2122411255, i3, -1, "com.vk.music.stickyplayer.presentation.components.DownloadAnimatedIcon (DownloadAnimatedIcon.kt:40)");
            }
            DownloadingState downloadingState = (DownloadingState) obj;
            y7o.Companion.getClass();
            String str = null;
            y7o y7oVar = downloadingState instanceof DownloadingState.PendingDownload ? y7o.START : downloadingState instanceof DownloadingState.Downloading ? y7o.PROGRESS : downloadingState instanceof DownloadingState.Downloaded ? y7o.END : null;
            h700.a aVar4 = new h700.a(4, 0, 35);
            int i4 = i3;
            h700.a aVar5 = new h700.a(4, 85, 120);
            t700 c = guf0.c(new u700.e(R.raw.download_to_check_outline_20), M, 0);
            l800 x5 = qxm0.x(new n800[]{qxm0.y(t800.I, pe7.a(f870.H(j2), BlendModeCompat.SRC_ATOP), new String[]{"**"}, M)}, M);
            if (z) {
                M.K(1756041490);
                M.j();
                d = Float.POSITIVE_INFINITY;
            } else {
                M.K(1756087060);
                d = f3 / b3r0.d((Context) M.r(AndroidCompositionLocals_androidKt.b));
                M.j();
            }
            s600 a2 = y600.a(M);
            int i5 = y7oVar == null ? -1 : a.$EnumSwitchMapping$0[y7oVar.ordinal()];
            if (i5 != -1) {
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar4 = aVar5;
                    }
                }
                x = M.x();
                obj4 = a.C0011a.a;
                if (x == obj4) {
                    x = androidx.compose.runtime.k.b(null);
                    M.R(x);
                }
                wh50Var = (wh50) x;
                if (aVar4 != null && !aVar4.equals((h700.a) wh50Var.getValue())) {
                    wh50Var.setValue(aVar4);
                }
                i700 i700Var = (i700) c.getValue();
                h700.a aVar6 = (h700.a) wh50Var.getValue();
                J = M.J(a2) | M.J(c) | M.n(d) | M.y(aVar4);
                x2 = M.x();
                if (!J || x2 == obj4) {
                    s600Var = a2;
                    aVar3 = aVar4;
                    x2 = new d8o(s600Var, d, aVar3, wh50Var, c, null);
                    M.R(x2);
                } else {
                    s600Var = a2;
                    aVar3 = aVar4;
                }
                bap.e(i700Var, obj3, aVar6, (wzs) x2, M, (i4 >> 15) & 112);
                if (aVar3 == null) {
                    f4 = s600Var.getProgress();
                } else if (!downloadingState.equals(DownloadingState.Corrupted.b) && !downloadingState.equals(DownloadingState.Downloaded.b) && !downloadingState.equals(DownloadingState.PartlyDownloaded.b)) {
                    if (downloadingState instanceof DownloadingState.Downloading) {
                        f4 = (((DownloadingState.Downloading) downloadingState).b * 0.41666666f) + 0.29166666f;
                    } else {
                        if (!downloadingState.equals(DownloadingState.NotLoaded.b) && !downloadingState.equals(DownloadingState.PendingDownload.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    }
                }
                float f5 = f4;
                num = (Integer) izsVar.invoke(downloadingState);
                if (num != null) {
                    M.K(1757633401);
                    M.j();
                } else {
                    str = l4.f(M, 1757633402, num, M, 0);
                }
                String str2 = str;
                J2 = M.J(str2);
                x3 = M.x();
                if (!J2 || x3 == obj4) {
                    x3 = new z7o(str2, 0);
                    M.R(x3);
                }
                q630 a3 = egi0.a(q630Var, (izs) x3);
                i700 i700Var2 = (i700) c.getValue();
                n = M.n(f5);
                x4 = M.x();
                if (!n || x4 == obj4) {
                    x4 = new a8o(f5);
                    M.R(x4);
                }
                aVar2 = M;
                z600.a(i700Var2, (gzs) x4, a3, false, false, false, false, null, false, x5, null, null, false, false, null, null, false, aVar2, 1073741824, 0, 130552);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                f2 = f3;
            }
            aVar4 = null;
            x = M.x();
            obj4 = a.C0011a.a;
            if (x == obj4) {
            }
            wh50Var = (wh50) x;
            if (aVar4 != null) {
                wh50Var.setValue(aVar4);
            }
            i700 i700Var3 = (i700) c.getValue();
            h700.a aVar62 = (h700.a) wh50Var.getValue();
            J = M.J(a2) | M.J(c) | M.n(d) | M.y(aVar4);
            x2 = M.x();
            if (J) {
            }
            s600Var = a2;
            aVar3 = aVar4;
            x2 = new d8o(s600Var, d, aVar3, wh50Var, c, null);
            M.R(x2);
            bap.e(i700Var3, obj3, aVar62, (wzs) x2, M, (i4 >> 15) & 112);
            if (aVar3 == null) {
            }
            float f52 = f4;
            num = (Integer) izsVar.invoke(downloadingState);
            if (num != null) {
            }
            String str22 = str;
            J2 = M.J(str22);
            x3 = M.x();
            if (!J2) {
            }
            x3 = new z7o(str22, 0);
            M.R(x3);
            q630 a32 = egi0.a(q630Var, (izs) x3);
            i700 i700Var22 = (i700) c.getValue();
            n = M.n(f52);
            x4 = M.x();
            if (!n) {
            }
            x4 = new a8o(f52);
            M.R(x4);
            aVar2 = M;
            z600.a(i700Var22, (gzs) x4, a32, false, false, false, false, null, false, x5, null, null, false, false, null, null, false, aVar2, 1073741824, 0, 130552);
            if (androidx.compose.runtime.b.d()) {
            }
            f2 = f3;
        } else {
            aVar2 = M;
            aVar2.h();
            f2 = f;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.b8o
                @Override // xsna.wzs
                public final Object invoke(Object obj5, Object obj6) {
                    ((Integer) obj6).getClass();
                    g8o.a(j, obj, izsVar, q630Var, f2, obj2, z, (androidx.compose.runtime.a) obj5, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
