package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.graphics.BlendModeCompat;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.DownloadingState;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.h700;
import xsna.u700;

/* compiled from: DownloadAnimatedIcon.kt */
/* loaded from: classes3.dex */
public final class f8o {

    /* compiled from: DownloadAnimatedIcon.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[x7o.values().length];
            try {
                iArr[x7o.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x7o.PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x7o.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final long j, final Object obj, final q630 q630Var, float f, final Object obj2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a aVar2;
        final float f2;
        float f3;
        Object x;
        Object obj3;
        wh50 wh50Var;
        boolean J;
        Object x2;
        t700 t700Var;
        h700.a aVar3;
        s600 s600Var;
        boolean n;
        Object x3;
        androidx.compose.runtime.a M = aVar.M(-311168568);
        if ((i & 6) == 0) {
            i2 = (M.o(R.raw.download_to_check_outline_28) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.p(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(obj) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            q630Var2 = q630Var;
            i2 |= M.J(q630Var2) ? 2048 : 1024;
        } else {
            q630Var2 = q630Var;
        }
        int i3 = i2 | 24576;
        if ((196608 & i) == 0) {
            i3 |= M.y(obj2) ? 131072 : 65536;
        }
        int i4 = i3 | 1572864;
        if (M.t(i4 & 1, (599187 & i4) != 599186)) {
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
                androidx.compose.runtime.b.f(-311168568, i4, -1, "com.vk.music.bottomsheets.track.redesigned.presentation.components.DownloadAnimatedIcon (DownloadAnimatedIcon.kt:36)");
            }
            DownloadingState downloadingState = (DownloadingState) obj;
            x7o.Companion.getClass();
            x7o x7oVar = downloadingState instanceof DownloadingState.PendingDownload ? x7o.START : downloadingState instanceof DownloadingState.Downloading ? x7o.PROGRESS : downloadingState instanceof DownloadingState.Downloaded ? x7o.END : null;
            h700.a aVar4 = new h700.a(4, 0, 35);
            h700.a aVar5 = new h700.a(4, 85, 120);
            t700 c = guf0.c(new u700.e(R.raw.download_to_check_outline_28), M, 0);
            l800 x4 = qxm0.x(new n800[]{qxm0.y(t800.I, pe7.a(f870.H(j), BlendModeCompat.SRC_ATOP), new String[]{"**"}, M)}, M);
            M.K(-1482190987);
            float d = f3 / b3r0.d((Context) M.r(AndroidCompositionLocals_androidKt.b));
            M.j();
            s600 a2 = y600.a(M);
            int i5 = x7oVar == null ? -1 : a.$EnumSwitchMapping$0[x7oVar.ordinal()];
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
                obj3 = a.C0011a.a;
                if (x == obj3) {
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
                if (!J || x2 == obj3) {
                    t700Var = c;
                    aVar3 = aVar4;
                    s600Var = a2;
                    x2 = new e8o(s600Var, d, aVar3, wh50Var, t700Var, null);
                    M.R(x2);
                } else {
                    t700Var = c;
                    aVar3 = aVar4;
                    s600Var = a2;
                }
                bap.e(i700Var, obj2, aVar6, (wzs) x2, M, (i4 >> 12) & 112);
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
                i700 i700Var2 = (i700) t700Var.getValue();
                n = M.n(f5);
                x3 = M.x();
                if (!n || x3 == obj3) {
                    x3 = new a8o(f5);
                    M.R(x3);
                }
                aVar2 = M;
                z600.a(i700Var2, (gzs) x3, q630Var2, false, false, false, false, null, false, x4, null, null, false, false, null, null, false, aVar2, ((i4 >> 3) & 896) | 1073741824, 0, 130552);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                f2 = f3;
            }
            aVar4 = null;
            x = M.x();
            obj3 = a.C0011a.a;
            if (x == obj3) {
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
            t700Var = c;
            aVar3 = aVar4;
            s600Var = a2;
            x2 = new e8o(s600Var, d, aVar3, wh50Var, t700Var, null);
            M.R(x2);
            bap.e(i700Var3, obj2, aVar62, (wzs) x2, M, (i4 >> 12) & 112);
            if (aVar3 == null) {
            }
            float f52 = f4;
            i700 i700Var22 = (i700) t700Var.getValue();
            n = M.n(f52);
            x3 = M.x();
            if (!n) {
            }
            x3 = new a8o(f52);
            M.R(x3);
            aVar2 = M;
            z600.a(i700Var22, (gzs) x3, q630Var2, false, false, false, false, null, false, x4, null, null, false, false, null, null, false, aVar2, ((i4 >> 3) & 896) | 1073741824, 0, 130552);
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
            s.d = new wzs() { // from class: xsna.c8o
                @Override // xsna.wzs
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    f8o.a(j, obj, q630Var, f2, obj2, (androidx.compose.runtime.a) obj4, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
