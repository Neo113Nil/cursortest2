package xsna;

import android.widget.ImageButton;
import android.widget.TextView;
import com.vk.core.ui.CircularProgressView;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.video.ui.discovery.minimizable.player.VideoMiniPlayerAction;
import com.vk.video.ui.discovery.minimizable.player.VideoPlayerStatus;
import com.vk.video.ui.discovery.minimizable.s;
import com.vkontakte.android.R;
import xsna.tts0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class cvs0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ VideoMinimizableDiscoveryFragment c;

    public /* synthetic */ cvs0(VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment, int i) {
        this.b = i;
        this.c = videoMinimizableDiscoveryFragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ed  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i = this.b;
        VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = this.c;
        switch (i) {
            case 0:
                s.d dVar = (s.d) obj;
                tts0 tts0Var = videoMinimizableDiscoveryFragment.V;
                if (tts0Var == null) {
                    tts0Var = null;
                }
                tts0Var.getClass();
                VideoMiniPlayerAction videoMiniPlayerAction = dVar.d;
                tts0.b bVar = tts0Var.a;
                boolean z = dVar.e;
                if (z) {
                    bVar.d.setVisibility(8);
                    bVar.e.setVisibility(8);
                    bVar.f.setVisibility(0);
                } else {
                    TextView textView = bVar.d;
                    TextView textView2 = bVar.e;
                    textView.setVisibility(0);
                    textView2.setVisibility(0);
                    bVar.f.setVisibility(8);
                    bVar.d.setText(dVar.a);
                    textView2.setText(dVar.b);
                }
                if (videoMiniPlayerAction == VideoMiniPlayerAction.Loading) {
                    bVar.g.setVisibility(4);
                    bVar.j.setVisibility(0);
                } else {
                    bVar.g.setVisibility(0);
                    bVar.j.setVisibility(4);
                    ImageButton imageButton = bVar.g;
                    int i2 = tts0.c.$EnumSwitchMapping$0[videoMiniPlayerAction.ordinal()];
                    imageButton.setImageResource(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? R.drawable.vk_icon_play_24 : R.drawable.vk_icon_replay_24 : R.drawable.vk_icon_refresh_outline_24 : R.drawable.vk_icon_skip_forward_24 : R.drawable.vk_icon_pause_24);
                }
                if (z) {
                    bVar.i.setProgressTintList(tts0Var.b(R.color.vk_orange_tint));
                } else {
                    bVar.i.setProgressTintList(tts0Var.b(R.color.vk_blue_200));
                }
                VideoPlayerStatus videoPlayerStatus = dVar.c;
                if (videoPlayerStatus instanceof VideoPlayerStatus.Announce) {
                    long j = ((VideoPlayerStatus.Announce) videoPlayerStatus).c;
                    if (j != 0) {
                        CircularProgressView circularProgressView = bVar.k;
                        circularProgressView.setVisibility(0);
                        circularProgressView.setMaxProgress(j);
                        circularProgressView.setProgress((j - r3.b) + 1);
                        tts0Var.h = dVar;
                        tts0Var.a();
                        VideoMinimizableDiscoveryFragment.b bVar2 = videoMinimizableDiscoveryFragment.U;
                        tts0.b bVar3 = (bVar2 != null ? bVar2 : null).b.f.a;
                        bVar3.d.post(new vrl(6, bVar3, videoMinimizableDiscoveryFragment));
                        break;
                    }
                }
                bVar.k.setVisibility(8);
                tts0Var.h = dVar;
                tts0Var.a();
                VideoMinimizableDiscoveryFragment.b bVar22 = videoMinimizableDiscoveryFragment.U;
                tts0.b bVar32 = (bVar22 != null ? bVar22 : null).b.f.a;
                bVar32.d.post(new vrl(6, bVar32, videoMinimizableDiscoveryFragment));
            default:
                int i3 = VideoMinimizableDiscoveryFragment.p1;
                c.f fVar = new c.f((String) obj);
                videoMinimizableDiscoveryFragment.getClass();
                xn50.a.c(videoMinimizableDiscoveryFragment, fVar);
                break;
        }
        return s3q0.a;
    }
}
