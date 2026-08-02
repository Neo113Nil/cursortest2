package xsna;

import android.app.Activity;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetOptions;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetSideEffectOptions;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vkontakte.android.R;
import xsna.g8d;

/* compiled from: TrafficSaving.kt */
/* loaded from: classes17.dex */
public final class qip0 extends ckd {
    @Override // xsna.ckd
    public final yu20 a(Activity activity, ikd ikdVar) {
        SdkVideoFile sdkVideoFile = ikdVar.a;
        if (!ci90.h(ikdVar) || dgd.c(sdkVideoFile) || sdkVideoFile.k1() != 0 || !(ikdVar.f instanceof g8d.a.C2925a)) {
            return null;
        }
        ModalActionSheetListItem.Appearance appearance = ModalActionSheetListItem.Appearance.Default;
        String string = activity.getString(R.string.video_traffic_saving);
        ModalActionSheetListItem.IconSize iconSize = ModalActionSheetListItem.IconSize.Large;
        sr10 sr10Var = dy2.a;
        return new ModalActionSheetListItem(this.a, appearance, string, null, activity.getString(epx.f(sr10Var != null ? sr10Var.g() : null, Boolean.TRUE) ? R.string.video_traffic_saving_enabled : R.string.video_traffic_saving_disabled), R.drawable.vk_icon_smartphone_outline_28, iconSize, false, false, 8);
    }

    @Override // xsna.ckd
    public final void b(Activity activity, ikd ikdVar, nkd nkdVar) {
        sih0 sih0Var = ikdVar.h;
        if (sih0Var != null) {
            sih0Var.a(ClipsBottomSheetOptions.TRAFFIC_SAVING);
        }
        if (nkdVar != null) {
            nkdVar.a(ClipsBottomSheetSideEffectOptions.TRAFFIC_SAVING, ikdVar.a);
        }
    }
}
