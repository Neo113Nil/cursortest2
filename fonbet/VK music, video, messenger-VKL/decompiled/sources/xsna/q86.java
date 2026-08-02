package xsna;

import android.app.Activity;
import android.os.NetworkOnMainThreadException;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.design.view.component.video.seekbar.ClipSeekBarView;
import com.vk.core.view.mediapicker.views.FastScrollerView;
import com.vk.media.player.video.view.SimpleVideoView;
import com.vk.movika.impl.VideoInteractiveFullscreenFragment;
import com.vk.movika.impl.view.full.tooltip.TooltipOverlay;
import com.vkontakte.android.R;
import java.util.Iterator;
import org.webrtc.VpxDecoderWrapper;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class q86 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q86(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        int i2 = 0;
        Object obj = this.c;
        switch (i) {
            case 0:
                y440 y440Var = (y440) obj;
                Activity h = e3m.h(y440Var.getContext());
                if (h == null || h.isDestroyed() || h.isFinishing()) {
                    return;
                }
                com.vk.core.view.components.spinner.c cVar = y440Var.n;
                if (cVar != null) {
                    cVar.dismiss();
                }
                com.vk.core.view.components.spinner.c e = qv20.e(y440Var.getContext(), Integer.valueOf(R.string.story_processing));
                e.setCancelable(false);
                e.setCanceledOnTouchOutside(false);
                e.setOnCancelListener(new r86(y440Var, i2));
                e.setOnDismissListener(new s86(y440Var, i2));
                e.show();
                y440Var.n = e;
                return;
            case 1:
                ((pu) obj).invoke();
                return;
            case 2:
                ChannelFragment channelFragment = (ChannelFragment) obj;
                int i3 = ChannelFragment.a1;
                if (channelFragment.isAdded()) {
                    channelFragment.vo().d(R.string.vkim_channel_post_story_not_published);
                    return;
                }
                return;
            case 3:
                Iterator it = ((ClipSeekBarView) obj).j.iterator();
                while (it.hasNext()) {
                    ((g4i0) it.next()).a();
                }
                return;
            case 4:
                throw ((NetworkOnMainThreadException) obj);
            case 5:
                ((VpxDecoderWrapper) obj).close();
                return;
            case 6:
                ((FastScrollerView) obj).c.setVisibility(0);
                return;
            case 7:
                nx50 nx50Var = (nx50) obj;
                ((jwn0) nx50Var.V.getValue()).c(nx50Var.b, null);
                return;
            case 8:
                ((SimpleVideoView) obj).B.b();
                return;
            case 9:
                jck0 jck0Var = (jck0) obj;
                ((u2b0) jck0Var.d.getValue()).n0((com.vk.music.player.e) jck0Var.e.getValue());
                return;
            case 10:
                ((bmm0) obj).f();
                return;
            case 11:
                int i4 = TooltipOverlay.f;
                ((TooltipOverlay) obj).a(true);
                return;
            case 12:
                VideoInteractiveFullscreenFragment videoInteractiveFullscreenFragment = (VideoInteractiveFullscreenFragment) obj;
                if (videoInteractiveFullscreenFragment.G0 || videoInteractiveFullscreenFragment.isDetached() || !videoInteractiveFullscreenFragment.getLifecycle().getCurrentState().a(Lifecycle.State.CREATED)) {
                    return;
                }
                videoInteractiveFullscreenFragment.yo();
                return;
            case 13:
                ((View) obj).sendAccessibilityEvent(8);
                return;
            default:
                yads.vu1.a((yads.vu1) obj);
                return;
        }
    }
}
