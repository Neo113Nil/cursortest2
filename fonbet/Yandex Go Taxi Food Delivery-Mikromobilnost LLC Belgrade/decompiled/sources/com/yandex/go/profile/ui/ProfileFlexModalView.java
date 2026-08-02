package com.yandex.go.profile.ui;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.flex.common.api.ui.theme.DivKitThemedFrameLayout;
import defpackage.b230;
import defpackage.cma1;
import defpackage.cvh0;
import defpackage.g5c;
import defpackage.hzk;
import defpackage.i3m;
import defpackage.jn5;
import defpackage.kef0;
import defpackage.kl40;
import defpackage.kr;
import defpackage.lef0;
import defpackage.lh2;
import defpackage.ljr;
import defpackage.mef0;
import defpackage.mh2;
import defpackage.ny61;
import defpackage.o6s0;
import defpackage.pey;
import defpackage.pjr;
import defpackage.pwy;
import defpackage.tje;
import defpackage.vng;
import defpackage.w1y;
import defpackage.x6h0;
import defpackage.xxl;
import defpackage.ysi0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.analytics.ModalViewCloseReason;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.BindingModalView;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004BM\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\u00020\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#H\u0014¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0017H\u0014¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0017H\u0014¢\u0006\u0004\b*\u0010)J\u0017\u0010-\u001a\u00020\u00172\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\rH\u0016¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u00172\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u0013\u00105\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u0017¢\u0006\u0004\b7\u0010)R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00108R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00109R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010:R\u001c\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010;R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010<¨\u0006="}, d2 = {"Lcom/yandex/go/profile/ui/ProfileFlexModalView;", "Lru/yandex/taxi/widget/BindingModalView;", "Lw1y;", "Lkef0;", "Lnwy0;", "Landroid/content/Context;", "context", "Lmef0;", "presenter", "Lflex/engine/a;", "documentEngine", "Li3m;", "documentTracker", "", "isFromRestore", "Landroid/util/SparseArray;", "Landroid/os/Parcelable;", "savedInstanceState", "Lljr;", "flexInsetParams", "<init>", "(Landroid/content/Context;Lmef0;Lflex/engine/a;Li3m;ZLandroid/util/SparseArray;Lljr;)V", "scrollState", "Lzy11;", "restoreInstanceState", "(Landroid/util/SparseArray;)V", "Lb230;", "insetsType", "()Lb230;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lw1y;", "Lg5c;", "closeTransitionReason", "Lmh2;", "getDismissAnimationDelegate", "(Lg5c;)Lmh2;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "allowTraverse", "()Z", "Llef0;", "uiState", "render", "(Llef0;)V", "saveInstanceState", "()Landroid/util/SparseArray;", "close", "Lmef0;", "Lflex/engine/a;", "Li3m;", "Landroid/util/SparseArray;", "Lljr;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ProfileFlexModalView extends BindingModalView<w1y> implements kef0 {
    private final flex.engine.a documentEngine;
    private final i3m documentTracker;
    private final ljr flexInsetParams;
    private final mef0 presenter;
    private final SparseArray<Parcelable> savedInstanceState;

    public ProfileFlexModalView(Context context, mef0 mef0Var, flex.engine.a aVar, i3m i3mVar, boolean z, SparseArray<Parcelable> sparseArray, ljr ljrVar) {
        super(context);
        this.presenter = mef0Var;
        this.documentEngine = aVar;
        this.documentTracker = i3mVar;
        this.savedInstanceState = sparseArray;
        this.flexInsetParams = ljrVar;
        setEnableBackgroundOnAppearing(false);
        setAnimateOnAppearing(!z);
        lh2 lh2Var = lh2.c;
        setAnimationDelegate(lh2.c);
    }

    private final void restoreInstanceState(SparseArray<Parcelable> scrollState) {
        this.documentEngine.b(new jn5(1, this, scrollState));
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    /* renamed from: allowTraverse */
    public boolean getIsTrackingsRedesignEnabled() {
        return false;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.BindingModalView
    public w1y bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(cvh0.layout_profile_flex_container, parent, false);
        int i = x6h0.flex_container;
        if (((GoFrameLayout) cma1.O(i, inflate)) != null) {
            return new w1y((DivKitThemedFrameLayout) inflate);
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    public final void close() {
        onBackPressed();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public mh2 getDismissAnimationDelegate(g5c closeTransitionReason) {
        return closeTransitionReason instanceof ModalViewCloseReason ? super.getDismissAnimationDelegate(closeTransitionReason) : kl40.b;
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        pjr pjrVar;
        super.onAttachedToWindow();
        ljr ljrVar = this.flexInsetParams;
        if (ljrVar != null && (pjrVar = ljrVar.b) != null) {
            ((hzk) pjrVar).s();
        }
        i3m i3mVar = this.documentTracker;
        if (i3mVar != null) {
            this.documentEngine.c(i3mVar);
        }
        SparseArray<Parcelable> sparseArray = this.savedInstanceState;
        if (sparseArray != null) {
            restoreInstanceState(sparseArray);
        }
        pey o = vng.o(this);
        if (o != null) {
            this.documentEngine.g(getBinding().a, o);
        }
        mef0 mef0Var = this.presenter;
        mef0Var.Bg(this);
        tje.N(mef0Var.Jg(), null, null, new ProfileFlexModalPresenter$attachView$$inlined$safeCollectIn$1(new b(new d(mef0Var.x.b(), mef0Var)), null, this), 3);
        tje.N(mef0Var.Jg(), null, null, new ProfileFlexModalPresenter$attachView$4(mef0Var, null), 3);
        mef0Var.A = mef0Var.z.a(mef0Var);
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        pjr pjrVar;
        this.presenter.Cg();
        this.documentEngine.j();
        this.documentEngine.i();
        i3m i3mVar = this.documentTracker;
        if (i3mVar != null) {
            this.documentEngine.x(i3mVar);
        }
        ljr ljrVar = this.flexInsetParams;
        if (ljrVar != null && (pjrVar = ljrVar.b) != null) {
            ((com.yandex.div.core.expression.variables.a) ((hzk) pjrVar).b).k("handleInsetsInFlex", "ignoreFitSystemWindows");
        }
        super.onDetachedFromWindow();
    }

    @Override // defpackage.eyi0
    public void render(lef0 uiState) {
        kr krVar = uiState.a;
        if (krVar instanceof pwy) {
            pwy pwyVar = (pwy) krVar;
            this.documentEngine.p(pwyVar.a, pwyVar.b, pwyVar.c);
            return;
        }
        boolean z = krVar instanceof o6s0;
        flex.engine.a aVar = this.documentEngine;
        if (z) {
            aVar.C(((o6s0) krVar).c());
        } else if (!(krVar instanceof ysi0)) {
            aVar.k(krVar);
        } else {
            xxl xxlVar = flex.engine.a.s0;
            aVar.w(false);
        }
    }

    public final SparseArray<Parcelable> saveInstanceState() {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        saveHierarchyState(sparseArray);
        return sparseArray;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public b230 insetsType() {
        return b230.a;
    }

    public /* synthetic */ ProfileFlexModalView(Context context, mef0 mef0Var, flex.engine.a aVar, i3m i3mVar, boolean z, SparseArray sparseArray, ljr ljrVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, mef0Var, aVar, (i & 8) != 0 ? null : i3mVar, z, sparseArray, ljrVar);
    }
}
