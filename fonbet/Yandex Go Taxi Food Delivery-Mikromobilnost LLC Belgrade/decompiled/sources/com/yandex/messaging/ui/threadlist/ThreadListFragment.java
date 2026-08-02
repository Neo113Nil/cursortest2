package com.yandex.messaging.ui.threadlist;

import android.app.Activity;
import android.view.View;
import android.view.WindowInsets;
import com.yandex.bricks.Brick;
import com.yandex.messaging.navigation.MessengerFragment;
import defpackage.e9h0;
import defpackage.n751;
import defpackage.noh;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.u1w;
import defpackage.yxy0;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0094@¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/yandex/messaging/ui/threadlist/ThreadListFragment;", "Lcom/yandex/messaging/navigation/MessengerFragment;", "Lyxy0;", "Landroid/app/Activity;", "activity", "Lnoh;", "Lc020;", "activityComponentAsync", "<init>", "(Landroid/app/Activity;Lnoh;)V", "Lcom/yandex/bricks/Brick;", "createBrick", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/view/View;", "v", "Landroid/view/WindowInsets;", "insets", "onApplyWindowInsets", "(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;", "Lzy11;", "scrollToTop", "()V", "", "containerId", CA20Status.STATUS_USER_I, "getContainerId", "()I", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ThreadListFragment extends MessengerFragment<yxy0> {
    public static final int $stable = 0;
    private final int containerId;

    public ThreadListFragment(Activity activity, noh nohVar) {
        super(activity, nohVar);
        this.containerId = e9h0.thread_list_slot;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.messaging.navigation.MessengerFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createBrick(Continuation<? super Brick> continuation) {
        ThreadListFragment$createBrick$1 threadListFragment$createBrick$1;
        int i;
        if (continuation instanceof ThreadListFragment$createBrick$1) {
            threadListFragment$createBrick$1 = (ThreadListFragment$createBrick$1) continuation;
            int i2 = threadListFragment$createBrick$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                threadListFragment$createBrick$1.label = i2 - Integer.MIN_VALUE;
                Object obj = threadListFragment$createBrick$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = threadListFragment$createBrick$1.label;
                if (i != 0) {
                    b.b(obj);
                    noh activityComponentAsync = getActivityComponentAsync();
                    threadListFragment$createBrick$1.L$0 = this;
                    threadListFragment$createBrick$1.label = 1;
                    obj = activityComponentAsync.k(threadListFragment$createBrick$1);
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
        threadListFragment$createBrick$1 = new ThreadListFragment$createBrick$1(this, continuation);
        Object obj2 = threadListFragment$createBrick$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = threadListFragment$createBrick$1.label;
        if (i != 0) {
        }
        throw oyr.d(obj2);
    }

    @Override // com.yandex.messaging.navigation.MessengerFragment
    public int getContainerId() {
        return this.containerId;
    }

    @Override // com.yandex.messaging.navigation.BaseMessengerFragment
    public WindowInsets onApplyWindowInsets(View v, WindowInsets insets) {
        u1w g = n751.h(null, insets).a.g(1);
        v.setPadding(g.a, g.b, g.c, g.d);
        return insets;
    }

    @Override // com.yandex.messaging.navigation.BaseMessengerFragment
    public void scrollToTop() {
        if (getBrickOrNull() == null) {
            return;
        }
        ny61.u();
    }
}
