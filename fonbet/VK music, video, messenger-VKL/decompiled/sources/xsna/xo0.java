package xsna;

import android.app.Activity;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetOptions;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsMoreMenuItem;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;
import com.vkontakte.android.R;
import xsna.wlc;

/* compiled from: AddToPlaylist.kt */
/* loaded from: classes17.dex */
public final class xo0 extends ckd {
    public final ile b;
    public final xlc c;

    public xo0(sua suaVar, ile ileVar, xlc xlcVar) {
        super(ClipsBottomSheetOptions.ADD_TO_PLAYLIST.ordinal());
        this.b = ileVar;
        this.c = xlcVar;
    }

    @Override // xsna.ckd
    public final yu20 a(Activity activity, ikd ikdVar) {
        if (!ci90.f(ikdVar)) {
            return null;
        }
        return new ModalActionSheetListItem(this.a, ModalActionSheetListItem.Appearance.Default, activity.getString(R.string.clips_add_to_playlist), null, null, R.drawable.vk_icon_list_add_outline_28, ModalActionSheetListItem.IconSize.Large, false, false, 24);
    }

    @Override // xsna.ckd
    public final void b(Activity activity, ikd ikdVar, nkd nkdVar) {
        this.c.a(activity, new wlc.a(k15.A(ikdVar.a), ikdVar.i));
        ile ileVar = this.b;
        if (ileVar != null) {
            ile.b(ikdVar.a, SchemeStat$TypeClipViewerItem.EventType.CLICK_MORE, MobileOfficialAppsClipsStat$ClipsMoreMenuItem.EventSubtype.ADD_TO_PLAYLIST, ileVar.a, null);
        }
    }
}
