package com.yandex.go.yb.main_menu.data;

import com.yandex.go.yb.main_menu.ui.YbWalletMenuItemPresenter$MenuItemState;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "menuOpened", "menuItemState", "Lcom/yandex/go/yb/main_menu/ui/YbWalletMenuItemPresenter$MenuItemState;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.yb.main_menu.data.YbWalletMenuItemRepositoryImpl$observeMenuItemShownInMenu$1", f = "YbWalletMenuItemRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes15.dex */
final class YbWalletMenuItemRepositoryImpl$observeMenuItemShownInMenu$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    public YbWalletMenuItemRepositoryImpl$observeMenuItemShownInMenu$1() {
        super(3, null);
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        YbWalletMenuItemRepositoryImpl$observeMenuItemShownInMenu$1 ybWalletMenuItemRepositoryImpl$observeMenuItemShownInMenu$1 = new YbWalletMenuItemRepositoryImpl$observeMenuItemShownInMenu$1(3, (Continuation) obj3);
        ybWalletMenuItemRepositoryImpl$observeMenuItemShownInMenu$1.Z$0 = booleanValue;
        ybWalletMenuItemRepositoryImpl$observeMenuItemShownInMenu$1.L$0 = (YbWalletMenuItemPresenter$MenuItemState) obj2;
        return ybWalletMenuItemRepositoryImpl$observeMenuItemShownInMenu$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        YbWalletMenuItemPresenter$MenuItemState ybWalletMenuItemPresenter$MenuItemState = (YbWalletMenuItemPresenter$MenuItemState) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(z && ybWalletMenuItemPresenter$MenuItemState == YbWalletMenuItemPresenter$MenuItemState.DISPLAYED);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
