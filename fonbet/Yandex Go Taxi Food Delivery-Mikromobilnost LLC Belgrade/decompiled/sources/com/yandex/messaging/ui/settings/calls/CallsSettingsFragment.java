package com.yandex.messaging.ui.settings.calls;

import android.app.Activity;
import com.yandex.messaging.navigation.ComposeMessengerFragment;
import defpackage.bts;
import defpackage.ccg;
import defpackage.cg7;
import defpackage.f530;
import defpackage.fid;
import defpackage.g4f0;
import defpackage.gtq0;
import defpackage.hs31;
import defpackage.ivo0;
import defpackage.kj7;
import defpackage.kt11;
import defpackage.lnr0;
import defpackage.noh;
import defpackage.ny61;
import defpackage.r720;
import defpackage.vl7;
import defpackage.wl7;
import defpackage.xvf0;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/yandex/messaging/ui/settings/calls/CallsSettingsFragment;", "Lcom/yandex/messaging/navigation/ComposeMessengerFragment;", "Lvl7;", "Landroid/app/Activity;", "activity", "Lnoh;", "Lc020;", "activityComponentAsync", "Lkt11;", "profileComponentAsync", "<init>", "(Landroid/app/Activity;Lnoh;Lnoh;)V", "Lf530;", "modifier", "Lzy11;", "ScreenRoot", "(Lf530;Lfid;I)V", "Lhs31;", "getViewModelFactory", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lnoh;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CallsSettingsFragment extends ComposeMessengerFragment<vl7> {
    public static final int $stable = 8;
    private final noh profileComponentAsync;

    public CallsSettingsFragment(Activity activity, noh nohVar, noh nohVar2) {
        super(activity, nohVar);
        this.profileComponentAsync = nohVar2;
    }

    @Override // com.yandex.messaging.navigation.ComposeMessengerFragment
    public void ScreenRoot(f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(-724641283);
        wl7.a(f530Var, btsVar, i & 14);
        btsVar.t(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.messaging.navigation.ComposeMessengerFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getViewModelFactory(Continuation<? super hs31> continuation) {
        CallsSettingsFragment$getViewModelFactory$1 callsSettingsFragment$getViewModelFactory$1;
        int i;
        if (continuation instanceof CallsSettingsFragment$getViewModelFactory$1) {
            callsSettingsFragment$getViewModelFactory$1 = (CallsSettingsFragment$getViewModelFactory$1) continuation;
            int i2 = callsSettingsFragment$getViewModelFactory$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                callsSettingsFragment$getViewModelFactory$1.label = i2 - Integer.MIN_VALUE;
                Object obj = callsSettingsFragment$getViewModelFactory$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = callsSettingsFragment$getViewModelFactory$1.label;
                if (i != 0) {
                    b.b(obj);
                    noh nohVar = this.profileComponentAsync;
                    callsSettingsFragment$getViewModelFactory$1.L$0 = this;
                    callsSettingsFragment$getViewModelFactory$1.label = 1;
                    obj = nohVar.k(callsSettingsFragment$getViewModelFactory$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (CallsSettingsFragment) callsSettingsFragment$getViewModelFactory$1.L$0;
                    b.b(obj);
                }
                ccg ccgVar = ((ccg) ((kt11) obj)).b;
                ((vl7) this.getArguments()).getClass();
                kj7 kj7Var = new kj7((xvf0) new cg7(ccgVar.r0, ccgVar.o, 2), (xvf0) new ivo0(ccgVar.m, 29), (xvf0) ccgVar.P0, 1, false);
                LinkedHashMap A = gtq0.A(4);
                A.put(lnr0.class, ccgVar.c);
                A.put(com.yandex.messaging.ui.banners.a.class, ccgVar.d);
                A.put(g4f0.class, ccgVar.e);
                A.put(a.class, kj7Var);
                return new r720(0, !A.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A));
            }
        }
        callsSettingsFragment$getViewModelFactory$1 = new CallsSettingsFragment$getViewModelFactory$1(this, continuation);
        Object obj2 = callsSettingsFragment$getViewModelFactory$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = callsSettingsFragment$getViewModelFactory$1.label;
        if (i != 0) {
        }
        ccg ccgVar2 = ((ccg) ((kt11) obj2)).b;
        ((vl7) this.getArguments()).getClass();
        kj7 kj7Var2 = new kj7((xvf0) new cg7(ccgVar2.r0, ccgVar2.o, 2), (xvf0) new ivo0(ccgVar2.m, 29), (xvf0) ccgVar2.P0, 1, false);
        LinkedHashMap A2 = gtq0.A(4);
        A2.put(lnr0.class, ccgVar2.c);
        A2.put(com.yandex.messaging.ui.banners.a.class, ccgVar2.d);
        A2.put(g4f0.class, ccgVar2.e);
        A2.put(a.class, kj7Var2);
        return new r720(0, !A2.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A2));
    }
}
