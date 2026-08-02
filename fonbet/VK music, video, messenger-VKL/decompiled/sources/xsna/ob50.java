package xsna;

import com.vk.api.generated.audio.dto.AudioStreamDto;
import com.vk.dto.music.Artist;
import com.vk.dto.music.AudioStream;
import com.vk.dto.music.MusicTrack;
import com.vk.music.player.StartPlayVkMixSource;
import java.util.Iterator;
import java.util.List;
import xsna.k840;

/* compiled from: MusicTrackExt.kt */
/* loaded from: classes3.dex */
public final class ob50 {
    public static final String a(MusicTrack musicTrack) {
        Artist artist;
        String str;
        List<Artist> list = musicTrack.t;
        if (list != null && (artist = (Artist) j5g.a0(list)) != null && (str = artist.c) != null) {
            return str;
        }
        String str2 = musicTrack.h;
        return str2 == null ? "" : str2;
    }

    public static final AudioStreamDto.TypeDto b(MusicTrack musicTrack) {
        AudioStream audioStream;
        AudioStream audioStream2;
        AudioStream audioStream3;
        AudioStream audioStream4;
        String str;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        List<AudioStream> list = musicTrack.j;
        List<AudioStream> list2 = list;
        Object obj6 = null;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj5 = null;
                    break;
                }
                obj5 = it.next();
                if (epx.f(((AudioStream) obj5).b, AudioStreamDto.TypeDto.DASH.j())) {
                    break;
                }
            }
            audioStream = (AudioStream) obj5;
        } else {
            audioStream = null;
        }
        if (list != null) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj4 = null;
                    break;
                }
                obj4 = it2.next();
                if (epx.f(((AudioStream) obj4).b, AudioStreamDto.TypeDto.HLS_RANGE.j())) {
                    break;
                }
            }
            audioStream2 = (AudioStream) obj4;
        } else {
            audioStream2 = null;
        }
        if (list != null) {
            Iterator<T> it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it3.next();
                if (epx.f(((AudioStream) obj3).b, AudioStreamDto.TypeDto.HLS_TS.j())) {
                    break;
                }
            }
            audioStream3 = (AudioStream) obj3;
        } else {
            audioStream3 = null;
        }
        if (list != null) {
            Iterator<T> it4 = list.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it4.next();
                if (epx.f(((AudioStream) obj2).b, AudioStreamDto.TypeDto.HLS.j())) {
                    break;
                }
            }
            audioStream4 = (AudioStream) obj2;
        } else {
            audioStream4 = null;
        }
        if (audioStream == null || (str = audioStream.c) == null) {
            str = audioStream2 != null ? audioStream2.c : null;
            if (str == null) {
                str = audioStream3 != null ? audioStream3.c : null;
                if (str == null) {
                    str = audioStream4 != null ? audioStream4.c : null;
                }
            }
        }
        Iterator<T> it5 = list.iterator();
        while (true) {
            if (!it5.hasNext()) {
                obj = null;
                break;
            }
            obj = it5.next();
            AudioStream audioStream5 = (AudioStream) obj;
            if (epx.f(audioStream5.c, str) || epx.f(audioStream5.d, str)) {
                break;
            }
        }
        AudioStream audioStream6 = (AudioStream) obj;
        String str2 = audioStream6 != null ? audioStream6.b : null;
        if (str == null || str2 == null) {
            return null;
        }
        Iterator<E> it6 = AudioStreamDto.TypeDto.i().iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            Object next = it6.next();
            if (epx.f(((AudioStreamDto.TypeDto) next).j(), str2)) {
                obj6 = next;
                break;
            }
        }
        return (AudioStreamDto.TypeDto) obj6;
    }

    public static final int c(MusicTrack musicTrack) {
        return musicTrack.V;
    }

    public static final boolean d(MusicTrack musicTrack) {
        return musicTrack.B() && !k840.a.i.b() && jnj.g(musicTrack.V);
    }

    public static final boolean e(MusicTrack musicTrack, u2b0 u2b0Var) {
        return musicTrack.Tb() && !(u2b0Var.j() instanceof StartPlayVkMixSource);
    }

    public static final String f(MusicTrack musicTrack) {
        String str = musicTrack.d;
        return str == null ? "" : str;
    }
}
