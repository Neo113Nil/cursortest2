package xsna;

import android.app.Application;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.telephony.CellInfo;
import android.telephony.CellLocation;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import com.vk.reefton.literx.completable.LambdaCompletableObserver;
import com.vk.reefton.literx.observable.ObservableObserveOn;
import com.vk.reefton.literx.sbjects.PublishSubject;
import com.vk.reefton.literx.single.LambdaSingleObserver;
import com.vk.reefton.literx.single.SingleSubscribeOn;
import com.vk.reefton.observers.receivers.ReefNetworkReceiver;
import java.util.HashSet;
import java.util.List;
import xsna.cof0;
import xsna.jof0;

/* compiled from: ReefNetworkObserver.kt */
/* loaded from: classes5.dex */
public final class dof0 implements jof0.a {
    public final enf0 a;
    public final TelephonyManager b;
    public final hof0 c;
    public final aof0 d;
    public final b8h0 e;
    public final ReefNetworkReceiver f;
    public final HashSet<a> g;
    public volatile boolean h;
    public LambdaCompletableObserver i;
    public volatile jof0 j;
    public final PublishSubject<cof0> k;

    /* compiled from: ReefNetworkObserver.kt */
    public interface a {
        void a(cof0 cof0Var);
    }

    public dof0(Application application, enf0 enf0Var, TelephonyManager telephonyManager, hof0 hof0Var, aof0 aof0Var, b8h0 b8h0Var) {
        ReefNetworkReceiver reefNetworkReceiver = new ReefNetworkReceiver(application);
        this.a = enf0Var;
        this.b = telephonyManager;
        this.c = hof0Var;
        this.d = aof0Var;
        this.e = b8h0Var;
        this.f = reefNetworkReceiver;
        this.g = new HashSet<>();
        PublishSubject<cof0> publishSubject = new PublishSubject<>();
        this.k = publishSubject;
        new ObservableObserveOn(publishSubject, b8h0Var).c(new uh40(this, 19), new yka0(this, 6));
    }

    @Override // xsna.jof0.a
    public final void a(List<? extends CellInfo> list) {
        new SingleSubscribeOn(new juj0(new mh3(25, this, list)), this.e).a(new LambdaSingleObserver(null, z1v.b));
        this.k.onNext(new cof0.a(list));
    }

    @Override // xsna.jof0.a
    public final void b(int i, int i2) {
        this.k.onNext(new cof0.c(i, i2));
    }

    @Override // xsna.jof0.a
    public final void c(CellLocation cellLocation) {
        this.k.onNext(new cof0.b(cellLocation));
    }

    @Override // xsna.jof0.a
    public final void d(SignalStrength signalStrength) {
        this.k.onNext(new cof0.e(signalStrength));
    }

    public final void e() {
        ReefNetworkReceiver reefNetworkReceiver = this.f;
        reefNetworkReceiver.b = this;
        reefNetworkReceiver.a.registerReceiver(reefNetworkReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.h = true;
        TelephonyManager telephonyManager = this.b;
        if (telephonyManager != null) {
            i0 i0Var = new i0(9, this, new a5(21, this, telephonyManager));
            if (epx.f(Looper.myLooper(), Looper.getMainLooper())) {
                i0Var.run();
            } else {
                new Handler(Looper.getMainLooper()).post(i0Var);
            }
        }
    }
}
