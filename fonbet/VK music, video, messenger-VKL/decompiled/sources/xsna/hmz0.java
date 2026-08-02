package xsna;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import xsna.ehz;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
public final class hmz0 implements c.b, c.InterfaceC0114c {
    public final a.f b;
    public final ty2 e;
    public final qkz0 f;
    public final int i;

    @Nullable
    public final hnz0 j;
    public boolean k;
    public final /* synthetic */ d9u o;
    public final LinkedList a = new LinkedList();
    public final HashSet g = new HashSet();
    public final HashMap h = new HashMap();
    public final ArrayList l = new ArrayList();

    @Nullable
    public ConnectionResult m = null;
    public int n = 0;

    public hmz0(d9u d9uVar, com.google.android.gms.common.api.b bVar) {
        this.o = d9uVar;
        com.google.android.gms.internal.base.zar zarVar = d9uVar.o;
        a.f zaf = bVar.zaf(zarVar.getLooper(), this);
        this.b = zaf;
        this.e = bVar.getApiKey();
        this.f = new qkz0();
        this.i = bVar.zab();
        if (zaf.requiresSignIn()) {
            this.j = bVar.zac(d9uVar.f, zarVar);
        } else {
            this.j = null;
        }
    }

    public final void a() {
        a.f fVar = this.b;
        d9u d9uVar = this.o;
        exc0.d(d9uVar.o);
        this.m = null;
        l(ConnectionResult.g);
        if (this.k) {
            com.google.android.gms.internal.base.zar zarVar = d9uVar.o;
            ty2 ty2Var = this.e;
            zarVar.removeMessages(11, ty2Var);
            d9uVar.o.removeMessages(9, ty2Var);
            this.k = false;
        }
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            eqf0 eqf0Var = ((bnz0) it.next()).a;
            if (m(eqf0Var.b()) != null) {
                it.remove();
            } else {
                try {
                    eqf0Var.c(fVar, new TaskCompletionSource<>());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    fVar.disconnect("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException e) {
                    e = e;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                } catch (RuntimeException e2) {
                    e = e2;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                }
            }
        }
        d();
        j();
    }

    public final void b(int i) {
        exc0.d(this.o.o);
        this.m = null;
        this.k = true;
        String lastDisconnectMessage = this.b.getLastDisconnectMessage();
        qkz0 qkz0Var = this.f;
        qkz0Var.getClass();
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
        qkz0Var.a(new Status(20, sb.toString()), true);
        ty2 ty2Var = this.e;
        d9u d9uVar = this.o;
        com.google.android.gms.internal.base.zar zarVar = d9uVar.o;
        zarVar.sendMessageDelayed(Message.obtain(zarVar, 9, ty2Var), 5000L);
        com.google.android.gms.internal.base.zar zarVar2 = d9uVar.o;
        zarVar2.sendMessageDelayed(Message.obtain(zarVar2, 11, ty2Var), UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
        SparseIntArray sparseIntArray = d9uVar.h.a;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((bnz0) it.next()).c.run();
        }
    }

