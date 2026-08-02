package xsna;

import android.graphics.Bitmap;
import androidx.core.widget.NestedScrollView;
import com.vk.catalog2.feature.music.configuration.a;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.media.player.PlayerError;
import com.vk.media.player.video.view.SimpleVideoView;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.stickers.bridge.GiftData;
import com.vk.stickers.bridge.b;
import com.vk.superapp.api.dto.identity.WebIdentityAddress;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import ru.ok.android.webrtc.PeerConnectionClient;
import ru.ok.android.webrtc.SharedLocalMediaStreamSource;
import ru.ok.android.webrtc.di.CallModuleImpl;
import ru.ok.android.webrtc.protocol.RtcCommand;
import ru.ok.android.webrtc.protocol.RtcCommandOnSuccessListener;
import ru.ok.android.webrtc.protocol.RtcResponse;
import ru.ok.android.webrtc.protocol.commands.ChangeSimulcastCommand;
import ru.ok.android.webrtc.protocol.commands.ChangeSimulcastResponse;
import ru.ok.android.webrtc.stat.screenshare.StatsTrackIdClassifier;
import xsna.bzp0;
import xsna.c0e;
import xsna.ngl;
import xsna.p8c0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class op0 implements io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.l, SimpleVideoView.j, SharedLocalMediaStreamSource.StatsTrackIdClassifierConsumer, io.reactivex.rxjava3.functions.c, ngl.a, NestedScrollView.d, zag0, h9l, RtcCommandOnSuccessListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ op0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.zag0
    public void a(Object obj) {
        mhs mhsVar = (mhs) this.c;
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            mhsVar.a.a(bitmap);
        }
    }

    @Override // ru.ok.android.webrtc.SharedLocalMediaStreamSource.StatsTrackIdClassifierConsumer
    public void accept(StatsTrackIdClassifier statsTrackIdClassifier) {
        CallModuleImpl.a((CallModuleImpl) this.c, statsTrackIdClassifier);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 1:
                return (ir5) ((com.vk.video.ui.discovery.minimizable.related_videos.j) this.c).invoke(obj);
            case 2:
            case 3:
            case 4:
            case 8:
            case 10:
            case 11:
            case 13:
            case 16:
            case 19:
            case 20:
            case 26:
            case 27:
            default:
                return (p8c0.c) ((qey) this.c).invoke(obj);
            case 5:
                return (c0e.a) ((com.vk.video.ui.discovery.minimizable.related_videos.j) this.c).invoke(obj);
            case 6:
                return (io.reactivex.rxjava3.core.t) ((x4) this.c).invoke(obj);
            case 7:
                return (u2e) ((mx4) this.c).invoke(obj);
            case 9:
                return (Boolean) ((izs) this.c).invoke(obj);
            case 12:
                return (io.reactivex.rxjava3.core.e) ((bjk) this.c).invoke(obj);
            case 14:
                return (io.reactivex.rxjava3.core.x) ((bjk) this.c).c;
            case 15:
                return (it80) ((bjk) this.c).invoke(obj);
            case 17:
                return (Boolean) ((com.vk.movika.sdk.base.logic.interactor.f) this.c).invoke(obj);
            case 18:
                return (WebIdentityAddress) ((mit) this.c).invoke(obj);
            case 21:
                return (Boolean) ((v4v) this.c).invoke(obj);
            case 22:
                ((v4v) this.c).invoke(obj);
                return 0;
            case 23:
                return (hda) ((a.d) this.c).invoke(obj);
            case 24:
                return (List) ((h630) this.c).invoke(obj);
            case 25:
                return (kv60) ((bjk) this.c).invoke(obj);
            case 28:
                return (io.reactivex.rxjava3.core.e) ((k22) this.c).invoke(obj);
        }
    }

    @Override // com.vk.media.player.video.view.SimpleVideoView.j
    public void b(PlayerError playerError, Exception exc) {
        u440 u440Var = (u440) this.c;
        if (playerError != PlayerError.ERROR_NETWORK) {
            cvk.w(u440Var.U.getString(gpt0.n(playerError, false)), true);
        }
        if (exc != null) {
            com.vk.metrics.eventtracking.b.a.a(new RuntimeException("editor player error", exc));
        }
    }

    @Override // androidx.core.widget.NestedScrollView.d
    public void c(NestedScrollView nestedScrollView, int i) {
        ((a2q) this.c).yn();
    }

    @Override // xsna.ngl.a
    public void e(bzp0.c cVar) {
        dcp dcpVar = (dcp) ((fcp) this.c).a;
        if (dcpVar != null) {
            dcpVar.E1(cVar.a, (r5 & 2) == 0, (r5 & 4) == 0);
        }
    }

    @Override // ru.ok.android.webrtc.protocol.RtcCommandOnSuccessListener
    public void onRtcCommandSuccess(RtcCommand rtcCommand, RtcResponse rtcResponse) {
        ((PeerConnectionClient) this.c).a((ChangeSimulcastCommand) rtcCommand, (ChangeSimulcastResponse) rtcResponse);
    }

    @Override // xsna.h9l
    public g9l provide() {
        return new x4r((NewsfeedRouter) this.c);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 0:
                return ((Boolean) ((ha) this.c).invoke(obj)).booleanValue();
            case 4:
                return ((Boolean) ((com.vk.movika.sdk.base.logic.interactor.f) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((v4v) this.c).invoke(obj)).booleanValue();
        }
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        List list;
        switch (this.b) {
            case 8:
                return (ClipsPlaylist) ((w61) this.c).invoke(obj, obj2);
            case 9:
            default:
                return (Pair) ((aad) this.c).invoke(obj, obj2);
            case 10:
                UserId userId = (UserId) this.c;
                StickerStockItem stickerStockItem = (StickerStockItem) obj;
                if (((Collection) obj2).contains(Integer.valueOf(stickerStockItem.b))) {
                    list = Collections.singleton(userId);
                } else {
                    list = Collections.EMPTY_LIST;
                }
                return new b.a(stickerStockItem, new GiftData(list, false));
        }
    }
}
