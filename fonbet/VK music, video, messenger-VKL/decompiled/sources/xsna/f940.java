package xsna;

import android.net.Uri;
import android.util.SparseArray;
import com.vk.dto.common.account.AudioAdConfig;
import com.vk.dto.music.MusicTrack;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.AdvertisementInfo;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.g8x;

/* compiled from: MusicAdPlayerState.kt */
/* loaded from: classes3.dex */
public final class f940 {
    public final MusicPlaybackLaunchContext a;
    public final MusicTrack b;
    public final g8x c;
    public final g8x.c d;
    public final int e;
    public final List<ml20> f;
    public final AudioAdConfig g;
    public final AudioAdConfig.Type h;
    public final AdvertisementInfo i;

    public f940() {
        this(null, null, null, null, null, 255);
    }

    public static f940 a(f940 f940Var, g8x.c cVar, int i, int i2) {
        MusicPlaybackLaunchContext musicPlaybackLaunchContext = f940Var.a;
        MusicTrack musicTrack = f940Var.b;
        g8x g8xVar = f940Var.c;
        if ((i2 & 8) != 0) {
            cVar = f940Var.d;
        }
        g8x.c cVar2 = cVar;
        if ((i2 & 16) != 0) {
            i = f940Var.e;
        }
        int i3 = i;
        List<ml20> list = f940Var.f;
        AudioAdConfig audioAdConfig = f940Var.g;
        AudioAdConfig.Type type = (i2 & 128) != 0 ? f940Var.h : null;
        f940Var.getClass();
        return new f940(musicPlaybackLaunchContext, musicTrack, g8xVar, cVar2, i3, list, audioAdConfig, type);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f940)) {
            return false;
        }
        f940 f940Var = (f940) obj;
        return epx.f(this.a, f940Var.a) && epx.f(this.b, f940Var.b) && epx.f(this.c, f940Var.c) && epx.f(this.d, f940Var.d) && this.e == f940Var.e && epx.f(this.f, f940Var.f) && epx.f(this.g, f940Var.g) && this.h == f940Var.h;
    }

    public final int hashCode() {
        int hashCode = this.a.b.hashCode() * 31;
        MusicTrack musicTrack = this.b;
        int hashCode2 = (hashCode + (musicTrack == null ? 0 : musicTrack.hashCode())) * 31;
        g8x g8xVar = this.c;
        int hashCode3 = (hashCode2 + (g8xVar == null ? 0 : g8xVar.hashCode())) * 31;
        g8x.c cVar = this.d;
        int a = fw3.a(shy.a(this.e, (hashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31, 31), 31, this.f);
        AudioAdConfig audioAdConfig = this.g;
        int hashCode4 = (a + (audioAdConfig == null ? 0 : audioAdConfig.hashCode())) * 31;
        AudioAdConfig.Type type = this.h;
        return hashCode4 + (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        return "MusicAdPlayerState(refer=" + this.a + ", musicTrack=" + this.b + ", ad=" + this.c + ", currentBanner=" + this.d + ", adsCounter=" + this.e + ", midAdPoints=" + this.f + ", audioAdConfig=" + this.g + ", typeAd=" + this.h + ')';
    }

    public f940(MusicPlaybackLaunchContext musicPlaybackLaunchContext, MusicTrack musicTrack, g8x g8xVar, g8x.c cVar, int i, List<ml20> list, AudioAdConfig audioAdConfig, AudioAdConfig.Type type) {
        g8x.b bVar;
        this.a = musicPlaybackLaunchContext;
        this.b = musicTrack;
        this.c = g8xVar;
        this.d = cVar;
        this.e = i;
        this.f = list;
        this.g = audioAdConfig;
        this.h = type;
        AdvertisementInfo advertisementInfo = null;
        if (cVar != null && (bVar = (g8x.b) j5g.a0(cVar.k)) != null) {
            String str = bVar.h;
            SparseArray sparseArray = new SparseArray();
            if (str != null && str.length() != 0) {
                sparseArray.put(bVar.a, Uri.parse(str));
            }
            advertisementInfo = new AdvertisementInfo(bVar.l, sparseArray, bVar.g, cVar.f);
        }
        this.i = advertisementInfo;
    }

    public f940(MusicPlaybackLaunchContext musicPlaybackLaunchContext, MusicTrack musicTrack, g8x g8xVar, AudioAdConfig audioAdConfig, AudioAdConfig.Type type, int i) {
        this((i & 1) != 0 ? MusicPlaybackLaunchContext.d : musicPlaybackLaunchContext, (i & 2) != 0 ? null : musicTrack, (i & 4) != 0 ? null : g8xVar, null, 0, EmptyList.b, (i & 64) != 0 ? null : audioAdConfig, (i & 128) != 0 ? null : type);
    }
}
