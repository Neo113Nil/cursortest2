package com.yandex.messaging.ui.main.telemessenger;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.r;
import androidx.fragment.app.FragmentContainerView;
import com.yandex.messaging.navigation.BaseMessengerFragment;
import defpackage.bdy0;
import defpackage.ccg;
import defpackage.e9h0;
import defpackage.g4f0;
import defpackage.gtq0;
import defpackage.hs31;
import defpackage.kt11;
import defpackage.lnr0;
import defpackage.n3w;
import defpackage.noh;
import defpackage.ny61;
import defpackage.olh0;
import defpackage.peb;
import defpackage.r5e;
import defpackage.r720;
import defpackage.rct0;
import defpackage.rwi;
import defpackage.scy0;
import defpackage.wrh;
import defpackage.xvf0;
import defpackage.ybg;
import defpackage.z9n;
import defpackage.zbg;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0016\u0010\u0015J\u001b\u0010\u0019\u001a\u00020\u0018*\u00020\u00172\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010!\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b%\u0010&R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/yandex/messaging/ui/main/telemessenger/TeleMessengerMainFragment;", "Lcom/yandex/messaging/navigation/BaseMessengerFragment;", "Lscy0;", "", "Landroid/app/Activity;", "activity", "Lnoh;", "Lc020;", "activityComponentAsync", "Lkt11;", "profileComponentAsync", "<init>", "(Landroid/app/Activity;Lnoh;Lnoh;)V", "Landroid/view/View;", "view", "Lzy11;", "setupNavigationBar", "(Landroid/view/View;)V", "setupConnectionStatusOverlay", "Lhs31;", "getViewModelFactory", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getConnectionStatusViewModelFactory", "Lrwi;", "Lbdy0;", "getRouter", "(Lrwi;Landroid/view/View;)Lbdy0;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "args", "", "onNewArgs", "(Landroid/os/Bundle;)Z", "Lnoh;", "Lcom/yandex/messaging/ui/main/telemessenger/c;", "viewModel", "Lcom/yandex/messaging/ui/main/telemessenger/c;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TeleMessengerMainFragment extends BaseMessengerFragment<scy0> {
    public static final int $stable = 8;
    private final noh profileComponentAsync;
    private c viewModel;

    public TeleMessengerMainFragment(Activity activity, noh nohVar, noh nohVar2) {
        super(activity, nohVar);
        this.profileComponentAsync = nohVar2;
    }

    public static final /* synthetic */ bdy0 access$getRouter(TeleMessengerMainFragment teleMessengerMainFragment, rwi rwiVar, View view) {
        teleMessengerMainFragment.getRouter(rwiVar, view);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getConnectionStatusViewModelFactory(Continuation<? super hs31> continuation) {
        TeleMessengerMainFragment$getConnectionStatusViewModelFactory$1 teleMessengerMainFragment$getConnectionStatusViewModelFactory$1;
        int i;
        if (continuation instanceof TeleMessengerMainFragment$getConnectionStatusViewModelFactory$1) {
            teleMessengerMainFragment$getConnectionStatusViewModelFactory$1 = (TeleMessengerMainFragment$getConnectionStatusViewModelFactory$1) continuation;
            int i2 = teleMessengerMainFragment$getConnectionStatusViewModelFactory$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                teleMessengerMainFragment$getConnectionStatusViewModelFactory$1.label = i2 - Integer.MIN_VALUE;
                Object obj = teleMessengerMainFragment$getConnectionStatusViewModelFactory$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = teleMessengerMainFragment$getConnectionStatusViewModelFactory$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    noh nohVar = this.profileComponentAsync;
                    teleMessengerMainFragment$getConnectionStatusViewModelFactory$1.label = 1;
                    obj = nohVar.k(teleMessengerMainFragment$getConnectionStatusViewModelFactory$1);
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
                peb pebVar = new peb(ccgVar.p, 23);
                LinkedHashMap A = gtq0.A(4);
                A.put(lnr0.class, ccgVar.c);
                A.put(com.yandex.messaging.ui.banners.a.class, ccgVar.d);
                A.put(g4f0.class, ccgVar.e);
                A.put(r5e.class, pebVar);
                return new r720(0, !A.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A));
            }
        }
        teleMessengerMainFragment$getConnectionStatusViewModelFactory$1 = new TeleMessengerMainFragment$getConnectionStatusViewModelFactory$1(this, continuation);
        Object obj2 = teleMessengerMainFragment$getConnectionStatusViewModelFactory$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = teleMessengerMainFragment$getConnectionStatusViewModelFactory$1.label;
        if (i != 0) {
        }
        ccg ccgVar2 = ((ccg) ((kt11) obj2)).b;
        peb pebVar2 = new peb(ccgVar2.p, 23);
        LinkedHashMap A2 = gtq0.A(4);
        A2.put(lnr0.class, ccgVar2.c);
        A2.put(com.yandex.messaging.ui.banners.a.class, ccgVar2.d);
        A2.put(g4f0.class, ccgVar2.e);
        A2.put(r5e.class, pebVar2);
        return new r720(0, !A2.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A2));
    }

    private final bdy0 getRouter(rwi rwiVar, View view) {
        rwiVar.getClass();
        throw null;
    }

    private static final FragmentContainerView getRouter$lambda$2(View view) {
        return (FragmentContainerView) view.findViewById(e9h0.tabs_content_slot);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getViewModelFactory(Continuation<? super hs31> continuation) {
        TeleMessengerMainFragment$getViewModelFactory$1 teleMessengerMainFragment$getViewModelFactory$1;
        int i;
        if (continuation instanceof TeleMessengerMainFragment$getViewModelFactory$1) {
            teleMessengerMainFragment$getViewModelFactory$1 = (TeleMessengerMainFragment$getViewModelFactory$1) continuation;
            int i2 = teleMessengerMainFragment$getViewModelFactory$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                teleMessengerMainFragment$getViewModelFactory$1.label = i2 - Integer.MIN_VALUE;
                Object obj = teleMessengerMainFragment$getViewModelFactory$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = teleMessengerMainFragment$getViewModelFactory$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    noh nohVar = this.profileComponentAsync;
                    teleMessengerMainFragment$getViewModelFactory$1.L$0 = this;
                    teleMessengerMainFragment$getViewModelFactory$1.label = 1;
                    obj = nohVar.k(teleMessengerMainFragment$getViewModelFactory$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (TeleMessengerMainFragment) teleMessengerMainFragment$getViewModelFactory$1.L$0;
                    kotlin.b.b(obj);
                }
                ccg ccgVar = ((ccg) ((kt11) obj)).b;
                scy0 arguments = this.getArguments();
                arguments.getClass();
                zbg zbgVar = ccgVar.F;
                ybg ybgVar = ccgVar.N;
                ybg ybgVar2 = ccgVar.j;
                rct0 rct0Var = new rct0(new z9n((xvf0) ccgVar.y, (xvf0) new wrh(zbgVar, ybgVar, ybgVar2, 27), (xvf0) ccgVar.h, (xvf0) ybgVar2, 17, (char) 0), n3w.a(arguments), ccgVar.e0, ccgVar.t, ccgVar.L0);
                LinkedHashMap A = gtq0.A(4);
                A.put(lnr0.class, ccgVar.c);
                A.put(com.yandex.messaging.ui.banners.a.class, ccgVar.d);
                A.put(g4f0.class, ccgVar.e);
                A.put(c.class, rct0Var);
                return new r720(0, !A.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A));
            }
        }
        teleMessengerMainFragment$getViewModelFactory$1 = new TeleMessengerMainFragment$getViewModelFactory$1(this, continuation);
        Object obj2 = teleMessengerMainFragment$getViewModelFactory$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = teleMessengerMainFragment$getViewModelFactory$1.label;
        if (i != 0) {
        }
        ccg ccgVar2 = ((ccg) ((kt11) obj2)).b;
        scy0 arguments2 = this.getArguments();
        arguments2.getClass();
        zbg zbgVar2 = ccgVar2.F;
        ybg ybgVar3 = ccgVar2.N;
        ybg ybgVar22 = ccgVar2.j;
        rct0 rct0Var2 = new rct0(new z9n((xvf0) ccgVar2.y, (xvf0) new wrh(zbgVar2, ybgVar3, ybgVar22, 27), (xvf0) ccgVar2.h, (xvf0) ybgVar22, 17, (char) 0), n3w.a(arguments2), ccgVar2.e0, ccgVar2.t, ccgVar2.L0);
        LinkedHashMap A2 = gtq0.A(4);
        A2.put(lnr0.class, ccgVar2.c);
        A2.put(com.yandex.messaging.ui.banners.a.class, ccgVar2.d);
        A2.put(g4f0.class, ccgVar2.e);
        A2.put(c.class, rct0Var2);
        return new r720(0, !A2.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A2));
    }

    private final void setupConnectionStatusOverlay(View view) {
        ComposeView composeView = (ComposeView) view.findViewById(e9h0.connection_status_overlay);
        composeView.setViewCompositionStrategy(r.c);
        composeView.setContent(new androidx.compose.runtime.internal.a(1337571426, new a(this), true));
    }

    private final void setupNavigationBar(View view) {
        ComposeView composeView = (ComposeView) view.findViewById(e9h0.navigation_bar);
        composeView.setViewCompositionStrategy(r.c);
        composeView.setContent(new androidx.compose.runtime.internal.a(-1980965981, new b(this, view), true));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(olh0.msg_b_telemessenger_main_fragment, container, false);
        setupNavigationBar(inflate);
        setupConnectionStatusOverlay(inflate);
        return inflate;
    }

    @Override // com.yandex.messaging.navigation.BaseMessengerFragment
    public boolean onNewArgs(Bundle args) {
        if (args == null) {
            return false;
        }
        c cVar = this.viewModel;
        if (cVar == null) {
            return true;
        }
        scy0 scy0Var = new scy0(args);
        r0 r0Var = cVar.w;
        r0Var.getClass();
        r0Var.m(null, scy0Var.c);
        return true;
    }
}
