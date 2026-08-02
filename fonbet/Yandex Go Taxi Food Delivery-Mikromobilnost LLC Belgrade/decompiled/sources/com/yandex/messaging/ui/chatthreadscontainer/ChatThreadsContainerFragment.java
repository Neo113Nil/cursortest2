package com.yandex.messaging.ui.chatthreadscontainer;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.r;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import com.yandex.messaging.navigation.BaseMessengerFragment;
import com.yandex.messaging.ui.chatlist.ChatListFragment;
import defpackage.ai91;
import defpackage.cab;
import defpackage.e9h0;
import defpackage.eja1;
import defpackage.fab;
import defpackage.gci0;
import defpackage.i3y;
import defpackage.l7b;
import defpackage.n751;
import defpackage.noh;
import defpackage.olh0;
import defpackage.qha;
import defpackage.qv10;
import defpackage.rwi;
import defpackage.tje;
import defpackage.u1w;
import defpackage.x651;
import defpackage.x9b;
import defpackage.y651;
import kotlin.Metadata;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0003B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u001b\u0010\u0018\u001a\u00020\u0017*\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u000fJ+\u0010%\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&J\u0019\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\rH\u0016¢\u0006\u0004\b+\u0010\u000fR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R!\u00105\u001a\b\u0012\u0004\u0012\u0002000\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u00066"}, d2 = {"Lcom/yandex/messaging/ui/chatthreadscontainer/ChatThreadsContainerFragment;", "Lcom/yandex/messaging/navigation/BaseMessengerFragment;", "Lx9b;", "", "Landroid/app/Activity;", "activity", "Lnoh;", "Lc020;", "activityComponentAsync", "Lkt11;", "profileComponentAsync", "<init>", "(Landroid/app/Activity;Lnoh;Lnoh;)V", "Lzy11;", "scrollCurrentChildToTop", "()V", "scrollCurrentChildToTopInMainFolder", "Landroid/view/View;", "view", "setupTabsBar", "(Landroid/view/View;)V", "setupToolbar", "Lrwi;", "Lfab;", "getRouter", "(Lrwi;Landroid/view/View;)Lfab;", "", "dy", "onScrolled", "(I)V", "scrollToTop", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "args", "", "onNewArgs", "(Landroid/os/Bundle;)Z", "onNavTabReselected", "Lnoh;", "Lcom/yandex/messaging/ui/chatthreadscontainer/d;", "viewModel", "Lcom/yandex/messaging/ui/chatthreadscontainer/d;", "Lhs31;", "viewModelFactoryAsync$delegate", "Li3y;", "getViewModelFactoryAsync", "()Lnoh;", "viewModelFactoryAsync", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ChatThreadsContainerFragment extends BaseMessengerFragment<x9b> {
    public static final int $stable = 8;
    private final noh profileComponentAsync;
    private d viewModel;

    /* renamed from: viewModelFactoryAsync$delegate, reason: from kotlin metadata */
    private final i3y viewModelFactoryAsync;

    public ChatThreadsContainerFragment(Activity activity, noh nohVar, noh nohVar2) {
        super(activity, nohVar);
        this.profileComponentAsync = nohVar2;
        this.viewModelFactoryAsync = kotlin.a.a(new l7b(2, this));
    }

    public static final /* synthetic */ fab access$getRouter(ChatThreadsContainerFragment chatThreadsContainerFragment, rwi rwiVar, View view) {
        chatThreadsContainerFragment.getRouter(rwiVar, view);
        return null;
    }

    private final fab getRouter(rwi rwiVar, View view) {
        rwiVar.getClass();
        throw null;
    }

    private static final FragmentContainerView getRouter$lambda$4(View view) {
        return (FragmentContainerView) view.findViewById(e9h0.content_container);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final noh getViewModelFactoryAsync() {
        return (noh) this.viewModelFactoryAsync.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n751 onCreateView$lambda$1(View view, n751 n751Var) {
        y651 y651Var = new x651(n751Var).a;
        y651Var.b(1, u1w.e);
        return y651Var.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scrollCurrentChildToTop() {
        Fragment E = getChildFragmentManager().E(e9h0.content_container);
        BaseMessengerFragment baseMessengerFragment = E instanceof BaseMessengerFragment ? (BaseMessengerFragment) E : null;
        if (baseMessengerFragment != null) {
            baseMessengerFragment.scrollToTop();
        }
    }

    private final void scrollCurrentChildToTopInMainFolder() {
        Fragment E = getChildFragmentManager().E(e9h0.content_container);
        ChatListFragment chatListFragment = E instanceof ChatListFragment ? (ChatListFragment) E : null;
        if (chatListFragment != null) {
            chatListFragment.scrollToTopInMainFolder();
            return;
        }
        BaseMessengerFragment baseMessengerFragment = E instanceof BaseMessengerFragment ? (BaseMessengerFragment) E : null;
        if (baseMessengerFragment != null) {
            baseMessengerFragment.scrollToTop();
        }
    }

    private final void setupTabsBar(View view) {
        ComposeView composeView = (ComposeView) view.findViewById(e9h0.tabs_bar);
        composeView.setViewCompositionStrategy(r.c);
        composeView.setContent(new androidx.compose.runtime.internal.a(-1377629559, new b(this, view), true));
    }

    private final void setupToolbar(View view) {
        ComposeView composeView = (ComposeView) view.findViewById(e9h0.toolbar_container);
        composeView.setViewCompositionStrategy(r.c);
        composeView.setContent(new androidx.compose.runtime.internal.a(1115568387, new c(this), true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final noh viewModelFactoryAsync_delegate$lambda$0(ChatThreadsContainerFragment chatThreadsContainerFragment) {
        return tje.h(eja1.s(chatThreadsContainerFragment), null, null, new ChatThreadsContainerFragment$viewModelFactoryAsync$2$1(chatThreadsContainerFragment, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(olh0.msg_b_chat_threads_container, container, false);
        ai91.b(new qha(11), inflate.findViewById(e9h0.content_container));
        setupTabsBar(inflate);
        setupToolbar(inflate);
        return inflate;
    }

    public void onNavTabReselected() {
        gci0 gci0Var;
        cab cabVar;
        d dVar = this.viewModel;
        ChatThreadsContainerTabs chatThreadsContainerTabs = (dVar == null || (gci0Var = dVar.y) == null || (cabVar = (cab) gci0Var.a.getValue()) == null) ? null : cabVar.a;
        ChatThreadsContainerTabs chatThreadsContainerTabs2 = ChatThreadsContainerTabs.CHATS;
        if (chatThreadsContainerTabs == chatThreadsContainerTabs2) {
            scrollCurrentChildToTopInMainFolder();
            return;
        }
        d dVar2 = this.viewModel;
        if (dVar2 != null) {
            r0 r0Var = dVar2.w;
            r0Var.getClass();
            r0Var.m(null, chatThreadsContainerTabs2);
        }
    }

    @Override // com.yandex.messaging.navigation.BaseMessengerFragment
    public boolean onNewArgs(Bundle args) {
        if (args == null) {
            return false;
        }
        d dVar = this.viewModel;
        if (dVar == null) {
            return true;
        }
        x9b x9bVar = new x9b(args);
        r0 r0Var = dVar.w;
        r0Var.getClass();
        r0Var.m(null, x9bVar.b);
        return true;
    }

    public void onScrolled(int dy) {
        d dVar = this.viewModel;
        if (dVar != null) {
            qv10.B(dy <= 0, dVar.x, null);
        }
    }

    @Override // com.yandex.messaging.navigation.BaseMessengerFragment
    public void scrollToTop() {
        scrollCurrentChildToTop();
    }
}
