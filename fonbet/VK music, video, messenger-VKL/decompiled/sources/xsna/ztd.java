package xsna;

import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.camera.clips.core.drafts.ClipsDraftVkExtraData;
import com.vk.camera.clips.core.drafts.DraftUserRelatedData;
import com.vk.camera.clips.core.drafts.TemplateDraftData;
import com.vk.clips.attachments.api.publish.cta.ClipInvolvementActionButton;
import com.vk.clips.attachments.api.publish.cta.ClipsInvolvementType;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftCommonData;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftMusicInfo;
import com.vk.clips.upload.model.TrendingHashtagData;
import com.vk.core.serialize.Serializer;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.actionlinks.ActionLinkSnippet;
import com.vk.dto.actionlinks.SnippetStyle;
import com.vk.dto.actionlinks.SnippetTarget;
import com.vk.dto.clips.external.ClipsDuetInfo;
import com.vk.dto.clips.masks.MaskLight;
import com.vk.dto.clips.model.ClipsEditorInputVideoItem;
import com.vk.dto.clips.morphing.AudioEffectType;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.dto.clips.music.ClipsEditorMusicTrack;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.DuetMeta;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.ImageSizeKey;
import com.vk.dto.common.OrdAdInfo;
import com.vk.dto.common.OriginalSoundStatus;
import com.vk.dto.common.clips.ClipAudioTemplate;
import com.vk.dto.common.clips.ClipLinkModerationStatus;
import com.vk.dto.common.clips.ClipsGeoLocationAttachment;
import com.vk.dto.common.clips.ClipsLinkAttachment;
import com.vk.dto.common.clips.ClipsMarketAttachment;
import com.vk.dto.common.clips.TrendingHashtag;
import com.vk.dto.common.id.UserId;
import com.vk.dto.geo.GeoPlace;
import com.vk.dto.group.Group;
import com.vk.dto.masks.Mask;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.Photo;
import com.vk.dto.stories.model.clickable.ClickableGeo;
import com.vk.dto.stories.model.clickable.ClickableMarketItem;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.text.Regex;
import xsna.chd;

/* compiled from: ClipsDraftToVideoFileMapper.kt */
/* loaded from: classes16.dex */
public final class ztd {
    public final gxh a;
    public final com.vk.clips.upload.vk.ui.api.a b;
    public final rhd c;
    public final ibr0 d;

    /* compiled from: ClipsDraftToVideoFileMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipsInvolvementType.values().length];
            try {
                iArr[ClipsInvolvementType.ONLINE_BOOKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsInvolvementType.MESSAGE_TO_BC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipsInvolvementType.OPEN_CHANNEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ClipsInvolvementType.DONUT_LEVEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ClipsInvolvementType.VK_TICKET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ztd(gxh gxhVar, com.vk.clips.upload.vk.ui.api.a aVar, rhd rhdVar, ibr0 ibr0Var) {
        this.a = gxhVar;
        this.b = aVar;
        this.c = rhdVar;
        this.d = ibr0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v2 */
    public final ClipVideoFile a(ClipsDraftVk clipsDraftVk) {
        ActionLink actionLink;
        String e;
        UserId c;
        String i;
        String e2;
        chd chdVar;
        String str;
        ClickableGeo clickableGeo;
        ?? r8;
        String str2;
        ClipAudioTemplate clipAudioTemplate;
        String str3;
        ClipsEditorMusicInfo clipsEditorMusicInfo;
        ClipsEditorMusicTrack clipsEditorMusicTrack;
        ClipsEditorMusicInfo clipsEditorMusicInfo2;
        ClipsEditorMusicTrack clipsEditorMusicTrack2;
        ClipAudioTemplate clipAudioTemplate2;
        ClipsEditorMusicInfo clipsEditorMusicInfo3;
        ClipsEditorMusicTrack clipsEditorMusicTrack3;
        ArrayList<Photo> arrayList;
        Owner owner;
        String str4;
        ArrayList arrayList2;
        ImageSize imageSize;
        Image image;
        ArrayList arrayList3;
        ImageSize imageSize2;
        String str5;
        ClipsDraftCommonData clipsDraftCommonData = clipsDraftVk.b;
        chd f = this.c.f();
        ClipsDraftVkExtraData clipsDraftVkExtraData = clipsDraftVk.c;
        ClipInvolvementActionButton<?> clipInvolvementActionButton = clipsDraftVkExtraData.g;
        DraftUserRelatedData draftUserRelatedData = clipsDraftVkExtraData.j;
        if (draftUserRelatedData == null || (str5 = draftUserRelatedData.e) == null || !(!drm0.N(str5))) {
            ClipsLinkAttachment clipsLinkAttachment = clipsDraftVkExtraData.e;
            if (clipsLinkAttachment != null) {
                String str6 = clipsLinkAttachment.c;
                String str7 = str6 == null ? "" : str6;
                String str8 = clipsLinkAttachment.b;
                actionLink = new ActionLink(0, "clips_user_link", "", str7, new ActionLinkSnippet("", "", "", str8 == null ? "" : str8, SnippetTarget.UNKNOWN, 0, 0, null, null, null, null, null, null, null, null, 30720, null), null, null, null);
            } else if (clipInvolvementActionButton != null) {
                int i2 = a.$EnumSwitchMapping$0[clipInvolvementActionButton.b.ordinal()];
                if (i2 == 1) {
                    e = y8g0.e(R.string.clip_editor_preview_appoint);
                } else if (i2 == 2) {
                    e = y8g0.e(R.string.clip_editor_preview_write);
                } else if (i2 == 3) {
                    e = y8g0.e(R.string.clip_editor_preview_open_channel);
                } else if (i2 == 4) {
                    e = y8g0.e(R.string.clip_editor_preview_donut);
                } else {
                    if (i2 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    e = y8g0.e(R.string.clip_editor_preview_vk_ticket);
                }
                String str9 = e;
                actionLink = new ActionLink(0, "", "", "", new ActionLinkSnippet(str9, "", "", str9, SnippetTarget.UNKNOWN, 0, 0, new SnippetStyle(null, null), null, null, null, null, null, null, null, 30720, null), null, null, null);
            } else {
                actionLink = null;
            }
        } else {
            actionLink = new ActionLink(0, "video", "0_0", "", new ActionLinkSnippet(y8g0.e(R.string.clip_editor_preview_video_attach_title), "", "", y8g0.e(R.string.clip_editor_preview_video_attach_title), SnippetTarget.UNKNOWN, 0, 0, new SnippetStyle(null, null), null, null, null, null, null, null, null, 30720, null), null, null, null);
        }
        if (f == null || (c = f.getId()) == null) {
            c = o25.a().c();
        }
        if (f instanceof chd.b) {
            Group C0 = this.a.C0(fkq0.a(c));
            String str10 = C0 != null ? C0.f : null;
            if (str10 == null || str10.length() == 0) {
                if (((C0 == null || (image = C0.g) == null || (arrayList3 = image.b) == null || (imageSize2 = (ImageSize) j5g.a0(arrayList3)) == null) ? null : imageSize2.d.d) != null) {
                    Image image2 = C0.g;
                    if (image2 != null && (arrayList2 = image2.b) != null && (imageSize = (ImageSize) j5g.a0(arrayList2)) != null) {
                        str4 = imageSize.d.d;
                        i = js5.a(50, str4);
                    }
                    str4 = null;
                    i = js5.a(50, str4);
                } else {
                    String str11 = C0 != null ? C0.e : null;
                    if (str11 != null && str11.length() != 0 && C0 != null) {
                        str4 = C0.e;
                        i = js5.a(50, str4);
                    }
                    str4 = null;
                    i = js5.a(50, str4);
                }
            } else {
                if (C0 != null) {
                    str4 = C0.f;
                    i = js5.a(50, str4);
                }
                str4 = null;
                i = js5.a(50, str4);
            }
        } else {
            i = f != null ? f.i() : null;
        }
        List<ClipsEditorInputVideoItem> list = clipsDraftCommonData.d;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((ClipsEditorInputVideoItem) it.next()).n != AudioEffectType.DEFAULT) {
                    e2 = y8g0.e(R.string.clips_editor_preview_audio_effect_hashtag);
                    break;
                }
            }
        }
        e2 = "";
        StringBuilder sb = new StringBuilder();
        String str12 = clipsDraftCommonData.e;
        if (str12 == null) {
            str12 = "";
        }
        String a2 = i5s.a(sb, str12, e2);
        ClipsGeoLocationAttachment clipsGeoLocationAttachment = clipsDraftVkExtraData.d;
        if (clipsGeoLocationAttachment != null) {
            str = "";
            chdVar = f;
            clickableGeo = new ClickableGeo(0L, EmptyList.b, null, clipsGeoLocationAttachment.b, "", new GeoPlace(clipsGeoLocationAttachment.b, clipsGeoLocationAttachment.g, clipsGeoLocationAttachment.e, clipsGeoLocationAttachment.f, 0, "", UserId.d, clipsGeoLocationAttachment.i, 0, 0, 0), clipsGeoLocationAttachment.g, null, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, null);
        } else {
            chdVar = f;
            str = "";
            clickableGeo = null;
        }
        ClipsMarketAttachment clipsMarketAttachment = clipsDraftVkExtraData.f;
        if (clipsMarketAttachment != null) {
            List<Good> list2 = clipsMarketAttachment.c;
            Good good = clipsMarketAttachment.b;
            List<Good> list3 = list2;
            r8 = new ArrayList(c5g.u(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                Iterator it3 = it2;
                r8.add(new ClickableMarketItem(0L, EmptyList.b, null, good != null ? Long.valueOf(good.b) : null, (good == null || (owner = good.M) == null) ? null : owner.b, good != null ? good.K : null, good != null ? good.n : null, (good == null || (arrayList = good.A) == null) ? null : (Photo) j5g.Y(arrayList), (Good) it2.next(), null, null, null, 3589, null));
                it2 = it3;
            }
        } else {
            r8 = EmptyList.b;
        }
        ListBuilder e3 = e43.e();
        if (clickableGeo != null) {
            e3.add(clickableGeo);
        }
        e3.addAll((Collection) r8);
        ClickableStickers clickableStickers = new ClickableStickers(0, 0, new ArrayList(e3.g()));
        ClipsDraftMusicInfo clipsDraftMusicInfo = clipsDraftVkExtraData.c;
        MusicTrack musicTrack = (clipsDraftMusicInfo == null || (clipsEditorMusicInfo3 = clipsDraftMusicInfo.b) == null || (clipsEditorMusicTrack3 = clipsEditorMusicInfo3.b) == null) ? new MusicTrack(0, null, null, y8g0.e(R.string.clips_editor_preview_original_sound_placeholder), 0, 0, null, null, null, 0, false, false, 0, null, false, null, null, false, null, null, null, null, null, null, 0L, 0, false, 0L, null, false, false, false, null, null, null, null, false, false, 0, null, false, 0, false, null, null, false, 0, null, false, null, null, null, -9, 1048575, null) : hxd.c(clipsEditorMusicTrack3);
        List<ClipsEditorInputVideoItem> list4 = clipsDraftCommonData.d;
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = list4.iterator();
        while (it4.hasNext()) {
            MaskLight maskLight = ((ClipsEditorInputVideoItem) it4.next()).e;
            Mask mask = maskLight != null ? new Mask(null, null, maskLight.b, maskLight.c, false, maskLight.e, maskLight.d, 0L, 0L, null, null, false, 0, 0, null, null, null, false, false, false, false, false, null, 0L) : null;
            if (mask != null) {
                arrayList4.add(mask);
            }
        }
        List R = j5g.R(arrayList4);
        List list5 = EmptyList.b;
        ClipsDuetInfo clipsDuetInfo = clipsDraftVkExtraData.h;
        DuetMeta duetMeta = clipsDuetInfo != null ? new DuetMeta(null, null, String.valueOf(clipsDuetInfo.b.b), String.valueOf(clipsDuetInfo.c), clipsDuetInfo.d, 3, null) : null;
        OriginalSoundStatus originalSoundStatus = OriginalSoundStatus.APPROVED;
        ClipLinkModerationStatus clipLinkModerationStatus = epx.f(actionLink != null ? actionLink.c : null, "clips_user_link") ? ClipLinkModerationStatus.APPROVED : ClipLinkModerationStatus.UNDEFINED;
        TemplateDraftData templateDraftData = clipsDraftVkExtraData.i;
        if (templateDraftData == null || (clipAudioTemplate2 = templateDraftData.b) == null) {
            str2 = str;
            clipAudioTemplate = (clipsDraftCommonData.d.size() < 3 || !g620.f().e().A()) ? null : new ClipAudioTemplate(str2);
        } else {
            clipAudioTemplate = clipAudioTemplate2;
            str2 = str;
        }
        DraftUserRelatedData draftUserRelatedData2 = clipsDraftVkExtraData.j;
        List m = e43.m(draftUserRelatedData2 != null ? draftUserRelatedData2.d : null);
        DraftUserRelatedData draftUserRelatedData3 = clipsDraftVkExtraData.j;
        List list6 = draftUserRelatedData3 != null ? draftUserRelatedData3.c : null;
        List list7 = list6 == null ? list5 : list6;
        List<TrendingHashtagData> R0 = this.b.R0();
        ArrayList arrayList5 = new ArrayList(c5g.u(R0, 10));
        Iterator it5 = R0.iterator();
        while (it5.hasNext()) {
            arrayList5.add(((TrendingHashtagData) it5.next()).b);
        }
        Set C = rli0.C(new ulp0(Regex.d(new Regex("#\\w+"), a2), new mo1(14)));
        ArrayList arrayList6 = new ArrayList();
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            Object next = it6.next();
            if (C.contains(((String) next).toLowerCase(Locale.ROOT))) {
                arrayList6.add(next);
            }
        }
        List H0 = j5g.H0(arrayList6, 1);
        ArrayList arrayList7 = new ArrayList(c5g.u(H0, 10));
        Iterator it7 = H0.iterator();
        while (it7.hasNext()) {
            arrayList7.add(new TrendingHashtag((String) it7.next(), EmptyList.b));
        }
        ClipVideoFile clipVideoFile = new ClipVideoFile(clickableStickers, musicTrack, R, list5, duetMeta, null, originalSoundStatus, false, clipLinkModerationStatus, clipAudioTemplate, m, list7, jgp.b, null, null, arrayList7, null, null, null);
        clipVideoFile.p = "short_video";
        if (a2.length() == 0) {
            a2 = y8g0.e(R.string.clip_editor_preview_description_placeholder);
        }
        clipVideoFile.m = a2;
        clipVideoFile.b = UserId.d;
        if (chdVar == null || (str3 = chdVar.getName()) == null) {
            Group C02 = xg5.a().D().C0(c);
            str3 = C02 != null ? C02.d : null;
            if (str3 == null) {
                str3 = o25.a().o().b;
            }
        }
        clipVideoFile.p0 = str3;
        clipVideoFile.q0 = i;
        UserId userId = clipVideoFile.b;
        String str13 = clipVideoFile.p0;
        String str14 = clipVideoFile.q0;
        Serializer.c<Image> cVar = Image.CREATOR;
        if (i != null) {
            str2 = i;
        }
        clipVideoFile.f1(new Owner(userId, str13, null, str14, null, Image.b.c(str2, 50, 50, ImageSizeKey.SIZE_KEY_UNDEFINED), null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194260, null));
        clipVideoFile.B = true;
        clipVideoFile.v = 0;
        clipVideoFile.C = true;
        clipVideoFile.u = 0;
        clipVideoFile.H = true;
        clipVideoFile.w = 0;
        clipVideoFile.T = true;
        clipVideoFile.t0 = false;
        clipVideoFile.D = true;
        clipVideoFile.X1 = false;
        clipVideoFile.Y = actionLink;
        ClipsDraftMusicInfo clipsDraftMusicInfo2 = clipsDraftVkExtraData.c;
        MusicTrack c2 = (clipsDraftMusicInfo2 == null || (clipsEditorMusicInfo2 = clipsDraftMusicInfo2.b) == null || (clipsEditorMusicTrack2 = clipsEditorMusicInfo2.b) == null) ? null : hxd.c(clipsEditorMusicTrack2);
        ibr0 ibr0Var = this.d;
        clipVideoFile.W1 = ibr0Var.c(c2);
        ClipsDraftMusicInfo clipsDraftMusicInfo3 = clipsDraftVkExtraData.c;
        clipVideoFile.V1 = ibr0Var.b((clipsDraftMusicInfo3 == null || (clipsEditorMusicInfo = clipsDraftMusicInfo3.b) == null || (clipsEditorMusicTrack = clipsEditorMusicInfo.b) == null) ? null : clipsEditorMusicTrack.d);
        clipVideoFile.d0 = clipsDraftCommonData.n != null ? new OrdAdInfo(y8g0.e(R.string.clip_editor_preview_ord_title), EmptyList.b) : null;
        clipVideoFile.q = (int) TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        return clipVideoFile;
    }
}
