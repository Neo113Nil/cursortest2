package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.clips.design.view.nps.internal.stars.FeedbackResult;
import com.vk.clips.tool.view.nps.internal.moreless.MoreLessFeedbackView;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ViewValuesMapper.kt */
/* loaded from: classes16.dex */
public final class j2u0 {

    /* compiled from: ViewValuesMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[FeedbackResult.values().length];
            try {
                iArr[FeedbackResult.STAR_1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FeedbackResult.STAR_2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FeedbackResult.STAR_3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FeedbackResult.STAR_4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FeedbackResult.STAR_5.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MoreLessFeedbackView.FeedbackResult.values().length];
            try {
                iArr2[MoreLessFeedbackView.FeedbackResult.MORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[MoreLessFeedbackView.FeedbackResult.LESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static String a(FeedbackResult feedbackResult) {
        int i = a.$EnumSwitchMapping$0[feedbackResult.ordinal()];
        if (i == 1) {
            return "1";
        }
        if (i == 2) {
            return "2";
        }
        if (i == 3) {
            return "3";
        }
        if (i == 4) {
            return "4";
        }
        if (i == 5) {
            return CampaignEx.CLICKMODE_ON;
        }
        throw new NoWhenBranchMatchedException();
    }
}
