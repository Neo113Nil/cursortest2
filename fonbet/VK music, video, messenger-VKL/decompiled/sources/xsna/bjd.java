package xsna;

import android.app.Activity;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetOptions;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetSideEffectOptions;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vkontakte.android.R;
import xsna.g8d;

/* compiled from: ClipsAutoSubtitles.kt */
/* loaded from: classes17.dex */
public final class bjd extends ckd {
    @Override // xsna.ckd
    public final yu20 a(Activity activity, ikd ikdVar) {
        g8d.a aVar;
        SdkVideoFile sdkVideoFile = ikdVar.a;
        if (!ci90.h(ikdVar) || dgd.f(sdkVideoFile) || sdkVideoFile.k1() > 0 || (aVar = ikdVar.f) == null || !aVar.b()) {
            return null;
        }
        return new ModalActionSheetListItem(this.a, sdkVideoFile.A0() ? ModalActionSheetListItem.Appearance.Default : ModalActionSheetListItem.Appearance.Disabled, activity.getString(R.string.clips_auto_subtitles_title), null, sdkVideoFile.A0() ? null : activity.getString(R.string.clips_auto_subtitles_absent_subtitle), R.drawable.vk_icon_subtitles_outline_28, ModalActionSheetListItem.IconSize.Large, false, false, 8);
    }

    @Override // xsna.ckd
    public final void b(Activity activity, ikd ikdVar, nkd nkdVar) {
        sih0 sih0Var = ikdVar.h;
        if (sih0Var != null) {
            sih0Var.a(ClipsBottomSheetOptions.CLIPS_AUTO_SUBTITLES);
        }
        if (nkdVar != null) {
            nkdVar.a(ClipsBottomSheetSideEffectOptions.CLIPS_AUTO_SUBTITLES, ikdVar.a);
        }
    }
}
