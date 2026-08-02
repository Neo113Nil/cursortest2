package xsna;

import android.app.PictureInPictureUiState;
import android.os.Build;

/* compiled from: PictureInPictureUiStateCompat.kt */
/* loaded from: classes11.dex */
public final class dka0 {

    /* compiled from: PictureInPictureUiStateCompat.kt */
    public static final class a {
        public static dka0 a(PictureInPictureUiState pictureInPictureUiState) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 35) {
                pictureInPictureUiState.isStashed();
                pictureInPictureUiState.isTransitioningToPip();
                return new dka0();
            }
            if (i < 31) {
                return new dka0();
            }
            pictureInPictureUiState.isStashed();
            return new dka0();
        }
    }
}
