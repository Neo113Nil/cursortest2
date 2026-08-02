package defpackage;

import java.util.regex.Pattern;
import yads.aa2;

/* loaded from: classes7.dex */
public abstract class im81 {
    public static final /* synthetic */ int a = 0;

    static {
        Pattern.compile("^NOTE([ \t].*)?$");
    }

    public static long a(String str) {
        int i = rf71.a;
        String[] split = str.split("\\.", 2);
        long j = 0;
        for (String str2 : split[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (split.length == 2) {
            j2 += Long.parseLong(split[1]);
        }
        return j2 * 1000;
    }

    public static void b(dl81 dl81Var) {
        int i = dl81Var.b;
        String f = dl81Var.f();
        if (f == null || !f.startsWith("WEBVTT")) {
            dl81Var.m(i);
            throw new aa2("Expected WEBVTT. Got " + dl81Var.f(), null, true, 1);
        }
    }
}
