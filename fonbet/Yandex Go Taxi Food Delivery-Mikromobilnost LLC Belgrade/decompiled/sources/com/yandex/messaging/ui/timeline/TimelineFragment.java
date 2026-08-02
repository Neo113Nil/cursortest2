package com.yandex.messaging.ui.timeline;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.yandex.messaging.navigation.MessengerFragment;
import defpackage.eja1;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.noh;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.pk3;
import defpackage.q6b;
import defpackage.r4b;
import defpackage.tje;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineStart;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u0094@¢\u0006\u0004\b\u0015\u0010\fJ\u0019\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/yandex/messaging/ui/timeline/TimelineFragment;", "Lcom/yandex/messaging/navigation/MessengerFragment;", "Lq6b;", "Landroid/app/Activity;", "activity", "Lnoh;", "Lc020;", "activityComponentAsync", "<init>", "(Landroid/app/Activity;Lnoh;)V", "", "createComponent", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/yandex/messaging/ui/timeline/f;", "createBrick", "args", "", "onNewArgs", "(Landroid/os/Bundle;)Z", "component", "Lnoh;", "Lpk3;", "authBrick$delegate", "Li3y;", "getAuthBrick", "()Lpk3;", "authBrick", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TimelineFragment extends MessengerFragment<q6b> {
    public static final int $stable = 8;

    /* renamed from: authBrick$delegate, reason: from kotlin metadata */
    private final i3y authBrick;
    private final noh component;

    public TimelineFragment(Activity activity, noh nohVar) {
        super(activity, nohVar);
        this.component = tje.h(eja1.s(this), null, CoroutineStart.LAZY, new TimelineFragment$component$1(this, null), 1);
        this.authBrick = kotlin.a.a(new r4b(activity, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pk3 authBrick_delegate$lambda$0(Activity activity) {
        return new pk3(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createComponent(Continuation<Object> continuation) {
        TimelineFragment$createComponent$1 timelineFragment$createComponent$1;
        int i;
        if (continuation instanceof TimelineFragment$createComponent$1) {
            timelineFragment$createComponent$1 = (TimelineFragment$createComponent$1) continuation;
            int i2 = timelineFragment$createComponent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                timelineFragment$createComponent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = timelineFragment$createComponent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = timelineFragment$createComponent$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    noh activityComponentAsync = getActivityComponentAsync();
                    timelineFragment$createComponent$1.L$0 = this;
                    timelineFragment$createComponent$1.label = 1;
                    obj = activityComponentAsync.k(timelineFragment$createComponent$1);
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
        timelineFragment$createComponent$1 = new TimelineFragment$createComponent$1(this, continuation);
        Object obj2 = timelineFragment$createComponent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = timelineFragment$createComponent$1.label;
        if (i != 0) {
        }
        throw oyr.d(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.messaging.navigation.MessengerFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createBrick(Continuation<? super f> continuation) {
        TimelineFragment$createBrick$1 timelineFragment$createBrick$1;
        int i;
        if (continuation instanceof TimelineFragment$createBrick$1) {
            timelineFragment$createBrick$1 = (TimelineFragment$createBrick$1) continuation;
            int i2 = timelineFragment$createBrick$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                timelineFragment$createBrick$1.label = i2 - Integer.MIN_VALUE;
                Object obj = timelineFragment$createBrick$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = timelineFragment$createBrick$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    noh nohVar = this.component;
                    timelineFragment$createBrick$1.label = 1;
                    obj = nohVar.k(timelineFragment$createBrick$1);
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
        timelineFragment$createBrick$1 = new TimelineFragment$createBrick$1(this, continuation);
        Object obj2 = timelineFragment$createBrick$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = timelineFragment$createBrick$1.label;
        if (i != 0) {
        }
        throw oyr.d(obj2);
    }

    @Override // com.yandex.messaging.navigation.MessengerFragment
    public pk3 getAuthBrick() {
        return (pk3) this.authBrick.getValue();
    }

    @Override // com.yandex.messaging.navigation.BaseMessengerFragment
    public boolean onNewArgs(Bundle args) {
        if (args != null) {
            q6b q6bVar = new q6b(args);
            if (jl40.l(q6bVar.b, new q6b(requireArguments()).b) && q6bVar.e == null && q6bVar.k == null) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tje.N(eja1.s(getViewLifecycleOwner()), null, null, new TimelineFragment$onViewCreated$1(this, null), 3);
        tje.N(eja1.s(getViewLifecycleOwner()), null, null, new TimelineFragment$onViewCreated$2(this, null), 3);
    }
}
