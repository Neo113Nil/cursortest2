package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.voip.ui.scheduled.creation.ui.settings.ui.state.VoipScheduledCallSettingsContentViewState$ScreenState$Item;
import com.vkontakte.android.R;

/* compiled from: VoipScheduledCallSettingsTitleViewHolder.kt */
/* loaded from: classes7.dex */
public final class jyw0 extends vfz<VoipScheduledCallSettingsContentViewState$ScreenState$Item.a> {
    public final TextView l;

    public jyw0(ViewGroup viewGroup) {
        super(R.layout.voip_scheduled_call_settings_title_item, viewGroup);
        this.l = (TextView) this.itemView.findViewById(R.id.voip_call_settings_title);
    }

    @Override // xsna.vfz
    public final void W5(VoipScheduledCallSettingsContentViewState$ScreenState$Item.a aVar) {
        Context context = this.itemView.getContext();
        aVar.getClass();
        this.l.setText(context.getText(R.string.voip_scheduled_call_options_item_title));
    }
}
