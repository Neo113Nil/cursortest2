package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.dto.profile.Address;
import com.vk.dto.profile.PlainAddress;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class zd10 implements izs {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ae10 c;

    public /* synthetic */ zd10(boolean z, ae10 ae10Var) {
        this.b = z;
        this.c = ae10Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ae10 ae10Var = this.c;
        HashMap<Integer, Address> hashMap = ae10Var.f;
        ArrayList<PlainAddress> arrayList = ae10Var.e;
        VKList<Address> vKList = (VKList) obj;
        if (this.b) {
            arrayList.clear();
            hashMap.clear();
            ae10Var.g = 0;
        }
        arrayList.addAll(vKList);
        for (Address address : vKList) {
            hashMap.put(Integer.valueOf(address.b), address);
        }
        pro0.f(new m1i(ae10Var, 29));
        return vKList;
    }
}
