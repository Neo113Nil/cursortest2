package com.yandex.messaging.isolated;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.messaging.internal.authorized.h;
import com.yandex.messaging.isolated.IsolatedChatConfig;
import com.yandex.messaging.isolated.MessengerChatFragment;
import defpackage.d8g;
import defpackage.eja1;
import defpackage.fzw;
import defpackage.h8g;
import defpackage.i3y;
import defpackage.ids;
import defpackage.jqr;
import defpackage.k0x;
import defpackage.kgx;
import defpackage.kzw;
import defpackage.p8g;
import defpackage.pcz0;
import defpackage.q6b;
import defpackage.qp3;
import defpackage.sls;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tzw;
import defpackage.xzw;
import defpackage.z8g;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001b\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u0003R\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u001f\u001a\u0004\b/\u00100R\u001b\u00106\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u001f\u001a\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010:\u001a\u0002098\u0016X\u0096D¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0013\u0010A\u001a\u0004\u0018\u00010>8F¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lcom/yandex/messaging/isolated/MessengerChatFragment;", "Lcom/yandex/messaging/isolated/IsolatedFragment;", "<init>", "()V", "Ltpr;", "Lk0x;", "componentFlow", "()Ltpr;", "Lkzw;", "component", "createViewComponent", "(Lkzw;)Lk0x;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/widget/FrameLayout;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/widget/FrameLayout;", "Landroid/view/View;", "view", "Lzy11;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "onResume", "onPause", "Lcom/yandex/alicekit/core/permissions/b;", "permissionManager$delegate", "Li3y;", "getPermissionManager", "()Lcom/yandex/alicekit/core/permissions/b;", "permissionManager", "Lq6b;", "chatOpenArguments$delegate", "getChatOpenArguments", "()Lq6b;", "chatOpenArguments", "Lcom/yandex/messaging/internal/authorized/h;", "userActionFailedController$delegate", "getUserActionFailedController", "()Lcom/yandex/messaging/internal/authorized/h;", "userActionFailedController", "Lcom/yandex/messaging/isolated/IsolatedChatConfig;", "isolatedChatConfig$delegate", "getIsolatedChatConfig", "()Lcom/yandex/messaging/isolated/IsolatedChatConfig;", "isolatedChatConfig", "Lxzw;", "ui$delegate", "getUi", "()Lxzw;", "ui", "viewComponent", "Lk0x;", "", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Ltzw;", "getSearchApi", "()Ltzw;", "searchApi", "messaging-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MessengerChatFragment extends IsolatedFragment {

    /* renamed from: chatOpenArguments$delegate, reason: from kotlin metadata */
    private final i3y chatOpenArguments;

    /* renamed from: isolatedChatConfig$delegate, reason: from kotlin metadata */
    private final i3y isolatedChatConfig;
    private final String name = "chat";

    /* renamed from: permissionManager$delegate, reason: from kotlin metadata */
    private final i3y permissionManager;

    /* renamed from: ui$delegate, reason: from kotlin metadata */
    private final i3y ui;

    /* renamed from: userActionFailedController$delegate, reason: from kotlin metadata */
    private final i3y userActionFailedController;
    private k0x viewComponent;

    public MessengerChatFragment() {
        final int i = 0;
        this.permissionManager = kotlin.a.a(new sls(this) { // from class: u020
            public final /* synthetic */ MessengerChatFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                ids permissionManager_delegate$lambda$0;
                q6b chatOpenArguments_delegate$lambda$1;
                h userActionFailedController_delegate$lambda$2;
                IsolatedChatConfig isolatedChatConfig_delegate$lambda$3;
                xzw ui_delegate$lambda$4;
                int i2 = i;
                MessengerChatFragment messengerChatFragment = this.b;
                switch (i2) {
                    case 0:
                        permissionManager_delegate$lambda$0 = MessengerChatFragment.permissionManager_delegate$lambda$0(messengerChatFragment);
                        return permissionManager_delegate$lambda$0;
                    case 1:
                        chatOpenArguments_delegate$lambda$1 = MessengerChatFragment.chatOpenArguments_delegate$lambda$1(messengerChatFragment);
                        return chatOpenArguments_delegate$lambda$1;
                    case 2:
                        userActionFailedController_delegate$lambda$2 = MessengerChatFragment.userActionFailedController_delegate$lambda$2(messengerChatFragment);
                        return userActionFailedController_delegate$lambda$2;
                    case 3:
                        isolatedChatConfig_delegate$lambda$3 = MessengerChatFragment.isolatedChatConfig_delegate$lambda$3(messengerChatFragment);
                        return isolatedChatConfig_delegate$lambda$3;
                    default:
                        ui_delegate$lambda$4 = MessengerChatFragment.ui_delegate$lambda$4(messengerChatFragment);
                        return ui_delegate$lambda$4;
                }
            }
        });
        final int i2 = 1;
        this.chatOpenArguments = kotlin.a.a(new sls(this) { // from class: u020
            public final /* synthetic */ MessengerChatFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                ids permissionManager_delegate$lambda$0;
                q6b chatOpenArguments_delegate$lambda$1;
                h userActionFailedController_delegate$lambda$2;
                IsolatedChatConfig isolatedChatConfig_delegate$lambda$3;
                xzw ui_delegate$lambda$4;
                int i22 = i2;
                MessengerChatFragment messengerChatFragment = this.b;
                switch (i22) {
                    case 0:
                        permissionManager_delegate$lambda$0 = MessengerChatFragment.permissionManager_delegate$lambda$0(messengerChatFragment);
                        return permissionManager_delegate$lambda$0;
                    case 1:
                        chatOpenArguments_delegate$lambda$1 = MessengerChatFragment.chatOpenArguments_delegate$lambda$1(messengerChatFragment);
                        return chatOpenArguments_delegate$lambda$1;
                    case 2:
                        userActionFailedController_delegate$lambda$2 = MessengerChatFragment.userActionFailedController_delegate$lambda$2(messengerChatFragment);
                        return userActionFailedController_delegate$lambda$2;
                    case 3:
                        isolatedChatConfig_delegate$lambda$3 = MessengerChatFragment.isolatedChatConfig_delegate$lambda$3(messengerChatFragment);
                        return isolatedChatConfig_delegate$lambda$3;
                    default:
                        ui_delegate$lambda$4 = MessengerChatFragment.ui_delegate$lambda$4(messengerChatFragment);
                        return ui_delegate$lambda$4;
                }
            }
        });
        final int i3 = 2;
        this.userActionFailedController = kotlin.a.a(new sls(this) { // from class: u020
            public final /* synthetic */ MessengerChatFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                ids permissionManager_delegate$lambda$0;
                q6b chatOpenArguments_delegate$lambda$1;
                h userActionFailedController_delegate$lambda$2;
                IsolatedChatConfig isolatedChatConfig_delegate$lambda$3;
                xzw ui_delegate$lambda$4;
                int i22 = i3;
                MessengerChatFragment messengerChatFragment = this.b;
                switch (i22) {
                    case 0:
                        permissionManager_delegate$lambda$0 = MessengerChatFragment.permissionManager_delegate$lambda$0(messengerChatFragment);
                        return permissionManager_delegate$lambda$0;
                    case 1:
                        chatOpenArguments_delegate$lambda$1 = MessengerChatFragment.chatOpenArguments_delegate$lambda$1(messengerChatFragment);
                        return chatOpenArguments_delegate$lambda$1;
                    case 2:
                        userActionFailedController_delegate$lambda$2 = MessengerChatFragment.userActionFailedController_delegate$lambda$2(messengerChatFragment);
                        return userActionFailedController_delegate$lambda$2;
                    case 3:
                        isolatedChatConfig_delegate$lambda$3 = MessengerChatFragment.isolatedChatConfig_delegate$lambda$3(messengerChatFragment);
                        return isolatedChatConfig_delegate$lambda$3;
                    default:
                        ui_delegate$lambda$4 = MessengerChatFragment.ui_delegate$lambda$4(messengerChatFragment);
                        return ui_delegate$lambda$4;
                }
            }
        });
        final int i4 = 3;
        this.isolatedChatConfig = kotlin.a.a(new sls(this) { // from class: u020
            public final /* synthetic */ MessengerChatFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                ids permissionManager_delegate$lambda$0;
                q6b chatOpenArguments_delegate$lambda$1;
                h userActionFailedController_delegate$lambda$2;
                IsolatedChatConfig isolatedChatConfig_delegate$lambda$3;
                xzw ui_delegate$lambda$4;
                int i22 = i4;
                MessengerChatFragment messengerChatFragment = this.b;
                switch (i22) {
                    case 0:
                        permissionManager_delegate$lambda$0 = MessengerChatFragment.permissionManager_delegate$lambda$0(messengerChatFragment);
                        return permissionManager_delegate$lambda$0;
                    case 1:
                        chatOpenArguments_delegate$lambda$1 = MessengerChatFragment.chatOpenArguments_delegate$lambda$1(messengerChatFragment);
                        return chatOpenArguments_delegate$lambda$1;
                    case 2:
                        userActionFailedController_delegate$lambda$2 = MessengerChatFragment.userActionFailedController_delegate$lambda$2(messengerChatFragment);
                        return userActionFailedController_delegate$lambda$2;
                    case 3:
                        isolatedChatConfig_delegate$lambda$3 = MessengerChatFragment.isolatedChatConfig_delegate$lambda$3(messengerChatFragment);
                        return isolatedChatConfig_delegate$lambda$3;
                    default:
                        ui_delegate$lambda$4 = MessengerChatFragment.ui_delegate$lambda$4(messengerChatFragment);
                        return ui_delegate$lambda$4;
                }
            }
        });
        final int i5 = 4;
        this.ui = kotlin.a.a(new sls(this) { // from class: u020
            public final /* synthetic */ MessengerChatFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                ids permissionManager_delegate$lambda$0;
                q6b chatOpenArguments_delegate$lambda$1;
                h userActionFailedController_delegate$lambda$2;
                IsolatedChatConfig isolatedChatConfig_delegate$lambda$3;
                xzw ui_delegate$lambda$4;
                int i22 = i5;
                MessengerChatFragment messengerChatFragment = this.b;
                switch (i22) {
                    case 0:
                        permissionManager_delegate$lambda$0 = MessengerChatFragment.permissionManager_delegate$lambda$0(messengerChatFragment);
                        return permissionManager_delegate$lambda$0;
                    case 1:
                        chatOpenArguments_delegate$lambda$1 = MessengerChatFragment.chatOpenArguments_delegate$lambda$1(messengerChatFragment);
                        return chatOpenArguments_delegate$lambda$1;
                    case 2:
                        userActionFailedController_delegate$lambda$2 = MessengerChatFragment.userActionFailedController_delegate$lambda$2(messengerChatFragment);
                        return userActionFailedController_delegate$lambda$2;
                    case 3:
                        isolatedChatConfig_delegate$lambda$3 = MessengerChatFragment.isolatedChatConfig_delegate$lambda$3(messengerChatFragment);
                        return isolatedChatConfig_delegate$lambda$3;
                    default:
                        ui_delegate$lambda$4 = MessengerChatFragment.ui_delegate$lambda$4(messengerChatFragment);
                        return ui_delegate$lambda$4;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q6b chatOpenArguments_delegate$lambda$1(MessengerChatFragment messengerChatFragment) {
        return new q6b(messengerChatFragment.requireArguments());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final tpr componentFlow() {
        return new fzw(6, getActivityComponentFlow(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k0x createViewComponent(kzw component) {
        d8g d8gVar = (d8g) component;
        z8g z8gVar = d8gVar.b;
        p8g p8gVar = d8gVar.c;
        d8g d8gVar2 = d8gVar.d;
        q6b chatOpenArguments = getChatOpenArguments();
        chatOpenArguments.getClass();
        com.yandex.alicekit.core.permissions.b permissionManager = getPermissionManager();
        permissionManager.getClass();
        IsolatedChatConfig isolatedChatConfig = getIsolatedChatConfig();
        isolatedChatConfig.getClass();
        return new h8g(z8gVar, p8gVar, d8gVar2, new pcz0(), this, chatOpenArguments, isolatedChatConfig, permissionManager);
    }

    private final q6b getChatOpenArguments() {
        return (q6b) this.chatOpenArguments.getValue();
    }

    private final IsolatedChatConfig getIsolatedChatConfig() {
        return (IsolatedChatConfig) this.isolatedChatConfig.getValue();
    }

    private final com.yandex.alicekit.core.permissions.b getPermissionManager() {
        return (com.yandex.alicekit.core.permissions.b) this.permissionManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final xzw getUi() {
        return (xzw) this.ui.getValue();
    }

    private final h getUserActionFailedController() {
        return (h) this.userActionFailedController.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IsolatedChatConfig isolatedChatConfig_delegate$lambda$3(MessengerChatFragment messengerChatFragment) {
        IsolatedChatConfig isolatedChatConfig = messengerChatFragment.getChatOpenArguments().s;
        return isolatedChatConfig == null ? new IsolatedChatConfig(false, false, false, false, null, false, 0, false, false, false, null, 2047, null) : isolatedChatConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ids permissionManager_delegate$lambda$0(MessengerChatFragment messengerChatFragment) {
        return new ids(messengerChatFragment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xzw ui_delegate$lambda$4(MessengerChatFragment messengerChatFragment) {
        return new xzw(messengerChatFragment.requireContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h userActionFailedController_delegate$lambda$2(MessengerChatFragment messengerChatFragment) {
        return new h(messengerChatFragment.requireActivityOrReportError());
    }

    @Override // com.yandex.messaging.isolated.IsolatedFragment
    public String getName() {
        return this.name;
    }

    public final tzw getSearchApi() {
        k0x k0xVar = this.viewComponent;
        if (k0xVar != null) {
            return (tzw) ((h8g) k0xVar).D2.get();
        }
        return null;
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

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        h userActionFailedController = getUserActionFailedController();
        qp3 qp3Var = userActionFailedController.c;
        kgx[] kgxVarArr = h.g;
        kgx kgxVar = kgxVarArr[0];
        qp3Var.b(null);
        qp3 qp3Var2 = userActionFailedController.d;
        kgx kgxVar2 = kgxVarArr[1];
        qp3Var2.b(null);
        qp3 qp3Var3 = userActionFailedController.e;
        kgx kgxVar3 = kgxVarArr[2];
        qp3Var3.b(null);
        qp3 qp3Var4 = userActionFailedController.f;
        kgx kgxVar4 = kgxVarArr[3];
        qp3Var4.b(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getUserActionFailedController().a();
    }

    @Override // com.yandex.messaging.isolated.IsolatedFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        kotlinx.coroutines.flow.e.H(eja1.s(getViewLifecycleOwner()), new jqr(componentFlow(), new MessengerChatFragment$onViewCreated$1(this, null), 3));
        tje.N(eja1.s(getViewLifecycleOwner()), null, null, new MessengerChatFragment$onViewCreated$2(this, null), 3);
    }
}
