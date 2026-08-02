package xsna;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.crypto.NoSuchPaddingException;
import org.json.JSONArray;

/* loaded from: classes12.dex */
public final class dfy0 extends IIgniteServiceCallback.Stub {
    public final ArrayList e;

    public dfy0(pay0 pay0Var) {
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        arrayList.add(pay0Var);
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onError(String str) {
        vay0.a("%s : unable to retrieve property: %s", "IgnitePropertyCallback", str);
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            yyy0 yyy0Var = ((pay0) it.next()).a;
            if (yyy0Var != null) {
                vay0.a("%s : on one dt error", "OneDTAuthenticator");
                yyy0Var.l.set(true);
                if (yyy0Var.e != null) {
                    vay0.d("%s : on one dt error : %s", "IgniteManager", str);
                }
            }
        }
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onSuccess(String str) {
        vay0.a("%s : property retrieved", "IgnitePropertyCallback");
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            yyy0 yyy0Var = ((pay0) it.next()).a;
            if (yyy0Var != null) {
                if (TextUtils.isEmpty(str)) {
                    vay0.a("%s : on one dt error", "OneDTAuthenticator");
                    yyy0Var.l.set(true);
                    if (yyy0Var.e != null) {
                        vay0.d("%s : on one dt error : %s", "IgniteManager", "One DT is empty");
                    }
                    ofy0.g(com.digitalturbine.ignite.authenticator.events.d.RAW_ONE_DT_ERROR, "error_code", com.digitalturbine.ignite.authenticator.events.c.ONE_DT_EMPTY_ENTITY.h());
                } else {
                    c0a c0aVar = yyy0Var.f;
                    c0aVar.getClass();
                    try {
                        Pair b = ((mkl) c0aVar.c).b(str);
                        JSONArray jSONArray = new JSONArray();
                        jSONArray.put(b.first).put(b.second);
                        ((SharedPreferences) c0aVar.b).edit().putString("odt", jSONArray.toString()).apply();
                    } catch (IOException e) {
                        e = e;
                        ofy0.g(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, be.J(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_STORE_ENCRYPTED_DATA));
                    } catch (InvalidAlgorithmParameterException e2) {
                        e = e2;
                        ofy0.g(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, be.J(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_STORE_ENCRYPTED_DATA));
                    } catch (InvalidKeyException e3) {
                        e = e3;
                        ofy0.g(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, be.J(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_STORE_ENCRYPTED_DATA));
                    } catch (NoSuchAlgorithmException e4) {
                        e = e4;
                        ofy0.g(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, be.J(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_STORE_ENCRYPTED_DATA));
                    } catch (NoSuchPaddingException e5) {
                        e = e5;
                        ofy0.g(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, be.J(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_STORE_ENCRYPTED_DATA));
                    } catch (Exception e6) {
                        ofy0.g(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, be.J(e6, com.digitalturbine.ignite.authenticator.events.c.FAILED_STORE_ENCRYPTED_DATA));
                    }
                    yyy0Var.g.getClass();
                    xfy0 b2 = fco0.b(str);
                    yyy0Var.h = b2;
                    awv awvVar = yyy0Var.e;
                    if (awvVar != null) {
                        vay0.a("%s : setting one dt entity", "IgniteManager");
                        awvVar.b = b2;
                    }
                }
            }
        }
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onProgress(String str) {
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onScheduled(String str) {
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onStart(String str) {
    }
}
