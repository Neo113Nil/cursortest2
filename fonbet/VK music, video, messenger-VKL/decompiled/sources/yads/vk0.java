package yads;

import android.media.MediaDrm;
import androidx.annotation.Nullable;
import com.huawei.hms.support.api.entity.auth.AuthCode;

/* loaded from: classes10.dex */
public abstract class vk0 {
    public static boolean a(@Nullable Throwable th) {
        return th instanceof MediaDrm.MediaDrmStateException;
    }

    public static int b(Throwable th) {
        int a = mc3.a(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo());
        if (a == 2 || a == 4) {
            return AuthCode.StatusCode.PERMISSION_NOT_AUTHORIZED;
        }
        if (a == 10) {
            return AuthCode.StatusCode.PERMISSION_NOT_EXIST;
        }
        if (a == 7) {
            return AuthCode.StatusCode.PERMISSION_NOT_AUTHORIZED;
        }
        if (a == 8) {
            return AuthCode.StatusCode.CERT_FINGERPRINT_ERROR;
        }
        switch (a) {
            case 15:
                return AuthCode.StatusCode.CERT_FINGERPRINT_ERROR;
            case 16:
            case 18:
                return AuthCode.StatusCode.PERMISSION_NOT_AUTHORIZED;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return AuthCode.StatusCode.PERMISSION_NOT_EXIST;
            default:
                switch (a) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return AuthCode.StatusCode.AUTH_INFO_NOT_EXIST;
                    default:
                        return AuthCode.StatusCode.PERMISSION_EXPIRED;
                }
        }
    }
}
