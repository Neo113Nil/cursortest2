package com.yandex.messaging.ui.calllist.info;

import com.yandex.messaging.navigation.ComposeBottomSheetDialogFragment;
import com.yandex.messaging.telemost.domain.entities.CallHistoryData;
import defpackage.bcg;
import defpackage.bts;
import defpackage.c0j;
import defpackage.c4c;
import defpackage.ccg;
import defpackage.did;
import defpackage.f530;
import defpackage.f9t;
import defpackage.fid;
import defpackage.g4f0;
import defpackage.gtq0;
import defpackage.hs31;
import defpackage.ht0;
import defpackage.kt11;
import defpackage.lnr0;
import defpackage.n3w;
import defpackage.noh;
import defpackage.ny61;
import defpackage.o430;
import defpackage.r720;
import defpackage.rh7;
import defpackage.sls;
import defpackage.tfx;
import defpackage.th7;
import defpackage.ybg;
import defpackage.z9n;
import defpackage.zo0;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0015¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0094@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/messaging/ui/calllist/info/CallHistoryInfoDialogFragment;", "Lcom/yandex/messaging/navigation/ComposeBottomSheetDialogFragment;", "Lth7;", "Lnoh;", "Lc020;", "activityComponentAsync", "Lkt11;", "profileComponentAsync", "<init>", "(Lnoh;Lnoh;)V", "Lf530;", "modifier", "Lzy11;", "DialogContent", "(Lf530;Lfid;I)V", "Lhs31;", "getViewModelFactory", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CallHistoryInfoDialogFragment extends ComposeBottomSheetDialogFragment<th7> {
    public static final int $stable = 0;

    public CallHistoryInfoDialogFragment(noh nohVar, noh nohVar2) {
        super(nohVar, nohVar2);
    }

    @Override // com.yandex.messaging.navigation.ComposeBottomSheetDialogFragment
    public void DialogContent(f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(-1888388266);
        th7 arguments = getArguments();
        btsVar.e0(1560959867);
        boolean k = btsVar.k(arguments);
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (k || Q == o430Var) {
            Q = getArguments().b;
            btsVar.o0(Q);
        }
        CallHistoryData callHistoryData = (CallHistoryData) Q;
        btsVar.t(false);
        btsVar.e0(1560964506);
        boolean z = (((i & 112) ^ 48) > 32 && btsVar.k(this)) || (i & 48) == 32;
        Object Q2 = btsVar.Q();
        if (z || Q2 == o430Var) {
            CallHistoryInfoDialogFragment$DialogContent$1$1 callHistoryInfoDialogFragment$DialogContent$1$1 = new CallHistoryInfoDialogFragment$DialogContent$1$1(0, this, CallHistoryInfoDialogFragment.class, "dismiss", "dismiss()V", 0);
            btsVar.o0(callHistoryInfoDialogFragment$DialogContent$1$1);
            Q2 = callHistoryInfoDialogFragment$DialogContent$1$1;
        }
        btsVar.t(false);
        rh7.a(callHistoryData, (sls) ((tfx) Q2), btsVar, 0);
        btsVar.t(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.messaging.navigation.ComposeBottomSheetDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getViewModelFactory(Continuation<? super hs31> continuation) {
        CallHistoryInfoDialogFragment$getViewModelFactory$1 callHistoryInfoDialogFragment$getViewModelFactory$1;
        int i;
        if (continuation instanceof CallHistoryInfoDialogFragment$getViewModelFactory$1) {
            callHistoryInfoDialogFragment$getViewModelFactory$1 = (CallHistoryInfoDialogFragment$getViewModelFactory$1) continuation;
            int i2 = callHistoryInfoDialogFragment$getViewModelFactory$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                callHistoryInfoDialogFragment$getViewModelFactory$1.label = i2 - Integer.MIN_VALUE;
                Object obj = callHistoryInfoDialogFragment$getViewModelFactory$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = callHistoryInfoDialogFragment$getViewModelFactory$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    noh profileComponentAsync = getProfileComponentAsync();
                    callHistoryInfoDialogFragment$getViewModelFactory$1.L$0 = this;
                    callHistoryInfoDialogFragment$getViewModelFactory$1.label = 1;
                    obj = profileComponentAsync.k(callHistoryInfoDialogFragment$getViewModelFactory$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (CallHistoryInfoDialogFragment) callHistoryInfoDialogFragment$getViewModelFactory$1.L$0;
                    kotlin.b.b(obj);
                }
                ccg ccgVar = ((ccg) ((kt11) obj)).b;
                th7 arguments = this.getArguments();
                arguments.getClass();
                n3w a = n3w.a(arguments);
                bcg bcgVar = ccgVar.G;
                ybg ybgVar = ccgVar.j;
                f9t f9tVar = new f9t(bcgVar, ybgVar, 10);
                ht0 ht0Var = new ht0(a, new z9n(ybgVar, new zo0(ccgVar.J, ccgVar.t, ccgVar.K, f9tVar, ybgVar, c4c.a, 20), f9tVar, ccgVar.r, 20, 0), new c0j(ccgVar.T, ccgVar.n, ybgVar, ccgVar.h, 13), new f9t(ybgVar, bcgVar, 9), ccgVar.a0, ccgVar.z, ccgVar.H);
                LinkedHashMap A = gtq0.A(4);
                A.put(lnr0.class, ccgVar.c);
                A.put(com.yandex.messaging.ui.banners.a.class, ccgVar.d);
                A.put(g4f0.class, ccgVar.e);
                A.put(c.class, ht0Var);
                return new r720(0, !A.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A));
            }
        }
        callHistoryInfoDialogFragment$getViewModelFactory$1 = new CallHistoryInfoDialogFragment$getViewModelFactory$1(this, continuation);
        Object obj2 = callHistoryInfoDialogFragment$getViewModelFactory$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = callHistoryInfoDialogFragment$getViewModelFactory$1.label;
        if (i != 0) {
        }
        ccg ccgVar2 = ((ccg) ((kt11) obj2)).b;
        th7 arguments2 = this.getArguments();
        arguments2.getClass();
        n3w a2 = n3w.a(arguments2);
        bcg bcgVar2 = ccgVar2.G;
        ybg ybgVar2 = ccgVar2.j;
        f9t f9tVar2 = new f9t(bcgVar2, ybgVar2, 10);
        ht0 ht0Var2 = new ht0(a2, new z9n(ybgVar2, new zo0(ccgVar2.J, ccgVar2.t, ccgVar2.K, f9tVar2, ybgVar2, c4c.a, 20), f9tVar2, ccgVar2.r, 20, 0), new c0j(ccgVar2.T, ccgVar2.n, ybgVar2, ccgVar2.h, 13), new f9t(ybgVar2, bcgVar2, 9), ccgVar2.a0, ccgVar2.z, ccgVar2.H);
        LinkedHashMap A2 = gtq0.A(4);
        A2.put(lnr0.class, ccgVar2.c);
        A2.put(com.yandex.messaging.ui.banners.a.class, ccgVar2.d);
        A2.put(g4f0.class, ccgVar2.e);
        A2.put(c.class, ht0Var2);
        return new r720(0, !A2.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A2));
    }
}
