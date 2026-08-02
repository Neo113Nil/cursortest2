package xsna;

import android.view.View;
import android.widget.ImageView;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.audio.dto.AudioAudioRawIdTrackedDto;
import com.vk.api.generated.video.dto.VideoGetVideoQualitiesDownloadInfoResponseDto;
import com.vk.api.generated.video.dto.VideoInfoDto;
import com.vk.api.generated.video.dto.VideoInfoQualitiesDto;
import com.vk.api.generated.video.dto.VideoInfoQualityDto;
import com.vk.api.generated.video.dto.VideoInfoTrackDto;
import com.vk.clips.coauthors.list.pendings.mvi.entity.state.ClipCoauthorsDecisionLaunchType;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.libvideo.offline.dialogs.qualitychooser.presentation.ui.a;
import com.vk.libvideo.offline.settings.api.domain.objects.QualityOptionTypeDo;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.stat.VkOnboardingStat$Delegate;
import com.vk.photos.root.albumdetails.presentation.d;
import com.vk.photos.root.albumdetails.presentation.i;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import one.video.exo.offline.e;
import xsna.cms0;
import xsna.gg1;
import xsna.hq80;
import xsna.lbq;
import xsna.m8v0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class yf1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ yf1(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0389 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:282:? A[LOOP:12: B:236:0x0352->B:282:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x04e6  */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v42, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r8v43, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v44, types: [java.util.ArrayList] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Object obj2;
        VideoUrl videoUrl;
        tdm tdmVar;
        Object obj3;
        ArrayList arrayList;
        VideoInfoQualityDto videoInfoQualityDto;
        List<VideoInfoQualityDto> e;
        VideoInfoQualityDto videoInfoQualityDto2;
        String str;
        tdm tdmVar2;
        Object obj4;
        Object obj5;
        VideoInfoQualitiesDto videoInfoQualitiesDto;
        VideoInfoQualityDto videoInfoQualityDto3;
        List<VideoInfoQualityDto> e2;
        VideoInfoQualityDto videoInfoQualityDto4;
        List<VideoInfoQualitiesDto> d;
        VideoInfoQualitiesDto videoInfoQualitiesDto2;
        String d2;
        gzs<s3q0> gzsVar;
        io.reactivex.rxjava3.disposables.c cVar;
        List list;
        Pair pair;
        one.video.exo.offline.f fVar;
        List list2;
        VideoInfoQualitiesDto videoInfoQualitiesDto3;
        ?? r8;
        List<VideoInfoQualityDto> e3;
        List<VideoInfoQualitiesDto> d3;
        Object obj6;
        String str2 = null;
        switch (this.b) {
            case 0:
                gg1 gg1Var = (gg1) this.c;
                List list3 = (List) this.d;
                gg1.b bVar = (gg1.b) this.e;
                Integer num = (Integer) obj;
                f4z f4zVar = gg1Var.p;
                i.e eVar = i.e.a;
                f4zVar.b(eVar);
                if (num.intValue() <= 0) {
                    f4zVar.b(eVar);
                    bVar.c();
                } else if (num.intValue() == list3.size()) {
                    bVar.a(num.intValue());
                    gg1Var.T(d.b.b);
                    f4zVar.b(i.C1485i.a);
                } else {
                    list3.size();
                    bVar.b();
                    f4zVar.b(i.C1485i.a);
                }
                return s3q0.a;
            case 1:
                ((pzw) obj).c = new tnc((ClipVideoFile) this.c, (qmd) this.d, (ClipCoauthorsDecisionLaunchType) this.e, 0);
                return s3q0.a;
            case 2:
                ImageView imageView = (ImageView) this.c;
                VideoFile videoFile = (VideoFile) this.d;
                hzc hzcVar = (hzc) this.e;
                w1s0.e(imageView.getContext(), videoFile, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS), null, new v43(6, hzcVar, videoFile));
                hzcVar.c(videoFile);
                return s3q0.a;
            case 3:
                View view = (View) this.c;
                lrs lrsVar = (lrs) this.d;
                VkOnboardingCampaign vkOnboardingCampaign = (VkOnboardingCampaign) this.e;
                int i = m8v0.M;
                m8v0.a.a(view, view.getContext().getString(R.string.friends_catalog_subscribers_onboarding), new krs(view, 0), VkTooltip$MarkerStyle.Style6, VkTooltip$MarkerSize.Size96, VkOnboarding$TintColor.Lime, VkTooltip$BalloonPosition.Top, VkTooltip$BalloonTilt.Left, new zf1(13, lrsVar, vkOnboardingCampaign), new bi0(18, lrsVar, vkOnboardingCampaign), null, null, new k82(8, lrsVar, vkOnboardingCampaign), new k8(15, lrsVar, vkOnboardingCampaign), (VkOnboardingStat$Delegate) lrsVar.c.getValue(), 0, false, null, null, false, null, !dhr0.M(), 8358912);
                return s3q0.a;
            case 4:
                List list4 = (List) this.d;
                com.vk.music.playlist.display.data.a aVar = (com.vk.music.playlist.display.data.a) this.c;
                Playlist playlist = (Playlist) this.e;
                List list5 = (List) obj;
                ArrayList arrayList2 = new ArrayList(c5g.u(list5, 10));
                int i2 = 0;
                for (Object obj7 : list5) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        e43.t();
                        throw null;
                    }
                    MusicTrack d4 = oc4.d((AudioAudioDto) obj7);
                    d4.y = ((AudioAudioRawIdTrackedDto) list4.get(i2)).r();
                    arrayList2.add(d4);
                    i2 = i3;
                }
                return aVar.b.a(playlist, arrayList2);
            case 5:
                Map map = (Map) this.c;
                wh50 wh50Var = (wh50) this.d;
                wh50 wh50Var2 = (wh50) this.e;
                aoj aojVar = (aoj) obj;
                for (Map.Entry entry : map.entrySet()) {
                    aojVar.a(new qd80((String) entry.getValue(), wh50Var, entry.getKey(), wh50Var2));
                }
                return s3q0.a;
            case 6:
                hq80 hq80Var = (hq80) this.c;
                VideoFile videoFile2 = hq80Var.c;
                rr1 rr1Var = (rr1) this.d;
                ygp0 ygp0Var = (ygp0) this.e;
                VideoGetVideoQualitiesDownloadInfoResponseDto videoGetVideoQualitiesDownloadInfoResponseDto = (VideoGetVideoQualitiesDownloadInfoResponseDto) obj;
                String str3 = hq80Var.f;
                if (epx.f(str3, "stub_mp4_download_url")) {
                    videoUrl = VideoUrl.URL_240;
                } else {
                    Iterator it = VideoUrl.k().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (epx.f(videoFile2.w9().Ab((VideoUrl) obj2), str3)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    videoUrl = (VideoUrl) obj2;
                }
                HashMap<String, Integer> hashMap = lbq.a;
                List list6 = (List) rr1Var.a;
                List list7 = (List) rr1Var.b;
                List list8 = (List) rr1Var.c;
                if (fxc0.B().J().S1()) {
                    VideoUrl.Companion.getClass();
                    list2 = VideoUrl.MP4_URLS;
                    if (j5g.P(list2, videoUrl)) {
                        VideoInfoDto videoInfoDto = (VideoInfoDto) j5g.a0(videoGetVideoQualitiesDownloadInfoResponseDto.d());
                        if (videoInfoDto == null || (d3 = videoInfoDto.d()) == null) {
                            videoInfoQualitiesDto3 = null;
                        } else {
                            Iterator it2 = d3.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj6 = it2.next();
                                    if (epx.f(((VideoInfoQualitiesDto) obj6).d(), "video_mp4")) {
                                    }
                                } else {
                                    obj6 = null;
                                }
                            }
                            videoInfoQualitiesDto3 = (VideoInfoQualitiesDto) obj6;
                        }
                        if (videoInfoQualitiesDto3 == null || (e3 = videoInfoQualitiesDto3.e()) == null) {
                            r8 = EmptyList.b;
                        } else {
                            List<VideoInfoQualityDto> list9 = e3;
                            r8 = new ArrayList(c5g.u(list9, 10));
                            for (VideoInfoQualityDto videoInfoQualityDto5 : list9) {
                                cms0.a aVar2 = new cms0.a();
                                Integer num2 = hashMap.get(videoInfoQualityDto5.e());
                                if (num2 != null) {
                                    int intValue = num2.intValue();
                                    aVar2.e = intValue;
                                    aVar2.f = intValue;
                                }
                                r8.add(new kbq(new kao(new one.video.player.tracks.c("", aVar2.a(), true), Long.valueOf(videoInfoQualityDto5.f())), Long.valueOf(videoInfoQualityDto5.f())));
                            }
                        }
                        EmptyList emptyList = EmptyList.b;
                        tdmVar = new tdm(r8, emptyList, emptyList);
                        tdmVar2 = tdmVar;
                        gzsVar = hq80Var.h;
                        if (gzsVar != null) {
                            gzsVar.invoke();
                        }
                        cVar = hq80Var.j;
                        if (cVar != null) {
                            cVar.dispose();
                        }
                        QualityOptionTypeDo qualityOptionTypeDo = hq80Var.e;
                        izs<hq80.a, s3q0> izsVar = hq80Var.g;
                        list = (List) tdmVar2.b;
                        List list10 = (List) tdmVar2.c;
                        if (list.isEmpty()) {
                            e.a aVar3 = new e.a();
                            e.a aVar4 = new e.a();
                            whs0 a = oao.a(aVar3, list);
                            whs0 a2 = oao.a(aVar4, list10);
                            long j = a2.b;
                            long j2 = a.a + a2.a;
                            long j3 = a.b;
                            long j4 = 0;
                            if (j3 > 0 && j > 0) {
                                j4 = j3 + j;
                            }
                            izsVar.invoke(new hq80.a(null, new whs0(j2, j4), null, new p5y(ygp0Var, 18)));
                        } else {
                            int i4 = 4;
                            if (fxc0.B().J().g0()) {
                                QualityOptionTypeDo qualityOptionTypeDo2 = qualityOptionTypeDo;
                                while (true) {
                                    int i5 = hq80.b.$EnumSwitchMapping$0[qualityOptionTypeDo2.ordinal()];
                                    if (i5 != 1) {
                                        if (i5 == 2) {
                                            one.video.exo.offline.f b = mao.b(tdmVar2);
                                            if (b != null) {
                                                pair = new Pair(b, qualityOptionTypeDo2);
                                            } else {
                                                qualityOptionTypeDo2 = QualityOptionTypeDo.AVG;
                                            }
                                        } else if (i5 == 3) {
                                            one.video.exo.offline.f a3 = mao.a(tdmVar2);
                                            if (a3 != null) {
                                                pair = new Pair(a3, qualityOptionTypeDo2);
                                            } else {
                                                qualityOptionTypeDo2 = QualityOptionTypeDo.LOW;
                                            }
                                        } else if (i5 == 4) {
                                            one.video.exo.offline.f c = mao.c(tdmVar2);
                                            if (c != null) {
                                                pair = new Pair(c, qualityOptionTypeDo2);
                                            }
                                        } else {
                                            if (i5 != 5) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            if (!videoFile2.k0()) {
                                                if (list10.isEmpty()) {
                                                    fVar = null;
                                                } else {
                                                    e.b bVar2 = new e.b();
                                                    e.a aVar5 = new e.a();
                                                    List list11 = (List) tdmVar2.d;
                                                    ArrayList arrayList3 = new ArrayList(c5g.u(list11, 10));
                                                    Iterator it3 = list11.iterator();
                                                    while (it3.hasNext()) {
                                                        arrayList3.add(((kbq) it3.next()).a);
                                                    }
                                                    fVar = new one.video.exo.offline.f(bVar2, aVar5, new e.c(arrayList3));
                                                }
                                                if (fVar != null) {
                                                    pair = new Pair(fVar, qualityOptionTypeDo2);
                                                }
                                            }
                                        }
                                    }
                                }
                                pair = null;
                                if (pair != null) {
                                    one.video.exo.offline.f fVar2 = (one.video.exo.offline.f) pair.d();
                                    izsVar.invoke(new hq80.a(qualityOptionTypeDo, oao.b(fVar2, tdmVar2), (QualityOptionTypeDo) pair.g(), new ag1(11, ygp0Var, fVar2)));
                                } else {
                                    new a.C1242a(hq80Var.b, new vb5(hq80Var, tdmVar2, ygp0Var, i4), hq80Var.d, tdmVar2, videoFile2.k0()).I0(null);
                                }
                            } else {
                                new a.C1242a(hq80Var.b, new vb5(hq80Var, tdmVar2, ygp0Var, i4), hq80Var.d, tdmVar2, videoFile2.k0()).I0(null);
                            }
                        }
                        return s3q0.a;
                    }
                }
                if (videoGetVideoQualitiesDownloadInfoResponseDto.d().isEmpty() || !j5g.P(e43.l(VideoUrl.DASH_URL, VideoUrl.DASH_WEBM_URL, VideoUrl.DASH_STREAMS, VideoUrl.DASH_AV1), videoUrl)) {
                    List list12 = list6;
                    ArrayList arrayList4 = new ArrayList(c5g.u(list12, 10));
                    Iterator it4 = list12.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(new kbq((kao) it4.next(), null));
                    }
                    List list13 = list7;
                    ArrayList arrayList5 = new ArrayList(c5g.u(list13, 10));
                    Iterator it5 = list13.iterator();
                    while (it5.hasNext()) {
                        arrayList5.add(new kbq((kao) it5.next(), null));
                    }
                    List list14 = list8;
                    ArrayList arrayList6 = new ArrayList(c5g.u(list14, 10));
                    Iterator it6 = list14.iterator();
                    while (it6.hasNext()) {
                        arrayList6.add(new kbq((kao) it6.next(), null));
                    }
                    tdmVar = new tdm(arrayList4, arrayList5, arrayList6);
                    tdmVar2 = tdmVar;
                    gzsVar = hq80Var.h;
                    if (gzsVar != null) {
                    }
                    cVar = hq80Var.j;
                    if (cVar != null) {
                    }
                    QualityOptionTypeDo qualityOptionTypeDo3 = hq80Var.e;
                    izs<hq80.a, s3q0> izsVar2 = hq80Var.g;
                    list = (List) tdmVar2.b;
                    List list102 = (List) tdmVar2.c;
                    if (list.isEmpty()) {
                    }
                    return s3q0.a;
                }
                List list15 = list8;
                ArrayList arrayList7 = new ArrayList(c5g.u(list15, 10));
                Iterator it7 = list15.iterator();
                while (it7.hasNext()) {
                    arrayList7.add(new kbq((kao) it7.next(), null));
                }
                videoGetVideoQualitiesDownloadInfoResponseDto.d().get(0);
                List<kao> list16 = list7;
                ArrayList arrayList8 = new ArrayList(c5g.u(list16, 10));
                for (kao kaoVar : list16) {
                    arrayList8.add(new kbq(kaoVar, kaoVar.b));
                }
                VideoInfoDto videoInfoDto2 = videoGetVideoQualitiesDownloadInfoResponseDto.d().get(0);
                if (videoUrl == VideoUrl.DASH_STREAMS) {
                    Iterator it8 = videoInfoDto2.e().iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            obj4 = it8.next();
                            if (((VideoInfoTrackDto) obj4).e() == VideoInfoTrackDto.TypeDto.VIDEO) {
                            }
                        } else {
                            obj4 = null;
                        }
                    }
                    VideoInfoTrackDto videoInfoTrackDto = (VideoInfoTrackDto) obj4;
                    List<kao> list17 = list6;
                    arrayList = new ArrayList(c5g.u(list17, 10));
                    for (kao kaoVar2 : list17) {
                        Iterator it9 = lbq.b.iterator();
                        while (true) {
                            if (it9.hasNext()) {
                                obj5 = it9.next();
                                String str4 = (String) obj5;
                                String str5 = ((cms0) ((one.video.player.tracks.c) kaoVar2.a).c).b;
                                if (str5 == null || !drm0.D(str5, str4, false)) {
                                }
                            } else {
                                obj5 = null;
                            }
                        }
                        String str6 = (String) obj5;
                        if (str6 == null || videoInfoTrackDto == null || (d = videoInfoTrackDto.d()) == null) {
                            videoInfoQualitiesDto = null;
                        } else {
                            Iterator it10 = d.iterator();
                            while (true) {
                                if (it10.hasNext()) {
                                    videoInfoQualitiesDto2 = it10.next();
                                    VideoInfoQualityDto videoInfoQualityDto6 = (VideoInfoQualityDto) j5g.a0(((VideoInfoQualitiesDto) videoInfoQualitiesDto2).e());
                                    if (videoInfoQualityDto6 == null || (d2 = videoInfoQualityDto6.d()) == null || !drm0.D(d2, str6, false)) {
                                    }
                                } else {
                                    videoInfoQualitiesDto2 = 0;
                                }
                            }
                            videoInfoQualitiesDto = videoInfoQualitiesDto2;
                        }
                        if (videoInfoQualitiesDto == null || (e2 = videoInfoQualitiesDto.e()) == null) {
                            videoInfoQualityDto3 = null;
                        } else {
                            Iterator it11 = e2.iterator();
                            while (true) {
                                if (it11.hasNext()) {
                                    videoInfoQualityDto4 = it11.next();
                                    String e4 = ((VideoInfoQualityDto) videoInfoQualityDto4).e();
                                    int height = ((cms0) ((one.video.player.tracks.c) kaoVar2.a).c).b().getHeight();
                                    Integer num3 = hashMap.get(e4);
                                    if (num3 != null && num3.intValue() == height) {
                                    }
                                } else {
                                    videoInfoQualityDto4 = 0;
                                }
                            }
                            videoInfoQualityDto3 = videoInfoQualityDto4;
                        }
                        arrayList.add(new kbq(kaoVar2, videoInfoQualityDto3 != null ? Long.valueOf(videoInfoQualityDto3.f()) : null));
                    }
                } else {
                    Iterator it12 = videoInfoDto2.d().iterator();
                    while (true) {
                        if (it12.hasNext()) {
                            obj3 = it12.next();
                            String d5 = ((VideoInfoQualitiesDto) obj3).d();
                            if (videoUrl != null) {
                                int i6 = lbq.a.$EnumSwitchMapping$0[videoUrl.ordinal()];
                                if (i6 == 1) {
                                    str = "dash";
                                } else if (i6 == 2) {
                                    str = "dash_webm";
                                } else if (i6 == 3) {
                                    str = "dash_av1_webm";
                                }
                                if (!epx.f(d5, str)) {
                                }
                            }
                            str = null;
                            if (!epx.f(d5, str)) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    VideoInfoQualitiesDto videoInfoQualitiesDto4 = (VideoInfoQualitiesDto) obj3;
                    List<kao> list18 = list6;
                    ArrayList arrayList9 = new ArrayList(c5g.u(list18, 10));
                    for (kao kaoVar3 : list18) {
                        if (videoInfoQualitiesDto4 == null || (e = videoInfoQualitiesDto4.e()) == null) {
                            videoInfoQualityDto = null;
                        } else {
                            Iterator it13 = e.iterator();
                            while (true) {
                                if (it13.hasNext()) {
                                    videoInfoQualityDto2 = it13.next();
                                    String e5 = ((VideoInfoQualityDto) videoInfoQualityDto2).e();
                                    int height2 = ((cms0) ((one.video.player.tracks.c) kaoVar3.a).c).b().getHeight();
                                    Integer num4 = hashMap.get(e5);
                                    if (num4 != null && num4.intValue() == height2) {
                                    }
                                } else {
                                    videoInfoQualityDto2 = 0;
                                }
                            }
                            videoInfoQualityDto = videoInfoQualityDto2;
                        }
                        arrayList9.add(new kbq(kaoVar3, videoInfoQualityDto != null ? Long.valueOf(videoInfoQualityDto.f()) : null));
                    }
                    arrayList = arrayList9;
                }
                tdmVar2 = new tdm(arrayList, arrayList8, arrayList7);
                gzsVar = hq80Var.h;
                if (gzsVar != null) {
                }
                cVar = hq80Var.j;
                if (cVar != null) {
                }
                QualityOptionTypeDo qualityOptionTypeDo32 = hq80Var.e;
                izs<hq80.a, s3q0> izsVar22 = hq80Var.g;
                list = (List) tdmVar2.b;
                List list1022 = (List) tdmVar2.c;
                if (list.isEmpty()) {
                }
                return s3q0.a;
            case 7:
                return ((kjy) ((od50) this.c).c).a((ckv) this.d, (yjv) this.e);
            case 8:
                ((i82) obj).b(new w4b0((izs) this.c, (izs) this.d, (gzs) this.e, null));
                return s3q0.a;
            default:
                VideoFileOld videoFileOld = (VideoFileOld) this.c;
                mm80 mm80Var = (mm80) this.d;
                String str7 = (String) this.e;
                VideoFile videoFile3 = (VideoFile) obj;
                Iterator it14 = j5g.s0(VideoUrl.k(), VideoUrl.EMBED_URL).iterator();
                while (true) {
                    if (it14.hasNext()) {
                        VideoUrl videoUrl2 = (VideoUrl) it14.next();
                        if (videoFileOld.f.Ab(videoUrl2) != null && videoFile3.w9().Ab(videoUrl2) != null) {
                            str2 = videoFile3.w9().Ab(videoUrl2);
                        }
                    }
                }
                if (str2 == null) {
                    return s3q0.a;
                }
                synchronized (mm80Var) {
                    mm80Var.e().e(str7, str2);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ yf1(List list, com.vk.music.playlist.display.data.a aVar, Playlist playlist) {
        this.b = 4;
        this.d = list;
        this.c = aVar;
        this.e = playlist;
    }
}
