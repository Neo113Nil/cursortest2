package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import com.vkontakte.android.R;

/* compiled from: RecyclerHolderSelection.kt */
/* loaded from: classes4.dex */
public abstract class wif0<T> extends vif0<T> {
    public final mcy<Object> n;
    public final View o;
    public final CheckBox p;
    public final im7 q;

    public wif0(int i, ViewGroup viewGroup, mcy<Object> mcyVar) {
        super(viewGroup, i, 0);
        this.n = mcyVar;
        View findViewById = this.itemView.findViewById(R.id.poll_background_click_handler);
        this.o = findViewById;
        CheckBox checkBox = (CheckBox) this.itemView.findViewById(R.id.poll_checkbox);
        this.p = checkBox;
        checkBox.setClickable(false);
        this.itemView.setOnClickListener(new mo3(this, 14));
        if (findViewById != null) {
            findViewById.setOnClickListener(new asq(this, 5));
        }
        this.q = new im7(this, 2);
    }

    public final void q6(boolean z) {
        CheckBox checkBox = this.p;
        checkBox.setOnCheckedChangeListener(null);
        checkBox.setChecked(z);
        checkBox.setOnCheckedChangeListener(this.q);
    }
}
