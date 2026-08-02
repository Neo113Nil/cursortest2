package xsna;

import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.ui.themes.VKReplacerView;
import com.vk.core.view.components.search.BaseVkSearchView;
import com.vk.core.view.components.search.VkSearchView;
import com.vkontakte.android.R;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import xsna.efy;
import xsna.gzw;

/* compiled from: ChooseCountryFragment.kt */
/* loaded from: classes15.dex */
public final class mbc extends com.google.android.material.bottomsheet.c {
    public BaseVkSearchView A;
    public io.reactivex.rxjava3.disposables.c B;
    public final bpn0 C = new bpn0(new im0(this, 14));
    public final a D = new a();
    public final bpn0 E = new bpn0(new ra(this, 17));
    public final Object F = msy.a(LazyThreadSafetyMode.NONE, new h20(this, 12));
    public Context G;
    public syj y;
    public Toolbar z;

    @Override // androidx.fragment.app.Fragment
    /* renamed from: getContext */
    public final Context mo2getContext() {
        return this.G;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.G = hnj.a(context);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.y = new syj(new dg(this, 18));
        pbc pbcVar = (pbc) this.C.getValue();
        zx zxVar = new zx(this, 22);
        hg1.a(pbcVar.b.subscribe(new tf1(new tm0(zxVar, 21), 9), new um0(new jy(zxVar, 28), 14)), this);
        pbcVar.i(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        Dialog dialog = this.s;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(null);
        }
        View inflate = layoutInflater.inflate(R.layout.vk_auth_choose_country_fragment, viewGroup, false);
        r55 r55Var = r55.a;
        r55.i();
        VkSearchView a2 = kiv0.a(layoutInflater.getContext());
        a2.X4(false);
        this.A = a2;
        VKReplacerView vKReplacerView = (VKReplacerView) inflate.findViewById(R.id.search_view);
        BaseVkSearchView baseVkSearchView = this.A;
        vKReplacerView.a(baseVkSearchView != null ? baseVkSearchView : null);
        return inflate;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((a2e0) this.E.getValue()).a();
        io.reactivex.rxjava3.disposables.c cVar = this.B;
        if (cVar == null) {
            cVar = null;
        }
        cVar.dispose();
        int i = efy.a;
        efy.b(this.D);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.G = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        Window window;
        super.onResume();
        pbc pbcVar = (pbc) this.C.getValue();
        bpn0 bpn0Var = t65.a;
        String a2 = ply.a();
        io.reactivex.rxjava3.subjects.d<nbc> dVar = pbcVar.b;
        if (!epx.f(dVar.P0().a, a2)) {
            dVar.onNext(nbc.a(dVar.P0(), a2, null, false, null, 14));
            pbcVar.i(this);
        }
        Dialog dialog = this.s;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        boolean z = n8g.f(window.getNavigationBarColor()) >= 0.5d;
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility | 16 : systemUiVisibility & (-17));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.z = (Toolbar) view.findViewById(R.id.toolbar);
        BaseVkSearchView baseVkSearchView = this.A;
        if (baseVkSearchView == null) {
            baseVkSearchView = null;
        }
        this.B = new gzw.a(new qno0(baseVkSearchView.getEditView())).z(300L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new tp0(new zx0(this, 22), 9));
        Toolbar toolbar = this.z;
        if (toolbar == null) {
            toolbar = null;
        }
        toolbar.t(R.style.VkAuth_ToolbarTitleTextAppearance, requireContext());
        Toolbar toolbar2 = this.z;
        if (toolbar2 == null) {
            toolbar2 = null;
        }
        toolbar2.setNavigationOnClickListener(new um3(this, 2));
        Toolbar toolbar3 = this.z;
        if (toolbar3 == null) {
            toolbar3 = null;
        }
        Drawable navigationIcon = toolbar3.getNavigationIcon();
        if (navigationIcon != null) {
            sjo.b(navigationIcon, krv0.m(R.attr.vk_connect_header_tint_alternate, requireContext()), PorterDuff.Mode.SRC_IN);
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler);
        syj syjVar = this.y;
        if (syjVar == null) {
            syjVar = null;
        }
        recyclerView.setAdapter(syjVar);
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        recyclerView.setNestedScrollingEnabled(true);
        int i = efy.a;
        efy.a(this.D);
        BaseVkSearchView baseVkSearchView2 = this.A;
        (baseVkSearchView2 != null ? baseVkSearchView2 : null).a5();
    }

    @Override // androidx.fragment.app.d
    public final int vn() {
        return R.style.VkIdBottomSheetTheme;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.material.bottomsheet.c, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        q0o0 q0o0Var = this instanceof q0o0 ? (q0o0) this : null;
        prw.h(this, q0o0Var != null ? q0o0Var.tag() : "VkSdkDialogFragment", null);
        Dialog yn = super.yn(bundle);
        yn.setOnShowListener(new lbc());
        return yn;
    }

    /* compiled from: ChooseCountryFragment.kt */
    public static final class a implements efy.a {
        public a() {
        }

        @Override // xsna.efy.a
        public final void Y0() {
            BaseVkSearchView baseVkSearchView = mbc.this.A;
            if (baseVkSearchView == null) {
                baseVkSearchView = null;
            }
            baseVkSearchView.T4();
        }

        @Override // xsna.efy.a
        public final void x0(int i) {
        }
    }
}
