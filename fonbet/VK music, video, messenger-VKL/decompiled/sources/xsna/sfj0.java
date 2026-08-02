package xsna;

import android.net.Uri;
import android.util.SparseArray;
import com.vk.api.generated.audio.dto.AudioArtistDto;
import com.vk.api.generated.audio.dto.AudioAudioAlbumDto;
import com.vk.api.generated.audio.dto.AudioPhotoDto;
import com.vk.api.generated.audio.dto.AudioRestrictionDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoAudioDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.AlbumLink;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Thumb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ShortVideoAudioToMusicTrackMapper.kt */
/* loaded from: classes3.dex */
public final class sfj0 {
    public static ArrayList a(List list) {
        if (list == null) {
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(sp.n((AudioArtistDto) it.next(), false));
        }
        return arrayList;
    }

    public static Uri b(String str) {
        if (str == null) {
            return null;
        }
        return Uri.parse(str);
    }

    public static MusicTrack c(ShortVideoAudioDto shortVideoAudioDto) {
        Thumb thumb;
        UserId q = shortVideoAudioDto.q();
        AudioRestrictionDto g = shortVideoAudioDto.g();
        int j = g != null ? g.j() : 0;
        ArrayList a = a(shortVideoAudioDto.n());
        ArrayList a2 = a(shortVideoAudioDto.i());
        int id = shortVideoAudioDto.getId();
        String title = shortVideoAudioDto.getTitle();
        String u = shortVideoAudioDto.u();
        int duration = shortVideoAudioDto.getDuration();
        String e = shortVideoAudioDto.e();
        String url = shortVideoAudioDto.getUrl();
        AudioAudioAlbumDto d = shortVideoAudioDto.d();
        AlbumLink albumLink = null;
        if (d != null) {
            AudioPhotoDto f = d.f();
            if (f == null) {
                thumb = null;
            } else {
                String id2 = f.getId();
                int height = f.getHeight();
                int width = f.getWidth();
                SparseArray sparseArray = new SparseArray();
                Uri b = b(f.i());
                if (b != null) {
                    sparseArray.append(34, b);
                }
                Uri b2 = b(f.k());
                if (b2 != null) {
                    sparseArray.append(68, b2);
                }
                Uri b3 = b(f.e());
                if (b3 != null) {
                    sparseArray.append(135, b3);
                }
                Uri b4 = b(f.f());
                if (b4 != null) {
                    sparseArray.append(atv0.b, b4);
                }
                Uri b5 = b(f.g());
                if (b5 != null) {
                    sparseArray.append(300, b5);
                }
                Uri b6 = b(f.j());
                if (b6 != null) {
                    sparseArray.append(600, b6);
                }
                Uri b7 = b(f.d());
                if (b7 != null) {
                    sparseArray.append(1200, b7);
                }
                thumb = new Thumb(id2, width, height, sparseArray);
            }
            albumLink = new AlbumLink(d.getId(), d.q(), d.d(), d.getTitle(), thumb, null, 32, null);
        }
        String r = shortVideoAudioDto.r();
        Boolean p = shortVideoAudioDto.p();
        Boolean bool = Boolean.TRUE;
        boolean f2 = epx.f(p, bool);
        boolean f3 = epx.f(shortVideoAudioDto.j(), bool);
        boolean f4 = epx.f(shortVideoAudioDto.k(), bool);
        Integer l = shortVideoAudioDto.l();
        return new MusicTrack(id, q, title, u, duration, j, e, url, null, 0, false, false, 0, null, false, albumLink, null, false, a, a2, null, null, null, r, 0L, 0, false, -1L, null, false, f2, false, null, null, null, shortVideoAudioDto.o(), f4, f3, 0, null, false, l != null ? l.intValue() : 0, epx.f(shortVideoAudioDto.f(), bool), null, null, false, 0, null, epx.f(shortVideoAudioDto.B(), bool), null, null, null, -1217167616, 981447, null);
    }
}
