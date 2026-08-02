package xsna;

import com.vk.dto.music.Artist;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Thumb;
import com.vk.music.player.AdvertisementInfo;
import com.vk.music.player.PlayerTrack;
import com.vk.music.stickyplayer.domain.PlayerUiMode;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.gfp0;

/* compiled from: RedesignMusicRenderProvider.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class blf0 extends FunctionReferenceImpl implements izs<sy40, gfp0.b> {
    @Override // xsna.izs
    public final gfp0.b invoke(sy40 sy40Var) {
        PlayerTrack playerTrack;
        String str;
        sy40 sy40Var2 = sy40Var;
        ((llf0) this.receiver).getClass();
        PlayerUiMode playerUiMode = sy40Var2.b;
        AdvertisementInfo advertisementInfo = sy40Var2.s;
        PlayerUiMode playerUiMode2 = PlayerUiMode.ADVERTISEMENT;
        if (playerUiMode == playerUiMode2 && advertisementInfo != null) {
            String str2 = advertisementInfo.a;
            Thumb thumb = new Thumb(advertisementInfo.c);
            boolean z = advertisementInfo.d;
            return new gfp0.b.a(thumb, str2, z, z);
        }
        if (playerUiMode == playerUiMode2 || (playerTrack = sy40Var2.d) == null) {
            return gfp0.b.C2940b.a;
        }
        MusicTrack musicTrack = playerTrack.b;
        String str3 = playerTrack.f;
        Thumb Jb = musicTrack.Jb();
        int i = musicTrack.V;
        if (Jb == null) {
            Jb = lso0.a;
        }
        Thumb thumb2 = Jb;
        String b = llf0.b(musicTrack);
        ucp ucpVar = ucp.a;
        StringBuilder sb = new StringBuilder();
        List<Artist> list = musicTrack.t;
        if (list != null) {
            str = s490.i(list);
        } else {
            str = musicTrack.h;
            if (str == null) {
                str = "";
            }
        }
        sb.append(str);
        sb.append(' ');
        sb.append(s490.c(musicTrack.u));
        return new gfp0.b.c(str3, thumb2, b, ucp.i(drm0.p0(sb.toString()).toString()).toString(), musicTrack.Lb(), sy40Var2.A.get(musicTrack), jnj.c(i) || jnj.e(i), jnj.d(i));
    }
}
