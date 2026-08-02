package defpackage;

import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes11.dex */
public final class d0c {
    public static final Logger a = Logger.getLogger(d0c.class.getName());

    public static InputStream a(String str) {
        InputStream resourceAsStream = d0c.class.getResourceAsStream(str);
        if (resourceAsStream == null) {
            a.log(Level.WARNING, "File " + str + " not found");
        }
        return resourceAsStream;
    }
}
