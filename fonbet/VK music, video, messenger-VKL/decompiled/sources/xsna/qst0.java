package xsna;

import android.view.View;
import android.widget.LinearLayout;
import com.vk.core.ui.floating_view.FloatingViewGesturesHelper;
import com.vkontakte.android.R;

/* compiled from: VideoWithBlockedAudioPopup.kt */
/* loaded from: classes3.dex */
public final class qst0 extends com.vk.music.notifications.inapp.c {
    public final String i;
    public final int j = 80;
    public final int k = R.layout.video_popup_with_blocked_audio;

    public qst0(String str) {
        this.i = str;
    }

    @Override // com.vk.music.notifications.inapp.c, com.vk.music.notifications.inapp.InAppNotification
    public final int F() {
        return this.j;
    }

    @Override // com.vk.music.notifications.inapp.InAppNotification
    public final int G() {
        return this.k;
    }

    @Override // com.vk.music.notifications.inapp.InAppNotification
    public final void d3(View view) {
        bwt0.i0(view.findViewById(R.id.video_popup_with_blocked_audio_action_button), new qjm0(this, 9));
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.video_popup_with_blocked_audio_container);
        int i = FloatingViewGesturesHelper.f;
        FloatingViewGesturesHelper.a.C0787a c0787a = new FloatingViewGesturesHelper.a.C0787a();
        c0787a.a = new cus0(this, 3);
        c0787a.b = new rtg0(this, linearLayout);
        c0787a.c = new pst0(this, linearLayout);
        c0787a.f = 0.5f;
        c0787a.e = 0.25f;
        c0787a.g = FloatingViewGesturesHelper.SwipeDirection.VerticalBottom;
        c0787a.a(linearLayout);
    }
}
