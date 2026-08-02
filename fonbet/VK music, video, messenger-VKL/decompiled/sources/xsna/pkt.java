package xsna;

import com.vk.geo.impl.presentation.GeoFragment;
import com.vk.geo.impl.presentation.a;
import com.vk.permission.PermissionHelper;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class pkt implements ua0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pkt(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.ua0
    public final void onActivityResult(Object obj) {
        boolean z;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                GeoFragment geoFragment = (GeoFragment) obj2;
                Map<String, Boolean> map = (Map) obj;
                qcy<Object>[] qcyVarArr = GeoFragment.c0;
                PermissionHelper.a.getClass();
                String[] strArr = PermissionHelper.i;
                int length = strArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z = false;
                    } else if (epx.f(map.get(strArr[i2]), Boolean.TRUE)) {
                        z = true;
                    } else {
                        i2++;
                    }
                }
                yl00 yl00Var = geoFragment.b0;
                if (yl00Var != null) {
                    yl00Var.b(map);
                }
                geoFragment.getFeature().C(new a.h.c(z));
                if (!z) {
                    geoFragment.io();
                    break;
                }
                break;
            default:
                ((dvt) obj2).o();
                break;
        }
    }
}
