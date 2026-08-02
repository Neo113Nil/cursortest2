package defpackage;

import android.app.Activity;
import com.yandex.messaging.auth.AuthTheme;

/* loaded from: classes15.dex */
public final class ol3 {
    public final Activity a;

    public /* synthetic */ ol3(Activity activity) {
        this.a = activity;
    }

    public AuthTheme a() {
        return fxa1.c(kng0.messagingIsLightTheme, this.a).data != 0 ? AuthTheme.Light : AuthTheme.Dark;
    }
}
