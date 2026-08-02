package xsna;

import android.content.DialogInterface;
import xsna.msf0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class b3a0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b3a0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.b) {
            case 0:
                ((d3a0) this.c).z.finish();
                break;
            case 1:
                ((g880) this.c).invoke();
                break;
            default:
                ((rsf0) this.c).d.invoke(msf0.h.b);
                break;
        }
    }
}
