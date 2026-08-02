package com.yandex.messaging.ui.joinlink;

import com.yandex.messaging.navigation.ComposeBottomSheetDialogFragment;
import defpackage.bts;
import defpackage.ccg;
import defpackage.did;
import defpackage.f2b;
import defpackage.f530;
import defpackage.fid;
import defpackage.g4f0;
import defpackage.gtq0;
import defpackage.hs31;
import defpackage.k1w;
import defpackage.k9x;
import defpackage.kt11;
import defpackage.l9x;
import defpackage.lnr0;
import defpackage.n9x;
import defpackage.noh;
import defpackage.ny61;
import defpackage.r720;
import defpackage.sls;
import defpackage.tfx;
import defpackage.xvf0;
import defpackage.z9n;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0015¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0094@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/messaging/ui/joinlink/JoinLinkDialogFragment;", "Lcom/yandex/messaging/navigation/ComposeBottomSheetDialogFragment;", "Lk9x;", "Lnoh;", "Lc020;", "activityComponentAsync", "Lkt11;", "profileComponentAsync", "<init>", "(Lnoh;Lnoh;)V", "Lf530;", "modifier", "Lzy11;", "DialogContent", "(Lf530;Lfid;I)V", "Lhs31;", "getViewModelFactory", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class JoinLinkDialogFragment extends ComposeBottomSheetDialogFragment<k9x> {
    public static final int $stable = 0;

    public JoinLinkDialogFragment(noh nohVar, noh nohVar2) {
        super(nohVar, nohVar2);
    }

    @Override // com.yandex.messaging.navigation.ComposeBottomSheetDialogFragment
    public void DialogContent(f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(-672640428);
        btsVar.e0(228003730);
        boolean z = (((i & 112) ^ 48) > 32 && btsVar.k(this)) || (i & 48) == 32;
        Object Q = btsVar.Q();
        if (z || Q == did.a) {
            JoinLinkDialogFragment$DialogContent$1$1 joinLinkDialogFragment$DialogContent$1$1 = new JoinLinkDialogFragment$DialogContent$1$1(0, this, JoinLinkDialogFragment.class, "dismiss", "dismiss()V", 0);
            btsVar.o0(joinLinkDialogFragment$DialogContent$1$1);
            Q = joinLinkDialogFragment$DialogContent$1$1;
        }
        btsVar.t(false);
        l9x.a((i << 3) & 112, btsVar, (sls) ((tfx) Q), f530Var);
        btsVar.t(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.messaging.navigation.ComposeBottomSheetDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getViewModelFactory(Continuation<? super hs31> continuation) {
        JoinLinkDialogFragment$getViewModelFactory$1 joinLinkDialogFragment$getViewModelFactory$1;
        int i;
        if (continuation instanceof JoinLinkDialogFragment$getViewModelFactory$1) {
            joinLinkDialogFragment$getViewModelFactory$1 = (JoinLinkDialogFragment$getViewModelFactory$1) continuation;
            int i2 = joinLinkDialogFragment$getViewModelFactory$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                joinLinkDialogFragment$getViewModelFactory$1.label = i2 - Integer.MIN_VALUE;
                Object obj = joinLinkDialogFragment$getViewModelFactory$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = joinLinkDialogFragment$getViewModelFactory$1.label;
                if (i != 0) {
                    b.b(obj);
                    noh profileComponentAsync = getProfileComponentAsync();
                    joinLinkDialogFragment$getViewModelFactory$1.label = 1;
                    obj = profileComponentAsync.k(joinLinkDialogFragment$getViewModelFactory$1);
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
                ccg ccgVar = ((ccg) ((kt11) obj)).b;
                z9n z9nVar = new z9n((xvf0) ccgVar.m, (xvf0) new f2b(ccgVar.L, ccgVar.S, new k1w(ccgVar.r0, 19), 6), (xvf0) ccgVar.I, (xvf0) ccgVar.X, 28, (char) 0);
                LinkedHashMap A = gtq0.A(4);
                A.put(lnr0.class, ccgVar.c);
                A.put(com.yandex.messaging.ui.banners.a.class, ccgVar.d);
                A.put(g4f0.class, ccgVar.e);
                A.put(n9x.class, z9nVar);
                return new r720(0, !A.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A));
            }
        }
        joinLinkDialogFragment$getViewModelFactory$1 = new JoinLinkDialogFragment$getViewModelFactory$1(this, continuation);
        Object obj2 = joinLinkDialogFragment$getViewModelFactory$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = joinLinkDialogFragment$getViewModelFactory$1.label;
        if (i != 0) {
        }
        ccg ccgVar2 = ((ccg) ((kt11) obj2)).b;
        z9n z9nVar2 = new z9n((xvf0) ccgVar2.m, (xvf0) new f2b(ccgVar2.L, ccgVar2.S, new k1w(ccgVar2.r0, 19), 6), (xvf0) ccgVar2.I, (xvf0) ccgVar2.X, 28, (char) 0);
        LinkedHashMap A2 = gtq0.A(4);
        A2.put(lnr0.class, ccgVar2.c);
        A2.put(com.yandex.messaging.ui.banners.a.class, ccgVar2.d);
        A2.put(g4f0.class, ccgVar2.e);
        A2.put(n9x.class, z9nVar2);
        return new r720(0, !A2.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A2));
    }
}
