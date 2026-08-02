package xsna;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.NoSuchPaddingException;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes12.dex */
public final class yyy0 extends bwy0 {
    public djy0 d;
    public awv e;
    public final c0a f;
    public final fco0 g;
    public xfy0 h;
    public pay0 i;
    public final boolean j;
    public final boolean k;
    public final AtomicBoolean l;

    public yyy0(t9y0 t9y0Var, boolean z, boolean z2, z65 z65Var, awv awvVar) {
        super(t9y0Var, z65Var);
        this.j = false;
        this.k = false;
        this.l = new AtomicBoolean(false);
        this.e = awvVar;
        this.j = z;
        this.g = new fco0();
        this.f = new c0a(t9y0Var.g());
        this.k = z2;
        if (z2) {
            Context g = t9y0Var.g();
            djy0 djy0Var = new djy0();
            djy0Var.b = g.getApplicationContext();
            com.digitalturbine.ignite.authenticator.receiver.a aVar = new com.digitalturbine.ignite.authenticator.receiver.a();
            aVar.b = false;
            aVar.a = djy0Var;
            djy0Var.a = aVar;
            djy0Var.c = this;
            djy0Var.d = this;
            this.d = djy0Var;
        }
    }

    @Override // xsna.bwy0, xsna.t9y0
    public final void b(ComponentName componentName, IBinder iBinder) {
        z65 z65Var;
        t9y0 t9y0Var = this.b;
        boolean j = t9y0Var.j();
        if (!j && (z65Var = this.c) != null) {
            z65Var.onOdtUnsupported();
        }
        if (this.d != null && t9y0Var.j() && this.k) {
            this.d.a();
        }
        if (j || this.j) {
            super.b(componentName, iBinder);
        }
    }

    @Override // xsna.bwy0, xsna.t9y0
    public final void c(String str) {
        super.c(str);
        t9y0 t9y0Var = this.b;
        if (t9y0Var.h()) {
            AtomicBoolean atomicBoolean = this.l;
            if (atomicBoolean.get() && t9y0Var.j()) {
                atomicBoolean.set(false);
                l();
            }
        }
    }

    @Override // xsna.bwy0, xsna.t9y0
    public final String d() {
        t9y0 t9y0Var = this.b;
        if (t9y0Var instanceof bwy0) {
            return t9y0Var.d();
        }
        return null;
    }

    @Override // xsna.bwy0, xsna.t9y0
    public final void destroy() {
        this.e = null;
        djy0 djy0Var = this.d;
        if (djy0Var != null) {
            com.digitalturbine.ignite.authenticator.receiver.a aVar = djy0Var.a;
            if (aVar != null && aVar.b) {
                djy0Var.b.unregisterReceiver(aVar);
                djy0Var.a.b = false;
            }
            com.digitalturbine.ignite.authenticator.receiver.a aVar2 = djy0Var.a;
            if (aVar2 != null) {
                aVar2.a = null;
                djy0Var.a = null;
            }
            djy0Var.c = null;
            djy0Var.b = null;
            djy0Var.d = null;
            this.d = null;
        }
        pay0 pay0Var = this.i;
        if (pay0Var != null) {
            dfy0 dfy0Var = pay0Var.b;
            if (dfy0Var != null) {
                dfy0Var.e.clear();
                pay0Var.b = null;
            }
            pay0Var.c = null;
            pay0Var.a = null;
            this.i = null;
        }
        this.c = null;
        this.b.destroy();
    }

    @Override // xsna.bwy0, xsna.t9y0
    public final String i() {
        t9y0 t9y0Var = this.b;
        if (t9y0Var instanceof bwy0) {
            return t9y0Var.i();
        }
        return null;
    }

    @Override // xsna.bwy0, xsna.t9y0
    public final boolean j() {
        return this.b.j();
    }

