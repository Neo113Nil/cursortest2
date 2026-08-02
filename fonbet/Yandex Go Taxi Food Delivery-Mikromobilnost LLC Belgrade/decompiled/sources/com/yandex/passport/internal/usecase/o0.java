package com.yandex.passport.internal.usecase;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class o0 {
    public final com.yandex.passport.internal.core.accounts.t a;

    public o0(com.yandex.passport.internal.core.accounts.t tVar) {
        this.a = tVar;
    }

    public final ArrayList a(androidx.core.app.d1 d1Var) {
        List J0 = kotlin.collections.a.J0(this.a.a(d1Var.c()).values());
        ArrayList arrayList = new ArrayList();
        for (Object obj : J0) {
            com.yandex.passport.internal.entities.k kVar = (com.yandex.passport.internal.entities.k) obj;
            if (d1Var.d().getSupportedAccountTypes().contains(com.yandex.passport.internal.ui.c.H(kVar.a()))) {
                if (((ArrayList) d1Var.f()).contains(kVar.c())) {
                    if (!((ArrayList) d1Var.e()).contains(kVar.d())) {
                        arrayList.add(obj);
                    }
                }
            }
        }
        return arrayList;
    }
}
