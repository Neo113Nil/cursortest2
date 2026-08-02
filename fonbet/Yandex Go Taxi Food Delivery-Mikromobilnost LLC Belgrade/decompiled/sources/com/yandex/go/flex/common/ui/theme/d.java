package com.yandex.go.flex.common.ui.theme;

import defpackage.fnx0;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.vpr;
import defpackage.zqq;
import defpackage.zy11;
import java.util.Optional;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.personalstate.domain.interactor.j;

/* loaded from: classes.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ zqq b;

    public d(vpr vprVar, zqq zqqVar) {
        this.a = vprVar;
        this.b = zqqVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a9, code lost:
    
        if (r9.emit(r8, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FeedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1 feedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        vpr vprVar2;
        pex0 pex0Var;
        String str;
        if (continuation instanceof FeedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1) {
            feedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1 = (FeedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1) continuation;
            int i2 = feedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                feedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = feedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = feedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    fnx0 fnx0Var = (fnx0) ((Optional) obj).orElse(null);
                    vprVar = this.a;
                    if (fnx0Var == null || (pex0Var = fnx0Var.c) == null || (str = pex0Var.b) == null) {
                        j jVar = (j) this.b.d.get();
                        feedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1.L$0 = null;
                        feedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1.L$1 = null;
                        feedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1.L$2 = null;
                        feedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1.L$3 = null;
                        feedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1.L$4 = vprVar;
                        feedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1.L$5 = null;
                        feedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1.L$6 = null;
                        feedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1.label = 1;
                        Object c = jVar.c(feedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1);
                        if (c != coroutineSingletons) {
                            obj2 = c;
                            vprVar2 = vprVar;
                        }
                        return coroutineSingletons;
                    }
                    feedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1.L$0 = null;
                    feedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1.L$1 = null;
                    feedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1.L$2 = null;
                    feedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1.L$3 = null;
                    feedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1.L$4 = null;
                    feedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1.L$5 = null;
                    feedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1.L$6 = null;
                    feedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1.label = 2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    vprVar2 = (vpr) feedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj2);
                }
                str = (String) obj2;
                if (str == null) {
                    str = "";
                }
                vprVar = vprVar2;
                feedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1.L$0 = null;
                feedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1.L$1 = null;
                feedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1.L$2 = null;
                feedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1.L$3 = null;
                feedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1.L$4 = null;
                feedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1.L$5 = null;
                feedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1.L$6 = null;
                feedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1.label = 2;
            }
        }
        feedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1 = new FeedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = feedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = feedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        str = (String) obj22;
        if (str == null) {
        }
        vprVar = vprVar2;
        feedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1.L$0 = null;
        feedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1.L$1 = null;
        feedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1.L$2 = null;
        feedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1.L$3 = null;
        feedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1.L$4 = null;
        feedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1.L$5 = null;
        feedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1.L$6 = null;
        feedSdkThemeInteractorImpl$selectedTariffClassFlow$$inlined$map$1$2$1.label = 2;
    }
}
