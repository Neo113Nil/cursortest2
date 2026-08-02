package com.yandex.messaging.ui.settings.inviteLinkInfo;

import android.app.Activity;
import com.yandex.messaging.navigation.ComposeBottomSheetDialogFragment;
import defpackage.bts;
import defpackage.ccg;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.g4f0;
import defpackage.gtq0;
import defpackage.hs31;
import defpackage.jww;
import defpackage.k1w;
import defpackage.kt11;
import defpackage.kww;
import defpackage.lnr0;
import defpackage.noh;
import defpackage.ny61;
import defpackage.r720;
import defpackage.ret;
import defpackage.sls;
import defpackage.tfx;
import defpackage.z6x0;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0015¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0094@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/yandex/messaging/ui/settings/inviteLinkInfo/InviteLinkInfoDialogFragment;", "Lcom/yandex/messaging/navigation/ComposeBottomSheetDialogFragment;", "Ljww;", "Landroid/app/Activity;", "activity", "Lnoh;", "Lc020;", "activityComponentAsync", "Lkt11;", "profileComponentAsync", "<init>", "(Landroid/app/Activity;Lnoh;Lnoh;)V", "Lf530;", "modifier", "Lzy11;", "DialogContent", "(Lf530;Lfid;I)V", "Lhs31;", "getViewModelFactory", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/app/Activity;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class InviteLinkInfoDialogFragment extends ComposeBottomSheetDialogFragment<jww> {
    public static final int $stable = 8;
    private final Activity activity;

    public InviteLinkInfoDialogFragment(Activity activity, noh nohVar, noh nohVar2) {
        super(nohVar, nohVar2);
        this.activity = activity;
    }

    @Override // com.yandex.messaging.navigation.ComposeBottomSheetDialogFragment
    public void DialogContent(f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(584936612);
        Activity activity = this.activity;
        btsVar.e0(-1447056121);
        boolean e = btsVar.e(this);
        Object Q = btsVar.Q();
        if (e || Q == did.a) {
            InviteLinkInfoDialogFragment$DialogContent$1$1 inviteLinkInfoDialogFragment$DialogContent$1$1 = new InviteLinkInfoDialogFragment$DialogContent$1$1(0, this, InviteLinkInfoDialogFragment.class, "dismiss", "dismiss()V", 0);
            btsVar.o0(inviteLinkInfoDialogFragment$DialogContent$1$1);
            Q = inviteLinkInfoDialogFragment$DialogContent$1$1;
        }
        btsVar.t(false);
        kww.c(activity, null, (sls) ((tfx) Q), null, btsVar, 0);
        btsVar.t(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.messaging.navigation.ComposeBottomSheetDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getViewModelFactory(Continuation<? super hs31> continuation) {
        InviteLinkInfoDialogFragment$getViewModelFactory$1 inviteLinkInfoDialogFragment$getViewModelFactory$1;
        int i;
        if (continuation instanceof InviteLinkInfoDialogFragment$getViewModelFactory$1) {
            inviteLinkInfoDialogFragment$getViewModelFactory$1 = (InviteLinkInfoDialogFragment$getViewModelFactory$1) continuation;
            int i2 = inviteLinkInfoDialogFragment$getViewModelFactory$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                inviteLinkInfoDialogFragment$getViewModelFactory$1.label = i2 - Integer.MIN_VALUE;
                Object obj = inviteLinkInfoDialogFragment$getViewModelFactory$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inviteLinkInfoDialogFragment$getViewModelFactory$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    noh profileComponentAsync = getProfileComponentAsync();
                    inviteLinkInfoDialogFragment$getViewModelFactory$1.label = 1;
                    obj = profileComponentAsync.k(inviteLinkInfoDialogFragment$getViewModelFactory$1);
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
                ccg ccgVar = ((ccg) ((kt11) obj)).b;
                z6x0 z6x0Var = new z6x0(ccgVar.e0, ccgVar.Q0, new k1w(ccgVar.m, 9), new ret(ccgVar.f0, ccgVar.g0, ccgVar.X, 4), 6);
                LinkedHashMap A = gtq0.A(4);
                A.put(lnr0.class, ccgVar.c);
                A.put(com.yandex.messaging.ui.banners.a.class, ccgVar.d);
                A.put(g4f0.class, ccgVar.e);
                A.put(c.class, z6x0Var);
                return new r720(0, !A.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A));
            }
        }
        inviteLinkInfoDialogFragment$getViewModelFactory$1 = new InviteLinkInfoDialogFragment$getViewModelFactory$1(this, continuation);
        Object obj2 = inviteLinkInfoDialogFragment$getViewModelFactory$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inviteLinkInfoDialogFragment$getViewModelFactory$1.label;
        if (i != 0) {
        }
        ccg ccgVar2 = ((ccg) ((kt11) obj2)).b;
        z6x0 z6x0Var2 = new z6x0(ccgVar2.e0, ccgVar2.Q0, new k1w(ccgVar2.m, 9), new ret(ccgVar2.f0, ccgVar2.g0, ccgVar2.X, 4), 6);
        LinkedHashMap A2 = gtq0.A(4);
        A2.put(lnr0.class, ccgVar2.c);
        A2.put(com.yandex.messaging.ui.banners.a.class, ccgVar2.d);
        A2.put(g4f0.class, ccgVar2.e);
        A2.put(c.class, z6x0Var2);
        return new r720(0, !A2.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A2));
    }
}
