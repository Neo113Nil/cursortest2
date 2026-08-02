package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vkontakte.android.R;

/* compiled from: OngoingCallMenuView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public final class no80 extends ConstraintLayout implements View.OnClickListener {
    public final View t;
    public final View u;

    public no80(Context context, k59 k59Var) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.voip_ongoing_call_menu, this);
        View findViewById = findViewById(R.id.voip_ongoing_menu_open_chat_item);
        this.t = findViewById;
        View findViewById2 = findViewById(R.id.voip_ongoing_menu_share_item);
        this.u = findViewById2;
        bwt0.h0(this, findViewById);
        bwt0.h0(this, findViewById2);
        throw null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.voip_ongoing_menu_share_item) {
            throw null;
        }
        if (id != R.id.voip_ongoing_menu_open_chat_item) {
            throw new RuntimeException("Unknown button click");
        }
        throw null;
    }
}
