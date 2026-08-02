package com.yandex.messaging.ui.settings.inviteLinkInfo;

import android.app.Activity;
import android.content.Context;
import androidx.activity.result.ActivityResult;
import com.yandex.messaging.navigation.ComposeMessengerFragment;
import defpackage.aii0;
import defpackage.axw;
import defpackage.bts;
import defpackage.ccg;
import defpackage.did;
import defpackage.ds31;
import defpackage.e3u;
import defpackage.f530;
import defpackage.fid;
import defpackage.g4f0;
import defpackage.gtq0;
import defpackage.hs31;
import defpackage.jjo;
import defpackage.jww;
import defpackage.k1w;
import defpackage.kt11;
import defpackage.lnr0;
import defpackage.noh;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.oyh0;
import defpackage.q1z;
import defpackage.q7u;
import defpackage.qoi0;
import defpackage.r720;
import defpackage.rs31;
import defpackage.sfl0;
import defpackage.tje;
import defpackage.tls;
import defpackage.u520;
import defpackage.v4;
import defpackage.v7p;
import defpackage.vfc;
import defpackage.vng;
import defpackage.vqb1;
import defpackage.w4;
import defpackage.w511;
import defpackage.w8f;
import defpackage.xvf0;
import defpackage.yd00;
import defpackage.yr31;
import defpackage.yww;
import defpackage.zwv;
import defpackage.zww;
import defpackage.zy11;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/yandex/messaging/ui/settings/inviteLinkInfo/InviteLinkInfoComposeFragment;", "Lcom/yandex/messaging/navigation/ComposeMessengerFragment;", "Ljww;", "Landroid/app/Activity;", "activity", "Lnoh;", "Lc020;", "activityComponentAsync", "Lkt11;", "profileComponentAsync", "<init>", "(Landroid/app/Activity;Lnoh;Lnoh;)V", "Lf530;", "modifier", "Lcom/yandex/messaging/ui/settings/inviteLinkInfo/b;", "viewModel", "Lzy11;", "InviteLinkScreenRoot", "(Lf530;Lcom/yandex/messaging/ui/settings/inviteLinkInfo/b;Lfid;II)V", "Lsfl0;", "router", "onCopyLink", "(Lsfl0;)V", "ScreenRoot", "(Lf530;Lfid;I)V", "Lhs31;", "getViewModelFactory", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lnoh;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class InviteLinkInfoComposeFragment extends ComposeMessengerFragment<jww> {
    public static final int $stable = 8;
    private final noh profileComponentAsync;

    public InviteLinkInfoComposeFragment(Activity activity, noh nohVar, noh nohVar2) {
        super(activity, nohVar);
        this.profileComponentAsync = nohVar2;
    }

    private final void InviteLinkScreenRoot(f530 f530Var, b bVar, fid fidVar, int i, int i2) {
        int i3;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1041385401);
        if ((i & 48) == 0) {
            i3 = (((i2 & 2) == 0 && btsVar2.e(bVar)) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= btsVar2.e(this) ? 256 : 128;
        }
        if ((i3 & 145) == 144 && btsVar2.E()) {
            btsVar2.Y();
            aii0 v = btsVar2.v();
            if (v != null) {
                v.d = new v4(this, f530Var, bVar, i, i2, 17);
                return;
            }
            return;
        }
        btsVar2.a0();
        if ((i & 1) != 0 && !btsVar2.C()) {
            btsVar2.Y();
        } else if ((i2 & 2) != 0) {
            btsVar2.e0(-897180073);
            rs31 b = jjo.b(btsVar2);
            hs31 a = jjo.a(btsVar2);
            btsVar2.e0(544794079);
            boolean e = btsVar2.e(a);
            Object Q = btsVar2.Q();
            if (e || Q == did.a) {
                Q = new w4(a, 12);
                btsVar2.o0(Q);
            }
            btsVar2.t(false);
            btsVar = btsVar2;
            yr31 G = ooc.G(qoi0.a(b.class), b, null, vfc.h(b.class, new zwv(), (tls) Q), b instanceof q7u ? ((q7u) b).getDefaultViewModelCreationExtras() : w8f.b, btsVar);
            btsVar.t(false);
            btsVar.u();
            btsVar.m(q1z.a).getClass();
            ny61.u();
        }
        btsVar = btsVar2;
        btsVar.u();
        btsVar.m(q1z.a).getClass();
        ny61.u();
    }

    private static final zy11 InviteLinkScreenRoot$lambda$1$lambda$0(b bVar, ActivityResult activityResult) {
        if (activityResult.getResultCode() == -1) {
            bVar.getClass();
            tje.N(ds31.a(bVar), null, null, new InviteLinkInfoViewModel$sendEvent$1(bVar, yww.a, null), 3);
        } else {
            bVar.getClass();
        }
        return zy11.a;
    }

    private static final zy11 InviteLinkScreenRoot$lambda$3$lambda$2(InviteLinkInfoComposeFragment inviteLinkInfoComposeFragment, sfl0 sfl0Var, Context context, yd00 yd00Var, b bVar, axw axwVar) {
        if (axwVar instanceof yww) {
            inviteLinkInfoComposeFragment.onCopyLink(sfl0Var);
            return zy11.a;
        }
        if (axwVar instanceof zww) {
            throw null;
        }
        w511.b();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 InviteLinkScreenRoot$lambda$7(InviteLinkInfoComposeFragment inviteLinkInfoComposeFragment, f530 f530Var, b bVar, int i, int i2, fid fidVar, int i3) {
        inviteLinkInfoComposeFragment.InviteLinkScreenRoot(f530Var, bVar, fidVar, vng.O(i | 1), i2);
        return zy11.a;
    }

    private final void onCopyLink(sfl0 router) {
        int i = u520.d;
        router.getClass();
        vqb1.g(oyh0.invitelink_copied_notification, requireActivity());
    }

    @Override // com.yandex.messaging.navigation.ComposeMessengerFragment
    public void ScreenRoot(f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(1783855979);
        InviteLinkScreenRoot(f530Var, null, btsVar, (i & 14) | ((i << 3) & 896), 2);
        btsVar.t(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.messaging.navigation.ComposeMessengerFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getViewModelFactory(Continuation<? super hs31> continuation) {
        InviteLinkInfoComposeFragment$getViewModelFactory$1 inviteLinkInfoComposeFragment$getViewModelFactory$1;
        int i;
        if (continuation instanceof InviteLinkInfoComposeFragment$getViewModelFactory$1) {
            inviteLinkInfoComposeFragment$getViewModelFactory$1 = (InviteLinkInfoComposeFragment$getViewModelFactory$1) continuation;
            int i2 = inviteLinkInfoComposeFragment$getViewModelFactory$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                inviteLinkInfoComposeFragment$getViewModelFactory$1.label = i2 - Integer.MIN_VALUE;
                Object obj = inviteLinkInfoComposeFragment$getViewModelFactory$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inviteLinkInfoComposeFragment$getViewModelFactory$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    noh nohVar = this.profileComponentAsync;
                    inviteLinkInfoComposeFragment$getViewModelFactory$1.L$0 = this;
                    inviteLinkInfoComposeFragment$getViewModelFactory$1.label = 1;
                    obj = nohVar.k(inviteLinkInfoComposeFragment$getViewModelFactory$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (InviteLinkInfoComposeFragment) inviteLinkInfoComposeFragment$getViewModelFactory$1.L$0;
                    kotlin.b.b(obj);
                }
                ccg ccgVar = ((ccg) ((kt11) obj)).b;
                ((jww) this.getArguments()).getClass();
                int i3 = 9;
                e3u e3uVar = new e3u((xvf0) ccgVar.e0, (xvf0) ccgVar.S, (v7p) new k1w(ccgVar.m, i3), i3);
                LinkedHashMap A = gtq0.A(4);
                A.put(lnr0.class, ccgVar.c);
                A.put(com.yandex.messaging.ui.banners.a.class, ccgVar.d);
                A.put(g4f0.class, ccgVar.e);
                A.put(b.class, e3uVar);
                return new r720(0, !A.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A));
            }
        }
        inviteLinkInfoComposeFragment$getViewModelFactory$1 = new InviteLinkInfoComposeFragment$getViewModelFactory$1(this, continuation);
        Object obj2 = inviteLinkInfoComposeFragment$getViewModelFactory$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inviteLinkInfoComposeFragment$getViewModelFactory$1.label;
        if (i != 0) {
        }
        ccg ccgVar2 = ((ccg) ((kt11) obj2)).b;
        ((jww) this.getArguments()).getClass();
        int i32 = 9;
        e3u e3uVar2 = new e3u((xvf0) ccgVar2.e0, (xvf0) ccgVar2.S, (v7p) new k1w(ccgVar2.m, i32), i32);
        LinkedHashMap A2 = gtq0.A(4);
        A2.put(lnr0.class, ccgVar2.c);
        A2.put(com.yandex.messaging.ui.banners.a.class, ccgVar2.d);
        A2.put(g4f0.class, ccgVar2.e);
        A2.put(b.class, e3uVar2);
        return new r720(0, !A2.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A2));
    }
}
