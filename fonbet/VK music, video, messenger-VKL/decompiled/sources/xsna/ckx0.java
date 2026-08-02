package xsna;

import androidx.media3.common.ParserException;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/* compiled from: WebvttParserUtil.java */
/* loaded from: classes12.dex */
public final class ckx0 {
    public static final Pattern a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(xi90 xi90Var) {
        xi90Var.getClass();
        String q = xi90Var.q(StandardCharsets.UTF_8);
        return q != null && q.startsWith("WEBVTT");
    }

    public static float b(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        String str2 = y2r0.a;
        String[] split = str.split("\\.", 2);
        long j = 0;
        for (String str3 : split[0].split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1)) {
            j = (j * 60) + Long.parseLong(str3);
        }
        long j2 = j * 1000;
        if (split.length == 2) {
            String trim = split[1].trim();
            if (trim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: ".concat(trim));
            }
            j2 += Long.parseLong(trim);
        }
        return j2 * 1000;
    }

    public static void d(xi90 xi90Var) throws ParserException {
        int i = xi90Var.b;
        if (a(xi90Var)) {
            return;
        }
        xi90Var.P(i);
        throw ParserException.a(null, "Expected WEBVTT. Got " + xi90Var.q(StandardCharsets.UTF_8));
    }
}
