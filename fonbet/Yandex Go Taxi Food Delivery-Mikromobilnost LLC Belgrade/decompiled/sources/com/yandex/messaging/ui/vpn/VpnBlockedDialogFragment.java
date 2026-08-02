package com.yandex.messaging.ui.vpn;

import com.yandex.messaging.navigation.ComposeBottomSheetDialogFragment;
import defpackage.bk91;
import defpackage.bts;
import defpackage.ccg;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.g4f0;
import defpackage.gtq0;
import defpackage.hs31;
import defpackage.kt11;
import defpackage.lnr0;
import defpackage.n3w;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qx5;
import defpackage.r720;
import defpackage.sls;
import defpackage.tfx;
import defpackage.xz31;
import defpackage.zz31;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0015¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0094@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/messaging/ui/vpn/VpnBlockedDialogFragment;", "Lcom/yandex/messaging/navigation/ComposeBottomSheetDialogFragment;", "Lxz31;", "Lnoh;", "Lc020;", "activityComponentAsync", "Lkt11;", "profileComponentAsync", "<init>", "(Lnoh;Lnoh;)V", "Lf530;", "modifier", "Lzy11;", "DialogContent", "(Lf530;Lfid;I)V", "Lhs31;", "getViewModelFactory", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class VpnBlockedDialogFragment extends ComposeBottomSheetDialogFragment<xz31> {
    public static final int $stable = 0;

    public VpnBlockedDialogFragment(noh nohVar, noh nohVar2) {
        super(nohVar, nohVar2);
    }

    @Override // com.yandex.messaging.navigation.ComposeBottomSheetDialogFragment
    public void DialogContent(f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(-688007042);
        xz31 arguments = getArguments();
        btsVar.e0(-1286836874);
        boolean z = (((i & 112) ^ 48) > 32 && btsVar.k(this)) || (i & 48) == 32;
        Object Q = btsVar.Q();
        if (z || Q == did.a) {
            VpnBlockedDialogFragment$DialogContent$1$1 vpnBlockedDialogFragment$DialogContent$1$1 = new VpnBlockedDialogFragment$DialogContent$1$1(0, this, VpnBlockedDialogFragment.class, "dismiss", "dismiss()V", 0);
            btsVar.o0(vpnBlockedDialogFragment$DialogContent$1$1);
            Q = vpnBlockedDialogFragment$DialogContent$1$1;
        }
        btsVar.t(false);
        bk91.c(arguments, null, null, (sls) ((tfx) Q), 0, btsVar, 0);
        btsVar.t(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.messaging.navigation.ComposeBottomSheetDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getViewModelFactory(Continuation<? super hs31> continuation) {
        VpnBlockedDialogFragment$getViewModelFactory$1 vpnBlockedDialogFragment$getViewModelFactory$1;
        int i;
        if (continuation instanceof VpnBlockedDialogFragment$getViewModelFactory$1) {
            vpnBlockedDialogFragment$getViewModelFactory$1 = (VpnBlockedDialogFragment$getViewModelFactory$1) continuation;
            int i2 = vpnBlockedDialogFragment$getViewModelFactory$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vpnBlockedDialogFragment$getViewModelFactory$1.label = i2 - Integer.MIN_VALUE;
                Object obj = vpnBlockedDialogFragment$getViewModelFactory$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = vpnBlockedDialogFragment$getViewModelFactory$1.label;
                if (i != 0) {
                    b.b(obj);
                    noh profileComponentAsync = getProfileComponentAsync();
                    vpnBlockedDialogFragment$getViewModelFactory$1.L$0 = this;
                    vpnBlockedDialogFragment$getViewModelFactory$1.label = 1;
                    obj = profileComponentAsync.k(vpnBlockedDialogFragment$getViewModelFactory$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (VpnBlockedDialogFragment) vpnBlockedDialogFragment$getViewModelFactory$1.L$0;
                    b.b(obj);
                }
                ccg ccgVar = ((ccg) ((kt11) obj)).b;
                xz31 arguments = this.getArguments();
                arguments.getClass();
                qx5 qx5Var = new qx5(n3w.a(arguments), ccgVar.k, 28);
                LinkedHashMap A = gtq0.A(4);
                A.put(lnr0.class, ccgVar.c);
                A.put(com.yandex.messaging.ui.banners.a.class, ccgVar.d);
                A.put(g4f0.class, ccgVar.e);
                A.put(zz31.class, qx5Var);
                return new r720(0, !A.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A));
            }
        }
        vpnBlockedDialogFragment$getViewModelFactory$1 = new VpnBlockedDialogFragment$getViewModelFactory$1(this, continuation);
        Object obj2 = vpnBlockedDialogFragment$getViewModelFactory$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = vpnBlockedDialogFragment$getViewModelFactory$1.label;
        if (i != 0) {
        }
        ccg ccgVar2 = ((ccg) ((kt11) obj2)).b;
        xz31 arguments2 = this.getArguments();
        arguments2.getClass();
        qx5 qx5Var2 = new qx5(n3w.a(arguments2), ccgVar2.k, 28);
        LinkedHashMap A2 = gtq0.A(4);
        A2.put(lnr0.class, ccgVar2.c);
        A2.put(com.yandex.messaging.ui.banners.a.class, ccgVar2.d);
        A2.put(g4f0.class, ccgVar2.e);
        A2.put(zz31.class, qx5Var2);
        return new r720(0, !A2.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A2));
    }
}
