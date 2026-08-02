package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.compose.component.alert.Alert$Button;
import com.vk.core.compose.component.alert.Alert$DismissReason;
import com.vungle.ads.internal.protos.Sdk;
import xsna.q630;

/* compiled from: ConfirmationAlert.kt */
/* loaded from: classes15.dex */
public final class c3j {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final String str, final String str2, q630 q630Var, final String str3, final String str4, boolean z, final izs<? super Alert$DismissReason, s3q0> izsVar, final gzs<s3q0> gzsVar, final gzs<s3q0> gzsVar2, androidx.compose.runtime.a aVar, final int i, final int i2) {
        boolean z2;
        izs<? super Alert$DismissReason, s3q0> izsVar2;
        int i3;
        final q630 q630Var2;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(-138016708);
        int i4 = i | (M.J(str) ? 4 : 2) | (M.J(str2) ? 32 : 16) | (M.J(str3) ? 2048 : 1024) | (M.J(str4) ? 16384 : 8192);
        int i5 = i2 & 32;
        if (i5 != 0) {
            i4 |= 196608;
        } else if ((i & 196608) == 0) {
            z2 = z;
            i4 |= M.l(z2) ? 131072 : 65536;
            if ((i & 1572864) != 0) {
                izsVar2 = izsVar;
                i4 |= M.y(izsVar2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            } else {
                izsVar2 = izsVar;
            }
            i3 = i4 | (!M.y(gzsVar) ? 8388608 : 4194304) | (!M.y(gzsVar2) ? 67108864 : 33554432);
            if (M.t(i3 & 1, (38347795 & i3) == 38347794)) {
                M.h();
                q630Var2 = q630Var;
            } else {
                if (i5 != 0) {
                    z2 = true;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-138016708, i3, -1, "com.vk.biometrics.lock.impl.presentation.base.view.ConfirmationAlert (ConfirmationAlert.kt:18)");
                }
                p7u0.c(((i3 >> 9) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i3 >> 12) & 896), 368, M, new Alert$Button(str, gzsVar, z2 ? Alert$Button.Style.Negative : Alert$Button.Style.Neutral, null), new Alert$Button(str2, gzsVar2, Alert$Button.Style.Neutral, null), null, null, str3, str4, null, izsVar2, null);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630Var2 = q630.a.a;
            }
            final boolean z3 = z2;
            s = M.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.b3j
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        c3j.a(str, str2, q630Var2, str3, str4, z3, izsVar, gzsVar, gzsVar2, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        z2 = z;
        if ((i & 1572864) != 0) {
        }
        i3 = i4 | (!M.y(gzsVar) ? 8388608 : 4194304) | (!M.y(gzsVar2) ? 67108864 : 33554432);
        if (M.t(i3 & 1, (38347795 & i3) == 38347794)) {
        }
        final boolean z32 = z2;
        s = M.s();
        if (s == null) {
        }
    }
}
