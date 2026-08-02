package com.ybsdk.feature.main.internal.screens.sbpPartners;

import android.text.Editable;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.core.transfer.utils.SimpleTextWatcher;
import com.ybsdk.feature.main.internal.screens.sbpPartners.SbpPartnersFragment;
import com.ybsdk.feature.main.internal.widgets.SbpYbsCustomErrorView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.g;
import com.ybsdk.widgets.common.snackbar.Snackbar;
import defpackage.ajl0;
import defpackage.d861;
import defpackage.dim0;
import defpackage.eim0;
import defpackage.f73;
import defpackage.fim0;
import defpackage.g8m0;
import defpackage.gim0;
import defpackage.him0;
import defpackage.i1m0;
import defpackage.i3y;
import defpackage.if6;
import defpackage.iim0;
import defpackage.jim0;
import defpackage.kim0;
import defpackage.lb7;
import defpackage.lbb0;
import defpackage.lfx;
import defpackage.lim0;
import defpackage.mim0;
import defpackage.n0t0;
import defpackage.nim0;
import defpackage.o8k0;
import defpackage.phm0;
import defpackage.qa3;
import defpackage.qas0;
import defpackage.qtz0;
import defpackage.stz0;
import defpackage.thm0;
import defpackage.uem0;
import defpackage.uhm0;
import defpackage.v4m0;
import defpackage.vf51;
import defpackage.w511;
import defpackage.whm0;
import defpackage.wya1;
import defpackage.xya1;
import defpackage.y5e;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.yvf0;
import defpackage.zy11;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.video.m3.BuildConfig;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 :2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001;B\u0017\b\u0007\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001f\u0010\u0016J\u000f\u0010 \u001a\u00020\u0011H\u0002¢\u0006\u0004\b \u0010\u0013J!\u0010$\u001a\u00020#2\b\u0010!\u001a\u0004\u0018\u00010\u00032\u0006\u0010\"\u001a\u00020\u0003H\u0002¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010&R\"\u0010*\u001a\u0010\u0012\f\u0012\n )*\u0004\u0018\u00010(0(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001b\u00101\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006<"}, d2 = {"Lcom/ybsdk/feature/main/internal/screens/sbpPartners/SbpPartnersFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Ld861;", "Lnim0;", "Lcom/ybsdk/feature/main/internal/screens/sbpPartners/a;", "Lyvf0;", "viewModelProvider", "<init>", "(Lyvf0;)V", "createViewModel", "()Lcom/ybsdk/feature/main/internal/screens/sbpPartners/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ld861;", "Lzy11;", "onDestroyView", "()V", "viewState", "render", "(Lnim0;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "Ln0t0;", "content", "showSnackbar", "(Ln0t0;)V", "renderAccordingToViewState", "setEditTextFocusable", "prev", "curr", "", "isAnimateItemsChange", "(Lnim0;Lnim0;)Z", "Lyvf0;", "Lqa3;", "", "kotlin.jvm.PlatformType", "adapter", "Lqa3;", "Landroidx/recyclerview/widget/h;", "itemAnimator$delegate", "Li3y;", "getItemAnimator", "()Landroidx/recyclerview/widget/h;", "itemAnimator", "prevViewState", "Lnim0;", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView;", "bottomSheetDialogView", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView;", "Lcom/ybsdk/core/transfer/utils/SimpleTextWatcher;", "inputWatcher", "Lcom/ybsdk/core/transfer/utils/SimpleTextWatcher;", "Companion", "whm0", "feature-main-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SbpPartnersFragment extends BaseMvvmFragment<d861, nim0, a> {
    public static final whm0 Companion = new whm0();
    private static final int MAX_LENGTH = 100;
    private static final int ZERO_POSITION = 0;
    private final qa3 adapter;
    private BottomSheetDialogView bottomSheetDialogView;
    private final SimpleTextWatcher inputWatcher;

    /* renamed from: itemAnimator$delegate, reason: from kotlin metadata */
    private final i3y itemAnimator;
    private nim0 prevViewState;
    private final yvf0 viewModelProvider;

    public SbpPartnersFragment(yvf0 yvf0Var) {
        super(null, null, null, null, a.class, 15, null);
        this.viewModelProvider = yvf0Var;
        uem0 uem0Var = uem0.a;
        synchronized (y5e.a) {
            try {
                if (y5e.b == null) {
                    y5e.b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.adapter = new qa3(new lb7(9, y5e.b, uem0Var), wya1.c(new lbb0(18, this)), xya1.f());
        this.itemAnimator = kotlin.a.a(new v4m0(5));
        this.inputWatcher = new SimpleTextWatcher(new uhm0(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 adapter$lambda$0(SbpPartnersFragment sbpPartnersFragment, phm0 phm0Var, int i) {
        sbpPartnersFragment.getViewModel().g0(phm0Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BottomSheetDialogView.State consumeSideEffect$lambda$21(iim0 iim0Var, BottomSheetDialogView.State state) {
        YbButtonViewGroup.b b = state.b();
        return BottomSheetDialogView.State.a(state, null, b != null ? YbButtonViewGroup.b.a(b, ((eim0) iim0Var).a(), null, 13) : null, 65533);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void consumeSideEffect$lambda$25$lambda$23(iim0 iim0Var, BottomSheetDialogView bottomSheetDialogView, SbpPartnersFragment sbpPartnersFragment, View view) {
        fim0 fim0Var = (fim0) iim0Var;
        ((o8k0) fim0Var.b()).invoke();
        if (fim0Var.c() == null) {
            bottomSheetDialogView.dismiss();
        } else {
            sbpPartnersFragment.getViewModel().i0(fim0Var.c());
            bottomSheetDialogView.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 consumeSideEffect$lambda$25$lambda$24(SbpPartnersFragment sbpPartnersFragment, boolean z) {
        sbpPartnersFragment.bottomSheetDialogView = null;
        sbpPartnersFragment.setEditTextFocusable();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void consumeSideEffect$lambda$35$lambda$32(iim0 iim0Var, BottomSheetDialogView bottomSheetDialogView, SbpPartnersFragment sbpPartnersFragment, View view) {
        gim0 gim0Var = (gim0) iim0Var;
        gim0Var.c().invoke();
        vf51 d = gim0Var.d();
        String str = null;
        if (d == null) {
            a viewModel = sbpPartnersFragment.getViewModel();
            String b = gim0Var.b();
            YbButtonViewGroup.b b2 = gim0Var.a().b();
            viewModel.j0(b, b2 != null ? b2.c() : null);
        } else if (d.a() != null) {
            str = d.a().a();
            if (str != null) {
                sbpPartnersFragment.getViewModel().i0(str);
                bottomSheetDialogView.dismiss();
            } else {
                bottomSheetDialogView.dismiss();
            }
        }
        if (str == null && gim0Var.b() == null) {
            return;
        }
        bottomSheetDialogView.render(new i1m0(23));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BottomSheetDialogView.State consumeSideEffect$lambda$35$lambda$32$lambda$31(BottomSheetDialogView.State state) {
        YbButtonViewGroup.b bVar;
        YbButtonView.a c;
        YbButtonViewGroup.b b = state.b();
        if (b != null) {
            YbButtonViewGroup.b b2 = state.b();
            bVar = YbButtonViewGroup.b.a(b, (b2 == null || (c = b2.c()) == null) ? null : YbButtonView.a.a(c, null, null, false, true, BuildConfig.VERSION_CODE), null, 13);
        } else {
            bVar = null;
        }
        return BottomSheetDialogView.State.a(state, null, bVar, 65533);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 consumeSideEffect$lambda$35$lambda$33(SbpPartnersFragment sbpPartnersFragment, boolean z) {
        sbpPartnersFragment.bottomSheetDialogView = null;
        sbpPartnersFragment.getViewModel().b0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 consumeSideEffect$lambda$35$lambda$34(SbpPartnersFragment sbpPartnersFragment, String str) {
        sbpPartnersFragment.getViewModel().f0(str);
        return zy11.a;
    }

    private final h getItemAnimator() {
        return (h) this.itemAnimator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$7$lambda$3(SbpPartnersFragment sbpPartnersFragment) {
        sbpPartnersFragment.getViewModel().d0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$7$lambda$6$lambda$4(SbpPartnersFragment sbpPartnersFragment) {
        sbpPartnersFragment.getViewModel().h0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$7$lambda$6$lambda$5(SbpPartnersFragment sbpPartnersFragment) {
        sbpPartnersFragment.getViewModel().c0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 inputWatcher$lambda$2(SbpPartnersFragment sbpPartnersFragment, Editable editable) {
        sbpPartnersFragment.getViewModel().e0(String.valueOf(editable));
        return zy11.a;
    }

    private final boolean isAnimateItemsChange(nim0 prev, nim0 curr) {
        if (prev == null) {
            return true;
        }
        return true ^ prev.getClass().equals(curr.getClass());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h itemAnimator_delegate$lambda$1() {
        return new h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final stz0 render$lambda$10$lambda$9(stz0 stz0Var) {
        return stz0.a(stz0Var, null, null, null, null, null, qtz0.a, false, false, null, null, 0, 32735);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderAccordingToViewState(nim0 viewState) {
        if (viewState instanceof mim0) {
            mim0 mim0Var = (mim0) viewState;
            this.inputWatcher.ignoreEvents(new o8k0(23, this, mim0Var));
            ((d861) getBinding()).d.getEditText().requestFocus();
            this.adapter.h(mim0Var.b(), new ajl0(10, mim0Var, this));
            return;
        }
        if (viewState instanceof kim0) {
            ((d861) getBinding()).c.render(((kim0) viewState).a());
            return;
        }
        int i = 24;
        if (!(viewState instanceof jim0)) {
            if (!(viewState instanceof lim0)) {
                w511.b();
                return;
            } else {
                this.adapter.g(((lim0) viewState).a());
                LoadableInput.render$default(((d861) getBinding()).d, false, new i1m0(i), 1, null);
                return;
            }
        }
        this.adapter.g(EmptyList.a);
        jim0 jim0Var = (jim0) viewState;
        this.inputWatcher.ignoreEvents(new o8k0(i, this, jim0Var));
        SbpYbsCustomErrorView sbpYbsCustomErrorView = ((d861) getBinding()).b;
        sbpYbsCustomErrorView.renderPrimaryButton(false);
        sbpYbsCustomErrorView.setText(jim0Var.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 renderAccordingToViewState$lambda$15$lambda$12(SbpPartnersFragment sbpPartnersFragment, mim0 mim0Var) {
        LoadableInput.render$default(((d861) sbpPartnersFragment.getBinding()).d, false, new g8m0(14, mim0Var), 1, null);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g renderAccordingToViewState$lambda$15$lambda$12$lambda$11(mim0 mim0Var, g gVar) {
        return g.a(gVar, mim0Var.a(), null, true, null, null, null, null, false, null, null, null, false, null, null, false, 0, false, 0, 0, null, null, null, 33554426);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderAccordingToViewState$lambda$15$lambda$14(nim0 nim0Var, SbpPartnersFragment sbpPartnersFragment) {
        if (((mim0) nim0Var).c()) {
            sbpPartnersFragment.getViewModel().k0();
            sbpPartnersFragment.safePost(new thm0(sbpPartnersFragment, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 renderAccordingToViewState$lambda$15$lambda$14$lambda$13(SbpPartnersFragment sbpPartnersFragment) {
        RecyclerView.e layoutManager = ((d861) sbpPartnersFragment.getBinding()).e.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.l1(0);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 renderAccordingToViewState$lambda$19$lambda$17(SbpPartnersFragment sbpPartnersFragment, jim0 jim0Var) {
        LoadableInput.render$default(((d861) sbpPartnersFragment.getBinding()).d, false, new g8m0(13, jim0Var), 1, null);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g renderAccordingToViewState$lambda$19$lambda$17$lambda$16(jim0 jim0Var, g gVar) {
        return g.a(gVar, jim0Var.a(), null, true, null, null, null, null, false, null, null, null, false, null, null, false, 0, false, 0, 0, null, null, null, 33554426);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g renderAccordingToViewState$lambda$20(g gVar) {
        return g.a(gVar, null, null, false, null, null, null, null, false, null, null, null, false, null, null, false, 0, false, 0, 0, null, null, null, 33554427);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setEditTextFocusable() {
        ((d861) getBinding()).d.getEditText().setFocusableInTouchMode(true);
        ((d861) getBinding()).d.getEditText().requestFocus();
    }

    private final void showSnackbar(n0t0 content) {
        com.ybsdk.widgets.common.snackbar.a.a(Snackbar.Companion, requireActivity(), content, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        final iim0 iim0Var = sideEffect instanceof iim0 ? (iim0) sideEffect : null;
        if (iim0Var == null) {
            return;
        }
        if (iim0Var instanceof him0) {
            showSnackbar(((him0) iim0Var).a());
            return;
        }
        if (iim0Var instanceof dim0) {
            BottomSheetDialogView bottomSheetDialogView = this.bottomSheetDialogView;
            if (bottomSheetDialogView != null) {
                bottomSheetDialogView.dismiss();
            }
            this.bottomSheetDialogView = null;
            return;
        }
        if (iim0Var instanceof eim0) {
            BottomSheetDialogView bottomSheetDialogView2 = this.bottomSheetDialogView;
            if (bottomSheetDialogView2 != null) {
                bottomSheetDialogView2.render(new g8m0(12, iim0Var));
                return;
            }
            return;
        }
        final int i = 1;
        int i2 = 3;
        int i3 = 2;
        if (iim0Var instanceof fim0) {
            final int i4 = 0;
            ((d861) getBinding()).d.getEditText().setFocusableInTouchMode(false);
            final BottomSheetDialogView bottomSheetDialogView3 = new BottomSheetDialogView(requireContext(), null, 0, 6, null);
            bottomSheetDialogView3.setOnBackgroundClickListener(new if6(bottomSheetDialogView3, i2));
            bottomSheetDialogView3.onPrimaryAction(new View.OnClickListener() { // from class: vhm0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i5 = i4;
                    SbpPartnersFragment sbpPartnersFragment = this;
                    BottomSheetDialogView bottomSheetDialogView4 = bottomSheetDialogView3;
                    iim0 iim0Var2 = iim0Var;
                    switch (i5) {
                        case 0:
                            SbpPartnersFragment.consumeSideEffect$lambda$25$lambda$23(iim0Var2, bottomSheetDialogView4, sbpPartnersFragment, view);
                            break;
                        default:
                            SbpPartnersFragment.consumeSideEffect$lambda$35$lambda$32(iim0Var2, bottomSheetDialogView4, sbpPartnersFragment, view);
                            break;
                    }
                }
            });
            bottomSheetDialogView3.onDismiss(new uhm0(this, i));
            bottomSheetDialogView3.render(((fim0) iim0Var).a());
            BottomSheetDialogView.show$default(bottomSheetDialogView3, requireActivity(), null, 2, null);
            this.bottomSheetDialogView = bottomSheetDialogView3;
            return;
        }
        if (!(iim0Var instanceof gim0)) {
            w511.b();
            return;
        }
        final BottomSheetDialogView bottomSheetDialogView4 = new BottomSheetDialogView(requireContext(), null, 0, 6, null);
        bottomSheetDialogView4.setOnBackgroundClickListener(new if6(bottomSheetDialogView4, 4));
        bottomSheetDialogView4.onPrimaryAction(new View.OnClickListener() { // from class: vhm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i5 = i;
                SbpPartnersFragment sbpPartnersFragment = this;
                BottomSheetDialogView bottomSheetDialogView42 = bottomSheetDialogView4;
                iim0 iim0Var2 = iim0Var;
                switch (i5) {
                    case 0:
                        SbpPartnersFragment.consumeSideEffect$lambda$25$lambda$23(iim0Var2, bottomSheetDialogView42, sbpPartnersFragment, view);
                        break;
                    default:
                        SbpPartnersFragment.consumeSideEffect$lambda$35$lambda$32(iim0Var2, bottomSheetDialogView42, sbpPartnersFragment, view);
                        break;
                }
            }
        });
        bottomSheetDialogView4.onDismiss(new uhm0(this, i3));
        bottomSheetDialogView4.render(((gim0) iim0Var).a());
        bottomSheetDialogView4.onHyperLinkAction(new uhm0(this, i2));
        BottomSheetDialogView.show$default(bottomSheetDialogView4, requireActivity(), null, 2, null);
        this.bottomSheetDialogView = bottomSheetDialogView4;
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return (a) this.viewModelProvider.get();
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public d861 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        d861 o = d861.o(inflater, container);
        o.e.setAdapter(this.adapter);
        this.adapter.g(EmptyList.a);
        LoadableInput loadableInput = o.d;
        loadableInput.getEditText().setFilters(loadableInput.getEditText().getFilters() == null ? new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(100)} : (InputFilter[]) f73.s(loadableInput.getEditText().getFilters(), new InputFilter.LengthFilter(100)));
        loadableInput.getEditText().addTextChangedListener(this.inputWatcher);
        o.f.setOnCloseButtonClickListener(new thm0(this, 3));
        ErrorView errorView = o.c;
        errorView.setChangeVisibilityWithDelay(false);
        errorView.setPrimaryButtonOnClickListener(new thm0(this, 0));
        errorView.setSecondaryButtonClickListener(new thm0(this, 1));
        return o;
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.bottomSheetDialogView = null;
        getViewModel().b0();
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(nim0 viewState) {
        d861 d861Var = (d861) getBinding();
        RecyclerView recyclerView = d861Var.e;
        h itemAnimator = getItemAnimator();
        if (!isAnimateItemsChange(this.prevViewState, viewState)) {
            itemAnimator = null;
        }
        recyclerView.setItemAnimator(itemAnimator);
        d861Var.c.render(null);
        d861Var.f.render(new i1m0(25));
        renderAccordingToViewState(viewState);
        d861Var.b.setVisibility(viewState instanceof jim0 ? 0 : 8);
        this.prevViewState = viewState;
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
