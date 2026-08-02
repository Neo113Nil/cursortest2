package xsna;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.cast.framework.media.widget.ExpandedControllerActivity;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class vi01 implements View.OnClickListener {
    public final /* synthetic */ vwp0 b;

    public vi01(vwp0 vwp0Var) {
        Objects.requireNonNull(vwp0Var);
        this.b = vwp0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ExpandedControllerActivity expandedControllerActivity;
        vwp0 vwp0Var = this.b;
        lvf0 g = vwp0Var.g();
        if (g == null || !g.k() || (expandedControllerActivity = vwp0Var.b) == null) {
            return;
        }
        fip0 fip0Var = new fip0();
        FragmentManager supportFragmentManager = expandedControllerActivity.getSupportFragmentManager();
        androidx.fragment.app.a b = tk5.b(supportFragmentManager, supportFragmentManager);
        Fragment H = expandedControllerActivity.getSupportFragmentManager().H("TRACKS_CHOOSER_DIALOG_TAG");
        if (H != null) {
            b.q(H);
        }
        fip0Var.u = false;
        fip0Var.v = true;
        b.f(0, fip0Var, "TRACKS_CHOOSER_DIALOG_TAG", 1);
        fip0Var.t = false;
        fip0Var.p = b.k(false);
    }
}
