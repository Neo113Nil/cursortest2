package xsna;

import android.view.View;
import com.vk.feed.tool.view.posting.preview.attachment.PreviewAttachmentWrapper;
import com.vk.newsfeed.posting.impl.presentation.base.view.steps.step1.views.RemoveButtonType;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.tlo0;

/* compiled from: RemoveButtonHelper.kt */
/* loaded from: classes4.dex */
public final class mwf0 {
    public final PreviewAttachmentWrapper a;

    /* compiled from: RemoveButtonHelper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RemoveButtonType.values().length];
            try {
                iArr[RemoveButtonType.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RemoveButtonType.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RemoveButtonType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        int i = PreviewAttachmentWrapper.g;
    }

    public mwf0(PreviewAttachmentWrapper previewAttachmentWrapper, View.OnClickListener onClickListener, RemoveButtonType removeButtonType) {
        String string;
        this.a = previewAttachmentWrapper;
        int i = a.$EnumSwitchMapping$0[removeButtonType.ordinal()];
        if (i == 1) {
            string = previewAttachmentWrapper.getContext().getString(R.string.post_attachment_remove_photo_content_description);
        } else if (i == 2) {
            string = previewAttachmentWrapper.getContext().getString(R.string.post_attachment_remove_video_content_description);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            string = previewAttachmentWrapper.getContext().getString(R.string.delete);
        }
        tlo0.Companion.getClass();
        previewAttachmentWrapper.setIconContentDescription(new tlo0.h(string));
        previewAttachmentWrapper.setOnRemoveIconClickListener(onClickListener);
    }

    public final void a(boolean z) {
        this.a.setRemoveIconVisible(z);
    }

    public /* synthetic */ mwf0(PreviewAttachmentWrapper previewAttachmentWrapper, View.OnClickListener onClickListener) {
        this(previewAttachmentWrapper, onClickListener, RemoveButtonType.UNKNOWN);
    }
}
