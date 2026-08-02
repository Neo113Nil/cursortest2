package com.yandex.go.taxi.order.multi.shortcuts;

import com.yandex.go.shortcuts.dto.response.Layout;
import defpackage.avj0;
import defpackage.d1z;
import defpackage.d4s0;
import defpackage.mrg0;
import defpackage.ny61;
import defpackage.t3s0;
import defpackage.tje;
import defpackage.vpr;
import defpackage.w201;
import defpackage.yaf0;
import defpackage.zuj0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ e b;
    public final /* synthetic */ yaf0 c;

    public c(vpr vprVar, e eVar, yaf0 yaf0Var) {
        this.a = vprVar;
        this.b = eVar;
        this.c = yaf0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OrderShortcutViewSource$start$$inlined$map$1$2$1 orderShortcutViewSource$start$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof OrderShortcutViewSource$start$$inlined$map$1$2$1) {
            orderShortcutViewSource$start$$inlined$map$1$2$1 = (OrderShortcutViewSource$start$$inlined$map$1$2$1) continuation;
            int i2 = orderShortcutViewSource$start$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderShortcutViewSource$start$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = orderShortcutViewSource$start$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderShortcutViewSource$start$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List<w201> list = (List) obj;
                    zuj0 zuj0Var = this.b.b;
                    ArrayList arrayList = new ArrayList((list.size() * 2) + 1);
                    for (w201 w201Var : list) {
                        t3s0 t3s0Var = new t3s0(((avj0) zuj0Var).c(mrg0.go_design_s_space), 0, 12, false);
                        arrayList.add(w201Var);
                        arrayList.add(t3s0Var);
                    }
                    arrayList.add(new t3s0(tje.u(12, ((avj0) zuj0Var).a), 0, 12, false));
                    d4s0 d4s0Var = new d4s0(Layout.e, d1z.a, EmptyList.a, kotlin.collections.a.J0(arrayList), zzs.f, this.c, null, null, null, false, 4032);
                    orderShortcutViewSource$start$$inlined$map$1$2$1.L$0 = null;
                    orderShortcutViewSource$start$$inlined$map$1$2$1.L$1 = null;
                    orderShortcutViewSource$start$$inlined$map$1$2$1.L$2 = null;
                    orderShortcutViewSource$start$$inlined$map$1$2$1.L$3 = null;
                    orderShortcutViewSource$start$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(d4s0Var, orderShortcutViewSource$start$$inlined$map$1$2$1) == coroutineSingletons) {
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
        orderShortcutViewSource$start$$inlined$map$1$2$1 = new OrderShortcutViewSource$start$$inlined$map$1$2$1(this, continuation);
        Object obj22 = orderShortcutViewSource$start$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderShortcutViewSource$start$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
