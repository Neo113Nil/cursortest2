package com.ybsdk.feature.split.deposit.internal.ui.deposit;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ybsdk.core.utils.ui.DebounceClickListener;
import com.ybsdk.feature.deeplink.api.actions.SplitDepositRepayment;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;
import com.ybsdk.feature.divkit.api.ui.skeletons.DivSkeletonsView;
import com.ybsdk.feature.split.deposit.internal.ui.deposit.SplitDepositFragment;
import defpackage.avt0;
import defpackage.bvt0;
import defpackage.ce4;
import defpackage.cvt0;
import defpackage.dcs;
import defpackage.dvt0;
import defpackage.eal;
import defpackage.gls0;
import defpackage.hua1;
import defpackage.jds;
import defpackage.lfx;
import defpackage.ltt0;
import defpackage.v861;
import defpackage.w511;
import defpackage.wls;
import defpackage.wut0;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.yut0;
import defpackage.zut0;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u0011\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#¨\u0006$"}, d2 = {"Lcom/ybsdk/feature/split/deposit/internal/ui/deposit/SplitDepositFragment;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivContextMvvmFragment;", "Lv861;", "Ldvt0;", "Lcom/ybsdk/feature/split/deposit/internal/ui/deposit/a;", "Lce4;", "Lwut0;", "viewModelFactory", "<init>", "(Lwut0;)V", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "createViewModel", "()Lcom/ybsdk/feature/split/deposit/internal/ui/deposit/a;", "viewState", "render", "(Ldvt0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lv861;", "", "onBackPressed", "()Z", "onDestroy", "()V", "Lwut0;", "feature-split-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SplitDepositFragment extends BaseDivContextMvvmFragment<v861, dvt0, a> implements ce4 {
    private final wut0 viewModelFactory;

    public SplitDepositFragment(wut0 wut0Var) {
        super(null, null, null, null, a.class, 15, null);
        this.viewModelFactory = wut0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onCreate$lambda$0(SplitDepositFragment splitDepositFragment, String str, Bundle bundle) {
        SplitDepositRepayment splitDepositRepayment = (SplitDepositRepayment) bundle.getParcelable("split_deposit_repayment");
        zy11 zy11Var = zy11.a;
        if (splitDepositRepayment == null) {
            return zy11Var;
        }
        ((a) splitDepositFragment.getViewModel()).c0(splitDepositRepayment);
        return zy11Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onCreate$lambda$1(SplitDepositFragment splitDepositFragment, String str, Bundle bundle) {
        ((a) splitDepositFragment.getViewModel()).b0(bundle.getString(jds.a()));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onCreate$lambda$2(SplitDepositFragment splitDepositFragment, String str, Bundle bundle) {
        ((a) splitDepositFragment.getViewModel()).j0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$5$lambda$3(SplitDepositFragment splitDepositFragment) {
        ((a) splitDepositFragment.getViewModel()).f0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$5$lambda$4(SplitDepositFragment splitDepositFragment) {
        ((a) splitDepositFragment.getViewModel()).g0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 render$lambda$7$lambda$6(SplitDepositFragment splitDepositFragment) {
        ((a) splitDepositFragment.getViewModel()).h0();
        return zy11.a;
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return ((yut0) this.viewModelFactory).a((SplitDepositScreenParams) dcs.a(this));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [uc5] */
    @Override // com.ybsdk.core.presentation.BindingFragment
    public v861 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        v861 o = v861.o(inflater, container);
        o.b.setActionHandler(new SplitDepositFragment$getViewBinding$1$1(getViewModel()));
        return o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ce4
    public boolean onBackPressed() {
        ((a) getViewModel()).e0();
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        final int i = 0;
        hua1.g(this, "split_deposit_repayment", new wls(this) { // from class: mtt0
            public final /* synthetic */ SplitDepositFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                zy11 onCreate$lambda$0;
                zy11 onCreate$lambda$1;
                zy11 onCreate$lambda$2;
                int i2 = i;
                SplitDepositFragment splitDepositFragment = this.b;
                String str = (String) obj;
                Bundle bundle = (Bundle) obj2;
                switch (i2) {
                    case 0:
                        onCreate$lambda$0 = SplitDepositFragment.onCreate$lambda$0(splitDepositFragment, str, bundle);
                        return onCreate$lambda$0;
                    case 1:
                        onCreate$lambda$1 = SplitDepositFragment.onCreate$lambda$1(splitDepositFragment, str, bundle);
                        return onCreate$lambda$1;
                    default:
                        onCreate$lambda$2 = SplitDepositFragment.onCreate$lambda$2(splitDepositFragment, str, bundle);
                        return onCreate$lambda$2;
                }
            }
        });
        final int i2 = 1;
        hua1.g(this, "auto_topup_enable_success", new wls(this) { // from class: mtt0
            public final /* synthetic */ SplitDepositFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                zy11 onCreate$lambda$0;
                zy11 onCreate$lambda$1;
                zy11 onCreate$lambda$2;
                int i22 = i2;
                SplitDepositFragment splitDepositFragment = this.b;
                String str = (String) obj;
                Bundle bundle = (Bundle) obj2;
                switch (i22) {
                    case 0:
                        onCreate$lambda$0 = SplitDepositFragment.onCreate$lambda$0(splitDepositFragment, str, bundle);
                        return onCreate$lambda$0;
                    case 1:
                        onCreate$lambda$1 = SplitDepositFragment.onCreate$lambda$1(splitDepositFragment, str, bundle);
                        return onCreate$lambda$1;
                    default:
                        onCreate$lambda$2 = SplitDepositFragment.onCreate$lambda$2(splitDepositFragment, str, bundle);
                        return onCreate$lambda$2;
                }
            }
        });
        final int i3 = 2;
        hua1.g(this, "user_returned_from_settings", new wls(this) { // from class: mtt0
            public final /* synthetic */ SplitDepositFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                zy11 onCreate$lambda$0;
                zy11 onCreate$lambda$1;
                zy11 onCreate$lambda$2;
                int i22 = i3;
                SplitDepositFragment splitDepositFragment = this.b;
                String str = (String) obj;
                Bundle bundle = (Bundle) obj2;
                switch (i22) {
                    case 0:
                        onCreate$lambda$0 = SplitDepositFragment.onCreate$lambda$0(splitDepositFragment, str, bundle);
                        return onCreate$lambda$0;
                    case 1:
                        onCreate$lambda$1 = SplitDepositFragment.onCreate$lambda$1(splitDepositFragment, str, bundle);
                        return onCreate$lambda$1;
                    default:
                        onCreate$lambda$2 = SplitDepositFragment.onCreate$lambda$2(splitDepositFragment, str, bundle);
                        return onCreate$lambda$2;
                }
            }
        });
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        hua1.b(this, "auto_topup_enable_success");
        hua1.b(this, "user_returned_from_settings");
        hua1.b(this, "split_deposit_repayment");
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        v861 v861Var = (v861) getBinding();
        v861Var.c.setSecondaryButtonClickListener(new ltt0(this, 0));
        v861Var.c.setPrimaryButtonOnClickListener(new ltt0(this, 1));
        super.onViewCreated(view, savedInstanceState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(dvt0 viewState) {
        v861 v861Var = (v861) getBinding();
        cvt0 c = viewState.c();
        if (c instanceof zut0) {
            zut0 zut0Var = (zut0) c;
            if (zut0Var.d()) {
                v861Var.e.setSubtitleClickListener(new DebounceClickListener(0L, new ltt0(this, 2), 1, null));
            } else {
                v861Var.e.setSubtitleClickListener(null);
            }
            YbDivView ybDivView = v861Var.b;
            YbDivView ybDivView2 = v861Var.b;
            ybDivView.setVisibility(0);
            YbDivView.setData$default(ybDivView2, zut0Var.a(), null, null, zut0Var.c(), 6, null);
            ((a) getViewModel()).i0();
            ybDivView2.updateLocalVariables(zut0Var.b());
            v861Var.d.setVisibility(8);
            v861Var.c.render(null);
        } else if (c instanceof avt0) {
            v861Var.b.setVisibility(8);
            v861Var.c.render(((avt0) viewState.c()).a());
            v861Var.d.setVisibility(8);
        } else {
            if (!(c instanceof bvt0)) {
                w511.b();
                return;
            }
            YbDivView ybDivView3 = v861Var.b;
            DivSkeletonsView divSkeletonsView = v861Var.d;
            ybDivView3.setVisibility(8);
            divSkeletonsView.render(new eal(gls0.b, false, null, 6));
            divSkeletonsView.setVisibility(0);
            v861Var.c.render(null);
        }
        v861Var.e.setVisibility(viewState.b() ? 0 : 4);
        v861Var.e.render(viewState.a());
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
