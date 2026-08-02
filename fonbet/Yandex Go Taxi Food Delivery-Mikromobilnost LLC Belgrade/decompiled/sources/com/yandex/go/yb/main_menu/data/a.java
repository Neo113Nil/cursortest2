package com.yandex.go.yb.main_menu.data;

import defpackage.my51;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.settings.main.NativeMenuState;

/* loaded from: classes15.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        YbWalletMenuItemRepositoryImpl$menuStateFlow$$inlined$mapNotNull$1$2$1 ybWalletMenuItemRepositoryImpl$menuStateFlow$$inlined$mapNotNull$1$2$1;
        int i;
        Boolean bool;
        if (continuation instanceof YbWalletMenuItemRepositoryImpl$menuStateFlow$$inlined$mapNotNull$1$2$1) {
            ybWalletMenuItemRepositoryImpl$menuStateFlow$$inlined$mapNotNull$1$2$1 = (YbWalletMenuItemRepositoryImpl$menuStateFlow$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = ybWalletMenuItemRepositoryImpl$menuStateFlow$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ybWalletMenuItemRepositoryImpl$menuStateFlow$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = ybWalletMenuItemRepositoryImpl$menuStateFlow$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ybWalletMenuItemRepositoryImpl$menuStateFlow$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    int i3 = my51.a[((NativeMenuState) obj).ordinal()];
                    if (i3 == 1) {
                        bool = Boolean.TRUE;
                    } else if (i3 == 2) {
                        bool = Boolean.FALSE;
                    } else {
                        if (i3 != 3 && i3 != 4) {
                            w511.b();
                            return null;
                        }
                        bool = null;
                    }
                    if (bool != null) {
                        ybWalletMenuItemRepositoryImpl$menuStateFlow$$inlined$mapNotNull$1$2$1.L$0 = null;
                        ybWalletMenuItemRepositoryImpl$menuStateFlow$$inlined$mapNotNull$1$2$1.L$1 = null;
                        ybWalletMenuItemRepositoryImpl$menuStateFlow$$inlined$mapNotNull$1$2$1.L$2 = null;
                        ybWalletMenuItemRepositoryImpl$menuStateFlow$$inlined$mapNotNull$1$2$1.L$3 = null;
                        ybWalletMenuItemRepositoryImpl$menuStateFlow$$inlined$mapNotNull$1$2$1.L$4 = null;
                        ybWalletMenuItemRepositoryImpl$menuStateFlow$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(bool, ybWalletMenuItemRepositoryImpl$menuStateFlow$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        ybWalletMenuItemRepositoryImpl$menuStateFlow$$inlined$mapNotNull$1$2$1 = new YbWalletMenuItemRepositoryImpl$menuStateFlow$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = ybWalletMenuItemRepositoryImpl$menuStateFlow$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ybWalletMenuItemRepositoryImpl$menuStateFlow$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
