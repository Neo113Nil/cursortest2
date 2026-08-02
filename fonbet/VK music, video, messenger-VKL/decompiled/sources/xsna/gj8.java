package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.picture.VkPicture;
import com.vkontakte.android.R;

/* compiled from: BroadcastSettingsStreamCover.kt */
/* loaded from: classes16.dex */
public final class gj8 extends ConstraintLayout {
    public final VkPicture t;
    public final View u;

    public gj8(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.live_broadcast_settings_stream_cover, (ViewGroup) this, true);
        this.t = (VkPicture) findViewById(R.id.live_broadcast_settings_stream_image);
        this.u = findViewById(R.id.live_broadcast_settings_stream_image_badge_soon);
    }

    public final void setIsBadgeVisible(boolean z) {
        bwt0.p0(this.u, z);
    }
}
