package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.z0e0;

/* compiled from: ImportContactsHolderV3.kt */
/* loaded from: classes4.dex */
public final class jqw extends vif0<z0e0.a> implements View.OnClickListener {
    public final g880 n;
    public final TextView o;
    public final TextView p;
    public final TextView q;
    public final View r;

    public jqw(ViewGroup viewGroup, g880 g880Var) {
        super(viewGroup, R.layout.friends_recomm_sync_contact_item_v3, 0);
        this.n = g880Var;
        TextView textView = (TextView) this.itemView.findViewById(R.id.title);
        this.o = textView;
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.subtitle);
        this.p = textView2;
        TextView textView3 = (TextView) this.itemView.findViewById(R.id.button);
        this.q = textView3;
        View findViewById = this.itemView.findViewById(R.id.dismiss_button);
        this.r = findViewById;
        textView.setMaxLines(2);
        textView2.setMaxLines(3);
        textView3.setOnClickListener(this);
        findViewById.setOnClickListener(this);
    }

    @Override // xsna.vif0
    public final void i6(z0e0.a aVar) {
        z0e0.a aVar2 = aVar;
        String str = aVar2.c;
        this.o.setText(aVar2.a);
        String str2 = aVar2.b;
        TextView textView = this.p;
        textView.setText(str2);
        bwt0.p0(textView, str2.length() > 0);
        TextView textView2 = this.q;
        textView2.setText(str);
        bwt0.p0(textView2, str.length() > 0);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        jzd0 jzd0Var;
        if (jjc.b()) {
            return;
        }
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        g880 g880Var = this.n;
        if (valueOf != null && valueOf.intValue() == R.id.button) {
            jzd0 jzd0Var2 = ((j1e0) g880Var.c).g;
            if (jzd0Var2 != null) {
                jzd0Var2.e(this.itemView.getContext());
                return;
            }
            return;
        }
        if (valueOf == null || valueOf.intValue() != R.id.dismiss_button || (jzd0Var = ((j1e0) g880Var.c).g) == null) {
            return;
        }
        jzd0Var.b();
    }
}
