package defpackage;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* loaded from: classes10.dex */
public interface khx {
    public static final Charset a = Charset.forName("UTF-8");

    void a(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
