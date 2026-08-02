package xsna;

import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.vkontakte.android.fragments.LegoPreference;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class z1z implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z1z(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ComponentName component;
        switch (this.b) {
            case 0:
                Context context = ((LegoPreference) this.c).b;
                Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                if (launchIntentForPackage != null && (component = launchIntentForPackage.getComponent()) != null) {
                    context.startActivity(Intent.makeRestartActivityTask(component));
                }
                System.exit(0);
                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            case 1:
                gzs gzsVar = (gzs) this.c;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    return;
                }
                return;
            case 2:
                j7q0 j7q0Var = (j7q0) this.c;
                z6q0 z6q0Var = j7q0Var.x;
                if (z6q0Var != null) {
                    z6q0Var.E0(j7q0Var.getContext());
                    return;
                }
                return;
            default:
                com.vungle.ads.internal.presenter.w.a((com.vungle.ads.internal.presenter.w) this.c, dialogInterface, i);
                return;
        }
    }
}
