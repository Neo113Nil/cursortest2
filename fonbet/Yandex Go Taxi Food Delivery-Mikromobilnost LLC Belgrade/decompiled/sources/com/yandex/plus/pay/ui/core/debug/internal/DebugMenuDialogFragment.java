package com.yandex.plus.pay.ui.core.debug.internal;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.yandex.plus.pay.ui.core.debug.internal.DebugMenuDialogFragment;
import defpackage.alc;
import defpackage.cs31;
import defpackage.d2d0;
import defpackage.e2d0;
import defpackage.es31;
import defpackage.f1d;
import defpackage.g1d;
import defpackage.gmh0;
import defpackage.h0d;
import defpackage.ho91;
import defpackage.hs31;
import defpackage.hvg;
import defpackage.i3y;
import defpackage.ivg;
import defpackage.jlc;
import defpackage.jmm0;
import defpackage.jvg;
import defpackage.kgx;
import defpackage.kvg;
import defpackage.leh0;
import defpackage.lvg;
import defpackage.oy80;
import defpackage.q7u;
import defpackage.qir;
import defpackage.qoi0;
import defpackage.rs31;
import defpackage.sls;
import defpackage.vbi0;
import defpackage.w8f;
import defpackage.x9h0;
import defpackage.y8f;
import defpackage.ywv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.PropertyReference1Impl;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u00010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u0004R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010%\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001c\u001a\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00061"}, d2 = {"Lcom/yandex/plus/pay/ui/core/debug/internal/DebugMenuDialogFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Le2d0;", "<init>", "()V", "Landroid/view/View;", "bottomSheet", "Lzy11;", "setupFullHeight", "(Landroid/view/View;)V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onPause", "Lkvg;", "navigator$delegate", "Li3y;", "getNavigator", "()Lkvg;", "navigator", "Lh0d;", "component$delegate", "Lvbi0;", "getComponent", "()Lh0d;", "component", "Llvg;", "viewModel$delegate", "getViewModel", "()Llvg;", "viewModel", "Ld2d0;", "getDependencies", "()Ld2d0;", "dependencies", "Companion", "jvg", "pay-sdk-ui-core-debug-menu_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DebugMenuDialogFragment extends BottomSheetDialogFragment implements e2d0 {
    static final /* synthetic */ kgx[] $$delegatedProperties;
    public static final jvg Companion;
    public static final String TAG = "DebugMenuDialogFragment";

    /* renamed from: component$delegate, reason: from kotlin metadata */
    private final vbi0 component;

    /* renamed from: navigator$delegate, reason: from kotlin metadata */
    private final i3y navigator;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl("component", 0, "getComponent()Lcom/yandex/plus/pay/ui/core/debug/internal/common/di/Component;", DebugMenuDialogFragment.class);
        qoi0.a.getClass();
        $$delegatedProperties = new kgx[]{propertyReference1Impl};
        Companion = new jvg();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [hvg] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.yandex.plus.pay.ui.core.debug.internal.DebugMenuDialogFragment$special$$inlined$viewModels$default$1] */
    public DebugMenuDialogFragment() {
        final int i = 0;
        this.navigator = a.a(new sls(this) { // from class: hvg
            public final /* synthetic */ DebugMenuDialogFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                kvg navigator_delegate$lambda$0;
                g1d component_delegate$lambda$1;
                hs31 viewModel_delegate$lambda$2;
                int i2 = i;
                DebugMenuDialogFragment debugMenuDialogFragment = this.b;
                switch (i2) {
                    case 0:
                        navigator_delegate$lambda$0 = DebugMenuDialogFragment.navigator_delegate$lambda$0(debugMenuDialogFragment);
                        return navigator_delegate$lambda$0;
                    case 1:
                        component_delegate$lambda$1 = DebugMenuDialogFragment.component_delegate$lambda$1(debugMenuDialogFragment);
                        return component_delegate$lambda$1;
                    default:
                        viewModel_delegate$lambda$2 = DebugMenuDialogFragment.viewModel_delegate$lambda$2(debugMenuDialogFragment);
                        return viewModel_delegate$lambda$2;
                }
            }
        });
        final int i2 = 1;
        this.component = new oy80(this, (hvg) new sls(this) { // from class: hvg
            public final /* synthetic */ DebugMenuDialogFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                kvg navigator_delegate$lambda$0;
                g1d component_delegate$lambda$1;
                hs31 viewModel_delegate$lambda$2;
                int i22 = i2;
                DebugMenuDialogFragment debugMenuDialogFragment = this.b;
                switch (i22) {
                    case 0:
                        navigator_delegate$lambda$0 = DebugMenuDialogFragment.navigator_delegate$lambda$0(debugMenuDialogFragment);
                        return navigator_delegate$lambda$0;
                    case 1:
                        component_delegate$lambda$1 = DebugMenuDialogFragment.component_delegate$lambda$1(debugMenuDialogFragment);
                        return component_delegate$lambda$1;
                    default:
                        viewModel_delegate$lambda$2 = DebugMenuDialogFragment.viewModel_delegate$lambda$2(debugMenuDialogFragment);
                        return viewModel_delegate$lambda$2;
                }
            }
        });
        final int i3 = 2;
        sls slsVar = new sls(this) { // from class: hvg
            public final /* synthetic */ DebugMenuDialogFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                kvg navigator_delegate$lambda$0;
                g1d component_delegate$lambda$1;
                hs31 viewModel_delegate$lambda$2;
                int i22 = i3;
                DebugMenuDialogFragment debugMenuDialogFragment = this.b;
                switch (i22) {
                    case 0:
                        navigator_delegate$lambda$0 = DebugMenuDialogFragment.navigator_delegate$lambda$0(debugMenuDialogFragment);
                        return navigator_delegate$lambda$0;
                    case 1:
                        component_delegate$lambda$1 = DebugMenuDialogFragment.component_delegate$lambda$1(debugMenuDialogFragment);
                        return component_delegate$lambda$1;
                    default:
                        viewModel_delegate$lambda$2 = DebugMenuDialogFragment.viewModel_delegate$lambda$2(debugMenuDialogFragment);
                        return viewModel_delegate$lambda$2;
                }
            }
        };
        final ?? r1 = new sls(this) { // from class: com.yandex.plus.pay.ui.core.debug.internal.DebugMenuDialogFragment$special$$inlined$viewModels$default$1
            final /* synthetic */ Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return this.$this_viewModels;
            }
        };
        final i3y b = a.b(LazyThreadSafetyMode.NONE, new sls() { // from class: com.yandex.plus.pay.ui.core.debug.internal.DebugMenuDialogFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r1.invoke();
            }
        });
        this.viewModel = new es31(qoi0.a(lvg.class), new sls() { // from class: com.yandex.plus.pay.ui.core.debug.internal.DebugMenuDialogFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, slsVar, new sls() { // from class: com.yandex.plus.pay.ui.core.debug.internal.DebugMenuDialogFragment$special$$inlined$viewModels$default$4
            final /* synthetic */ sls $extrasProducer = null;

            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                y8f y8fVar;
                sls slsVar2 = this.$extrasProducer;
                if (slsVar2 != null && (y8fVar = (y8f) slsVar2.invoke()) != null) {
                    return y8fVar;
                }
                rs31 rs31Var = (rs31) i3y.this.getValue();
                q7u q7uVar = rs31Var instanceof q7u ? (q7u) rs31Var : null;
                y8f defaultViewModelCreationExtras = q7uVar != null ? q7uVar.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? w8f.b : defaultViewModelCreationExtras;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g1d component_delegate$lambda$1(DebugMenuDialogFragment debugMenuDialogFragment) {
        ArrayList b = ho91.b(debugMenuDialogFragment);
        Iterator it = b.iterator();
        while (it.hasNext()) {
            d2d0 dependencies = ((e2d0) it.next()).getDependencies();
            if (dependencies instanceof jmm0) {
                return new g1d((jmm0) dependencies);
            }
        }
        qir.o(jmm0.class, b);
        return null;
    }

    private final h0d getComponent() {
        return (h0d) this.component.getValue(this, $$delegatedProperties[0]);
    }

    private final kvg getNavigator() {
        return (kvg) this.navigator.getValue();
    }

    private final lvg getViewModel() {
        return (lvg) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kvg navigator_delegate$lambda$0(DebugMenuDialogFragment debugMenuDialogFragment) {
        return new kvg(debugMenuDialogFragment, x9h0.debug_fragment_container, debugMenuDialogFragment.getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateDialog$lambda$4(DebugMenuDialogFragment debugMenuDialogFragment, DialogInterface dialogInterface) {
        FrameLayout frameLayout = (FrameLayout) ((BottomSheetDialog) dialogInterface).findViewById(leh0.design_bottom_sheet);
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(0);
            BottomSheetBehavior D = BottomSheetBehavior.D(frameLayout);
            D.W(3);
            D.f0 = true;
            debugMenuDialogFragment.setupFullHeight(frameLayout);
        }
    }

    private final void setupFullHeight(View bottomSheet) {
        ViewGroup.LayoutParams layoutParams = bottomSheet.getLayoutParams();
        layoutParams.height = -1;
        bottomSheet.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs31 viewModel_delegate$lambda$2(DebugMenuDialogFragment debugMenuDialogFragment) {
        g1d g1dVar = (g1d) debugMenuDialogFragment.getComponent();
        g1dVar.getClass();
        cs31[] cs31VarArr = (cs31[]) Arrays.copyOf(new cs31[]{new cs31(lvg.class, new f1d(g1dVar, 1))}, 1);
        return new ywv((cs31[]) Arrays.copyOf(cs31VarArr, cs31VarArr.length));
    }

    @Override // defpackage.e2d0
    public d2d0 getDependencies() {
        return getComponent();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) super.onCreateDialog(savedInstanceState);
        bottomSheetDialog.setOnShowListener(new ivg(this, 0));
        return bottomSheetDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(gmh0.pay_sdk_fragment_debug_dialog, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        ((g1d) getComponent()).e.a.a.a = null;
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        jlc jlcVar = ((g1d) getComponent()).e.a.a;
        kvg navigator = getNavigator();
        jlcVar.a = navigator;
        ArrayList arrayList = jlcVar.b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            navigator.a((alc[]) it.next());
        }
        arrayList.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        lvg viewModel = getViewModel();
        if (viewModel.c) {
            return;
        }
        viewModel.c = true;
        viewModel.b.a();
    }
}
