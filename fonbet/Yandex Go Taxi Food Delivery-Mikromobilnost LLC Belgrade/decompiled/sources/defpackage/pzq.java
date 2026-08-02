package defpackage;

import com.adjust.sdk.Constants;

/* loaded from: classes15.dex */
public abstract class pzq {
    public static final d6w a = new d6w(Constants.MINIMAL_ERROR_STATUS_CODE, 599, 1);

    public static String a(int i) {
        if (i == 1000) {
            return "error_unknown";
        }
        if (i == 1001) {
            return "error_file_error";
        }
        if (i == 1002) {
            return "error_unauthorized";
        }
        if (i == 1006) {
            return "error_insufficient_space";
        }
        if (i == 1005) {
            return "error_too_many_redirects";
        }
        if (i == 1002) {
            return "error_unhandled_http_code";
        }
        if (i == 1008) {
            return "error_cannot_resume";
        }
        if (i == 1007) {
            return "error_device_not_found";
        }
        if (i == 1009) {
            return "error_file_already_exists";
        }
        d6w d6wVar = a;
        return oyr.i(i, (i > d6wVar.b || d6wVar.a > i) ? "download_manager_" : "http_");
    }
}
