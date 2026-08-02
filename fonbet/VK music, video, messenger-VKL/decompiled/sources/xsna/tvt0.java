package xsna;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class tvt0 implements u080 {
    @Override // xsna.u080
    public final bqx0 b(View view, bqx0 bqx0Var) {
        h4x i = bqx0Var.a.i(519);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.leftMargin = i.a;
        marginLayoutParams.bottomMargin = i.d;
        marginLayoutParams.rightMargin = i.c;
        view.setLayoutParams(marginLayoutParams);
        return bqx0.b;
    }
}
