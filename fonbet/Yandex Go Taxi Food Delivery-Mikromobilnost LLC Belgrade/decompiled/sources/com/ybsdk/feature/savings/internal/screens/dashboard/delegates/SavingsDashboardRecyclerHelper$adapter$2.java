package com.ybsdk.feature.savings.internal.screens.dashboard.delegates;

import defpackage.tls;
import defpackage.z2m0;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class SavingsDashboardRecyclerHelper$adapter$2 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str = (String) obj;
        LinkedHashMap linkedHashMap = ((b) this.receiver).a;
        Object obj2 = linkedHashMap.get(str);
        if (obj2 == null) {
            obj2 = new z2m0();
            linkedHashMap.put(str, obj2);
        }
        return (z2m0) obj2;
    }
}
