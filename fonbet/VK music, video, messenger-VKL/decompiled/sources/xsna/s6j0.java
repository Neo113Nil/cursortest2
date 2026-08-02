package xsna;

import android.app.Activity;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vkontakte.android.R;
import xsna.g8d;

/* compiled from: Share.kt */
/* loaded from: classes17.dex */
public final class s6j0 extends ckd {
    @Override // xsna.ckd
    public final yu20 a(Activity activity, ikd ikdVar) {
        g8d.a aVar = ikdVar.f;
        if (aVar == null || !aVar.a()) {
            return null;
        }
        boolean m = ci90.m(ikdVar);
        SdkVideoFile sdkVideoFile = ikdVar.a;
        if (!m || !ci90.h(ikdVar) || sdkVideoFile.k1() != 0 || sdkVideoFile.Q0()) {
            return null;
        }
        return new ModalActionSheetListItem(this.a, ModalActionSheetListItem.Appearance.Default, activity.getString(R.string.clips_more_menu_share_title), null, null, R.drawable.vk_icon_share_outline_28, ModalActionSheetListItem.IconSize.Large, false, false, 24);
    }

    @Override // xsna.ckd
    public final void b(Activity activity, ikd ikdVar, nkd nkdVar) {
        w1s0.k(xa4.L(activity), k15.A(ikdVar.a), dhr0.a.c(activity));
    }
}
