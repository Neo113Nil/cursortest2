package com.yandex.messaging.navigation;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.r;
import defpackage.b9a1;
import defpackage.bts;
import defpackage.f530;
import defpackage.fid;
import defpackage.hs31;
import defpackage.i9a1;
import defpackage.noh;
import defpackage.s120;
import defpackage.sy11;
import defpackage.vuz;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H¦@¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001e\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/yandex/messaging/navigation/ComposeMessengerFragment;", "Ls120;", "T", "Lcom/yandex/messaging/navigation/BaseMessengerFragment;", "Landroid/app/Activity;", "activity", "Lnoh;", "Lc020;", "activityComponentAsync", "<init>", "(Landroid/app/Activity;Lnoh;)V", "Lf530;", "modifier", "Lzy11;", "ScreenRoot", "(Lf530;Lfid;I)V", "Lhs31;", "getViewModelFactory", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "", "isBottomSheet", "consumedInsetsModifier", "(Lf530;ZLfid;I)Lf530;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class ComposeMessengerFragment<T extends s120> extends BaseMessengerFragment<T> {
    public static final int $stable = 0;

    public ComposeMessengerFragment(Activity activity, noh nohVar) {
        super(activity, nohVar);
    }

    public abstract void ScreenRoot(f530 f530Var, fid fidVar, int i);

    public f530 consumedInsetsModifier(f530 f530Var, boolean z, fid fidVar, int i) {
        f530 b;
        bts btsVar = (bts) fidVar;
        btsVar.e0(-1116768365);
        if (z) {
            WeakHashMap weakHashMap = androidx.compose.foundation.layout.a.w;
            b = b9a1.b(f530Var, new sy11(vuz.o(btsVar).c, vuz.o(btsVar).f));
        } else {
            b = i9a1.f(i9a1.c(f530Var));
        }
        btsVar.t(false);
        return b;
    }

    public abstract Object getViewModelFactory(Continuation<? super hs31> continuation);

    @Override // androidx.fragment.app.Fragment
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ComposeView composeView = new ComposeView(requireContext(), null, 0, 6, null);
        composeView.setViewCompositionStrategy(r.c);
        composeView.setContent(new androidx.compose.runtime.internal.a(529672378, new a(this, 1), true));
        return composeView;
    }
}
