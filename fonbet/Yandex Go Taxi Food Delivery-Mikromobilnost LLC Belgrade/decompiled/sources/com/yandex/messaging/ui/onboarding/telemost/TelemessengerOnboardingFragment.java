package com.yandex.messaging.ui.onboarding.telemost;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.compose.a;
import com.yandex.messaging.navigation.ComposeMessengerFragment;
import defpackage.bts;
import defpackage.bvf0;
import defpackage.eja1;
import defpackage.f530;
import defpackage.fid;
import defpackage.hs31;
import defpackage.m3u0;
import defpackage.mth;
import defpackage.ndy0;
import defpackage.noh;
import defpackage.ny61;
import defpackage.ody0;
import defpackage.oyr;
import defpackage.pz40;
import defpackage.tje;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d²\u0006\u000e\u0010\u001c\u001a\u0004\u0018\u00010\u00198\nX\u008a\u0084\u0002"}, d2 = {"Lcom/yandex/messaging/ui/onboarding/telemost/TelemessengerOnboardingFragment;", "Lcom/yandex/messaging/navigation/ComposeMessengerFragment;", "Lndy0;", "Landroid/app/Activity;", "activity", "Lnoh;", "Lc020;", "activityComponentAsync", "<init>", "(Landroid/app/Activity;Lnoh;)V", "Lzy11;", "performPendingAction", "()V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lf530;", "modifier", "ScreenRoot", "(Lf530;Lfid;I)V", "Lhs31;", "getViewModelFactory", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lpz40;", "Lody0;", "controllerStateFlow", "Lpz40;", "controller", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TelemessengerOnboardingFragment extends ComposeMessengerFragment<ndy0> {
    public static final int $stable = 8;
    private final pz40 controllerStateFlow;

    public TelemessengerOnboardingFragment(Activity activity, noh nohVar) {
        super(activity, nohVar);
        this.controllerStateFlow = bvf0.c(null);
    }

    private static final ody0 ScreenRoot$lambda$0(m3u0 m3u0Var) {
        if (m3u0Var.getValue() == null) {
            return null;
        }
        ny61.u();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performPendingAction() {
        tje.N(eja1.s(this), null, null, new TelemessengerOnboardingFragment$performPendingAction$1(this, null), 3);
    }

    @Override // com.yandex.messaging.navigation.ComposeMessengerFragment
    public void ScreenRoot(f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(1068815823);
        ScreenRoot$lambda$0(a.c(this.controllerStateFlow, null, btsVar, 0, 7));
        btsVar.t(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        if (r8 == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
    
        if (r8 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.yandex.messaging.navigation.ComposeMessengerFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getViewModelFactory(Continuation<? super hs31> continuation) {
        TelemessengerOnboardingFragment$getViewModelFactory$1 telemessengerOnboardingFragment$getViewModelFactory$1;
        int i;
        if (continuation instanceof TelemessengerOnboardingFragment$getViewModelFactory$1) {
            telemessengerOnboardingFragment$getViewModelFactory$1 = (TelemessengerOnboardingFragment$getViewModelFactory$1) continuation;
            int i2 = telemessengerOnboardingFragment$getViewModelFactory$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                telemessengerOnboardingFragment$getViewModelFactory$1.label = i2 - Integer.MIN_VALUE;
                Object obj = telemessengerOnboardingFragment$getViewModelFactory$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = telemessengerOnboardingFragment$getViewModelFactory$1.label;
                if (i == 0) {
                    if (i == 1) {
                        this = (TelemessengerOnboardingFragment) telemessengerOnboardingFragment$getViewModelFactory$1.L$0;
                        b.b(obj);
                        if (obj != null) {
                            ny61.u();
                            return null;
                        }
                        telemessengerOnboardingFragment$getViewModelFactory$1.L$0 = this;
                        telemessengerOnboardingFragment$getViewModelFactory$1.label = 2;
                        throw null;
                    }
                    if (i == 2) {
                        TelemessengerOnboardingFragment telemessengerOnboardingFragment = (TelemessengerOnboardingFragment) telemessengerOnboardingFragment$getViewModelFactory$1.L$0;
                        b.b(obj);
                        hs31 hs31Var = (hs31) obj;
                        if (hs31Var != null) {
                            return hs31Var;
                        }
                        noh activityComponentAsync = telemessengerOnboardingFragment.getActivityComponentAsync();
                        telemessengerOnboardingFragment$getViewModelFactory$1.L$0 = telemessengerOnboardingFragment;
                        telemessengerOnboardingFragment$getViewModelFactory$1.label = 3;
                        obj = activityComponentAsync.k(telemessengerOnboardingFragment$getViewModelFactory$1);
                    } else {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                    }
                    throw oyr.d(obj);
                }
                b.b(obj);
                mth mthVar = new mth(this.controllerStateFlow, 6);
                telemessengerOnboardingFragment$getViewModelFactory$1.L$0 = this;
                telemessengerOnboardingFragment$getViewModelFactory$1.label = 1;
                obj = e.y(mthVar, telemessengerOnboardingFragment$getViewModelFactory$1);
            }
        }
        telemessengerOnboardingFragment$getViewModelFactory$1 = new TelemessengerOnboardingFragment$getViewModelFactory$1(this, continuation);
        Object obj2 = telemessengerOnboardingFragment$getViewModelFactory$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = telemessengerOnboardingFragment$getViewModelFactory$1.label;
        if (i == 0) {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tje.N(eja1.s(this), null, null, new TelemessengerOnboardingFragment$onCreate$1(this, null), 3);
    }
}
