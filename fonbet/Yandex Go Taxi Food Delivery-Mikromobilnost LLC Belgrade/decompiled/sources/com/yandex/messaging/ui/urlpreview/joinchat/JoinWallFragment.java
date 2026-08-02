package com.yandex.messaging.ui.urlpreview.joinchat;

import android.R;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.r;
import androidx.fragment.app.DialogFragment;
import defpackage.bcg;
import defpackage.ccg;
import defpackage.dlb1;
import defpackage.g4f0;
import defpackage.gtq0;
import defpackage.hs31;
import defpackage.j9x;
import defpackage.k1w;
import defpackage.kt11;
import defpackage.lnr0;
import defpackage.mu7;
import defpackage.n3w;
import defpackage.noh;
import defpackage.ny61;
import defpackage.p9x;
import defpackage.prq;
import defpackage.r720;
import defpackage.ybg;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0082@¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/yandex/messaging/ui/urlpreview/joinchat/JoinWallFragment;", "Landroidx/fragment/app/DialogFragment;", "Lnoh;", "Lc020;", "activityComponentAsync", "Lkt11;", "profileComponentAsync", "<init>", "(Lnoh;Lnoh;)V", "Lhs31;", "getViewModelFactory", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lnoh;", "Lp9x;", "getArgs", "()Lp9x;", "args", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class JoinWallFragment extends DialogFragment {
    public static final int $stable = 8;
    private final noh activityComponentAsync;
    private final noh profileComponentAsync;

    public JoinWallFragment(noh nohVar, noh nohVar2) {
        this.activityComponentAsync = nohVar;
        this.profileComponentAsync = nohVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p9x getArgs() {
        return (p9x) dlb1.b(requireArguments());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getViewModelFactory(Continuation<? super hs31> continuation) {
        JoinWallFragment$getViewModelFactory$1 joinWallFragment$getViewModelFactory$1;
        int i;
        if (continuation instanceof JoinWallFragment$getViewModelFactory$1) {
            joinWallFragment$getViewModelFactory$1 = (JoinWallFragment$getViewModelFactory$1) continuation;
            int i2 = joinWallFragment$getViewModelFactory$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                joinWallFragment$getViewModelFactory$1.label = i2 - Integer.MIN_VALUE;
                Object obj = joinWallFragment$getViewModelFactory$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = joinWallFragment$getViewModelFactory$1.label;
                if (i != 0) {
                    b.b(obj);
                    noh nohVar = this.profileComponentAsync;
                    joinWallFragment$getViewModelFactory$1.L$0 = this;
                    joinWallFragment$getViewModelFactory$1.label = 1;
                    obj = nohVar.k(joinWallFragment$getViewModelFactory$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (JoinWallFragment) joinWallFragment$getViewModelFactory$1.L$0;
                    b.b(obj);
                }
                ccg ccgVar = ((ccg) ((kt11) obj)).b;
                p9x args = this.getArgs();
                args.getClass();
                n3w a = n3w.a(args);
                bcg bcgVar = ccgVar.G;
                ybg ybgVar = ccgVar.j;
                prq prqVar = new prq(a, new mu7(bcgVar, ybgVar, 28), bcgVar, ybgVar, new k1w(ccgVar.m, 20));
                LinkedHashMap A = gtq0.A(4);
                A.put(lnr0.class, ccgVar.c);
                A.put(com.yandex.messaging.ui.banners.a.class, ccgVar.d);
                A.put(g4f0.class, ccgVar.e);
                A.put(j9x.class, prqVar);
                return new r720(0, !A.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A));
            }
        }
        joinWallFragment$getViewModelFactory$1 = new JoinWallFragment$getViewModelFactory$1(this, continuation);
        Object obj2 = joinWallFragment$getViewModelFactory$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = joinWallFragment$getViewModelFactory$1.label;
        if (i != 0) {
        }
        ccg ccgVar2 = ((ccg) ((kt11) obj2)).b;
        p9x args2 = this.getArgs();
        args2.getClass();
        n3w a2 = n3w.a(args2);
        bcg bcgVar2 = ccgVar2.G;
        ybg ybgVar2 = ccgVar2.j;
        prq prqVar2 = new prq(a2, new mu7(bcgVar2, ybgVar2, 28), bcgVar2, ybgVar2, new k1w(ccgVar2.m, 20));
        LinkedHashMap A2 = gtq0.A(4);
        A2.put(lnr0.class, ccgVar2.c);
        A2.put(com.yandex.messaging.ui.banners.a.class, ccgVar2.d);
        A2.put(g4f0.class, ccgVar2.e);
        A2.put(j9x.class, prqVar2);
        return new r720(0, !A2.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(A2));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(2, R.style.Theme.Translucent.NoTitleBar);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ComposeView composeView = new ComposeView(requireContext(), null, 0, 6, null);
        composeView.setViewCompositionStrategy(r.c);
        composeView.setContent(new androidx.compose.runtime.internal.a(-1247541643, new a(this, 1), true));
        return composeView;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
        window.clearFlags(2);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
    }
}
