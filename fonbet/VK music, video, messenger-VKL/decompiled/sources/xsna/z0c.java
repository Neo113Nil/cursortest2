package xsna;

import android.content.DialogInterface;
import xsna.y0c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class z0c implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z0c(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                int i3 = a1c.k1;
                ((a1c) obj).getFeature().C(y0c.a.b);
                break;
            default:
                ((gzs) ((rr1) obj).a).invoke();
                break;
        }
    }
}
