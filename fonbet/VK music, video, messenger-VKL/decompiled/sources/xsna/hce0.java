package xsna;

import android.os.Parcelable;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.api.generated.wall.dto.WallActionButtonGoalDto;
import com.vk.api.generated.wall.dto.WallActionButtonLevelDto;
import com.vk.api.generated.wall.dto.WallActionButtonVkTicketDto;
import com.vk.api.generated.wall.dto.WallAttachmentsActionButtonDto;
import com.vk.common.api.generated.GsonHolder;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.AttachmentType;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.Image;
import com.vk.newsfeed.posting.additional_settings.data.AdditionalSettingsConfiguration;
import com.vk.newsfeed.posting.additional_settings.domain.model.author.WallOwner;
import com.vk.newsfeed.posting.api.analytics.PostingMetricEntryPoint;
import com.vk.newsfeed.posting.api.model.PhotoVideoDisplayMode;
import com.vk.newsfeed.posting.impl.domain.model.ImageCropArea;
import com.vk.newsfeed.posting.impl.domain.model.PhotoVideoAttachmentsCropData;
import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.domain.model.PostEditingReason;
import com.vk.newsfeed.posting.impl.domain.model.PostingContext;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.model.attachment.LocalPhotoAttachment;
import com.vk.newsfeed.posting.impl.domain.model.attachments.PostingArticleDto;
import com.vk.newsfeed.posting.impl.domain.model.attachments.PostingLinkDto;
import com.vk.newsfeed.posting.impl.domain.model.music.MusicAttachDto;
import com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto;
import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;
import com.vk.newsfeed.posting.impl.presentation.model.FileDto;
import com.vk.newsfeed.posting.impl.presentation.model.GroupWallPostingSettings;
import com.vk.newsfeed.posting.impl.presentation.model.GroupWallStatus;
import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import com.vk.newsfeed.posting.impl.presentation.model.PhotoDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPlaceDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPollDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingSettings;
import com.vk.newsfeed.posting.impl.presentation.model.SituationalTheme;
import com.vk.newsfeed.posting.privacy_picker.model.PrivacyPostType;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$TypePostingItem;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import org.json.JSONObject;

/* compiled from: PublishInteractor.kt */
/* loaded from: classes4.dex */
public final class hce0 {
    public final mui0 a;
    public final fee0 b;

