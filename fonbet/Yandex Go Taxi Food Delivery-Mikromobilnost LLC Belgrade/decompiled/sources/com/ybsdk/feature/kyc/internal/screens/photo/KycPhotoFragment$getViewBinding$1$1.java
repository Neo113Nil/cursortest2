package com.ybsdk.feature.kyc.internal.screens.photo;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.em3;
import defpackage.onx;
import defpackage.pz40;
import defpackage.sls;
import defpackage.uc5;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class KycPhotoFragment$getViewBinding$1$1 extends FunctionReferenceImpl implements sls {
    public KycPhotoFragment$getViewBinding$1$1(uc5 uc5Var) {
        super(0, uc5Var, b.class, "onFlashToggle", "onFlashToggle()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        r0 r0Var;
        Object value;
        b bVar = (b) this.receiver;
        boolean z = !((onx) bVar.X()).f;
        em3 em3Var = bVar.I.F;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put(BackendConfig.Restrictions.ENABLED, Boolean.valueOf(z));
        em3Var.a.a("kyc_online.photo.click.light", linkedHashMap);
        pz40 Y = bVar.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, onx.a((onx) value, null, null, null, null, z, 0, false, 223)));
        return zy11.a;
    }
}
