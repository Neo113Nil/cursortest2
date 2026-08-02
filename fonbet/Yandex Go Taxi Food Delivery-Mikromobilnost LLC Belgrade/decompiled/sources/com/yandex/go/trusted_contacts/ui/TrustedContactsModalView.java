package com.yandex.go.trusted_contacts.ui;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.ah11;
import defpackage.bz4;
import defpackage.c6r0;
import defpackage.cma1;
import defpackage.cz4;
import defpackage.dh11;
import defpackage.dz4;
import defpackage.ec01;
import defpackage.eh11;
import defpackage.ez4;
import defpackage.fh11;
import defpackage.fz4;
import defpackage.g0c;
import defpackage.glh0;
import defpackage.gtq0;
import defpackage.he7;
import defpackage.hgr0;
import defpackage.iws;
import defpackage.jl01;
import defpackage.jm10;
import defpackage.kg11;
import defpackage.kux0;
import defpackage.ny61;
import defpackage.of11;
import defpackage.p0;
import defpackage.pv01;
import defpackage.qje;
import defpackage.qoi0;
import defpackage.rji0;
import defpackage.scc;
import defpackage.sh11;
import defpackage.tje;
import defpackage.txc;
import defpackage.vp4;
import defpackage.w511;
import defpackage.w8h0;
import defpackage.wnf0;
import defpackage.wt;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.y130;
import defpackage.zg11;
import defpackage.zxs;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.design.utils.RecyclerShadowController$Type;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.progress.CircularProgressBar;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B%\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000b*\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001f\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/yandex/go/trusted_contacts/ui/TrustedContactsModalView;", "Lcom/yandex/go/trusted_contacts/ui/BaseTrustedContactsModalView;", "Lfh11;", "Landroid/content/Context;", "context", "Lsh11;", "presenter", "Lru/yandex/taxi/design/utils/a;", "shadowUtil", "<init>", "(Landroid/content/Context;Lsh11;Lru/yandex/taxi/design/utils/a;)V", "Lzy11;", "setupShadow", "(Landroid/content/Context;)V", "Landroidx/recyclerview/widget/RecyclerView;", "removeCollectionInfo", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Ly130;", "insetsType", "()Ly130;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lfh11;", "onAttachedToWindow", "()V", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "onDetachedFromWindow", "Lsh11;", "Lru/yandex/taxi/design/utils/a;", "Lrji0;", "shadowController", "Lrji0;", "Lkg11;", "trustedContactsAdapter", "Lkg11;", "dh11", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TrustedContactsModalView extends BaseTrustedContactsModalView<fh11> {
    private final sh11 presenter;
    private final rji0 shadowController;
    private final ru.yandex.taxi.design.utils.a shadowUtil;
    private kg11 trustedContactsAdapter;

    public TrustedContactsModalView(Context context, sh11 sh11Var, ru.yandex.taxi.design.utils.a aVar) {
        super(context);
        this.presenter = sh11Var;
        this.shadowUtil = aVar;
        this.shadowController = new rji0(RecyclerShadowController$Type.BOTTOM);
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ fh11 access$getBinding(TrustedContactsModalView trustedContactsModalView) {
        return (fh11) trustedContactsModalView.getBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final View insetsType$lambda$0(TrustedContactsModalView trustedContactsModalView) {
        return ((fh11) trustedContactsModalView.getBinding()).a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttachedToWindow$lambda$0(TrustedContactsModalView trustedContactsModalView, fz4 fz4Var) {
        if (fz4Var instanceof bz4) {
            sh11 sh11Var = trustedContactsModalView.presenter;
            tje.N(sh11Var.Jg(), null, null, new TrustedContactsPresenter$onAddContactClicked$1(sh11Var, null), 3);
        } else if (!(fz4Var instanceof dz4) && !(fz4Var instanceof cz4) && !(fz4Var instanceof ez4)) {
            w511.b();
            return null;
        }
        return zy11.a;
    }

    private final void removeCollectionInfo(RecyclerView recyclerView) {
        recyclerView.setAccessibilityDelegateCompat(new eh11(recyclerView));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setupShadow(Context context) {
        NinePatchDrawable x = gtq0.x(this.shadowUtil, context, tje.u(24, getContext()), new hgr0(0.0f, tje.w(-4, context), tje.w(20, context), qje.u(context.getTheme(), xng0.effectShadowTop)));
        Rect rect = new Rect();
        x.getPadding(rect);
        AppCompatImageView appCompatImageView = ((fh11) getBinding()).d;
        appCompatImageView.setBackground(x);
        xw31.E(appCompatImageView, Integer.valueOf(-rect.left), Integer.valueOf(-rect.top), Integer.valueOf(-rect.right), 0);
    }

    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public fh11 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(glh0.trusted_contacts_modal_view, parent, false);
        int i = w8h0.toolbar;
        ToolbarComponent toolbarComponent = (ToolbarComponent) cma1.O(i, inflate);
        if (toolbarComponent != null) {
            i = w8h0.trusted_contacts_action_button;
            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
            if (buttonComponent != null) {
                i = w8h0.trusted_contacts_bottom_shadow;
                AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
                if (appCompatImageView != null) {
                    i = w8h0.trusted_contacts_content;
                    FrameLayout frameLayout = (FrameLayout) cma1.O(i, inflate);
                    if (frameLayout != null) {
                        i = w8h0.trusted_contacts_divider;
                        if (((FrameLayout) cma1.O(i, inflate)) != null) {
                            i = w8h0.trusted_contacts_loading;
                            CircularProgressBar circularProgressBar = (CircularProgressBar) cma1.O(i, inflate);
                            if (circularProgressBar != null) {
                                i = w8h0.trusted_contacts_recycler_view;
                                RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                                if (recyclerView != null) {
                                    return new fh11((FrameLayout) inflate, toolbarComponent, buttonComponent, appCompatImageView, frameLayout, circularProgressBar, recyclerView);
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView */
    public View getContent() {
        return ((fh11) getBinding()).a;
    }

    @Override // com.yandex.go.trusted_contacts.ui.BaseTrustedContactsModalView, ru.yandex.taxi.widget.ModalView
    public y130 insetsType() {
        return new y130(1, new pv01(9, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setupShadow(getContext());
        setDismissOnTouchOutside(false);
        setDismissOnBackPressed(false);
        setOnBackPressedListener(new kux0(29, this.presenter));
        TrustedContactsModalView$onAttachedToWindow$2 trustedContactsModalView$onAttachedToWindow$2 = new TrustedContactsModalView$onAttachedToWindow$2(1, this.presenter, sh11.class, "onDeleteTrustedContactButtonClicked", "onDeleteTrustedContactButtonClicked(Ljava/lang/String;)V", 0);
        TrustedContactsModalView$onAttachedToWindow$3 trustedContactsModalView$onAttachedToWindow$3 = new TrustedContactsModalView$onAttachedToWindow$3(1, this.presenter, sh11.class, "onDeleteTrustingContactButtonClicked", "onDeleteTrustingContactButtonClicked(Ljava/lang/String;)V", 0);
        TrustedContactsModalView$onAttachedToWindow$4 trustedContactsModalView$onAttachedToWindow$4 = new TrustedContactsModalView$onAttachedToWindow$4(1, this.presenter, sh11.class, "onTrustedContactClicked", "onTrustedContactClicked(Ljava/lang/String;)V", 0);
        int i = 8;
        txc txcVar = new txc(i, new jl01(27, this));
        int i2 = wt.T;
        g0c a = qoi0.a(bz4.class);
        p0 p0Var = new p0(15);
        p0 p0Var2 = new p0(16);
        Class a2 = a.a();
        int i3 = 1;
        he7 he7Var = new he7(i3, p0Var2);
        EmptyList emptyList = EmptyList.a;
        zxs zxsVar = new zxs(a2, 0, p0Var, emptyList, he7Var, null);
        int i4 = c6r0.T;
        g0c a3 = qoi0.a(cz4.class);
        zxs zxsVar2 = new zxs(a3.a(), 0, new iws(11), emptyList, new he7(i3, new iws(12)), null);
        int i5 = jm10.Z;
        g0c a4 = qoi0.a(dz4.class);
        zxs zxsVar3 = new zxs(a4.a(), 0, new of11(i3), emptyList, new he7(i3, new wnf0(trustedContactsModalView$onAttachedToWindow$2, trustedContactsModalView$onAttachedToWindow$4, i)), null);
        int i6 = vp4.W;
        g0c a5 = qoi0.a(ez4.class);
        this.trustedContactsAdapter = new kg11(txcVar, scc.g(zxsVar, zxsVar2, zxsVar3, new zxs(a5.a(), 0, new of11(5), emptyList, new he7(i3, new ec01(9, trustedContactsModalView$onAttachedToWindow$3)), null)));
        fh11 fh11Var = (fh11) getBinding();
        RecyclerView recyclerView = fh11Var.g;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.trustedContactsAdapter);
        recyclerView.setItemAnimator(null);
        recyclerView.addItemDecoration(new ah11(recyclerView.getContext()));
        removeCollectionInfo(recyclerView);
        this.shadowController.a(fh11Var.d, fh11Var.g);
        sh11 sh11Var = this.presenter;
        dh11 dh11Var = new dh11(this);
        sh11Var.Bg(dh11Var);
        zg11 zg11Var = sh11Var.y;
        tje.N(sh11Var.Jg(), null, null, new TrustedContactsPresenter$attachView$$inlined$collectIn$1(e.s(new m0(zg11Var.a.k, e.d(sh11Var.B), new TrustedContactsPresenter$attachView$1(sh11Var, null)), new TrustedContactsPresenter$attachView$2(2, sh11Var, sh11.class, "areStateEquivalent", "areStateEquivalent(Lcom/yandex/go/trusted_contacts/ui/TrustedContactsUiState;Lcom/yandex/go/trusted_contacts/ui/TrustedContactsUiState;)Z", 0)), null, dh11Var), 3);
        tje.N(sh11Var.Jg(), null, null, new TrustedContactsPresenter$attachView$$inlined$collectIn$2(zg11Var.a.m, null, sh11Var), 3);
        tje.N(sh11Var.Jg(), null, null, new TrustedContactsPresenter$attachView$5(sh11Var, null), 3);
        requestApplyInsets();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.shadowController.c();
        this.presenter.Cg();
        this.trustedContactsAdapter = null;
    }
}
