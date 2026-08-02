package com.yandex.go.summary.interactor.anchored.state;

import defpackage.avj0;
import defpackage.btz0;
import defpackage.dwh0;
import defpackage.kyh0;
import defpackage.msz0;
import defpackage.ny61;
import defpackage.psz0;
import defpackage.vpr;
import defpackage.vza1;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class w implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ y b;

    public w(vpr vprVar, y yVar) {
        this.a = vprVar;
        this.b = yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ToolbarUiStateInteractor$startButtonBadgeUiStateFlow$$inlined$map$1$2$1 toolbarUiStateInteractor$startButtonBadgeUiStateFlow$$inlined$map$1$2$1;
        int i;
        String i2;
        Pair pair;
        if (continuation instanceof ToolbarUiStateInteractor$startButtonBadgeUiStateFlow$$inlined$map$1$2$1) {
            toolbarUiStateInteractor$startButtonBadgeUiStateFlow$$inlined$map$1$2$1 = (ToolbarUiStateInteractor$startButtonBadgeUiStateFlow$$inlined$map$1$2$1) continuation;
            int i3 = toolbarUiStateInteractor$startButtonBadgeUiStateFlow$$inlined$map$1$2$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                toolbarUiStateInteractor$startButtonBadgeUiStateFlow$$inlined$map$1$2$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = toolbarUiStateInteractor$startButtonBadgeUiStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = toolbarUiStateInteractor$startButtonBadgeUiStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    int intValue = ((Number) obj).intValue();
                    zuj0 zuj0Var = this.b.a;
                    if (intValue > 0) {
                        try {
                            i2 = ((avj0) zuj0Var).f(dwh0.active_orders_counter_content_description, intValue);
                        } catch (CancellationException e) {
                            throw e;
                        } catch (Throwable unused) {
                            i2 = ((avj0) zuj0Var).i(kyh0.active_orders_counter_one_content_description, Integer.valueOf(intValue));
                        }
                        pair = new Pair(String.valueOf(intValue), i2);
                    } else {
                        pair = new Pair(null, null);
                    }
                    String str = (String) pair.getFirst();
                    String str2 = (String) pair.getSecond();
                    StringBuilder sb = new StringBuilder();
                    sb.append(((avj0) zuj0Var).h(kyh0.common_back));
                    if (str2 != null && str2.length() != 0) {
                        sb.append(Extension.FIX_SPACE);
                        sb.append(str2);
                    }
                    msz0 msz0Var = new msz0(new psz0(vza1.c(), sb.toString(), btz0.a), str, str2);
                    toolbarUiStateInteractor$startButtonBadgeUiStateFlow$$inlined$map$1$2$1.L$0 = null;
                    toolbarUiStateInteractor$startButtonBadgeUiStateFlow$$inlined$map$1$2$1.L$1 = null;
                    toolbarUiStateInteractor$startButtonBadgeUiStateFlow$$inlined$map$1$2$1.L$2 = null;
                    toolbarUiStateInteractor$startButtonBadgeUiStateFlow$$inlined$map$1$2$1.L$3 = null;
                    toolbarUiStateInteractor$startButtonBadgeUiStateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(msz0Var, toolbarUiStateInteractor$startButtonBadgeUiStateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        toolbarUiStateInteractor$startButtonBadgeUiStateFlow$$inlined$map$1$2$1 = new ToolbarUiStateInteractor$startButtonBadgeUiStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = toolbarUiStateInteractor$startButtonBadgeUiStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = toolbarUiStateInteractor$startButtonBadgeUiStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
