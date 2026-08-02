package com.yandex.go.taxi.summary.interactor;

import com.yandex.go.zone.dto.objects.VerticalMode;
import defpackage.b1h0;
import defpackage.jl40;
import defpackage.kb5;
import defpackage.m7x0;
import defpackage.ny61;
import defpackage.oa31;
import defpackage.ogv0;
import defpackage.u8u;
import defpackage.vpr;
import defpackage.ygv0;
import defpackage.za31;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ g b;
    public final /* synthetic */ u8u c;

    public e(vpr vprVar, g gVar, u8u u8uVar) {
        this.a = vprVar;
        this.b = gVar;
        this.c = u8uVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SummaryHeaderUIStateInteractor$verticalHeader$$inlined$map$1$2$1 summaryHeaderUIStateInteractor$verticalHeader$$inlined$map$1$2$1;
        int i;
        Object obj2;
        String str;
        if (continuation instanceof SummaryHeaderUIStateInteractor$verticalHeader$$inlined$map$1$2$1) {
            summaryHeaderUIStateInteractor$verticalHeader$$inlined$map$1$2$1 = (SummaryHeaderUIStateInteractor$verticalHeader$$inlined$map$1$2$1) continuation;
            int i2 = summaryHeaderUIStateInteractor$verticalHeader$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryHeaderUIStateInteractor$verticalHeader$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = summaryHeaderUIStateInteractor$verticalHeader$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryHeaderUIStateInteractor$verticalHeader$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    kb5 kb5Var = (kb5) obj;
                    g gVar = this.b;
                    com.yandex.go.taxi.tariffs.internal.repository.k kVar = (com.yandex.go.taxi.tariffs.internal.repository.k) gVar.e;
                    Iterator it = kVar.j().a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (jl40.l(((za31) obj2).a.a, kb5Var.a)) {
                            break;
                        }
                    }
                    za31 za31Var = (za31) obj2;
                    oa31 oa31Var = za31Var != null ? za31Var.a : null;
                    boolean z = kVar.j().b == VerticalMode.SELECTOR;
                    u8u u8uVar = this.c;
                    String str2 = u8uVar.c;
                    String a = str2 != null ? ((m7x0) gVar.d).a(str2) : null;
                    if (oa31Var == null || !z) {
                        str = u8uVar.w;
                    } else {
                        str = oa31Var.k;
                        String a2 = gVar.c.a(oa31Var.j);
                        if (a2 != null) {
                            a = a2;
                        }
                    }
                    String str3 = str;
                    String str4 = a;
                    int i3 = b1h0.ic_vertical_header_default;
                    ogv0 ogv0Var = new ogv0(u8uVar.a, u8uVar.b);
                    String str5 = str3.length() == 0 ? oa31Var != null ? oa31Var.d : null : str3;
                    if (str5 == null) {
                        str5 = "";
                    }
                    ygv0 ygv0Var = new ygv0(str3, str4, i3, ogv0Var, str5);
                    summaryHeaderUIStateInteractor$verticalHeader$$inlined$map$1$2$1.L$0 = null;
                    summaryHeaderUIStateInteractor$verticalHeader$$inlined$map$1$2$1.L$1 = null;
                    summaryHeaderUIStateInteractor$verticalHeader$$inlined$map$1$2$1.L$2 = null;
                    summaryHeaderUIStateInteractor$verticalHeader$$inlined$map$1$2$1.L$3 = null;
                    summaryHeaderUIStateInteractor$verticalHeader$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(ygv0Var, summaryHeaderUIStateInteractor$verticalHeader$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        summaryHeaderUIStateInteractor$verticalHeader$$inlined$map$1$2$1 = new SummaryHeaderUIStateInteractor$verticalHeader$$inlined$map$1$2$1(this, continuation);
        Object obj32 = summaryHeaderUIStateInteractor$verticalHeader$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryHeaderUIStateInteractor$verticalHeader$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
