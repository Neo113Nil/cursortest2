package com.yandex.go.places.flex.container.ui;

import android.content.Context;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.feedsdk.di.FeedSdkComponent;
import com.yandex.go.coroutines.b;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.flex.common.api.ui.theme.DivKitThemedFrameLayout;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.b9c0;
import defpackage.cma1;
import defpackage.eor;
import defpackage.i3y;
import defpackage.idy;
import defpackage.jqr;
import defpackage.k8c0;
import defpackage.kn5;
import defpackage.kr;
import defpackage.kzo;
import defpackage.l8c0;
import defpackage.mhp0;
import defpackage.n6h0;
import defpackage.n9c0;
import defpackage.ny61;
import defpackage.o8c0;
import defpackage.q6c0;
import defpackage.t9b0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.tuh0;
import defpackage.vng;
import defpackage.w8c0;
import defpackage.xh91;
import defpackage.xv10;
import defpackage.y8c0;
import defpackage.ylr;
import defpackage.ywl;
import defpackage.zwl;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B#\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001b\u0010\u000eJ\u000f\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u000eJ\u000f\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u000eJ\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u000eJ\r\u0010\u001f\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010\u000eJ\u0017\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\fH\u0014¢\u0006\u0004\b$\u0010\u000eJ\u0017\u0010'\u001a\u00020\f2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020 H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\f2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\f2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b5\u00104J\u0017\u00109\u001a\u00020 2\u0006\u00106\u001a\u00020 H\u0000¢\u0006\u0004\b7\u00108J\u0015\u0010<\u001a\u00020\f2\u0006\u0010;\u001a\u00020:¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\f¢\u0006\u0004\b>\u0010\u000eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010?R\u001b\u0010E\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\f0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\"\u0010L\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bL\u0010-\"\u0004\bN\u0010#¨\u0006O"}, d2 = {"Lcom/yandex/go/places/flex/container/ui/PlacesFlexContainerScreenView;", "Lylr;", "Lcom/yandex/go/flex/common/api/ui/theme/DivKitThemedFrameLayout;", "Lw8c0;", "Landroid/content/Context;", "context", "Lcom/yandex/feedsdk/di/FeedSdkComponent;", "flexSdk", "Lb9c0;", "presenter", "<init>", "(Landroid/content/Context;Lcom/yandex/feedsdk/di/FeedSdkComponent;Lb9c0;)V", "Lzy11;", "pause", "()V", "Lo8c0;", "screenInfo", "Lk8c0;", "requestParametersBuilderV2", "reloadDocument", "(Lo8c0;Lk8c0;)V", "Lywl;", "document", "showDocument", "(Lywl;)V", "currentDocument", "()Lywl;", "onAttachedToWindow", "onResume", "onPause", "resumeManually", "pauseManually", "", "shouldDestroyEngine", "onDestroy", "(Z)V", "onDetachedFromWindow", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Landroid/view/View;", "asView", "()Landroid/view/View;", "interceptOnBackPressed", "()Z", "", "getAnchoredHeight", "()I", "Landroidx/recyclerview/widget/RecyclerView$g;", "listener", "addScrollListener", "(Landroidx/recyclerview/widget/RecyclerView$g;)V", "removeScrollListener", BackendConfig.Restrictions.ENABLED, "setRecyclerVerticalScrollEnabled$impl", "(Z)Z", "setRecyclerVerticalScrollEnabled", "Lkr;", "action", "dispatchAction", "(Lkr;)V", "scrollToTop", "Lb9c0;", "Lflex/engine/a;", "flexSdkEngine$delegate", "Li3y;", "getFlexSdkEngine", "()Lflex/engine/a;", "flexSdkEngine", "Lidy;", "lifecycleAwareController", "Lidy;", "Ll8c0;", "binding", "Ll8c0;", "isLifecycleManagedExternally", "Z", "setLifecycleManagedExternally", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlacesFlexContainerScreenView extends DivKitThemedFrameLayout implements ylr, w8c0 {
    private final l8c0 binding;

    /* renamed from: flexSdkEngine$delegate, reason: from kotlin metadata */
    private final i3y flexSdkEngine;
    private boolean isLifecycleManagedExternally;
    private final idy lifecycleAwareController;
    private final b9c0 presenter;

    public PlacesFlexContainerScreenView(Context context, FeedSdkComponent feedSdkComponent, b9c0 b9c0Var) {
        super(context, null, 0, 0, 14, null);
        this.presenter = b9c0Var;
        this.flexSdkEngine = a.b(LazyThreadSafetyMode.NONE, new t9b0(18, feedSdkComponent));
        idy idyVar = new idy();
        idyVar.a();
        this.lifecycleAwareController = idyVar;
        LayoutInflater.from(context).inflate(tuh0.places_flex_container_screen, this);
        int i = n6h0.feed_sdk_root;
        GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i, this);
        if (goFrameLayout != null) {
            this.binding = new l8c0(this, goFrameLayout);
        } else {
            ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
            throw null;
        }
    }

    private final flex.engine.a getFlexSdkEngine() {
        return (flex.engine.a) this.flexSdkEngine.getValue();
    }

    private final void pause() {
        this.lifecycleAwareController.c();
        this.lifecycleAwareController.f();
    }

    @Override // defpackage.ylr
    public void addScrollListener(RecyclerView.g listener) {
        getFlexSdkEngine().d(listener);
    }

    @Override // com.yandex.go.flex.common.api.ui.theme.DivKitThemedFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        kzo kzoVar = this.presenter.G;
        if (kzoVar.b) {
            ((flex.engine.a) kzoVar.c).D((ywl) ((t9b0) kzoVar.w).invoke(), zwl.c);
        }
    }

    @Override // defpackage.ylr
    public View asView() {
        return this;
    }

    public final ywl currentDocument() {
        return this.presenter.K;
    }

    public final void dispatchAction(kr action) {
        getFlexSdkEngine().k(action);
    }

    public int getAnchoredHeight() {
        return this.binding.a.getHeight();
    }

    @Override // defpackage.ylr
    public boolean interceptOnBackPressed() {
        return true;
    }

    /* renamed from: isLifecycleManagedExternally, reason: from getter */
    public final boolean getIsLifecycleManagedExternally() {
        return this.isLifecycleManagedExternally;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        vng.E(this, this.lifecycleAwareController);
        getFlexSdkEngine().g(this.binding.b, this.lifecycleAwareController);
        b9c0 b9c0Var = this.presenter;
        b9c0Var.Bg(this);
        flex.engine.a aVar = b9c0Var.x;
        com.yandex.go.places.flex.container.domain.interactors.a aVar2 = b9c0Var.y;
        ywl c = aVar2.c.c(aVar2.e);
        zwl zwlVar = zwl.c;
        aVar.D(c, zwlVar);
        xv10 xv10Var = b9c0Var.H;
        q6c0 q6c0Var = (q6c0) xv10Var.w;
        q6c0Var.getClass();
        q6c0Var.c = Long.valueOf(SystemClock.elapsedRealtime());
        ((flex.engine.a) xv10Var.a).c((kn5) xv10Var.x);
        kzo kzoVar = b9c0Var.G;
        kzoVar.b = true;
        ((flex.engine.a) kzoVar.c).c((n9c0) kzoVar.x);
        aVar.c(b9c0Var.L);
        tpr b = b9c0Var.B.b();
        tse Jg = b9c0Var.Jg();
        PlacesFlexContainerScreenPresenter$attachView$$inlined$safeCollectIn$1 placesFlexContainerScreenPresenter$attachView$$inlined$safeCollectIn$1 = new PlacesFlexContainerScreenPresenter$attachView$$inlined$safeCollectIn$1(b, null, aVar);
        int i = 3;
        tje.N(Jg, null, null, placesFlexContainerScreenPresenter$attachView$$inlined$safeCollectIn$1, 3);
        ywl ywlVar = b9c0Var.J;
        y8c0 y8c0Var = b9c0Var.I;
        if (ywlVar != null) {
            b9c0Var.J = null;
            b9c0Var.I = null;
            aVar.D(ywlVar, zwlVar);
        } else if (y8c0Var != null) {
            b9c0Var.I = null;
            tje.N(b9c0Var.Jg(), null, null, new PlacesFlexContainerScreenPresenter$loadDocumentByPath$1(b9c0Var, y8c0Var, null), 3);
        } else if (b9c0Var.D.b()) {
            tje.N(b9c0Var.Jg(), null, null, new PlacesFlexContainerScreenPresenter$loadPendingOrDefaultDocument$1(b9c0Var, null), 3);
        }
        b.h(b9c0Var.Jg(), new jqr(b9c0Var.z.a(), new PlacesFlexContainerScreenPresenter$attachView$2(b9c0Var, null), i));
        tje.N(b9c0Var.Jg(), null, null, new PlacesFlexContainerScreenPresenter$attachView$$inlined$safeCollectIn$2(b9c0Var.A.a(), null, b9c0Var), 3);
        tje.N(b9c0Var.Jg(), null, null, new PlacesFlexContainerScreenPresenter$attachView$$inlined$safeCollectIn$3(b9c0Var.E.b(), null, b9c0Var), 3);
    }

    @Override // defpackage.ylr
    public void onDestroy(boolean shouldDestroyEngine) {
        if (shouldDestroyEngine) {
            this.lifecycleAwareController.b();
            getFlexSdkEngine().i();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getFlexSdkEngine().j();
        this.presenter.Cg();
    }

    @Override // defpackage.ylr
    public void onPause() {
        if (this.isLifecycleManagedExternally) {
            return;
        }
        pause();
    }

    @Override // defpackage.ylr
    public void onResume() {
        this.lifecycleAwareController.e();
        this.lifecycleAwareController.d();
    }

    @Override // defpackage.ylr
    public /* bridge */ void onStop() {
    }

    public final void pauseManually() {
        pause();
    }

    public final void reloadDocument(o8c0 screenInfo, k8c0 requestParametersBuilderV2) {
        b9c0 b9c0Var = this.presenter;
        b9c0Var.getClass();
        y8c0 y8c0Var = new y8c0(screenInfo, requestParametersBuilderV2);
        if (b9c0Var.Eg()) {
            tje.N(b9c0Var.Jg(), null, null, new PlacesFlexContainerScreenPresenter$loadDocumentByPath$1(b9c0Var, y8c0Var, null), 3);
        } else {
            b9c0Var.I = y8c0Var;
        }
    }

    @Override // defpackage.ylr
    public void removeScrollListener(RecyclerView.g listener) {
        getFlexSdkEngine().y(listener);
    }

    public final void resumeManually() {
        this.lifecycleAwareController.e();
        this.lifecycleAwareController.d();
    }

    public final void scrollToTop() {
        RecyclerView b = xh91.b(this.binding.b);
        if (b != null) {
            b.scrollToPosition(0);
        }
    }

    @Override // defpackage.ylr
    public /* bridge */ void setCanScroll(boolean z) {
    }

    @Override // defpackage.ylr
    public /* bridge */ void setFloatButtons(eor eorVar, eor eorVar2) {
    }

    public final void setLifecycleManagedExternally(boolean z) {
        this.isLifecycleManagedExternally = z;
    }

    public final boolean setRecyclerVerticalScrollEnabled$impl(boolean enabled) {
        RecyclerView b = xh91.b(this.binding.b);
        if (b == null) {
            return false;
        }
        Object layoutManager = b.getLayoutManager();
        mhp0 mhp0Var = layoutManager instanceof mhp0 ? (mhp0) layoutManager : null;
        if (mhp0Var == null) {
            return false;
        }
        mhp0Var.w(enabled);
        return true;
    }

    public final void showDocument(ywl document) {
        b9c0 b9c0Var = this.presenter;
        if (b9c0Var.Eg()) {
            b9c0Var.x.D(document, zwl.c);
        } else {
            b9c0Var.J = document;
        }
    }

    @Override // defpackage.ylr
    public /* bridge */ void updateVisibilities() {
    }
}
