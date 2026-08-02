package com.yandex.go.information.domain;

import defpackage.avj0;
import defpackage.fa31;
import defpackage.j6;
import defpackage.kyh0;
import defpackage.l5;
import defpackage.nw8;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.x0h0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ nw8 b;

    public d(vpr vprVar, nw8 nw8Var) {
        this.a = vprVar;
        this.b = nw8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        InformationUiStateInteractor$uiStateFlow$$inlined$map$1$2$1 informationUiStateInteractor$uiStateFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof InformationUiStateInteractor$uiStateFlow$$inlined$map$1$2$1) {
            informationUiStateInteractor$uiStateFlow$$inlined$map$1$2$1 = (InformationUiStateInteractor$uiStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = informationUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                informationUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = informationUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = informationUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    nw8 nw8Var = this.b;
                    nw8Var.getClass();
                    int i3 = x0h0.logo_about;
                    fa31 fa31Var = ((l5) obj).a;
                    StringBuilder sb = new StringBuilder();
                    avj0 avj0Var = (avj0) nw8Var.a;
                    sb.append(avj0Var.i(kyh0.about_version_info, fa31Var.a, "28.07.2026"));
                    sb.append(avj0Var.i(kyh0.about_version_info_end, fa31Var.b));
                    sb.append('\n');
                    j6 j6Var = new j6(i3, sb.toString());
                    informationUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$0 = null;
                    informationUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$1 = null;
                    informationUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$2 = null;
                    informationUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$3 = null;
                    informationUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(j6Var, informationUiStateInteractor$uiStateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        informationUiStateInteractor$uiStateFlow$$inlined$map$1$2$1 = new InformationUiStateInteractor$uiStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = informationUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = informationUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
