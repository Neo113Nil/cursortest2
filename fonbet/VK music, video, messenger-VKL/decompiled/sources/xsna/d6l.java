package xsna;

import android.content.DialogInterface;
import com.vk.geo.impl.presentation.GeoFragment;
import com.vk.geo.impl.presentation.a;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class d6l implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d6l(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                dialogInterface.dismiss();
                ((c6l) obj).invoke();
                throw null;
            default:
                GeoFragment geoFragment = (GeoFragment) obj;
                qcy<Object>[] qcyVarArr = GeoFragment.c0;
                a.h.c cVar = new a.h.c(false);
                geoFragment.getClass();
                xn50.a.c(geoFragment, cVar);
                return;
        }
    }
}
