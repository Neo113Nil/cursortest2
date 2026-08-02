package one.video.controls.views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.SwitchCompat;
import com.vkontakte.android.R;
import xsna.ozl;

/* compiled from: AutoPlaySwitchView.kt */
@ozl
/* loaded from: classes8.dex */
public final class AutoPlaySwitchView extends SwitchCompat {
    public AutoPlaySwitchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setChecked(false);
        setTag("dynamic_theme_ignored");
        setShowText(false);
        setThumbResource(R.drawable.one_video_autoplay_thumb);
        setTrackResource(R.drawable.one_video_autoplay_background);
    }
}
