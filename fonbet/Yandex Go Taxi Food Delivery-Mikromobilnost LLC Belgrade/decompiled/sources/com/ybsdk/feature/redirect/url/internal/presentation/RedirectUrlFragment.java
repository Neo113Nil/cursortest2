package com.ybsdk.feature.redirect.url.internal.presentation;

import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.widgets.common.snackbar.Snackbar;
import defpackage.ami0;
import defpackage.bmi0;
import defpackage.cmi0;
import defpackage.dcs;
import defpackage.dmi0;
import defpackage.fmi0;
import defpackage.gmi0;
import defpackage.hay;
import defpackage.i5z0;
import defpackage.lfx;
import defpackage.qas0;
import defpackage.rje;
import defpackage.s761;
import defpackage.slf;
import defpackage.w511;
import defpackage.xli0;
import defpackage.y8f;
import defpackage.yr31;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/feature/redirect/url/internal/presentation/RedirectUrlFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Ls761;", "Lgmi0;", "Lcom/ybsdk/feature/redirect/url/internal/presentation/a;", "Lami0;", "factoryOfViewModel", "Lxli0;", "redirectUrlCustomTabsLauncher", "<init>", "(Lami0;Lxli0;)V", "createViewModel", "()Lcom/ybsdk/feature/redirect/url/internal/presentation/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ls761;", "viewState", "Lzy11;", "render", "(Lgmi0;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "Lami0;", "Lxli0;", "feature-redirect-url_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RedirectUrlFragment extends BaseMvvmFragment<s761, gmi0, a> {
    private final ami0 factoryOfViewModel;
    private final xli0 redirectUrlCustomTabsLauncher;

    public RedirectUrlFragment(ami0 ami0Var, xli0 xli0Var) {
        super(null, null, null, null, a.class, 15, null);
        this.factoryOfViewModel = ami0Var;
        this.redirectUrlCustomTabsLauncher = xli0Var;
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        boolean k;
        super.consumeSideEffect(sideEffect);
        if (sideEffect instanceof dmi0) {
            dmi0 dmi0Var = (dmi0) sideEffect;
            if (!(dmi0Var instanceof bmi0)) {
                if (dmi0Var instanceof cmi0) {
                    com.ybsdk.widgets.common.snackbar.a.a(Snackbar.Companion, requireActivity(), ((cmi0) sideEffect).a(), null, 12);
                    return;
                } else {
                    w511.b();
                    return;
                }
            }
            xli0 xli0Var = this.redirectUrlCustomTabsLauncher;
            FragmentActivity requireActivity = requireActivity();
            String a = ((bmi0) sideEffect).a();
            ((hay) xli0Var).getClass();
            Uri parse = Uri.parse(a);
            try {
                new slf().a().a(requireActivity, parse);
                i5z0.a.a("CustomTabsIntent launched with uri " + parse, new Object[0]);
                k = true;
            } catch (Exception unused) {
                k = rje.k(requireActivity, new Intent("android.intent.action.VIEW", parse));
            }
            if (k) {
                getViewModel().c0();
            } else {
                getViewModel().b0();
            }
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return ((fmi0) this.factoryOfViewModel).a((RedirectUrlParams) dcs.a(this));
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public s761 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        return s761.o(inflater, container);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(gmi0 viewState) {
    }
}
