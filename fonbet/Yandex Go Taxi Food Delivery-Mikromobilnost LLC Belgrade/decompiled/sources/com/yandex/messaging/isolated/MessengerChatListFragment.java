package com.yandex.messaging.isolated;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.d8g;
import defpackage.e8g;
import defpackage.eja1;
import defpackage.fzw;
import defpackage.i3y;
import defpackage.jqr;
import defpackage.kzw;
import defpackage.m020;
import defpackage.n4b;
import defpackage.p8g;
import defpackage.szw;
import defpackage.tls;
import defpackage.tpr;
import defpackage.v020;
import defpackage.xzw;
import defpackage.z8g;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010\u0003R\u001b\u0010%\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R$\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010+\u001a\u00060*R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010.\u001a\u00020-8\u0016X\u0096D¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"Lcom/yandex/messaging/isolated/MessengerChatListFragment;", "Lcom/yandex/messaging/isolated/IsolatedFragment;", "<init>", "()V", "Ltpr;", "Lszw;", "componentFlow", "()Ltpr;", "Lkzw;", "component", "createViewComponent", "(Lkzw;)Lszw;", "Lkotlin/Function1;", "Lcom/yandex/messaging/ChatRequest;", "Lzy11;", "handler", "onChatClicked", "(Ltls;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/widget/FrameLayout;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/widget/FrameLayout;", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Lxzw;", "ui$delegate", "Li3y;", "getUi", "()Lxzw;", "ui", "viewComponent", "Lszw;", "onClickHandler", "Ltls;", "Lv020;", "routerNavigationDelegate", "Lv020;", "", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "messaging-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MessengerChatListFragment extends IsolatedFragment {
    private tls onClickHandler;
    private szw viewComponent;

    /* renamed from: ui$delegate, reason: from kotlin metadata */
    private final i3y ui = kotlin.a.a(new m020(1, this));
    private v020 routerNavigationDelegate = new v020(this);
    private final String name = "chat_list";

    private final tpr componentFlow() {
        return new fzw(7, getActivityComponentFlow(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final szw createViewComponent(kzw component) {
        d8g d8gVar = (d8g) component;
        z8g z8gVar = d8gVar.b;
        p8g p8gVar = d8gVar.c;
        d8g d8gVar2 = d8gVar.d;
        v020 v020Var = this.routerNavigationDelegate;
        v020Var.getClass();
        return new e8g(z8gVar, p8gVar, d8gVar2, this, v020Var, new n4b(requireArguments()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final xzw getUi() {
        return (xzw) this.ui.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xzw ui_delegate$lambda$0(MessengerChatListFragment messengerChatListFragment) {
        return new xzw(messengerChatListFragment.requireContext());
    }

    @Override // com.yandex.messaging.isolated.IsolatedFragment
    public String getName() {
        return this.name;
    }

    public final void onChatClicked(tls handler) {
        this.onClickHandler = handler;
    }

    @Override // androidx.fragment.app.Fragment
    public FrameLayout onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return (FrameLayout) getUi().getRoot();
    }

    @Override // com.yandex.messaging.isolated.IsolatedFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.viewComponent = null;
    }

    @Override // com.yandex.messaging.isolated.IsolatedFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        kotlinx.coroutines.flow.e.H(eja1.s(getViewLifecycleOwner()), new jqr(componentFlow(), new MessengerChatListFragment$onViewCreated$1(this, null), 3));
    }
}
