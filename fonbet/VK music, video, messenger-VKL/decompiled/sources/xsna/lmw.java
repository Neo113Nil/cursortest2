package xsna;

import android.content.Context;
import android.view.View;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.core.view.components.picture.c;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.ljw;

/* compiled from: ItemActionLinkView.kt */
/* loaded from: classes16.dex */
public final class lmw implements VkCell.d {
    public final VkPicture a;

    public lmw(Context context) {
        VkPicture vkPicture = new VkPicture(context, null, 6, 0);
        vkPicture.setDontLoadAgainIfSameResource(true);
        this.a = vkPicture;
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final void a(VkCell.f fVar) {
        if (fVar instanceof qmw) {
            ljw ljwVar = ((qmw) fVar).a;
            boolean z = ljwVar instanceof ljw.b;
            VkPicture vkPicture = this.a;
            if (z) {
                vkPicture.setContent(new c.d(((ljw.b) ljwVar).a, null));
            } else {
                if (!(ljwVar instanceof ljw.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                vkPicture.setContent(new c.a(((ljw.a) ljwVar).a, R.attr.vk_ui_icon_tertiary));
            }
        }
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final View getView() {
        return this.a;
    }
}
