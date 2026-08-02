package xsna;

import java.io.IOException;
import xsna.aq90;

/* compiled from: FileSystem.kt */
/* loaded from: classes11.dex */
public abstract class tar {
    public static final wby a;

    static {
        wby wbyVar;
        try {
            Class.forName("java.nio.file.Files");
            wbyVar = new f270();
        } catch (ClassNotFoundException unused) {
            wbyVar = new wby();
        }
        a = wbyVar;
        String str = aq90.c;
        aq90.a.a(System.getProperty("java.io.tmpdir"), false);
        new rag0(rag0.class.getClassLoader());
    }

    public abstract void a(aq90 aq90Var, aq90 aq90Var2) throws IOException;

    public abstract void b(aq90 aq90Var) throws IOException;

    public abstract void c(aq90 aq90Var) throws IOException;

    public final boolean d(aq90 aq90Var) throws IOException {
        return e(aq90Var) != null;
    }

    public abstract n9r e(aq90 aq90Var) throws IOException;

    public abstract y8r f(aq90 aq90Var) throws IOException;

    public abstract y8r g(aq90 aq90Var) throws IOException;

    public abstract agk0 h(aq90 aq90Var) throws IOException;
}
