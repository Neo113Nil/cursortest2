package xsna;

import android.content.Intent;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import xsna.z7k;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class b8k implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ b8k(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        izs izsVar = this.c;
        switch (i) {
            case 0:
                izsVar.invoke(new z7k.g((String) obj));
                break;
            case 1:
                int i2 = GalleryFragmentImpl.R0;
                izsVar.invoke((Intent) obj);
                break;
            default:
                tny tnyVar = (tny) obj;
                if (izsVar != null) {
                    izsVar.invoke(jgz.j(tnyVar, true));
                }
                break;
        }
        return s3q0.a;
    }
}
