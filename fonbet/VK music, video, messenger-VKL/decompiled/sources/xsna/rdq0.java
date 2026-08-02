package xsna;

import com.vk.clips.attachments.api.publish.cta.ClipInvolvementActionButton;
import com.vk.clips.upload.model.ClipUploadData;
import com.vk.clips.upload.model.ClipUploadParams;
import com.vk.clips.upload.vk.ui.impl.fragment.data.api.UploadUserInfo;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.ClipsUploadState;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.AutoRepostToStoriesData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipAttachedVideoInfo;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadAuthorRelatedData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadDataInternal;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadPrivacyData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadStaticData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadUnmodifiableData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.CoauthorsData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ProductsData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.ConditionalFeature;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.DisableableFeature;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.DisableableSwitch;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.HideableFeature;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.HideableSwitch;
import com.vk.dto.clips.ClipsVideoItemLocation;
import com.vk.dto.clips.external.ClipsDraftablePlaylist;
import com.vk.dto.clips.external.VideoToClipInfo;
import com.vk.dto.clips.masks.MaskLight;
import com.vk.dto.clips.morphing.AudioEffectType;
import com.vk.dto.clips.morphing.AudioMorphingTypeStat;
import com.vk.dto.clips.upload.ClipTemplateInfo;
import com.vk.dto.clips.upload.ShortVideoCreationFeature;
import com.vk.dto.common.Good;
import com.vk.dto.common.clips.ClipsLinkAttachment;
import com.vk.dto.common.clips.CoOwnerItem;
import com.vk.dto.common.clips.VideoTemplatePublishInfo;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.dto.geo.GeoLocation;
import com.vk.dto.geo.GeoPlace;
import com.vk.dto.group.Group;
import com.vk.dto.stories.entities.OrdData;
import com.vk.dto.stories.entities.stat.ClickableStickerStatInfo;
import com.vk.dto.stories.entities.stat.StoryStatContainer;
import com.vk.dto.stories.model.clickable.ClickableGeo;
import com.vk.dto.stories.model.clickable.ClickableMarketItem;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.dto.stories.model.clickable.ClickableVkTicket;
import com.vk.dto.stories.model.clickable.SeanceInfo;
import com.vk.imageloader.ImageScreenSize;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ChangePreview;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipUploadItem;
import com.vk.superapp.api.dto.story.WebClickablePoint;
import com.vk.superapp.api.dto.story.WebStickerType;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: UploaderDataBuilder.kt */
/* loaded from: classes17.dex */
public final class rdq0 {
    public final uwe a;

