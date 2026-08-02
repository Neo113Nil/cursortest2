package com.yandex.go.information.domain;

import defpackage.avj0;
import defpackage.kyh0;
import defpackage.l5;
import defpackage.muq0;
import defpackage.n03;
import defpackage.ny61;
import defpackage.ouq0;
import defpackage.pwd0;
import defpackage.rcc;
import defpackage.vpr;
import defpackage.xl51;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.Collections;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes12.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ n03 b;

    public a(vpr vprVar, n03 n03Var) {
        this.a = vprVar;
        this.b = n03Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ApplicationServiceSource$services$$inlined$map$1$2$1 applicationServiceSource$services$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ApplicationServiceSource$services$$inlined$map$1$2$1) {
            applicationServiceSource$services$$inlined$map$1$2$1 = (ApplicationServiceSource$services$$inlined$map$1$2$1) continuation;
            int i2 = applicationServiceSource$services$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                applicationServiceSource$services$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = applicationServiceSource$services$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = applicationServiceSource$services$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    l5 l5Var = (l5) obj;
                    n03 n03Var = this.b;
                    zuj0 zuj0Var = n03Var.d;
                    String str = l5Var.b;
                    if (str == null) {
                        str = null;
                    }
                    String str2 = str == null ? "" : str;
                    String str3 = l5Var.c;
                    if (str3 == null) {
                        str3 = null;
                    }
                    String str4 = str3 == null ? "" : str3;
                    ListBuilder a = rcc.a();
                    int i3 = kyh0.about_license;
                    xl51 xl51Var = n03Var.c;
                    xl51Var.getClass();
                    a.add(new muq0(((avj0) zuj0Var).h(i3), xl51Var.a(xl51Var.c)));
                    a.add(new muq0(((avj0) zuj0Var).h(kyh0.about_privacy_policy), xl51Var.a(xl51Var.e)));
                    for (pwd0 pwd0Var : l5Var.d) {
                        a.add(new muq0(pwd0Var.a, pwd0Var.b));
                    }
                    List singletonList = Collections.singletonList(new ouq0(ClidProvider.APPLICATION, "", "", str2, str4, a.j()));
                    applicationServiceSource$services$$inlined$map$1$2$1.L$0 = null;
                    applicationServiceSource$services$$inlined$map$1$2$1.L$1 = null;
                    applicationServiceSource$services$$inlined$map$1$2$1.L$2 = null;
                    applicationServiceSource$services$$inlined$map$1$2$1.L$3 = null;
                    applicationServiceSource$services$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(singletonList, applicationServiceSource$services$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        applicationServiceSource$services$$inlined$map$1$2$1 = new ApplicationServiceSource$services$$inlined$map$1$2$1(this, continuation);
        Object obj22 = applicationServiceSource$services$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = applicationServiceSource$services$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
