package com.ybsdk.feature.about.internal.presentation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import defpackage.a6;
import defpackage.cry;
import defpackage.dzh0;
import defpackage.jha1;
import defpackage.k5;
import defpackage.lfx;
import defpackage.m5;
import defpackage.n6;
import defpackage.qas0;
import defpackage.v4b1;
import defpackage.y4;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.yvf0;
import defpackage.z561;
import defpackage.zy11;
import java.util.Calendar;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0017\b\u0007\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR.\u0010$\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\" #*\n\u0012\u0004\u0012\u00020\"\u0018\u00010!0!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/ybsdk/feature/about/internal/presentation/AboutFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Lz561;", "Ln6;", "Lcom/ybsdk/feature/about/internal/presentation/b;", "Lyvf0;", "aboutViewModelProvider", "<init>", "(Lyvf0;)V", "createViewModel", "()Lcom/ybsdk/feature/about/internal/presentation/b;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lz561;", "Lqas0;", "sideEffect", "Lzy11;", "consumeSideEffect", "(Lqas0;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "viewState", "render", "(Ln6;)V", "Lyvf0;", "Lcry;", "", "Lm5;", "kotlin.jvm.PlatformType", "adapter", "Lcry;", "feature-about_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AboutFragment extends BaseMvvmFragment<z561, n6, b> {
    public static final int $stable = 8;
    private final yvf0 aboutViewModelProvider;
    private final cry adapter;

    public AboutFragment(yvf0 yvf0Var) {
        super(null, null, null, null, b.class, 15, null);
        this.aboutViewModelProvider = yvf0Var;
        this.adapter = new cry(jha1.d(new y4(2, this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 adapter$lambda$0(AboutFragment aboutFragment, m5 m5Var) {
        aboutFragment.getViewModel().b0(m5Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$2$lambda$1(AboutFragment aboutFragment, z561 z561Var, View view) {
        aboutFragment.getViewModel().c0(z561Var.b.getDrawable());
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        super.consumeSideEffect(sideEffect);
        if (sideEffect instanceof a6) {
            FragmentActivity requireActivity = requireActivity();
            Toast.makeText(requireActivity, d.a(requireActivity, ((a6) sideEffect).a()), 1).show();
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public b getFactoryOfViewModel() {
        return (b) this.aboutViewModelProvider.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ((z561) getBinding()).d.setAdapter(this.adapter);
        ((z561) getBinding()).c.setText(requireContext().getString(dzh0.ybsdk_settings_organization_title, String.valueOf(Calendar.getInstance().get(1))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(n6 viewState) {
        z561 z561Var = (z561) getBinding();
        this.adapter.f(viewState.a());
        this.adapter.notifyDataSetChanged();
        v4b1.k(viewState.b(), z561Var.b, null, null, 6);
        z561Var.b.setOnClickListener(new k5(0, this, z561Var));
        Text c = viewState.c();
        TextView textView = z561Var.e;
        if (c == null) {
            textView.setVisibility(8);
        } else {
            textView.setText(d.a(requireContext(), viewState.c()));
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public z561 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        return z561.o(inflater, container);
    }
}
