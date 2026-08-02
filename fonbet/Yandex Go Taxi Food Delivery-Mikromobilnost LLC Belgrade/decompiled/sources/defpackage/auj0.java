package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.a;
import ru.CryptoPro.JCSP.KeyStore.CSPStore;

/* loaded from: classes9.dex */
public final class auj0 extends r1r {
    public static final oq90 y;
    public final ClassLoader c;
    public final r1r w = r1r.a;
    public final i3y x = a.a(new csf0(11, this));

    static {
        String str = oq90.b;
        y = sms.f("/");
    }

    public auj0(ClassLoader classLoader) {
        this.c = classLoader;
    }

    public static String I(oq90 oq90Var) {
        oq90 oq90Var2 = y;
        oq90Var2.getClass();
        return g.b(oq90Var2, oq90Var, true).d(oq90Var2).a.w();
    }

    @Override // defpackage.r1r
    public final gfx B(oq90 oq90Var) {
        if (!sms.a(oq90Var)) {
            yhl.h(oq90Var, "file not found: ");
            return null;
        }
        String I = I(oq90Var);
        Iterator it = ((List) this.x.getValue()).iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            try {
                return ((r1r) pair.getFirst()).B(((oq90) pair.getSecond()).e(I));
            } catch (FileNotFoundException unused) {
            }
        }
        yhl.h(oq90Var, "file not found: ");
        return null;
    }

    @Override // defpackage.r1r
    public final uis0 D(oq90 oq90Var, boolean z) {
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.r1r
    public final y9t0 G(oq90 oq90Var) {
        if (!sms.a(oq90Var)) {
            yhl.h(oq90Var, "file not found: ");
            return null;
        }
        oq90 oq90Var2 = y;
        oq90Var2.getClass();
        URL resource = this.c.getResource(g.b(oq90Var2, oq90Var, false).d(oq90Var2).a.w());
        if (resource == null) {
            yhl.h(oq90Var, "file not found: ");
            return null;
        }
        URLConnection openConnection = resource.openConnection();
        if (openConnection instanceof JarURLConnection) {
            ((JarURLConnection) openConnection).setUseCaches(false);
        }
        return vng.H(openConnection.getInputStream());
    }

    @Override // defpackage.r1r
    public final uis0 a(oq90 oq90Var) {
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.r1r
    public final void c(oq90 oq90Var, oq90 oq90Var2) {
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.r1r
    public final void e(oq90 oq90Var) {
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.r1r
    public final void k(oq90 oq90Var) {
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.r1r
    public final List o(oq90 oq90Var) {
        String I = I(oq90Var);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (Pair pair : (List) this.x.getValue()) {
            r1r r1rVar = (r1r) pair.getFirst();
            oq90 oq90Var2 = (oq90) pair.getSecond();
            try {
                List o = r1rVar.o(oq90Var2.e(I));
                ArrayList arrayList = new ArrayList();
                for (Object obj : o) {
                    if (sms.a((oq90) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    oq90 oq90Var3 = (oq90) it.next();
                    arrayList2.add(y.e(evu0.Q(oq90Var2.a.w(), oq90Var3.a.w()).replace(CSPStore.UNIQUE_SEPARATOR, '/')));
                }
                ycc.r(arrayList2, linkedHashSet);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            return kotlin.collections.a.J0(linkedHashSet);
        }
        yhl.h(oq90Var, "file not found: ");
        return null;
    }

    @Override // defpackage.r1r
    public final m0r w(oq90 oq90Var) {
        if (!sms.a(oq90Var)) {
            return null;
        }
        String I = I(oq90Var);
        for (Pair pair : (List) this.x.getValue()) {
            m0r w = ((r1r) pair.getFirst()).w(((oq90) pair.getSecond()).e(I));
            if (w != null) {
                return w;
            }
        }
        return null;
    }
}
