package xsna;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import kotlin.Pair;
import xsna.aq90;

/* compiled from: ResourceFileSystem.kt */
/* loaded from: classes11.dex */
public final class rag0 extends tar {
    public static final aq90 e;
    public final ClassLoader b;
    public final wby c = tar.a;
    public final bpn0 d = new bpn0(new sag0(this));

    /* compiled from: ResourceFileSystem.kt */
    public static final class a {
        public static final boolean a(aq90 aq90Var) {
            aq90 aq90Var2 = rag0.e;
            return !brm0.v(aq90Var.c(), ".class", true);
        }
    }

    static {
        String str = aq90.c;
        e = aq90.a.a(DomExceptionUtils.SEPARATOR, false);
    }

    public rag0(ClassLoader classLoader) {
        this.b = classLoader;
    }

    @Override // xsna.tar
    public final void a(aq90 aq90Var, aq90 aq90Var2) {
        throw new IOException(this + " is read-only");
    }

    @Override // xsna.tar
    public final void b(aq90 aq90Var) {
        throw new IOException(this + " is read-only");
    }

    @Override // xsna.tar
    public final void c(aq90 aq90Var) {
        throw new IOException(this + " is read-only");
    }

    @Override // xsna.tar
    public final n9r e(aq90 aq90Var) {
        if (!a.a(aq90Var)) {
            return null;
        }
        aq90 aq90Var2 = e;
        aq90Var2.getClass();
        String A = d.b(aq90Var2, aq90Var, true).i(aq90Var2).b.A();
        for (Pair pair : (List) this.d.getValue()) {
            n9r e2 = ((tar) pair.d()).e(((aq90) pair.g()).j(A));
            if (e2 != null) {
                return e2;
            }
        }
        return null;
    }

    @Override // xsna.tar
    public final y8r f(aq90 aq90Var) {
        if (!a.a(aq90Var)) {
            throw new FileNotFoundException("file not found: " + aq90Var);
        }
        aq90 aq90Var2 = e;
        aq90Var2.getClass();
        String A = d.b(aq90Var2, aq90Var, true).i(aq90Var2).b.A();
        for (Pair pair : (List) this.d.getValue()) {
            try {
                return ((tar) pair.d()).f(((aq90) pair.g()).j(A));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + aq90Var);
    }

    @Override // xsna.tar
    public final y8r g(aq90 aq90Var) {
        throw new IOException("resources are not writable");
    }

    @Override // xsna.tar
    public final agk0 h(aq90 aq90Var) {
        if (!a.a(aq90Var)) {
            throw new FileNotFoundException("file not found: " + aq90Var);
        }
        aq90 aq90Var2 = e;
        aq90Var2.getClass();
        InputStream resourceAsStream = this.b.getResourceAsStream(d.b(aq90Var2, aq90Var, false).i(aq90Var2).b.A());
        if (resourceAsStream != null) {
            return mq9.d(resourceAsStream);
        }
        throw new FileNotFoundException("file not found: " + aq90Var);
    }
}
