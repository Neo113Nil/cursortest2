package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageButton;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageText;
import com.vk.newsfeed.posting.impl.domain.rules.RuleAttachment;
import com.vkontakte.android.R;

/* compiled from: RuleMessagesHelper.kt */
/* loaded from: classes4.dex */
public final class prg0 {

    /* compiled from: RuleMessagesHelper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RuleAttachment.values().length];
            try {
                iArr[RuleAttachment.Audio.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RuleAttachment.AudioPlaylist.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RuleAttachment.Market.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RuleAttachment.ActionButton.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RuleAttachment.Photo.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static PostingUserMessage.AlertDialog a(xmc0 xmc0Var, RuleAttachment ruleAttachment, RuleAttachment ruleAttachment2) {
        int[] iArr = a.$EnumSwitchMapping$0;
        int i = iArr[ruleAttachment2.ordinal()];
        if (i == 3) {
            if (iArr[ruleAttachment.ordinal()] == 4) {
                return new PostingUserMessage.AlertDialog(new PostingUserMessageText.ResText(R.string.delete_product_title), new PostingUserMessageText.ResText(R.string.delete_product_description), new PostingUserMessageButton(new PostingUserMessageText.ResText(R.string.delete), PostingAction.Editing.RemovePhotoTag.b, null, true, 4, null), new PostingUserMessageButton(new PostingUserMessageText.ResText(R.string.vk_bottomsheet_confirmation_cancel), null, null, false, 14, null), null, 16, null);
            }
            return null;
        }
        if (i != 5) {
            return null;
        }
        int i2 = iArr[ruleAttachment.ordinal()];
        if (i2 == 1) {
            return b(true, xmc0Var.c(RuleAttachment.Market));
        }
        if (i2 == 2) {
            return b(true, xmc0Var.c(RuleAttachment.Market));
        }
        if (i2 != 3) {
            return null;
        }
        return b(xmc0Var.c(RuleAttachment.Audio) || xmc0Var.c(RuleAttachment.AudioPlaylist), true);
    }

    public static PostingUserMessage.AlertDialog b(boolean z, boolean z2) {
        PostingUserMessageText.ResText resText;
        PostingAction postingAction;
        PostingUserMessageText.ResText resText2 = new PostingUserMessageText.ResText(R.string.delete_photo_title);
        if (z && z2) {
            resText = new PostingUserMessageText.ResText(R.string.delete_photo_market_and_audio_description);
        } else if (z) {
            resText = new PostingUserMessageText.ResText(R.string.delete_photo_audio_description);
        } else {
            if (!z2) {
                return null;
            }
            resText = new PostingUserMessageText.ResText(R.string.delete_photo_market_description);
        }
        PostingUserMessageText.ResText resText3 = resText;
        if (z && z2) {
            postingAction = com.vk.newsfeed.posting.impl.domain.model.d.a(PostingAction.Editing.Attach.RemoveMusic.b, PostingAction.Editing.RemovePhotoTag.b);
        } else if (z) {
            postingAction = PostingAction.Editing.Attach.RemoveMusic.b;
        } else {
            if (!z2) {
                return null;
            }
            postingAction = PostingAction.Editing.RemovePhotoTag.b;
        }
        return new PostingUserMessage.AlertDialog(resText2, resText3, new PostingUserMessageButton(new PostingUserMessageText.ResText(R.string.delete), postingAction, null, true, 4, null), new PostingUserMessageButton(new PostingUserMessageText.ResText(R.string.vk_bottomsheet_confirmation_cancel), null, null, false, 14, null), null, 16, null);
    }
}
