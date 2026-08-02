package defpackage;

import java.util.UUID;

/* loaded from: classes5.dex */
public final class ide {
    public final String a;
    public final String b;
    public final String c;

    static {
        new ide("", "", 12);
    }

    public ide(String str, String str2, int i) {
        String uuid = UUID.randomUUID().toString();
        if ((i & 8) != 0) {
            UUID.randomUUID().toString();
        }
        this.a = str;
        this.b = str2;
        this.c = uuid;
    }
}
