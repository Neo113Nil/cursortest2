package xsna;

import android.app.Activity;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetOptions;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vkontakte.android.R;
import xsna.wlc;

/* compiled from: EditPlaylist.kt */
/* loaded from: classes17.dex */
public final class b0p extends ckd {
    public final xlc b;

    public b0p(sua suaVar, xlc xlcVar) {
        super(ClipsBottomSheetOptions.EDIT_PLAYLIST.ordinal());
        this.b = xlcVar;
    }

    @Override // xsna.ckd
    public final yu20 a(Activity activity, ikd ikdVar) {
        if (!ci90.k(ikdVar)) {
            return null;
        }
        return new ModalActionSheetListItem(this.a, ModalActionSheetListItem.Appearance.Default, activity.getString(R.string.clips_edit_playlist), null, null, R.drawable.vk_icon_list_play_outline_28, ModalActionSheetListItem.IconSize.Large, false, false, 24);
    }

    @Override // xsna.ckd
    public final void b(Activity activity, ikd ikdVar, nkd nkdVar) {
        this.b.e(activity, new wlc.c(k15.A(ikdVar.a), true));
    }
}
