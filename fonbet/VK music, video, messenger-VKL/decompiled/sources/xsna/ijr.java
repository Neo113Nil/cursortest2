package xsna;

import android.content.Context;
import android.content.res.Resources;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import com.unity3d.services.core.network.model.HttpRequest;
import java.net.URI;
import java.util.Objects;

/* compiled from: FirebasePerfNetworkValidator.java */
/* loaded from: classes13.dex */
public final class ijr extends xv90 {
    public static final ra2 c = ra2.d();
    public final NetworkRequestMetric a;
    public final Context b;

    public ijr(NetworkRequestMetric networkRequestMetric, Context context) {
        this.b = context;
        this.a = networkRequestMetric;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    @Override // xsna.xv90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        URI create;
        NetworkRequestMetric networkRequestMetric = this.a;
        String url = networkRequestMetric.getUrl();
        boolean isEmpty = url == null ? true : url.trim().isEmpty();
        ra2 ra2Var = c;
        if (isEmpty) {
            ra2Var.h();
            return false;
        }
        String url2 = networkRequestMetric.getUrl();
        if (url2 != null) {
            try {
                create = URI.create(url2);
            } catch (IllegalArgumentException | IllegalStateException e) {
                ra2Var.i("getResultUrl throws exception %s", e.getMessage());
            }
            if (create != null) {
                ra2Var.h();
                return false;
            }
            Context context = this.b;
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
            if (identifier != 0) {
                ra2.d().a();
                if (qv20.e == null) {
                    qv20.e = resources.getStringArray(identifier);
                }
                String host = create.getHost();
                if (host != null) {
                    for (String str : qv20.e) {
                        if (!host.contains(str)) {
                        }
                    }
                    create.toString();
                    ra2Var.h();
                    return false;
                }
            }
            String host2 = create.getHost();
            if (host2 == null || host2.trim().isEmpty() || host2.length() > 255) {
                ra2Var.h();
                return false;
            }
            String scheme = create.getScheme();
            if (scheme == null || (!"http".equalsIgnoreCase(scheme) && !HttpRequest.DEFAULT_SCHEME.equalsIgnoreCase(scheme))) {
                ra2Var.h();
                return false;
            }
            if (create.getUserInfo() != null) {
                ra2Var.h();
                return false;
            }
            int port = create.getPort();
            if (port != -1 && port <= 0) {
                ra2Var.h();
                return false;
            }
            NetworkRequestMetric.HttpMethod w = networkRequestMetric.F() ? networkRequestMetric.w() : null;
            if (w == null || w == NetworkRequestMetric.HttpMethod.HTTP_METHOD_UNKNOWN) {
                Objects.toString(networkRequestMetric.w());
                ra2Var.h();
                return false;
            }
            if (networkRequestMetric.G() && networkRequestMetric.x() <= 0) {
                ra2Var.h();
                return false;
            }
            if (networkRequestMetric.H()) {
                if (!(networkRequestMetric.z() >= 0)) {
                    ra2Var.h();
                    return false;
                }
            }
            if (networkRequestMetric.I()) {
                if (!(networkRequestMetric.A() >= 0)) {
                    ra2Var.h();
                    return false;
                }
            }
            if (!networkRequestMetric.E() || networkRequestMetric.u() <= 0) {
                ra2Var.h();
                return false;
            }
            if (networkRequestMetric.J()) {
                if (!(networkRequestMetric.B() >= 0)) {
                    ra2Var.h();
                    return false;
                }
            }
            if (networkRequestMetric.L()) {
                if (!(networkRequestMetric.D() >= 0)) {
                    ra2Var.h();
                    return false;
                }
            }
            if (!networkRequestMetric.K() || networkRequestMetric.C() <= 0) {
                ra2Var.h();
                return false;
            }
            if (networkRequestMetric.G()) {
                return true;
            }
            ra2Var.h();
            return false;
        }
        create = null;
        if (create != null) {
        }
    }
}