    /* compiled from: PublishInteractor.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AttachmentType.values().length];
            try {
                iArr[AttachmentType.ARTICLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AttachmentType.AUDIO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AttachmentType.DOCUMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AttachmentType.PHOTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AttachmentType.PLAYLIST.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AttachmentType.POLL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AttachmentType.VIDEO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AttachmentType.SITUATIONAL_THEME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public hce0(mui0 mui0Var, fee0 fee0Var) {
        this.a = mui0Var;
        this.b = fee0Var;
    }

    public static void a(hce0 hce0Var, StringBuilder sb, String str, String str2, boolean z, int i) {
        String str3 = (i & 16) != 0 ? null : "?snippet=1";
        if (!z) {
            sb.append(StringUtils.COMMA);
        }
        sb.append(str);
        sb.append(str2);
        if (str3 != null) {
            sb.append(str3);
        }
    }

    public static void b(StringBuilder sb, String str, UserId userId, int i, String str2, boolean z) {
        if (!z) {
            sb.append(StringUtils.COMMA);
        }
        sb.append(str);
        sb.append(userId);
        sb.append(BundleUtil.UNDERLINE_TAG);
        sb.append(i);
        if (str2 != null) {
            sb.append(BundleUtil.UNDERLINE_TAG);
            sb.append(str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0298  */
    /* JADX WARN: Type inference failed for: r16v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r30v1, types: [java.util.Date] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.Date] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, org.json.JSONObject] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pbe0 c(PostingState.Editing editing, ibc0 ibc0Var, String str) {
        UserId a2;
        int i;
        String str2;
        boolean z;
        ArrayList arrayList;
        PostEditableData postEditableData;
        boolean z2;
        PostingPollDto postingPollDto;
        MusicAttachDto musicAttachDto;
        boolean isEmpty;
        UserId userId;
        int i2;
        String str3;
        ArrayList arrayList2;
        StringBuilder sb;
        int i3;
        PostingArticleDto postingArticleDto;
        PostingLinkDto postingLinkDto;
        FileDto fileDto;
        ActionButton actionButton;
        AdditionalSettingsConfiguration additionalSettingsConfiguration;
        String obj;
        List list;
        boolean z3;
        MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint c;
        String name;
        u0p u0pVar;
        PhotoDto photoDto;
        PostEditableData postEditableData2;
        ArrayList arrayList3;
        UserId userId2;
        Iterator it;
        PhotoVideoAttachmentsCropData photoVideoAttachmentsCropData;
        ImageSize k;
        ImageCropArea a3;
        UploadDto.UploadState uploadState;
        PostEditingReason postEditingReason = editing.h;
        PostingSettings postingSettings = editing.d;
        PostEditableData postEditableData3 = editing.i;
        Date date = postEditableData3.o;
        PostingContext postingContext = editing.c;
        WallOwner wallOwner = postingContext.b;
        WallOwner wallOwner2 = postingContext.b;
        boolean b = fkq0.b(wallOwner.b);
        mui0 mui0Var = this.a;
        if (b) {
            GroupWallPostingSettings groupWallPostingSettings = postingSettings.h;
            a2 = postingSettings.d() ? wallOwner2.b : (groupWallPostingSettings != null ? groupWallPostingSettings.d : null) != GroupWallStatus.OPEN ? wallOwner2.b : mui0Var.a();
        } else {
            a2 = mui0Var.a();
        }
        u0p u0pVar2 = (((postEditingReason instanceof PostEditingReason.EditExistingPost) || (postEditingReason instanceof PostEditingReason.EditRemoteDraft)) && (i = postEditableData3.b) > 0) ? new u0p(i, postEditingReason instanceof PostEditingReason.EditRemoteDraft) : null;
        long time = date != null ? date.getTime() / 1000 : 0L;
        ArrayList u = c4g0.u(postEditableData3);
        PhotoVideoAttachmentsCropData photoVideoAttachmentsCropData2 = postEditableData3.j;
        List<ImageCropArea> list2 = photoVideoAttachmentsCropData2.b;
        if (list2 != null) {
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : list2) {
                if (w65.m((ImageCropArea) obj2, photoVideoAttachmentsCropData2.e)) {
                    arrayList4.add(obj2);
                }
            }
            str2 = null;
            z = true;
            arrayList = new ArrayList();
            Iterator it2 = arrayList4.iterator();
            int i4 = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    e43.t();
                    throw null;
                }
                ImageCropArea imageCropArea = (ImageCropArea) next;
                Iterator it3 = u.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        u0pVar = u0pVar2;
                        photoDto = null;
                        break;
                    }
                    ?? next2 = it3.next();
                    PostingAttachment postingAttachment = (PostingAttachment) next2;
                    u0pVar = u0pVar2;
                    Attachment nb = postingAttachment.nb();
                    if ((postingAttachment instanceof PhotoDto) && (nb instanceof PhotoAttachment) && agc0.d(imageCropArea, (PhotoAttachment) nb)) {
                        photoDto = next2;
                        break;
                    }
                    u0pVar2 = u0pVar;
                }
                PhotoDto photoDto2 = photoDto instanceof PhotoDto ? photoDto : null;
                Attachment attachment = photoDto2 != null ? photoDto2.c : null;
                LocalPhotoAttachment localPhotoAttachment = attachment instanceof LocalPhotoAttachment ? (LocalPhotoAttachment) attachment : null;
                Parcelable parcelable = (photoDto2 == null || (uploadState = photoDto2.f) == null) ? null : uploadState.h;
                PostingSettings postingSettings2 = postingSettings;
                PhotoAttachment photoAttachment = parcelable instanceof PhotoAttachment ? (PhotoAttachment) parcelable : null;
                if (localPhotoAttachment == null || photoAttachment == null) {
                    postEditableData2 = postEditableData3;
                    arrayList3 = u;
                    userId2 = a2;
                    it = it2;
                    photoVideoAttachmentsCropData = photoVideoAttachmentsCropData2;
                    if (photoDto2 != null) {
                        Attachment attachment2 = photoDto2.c;
                        if ((attachment2 instanceof PhotoAttachment) && (k = his0.k((PhotoAttachment) attachment2)) != null) {
                            Image image = k.d;
                            int i6 = imageCropArea.d;
                            a3 = ImageCropArea.a(imageCropArea, null, i6, imageCropArea.e, agc0.f(i6, imageCropArea.f, image.b), agc0.f(imageCropArea.e, imageCropArea.g, image.c), null, 195);
                        }
                    }
                    a3 = null;
                } else {
                    int i7 = localPhotoAttachment.z;
                    int i8 = localPhotoAttachment.A;
                    ImageSize k2 = his0.k(photoAttachment);
                    if (k2 != null) {
                        Image image2 = k2.d;
                        arrayList3 = u;
                        int i9 = image2.b;
                        int i10 = image2.c;
                        userId2 = a2;
                        String str4 = imageCropArea.b;
                        int i11 = imageCropArea.g;
                        it = it2;
                        int i12 = imageCropArea.f;
                        int i13 = imageCropArea.e;
                        String Hb = agc0.e(str4) ? photoAttachment.Hb() : imageCropArea.b;
                        if (i7 == i9 || i8 == i10) {
                            postEditableData2 = postEditableData3;
                            photoVideoAttachmentsCropData = photoVideoAttachmentsCropData2;
                            int i14 = imageCropArea.d;
                            a3 = ImageCropArea.a(imageCropArea, Hb, i14, imageCropArea.e, agc0.f(i14, i12, i9), agc0.f(i13, i11, i10), null, 194);
                        } else {
                            photoVideoAttachmentsCropData = photoVideoAttachmentsCropData2;
                            float f = i9 / i7;
                            int g = swe0.g((int) Math.floor(imageCropArea.d * f), 0, i9);
                            float f2 = i10 / i8;
                            int g2 = swe0.g((int) Math.floor(i13 * f2), 0, i10);
                            postEditableData2 = postEditableData3;
                            a3 = ImageCropArea.a(imageCropArea, Hb, g, g2, agc0.f(g, swe0.g((int) Math.floor(i12 * f), 0, i9), i9), agc0.f(g2, swe0.g((int) Math.floor(f2 * i11), 0, i10), i10), null, 194);
                        }
                    } else {
                        postEditableData2 = postEditableData3;
                        arrayList3 = u;
                        userId2 = a2;
                        it = it2;
                        photoVideoAttachmentsCropData = photoVideoAttachmentsCropData2;
                        a3 = null;
                    }
                }
                if (a3 != null) {
                    arrayList.add(a3);
                }
                i4 = i5;
                u = arrayList3;
                photoVideoAttachmentsCropData2 = photoVideoAttachmentsCropData;
                postEditableData3 = postEditableData2;
                u0pVar2 = u0pVar;
                postingSettings = postingSettings2;
                a2 = userId2;
                it2 = it;
            }
        } else {
            str2 = null;
            z = true;
            arrayList = null;
        }
        u0p u0pVar3 = u0pVar2;
        PostingSettings postingSettings3 = postingSettings;
        PostEditableData postEditableData4 = postEditableData3;
        UserId userId3 = a2;
        boolean z4 = false;
        PhotoVideoAttachmentsCropData a4 = PhotoVideoAttachmentsCropData.a(photoVideoAttachmentsCropData2, arrayList, null, null, null, 14);
        if (tuk0.c(editing)) {
            postEditableData = postEditableData4;
            if (postEditableData.o == null && postEditableData.B) {
                z2 = z;
                UserId userId4 = wallOwner2.b;
                String str5 = postEditableData.c;
                StringBuilder sb2 = new StringBuilder();
                postingPollDto = postEditableData.e;
                musicAttachDto = postEditableData.l;
                FileDto fileDto2 = postEditableData.m;
                ArrayList u2 = c4g0.u(postEditableData);
                isEmpty = u2.isEmpty();
                String str6 = StringUtils.COMMA;
                if (!isEmpty) {
                    int size = u2.size();
                    int i15 = 0;
                    while (i15 < size) {
                        boolean z5 = i15 == 0 ? z : z4;
                        PostingAttachment postingAttachment2 = (PostingAttachment) u2.get(i15);
                        if (postingAttachment2 instanceof UploadDto) {
                            UploadDto uploadDto = (UploadDto) postingAttachment2;
                            UploadDto.UploadState I4 = uploadDto.I4();
                            UploadDto.b7.getClass();
                            userId = userId4;
                            if (!epx.f(I4, UploadDto.a.b)) {
                                Parcelable parcelable2 = uploadDto.I4().h;
                                if (parcelable2 != null) {
                                    String photoAttachment2 = parcelable2 instanceof PhotoAttachment ? ((PhotoAttachment) parcelable2).toString() : parcelable2 instanceof VideoFile ? parcelable2.toString() : parcelable2 instanceof VideoAttachment ? ((VideoAttachment) parcelable2).k.toString() : str2;
                                    if (photoAttachment2 != null) {
                                        if (!z5) {
                                            sb2.append(str6);
                                        }
                                        sb2.append(photoAttachment2);
                                    }
                                }
                                arrayList2 = u2;
                                i3 = size;
                                i2 = i15;
                                sb = sb2;
                                str3 = str6;
                                i15 = i2 + 1;
                                size = i3;
                                str6 = str3;
                                userId4 = userId;
                                sb2 = sb;
                                u2 = arrayList2;
                                z4 = false;
                            }
                        } else {
                            userId = userId4;
                        }
                        String str7 = "situational_theme";
                        if (postingAttachment2 instanceof SituationalTheme) {
                            if (!z5) {
                                sb2.append(str6);
                            }
                            sb2.append("situational_theme" + ((SituationalTheme) postingAttachment2).b);
                            arrayList2 = u2;
                            i3 = size;
                            i2 = i15;
                            sb = sb2;
                            str3 = str6;
                            i15 = i2 + 1;
                            size = i3;
                            str6 = str3;
                            userId4 = userId;
                            sb2 = sb;
                            u2 = arrayList2;
                            z4 = false;
                        } else {
                            switch (a.$EnumSwitchMapping$0[postingAttachment2.getType().ordinal()]) {
                                case 1:
                                    str7 = "article";
                                    break;
                                case 2:
                                    str7 = "audio";
                                    break;
                                case 3:
                                    str7 = "doc";
                                    break;
                                case 4:
                                    str7 = "photo";
                                    break;
                                case 5:
                                    str7 = "audio_playlist";
                                    break;
                                case 6:
                                    str7 = "poll";
                                    break;
                                case 7:
                                    str7 = "video";
                                    break;
                                case 8:
                                    break;
                                default:
                                    str7 = "";
                                    break;
                            }
                            i2 = i15;
                            StringBuilder sb3 = sb2;
                            str3 = str6;
                            arrayList2 = u2;
                            sb = sb3;
                            int i16 = size;
                            String str8 = str7;
                            i3 = i16;
                            b(sb, str8, postingAttachment2.q(), postingAttachment2.getId(), null, z5);
                            i15 = i2 + 1;
                            size = i3;
                            str6 = str3;
                            userId4 = userId;
                            sb2 = sb;
                            u2 = arrayList2;
                            z4 = false;
                        }
                    }
                    z4 = z;
                }
                UserId userId5 = userId4;
                StringBuilder sb4 = sb2;
                String str9 = str6;
                postingArticleDto = postEditableData.g;
                if (postingArticleDto != null) {
                    ArticleAttachment articleAttachment = postingArticleDto.b;
                    if (z4) {
                        sb4.append(str9);
                    }
                    sb4.append(fdi.M(articleAttachment));
                    z4 = z;
                }
                postingLinkDto = postEditableData.h;
                if (postingLinkDto != null) {
                    SnippetAttachment snippetAttachment = postingLinkDto.b;
                    if (z4) {
                        sb4.append(str9);
                    }
                    sb4.append(fdi.M(snippetAttachment));
                    z4 = z;
                }
                if (postingPollDto != null) {
                    b(sb4, "poll", postingPollDto.c, postingPollDto.b, null, !z4);
                    z4 = z;
                }
                if (musicAttachDto == null) {
                    if (musicAttachDto instanceof MusicAttachDto.MusicPlaylistDto) {
                        fileDto = fileDto2;
                        a(this, sb4, "audio_playlist", ((MusicAttachDto.MusicPlaylistDto) musicAttachDto).b.b, !z4, 20);
                    } else {
                        fileDto = fileDto2;
                        if (musicAttachDto instanceof MusicAttachDto.MusicTracksDto) {
                            Iterator<MusicDto> it4 = ((MusicAttachDto.MusicTracksDto) musicAttachDto).b.iterator();
                            while (it4.hasNext()) {
                                a(this, sb4, "audio", it4.next().b, !z4, 20);
                                z4 = z;
                            }
                        } else {
                            if (!(musicAttachDto instanceof MusicAttachDto.MusicSnippetDto)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            a(this, sb4, "audio", ((MusicAttachDto.MusicSnippetDto) musicAttachDto).b.b, !z4, 4);
                        }
                    }
                    z4 = z;
                } else {
                    fileDto = fileDto2;
                }
                if (fileDto != null) {
                    b(sb4, "doc", fileDto.q(), fileDto.getId(), fileDto.d(), !z4);
                }
                String sb5 = sb4.toString();
                PostingPlaceDto postingPlaceDto = postEditableData.f;
                int i17 = postingPlaceDto == null ? postingPlaceDto.b : 0;
                AdditionalSettingsConfiguration additionalSettingsConfiguration2 = postEditableData.q;
                PostingMetricEntryPoint postingMetricEntryPoint = postingContext.h;
                String m = (postingMetricEntryPoint != null || (c = kbc0.c(postingMetricEntryPoint)) == null || (name = c.name()) == null) ? "nowhere" : cqm0.m(name);
                Integer g3 = ibc0Var.g();
                PrivacyPostType privacyPostType = postEditableData.i;
                PhotoVideoDisplayMode photoVideoDisplayMode = postEditableData.k;
                PostingLinkDto postingLinkDto2 = postEditableData.h;
                actionButton = postEditableData.t;
                if (actionButton != null) {
                    additionalSettingsConfiguration = additionalSettingsConfiguration2;
                    obj = str2;
                } else {
                    ?? r9 = new w9y().a;
                    r9.put("type", "action_button");
                    w9y w9yVar = new w9y();
                    WallAttachmentsActionButtonDto wallAttachmentsActionButtonDto = actionButton.b;
                    additionalSettingsConfiguration = additionalSettingsConfiguration2;
                    String lowerCase = wallAttachmentsActionButtonDto.f().j().toLowerCase(Locale.ROOT);
                    JSONObject jSONObject = w9yVar.a;
                    jSONObject.put("type", lowerCase);
                    WallActionButtonGoalDto d = wallAttachmentsActionButtonDto.d();
                    if (d != null) {
                        w9y w9yVar2 = new w9y();
                        int d2 = d.d();
                        JSONObject jSONObject2 = w9yVar2.a;
                        jSONObject2.put("goal_id", d2);
                        jSONObject.put("donut_goal", jSONObject2);
                    }
                    WallActionButtonLevelDto e = wallAttachmentsActionButtonDto.e();
                    if (e != null) {
                        w9y w9yVar3 = new w9y();
                        int d3 = e.d();
                        JSONObject jSONObject3 = w9yVar3.a;
                        jSONObject3.put("level_id", d3);
                        jSONObject.put("donut_level", jSONObject3);
                    }
                    WallActionButtonVkTicketDto wallActionButtonVkTicketDto = actionButton.c;
                    if (wallActionButtonVkTicketDto != null) {
                        jSONObject.put("vk_ticket", cqm0.j(GsonHolder.a().toJson(wallActionButtonVkTicketDto)));
                    }
                    r9.put("action_button", jSONObject);
                    obj = Collections.singletonList(r9).toString();
                }
                boolean z6 = postEditableData.v;
                ?? r8 = postEditableData.x;
                String str10 = (r8 != 0 || System.currentTimeMillis() >= r8.getTime()) ? str2 : r8;
                AdditionalSettingsConfiguration additionalSettingsConfiguration3 = postEditableData.q;
                boolean z7 = (additionalSettingsConfiguration3 == null && additionalSettingsConfiguration3.c == (z3 = z)) ? z3 : false;
                boolean Ja = editing.h.Ja();
                boolean d4 = postingSettings3.d();
                list = postEditableData.n;
                if (list == null) {
                    list = EmptyList.b;
                }
                return new pbe0(userId5, userId3, str5, u0pVar3, sb5, i17, time, additionalSettingsConfiguration, m, g3, str, privacyPostType, photoVideoDisplayMode, a4, postingLinkDto2, obj, z6, str10, z7, Ja, d4, list, postEditableData.y, false, z2);
            }
        } else {
            postEditableData = postEditableData4;
        }
        z2 = false;
        UserId userId42 = wallOwner2.b;
        String str52 = postEditableData.c;
        StringBuilder sb22 = new StringBuilder();
        postingPollDto = postEditableData.e;
        musicAttachDto = postEditableData.l;
        FileDto fileDto22 = postEditableData.m;
        ArrayList u22 = c4g0.u(postEditableData);
        isEmpty = u22.isEmpty();
        String str62 = StringUtils.COMMA;
        if (!isEmpty) {
        }
        UserId userId52 = userId42;
        StringBuilder sb42 = sb22;
        String str92 = str62;
        postingArticleDto = postEditableData.g;
        if (postingArticleDto != null) {
        }
        postingLinkDto = postEditableData.h;
        if (postingLinkDto != null) {
        }
        if (postingPollDto != null) {
        }
        if (musicAttachDto == null) {
        }
        if (fileDto != null) {
        }
        String sb52 = sb42.toString();
        PostingPlaceDto postingPlaceDto2 = postEditableData.f;
        if (postingPlaceDto2 == null) {
        }
        AdditionalSettingsConfiguration additionalSettingsConfiguration22 = postEditableData.q;
        PostingMetricEntryPoint postingMetricEntryPoint2 = postingContext.h;
        if (postingMetricEntryPoint2 != null) {
        }
        Integer g32 = ibc0Var.g();
        PrivacyPostType privacyPostType2 = postEditableData.i;
        PhotoVideoDisplayMode photoVideoDisplayMode2 = postEditableData.k;
        PostingLinkDto postingLinkDto22 = postEditableData.h;
        actionButton = postEditableData.t;
        if (actionButton != null) {
        }
        boolean z62 = postEditableData.v;
        ?? r82 = postEditableData.x;
        if (r82 != 0) {
        }
        AdditionalSettingsConfiguration additionalSettingsConfiguration32 = postEditableData.q;
        if (additionalSettingsConfiguration32 == null) {
        }
        boolean Ja2 = editing.h.Ja();
        boolean d42 = postingSettings3.d();
        list = postEditableData.n;
        if (list == null) {
        }
        return new pbe0(userId52, userId3, str52, u0pVar3, sb52, i17, time, additionalSettingsConfiguration, m, g32, str, privacyPostType2, photoVideoDisplayMode2, a4, postingLinkDto22, obj, z62, str10, z7, Ja2, d42, list, postEditableData.y, false, z2);
    }
}
