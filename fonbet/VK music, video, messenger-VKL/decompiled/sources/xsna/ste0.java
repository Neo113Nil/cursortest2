package xsna;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkCell;
import com.vk.privacyui.PrivacyEditFragment;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.tlo0;

/* compiled from: RadioButtonWithSubtitleHolder.kt */
/* loaded from: classes5.dex */
public final class ste0 extends vif0<fed0> implements UsableRecyclerView.e {
    public final PrivacyEditFragment n;

    public ste0(VkCell vkCell, ViewGroup viewGroup, PrivacyEditFragment privacyEditFragment) {
        super(vkCell, viewGroup);
        this.n = privacyEditFragment;
    }

    @Override // xsna.vif0
    public final void i6(fed0 fed0Var) {
        VkCell.Middle.d dVar;
        fed0 fed0Var2 = fed0Var;
        VkCell vkCell = (VkCell) this.itemView;
        VkCell.Middle.a aVar = VkCell.Middle.Companion;
        VkCell.Middle.e eVar = new VkCell.Middle.e(oq.d(tlo0.Companion, fed0Var2.a.Bb()), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62);
        String str = fed0Var2.b;
        if (str == null || drm0.N(str)) {
            dVar = null;
        } else {
            dVar = new VkCell.Middle.d(new tlo0.h(str), (gzs) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62);
        }
        vkCell.setMiddle(VkCell.Middle.a.a(aVar, eVar, dVar, null, 12));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // me.grishka.appkit.views.UsableRecyclerView.e
    public final void onClick() {
        PrivacyEditFragment privacyEditFragment = this.n;
        if (privacyEditFragment != null) {
            privacyEditFragment.fk(((fed0) this.m).a);
        }
    }
}
