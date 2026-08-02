package com.yandex.messaging.ui.main;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import com.yandex.bricks.Brick;
import com.yandex.messaging.navigation.MessengerFragment;
import defpackage.d500;
import defpackage.e500;
import defpackage.hi91;
import defpackage.n751;
import defpackage.noh;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.u1w;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0094@¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/yandex/messaging/ui/main/MainFragment;", "Lcom/yandex/messaging/navigation/MessengerFragment;", "Ld500;", "Landroid/app/Activity;", "activity", "Lnoh;", "Lc020;", "activityComponentAsync", "<init>", "(Landroid/app/Activity;Lnoh;)V", "Landroid/view/View;", "v", "Landroid/view/WindowInsets;", "insets", "onApplyWindowInsets", "(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;", "Lcom/yandex/bricks/Brick;", "createBrick", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/os/Bundle;", "args", "", "onNewArgs", "(Landroid/os/Bundle;)Z", "Le500;", "brick", "Le500;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MainFragment extends MessengerFragment<d500> {
    public static final int $stable = 8;
    private e500 brick;

    public MainFragment(Activity activity, noh nohVar) {
        super(activity, nohVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.messaging.navigation.MessengerFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createBrick(Continuation<? super Brick> continuation) {
        MainFragment$createBrick$1 mainFragment$createBrick$1;
        int i;
        if (continuation instanceof MainFragment$createBrick$1) {
            mainFragment$createBrick$1 = (MainFragment$createBrick$1) continuation;
            int i2 = mainFragment$createBrick$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mainFragment$createBrick$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mainFragment$createBrick$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mainFragment$createBrick$1.label;
                if (i != 0) {
                    b.b(obj);
                    noh activityComponentAsync = getActivityComponentAsync();
                    mainFragment$createBrick$1.L$0 = this;
                    mainFragment$createBrick$1.label = 1;
                    obj = activityComponentAsync.k(mainFragment$createBrick$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                throw oyr.d(obj);
            }
        }
        mainFragment$createBrick$1 = new MainFragment$createBrick$1(this, continuation);
        Object obj2 = mainFragment$createBrick$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mainFragment$createBrick$1.label;
        if (i != 0) {
        }
        throw oyr.d(obj2);
    }

    @Override // com.yandex.messaging.navigation.BaseMessengerFragment
    public WindowInsets onApplyWindowInsets(View v, WindowInsets insets) {
        u1w g = n751.h(null, insets).a.g(10);
        hi91.i(g.a, g.b, g.c, g.d, v);
        return insets;
    }

    @Override // com.yandex.messaging.navigation.BaseMessengerFragment
    public boolean onNewArgs(Bundle args) {
        return args != null;
    }
}