    public final boolean c(@NonNull ConnectionResult connectionResult) {
        synchronized (d9u.s) {
            try {
                d9u d9uVar = this.o;
                if (d9uVar.l == null || !d9uVar.m.contains(this.e)) {
                    return false;
                }
                d9uVar.l.d(connectionResult, this.i);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        LinkedList linkedList = this.a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            qoz0 qoz0Var = (qoz0) arrayList.get(i);
            if (!this.b.isConnected()) {
                return;
            }
            if (e(qoz0Var)) {
                linkedList.remove(qoz0Var);
            }
        }
    }

    public final boolean e(qoz0 qoz0Var) {
        if (!(qoz0Var instanceof tmz0)) {
            qkz0 qkz0Var = this.f;
            a.f fVar = this.b;
            qoz0Var.c(qkz0Var, fVar.requiresSignIn());
            try {
                qoz0Var.d(this);
                return true;
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                fVar.disconnect("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        tmz0 tmz0Var = (tmz0) qoz0Var;
        Feature m = m(tmz0Var.f(this));
        if (m == null) {
            qkz0 qkz0Var2 = this.f;
            a.f fVar2 = this.b;
            qoz0Var.c(qkz0Var2, fVar2.requiresSignIn());
            try {
                qoz0Var.d(this);
                return true;
            } catch (DeadObjectException unused2) {
                onConnectionSuspended(1);
                fVar2.disconnect("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        String name = this.b.getClass().getName();
        String str = m.b;
        long i = m.i();
        int length = name.length();
        new StringBuilder(length + 53 + String.valueOf(str).length() + 2 + String.valueOf(i).length() + 2);
        d9u d9uVar = this.o;
        if (!d9uVar.p || !tmz0Var.g(this)) {
            tmz0Var.b(new UnsupportedApiCallException(m));
            return true;
        }
        int h = tmz0Var.h(this);
        imz0 imz0Var = new imz0(this.e, m);
        ArrayList arrayList = this.l;
        int indexOf = arrayList.indexOf(imz0Var);
        if (indexOf >= 0) {
            imz0 imz0Var2 = (imz0) arrayList.get(indexOf);
            d9uVar.o.removeMessages(15, imz0Var2);
            d9uVar.o.sendMessageDelayed(Message.obtain(d9uVar.o, 15, imz0Var2), 5000L);
            return false;
        }
        arrayList.add(imz0Var);
        d9uVar.o.sendMessageDelayed(Message.obtain(d9uVar.o, 15, imz0Var), 5000L);
        d9uVar.o.sendMessageDelayed(Message.obtain(d9uVar.o, 16, imz0Var), UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
        ConnectionResult connectionResult = new ConnectionResult(2, null, null, Integer.valueOf(h));
        if (c(connectionResult)) {
            String str2 = m.b;
            long i2 = m.i();
            new StringBuilder(String.valueOf(str2).length() + 61 + String.valueOf(i2).length());
            return false;
        }
        if (!d9uVar.i(connectionResult, this.i)) {
            return false;
        }
        String str3 = m.b;
        long i3 = m.i();
        new StringBuilder(String.valueOf(str3).length() + 55 + String.valueOf(i3).length());
        return false;
    }

    @Override // xsna.x3j
    public final void f(@Nullable Bundle bundle) {
        d9u d9uVar = this.o;
        if (Looper.myLooper() == d9uVar.o.getLooper()) {
            a();
        } else {
            d9uVar.o.post(new dmz0(this));
        }
    }

    @Override // xsna.i380
    public final void g(@NonNull ConnectionResult connectionResult) {
        o(connectionResult, null);
    }

    public final void h(@Nullable Status status, @Nullable Exception exc, boolean z) {
        exc0.d(this.o.o);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            qoz0 qoz0Var = (qoz0) it.next();
            if (!z || qoz0Var.a == 2) {
                if (status != null) {
                    qoz0Var.a(status);
                } else {
                    qoz0Var.b(exc);
                }
                it.remove();
            }
        }
    }

    public final void i(Status status) {
        exc0.d(this.o.o);
        h(status, null, false);
    }

    public final void j() {
        d9u d9uVar = this.o;
        com.google.android.gms.internal.base.zar zarVar = d9uVar.o;
        ty2 ty2Var = this.e;
        zarVar.removeMessages(12, ty2Var);
        com.google.android.gms.internal.base.zar zarVar2 = d9uVar.o;
        zarVar2.sendMessageDelayed(zarVar2.obtainMessage(12, ty2Var), d9uVar.b);
    }

    public final boolean k(boolean z) {
        exc0.d(this.o.o);
        a.f fVar = this.b;
        if (!fVar.isConnected() || !this.h.isEmpty()) {
            return false;
        }
        qkz0 qkz0Var = this.f;
        if (qkz0Var.a.isEmpty() && qkz0Var.b.isEmpty()) {
            fVar.disconnect("Timing out service connection.");
            return true;
        }
        if (!z) {
            return false;
        }
        j();
        return false;
    }

    public final void l(ConnectionResult connectionResult) {
        HashSet hashSet = this.g;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
            return;
        }
        cpz0 cpz0Var = (cpz0) it.next();
        if (dq70.b(connectionResult, ConnectionResult.g)) {
            this.b.getEndpointPackageName();
        }
        cpz0Var.getClass();
        cpz0.b();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Feature m(@Nullable Feature[] featureArr) {
        if (featureArr == null || featureArr.length == 0) {
            return null;
        }
        Feature[] availableFeatures = this.b.getAvailableFeatures();
        if (availableFeatures == null) {
            availableFeatures = new Feature[0];
        }
        zk3 zk3Var = new zk3(availableFeatures.length);
        for (Feature feature : availableFeatures) {
            zk3Var.put(feature.b, Long.valueOf(feature.i()));
        }
        for (Feature feature2 : featureArr) {
            Long l = (Long) zk3Var.get(feature2.b);
            if (l == null || l.longValue() < feature2.i()) {
                return feature2;
            }
        }
        return null;
    }

    public final void n(@NonNull ConnectionResult connectionResult) {
        exc0.d(this.o.o);
        a.f fVar = this.b;
        String name = fVar.getClass().getName();
        String valueOf = String.valueOf(connectionResult);
        fVar.disconnect(h5s.d(new StringBuilder(name.length() + 25 + valueOf.length()), "onSignInFailed for ", name, " with ", valueOf));
        o(connectionResult, null);
    }

    public final void o(@NonNull ConnectionResult connectionResult, @Nullable RuntimeException runtimeException) {
        d9u d9uVar = this.o;
        exc0.d(d9uVar.o);
        hnz0 hnz0Var = this.j;
        if (hnz0Var != null) {
            hnz0Var.I1();
        }
        exc0.d(this.o.o);
        this.m = null;
        SparseIntArray sparseIntArray = d9uVar.h.a;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        l(connectionResult);
        if ((this.b instanceof ypz0) && connectionResult.c != 24) {
            d9uVar.c = true;
            com.google.android.gms.internal.base.zar zarVar = d9uVar.o;
            zarVar.sendMessageDelayed(zarVar.obtainMessage(19), 300000L);
        }
        int i = connectionResult.c;
        if (i == 4) {
            i(d9u.r);
            return;
        }
        if (i == 25) {
            i(d9u.d(this.e, connectionResult));
            return;
        }
        LinkedList linkedList = this.a;
        if (linkedList.isEmpty()) {
            this.m = connectionResult;
            return;
        }
        if (runtimeException != null) {
            exc0.d(d9uVar.o);
            h(null, runtimeException, false);
            return;
        }
        if (!d9uVar.p) {
            i(d9u.d(this.e, connectionResult));
            return;
        }
        ty2 ty2Var = this.e;
        h(d9u.d(ty2Var, connectionResult), null, true);
        if (linkedList.isEmpty() || c(connectionResult) || d9uVar.i(connectionResult, this.i)) {
            return;
        }
        if (connectionResult.c == 18) {
            this.k = true;
        }
        if (!this.k) {
            i(d9u.d(ty2Var, connectionResult));
        } else {
            com.google.android.gms.internal.base.zar zarVar2 = d9uVar.o;
            zarVar2.sendMessageDelayed(Message.obtain(zarVar2, 9, ty2Var), 5000L);
        }
    }

    @Override // xsna.x3j
    public final void onConnectionSuspended(int i) {
        d9u d9uVar = this.o;
        if (Looper.myLooper() == d9uVar.o.getLooper()) {
            b(i);
        } else {
            d9uVar.o.post(new emz0(this, i));
        }
    }

    public final void p(qoz0 qoz0Var) {
        exc0.d(this.o.o);
        boolean isConnected = this.b.isConnected();
        LinkedList linkedList = this.a;
        if (isConnected) {
            if (e(qoz0Var)) {
                j();
                return;
            } else {
                linkedList.add(qoz0Var);
                return;
            }
        }
        linkedList.add(qoz0Var);
        ConnectionResult connectionResult = this.m;
        if (connectionResult == null || !connectionResult.i()) {
            r();
        } else {
            o(this.m, null);
        }
    }

    public final void q() {
        exc0.d(this.o.o);
        Status status = d9u.q;
        i(status);
        qkz0 qkz0Var = this.f;
        qkz0Var.getClass();
        qkz0Var.a(status, false);
        for (ehz.a aVar : (ehz.a[]) this.h.keySet().toArray(new ehz.a[0])) {
            p(new noz0(aVar, new TaskCompletionSource()));
        }
        l(new ConnectionResult(4));
        a.f fVar = this.b;
        if (fVar.isConnected()) {
            fVar.onUserSignOut(new gmz0(this));
        }
    }

    public final void r() {
        d9u d9uVar = this.o;
        exc0.d(d9uVar.o);
        a.f fVar = this.b;
        if (fVar.isConnected() || fVar.isConnecting()) {
            return;
        }
        try {
            int a = d9uVar.h.a(d9uVar.f, fVar);
            if (a != 0) {
                ConnectionResult connectionResult = new ConnectionResult(a, null);
                new StringBuilder(fVar.getClass().getName().length() + 35 + connectionResult.toString().length());
                o(connectionResult, null);
                return;
            }
            kmz0 kmz0Var = new kmz0(d9uVar, fVar, this.e);
            if (fVar.requiresSignIn()) {
                hnz0 hnz0Var = this.j;
                exc0.i(hnz0Var);
                hnz0Var.H1(kmz0Var);
            }
            try {
                fVar.connect(kmz0Var);
            } catch (SecurityException e) {
                o(new ConnectionResult(10), e);
            }
        } catch (IllegalStateException e2) {
            o(new ConnectionResult(10), e2);
        }
    }
}
