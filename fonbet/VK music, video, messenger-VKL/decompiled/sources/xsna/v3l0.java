package xsna;

import android.view.View;
import com.vkontakte.android.R;

/* compiled from: StickerDialogUtilImpl.kt */
/* loaded from: classes16.dex */
public final class v3l0 {
    public final void a(View view) {
        view.animate().alpha(1.0f).setDuration(200L).setInterpolator(new hlq()).start();
    }

    public final int b(boolean z) {
        return z ? R.style.StoryFullScreenNoStatusDialog : R.style.StoryFullScreenDialog;
    }
}
