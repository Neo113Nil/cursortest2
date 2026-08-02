package com.yandex.plus.pay.ui.core.debug.internal.ui.log;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.g;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.yandex.plus.home.common.utils.c;
import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.pay.ui.core.debug.internal.ui.log.LogsFragment;
import defpackage.alz;
import defpackage.b64;
import defpackage.bb1;
import defpackage.blz;
import defpackage.clz;
import defpackage.cs31;
import defpackage.d2d0;
import defpackage.e2d0;
import defpackage.es31;
import defpackage.f1d;
import defpackage.g1d;
import defpackage.glz;
import defpackage.gmh0;
import defpackage.ho91;
import defpackage.hs31;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.kgx;
import defpackage.krl0;
import defpackage.llz;
import defpackage.nl;
import defpackage.q7u;
import defpackage.qir;
import defpackage.qoi0;
import defpackage.rs31;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tkz;
import defpackage.ugb1;
import defpackage.vkz;
import defpackage.w8f;
import defpackage.x9h0;
import defpackage.xu5;
import defpackage.y8f;
import defpackage.ywv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010'R\u001b\u0010.\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001b\u0010\u0012\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u00101R\u001b\u0010\f\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010+\u001a\u0004\b3\u00104R\u001b\u0010\u000e\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010+\u001a\u0004\b6\u00107R\u001b\u0010<\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010+\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Lcom/yandex/plus/pay/ui/core/debug/internal/ui/log/LogsFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lglz;", "screenState", "Ltkz;", "logsAdapter", "Lzy11;", "setScreenState", "(Lglz;Ltkz;)V", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "scrollUpButton", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "setupScrollUpButton", "(Lcom/google/android/material/floatingactionbutton/FloatingActionButton;Landroidx/recyclerview/widget/RecyclerView;Ltkz;)V", "Landroid/widget/Spinner;", "filterSpinner", "setupFilter", "(Landroid/widget/Spinner;Lcom/google/android/material/floatingactionbutton/FloatingActionButton;)V", "adapter", "setupRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/google/android/material/floatingactionbutton/FloatingActionButton;Ltkz;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lvkz;", "dependencies$delegate", "Li3y;", "getDependencies", "()Lvkz;", "dependencies", "Lllz;", "viewModel$delegate", "getViewModel", "()Lllz;", "viewModel", "Landroid/widget/ImageButton;", "backButton$delegate", "Lxu5;", "getBackButton", "()Landroid/widget/ImageButton;", "backButton", "filterSpinner$delegate", "getFilterSpinner", "()Landroid/widget/Spinner;", "scrollUpButton$delegate", "getScrollUpButton", "()Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "recyclerView$delegate", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "Landroid/widget/Button;", "exportButton$delegate", "getExportButton", "()Landroid/widget/Button;", "exportButton", "pay-sdk-ui-core-debug-menu_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LogsFragment extends Fragment {
    static final /* synthetic */ kgx[] $$delegatedProperties = {new PropertyReference1Impl("backButton", 0, "getBackButton()Landroid/widget/ImageButton;", LogsFragment.class), b64.x(qoi0.a, LogsFragment.class, "filterSpinner", "getFilterSpinner()Landroid/widget/Spinner;", 0), new PropertyReference1Impl("scrollUpButton", 0, "getScrollUpButton()Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", LogsFragment.class), new PropertyReference1Impl("recyclerView", 0, "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", LogsFragment.class), new PropertyReference1Impl("exportButton", 0, "getExportButton()Landroid/widget/Button;", LogsFragment.class)};

    /* renamed from: backButton$delegate, reason: from kotlin metadata */
    private final xu5 backButton;

    /* renamed from: dependencies$delegate, reason: from kotlin metadata */
    private final i3y dependencies;

    /* renamed from: exportButton$delegate, reason: from kotlin metadata */
    private final xu5 exportButton;

    /* renamed from: filterSpinner$delegate, reason: from kotlin metadata */
    private final xu5 filterSpinner;

    /* renamed from: recyclerView$delegate, reason: from kotlin metadata */
    private final xu5 recyclerView;

    /* renamed from: scrollUpButton$delegate, reason: from kotlin metadata */
    private final xu5 scrollUpButton;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel;

    /* JADX WARN: Type inference failed for: r3v0, types: [com.yandex.plus.pay.ui.core.debug.internal.ui.log.LogsFragment$special$$inlined$viewModels$default$1] */
    public LogsFragment() {
        super(gmh0.pay_sdk_fragment_debug_logs);
        final int i = 0;
        this.dependencies = kotlin.a.a(new sls(this) { // from class: ykz
            public final /* synthetic */ LogsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                vkz dependencies_delegate$lambda$0;
                hs31 viewModel_delegate$lambda$1;
                int i2 = i;
                LogsFragment logsFragment = this.b;
                switch (i2) {
                    case 0:
                        dependencies_delegate$lambda$0 = LogsFragment.dependencies_delegate$lambda$0(logsFragment);
                        return dependencies_delegate$lambda$0;
                    default:
                        viewModel_delegate$lambda$1 = LogsFragment.viewModel_delegate$lambda$1(logsFragment);
                        return viewModel_delegate$lambda$1;
                }
            }
        });
        final int i2 = 1;
        sls slsVar = new sls(this) { // from class: ykz
            public final /* synthetic */ LogsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                vkz dependencies_delegate$lambda$0;
                hs31 viewModel_delegate$lambda$1;
                int i22 = i2;
                LogsFragment logsFragment = this.b;
                switch (i22) {
                    case 0:
                        dependencies_delegate$lambda$0 = LogsFragment.dependencies_delegate$lambda$0(logsFragment);
                        return dependencies_delegate$lambda$0;
                    default:
                        viewModel_delegate$lambda$1 = LogsFragment.viewModel_delegate$lambda$1(logsFragment);
                        return viewModel_delegate$lambda$1;
                }
            }
        };
        final ?? r3 = new sls(this) { // from class: com.yandex.plus.pay.ui.core.debug.internal.ui.log.LogsFragment$special$$inlined$viewModels$default$1
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
        final i3y b = kotlin.a.b(LazyThreadSafetyMode.NONE, new sls() { // from class: com.yandex.plus.pay.ui.core.debug.internal.ui.log.LogsFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r3.invoke();
            }
        });
        this.viewModel = new es31(qoi0.a(llz.class), new sls() { // from class: com.yandex.plus.pay.ui.core.debug.internal.ui.log.LogsFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, slsVar, new sls() { // from class: com.yandex.plus.pay.ui.core.debug.internal.ui.log.LogsFragment$special$$inlined$viewModels$default$4
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
        this.backButton = new xu5(new clz(this, i), new blz(this, x9h0.logs_back_button, i2));
        int i3 = 2;
        this.filterSpinner = new xu5(new clz(this, i2), new blz(this, x9h0.logs_filter_spinner, i3));
        int i4 = x9h0.logs_scroll_up_button;
        clz clzVar = new clz(this, i3);
        int i5 = 3;
        this.scrollUpButton = new xu5(clzVar, new blz(this, i4, i5));
        int i6 = x9h0.logs_recycler;
        clz clzVar2 = new clz(this, i5);
        int i7 = 4;
        this.recyclerView = new xu5(clzVar2, new blz(this, i6, i7));
        this.exportButton = new xu5(new clz(this, i7), new blz(this, x9h0.logs_export_button, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vkz dependencies_delegate$lambda$0(LogsFragment logsFragment) {
        ArrayList b = ho91.b(logsFragment);
        Iterator it = b.iterator();
        while (it.hasNext()) {
            d2d0 dependencies = ((e2d0) it.next()).getDependencies();
            if (dependencies instanceof vkz) {
                return (vkz) dependencies;
            }
        }
        qir.o(vkz.class, b);
        return null;
    }

    private final ImageButton getBackButton() {
        return (ImageButton) this.backButton.a($$delegatedProperties[0]);
    }

    private final vkz getDependencies() {
        return (vkz) this.dependencies.getValue();
    }

    private final Button getExportButton() {
        return (Button) this.exportButton.a($$delegatedProperties[4]);
    }

    private final Spinner getFilterSpinner() {
        return (Spinner) this.filterSpinner.a($$delegatedProperties[1]);
    }

    private final RecyclerView getRecyclerView() {
        return (RecyclerView) this.recyclerView.a($$delegatedProperties[3]);
    }

    private final FloatingActionButton getScrollUpButton() {
        return (FloatingActionButton) this.scrollUpButton.a($$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final llz getViewModel() {
        return (llz) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(LogsFragment logsFragment, View view) {
        logsFragment.getViewModel().w.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$3(LogsFragment logsFragment, View view) {
        llz viewModel = logsFragment.getViewModel();
        krl0 krl0Var = viewModel.c;
        List list = viewModel.b;
        Context context = (Context) krl0Var.a;
        try {
            krl0.m(context, krl0Var.d(context.getCacheDir(), list));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setScreenState(glz screenState, tkz logsAdapter) {
        logsAdapter.submitList(screenState.b);
        getFilterSpinner().setSelection(LogPriority.a().indexOf(screenState.a));
    }

    private final void setupFilter(Spinner filterSpinner, final FloatingActionButton scrollUpButton) {
        Context context = filterSpinner.getContext();
        k4o a = LogPriority.a();
        ArrayList arrayList = new ArrayList(tcc.n(a, 10));
        Iterator<E> it = a.iterator();
        while (it.hasNext()) {
            arrayList.add(ugb1.c((LogPriority) it.next(), filterSpinner.getContext()));
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        filterSpinner.setAdapter((SpinnerAdapter) arrayAdapter);
        filterSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.yandex.plus.pay.ui.core.debug.internal.ui.log.LogsFragment$setupFilter$1
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                llz viewModel;
                LogPriority valueOf = LogPriority.valueOf(parent.getItemAtPosition(position).toString());
                viewModel = LogsFragment.this.getViewModel();
                r0 r0Var = viewModel.x;
                r0Var.getClass();
                r0Var.m(null, valueOf);
                scrollUpButton.hide();
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    private final void setupRecyclerView(RecyclerView recyclerView, FloatingActionButton scrollUpButton, tkz adapter) {
        recyclerView.setAdapter(adapter);
        recyclerView.addOnScrollListener(new alz(scrollUpButton));
    }

    private final void setupScrollUpButton(FloatingActionButton scrollUpButton, RecyclerView recyclerView, tkz logsAdapter) {
        bb1.L(scrollUpButton, new nl(9, recyclerView, logsAdapter, scrollUpButton));
        scrollUpButton.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupScrollUpButton$lambda$4(RecyclerView recyclerView, tkz tkzVar, FloatingActionButton floatingActionButton, View view) {
        recyclerView.scrollToPosition(tkzVar.getItemCount() - 1);
        floatingActionButton.hide();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs31 viewModel_delegate$lambda$1(LogsFragment logsFragment) {
        g1d g1dVar = (g1d) logsFragment.getDependencies();
        g1dVar.getClass();
        cs31[] cs31VarArr = (cs31[]) Arrays.copyOf(new cs31[]{new cs31(llz.class, new f1d(g1dVar, 2))}, 1);
        return new ywv((cs31[]) Arrays.copyOf(cs31VarArr, cs31VarArr.length));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tkz tkzVar = new tkz();
        setupScrollUpButton(getScrollUpButton(), getRecyclerView(), tkzVar);
        setupFilter(getFilterSpinner(), getScrollUpButton());
        setupRecyclerView(getRecyclerView(), getScrollUpButton(), tkzVar);
        final int i = 0;
        bb1.L(getBackButton(), new View.OnClickListener(this) { // from class: zkz
            public final /* synthetic */ LogsFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = i;
                LogsFragment logsFragment = this.b;
                switch (i2) {
                    case 0:
                        LogsFragment.onViewCreated$lambda$2(logsFragment, view2);
                        break;
                    default:
                        LogsFragment.onViewCreated$lambda$3(logsFragment, view2);
                        break;
                }
            }
        });
        final int i2 = 1;
        bb1.L(getExportButton(), new View.OnClickListener(this) { // from class: zkz
            public final /* synthetic */ LogsFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i2;
                LogsFragment logsFragment = this.b;
                switch (i22) {
                    case 0:
                        LogsFragment.onViewCreated$lambda$2(logsFragment, view2);
                        break;
                    default:
                        LogsFragment.onViewCreated$lambda$3(logsFragment, view2);
                        break;
                }
            }
        });
        c.b(g.a(getViewModel().y, getViewLifecycleOwner().getLifecycle(), Lifecycle.State.STARTED), com.yandex.plus.home.common.utils.a.c(this), new LogsFragment$onViewCreated$3(this, tkzVar, null));
    }
}
