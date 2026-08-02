package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vkontakte.android.R;
import kotlin.NotImplementedError;
import xsna.q6h0;

/* compiled from: VoipScheduledCallRemoveConfirmView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public final class wxw0 extends ConstraintLayout implements View.OnClickListener {
    public final x5h0 t;
    public final k59<j59> u;
    public final View v;
    public final View w;
    public dw20 x;

    /* JADX WARN: Multi-variable type inference failed */
    public wxw0(Context context, x5h0 x5h0Var, k59<? super j59> k59Var) {
        super(context);
        this.t = x5h0Var;
        this.u = k59Var;
        LayoutInflater.from(context).inflate(R.layout.voip_scheduled_call_confirm_remove, this);
        View findViewById = findViewById(R.id.voip_scheduled_call_confirm_remove_reschedule_item);
        this.v = findViewById;
        View findViewById2 = findViewById(R.id.voip_scheduled_call_confirm_remove_item);
        this.w = findViewById2;
        bwt0.h0(this, findViewById);
        bwt0.h0(this, findViewById2);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        j59 aVar;
        int id = view.getId();
        x5h0 x5h0Var = this.t;
        if (id == R.id.voip_scheduled_call_confirm_remove_reschedule_item) {
            aVar = new q6h0.c.b(x5h0Var);
        } else {
            if (id != R.id.voip_scheduled_call_confirm_remove_item) {
                throw new NotImplementedError();
            }
            aVar = new q6h0.c.a(x5h0Var);
        }
        this.u.a(aVar);
        dw20 dw20Var = this.x;
        if (dw20Var != null) {
            dw20Var.tn();
        }
        this.x = null;
    }
}
