package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

/* loaded from: classes10.dex */
public final class sc3 {
    public static final String c = "The Yandex Mobile Ads SDK needs to be updated to the latest version. Details in the logs";
    public final Handler a;
    public final Context b;

    public /* synthetic */ sc3(Context context) {
        this(context, new Handler(Looper.getMainLooper()));
    }

    public final void a() {
        this.a.post(new xsna.n93(this, 12));
    }

    public static final void a(sc3 sc3Var) {
        Toast.makeText(sc3Var.b, c, 1).show();
    }

    public sc3(Context context, Handler handler) {
        this.a = handler;
        this.b = context.getApplicationContext();
    }
}
