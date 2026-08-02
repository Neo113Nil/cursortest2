package yads;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import com.yandex.mobile.ads.R$id;
import xsna.wzs;

/* loaded from: classes10.dex */
public final class g63 extends ea0 {
    public final wzs a;
    public final Switch b;

    public g63(View view, vl3 vl3Var) {
        super(view);
        this.a = vl3Var;
        this.b = (Switch) view.findViewById(R$id.item_switch);
    }

    @Override // yads.ea0
    public final void a(final aa0 aa0Var) {
        this.b.setOnCheckedChangeListener(null);
        Switch r0 = this.b;
        aa0Var.getClass();
        r0.setText("Debug Error Indicator");
        this.b.setChecked(aa0Var.a);
        this.b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: xsna.jxy0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                yads.g63.a(yads.g63.this, aa0Var, compoundButton, z);
            }
        });
    }

    public static final void a(g63 g63Var, aa0 aa0Var, CompoundButton compoundButton, boolean z) {
        wzs wzsVar = g63Var.a;
        aa0Var.getClass();
        wzsVar.invoke(z90.b, Boolean.valueOf(z));
    }
}
