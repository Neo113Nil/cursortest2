package com.yandex.messaging.ui.onboarding;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.yandex.bricks.Brick;
import com.yandex.messaging.navigation.MessengerFragment;
import defpackage.eja1;
import defpackage.k170;
import defpackage.k320;
import defpackage.noh;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.tje;
import defpackage.z83;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0094@¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/yandex/messaging/ui/onboarding/OnboardingFragment;", "Lcom/yandex/messaging/navigation/MessengerFragment;", "Lk170;", "Landroid/app/Activity;", "activity", "Lnoh;", "Lc020;", "activityComponentAsync", "<init>", "(Landroid/app/Activity;Lnoh;)V", "Lcom/yandex/bricks/Brick;", "createBrick", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/widget/FrameLayout;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/widget/FrameLayout;", "Landroid/view/View;", "v", "Landroid/view/WindowInsets;", "insets", "onApplyWindowInsets", "(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OnboardingFragment extends MessengerFragment<k170> {
    public static final int $stable = 0;

    public OnboardingFragment(Activity activity, noh nohVar) {
        super(activity, nohVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.messaging.navigation.MessengerFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createBrick(Continuation<? super Brick> continuation) {
        OnboardingFragment$createBrick$1 onboardingFragment$createBrick$1;
        int i;
        if (continuation instanceof OnboardingFragment$createBrick$1) {
            onboardingFragment$createBrick$1 = (OnboardingFragment$createBrick$1) continuation;
            int i2 = onboardingFragment$createBrick$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                onboardingFragment$createBrick$1.label = i2 - Integer.MIN_VALUE;
                Object obj = onboardingFragment$createBrick$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = onboardingFragment$createBrick$1.label;
                if (i != 0) {
                    b.b(obj);
                    noh activityComponentAsync = getActivityComponentAsync();
                    onboardingFragment$createBrick$1.L$0 = this;
                    onboardingFragment$createBrick$1.label = 1;
                    obj = activityComponentAsync.k(onboardingFragment$createBrick$1);
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
        onboardingFragment$createBrick$1 = new OnboardingFragment$createBrick$1(this, continuation);
        Object obj2 = onboardingFragment$createBrick$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = onboardingFragment$createBrick$1.label;
        if (i != 0) {
        }
        throw oyr.d(obj2);
    }

    @Override // com.yandex.messaging.navigation.BaseMessengerFragment
    public WindowInsets onApplyWindowInsets(View v, WindowInsets insets) {
        return insets;
    }

    @Override // com.yandex.messaging.navigation.MessengerFragment, androidx.fragment.app.Fragment
    public FrameLayout onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        try {
            k320.d().a().newInstance();
            return super.onCreateView(inflater, container, savedInstanceState);
        } catch (Exception | NoClassDefFoundError unused) {
            z83.i();
            tje.N(eja1.s(this), null, null, new OnboardingFragment$onCreateView$2(this, null), 3);
            return new FrameLayout(requireActivity());
        }
    }
}
