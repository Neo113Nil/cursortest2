package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.actionlinks.ActionLinkSnippet;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.clips.ClipLinkModerationStatus;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: UserLinksViewerRendererImpl.kt */
/* loaded from: classes16.dex */
public final class qkq0 implements pkq0 {
    public static final List<ClipLinkModerationStatus> a;
    public static final List<ClipLinkModerationStatus> b;

    /* compiled from: UserLinksViewerRendererImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipLinkModerationStatus.values().length];
            try {
                iArr[ClipLinkModerationStatus.PENDING_MODERATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipLinkModerationStatus.REJECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipLinkModerationStatus.APPROVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        ClipLinkModerationStatus clipLinkModerationStatus = ClipLinkModerationStatus.PENDING_MODERATION;
        ClipLinkModerationStatus clipLinkModerationStatus2 = ClipLinkModerationStatus.APPROVED;
        a = e43.l(clipLinkModerationStatus, clipLinkModerationStatus2);
        b = e43.l(clipLinkModerationStatus, ClipLinkModerationStatus.REJECTED, clipLinkModerationStatus2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SpannableStringBuilder c(Context context, String str, boolean z) {
        if (str == null) {
            com.vk.metrics.eventtracking.b.a.a(new IllegalArgumentException("buttonText should not be null if user link exists"));
            str = "";
        }
        Drawable d = uko.d(R.drawable.vk_icon_chain_outline_16, R.color.vk_white, context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        float f = z ? -1.0f : 0.6f;
        int a2 = iah0.a(16);
        int i = -iah0.a(1);
        context.getColor(R.color.vk_white);
        Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(" ");
        Drawable mutate = d.mutate();
        if (a2 <= 0 || a2 <= 0) {
            mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        } else {
            mutate.setBounds(0, 0, a2, a2);
        }
        newSpannable.setSpan(new tzx0(mutate, 3, f, true, i, 0, 0), 0, 1, 33);
        SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) newSpannable).append((CharSequence) rik0.b(7.0f));
        if (!z) {
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new ForegroundColorSpan(context.getColor(R.color.vk_white_alpha60)), 0, str.length(), 0);
            str = spannableString;
        }
        append.append((CharSequence) str);
        return spannableStringBuilder;
    }

    @Override // xsna.pkq0
    public final boolean a(VideoFile videoFile) {
        ClipLinkModerationStatus clipLinkModerationStatus;
        if ((videoFile != null ? videoFile.m1() : null) == null || !(videoFile instanceof ClipVideoFile) || videoFile == null || videoFile == null) {
            return false;
        }
        ClipVideoFile clipVideoFile = (ClipVideoFile) videoFile;
        ActionLink actionLink = clipVideoFile.Y;
        if (!"clips_user_link".equals(actionLink != null ? actionLink.c : null) || (clipLinkModerationStatus = clipVideoFile.K1) == ClipLinkModerationStatus.UNDEFINED) {
            return false;
        }
        VideoFileOld videoFileOld = (VideoFileOld) videoFile;
        if (videoFileOld.F) {
            ActionLink actionLink2 = videoFileOld.Y;
            if ("clips_user_link".equals(actionLink2 != null ? actionLink2.c : null)) {
                return b.contains(clipLinkModerationStatus);
            }
        }
        return a.contains(clipLinkModerationStatus);
    }

    @Override // xsna.pkq0
    public final CharSequence b(Context context, ActionLink actionLink, boolean z, ClipLinkModerationStatus clipLinkModerationStatus) {
        ActionLinkSnippet actionLinkSnippet;
        ActionLinkSnippet actionLinkSnippet2;
        String str = null;
        if (!z) {
            int i = a.$EnumSwitchMapping$0[clipLinkModerationStatus.ordinal()];
            if (i == 1) {
                return c(context, context.getString(R.string.clip_link_under_moderation), false);
            }
            if (i != 3) {
                return "";
            }
            if (actionLink != null && (actionLinkSnippet = actionLink.f) != null) {
                str = actionLinkSnippet.e;
            }
            return c(context, str, true);
        }
        int i2 = a.$EnumSwitchMapping$0[clipLinkModerationStatus.ordinal()];
        if (i2 == 1) {
            return c(context, context.getString(R.string.clip_link_under_moderation), false);
        }
        if (i2 == 2) {
            return c(context, context.getString(R.string.clip_link_rejected), false);
        }
        if (i2 != 3) {
            return "";
        }
        if (actionLink != null && (actionLinkSnippet2 = actionLink.f) != null) {
            str = actionLinkSnippet2.e;
        }
        return c(context, str, true);
    }
}
