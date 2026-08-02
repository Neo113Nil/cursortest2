package com.ybsdk.feature.sbp.old.internal.screens;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivFragment;
import defpackage.b661;
import defpackage.lfx;
import defpackage.mhm0;
import defpackage.q05;
import defpackage.t05;
import defpackage.wz51;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.yvf0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/feature/sbp/old/internal/screens/SbpOldFragment;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivFragment;", "Lmhm0;", "Lcom/ybsdk/feature/sbp/old/internal/screens/a;", "Lyvf0;", "sbpOldViewModelProvider", "<init>", "(Lyvf0;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "createViewModel", "()Lcom/ybsdk/feature/sbp/old/internal/screens/a;", "Lt05;", "viewState", "render", "(Lt05;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "", "attachToParent", "createShimmerView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Landroid/view/View;", "Lyvf0;", "feature-sbp-old_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SbpOldFragment extends BaseDivFragment<mhm0, a> {
    private final yvf0 sbpOldViewModelProvider;

    public SbpOldFragment(yvf0 yvf0Var) {
        super(a.class, null, null, 6, null);
        this.sbpOldViewModelProvider = yvf0Var;
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivFragment, com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivFragment
    public View createShimmerView(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        return wz51.s(inflater, parent, attachToParent).p();
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return (a) this.sbpOldViewModelProvider.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        ((a) getViewModel()).f0();
        super.onViewCreated(view, savedInstanceState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivFragment, com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(t05 viewState) {
        super.render(viewState);
        boolean z = viewState instanceof q05;
        setBackButtonVisible(!z);
        ((b661) getBinding()).f.setVisibility(z ? 8 : 0);
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivFragment, com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
