package xsna;

import android.net.Uri;
import com.vk.api.generated.audio.dto.AudioStreamDto;
import com.vk.dto.music.AudioLoudness;
import com.vk.dto.music.AudioStream;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.music.player.core.helper.AudioPlayerType;
import com.vk.music.player.core.helper.player.stat.OneVideoMusicType;
import com.vk.music.player.playback.PlayableType;
import com.vk.music.player.playback.PlaybackLaunchMeta;
import com.vk.toggle.features.MusicFeatures;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.random.Random;
import one.video.player.model.VideoContentType;
import one.video.statistics.ContentType;
import xsna.cz40;
import xsna.fx40;
import xsna.k840;

/* compiled from: OneVideoPlaybackPreparer.kt */
/* loaded from: classes3.dex */
public final class pm80 {
    public final cz40 a;
    public final fx40 b;
    public final aw40 c;
    public final k5q d;
    public final pvh e;
    public boolean f;
    public String g;
    public final bpn0 h = new bpn0(new dv2(26));

    /* compiled from: OneVideoPlaybackPreparer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoContentType.values().length];
            try {
                iArr[VideoContentType.DASH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoContentType.HLS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoContentType.MP4.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: OneVideoPlaybackPreparer.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Uri, x9v> {
        public static final b b = new b(1, x9v.class, "<init>", "<init>(Landroid/net/Uri;)V", 0);

        @Override // xsna.izs
        public final x9v invoke(Uri uri) {
            return new x9v(uri);
        }
    }

    /* compiled from: OneVideoPlaybackPreparer.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Uri, ftk> {
        public static final c b = new c(1, ftk.class, "<init>", "<init>(Landroid/net/Uri;)V", 0);

        @Override // xsna.izs
        public final ftk invoke(Uri uri) {
            return new ftk(uri);
        }
    }

    /* compiled from: OneVideoPlaybackPreparer.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<Uri, ag30> {
        public static final d b = new d(1, ag30.class, "<init>", "<init>(Landroid/net/Uri;)V", 0);

        @Override // xsna.izs
        public final ag30 invoke(Uri uri) {
            return new ag30(uri);
        }
    }

    public pm80(cz40 cz40Var, fx40.a aVar, aw40 aw40Var, k5q k5qVar, pvh pvhVar) {
        this.a = cz40Var;
        this.b = aVar;
        this.c = aw40Var;
        this.d = k5qVar;
        this.e = pvhVar;
    }

    public static boolean e(String str) {
        return drm0.D(str, ".m3u8", false);
    }

    public final sht0 a(kx40 kx40Var) {
        if (!e(kx40Var.b())) {
            return drm0.D(kx40Var.b(), ".mpd", true) ? b(kx40Var, c.b) : b(kx40Var, d.b);
        }
        boolean a2 = this.b.a().a();
        k5q k5qVar = this.d;
        if (a2 && kx40Var.d()) {
            MusicTrack musicTrack = kx40Var.b;
            k5qVar.l();
            k5q.m(new fk(6, k5qVar, musicTrack));
        } else {
            k5qVar.i();
        }
        return b(kx40Var, b.b);
    }

    public final sht0 b(kx40 kx40Var, izs<? super Uri, ? extends sht0> izsVar) {
        MusicTrack musicTrack = kx40Var.b;
        AudioBookChapter audioBookChapter = musicTrack.O;
        String concat = audioBookChapter != null ? "chapter_download_".concat(audioBookChapter.b) : musicTrack.w != null ? "episode_download_".concat(musicTrack.Fb()) : "track_download_".concat(musicTrack.Fb());
        sht0 invoke = izsVar.invoke(jeq0.g(kx40Var.b()));
        com.vk.music.offline.api.domain.download.b I = this.c.I();
        return (I == null || !I.c(concat)) ? invoke : new mv70(concat, invoke, false);
    }

    public final sht0 c(kx40 kx40Var) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        String str;
        Object obj6;
        Object obj7;
        AudioStream audioStream;
        AudioStream audioStream2;
        if (!MusicFeatures.AUDIO_GET_ALL_PLAYING_FORMATS.h()) {
            return a(kx40Var);
        }
        x6b0 x6b0Var = kx40Var.i;
        MusicTrack musicTrack = kx40Var.b;
        List<AudioStream> list = musicTrack.j;
        if (list == null) {
            x6b0Var.a = null;
            audioStream2 = new AudioStream(null, kx40Var.b(), null, 5, null);
        } else {
            if (list.isEmpty()) {
                x6b0Var.a = null;
                audioStream = new AudioStream(null, "", null, 5, null);
            } else {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (epx.f(((AudioStream) obj).b, AudioStreamDto.TypeDto.DASH.j())) {
                        break;
                    }
                }
                AudioStream audioStream3 = (AudioStream) obj;
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    if (epx.f(((AudioStream) obj2).b, AudioStreamDto.TypeDto.HLS_RANGE.j())) {
                        break;
                    }
                }
                AudioStream audioStream4 = (AudioStream) obj2;
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
                AudioStream audioStream5 = (AudioStream) obj3;
                Iterator<T> it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        obj4 = null;
                        break;
                    }
                    obj4 = it4.next();
                    if (epx.f(((AudioStream) obj4).b, AudioStreamDto.TypeDto.HLS.j())) {
                        break;
                    }
                }
                AudioStream audioStream6 = (AudioStream) obj4;
                Iterator<T> it5 = list.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        obj5 = null;
                        break;
                    }
                    obj5 = it5.next();
                    if (epx.f(((AudioStream) obj5).b, AudioStreamDto.TypeDto.MP3.j())) {
                        break;
                    }
                }
                AudioStream audioStream7 = (AudioStream) obj5;
                if (audioStream3 == null || (str = audioStream3.c) == null) {
                    str = audioStream4 != null ? audioStream4.c : null;
                    if (str == null) {
                        str = audioStream5 != null ? audioStream5.c : null;
                        if (str == null) {
                            str = audioStream6 != null ? audioStream6.c : null;
                            if (str == null) {
                                str = audioStream7 != null ? audioStream7.c : null;
                            }
                        }
                    }
                }
                x6b0Var.b = str;
                List<AudioStream> list2 = list;
                Iterator<T> it6 = list2.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj6 = null;
                        break;
                    }
                    obj6 = it6.next();
                    AudioStream audioStream8 = (AudioStream) obj6;
                    if (epx.f(audioStream8.c, x6b0Var.b) || epx.f(audioStream8.d, x6b0Var.b)) {
                        break;
                    }
                }
                AudioStream audioStream9 = (AudioStream) obj6;
                x6b0Var.a = audioStream9 != null ? audioStream9.b : null;
                Iterator<T> it7 = list2.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        obj7 = null;
                        break;
                    }
                    obj7 = it7.next();
                    AudioStream audioStream10 = (AudioStream) obj7;
                    if (epx.f(audioStream10.c, x6b0Var.b) || epx.f(audioStream10.d, x6b0Var.b)) {
                        break;
                    }
                }
                AudioStream audioStream11 = (AudioStream) obj7;
                String str2 = audioStream11 != null ? audioStream11.d : null;
                if (x6b0Var.b != null) {
                    audioStream2 = new AudioStream(x6b0Var.a, x6b0Var.b, str2);
                } else {
                    audioStream = new AudioStream(null, kx40Var.b(), null, 5, null);
                }
            }
            audioStream2 = audioStream;
        }
        x6b0 x6b0Var2 = ((hx40) this.e.c).j;
        String str3 = x6b0Var2.c ? audioStream2.d : audioStream2.c;
        x6b0Var2.b = str3;
        if (str3 == null) {
            return a(kx40Var);
        }
        if (str3.equals("")) {
            return new ag30(jeq0.g(""));
        }
        String str4 = x6b0Var2.b;
        String str5 = str4 != null ? str4 : "";
        AudioBookChapter audioBookChapter = musicTrack.O;
        String concat = audioBookChapter != null ? "chapter_download_".concat(audioBookChapter.b) : musicTrack.w != null ? "episode_download_".concat(musicTrack.Fb()) : "track_download_".concat(musicTrack.Fb());
        String j = AudioStreamDto.TypeDto.DASH.j();
        String str6 = audioStream2.b;
        sht0 ftkVar = epx.f(str6, j) ? new ftk(jeq0.g(str5)) : (epx.f(str6, AudioStreamDto.TypeDto.HLS_RANGE.j()) || epx.f(str6, AudioStreamDto.TypeDto.HLS_TS.j()) || epx.f(str6, AudioStreamDto.TypeDto.HLS.j())) ? new x9v(jeq0.g(str5)) : epx.f(str6, AudioStreamDto.TypeDto.MP3.j()) ? new ag30(jeq0.g(str5)) : a(kx40Var);
        com.vk.music.offline.api.domain.download.b I = this.c.I();
        return (I == null || !I.c(concat)) ? ftkVar : new mv70(concat, ftkVar, false);
    }

    public final g4b0 d(kx40 kx40Var, AudioPlayerType audioPlayerType, Uri uri, ContentType contentType) {
        MusicTrack musicTrack = kx40Var.b;
        AudioLoudness audioLoudness = kx40Var.g;
        PlaybackLaunchMeta playbackLaunchMeta = kx40Var.d;
        OneVideoMusicType oneVideoMusicType = this.a instanceof cz40.a ? OneVideoMusicType.ADS : playbackLaunchMeta.d == PlayableType.SNIPPET ? OneVideoMusicType.SNIPPET : musicTrack.Wb() ? OneVideoMusicType.RADIO : musicTrack.Vb() ? OneVideoMusicType.PODCAST : musicTrack.Mb() ? OneVideoMusicType.AUDIOBOOK : OneVideoMusicType.TRACK;
        Random.Default r6 = Random.b;
        r6.getClass();
        gg ggVar = Random.c;
        String bigInteger = new BigInteger(Long.toUnsignedString(ggVar.m()), 10).toString(36);
        r6.getClass();
        String bigInteger2 = new BigInteger(Long.toUnsignedString(ggVar.m()), 10).toString(36);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String Fb = musicTrack.Fb();
        String host = uri.getHost();
        String t = playbackLaunchMeta.b.t();
        Float valueOf = audioLoudness != null ? Float.valueOf(audioLoudness.b) : null;
        if (valueOf != null) {
            linkedHashMap.put("lufs", valueOf);
        }
        Float valueOf2 = audioLoudness != null ? Float.valueOf(audioLoudness.c) : null;
        if (valueOf2 != null) {
            linkedHashMap.put("peak", valueOf2);
        }
        linkedHashMap.put("is_url_in_cache", Boolean.valueOf(kx40Var.a.c));
        linkedHashMap.put("is_downloaded", Boolean.valueOf(musicTrack.S4()));
        linkedHashMap.put("has_subscription", Boolean.valueOf(k840.a.i.b()));
        String name = audioPlayerType.name();
        Locale locale = Locale.ROOT;
        linkedHashMap.put("audio_player_type", name.toLowerCase(locale));
        linkedHashMap.put("like", Boolean.valueOf(musicTrack.U));
        linkedHashMap.put("track_type", oneVideoMusicType.toString().toLowerCase(locale));
        return new g4b0(Fb, bigInteger, bigInteger2, host, contentType != null ? contentType : null, t, false, false, false, linkedHashMap);
    }

    public final void f(hk80 hk80Var, sht0 sht0Var, kx40 kx40Var, long j) {
        Object obj;
        AudioPlayerType audioPlayerType = AudioPlayerType.UV;
        Uri uri = sht0Var.b;
        int i = a.$EnumSwitchMapping$0[sht0Var.a.ordinal()];
        mm80 mm80Var = null;
        g4b0 d2 = d(kx40Var, audioPlayerType, uri, i != 1 ? i != 2 ? i != 3 ? null : ContentType.mp4 : ContentType.hls : ContentType.dash);
        if (((Boolean) this.h.getValue()).booleanValue()) {
            com.vk.music.offline.api.domain.download.b I = this.c.I();
            if (I != null) {
                MusicTrack musicTrack = kx40Var.b;
                AudioBookChapter audioBookChapter = musicTrack.O;
                obj = I.e(audioBookChapter != null ? "chapter_download_".concat(audioBookChapter.b) : musicTrack.w != null ? "episode_download_".concat(musicTrack.Fb()) : "track_download_".concat(musicTrack.Fb()));
            } else {
                obj = null;
            }
            if (obj instanceof mm80) {
                mm80Var = (mm80) obj;
            }
        }
        xk80 xk80Var = hk80Var.c;
        xk80Var.O = mm80Var;
        hk80Var.d.y(d2);
        if (xk80Var.f0()) {
            xk80Var.n0(sht0Var, j);
        } else {
            xk80Var.C(sht0Var, j);
        }
    }
}
