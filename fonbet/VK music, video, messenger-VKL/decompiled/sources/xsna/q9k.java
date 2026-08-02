package xsna;

import android.os.Bundle;
import com.google.firebase.perf.FirebasePerfRegistrar;
import java.util.concurrent.CopyOnWriteArrayList;
import one.video.cast.manager.status.MediaRouteConnectStatus;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class q9k implements b9i, k0a {
    public static Bundle a(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        return bundle;
    }

    public static String d(String str, long j, char c) {
        return str + j + c;
    }

    @Override // xsna.k0a
    public void b(int i) {
        CopyOnWriteArrayList<ez9> copyOnWriteArrayList = xsi0.a;
        xsi0.b(i != 1 ? i != 2 ? i != 3 ? i != 4 ? MediaRouteConnectStatus.NO_DEVICES_AVAILABLE : MediaRouteConnectStatus.CONNECTED : MediaRouteConnectStatus.CONNECTING : MediaRouteConnectStatus.NOT_CONNECTED : MediaRouteConnectStatus.NO_DEVICES_AVAILABLE);
    }

    @Override // xsna.b9i
    public Object c(lcg0 lcg0Var) {
        kjr providesFirebasePerformance;
        providesFirebasePerformance = FirebasePerfRegistrar.providesFirebasePerformance(lcg0Var);
        return providesFirebasePerformance;
    }
}
