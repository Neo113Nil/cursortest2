package com.yandex.go.superapp.web.modal;

import defpackage.ck7;
import defpackage.czo0;
import defpackage.fvt;
import defpackage.gcn;
import defpackage.hbp0;
import defpackage.i7w0;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.lvt;
import defpackage.ma41;
import defpackage.pvt;
import defpackage.pzt0;
import defpackage.rwq0;
import defpackage.s6j0;
import defpackage.v6j0;
import defpackage.zut;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.activity.MainActivity;

/* loaded from: classes5.dex */
public final class m implements ma41 {
    public final MainActivity a;
    public final fvt b;
    public final i7w0 c;
    public final ma41 w;
    public final hbp0 x;
    public pzt0 y;

    public m(MainActivity mainActivity, fvt fvtVar, i7w0 i7w0Var, ma41 ma41Var) {
        this.a = mainActivity;
        this.b = fvtVar;
        this.c = i7w0Var;
        this.w = ma41Var;
        hbp0 hbp0Var = new hbp0(new czo0(14), "WebApiPaymentsDelegate", null);
        hbp0Var.a();
        this.x = hbp0Var;
    }

    @Override // defpackage.ma41
    public final void a(rwq0 rwq0Var) {
        this.w.a(rwq0Var);
    }

    public final void b(s6j0 s6j0Var, gcn gcnVar) {
        if (!c(s6j0Var != null ? s6j0Var.a : null, s6j0Var != null ? s6j0Var.b : null, true)) {
            gcnVar.a(new ck7(new pvt(false), null));
            return;
        }
        pzt0 pzt0Var = this.y;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.y = kotlinx.coroutines.flow.e.H(this.x.c(), new jqr(new kotlinx.coroutines.flow.o(new d(new b(((com.yandex.go.payments.googlepay.domain.e) this.b).e())), new WebApiPaymentsDelegate$isGooglePaySupported$3(3, null)), new WebApiPaymentsDelegate$isGooglePaySupported$4(2, gcnVar, gcn.class, "onResult", "onResult(Lru/yandex/taxi/eatskit/dto/CallResult;)V", 4), 3));
    }

    public final boolean c(String str, String str2, boolean z) {
        i7w0 i7w0Var = this.c;
        Map map = i7w0Var.a;
        Map map2 = i7w0Var.a;
        if (map.isEmpty()) {
            return false;
        }
        if (z && ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0))) {
            return true;
        }
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return false;
        }
        if (map2.isEmpty()) {
            return true;
        }
        for (String str3 : map2.keySet()) {
            if (jl40.l(str3, str2)) {
                List list = (List) map2.get(str3);
                if (list == null) {
                    list = EmptyList.a;
                }
                if (list.contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d(v6j0 v6j0Var, gcn gcnVar) {
        zut zutVar;
        lvt lvtVar;
        int i = 225;
        String str = null;
        if (v6j0Var == null) {
            zutVar = new zut(i, str, 6);
            lvtVar = lvt.f;
        } else {
            Boolean bool = v6j0Var.g;
            Integer num = v6j0Var.a;
            if (num == null) {
                num = 225;
            }
            zut zutVar2 = new zut(num.intValue(), v6j0Var.d, bool != null ? bool.booleanValue() : true);
            if (bool != null ? bool.booleanValue() : true) {
                String str2 = v6j0Var.b;
                String str3 = v6j0Var.c;
                String str4 = v6j0Var.e;
                String str5 = v6j0Var.f;
                List list = v6j0Var.h;
                if (list == null) {
                    list = EmptyList.a;
                }
                lvt lvtVar2 = new lvt(str2, str3, str4, str5, list);
                zutVar = zutVar2;
                lvtVar = lvtVar2;
            } else {
                i7w0 i7w0Var = this.c;
                String str6 = (String) kotlin.collections.a.Q(i7w0Var.a.keySet());
                List list2 = (List) i7w0Var.a.get(str6);
                lvt lvtVar3 = new lvt(list2 != null ? (String) kotlin.collections.a.R(list2) : null, str6, v6j0Var.e, v6j0Var.f);
                zutVar = zutVar2;
                lvtVar = lvtVar3;
            }
        }
        com.yandex.go.payments.googlepay.domain.e eVar = (com.yandex.go.payments.googlepay.domain.e) this.b;
        if (!eVar.m(this.a, false, lvtVar)) {
            gcnVar.a(new ck7(new IllegalStateException("selectGooglePayCard error")));
            return;
        }
        pzt0 pzt0Var = this.y;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.y = kotlinx.coroutines.flow.e.H(this.x.c(), new jqr(new kotlinx.coroutines.flow.o(kotlinx.coroutines.flow.e.X(new com.yandex.go.payments.googlepay.domain.b(eVar.h()), new WebApiPaymentsDelegate$requestGooglePayToken$$inlined$flatMapLatest$1(null, this, lvtVar, zutVar)), new WebApiPaymentsDelegate$requestGooglePayToken$2(3, null)), new WebApiPaymentsDelegate$requestGooglePayToken$3(gcnVar, null), 3));
    }
}
