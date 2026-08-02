package com.ybsdk.core.mvp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.p;
import com.ybsdk.core.presentation.BindingFragment;
import com.ybsdk.core.utils.ColorModel;
import defpackage.c5b1;
import defpackage.cua1;
import defpackage.eja1;
import defpackage.f02;
import defpackage.hs31;
import defpackage.i3y;
import defpackage.lcb1;
import defpackage.lfx;
import defpackage.ls31;
import defpackage.qas0;
import defpackage.tje;
import defpackage.uc5;
import defpackage.y8f;
import defpackage.yqq0;
import defpackage.yr31;
import defpackage.zo31;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u0003*\u0012\b\u0002\u0010\u0005*\f\u0012\u0004\u0012\u00028\u0001\u0012\u0002\b\u00030\u00042\b\u0012\u0004\u0012\u00028\u00000\u00062\u00020\u0007BE\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00028\u0002H$¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00028\u0001H&¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J%\u0010)\u001a\u00028\u0003\"\b\b\u0003\u0010'*\u00020&2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00030\u0010¢\u0006\u0004\b)\u0010*J+\u0010/\u001a\u00020\u00192\u0006\u0010,\u001a\u00020+2\b\u0010.\u001a\u0004\u0018\u00010-2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b/\u00100R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00101R\u001b\u00105\u001a\u00028\u00028DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010\u0018¨\u00066"}, d2 = {"Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Lzo31;", "VB", "VS", "Luc5;", "VM", "Lcom/ybsdk/core/presentation/BindingFragment;", "Lhs31;", "", "backVisible", "", "softInputMode", "Lcom/ybsdk/core/utils/ColorModel;", "statusBarColor", "Lyqq0;", "sensitiveDataMode", "Ljava/lang/Class;", "viewModelClass", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/ybsdk/core/utils/ColorModel;Lyqq0;Ljava/lang/Class;)V", "Lzy11;", "manageKeyboard", "()V", "createViewModel", "()Luc5;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "viewState", "render", "(Ljava/lang/Object;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "Lyr31;", "T", "modelClass", "create", "(Ljava/lang/Class;)Lyr31;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Ljava/lang/Class;", "viewModel$delegate", "Li3y;", "getViewModel", "viewModel", "core-mvp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class BaseMvvmFragment<VB extends zo31, VS, VM extends uc5> extends BindingFragment<VB> implements hs31 {

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel;
    private final Class<VM> viewModelClass;

    public BaseMvvmFragment(Boolean bool, Integer num, ColorModel colorModel, yqq0 yqq0Var, Class<VM> cls) {
        super(bool, num, colorModel, null, yqq0Var, null, 40, null);
        this.viewModelClass = cls;
        this.viewModel = kotlin.a.b(LazyThreadSafetyMode.NONE, new f02(25, this));
    }

    private final void manageKeyboard() {
        View view = getView();
        if (view != null) {
            lcb1.d(view);
        }
    }

    private static final void manageKeyboard$lambda$3$lambda$2(View view) {
        view.requestFocus();
        lcb1.f(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final uc5 viewModel_delegate$lambda$0(BaseMvvmFragment baseMvvmFragment) {
        return (uc5) new ls31(baseMvvmFragment, baseMvvmFragment).b(baseMvvmFragment.viewModelClass);
    }

    public void consumeSideEffect(qas0 sideEffect) {
    }

    @Override // defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    /* renamed from: createViewModel */
    public abstract VM getFactoryOfViewModel();

    public final VM getViewModel() {
        return (VM) this.viewModel.getValue();
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View onCreateView = super.onCreateView(inflater, container, savedInstanceState);
        c5b1.c(onCreateView, cua1.e(this));
        return onCreateView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        p s = eja1.s(getViewLifecycleOwner());
        tje.N(s, null, null, new BaseMvvmFragment$onViewCreated$1$1(this, null), 3);
        tje.N(s, null, null, new BaseMvvmFragment$onViewCreated$1$2(this, null), 3);
        manageKeyboard();
    }

    public abstract void render(VS viewState);

    @Override // defpackage.hs31
    public final <T extends yr31> T create(Class<T> modelClass) {
        return getFactoryOfViewModel();
    }

    @Override // defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }

    public /* synthetic */ BaseMvvmFragment(Boolean bool, Integer num, ColorModel colorModel, yqq0 yqq0Var, Class cls, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : colorModel, (i & 8) != 0 ? null : yqq0Var, cls);
    }
}
