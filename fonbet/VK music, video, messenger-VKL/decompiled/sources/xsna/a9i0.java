package xsna;

import android.app.Dialog;
import android.os.Bundle;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.translate.impl.models.LanguageModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.d9i0;
import xsna.tzp0;

/* compiled from: SelectLanguageBottomSheetFragment.kt */
/* loaded from: classes6.dex */
public final class a9i0 extends dw20 implements bop0, d9i0.a, m0q0 {
    public static final a i1;
    public static final /* synthetic */ qcy<Object>[] j1;
    public nnp0 f1;
    public final Object g1 = msy.a(LazyThreadSafetyMode.NONE, new jaa0(this, 10));
    public final ras h1 = xo9.v("select.language.init.config");

    /* compiled from: SelectLanguageBottomSheetFragment.kt */
    public static final class a {
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(a9i0.class, "initConfig", "getInitConfig()Lcom/vk/translate/impl/models/SelectLanguageInitConfig;", 0);
        fpf0.a.getClass();
        j1 = new qcy[]{propertyReference1Impl};
        i1 = new a();
    }

    public a9i0() {
        this.x = new tzp0.c.a(this, false);
    }

    @Override // xsna.d9i0.a
    public final void L8(LanguageModel languageModel, LanguageModel languageModel2) {
        getParentFragmentManager().k0(yfb.b(new Pair("original.language.key", languageModel), new Pair("translated.language.key", languageModel2)), "select.language.request_key");
        dismiss();
    }

    @Override // xsna.bop0
    public final void Q3(nnp0 nnp0Var) {
        this.f1 = nnp0Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final d9i0 Yn() {
        return (d9i0) this.g1.getValue();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Yn().getClass();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        Yn().G0();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Yn().H0();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        Yn().W0();
    }

    @Override // xsna.dw20, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Yn().V0();
    }

    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        dw20.Rn(this, Yn().D0(requireContext(), null, null, bundle), 6);
        return super.yn(bundle);
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
