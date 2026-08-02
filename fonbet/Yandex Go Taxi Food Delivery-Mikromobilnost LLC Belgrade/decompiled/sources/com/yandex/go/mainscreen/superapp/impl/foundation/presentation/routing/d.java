package com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing;

import com.yandex.go.dto.response.h1;
import com.yandex.go.dto.response.q1;
import defpackage.hxx;
import defpackage.jl40;
import defpackage.lgw0;
import defpackage.m950;
import defpackage.o4w0;
import defpackage.sy60;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class d implements vpr {
    public final /* synthetic */ o4w0 a;

    public d(o4w0 o4w0Var) {
        this.a = o4w0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        q1 q1Var = (q1) obj;
        boolean l = jl40.l(q1Var, h1.INSTANCE);
        o4w0 o4w0Var = this.a;
        if (l) {
            o4w0Var.E((m950) o4w0Var.Q.get(), lgw0.a, sy60.Q2, hxx.a);
        } else {
            com.yandex.go.coroutines.b.g(o4w0Var.o(), null, null, new SuperAppMainScreenViewRouter$InnerNavigator$showSearchbar$1$1$1$1(o4w0Var, q1Var, null), 3);
        }
        return zy11.a;
    }
}
