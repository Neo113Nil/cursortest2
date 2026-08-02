package xsna;

import androidx.lifecycle.e0;

/* loaded from: classes12.dex */
public final class uyt0 {
    public static final nyt0 a(rfc rfcVar, xyt0 xyt0Var, e0.c cVar, qbk qbkVar, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1673618944, 0, -1, "androidx.lifecycle.viewmodel.compose.viewModel (ViewModel.kt:105)");
        }
        vyt0 vyt0Var = (cVar != null ? new androidx.lifecycle.e0(xyt0Var.getViewModelStore(), cVar, qbkVar) : xyt0Var instanceof androidx.lifecycle.f ? new androidx.lifecycle.e0(xyt0Var.getViewModelStore(), ((androidx.lifecycle.f) xyt0Var).getDefaultViewModelProviderFactory(), qbkVar) : e0.b.a(xyt0Var, null, 6)).a;
        String h = rfcVar.h();
        if (h == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        nyt0 a = vyt0Var.a("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(h), rfcVar);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return a;
    }
}
