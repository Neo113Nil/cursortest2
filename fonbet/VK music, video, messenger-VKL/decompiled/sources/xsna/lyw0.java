package xsna;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.vk.voip.ui.scheduled.creation.ui.VoipScheduleCallViewState;
import com.vk.voip.ui.view.VoipActionMultiLineView;
import com.vkontakte.android.R;
import xsna.pxw0;

/* compiled from: VoipScheduledCallSettingsViewHolder.kt */
/* loaded from: classes7.dex */
public final class lyw0 extends vfz<VoipScheduleCallViewState.ScreenState.Item.e> {
    public final qxw0<pxw0.q> l;
    public final VoipActionMultiLineView m;

    /* JADX WARN: Multi-variable type inference failed */
    public lyw0(ViewGroup viewGroup, qxw0<? super pxw0.q> qxw0Var) {
        super(R.layout.voip_scheduled_call_settings_item, viewGroup);
        this.l = qxw0Var;
        this.m = (VoipActionMultiLineView) this.itemView.findViewById(R.id.voip_scheduled_call_setting);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void h6(VoipScheduleCallViewState.ScreenState.Item.e eVar) {
        VoipScheduleCallViewState.ScreenState.Item.e eVar2 = eVar;
        Drawable a = m33.a(eVar2.b, this.itemView.getContext());
        VoipActionMultiLineView voipActionMultiLineView = this.m;
        VoipActionMultiLineView.a(voipActionMultiLineView, a, 12);
        voipActionMultiLineView.setTitle(eVar2.c);
        voipActionMultiLineView.setSubtitle(eVar2.d);
        bwt0.i0(voipActionMultiLineView, new bjm0(this, 26));
    }
}
