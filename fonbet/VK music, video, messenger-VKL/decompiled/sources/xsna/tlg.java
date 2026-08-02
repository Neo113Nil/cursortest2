package xsna;

import android.content.DialogInterface;
import com.vk.attachpicker.impl.graffiti.presentation.GraffitiDrawingFragment;
import com.vk.video.profile.presentation.a;
import xsna.nbu;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class tlg implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tlg(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                ((wlg) obj).c.invoke(a.e.b);
                break;
            default:
                GraffitiDrawingFragment graffitiDrawingFragment = (GraffitiDrawingFragment) obj;
                int i3 = GraffitiDrawingFragment.Q;
                graffitiDrawingFragment.getClass();
                xn50.a.c(graffitiDrawingFragment, nbu.c.b);
                break;
        }
    }
}
