package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient;
import com.google.android.gms.common.api.internal.zaae;
import com.google.android.gms.common.api.internal.zact;
import com.google.android.gms.common.internal.a;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.network.mapi.MapiClientImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* loaded from: classes.dex */
public final class jy81 implements wst, xst {
    public final zact A;
    public boolean B;
    public final /* synthetic */ GoogleApiManager F;
    public final om2 b;
    public final wn2 c;
    public final rx81 w;
    public final int z;
    public final LinkedList a = new LinkedList();
    public final HashSet x = new HashSet();
    public final HashMap y = new HashMap();
    public final ArrayList C = new ArrayList();
    public ConnectionResult D = null;
    public int E = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public jy81(GoogleApiManager googleApiManager, ust ustVar) {
        this.F = googleApiManager;
        Looper looper = googleApiManager.zar.getLooper();
        x2c a = ustVar.a();
        j63 j63Var = a.a;
        String str = a.b;
        String str2 = a.c;
        hbs0 hbs0Var = hbs0.a;
        y2c y2cVar = new y2c(j63Var, null, str, str2, hbs0Var);
        jm2 jm2Var = ustVar.c.a;
        cvw.l(jm2Var);
        om2 c = jm2Var.c(ustVar.a, looper, y2cVar, ustVar.d, this, this);
        String str3 = ustVar.b;
        if (str3 != null && (c instanceof a)) {
            ((a) c).Q = str3;
        }
        if (str3 != null && (c instanceof NonGmsServiceBrokerClient)) {
            ((NonGmsServiceBrokerClient) c).zac(str3);
        }
        this.b = c;
        this.c = ustVar.e;
        this.w = new rx81();
        this.z = ustVar.g;
        if (!c.requiresSignIn()) {
            this.A = null;
            return;
        }
        Context context = googleApiManager.zai;
        Handler handler = googleApiManager.zar;
        x2c a2 = ustVar.a();
        this.A = new zact(context, handler, new y2c(a2.a, null, a2.b, a2.c, hbs0Var));
    }

    public final Feature a(Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            Feature[] availableFeatures = this.b.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new Feature[0];
            }
            w53 w53Var = new w53(availableFeatures.length);
            for (Feature feature : availableFeatures) {
                w53Var.put(feature.getName(), Long.valueOf(feature.getVersion()));
            }
            for (Feature feature2 : featureArr) {
                Long l = (Long) w53Var.get(feature2.getName());
                if (l == null || l.longValue() < feature2.getVersion()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    public final void b(ConnectionResult connectionResult) {
        HashSet hashSet = this.x;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((zz81) it.next()).c(this.c, connectionResult, ooc.m(connectionResult, ConnectionResult.RESULT_SUCCESS) ? this.b.getEndpointPackageName() : null);
        }
        hashSet.clear();
    }

    public final void c(Status status) {
        cvw.g(this.F.zar);
        d(status, null, false);
    }

    public final void d(Status status, Exception exc, boolean z) {
        cvw.g(this.F.zar);
        if ((status == null) == (exc == null)) {
            ny61.g("Status XOR exception should be null");
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            vz81 vz81Var = (vz81) it.next();
            if (!z || vz81Var.a == 2) {
                if (status != null) {
                    vz81Var.a(status);
                } else {
                    vz81Var.b(exc);
                }
                it.remove();
            }
        }
    }

    public final void e() {
        LinkedList linkedList = this.a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            vz81 vz81Var = (vz81) arrayList.get(i);
            if (!this.b.isConnected()) {
                return;
            }
            if (j(vz81Var)) {
                linkedList.remove(vz81Var);
            }
        }
    }

