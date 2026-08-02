package defpackage;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

/* loaded from: classes7.dex */
public abstract class d7z0 {
    public static final DateTimeFormatter a = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'").withZone(ZoneOffset.UTC);

    public static final String a(b7z0 b7z0Var) {
        return a.format(Instant.ofEpochMilli(b7z0Var.a()));
    }
}
