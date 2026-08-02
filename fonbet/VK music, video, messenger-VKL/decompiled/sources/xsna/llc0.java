package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.api.generated.wall.dto.WallActionButtonGoalDto;
import com.vk.api.generated.wall.dto.WallActionButtonLevelDto;
import com.vk.api.generated.wall.dto.WallActionButtonTypeDto;
import com.vk.api.generated.wall.dto.WallAttachmentsActionButtonDto;
import com.vk.api.generated.wall.dto.WallPostingSettingsActionButtonVkTicketDto;
import com.vk.common.links.LinksParserData;
import com.vk.dto.action_button.ActionButtonDonutGoal;
import com.vk.dto.action_button.ActionButtonDonutLevel;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.AttachmentType;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.actions.ActionOpenInternalVkUi;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.Image;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.Flags;
import com.vk.dto.newsfeed.PostDonut;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.post.AttachmentsMeta;
import com.vk.dto.newsfeed.entries.post.NewsfeedCoowners;
import com.vk.dto.photo.ImageCropData;
import com.vk.dto.polls.Poll;
import com.vk.dto.polls.PollOption;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.posting.attachments.PendingAudioAttachmentWrapper;
import com.vk.newsfeed.posting.additional_settings.data.AdditionalSettingsConfiguration;
import com.vk.newsfeed.posting.additional_settings.data.AdvertisingOrd;
import com.vk.newsfeed.posting.api.model.PhotoVideoDisplayMode;
import com.vk.newsfeed.posting.impl.domain.model.EmptyCropArea;
import com.vk.newsfeed.posting.impl.domain.model.ImageCropArea;
import com.vk.newsfeed.posting.impl.domain.model.LinksParsingMetaData;
import com.vk.newsfeed.posting.impl.domain.model.PhotoVideoAttachmentsCropData;
import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.domain.model.PostingPreviewRatio;
import com.vk.newsfeed.posting.impl.domain.model.attachment.LocalPhotoAttachment;
import com.vk.newsfeed.posting.impl.domain.model.attachments.PostingArticleDto;
import com.vk.newsfeed.posting.impl.domain.model.attachments.PostingLinkDto;
import com.vk.newsfeed.posting.impl.domain.model.music.MusicAttachDto;
import com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto;
import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;
import com.vk.newsfeed.posting.impl.presentation.model.CoauthorDto;
import com.vk.newsfeed.posting.impl.presentation.model.DonutLevel;
import com.vk.newsfeed.posting.impl.presentation.model.FileDto;
import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import com.vk.newsfeed.posting.impl.presentation.model.PollAnswerDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPlaceDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPollDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingTextRestriction;
import com.vk.newsfeed.posting.privacy_picker.model.PrivacyPostType;
import com.vkontakte.android.attachments.ActionButtonAttachment;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vkontakte.android.attachments.AudioAttachment;
import com.vkontakte.android.attachments.AudioPlaylistAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.GeoAttachment;
import com.vkontakte.android.attachments.MarketAlbumAttachment;
import com.vkontakte.android.attachments.MarketAttachment;
import com.vkontakte.android.attachments.MiniAppAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.PodcastAttachment;
import com.vkontakte.android.attachments.PollAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.vhc0;

/* compiled from: PostingRouterUtils.kt */
/* loaded from: classes4.dex */
public final class llc0 {

