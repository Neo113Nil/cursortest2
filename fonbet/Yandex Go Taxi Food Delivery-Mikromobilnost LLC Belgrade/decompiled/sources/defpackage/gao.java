package defpackage;

import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.core.utils.ext.ErrorResponse;
import com.ybsdk.core.utils.ext.ErrorResponseException;
import com.ybsdk.core.utils.network.retryPolicy.RetryTimeoutException;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class gao {
    public static final Text.Resource a = new Text.Resource(dzh0.ybsdk_common_design_common_error_title);
    public static final Text.Resource b = new Text.Resource(dzh0.ybsdk_common_design_common_error_subtitle);
    public static final Text.Resource c = new Text.Resource(dzh0.ybsdk_common_design_common_error_primary_button_text);
    public static final Text.Resource d = new Text.Resource(dzh0.ybsdk_common_design_network_error_title);
    public static final Text.Resource e = new Text.Resource(dzh0.ybsdk_common_design_network_error_subtitle);
    public static final Text.Resource f = new Text.Resource(dzh0.ybsdk_common_design_network_error_primary_button_text);
    public static final Text.Resource g = new Text.Resource(dzh0.ybsdk_common_design_network_error_paging_title);
    public static final Text.Resource h = new Text.Resource(dzh0.ybsdk_common_design_common_error_paging_title);
    public static final Text.Resource i = new Text.Resource(dzh0.ybsdk_common_design_common_error_paging_button_text);
    public static final Text.Resource j = new Text.Resource(dzh0.ybsdk_common_design_network_error_snackbar_title);
    public static final Text.Resource k = new Text.Resource(dzh0.ybsdk_common_design_network_error_snackbar_subtitle);
    public static final Text.Resource l = new Text.Resource(dzh0.ybsdk_common_design_common_error_snackbar_title);
    public static final Text.Resource m = new Text.Resource(dzh0.ybsdk_common_design_common_error_snackbar_subtitle);
    public static final Text.Resource n = new Text.Resource(dzh0.ybsdk_common_send_message_to_support);

    public static final Integer a(Throwable th) {
        ErrorResponse errorResponse;
        if (th instanceof ErrorResponseException) {
            return Integer.valueOf(((ErrorResponseException) th).getErrorResponse().getCode());
        }
        if (th instanceof RetryTimeoutException) {
            Throwable lastException = ((RetryTimeoutException) th).getLastException();
            ErrorResponseException errorResponseException = lastException instanceof ErrorResponseException ? (ErrorResponseException) lastException : null;
            if (errorResponseException != null && (errorResponse = errorResponseException.getErrorResponse()) != null) {
                return Integer.valueOf(errorResponse.getCode());
            }
        }
        return null;
    }

    public static final Text b(Throwable th, Text text) {
        if ((th instanceof IOException) || (th instanceof RetryTimeoutException.Network)) {
            return e;
        }
        boolean z = th instanceof FailDataException;
        Text.Resource resource = b;
        if (!z) {
            return text == null ? resource : text;
        }
        String description = ((FailDataException) th).getDescription();
        if (description != null) {
            if (evu0.J(description)) {
                description = null;
            }
            if (description != null) {
                return g8e.i(Text.Companion, description);
            }
        }
        return text == null ? resource : text;
    }

    public static final rbv c(Throwable th) {
        rbv c2;
        if ((th instanceof IOException) || (th instanceof RetryTimeoutException.Network)) {
            return new nbv(sxg0.ybsdk_ic_network_error_bottom_sheet, null);
        }
        if (!(th instanceof FailDataException)) {
            return new nbv(sxg0.ybsdk_ic_common_error_bottom_sheet, null);
        }
        wx21 icon = ((FailDataException) th).getIcon();
        return (icon == null || (c2 = fob1.c((String) icon.b, (String) icon.a, new l0o(4))) == null) ? new nbv(sxg0.ybsdk_ic_common_error_bottom_sheet, null) : c2;
    }

    public static final n0t0 d(Text text, Text text2, Throwable th) {
        if ((th instanceof IOException) || (th instanceof RetryTimeoutException.Network)) {
            return new n0t0(j, k);
        }
        if (!(th instanceof FailDataException)) {
            return new n0t0(text, text2);
        }
        FailDataException failDataException = (FailDataException) th;
        String error = failDataException.getError();
        if (evu0.J(error)) {
            error = null;
        }
        if (error != null) {
            text = d.e(error);
        }
        String description = failDataException.getDescription();
        if (description != null) {
            String str = evu0.J(description) ? null : description;
            if (str != null) {
                text2 = d.e(str);
            }
        }
        return new n0t0(text, text2);
    }

    public static /* synthetic */ n0t0 e(Text text, Text text2, Throwable th, int i2) {
        if ((i2 & 1) != 0) {
            text = l;
        }
        if ((i2 & 2) != 0) {
            text2 = m;
        }
        if ((i2 & 4) != 0) {
            th = null;
        }
        return d(text, text2, th);
    }

    public static final Text f(Throwable th, Text text) {
        if ((th instanceof IOException) || (th instanceof RetryTimeoutException.Network)) {
            return d;
        }
        boolean z = th instanceof FailDataException;
        Text.Resource resource = a;
        if (!z) {
            return text == null ? resource : text;
        }
        String error = ((FailDataException) th).getError();
        if (evu0.J(error)) {
            error = null;
        }
        return error != null ? g8e.i(Text.Companion, error) : text == null ? resource : text;
    }
}
