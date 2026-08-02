package xsna;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.collections.EmptySet;
import xsna.d6q0;

/* compiled from: DefaultLocalTunnelDetector.kt */
/* loaded from: classes3.dex */
public final class whl implements bwz {
    public final f370 a;
    public final gzs<s3q0> b;
    public final gzs<Boolean> c;
    public final Object d;
    public boolean f;
    public boolean g;
    public mq2 i;
    public final vhl j;
    public final LinkedHashSet e = new LinkedHashSet();
    public final j260 h = new j260(new uhl(2, this, whl.class, "updateTrackedNetwork", "updateTrackedNetwork(Landroid/net/Network;Z)V", 0));

    public whl(Context context, f370 f370Var, d6q0.c cVar, dr6 dr6Var) {
        this.a = f370Var;
        this.b = cVar;
        this.c = dr6Var;
        this.d = msy.a(LazyThreadSafetyMode.NONE, new gbh(context, 6));
        this.j = cVar != null ? new vhl(cVar) : null;
    }

    @Override // xsna.bwz
    public final void a(boolean z) {
        Collection C;
        Object failure;
        if (this.c.invoke().booleanValue()) {
            Network activeNetwork = b().getActiveNetwork();
            if (activeNetwork != null) {
                try {
                    failure = b().getNetworkCapabilities(activeNetwork);
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                if (failure instanceof Result.Failure) {
                    failure = null;
                }
                NetworkCapabilities networkCapabilities = (NetworkCapabilities) failure;
                if (networkCapabilities == null || !networkCapabilities.hasTransport(4)) {
                    activeNetwork = null;
                }
                if (activeNetwork != null) {
                    C = Collections.singleton(activeNetwork);
                }
            }
            C = EmptySet.b;
        } else {
            C = rli0.C(rli0.j(rl3.D(b().getAllNetworks()), new cqf(this, 11)));
        }
        LinkedHashSet linkedHashSet = this.e;
        linkedHashSet.clear();
        linkedHashSet.addAll(C);
        boolean z2 = !linkedHashSet.isEmpty();
        this.g = z2;
        f370 f370Var = this.a;
        if (f370Var != null) {
            f370Var.b(new thl(z2, 0));
        }
        mq2 mq2Var = this.i;
        if (mq2Var != null) {
            mq2Var.invoke(Boolean.valueOf(z2), Boolean.valueOf(z));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ConnectivityManager b() {
        return (ConnectivityManager) this.d.getValue();
    }

    @Override // xsna.bwz
    public final void start() {
        if (this.f) {
            return;
        }
        NetworkRequest.Builder addTransportType = new NetworkRequest.Builder().removeCapability(15).addTransportType(4);
        vhl vhlVar = this.j;
        NetworkRequest.Builder addTransportType2 = vhlVar == null ? null : new NetworkRequest.Builder().removeCapability(15).addCapability(12).addTransportType(1).addTransportType(0);
        if (Build.VERSION.SDK_INT >= 31 && !this.c.invoke().booleanValue()) {
            addTransportType.setIncludeOtherUidNetworks(true);
            if (addTransportType2 != null) {
                addTransportType2.setIncludeOtherUidNetworks(true);
            }
        }
        NetworkRequest build = addTransportType.build();
        a(false);
        b().registerNetworkCallback(build, this.h);
        if (vhlVar != null && addTransportType2 != null) {
            b().registerNetworkCallback(addTransportType2.build(), vhlVar);
        }
        this.f = true;
    }
}
