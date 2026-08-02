package com.yandex.go.ui;

import defpackage.ecp0;
import defpackage.pr21;
import defpackage.sr21;
import defpackage.tan;
import defpackage.tr21;
import defpackage.wls;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class UserPhotoUploadingPresenter$attachView$5 extends AdaptedFunctionReference implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        tr21 tr21Var = (tr21) obj;
        d dVar = (d) this.receiver;
        dVar.getClass();
        ecp0 ecp0Var = tr21Var instanceof pr21 ? ((pr21) tr21Var).a : tr21Var instanceof sr21 ? ((sr21) tr21Var).a : null;
        String str = dVar.O;
        if ((ecp0Var != null ? ecp0Var.e : null) != null && str != null && !dVar.N) {
            dVar.N = true;
            tan tanVar = ((com.yandex.go.agreement.photoupload.a) dVar.I).c;
            tanVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("id", str);
            tanVar.a.a("EULA.Shown", hashMap, 1, new HashMap());
        }
        return zy11.a;
    }
}
