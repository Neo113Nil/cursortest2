package xsna;

import android.widget.ImageView;
import com.vk.core.view.components.paging.list.VkErrorView;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.feed.design.view.newsfeed.overlay.VkOverlayCircleButton.b;
import com.vk.log.L;
import com.vk.voip.ui.scheduled.creation.ui.fragment.VoipEditTimeScheduledCallFragment;
import com.vk.writebar.fullscreen.WriteBarButtonsBubbleView;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class wfu0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wfu0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((com.vk.superapp.browser.ui.a) obj).Dn();
            case 1:
                return ((zuu0) obj).e.new b();
            case 2:
                int i2 = VkRecyclerPaginatedView.N;
                ((VkErrorView) obj).a();
                return s3q0.a;
            case 3:
                return (l7s) obj;
            case 4:
                int i3 = VoipEditTimeScheduledCallFragment.X;
                return new exw0(((VoipEditTimeScheduledCallFragment) obj).Q);
            case 5:
                L.e("VoipViewModelAudioDumpDelegate", "Call audio dump record completed");
                p4x0.e(R.string.voip_local_dump_completed, new Object[0]);
                L.e("VoipViewModelAudioDumpDelegate", "Stop record by record stopped signal");
                ((p4x0) obj).d();
                return s3q0.a;
            default:
                int i4 = WriteBarButtonsBubbleView.h;
                return (ImageView) ((WriteBarButtonsBubbleView) obj).findViewById(R.id.writebar_settings);
        }
    }
}
