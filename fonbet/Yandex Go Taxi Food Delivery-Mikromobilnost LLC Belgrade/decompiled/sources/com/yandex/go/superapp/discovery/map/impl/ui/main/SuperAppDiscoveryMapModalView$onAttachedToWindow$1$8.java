package com.yandex.go.superapp.discovery.map.impl.ui.main;

import defpackage.fwv0;
import defpackage.g8e;
import defpackage.o61;
import defpackage.sls;
import defpackage.wuo;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* synthetic */ class SuperAppDiscoveryMapModalView$onAttachedToWindow$1$8 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        wuo wuoVar = ((fwv0) this.receiver).M;
        o61 o61Var = wuoVar.a;
        o61Var.getClass();
        HashMap hashMap = new HashMap();
        o61Var.a.a("Explorer.Button.Tapped", hashMap, 1, g8e.v(hashMap, "hasBackgroundPermission", Boolean.FALSE));
        kotlinx.coroutines.channels.a aVar = wuoVar.f;
        zy11 zy11Var = zy11.a;
        aVar.d(zy11Var);
        return zy11Var;
    }
}
