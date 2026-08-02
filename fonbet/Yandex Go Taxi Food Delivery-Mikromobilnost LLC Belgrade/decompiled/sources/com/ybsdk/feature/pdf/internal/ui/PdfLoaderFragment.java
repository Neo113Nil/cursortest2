package com.ybsdk.feature.pdf.internal.ui;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.feature.pdf.api.PdfLoaderScreenParams;
import com.ybsdk.feature.pdf.internal.ui.PdfLoaderFragment;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import defpackage.ara0;
import defpackage.bra0;
import defpackage.ce4;
import defpackage.cra0;
import defpackage.dcs;
import defpackage.dra0;
import defpackage.era0;
import defpackage.jl40;
import defpackage.l161;
import defpackage.lfx;
import defpackage.ntz0;
import defpackage.qas0;
import defpackage.qtz0;
import defpackage.rje;
import defpackage.rtz0;
import defpackage.sls;
import defpackage.stz0;
import defpackage.u290;
import defpackage.w511;
import defpackage.y8f;
import defpackage.yqa0;
import defpackage.yr31;
import defpackage.zqa0;
import defpackage.zy11;
import java.io.File;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u0011\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001f\u0010\rJ\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0016\u0010(\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/ybsdk/feature/pdf/internal/ui/PdfLoaderFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Ll161;", "Lera0;", "Lcom/ybsdk/feature/pdf/internal/ui/a;", "Lce4;", "Lyqa0;", "viewModelProvider", "<init>", "(Lyqa0;)V", "viewState", "Lzy11;", "renderToolbar", "(Lera0;)V", "setViewsVisibility", "createViewModel", "()Lcom/ybsdk/feature/pdf/internal/ui/a;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ll161;", "render", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "", "onBackPressed", "()Z", "Lyqa0;", "pdfShown", "Z", "feature-pdf_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PdfLoaderFragment extends BaseMvvmFragment<l161, era0, a> implements ce4 {
    private boolean pdfShown;
    private final yqa0 viewModelProvider;

    public PdfLoaderFragment(yqa0 yqa0Var) {
        super(Boolean.FALSE, null, null, null, a.class, 14, null);
        this.viewModelProvider = yqa0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$0(PdfLoaderFragment pdfLoaderFragment) {
        pdfLoaderFragment.getViewModel().c0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$1(PdfLoaderFragment pdfLoaderFragment) {
        pdfLoaderFragment.getViewModel().e0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$2(PdfLoaderFragment pdfLoaderFragment) {
        pdfLoaderFragment.getViewModel().g0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$3(PdfLoaderFragment pdfLoaderFragment) {
        pdfLoaderFragment.getViewModel().f0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$4(PdfLoaderFragment pdfLoaderFragment) {
        pdfLoaderFragment.getViewModel().d0();
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderToolbar(era0 viewState) {
        Object ntz0Var;
        boolean z = viewState instanceof bra0;
        if (z) {
            ntz0Var = qtz0.a;
        } else if (viewState instanceof cra0) {
            ntz0Var = new ntz0(0);
        } else {
            if (!jl40.l(viewState, dra0.a)) {
                w511.b();
                return;
            }
            ntz0Var = new ntz0(0);
        }
        ((l161) getBinding()).h.render(new u290(27, ntz0Var));
        setBackButtonVisible(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final stz0 renderToolbar$lambda$8(rtz0 rtz0Var, stz0 stz0Var) {
        return stz0.a(stz0Var, null, null, null, null, null, rtz0Var, false, false, null, null, 0, 32735);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setViewsVisibility(era0 viewState) {
        l161 l161Var = (l161) getBinding();
        boolean z = viewState instanceof bra0;
        bra0 bra0Var = z ? (bra0) viewState : null;
        ErrorView errorView = l161Var.d;
        YbButtonViewGroup ybButtonViewGroup = l161Var.c;
        errorView.setVisibility(viewState instanceof cra0 ? 0 : 8);
        boolean z2 = viewState instanceof dra0;
        l161Var.e.setVisibility(z2 ? 0 : 8);
        l161Var.g.setVisibility(z2 ? 0 : 8);
        ((l161) getBinding()).f.setVisibility(z ? 0 : 8);
        ybButtonViewGroup.render(bra0Var != null ? bra0Var.a() : null);
        ybButtonViewGroup.setVisibility((bra0Var != null ? bra0Var.a() : null) != null ? 0 : 8);
        l161Var.b.setVisibility((bra0Var != null ? bra0Var.a() : null) != null ? 0 : 8);
        this.pdfShown = z;
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof zqa0) {
            zqa0 zqa0Var = (zqa0) sideEffect;
            Intent putExtra = new Intent().setType("application/pdf").addFlags(1).setAction("android.intent.action.SEND").putExtra("android.intent.extra.STREAM", zqa0Var.a());
            putExtra.setClipData(ClipData.newRawUri("", zqa0Var.a()));
            rje.k(requireActivity(), Intent.createChooser(putExtra, null));
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return ((ara0) this.viewModelProvider).a((PdfLoaderScreenParams) dcs.a(this));
    }

    @Override // defpackage.ce4
    public boolean onBackPressed() {
        getViewModel().c0();
        return true;
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.pdfShown = false;
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final int i = 0;
        ((l161) getBinding()).h.setOnCloseButtonClickListener(new sls(this) { // from class: wqa0
            public final /* synthetic */ PdfLoaderFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 onViewCreated$lambda$0;
                zy11 onViewCreated$lambda$1;
                zy11 onViewCreated$lambda$2;
                zy11 onViewCreated$lambda$3;
                zy11 onViewCreated$lambda$4;
                int i2 = i;
                PdfLoaderFragment pdfLoaderFragment = this.b;
                switch (i2) {
                    case 0:
                        onViewCreated$lambda$0 = PdfLoaderFragment.onViewCreated$lambda$0(pdfLoaderFragment);
                        return onViewCreated$lambda$0;
                    case 1:
                        onViewCreated$lambda$1 = PdfLoaderFragment.onViewCreated$lambda$1(pdfLoaderFragment);
                        return onViewCreated$lambda$1;
                    case 2:
                        onViewCreated$lambda$2 = PdfLoaderFragment.onViewCreated$lambda$2(pdfLoaderFragment);
                        return onViewCreated$lambda$2;
                    case 3:
                        onViewCreated$lambda$3 = PdfLoaderFragment.onViewCreated$lambda$3(pdfLoaderFragment);
                        return onViewCreated$lambda$3;
                    default:
                        onViewCreated$lambda$4 = PdfLoaderFragment.onViewCreated$lambda$4(pdfLoaderFragment);
                        return onViewCreated$lambda$4;
                }
            }
        });
        final int i2 = 1;
        ((l161) getBinding()).d.setPrimaryButtonOnClickListener(new sls(this) { // from class: wqa0
            public final /* synthetic */ PdfLoaderFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 onViewCreated$lambda$0;
                zy11 onViewCreated$lambda$1;
                zy11 onViewCreated$lambda$2;
                zy11 onViewCreated$lambda$3;
                zy11 onViewCreated$lambda$4;
                int i22 = i2;
                PdfLoaderFragment pdfLoaderFragment = this.b;
                switch (i22) {
                    case 0:
                        onViewCreated$lambda$0 = PdfLoaderFragment.onViewCreated$lambda$0(pdfLoaderFragment);
                        return onViewCreated$lambda$0;
                    case 1:
                        onViewCreated$lambda$1 = PdfLoaderFragment.onViewCreated$lambda$1(pdfLoaderFragment);
                        return onViewCreated$lambda$1;
                    case 2:
                        onViewCreated$lambda$2 = PdfLoaderFragment.onViewCreated$lambda$2(pdfLoaderFragment);
                        return onViewCreated$lambda$2;
                    case 3:
                        onViewCreated$lambda$3 = PdfLoaderFragment.onViewCreated$lambda$3(pdfLoaderFragment);
                        return onViewCreated$lambda$3;
                    default:
                        onViewCreated$lambda$4 = PdfLoaderFragment.onViewCreated$lambda$4(pdfLoaderFragment);
                        return onViewCreated$lambda$4;
                }
            }
        });
        final int i3 = 2;
        ((l161) getBinding()).d.setSecondaryButtonClickListener(new sls(this) { // from class: wqa0
            public final /* synthetic */ PdfLoaderFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 onViewCreated$lambda$0;
                zy11 onViewCreated$lambda$1;
                zy11 onViewCreated$lambda$2;
                zy11 onViewCreated$lambda$3;
                zy11 onViewCreated$lambda$4;
                int i22 = i3;
                PdfLoaderFragment pdfLoaderFragment = this.b;
                switch (i22) {
                    case 0:
                        onViewCreated$lambda$0 = PdfLoaderFragment.onViewCreated$lambda$0(pdfLoaderFragment);
                        return onViewCreated$lambda$0;
                    case 1:
                        onViewCreated$lambda$1 = PdfLoaderFragment.onViewCreated$lambda$1(pdfLoaderFragment);
                        return onViewCreated$lambda$1;
                    case 2:
                        onViewCreated$lambda$2 = PdfLoaderFragment.onViewCreated$lambda$2(pdfLoaderFragment);
                        return onViewCreated$lambda$2;
                    case 3:
                        onViewCreated$lambda$3 = PdfLoaderFragment.onViewCreated$lambda$3(pdfLoaderFragment);
                        return onViewCreated$lambda$3;
                    default:
                        onViewCreated$lambda$4 = PdfLoaderFragment.onViewCreated$lambda$4(pdfLoaderFragment);
                        return onViewCreated$lambda$4;
                }
            }
        });
        final int i4 = 3;
        ((l161) getBinding()).c.setSecondaryButtonClickListener(new sls(this) { // from class: wqa0
            public final /* synthetic */ PdfLoaderFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 onViewCreated$lambda$0;
                zy11 onViewCreated$lambda$1;
                zy11 onViewCreated$lambda$2;
                zy11 onViewCreated$lambda$3;
                zy11 onViewCreated$lambda$4;
                int i22 = i4;
                PdfLoaderFragment pdfLoaderFragment = this.b;
                switch (i22) {
                    case 0:
                        onViewCreated$lambda$0 = PdfLoaderFragment.onViewCreated$lambda$0(pdfLoaderFragment);
                        return onViewCreated$lambda$0;
                    case 1:
                        onViewCreated$lambda$1 = PdfLoaderFragment.onViewCreated$lambda$1(pdfLoaderFragment);
                        return onViewCreated$lambda$1;
                    case 2:
                        onViewCreated$lambda$2 = PdfLoaderFragment.onViewCreated$lambda$2(pdfLoaderFragment);
                        return onViewCreated$lambda$2;
                    case 3:
                        onViewCreated$lambda$3 = PdfLoaderFragment.onViewCreated$lambda$3(pdfLoaderFragment);
                        return onViewCreated$lambda$3;
                    default:
                        onViewCreated$lambda$4 = PdfLoaderFragment.onViewCreated$lambda$4(pdfLoaderFragment);
                        return onViewCreated$lambda$4;
                }
            }
        });
        final int i5 = 4;
        ((l161) getBinding()).c.setPrimaryButtonOnClickListener(new sls(this) { // from class: wqa0
            public final /* synthetic */ PdfLoaderFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 onViewCreated$lambda$0;
                zy11 onViewCreated$lambda$1;
                zy11 onViewCreated$lambda$2;
                zy11 onViewCreated$lambda$3;
                zy11 onViewCreated$lambda$4;
                int i22 = i5;
                PdfLoaderFragment pdfLoaderFragment = this.b;
                switch (i22) {
                    case 0:
                        onViewCreated$lambda$0 = PdfLoaderFragment.onViewCreated$lambda$0(pdfLoaderFragment);
                        return onViewCreated$lambda$0;
                    case 1:
                        onViewCreated$lambda$1 = PdfLoaderFragment.onViewCreated$lambda$1(pdfLoaderFragment);
                        return onViewCreated$lambda$1;
                    case 2:
                        onViewCreated$lambda$2 = PdfLoaderFragment.onViewCreated$lambda$2(pdfLoaderFragment);
                        return onViewCreated$lambda$2;
                    case 3:
                        onViewCreated$lambda$3 = PdfLoaderFragment.onViewCreated$lambda$3(pdfLoaderFragment);
                        return onViewCreated$lambda$3;
                    default:
                        onViewCreated$lambda$4 = PdfLoaderFragment.onViewCreated$lambda$4(pdfLoaderFragment);
                        return onViewCreated$lambda$4;
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(era0 viewState) {
        File b;
        if (viewState instanceof bra0) {
            if (!this.pdfShown && (b = ((bra0) viewState).b()) != null) {
                ((l161) getBinding()).f.fromFile(b).show();
            }
        } else if (!viewState.equals(dra0.a)) {
            if (!(viewState instanceof cra0)) {
                w511.b();
                return;
            }
            ((l161) getBinding()).d.render(((cra0) viewState).a());
        }
        renderToolbar(viewState);
        setViewsVisibility(viewState);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public l161 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        return l161.o(inflater, container);
    }
}
