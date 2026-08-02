package xsna;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: FirebasePerformance.java */
/* loaded from: classes.dex */
public final class kjr {
    public static final ra2 e = ra2.d();
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final f9e0<yuf0> b;
    public final uir c;
    public final f9e0<top0> d;

    public kjr(vhr vhrVar, f9e0<yuf0> f9e0Var, uir uirVar, f9e0<top0> f9e0Var2, RemoteConfigManager remoteConfigManager, txi txiVar, SessionManager sessionManager) {
        Bundle bundle;
        this.b = f9e0Var;
        this.c = uirVar;
        this.d = f9e0Var2;
        if (vhrVar == null) {
            new cow(new Bundle());
            return;
        }
        xop0.a().d(vhrVar, uirVar, f9e0Var2);
        vhrVar.a();
        Context context = vhrVar.a;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e2) {
            e2.getMessage();
            bundle = null;
        }
        cow cowVar = bundle != null ? new cow(bundle) : new cow();
        remoteConfigManager.setFirebaseRemoteConfigProvider(f9e0Var);
        txiVar.s(cowVar);
        txiVar.q(context);
        sessionManager.setApplicationContext(context);
        Boolean g = txiVar.g();
        ra2 ra2Var = e;
        if (ra2Var.g()) {
            if (g != null ? g.booleanValue() : vhr.d().i()) {
                vhrVar.a();
                "Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: ".concat(l370.y(vhrVar.c.g, context.getPackageName()));
                ra2Var.e();
            }
        }
    }
}
