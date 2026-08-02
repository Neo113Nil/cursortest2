package defpackage;

import com.ybsdk.core.utils.ColorModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes3.dex */
public final class ccm0 implements ev31 {
    public static final ColorModel.Attr a = new ColorModel.Attr(ung0.ybColor_fill_default_50);

    @Override // defpackage.ev31
    public final Object q(Object obj) {
        yon yonVar;
        fbm0 fbm0Var = (fbm0) obj;
        int i = bcm0.a[fbm0Var.a.ordinal()];
        ColorModel.Attr attr = a;
        if (i == 1) {
            return new icm0(attr);
        }
        if (i == 2) {
            return new hcm0(r501.a(fbm0Var.e, null, null, null, null, null, null, null, null, null, null, null, null, 65534), attr);
        }
        if (i != 3) {
            w511.b();
            return null;
        }
        lam0 lam0Var = fbm0Var.d;
        if (lam0Var == null) {
            x4c.g("Wrong state of SavingsDashboardViewStateV4: data is null", null, null, Collections.singletonList(lrp0.B), 6);
            return new hcm0(r501.a(fbm0Var.e, null, null, null, null, null, null, null, null, null, null, null, null, 65534), attr);
        }
        ColorModel colorModel = lam0Var.f;
        List list = lam0Var.b;
        List list2 = lam0Var.e;
        jam0 jam0Var = lam0Var.a;
        if (list2.isEmpty()) {
            return new kcm0(new jcm0(jam0Var.a, jam0Var.b, jam0Var.d, jam0Var.f), list, colorModel);
        }
        boolean z = fbm0Var.b;
        boolean z2 = fbm0Var.c;
        fcm0 fcm0Var = new fcm0(jam0Var.a, jam0Var.b, jam0Var.c.getFormattedAmount(), jam0Var.d, jam0Var.f);
        List<kam0> list3 = list2;
        ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
        for (kam0 kam0Var : list3) {
            String str = kam0Var.a;
            arrayList.add(new tdm0(kam0Var.d, kam0Var.e, kam0Var.f, kam0Var.b, kam0Var.c, str, kam0Var.g, kam0Var.h, kam0Var.i));
            list = list;
        }
        ArrayList m0 = a.m0(list, arrayList);
        kpn kpnVar = (kpn) a.R(lam0Var.c);
        if (kpnVar != null) {
            if (!z) {
                kpnVar = null;
            }
            if (kpnVar != null) {
                yonVar = new yon(lfp0.b, kpnVar, false, 48);
                return new gcm0(fcm0Var, m0, yonVar, z2, colorModel);
            }
        }
        yonVar = null;
        return new gcm0(fcm0Var, m0, yonVar, z2, colorModel);
    }
}
