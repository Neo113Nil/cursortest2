package com.yandex.messaging.ui.calllist;

import android.app.Activity;
import android.view.View;
import android.view.WindowInsets;
import com.yandex.messaging.navigation.ComposeMessengerFragment;
import com.yandex.messaging.telemost.MeetingStartSource;
import defpackage.bcg;
import defpackage.bts;
import defpackage.c4c;
import defpackage.ccg;
import defpackage.did;
import defpackage.f530;
import defpackage.f9t;
import defpackage.fae;
import defpackage.ffx;
import defpackage.fid;
import defpackage.g4f0;
import defpackage.gm50;
import defpackage.gtq0;
import defpackage.hs31;
import defpackage.ji7;
import defpackage.jjo;
import defpackage.k9x;
import defpackage.ki7;
import defpackage.kt11;
import defpackage.li7;
import defpackage.lnr0;
import defpackage.lz40;
import defpackage.mi7;
import defpackage.ni7;
import defpackage.noh;
import defpackage.ny61;
import defpackage.oi7;
import defpackage.ooc;
import defpackage.pi7;
import defpackage.q1z;
import defpackage.q7u;
import defpackage.qi7;
import defpackage.qoi0;
import defpackage.r720;
import defpackage.ri7;
import defpackage.rs31;
import defpackage.sfl0;
import defpackage.si7;
import defpackage.t420;
import defpackage.tls;
import defpackage.vfc;
import defpackage.w4;
import defpackage.w511;
import defpackage.w8f;
import defpackage.wi7;
import defpackage.ybg;
import defpackage.yr31;
import defpackage.z9n;
import defpackage.zo0;
import defpackage.zwv;
import defpackage.zy11;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\r*\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010!R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000f0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/yandex/messaging/ui/calllist/CallListFragment;", "Lcom/yandex/messaging/navigation/ComposeMessengerFragment;", "Lji7;", "", "Landroid/app/Activity;", "activity", "Lnoh;", "Lc020;", "activityComponentAsync", "Lkt11;", "profileComponentAsync", "<init>", "(Landroid/app/Activity;Lnoh;Lnoh;)V", "Lf530;", "modifier", "Lzy11;", "ScreenRoot", "(Lf530;Lfid;I)V", "Landroid/view/View;", "v", "Landroid/view/WindowInsets;", "insets", "onApplyWindowInsets", "(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;", "", "isBottomSheet", "consumedInsetsModifier", "(Lf530;ZLfid;I)Lf530;", "Lhs31;", "getViewModelFactory", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onNavTabReselected", "()V", "Lnoh;", "Llz40;", "scrollToTopRequests", "Llz40;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CallListFragment extends ComposeMessengerFragment<ji7> {
    public static final int $stable = 8;
    private final noh profileComponentAsync;
    private final lz40 scrollToTopRequests;

    public CallListFragment(Activity activity, noh nohVar, noh nohVar2) {
        super(activity, nohVar);
        this.profileComponentAsync = nohVar2;
        this.scrollToTopRequests = ffx.c(0, 1, null, 5);
    }

    private static final zy11 ScreenRoot$lambda$2$lambda$1(sfl0 sfl0Var, si7 si7Var) {
        if (si7Var instanceof qi7) {
            sfl0Var.getClass();
        } else if (si7Var instanceof oi7) {
            new k9x(t420.d, 1);
            sfl0Var.getClass();
        } else if (si7Var instanceof pi7) {
            new k9x(t420.d, 0);
            sfl0Var.getClass();
        } else if (si7Var instanceof ri7) {
            new gm50(t420.d, null, null);
            sfl0Var.getClass();
        } else if (si7Var instanceof li7) {
            MeetingStartSource.Companion.getClass();
            new MeetingStartSource("call_list_create", null, null);
            sfl0Var.getClass();
        } else if (si7Var.equals(ni7.a)) {
            new fae(t420.d);
            sfl0Var.getClass();
        } else {
            if (si7Var instanceof ki7) {
                t420 t420Var = t420.d;
                throw null;
            }
            if (!(si7Var instanceof mi7)) {
                w511.b();
                return null;
            }
            sfl0Var.getClass();
        }
        return zy11.a;
    }

    @Override // com.yandex.messaging.navigation.ComposeMessengerFragment
    public void ScreenRoot(f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(268372835);
        btsVar.e0(-897180073);
        rs31 b = jjo.b(btsVar);
        hs31 a = jjo.a(btsVar);
        btsVar.e0(544794079);
        boolean e = btsVar.e(a);
        Object Q = btsVar.Q();
        if (e || Q == did.a) {
            Q = new w4(a, 4);
            btsVar.o0(Q);
        }
        btsVar.t(false);
        yr31 G = ooc.G(qoi0.a(d.class), b, null, vfc.h(d.class, new zwv(), (tls) Q), b instanceof q7u ? ((q7u) b).getDefaultViewModelCreationExtras() : w8f.b, btsVar);
        btsVar.t(false);
        btsVar.m(q1z.a).getClass();
        throw new ClassCastException();
    }

    @Override // com.yandex.messaging.navigation.ComposeMessengerFragment
    public f530 consumedInsetsModifier(f530 f530Var, boolean z, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(1589299979);
        btsVar.t(false);
        return f530Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.yandex.messaging.navigation.ComposeMessengerFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getViewModelFactory(Continuation<? super hs31> continuation) {
        CallListFragment$getViewModelFactory$1 callListFragment$getViewModelFactory$1;
        int i;
        CallListFragment callListFragment = this;
        if (continuation instanceof CallListFragment$getViewModelFactory$1) {
            callListFragment$getViewModelFactory$1 = (CallListFragment$getViewModelFactory$1) continuation;
            int i2 = callListFragment$getViewModelFactory$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                callListFragment$getViewModelFactory$1.label = i2 - Integer.MIN_VALUE;
                Object obj = callListFragment$getViewModelFactory$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = callListFragment$getViewModelFactory$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    noh nohVar = callListFragment.profileComponentAsync;
                    callListFragment$getViewModelFactory$1.L$0 = callListFragment;
                    callListFragment$getViewModelFactory$1.label = 1;
                    obj = nohVar.k(callListFragment$getViewModelFactory$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    callListFragment = (CallListFragment) callListFragment$getViewModelFactory$1.L$0;
                    kotlin.b.b(obj);
                }
                ccg ccgVar = ((ccg) ((kt11) obj)).b;
                ((ji7) callListFragment.getArguments()).getClass();
                bcg bcgVar = ccgVar.G;
                ybg ybgVar = ccgVar.j;
                f9t f9tVar = new f9t(bcgVar, ybgVar, 10);
                wi7 wi7Var = new wi7(ccgVar.l, ccgVar.q, ccgVar.z, new z9n(ybgVar, new zo0(ccgVar.J, ccgVar.t, ccgVar.K, f9tVar, ybgVar, c4c.a, 20), f9tVar, ccgVar.r, 20, 0), ccgVar.J0, ccgVar.e0, ccgVar.m, ccgVar.h, ccgVar.K0, ccgVar.E0, ccgVar.R, ccgVar.I);
                LinkedHashMap A = gtq0.A(4);
                A.put(lnr0.class, ccgVar.c);
                A.put(com.yandex.messaging.ui.banners.a.class, ccgVar.d);
                A.put(g4f0.class, ccgVar.e);
                A.put(d.class, wi7Var);
                return new r720(0, !A.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A));
            }
        }
        callListFragment$getViewModelFactory$1 = new CallListFragment$getViewModelFactory$1(callListFragment, continuation);
        Object obj2 = callListFragment$getViewModelFactory$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = callListFragment$getViewModelFactory$1.label;
        if (i != 0) {
        }
        ccg ccgVar2 = ((ccg) ((kt11) obj2)).b;
        ((ji7) callListFragment.getArguments()).getClass();
        bcg bcgVar2 = ccgVar2.G;
        ybg ybgVar2 = ccgVar2.j;
        f9t f9tVar2 = new f9t(bcgVar2, ybgVar2, 10);
        wi7 wi7Var2 = new wi7(ccgVar2.l, ccgVar2.q, ccgVar2.z, new z9n(ybgVar2, new zo0(ccgVar2.J, ccgVar2.t, ccgVar2.K, f9tVar2, ybgVar2, c4c.a, 20), f9tVar2, ccgVar2.r, 20, 0), ccgVar2.J0, ccgVar2.e0, ccgVar2.m, ccgVar2.h, ccgVar2.K0, ccgVar2.E0, ccgVar2.R, ccgVar2.I);
        LinkedHashMap A2 = gtq0.A(4);
        A2.put(lnr0.class, ccgVar2.c);
        A2.put(com.yandex.messaging.ui.banners.a.class, ccgVar2.d);
        A2.put(g4f0.class, ccgVar2.e);
        A2.put(d.class, wi7Var2);
        return new r720(0, !A2.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A2));
    }

    @Override // com.yandex.messaging.navigation.BaseMessengerFragment
    public WindowInsets onApplyWindowInsets(View v, WindowInsets insets) {
        return insets;
    }

    public void onNavTabReselected() {
        this.scrollToTopRequests.g(zy11.a);
    }
}
