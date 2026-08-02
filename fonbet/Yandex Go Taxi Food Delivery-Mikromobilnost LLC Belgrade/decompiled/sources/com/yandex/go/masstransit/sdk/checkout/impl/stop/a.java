package com.yandex.go.masstransit.sdk.checkout.impl.stop;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import defpackage.a22;
import defpackage.avj0;
import defpackage.byh0;
import defpackage.efu0;
import defpackage.egu0;
import defpackage.ehu0;
import defpackage.f6;
import defpackage.fhu0;
import defpackage.hhu0;
import defpackage.jl40;
import defpackage.khu0;
import defpackage.m5l0;
import defpackage.n5l0;
import defpackage.ny61;
import defpackage.o5l0;
import defpackage.p5l0;
import defpackage.phu0;
import defpackage.q5l0;
import defpackage.rcc;
import defpackage.rhu0;
import defpackage.scc;
import defpackage.shu0;
import defpackage.viu0;
import defpackage.vpr;
import defpackage.zuj0;
import defpackage.zvh0;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ f6 b;

    public a(vpr vprVar, f6 f6Var) {
        this.a = vprVar;
        this.b = f6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        StopSelectorUiStateInteractor$special$$inlined$map$1$2$1 stopSelectorUiStateInteractor$special$$inlined$map$1$2$1;
        int i;
        zuj0 zuj0Var;
        p5l0 m5l0Var;
        if (continuation instanceof StopSelectorUiStateInteractor$special$$inlined$map$1$2$1) {
            stopSelectorUiStateInteractor$special$$inlined$map$1$2$1 = (StopSelectorUiStateInteractor$special$$inlined$map$1$2$1) continuation;
            int i2 = stopSelectorUiStateInteractor$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stopSelectorUiStateInteractor$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = stopSelectorUiStateInteractor$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stopSelectorUiStateInteractor$special$$inlined$map$1$2$1.label;
                int i3 = 1;
                Throwable th = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    phu0 phu0Var = (phu0) obj;
                    a22 a22Var = (a22) this.b.b;
                    khu0 khu0Var = phu0Var.a;
                    CharSequence charSequence = khu0Var.a;
                    List list = khu0Var.b;
                    efu0 efu0Var = khu0Var.c;
                    boolean z = phu0Var.b;
                    zuj0 zuj0Var2 = a22Var.a;
                    Iterator it = list.iterator();
                    int i4 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i4 = -1;
                            break;
                        }
                        if (jl40.l(((efu0) it.next()).a, efu0Var != null ? efu0Var.a : null)) {
                            break;
                        }
                        i4++;
                    }
                    int max = Math.max(0, i4 - 1);
                    ListBuilder a = rcc.a();
                    int i5 = 0;
                    for (Object obj3 : list) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            Throwable th2 = th;
                            scc.m();
                            throw th2;
                        }
                        efu0 efu0Var2 = (efu0) obj3;
                        int i7 = i5 == 0 ? i3 : 0;
                        Throwable th3 = th;
                        int i8 = i5 == scc.f(list) ? i3 : 0;
                        int i9 = i5 == i4 ? i3 : 0;
                        int i10 = (i3 > i5 || i5 >= i4) ? 0 : i3;
                        int i11 = i5 > i4 ? i3 : 0;
                        int i12 = i5 >= i4 ? i3 : 0;
                        q5l0 q5l0Var = i9 != 0 ? shu0.b : (i7 == 0 && i8 == 0) ? shu0.c : shu0.a;
                        if (i7 != 0) {
                            zuj0Var = zuj0Var2;
                            m5l0Var = new o5l0(AppColor$Palette.Line, q5l0Var);
                        } else {
                            zuj0Var = zuj0Var2;
                            m5l0Var = i8 != 0 ? new m5l0(AppColor$Palette.Line, q5l0Var) : new n5l0(AppColor$Palette.Line, q5l0Var);
                        }
                        p5l0 p5l0Var = m5l0Var;
                        if (max > 0 && i5 == 1) {
                            a.add(new viu0(((avj0) zuj0Var).f(zvh0.route_stops, max), z, z ? ehu0.a : fhu0.a, shu0.d));
                        }
                        if (i10 == 0 || z) {
                            CharSequence charSequence2 = efu0Var2.b;
                            if (charSequence2 == null) {
                                charSequence2 = "";
                            }
                            a.add(new egu0(charSequence2, efu0Var2.d && i12 != 0, i9 != 0 ? ((avj0) zuj0Var).h(byh0.stop_selector_route_start_hint) : th3, efu0Var2.c, i11 != 0 ? new hhu0(efu0Var2) : th3, p5l0Var));
                        }
                        th = th3;
                        zuj0Var2 = zuj0Var;
                        i5 = i6;
                        i3 = 1;
                    }
                    Throwable th4 = th;
                    rhu0 rhu0Var = new rhu0(charSequence, a.j());
                    stopSelectorUiStateInteractor$special$$inlined$map$1$2$1.L$0 = th4;
                    stopSelectorUiStateInteractor$special$$inlined$map$1$2$1.L$1 = th4;
                    stopSelectorUiStateInteractor$special$$inlined$map$1$2$1.L$2 = th4;
                    stopSelectorUiStateInteractor$special$$inlined$map$1$2$1.L$3 = th4;
                    stopSelectorUiStateInteractor$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(rhu0Var, stopSelectorUiStateInteractor$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        stopSelectorUiStateInteractor$special$$inlined$map$1$2$1 = new StopSelectorUiStateInteractor$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = stopSelectorUiStateInteractor$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stopSelectorUiStateInteractor$special$$inlined$map$1$2$1.label;
        int i32 = 1;
        Throwable th5 = null;
        if (i != 0) {
        }
        return zy11.a;
    }
}
