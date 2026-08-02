package xsna;

import android.view.View;
import java.util.Objects;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class sa01 implements View.OnClickListener {
    public final /* synthetic */ vwp0 b;

    public sa01(vwp0 vwp0Var) {
        Objects.requireNonNull(vwp0Var);
        this.b = vwp0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        vwp0 vwp0Var = this.b;
        lvf0 g = vwp0Var.g();
        if (g == null || !g.k()) {
            return;
        }
        if (!g.C()) {
            g.w(g.d() + ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS);
            return;
        }
        g.w(Math.min(g.d() + ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS, vwp0Var.f.f() + r9.e()));
    }
}
