package xsna;

import android.os.Bundle;
import com.vk.nspk.search.NspkSearchBanksFeatureComponent;

/* compiled from: NspkChooserComponent.kt */
/* loaded from: classes2.dex */
public final class jm70 extends yj50<km70, qm70, om70, pm70, Object, mm70, nm70> {
    public final lm70 n;

    public jm70(lm70 lm70Var, lm70 lm70Var2) {
        super(lm70Var, lm70Var2, om70.class, false);
        this.n = lm70Var;
    }

    @Override // xsna.yj50
    public final km70 a(Bundle bundle) {
        v2h0 ya = ((NspkSearchBanksFeatureComponent) m7m.d(this.n).a(fpf0.a(NspkSearchBanksFeatureComponent.class))).ya();
        String string = bundle.getString("sbp_link");
        if (string == null) {
            string = "";
        }
        return new km70(ya, string);
    }

    @Override // xsna.yj50
    public final nm70 b() {
        return new nm70(this.n);
    }

    @Override // xsna.yj50
    public final pm70 d() {
        return new pm70();
    }
}
