package xsna;

import com.vk.ecomm.reviews.api.model.ReviewsActionType;
import com.vk.ecomm.reviews.impl.dialogs.actionsmenu.ActionItemIconAppearance;
import com.vk.ecomm.reviews.impl.dialogs.actionsmenu.ActionItemTextAppearance;
import com.vk.ecomm.reviews.impl.replies.presentation.actionbuilder.ReplyAction;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ReviewsActionTypeToActionItemMapper.kt */
/* loaded from: classes18.dex */
public final class cig0 {

    /* compiled from: ReviewsActionTypeToActionItemMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ReviewsActionType.values().length];
            try {
                iArr[ReviewsActionType.ACTION_COPY_TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReviewsActionType.ACTION_REPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReviewsActionType.ACTION_EDIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReviewsActionType.ACTION_DELETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ReviewsActionType.ACTION_LIKE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ReviewsActionType.ACTION_UNLIKE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ReviewsActionType.ACTION_REPLY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ReviewsActionType.ACTION_PIN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ReviewsActionType.ACTION_UNPIN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ReplyAction.values().length];
            try {
                iArr2[ReplyAction.REPLY_ACTION_REPLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[ReplyAction.REPLY_ACTION_COPY_TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[ReplyAction.REPLY_ACTION_DELETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[ReplyAction.REPLY_ACTION_EDIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final t10 a(u60 u60Var) {
        Integer valueOf = Integer.valueOf(R.drawable.vk_icon_copy_outline_28);
        Integer valueOf2 = Integer.valueOf(R.drawable.vk_icon_delete_outline_28);
        Integer valueOf3 = Integer.valueOf(R.drawable.vk_icon_reply_outline_28);
        if (u60Var instanceof ReviewsActionType) {
            ReviewsActionType reviewsActionType = (ReviewsActionType) u60Var;
            Integer valueOf4 = Integer.valueOf(R.drawable.vk_icon_like_outline_28);
            switch (a.$EnumSwitchMapping$0[reviewsActionType.ordinal()]) {
                case 1:
                    return new t10(reviewsActionType, valueOf, R.string.reviews_copy, (ActionItemTextAppearance) null, (ActionItemIconAppearance) null, 56);
                case 2:
                    return new t10(reviewsActionType, Integer.valueOf(R.drawable.vk_icon_report_outline_28), R.string.reviews_complain, (ActionItemTextAppearance) null, (ActionItemIconAppearance) null, 56);
                case 3:
                    return new t10(reviewsActionType, Integer.valueOf(R.drawable.vk_icon_write_outline_28), R.string.reviews_edit, (ActionItemTextAppearance) null, (ActionItemIconAppearance) null, 56);
                case 4:
                    return new t10(reviewsActionType, valueOf2, R.string.reviews_delete, ActionItemTextAppearance.Primary, ActionItemIconAppearance.Negative, 32);
                case 5:
                    return new t10(reviewsActionType, valueOf4, R.string.reviews_like, (ActionItemTextAppearance) null, (ActionItemIconAppearance) null, 56);
                case 6:
                    return new t10(reviewsActionType, valueOf4, R.string.reviews_unlike, (ActionItemTextAppearance) null, (ActionItemIconAppearance) null, 56);
                case 7:
                    return new t10(reviewsActionType, valueOf3, R.string.answer_button_text, (ActionItemTextAppearance) null, (ActionItemIconAppearance) null, 56);
                case 8:
                    return new t10(reviewsActionType, Integer.valueOf(R.drawable.vk_icon_pin_outline_28), R.string.pin_review_action, (ActionItemTextAppearance) null, (ActionItemIconAppearance) null, 56);
                case 9:
                    return new t10(reviewsActionType, Integer.valueOf(R.drawable.vk_icon_unpin_outline_28), R.string.unpin_review_action, (ActionItemTextAppearance) null, (ActionItemIconAppearance) null, 56);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (!(u60Var instanceof ReplyAction)) {
            return null;
        }
        ReplyAction replyAction = (ReplyAction) u60Var;
        int i = a.$EnumSwitchMapping$1[replyAction.ordinal()];
        if (i == 1) {
            return new t10(replyAction, valueOf3, R.string.answer_button_text, (ActionItemTextAppearance) null, (ActionItemIconAppearance) null, 56);
        }
        if (i == 2) {
            return new t10(replyAction, valueOf, R.string.copy_text, (ActionItemTextAppearance) null, (ActionItemIconAppearance) null, 56);
        }
        if (i == 3) {
            return new t10(replyAction, valueOf2, R.string.delete_reply_action, (ActionItemTextAppearance) null, ActionItemIconAppearance.Negative, 40);
        }
        if (i == 4) {
            return new t10(replyAction, Integer.valueOf(R.drawable.vk_icon_pen_outline_24), R.string.edit_reply_action, (ActionItemTextAppearance) null, (ActionItemIconAppearance) null, 56);
        }
        throw new NoWhenBranchMatchedException();
    }
}
