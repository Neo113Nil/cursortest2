package xsna;

import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import com.vk.api.generated.audio.dto.AudioAdsDto;
import com.vk.api.generated.audio.dto.AudioArtistDto;
import com.vk.api.generated.audio.dto.AudioAudioAlbumDto;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.audio.dto.AudioChartInfoDto;
import com.vk.api.generated.audio.dto.AudioLoudnessDto;
import com.vk.api.generated.audio.dto.AudioPhotoDto;
import com.vk.api.generated.audio.dto.AudioPhotoSizesDto;
import com.vk.api.generated.audio.dto.AudioRestrictionDto;
import com.vk.api.generated.audio.dto.AudioStreamDto;
import com.vk.api.generated.audio.dto.AudioVoiceAssistantDto;
import com.vk.api.generated.audio.dto.AudioVoiceAssistantSourceDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.base.dto.BaseLinkButtonStyleDto;
import com.vk.api.generated.photos.dto.PhotosPhotoSizesDto;
import com.vk.api.generated.photos.dto.PhotosPhotoSizesTypeDto;
import com.vk.api.generated.podcast.dto.PodcastCoverDto;
import com.vk.api.generated.podcast.dto.PodcastInfoDto;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.ImageSizeKey;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.AlbumLink;
import com.vk.dto.music.AudioLoudness;
import com.vk.dto.music.AudioStream;
import com.vk.dto.music.Episode;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Thumb;
import com.vk.dto.music.chart.ChartIcon;
import com.vk.dto.music.chart.ChartInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: AudioAudioToMusicTrackMapper.kt */
/* loaded from: classes3.dex */
public final class oc4 {

    /* compiled from: AudioAudioToMusicTrackMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AudioChartInfoDto.StateDto.values().length];
            try {
                iArr[AudioChartInfoDto.StateDto.MOVED_DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudioChartInfoDto.StateDto.MOVED_UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AudioChartInfoDto.StateDto.NEW_RELEASE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AudioChartInfoDto.StateDto.NO_CHANGES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

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

    public static Thumb b(AudioPhotoDto audioPhotoDto) {
        if (audioPhotoDto == null) {
            return null;
        }
        String id = audioPhotoDto.getId();
        int height = audioPhotoDto.getHeight();
        int width = audioPhotoDto.getWidth();
        SparseArray sparseArray = new SparseArray();
        Uri c = c(audioPhotoDto.i());
        if (c != null) {
            sparseArray.append(34, c);
        }
        Uri c2 = c(audioPhotoDto.k());
        if (c2 != null) {
            sparseArray.append(68, c2);
        }
        Uri c3 = c(audioPhotoDto.e());
        if (c3 != null) {
            sparseArray.append(135, c3);
        }
        Uri c4 = c(audioPhotoDto.f());
        if (c4 != null) {
            sparseArray.append(atv0.b, c4);
        }
        Uri c5 = c(audioPhotoDto.g());
        if (c5 != null) {
            sparseArray.append(300, c5);
        }
        Uri c6 = c(audioPhotoDto.j());
        if (c6 != null) {
            sparseArray.append(600, c6);
        }
        Uri c7 = c(audioPhotoDto.d());
        if (c7 != null) {
            sparseArray.append(1200, c7);
        }
        List<AudioPhotoSizesDto> l = audioPhotoDto.l();
        if (l != null) {
            for (AudioPhotoSizesDto audioPhotoSizesDto : l) {
                Uri c8 = c(audioPhotoSizesDto.d());
                if (c8 != null) {
                    sparseArray.append(audioPhotoSizesDto.getWidth(), c8);
                }
            }
        }
        return new Thumb(id, width, height, sparseArray);
    }

    public static Uri c(String str) {
        if (str == null) {
            return null;
        }
        return Uri.parse(str);
    }

    public static MusicTrack d(AudioAudioDto audioAudioDto) {
        Bundle bundle;
        String i;
        Episode episode;
        ArrayList arrayList;
        ChartInfo chartInfo;
        JSONObject jSONObject;
        MusicTrack.AssistantData assistantData;
        ArrayList arrayList2;
        Image image;
        LinkButton linkButton;
        LinkButton linkButton2;
        Action b;
        UserId q = audioAudioDto.q();
        if (q == null) {
            q = UserId.d;
        }
        UserId userId = q;
        AudioRestrictionDto o = audioAudioDto.o();
        int j = o != null ? o.j() : 0;
        AudioAudioDto.GenreIdDto D = audioAudioDto.D();
        int i2 = D != null ? D.i() : 19;
        AudioAudioAlbumDto f = audioAudioDto.f();
        AlbumLink albumLink = f == null ? null : new AlbumLink(f.getId(), f.q(), f.d(), f.getTitle(), b(f.f()), f.e());
        ArrayList a2 = a(audioAudioDto.T());
        ArrayList a3 = a(audioAudioDto.B());
        AudioAdsDto e = audioAudioDto.e();
        if (e == null) {
            bundle = null;
        } else {
            Bundle bundle2 = new Bundle();
            String e2 = e.e();
            if (e2 != null) {
                bundle2.putString("contentId", e2);
            }
            String f2 = e.f();
            if (f2 != null) {
                bundle2.putString("duration", f2);
            }
            String g = e.g();
            if (g != null) {
                bundle2.putString("preview", g);
            }
            AudioAdsDto.AccountAgeTypeDto d = e.d();
            if (d != null && (i = d.i()) != null) {
                bundle2.putString("accountAgeType", i);
            }
            String i3 = e.i();
            if (i3 != null) {
                bundle2.putString("puid1", i3);
            }
            String j2 = e.j();
            if (j2 != null) {
                bundle2.putString("puid22", j2);
            }
            String n = e.n();
            if (n != null) {
                bundle2.putString("vkId", n);
            }
            String l = e.l();
            if (l != null) {
                bundle2.putString("ver", l);
            }
            String k = e.k();
            if (k != null) {
                bundle2.putString("SITEID", k);
            }
            bundle = bundle2;
        }
        PodcastInfoDto a0 = audioAudioDto.a0();
        if (a0 != null) {
            Integer f3 = a0.f();
            long intValue = f3 != null ? f3.intValue() : 0;
            PodcastCoverDto d2 = a0.d();
            List<PhotosPhotoSizesDto> d3 = d2 != null ? d2.d() : null;
            if (d3 == null) {
                image = null;
            } else {
                List<PhotosPhotoSizesDto> list = d3;
                ArrayList arrayList3 = new ArrayList(c5g.u(list, 10));
                for (PhotosPhotoSizesDto photosPhotoSizesDto : list) {
                    PhotosPhotoSizesTypeDto e3 = photosPhotoSizesDto.e();
                    ImageSizeKey.a aVar = ImageSizeKey.Companion;
                    String i4 = e3 != null ? e3.i() : null;
                    char i5 = ImageSizeKey.SIZE_M_0130.i();
                    aVar.getClass();
                    arrayList3.add(new ImageSize(photosPhotoSizesDto.getUrl(), photosPhotoSizesDto.getWidth(), photosPhotoSizesDto.getHeight(), null, ImageSizeKey.a.c(i4, i5), false, 40, null));
                }
                image = new Image(arrayList3);
            }
            BaseLinkButtonDto i6 = a0.i();
            if (i6 != null) {
                BaseLinkButtonActionDto e4 = i6.e();
                if (e4 == null || (b = wf6.b(e4)) == null) {
                    linkButton2 = null;
                } else {
                    String title = i6.getTitle();
                    if (title == null) {
                        title = "";
                    }
                    BaseLinkButtonStyleDto o2 = i6.o();
                    linkButton2 = new LinkButton(title, b, o2 != null ? o2.name() : null);
                }
                linkButton = linkButton2;
            } else {
                linkButton = null;
            }
            Integer e5 = a0.e();
            int intValue2 = e5 != null ? e5.intValue() : 0;
            Boolean n2 = a0.n();
            Boolean bool = Boolean.TRUE;
            episode = new Episode(intValue2, epx.f(n2, bool), intValue, a0.getDescription(), image, a0.g(), a0.j(), a0.k(), linkButton, epx.f(a0.l(), bool));
        } else {
            episode = null;
        }
        long intValue3 = audioAudioDto.p() != null ? r0.intValue() : 0L;
        Integer g2 = audioAudioDto.g();
        int intValue4 = g2 != null ? g2.intValue() : -1;
        AudioChartInfoDto j3 = audioAudioDto.j();
        if (j3 == null) {
            chartInfo = null;
        } else {
            AudioChartInfoDto.StateDto f4 = j3.f();
            int i7 = f4 != null ? a.$EnumSwitchMapping$0[f4.ordinal()] : -1;
            ChartInfo.ChartIconCode chartIconCode = i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? ChartInfo.ChartIconCode.NONE : ChartInfo.ChartIconCode.NO_CHANGES : ChartInfo.ChartIconCode.NEW_RELEASE : ChartInfo.ChartIconCode.MOVED_UP : ChartInfo.ChartIconCode.MOVED_DOWN;
            List<BaseImageDto> d4 = j3.d();
            if (d4 != null) {
                List<BaseImageDto> list2 = d4;
                arrayList = new ArrayList(c5g.u(list2, 10));
                for (BaseImageDto baseImageDto : list2) {
                    arrayList.add(new ChartIcon(baseImageDto.getUrl(), baseImageDto.getWidth(), baseImageDto.getHeight()));
                }
            } else {
                arrayList = null;
            }
            Integer e6 = j3.e();
            chartInfo = new ChartInfo(e6 != null ? e6.intValue() : 0, chartIconCode, arrayList);
        }
        AudioVoiceAssistantDto n3 = audioAudioDto.n();
        if (n3 == null) {
            assistantData = null;
        } else {
            AudioVoiceAssistantSourceDto f5 = n3.f();
            if (f5 != null) {
                jSONObject = new JSONObject();
                jSONObject.put("type", f5.getType());
                jSONObject.put("name", f5.j());
                jSONObject.put("url", f5.getUrl());
                jSONObject.put("uid", f5.n());
                jSONObject.put("audio_hash", f5.f());
                jSONObject.put("artist", f5.e());
                jSONObject.put("album_uid", f5.d());
                jSONObject.put("duration", f5.i());
                jSONObject.put("media_type", f5);
                jSONObject.put("title", f5.getTitle());
                jSONObject.put("cpp_hash", f5.g());
                jSONObject.put("phrase_id", f5.k());
                jSONObject.put("skill_name", f5.l());
            } else {
                jSONObject = new JSONObject();
            }
            List<List<Float>> e7 = n3.e();
            Long valueOf = Long.valueOf(n3.g() != null ? r10.intValue() : 0L);
            String d5 = n3.d();
            assistantData = new MusicTrack.AssistantData(e7, valueOf, d5 != null ? d5 : "", jSONObject.toString());
        }
        AudioLoudnessDto k2 = audioAudioDto.k();
        AudioLoudness audioLoudness = k2 != null ? new AudioLoudness(k2.d(), k2.e()) : null;
        int id = audioAudioDto.getId();
        String title2 = audioAudioDto.getTitle();
        String F0 = audioAudioDto.F0();
        int duration = audioAudioDto.getDuration();
        String i8 = audioAudioDto.i();
        String url = audioAudioDto.getUrl();
        List<AudioStreamDto> l2 = audioAudioDto.l();
        if (l2 != null) {
            List<AudioStreamDto> list3 = l2;
            arrayList2 = new ArrayList(c5g.u(list3, 10));
            for (AudioStreamDto audioStreamDto : list3) {
                arrayList2.add(new AudioStream(audioStreamDto.e().j(), audioStreamDto.getUrl(), audioStreamDto.d()));
            }
        } else {
            arrayList2 = null;
        }
        String d6 = audioAudioDto.d();
        Boolean K0 = audioAudioDto.K0();
        Boolean bool2 = Boolean.TRUE;
        boolean f6 = epx.f(K0, bool2);
        String r = audioAudioDto.r();
        boolean f7 = epx.f(audioAudioDto.N0(), bool2);
        boolean f8 = epx.f(audioAudioDto.y0(), bool2);
        boolean f9 = epx.f(audioAudioDto.v0(), bool2);
        boolean f10 = epx.f(audioAudioDto.D0(), bool2);
        boolean f11 = epx.f(audioAudioDto.G(), bool2);
        boolean f12 = epx.f(audioAudioDto.K(), bool2);
        boolean f13 = epx.f(audioAudioDto.F(), bool2);
        Integer w0 = audioAudioDto.w0();
        int intValue5 = w0 != null ? w0.intValue() : 0;
        String Z = audioAudioDto.Z();
        boolean f14 = epx.f(audioAudioDto.u(), bool2);
        Integer M = audioAudioDto.M();
        int intValue6 = M != null ? M.intValue() : 0;
        String W = audioAudioDto.W();
        Thumb b2 = b(audioAudioDto.H0());
        boolean f15 = epx.f(audioAudioDto.R(), bool2);
        Integer C = audioAudioDto.C();
        return new MusicTrack(id, userId, title2, F0, duration, j, i8, url, arrayList2, i2, false, false, 0, null, f13, albumLink, d6, f6, a2, a3, bundle, episode, null, r, intValue3, intValue4, f7, -1L, chartInfo, f8, f9, f10, null, assistantData, null, Z, f12, f11, intValue5, null, f14, intValue6, false, W, b2, f15, C != null ? C.intValue() : 0, null, false, null, audioAudioDto.l0(), audioLoudness, 4196352, 230532, null);
    }
}
