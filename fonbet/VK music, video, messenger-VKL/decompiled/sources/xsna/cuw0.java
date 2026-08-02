package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.voip.ui.avatars.VoipAvatarViewContainer;
import com.vkontakte.android.R;

/* compiled from: VoipParticipantSettingsView.kt */
/* loaded from: classes7.dex */
public final class cuw0 implements gm50 {
    public final qtw0 b;
    public final n9t0 c;
    public final View d;
    public final VoipAvatarViewContainer e;
    public final TextView f;
    public final View g;
    public final View h;
    public final View i;
    public final View j;
    public final View k;
    public final View l;
    public final View m;
    public final TextView n;
    public final View o;
    public final View p;
    public final TextView q;
    public final View r;
    public final View s;
    public final View t;
    public final View u;
    public final View v;
    public final View w;
    public final View x;
    public final TextView y;
    public final TextView z;

    public cuw0(View view, qtw0 qtw0Var, n9t0 n9t0Var) {
        this.b = qtw0Var;
        this.c = n9t0Var;
        this.d = view.findViewById(R.id.header_btn);
        this.e = (VoipAvatarViewContainer) view.findViewById(R.id.avatar);
        this.f = (TextView) view.findViewById(R.id.full_name);
        this.g = view.findViewById(R.id.raised_hand_indicator);
        this.h = view.findViewById(R.id.open_profile_icon);
        View findViewById = view.findViewById(R.id.lower_hand_btn);
        this.i = findViewById;
        this.j = view.findViewById(R.id.first_divider);
        View findViewById2 = view.findViewById(R.id.mute_microphone_btn);
        this.k = findViewById2;
        View findViewById3 = view.findViewById(R.id.turn_off_camera_btn);
        this.l = findViewById3;
        View findViewById4 = view.findViewById(R.id.access_rights_btn);
        this.m = findViewById4;
        TextView textView = (TextView) view.findViewById(R.id.pin_btn);
        this.n = textView;
        View findViewById5 = view.findViewById(R.id.request_attention_btn);
        this.o = findViewById5;
        this.p = view.findViewById(R.id.second_divider);
        TextView textView2 = (TextView) view.findViewById(R.id.grant_admin_btn);
        this.q = textView2;
        View findViewById6 = view.findViewById(R.id.move_to_waiting_room_btn);
        this.r = findViewById6;
        View findViewById7 = view.findViewById(R.id.rename_btn);
        this.s = findViewById7;
        this.t = view.findViewById(R.id.third_divider);
        View findViewById8 = view.findViewById(R.id.exclude_btn);
        this.u = findViewById8;
        this.v = view.findViewById(R.id.states_layout);
        this.w = view.findViewById(R.id.progress);
        this.x = view.findViewById(R.id.error);
        this.y = (TextView) view.findViewById(R.id.error_text);
        this.z = (TextView) view.findViewById(R.id.error_retry);
        findViewById.setOnClickListener(new a06(this, 17));
        findViewById2.setOnClickListener(new dd6(this, 12));
        findViewById3.setOnClickListener(new f9(this, 16));
        findViewById4.setOnClickListener(new t01(this, 12));
        textView.setOnClickListener(new p01(this, 18));
        findViewById5.setOnClickListener(new q01(this, 17));
        textView2.setOnClickListener(new v01(this, 14));
        findViewById6.setOnClickListener(new wz5(this, 14));
        findViewById7.setOnClickListener(new sa6(this, 12));
        findViewById8.setOnClickListener(new xz5(this, 17));
    }

    public final void a() {
        boolean z = bwt0.K(this.n) || bwt0.K(this.o);
        boolean z2 = bwt0.K(this.q) || bwt0.K(this.r) || bwt0.K(this.s);
        boolean K = bwt0.K(this.u);
        bwt0.p0(this.p, z && z2);
        bwt0.p0(this.t, (z || z2) && K);
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.b;
    }
}
