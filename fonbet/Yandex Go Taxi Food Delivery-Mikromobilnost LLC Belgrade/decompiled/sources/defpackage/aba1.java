package defpackage;

import android.net.Uri;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import java.security.PublicKey;
import okio.ByteString;
import ru.CryptoPro.JCP.JCP;
import ru.cprocsp.NGate.tools.Constants;
import ru.rt.ebs.cryptosdk.core.verification.esia.entities.models.EsiaCompleteResult;
import ru.rt.ebs.cryptosdk.core.verification.esia.entities.models.EsiaErrorResult;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes7.dex */
public abstract class aba1 {
    public static final int[] a = {1, 2, 3, 6};
    public static final int[] b = {48000, 44100, 32000};
    public static final int[] c = {24000, 22050, 16000};
    public static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    public static final int[] f = {69, 87, 104, Constants.VPN_TRAFFIC, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int a(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= 3 || i2 < 0 || i3 >= 19) {
            return -1;
        }
        int i4 = b[i];
        if (i4 == 44100) {
            return ((i2 % 2) + f[i3]) * 2;
        }
        int i5 = e[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }

    public static void b(long j, dl81 dl81Var, fb81[] fb81VarArr) {
        int i;
        while (true) {
            if (dl81Var.c - dl81Var.b <= 1) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (dl81Var.c - dl81Var.b == 0) {
                    i = -1;
                    break;
                }
                int s = dl81Var.s();
                i2 += s;
                if (s != 255) {
                    i = i2;
                    break;
                }
            }
            int i3 = 0;
            while (true) {
                if (dl81Var.c - dl81Var.b == 0) {
                    i3 = -1;
                    break;
                }
                int s2 = dl81Var.s();
                i3 += s2;
                if (s2 != 255) {
                    break;
                }
            }
            int i4 = dl81Var.b;
            int i5 = i4 + i3;
            if (i3 == -1 || i3 > dl81Var.c - i4) {
                nba1.e();
                i5 = dl81Var.c;
            } else if (i == 4 && i3 >= 8) {
                int s3 = dl81Var.s();
                int x = dl81Var.x();
                int a2 = x == 49 ? dl81Var.a() : 0;
                int s4 = dl81Var.s();
                if (x == 47) {
                    dl81Var.m(dl81Var.b + 1);
                }
                boolean z = s3 == 181 && (x == 49 || x == 47) && s4 == 3;
                if (x == 49) {
                    z &= a2 == 1195456820;
                }
                if (z) {
                    c(j, dl81Var, fb81VarArr);
                }
            }
            dl81Var.m(i5);
        }
    }

    public static void c(long j, dl81 dl81Var, fb81[] fb81VarArr) {
        long j2;
        int s = dl81Var.s();
        if ((s & 64) != 0) {
            dl81Var.m(dl81Var.b + 1);
            int i = (s & 31) * 3;
            int i2 = dl81Var.b;
            int length = fb81VarArr.length;
            int i3 = 0;
            while (i3 < length) {
                fb81 fb81Var = fb81VarArr[i3];
                dl81Var.m(i2);
                fb81Var.a(i, dl81Var);
                if (j != -9223372036854775807L) {
                    j2 = j;
                    fb81Var.b(j2, 1, i, 0, null);
                } else {
                    j2 = j;
                }
                i3++;
                j = j2;
            }
        }
    }

    public static final byte[] d(PublicKey publicKey) {
        byte[] encoded = publicKey.getEncoded();
        int length = publicKey.getEncoded().length;
        if (length == j.b) {
            length = encoded.length;
        }
        j.b(encoded.length, 0L, length);
        return new ByteString(f73.m(0, length, encoded)).f(JCP.DIGEST_SHA_256).v();
    }

    public static final EsiaCompleteResult e(Uri uri) {
        String queryParameter = uri.getQueryParameter(ClidProvider.STATE);
        if (queryParameter == null) {
            queryParameter = "";
        }
        String queryParameter2 = uri.getQueryParameter(AuthSdkActivity.RESPONSE_TYPE_CODE);
        String str = queryParameter2 != null ? queryParameter2 : "";
        if (queryParameter.length() <= 0 || str.length() <= 0) {
            return null;
        }
        return new EsiaCompleteResult(str, queryParameter);
    }

    public static final EsiaErrorResult f(Uri uri) {
        String queryParameter = uri.getQueryParameter("error");
        if (queryParameter == null) {
            queryParameter = "";
        }
        String queryParameter2 = uri.getQueryParameter("error_description");
        String str = queryParameter2 != null ? queryParameter2 : "";
        if (queryParameter.length() <= 0 && str.length() <= 0) {
            return null;
        }
        return new EsiaErrorResult(queryParameter, str);
    }
}
