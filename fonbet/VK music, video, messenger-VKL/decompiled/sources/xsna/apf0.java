package xsna;

import android.app.Application;
import android.net.wifi.ScanResult;
import com.vk.reefton.observers.receivers.ReefWifiReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: ReefWifiObserver.kt */
/* loaded from: classes5.dex */
public final class apf0 implements ReefWifiReceiver.a {
    public final aof0 a;
    public final ReefWifiReceiver b;
    public final ArrayList c;
    public final HashSet<Object> d;

    public apf0(Application application, hof0 hof0Var, aof0 aof0Var) {
        ReefWifiReceiver reefWifiReceiver = new ReefWifiReceiver(application, hof0Var, aof0Var);
        this.a = aof0Var;
        this.b = reefWifiReceiver;
        this.c = new ArrayList();
        this.d = new HashSet<>();
    }

    @Override // com.vk.reefton.observers.receivers.ReefWifiReceiver.a
    public final void a(List<ScanResult> list) {
        ArrayList arrayList = this.c;
        arrayList.clear();
        arrayList.addAll(list);
    }
}
