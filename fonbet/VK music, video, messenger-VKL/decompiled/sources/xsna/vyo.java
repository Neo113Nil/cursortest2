package xsna;

import android.app.Activity;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.dto.common.ClipVideoFile;
import com.vk.profile.core.scheduled_clips.bottom_sheet.actions.CommunityScheduledClipsActionEnableState;
import com.vk.profile.core.scheduled_clips.bottom_sheet.actions.utils.DisabledClickException;
import com.vk.profile.core.scheduled_clips.bottom_sheet.options.CommunityScheduledClipsBottomSheetOptions;
import com.vk.profile.core.scheduled_clips.bottom_sheet.options.CommunityScheduledClipsBottomSheetSideEffectOptions;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: Edit.kt */
/* loaded from: classes5.dex */
public final class vyo extends g0i {
    public final xne b;
    public final wzs<ClipVideoFile, Activity, s3q0> c;

    /* compiled from: Edit.kt */
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

    /* JADX WARN: Multi-variable type inference failed */
    public vyo(d1i d1iVar, xne xneVar, wzs<? super ClipVideoFile, ? super Activity, s3q0> wzsVar) {
        super(CommunityScheduledClipsBottomSheetOptions.EDIT.ordinal());
        this.b = xneVar;
        this.c = wzsVar;
    }

    @Override // xsna.g0i
    public final ModalActionSheetListItem a(Activity activity, j0i j0iVar) {
        int i;
        ModalActionSheetListItem.Appearance appearance;
        ClipVideoFile clipVideoFile = j0iVar.a;
        if (!this.b.b(clipVideoFile.b)) {
            return null;
        }
        if ((!clipVideoFile.F && !bi90.a(j0iVar)) || !bi90.c(j0iVar)) {
            return null;
        }
        CommunityScheduledClipsActionEnableState communityScheduledClipsActionEnableState = clipVideoFile.F ? CommunityScheduledClipsActionEnableState.Enabled : bi90.a(j0iVar) ? CommunityScheduledClipsActionEnableState.EnableWithBlockedClickAction : CommunityScheduledClipsActionEnableState.Disabled;
        int[] iArr = a.$EnumSwitchMapping$0;
        int i2 = iArr[communityScheduledClipsActionEnableState.ordinal()];
        if (i2 == 1 || i2 == 2) {
            i = R.drawable.vk_icon_edit_outline_28;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.drawable.vk_icon_block_outline_28;
        }
        int i3 = i;
        int i4 = iArr[communityScheduledClipsActionEnableState.ordinal()];
        if (i4 == 1) {
            appearance = ModalActionSheetListItem.Appearance.Default;
        } else if (i4 == 2) {
            appearance = ModalActionSheetListItem.Appearance.Disabled;
        } else {
            if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            appearance = ModalActionSheetListItem.Appearance.Default;
        }
        return new ModalActionSheetListItem(this.a, appearance, activity.getString(R.string.video_edit), null, null, i3, ModalActionSheetListItem.IconSize.Large, false, false, 24);
    }

    @Override // xsna.g0i
    public final void b(Activity activity, j0i j0iVar, com.vk.profile.core.scheduled_clips.a aVar) {
        ClipVideoFile clipVideoFile = j0iVar.a;
        if ((clipVideoFile.F ? CommunityScheduledClipsActionEnableState.Enabled : bi90.a(j0iVar) ? CommunityScheduledClipsActionEnableState.EnableWithBlockedClickAction : CommunityScheduledClipsActionEnableState.Disabled) != CommunityScheduledClipsActionEnableState.EnableWithBlockedClickAction) {
            this.c.invoke(clipVideoFile, activity);
        } else {
            CommunityScheduledClipsBottomSheetSideEffectOptions communityScheduledClipsBottomSheetSideEffectOptions = CommunityScheduledClipsBottomSheetSideEffectOptions.REMOVE_FROM_OWNER;
            int i = DisabledClickException.b;
        }
    }
}
