package xsna;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.vkontakte.android.R;
import xsna.b29;
import xsna.w19;

/* compiled from: CallDebugMenuView.kt */
/* loaded from: classes7.dex */
public final class o29 {
    public final View a;
    public final b29.b b;
    public final SwitchCompat c;
    public final i29 d;
    public final TextView e;
    public final View f;
    public final View g;
    public final SwitchCompat h;
    public final j29 i;
    public final SwitchCompat j;
    public final k29 k;
    public final SwitchCompat l;
    public final l29 m;
    public final View n;
    public final SwitchCompat o;
    public final m29 p;
    public final SwitchCompat q;
    public final n29 r;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.widget.CompoundButton$OnCheckedChangeListener, xsna.m29] */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.widget.CompoundButton$OnCheckedChangeListener, xsna.n29] */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.widget.CompoundButton$OnCheckedChangeListener, xsna.i29] */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.widget.CompoundButton$OnCheckedChangeListener, xsna.j29] */
    public o29(View view, b29.b bVar) {
        this.a = view;
        this.b = bVar;
        SwitchCompat switchCompat = (SwitchCompat) view.findViewById(R.id.voip_headers_bounds_switch);
        this.c = switchCompat;
        ?? r3 = new CompoundButton.OnCheckedChangeListener() { // from class: xsna.i29
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                o29.this.b.invoke(new w19.h(z));
            }
        };
        this.d = r3;
        this.e = (TextView) view.findViewById(R.id.voip_call_id_value);
        this.f = view.findViewById(R.id.voip_headers_bounds_group);
        this.g = view.findViewById(R.id.voip_one_log_group);
        SwitchCompat switchCompat2 = (SwitchCompat) view.findViewById(R.id.voip_join_as_group_switch);
        this.h = switchCompat2;
        ?? r5 = new CompoundButton.OnCheckedChangeListener() { // from class: xsna.j29
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                o29.this.b.invoke(new w19.j(z));
            }
        };
        this.i = r5;
        SwitchCompat switchCompat3 = (SwitchCompat) view.findViewById(R.id.voip_join_as_anonymous_switch);
        this.j = switchCompat3;
        k29 k29Var = new k29(this, 0);
        this.k = k29Var;
        SwitchCompat switchCompat4 = (SwitchCompat) view.findViewById(R.id.voip_join_with_changed_name_switch);
        this.l = switchCompat4;
        l29 l29Var = new l29(this, 0);
        this.m = l29Var;
        this.n = view.findViewById(R.id.voip_join_options_group);
        SwitchCompat switchCompat5 = (SwitchCompat) view.findViewById(R.id.voip_use_stereo_ui);
        this.o = switchCompat5;
        ?? r11 = new CompoundButton.OnCheckedChangeListener() { // from class: xsna.m29
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                o29.this.b.invoke(new w19.l(z));
            }
        };
        this.p = r11;
        SwitchCompat switchCompat6 = (SwitchCompat) view.findViewById(R.id.voip_request_close_camera_crash_switch);
        this.q = switchCompat6;
        ?? r13 = new CompoundButton.OnCheckedChangeListener() { // from class: xsna.n29
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                o29.this.b.invoke(new w19.b(z));
            }
        };
        this.r = r13;
        bwt0.i0(view.findViewById(R.id.voip_flush_one_logger), new m7(this, 15));
        bwt0.i0(view.findViewById(R.id.voip_call_id_copy_button), new zx(this, 9));
        bwt0.i0(view.findViewById(R.id.voip_crash_app), new vs(this, 12));
        bwt0.i0(view.findViewById(R.id.voip_sdk_nonfatal), new com.vk.movika.sdk.base.logic.interactor.p(this, 11));
        view.findViewById(R.id.voip_request_call_dump).setOnClickListener(new bn1(this, 2));
        bwt0.i0(view.findViewById(R.id.voip_force_p2p_relay), new ay0(this, 12));
        switchCompat.setOnCheckedChangeListener(r3);
        switchCompat2.setOnCheckedChangeListener(r5);
        switchCompat3.setOnCheckedChangeListener(k29Var);
        switchCompat4.setOnCheckedChangeListener(l29Var);
        switchCompat5.setOnCheckedChangeListener(r11);
        switchCompat6.setOnCheckedChangeListener(r13);
    }

    public static void a(SwitchCompat switchCompat, boolean z, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, boolean z2) {
        switchCompat.setOnCheckedChangeListener(null);
        switchCompat.setChecked(z);
        bwt0.p0(switchCompat, z2);
        switchCompat.setOnCheckedChangeListener(onCheckedChangeListener);
    }
}
