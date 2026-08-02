package xsna;

import androidx.annotation.NonNull;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;

/* compiled from: NetworkRequestMetricBuilderUtil.java */
/* loaded from: classes13.dex */
public final class f560 {
    public static final Pattern a = Pattern.compile("(^|.*\\s)datatransport/\\S+ android/($|\\s.*)");

    public static Long a(@NonNull HttpMessage httpMessage) {
        try {
            Header firstHeader = httpMessage.getFirstHeader("content-length");
            if (firstHeader != null) {
                return Long.valueOf(Long.parseLong(firstHeader.getValue()));
            }
            return null;
        } catch (NumberFormatException unused) {
            ra2.d().a();
            return null;
        }
    }

    public static String b(@NonNull HttpResponse httpResponse) {
        String value;
        Header firstHeader = httpResponse.getFirstHeader("content-type");
        if (firstHeader == null || (value = firstHeader.getValue()) == null) {
            return null;
        }
        return value;
    }

    public static void c(e560 e560Var) {
        if (!e560Var.e.p()) {
            e560Var.e.u(NetworkRequestMetric.NetworkClientErrorReason.GENERIC_CLIENT_ERROR);
        }
        e560Var.d();
    }
}
