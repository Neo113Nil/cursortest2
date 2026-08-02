package xsna;

import com.vk.dto.group.AdminLeaveAction;
import com.vk.dto.group.Group;
import com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesScreenKt;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class iy7 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ iy7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                List list = (List) this.c;
                yvj yvjVar = (yvj) this.d;
                yjl yjlVar = (yjl) this.e;
                rg50 rg50Var = (rg50) this.f;
                rg50 rg50Var2 = (rg50) this.g;
                int intValue = ((Integer) obj).intValue();
                Iterator it = list.iterator();
                int i = 0;
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (i < 0) {
                            e43.t();
                            throw null;
                        }
                        if (intValue >= ((Integer) next).intValue()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                Integer valueOf = i == -1 ? null : Integer.valueOf(i);
                int intValue2 = valueOf != null ? valueOf.intValue() : 0;
                myc0.h(yvjVar, null, null, new BookingServicesScreenKt.c(yjlVar, intValue2, null), 3);
                Pair pair = (list.isEmpty() || intValue2 > e43.h(list)) ? new Pair(0, 0) : intValue2 == 0 ? new Pair(0, list.get(0)) : new Pair(list.get(intValue2 - 1), list.get(intValue2));
                rg50Var.C(((Number) pair.i()).intValue());
                rg50Var2.C(((Number) pair.j()).intValue());
                return s3q0.a;
            default:
                j7h j7hVar = (j7h) this.c;
                oap<ExtendedCommunityProfile, ? extends Group> oapVar = (oap) this.d;
                String str = (String) this.e;
                AdminLeaveAction adminLeaveAction = (AdminLeaveAction) this.f;
                String str2 = (String) this.g;
                ((Integer) obj).intValue();
                j7hVar.d(oapVar, str, adminLeaveAction, str2);
                return s3q0.a;
        }
    }
}
