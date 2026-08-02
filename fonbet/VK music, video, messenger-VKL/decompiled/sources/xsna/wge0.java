package xsna;

import com.vk.dto.common.PaymentType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PurchasesUtils.java */
/* loaded from: classes14.dex */
public final class wge0 {
    public static void a(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            mge0 mge0Var = (mge0) it.next();
            if (mge0Var != null && mge0Var.ma() && mge0Var.u3() == PaymentType.Inapp) {
                hashMap.put(mge0Var.L4(), mge0Var);
            }
        }
        if (hashMap.isEmpty()) {
            return;
        }
        vx2.d.f(hashMap);
    }
}
