package defpackage;

import android.net.Uri;
import com.ybsdk.screens.initial.deeplink.SdkUri$InternalQueryParam;

/* loaded from: classes3.dex */
public final class e2g0 {
    public final /* synthetic */ hh51 a;

    public e2g0(kg51 kg51Var, a3h a3hVar, hh51 hh51Var) {
        this.a = hh51Var;
    }

    public final boolean a(Uri uri) {
        return c3h.k(uri);
    }

    public final Uri b(Uri uri) {
        return (Uri) this.a.g.invoke(bzk0.h(uri, SdkUri$InternalQueryParam.CALL_SOURCE, "PUSH"));
    }
}
