package com.yandex.messaging.ui.about;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;
import com.yandex.messaging.navigation.ComposeMessengerFragment;
import defpackage.aii0;
import defpackage.b0x;
import defpackage.bts;
import defpackage.ccg;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.fwc;
import defpackage.g4f0;
import defpackage.g6;
import defpackage.gtq0;
import defpackage.hs31;
import defpackage.i6;
import defpackage.jjo;
import defpackage.kt11;
import defpackage.lnr0;
import defpackage.m3u0;
import defpackage.noh;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.oyh0;
import defpackage.p5;
import defpackage.q1z;
import defpackage.q5;
import defpackage.q7u;
import defpackage.qoi0;
import defpackage.r5;
import defpackage.r720;
import defpackage.rs31;
import defpackage.s5;
import defpackage.sfl0;
import defpackage.t5;
import defpackage.tls;
import defpackage.u4;
import defpackage.v4;
import defpackage.vfc;
import defpackage.vng;
import defpackage.vqb1;
import defpackage.w4;
import defpackage.w511;
import defpackage.w8f;
import defpackage.yr31;
import defpackage.zwv;
import defpackage.zy11;
import java.text.DateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006$²\u0006\f\u0010#\u001a\u00020\"8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/yandex/messaging/ui/about/AboutAppComposeFragment;", "Lcom/yandex/messaging/navigation/ComposeMessengerFragment;", "Lu4;", "Landroid/app/Activity;", "activity", "Lnoh;", "Lc020;", "activityComponentAsync", "Lkt11;", "profileComponentAsync", "<init>", "(Landroid/app/Activity;Lnoh;Lnoh;)V", "Lf530;", "modifier", "Lcom/yandex/messaging/ui/about/a;", "viewModel", "Lzy11;", "AboutScreenRoot", "(Lf530;Lcom/yandex/messaging/ui/about/a;Lfid;II)V", "", "timestampMillis", "", "rememberFormattedBuildDate", "(JLfid;I)Ljava/lang/String;", "ScreenRoot", "(Lf530;Lfid;I)V", "Lhs31;", "getViewModelFactory", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lnoh;", "", "getTelemessengerEnabled", "(Lfid;I)Z", "telemessengerEnabled", "Li6;", ClidProvider.STATE, "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AboutAppComposeFragment extends ComposeMessengerFragment<u4> {
    public static final int $stable = 8;
    private final noh profileComponentAsync;

    public AboutAppComposeFragment(Activity activity, noh nohVar, noh nohVar2) {
        super(activity, nohVar);
        this.profileComponentAsync = nohVar2;
    }

    private final void AboutScreenRoot(f530 f530Var, a aVar, fid fidVar, int i, int i2) {
        int i3;
        bts btsVar;
        a aVar2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(471008090);
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
                v.d = new v4(this, f530Var, aVar, i, i2, 0);
                return;
            }
            return;
        }
        btsVar2.a0();
        int i4 = 0;
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
                Q = new w4(a, i4);
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

    private static final i6 AboutScreenRoot$lambda$0(m3u0 m3u0Var) {
        return (i6) m3u0Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 AboutScreenRoot$lambda$10(AboutAppComposeFragment aboutAppComposeFragment, f530 f530Var, a aVar, int i, int i2, fid fidVar, int i3) {
        aboutAppComposeFragment.AboutScreenRoot(f530Var, aVar, fidVar, vng.O(i | 1), i2);
        return zy11.a;
    }

    private static final zy11 AboutScreenRoot$lambda$3$lambda$2(sfl0 sfl0Var, Context context, t5 t5Var) {
        if (t5Var instanceof q5) {
            ((b0x) sfl0Var).b(context.getString(0));
        } else if (t5Var.equals(p5.a)) {
            sfl0Var.getClass();
        } else if (t5Var.equals(r5.a)) {
            vqb1.g(oyh0.chat_share_copy_done_toast, context);
        } else {
            if (!(t5Var instanceof s5)) {
                w511.b();
                return null;
            }
            Toast.makeText(context, context.getString(0), 0).show();
        }
        return zy11.a;
    }

    private final boolean getTelemessengerEnabled(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(1027799382);
        btsVar.m(q1z.a).getClass();
        throw new ClassCastException();
    }

    private final String rememberFormattedBuildDate(long j, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(1345534083);
        Locale locale = Locale.getDefault();
        btsVar.e0(-183476779);
        boolean k = ((((i & 14) ^ 6) > 4 && btsVar.d(j)) || (i & 6) == 4) | btsVar.k(locale);
        Object Q = btsVar.Q();
        if (k || Q == did.a) {
            Q = DateFormat.getDateInstance(1, locale).format(new Date(j));
            btsVar.o0(Q);
        }
        String str = (String) Q;
        btsVar.t(false);
        btsVar.t(false);
        return str;
    }

    @Override // com.yandex.messaging.navigation.ComposeMessengerFragment
    public void ScreenRoot(f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(-1084472452);
        AboutScreenRoot(f530Var, null, btsVar, (i & 14) | ((i << 3) & 896), 2);
        btsVar.t(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.messaging.navigation.ComposeMessengerFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getViewModelFactory(Continuation<? super hs31> continuation) {
        AboutAppComposeFragment$getViewModelFactory$1 aboutAppComposeFragment$getViewModelFactory$1;
        int i;
        if (continuation instanceof AboutAppComposeFragment$getViewModelFactory$1) {
            aboutAppComposeFragment$getViewModelFactory$1 = (AboutAppComposeFragment$getViewModelFactory$1) continuation;
            int i2 = aboutAppComposeFragment$getViewModelFactory$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aboutAppComposeFragment$getViewModelFactory$1.label = i2 - Integer.MIN_VALUE;
                Object obj = aboutAppComposeFragment$getViewModelFactory$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aboutAppComposeFragment$getViewModelFactory$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    noh nohVar = this.profileComponentAsync;
                    aboutAppComposeFragment$getViewModelFactory$1.L$0 = this;
                    aboutAppComposeFragment$getViewModelFactory$1.label = 1;
                    obj = nohVar.k(aboutAppComposeFragment$getViewModelFactory$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (AboutAppComposeFragment) aboutAppComposeFragment$getViewModelFactory$1.L$0;
                    kotlin.b.b(obj);
                }
                ccg ccgVar = ((ccg) ((kt11) obj)).b;
                ((u4) this.getArguments()).getClass();
                g6 g6Var = new g6(ccgVar.k0, ccgVar.S, ccgVar.f, ccgVar.e0, new fwc(ccgVar.n0, ccgVar.j, 26), 0);
                LinkedHashMap A = gtq0.A(4);
                A.put(lnr0.class, ccgVar.c);
                A.put(com.yandex.messaging.ui.banners.a.class, ccgVar.d);
                A.put(g4f0.class, ccgVar.e);
                A.put(a.class, g6Var);
                return new r720(0, !A.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A));
            }
        }
        aboutAppComposeFragment$getViewModelFactory$1 = new AboutAppComposeFragment$getViewModelFactory$1(this, continuation);
        Object obj2 = aboutAppComposeFragment$getViewModelFactory$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aboutAppComposeFragment$getViewModelFactory$1.label;
        if (i != 0) {
        }
        ccg ccgVar2 = ((ccg) ((kt11) obj2)).b;
        ((u4) this.getArguments()).getClass();
        g6 g6Var2 = new g6(ccgVar2.k0, ccgVar2.S, ccgVar2.f, ccgVar2.e0, new fwc(ccgVar2.n0, ccgVar2.j, 26), 0);
        LinkedHashMap A2 = gtq0.A(4);
        A2.put(lnr0.class, ccgVar2.c);
        A2.put(com.yandex.messaging.ui.banners.a.class, ccgVar2.d);
        A2.put(g4f0.class, ccgVar2.e);
        A2.put(a.class, g6Var2);
        return new r720(0, !A2.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A2));
    }
}
