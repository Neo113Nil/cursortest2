package xsna;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.text.TextUtils;
import com.ironsource.B2;
import com.vk.clips.tool.view.nps.internal.EdgesAwareNestedVerticalRecyclerView;
import com.vk.core.view.mediapicker.views.FastScrollerView;
import com.vk.dto.hints.HintId;
import com.vk.media.player.video.view.SimpleVideoView;
import com.vk.music.playerservice.impl.PlayerService;
import com.vk.newsfeed.common.views.clips.NewsFeedControlsLayout;
import com.vk.sharing.core.target.Targets;
import com.vk.stickers.bottomsheets.LegoStickersBottomSheetDialog;
import one.video.player.OneVideoPlayer;
import org.webrtc.EglBase14Impl;
import xsna.l7v;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class pu5 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pu5(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        OneVideoPlayer player;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                B2.d((B2) obj);
                break;
            case 1:
                Context context = (Context) obj;
                Handler handler = wo8.a;
                if (wo8.b(ca70.f(context)) <= 1) {
                    sv1.B(null, 3);
                    ca70.f(context).cancel(ca70.e(3));
                    break;
                }
                break;
            case 2:
                d3m.e(((s0e) obj).h(), (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 3000L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                break;
            case 3:
                c7k c7kVar = (c7k) obj;
                dcn dcnVar = c7kVar.q;
                if (dcnVar != null) {
                    dcnVar.dismiss();
                }
                Activity h = e3m.h(c7kVar.itemView.getContext());
                if (h != null) {
                    Rect rect = new Rect();
                    c7kVar.itemView.getGlobalVisibleRect(rect);
                    l7v b = pla.e().b();
                    String id = HintId.MUSIC_CREATE_CHAT_PLAYLIST.getId();
                    b.getClass();
                    c7kVar.q = new l7v.b(id, b, rect).j(h);
                    break;
                }
                break;
            case 4:
                ((sez) obj).cancel(true);
                break;
            case 5:
                com.vk.sharing.core.c cVar = (com.vk.sharing.core.c) obj;
                com.vk.sharing.core.view.l lVar = cVar.i;
                l4o0 l4o0Var = cVar.h;
                Targets targets = cVar.g;
                String str = targets.g;
                if (!TextUtils.isGraphic(str)) {
                    if (!targets.f().isEmpty()) {
                        lVar.Mh(targets.f(), true);
                        break;
                    } else {
                        l4o0Var.e("");
                        lVar.e0();
                        break;
                    }
                } else {
                    l4o0Var.e(str);
                    break;
                }
            case 6:
                int i2 = EdgesAwareNestedVerticalRecyclerView.e;
                ((EdgesAwareNestedVerticalRecyclerView) obj).getParent().requestDisallowInterceptTouchEvent(false);
                break;
            case 7:
                ((EglBase14Impl.EglConnection) obj).lambda$new$0();
                break;
            case 8:
                FastScrollerView fastScrollerView = (FastScrollerView) obj;
                if (!fastScrollerView.isPressed()) {
                    fastScrollerView.a();
                    break;
                }
                break;
            case 9:
                int i3 = LegoStickersBottomSheetDialog.d0;
                ((LegoStickersBottomSheetDialog) obj).tn();
                break;
            case 10:
                ((gzs) obj).invoke();
                break;
            case 11:
                NewsFeedControlsLayout.P4((NewsFeedControlsLayout) obj);
                break;
            case 12:
                PlayerService playerService = (PlayerService) obj;
                int i4 = PlayerService.t;
                bn40.f("PlayerService stopForeground: true");
                playerService.stopForeground(1);
                ((NotificationManager) playerService.getSystemService("notification")).cancel(2);
                Handler handler2 = playerService.e;
                if (handler2 != null) {
                    handler2.post(playerService.q);
                    break;
                }
                break;
            case 13:
                nnd0 nnd0Var = (nnd0) obj;
                ((p870) nnd0Var.G.getValue()).e(100, nnd0Var.q6());
                break;
            default:
                SimpleVideoView simpleVideoView = SimpleVideoView.this;
                player = simpleVideoView.getPlayer();
                if (player != null) {
                    player.setVolume(simpleVideoView.N);
                    break;
                }
                break;
        }
    }
}
