package com.yandex.go.mainscreen.superapp.impl.foundation.presentation;

import android.content.Context;
import com.yandex.go.mainscreen.superapp.impl.header.presentation.logo.HeaderLogoView;
import defpackage.c0g;
import defpackage.f0w0;
import defpackage.i4w0;
import defpackage.k7x0;
import defpackage.mag;
import defpackage.ney;
import defpackage.pav;
import defpackage.pwy0;
import defpackage.q5z;
import defpackage.rqo;
import defpackage.sau;
import defpackage.sls;
import defpackage.tt2;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* synthetic */ class SuperAppMainScreenFlexModalView$initStickyHeader$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        mag magVar = (mag) ((i4w0) this.receiver);
        magVar.getClass();
        c0g c0gVar = (c0g) magVar.a;
        Context e2 = c0gVar.e2();
        q5z.h(e2);
        rqo l2 = c0gVar.l2();
        q5z.h(l2);
        tt2 Z1 = c0gVar.Z1();
        q5z.h(Z1);
        com.yandex.go.mainscreen.superapp.impl.header.domain.c cVar = new com.yandex.go.mainscreen.superapp.impl.header.domain.c(Z1, l2);
        pav w2 = c0gVar.w2();
        q5z.h(w2);
        k7x0 Z2 = c0gVar.Z2();
        q5z.h(Z2);
        ney y2 = c0gVar.y2();
        q5z.h(y2);
        sau sauVar = new sau(cVar, w2, Z2, y2);
        pwy0 c3 = c0gVar.c3();
        q5z.h(c3);
        f0w0 f0w0Var = (f0w0) c0gVar.z.Vn.get();
        q5z.h(f0w0Var);
        return new HeaderLogoView(e2, sauVar, c3, f0w0Var);
    }
}
