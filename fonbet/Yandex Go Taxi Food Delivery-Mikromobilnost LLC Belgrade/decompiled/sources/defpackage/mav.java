package defpackage;

import com.yandex.images.HttpException;
import java.net.UnknownHostException;

/* loaded from: classes15.dex */
public abstract class mav {
    public final String a;

    public mav(String str) {
        this.a = str;
    }

    public static final mav a(Exception exc) {
        if (exc.getCause() instanceof OutOfMemoryError) {
            return kav.e;
        }
        if (exc instanceof HttpException) {
            return new lav(((HttpException) exc).getCode());
        }
        if (exc instanceof UnknownHostException) {
            return kav.d;
        }
        StringBuilder sb = new StringBuilder(exc.toString());
        Throwable cause = exc.getCause();
        if (cause != null) {
            StringBuilder sb2 = new StringBuilder(cause.toString());
            Throwable cause2 = cause.getCause();
            if (cause2 != null) {
                sb2.append("\n Cause: ".concat(r4b1.c(cause2)));
            }
            sb.append("\n Cause: ".concat(sb2.toString()));
        }
        return new kav("exception: ".concat(sb.toString()));
    }
}
