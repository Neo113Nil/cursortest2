package com.yandex.messaging.phonecontacts;

import com.yandex.messaging.navigation.ComposeBottomSheetDialogFragment;
import defpackage.bts;
import defpackage.c0j;
import defpackage.ccg;
import defpackage.did;
import defpackage.f530;
import defpackage.fae;
import defpackage.fid;
import defpackage.g4f0;
import defpackage.gae;
import defpackage.gtq0;
import defpackage.hs31;
import defpackage.kt11;
import defpackage.lnr0;
import defpackage.noh;
import defpackage.ny61;
import defpackage.r720;
import defpackage.sls;
import defpackage.tfx;
import defpackage.xea;
import defpackage.ybg;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0015¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0094@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/messaging/phonecontacts/ContactListDialogFragment;", "Lcom/yandex/messaging/navigation/ComposeBottomSheetDialogFragment;", "Lfae;", "Lnoh;", "Lc020;", "activityComponentAsync", "Lkt11;", "profileComponentAsync", "<init>", "(Lnoh;Lnoh;)V", "Lf530;", "modifier", "Lzy11;", "DialogContent", "(Lf530;Lfid;I)V", "Lhs31;", "getViewModelFactory", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ContactListDialogFragment extends ComposeBottomSheetDialogFragment<fae> {
    public static final int $stable = 0;

    public ContactListDialogFragment(noh nohVar, noh nohVar2) {
        super(nohVar, nohVar2);
    }

    @Override // com.yandex.messaging.navigation.ComposeBottomSheetDialogFragment
    public void DialogContent(f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(629582295);
        btsVar.e0(-432456037);
        boolean z = (((i & 112) ^ 48) > 32 && btsVar.k(this)) || (i & 48) == 32;
        Object Q = btsVar.Q();
        if (z || Q == did.a) {
            ContactListDialogFragment$DialogContent$1$1 contactListDialogFragment$DialogContent$1$1 = new ContactListDialogFragment$DialogContent$1$1(0, this, ContactListDialogFragment.class, "dismiss", "dismiss()V", 0);
            btsVar.o0(contactListDialogFragment$DialogContent$1$1);
            Q = contactListDialogFragment$DialogContent$1$1;
        }
        btsVar.t(false);
        gae.a((i << 3) & 112, btsVar, (sls) ((tfx) Q), f530Var);
        btsVar.t(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.messaging.navigation.ComposeBottomSheetDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getViewModelFactory(Continuation<? super hs31> continuation) {
        ContactListDialogFragment$getViewModelFactory$1 contactListDialogFragment$getViewModelFactory$1;
        int i;
        if (continuation instanceof ContactListDialogFragment$getViewModelFactory$1) {
            contactListDialogFragment$getViewModelFactory$1 = (ContactListDialogFragment$getViewModelFactory$1) continuation;
            int i2 = contactListDialogFragment$getViewModelFactory$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                contactListDialogFragment$getViewModelFactory$1.label = i2 - Integer.MIN_VALUE;
                Object obj = contactListDialogFragment$getViewModelFactory$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = contactListDialogFragment$getViewModelFactory$1.label;
                if (i != 0) {
                    b.b(obj);
                    noh profileComponentAsync = getProfileComponentAsync();
                    contactListDialogFragment$getViewModelFactory$1.L$0 = this;
                    contactListDialogFragment$getViewModelFactory$1.label = 1;
                    obj = profileComponentAsync.k(contactListDialogFragment$getViewModelFactory$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (ContactListDialogFragment) contactListDialogFragment$getViewModelFactory$1.L$0;
                    b.b(obj);
                }
                ccg ccgVar = ((ccg) ((kt11) obj)).b;
                this.getArguments().getClass();
                ybg ybgVar = ccgVar.T;
                ybg ybgVar2 = ccgVar.n;
                ybg ybgVar3 = ccgVar.j;
                xea xeaVar = new xea(new c0j(ybgVar, ybgVar2, ybgVar3, ccgVar.h, 13), ybgVar3, ccgVar.i0, ccgVar.m, 22);
                LinkedHashMap A = gtq0.A(4);
                A.put(lnr0.class, ccgVar.c);
                A.put(com.yandex.messaging.ui.banners.a.class, ccgVar.d);
                A.put(g4f0.class, ccgVar.e);
                A.put(a.class, xeaVar);
                return new r720(0, !A.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A));
            }
        }
        contactListDialogFragment$getViewModelFactory$1 = new ContactListDialogFragment$getViewModelFactory$1(this, continuation);
        Object obj2 = contactListDialogFragment$getViewModelFactory$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = contactListDialogFragment$getViewModelFactory$1.label;
        if (i != 0) {
        }
        ccg ccgVar2 = ((ccg) ((kt11) obj2)).b;
        this.getArguments().getClass();
        ybg ybgVar4 = ccgVar2.T;
        ybg ybgVar22 = ccgVar2.n;
        ybg ybgVar32 = ccgVar2.j;
        xea xeaVar2 = new xea(new c0j(ybgVar4, ybgVar22, ybgVar32, ccgVar2.h, 13), ybgVar32, ccgVar2.i0, ccgVar2.m, 22);
        LinkedHashMap A2 = gtq0.A(4);
        A2.put(lnr0.class, ccgVar2.c);
        A2.put(com.yandex.messaging.ui.banners.a.class, ccgVar2.d);
        A2.put(g4f0.class, ccgVar2.e);
        A2.put(a.class, xeaVar2);
        return new r720(0, !A2.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A2));
    }
}
