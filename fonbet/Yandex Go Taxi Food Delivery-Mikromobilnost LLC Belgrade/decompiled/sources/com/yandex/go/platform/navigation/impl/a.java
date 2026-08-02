package com.yandex.go.platform.navigation.impl;

import android.content.Context;
import defpackage.i3y;
import defpackage.lb20;
import defpackage.r650;
import defpackage.sls;
import defpackage.unr0;
import defpackage.v650;
import defpackage.xg41;
import defpackage.xv10;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes13.dex */
public final class a implements v650 {
    public final xv10 a;
    public final r650 b = new r650();
    public final com.yandex.go.platform.navigation.web.stub.a c;
    public final i3y d;
    public final i3y e;
    public final i3y f;

    public a(xv10 xv10Var) {
        this.a = xv10Var;
        ((xg41) xv10Var.x).getClass();
        this.c = com.yandex.go.platform.navigation.web.stub.a.a;
        this.d = kotlin.a.a(new sls() { // from class: com.yandex.go.platform.navigation.impl.NavigationComponentImpl$navigationPresenter$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                a aVar = a.this;
                xv10 xv10Var2 = aVar.a;
                Context context = (Context) xv10Var2.a;
                List list = (List) xv10Var2.c;
                r650 r650Var = aVar.b;
                aVar.c.getClass();
                return new c(context, list, r650Var);
            }
        });
        this.e = kotlin.a.a(new sls() { // from class: com.yandex.go.platform.navigation.impl.NavigationComponentImpl$navigator$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                a aVar = a.this;
                xv10 xv10Var2 = aVar.a;
                return new d((lb20) xv10Var2.w, (Context) xv10Var2.a, (sls) xv10Var2.b, (c) aVar.d.getValue(), a.this.c.a());
            }
        });
        this.f = kotlin.a.a(new sls() { // from class: com.yandex.go.platform.navigation.impl.NavigationComponentImpl$jsNativeApiFunctions$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                List list = (List) a.this.a.c;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    throw unr0.i(it);
                }
                a.this.c.getClass();
                return kotlin.collections.a.m0(EmptyList.a, arrayList);
            }
        });
    }
}
