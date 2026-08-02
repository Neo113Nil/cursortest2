package com.yandex.plus.core.debug.panel.internal.presentation.controller;

import android.content.Context;
import android.view.View;
import com.yandex.plus.core.debug.panel.internal.presentation.view.DebugPanelContainer;
import com.yandex.plus.home.common.utils.a;
import defpackage.cwg;
import defpackage.dwg;
import defpackage.ewg;
import defpackage.fwg;
import defpackage.gwg;
import defpackage.i3y;
import defpackage.ike;
import defpackage.j4n;
import defpackage.jse;
import defpackage.n4u0;
import defpackage.qv10;
import defpackage.skd0;
import defpackage.sop0;
import defpackage.tje;
import defpackage.tse;
import defpackage.tvg;
import defpackage.u1w;
import defpackage.v8e;
import defpackage.w511;
import defpackage.xr31;
import defpackage.ykf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlinx.coroutines.flow.r0;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0011¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010\u001eJ\r\u0010 \u001a\u00020\u0011¢\u0006\u0004\b \u0010\u001eJ\u0015\u0010#\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0011¢\u0006\u0004\b%\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010&R\u001a\u0010(\u001a\u00020'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lcom/yandex/plus/core/debug/panel/internal/presentation/controller/DebugPanelViewControllerImpl;", "Lgwg;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/content/Context;", "context", "Lxr31;", "viewModel", "Lu1w;", "insets", "Ljse;", "dispatcher", "Ltvg;", "logsFileManager", "<init>", "(Landroid/content/Context;Lxr31;Lu1w;Ljse;Ltvg;)V", "Lfwg;", ClidProvider.STATE, "Lzy11;", "update", "(Lfwg;)V", "Landroid/view/View;", "v", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "", "id", "onAdditionalDataClicked", "(Ljava/lang/String;)V", "onLogsClicked", "()V", "onClearLogsClicked", "onBackClicked", "", "isGoBack", "onBackButtonClicked", "(Z)V", "onCloseButonClicked", "Lxr31;", "Lcom/yandex/plus/core/debug/panel/internal/presentation/view/DebugPanelContainer;", "view", "Lcom/yandex/plus/core/debug/panel/internal/presentation/view/DebugPanelContainer;", "getView", "()Lcom/yandex/plus/core/debug/panel/internal/presentation/view/DebugPanelContainer;", "Ltse;", "coroutineScope", "Ltse;", "homeless-core-debug-panel_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DebugPanelViewControllerImpl implements gwg, View.OnAttachStateChangeListener {
    private final tse coroutineScope;
    private final DebugPanelContainer view;
    private final xr31 viewModel;

    public DebugPanelViewControllerImpl(Context context, xr31 xr31Var, u1w u1wVar, jse jseVar, tvg tvgVar) {
        this.viewModel = xr31Var;
        this.view = new DebugPanelContainer(context, u1wVar, tvgVar, new DebugPanelViewControllerImpl$view$1(1, this, DebugPanelViewControllerImpl.class, "onAdditionalDataClicked", "onAdditionalDataClicked(Ljava/lang/String;)V", 0), new DebugPanelViewControllerImpl$view$4(0, this, DebugPanelViewControllerImpl.class, "onLogsClicked", "onLogsClicked()V", 0), new DebugPanelViewControllerImpl$view$5(0, this, DebugPanelViewControllerImpl.class, "onClearLogsClicked", "onClearLogsClicked()V", 0), new DebugPanelViewControllerImpl$view$2(0, this, DebugPanelViewControllerImpl.class, "onCloseButonClicked", "onCloseButonClicked()V", 0), new DebugPanelViewControllerImpl$view$3(1, this, DebugPanelViewControllerImpl.class, "onBackButtonClicked", "onBackButtonClicked(Z)V", 0));
        this.coroutineScope = qv10.e(jseVar);
        getView().addOnAttachStateChangeListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void update(fwg state) {
        if (state instanceof dwg) {
            getView().showInfo((dwg) state);
            return;
        }
        if (state instanceof cwg) {
            getView().showCustomScreen(null);
        } else if (state instanceof ewg) {
            getView().showLogs((ewg) state);
        } else {
            w511.b();
        }
    }

    public final void onAdditionalDataClicked(String id) {
        Iterator it = ((ArrayList) ((j4n) this.viewModel).z).iterator();
        while (it.hasNext()) {
            ((ykf) it.next()).getClass();
        }
    }

    public final void onBackButtonClicked(boolean isGoBack) {
        if (isGoBack) {
            onBackClicked();
        } else {
            onCloseButonClicked();
        }
    }

    public final void onBackClicked() {
        j4n j4nVar = (j4n) this.viewModel;
        r0 r0Var = (r0) j4nVar.w;
        dwg dwgVar = new dwg((ArrayList) j4nVar.y, (ArrayList) j4nVar.z);
        r0Var.getClass();
        r0Var.m(null, dwgVar);
    }

    public final void onClearLogsClicked() {
        j4n j4nVar = (j4n) ((v8e) ((j4n) this.viewModel).c).b;
        i3y i3yVar = skd0.a;
        ReentrantLock reentrantLock = sop0.b;
        reentrantLock.lock();
        try {
            sop0.c.clear();
            reentrantLock.unlock();
            j4nVar.K();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void onCloseButonClicked() {
        j4n j4nVar = (j4n) this.viewModel;
        a.b((ike) j4nVar.x);
        ((com.yandex.plus.home.feature.webviews.internal.container.a) j4nVar.b).r();
    }

    public final void onLogsClicked() {
        j4n j4nVar = (j4n) this.viewModel;
        r0 r0Var = (r0) j4nVar.w;
        ewg ewgVar = new ewg((n4u0) j4nVar.a);
        r0Var.getClass();
        r0Var.m(null, ewgVar);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v) {
        tje.N(this.coroutineScope, null, null, new DebugPanelViewControllerImpl$onViewAttachedToWindow$1(this, null), 3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v) {
        a.b(this.coroutineScope);
    }

    @Override // defpackage.gwg
    public DebugPanelContainer getView() {
        return this.view;
    }
}