    /* compiled from: PostingRouterUtils.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PostingVisibilityMode.values().length];
            try {
                iArr[PostingVisibilityMode.FRIENDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostingVisibilityMode.BEST_FRIENDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0437 A[LOOP:10: B:190:0x0431->B:192:0x0437, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x03a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0370 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0718  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x07a2 A[LOOP:28: B:540:0x079c->B:542:0x07a2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:546:0x0787  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x06aa  */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v57, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final PostEditableData a(vhc0 vhc0Var, Context context) {
        Attachment attachment;
        Attachment attachment2;
        PostingPlaceDto postingPlaceDto;
        FileDto fileDto;
        Long l;
        Date date;
        List<Attachment> list;
        List list2;
        PostingArticleDto postingArticleDto;
        MusicAttachDto musicAttachDto;
        PostingLinkDto postingLinkDto;
        Iterator it;
        Object obj;
        Object obj2;
        Object obj3;
        Attachment attachment3;
        Attachment attachment4;
        Object obj4;
        Object obj5;
        PostingPlaceDto postingPlaceDto2;
        Object obj6;
        List g;
        AdvertisingOrd advertisingOrd;
        boolean z;
        Object obj7;
        ActionButton actionButton;
        Object obj8;
        Integer num;
        Date date2;
        Iterator it2;
        Object obj9;
        Iterator it3;
        Object obj10;
        NewsfeedCoowners newsfeedCoowners;
        ArrayList arrayList;
        Iterator it4;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        boolean z5;
        int i3;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        Integer num2;
        PostDonut postDonut;
        String str;
        Object obj16;
        String str2;
        ActionButton actionButton2;
        if (vhc0Var instanceof vhc0.a) {
            vhc0.a aVar = (vhc0.a) vhc0Var;
            return PostEditableData.a(PostEditableData.D, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new AdditionalSettingsConfiguration(false, false, false, null, aVar.d, 15, null), null, null, null, null, null, null, aVar.f, null, 201293823);
        }
        if (!(vhc0Var instanceof vhc0.b)) {
            if (!(vhc0Var instanceof vhc0.c)) {
                if (!(vhc0Var instanceof vhc0.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                vhc0.d dVar = (vhc0.d) vhc0Var;
                zwc0 zwc0Var = dVar.b;
                List<Attachment> list3 = zwc0Var.c;
                if (list3 != null) {
                    Iterator it5 = list3.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            attachment4 = 0;
                            break;
                        }
                        attachment4 = it5.next();
                        if (((Attachment) attachment4) instanceof PollAttachment) {
                            break;
                        }
                    }
                    attachment = attachment4;
                } else {
                    attachment = null;
                }
                PostingPollDto c = attachment instanceof PollAttachment ? c((PollAttachment) attachment) : null;
                List<Attachment> list4 = zwc0Var.c;
                if (list4 != null) {
                    Iterator it6 = list4.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            attachment3 = 0;
                            break;
                        }
                        attachment3 = it6.next();
                        if (((Attachment) attachment3) instanceof GeoAttachment) {
                            break;
                        }
                    }
                    attachment2 = attachment3;
                } else {
                    attachment2 = null;
                }
                if (attachment2 instanceof GeoAttachment) {
                    GeoAttachment geoAttachment = (GeoAttachment) attachment2;
                    int i4 = geoAttachment.k;
                    String str3 = geoAttachment.h;
                    if (str3 == null) {
                        str3 = "";
                    }
                    postingPlaceDto = new PostingPlaceDto(i4, str3, geoAttachment.i, null);
                } else {
                    postingPlaceDto = null;
                }
                if (list4 != null) {
                    Iterator it7 = list4.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it7.next();
                        if (obj3 instanceof DocumentAttachment) {
                            break;
                        }
                    }
                    if (!(obj3 instanceof DocumentAttachment)) {
                        obj3 = null;
                    }
                    DocumentAttachment documentAttachment = (DocumentAttachment) obj3;
                    if (documentAttachment != null) {
                        fileDto = r8r.a(documentAttachment);
                        l = zwc0Var.d;
                        if (l != null) {
                            if (l.longValue() <= System.currentTimeMillis()) {
                                l = null;
                            }
                            if (l != null) {
                                date = new Date(l.longValue());
                                PostingVisibilityMode postingVisibilityMode = zwc0Var.e;
                                int i5 = postingVisibilityMode == null ? -1 : a.$EnumSwitchMapping$0[postingVisibilityMode.ordinal()];
                                PrivacyPostType privacyPostType = i5 != 1 ? i5 != 2 ? PrivacyPostType.AllUsers.b : PrivacyPostType.BestFriends.b : PrivacyPostType.FriendsOnly.b;
                                list = list4;
                                if (list != null || list.isEmpty()) {
                                    list2 = EmptyList.b;
                                } else {
                                    ListBuilder e = e43.e();
                                    Iterator it8 = list4.iterator();
                                    while (it8.hasNext()) {
                                        PostingAttachment b = com.vk.newsfeed.posting.impl.presentation.model.a.b((Attachment) it8.next());
                                        if (b != null) {
                                            e.add(b);
                                        }
                                    }
                                    list2 = e.g();
                                }
                                List list5 = list2;
                                String str4 = zwc0Var.b;
                                String t = d02.t(str4 != null ? str4 : "", true);
                                PostingTextRestriction.Invisible invisible = PostingTextRestriction.Invisible.b;
                                AdditionalSettingsConfiguration additionalSettingsConfiguration = new AdditionalSettingsConfiguration(false, false, false, null, dVar.d, 15, null);
                                if (list4 != null) {
                                    Iterator it9 = list4.iterator();
                                    while (true) {
                                        if (!it9.hasNext()) {
                                            obj2 = null;
                                            break;
                                        }
                                        obj2 = it9.next();
                                        if (((Attachment) obj2) instanceof ArticleAttachment) {
                                            break;
                                        }
                                    }
                                    Attachment attachment5 = (Attachment) obj2;
                                    ArticleAttachment articleAttachment = attachment5 instanceof ArticleAttachment ? (ArticleAttachment) attachment5 : null;
                                    if (articleAttachment != null) {
                                        postingArticleDto = new PostingArticleDto(articleAttachment, null);
                                        if (list4 != null) {
                                            Iterator it10 = list4.iterator();
                                            while (true) {
                                                if (!it10.hasNext()) {
                                                    obj = null;
                                                    break;
                                                }
                                                obj = it10.next();
                                                if (((Attachment) obj) instanceof SnippetAttachment) {
                                                    break;
                                                }
                                            }
                                            Attachment attachment6 = (Attachment) obj;
                                            SnippetAttachment snippetAttachment = attachment6 instanceof SnippetAttachment ? (SnippetAttachment) attachment6 : null;
                                            if (snippetAttachment != null) {
                                                musicAttachDto = null;
                                                postingLinkDto = new PostingLinkDto(snippetAttachment, null);
                                                MusicAttachDto d = list4 != null ? d(context, list4) : musicAttachDto;
                                                List list6 = list5;
                                                ArrayList arrayList2 = new ArrayList(c5g.u(list6, 10));
                                                it = list6.iterator();
                                                while (it.hasNext()) {
                                                    arrayList2.add(((PostingAttachment) it.next()).nb());
                                                }
                                                return new PostEditableData(0, t, invisible, c, postingPlaceDto, postingArticleDto, postingLinkDto, privacyPostType, b(arrayList2), PhotoVideoDisplayMode.Carousel, d, fileDto, null, date, list5, additionalSettingsConfiguration, null, false, null, null, false, new LinksParsingMetaData(e(t), EmptyList.b, null, null, 12, null), null, null, false, false, dVar.j, null, 184549376, null);
                                            }
                                        }
                                        musicAttachDto = null;
                                        postingLinkDto = null;
                                        if (list4 != null) {
                                        }
                                        List list62 = list5;
                                        ArrayList arrayList22 = new ArrayList(c5g.u(list62, 10));
                                        it = list62.iterator();
                                        while (it.hasNext()) {
                                        }
                                        return new PostEditableData(0, t, invisible, c, postingPlaceDto, postingArticleDto, postingLinkDto, privacyPostType, b(arrayList22), PhotoVideoDisplayMode.Carousel, d, fileDto, null, date, list5, additionalSettingsConfiguration, null, false, null, null, false, new LinksParsingMetaData(e(t), EmptyList.b, null, null, 12, null), null, null, false, false, dVar.j, null, 184549376, null);
                                    }
                                }
                                postingArticleDto = null;
                                if (list4 != null) {
                                }
                                musicAttachDto = null;
                                postingLinkDto = null;
                                if (list4 != null) {
                                }
                                List list622 = list5;
                                ArrayList arrayList222 = new ArrayList(c5g.u(list622, 10));
                                it = list622.iterator();
                                while (it.hasNext()) {
                                }
                                return new PostEditableData(0, t, invisible, c, postingPlaceDto, postingArticleDto, postingLinkDto, privacyPostType, b(arrayList222), PhotoVideoDisplayMode.Carousel, d, fileDto, null, date, list5, additionalSettingsConfiguration, null, false, null, null, false, new LinksParsingMetaData(e(t), EmptyList.b, null, null, 12, null), null, null, false, false, dVar.j, null, 184549376, null);
                            }
                        }
                        date = null;
                        PostingVisibilityMode postingVisibilityMode2 = zwc0Var.e;
                        if (postingVisibilityMode2 == null) {
                        }
                        PrivacyPostType privacyPostType2 = i5 != 1 ? i5 != 2 ? PrivacyPostType.AllUsers.b : PrivacyPostType.BestFriends.b : PrivacyPostType.FriendsOnly.b;
                        list = list4;
                        if (list != null) {
                        }
                        list2 = EmptyList.b;
                        List list52 = list2;
                        String str42 = zwc0Var.b;
                        String t2 = d02.t(str42 != null ? str42 : "", true);
                        PostingTextRestriction.Invisible invisible2 = PostingTextRestriction.Invisible.b;
                        AdditionalSettingsConfiguration additionalSettingsConfiguration2 = new AdditionalSettingsConfiguration(false, false, false, null, dVar.d, 15, null);
                        if (list4 != null) {
                        }
                        postingArticleDto = null;
                        if (list4 != null) {
                        }
                        musicAttachDto = null;
                        postingLinkDto = null;
                        if (list4 != null) {
                        }
                        List list6222 = list52;
                        ArrayList arrayList2222 = new ArrayList(c5g.u(list6222, 10));
                        it = list6222.iterator();
                        while (it.hasNext()) {
                        }
                        return new PostEditableData(0, t2, invisible2, c, postingPlaceDto, postingArticleDto, postingLinkDto, privacyPostType2, b(arrayList2222), PhotoVideoDisplayMode.Carousel, d, fileDto, null, date, list52, additionalSettingsConfiguration2, null, false, null, null, false, new LinksParsingMetaData(e(t2), EmptyList.b, null, null, 12, null), null, null, false, false, dVar.j, null, 184549376, null);
                    }
                }
                fileDto = null;
                l = zwc0Var.d;
                if (l != null) {
                }
                date = null;
                PostingVisibilityMode postingVisibilityMode22 = zwc0Var.e;
                if (postingVisibilityMode22 == null) {
                }
                PrivacyPostType privacyPostType22 = i5 != 1 ? i5 != 2 ? PrivacyPostType.AllUsers.b : PrivacyPostType.BestFriends.b : PrivacyPostType.FriendsOnly.b;
                list = list4;
                if (list != null) {
                }
                list2 = EmptyList.b;
                List list522 = list2;
                String str422 = zwc0Var.b;
                String t22 = d02.t(str422 != null ? str422 : "", true);
                PostingTextRestriction.Invisible invisible22 = PostingTextRestriction.Invisible.b;
                AdditionalSettingsConfiguration additionalSettingsConfiguration22 = new AdditionalSettingsConfiguration(false, false, false, null, dVar.d, 15, null);
                if (list4 != null) {
                }
                postingArticleDto = null;
                if (list4 != null) {
                }
                musicAttachDto = null;
                postingLinkDto = null;
                if (list4 != null) {
                }
                List list62222 = list522;
                ArrayList arrayList22222 = new ArrayList(c5g.u(list62222, 10));
                it = list62222.iterator();
                while (it.hasNext()) {
                }
                return new PostEditableData(0, t22, invisible22, c, postingPlaceDto, postingArticleDto, postingLinkDto, privacyPostType22, b(arrayList22222), PhotoVideoDisplayMode.Carousel, d, fileDto, null, date, list522, additionalSettingsConfiguration22, null, false, null, null, false, new LinksParsingMetaData(e(t22), EmptyList.b, null, null, 12, null), null, null, false, false, dVar.j, null, 184549376, null);
            }
            vhc0.c cVar = (vhc0.c) vhc0Var;
            NewsEntry newsEntry = cVar.b;
            Post post = newsEntry instanceof Post ? (Post) newsEntry : null;
            if (post != null) {
                Flags flags = post.l;
                UserId userId = post.m;
                int i6 = post.r;
                ArrayList<EntryAttachment> arrayList3 = post.z;
                ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
                Iterator it11 = arrayList3.iterator();
                while (it11.hasNext()) {
                    arrayList4.add(((EntryAttachment) it11.next()).b);
                }
                Iterator it12 = arrayList3.iterator();
                while (true) {
                    if (!it12.hasNext()) {
                        obj4 = null;
                        break;
                    }
                    obj4 = it12.next();
                    if (((EntryAttachment) obj4).b instanceof PollAttachment) {
                        break;
                    }
                }
                EntryAttachment entryAttachment = (EntryAttachment) obj4;
                Attachment attachment7 = entryAttachment != null ? entryAttachment.b : null;
                PostingPollDto c2 = attachment7 instanceof PollAttachment ? c((PollAttachment) attachment7) : null;
                Iterator it13 = arrayList3.iterator();
                while (true) {
                    if (!it13.hasNext()) {
                        obj5 = null;
                        break;
                    }
                    obj5 = it13.next();
                    if (((EntryAttachment) obj5).b instanceof GeoAttachment) {
                        break;
                    }
                }
                EntryAttachment entryAttachment2 = (EntryAttachment) obj5;
                Attachment attachment8 = entryAttachment2 != null ? entryAttachment2.b : null;
                if (attachment8 instanceof GeoAttachment) {
                    GeoAttachment geoAttachment2 = (GeoAttachment) attachment8;
                    int i7 = geoAttachment2.k;
                    String str5 = geoAttachment2.h;
                    if (str5 == null) {
                        str5 = "";
                    }
                    postingPlaceDto2 = new PostingPlaceDto(i7, str5, geoAttachment2.i, null);
                } else {
                    postingPlaceDto2 = null;
                }
                Iterator it14 = arrayList3.iterator();
                while (true) {
                    if (!it14.hasNext()) {
                        obj6 = null;
                        break;
                    }
                    obj6 = it14.next();
                    if (((EntryAttachment) obj6).b instanceof DocumentAttachment) {
                        break;
                    }
                }
                EntryAttachment entryAttachment3 = (EntryAttachment) obj6;
                Attachment attachment9 = entryAttachment3 != null ? entryAttachment3.b : null;
                if (!(attachment9 instanceof DocumentAttachment)) {
                    attachment9 = null;
                }
                DocumentAttachment documentAttachment2 = (DocumentAttachment) attachment9;
                FileDto a2 = documentAttachment2 != null ? r8r.a(documentAttachment2) : null;
                if (arrayList3.isEmpty()) {
                    g = EmptyList.b;
                } else {
                    ListBuilder e2 = e43.e();
                    Iterator it15 = arrayList3.iterator();
                    while (it15.hasNext()) {
                        PostingAttachment b2 = com.vk.newsfeed.posting.impl.presentation.model.a.b(((EntryAttachment) it15.next()).b);
                        if (b2 != null) {
                            e2.add(b2);
                        }
                    }
                    g = e2.g();
                }
                List list7 = g;
                boolean z6 = cVar.d;
                AdvertisingOrd advertisingOrd2 = new AdvertisingOrd(null, Boolean.valueOf(post.F), post.H, post.F, 1, null);
                if (!di60.M(post) ? post.q != null : !post.Pb()) {
                    advertisingOrd = advertisingOrd2;
                    z = false;
                } else {
                    z = true;
                    advertisingOrd = advertisingOrd2;
                }
                AdditionalSettingsConfiguration additionalSettingsConfiguration3 = new AdditionalSettingsConfiguration(!flags.zb(16777216L) || (post.Z1() && post.Lb()), z, false, advertisingOrd, z6, 4, null);
                Date date3 = (!post.oc() || i6 <= 0) ? null : new Date(i6 * 1000);
                AttachmentsMeta attachmentsMeta = post.A;
                PhotoVideoDisplayMode photoVideoDisplayMode = attachmentsMeta == null ? PhotoVideoDisplayMode.Carousel : attachmentsMeta.b == AttachmentsMeta.PrimaryMode.GRID ? PhotoVideoDisplayMode.Grid : PhotoVideoDisplayMode.Carousel;
                Iterator it16 = arrayList3.iterator();
                while (true) {
                    if (!it16.hasNext()) {
                        obj7 = null;
                        break;
                    }
                    obj7 = it16.next();
                    if (((EntryAttachment) obj7).b instanceof ActionButtonAttachment) {
                        break;
                    }
                }
                EntryAttachment entryAttachment4 = (EntryAttachment) obj7;
                Attachment attachment10 = entryAttachment4 != null ? entryAttachment4.b : null;
                if (!(attachment10 instanceof ActionButtonAttachment)) {
                    attachment10 = null;
                }
                ActionButtonAttachment actionButtonAttachment = (ActionButtonAttachment) attachment10;
                if (actionButtonAttachment != null) {
                    Iterator it17 = WallActionButtonTypeDto.i().iterator();
                    while (true) {
                        if (!it17.hasNext()) {
                            obj16 = null;
                            break;
                        }
                        obj16 = it17.next();
                        if (brm0.w(actionButtonAttachment.f, ((WallActionButtonTypeDto) obj16).name(), true)) {
                            break;
                        }
                    }
                    WallActionButtonTypeDto wallActionButtonTypeDto = (WallActionButtonTypeDto) obj16;
                    if (wallActionButtonTypeDto == null) {
                        actionButton2 = null;
                    } else {
                        if (actionButtonAttachment.Fb()) {
                            Action action = actionButtonAttachment.h;
                            ActionOpenInternalVkUi actionOpenInternalVkUi = action instanceof ActionOpenInternalVkUi ? (ActionOpenInternalVkUi) action : null;
                            if (actionOpenInternalVkUi != null) {
                                str2 = actionOpenInternalVkUi.c;
                                String str6 = actionButtonAttachment.g;
                                ActionButtonDonutGoal actionButtonDonutGoal = actionButtonAttachment.j;
                                WallActionButtonGoalDto wallActionButtonGoalDto = actionButtonDonutGoal == null ? new WallActionButtonGoalDto((int) actionButtonDonutGoal.b) : null;
                                ActionButtonDonutLevel actionButtonDonutLevel = actionButtonAttachment.k;
                                actionButton2 = new ActionButton(new WallAttachmentsActionButtonDto(wallActionButtonTypeDto, str6, "", wallActionButtonGoalDto, actionButtonDonutLevel == null ? new WallActionButtonLevelDto((int) actionButtonDonutLevel.b) : null, str2 == null ? new WallPostingSettingsActionButtonVkTicketDto(str2, null, 2, null) : null), actionButtonAttachment.o);
                            }
                        }
                        str2 = null;
                        String str62 = actionButtonAttachment.g;
                        ActionButtonDonutGoal actionButtonDonutGoal2 = actionButtonAttachment.j;
                        if (actionButtonDonutGoal2 == null) {
                        }
                        ActionButtonDonutLevel actionButtonDonutLevel2 = actionButtonAttachment.k;
                        actionButton2 = new ActionButton(new WallAttachmentsActionButtonDto(wallActionButtonTypeDto, str62, "", wallActionButtonGoalDto, actionButtonDonutLevel2 == null ? new WallActionButtonLevelDto((int) actionButtonDonutLevel2.b) : null, str2 == null ? new WallPostingSettingsActionButtonVkTicketDto(str2, null, 2, null) : null), actionButtonAttachment.o);
                    }
                    actionButton = actionButton2;
                } else {
                    actionButton = null;
                }
                String t3 = d02.t(post.s, true);
                if (flags.zb(512L)) {
                    obj8 = PrivacyPostType.FriendsOnly.b;
                } else if (flags.zb(2147483648L)) {
                    obj8 = PrivacyPostType.BestFriends.b;
                } else if (post.o1()) {
                    PostDonut postDonut2 = post.R;
                    obj8 = (postDonut2 == null || (num = postDonut2.h) == null) ? PrivacyPostType.AllDonuts.b : new PrivacyPostType.SingleDonutLevel(new DonutLevel(num.intValue(), "", "", ""));
                } else {
                    obj8 = PrivacyPostType.AllUsers.b;
                }
                Pair pair = new Pair(obj8, Boolean.valueOf(post.oc() && (fkq0.d(userId) || !((postDonut = post.R) == null || (str = postDonut.e) == null || !(drm0.N(str) ^ true)))));
                PrivacyPostType privacyPostType3 = (PrivacyPostType) pair.d();
                boolean booleanValue = ((Boolean) pair.g()).booleanValue();
                PostDonut postDonut3 = post.R;
                if (postDonut3 != null && (num2 = postDonut3.d) != null) {
                    if (num2.intValue() <= 0) {
                        num2 = null;
                    }
                    if (num2 != null) {
                        date2 = new Date((num2.intValue() + i6) * 1000);
                        boolean z7 = !flags.zb(1073741824L) && (date2 == null || date2.getTime() > System.currentTimeMillis());
                        int i8 = post.n;
                        PostingTextRestriction.Invisible invisible3 = PostingTextRestriction.Invisible.b;
                        it2 = arrayList3.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj9 = null;
                                break;
                            }
                            obj9 = it2.next();
                            if (((EntryAttachment) obj9).b instanceof ArticleAttachment) {
                                break;
                            }
                        }
                        EntryAttachment entryAttachment5 = (EntryAttachment) obj9;
                        Attachment attachment11 = entryAttachment5 == null ? entryAttachment5.b : null;
                        ArticleAttachment articleAttachment2 = !(attachment11 instanceof ArticleAttachment) ? (ArticleAttachment) attachment11 : null;
                        PostingArticleDto postingArticleDto2 = articleAttachment2 == null ? new PostingArticleDto(articleAttachment2, null) : null;
                        it3 = arrayList3.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                obj10 = null;
                                break;
                            }
                            obj10 = it3.next();
                            if (((EntryAttachment) obj10).b instanceof SnippetAttachment) {
                                break;
                            }
                        }
                        EntryAttachment entryAttachment6 = (EntryAttachment) obj10;
                        Attachment attachment12 = entryAttachment6 == null ? entryAttachment6.b : null;
                        SnippetAttachment snippetAttachment2 = !(attachment12 instanceof SnippetAttachment) ? (SnippetAttachment) attachment12 : null;
                        PostingLinkDto postingLinkDto2 = snippetAttachment2 == null ? new PostingLinkDto(snippetAttachment2, null) : null;
                        MusicAttachDto d2 = d(context, arrayList4);
                        newsfeedCoowners = post.f0;
                        if (newsfeedCoowners == null) {
                            UserId userId2 = cVar.a;
                            if (userId2 != null) {
                                userId = userId2;
                            }
                            List<NewsfeedCoowners.CoownerStatus> list8 = newsfeedCoowners.f;
                            ArrayList arrayList5 = new ArrayList(c5g.u(list8, 10));
                            Iterator it18 = list8.iterator();
                            while (it18.hasNext()) {
                                arrayList5.add(new CoauthorDto(((NewsfeedCoowners.CoownerStatus) it18.next()).b));
                            }
                            ArrayList arrayList6 = new ArrayList();
                            Iterator it19 = arrayList5.iterator();
                            while (it19.hasNext()) {
                                Object next = it19.next();
                                if (!epx.f(((CoauthorDto) next).b.b, userId)) {
                                    arrayList6.add(next);
                                }
                            }
                            arrayList = arrayList6;
                        } else {
                            arrayList = null;
                        }
                        ArrayList arrayList7 = new ArrayList(c5g.u(arrayList3, 10));
                        it4 = arrayList3.iterator();
                        while (it4.hasNext()) {
                            arrayList7.add(((EntryAttachment) it4.next()).b);
                        }
                        PhotoVideoAttachmentsCropData b3 = b(arrayList7);
                        if (arrayList3.isEmpty()) {
                            Iterator it20 = arrayList3.iterator();
                            i = 0;
                            while (it20.hasNext()) {
                                Attachment attachment13 = ((EntryAttachment) it20.next()).b;
                                if ((attachment13 instanceof DocumentAttachment) && !((DocumentAttachment) attachment13).x5() && (i = i + 1) < 0) {
                                    e43.s();
                                    throw null;
                                }
                            }
                        } else {
                            i = 0;
                        }
                        if (i <= 1) {
                            if (!arrayList3.isEmpty()) {
                                Iterator it21 = arrayList3.iterator();
                                while (it21.hasNext()) {
                                    if (((EntryAttachment) it21.next()).b instanceof AudioAttachment) {
                                        z3 = true;
                                        break;
                                    }
                                }
                            }
                            z3 = false;
                            if (!arrayList3.isEmpty()) {
                                Iterator it22 = arrayList3.iterator();
                                while (it22.hasNext()) {
                                    if (((EntryAttachment) it22.next()).b instanceof AudioPlaylistAttachment) {
                                        z4 = true;
                                        break;
                                    }
                                }
                            }
                            z4 = false;
                            if (!z3 || !z4) {
                                if (arrayList3.isEmpty()) {
                                    i2 = 0;
                                } else {
                                    Iterator it23 = arrayList3.iterator();
                                    i2 = 0;
                                    while (it23.hasNext()) {
                                        if ((((EntryAttachment) it23.next()).b instanceof AudioPlaylistAttachment) && (i2 = i2 + 1) < 0) {
                                            e43.s();
                                            throw null;
                                        }
                                    }
                                }
                                if (i2 <= 1) {
                                    z5 = false;
                                    if (!z5) {
                                        if (arrayList3.isEmpty()) {
                                            i3 = 0;
                                        } else {
                                            Iterator it24 = arrayList3.iterator();
                                            i3 = 0;
                                            while (it24.hasNext()) {
                                                if ((((EntryAttachment) it24.next()).b instanceof GeoAttachment) && (i3 = i3 + 1) < 0) {
                                                    e43.s();
                                                    throw null;
                                                }
                                            }
                                        }
                                        if (i3 <= 1) {
                                            Iterator it25 = arrayList3.iterator();
                                            while (true) {
                                                if (!it25.hasNext()) {
                                                    obj11 = null;
                                                    break;
                                                }
                                                obj11 = it25.next();
                                                if (((EntryAttachment) obj11).b instanceof MarketAttachment) {
                                                    break;
                                                }
                                            }
                                            if (obj11 == null) {
                                                Iterator it26 = arrayList3.iterator();
                                                while (true) {
                                                    if (!it26.hasNext()) {
                                                        obj12 = null;
                                                        break;
                                                    }
                                                    obj12 = it26.next();
                                                    if (((EntryAttachment) obj12).b instanceof MiniAppAttachment) {
                                                        break;
                                                    }
                                                }
                                                if (obj12 == null) {
                                                    Iterator it27 = arrayList3.iterator();
                                                    while (true) {
                                                        if (!it27.hasNext()) {
                                                            obj13 = null;
                                                            break;
                                                        }
                                                        obj13 = it27.next();
                                                        if (((EntryAttachment) obj13).b instanceof AlbumAttachment) {
                                                            break;
                                                        }
                                                    }
                                                    if (obj13 == null) {
                                                        Iterator it28 = arrayList3.iterator();
                                                        while (true) {
                                                            if (!it28.hasNext()) {
                                                                obj14 = null;
                                                                break;
                                                            }
                                                            obj14 = it28.next();
                                                            if (((EntryAttachment) obj14).b instanceof PodcastAttachment) {
                                                                break;
                                                            }
                                                        }
                                                        if (obj14 == null) {
                                                            Iterator it29 = arrayList3.iterator();
                                                            while (true) {
                                                                if (!it29.hasNext()) {
                                                                    obj15 = null;
                                                                    break;
                                                                }
                                                                Object next2 = it29.next();
                                                                if (((EntryAttachment) next2).b instanceof MarketAlbumAttachment) {
                                                                    obj15 = next2;
                                                                    break;
                                                                }
                                                            }
                                                            if (obj15 == null) {
                                                                z2 = false;
                                                                return new PostEditableData(i8, t3, invisible3, c2, postingPlaceDto2, postingArticleDto2, postingLinkDto2, privacyPostType3, b3, photoVideoDisplayMode, d2, a2, arrayList, date3, list7, additionalSettingsConfiguration3, null, z2, actionButton, null, false, new LinksParsingMetaData(e(t3), EmptyList.b, null, null, 12, null), date2, null, booleanValue, z7, cVar.f, null, 134217728, null);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            z5 = true;
                            if (!z5) {
                            }
                        }
                        z2 = true;
                        return new PostEditableData(i8, t3, invisible3, c2, postingPlaceDto2, postingArticleDto2, postingLinkDto2, privacyPostType3, b3, photoVideoDisplayMode, d2, a2, arrayList, date3, list7, additionalSettingsConfiguration3, null, z2, actionButton, null, false, new LinksParsingMetaData(e(t3), EmptyList.b, null, null, 12, null), date2, null, booleanValue, z7, cVar.f, null, 134217728, null);
                    }
                }
                date2 = null;
                if (flags.zb(1073741824L)) {
                }
                int i82 = post.n;
                PostingTextRestriction.Invisible invisible32 = PostingTextRestriction.Invisible.b;
                it2 = arrayList3.iterator();
                while (true) {
                    if (it2.hasNext()) {
                    }
                }
                EntryAttachment entryAttachment52 = (EntryAttachment) obj9;
                if (entryAttachment52 == null) {
                }
                if (!(attachment11 instanceof ArticleAttachment)) {
                }
                if (articleAttachment2 == null) {
                }
                it3 = arrayList3.iterator();
                while (true) {
                    if (it3.hasNext()) {
                    }
                }
                EntryAttachment entryAttachment62 = (EntryAttachment) obj10;
                if (entryAttachment62 == null) {
                }
                if (!(attachment12 instanceof SnippetAttachment)) {
                }
                if (snippetAttachment2 == null) {
                }
                MusicAttachDto d22 = d(context, arrayList4);
                newsfeedCoowners = post.f0;
                if (newsfeedCoowners == null) {
                }
                ArrayList arrayList72 = new ArrayList(c5g.u(arrayList3, 10));
                it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                }
                PhotoVideoAttachmentsCropData b32 = b(arrayList72);
                if (arrayList3.isEmpty()) {
                }
                if (i <= 1) {
                }
                z2 = true;
                return new PostEditableData(i82, t3, invisible32, c2, postingPlaceDto2, postingArticleDto2, postingLinkDto2, privacyPostType3, b32, photoVideoDisplayMode, d22, a2, arrayList, date3, list7, additionalSettingsConfiguration3, null, z2, actionButton, null, false, new LinksParsingMetaData(e(t3), EmptyList.b, null, null, 12, null), date2, null, booleanValue, z7, cVar.f, null, 134217728, null);
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x0284, code lost:
    
        if (r3 == null) goto L104;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v43, types: [com.vk.newsfeed.posting.impl.domain.model.ImageCropArea] */
    /* JADX WARN: Type inference failed for: r5v31, types: [com.vk.newsfeed.posting.impl.domain.model.ImageCropArea] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final PhotoVideoAttachmentsCropData b(ArrayList arrayList) {
        PostingPreviewRatio postingPreviewRatio;
        String str;
        Object obj;
        ImageSize k;
        Image image;
        int i;
        Object obj2;
        EmptyCropArea emptyCropArea;
        ImageCropData Gb;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            postingPreviewRatio = null;
            if (!it.hasNext()) {
                break;
            }
            Attachment attachment = (Attachment) it.next();
            if (attachment instanceof LocalPhotoAttachment) {
                LocalPhotoAttachment localPhotoAttachment = (LocalPhotoAttachment) attachment;
                postingPreviewRatio = new ImageCropArea(localPhotoAttachment.Hb(), localPhotoAttachment.getUri(), 0, 0, localPhotoAttachment.z, localPhotoAttachment.A, null, null, PsExtractor.AUDIO_STREAM, null);
            } else if ((attachment instanceof PhotoAttachment) && (Gb = ((PhotoAttachment) attachment).l.Gb()) != null) {
                postingPreviewRatio = new ImageCropArea(Gb.b(), null, Gb.d(), Gb.e(), Gb.c(), Gb.a(), null, new azw(true), 66, null);
            }
            if (postingPreviewRatio != null) {
                arrayList2.add(postingPreviewRatio);
            }
        }
        PostingPreviewRatio postingPreviewRatio2 = new PostingPreviewRatio(2, 3, false, false, 12, null);
        PostingPreviewRatio postingPreviewRatio3 = new PostingPreviewRatio(16, 9, false, false, 12, null);
        if (((ImageCropArea) j5g.a0(arrayList2)) != null) {
            float f = r1.f / r1.g;
            if (f >= w65.d(postingPreviewRatio2)) {
                if (f > w65.d(postingPreviewRatio3)) {
                    postingPreviewRatio2 = postingPreviewRatio3;
                } else {
                    Pair pair = new Pair(Integer.valueOf((int) 10000.0f), Integer.valueOf((int) ((100.0f / f) * 100.0f)));
                    postingPreviewRatio2 = new PostingPreviewRatio(((Number) pair.i()).intValue(), ((Number) pair.j()).intValue(), true, false, 8, null);
                }
            }
        } else {
            postingPreviewRatio2 = null;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Attachment attachment2 = (Attachment) it2.next();
            if (attachment2 instanceof PhotoAttachment) {
                PhotoAttachment photoAttachment = (PhotoAttachment) attachment2;
                if (photoAttachment.l.Gb() == null) {
                    emptyCropArea = new EmptyCropArea(photoAttachment.Hb(), Uri.EMPTY, postingPreviewRatio2 == null ? PostingPreviewRatio.f : postingPreviewRatio2);
                    if (emptyCropArea == null) {
                        arrayList3.add(emptyCropArea);
                    }
                }
            }
            emptyCropArea = null;
            if (emptyCropArea == null) {
            }
        }
        if (postingPreviewRatio2 == null) {
            PostingPreviewRatio postingPreviewRatio4 = new PostingPreviewRatio(2, 3, false, false, 12, null);
            PostingPreviewRatio postingPreviewRatio5 = new PostingPreviewRatio(16, 9, false, false, 12, null);
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it3.next();
                if (((Attachment) obj) instanceof PhotoAttachment) {
                    break;
                }
            }
            PhotoAttachment photoAttachment2 = obj instanceof PhotoAttachment ? (PhotoAttachment) obj : null;
            if (photoAttachment2 == null || (k = his0.k(photoAttachment2)) == null || (i = (image = k.d).c) == 0) {
                postingPreviewRatio2 = null;
            } else {
                float f2 = image.b / i;
                if (f2 >= w65.d(postingPreviewRatio4)) {
                    if (f2 > w65.d(postingPreviewRatio5)) {
                        postingPreviewRatio4 = postingPreviewRatio5;
                    } else {
                        Pair pair2 = new Pair(Integer.valueOf((int) 10000.0f), Integer.valueOf((int) ((100.0f / f2) * 100.0f)));
                        postingPreviewRatio4 = new PostingPreviewRatio(((Number) pair2.i()).intValue(), ((Number) pair2.j()).intValue(), true, false, 8, null);
                    }
                }
                postingPreviewRatio2 = postingPreviewRatio4;
            }
            if (postingPreviewRatio2 == null) {
                Iterator it4 = arrayList.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it4.next();
                    if (((Attachment) obj2) instanceof VideoAttachment) {
                        break;
                    }
                }
                VideoAttachment videoAttachment = obj2 instanceof VideoAttachment ? (VideoAttachment) obj2 : null;
                if (videoAttachment != null) {
                    PostingPreviewRatio postingPreviewRatio6 = new PostingPreviewRatio(2, 3, false, false, 12, null);
                    PostingPreviewRatio postingPreviewRatio7 = new PostingPreviewRatio(16, 9, false, false, 12, null);
                    VideoFile videoFile = videoAttachment.k;
                    float width = (videoFile.getWidth() <= 0 || videoFile.getHeight() <= 0) ? videoAttachment.getWidth() / videoAttachment.getHeight() : videoFile.getWidth() / videoFile.getHeight();
                    if (width < w65.d(postingPreviewRatio6)) {
                        postingPreviewRatio = postingPreviewRatio6;
                    } else if (width > w65.d(postingPreviewRatio7)) {
                        postingPreviewRatio = postingPreviewRatio7;
                    } else {
                        Pair pair3 = new Pair(Integer.valueOf((int) 10000.0f), Integer.valueOf((int) ((100.0f / width) * 100.0f)));
                        postingPreviewRatio = new PostingPreviewRatio(((Number) pair3.i()).intValue(), ((Number) pair3.j()).intValue(), true, false, 8, null);
                    }
                }
                postingPreviewRatio2 = postingPreviewRatio;
            }
        }
        PostingPreviewRatio postingPreviewRatio8 = postingPreviewRatio2 == null ? PostingPreviewRatio.f : postingPreviewRatio2;
        if (postingPreviewRatio2 != null) {
            if (postingPreviewRatio2.d) {
                str = "original";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(postingPreviewRatio2.b);
                sb.append('_');
                str = h5s.c(postingPreviewRatio2.c, "_auto", sb);
            }
        }
        str = "";
        return new PhotoVideoAttachmentsCropData(arrayList2, arrayList3, str, postingPreviewRatio8);
    }

    public static final PostingPollDto c(PollAttachment pollAttachment) {
        Poll poll = pollAttachment.f;
        int i = poll.b;
        UserId userId = poll.c;
        String str = poll.d;
        List<PollOption> list = poll.f;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (PollOption pollOption : list) {
            arrayList.add(new PollAnswerDto(pollOption.b, pollOption.c));
        }
        Poll poll2 = pollAttachment.f;
        boolean z = poll2.i;
        boolean z2 = poll2.g;
        boolean z3 = poll2.o;
        long j = poll2.k;
        return new PostingPollDto(i, userId, str, arrayList, z, z2, z3, j != 0, TimeUnit.SECONDS.toMillis(j), true, false, 1024, null);
    }

    public static final MusicAttachDto d(Context context, List<? extends Attachment> list) {
        List<? extends Attachment> list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (obj instanceof PendingAudioAttachmentWrapper) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            PendingAudioAttachmentWrapper pendingAudioAttachmentWrapper = (PendingAudioAttachmentWrapper) it.next();
            MusicDto b = jq4.b(pendingAudioAttachmentWrapper.g);
            MusicTrack musicTrack = pendingAudioAttachmentWrapper.f.f;
            arrayList2.add(MusicDto.a(b, false, null, new UploadDto.UploadState(null, musicTrack.i, musicTrack.b, 0, 0, AttachmentType.AUDIO, null, false, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, null), 12287));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list2) {
            if (obj2 instanceof AudioAttachment) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(jq4.b(((AudioAttachment) it2.next()).f));
        }
        ArrayList u0 = j5g.u0(arrayList2, arrayList4);
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : list2) {
            if (obj3 instanceof AudioPlaylistAttachment) {
                arrayList5.add(obj3);
            }
        }
        ArrayList arrayList6 = new ArrayList(c5g.u(arrayList5, 10));
        Iterator it3 = arrayList5.iterator();
        while (it3.hasNext()) {
            arrayList6.add(jq4.a(context, ((AudioPlaylistAttachment) it3.next()).f));
        }
        MusicDto musicDto = (MusicDto) j5g.a0(arrayList6);
        if (u0.size() == 1 && ((MusicDto) j5g.Y(u0)).l) {
            return new MusicAttachDto.MusicSnippetDto((MusicDto) j5g.Y(u0));
        }
        if (!u0.isEmpty()) {
            return new MusicAttachDto.MusicTracksDto(u0);
        }
        if (musicDto != null) {
            return new MusicAttachDto.MusicPlaylistDto(musicDto);
        }
        return null;
    }

    public static final List<String> e(String str) {
        qaz qazVar;
        String i;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        ArrayList arrayList = new ArrayList();
        xwk.d().a().q(spannableStringBuilder, new LinksParserData(1, (Bundle) null, 0, 0, (String) null, (String) null, 0, 0, (LinksParserData.HashtagService) null, (saz) null, 0, (taz) null, false, 8190), arrayList);
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String str2 = null;
            if (!(next instanceof r320) && !(next instanceof x7q) && (next instanceof qaz) && (i = (qazVar = (qaz) next).i()) != null && i.length() != 0) {
                str2 = qazVar.i();
            }
            arrayList2.add(str2);
        }
        return j5g.V(arrayList2);
    }
}
