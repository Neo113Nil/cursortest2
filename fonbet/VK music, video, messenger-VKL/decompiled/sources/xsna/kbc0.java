package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.wall.dto.WallActionButtonTypeDto;
import com.vk.api.generated.wall.dto.WallActionButtonVkTicketDto;
import com.vk.api.generated.wall.dto.WallActionButtonVkTicketSeanceDto;
import com.vk.api.generated.wall.dto.WallAttachmentsActionButtonDto;
import com.vk.newsfeed.posting.api.analytics.PostingAttachmentInfo;
import com.vk.newsfeed.posting.api.analytics.PostingMetricEntryPoint;
import com.vk.newsfeed.posting.crop_editor.domain.model.ImageLink;
import com.vk.newsfeed.posting.impl.domain.model.ImageCropArea;
import com.vk.newsfeed.posting.impl.domain.model.LocalMediaEntry;
import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;
import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$AttachmentInfo;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$PhotoAdditionalInfo;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$PhotoSizes;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$TypePostingItem;

/* compiled from: PostingAnalyticsAttachmentUtils.kt */
/* loaded from: classes4.dex */
public final class kbc0 {

    /* compiled from: PostingAnalyticsAttachmentUtils.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PostingMetricEntryPoint.values().length];
            try {
                iArr[PostingMetricEntryPoint.FeedPlus.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostingMetricEntryPoint.GroupWallButton.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PostingMetricEntryPoint.ProfilePlusButton.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PostingMetricEntryPoint.ProfileWallButton.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PostingMetricEntryPoint.ChannelWriteBarButton.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PostingMetricEntryPoint.PostThreeDotMenuEditItem.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PostingMetricEntryPoint.PrepareSuggestedPostButton.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PostingMetricEntryPoint.ProfilePostponedPosts.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PostingMetricEntryPoint.ProfilePostponedPostsThreePoints.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[PostingMetricEntryPoint.GroupPostponedPosts.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[PostingMetricEntryPoint.GroupPostponedPostsThreePoints.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[PostingMetricEntryPoint.FeedEditDraft.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[PostingMetricEntryPoint.FeedEditDraftThreeDots.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[PostingMetricEntryPoint.FeedDeleteDraft.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[PostingMetricEntryPoint.FeedDeleteDraftThreeDots.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[PostingMetricEntryPoint.ListEditDraft.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[PostingMetricEntryPoint.ListEditDraftThreeDots.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[PostingMetricEntryPoint.ListDeleteDraftThreeDots.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[PostingMetricEntryPoint.CommunityCreationOnboardingBlock.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[WallActionButtonTypeDto.values().length];
            try {
                iArr2[WallActionButtonTypeDto.MESSAGE_TO_COMMUNITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[WallActionButtonTypeDto.MESSAGE_TO_CHANNEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[WallActionButtonTypeDto.OPEN_MARKET.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[WallActionButtonTypeDto.ONLINE_BOOKING.ordinal()] = 4;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[WallActionButtonTypeDto.DONUT_LEVEL.ordinal()] = 5;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[WallActionButtonTypeDto.DONUT_LEVELS.ordinal()] = 6;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[WallActionButtonTypeDto.DONUT_GOAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[WallActionButtonTypeDto.VK_TICKET.ordinal()] = 8;
            } catch (NoSuchFieldError unused27) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final aik a(ImageLink imageLink, ImageCropArea imageCropArea, ImageCropArea imageCropArea2) {
        int i = imageCropArea != null ? imageCropArea.d : 0;
        int i2 = imageCropArea != null ? imageCropArea.e : 0;
        float g = imageCropArea != null ? jcr.g(imageLink, imageCropArea) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int width = imageCropArea != null ? imageCropArea.f : imageLink.getWidth();
        int height = imageCropArea != null ? imageCropArea.g : imageLink.getHeight();
        float f = (width / 2.0f) + i;
        float f2 = (height / 2.0f) + i2;
        int i3 = imageCropArea2 != null ? imageCropArea2.d : 0;
        int i4 = imageCropArea2 != null ? imageCropArea2.e : 0;
        float g2 = jcr.g(imageLink, imageCropArea2);
        int width2 = imageCropArea2 != null ? imageCropArea2.f : imageLink.getWidth();
        int height2 = imageCropArea2 != null ? imageCropArea2.g : imageLink.getHeight();
        boolean z = Math.abs(f - ((((float) width2) / 2.0f) + ((float) i3))) > 2.0f || Math.abs(f2 - ((((float) height2) / 2.0f) + ((float) i4))) > 2.0f;
        boolean z2 = ((imageCropArea == null) ^ (imageCropArea2 == null)) || Math.abs(g - g2) > 0.04f;
        StringBuilder sb = new StringBuilder();
        sb.append(width);
        sb.append(',');
        sb.append(height);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(width2);
        sb3.append(',');
        sb3.append(height2);
        return new aik(sb2, sb3.toString(), z, z2);
    }

    public static final MobileOfficialAppsConPostingStat$AttachmentInfo b(PostingAttachmentInfo postingAttachmentInfo, MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType attachmentType) {
        return new MobileOfficialAppsConPostingStat$AttachmentInfo(attachmentType, postingAttachmentInfo.b, postingAttachmentInfo.c, postingAttachmentInfo.d);
    }

    public static final MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint c(PostingMetricEntryPoint postingMetricEntryPoint) {
        switch (a.$EnumSwitchMapping$0[postingMetricEntryPoint.ordinal()]) {
            case 1:
                return MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint.FEED_PLUS_BUTTON;
            case 2:
                return MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint.GROUP_WALL_BUTTON;
            case 3:
                return MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint.PROFILE_PLUS_BUTTON;
            case 4:
                return MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint.PROFILE_WALL_BUTTON;
            case 5:
                return MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint.CHANNEL_WRITE_BAR_BUTTON;
            case 6:
                return MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint.POST_THREE_DOT_MENU_EDIT_ITEM;
            case 7:
                return MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint.GROUP_PREPARE_SUGGESTED_POST_BUTTON;
            case 8:
                return MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint.PROFILE_POSTPONED_POSTS;
            case 9:
                return MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint.PROFILE_POSTPONED_POSTS_THREE_POINTS;
            case 10:
                return MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint.GROUP_POSTPONED_POSTS;
            case 11:
                return MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint.GROUP_POSTPONED_POSTS_THREE_POINTS;
            case 12:
                return MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint.FEED_EDIT_DRAFT;
            case 13:
                return MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint.FEED_EDIT_DRAFT_THREE_DOTS;
            case 14:
                return MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint.FEED_DELETE_DRAFT;
            case 15:
                return MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint.FEED_DELETE_DRAFT_THREE_DOTS;
            case 16:
                return MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint.LIST_EDIT_DRAFT;
            case 17:
                return MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint.LIST_EDIT_DRAFT_THREE_DOTS;
            case 18:
                return MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint.LIST_DELETE_DRAFT_THREE_DOTS;
            case 19:
                return MobileOfficialAppsConPostingStat$TypePostingItem.CreationEntryPoint.COMMUNITY_CREATION_ONBOARDING_BLOCK;
            default:
                return null;
        }
    }

    public static final MobileOfficialAppsConPostingStat$PhotoAdditionalInfo d(o5a0 o5a0Var) {
        String str = o5a0Var.e;
        String str2 = o5a0Var.f;
        return new MobileOfficialAppsConPostingStat$PhotoAdditionalInfo(new MobileOfficialAppsConPostingStat$PhotoSizes(str, str2 == null ? "" : str2), (str2 == null || epx.f(str2, str)) ? MobileOfficialAppsConPostingStat$PhotoAdditionalInfo.PhotoType.STANDART : MobileOfficialAppsConPostingStat$PhotoAdditionalInfo.PhotoType.NON_STANDART);
    }

    public static final PostingAttachmentInfo e(LocalMediaEntry.Image image, long j) {
        return new PostingAttachmentInfo(j, image.b.j, null, null, null, 28, null);
    }

    public static final PostingAttachmentInfo f(LocalMediaEntry.Video video, long j) {
        return new PostingAttachmentInfo(j, video.b.j, null, null, null, 28, null);
    }

    public static final PostingAttachmentInfo g(ActionButton actionButton, long j) {
        String str;
        WallActionButtonVkTicketDto wallActionButtonVkTicketDto;
        WallActionButtonVkTicketSeanceDto d;
        WallActionButtonVkTicketDto wallActionButtonVkTicketDto2;
        WallAttachmentsActionButtonDto wallAttachmentsActionButtonDto;
        WallActionButtonTypeDto f;
        WallAttachmentsActionButtonDto wallAttachmentsActionButtonDto2;
        String str2 = null;
        WallActionButtonTypeDto f2 = (actionButton == null || (wallAttachmentsActionButtonDto2 = actionButton.b) == null) ? null : wallAttachmentsActionButtonDto2.f();
        switch (f2 == null ? -1 : a.$EnumSwitchMapping$1[f2.ordinal()]) {
            case 1:
                str = "message_to_community";
                break;
            case 2:
                str = "message_to_channel";
                break;
            case 3:
                str = "open_all_products";
                break;
            case 4:
                str = "yclients_registration";
                break;
            case 5:
                str = "donut_level";
                break;
            case 6:
                str = "donut_levels";
                break;
            case 7:
                str = "donut_goal";
                break;
            case 8:
                str = "vk_ticket";
                break;
            default:
                if (actionButton == null || (wallAttachmentsActionButtonDto = actionButton.b) == null || (f = wallAttachmentsActionButtonDto.f()) == null || (str = f.toString()) == null) {
                    str = "";
                    break;
                }
                break;
        }
        String str3 = str;
        String id = (actionButton == null || (wallActionButtonVkTicketDto2 = actionButton.c) == null) ? null : wallActionButtonVkTicketDto2.getId();
        if (actionButton != null && (wallActionButtonVkTicketDto = actionButton.c) != null && (d = wallActionButtonVkTicketDto.d()) != null) {
            str2 = d.getId();
        }
        return new PostingAttachmentInfo(j, 0L, str3, id, str2);
    }

    public static final PostingAttachmentInfo h(MusicDto musicDto) {
        return new PostingAttachmentInfo(musicDto.c.b, musicDto.d, musicDto.l ? "snippet" : musicDto.k ? "playlist" : "audio", null, null, 24, null);
    }
}
