package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.domain.model.PostingNavigationState;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.model.PostingStepScreen;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageIcon;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageText;
import com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto;
import com.vk.newsfeed.posting.impl.presentation.model.PhotoDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import com.vk.newsfeed.posting.impl.presentation.model.VideoDto;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import xsna.fmc0;

/* compiled from: AttachPickersStatePostProcessor.kt */
/* loaded from: classes4.dex */
public final class d34 implements ouk0 {
    public final wj50<fmc0> a;
    public final HashMap<fmc0, Long> b = new HashMap<>();
    public boolean c;
    public PostingStepScreen d;

    public d34(f4z f4zVar) {
        this.a = f4zVar;
    }

    @Override // xsna.ouk0
    public final PostingState a(PostingState postingState) {
        boolean z;
        Object obj;
        if (!(postingState instanceof PostingState.Editing)) {
            return postingState;
        }
        PostingState.Editing editing = (PostingState.Editing) postingState;
        PostingNavigationState postingNavigationState = editing.g;
        PostEditableData postEditableData = editing.i;
        boolean z2 = edi.t(postingNavigationState).b instanceof PostingStepScreen.AttachmentPickers;
        if (!(this.d instanceof PostingStepScreen.AttachmentPickers)) {
            this.c = false;
        }
        if (z2) {
            String str = postEditableData.c;
            List<PostingAttachment> list = postEditableData.p;
            boolean N = drm0.N(str);
            List<PostingAttachment> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (PostingAttachment postingAttachment : list2) {
                    if ((postingAttachment instanceof VideoDto) || (postingAttachment instanceof PhotoDto)) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            boolean z3 = postEditableData.h != null;
            boolean z4 = postEditableData.g != null;
            wj50<fmc0> wj50Var = this.a;
            if (N && !z && !z3 && !z4) {
                b(wj50Var, fmc0.j.b.a);
                b(wj50Var, new fmc0.p(new PostingUserMessage.Snackbar(new PostingUserMessageIcon(R.drawable.vk_icon_error_outline_28, R.attr.vk_ui_icon_negative), new PostingUserMessageText.ResText(R.string.next_step_error), null, 4, null)));
            }
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                PostingAttachment postingAttachment2 = (PostingAttachment) obj;
                if (postingAttachment2 instanceof PhotoDto ? ((PhotoDto) postingAttachment2).f.b instanceof UploadDto.UploadStep.Failed : postingAttachment2 instanceof VideoDto ? ((VideoDto) postingAttachment2).f.b instanceof UploadDto.UploadStep.Failed : false) {
                    break;
                }
            }
            PostingAttachment postingAttachment3 = (PostingAttachment) obj;
            if (postingAttachment3 != null) {
                b(wj50Var, new fmc0.u.a(postingAttachment3));
                PostingUserMessage.Snackbar snackbar = new PostingUserMessage.Snackbar(new PostingUserMessageIcon(R.drawable.vk_icon_error_outline_28, R.attr.vk_ui_icon_negative), new PostingUserMessageText.ResText(R.string.attachment_some_uploading_failed), null, 4, null);
                if (!this.c) {
                    this.c = b(wj50Var, new fmc0.p(snackbar));
                }
            }
        }
        this.d = edi.t(postingNavigationState).b;
        return postingState;
    }

    public final boolean b(wj50<fmc0> wj50Var, fmc0 fmc0Var) {
        long currentTimeMillis = System.currentTimeMillis();
        HashMap<fmc0, Long> hashMap = this.b;
        Long l = hashMap.get(fmc0Var);
        if ((l != null ? l.longValue() : 0L) + 500 > currentTimeMillis) {
            return false;
        }
        wj50Var.b(fmc0Var);
        hashMap.put(fmc0Var, Long.valueOf(currentTimeMillis));
        return true;
    }
}
