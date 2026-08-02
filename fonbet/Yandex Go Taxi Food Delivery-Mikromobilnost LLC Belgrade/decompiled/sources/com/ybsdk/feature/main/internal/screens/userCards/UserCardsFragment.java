package com.ybsdk.feature.main.internal.screens.userCards;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivFragment;
import com.ybsdk.feature.divkit.api.ui.skeletons.DivSkeletonsView;
import defpackage.but0;
import defpackage.dal;
import defpackage.eal;
import defpackage.eja1;
import defpackage.hua1;
import defpackage.lfx;
import defpackage.mls0;
import defpackage.n961;
import defpackage.qas0;
import defpackage.rb00;
import defpackage.t400;
import defpackage.tje;
import defpackage.tk21;
import defpackage.uk21;
import defpackage.w860;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010#\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010'¨\u0006("}, d2 = {"Lcom/ybsdk/feature/main/internal/screens/userCards/UserCardsFragment;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivFragment;", "Ltk21;", "Lcom/ybsdk/feature/main/internal/screens/userCards/b;", "Lyvf0;", "factoryOfViewModel", "Lrb00;", "remoteConfig", "Lw860;", "nfcPaymentController", "<init>", "(Lyvf0;Lrb00;Lw860;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "()V", "createViewModel", "()Lcom/ybsdk/feature/main/internal/screens/userCards/b;", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "", "attachToParent", "createShimmerView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Landroid/view/View;", "Lyvf0;", "Lrb00;", "Lw860;", "feature-main-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UserCardsFragment extends BaseDivFragment<tk21, b> {
    private final yvf0 factoryOfViewModel;
    private final w860 nfcPaymentController;
    private final rb00 remoteConfig;

    public UserCardsFragment(yvf0 yvf0Var, rb00 rb00Var, w860 w860Var) {
        super(b.class, null, null, 6, null);
        this.factoryOfViewModel = yvf0Var;
        this.remoteConfig = rb00Var;
    }

    public static final /* synthetic */ w860 access$getNfcPaymentController$p(UserCardsFragment userCardsFragment) {
        userCardsFragment.getClass();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ b access$getViewModel(UserCardsFragment userCardsFragment) {
        return (b) userCardsFragment.getViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onCreate$lambda$0(UserCardsFragment userCardsFragment, String str, Bundle bundle) {
        ((b) userCardsFragment.getViewModel()).g0();
        return zy11.a;
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        super.consumeSideEffect(sideEffect);
        if (sideEffect instanceof uk21) {
            tje.N(eja1.s(this), null, null, new UserCardsFragment$consumeSideEffect$1(this, sideEffect, null), 3);
        }
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivFragment, com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivFragment
    public View createShimmerView(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        if (!((t400) this.remoteConfig).a()) {
            return ((t400) this.remoteConfig).e() ? n961.q(inflater, parent, attachToParent).o() : n961.p(inflater, parent, attachToParent).o();
        }
        dal dalVar = DivSkeletonsView.Companion;
        Context requireContext = requireContext();
        eal ealVar = new eal(mls0.b, true, null, 4);
        dalVar.getClass();
        return dal.a(requireContext, ealVar);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public b getFactoryOfViewModel() {
        return (b) this.factoryOfViewModel.get();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hua1.g(this, "ReloadUserCards", new but0(29, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ((b) getViewModel()).h0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        ((b) getViewModel()).g0();
        super.onViewCreated(view, savedInstanceState);
        tje.N(eja1.s(getViewLifecycleOwner()), null, null, new UserCardsFragment$onViewCreated$1(this, null), 3);
        tje.N(eja1.s(getViewLifecycleOwner()), null, null, new UserCardsFragment$onViewCreated$2(this, null), 3);
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivFragment, com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
