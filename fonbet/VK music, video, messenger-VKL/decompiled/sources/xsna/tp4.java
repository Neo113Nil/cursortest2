package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.PlaylistLink;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: AudioInteractor.kt */
/* loaded from: classes4.dex */
public final class tp4 {
    public final pn0 a;

    public tp4(pn0 pn0Var) {
        this.a = pn0Var;
    }

    public final io.reactivex.rxjava3.internal.operators.observable.j1 a(UserId userId, String str, Playlist playlist, int i, boolean z) {
        UserId userId2;
        Integer valueOf;
        PlaylistLink playlistLink;
        PlaylistLink playlistLink2;
        if (str.length() > 0) {
            tfx tfxVar = new tfx("audio.search", new ur(3), new vr(4));
            tfx.o(tfxVar, CampaignEx.JSON_KEY_AD_Q, str, 0, 0, 12);
            tfxVar.j("search_own", true);
            tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, i, 0, 0, 8);
            tfxVar.f(50, 0, 300, "count");
            return rsg0.T(yfb.x(tfxVar)).U(new uxb0(new orm(i, 1), 3));
        }
        UserId userId3 = (playlist == null || (playlistLink2 = playlist.f) == null) ? null : playlistLink2.c;
        Integer valueOf2 = (playlist == null || (playlistLink = playlist.f) == null) ? null : Integer.valueOf(playlistLink.b);
        if (epx.f(playlist != null ? Boolean.valueOf(playlist.Gb()) : null, Boolean.TRUE) && z && userId3 != null) {
            userId2 = userId3;
        } else {
            userId2 = (playlist != null ? playlist.c : null) != null ? playlist.c : userId;
        }
        if (z && epx.f(userId2, userId3)) {
            valueOf = valueOf2;
        } else {
            valueOf = playlist != null ? Integer.valueOf(playlist.b) : null;
        }
        return rsg0.T(yfb.x(hx4.C(new ix4(), userId2, valueOf, null, Integer.valueOf(i), 50, null, null, 16186))).U(new pu50(new b8e(i, playlist), 10));
    }
}
