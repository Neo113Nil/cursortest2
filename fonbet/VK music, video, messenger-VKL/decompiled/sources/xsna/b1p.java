package xsna;

import android.app.Activity;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.dto.common.ClipVideoFile;
import com.vk.profile.core.scheduled_clips.bottom_sheet.options.CommunityScheduledClipsBottomSheetSideEffectOptions;
import com.vkontakte.android.R;

/* compiled from: EditPublicationDate.kt */
/* loaded from: classes5.dex */
public final class b1p extends g0i {
    @Override // xsna.g0i
    public final ModalActionSheetListItem a(Activity activity, j0i j0iVar) {
        ClipVideoFile clipVideoFile = j0iVar.a;
        if (!clipVideoFile.F || !bi90.c(j0iVar) || clipVideoFile.r <= 0) {
            return null;
        }
        return new ModalActionSheetListItem(this.a, ModalActionSheetListItem.Appearance.Default, activity.getString(R.string.video_edit_publication_date), null, null, R.drawable.vk_icon_clock_outline_28, ModalActionSheetListItem.IconSize.Large, false, false, 24);
    }

    @Override // xsna.g0i
    public final void b(Activity activity, j0i j0iVar, com.vk.profile.core.scheduled_clips.a aVar) {
        aVar.a(CommunityScheduledClipsBottomSheetSideEffectOptions.EDIT_PUBLICATION_DATE);
    }
}
