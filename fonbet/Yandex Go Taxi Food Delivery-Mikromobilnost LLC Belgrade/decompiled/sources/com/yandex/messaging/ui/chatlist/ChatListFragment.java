package com.yandex.messaging.ui.chatlist;

import android.app.Activity;
import android.view.View;
import android.view.WindowInsets;
import com.yandex.bricks.Brick;
import com.yandex.messaging.navigation.MessengerFragment;
import defpackage.e9h0;
import defpackage.i3y;
import defpackage.n4b;
import defpackage.n751;
import defpackage.noh;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.pk3;
import defpackage.r4b;
import defpackage.u1w;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0094@¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00178\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/yandex/messaging/ui/chatlist/ChatListFragment;", "Lcom/yandex/messaging/navigation/MessengerFragment;", "Ln4b;", "Landroid/app/Activity;", "activity", "Lnoh;", "Lc020;", "activityComponentAsync", "<init>", "(Landroid/app/Activity;Lnoh;)V", "Lcom/yandex/bricks/Brick;", "createBrick", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/view/View;", "v", "Landroid/view/WindowInsets;", "insets", "onApplyWindowInsets", "(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;", "Lzy11;", "scrollToTop", "()V", "scrollToTopInMainFolder", "", "containerId", CA20Status.STATUS_USER_I, "getContainerId", "()I", "Lpk3;", "authBrick$delegate", "Li3y;", "getAuthBrick", "()Lpk3;", "authBrick", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ChatListFragment extends MessengerFragment<n4b> {
    public static final int $stable = 8;

    /* renamed from: authBrick$delegate, reason: from kotlin metadata */
    private final i3y authBrick;
    private final int containerId;

    public ChatListFragment(Activity activity, noh nohVar) {
        super(activity, nohVar);
        this.containerId = e9h0.chat_list_slot;
        this.authBrick = kotlin.a.a(new r4b(activity, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pk3 authBrick_delegate$lambda$0(Activity activity) {
        return new pk3(activity);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.messaging.navigation.MessengerFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createBrick(Continuation<? super Brick> continuation) {
        ChatListFragment$createBrick$1 chatListFragment$createBrick$1;
        int i;
        if (continuation instanceof ChatListFragment$createBrick$1) {
            chatListFragment$createBrick$1 = (ChatListFragment$createBrick$1) continuation;
            int i2 = chatListFragment$createBrick$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chatListFragment$createBrick$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chatListFragment$createBrick$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chatListFragment$createBrick$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    noh activityComponentAsync = getActivityComponentAsync();
                    chatListFragment$createBrick$1.L$0 = this;
                    chatListFragment$createBrick$1.label = 1;
                    obj = activityComponentAsync.k(chatListFragment$createBrick$1);
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
                throw oyr.d(obj);
            }
        }
        chatListFragment$createBrick$1 = new ChatListFragment$createBrick$1(this, continuation);
        Object obj2 = chatListFragment$createBrick$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chatListFragment$createBrick$1.label;
        if (i != 0) {
        }
        throw oyr.d(obj2);
    }

    @Override // com.yandex.messaging.navigation.MessengerFragment
    public pk3 getAuthBrick() {
        return (pk3) this.authBrick.getValue();
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

    public final void scrollToTopInMainFolder() {
        if (getBrickOrNull() == null) {
            return;
        }
        ny61.u();
    }
}
