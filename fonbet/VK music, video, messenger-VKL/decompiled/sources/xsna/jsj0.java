package xsna;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.newsfeed.impl.posting.settings.mvi.ui.SettingType;
import com.vkontakte.android.R;
import xsna.plc0;

/* compiled from: SimpleSettingsAdapter.kt */
/* loaded from: classes4.dex */
public final class jsj0 extends zoj0<plc0, vif0<?>> {
    public final com.vk.newsfeed.impl.posting.settings.mvi.c e;

    public jsj0(com.vk.newsfeed.impl.posting.settings.mvi.c cVar) {
        this.e = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((plc0) this.c.c(i)).a.ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        vif0 vif0Var = (vif0) e0Var;
        plc0 plc0Var = (plc0) this.c.c(i);
        if (vif0Var instanceof tnn0) {
            ((tnn0) vif0Var).V5((plc0.d) plc0Var);
            return;
        }
        if (vif0Var instanceof mfi0) {
            ((mfi0) vif0Var).V5((plc0.b) plc0Var);
        } else if (vif0Var instanceof led0) {
            ((led0) vif0Var).V5((plc0.a) plc0Var);
        } else if (vif0Var instanceof v4m) {
            ((v4m) vif0Var).V5((plc0.c) plc0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        int ordinal = SettingType.SWITCH_COMMENTS.ordinal();
        com.vk.newsfeed.impl.posting.settings.mvi.c cVar = this.e;
        if (i == ordinal || i == SettingType.HIDE_NAME.ordinal() || i == SettingType.SWITCH_NOTIFY.ordinal()) {
            return new tnn0(from.inflate(R.layout.layout_setting_switch, viewGroup, false), cVar);
        }
        if (i == SettingType.SELECTOR_POSTING_TIME.ordinal() || i == SettingType.ADVERTISING_ORD.ordinal() || i == SettingType.SELECTOR_POST_SOURCE.ordinal()) {
            return new mfi0(from.inflate(R.layout.layout_setting_selector, viewGroup, false), cVar);
        }
        if (i == SettingType.PRIVACY.ordinal()) {
            return new led0(from.inflate(R.layout.layout_setting_privacy, viewGroup, false), cVar);
        }
        if (i == SettingType.DETAILS_SOURCE.ordinal()) {
            return new v4m(from.inflate(R.layout.layout_settings_details_source, viewGroup, false));
        }
        throw new IllegalArgumentException(lhg.a(i, "Unknown viewType="));
    }
}
