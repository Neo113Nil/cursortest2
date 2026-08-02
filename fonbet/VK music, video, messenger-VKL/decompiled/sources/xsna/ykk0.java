package xsna;

import android.app.Activity;
import android.window.SplashScreen;
import com.vkontakte.android.R;

/* compiled from: SplashScreenThemeOverrider.kt */
/* loaded from: classes17.dex */
public final class ykk0 extends ja0 {
    public final int b = R.style.SplashTheme_Upscaled;

    @Override // xsna.ja0, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        SplashScreen splashScreen;
        splashScreen = activity.getSplashScreen();
        splashScreen.setSplashScreenTheme(this.b);
    }
}
