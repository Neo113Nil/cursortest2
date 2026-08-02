package defpackage;

import java.util.regex.Pattern;

/* loaded from: classes13.dex */
public abstract class d601 {
    public final Pattern a;

    public d601(String str) {
        this.a = Pattern.compile(str, 0);
    }

    public abstract String a(br brVar);
}
