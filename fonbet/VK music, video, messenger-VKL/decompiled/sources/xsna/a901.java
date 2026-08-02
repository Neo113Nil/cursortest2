package xsna;

import android.view.View;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class a901 implements View.OnClickListener {
    public final /* synthetic */ vwp0 b;

    public a901(vwp0 vwp0Var) {
        Objects.requireNonNull(vwp0Var);
        this.b = vwp0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        lvf0 g = this.b.g();
        if (g == null || !g.k()) {
            return;
        }
        g.s();
    }
}
