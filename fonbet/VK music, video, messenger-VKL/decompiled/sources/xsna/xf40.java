package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.music.common.MusicPlaybackLaunchContext;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: MusicCuratorModel.kt */
/* loaded from: classes3.dex */
public final class xf40 {
    public static io.reactivex.rxjava3.internal.operators.observable.j1 a(String str) {
        yo4 yo4Var = new yo4("audio.getAudiosByCurator", MusicTrack.e0);
        yo4Var.K("curator_id", str);
        yo4Var.C(200, "count");
        yo4Var.C(0, SignalingProtocol.KEY_OFFSET);
        return rsg0.y0(yo4Var, null, null, 3).U(new com.vk.movika.sdk.base.ui.p0(new com(19), 27));
    }

    public static void b(String str, String str2) {
        a(str).subscribe(new ubq(new l22(18, str, (Object) MusicPlaybackLaunchContext.Fb(str2)), 15), new fl30(new nk(29), 4));
    }
}
