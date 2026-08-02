package defpackage;

import com.yandex.go.scooters.parking.d;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import ru.yandex.taxi.logistics.sdk.payment_method_selector.ui.a;

/* loaded from: classes5.dex */
public final /* synthetic */ class i7a0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ i7a0(ArrayList arrayList) {
        this.a = 2;
        this.b = arrayList;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        ArrayList arrayList = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                a.b(arrayList, (fid) obj, vng.O(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                d.g(arrayList, (fid) obj, vng.O(1));
                break;
            default:
                Set set = (Set) obj2;
                if (set != null) {
                    LinkedHashSet f = v4r0.f(v4r0.g(set, arrayList), "UnifiedPollingRepositoryImpl:SPECIAL_ONE_TIME_ID");
                    if (!f.isEmpty()) {
                    }
                }
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ i7a0(int i, int i2, ArrayList arrayList) {
        this.a = i2;
        this.b = arrayList;
    }
}
