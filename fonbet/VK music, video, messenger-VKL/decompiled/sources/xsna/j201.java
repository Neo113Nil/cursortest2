package xsna;

import android.util.Log;
import android.view.View;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class j201 implements View.OnClickListener {
    public final /* synthetic */ vwp0 b;

    public j201(vwp0 vwp0Var) {
        Objects.requireNonNull(vwp0Var);
        this.b = vwp0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        g0a c = uz9.e(this.b.b.getApplicationContext()).d().c();
        if (c == null || !c.c()) {
            return;
        }
        try {
            exc0.e("Must be called from the main thread.");
            a401 a401Var = c.i;
            if (a401Var != null && a401Var.e()) {
                exc0.k("Not connected to device", a401Var.e());
                if (a401Var.m) {
                    z = true;
                    c.l(!z);
                }
            }
            z = false;
            c.l(!z);
        } catch (IOException | IllegalArgumentException e) {
            o100 o100Var = vwp0.i;
            Log.e(o100Var.a, o100Var.c("Unable to call CastSession.setMute(boolean).", e));
        }
    }
}
