package com.ybsdk.feature.accountdetails.internal.screens.accountdetails;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivFragment;
import defpackage.dcs;
import defpackage.lfx;
import defpackage.pk;
import defpackage.sk;
import defpackage.uk;
import defpackage.wmh0;
import defpackage.y8f;
import defpackage.yr31;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/accountdetails/internal/screens/accountdetails/AccountDetailsFragment;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivFragment;", "Lpk;", "Lcom/ybsdk/feature/accountdetails/internal/screens/accountdetails/a;", "Lsk;", "factoryOfViewModel", "<init>", "(Lsk;)V", "createViewModel", "()Lcom/ybsdk/feature/accountdetails/internal/screens/accountdetails/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "", "attachToParent", "Landroid/view/View;", "createShimmerView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Landroid/view/View;", "Lsk;", "feature-account-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AccountDetailsFragment extends BaseDivFragment<pk, a> {
    private final sk factoryOfViewModel;

    public AccountDetailsFragment(sk skVar) {
        super(a.class, null, null, 6, null);
        this.factoryOfViewModel = skVar;
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivFragment, com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivFragment
    public View createShimmerView(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        return inflater.inflate(wmh0.ybsdk_account_details_shimmer, parent, attachToParent);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return ((uk) this.factoryOfViewModel).a((AccountDetailsParams) dcs.a(this));
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivFragment, com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
