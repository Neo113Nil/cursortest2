package xsna;

import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.posting.domain.PostingMetricsCreationEntryPoint;

/* compiled from: PostingMetricsCreationEntryPointMapper.kt */
/* loaded from: classes4.dex */
public final class hhc0 {

    /* compiled from: PostingMetricsCreationEntryPointMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PostingCreationEntryPoint.values().length];
            try {
                iArr[PostingCreationEntryPoint.FeedPlus.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostingCreationEntryPoint.GroupWallButton.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PostingCreationEntryPoint.ProfilePlusButton.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PostingCreationEntryPoint.ProfileWallButton.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PostingCreationEntryPoint.ChannelWriteBarButton.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PostingCreationEntryPoint.PostThreeDotMenuEditItem.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PostingCreationEntryPoint.FeedEditDraft.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PostingCreationEntryPoint.FeedEditDraftThreeDots.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PostingCreationEntryPoint.FeedDeleteDraft.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[PostingCreationEntryPoint.FeedDeleteDraftThreeDots.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[PostingCreationEntryPoint.ListEditDraft.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[PostingCreationEntryPoint.ListEditDraftThreeDots.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[PostingCreationEntryPoint.CommunityCreationOnboardingBlock.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static PostingMetricsCreationEntryPoint a(PostingCreationEntryPoint postingCreationEntryPoint) {
        switch (a.$EnumSwitchMapping$0[postingCreationEntryPoint.ordinal()]) {
            case 1:
                return PostingMetricsCreationEntryPoint.FeedPlus;
            case 2:
                return PostingMetricsCreationEntryPoint.GroupWallButton;
            case 3:
                return PostingMetricsCreationEntryPoint.ProfilePlusButton;
            case 4:
                return PostingMetricsCreationEntryPoint.ProfileWallButton;
            case 5:
                return PostingMetricsCreationEntryPoint.ChannelWriteBarButton;
            case 6:
                return PostingMetricsCreationEntryPoint.PostThreeDotMenuEditItem;
            case 7:
                return PostingMetricsCreationEntryPoint.FeedEditDraft;
            case 8:
                return PostingMetricsCreationEntryPoint.FeedEditDraftThreeDots;
            case 9:
                return PostingMetricsCreationEntryPoint.FeedDeleteDraft;
            case 10:
                return PostingMetricsCreationEntryPoint.FeedDeleteDraftThreeDots;
            case 11:
                return PostingMetricsCreationEntryPoint.ListEditDraft;
            case 12:
                return PostingMetricsCreationEntryPoint.ListEditDraftThreeDots;
            case 13:
                return PostingMetricsCreationEntryPoint.CommunityCreationOnboarding;
            default:
                return PostingMetricsCreationEntryPoint.Other;
        }
    }
}
