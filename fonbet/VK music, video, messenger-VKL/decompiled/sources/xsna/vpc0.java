package xsna;

import android.content.Context;
import com.vk.dto.common.AttachmentType;
import com.vk.newsfeed.posting.api.model.PhotoVideoDisplayMode;
import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.domain.model.ImageCropArea;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerState;
import com.vk.newsfeed.posting.impl.domain.model.PhotoVideoAttachmentsCropData;
import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.domain.model.PostEditingReason;
import com.vk.newsfeed.posting.impl.domain.model.PostingHints;
import com.vk.newsfeed.posting.impl.domain.model.PostingPreviewRatio;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.model.PostingStep;
import com.vk.newsfeed.posting.impl.domain.model.RepostToStoryOnboarding;
import com.vk.newsfeed.posting.impl.domain.model.attachment.LocalVideoAttachment;
import com.vk.newsfeed.posting.impl.presentation.model.GroupWallPostingSettings;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import com.vk.newsfeed.posting.impl.presentation.model.ToolbarNavButtonType;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PostingViewStateMapper.kt */
/* loaded from: classes4.dex */
public final class vpc0 {
    public final Context a;
    public final evl0 b;
    public final kvz d;
    public final Object c = msy.a(LazyThreadSafetyMode.NONE, new yu60(this, 12));
    public final me50 e = new me50();

