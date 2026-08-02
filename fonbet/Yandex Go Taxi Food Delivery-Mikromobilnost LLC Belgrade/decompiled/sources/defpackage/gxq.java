package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.recyclerview.widget.x0;
import androidx.recyclerview.widget.y;

/* loaded from: classes2.dex */
public final class gxq extends y {
    public final wls a;

    public gxq(wls wlsVar) {
        super(new fxq());
        this.a = wlsVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, final int i) {
        final jxq jxqVar = (jxq) x0Var;
        hxq hxqVar = (hxq) getItem(i);
        TextView textView = (TextView) jxqVar.O.a(jxq.Q[0]);
        View view = jxqVar.a;
        textView.setText(bb1.t(hxqVar.a, view));
        jxqVar.W().setChecked(hxqVar.b);
        jxqVar.W().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ixq
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                jxq.this.N.invoke(Integer.valueOf(i), Boolean.valueOf(z));
            }
        });
        bb1.L(view, new wtn(jxqVar, i, 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new jxq(this.a, bb1.v(viewGroup, bmh0.plus_debug_panel_item_field_choice, false));
    }
}
