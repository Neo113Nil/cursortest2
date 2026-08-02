package defpackage;

import com.yandex.go.address.models.Address;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public final class hdl0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ idl0 b;

    public /* synthetic */ hdl0(idl0 idl0Var, int i) {
        this.a = i;
        this.b = idl0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        idl0 idl0Var = this.b;
        switch (i) {
            case 0:
                int intValue = ((Number) obj).intValue();
                Address h = idl0Var.x.h();
                if (h != null) {
                    if (intValue != -1) {
                        ((adl0) idl0Var.Dg()).askUpdate(h, intValue);
                        break;
                    } else {
                        ((adl0) idl0Var.Dg()).askAdd(h);
                        break;
                    }
                }
                break;
            case 1:
                List list = (List) obj;
                idl0Var.getClass();
                if (!list.isEmpty()) {
                    mdl0 mdl0Var = idl0Var.J;
                    if (mdl0Var != null) {
                        ArrayList arrayList = (ArrayList) mdl0Var.z;
                        ArrayList e = mdl0Var.e(agu0.a(mdl0Var.a, list, (aah) mdl0Var.y, mdl0Var.b));
                        ArrayList arrayList2 = new ArrayList(e.size());
                        int i2 = 0;
                        while (i2 < arrayList.size() && i2 < e.size()) {
                            if (jl40.l(arrayList.get(i2), e.get(i2))) {
                                arrayList2.add(arrayList.get(i2));
                            } else {
                                arrayList2.add(e.get(i2));
                            }
                            i2++;
                        }
                        if (i2 < e.size()) {
                            arrayList2.addAll(e.subList(i2, e.size()));
                        }
                        mdl0Var.z = arrayList2;
                        ((adl0) idl0Var.Dg()).onStopsUpdated(new ecl0(arrayList, arrayList2), false);
                        break;
                    }
                } else {
                    ((adl0) idl0Var.Dg()).close();
                    break;
                }
                break;
            default:
                List list2 = (List) obj;
                idl0Var.x.c(list2);
                if (list2.isEmpty() && idl0Var.Eg()) {
                    ((adl0) idl0Var.Dg()).close();
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
