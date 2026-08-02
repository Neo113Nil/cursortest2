package xsna;

import android.app.Activity;
import android.content.DialogInterface;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetOptions;
import com.vkontakte.android.R;
import xsna.h7u0;

/* compiled from: AttachLink.kt */
/* loaded from: classes2.dex */
public final class i24 extends h6s0 {
    public static final i24 c = new i24(VideoBottomSheetOptions.ATTACH.ordinal());

    @Override // xsna.h6s0
    public final e520 a(s6s0 s6s0Var) {
        VideoFile videoFile = s6s0Var.a;
        if (!videoFile.yb() || hg10.g(s6s0Var)) {
            return null;
        }
        return new e520(this.b, R.drawable.vk_icon_attach_outline_28, videoFile.m1() == null ? R.string.video_action_attach : R.string.relace_action_link_confimation_dialog_title, this.b, false, 0, 0, false, null, 0, null, false, 8176);
    }

    @Override // xsna.h6s0
    public final void c(Activity activity, s6s0 s6s0Var, y6s0 y6s0Var) {
        VideoFile videoFile = s6s0Var.a;
        k78 k78Var = s6s0Var.e;
        final l78 l78Var = k78Var != null ? new l78(k78Var) : null;
        h24 h24Var = new h24(activity, videoFile, l78Var, 0);
        if (videoFile.m1() == null) {
            h24Var.invoke();
            return;
        }
        final String simpleName = i24.class.getSimpleName();
        int i = h7u0.p;
        h7u0.a c2 = h7u0.b.c(activity);
        c2.g0(R.string.relace_action_link_confimation_dialog_title);
        c2.U(R.string.relace_action_link_confimation_dialog_message);
        c2.c0(R.string.relace_action_link_confimation_dialog_confirm, new hbh(h24Var, 2));
        c2.W(R.string.cancel, null);
        c2.b0(new DialogInterface.OnShowListener() { // from class: xsna.zes0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                dz20 dz20Var = l78Var;
                if (dz20Var != null) {
                    dz20Var.Ff(simpleName);
                }
            }
        });
        androidx.appcompat.app.d m = c2.m();
        if (m != null) {
            m.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: xsna.afs0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    dz20 dz20Var = l78Var;
                    if (dz20Var != null) {
                        dz20Var.Qc(simpleName);
                    }
                }
            });
        }
    }
}
