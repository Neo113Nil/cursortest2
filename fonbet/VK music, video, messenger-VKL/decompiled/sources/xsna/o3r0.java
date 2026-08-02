package xsna;

import android.content.Context;
import android.util.Size;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.api.VkVideoChannelVideoSubTab;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.ikv0;
import xsna.sbe0;

/* compiled from: UtilsDelegate.kt */
/* loaded from: classes7.dex */
public final class o3r0 {
    public static final boolean a(gce0 gce0Var) {
        gce0Var.i.getClass();
        boolean d = com.vk.core.utils.newtork.b.d();
        if (!d) {
            rdi.y(gce0Var, new i0r(24));
        }
        return d;
    }

    public static final void b(gce0 gce0Var) {
        gce0Var.c(new sbe0.n(ikv0.c.f.a, new ikv0.d(new ikv0.d.c(gce0Var.c.getString(R.string.snackbar_video_edit_success_title)), (ikv0.d.b) null, (ikv0.d.a) null, 6)));
    }

    public static final void c(gce0 gce0Var) {
        gce0Var.c(new sbe0.n(ikv0.c.b.a, new ikv0.d(new ikv0.d.c(gce0Var.c.getString(R.string.snackbar_video_error_title)), (ikv0.d.b) null, (ikv0.d.a) null, 6)));
    }

    public static final void d(gce0 gce0Var, UserId userId) {
        Context context = gce0Var.c;
        gce0Var.c(new sbe0.n(new ikv0.c.C3058c(R.drawable.vk_icon_clock_outline_28, Integer.valueOf(R.attr.vk_ui_icon_accent_themed), (Size) null, 12), new ikv0.d(new ikv0.d.c(context.getString(R.string.snackbar_video_publish_postponed_success_title)), (ikv0.d.b) null, new ikv0.d.a(context.getString(R.string.snackbar_video_publish_success_button), null, new vr80(context.getApplicationContext(), userId, VkVideoChannelVideoSubTab.SCHEDULED), Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), 2)));
    }

    public static final void e(gce0 gce0Var, UserId userId, String str) {
        Context context = gce0Var.c;
        gce0Var.c(new sbe0.n(ikv0.c.f.a, new ikv0.d(new ikv0.d.c(context.getString(R.string.snackbar_video_publish_success_title, str)), (ikv0.d.b) null, new ikv0.d.a(context.getString(R.string.snackbar_video_publish_success_button), null, new vr80(context.getApplicationContext(), userId, VkVideoChannelVideoSubTab.PUBLISHED), Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), 2)));
    }
}
