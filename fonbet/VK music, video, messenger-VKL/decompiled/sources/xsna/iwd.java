package xsna;

import android.content.DialogInterface;
import com.vk.voip.ui.sessionrooms.f;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class iwd implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iwd(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                ((ty0) this.c).invoke();
                break;
            case 1:
                ((gzs) this.c).invoke();
                break;
            default:
                f.a.b bVar = (f.a.b) this.c;
                com.vk.voip.ui.c.b.getClass();
                com.vk.voip.ui.c.B0.e(bVar);
                break;
        }
    }
}
