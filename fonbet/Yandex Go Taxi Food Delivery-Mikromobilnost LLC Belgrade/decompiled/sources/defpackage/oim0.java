package defpackage;

import com.ybsdk.core.common.domain.entities.CommonSheetEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.main.internal.domain.entities.sbpPartners.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class oim0 implements ev31 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ev31
    public final Object q(Object obj) {
        tev tevVar;
        Text.Constant constant;
        vf51 vf51Var;
        gu5 gu5Var;
        boolean z;
        String str;
        du5 du5Var;
        String str2;
        String str3;
        String str4;
        u8j0 u8j0Var = ((vem0) obj).a;
        tev tevVar2 = null;
        if (!(u8j0Var instanceof r8j0)) {
            if (u8j0Var instanceof s8j0) {
                return new kim0(r501.a(((s8j0) u8j0Var).a, null, null, null, null, null, null, null, null, null, null, null, null, 65534));
            }
            if (u8j0Var instanceof t8j0) {
                return new lim0(Collections.singletonList(zhm0.c));
            }
            w511.b();
            return null;
        }
        wem0 wem0Var = (wem0) ((r8j0) u8j0Var).a;
        ArrayList arrayList = wem0Var.e;
        String str5 = wem0Var.b;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            nhm0 nhm0Var = ((ohm0) it.next()).a;
            Status status = nhm0Var.h;
            hu5 hu5Var = nhm0Var.g;
            String str6 = nhm0Var.c;
            String str7 = nhm0Var.d;
            rbv f = job1.f(nhm0Var.e, new i1m0(22));
            if (f == null) {
                f = new nbv(txg0.ybsdk_ic_yb_placeholder, tevVar2);
            }
            boolean z2 = nhm0Var.a;
            String str8 = nhm0Var.b;
            Text.Constant i = (hu5Var == null || (str4 = hu5Var.a) == null) ? tevVar2 : g8e.i(Text.Companion, str4);
            Text.Constant i2 = (hu5Var == null || (str3 = hu5Var.b) == null) ? tevVar2 : g8e.i(Text.Companion, str3);
            if (hu5Var == null || (du5Var = hu5Var.c) == null || (str2 = du5Var.a) == null) {
                tevVar = tevVar2;
                constant = tevVar;
            } else {
                tevVar = tevVar2;
                constant = g8e.i(Text.Companion, str2);
            }
            gu5 gu5Var2 = new gu5(i, i2, constant, (hu5Var == null || (str = hu5Var.d) == null) ? tevVar : g8e.i(Text.Companion, str));
            qhm0 qhm0Var = nhm0Var.f;
            if (qhm0Var != null) {
                CommonSheetEntity commonSheetEntity = qhm0Var.a;
                vf51Var = new vf51(commonSheetEntity != null ? new fu5(commonSheetEntity.getTitle(), commonSheetEntity.getDescription(), commonSheetEntity.getPrimaryButton().getText(), null, commonSheetEntity.getPrimaryButton().getDeeplink()) : tevVar);
            } else {
                vf51Var = tevVar;
            }
            Status status2 = nhm0Var.h;
            if (status2 == Status.BINDING) {
                z = true;
                gu5Var = gu5Var2;
            } else {
                gu5Var = gu5Var2;
                z = false;
            }
            arrayList2.add(new phm0(status, str6, str7, f, z2, str8, gu5Var, vf51Var, z, status2 == Status.DEFAULT));
            tevVar2 = tevVar;
        }
        return !arrayList2.isEmpty() ? new mim0(str5, arrayList2, wem0Var.d) : new jim0(unr0.h(Text.Companion, dzh0.ybsdk_sbp_account_bank_not_found_error), str5);
    }
}
