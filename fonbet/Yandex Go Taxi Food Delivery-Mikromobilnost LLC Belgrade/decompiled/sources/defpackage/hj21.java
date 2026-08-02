package defpackage;

import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes2.dex */
public final class hj21 extends d9a0 {
    public static final /* synthetic */ kgx[] P = {new PropertyReference1Impl("textView", 0, "getTextView()Landroid/widget/TextView;", hj21.class), b64.x(qoi0.a, hj21.class, "switch", "getSwitch()Landroidx/appcompat/widget/SwitchCompat;", 0), new PropertyReference1Impl("divider", 0, "getDivider()Landroid/view/View;", hj21.class)};
    public final wv5 N;
    public final wv5 O;

    public hj21(View view, tls tlsVar) {
        super(view);
        this.N = new wv5(new l9f0(view, y9h0.plus_points_text, 18));
        wv5 wv5Var = new wv5(new l9f0(view, y9h0.plus_points_switch, 19));
        this.O = new wv5(new l9f0(view, y9h0.plus_points_divider, 20));
        ((SwitchCompat) wv5Var.a(P[1])).setOnCheckedChangeListener(new ojb(2, tlsVar));
    }

    @Override // defpackage.d9a0
    public final void W(b9a0 b9a0Var, boolean z) {
        if (!(b9a0Var instanceof a9a0)) {
            throw new IllegalArgumentException("item must be PaymentMethodsAdapter.Item.PlusPoints");
        }
        kgx[] kgxVarArr = P;
        ((View) this.O.a(kgxVarArr[2])).setVisibility(z ? 0 : 4);
        throw null;
    }
}
