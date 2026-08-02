package xsna;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vkontakte.android.R;

/* compiled from: MediaRouteChooserDialogFragment.java */
/* loaded from: classes12.dex */
public class qw10 extends androidx.fragment.app.d {
    public final boolean x = false;
    public b33 y;
    public ex10 z;

    public qw10() {
        An(true);
    }

    public final void Dn() {
        if (this.z == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.z = ex10.b(arguments.getBundle("selector"));
            }
            if (this.z == null) {
                this.z = ex10.c;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b33 b33Var = this.y;
        if (b33Var == null) {
            return;
        }
        if (!this.x) {
            pw10 pw10Var = (pw10) b33Var;
            pw10Var.getWindow().setLayout(xw10.a(pw10Var.getContext()), -2);
        } else {
            zw10 zw10Var = (zw10) b33Var;
            Context context = zw10Var.j;
            zw10Var.getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : xw10.a(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
        }
    }

    @Override // androidx.fragment.app.d
    @NonNull
    public final Dialog yn(@Nullable Bundle bundle) {
        if (this.x) {
            zw10 zw10Var = new zw10(mo2getContext());
            this.y = zw10Var;
            Dn();
            zw10Var.o(this.z);
        } else {
            pw10 pw10Var = new pw10(mo2getContext());
            this.y = pw10Var;
            Dn();
            pw10Var.p(this.z);
        }
        return this.y;
    }
}
