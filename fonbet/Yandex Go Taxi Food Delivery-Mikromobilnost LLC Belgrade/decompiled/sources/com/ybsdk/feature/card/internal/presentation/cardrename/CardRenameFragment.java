package com.ybsdk.feature.card.internal.presentation.cardrename;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ybsdk.feature.card.api.CardRenameScreenParams;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivFragment;
import com.ybsdk.feature.divkit.api.ui.skeletons.DivSkeletonsView;
import defpackage.bn8;
import defpackage.dal;
import defpackage.dcs;
import defpackage.eal;
import defpackage.fls0;
import defpackage.if8;
import defpackage.lfx;
import defpackage.wm8;
import defpackage.wz51;
import defpackage.y8f;
import defpackage.ym8;
import defpackage.yr31;
import defpackage.zm8;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/feature/card/internal/presentation/cardrename/CardRenameFragment;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivFragment;", "Lym8;", "Lcom/ybsdk/feature/card/internal/presentation/cardrename/a;", "Lzm8;", "factoryOfViewModel", "Lwm8;", "remoteConfig", "<init>", "(Lzm8;Lwm8;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "createViewModel", "()Lcom/ybsdk/feature/card/internal/presentation/cardrename/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "", "attachToParent", "createShimmerView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Landroid/view/View;", "Lzm8;", "Lwm8;", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CardRenameFragment extends BaseDivFragment<ym8, a> {
    private final zm8 factoryOfViewModel;
    private final wm8 remoteConfig;

    public CardRenameFragment(zm8 zm8Var, wm8 wm8Var) {
        super(a.class, null, null, 6, null);
        this.factoryOfViewModel = zm8Var;
        this.remoteConfig = wm8Var;
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivFragment, com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivFragment
    public View createShimmerView(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        if (!((if8) this.remoteConfig).a()) {
            return wz51.r(inflater, parent, attachToParent).p();
        }
        dal dalVar = DivSkeletonsView.Companion;
        Context requireContext = requireContext();
        eal ealVar = new eal(fls0.b, true, null, 4);
        dalVar.getClass();
        return dal.a(requireContext, ealVar);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return ((bn8) this.factoryOfViewModel).a((CardRenameScreenParams) dcs.a(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        ((a) getViewModel()).f0();
        super.onViewCreated(view, savedInstanceState);
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivFragment, com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
