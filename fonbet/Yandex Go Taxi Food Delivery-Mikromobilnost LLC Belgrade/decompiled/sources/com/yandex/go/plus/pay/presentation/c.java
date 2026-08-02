package com.yandex.go.plus.pay.presentation;

import com.yandex.plus.ui.core.theme.PlusTheme;
import defpackage.ny61;
import defpackage.vgd0;
import defpackage.vpr;
import defpackage.w511;
import defpackage.y4a0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes13.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;

    public c(vpr vprVar, y4a0 y4a0Var) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PlusPayUiProviderFactory$special$$inlined$map$1$2$1 plusPayUiProviderFactory$special$$inlined$map$1$2$1;
        int i;
        PlusTheme plusTheme;
        if (continuation instanceof PlusPayUiProviderFactory$special$$inlined$map$1$2$1) {
            plusPayUiProviderFactory$special$$inlined$map$1$2$1 = (PlusPayUiProviderFactory$special$$inlined$map$1$2$1) continuation;
            int i2 = plusPayUiProviderFactory$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusPayUiProviderFactory$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = plusPayUiProviderFactory$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusPayUiProviderFactory$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    int i3 = vgd0.a[((ThemeType) obj).ordinal()];
                    if (i3 == 1) {
                        plusTheme = PlusTheme.LIGHT;
                    } else {
                        if (i3 != 2) {
                            w511.b();
                            return null;
                        }
                        plusTheme = PlusTheme.DARK;
                    }
                    plusPayUiProviderFactory$special$$inlined$map$1$2$1.L$0 = null;
                    plusPayUiProviderFactory$special$$inlined$map$1$2$1.L$1 = null;
                    plusPayUiProviderFactory$special$$inlined$map$1$2$1.L$2 = null;
                    plusPayUiProviderFactory$special$$inlined$map$1$2$1.L$3 = null;
                    plusPayUiProviderFactory$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(plusTheme, plusPayUiProviderFactory$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        plusPayUiProviderFactory$special$$inlined$map$1$2$1 = new PlusPayUiProviderFactory$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = plusPayUiProviderFactory$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusPayUiProviderFactory$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
