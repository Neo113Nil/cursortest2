package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledCallRecurrence;
import com.vkontakte.android.R;
import xsna.aig;
import xsna.d6h0;
import xsna.q6h0;

/* compiled from: VoipScheduledCallMenuView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public final class txw0 extends ConstraintLayout implements View.OnClickListener {
    public final View A;
    public final View B;
    public gzs<s3q0> C;
    public dw20 D;
    public final x5h0 t;
    public final k59<j59> u;
    public final View v;
    public final View w;
    public final View x;
    public final View y;
    public final View z;

    /* JADX WARN: Multi-variable type inference failed */
    public txw0(Context context, x5h0 x5h0Var, boolean z, k59<? super j59> k59Var) {
        super(context);
        this.t = x5h0Var;
        this.u = k59Var;
        LayoutInflater.from(context).inflate(R.layout.voip_scheduled_call_menu, this);
        d6h0 d6h0Var = new d6h0(context);
        TextView textView = (TextView) findViewById(R.id.voip_scheduled_menu_title);
        TextView textView2 = (TextView) findViewById(R.id.voip_scheduled_menu_time_interval);
        View findViewById = findViewById(R.id.voip_scheduled_menu_begin_call_item);
        this.v = findViewById;
        View findViewById2 = findViewById(R.id.voip_scheduled_menu_copy_invite_item);
        this.w = findViewById2;
        View findViewById3 = findViewById(R.id.voip_scheduled_menu_share_item);
        this.x = findViewById3;
        View findViewById4 = findViewById(R.id.voip_scheduled_menu_share_qr_item);
        this.y = findViewById4;
        View findViewById5 = findViewById(R.id.voip_scheduled_menu_edit_item);
        this.z = findViewById5;
        View findViewById6 = findViewById(R.id.voip_scheduled_menu_open_chat_item);
        this.A = findViewById6;
        View findViewById7 = findViewById(R.id.voip_scheduled_menu_remove_item);
        this.B = findViewById7;
        this.C = new sqf0(16);
        bwt0.h0(this, findViewById);
        bwt0.h0(this, findViewById2);
        bwt0.h0(this, findViewById3);
        bwt0.h0(this, findViewById4);
        bwt0.h0(this, findViewById5);
        bwt0.h0(this, findViewById6);
        bwt0.h0(this, findViewById7);
        boolean z2 = x5h0Var.i.length() > 0;
        findViewById2.setVisibility(z2 ? 0 : 8);
        findViewById3.setVisibility(z2 ? 0 : 8);
        findViewById4.setVisibility(z2 ? 0 : 8);
        s49 s49Var = x5h0Var.j;
        findViewById6.setVisibility((s49Var == null || s49Var.a == 0) ? 8 : 0);
        textView.setText(x5h0Var.b);
        textView2.setCompoundDrawablesWithIntrinsicBounds(x5h0Var.e != ScheduledCallRecurrence.NEVER ? R.drawable.vk_icon_switch_12 : 0, 0, 0, 0);
        textView2.setText(d6h0Var.b(new d6h0.a(x5h0Var.e, x5h0Var.f, x5h0Var.g, x5h0Var.h), false));
        findViewById.setVisibility(z ? 0 : 8);
    }

    public final gzs<s3q0> getOnItemClicked() {
        return this.C;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        j59 bVar;
        int id = view.getId();
        x5h0 x5h0Var = this.t;
        if (id == R.id.voip_scheduled_menu_begin_call_item) {
            bVar = new aig.a(x5h0Var.i);
        } else if (id == R.id.voip_scheduled_menu_copy_invite_item) {
            bVar = new q6h0.d.c(x5h0Var);
        } else if (id == R.id.voip_scheduled_menu_share_item) {
            bVar = new aig.g(x5h0Var.a, x5h0Var.i);
        } else if (id == R.id.voip_scheduled_menu_share_qr_item) {
            bVar = new aig.h(x5h0Var.i);
        } else if (id == R.id.voip_scheduled_menu_edit_item) {
            bVar = new q6h0.d.C3550d(x5h0Var);
        } else if (id == R.id.voip_scheduled_menu_open_chat_item) {
            s49 s49Var = x5h0Var.j;
            bVar = new aig.b(s49Var != null ? s49Var.a : 0L);
        } else {
            if (id != R.id.voip_scheduled_menu_remove_item) {
                throw new RuntimeException("Unknown button click");
            }
            bVar = new q6h0.d.b(x5h0Var);
        }
        this.u.a(bVar);
        dw20 dw20Var = this.D;
        if (dw20Var != null) {
            dw20Var.tn();
        }
        this.D = null;
    }

    public final void setOnItemClicked(gzs<s3q0> gzsVar) {
        this.C = gzsVar;
    }
}
