package xsna;

import androidx.compose.runtime.a;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.playback.PlaybackLaunchMeta;
import java.util.List;
import java.util.Map;
import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class j150 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j150(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.b;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                k150 k150Var = (k150) obj5;
                f1m f1mVar = (f1m) obj4;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-43619845, intValue, -1, "com.vk.music.playlist.display.presentation.MusicPlaylistListContent.playlistItems.<anonymous> (MusicPlaylistListContent.kt:175)");
                    }
                    k150Var.h(((Boolean) f1mVar.getValue()).booleanValue(), aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                PlayerTrack playerTrack = (PlayerTrack) obj5;
                com.vk.music.player.playback.e eVar = (com.vk.music.player.playback.e) obj4;
                List list = (List) obj;
                List list2 = (List) obj2;
                Map map = (Map) obj3;
                MusicTrack musicTrack = playerTrack.b;
                if (musicTrack.b == 0 && epx.f(musicTrack.c, UserId.d)) {
                    PlaybackLaunchMeta playbackLaunchMeta = playerTrack.c;
                    Object obj6 = PlaybackLaunchMeta.g;
                    if (epx.f(playbackLaunchMeta, PlaybackLaunchMeta.a.a()) && playerTrack.d == 0 && playerTrack.e == 0 && playerTrack.f.length() == 0) {
                        playerTrack = null;
                    }
                }
                return new ixa0(eVar, playerTrack, list, list2, map);
            default:
                o3j0 o3j0Var = (o3j0) obj5;
                izs izsVar = (izs) obj4;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-86058514, intValue2, -1, "com.vk.video.ui.upload.impl.settings.presentation.compose.screen.SettingsScreen.<anonymous> (SettingsScreen.kt:66)");
                    }
                    boolean J = aVar2.J(o3j0Var) | aVar2.J(izsVar);
                    Object x = aVar2.x();
                    if (J || x == a.C0011a.a) {
                        x = new b7(24, o3j0Var, izsVar);
                        aVar2.R(x);
                    }
                    x1v0.a(null, null, null, null, null, null, false, null, (izs) x, aVar2, 0, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
        }
    }
}
