package com.yandex.go.summary.interactor.expanded.state.content.tariffcard;

import com.yandex.go.tariffcard.api.experiment.HeaderCollapseButtonType;
import defpackage.au2;
import defpackage.avj0;
import defpackage.hlb1;
import defpackage.ktz0;
import defpackage.kyh0;
import defpackage.ltz0;
import defpackage.ny61;
import defpackage.osz0;
import defpackage.vpr;
import defpackage.vza1;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class r0 implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ ltz0 b;

    public r0(vpr vprVar, ltz0 ltz0Var) {
        this.a = vprVar;
        this.b = ltz0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ToolbarUiStateInteractor$startToolbarButtonFlow$$inlined$map$1$2$1 toolbarUiStateInteractor$startToolbarButtonFlow$$inlined$map$1$2$1;
        int i;
        au2 au2Var;
        if (continuation instanceof ToolbarUiStateInteractor$startToolbarButtonFlow$$inlined$map$1$2$1) {
            toolbarUiStateInteractor$startToolbarButtonFlow$$inlined$map$1$2$1 = (ToolbarUiStateInteractor$startToolbarButtonFlow$$inlined$map$1$2$1) continuation;
            int i2 = toolbarUiStateInteractor$startToolbarButtonFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                toolbarUiStateInteractor$startToolbarButtonFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = toolbarUiStateInteractor$startToolbarButtonFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = toolbarUiStateInteractor$startToolbarButtonFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    HeaderCollapseButtonType headerCollapseButtonType = (HeaderCollapseButtonType) obj;
                    int i3 = headerCollapseButtonType == null ? -1 : ktz0.a[headerCollapseButtonType.ordinal()];
                    if (i3 == -1) {
                        au2Var = null;
                    } else if (i3 == 1) {
                        au2Var = hlb1.b();
                    } else {
                        if (i3 != 2) {
                            w511.b();
                            return null;
                        }
                        au2Var = vza1.c();
                    }
                    osz0 osz0Var = au2Var != null ? new osz0(au2Var, ((avj0) this.b.a).h(kyh0.summary_order_button_collapse_content_description)) : null;
                    toolbarUiStateInteractor$startToolbarButtonFlow$$inlined$map$1$2$1.L$0 = null;
                    toolbarUiStateInteractor$startToolbarButtonFlow$$inlined$map$1$2$1.L$1 = null;
                    toolbarUiStateInteractor$startToolbarButtonFlow$$inlined$map$1$2$1.L$2 = null;
                    toolbarUiStateInteractor$startToolbarButtonFlow$$inlined$map$1$2$1.L$3 = null;
                    toolbarUiStateInteractor$startToolbarButtonFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(osz0Var, toolbarUiStateInteractor$startToolbarButtonFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        toolbarUiStateInteractor$startToolbarButtonFlow$$inlined$map$1$2$1 = new ToolbarUiStateInteractor$startToolbarButtonFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = toolbarUiStateInteractor$startToolbarButtonFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = toolbarUiStateInteractor$startToolbarButtonFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
