package xsna;

import android.net.Uri;
import androidx.room.RoomDatabase;
import com.vk.api.generated.wall.dto.WallActionButtonGoalDto;
import com.vk.api.generated.wall.dto.WallActionButtonLevelDto;
import com.vk.api.generated.wall.dto.WallActionButtonVkTicketDto;
import com.vk.api.generated.wall.dto.WallActionButtonVkTicketSeanceDto;
import com.vk.api.generated.wall.dto.WallAttachmentsActionButtonDto;
import com.vk.api.generated.wall.dto.WallPostingSettingsActionButtonVkTicketDto;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.posting.additional_settings.data.AdditionalSettingsConfiguration;
import com.vk.newsfeed.posting.additional_settings.data.AdvertisingOrd;
import com.vk.newsfeed.posting.api.model.PhotoVideoDisplayMode;
import com.vk.newsfeed.posting.impl.domain.model.EmptyCropArea;
import com.vk.newsfeed.posting.impl.domain.model.ImageCropArea;
import com.vk.newsfeed.posting.impl.domain.model.PhotoTag;
import com.vk.newsfeed.posting.impl.domain.model.PhotoVideoAttachmentsCropData;
import com.vk.newsfeed.posting.impl.domain.model.PostingPreviewRatio;
import com.vk.newsfeed.posting.impl.domain.model.attachments.PostingArticleDto;
import com.vk.newsfeed.posting.impl.domain.model.attachments.PostingLinkDto;
import com.vk.newsfeed.posting.impl.domain.model.music.MusicAttachDto;
import com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto;
import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;
import com.vk.newsfeed.posting.impl.presentation.model.CoauthorDto;
import com.vk.newsfeed.posting.impl.presentation.model.DonutLevel;
import com.vk.newsfeed.posting.impl.presentation.model.FileDto;
import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import com.vk.newsfeed.posting.impl.presentation.model.PhotoDto;
import com.vk.newsfeed.posting.impl.presentation.model.PhotoTagsData;
import com.vk.newsfeed.posting.impl.presentation.model.PollAnswerDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPlaceDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPollDto;
import com.vk.newsfeed.posting.impl.presentation.model.VideoDto;
import com.vk.newsfeed.posting.privacy_picker.model.PrivacyPostType;
import com.vkontakte.android.attachments.DocumentAttachment;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.sdk.SharedKt;

/* compiled from: PostingDraftDao_Impl.kt */
/* loaded from: classes4.dex */
public final class pec0 extends mec0 {
    public final RoomDatabase a;
    public final a b = new a();

