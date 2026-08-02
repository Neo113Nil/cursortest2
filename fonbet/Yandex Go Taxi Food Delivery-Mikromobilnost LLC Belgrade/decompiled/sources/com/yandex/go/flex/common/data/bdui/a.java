package com.yandex.go.flex.common.data.bdui;

import defpackage.bai0;
import defpackage.cmt;
import defpackage.fmt;
import defpackage.hhr;
import defpackage.ivj0;
import defpackage.keu;
import defpackage.ku00;
import defpackage.kwu;
import defpackage.m5j0;
import defpackage.meu;
import defpackage.ny61;
import defpackage.omt;
import defpackage.pmt;
import defpackage.qjr;
import defpackage.qmt;
import defpackage.rvj0;
import defpackage.s76;
import defpackage.w511;
import defpackage.wms;
import defpackage.x4j0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class a implements qjr {
    public final /* synthetic */ qmt a;
    public final /* synthetic */ b b;
    public final /* synthetic */ ku00 c;

    public a(qmt qmtVar, b bVar, ku00 ku00Var) {
        this.a = qmtVar;
        this.b = bVar;
        this.c = ku00Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.qjr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(omt omtVar, ContinuationImpl continuationImpl) {
        GoBDUIClient$execute$callInterceptor$1$intercept$1 goBDUIClient$execute$callInterceptor$1$intercept$1;
        int i;
        x4j0 x4j0Var;
        if (continuationImpl instanceof GoBDUIClient$execute$callInterceptor$1$intercept$1) {
            goBDUIClient$execute$callInterceptor$1$intercept$1 = (GoBDUIClient$execute$callInterceptor$1$intercept$1) continuationImpl;
            int i2 = goBDUIClient$execute$callInterceptor$1$intercept$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                goBDUIClient$execute$callInterceptor$1$intercept$1.label = i2 - Integer.MIN_VALUE;
                Object obj = goBDUIClient$execute$callInterceptor$1$intercept$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = goBDUIClient$execute$callInterceptor$1$intercept$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    x4j0 x4j0Var2 = omtVar.b;
                    if (!(this.a instanceof pmt)) {
                        w511.b();
                        return null;
                    }
                    hhr hhrVar = this.b.c;
                    kwu kwuVar = x4j0Var2.a;
                    meu meuVar = x4j0Var2.b;
                    s76 s76Var = x4j0Var2.c;
                    if (s76Var == null) {
                        ny61.g("Required value was null.");
                        return null;
                    }
                    int i3 = m5j0.a;
                    cmt<rvj0> a = hhrVar.a.a(kwuVar, meuVar, wms.a(s76Var.toString(), s76Var.getContentType()), null, this.c);
                    goBDUIClient$execute$callInterceptor$1$intercept$1.L$0 = null;
                    goBDUIClient$execute$callInterceptor$1$intercept$1.L$1 = x4j0Var2;
                    goBDUIClient$execute$callInterceptor$1$intercept$1.L$2 = null;
                    goBDUIClient$execute$callInterceptor$1$intercept$1.label = 1;
                    obj = ru.yandex.taxi.network.api.a.b(a, null, goBDUIClient$execute$callInterceptor$1$intercept$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    x4j0Var = x4j0Var2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    x4j0 x4j0Var3 = (x4j0) goBDUIClient$execute$callInterceptor$1$intercept$1.L$1;
                    kotlin.b.b(obj);
                    x4j0Var = x4j0Var3;
                }
                fmt fmtVar = (fmt) obj;
                Map map = fmtVar.e.a;
                keu keuVar = new keu();
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    Iterator it = ((List) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        keuVar.a(str, (String) it.next());
                    }
                }
                meu d = keuVar.d();
                int i4 = fmtVar.b;
                String str2 = fmtVar.c;
                rvj0 rvj0Var = (rvj0) fmtVar.a;
                return new ivj0(x4j0Var, d, i4, str2, new bai0(rvj0Var, rvj0Var.contentType()), fmtVar.g, fmtVar.h);
            }
        }
        goBDUIClient$execute$callInterceptor$1$intercept$1 = new GoBDUIClient$execute$callInterceptor$1$intercept$1(this, continuationImpl);
        Object obj2 = goBDUIClient$execute$callInterceptor$1$intercept$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = goBDUIClient$execute$callInterceptor$1$intercept$1.label;
        if (i != 0) {
        }
        fmt fmtVar2 = (fmt) obj2;
        Map map2 = fmtVar2.e.a;
        keu keuVar2 = new keu();
        while (r12.hasNext()) {
        }
        meu d2 = keuVar2.d();
        int i42 = fmtVar2.b;
        String str22 = fmtVar2.c;
        rvj0 rvj0Var2 = (rvj0) fmtVar2.a;
        return new ivj0(x4j0Var, d2, i42, str22, new bai0(rvj0Var2, rvj0Var2.contentType()), fmtVar2.g, fmtVar2.h);
    }
}
