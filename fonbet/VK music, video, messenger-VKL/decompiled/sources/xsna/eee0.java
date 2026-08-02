package xsna;

import android.app.Activity;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetOptions;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.dto.common.VideoFile;
import com.vkontakte.android.R;

/* compiled from: PublishNow.kt */
/* loaded from: classes17.dex */
public final class eee0 extends ckd {
    public final mkd b;

    public eee0(sua suaVar, mkd mkdVar) {
        super(ClipsBottomSheetOptions.PUBLISH_NOW.ordinal());
        this.b = mkdVar;
    }

    @Override // xsna.ckd
    public final yu20 a(Activity activity, ikd ikdVar) {
        SdkVideoFile sdkVideoFile = ikdVar.a;
        if (!sdkVideoFile.t0() || !ci90.m(ikdVar) || sdkVideoFile.k1() <= 0) {
            return null;
        }
        return new ModalActionSheetListItem(this.a, ModalActionSheetListItem.Appearance.Default, activity.getString(R.string.video_publish_now), null, null, R.drawable.vk_icon_arrow_up_circle_outline_28, ModalActionSheetListItem.IconSize.Large, false, false, 24);
    }

    @Override // xsna.ckd
    public final void b(Activity activity, ikd ikdVar, nkd nkdVar) {
        sih0 sih0Var = ikdVar.h;
        if (sih0Var != null) {
            sih0Var.a(ClipsBottomSheetOptions.PUBLISH_NOW);
        }
        VideoFile A = k15.A(ikdVar.a);
        fy0 fy0Var = new fy0(17, nkdVar, ikdVar);
        this.b.getClass();
        mkd.a(A, 0, fy0Var);
    }
}