    /* compiled from: PostingViewStateMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MediaPickerState.SheetState.values().length];
            try {
                iArr[MediaPickerState.SheetState.Hidden.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaPickerState.SheetState.Collapsed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MediaPickerState.SheetState.Expanded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[RepostToStoryOnboarding.values().length];
            try {
                iArr2[RepostToStoryOnboarding.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[RepostToStoryOnboarding.TITLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[RepostToStoryOnboarding.SUBTITLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public vpc0(Context context, evl0 evl0Var) {
        this.a = context;
        this.b = evl0Var;
        this.d = new kvz(context);
    }

    public static jv5 a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new mlc0(((PostingStep) it.next()).b));
        }
        return new jv5(arrayList);
    }

    public static mdc0 b(PostingState postingState) {
        int i;
        if (!(postingState instanceof PostingState.Editing)) {
            return new mdc0(PhotoVideoDisplayMode.Carousel, false);
        }
        PostEditableData postEditableData = ((PostingState.Editing) postingState).i;
        List<PostingAttachment> list = postEditableData.p;
        if ((list instanceof Collection) && list.isEmpty()) {
            i = 0;
        } else {
            i = 0;
            for (PostingAttachment postingAttachment : list) {
                if (postingAttachment.getType() == AttachmentType.PHOTO || postingAttachment.getType() == AttachmentType.VIDEO) {
                    i++;
                    if (i < 0) {
                        e43.s();
                        throw null;
                    }
                }
            }
        }
        return new mdc0(postEditableData.k, i > 1);
    }

    public static vdc0 d(PostingState.Editing editing) {
        PhotoVideoAttachmentsCropData photoVideoAttachmentsCropData = editing.i.j;
        PostingPreviewRatio postingPreviewRatio = photoVideoAttachmentsCropData.e;
        List<ImageCropArea> d = com.vk.newsfeed.posting.impl.domain.model.c.d(photoVideoAttachmentsCropData, postingPreviewRatio);
        if (d.isEmpty()) {
            d = null;
        }
        return new vdc0(postingPreviewRatio, d, null, 12);
    }

    public final tdc0 c(PostingState postingState) {
        String string;
        boolean z;
        if (!(postingState instanceof PostingState.Editing)) {
            return new tdc0("", "", new ActionsAvailabilityState.Availability.NotAvailable(null), false, false, false, null, false);
        }
        PostingState.Editing editing = (PostingState.Editing) postingState;
        PostEditableData postEditableData = editing.j;
        PostEditableData postEditableData2 = editing.i;
        PostEditingReason postEditingReason = editing.h;
        boolean z2 = !postEditingReason.Ja() && (!(postEditingReason instanceof PostEditingReason.EditExistingPost) || ((postEditingReason instanceof PostEditingReason.EditExistingPost) && postEditableData.o != null)) && tuk0.a(postingState);
        boolean z3 = postEditingReason instanceof PostEditingReason.EditExistingPost;
        Context context = this.a;
        if (z3) {
            PostEditingReason.EditExistingPost editExistingPost = (PostEditingReason.EditExistingPost) postEditingReason;
            GroupWallPostingSettings groupWallPostingSettings = editing.d.h;
            boolean f = epx.f(groupWallPostingSettings != null ? Boolean.valueOf(groupWallPostingSettings.b) : null, Boolean.TRUE);
            boolean z4 = editExistingPost.b;
            boolean z5 = postEditableData2.o != null;
            string = (z4 && f) ? z5 ? context.getString(R.string.new_post_postpone_post_button_title) : context.getString(R.string.new_post_create_post_button_title) : (postEditableData.o == null || z5) ? context.getString(R.string.edit_post_create_post_button_title) : context.getString(R.string.new_post_create_post_button_title);
        } else if (postEditingReason instanceof PostEditingReason.EditRemoteDraft) {
            string = postEditableData2.o != null ? context.getString(R.string.new_post_postpone_post_button_title) : context.getString(R.string.new_post_create_post_button_title);
        } else {
            if (!(postEditingReason instanceof PostEditingReason.NewPost) && !(postEditingReason instanceof PostEditingReason.EditLocalDraft)) {
                throw new NoWhenBranchMatchedException();
            }
            string = postEditingReason.Ja() ? context.getString(R.string.new_post_suggest_post_button_title) : postEditableData2.o != null ? context.getString(R.string.new_post_postpone_post_button_title) : context.getString(R.string.new_post_create_post_button_title);
        }
        String string2 = context.getString(postEditingReason instanceof PostEditingReason.EditRemoteDraft ? R.string.new_post_draft_save_changes : R.string.new_post_save_draft);
        ActionsAvailabilityState.Availability availability = editing.l.g;
        List<PostingAttachment> list = postEditableData2.p;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((PostingAttachment) it.next()).nb() instanceof LocalVideoAttachment) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        boolean z6 = postEditableData2.o != null;
        PostingHints postingHints = editing.o;
        return new tdc0(string, string2, availability, z, z2, z6, postingHints.h, postingHints.i);
    }

    public final String e(PostEditingReason postEditingReason, boolean z, boolean z2) {
        int i;
        if ((postEditingReason instanceof PostEditingReason.NewPost) || (postEditingReason instanceof PostEditingReason.EditLocalDraft)) {
            i = z2 ? R.string.new_post_toolbar_title : R.string.new_post_publish_toolbar_title;
        } else if (postEditingReason instanceof PostEditingReason.EditRemoteDraft) {
            i = R.string.new_post_draft_title;
        } else {
            if (!(postEditingReason instanceof PostEditingReason.EditExistingPost)) {
                throw new NoWhenBranchMatchedException();
            }
            i = z2 ? R.string.edit_post_toolbar_title : (((PostEditingReason.EditExistingPost) postEditingReason).b && z) ? R.string.new_post_suggest_toolbar_title : R.string.new_post_settings_toolbar_title;
        }
        return this.a.getString(i);
    }

    public final dpc0 f(PostingState postingState) {
        GroupWallPostingSettings groupWallPostingSettings = postingState.x().h;
        boolean z = groupWallPostingSettings != null && groupWallPostingSettings.b;
        boolean z2 = edi.t(postingState.a9()).d;
        String e = e(postingState.J7(), z, z2);
        boolean z3 = postingState instanceof PostingState.Editing;
        return new dpc0(e, z2, !z3 ? new ActionsAvailabilityState.Availability.NotAvailable(null) : ((PostingState.Editing) postingState).l.b, postingState.a9().b.size() > 1 ? ToolbarNavButtonType.Back : ToolbarNavButtonType.Close, z3 ? ((PostingState.Editing) postingState).o.b : null, z3 ? ((PostingState.Editing) postingState).n : false, postingState.getContext().n);
    }
}
