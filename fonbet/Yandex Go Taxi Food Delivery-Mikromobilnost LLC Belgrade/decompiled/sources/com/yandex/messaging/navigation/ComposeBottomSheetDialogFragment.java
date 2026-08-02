package com.yandex.messaging.navigation;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.r;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import defpackage.dlb1;
import defpackage.f530;
import defpackage.fid;
import defpackage.hs31;
import defpackage.noh;
import defpackage.s120;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B#\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH¤@¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH%¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\"\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/yandex/messaging/navigation/ComposeBottomSheetDialogFragment;", "Ls120;", "T", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Lnoh;", "Lc020;", "activityComponentAsync", "Lkt11;", "profileComponentAsync", "<init>", "(Lnoh;Lnoh;)V", "Lhs31;", "getViewModelFactory", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lf530;", "modifier", "Lzy11;", "DialogContent", "(Lf530;Lfid;I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lnoh;", "getActivityComponentAsync", "()Lnoh;", "getProfileComponentAsync", "getArguments", "()Ls120;", "arguments", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class ComposeBottomSheetDialogFragment<T extends s120> extends BottomSheetDialogFragment {
    public static final int $stable = 8;
    private final noh activityComponentAsync;
    private final noh profileComponentAsync;

    public ComposeBottomSheetDialogFragment(noh nohVar, noh nohVar2) {
        this.activityComponentAsync = nohVar;
        this.profileComponentAsync = nohVar2;
    }

    public abstract void DialogContent(f530 f530Var, fid fidVar, int i);

    public final noh getActivityComponentAsync() {
        return this.activityComponentAsync;
    }

    public final T getArguments() {
        return (T) dlb1.b(requireArguments());
    }

    public final noh getProfileComponentAsync() {
        return this.profileComponentAsync;
    }

    public abstract Object getViewModelFactory(Continuation<? super hs31> continuation);

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Window window;
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.clearFlags(2);
        }
        ComposeView composeView = new ComposeView(requireContext(), null, 0, 6, null);
        composeView.setViewCompositionStrategy(r.c);
        composeView.setContent(new androidx.compose.runtime.internal.a(-1360654318, new a(this, 0), true));
        return composeView;
    }
}
