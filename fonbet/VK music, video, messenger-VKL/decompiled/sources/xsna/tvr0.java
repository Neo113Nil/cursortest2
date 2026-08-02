package xsna;

import android.view.View;
import com.vk.voip.ui.settings.participants_view.CallSettingsItem;
import com.vkontakte.android.R;

/* compiled from: VhWaitingRoomParticipant.kt */
/* loaded from: classes7.dex */
public final class tvr0 extends com.vk.voip.ui.settings.participants_view.n<CallSettingsItem.i> {
    public static final /* synthetic */ int s = 0;
    public final fuw0 p;
    public final View q;
    public final View r;

    public tvr0(View view) {
        super(view);
        this.p = fuw0.a;
        View findViewById = this.itemView.findViewById(R.id.let_in_btn);
        this.q = findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.menu_btn);
        this.r = findViewById2;
        bwt0.i0(findViewById, new j6l0(this, 16));
        bwt0.i0(findViewById2, new fuc0(this, 22));
    }
}
