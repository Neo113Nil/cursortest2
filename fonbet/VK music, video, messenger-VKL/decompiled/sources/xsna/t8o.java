package xsna;

import android.content.DialogInterface;
import com.vk.dto.posting.DonutPostingSettings;
import xsna.fdm0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class t8o implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t8o(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ape0 ape0Var;
        switch (this.b) {
            case 0:
                ((rs0) this.c).invoke();
                dialogInterface.dismiss();
                break;
            case 1:
                jec0 jec0Var = (jec0) this.c;
                DonutPostingSettings.Duration duration = jec0Var.b;
                if (duration != null && (ape0Var = jec0Var.c) != null) {
                    ape0Var.invoke(Integer.valueOf(duration.b));
                    break;
                }
                break;
            default:
                bdm0 bdm0Var = (bdm0) this.c;
                bdm0Var.f(fdm0.c.a);
                bdm0Var.dismiss();
                break;
        }
    }
}