    public rdq0(uwe uweVar) {
        this.a = uweVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0398  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ClipUploadData a(ClipsUploadState.Loaded loaded) {
        String str;
        List<PrivacySetting.PrivacyRule> d;
        boolean z;
        HideableFeature<ClipInvolvementActionButton<?>> hideableFeature;
        int i;
        HideableFeature<ClipInvolvementActionButton<?>> hideableFeature2;
        ArrayList arrayList;
        List<MaskLight> list;
        boolean z2;
        MobileOfficialAppsClipsStat$ChangePreview.PreviewType previewType;
        ClickableStickers clickableStickers;
        ClipTemplateInfo clipTemplateInfo;
        int i2;
        List list2;
        List singletonList;
        StoryStatContainer storyStatContainer;
        ClipsLinkAttachment d2;
        VideoToClipInfo videoToClipInfo;
        ClipAttachedVideoInfo clipAttachedVideoInfo;
        OrdData ordData;
        ArrayList arrayList2;
        ClipInvolvementActionButton.VkTicket.WallActionButtonVkTicketSeanceDto wallActionButtonVkTicketSeanceDto;
        ClipsUploadDataInternal clipsUploadDataInternal = loaded.b;
        UserId userId = loaded.f;
        ClipInvolvementActionButton<?> d3 = clipsUploadDataInternal.e.f.d();
        ClipsUploadUnmodifiableData clipsUploadUnmodifiableData = clipsUploadDataInternal.c;
        ClipsUploadStaticData clipsUploadStaticData = clipsUploadDataInternal.d;
        boolean z3 = clipsUploadStaticData.e;
        ClipsUploadAuthorRelatedData clipsUploadAuthorRelatedData = clipsUploadDataInternal.e;
        DisableableFeature<ClipAttachedVideoInfo> disableableFeature = clipsUploadAuthorRelatedData.h;
        ConditionalFeature<ClipsLinkAttachment> conditionalFeature = clipsUploadAuthorRelatedData.b;
        HideableFeature<ClipInvolvementActionButton<?>> hideableFeature3 = clipsUploadAuthorRelatedData.f;
        AudioMorphingTypeStat audioMorphingTypeStat = clipsUploadUnmodifiableData.e;
        List<AudioEffectType> list3 = audioMorphingTypeStat != null ? audioMorphingTypeStat.b : null;
        if (list3 != null) {
            List<AudioEffectType> list4 = list3;
            if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                Iterator<T> it = list4.iterator();
                while (it.hasNext()) {
                    if (!epx.f(((AudioEffectType) it.next()).name(), "DEFAULT")) {
                        str = y8g0.e(R.string.clips_publish_audio_effect_hashtag);
                        break;
                    }
                }
            }
        }
        str = "";
        int i3 = clipsUploadUnmodifiableData.b;
        String str2 = clipsUploadUnmodifiableData.c;
        int i4 = clipsUploadUnmodifiableData.d;
        StringBuilder sb = new StringBuilder();
        String str3 = clipsUploadStaticData.b;
        String a = i5s.a(sb, str3 != null ? str3 : "", str);
        UserId a2 = fkq0.b(userId) ? fkq0.a(userId) : UserId.d;
        DisableableSwitch disableableSwitch = clipsUploadAuthorRelatedData.i;
        boolean z4 = disableableSwitch.c ? disableableSwitch.b : false;
        boolean d4 = fkq0.d(userId);
        uwe uweVar = this.a;
        if (d4) {
            boolean z5 = !z3;
            UploadUserInfo uploadUserInfo = loaded.d;
            d = uweVar.c(z5, uploadUserInfo != null && uploadUserInfo.f);
        } else {
            boolean z6 = !z3;
            Group b = hif.b(loaded, userId);
            d = uweVar.d(z6, b != null && b.n());
        }
        PrivacySetting privacySetting = new PrivacySetting();
        privacySetting.e = d;
        String zb = privacySetting.zb();
        ClipsUploadPrivacyData d5 = clipsUploadAuthorRelatedData.c.d();
        String str4 = d5 != null ? d5.c : null;
        boolean z7 = clipsUploadStaticData.d;
        boolean z8 = clipsUploadStaticData.f;
        HideableSwitch hideableSwitch = clipsUploadStaticData.g;
        String str5 = str4;
        Boolean valueOf = Boolean.valueOf(hideableSwitch.c ? hideableSwitch.b : false);
        Long d6 = clipsUploadAuthorRelatedData.j.d();
        if (d6 != null) {
            long longValue = d6.longValue();
            z = z7;
            hideableFeature = hideableFeature3;
            i = (int) (longValue / 1000);
        } else {
            z = z7;
            hideableFeature = hideableFeature3;
            i = 0;
        }
        MobileOfficialAppsClipsStat$ChangePreview.PreviewType previewType2 = clipsUploadStaticData.h.b;
        Boolean valueOf2 = d3 != null ? Boolean.valueOf(d3.equals(ClipInvolvementActionButton.OnlineBooking.e)) : null;
        Boolean valueOf3 = d3 != null ? Boolean.valueOf(d3.equals(ClipInvolvementActionButton.MessageToBusinessCommunity.e)) : null;
        ClipInvolvementActionButton.DonutLevel donutLevel = d3 instanceof ClipInvolvementActionButton.DonutLevel ? (ClipInvolvementActionButton.DonutLevel) d3 : null;
        Integer valueOf4 = donutLevel != null ? Integer.valueOf(donutLevel.e) : null;
        ClipsDraftablePlaylist d7 = clipsUploadAuthorRelatedData.e.d();
        Integer valueOf5 = d7 != null ? Integer.valueOf(d7.b) : null;
        CoauthorsData d8 = clipsUploadAuthorRelatedData.d.d();
        if (d8 != null) {
            List<CoOwnerItem> list5 = d8.b;
            hideableFeature2 = hideableFeature;
            ArrayList arrayList3 = new ArrayList(c5g.u(list5, 10));
            Iterator<T> it2 = list5.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((CoOwnerItem) it2.next()).b);
            }
            arrayList = arrayList3;
        } else {
            hideableFeature2 = hideableFeature;
            arrayList = null;
        }
        AudioMorphingTypeStat audioMorphingTypeStat2 = clipsUploadUnmodifiableData.e;
        List<MaskLight> list6 = clipsUploadUnmodifiableData.f;
        ClipTemplateInfo clipTemplateInfo2 = clipsUploadUnmodifiableData.g;
        ClickableStickers clickableStickers2 = clipsUploadUnmodifiableData.h;
        if (clickableStickers2 == null) {
            ImageScreenSize imageScreenSize = ImageScreenSize.SIZE_48DP;
            list = list6;
            int h = imageScreenSize.h();
            z2 = z;
            int h2 = imageScreenSize.h();
            previewType = previewType2;
            clickableStickers2 = new ClickableStickers(h, h2, new ArrayList());
        } else {
            list = list6;
            z2 = z;
            previewType = previewType2;
        }
        List<ClickableSticker> list7 = clickableStickers2.d;
        GeoLocation geoLocation = clipsUploadStaticData.j;
        if (geoLocation != null) {
            clickableStickers = clickableStickers2;
            clipTemplateInfo = clipTemplateInfo2;
            i2 = i4;
            list7.add(new ClickableGeo(0L, e43.l(new WebClickablePoint(0, 0), new WebClickablePoint(0, 0), new WebClickablePoint(0, 0), new WebClickablePoint(0, 0)), null, geoLocation.b, "", new GeoPlace(geoLocation.b, geoLocation.i, geoLocation.g, geoLocation.h, geoLocation.c, geoLocation.j, new UserId(geoLocation.e), geoLocation.k, 0, 0, 0), geoLocation.i, Integer.valueOf(geoLocation.d), 5, null));
        } else {
            clickableStickers = clickableStickers2;
            clipTemplateInfo = clipTemplateInfo2;
            i2 = i4;
        }
        ProductsData d9 = clipsUploadStaticData.l.d();
        if (d9 != null) {
            for (Iterator it3 = d9.b.iterator(); it3.hasNext(); it3 = it3) {
                Good good = (Good) it3.next();
                list7.add(new ClickableMarketItem(0L, e43.l(new WebClickablePoint(0, 0), new WebClickablePoint(0, 0), new WebClickablePoint(0, 0), new WebClickablePoint(0, 0)), null, Long.valueOf(good.b), good.c, good.K, null, null, null, null, null, null, 4037, null));
            }
        }
        ClipInvolvementActionButton<?> d10 = hideableFeature2.d();
        ClipInvolvementActionButton.VkTicket vkTicket = d10 instanceof ClipInvolvementActionButton.VkTicket ? (ClipInvolvementActionButton.VkTicket) d10 : null;
        if (vkTicket != null) {
            ClipInvolvementActionButton.VkTicket.VkTicketParams vkTicketParams = vkTicket.g;
            list7.add(new ClickableVkTicket(0L, e43.l(new WebClickablePoint(0, 0), new WebClickablePoint(0, 0), new WebClickablePoint(0, 0), new WebClickablePoint(0, 0)), null, vkTicketParams != null ? vkTicketParams.b : null, vkTicketParams != null ? vkTicketParams.c : null, vkTicketParams != null ? vkTicketParams.d : null, null, (vkTicketParams == null || (wallActionButtonVkTicketSeanceDto = vkTicketParams.e) == null) ? null : new SeanceInfo(wallActionButtonVkTicketSeanceDto.b, wallActionButtonVkTicketSeanceDto.c, wallActionButtonVkTicketSeanceDto.d, wallActionButtonVkTicketSeanceDto.e), 69, null));
        }
        String str6 = clipsUploadUnmodifiableData.i;
        VideoToClipInfo videoToClipInfo2 = clipsUploadUnmodifiableData.j;
        ClipsLinkAttachment d11 = conditionalFeature.d();
        ClipInvolvementActionButton<?> d12 = hideableFeature2.d();
        if (epx.f(d12, ClipInvolvementActionButton.MessageToBusinessCommunity.e)) {
            singletonList = Collections.singletonList(ShortVideoCreationFeature.MESSAGE_TO_BC);
        } else if (epx.f(d12, ClipInvolvementActionButton.OnlineBooking.e)) {
            singletonList = Collections.singletonList(ShortVideoCreationFeature.ONLINE_BOOKING);
        } else {
            if (!epx.f(d12, ClipInvolvementActionButton.OpenChannel.e)) {
                if (!(d12 instanceof ClipInvolvementActionButton.DonutLevel) && !(d12 instanceof ClipInvolvementActionButton.VkTicket) && d12 != null) {
                    throw new NoWhenBranchMatchedException();
                }
                list2 = null;
                VideoTemplatePublishInfo videoTemplatePublishInfo = clipsUploadUnmodifiableData.k;
                OrdData ordData2 = clipsUploadStaticData.i;
                ClipUploadParams.LicensedAudioInfo licensedAudioInfo = clipsUploadUnmodifiableData.l;
                storyStatContainer = clipsUploadUnmodifiableData.m;
                if (storyStatContainer == null) {
                    EmptyList emptyList = EmptyList.b;
                    storyStatContainer = new StoryStatContainer(emptyList, emptyList, emptyList, emptyList, emptyList, null);
                }
                ArrayList arrayList4 = new ArrayList(storyStatContainer.f);
                d2 = conditionalFeature.d();
                if (d2 == null) {
                    String i5 = WebStickerType.LINK.i();
                    String str7 = d2.c;
                    if (str7 == null) {
                        videoToClipInfo = videoToClipInfo2;
                        arrayList2 = null;
                    } else {
                        videoToClipInfo = videoToClipInfo2;
                        ArrayList arrayList5 = new ArrayList();
                        q2z.a("text_value", str7, arrayList5);
                        arrayList2 = arrayList5;
                    }
                    arrayList4.add(new ClickableStickerStatInfo(0L, i5, arrayList2, null, null));
                } else {
                    videoToClipInfo = videoToClipInfo2;
                }
                clipAttachedVideoInfo = !disableableFeature.c ? disableableFeature.b : null;
                if (clipAttachedVideoInfo == null) {
                    String str8 = clipAttachedVideoInfo.d;
                    ArrayList arrayList6 = new ArrayList();
                    ordData = ordData2;
                    arrayList6.add(new Pair("text_value", str8));
                    arrayList4.add(new ClickableStickerStatInfo(0L, "video", arrayList6, null, null));
                } else {
                    ordData = ordData2;
                }
                StoryStatContainer storyStatContainer2 = new StoryStatContainer(storyStatContainer.b, storyStatContainer.c, storyStatContainer.d, storyStatContainer.e, arrayList4, storyStatContainer.g);
                Integer num = clipsUploadUnmodifiableData.n;
                String str9 = clipsUploadUnmodifiableData.o;
                ClipAttachedVideoInfo clipAttachedVideoInfo2 = !disableableFeature.c ? disableableFeature.b : null;
                String str10 = clipAttachedVideoInfo2 == null ? clipAttachedVideoInfo2.d : null;
                int i6 = clipsUploadUnmodifiableData.p;
                MobileOfficialAppsClipsStat$TypeClipUploadItem.CameraType cameraType = clipsUploadUnmodifiableData.q;
                MobileOfficialAppsClipsStat$TypeClipUploadItem.DuetType duetType = clipsUploadUnmodifiableData.r;
                boolean z9 = clipsUploadUnmodifiableData.s;
                boolean z10 = clipsUploadUnmodifiableData.t;
                boolean z11 = clipsUploadUnmodifiableData.u;
                boolean z12 = clipsUploadUnmodifiableData.v;
                boolean z13 = clipsUploadUnmodifiableData.w;
                List<ClipsVideoItemLocation> list8 = clipsUploadUnmodifiableData.x;
                AutoRepostToStoriesData d13 = clipsUploadAuthorRelatedData.q.d();
                return new ClipUploadData(new ClipUploadParams(i3, str2, i2, a, a2, z4, zb, str5, z2, z8, valueOf, i, previewType, valueOf2, valueOf3, valueOf4, valueOf5, arrayList, audioMorphingTypeStat2, list, clipTemplateInfo, clickableStickers, str6, videoToClipInfo, d11, list2, videoTemplatePublishInfo, ordData, licensedAudioInfo, storyStatContainer2, num, str9, str10, i6, cameraType, duetType, false, z9, z10, z11, z12, z13, false, list8, d13 == null ? d13.b : false, 0, 16, null), clipsUploadDataInternal.b, loaded.h, null, 8, null);
            }
            singletonList = Collections.singletonList(ShortVideoCreationFeature.CHANNEL);
        }
        list2 = singletonList;
        VideoTemplatePublishInfo videoTemplatePublishInfo2 = clipsUploadUnmodifiableData.k;
        OrdData ordData22 = clipsUploadStaticData.i;
        ClipUploadParams.LicensedAudioInfo licensedAudioInfo2 = clipsUploadUnmodifiableData.l;
        storyStatContainer = clipsUploadUnmodifiableData.m;
        if (storyStatContainer == null) {
        }
        ArrayList arrayList42 = new ArrayList(storyStatContainer.f);
        d2 = conditionalFeature.d();
        if (d2 == null) {
        }
        clipAttachedVideoInfo = !disableableFeature.c ? disableableFeature.b : null;
        if (clipAttachedVideoInfo == null) {
        }
        StoryStatContainer storyStatContainer22 = new StoryStatContainer(storyStatContainer.b, storyStatContainer.c, storyStatContainer.d, storyStatContainer.e, arrayList42, storyStatContainer.g);
        Integer num2 = clipsUploadUnmodifiableData.n;
        String str92 = clipsUploadUnmodifiableData.o;
        ClipAttachedVideoInfo clipAttachedVideoInfo22 = !disableableFeature.c ? disableableFeature.b : null;
        if (clipAttachedVideoInfo22 == null) {
        }
        int i62 = clipsUploadUnmodifiableData.p;
        MobileOfficialAppsClipsStat$TypeClipUploadItem.CameraType cameraType2 = clipsUploadUnmodifiableData.q;
        MobileOfficialAppsClipsStat$TypeClipUploadItem.DuetType duetType2 = clipsUploadUnmodifiableData.r;
        boolean z92 = clipsUploadUnmodifiableData.s;
        boolean z102 = clipsUploadUnmodifiableData.t;
        boolean z112 = clipsUploadUnmodifiableData.u;
        boolean z122 = clipsUploadUnmodifiableData.v;
        boolean z132 = clipsUploadUnmodifiableData.w;
        List<ClipsVideoItemLocation> list82 = clipsUploadUnmodifiableData.x;
        AutoRepostToStoriesData d132 = clipsUploadAuthorRelatedData.q.d();
        return new ClipUploadData(new ClipUploadParams(i3, str2, i2, a, a2, z4, zb, str5, z2, z8, valueOf, i, previewType, valueOf2, valueOf3, valueOf4, valueOf5, arrayList, audioMorphingTypeStat2, list, clipTemplateInfo, clickableStickers, str6, videoToClipInfo, d11, list2, videoTemplatePublishInfo2, ordData, licensedAudioInfo2, storyStatContainer22, num2, str92, str10, i62, cameraType2, duetType2, false, z92, z102, z112, z122, z132, false, list82, d132 == null ? d132.b : false, 0, 16, null), clipsUploadDataInternal.b, loaded.h, null, 8, null);
    }
}
