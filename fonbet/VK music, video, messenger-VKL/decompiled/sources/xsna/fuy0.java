package xsna;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.jsonwebtoken.Claims;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class fuy0 implements t9y0 {
    public Context f;
    public String g;
    public String h;
    public final String i;
    public day0 j;
    public IIgniteServiceAPI k;
    public bwy0 o;
    public bwy0 p;
    public boolean b = false;
    public boolean c = false;
    public long d = 0;
    public boolean e = false;
    public final Bundle l = new Bundle();
    public final Object m = new Object();
    public String q = null;
    public final mfy0 r = new mfy0(this);
    public final k9y0 n = new k9y0(this);

    public fuy0(Context context) {
        String str = null;
        this.f = context.getApplicationContext();
        Intent intent = new Intent("com.digitalturbine.ignite.cl.IgniteRemoteService");
        Context context2 = this.f;
        if (context2 != null) {
            List<ResolveInfo> queryIntentServices = context2.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices.size() > 0) {
                str = queryIntentServices.get(0).serviceInfo.packageName;
            }
        }
        this.i = str;
        this.j = new day0(false, "");
    }

    @Override // xsna.t9y0
    public final boolean a() {
        IIgniteServiceAPI iIgniteServiceAPI;
        return this.e && (iIgniteServiceAPI = this.k) != null && iIgniteServiceAPI.asBinder().isBinderAlive();
    }

    @Override // xsna.t9y0
    public final void b() {
        if (TextUtils.isEmpty(this.i)) {
            vay0.d("%s : unable to authenticate - there is no ignite on the device", "IgniteAuthenticationComponent");
            return;
        }
        if (!a()) {
            uiy0.a.execute(this.r);
        } else {
            if (!this.b || f()) {
                l();
                return;
            }
            Object[] objArr = {"IgniteAuthenticationComponent"};
            lnv lnvVar = (lnv) vay0.c.b;
            if (lnvVar != null) {
                lnvVar.i("%s : already authenticated", objArr);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // xsna.t9y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(String str) {
        String str2;
        bwy0 bwy0Var;
        vay0.a("%s: onAuthenticationSuccess", "IgniteAuthenticationComponent");
        this.c = false;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.q = str;
        this.l.putString("clientToken", str);
        this.b = true;
        String str3 = "";
        if (!TextUtils.isEmpty(str)) {
            try {
                str2 = new String(Base64.decode(str.split("\\.")[1], 8), C.UTF8_NAME);
            } catch (Exception e) {
                vay0.d("%s : decodeJwtBody : %s", "JwtUtil", e.toString());
            }
            if (!str2.isEmpty()) {
                try {
                    long optLong = new JSONObject(str2).optLong(Claims.EXPIRATION);
                    this.d = optLong;
                    long millis = TimeUnit.SECONDS.toMillis(optLong);
                    try {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTimeInMillis(millis);
                        str3 = simpleDateFormat.format(calendar.getTime());
                    } catch (Exception unused) {
                    }
                    vay0.a("%s : Ignite session will exp in: %s", "IgniteAuthenticationComponent", str3);
                } catch (Exception e2) {
                    ofy0.f(com.digitalturbine.ignite.authenticator.events.d.ONE_DT_GENERAL_ERROR, e2);
                    vay0.d("%s: resolveSessionExpiryTime : unable resolve session expiration : %s", "IgniteAuthenticationComponent", e2.toString());
                }
            }
            bwy0Var = this.o;
            if (bwy0Var == null) {
                bwy0Var.c(str);
                return;
            }
            return;
        }
        str2 = "";
        if (!str2.isEmpty()) {
        }
        bwy0Var = this.o;
        if (bwy0Var == null) {
        }
    }

    @Override // xsna.t9y0
    public final String d() {
        return this.i;
    }

    @Override // xsna.t9y0
    public final void destroy() {
        if (this.f != null && a()) {
            this.f.unbindService(this);
            this.f = null;
        }
        this.p = null;
        this.o = null;
        this.k = null;
    }

    @Override // xsna.t9y0
    public final String e() {
        return this.q;
    }

    @Override // xsna.t9y0
    public final boolean f() {
        return this.d > 0 && TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) > this.d;
    }

    @Override // xsna.t9y0
    public final Context g() {
        return this.f;
    }

    @Override // xsna.t9y0
    public final boolean h() {
        return this.b;
    }

    @Override // xsna.t9y0
    public final String i() {
        return this.j.a;
    }

    @Override // xsna.t9y0
    public final boolean j() {
        return this.j.b;
    }

    @Override // xsna.t9y0
    public final IIgniteServiceAPI k() {
        return this.k;
    }

    public final void l() {
        Bundle bundle = this.l;
        if (a()) {
            String str = this.g;
            String str2 = this.h;
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || this.c) {
                return;
            }
            if ((f() || !this.b) && this.k != null) {
                try {
                    this.c = true;
                    bundle.putInt("sdkFlowTypeKey", 1);
                    this.k.authenticate(this.g, this.h, bundle, this.n);
                } catch (RemoteException e) {
                    this.c = false;
                    ofy0.f(com.digitalturbine.ignite.authenticator.events.d.ONE_DT_AUTHENTICATION_ERROR, e);
                    vay0.d("%s: startAuthenticationProcess: unable to start authentication : %s", "IgniteAuthenticationComponent", e.toString());
                }
            }
        }
    }

    @Override // xsna.ray0
    public final void onCredentialsRequestFailed(String str) {
        vay0.d("%s: onCredentialsRequestFailed: %s", "IgniteAuthenticationComponent", str);
        b(str);
    }

    @Override // xsna.ray0
    public final void onCredentialsRequestSuccess(String str, String str2) {
        this.g = str;
        this.h = str2;
        l();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        vay0.a("%s : onIgniteConnected", "IgniteAuthenticationComponent");
        this.k = IIgniteServiceAPI.Stub.asInterface(iBinder);
        this.e = true;
        uiy0.a.execute(new oiy0(this, new lpy0(this, componentName, iBinder)));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.e = false;
        this.d = 0L;
        b("Service : " + (componentName != null ? componentName.getClassName() : "Ignite") + " disconnected");
    }

    @Override // xsna.t9y0
    public final void a(String str) {
        vay0.d("%s : onAuthenticationFailed : %s", "IgniteAuthenticationComponent", str);
        this.c = false;
        bwy0 bwy0Var = this.o;
        if (bwy0Var != null) {
            bwy0Var.a(str);
        }
    }

    @Override // xsna.t9y0
    public final void d(bwy0 bwy0Var) {
        this.o = bwy0Var;
    }

    @Override // xsna.t9y0
    public final void e(bwy0 bwy0Var) {
        this.p = bwy0Var;
    }

    @Override // xsna.t9y0
    public final void b(ComponentName componentName, IBinder iBinder) {
        bwy0 bwy0Var = this.p;
        if (bwy0Var != null) {
            bwy0Var.b(componentName, iBinder);
        }
    }

    @Override // xsna.t9y0
    public final void b(String str) {
        vay0.d("%s : onIgniteFailedToConnect : %s", "IgniteAuthenticationComponent", str);
        bwy0 bwy0Var = this.p;
        if (bwy0Var != null) {
            bwy0Var.b(str);
        }
    }

    @Override // xsna.t9y0
    public final boolean c() {
        return f() || !a();
    }
}