    public final void f() {
        om2 om2Var = this.b;
        cvw.g(this.F.zar);
        this.D = null;
        b(ConnectionResult.RESULT_SUCCESS);
        i();
        Iterator it = this.y.values().iterator();
        while (it.hasNext()) {
            xy81 xy81Var = (xy81) it.next();
            if (a(xy81Var.a.b()) != null) {
                it.remove();
            } else {
                try {
                    xy81Var.a.c(om2Var, new atx0());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    om2Var.disconnect("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        e();
        h();
    }

    public final void g(int i) {
        yz81 yz81Var;
        GoogleApiManager googleApiManager = this.F;
        cvw.g(googleApiManager.zar);
        this.D = null;
        this.B = true;
        String lastDisconnectMessage = this.b.getLastDisconnectMessage();
        rx81 rx81Var = this.w;
        rx81Var.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (lastDisconnectMessage != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(lastDisconnectMessage);
        }
        rx81Var.a(new Status(20, sb.toString()), true);
        Handler handler = googleApiManager.zar;
        Handler handler2 = googleApiManager.zar;
        wn2 wn2Var = this.c;
        handler.sendMessageDelayed(Message.obtain(handler2, 9, wn2Var), 5000L);
        googleApiManager.zar.sendMessageDelayed(Message.obtain(googleApiManager.zar, 11, wn2Var), 120000L);
        yz81Var = googleApiManager.zak;
        yz81Var.a.clear();
        Iterator it = this.y.values().iterator();
        while (it.hasNext()) {
            ((xy81) it.next()).c.run();
        }
    }

    public final void h() {
        long j;
        GoogleApiManager googleApiManager = this.F;
        Handler handler = googleApiManager.zar;
        wn2 wn2Var = this.c;
        handler.removeMessages(12, wn2Var);
        Handler handler2 = googleApiManager.zar;
        Message obtainMessage = googleApiManager.zar.obtainMessage(12, wn2Var);
        j = googleApiManager.zae;
        handler2.sendMessageDelayed(obtainMessage, j);
    }

    public final void i() {
        if (this.B) {
            GoogleApiManager googleApiManager = this.F;
            Handler handler = googleApiManager.zar;
            wn2 wn2Var = this.c;
            handler.removeMessages(11, wn2Var);
            googleApiManager.zar.removeMessages(9, wn2Var);
            this.B = false;
        }
    }

    public final boolean j(vz81 vz81Var) {
        boolean z;
        boolean z2 = vz81Var instanceof py81;
        rx81 rx81Var = this.w;
        om2 om2Var = this.b;
        if (!z2) {
            vz81Var.d(rx81Var, om2Var.requiresSignIn());
            try {
                vz81Var.c(this);
                return true;
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                om2Var.disconnect("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        py81 py81Var = (py81) vz81Var;
        Feature a = a(py81Var.g(this));
        if (a == null) {
            vz81Var.d(rx81Var, om2Var.requiresSignIn());
            try {
                vz81Var.c(this);
                return true;
            } catch (DeadObjectException unused2) {
                onConnectionSuspended(1);
                om2Var.disconnect("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        om2Var.getClass();
        a.getName();
        a.getVersion();
        GoogleApiManager googleApiManager = this.F;
        z = googleApiManager.zas;
        if (!z || !py81Var.f(this)) {
            py81Var.b(new UnsupportedApiCallException(a));
            return true;
        }
        ky81 ky81Var = new ky81(this.c, a);
        ArrayList arrayList = this.C;
        int indexOf = arrayList.indexOf(ky81Var);
        if (indexOf >= 0) {
            ky81 ky81Var2 = (ky81) arrayList.get(indexOf);
            googleApiManager.zar.removeMessages(15, ky81Var2);
            googleApiManager.zar.sendMessageDelayed(Message.obtain(googleApiManager.zar, 15, ky81Var2), 5000L);
            return false;
        }
        arrayList.add(ky81Var);
        googleApiManager.zar.sendMessageDelayed(Message.obtain(googleApiManager.zar, 15, ky81Var), 5000L);
        googleApiManager.zar.sendMessageDelayed(Message.obtain(googleApiManager.zar, 16, ky81Var), 120000L);
        ConnectionResult connectionResult = new ConnectionResult(2, null);
        if (k(connectionResult)) {
            return false;
        }
        googleApiManager.zaE(connectionResult, this.z);
        return false;
    }

    public final boolean k(ConnectionResult connectionResult) {
        Object obj;
        zaae zaaeVar;
        Set set;
        zaae zaaeVar2;
        obj = GoogleApiManager.zac;
        synchronized (obj) {
            try {
                GoogleApiManager googleApiManager = this.F;
                zaaeVar = googleApiManager.zao;
                if (zaaeVar != null) {
                    set = googleApiManager.zap;
                    if (set.contains(this.c)) {
                        zaaeVar2 = this.F.zao;
                        zaaeVar2.zah(connectionResult, this.z);
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean l(boolean z) {
        cvw.g(this.F.zar);
        om2 om2Var = this.b;
        if (!om2Var.isConnected() || !this.y.isEmpty()) {
            return false;
        }
        rx81 rx81Var = this.w;
        if (rx81Var.a.isEmpty() && rx81Var.b.isEmpty()) {
            om2Var.disconnect("Timing out service connection.");
            return true;
        }
        if (!z) {
            return false;
        }
        h();
        return false;
    }

    public final void m() {
        yz81 yz81Var;
        GoogleApiManager googleApiManager = this.F;
        cvw.g(googleApiManager.zar);
        om2 om2Var = this.b;
        if (om2Var.isConnected() || om2Var.isConnecting()) {
            return;
        }
        try {
            yz81Var = googleApiManager.zak;
            int a = yz81Var.a(googleApiManager.zai, om2Var);
            if (a != 0) {
                ConnectionResult connectionResult = new ConnectionResult(a, null);
                connectionResult.toString();
                o(connectionResult, null);
                return;
            }
            ly81 ly81Var = new ly81(googleApiManager, om2Var, this.c);
            if (om2Var.requiresSignIn()) {
                zact zactVar = this.A;
                cvw.l(zactVar);
                zactVar.zae(ly81Var);
            }
            try {
                om2Var.connect(ly81Var);
            } catch (SecurityException e) {
                o(new ConnectionResult(10), e);
            }
        } catch (IllegalStateException e2) {
            o(new ConnectionResult(10), e2);
        }
    }

    public final void n(vz81 vz81Var) {
        cvw.g(this.F.zar);
        boolean isConnected = this.b.isConnected();
        LinkedList linkedList = this.a;
        if (isConnected) {
            if (j(vz81Var)) {
                h();
                return;
            } else {
                linkedList.add(vz81Var);
                return;
            }
        }
        linkedList.add(vz81Var);
        ConnectionResult connectionResult = this.D;
        if (connectionResult == null || !connectionResult.hasResolution()) {
            m();
        } else {
            o(this.D, null);
        }
    }

    public final void o(ConnectionResult connectionResult, RuntimeException runtimeException) {
        yz81 yz81Var;
        boolean z;
        Status zaF;
        Status zaF2;
        Status zaF3;
        Status status;
        GoogleApiManager googleApiManager = this.F;
        cvw.g(googleApiManager.zar);
        zact zactVar = this.A;
        if (zactVar != null) {
            zactVar.zaf();
        }
        cvw.g(googleApiManager.zar);
        this.D = null;
        yz81Var = googleApiManager.zak;
        yz81Var.a.clear();
        b(connectionResult);
        if ((this.b instanceof f091) && connectionResult.getErrorCode() != 24) {
            googleApiManager.zaf = true;
            googleApiManager.zar.sendMessageDelayed(googleApiManager.zar.obtainMessage(19), MapiClientImpl.RETRIES_TIME_MILLIS);
        }
        if (connectionResult.getErrorCode() == 4) {
            status = GoogleApiManager.zab;
            c(status);
            return;
        }
        LinkedList linkedList = this.a;
        if (linkedList.isEmpty()) {
            this.D = connectionResult;
            return;
        }
        if (runtimeException != null) {
            cvw.g(googleApiManager.zar);
            d(null, runtimeException, false);
            return;
        }
        z = googleApiManager.zas;
        wn2 wn2Var = this.c;
        if (!z) {
            zaF = GoogleApiManager.zaF(wn2Var, connectionResult);
            c(zaF);
            return;
        }
        zaF2 = GoogleApiManager.zaF(wn2Var, connectionResult);
        d(zaF2, null, true);
        if (linkedList.isEmpty() || k(connectionResult) || googleApiManager.zaE(connectionResult, this.z)) {
            return;
        }
        if (connectionResult.getErrorCode() == 18) {
            this.B = true;
        }
        if (this.B) {
            googleApiManager.zar.sendMessageDelayed(Message.obtain(googleApiManager.zar, 9, wn2Var), 5000L);
        } else {
            zaF3 = GoogleApiManager.zaF(wn2Var, connectionResult);
            c(zaF3);
        }
    }

    @Override // defpackage.t4e
    public final void onConnected(Bundle bundle) {
        Looper myLooper = Looper.myLooper();
        GoogleApiManager googleApiManager = this.F;
        if (myLooper == googleApiManager.zar.getLooper()) {
            f();
        } else {
            googleApiManager.zar.post(new h3s0(21, this));
        }
    }

    @Override // defpackage.yx60
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        o(connectionResult, null);
    }

    @Override // defpackage.t4e
    public final void onConnectionSuspended(int i) {
        Looper myLooper = Looper.myLooper();
        GoogleApiManager googleApiManager = this.F;
        if (myLooper == googleApiManager.zar.getLooper()) {
            g(i);
        } else {
            googleApiManager.zar.post(new hl7(this, i, 7));
        }
    }

    public final void p(ConnectionResult connectionResult) {
        cvw.g(this.F.zar);
        om2 om2Var = this.b;
        om2Var.disconnect("onSignInFailed for " + om2Var.getClass().getName() + " with " + String.valueOf(connectionResult));
        o(connectionResult, null);
    }

    public final void q() {
        cvw.g(this.F.zar);
        Status status = GoogleApiManager.zaa;
        c(status);
        rx81 rx81Var = this.w;
        rx81Var.getClass();
        rx81Var.a(status, false);
        for (luy luyVar : (luy[]) this.y.keySet().toArray(new luy[0])) {
            n(new oz81(luyVar, new atx0()));
        }
        b(new ConnectionResult(4));
        om2 om2Var = this.b;
        if (om2Var.isConnected()) {
            om2Var.onUserSignOut(new lm71(18, this));
        }
    }
}
