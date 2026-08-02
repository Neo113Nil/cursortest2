package com.yandex.go.yb.main_menu.data;

import com.yandex.go.yb.data.u;
import com.yandex.go.yb.main_menu.ui.YbWalletMenuItemPresenter$MenuItemState;
import defpackage.bvf0;
import defpackage.jbh;
import defpackage.ny61;
import defpackage.qqo;
import defpackage.rqo;
import defpackage.sv51;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.am.m;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;
import ru.yandex.taxi.settings.main.k;

/* loaded from: classes8.dex */
public final class i {
    public final u a;
    public final ru.yandex.taxi.am.g b;
    public final m c;
    public final k d;
    public final qqo e;
    public final r0 f = bvf0.c(YbWalletMenuItemPresenter$MenuItemState.HIDDEN);

    public i(rqo rqoVar, u uVar, ru.yandex.taxi.am.g gVar, m mVar, k kVar) {
        this.a = uVar;
        this.b = gVar;
        this.c = mVar;
        this.d = kVar;
        this.e = ((jbh) rqoVar).a(SimpleBooleanExperiment.YB_WALLET_MENU_ITEM);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(i iVar, ContinuationImpl continuationImpl) {
        YbWalletMenuItemRepositoryImpl$getBankMenuItemInfo$1 ybWalletMenuItemRepositoryImpl$getBankMenuItemInfo$1;
        int i;
        iVar.getClass();
        if (continuationImpl instanceof YbWalletMenuItemRepositoryImpl$getBankMenuItemInfo$1) {
            ybWalletMenuItemRepositoryImpl$getBankMenuItemInfo$1 = (YbWalletMenuItemRepositoryImpl$getBankMenuItemInfo$1) continuationImpl;
            int i2 = ybWalletMenuItemRepositoryImpl$getBankMenuItemInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ybWalletMenuItemRepositoryImpl$getBankMenuItemInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ybWalletMenuItemRepositoryImpl$getBankMenuItemInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ybWalletMenuItemRepositoryImpl$getBankMenuItemInfo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    u uVar = iVar.a;
                    ybWalletMenuItemRepositoryImpl$getBankMenuItemInfo$1.label = 1;
                    obj = uVar.e(ybWalletMenuItemRepositoryImpl$getBankMenuItemInfo$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                sv51 sv51Var = (sv51) obj;
                return sv51Var != null ? sv51.e : new sv51(sv51Var.a, sv51Var.b, sv51Var.c, true);
            }
        }
        ybWalletMenuItemRepositoryImpl$getBankMenuItemInfo$1 = new YbWalletMenuItemRepositoryImpl$getBankMenuItemInfo$1(iVar, continuationImpl);
        Object obj2 = ybWalletMenuItemRepositoryImpl$getBankMenuItemInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ybWalletMenuItemRepositoryImpl$getBankMenuItemInfo$1.label;
        if (i != 0) {
        }
        sv51 sv51Var2 = (sv51) obj2;
        if (sv51Var2 != null) {
        }
    }

    public final m0 b() {
        return new m0(new b(this.d.g), this.f, new YbWalletMenuItemRepositoryImpl$observeMenuItemShownInMenu$1());
    }
}
