package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.yandex.go.suggest.DestinationSuggest;
import java.security.cert.CRLSelector;
import java.security.cert.X509CRLSelector;

/* loaded from: classes4.dex */
public final class h0j {
    public boolean a;
    public boolean b;
    public final Object c;
    public Object d;
    public Object e;

    public h0j(u0j u0jVar, int i, String str, boolean z) {
        new zr0();
        this.c = u0jVar;
        this.d = str;
        this.a = z;
        this.e = new ii8(i, 4);
        this.b = false;
    }

    public static h0j d(a2 a2Var) {
        if (a2Var instanceof i3) {
            i3 i3Var = (i3) a2Var;
            return new h0j(new g3(i3Var, i3Var.size()));
        }
        if (a2Var instanceof j3) {
            return new h0j((j3) a2Var);
        }
        ny61.v("unknown object encountered: ".concat(a2Var.getClass().getName()));
        return null;
    }

    public n3 a() {
        this.a = true;
        a2 readObject = ((j3) this.c).readObject();
        this.e = readObject;
        if (readObject instanceof t3) {
            t3 t3Var = (t3) readObject;
            if (t3Var.l(0)) {
                n3 n3Var = (n3) t3Var.j(17);
                this.e = null;
                return n3Var;
            }
        }
        return null;
    }

    public n3 b() {
        if (!this.a) {
            ny61.v("getCerts() has not been called.");
            return null;
        }
        this.b = true;
        if (((a2) this.e) == null) {
            this.e = ((j3) this.c).readObject();
        }
        a2 a2Var = (a2) this.e;
        if (a2Var instanceof t3) {
            t3 t3Var = (t3) a2Var;
            if (t3Var.l(1)) {
                n3 n3Var = (n3) t3Var.j(17);
                this.e = null;
                return n3Var;
            }
        }
        return null;
    }

    public n3 c() {
        a2 readObject = ((j3) this.c).readObject();
        if (!(readObject instanceof m3)) {
            return (n3) readObject;
        }
        m3 m3Var = (m3) readObject;
        return new k3(m3Var, m3Var.a.length);
    }

    public n3 e() {
        if (!this.a || !this.b) {
            ny61.v("getCerts() and/or getCrls() has not been called.");
            return null;
        }
        if (((a2) this.e) == null) {
            this.e = ((j3) this.c).readObject();
        }
        return (n3) ((a2) this.e);
    }

    public h0j(X509CRLSelector x509CRLSelector) {
        this.a = false;
        this.d = null;
        this.e = null;
        this.b = false;
        this.c = (CRLSelector) x509CRLSelector.clone();
    }

    public h0j(ji41 ji41Var, qv71 qv71Var) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.c = ji41Var;
        this.d = qv71Var;
        this.e = handler;
    }

    public h0j(js81 js81Var, qv71 qv71Var) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.c = js81Var;
        this.d = qv71Var;
        this.e = handler;
    }

    public h0j(u0j u0jVar, String str, boolean z) {
        this(u0jVar, null, str, z, false);
    }

    public h0j(u0j u0jVar, DestinationSuggest destinationSuggest, String str, boolean z, boolean z2) {
        new zr0();
        this.c = u0jVar;
        this.d = str;
        this.e = new zvi(1, destinationSuggest);
        this.a = z;
        this.b = z2;
    }

    public h0j(j3 j3Var) {
        this.c = j3Var;
        this.d = (l2) j3Var.readObject();
    }
}
