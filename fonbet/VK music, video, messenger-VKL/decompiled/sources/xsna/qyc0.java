package xsna;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.privacyui.PrivacyEditFragment;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.tlo0;

/* compiled from: PreferenceRadioButtonHolder.kt */
/* loaded from: classes7.dex */
public final class qyc0 extends vif0<PrivacySetting.PrivacyRule> implements UsableRecyclerView.e {
    public final PrivacyEditFragment n;

    public qyc0(VkCell vkCell, ViewGroup viewGroup, PrivacyEditFragment privacyEditFragment) {
        super(vkCell, viewGroup);
        this.n = privacyEditFragment;
    }

    @Override // xsna.vif0
    public final void i6(PrivacySetting.PrivacyRule privacyRule) {
        PrivacySetting.PrivacyRule privacyRule2 = privacyRule;
        VkCell vkCell = (VkCell) this.itemView;
        VkCell.Middle.a aVar = VkCell.Middle.Companion;
        tlo0.a aVar2 = tlo0.Companion;
        String Bb = privacyRule2 != null ? privacyRule2.Bb() : null;
        if (Bb == null) {
            Bb = "";
        }
        vkCell.setMiddle(VkCell.Middle.a.a(aVar, new VkCell.Middle.e(oq.d(aVar2, Bb), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), null, null, 14));
    }

    @Override // me.grishka.appkit.views.UsableRecyclerView.e
    public final void onClick() {
        PrivacyEditFragment privacyEditFragment = this.n;
        if (privacyEditFragment != null) {
            privacyEditFragment.fk(this.m);
        }
    }
}
