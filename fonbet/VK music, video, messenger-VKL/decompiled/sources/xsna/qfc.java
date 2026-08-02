package xsna;

import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: ClassPathResourceMetadataLoader.java */
/* loaded from: classes8.dex */
public final class qfc implements ti20 {
    public static final Logger b = Logger.getLogger(qfc.class.getName());

    @Override // xsna.ti20
    public final InputStream d(String str) {
        InputStream resourceAsStream = qfc.class.getResourceAsStream(str);
        if (resourceAsStream == null) {
            b.log(Level.WARNING, "File " + str + " not found");
        }
        return resourceAsStream;
    }
}
