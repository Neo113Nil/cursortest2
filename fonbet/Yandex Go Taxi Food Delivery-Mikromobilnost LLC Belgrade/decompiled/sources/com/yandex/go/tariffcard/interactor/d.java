package com.yandex.go.tariffcard.interactor;

import android.view.ContextThemeWrapper;
import com.yandex.go.taxi.summary.shared.models.SmallSummaryConfigExperiment;
import defpackage.avj0;
import defpackage.bdc;
import defpackage.gdc;
import defpackage.idu;
import defpackage.kdu;
import defpackage.mqg0;
import defpackage.mrg0;
import defpackage.ny61;
import defpackage.oxs0;
import defpackage.r1s;
import defpackage.tje;
import defpackage.u1n;
import defpackage.viv0;
import defpackage.vpr;
import defpackage.w511;
import defpackage.xng0;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ u1n b;

    public d(vpr vprVar, u1n u1nVar) {
        this.a = vprVar;
        this.b = u1nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        HeaderUiConfigInteractor$configHolderFlow$$inlined$map$2$2$1 headerUiConfigInteractor$configHolderFlow$$inlined$map$2$2$1;
        int i;
        int c;
        int i2;
        if (continuation instanceof HeaderUiConfigInteractor$configHolderFlow$$inlined$map$2$2$1) {
            headerUiConfigInteractor$configHolderFlow$$inlined$map$2$2$1 = (HeaderUiConfigInteractor$configHolderFlow$$inlined$map$2$2$1) continuation;
            int i3 = headerUiConfigInteractor$configHolderFlow$$inlined$map$2$2$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                headerUiConfigInteractor$configHolderFlow$$inlined$map$2$2$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = headerUiConfigInteractor$configHolderFlow$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = headerUiConfigInteractor$configHolderFlow$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ((Boolean) obj).getClass();
                    u1n u1nVar = this.b;
                    r1s r1sVar = (r1s) u1nVar.b;
                    zuj0 zuj0Var = (zuj0) r1sVar.b;
                    boolean h = ((viv0) r1sVar.c).h();
                    oxs0 oxs0Var = (oxs0) r1sVar.w;
                    boolean z = ((SmallSummaryConfigExperiment) oxs0Var.a.b()).c >= ((Number) oxs0Var.c.getValue()).floatValue();
                    if (h) {
                        c = ((avj0) zuj0Var).c(mrg0.component_text_size_title);
                    } else {
                        if (h) {
                            w511.b();
                            return null;
                        }
                        c = ((avj0) zuj0Var).c(mrg0.component_text_size_body);
                    }
                    int i4 = (!z && h) ? 5 : 1;
                    int i5 = (!z && h) ? 14 : 2;
                    if (h) {
                        i2 = 3;
                    } else {
                        if (h) {
                            w511.b();
                            return null;
                        }
                        i2 = 0;
                    }
                    avj0 avj0Var = (avj0) zuj0Var;
                    ContextThemeWrapper contextThemeWrapper = avj0Var.a;
                    ContextThemeWrapper contextThemeWrapper2 = avj0Var.a;
                    idu iduVar = new idu(c, tje.u(i4, contextThemeWrapper), tje.u(i5, contextThemeWrapper2), tje.u(0, contextThemeWrapper2), new bdc(xng0.textMinor), i2, h);
                    r1s r1sVar2 = (r1s) u1nVar.b;
                    zuj0 zuj0Var2 = (zuj0) r1sVar2.b;
                    oxs0 oxs0Var2 = (oxs0) r1sVar2.w;
                    boolean z2 = ((SmallSummaryConfigExperiment) oxs0Var2.a.b()).c >= ((Number) oxs0Var2.c.getValue()).floatValue();
                    boolean h2 = ((viv0) r1sVar2.c).h();
                    int i6 = z2 ? 2 : h2 ? 30 : 22;
                    int i7 = z2 ? 8 : 20;
                    avj0 avj0Var2 = (avj0) zuj0Var2;
                    int c2 = avj0Var2.c(mrg0.component_text_size_title);
                    ContextThemeWrapper contextThemeWrapper3 = avj0Var2.a;
                    kdu kduVar = new kdu(iduVar, new idu(c2, tje.u(2, contextThemeWrapper3), tje.u(i6, contextThemeWrapper3), tje.u(i7, contextThemeWrapper3), new gdc(mqg0.white_alpha50), 3, h2));
                    headerUiConfigInteractor$configHolderFlow$$inlined$map$2$2$1.L$0 = null;
                    headerUiConfigInteractor$configHolderFlow$$inlined$map$2$2$1.L$1 = null;
                    headerUiConfigInteractor$configHolderFlow$$inlined$map$2$2$1.L$2 = null;
                    headerUiConfigInteractor$configHolderFlow$$inlined$map$2$2$1.L$3 = null;
                    headerUiConfigInteractor$configHolderFlow$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(kduVar, headerUiConfigInteractor$configHolderFlow$$inlined$map$2$2$1) == coroutineSingletons) {
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
        headerUiConfigInteractor$configHolderFlow$$inlined$map$2$2$1 = new HeaderUiConfigInteractor$configHolderFlow$$inlined$map$2$2$1(this, continuation);
        Object obj22 = headerUiConfigInteractor$configHolderFlow$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = headerUiConfigInteractor$configHolderFlow$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
