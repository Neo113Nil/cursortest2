package yads;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public abstract class wp3 {
    public static final /* synthetic */ int a = 0;

    static {
        Pattern.compile("^NOTE([ \t].*)?$");
    }

    public static long a(String str) {
        int i = mc3.a;
        String[] split = str.split("\\.", 2);
        long j = 0;
        for (String str2 : split[0].split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1)) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (split.length == 2) {
            j2 += Long.parseLong(split[1]);
        }
        return j2 * 1000;
    }

    public static void a(kc2 kc2Var) {
        int i = kc2Var.b;
        String c = kc2Var.c();
        if (c == null || !c.startsWith("WEBVTT")) {
            kc2Var.e(i);
            throw new pc2("Expected WEBVTT. Got " + kc2Var.c(), null, true, 1);
        }
    }
}
