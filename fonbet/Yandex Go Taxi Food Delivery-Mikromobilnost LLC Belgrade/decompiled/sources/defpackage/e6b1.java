package defpackage;

import android.net.Uri;
import com.ybsdk.feature.deeplink.api.DeeplinkSource;
import com.ybsdk.rconfig.b;
import com.ybsdk.rconfig.configs.DeeplinkAllowedHosts;
import com.ybsdk.screens.initial.deeplink.SdkUri$InternalQueryParam;
import com.ybsdk.screens.initial.deeplink.SdkUri$QueryParam;
import java.util.Iterator;
import kotlin.collections.a;

/* loaded from: classes3.dex */
public abstract class e6b1 {
    public static au2 a;
    public static au2 b;

    public static final au2 a() {
        au2 au2Var = a;
        if (au2Var != null) {
            return au2Var;
        }
        lgv lgvVar = new lgv("BellM", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        a6t0 a6t0Var = new a6t0(iq2.g);
        uq90 uq90Var = new uq90();
        uq90Var.j(11.0f, 4.0f);
        uq90Var.g(2.0f);
        uq90Var.i(0.3f, 1.18f);
        uq90Var.b(4.8f, 4.8f, false, true, 3.28f, 3.86f);
        uq90Var.i(0.59f, 3.2f);
        uq90Var.e(0.17f, 0.97f, 0.83f, 1.76f, 1.83f, 2.31f);
        uq90Var.o(16.0f);
        uq90Var.e(0.0f, 0.62f, -1.6f, 1.14f, -4.02f, 1.37f);
        uq90Var.b(31.0f, 31.0f, false, true, -5.96f, 0.0f);
        uq90Var.d(6.6f, 17.14f, 5.0f, 16.62f, 5.0f, 16.0f);
        uq90Var.p(-1.45f);
        uq90Var.e(1.0f, -0.55f, 1.66f, -1.34f, 1.83f, -2.3f);
        uq90Var.i(0.59f, -3.2f);
        uq90Var.b(4.8f, 4.8f, false, true, 3.29f, -3.87f);
        uq90Var.c();
        uq90Var.j(9.35f, 18.4f);
        uq90Var.b(3.0f, 3.0f, false, false, 5.3f, 0.0f);
        uq90Var.b(32.0f, 32.0f, false, true, -5.3f, 0.0f);
        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var, null, "", uq90Var.a);
        au2 a2 = rya1.a(lgvVar.d(), true);
        a = a2;
        return a2;
    }

    public static final Uri b(Uri uri, b bVar, boolean z, SdkUri$QueryParam sdkUri$QueryParam) {
        String o = bzk0.o(uri, sdkUri$QueryParam);
        Uri parse = o != null ? Uri.parse(o) : null;
        if (parse == null) {
            x4c.g("Couldn't parse parameter from deeplink", null, "parameter=" + sdkUri$QueryParam + " ; deeplink=" + uri, null, 10);
            return null;
        }
        if (z || a.G(((DeeplinkAllowedHosts) bVar.d(a0h.a).getData()).getHosts(), parse.getHost())) {
            return parse;
        }
        trp0 trp0Var = trp0.a;
        trp0.e(new zqp0(parse.toString(), e(parse).name()));
        return null;
    }

    public static final boolean d(Uri uri) {
        if (jl40.l(uri.getScheme(), "ybapp")) {
            return true;
        }
        String scheme = uri.getScheme();
        String str = gay.a;
        return jl40.l(scheme, gay.b);
    }

    public static final DeeplinkSource e(Uri uri) {
        if (uri != null ? bzk0.i(uri, SdkUri$QueryParam.FROM_SHORTCUT, false) : false) {
            return DeeplinkSource.SHORTCUT;
        }
        s3h s3hVar = DeeplinkSource.Companion;
        Object obj = null;
        String n = uri != null ? bzk0.n(uri, SdkUri$InternalQueryParam.CALL_SOURCE) : null;
        s3hVar.getClass();
        Iterator<E> it = DeeplinkSource.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (jl40.l(((DeeplinkSource) next).name(), n)) {
                obj = next;
                break;
            }
        }
        DeeplinkSource deeplinkSource = (DeeplinkSource) obj;
        return deeplinkSource == null ? DeeplinkSource.UNSPECIFIED : deeplinkSource;
    }
}
