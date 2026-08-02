package com.yandex.go.scooters.onboarding.agreement;

import defpackage.exm0;
import defpackage.hxm0;
import defpackage.jxm0;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* synthetic */ class ScootersAgreementModalView$initAcceptList$adapter$1 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        jxm0 jxm0Var = (jxm0) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        hxm0 hxm0Var = (hxm0) this.receiver;
        ArrayList arrayList = hxm0Var.y;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it.next();
            if (((jxm0) obj3).a.equals(jxm0Var.a)) {
                break;
            }
        }
        int indexOf = arrayList.indexOf(obj3);
        if (indexOf != -1) {
            hxm0Var.y.set(indexOf, jxm0.a(jxm0Var, booleanValue));
            ((exm0) hxm0Var.Dg()).n2(hxm0Var.Kg());
            exm0 exm0Var = (exm0) hxm0Var.Dg();
            ArrayList arrayList2 = hxm0Var.y;
            boolean z = true;
            if (arrayList2 == null || !arrayList2.isEmpty()) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!((jxm0) it2.next()).d) {
                        z = false;
                        break;
                    }
                }
            }
            exm0Var.Fe(z);
        }
        return zy11.a;
    }
}
