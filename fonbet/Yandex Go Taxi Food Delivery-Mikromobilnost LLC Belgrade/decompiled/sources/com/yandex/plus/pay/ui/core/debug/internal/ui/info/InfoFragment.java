package com.yandex.plus.pay.ui.core.debug.internal.ui.info;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.g;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.plus.home.common.utils.c;
import com.yandex.plus.pay.ui.core.debug.internal.ui.info.InfoFragment;
import defpackage.a9f;
import defpackage.alc;
import defpackage.atv;
import defpackage.b64;
import defpackage.bb1;
import defpackage.cs31;
import defpackage.d2d0;
import defpackage.dkt0;
import defpackage.dtv;
import defpackage.e2d0;
import defpackage.es31;
import defpackage.etv;
import defpackage.evg;
import defpackage.f1d;
import defpackage.g1d;
import defpackage.gmh0;
import defpackage.ho91;
import defpackage.hs31;
import defpackage.i3y;
import defpackage.jlc;
import defpackage.kgx;
import defpackage.l7a;
import defpackage.ovg0;
import defpackage.q7u;
import defpackage.qir;
import defpackage.qoi0;
import defpackage.qtv;
import defpackage.rs31;
import defpackage.scc;
import defpackage.sls;
import defpackage.stv;
import defpackage.tis0;
import defpackage.ufl0;
import defpackage.vm7;
import defpackage.vng;
import defpackage.w8f;
import defpackage.x9h0;
import defpackage.xsv;
import defpackage.xu5;
import defpackage.y0j0;
import defpackage.y8f;
import defpackage.ywv;
import defpackage.yyh0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.a;
import kotlin.jvm.internal.PropertyReference1Impl;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010%R\u001b\u0010)\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001e\u001a\u0004\b(\u0010%¨\u0006*"}, d2 = {"Lcom/yandex/plus/pay/ui/core/debug/internal/ui/info/InfoFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lqtv;", ClidProvider.STATE, "Lxsv;", "infoAdapter", "Lzy11;", "setScreenState", "(Lqtv;Lxsv;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Latv;", "dependencies$delegate", "Li3y;", "getDependencies", "()Latv;", "dependencies", "Lstv;", "viewModel$delegate", "getViewModel", "()Lstv;", "viewModel", "Landroidx/recyclerview/widget/RecyclerView;", "debugInfoRecycler$delegate", "Lxu5;", "getDebugInfoRecycler", "()Landroidx/recyclerview/widget/RecyclerView;", "debugInfoRecycler", "Landroid/widget/Button;", "reportButton$delegate", "getReportButton", "()Landroid/widget/Button;", "reportButton", "logsButton$delegate", "getLogsButton", "logsButton", "pay-sdk-ui-core-debug-menu_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InfoFragment extends Fragment {
    static final /* synthetic */ kgx[] $$delegatedProperties = {new PropertyReference1Impl("debugInfoRecycler", 0, "getDebugInfoRecycler()Landroidx/recyclerview/widget/RecyclerView;", InfoFragment.class), b64.x(qoi0.a, InfoFragment.class, "reportButton", "getReportButton()Landroid/widget/Button;", 0), new PropertyReference1Impl("logsButton", 0, "getLogsButton()Landroid/widget/Button;", InfoFragment.class)};

    /* renamed from: debugInfoRecycler$delegate, reason: from kotlin metadata */
    private final xu5 debugInfoRecycler;

    /* renamed from: dependencies$delegate, reason: from kotlin metadata */
    private final i3y dependencies;

    /* renamed from: logsButton$delegate, reason: from kotlin metadata */
    private final xu5 logsButton;

    /* renamed from: reportButton$delegate, reason: from kotlin metadata */
    private final xu5 reportButton;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel;

    /* JADX WARN: Type inference failed for: r3v0, types: [com.yandex.plus.pay.ui.core.debug.internal.ui.info.InfoFragment$special$$inlined$viewModels$default$1] */
    public InfoFragment() {
        super(gmh0.pay_sdk_fragment_debug_info);
        final int i = 0;
        this.dependencies = a.a(new sls(this) { // from class: btv
            public final /* synthetic */ InfoFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                atv dependencies_delegate$lambda$0;
                hs31 viewModel_delegate$lambda$1;
                int i2 = i;
                InfoFragment infoFragment = this.b;
                switch (i2) {
                    case 0:
                        dependencies_delegate$lambda$0 = InfoFragment.dependencies_delegate$lambda$0(infoFragment);
                        return dependencies_delegate$lambda$0;
                    default:
                        viewModel_delegate$lambda$1 = InfoFragment.viewModel_delegate$lambda$1(infoFragment);
                        return viewModel_delegate$lambda$1;
                }
            }
        });
        final int i2 = 1;
        sls slsVar = new sls(this) { // from class: btv
            public final /* synthetic */ InfoFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                atv dependencies_delegate$lambda$0;
                hs31 viewModel_delegate$lambda$1;
                int i22 = i2;
                InfoFragment infoFragment = this.b;
                switch (i22) {
                    case 0:
                        dependencies_delegate$lambda$0 = InfoFragment.dependencies_delegate$lambda$0(infoFragment);
                        return dependencies_delegate$lambda$0;
                    default:
                        viewModel_delegate$lambda$1 = InfoFragment.viewModel_delegate$lambda$1(infoFragment);
                        return viewModel_delegate$lambda$1;
                }
            }
        };
        final ?? r3 = new sls(this) { // from class: com.yandex.plus.pay.ui.core.debug.internal.ui.info.InfoFragment$special$$inlined$viewModels$default$1
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
        final i3y b = a.b(LazyThreadSafetyMode.NONE, new sls() { // from class: com.yandex.plus.pay.ui.core.debug.internal.ui.info.InfoFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r3.invoke();
            }
        });
        this.viewModel = new es31(qoi0.a(stv.class), new sls() { // from class: com.yandex.plus.pay.ui.core.debug.internal.ui.info.InfoFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, slsVar, new sls() { // from class: com.yandex.plus.pay.ui.core.debug.internal.ui.info.InfoFragment$special$$inlined$viewModels$default$4
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
        this.debugInfoRecycler = new xu5(new dtv(this, 0), new etv(this, x9h0.debug_info_recycler, i));
        this.reportButton = new xu5(new dtv(this, 1), new etv(this, x9h0.report_button, i2));
        this.logsButton = new xu5(new dtv(this, 2), new etv(this, x9h0.logs_button, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final atv dependencies_delegate$lambda$0(InfoFragment infoFragment) {
        ArrayList b = ho91.b(infoFragment);
        Iterator it = b.iterator();
        while (it.hasNext()) {
            d2d0 dependencies = ((e2d0) it.next()).getDependencies();
            if (dependencies instanceof atv) {
                return (atv) dependencies;
            }
        }
        qir.o(atv.class, b);
        return null;
    }

    private final RecyclerView getDebugInfoRecycler() {
        return (RecyclerView) this.debugInfoRecycler.a($$delegatedProperties[0]);
    }

    private final atv getDependencies() {
        return (atv) this.dependencies.getValue();
    }

    private final Button getLogsButton() {
        return (Button) this.logsButton.a($$delegatedProperties[2]);
    }

    private final Button getReportButton() {
        return (Button) this.reportButton.a($$delegatedProperties[1]);
    }

    private final stv getViewModel() {
        return (stv) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(InfoFragment infoFragment, View view) {
        ufl0 ufl0Var = infoFragment.getViewModel().b.a;
        alc[] alcVarArr = {new y0j0(new tis0((String) null, (a9f) new vm7(22), true))};
        jlc jlcVar = ufl0Var.a;
        jlcVar.c.post(new l7a(15, jlcVar, alcVarArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$3(InfoFragment infoFragment, View view) {
        ufl0 ufl0Var = infoFragment.getViewModel().b.a;
        alc[] alcVarArr = {new y0j0(new tis0((String) null, (a9f) new vm7(21), true))};
        jlc jlcVar = ufl0Var.a;
        jlcVar.c.post(new l7a(15, jlcVar, alcVarArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setScreenState(qtv state, xsv infoAdapter) {
        Pair pair = new Pair(getString(yyh0.pay_sdk_debug_main_puid), state.a.a);
        String string = getString(yyh0.pay_sdk_debug_main_device_id);
        evg evgVar = state.a;
        infoAdapter.submitList(scc.g(pair, new Pair(string, evgVar.b), new Pair(getString(yyh0.pay_sdk_debug_main_device_model), evgVar.c), new Pair(getString(yyh0.pay_sdk_debug_main_os_version), Build.VERSION.RELEASE), new Pair(getString(yyh0.pay_sdk_debug_main_app_version), evgVar.d), new Pair(getString(yyh0.pay_sdk_debug_main_sdk_version), "110.0.2"), new Pair(getString(yyh0.pay_sdk_debug_main_service_name), evgVar.e), new Pair(getString(yyh0.pay_sdk_debug_main_use_bdui), String.valueOf(false)), new Pair(getString(yyh0.pay_sdk_debug_main_environment), evgVar.f.name().toLowerCase(Locale.ROOT))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs31 viewModel_delegate$lambda$1(InfoFragment infoFragment) {
        g1d g1dVar = (g1d) infoFragment.getDependencies();
        g1dVar.getClass();
        cs31[] cs31VarArr = (cs31[]) Arrays.copyOf(new cs31[]{new cs31(stv.class, new f1d(g1dVar, 0))}, 1);
        return new ywv((cs31[]) Arrays.copyOf(cs31VarArr, cs31VarArr.length));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final int i = 0;
        bb1.L(getReportButton(), new View.OnClickListener(this) { // from class: ctv
            public final /* synthetic */ InfoFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = i;
                InfoFragment infoFragment = this.b;
                switch (i2) {
                    case 0:
                        InfoFragment.onViewCreated$lambda$2(infoFragment, view2);
                        break;
                    default:
                        InfoFragment.onViewCreated$lambda$3(infoFragment, view2);
                        break;
                }
            }
        });
        final int i2 = 1;
        bb1.L(getLogsButton(), new View.OnClickListener(this) { // from class: ctv
            public final /* synthetic */ InfoFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i2;
                InfoFragment infoFragment = this.b;
                switch (i22) {
                    case 0:
                        InfoFragment.onViewCreated$lambda$2(infoFragment, view2);
                        break;
                    default:
                        InfoFragment.onViewCreated$lambda$3(infoFragment, view2);
                        break;
                }
            }
        });
        xsv xsvVar = new xsv();
        getDebugInfoRecycler().setAdapter(xsvVar);
        getDebugInfoRecycler().addItemDecoration(new dkt0(vng.s(ovg0.pay_sdk_margin_middle, view.getContext())));
        c.b(g.a(getViewModel().c, getViewLifecycleOwner().getLifecycle(), Lifecycle.State.STARTED), com.yandex.plus.home.common.utils.a.c(this), new InfoFragment$onViewCreated$3(this, xsvVar, null));
    }
}
