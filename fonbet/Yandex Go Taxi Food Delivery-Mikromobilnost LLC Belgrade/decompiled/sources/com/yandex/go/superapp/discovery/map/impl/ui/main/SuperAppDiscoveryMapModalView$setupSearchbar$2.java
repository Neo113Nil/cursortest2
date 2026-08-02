package com.yandex.go.superapp.discovery.map.impl.ui.main;

import defpackage.a60;
import defpackage.fwv0;
import defpackage.hxx;
import defpackage.lgw0;
import defpackage.m950;
import defpackage.n4w0;
import defpackage.o4w0;
import defpackage.ovv0;
import defpackage.qu;
import defpackage.sy60;
import defpackage.tls;
import defpackage.v4w0;
import defpackage.v770;
import defpackage.w4w0;
import defpackage.w511;
import defpackage.wor0;
import defpackage.x4w0;
import defpackage.y4w0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* synthetic */ class SuperAppDiscoveryMapModalView$setupSearchbar$2 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        y4w0 y4w0Var = (y4w0) obj;
        wor0 wor0Var = ((fwv0) this.receiver).x;
        ovv0 ovv0Var = (ovv0) wor0Var.a;
        if (y4w0Var instanceof v4w0) {
            ovv0Var.r(new qu(9));
        } else if (y4w0Var instanceof x4w0) {
            o4w0 o4w0Var = ((n4w0) ovv0Var.M.get()).a;
            o4w0Var.E((m950) o4w0Var.Q.get(), lgw0.a, sy60.Q2, hxx.a);
            wor0Var.f();
        } else {
            if (!(y4w0Var instanceof w4w0)) {
                w511.b();
                return null;
            }
            ((a60) ovv0Var.L).c(((w4w0) y4w0Var).a, v770.c);
            wor0Var.f();
        }
        return zy11.a;
    }
}