    public final void l() {
        t9y0 t9y0Var = this.b;
        IIgniteServiceAPI k = t9y0Var.k();
        if (k == null) {
            vay0.d("%s : service is unavailable", "OneDTAuthenticator");
            ofy0.g(com.digitalturbine.ignite.authenticator.events.d.ONE_DT_REQUEST_ERROR, "error_code", com.digitalturbine.ignite.authenticator.events.c.IGNITE_SERVICE_UNAVAILABLE.h());
            return;
        }
        if (this.i == null) {
            pay0 pay0Var = new pay0();
            pay0Var.a = this;
            pay0Var.b = new dfy0(pay0Var);
            pay0Var.c = k;
            this.i = pay0Var;
        }
        if (TextUtils.isEmpty(t9y0Var.e())) {
            ofy0.g(com.digitalturbine.ignite.authenticator.events.d.ONE_DT_REQUEST_ERROR, "error_code", com.digitalturbine.ignite.authenticator.events.c.IGNITE_SERVICE_INVALID_SESSION.h());
            vay0.d("%s : service session is unavailable", "OneDTAuthenticator");
            return;
        }
        pay0 pay0Var2 = this.i;
        String e = t9y0Var.e();
        pay0Var2.getClass();
        try {
            Bundle bundle = new Bundle();
            bundle.putString("clientToken", e);
            pay0Var2.c.getProperty("onedtid", bundle, new Bundle(), pay0Var2.b);
        } catch (RemoteException e2) {
            ofy0.f(com.digitalturbine.ignite.authenticator.events.d.ONE_DT_REQUEST_ERROR, e2);
            vay0.d("%s : request failed : %s", "OneDTPropertyHandler", e2.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010e  */
    @Override // xsna.bwy0, xsna.t9y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        boolean z;
        lnv lnvVar;
        String d;
        xfy0 b;
        xfy0 xfy0Var = this.h;
        AtomicBoolean atomicBoolean = this.l;
        vay0 vay0Var = vay0.c;
        if (xfy0Var == null) {
            Object[] objArr = {"OneDTAuthenticator"};
            lnv lnvVar2 = (lnv) vay0Var.b;
            if (lnvVar2 != null) {
                lnvVar2.i("%s : initializing new Ignite authentication session", objArr);
            }
            c0a c0aVar = this.f;
            c0aVar.getClass();
            mkl mklVar = (mkl) c0aVar.c;
            try {
                mklVar.e();
            } catch (IOException e) {
                e = e;
                ofy0.g(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, be.J(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_INIT_ENCRYPTION));
            } catch (InvalidAlgorithmParameterException e2) {
                e = e2;
                ofy0.g(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, be.J(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_INIT_ENCRYPTION));
            } catch (InvalidKeyException e3) {
                e = e3;
                ofy0.g(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, be.J(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_INIT_ENCRYPTION));
            } catch (KeyStoreException e4) {
                e = e4;
                ofy0.g(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, be.J(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_INIT_ENCRYPTION));
            } catch (NoSuchAlgorithmException e5) {
                e = e5;
                ofy0.g(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, be.J(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_INIT_ENCRYPTION));
            } catch (NoSuchProviderException e6) {
                e = e6;
                ofy0.g(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, be.J(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_INIT_ENCRYPTION));
            } catch (UnrecoverableEntryException e7) {
                e = e7;
                ofy0.g(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, be.J(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_INIT_ENCRYPTION));
            } catch (CertificateException e8) {
                e = e8;
                ofy0.g(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, be.J(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_INIT_ENCRYPTION));
            } catch (NoSuchPaddingException e9) {
                e = e9;
                ofy0.g(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, be.J(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_INIT_ENCRYPTION));
            } catch (Exception e10) {
                ofy0.g(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, be.J(e10, com.digitalturbine.ignite.authenticator.events.c.FAILED_INIT_ENCRYPTION));
            }
            String string = ((SharedPreferences) c0aVar.b).getString("odt", null);
            if (!TextUtils.isEmpty(string)) {
                try {
                    JSONArray jSONArray = new JSONArray(string);
                    d = mklVar.d(jSONArray.getString(1), Base64.decode(jSONArray.getString(0), 0));
                } catch (IOException e11) {
                    e = e11;
                    ofy0.g(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, be.J(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_EXTRACT_ENCRYPTED_DATA));
                    d = "";
                    this.g.getClass();
                    b = fco0.b(d);
                    this.h = b;
                    if (b.b <= TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
                    }
                    z = this.k;
                    if (!z) {
                    }
                    if (this.j) {
                    }
                    Object[] objArr2 = {"OneDTAuthenticator"};
                    lnvVar = (lnv) vay0Var.b;
                    if (lnvVar != null) {
                    }
                    this.b.b();
                } catch (InvalidAlgorithmParameterException e12) {
                    e = e12;
                    ofy0.g(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, be.J(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_EXTRACT_ENCRYPTED_DATA));
                    d = "";
                    this.g.getClass();
                    b = fco0.b(d);
                    this.h = b;
                    if (b.b <= TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
                    }
                    z = this.k;
                    if (!z) {
                    }
                    if (this.j) {
                    }
                    Object[] objArr22 = {"OneDTAuthenticator"};
                    lnvVar = (lnv) vay0Var.b;
                    if (lnvVar != null) {
                    }
                    this.b.b();
                } catch (InvalidKeyException e13) {
                    e = e13;
                    ofy0.g(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, be.J(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_EXTRACT_ENCRYPTED_DATA));
                    d = "";
                    this.g.getClass();
                    b = fco0.b(d);
                    this.h = b;
                    if (b.b <= TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
                    }
                    z = this.k;
                    if (!z) {
                    }
                    if (this.j) {
                    }
                    Object[] objArr222 = {"OneDTAuthenticator"};
                    lnvVar = (lnv) vay0Var.b;
                    if (lnvVar != null) {
                    }
                    this.b.b();
                } catch (NoSuchAlgorithmException e14) {
                    e = e14;
                    ofy0.g(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, be.J(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_EXTRACT_ENCRYPTED_DATA));
                    d = "";
                    this.g.getClass();
                    b = fco0.b(d);
                    this.h = b;
                    if (b.b <= TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
                    }
                    z = this.k;
                    if (!z) {
                    }
                    if (this.j) {
                    }
                    Object[] objArr2222 = {"OneDTAuthenticator"};
                    lnvVar = (lnv) vay0Var.b;
                    if (lnvVar != null) {
                    }
                    this.b.b();
                } catch (NoSuchPaddingException e15) {
                    e = e15;
                    ofy0.g(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, be.J(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_EXTRACT_ENCRYPTED_DATA));
                    d = "";
                    this.g.getClass();
                    b = fco0.b(d);
                    this.h = b;
                    if (b.b <= TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
                    }
                    z = this.k;
                    if (!z) {
                    }
                    if (this.j) {
                    }
                    Object[] objArr22222 = {"OneDTAuthenticator"};
                    lnvVar = (lnv) vay0Var.b;
                    if (lnvVar != null) {
                    }
                    this.b.b();
                } catch (JSONException e16) {
                    e = e16;
                    ofy0.g(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, be.J(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_EXTRACT_ENCRYPTED_DATA));
                    d = "";
                    this.g.getClass();
                    b = fco0.b(d);
                    this.h = b;
                    if (b.b <= TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
                    }
                    z = this.k;
                    if (!z) {
                    }
                    if (this.j) {
                    }
                    Object[] objArr222222 = {"OneDTAuthenticator"};
                    lnvVar = (lnv) vay0Var.b;
                    if (lnvVar != null) {
                    }
                    this.b.b();
                } catch (Exception e17) {
                    ofy0.g(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, be.J(e17, com.digitalturbine.ignite.authenticator.events.c.FAILED_EXTRACT_ENCRYPTED_DATA));
                }
                this.g.getClass();
                b = fco0.b(d);
                this.h = b;
                if (b.b <= TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
                    vay0.a("%s : One DT resolved from cache", "OneDTAuthenticator");
                    xfy0 xfy0Var2 = this.h;
                    awv awvVar = this.e;
                    if (awvVar != null) {
                        vay0.a("%s : setting one dt entity", "IgniteManager");
                        awvVar.b = xfy0Var2;
                    }
                } else {
                    atomicBoolean.set(true);
                }
            }
            d = "";
            this.g.getClass();
            b = fco0.b(d);
            this.h = b;
            if (b.b <= TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
            }
        }
        z = this.k;
        if (!z && this.d == null) {
            vay0.d("%s : unable to authenticate: authenticator destroyed", "OneDTAuthenticator");
            a("Unable to authenticate: authenticator destroyed");
            return;
        }
        if (this.j && !atomicBoolean.get()) {
            if (z) {
                this.d.a();
            }
        } else {
            Object[] objArr2222222 = {"OneDTAuthenticator"};
            lnvVar = (lnv) vay0Var.b;
            if (lnvVar != null) {
                lnvVar.i("%s : will try to authenticate with Ignite if didn't done yet", objArr2222222);
            }
            this.b.b();
        }
    }
}