    /* compiled from: PostingDraftDao_Impl.kt */
    public static final class a extends fqa {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.fqa
        public final void c(qyg0 qyg0Var, Object obj) {
            String str;
            String str2;
            String jSONArray;
            String jSONObject;
            String jSONObject2;
            String jSONObject3;
            String str3;
            String jSONObject4;
            String str4;
            String jSONObject5;
            String jSONObject6;
            DocumentAttachment documentAttachment;
            String jSONArray2;
            String jSONObject7;
            String jSONObject8;
            JSONObject Q3;
            DonutLevel donutLevel;
            kec0 kec0Var = (kec0) obj;
            qyg0Var.bindLong(1, kec0Var.a);
            qyg0Var.bindLong(2, kec0Var.b.b);
            qyg0Var.D3(3, kec0Var.c);
            PrivacyPostType privacyPostType = kec0Var.d;
            JSONObject jSONObject9 = new JSONObject();
            if (privacyPostType.equals(PrivacyPostType.AllUsers.b)) {
                str = "all";
            } else if (privacyPostType.equals(PrivacyPostType.BestFriends.b)) {
                str = "best_friends";
            } else if (privacyPostType.equals(PrivacyPostType.FriendsOnly.b)) {
                str = "friends_only";
            } else if (privacyPostType.equals(PrivacyPostType.AllDonuts.b)) {
                str = "all_donuts";
            } else {
                if (!(privacyPostType instanceof PrivacyPostType.SingleDonutLevel)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "single_donut_level";
            }
            jSONObject9.put("privacy_type", str);
            if ((privacyPostType instanceof PrivacyPostType.SingleDonutLevel) && (donutLevel = ((PrivacyPostType.SingleDonutLevel) privacyPostType).b) != null) {
                JSONObject jSONObject10 = new JSONObject();
                jSONObject10.put("donut_level_id", donutLevel.b);
                jSONObject10.put("donut_level_title", donutLevel.c);
                jSONObject10.put("donut_level_description", donutLevel.d);
                jSONObject10.put("teaser_text", donutLevel.e);
                jSONObject9.put("donut_level", jSONObject10.toString());
            }
            qyg0Var.D3(4, jSONObject9.toString());
            int i = b.$EnumSwitchMapping$0[kec0Var.e.ordinal()];
            if (i == 1) {
                str2 = "Grid";
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str2 = "Carousel";
            }
            qyg0Var.D3(5, str2);
            PhotoVideoAttachmentsCropData photoVideoAttachmentsCropData = kec0Var.f;
            JSONObject jSONObject11 = new JSONObject();
            List<ImageCropArea> list = photoVideoAttachmentsCropData.b;
            if (list != null) {
                JSONArray jSONArray3 = new JSONArray();
                for (ImageCropArea imageCropArea : list) {
                    JSONObject jSONObject12 = new JSONObject();
                    jSONObject12.put("crop_id", imageCropArea.b);
                    Uri uri = imageCropArea.c;
                    jSONObject12.put("photo_uri", uri != null ? uri.toString() : null);
                    jSONObject12.put("crop_x", imageCropArea.d);
                    jSONObject12.put("crop_y", imageCropArea.e);
                    jSONObject12.put("crop_width", imageCropArea.f);
                    jSONObject12.put("crop_height", imageCropArea.g);
                    jSONArray3.put(jSONObject12);
                }
                jSONObject11.put("current_crops", jSONArray3);
            }
            List<EmptyCropArea> list2 = photoVideoAttachmentsCropData.c;
            if (list2 != null) {
                JSONArray jSONArray4 = new JSONArray();
                for (Iterator it = list2.iterator(); it.hasNext(); it = it) {
                    EmptyCropArea emptyCropArea = (EmptyCropArea) it.next();
                    JSONObject jSONObject13 = new JSONObject();
                    jSONObject13.put("crop_id", emptyCropArea.b);
                    Uri uri2 = emptyCropArea.c;
                    jSONObject13.put("photo_uri", uri2 != null ? uri2.toString() : null);
                    PostingPreviewRatio postingPreviewRatio = emptyCropArea.d;
                    JSONObject jSONObject14 = new JSONObject();
                    jSONObject14.put("ratio_w", postingPreviewRatio.b);
                    jSONObject14.put("ratio_h", postingPreviewRatio.c);
                    jSONObject14.put("ratio_custom", postingPreviewRatio.d);
                    jSONObject13.put("ratio", jSONObject14);
                    jSONArray4.put(jSONObject13);
                }
                jSONObject11.put("empty_crops", jSONArray4);
            }
            jSONObject11.put("ratioMeta", photoVideoAttachmentsCropData.d);
            PostingPreviewRatio postingPreviewRatio2 = photoVideoAttachmentsCropData.e;
            JSONObject jSONObject15 = new JSONObject();
            jSONObject15.put("ratio_w", postingPreviewRatio2.b);
            jSONObject15.put("ratio_h", postingPreviewRatio2.c);
            jSONObject15.put("ratio_custom", postingPreviewRatio2.d);
            jSONObject11.put("ratio", jSONObject15);
            qyg0Var.D3(6, jSONObject11.toString());
            List<CoauthorDto> list3 = kec0Var.g;
            if (list3 == null) {
                jSONArray = null;
            } else {
                List<CoauthorDto> list4 = list3;
                ArrayList arrayList = new ArrayList(c5g.u(list4, 10));
                Iterator<T> it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((CoauthorDto) it2.next()).b);
                }
                jSONArray = kvf.a(arrayList).toString();
            }
            if (jSONArray == null) {
                qyg0Var.bindNull(7);
            } else {
                qyg0Var.D3(7, jSONArray);
            }
            Date date = kec0Var.h;
            Long valueOf = date != null ? Long.valueOf(date.getTime()) : null;
            if (valueOf == null) {
                qyg0Var.bindNull(8);
            } else {
                qyg0Var.bindLong(8, valueOf.longValue());
            }
            PostingPollDto postingPollDto = kec0Var.i;
            if (postingPollDto == null) {
                jSONObject = null;
            } else {
                JSONObject jSONObject16 = new JSONObject();
                jSONObject16.put("id", postingPollDto.b);
                jSONObject16.put("owner_id", postingPollDto.c.b);
                jSONObject16.put("title", postingPollDto.d);
                List<PollAnswerDto> list5 = postingPollDto.e;
                if (!list5.isEmpty()) {
                    JSONArray jSONArray5 = new JSONArray();
                    for (PollAnswerDto pollAnswerDto : list5) {
                        JSONObject jSONObject17 = new JSONObject();
                        jSONObject17.put("id", pollAnswerDto.b);
                        jSONObject17.put("title", pollAnswerDto.c);
                        jSONArray5.put(jSONObject17);
                    }
                    jSONObject16.put("poll_answers", jSONArray5);
                }
                jSONObject16.put("poll_anonym", postingPollDto.f);
                jSONObject16.put("poll_multi_votes", postingPollDto.g);
                jSONObject16.put("poll_disable_unvote", postingPollDto.h);
                jSONObject16.put("poll_has_end_date", postingPollDto.i);
                jSONObject16.put("poll_end_date", postingPollDto.j);
                jSONObject16.put("poll_published", postingPollDto.k);
                jSONObject16.put("poll_can_delete", postingPollDto.l);
                jSONObject = jSONObject16.toString();
            }
            if (jSONObject == null) {
                qyg0Var.bindNull(9);
            } else {
                qyg0Var.D3(9, jSONObject);
            }
            PostingPlaceDto postingPlaceDto = kec0Var.j;
            if (postingPlaceDto == null) {
                jSONObject2 = null;
            } else {
                JSONObject jSONObject18 = new JSONObject();
                jSONObject18.put("id", postingPlaceDto.b);
                jSONObject18.put("title", postingPlaceDto.c);
                jSONObject18.put("place_address", postingPlaceDto.d);
                jSONObject18.put("place_category", postingPlaceDto.e);
                jSONObject2 = jSONObject18.toString();
            }
            if (jSONObject2 == null) {
                qyg0Var.bindNull(10);
            } else {
                qyg0Var.D3(10, jSONObject2);
            }
            PostingArticleDto postingArticleDto = kec0Var.k;
            if (postingArticleDto == null) {
                jSONObject3 = null;
            } else {
                JSONObject Q32 = postingArticleDto.b.Q3();
                if (!Q32.has("source_url") && (str3 = postingArticleDto.c) != null) {
                    Q32.put("source_url", str3);
                }
                jSONObject3 = Q32.toString();
            }
            if (jSONObject3 == null) {
                qyg0Var.bindNull(11);
            } else {
                qyg0Var.D3(11, jSONObject3);
            }
            PostingLinkDto postingLinkDto = kec0Var.l;
            if (postingLinkDto == null) {
                jSONObject4 = null;
            } else {
                JSONObject Q33 = postingLinkDto.b.Q3();
                if (!Q33.has("source_url") && (str4 = postingLinkDto.c) != null) {
                    Q33.put("source_url", str4);
                }
                jSONObject4 = Q33.toString();
            }
            if (jSONObject4 == null) {
                qyg0Var.bindNull(12);
            } else {
                qyg0Var.D3(12, jSONObject4);
            }
            MusicAttachDto musicAttachDto = kec0Var.m;
            if (musicAttachDto == null) {
                jSONObject5 = null;
            } else {
                JSONObject jSONObject19 = new JSONObject();
                if (musicAttachDto instanceof MusicAttachDto.MusicSnippetDto) {
                    jSONObject19.put("attach_type", "snippet");
                    jSONObject19.put("snippet", rcc0.a(((MusicAttachDto.MusicSnippetDto) musicAttachDto).b));
                } else if (musicAttachDto instanceof MusicAttachDto.MusicTracksDto) {
                    jSONObject19.put("attach_type", "tracks");
                    JSONArray jSONArray6 = new JSONArray();
                    Iterator<MusicDto> it3 = ((MusicAttachDto.MusicTracksDto) musicAttachDto).b.iterator();
                    while (it3.hasNext()) {
                        jSONArray6.put(rcc0.a(it3.next()));
                    }
                    jSONObject19.put("tracks", jSONArray6);
                } else {
                    if (!(musicAttachDto instanceof MusicAttachDto.MusicPlaylistDto)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jSONObject19.put("attach_type", "playlist");
                    jSONObject19.put("playlist", rcc0.a(((MusicAttachDto.MusicPlaylistDto) musicAttachDto).b));
                }
                jSONObject5 = jSONObject19.toString();
            }
            if (jSONObject5 == null) {
                qyg0Var.bindNull(13);
            } else {
                qyg0Var.D3(13, jSONObject5);
            }
            FileDto fileDto = kec0Var.n;
            if (fileDto == null) {
                jSONObject6 = null;
            } else {
                UploadDto.UploadState I4 = fileDto.I4();
                UploadDto.b7.getClass();
                boolean z = (epx.f(I4, UploadDto.a.b) || epx.f(fileDto.I4().b, UploadDto.UploadStep.Uploaded.b)) ? false : true;
                JSONObject jSONObject20 = new JSONObject();
                jSONObject20.put("id", fileDto.getId());
                jSONObject20.put("title", fileDto.getTitle());
                jSONObject20.put("subtitle", fileDto.f());
                jSONObject20.put("owner_id", fileDto.q().b);
                jSONObject20.put("access_key", fileDto.d());
                jSONObject20.put("file_size", fileDto.e());
                if (z) {
                    jSONObject20.put("pending", true);
                    jSONObject20.put("uri", fileDto.I4().c);
                }
                if ((fileDto instanceof FileDto.Gif) && (documentAttachment = ((FileDto.Gif) fileDto).o) != null) {
                    jSONObject20.put("attach_json", documentAttachment.Q3());
                }
                jSONObject6 = jSONObject20.toString();
            }
            if (jSONObject6 == null) {
                qyg0Var.bindNull(14);
            } else {
                qyg0Var.D3(14, jSONObject6);
            }
            List<PostingAttachment> list6 = kec0Var.o;
            JSONArray jSONArray7 = new JSONArray();
            for (PostingAttachment postingAttachment : list6) {
                Attachment nb = postingAttachment.nb();
                if (nb instanceof tec0) {
                    if (postingAttachment instanceof PhotoDto) {
                        PhotoDto photoDto = (PhotoDto) postingAttachment;
                        Q3 = yq.d("dto_type", "photo_dto");
                        Q3.put(SharedKt.PARAM_ATTACHMENT, ((tec0) photoDto.c).Q3());
                        UploadDto.UploadState uploadState = photoDto.f;
                        if (uploadState.h != null) {
                            Q3.put("upload_state", geq0.a(uploadState));
                        }
                    } else if (postingAttachment instanceof VideoDto) {
                        VideoDto videoDto = (VideoDto) postingAttachment;
                        Q3 = yq.d("dto_type", "video_dto");
                        Q3.put(SharedKt.PARAM_ATTACHMENT, ((tec0) videoDto.c).Q3());
                        UploadDto.UploadState uploadState2 = videoDto.f;
                        if (uploadState2.h != null) {
                            Q3.put("upload_state", geq0.a(uploadState2));
                        }
                    } else {
                        Q3 = ((tec0) nb).Q3();
                    }
                    jSONArray7.put(Q3);
                }
            }
            qyg0Var.D3(15, jSONArray7.toString());
            PhotoTagsData photoTagsData = kec0Var.p;
            if (photoTagsData == null) {
                jSONArray2 = null;
            } else {
                ArrayList v = c5g.v(photoTagsData.b.values());
                JSONArray jSONArray8 = new JSONArray();
                Iterator it4 = v.iterator();
                while (it4.hasNext()) {
                    PhotoTag photoTag = (PhotoTag) it4.next();
                    JSONObject jSONObject21 = new JSONObject();
                    int i2 = photoTag.b;
                    Float f = photoTag.i;
                    Float f2 = photoTag.h;
                    jSONObject21.put("photo_tag_id", i2);
                    Integer num = photoTag.d;
                    if (num != null) {
                        jSONObject21.put("product_id", num.intValue());
                    }
                    jSONObject21.put("product_owner_id", photoTag.c);
                    jSONObject21.put("photo_tag_title", photoTag.e);
                    jSONObject21.put("photo_tag_url", photoTag.f);
                    jSONObject21.put("photo_tag_photo_id", photoTag.g);
                    if (f2 != null) {
                        jSONObject21.put("photo_tag_x", f2);
                    }
                    if (f != null) {
                        jSONObject21.put("photo_tag_y", f);
                    }
                    jSONArray8.put(jSONObject21);
                }
                jSONArray2 = jSONArray8.toString();
            }
            if (jSONArray2 == null) {
                qyg0Var.bindNull(16);
            } else {
                qyg0Var.D3(16, jSONArray2);
            }
            AdditionalSettingsConfiguration additionalSettingsConfiguration = kec0Var.q;
            if (additionalSettingsConfiguration == null) {
                jSONObject7 = null;
            } else {
                JSONObject jSONObject22 = new JSONObject();
                jSONObject22.put("comments_enabled", additionalSettingsConfiguration.b);
                jSONObject22.put("sign_enabled", additionalSettingsConfiguration.c);
                jSONObject22.put("notif_enabled", additionalSettingsConfiguration.d);
                AdvertisingOrd advertisingOrd = additionalSettingsConfiguration.e;
                if (!epx.f(advertisingOrd, AdvertisingOrd.f)) {
                    JSONObject jSONObject23 = new JSONObject();
                    jSONObject23.put("ord_pred_id", advertisingOrd.b);
                    jSONObject23.put("ord_add", advertisingOrd.c);
                    jSONObject23.put("ord_er_id", advertisingOrd.d);
                    jSONObject23.put("ord_is_applied_before", advertisingOrd.e);
                    jSONObject22.put("ord", jSONObject23);
                }
                jSONObject7 = jSONObject22.toString();
            }
            if (jSONObject7 == null) {
                qyg0Var.bindNull(17);
            } else {
                qyg0Var.D3(17, jSONObject7);
            }
            ActionButton actionButton = kec0Var.r;
            if (actionButton == null) {
                jSONObject8 = null;
            } else {
                JSONObject jSONObject24 = new JSONObject();
                WallAttachmentsActionButtonDto wallAttachmentsActionButtonDto = actionButton.b;
                jSONObject24.put("type", wallAttachmentsActionButtonDto.f().j());
                jSONObject24.put("title", wallAttachmentsActionButtonDto.getTitle());
                jSONObject24.put("description", wallAttachmentsActionButtonDto.getDescription());
                WallActionButtonGoalDto d = wallAttachmentsActionButtonDto.d();
                if (d != null) {
                    jSONObject24.put("donut_goal", d.d());
                }
                WallActionButtonLevelDto e = wallAttachmentsActionButtonDto.e();
                if (e != null) {
                    jSONObject24.put("donut_level", e.d());
                }
                WallPostingSettingsActionButtonVkTicketDto g = wallAttachmentsActionButtonDto.g();
                jSONObject24.put("vk_ticket", g != null ? g.getUrl() : null);
                WallActionButtonVkTicketDto wallActionButtonVkTicketDto = actionButton.c;
                if (wallActionButtonVkTicketDto != null) {
                    JSONObject jSONObject25 = new JSONObject();
                    jSONObject25.put("id", wallActionButtonVkTicketDto.getId());
                    jSONObject25.put("title", wallActionButtonVkTicketDto.getTitle());
                    WallActionButtonVkTicketSeanceDto d2 = wallActionButtonVkTicketDto.d();
                    if (d2 != null) {
                        JSONObject jSONObject26 = new JSONObject();
                        jSONObject26.put("seance_id", d2.getId());
                        jSONObject26.put("city_alias", d2.e());
                        jSONObject26.put("city", d2.d());
                        jSONObject26.put("date", d2.f());
                        s3q0 s3q0Var = s3q0.a;
                        jSONObject25.put("seance", jSONObject26);
                    }
                    jSONObject24.put("vk_ticket_data", jSONObject25.toString());
                }
                jSONObject8 = jSONObject24.toString();
            }
            if (jSONObject8 == null) {
                qyg0Var.bindNull(18);
            } else {
                qyg0Var.D3(18, jSONObject8);
            }
            Boolean bool = kec0Var.s;
            if ((bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null) == null) {
                qyg0Var.bindNull(19);
            } else {
                qyg0Var.bindLong(19, r2.intValue());
            }
            Date date2 = kec0Var.t;
            Long valueOf2 = date2 != null ? Long.valueOf(date2.getTime()) : null;
            if (valueOf2 == null) {
                qyg0Var.bindNull(20);
            } else {
                qyg0Var.bindLong(20, valueOf2.longValue());
            }
            String str5 = kec0Var.u;
            if (str5 == null) {
                qyg0Var.bindNull(21);
            } else {
                qyg0Var.D3(21, str5);
            }
        }

