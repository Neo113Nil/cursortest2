package com.yandex.messaging.ui.settings.privacy.blocked;

import android.app.Activity;
import com.yandex.messaging.navigation.ComposeMessengerFragment;
import defpackage.bts;
import defpackage.c4;
import defpackage.ccg;
import defpackage.f530;
import defpackage.f9t;
import defpackage.fid;
import defpackage.g4f0;
import defpackage.gtq0;
import defpackage.hs31;
import defpackage.kt11;
import defpackage.lnr0;
import defpackage.n46;
import defpackage.noh;
import defpackage.ny61;
import defpackage.o46;
import defpackage.r720;
import defpackage.xvf0;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/yandex/messaging/ui/settings/privacy/blocked/BlockedUsersComposeFragment;", "Lcom/yandex/messaging/navigation/ComposeMessengerFragment;", "Ln46;", "Landroid/app/Activity;", "activity", "Lnoh;", "Lc020;", "activityComponentAsync", "Lkt11;", "profileComponentAsync", "<init>", "(Landroid/app/Activity;Lnoh;Lnoh;)V", "Lf530;", "modifier", "Lzy11;", "ScreenRoot", "(Lf530;Lfid;I)V", "Lhs31;", "getViewModelFactory", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lnoh;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BlockedUsersComposeFragment extends ComposeMessengerFragment<n46> {
    public static final int $stable = 8;
    private final noh profileComponentAsync;

    public BlockedUsersComposeFragment(Activity activity, noh nohVar, noh nohVar2) {
        super(activity, nohVar);
        this.profileComponentAsync = nohVar2;
    }

    @Override // com.yandex.messaging.navigation.ComposeMessengerFragment
    public void ScreenRoot(f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(-456473422);
        o46.a(f530Var, btsVar, i & 14);
        btsVar.t(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.messaging.navigation.ComposeMessengerFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getViewModelFactory(Continuation<? super hs31> continuation) {
        BlockedUsersComposeFragment$getViewModelFactory$1 blockedUsersComposeFragment$getViewModelFactory$1;
        int i;
        if (continuation instanceof BlockedUsersComposeFragment$getViewModelFactory$1) {
            blockedUsersComposeFragment$getViewModelFactory$1 = (BlockedUsersComposeFragment$getViewModelFactory$1) continuation;
            int i2 = blockedUsersComposeFragment$getViewModelFactory$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                blockedUsersComposeFragment$getViewModelFactory$1.label = i2 - Integer.MIN_VALUE;
                Object obj = blockedUsersComposeFragment$getViewModelFactory$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = blockedUsersComposeFragment$getViewModelFactory$1.label;
                if (i != 0) {
                    b.b(obj);
                    noh nohVar = this.profileComponentAsync;
                    blockedUsersComposeFragment$getViewModelFactory$1.L$0 = this;
                    blockedUsersComposeFragment$getViewModelFactory$1.label = 1;
                    obj = nohVar.k(blockedUsersComposeFragment$getViewModelFactory$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (BlockedUsersComposeFragment) blockedUsersComposeFragment$getViewModelFactory$1.L$0;
                    b.b(obj);
                }
                ccg ccgVar = ((ccg) ((kt11) obj)).b;
                ((n46) this.getArguments()).getClass();
                c4 c4Var = new c4((xvf0) new f9t(ccgVar.j, ccgVar.Y, 7), (xvf0) ccgVar.a0, (xvf0) ccgVar.k, 25, false);
                LinkedHashMap A = gtq0.A(4);
                A.put(lnr0.class, ccgVar.c);
                A.put(com.yandex.messaging.ui.banners.a.class, ccgVar.d);
                A.put(g4f0.class, ccgVar.e);
                A.put(a.class, c4Var);
                return new r720(0, !A.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A));
            }
        }
        blockedUsersComposeFragment$getViewModelFactory$1 = new BlockedUsersComposeFragment$getViewModelFactory$1(this, continuation);
        Object obj2 = blockedUsersComposeFragment$getViewModelFactory$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = blockedUsersComposeFragment$getViewModelFactory$1.label;
        if (i != 0) {
        }
        ccg ccgVar2 = ((ccg) ((kt11) obj2)).b;
        ((n46) this.getArguments()).getClass();
        c4 c4Var2 = new c4((xvf0) new f9t(ccgVar2.j, ccgVar2.Y, 7), (xvf0) ccgVar2.a0, (xvf0) ccgVar2.k, 25, false);
        LinkedHashMap A2 = gtq0.A(4);
        A2.put(lnr0.class, ccgVar2.c);
        A2.put(com.yandex.messaging.ui.banners.a.class, ccgVar2.d);
        A2.put(g4f0.class, ccgVar2.e);
        A2.put(a.class, c4Var2);
        return new r720(0, !A2.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A2));
    }
}
