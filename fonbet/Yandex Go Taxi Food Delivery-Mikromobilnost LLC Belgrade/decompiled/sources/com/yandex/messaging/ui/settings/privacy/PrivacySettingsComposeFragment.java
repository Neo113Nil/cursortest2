package com.yandex.messaging.ui.settings.privacy;

import android.app.Activity;
import android.widget.Toast;
import com.yandex.messaging.navigation.ComposeMessengerFragment;
import defpackage.aii0;
import defpackage.av4;
import defpackage.bts;
import defpackage.c4f0;
import defpackage.ccg;
import defpackage.d4f0;
import defpackage.did;
import defpackage.e4f0;
import defpackage.f530;
import defpackage.fid;
import defpackage.g4f0;
import defpackage.gtq0;
import defpackage.h4f0;
import defpackage.hs31;
import defpackage.jjo;
import defpackage.k620;
import defpackage.kt11;
import defpackage.lnr0;
import defpackage.m3u0;
import defpackage.n3w;
import defpackage.n46;
import defpackage.noh;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.q1z;
import defpackage.q7u;
import defpackage.qoi0;
import defpackage.r720;
import defpackage.rs31;
import defpackage.sfl0;
import defpackage.tls;
import defpackage.v4;
import defpackage.vfc;
import defpackage.vng;
import defpackage.w4;
import defpackage.w511;
import defpackage.w8f;
import defpackage.yr31;
import defpackage.zwv;
import defpackage.zy11;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0016\u001a\u00020\u000e2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018¨\u0006\u001b²\u0006\f\u0010\u001a\u001a\u00020\u00198\nX\u008a\u0084\u0002"}, d2 = {"Lcom/yandex/messaging/ui/settings/privacy/PrivacySettingsComposeFragment;", "Lcom/yandex/messaging/navigation/ComposeMessengerFragment;", "Lh4f0;", "Landroid/app/Activity;", "activity", "Lnoh;", "Lc020;", "activityComponentAsync", "Lkt11;", "profileComponentAsync", "<init>", "(Landroid/app/Activity;Lnoh;Lnoh;)V", "Lf530;", "modifier", "Lzy11;", "ScreenRoot", "(Lf530;Lfid;I)V", "Lhs31;", "getViewModelFactory", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/yandex/messaging/ui/settings/privacy/a;", "viewModel", "PrivacyScreenRoot", "(Lf530;Lcom/yandex/messaging/ui/settings/privacy/a;Lfid;II)V", "Lnoh;", "Le4f0;", ClidProvider.STATE, "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PrivacySettingsComposeFragment extends ComposeMessengerFragment<h4f0> {
    public static final int $stable = 8;
    private final noh profileComponentAsync;

    public PrivacySettingsComposeFragment(Activity activity, noh nohVar, noh nohVar2) {
        super(activity, nohVar);
        this.profileComponentAsync = nohVar2;
    }

    private static final e4f0 PrivacyScreenRoot$lambda$0(m3u0 m3u0Var) {
        return (e4f0) m3u0Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 PrivacyScreenRoot$lambda$10(PrivacySettingsComposeFragment privacySettingsComposeFragment, f530 f530Var, a aVar, int i, int i2, fid fidVar, int i3) {
        privacySettingsComposeFragment.PrivacyScreenRoot(f530Var, aVar, fidVar, vng.O(i | 1), i2);
        return zy11.a;
    }

    private static final zy11 PrivacyScreenRoot$lambda$2$lambda$1(PrivacySettingsComposeFragment privacySettingsComposeFragment, d4f0 d4f0Var) {
        if (d4f0Var instanceof c4f0) {
            Toast.makeText(privacySettingsComposeFragment.getActivity(), ((c4f0) d4f0Var).a, 0).show();
            return zy11.a;
        }
        w511.b();
        return null;
    }

    private static final zy11 PrivacyScreenRoot$lambda$7$lambda$6(sfl0 sfl0Var) {
        new n46(k620.d);
        sfl0Var.getClass();
        return zy11.a;
    }

    private static final zy11 PrivacyScreenRoot$lambda$9$lambda$8(sfl0 sfl0Var) {
        sfl0Var.getClass();
        return zy11.a;
    }

    public final void PrivacyScreenRoot(f530 f530Var, a aVar, fid fidVar, int i, int i2) {
        int i3;
        bts btsVar;
        a aVar2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1817123428);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (btsVar2.k(f530Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && btsVar2.e(aVar)) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= btsVar2.e(this) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && btsVar2.E()) {
            btsVar2.Y();
            aii0 v = btsVar2.v();
            if (v != null) {
                v.d = new v4(this, f530Var, aVar, i, i2, 24);
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
                Q = new w4(a, 20);
                btsVar2.o0(Q);
            }
            btsVar2.t(false);
            btsVar = btsVar2;
            yr31 G = ooc.G(qoi0.a(a.class), b, null, vfc.h(a.class, new zwv(), (tls) Q), b instanceof q7u ? ((q7u) b).getDefaultViewModelCreationExtras() : w8f.b, btsVar);
            btsVar.t(false);
            aVar2 = (a) G;
            btsVar.u();
            androidx.lifecycle.compose.a.c(aVar2.z, null, btsVar, 0, 7);
            btsVar.m(q1z.a).getClass();
            ny61.u();
        }
        btsVar = btsVar2;
        aVar2 = aVar;
        btsVar.u();
        androidx.lifecycle.compose.a.c(aVar2.z, null, btsVar, 0, 7);
        btsVar.m(q1z.a).getClass();
        ny61.u();
    }

    @Override // com.yandex.messaging.navigation.ComposeMessengerFragment
    public void ScreenRoot(f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(-856969566);
        PrivacyScreenRoot(f530Var, null, btsVar, (i & 14) | ((i << 3) & 896), 2);
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
        PrivacySettingsComposeFragment$getViewModelFactory$1 privacySettingsComposeFragment$getViewModelFactory$1;
        int i;
        if (continuation instanceof PrivacySettingsComposeFragment$getViewModelFactory$1) {
            privacySettingsComposeFragment$getViewModelFactory$1 = (PrivacySettingsComposeFragment$getViewModelFactory$1) continuation;
            int i2 = privacySettingsComposeFragment$getViewModelFactory$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                privacySettingsComposeFragment$getViewModelFactory$1.label = i2 - Integer.MIN_VALUE;
                Object obj = privacySettingsComposeFragment$getViewModelFactory$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = privacySettingsComposeFragment$getViewModelFactory$1.label;
                if (i != 0) {
                    b.b(obj);
                    noh nohVar = this.profileComponentAsync;
                    privacySettingsComposeFragment$getViewModelFactory$1.L$0 = this;
                    privacySettingsComposeFragment$getViewModelFactory$1.label = 1;
                    obj = nohVar.k(privacySettingsComposeFragment$getViewModelFactory$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (PrivacySettingsComposeFragment) privacySettingsComposeFragment$getViewModelFactory$1.L$0;
                    b.b(obj);
                }
                ccg ccgVar = ((ccg) ((kt11) obj)).b;
                h4f0 h4f0Var = (h4f0) this.getArguments();
                h4f0Var.getClass();
                av4 av4Var = new av4(ccgVar.k, ccgVar.x0, ccgVar.y0, ccgVar.s, n3w.a(h4f0Var), 6);
                LinkedHashMap A = gtq0.A(4);
                A.put(lnr0.class, ccgVar.c);
                A.put(com.yandex.messaging.ui.banners.a.class, ccgVar.d);
                A.put(g4f0.class, ccgVar.e);
                A.put(a.class, av4Var);
                return new r720(0, !A.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A));
            }
        }
        privacySettingsComposeFragment$getViewModelFactory$1 = new PrivacySettingsComposeFragment$getViewModelFactory$1(this, continuation);
        Object obj2 = privacySettingsComposeFragment$getViewModelFactory$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = privacySettingsComposeFragment$getViewModelFactory$1.label;
        if (i != 0) {
        }
        ccg ccgVar2 = ((ccg) ((kt11) obj2)).b;
        h4f0 h4f0Var2 = (h4f0) this.getArguments();
        h4f0Var2.getClass();
        av4 av4Var2 = new av4(ccgVar2.k, ccgVar2.x0, ccgVar2.y0, ccgVar2.s, n3w.a(h4f0Var2), 6);
        LinkedHashMap A2 = gtq0.A(4);
        A2.put(lnr0.class, ccgVar2.c);
        A2.put(com.yandex.messaging.ui.banners.a.class, ccgVar2.d);
        A2.put(g4f0.class, ccgVar2.e);
        A2.put(a.class, av4Var2);
        return new r720(0, !A2.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A2));
    }
}
