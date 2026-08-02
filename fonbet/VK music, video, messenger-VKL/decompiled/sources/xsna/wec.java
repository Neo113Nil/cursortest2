package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CityParameterItemViewHolder.kt */
/* loaded from: classes5.dex */
public final class wec extends vfz<uec> {
    public final izs<uec, s3q0> l;
    public final TextView m;
    public final TextView n;

    public wec(ViewGroup viewGroup, po1 po1Var) {
        super(R.layout.search_params_city_param_item, viewGroup);
        this.l = po1Var;
        this.m = (TextView) this.itemView.findViewById(R.id.search_params_city_title);
        this.n = (TextView) this.itemView.findViewById(R.id.search_params_city_subtitle);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(uec uecVar) {
        uec uecVar2 = uecVar;
        this.m.setText(uecVar2.c);
        String str = uecVar2.e;
        if (str == null || str.length() == 0) {
            str = null;
        }
        String str2 = uecVar2.d;
        if (str2 == null || str2.length() == 0) {
            str2 = null;
        }
        List I = rl3.I(new String[]{str, str2});
        String g0 = ((ArrayList) I).isEmpty() ? null : j5g.g0(I, ", ", null, null, 0, null, 62);
        TextView textView = this.n;
        textView.setText(g0);
        CharSequence text = textView.getText();
        textView.setVisibility((text == null || text.length() == 0) ? 8 : 0);
        this.itemView.setOnClickListener(new vec(0, this, uecVar2));
    }
}
