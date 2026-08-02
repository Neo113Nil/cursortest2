package sg.bigo.ads.api;

import android.app.Activity;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public interface SplashAd extends Ad {
    public static final String APP_LOGO_TRANSITION_NAME = "bigoads:splash:app_logo";
    public static final String APP_NAME_TRANSITION_NAME = "bigoads:splash:app_name";

    public enum Style {
        VERTICAL_FULLSCREEN,
        VERTICAL_HALFSCREEN,
        HORIZONTAL
    }

    Style getStyle();

    boolean isSkippable();

    @Override // sg.bigo.ads.api.Ad
    @Deprecated
    void setAdInteractionListener(AdInteractionListener adInteractionListener);

    void setAdInteractionListener(SplashAdInteractionListener splashAdInteractionListener);

    void show();

    void show(Activity activity);

    void showInAdContainer(@NonNull ViewGroup viewGroup);
}
