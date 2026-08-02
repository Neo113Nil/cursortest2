package xsna;

import android.app.Activity;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.dto.common.ClipVideoFile;
import com.vk.profile.core.scheduled_clips.bottom_sheet.options.CommunityScheduledClipsBottomSheetOptions;
import com.vkontakte.android.R;

/* compiled from: PublishNow.kt */
/* loaded from: classes5.dex */
public final class dee0 extends g0i {
    public final e1i b;
    public final wx4 c;

    public dee0(e1i e1iVar, wx4 wx4Var) {
        super(CommunityScheduledClipsBottomSheetOptions.PUBLISH_NOW.ordinal());
        this.b = e1iVar;
        this.c = wx4Var;
    }

    @Override // xsna.g0i
    public final ModalActionSheetListItem a(Activity activity, j0i j0iVar) {
        ClipVideoFile clipVideoFile = j0iVar.a;
        if (!clipVideoFile.F || !bi90.c(j0iVar) || clipVideoFile.r <= 0) {
            return null;
        }
        return new ModalActionSheetListItem(this.a, ModalActionSheetListItem.Appearance.Default, activity.getString(R.string.video_publish_now), null, null, R.drawable.vk_icon_arrow_up_circle_outline_28, ModalActionSheetListItem.IconSize.Large, false, false, 24);
    }

    @Override // xsna.g0i
    public final void b(Activity activity, j0i j0iVar, com.vk.profile.core.scheduled_clips.a aVar) {
        ClipVideoFile clipVideoFile = j0iVar.a;
        by20 by20Var = new by20(this, 22);
        pp00 pp00Var = new pp00(this, 29);
        this.b.getClass();
        e1i.a(clipVideoFile, 0, by20Var, pp00Var);
    }
}
