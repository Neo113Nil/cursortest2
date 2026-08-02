package com.yandex.div.core.dagger;

import android.view.ContextThemeWrapper;
import com.yandex.div.core.c;
import com.yandex.div.core.dagger.Div2ViewComponent;
import com.yandex.div.core.expression.variables.a;
import com.yandex.div.core.tooltip.b;
import com.yandex.div.core.view2.f;
import com.yandex.div.core.view2.g;
import com.yandex.div.core.view2.i;
import defpackage.dpl;
import defpackage.e06;
import defpackage.f0d;
import defpackage.f3l;
import defpackage.hgk;
import defpackage.i0d;
import defpackage.ibl;
import defpackage.igy0;
import defpackage.iva0;
import defpackage.llu;
import defpackage.m6o;
import defpackage.nlk;
import defpackage.obk;
import defpackage.oil;
import defpackage.ujk;
import defpackage.vsi0;
import defpackage.wkk;
import defpackage.xhl;
import defpackage.y6k;
import defpackage.ynk;
import defpackage.z2k;
import defpackage.zkl0;
import defpackage.znl;

@i0d(isRoot = false)
/* loaded from: classes.dex */
public interface Div2Component {

    @f0d
    public interface Builder {
        Builder a(ContextThemeWrapper contextThemeWrapper);

        Builder b(ujk ujkVar);

        Div2Component build();

        Builder c(a aVar);

        Builder d(int i);

        Builder e(wkk wkkVar);
    }

    void A();

    igy0 B();

    f3l C();

    boolean D();

    hgk E();

    c F();

    i G();

    m6o a();

    y6k b();

    zkl0 c();

    znl d();

    g e();

    wkk f();

    f g();

    a getDivVariableController();

    ibl getStateManager();

    void h();

    ynk i();

    nlk j();

    com.yandex.div.core.expression.storedvalues.a k();

    llu l();

    e06 m();

    obk n();

    com.yandex.div.core.view2.divs.c o();

    iva0 p();

    dpl q();

    Div2ViewComponent.Builder r();

    com.yandex.div.internal.viewpool.optimization.a s();

    b t();

    boolean u();

    z2k v();

    boolean w();

    xhl x();

    oil y();

    vsi0 z();
}
