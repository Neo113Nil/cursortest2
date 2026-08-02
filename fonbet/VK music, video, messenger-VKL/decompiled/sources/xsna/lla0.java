package xsna;

import android.app.Activity;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetOptions;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetSideEffectOptions;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsMoreMenuItem;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;
import com.vkontakte.android.R;

/* compiled from: PinClip.kt */
/* loaded from: classes17.dex */
public final class lla0 extends ckd {
    public final ile b;
    public final xne c;

    public lla0(sua suaVar, ile ileVar, xne xneVar) {
        super(ClipsBottomSheetOptions.PIN.ordinal());
        this.b = ileVar;
        this.c = xneVar;
    }

    @Override // xsna.ckd
    public final yu20 a(Activity activity, ikd ikdVar) {
        SdkVideoFile sdkVideoFile = ikdVar.a;
        if (!fxc0.B().J().y0() || !this.c.a(sdkVideoFile) || epx.f(sdkVideoFile.Q(), Boolean.TRUE)) {
            return null;
        }
        return new ModalActionSheetListItem(this.a, ModalActionSheetListItem.Appearance.Default, activity.getString(R.string.clips_pin_in_channel), null, null, R.drawable.vk_icon_pin_outline_28, ModalActionSheetListItem.IconSize.Large, false, false, 24);
    }

    @Override // xsna.ckd
    public final void b(Activity activity, ikd ikdVar, nkd nkdVar) {
        if (nkdVar != null) {
            nkdVar.a(ClipsBottomSheetSideEffectOptions.PIN, ikdVar.a);
        }
        ile ileVar = this.b;
        if (ileVar != null) {
            ile.b(ikdVar.a, SchemeStat$TypeClipViewerItem.EventType.CLICK_MORE, MobileOfficialAppsClipsStat$ClipsMoreMenuItem.EventSubtype.PIN_CLIP, ileVar.a, null);
        }
    }
}
