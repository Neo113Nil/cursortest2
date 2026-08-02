package xsna;

import androidx.compose.runtime.a;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import org.chromium.net.NetError;
import xsna.q630;

/* compiled from: TooManyBiometricsAttemptsAlert.kt */
/* loaded from: classes15.dex */
public final class h2p0 {
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(q630 q630Var, String str, String str2, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i, int i2) {
        String str3;
        int i3;
        String str4;
        int i4;
        int i5;
        String str5;
        q630 q630Var2;
        androidx.compose.runtime.f s;
        q630 q630Var3;
        androidx.compose.runtime.a M = aVar.M(1084560597);
        if ((i2 & 2) == 0) {
            str3 = str;
            if (M.J(str3)) {
                i3 = 32;
                int i6 = i | i3;
                if ((i2 & 4) != 0) {
                    str4 = str2;
                    if (M.J(str4)) {
                        i4 = 256;
                        i5 = i6 | i4 | (M.y(gzsVar) ? 2048 : 1024);
                        if (M.t(i5 & 1, (i5 & 1169) != 1168)) {
                            M.V();
                            if ((i & 1) == 0 || M.i()) {
                                if ((i2 & 2) != 0) {
                                    str3 = d370.N(R.string.bl_too_many_biometrics_attempts_title, 0, M);
                                    i5 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                                }
                                int i7 = i2 & 4;
                                q630.a aVar2 = q630.a.a;
                                if (i7 != 0) {
                                    str4 = d370.N(R.string.bl_too_many_biometrics_attempts_description, 0, M);
                                    i5 &= -897;
                                }
                                q630Var3 = aVar2;
                            } else {
                                M.h();
                                if ((i2 & 2) != 0) {
                                    i5 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                                }
                                if ((i2 & 4) != 0) {
                                    i5 &= -897;
                                }
                                q630Var3 = q630Var;
                            }
                            M.S();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1084560597, i5, -1, "com.vk.biometrics.lock.impl.presentation.base.view.TooManyBiometricsAttemptsAlert (TooManyBiometricsAttemptsAlert.kt:14)");
                            }
                            String N = d370.N(R.string.bl_clearly, 0, M);
                            boolean z = (i5 & 7168) == 2048;
                            Object x = M.x();
                            if (z || x == a.C0011a.a) {
                                x = new ayb(2, gzsVar);
                                M.R(x);
                            }
                            String str6 = str3;
                            String str7 = str4;
                            p7u0.e(str6, str7, N, (izs) x, gzsVar, null, null, null, null, null, null, null, null, M, ((i5 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i5 << 3) & 57344), 0, 8160);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            str5 = str6;
                            str4 = str7;
                            q630Var2 = q630Var3;
                        } else {
                            M.h();
                            str5 = str3;
                            q630Var2 = q630Var;
                        }
                        s = M.s();
                        if (s != null) {
                            s.d = new vyn(q630Var2, str5, str4, gzsVar, i, i2);
                            return;
                        }
                        return;
                    }
                } else {
                    str4 = str2;
                }
                i4 = 128;
                i5 = i6 | i4 | (M.y(gzsVar) ? 2048 : 1024);
                if (M.t(i5 & 1, (i5 & 1169) != 1168)) {
                }
                s = M.s();
                if (s != null) {
                }
            }
        } else {
            str3 = str;
        }
        i3 = 16;
        int i62 = i | i3;
        if ((i2 & 4) != 0) {
        }
        i4 = 128;
        i5 = i62 | i4 | (M.y(gzsVar) ? 2048 : 1024);
        if (M.t(i5 & 1, (i5 & 1169) != 1168)) {
        }
        s = M.s();
        if (s != null) {
        }
    }
}
