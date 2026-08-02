package com.yandex.go.flex.common.facade.routers.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.t;
import androidx.recyclerview.widget.RecyclerView;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import com.yandex.go.flex.common.api.actions.CloseAction;
import com.yandex.go.flex.common.api.actions.CloseFlexScreenAction;
import com.yandex.go.flex.common.facade.b;
import defpackage.czo0;
import defpackage.g0y;
import defpackage.hbp0;
import defpackage.kr;
import defpackage.m99;
import defpackage.mqg0;
import defpackage.nch0;
import defpackage.nhr;
import defpackage.nir;
import defpackage.nsn;
import defpackage.osn;
import defpackage.pey;
import defpackage.rkr;
import defpackage.szl;
import defpackage.u841;
import defpackage.vng;
import defpackage.xhr;
import defpackage.yhr;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B/\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u001a\u0010\u0013J\u000f\u0010\u001b\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u001b\u0010\u0013J\u000f\u0010\u001c\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u0013J\u000f\u0010\u001d\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u0013J\u000f\u0010\u001e\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001e\u0010\u0013J\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\"\u0010\u0013J\u000f\u0010#\u001a\u00020\u0011H\u0016¢\u0006\u0004\b#\u0010\u0013J\u000f\u0010$\u001a\u00020\u001fH\u0016¢\u0006\u0004\b$\u0010!J\u0017\u0010&\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u001fH\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010,R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00108\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010<\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010;R\u0016\u0010=\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010;R\u0016\u0010>\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010;R\u0014\u0010B\u001a\u00020?8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006G"}, d2 = {"Lcom/yandex/go/flex/common/facade/routers/views/EmbeddedFlexView;", "Landroid/widget/FrameLayout;", "Lnsn;", "Lrkr;", "Lpey;", "Landroid/content/Context;", "context", "Lnhr;", "flexConfig", "Lyhr;", "flexControllerFactory", "Losn;", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, "", "scopeName", "<init>", "(Landroid/content/Context;Lnhr;Lyhr;Losn;Ljava/lang/String;)V", "Lzy11;", "attachFlexIfNeeded", "()V", "detachFlexFromContainer", "destroyFlexEngine", "recreateLifecycleRegistryIfDestroyed", "Landroidx/recyclerview/widget/RecyclerView;", "findContentRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "onAttachedToWindow", "onDetachedFromWindow", "prepareForOverlayDetach", "clearOverlayDetachPreserve", "destroyCompletely", "", "isFlexDocumentAlive", "()Z", "onPageResumed", "onPagePaused", "isContentScrollAtBottom", "isBackPressedEnabled", "changeBackPressedState", "(Z)V", "Lkr;", "action", "handleAction", "(Lkr;)Z", "Lnhr;", "Losn;", "Lg0y;", "binding", "Lg0y;", "Lxhr;", "flexController", "Lxhr;", "Lhbp0;", "scopeDelegate", "Lhbp0;", "Landroidx/lifecycle/t;", "lifecycleRegistry", "Landroidx/lifecycle/t;", "backPressedEnabled", "Z", "isFlexContainerAttached", "isFlexEngineDestroyed", "preserveFlexAcrossWindowDetach", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EmbeddedFlexView extends FrameLayout implements nsn, rkr, pey {
    private boolean backPressedEnabled;
    private final g0y binding;
    private final nhr flexConfig;
    private final xhr flexController;
    private final osn host;
    private boolean isFlexContainerAttached;
    private boolean isFlexEngineDestroyed;
    private t lifecycleRegistry;
    private boolean preserveFlexAcrossWindowDetach;
    private final hbp0 scopeDelegate;

    public EmbeddedFlexView(Context context, nhr nhrVar, yhr yhrVar, osn osnVar, String str) {
        super(context);
        this.flexConfig = nhrVar;
        this.host = osnVar;
        this.binding = g0y.o(LayoutInflater.from(context), this, true);
        this.flexController = ((nir) yhrVar).a(nhrVar);
        this.scopeDelegate = new hbp0(new czo0(14), str == null ? "" : str, null);
        this.lifecycleRegistry = new t(this, true);
        this.backPressedEnabled = true;
        Integer num = nhrVar.f;
        setBackgroundResource(num != null ? num.intValue() : mqg0.transparent);
        this.lifecycleRegistry.i(Lifecycle.State.CREATED);
    }

    private final void attachFlexIfNeeded() {
        if (this.isFlexEngineDestroyed || this.isFlexContainerAttached) {
            return;
        }
        vng.E(this, this);
        ((b) this.flexController).b(this.binding.b, this);
        szl szlVar = this.flexConfig.a.h;
        if (szlVar != null) {
            ((b) this.flexController).a(szlVar);
        }
        this.isFlexContainerAttached = true;
    }

    private final void destroyFlexEngine() {
        if (this.isFlexEngineDestroyed) {
            return;
        }
        detachFlexFromContainer();
        ((b) this.flexController).c();
        if (this.lifecycleRegistry.w.a(Lifecycle.State.STARTED)) {
            this.lifecycleRegistry.i(Lifecycle.State.CREATED);
        }
        this.lifecycleRegistry.i(Lifecycle.State.DESTROYED);
        this.isFlexEngineDestroyed = true;
    }

    private final void detachFlexFromContainer() {
        if (this.isFlexContainerAttached) {
            szl szlVar = this.flexConfig.a.h;
            if (szlVar != null) {
                ((b) this.flexController).e(szlVar);
            }
            ((b) this.flexController).d();
            this.isFlexContainerAttached = false;
        }
    }

    private final RecyclerView findContentRecyclerView() {
        return (RecyclerView) this.binding.b.findViewById(nch0.flexsdk_recycler_view_id);
    }

    private final void recreateLifecycleRegistryIfDestroyed() {
        if (this.lifecycleRegistry.w != Lifecycle.State.DESTROYED) {
            return;
        }
        t tVar = new t(this, true);
        this.lifecycleRegistry = tVar;
        tVar.i(Lifecycle.State.CREATED);
    }

    public void changeBackPressedState(boolean isBackPressedEnabled) {
        this.backPressedEnabled = isBackPressedEnabled;
    }

    @Override // defpackage.nsn
    public void clearOverlayDetachPreserve() {
        this.preserveFlexAcrossWindowDetach = false;
    }

    @Override // defpackage.nsn
    public void destroyCompletely() {
        this.preserveFlexAcrossWindowDetach = false;
        destroyFlexEngine();
    }

    @Override // defpackage.pey
    public Lifecycle getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // defpackage.nsn
    public View getView() {
        return this;
    }

    @Override // defpackage.rkr
    public boolean handleAction(kr action) {
        if (!((Boolean) this.flexConfig.h.invoke(action)).booleanValue()) {
            if (!(action instanceof CloseAction) && !(action instanceof CloseFlexScreenAction)) {
                return action instanceof m99;
            }
            if (this.backPressedEnabled) {
                ((u841) this.host).a.invoke();
            }
        }
        return true;
    }

    @Override // defpackage.nsn
    public boolean isContentScrollAtBottom() {
        RecyclerView findContentRecyclerView = findContentRecyclerView();
        return findContentRecyclerView == null || !findContentRecyclerView.canScrollVertically(1);
    }

    @Override // defpackage.nsn
    public boolean isFlexDocumentAlive() {
        return !this.isFlexEngineDestroyed;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.scopeDelegate.a();
        this.preserveFlexAcrossWindowDetach = false;
        attachFlexIfNeeded();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        onPagePaused();
        if (this.preserveFlexAcrossWindowDetach) {
            detachFlexFromContainer();
        } else {
            destroyFlexEngine();
        }
        this.scopeDelegate.b();
        super.onDetachedFromWindow();
    }

    @Override // defpackage.nsn
    public void onPagePaused() {
        recreateLifecycleRegistryIfDestroyed();
        t tVar = this.lifecycleRegistry;
        if (tVar.w == Lifecycle.State.RESUMED) {
            tVar.i(Lifecycle.State.STARTED);
        }
    }

    @Override // defpackage.nsn
    public void onPageResumed() {
        recreateLifecycleRegistryIfDestroyed();
        Lifecycle.State state = this.lifecycleRegistry.w;
        Lifecycle.State state2 = Lifecycle.State.STARTED;
        if (state.compareTo(state2) < 0) {
            this.lifecycleRegistry.i(state2);
        }
        this.lifecycleRegistry.i(Lifecycle.State.RESUMED);
    }

    @Override // defpackage.nsn
    public void prepareForOverlayDetach() {
        this.preserveFlexAcrossWindowDetach = true;
    }
}
