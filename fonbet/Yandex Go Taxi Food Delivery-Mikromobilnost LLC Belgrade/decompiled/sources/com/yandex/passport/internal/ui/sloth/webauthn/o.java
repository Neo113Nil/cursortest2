package com.yandex.passport.internal.ui.sloth.webauthn;

import defpackage.w511;
import defpackage.ymi0;

/* loaded from: classes2.dex */
public final class o implements ymi0 {
    public static final o a = new o();

    @Override // defpackage.ymi0
    public final Object a(Object obj, Object obj2) {
        RegisterWebAuthNViewModel$State registerWebAuthNViewModel$State = (RegisterWebAuthNViewModel$State) obj;
        n nVar = (n) obj2;
        if (nVar instanceof m) {
            return RegisterWebAuthNViewModel$State.copy$default(registerWebAuthNViewModel$State, null, null, ((m) nVar).a, 3, null);
        }
        if (nVar instanceof l) {
            l lVar = (l) nVar;
            return RegisterWebAuthNViewModel$State.copy$default(registerWebAuthNViewModel$State, Integer.valueOf(lVar.a), lVar.b, null, 4, null);
        }
        w511.b();
        return null;
    }
}