        @Override // xsna.fqa
        public final String e() {
            return "INSERT OR REPLACE INTO `posting_draft` (`id`,`user_id`,`text`,`privacy_settings_type`,`display_mode`,`crop_data`,`coauthors`,`postpone_publish_date`,`poll`,`place`,`article`,`link`,`music`,`file`,`attachments`,`photo_tags`,`settings`,`actionButton`,`rememberActionButton`,`open_for_all_date`,`donutTeaserText`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* compiled from: PostingDraftDao_Impl.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PhotoVideoDisplayMode.values().length];
            try {
                iArr[PhotoVideoDisplayMode.Grid.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PhotoVideoDisplayMode.Carousel.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public pec0(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    @Override // xsna.mec0
    public final void a(final long j, final UserId userId) {
        u370.f(this.a, false, true, new izs() { // from class: xsna.oec0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                UserId userId2 = userId;
                long j2 = j;
                qyg0 V0 = ((hyg0) obj).V0("DELETE FROM posting_draft WHERE user_id = ? AND id = ?");
                try {
                    V0.bindLong(1, userId2.b);
                    V0.bindLong(2, j2);
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            }
        });
    }

    @Override // xsna.mec0
    public final kec0 b(long j, UserId userId) {
        return (kec0) u370.f(this.a, true, false, new pom(userId, j, this));
    }

    @Override // xsna.mec0
    public final Long c(UserId userId) {
        return (Long) u370.f(this.a, true, false, new nec0(userId, 0));
    }

    @Override // xsna.mec0
    public final long d(kec0 kec0Var) {
        return ((Number) u370.f(this.a, false, true, new hl1(27, this, kec0Var))).longValue();
    }
}
