package com.yandex.messaging.ui.neophonish;

import com.yandex.messaging.navigation.ComposeBottomSheetDialogFragment;
import defpackage.bts;
import defpackage.ccg;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.g4f0;
import defpackage.gm50;
import defpackage.gtq0;
import defpackage.hs31;
import defpackage.kt11;
import defpackage.lnr0;
import defpackage.n3w;
import defpackage.noh;
import defpackage.ny61;
import defpackage.r720;
import defpackage.rx4;
import defpackage.sls;
import defpackage.tfx;
import defpackage.tm50;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0015¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0094@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/messaging/ui/neophonish/NeophonishUpgradeDialogFragment;", "Lcom/yandex/messaging/navigation/ComposeBottomSheetDialogFragment;", "Lgm50;", "Lnoh;", "Lc020;", "activityComponentAsync", "Lkt11;", "profileComponentAsync", "<init>", "(Lnoh;Lnoh;)V", "Lf530;", "modifier", "Lzy11;", "DialogContent", "(Lf530;Lfid;I)V", "Lhs31;", "getViewModelFactory", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NeophonishUpgradeDialogFragment extends ComposeBottomSheetDialogFragment<gm50> {
    public static final int $stable = 0;

    public NeophonishUpgradeDialogFragment(noh nohVar, noh nohVar2) {
        super(nohVar, nohVar2);
    }

    @Override // com.yandex.messaging.navigation.ComposeBottomSheetDialogFragment
    public void DialogContent(f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(-238609215);
        gm50 arguments = getArguments();
        btsVar.e0(1221554770);
        boolean z = (((i & 112) ^ 48) > 32 && btsVar.k(this)) || (i & 48) == 32;
        Object Q = btsVar.Q();
        if (z || Q == did.a) {
            NeophonishUpgradeDialogFragment$DialogContent$1$1 neophonishUpgradeDialogFragment$DialogContent$1$1 = new NeophonishUpgradeDialogFragment$DialogContent$1$1(0, this, NeophonishUpgradeDialogFragment.class, "dismiss", "dismiss()V", 0);
            btsVar.o0(neophonishUpgradeDialogFragment$DialogContent$1$1);
            Q = neophonishUpgradeDialogFragment$DialogContent$1$1;
        }
        btsVar.t(false);
        b.e(arguments, null, null, (sls) ((tfx) Q), 0, btsVar, 0);
        btsVar.t(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.messaging.navigation.ComposeBottomSheetDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getViewModelFactory(Continuation<? super hs31> continuation) {
        NeophonishUpgradeDialogFragment$getViewModelFactory$1 neophonishUpgradeDialogFragment$getViewModelFactory$1;
        int i;
        if (continuation instanceof NeophonishUpgradeDialogFragment$getViewModelFactory$1) {
            neophonishUpgradeDialogFragment$getViewModelFactory$1 = (NeophonishUpgradeDialogFragment$getViewModelFactory$1) continuation;
            int i2 = neophonishUpgradeDialogFragment$getViewModelFactory$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                neophonishUpgradeDialogFragment$getViewModelFactory$1.label = i2 - Integer.MIN_VALUE;
                Object obj = neophonishUpgradeDialogFragment$getViewModelFactory$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = neophonishUpgradeDialogFragment$getViewModelFactory$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    noh profileComponentAsync = getProfileComponentAsync();
                    neophonishUpgradeDialogFragment$getViewModelFactory$1.L$0 = this;
                    neophonishUpgradeDialogFragment$getViewModelFactory$1.label = 1;
                    obj = profileComponentAsync.k(neophonishUpgradeDialogFragment$getViewModelFactory$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (NeophonishUpgradeDialogFragment) neophonishUpgradeDialogFragment$getViewModelFactory$1.L$0;
                    kotlin.b.b(obj);
                }
                ccg ccgVar = ((ccg) ((kt11) obj)).b;
                gm50 arguments = this.getArguments();
                arguments.getClass();
                rx4 rx4Var = new rx4(n3w.a(arguments), ccgVar.k, ccgVar.T0, ccgVar.v, 13);
                LinkedHashMap A = gtq0.A(4);
                A.put(lnr0.class, ccgVar.c);
                A.put(com.yandex.messaging.ui.banners.a.class, ccgVar.d);
                A.put(g4f0.class, ccgVar.e);
                A.put(tm50.class, rx4Var);
                return new r720(0, !A.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A));
            }
        }
        neophonishUpgradeDialogFragment$getViewModelFactory$1 = new NeophonishUpgradeDialogFragment$getViewModelFactory$1(this, continuation);
        Object obj2 = neophonishUpgradeDialogFragment$getViewModelFactory$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = neophonishUpgradeDialogFragment$getViewModelFactory$1.label;
        if (i != 0) {
        }
        ccg ccgVar2 = ((ccg) ((kt11) obj2)).b;
        gm50 arguments2 = this.getArguments();
        arguments2.getClass();
        rx4 rx4Var2 = new rx4(n3w.a(arguments2), ccgVar2.k, ccgVar2.T0, ccgVar2.v, 13);
        LinkedHashMap A2 = gtq0.A(4);
        A2.put(lnr0.class, ccgVar2.c);
        A2.put(com.yandex.messaging.ui.banners.a.class, ccgVar2.d);
        A2.put(g4f0.class, ccgVar2.e);
        A2.put(tm50.class, rx4Var2);
        return new r720(0, !A2.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A2));
    }
}
