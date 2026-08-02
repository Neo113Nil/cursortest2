package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.x0;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes2.dex */
public final class dxs extends x0 {
    public static final /* synthetic */ kgx[] P;
    public final tls N;
    public final wv5 O;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl("valueTextView", 0, "getValueTextView()Landroid/widget/TextView;", dxs.class);
        qoi0.a.getClass();
        P = new kgx[]{propertyReference1Impl};
    }

    public dxs(View view, tls tlsVar) {
        super(view);
        this.N = tlsVar;
        this.O = new wv5(new sdg(view, s9h0.plus_sdk_general_info_value, 19));
    }

    public final TextView W() {
        return (TextView) this.O.a(P[0]);
    }
}
