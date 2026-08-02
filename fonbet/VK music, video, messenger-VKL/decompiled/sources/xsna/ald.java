package xsna;

import android.text.TextUtils;
import android.view.View;
import com.vk.dto.common.NotificationImage;
import com.vk.dto.masks.Mask;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vkontakte.android.R;
import xsna.a3p0;
import xsna.ngv0;
import xsna.pjd;
import xsna.tlo0;

/* compiled from: ClipsCameraMaskToolbar.kt */
/* loaded from: classes17.dex */
public final class ald extends pjd {
    @Override // xsna.pjd, xsna.d3p0
    public final void b(a3p0 a3p0Var) {
        vgv0 vgv0Var;
        if (a3p0Var instanceof a3p0.a) {
            ClipGridParams.Data data = ((a3p0.a) a3p0Var).a;
            if (data instanceof ClipGridParams.Data.CameraMask) {
                Mask mask = ((ClipGridParams.Data.CameraMask) data).b;
                String str = mask.g;
                boolean z = mask.u;
                this.i = str;
                View view = this.b;
                this.j = view.getContext().getString(z ? R.string.clips_grid_effect_title : R.string.clips_grid_mask_title);
                String str2 = mask.g;
                if (str2 != null) {
                    tlo0.h d = oq.d(tlo0.Companion, str2);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    vgv0Var = new vgv0(d, (ngv0.a) null, (ngv0) null, 2, 6);
                } else {
                    vgv0Var = null;
                }
                this.r.setMiddle(new pgv0(vgv0Var, null, null, null, null, null, 510));
                int i = z ? R.drawable.vk_icon_stars_outline_32 : R.drawable.vk_icon_masks_outline_32;
                NotificationImage notificationImage = mask.l;
                n(new pjd.a(i, notificationImage != null ? notificationImage.Cb(e3m.a(R.dimen.clips_grid_header_icon_size, view.getContext())) : null));
                o(data);
                super.b(a3p0Var);
            }
        }
    }
}
