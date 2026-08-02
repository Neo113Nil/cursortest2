package com.yandex.go.superapp.discovery.map.impl.ui.main;

import defpackage.fwv0;
import defpackage.g8e;
import defpackage.o61;
import defpackage.tls;
import defpackage.wuo;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* synthetic */ class SuperAppDiscoveryMapModalView$onAttachedToWindow$1$7 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        wuo wuoVar = ((fwv0) this.receiver).M;
        o61 o61Var = wuoVar.a;
        o61Var.getClass();
        HashMap hashMap = new HashMap();
        o61Var.a.a("Explorer.Button.Tapped", hashMap, 1, g8e.v(hashMap, "hasBackgroundPermission", Boolean.TRUE));
        r0 r0Var = wuoVar.d;
        r0Var.getClass();
        r0Var.m(null, bool);
        return zy11.a;
    }
}
