package xsna;

import android.app.Activity;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.clips.CoOwnerItem;
import com.vk.profile.core.scheduled_clips.bottom_sheet.actions.CommunityScheduledClipsActionEnableState;
import com.vk.profile.core.scheduled_clips.bottom_sheet.actions.utils.DisabledClickException;
import com.vk.profile.core.scheduled_clips.bottom_sheet.options.CommunityScheduledClipsBottomSheetOptions;
import com.vk.profile.core.scheduled_clips.bottom_sheet.options.CommunityScheduledClipsBottomSheetSideEffectOptions;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: RemoveCommunityClip.kt */
/* loaded from: classes5.dex */
public final class swf0 extends g0i {
    public final xne b;

    /* compiled from: RemoveCommunityClip.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommunityScheduledClipsActionEnableState.values().length];
            try {
                iArr[CommunityScheduledClipsActionEnableState.Enabled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommunityScheduledClipsActionEnableState.Disabled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommunityScheduledClipsActionEnableState.EnableWithBlockedClickAction.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public swf0(d1i d1iVar, xne xneVar) {
        super(CommunityScheduledClipsBottomSheetOptions.REMOVE_CLIP_COMMUNITY.ordinal());
        this.b = xneVar;
    }

    @Override // xsna.g0i
    public final ModalActionSheetListItem a(Activity activity, j0i j0iVar) {
        int i;
        ModalActionSheetListItem.Appearance appearance;
        pkd f = g620.f();
        ClipVideoFile clipVideoFile = j0iVar.a;
        if (!f.c(clipVideoFile) || !this.b.b(clipVideoFile.b) || !bi90.d(j0iVar, true)) {
            return null;
        }
        CommunityScheduledClipsActionEnableState b = bi90.b(j0iVar);
        int[] iArr = a.$EnumSwitchMapping$0;
        int i2 = iArr[b.ordinal()];
        if (i2 == 1 || i2 == 2) {
            i = R.drawable.vk_icon_delete_outline_28;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.drawable.vk_icon_block_outline_28;
        }
        int i3 = i;
        int i4 = iArr[b.ordinal()];
        if (i4 == 1) {
            appearance = ModalActionSheetListItem.Appearance.Negative;
        } else if (i4 == 2) {
            appearance = ModalActionSheetListItem.Appearance.Disabled;
        } else {
            if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            appearance = ModalActionSheetListItem.Appearance.Negative;
        }
        return new ModalActionSheetListItem(this.a, appearance, activity.getString(R.string.clip_remove), null, null, i3, ModalActionSheetListItem.IconSize.Large, false, false, 24);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [T, androidx.appcompat.app.d] */
    @Override // xsna.g0i
    public final void b(Activity activity, j0i j0iVar, com.vk.profile.core.scheduled_clips.a aVar) {
        int i;
        ClipVideoFile clipVideoFile = j0iVar.a;
        if (bi90.b(j0iVar) == CommunityScheduledClipsActionEnableState.EnableWithBlockedClickAction) {
            CommunityScheduledClipsBottomSheetSideEffectOptions communityScheduledClipsBottomSheetSideEffectOptions = CommunityScheduledClipsBottomSheetSideEffectOptions.REMOVE_FROM_OWNER;
            int i2 = DisabledClickException.b;
        }
        List<CoOwnerItem> list = clipVideoFile.N1;
        if ((list instanceof Collection) && list.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((CoOwnerItem) it.next()).c == CoOwnerItem.StatusDto.APPROVED && (i = i + 1) < 0) {
                    e43.s();
                    throw null;
                }
            }
        }
        int i3 = i > 0 ? R.string.community_scheduled_clip_delete_with_coauthors_confirm : R.string.delete_clip_confirm;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = bfs0.c(bwt0.u(activity), Integer.valueOf(R.string.video_alert_title), i3, rdi.p(activity, new qwf0(ref$ObjectRef, 0)), new z2d0(this, activity, j0iVar, aVar));
    }
}
