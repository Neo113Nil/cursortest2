package xsna;

import com.vk.video.playlist.playlistscreen.domain.PlaylistDataDo;
import com.vk.video.playlist.playlistscreen.ui.entity.PlaylistScreenInfoDataState;
import com.vk.video.playlist.playlistscreen.ui.entity.PlaylistScreenState;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: SubscribeDelegate.kt */
/* loaded from: classes6.dex */
public final class yvm0 {
    public static final void a(vcb0 vcb0Var) {
        if (((PlaylistScreenState) vcb0Var.b.getCurrentState()).d instanceof PlaylistScreenInfoDataState.Loaded) {
            c(vcb0Var, false, Boolean.valueOf(!((PlaylistScreenInfoDataState.Loaded) r0).b.d));
        }
    }

    public static final void b(vcb0 vcb0Var) {
        if (((PlaylistScreenState) vcb0Var.b.getCurrentState()).d instanceof PlaylistScreenInfoDataState.Loaded) {
            c(vcb0Var, true, Boolean.valueOf(!((PlaylistScreenInfoDataState.Loaded) r0).b.d));
        }
    }

    public static final void c(vcb0 vcb0Var, final boolean z, Boolean bool) {
        PlaylistScreenInfoDataState playlistScreenInfoDataState = ((PlaylistScreenState) vcb0Var.b.getCurrentState()).d;
        if (playlistScreenInfoDataState instanceof PlaylistScreenInfoDataState.Loaded) {
            final boolean booleanValue = bool.booleanValue();
            final PlaylistScreenInfoDataState.Loaded loaded = new PlaylistScreenInfoDataState.Loaded(PlaylistDataDo.a(((PlaylistScreenInfoDataState.Loaded) playlistScreenInfoDataState).b, booleanValue, z, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE));
            rdi.y(vcb0Var, new izs() { // from class: xsna.vvm0
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    PlaylistScreenState playlistScreenState = (PlaylistScreenState) obj;
                    PlaylistDataDo playlistDataDo = playlistScreenState.l;
                    return PlaylistScreenState.a(playlistScreenState, PlaylistScreenInfoDataState.Loaded.this, null, false, false, null, null, playlistDataDo != null ? PlaylistDataDo.a(playlistDataDo, booleanValue, z, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE) : null, 1019);
                }
            });
        }
    }
}
