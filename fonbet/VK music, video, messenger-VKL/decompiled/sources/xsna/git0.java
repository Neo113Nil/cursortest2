package xsna;

import android.net.Uri;
import okhttp3.p;

/* compiled from: VideoStandaloneAppInstaller.kt */
/* loaded from: classes6.dex */
public final class git0 {
    public static final bpn0 a = new bpn0(new yo80(15));
    public static final bpn0 b = new bpn0(new zo80(10));

    /* compiled from: VideoStandaloneAppInstaller.kt */
    public static final class a extends io.reactivex.rxjava3.observers.b<Object> {
    }

    public static void a(String str) {
        String uri = Uri.parse(str).buildUpon().appendQueryParameter("mt_no_redirect", "1").build().toString();
        p.a aVar = new p.a();
        aVar.i(uri);
        new io.reactivex.rxjava3.internal.operators.single.v(new bp0(aVar.b(), 6)).q(asu0.a.c()).subscribe(new a());
    }
}
