package xsna;

import android.net.Uri;
import com.unity3d.services.core.network.model.HttpRequest;
import java.net.URL;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.wvf0;

/* compiled from: RemoteSettingsFetcher.kt */
/* loaded from: classes.dex */
public final class yvf0 implements v5k {
    public final ad3 a;
    public final kotlin.coroutines.d b;

    public yvf0(ad3 ad3Var, @wv5 kotlin.coroutines.d dVar) {
        this.a = ad3Var;
        this.b = dVar;
    }

    public static final URL b(yvf0 yvf0Var) {
        yvf0Var.getClass();
        Uri.Builder appendPath = new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        ad3 ad3Var = yvf0Var.a;
        Uri.Builder appendPath2 = appendPath.appendPath(ad3Var.a).appendPath("settings");
        a22 a22Var = ad3Var.c;
        return new URL(appendPath2.appendQueryParameter("build_version", a22Var.c).appendQueryParameter("display_version", a22Var.b).build().toString());
    }

    @Override // xsna.v5k
    public final Object a(Map map, wvf0.b bVar, wvf0.c cVar, wvf0.a aVar) {
        Object k = myc0.k(this.b, new xvf0(this, map, bVar, cVar, null), aVar);
        return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : s3q0.a;
    }
}
