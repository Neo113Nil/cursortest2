package xsna;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.auth.ui.VkLoadingButton;
import com.vk.core.view.AppBarShadowView;
import com.vk.registration.funnels.TrackingElement;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.superapp.ui.toolbar.VkAuthToolbar;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.eeu0;
import xsna.wbu0;
import xsna.x65;
import xsna.z55;

/* compiled from: BaseAuthFragment.kt */
/* loaded from: classes.dex */
public abstract class a66<P extends z55<?>> extends uhv0 implements x65, arf0, com.vk.registration.funnels.c {
    public AppBarLayout h;
    public ImageView i;
    public VkAuthToolbar j;
    public VkLoadingButton k;
    public ImageView l;
    public NestedScrollView m;
    public View n;
    public P o;
    public ycu0 p;
    public final bpn0 q = new bpn0(new y56(0));
    public final bpn0 r = new bpn0(new z56(this, 0));

    public a66() {
        setRetainInstance(true);
    }

    @Override // xsna.dhg
    public ehg Mb() {
        return new wcl(requireContext());
    }

    public void S(boolean z) {
        VkLoadingButton vkLoadingButton = this.k;
        if (vkLoadingButton != null) {
            vkLoadingButton.setLoading(z);
        }
    }

    @Override // xsna.x65
    public final void U2(String str, String str2, String str3, final gzs<s3q0> gzsVar, String str4, gzs<s3q0> gzsVar2, boolean z, gzs<s3q0> gzsVar3, gzs<s3q0> gzsVar4) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            eeu0.a aVar = new eeu0.a(activity);
            aVar.a(z);
            aVar.setTitle(str);
            aVar.d(str2);
            aVar.j(str3, new DialogInterface.OnClickListener() { // from class: xsna.t56
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    gzs gzsVar5 = gzs.this;
                    if (gzsVar5 != null) {
                        gzsVar5.invoke();
                    }
                }
            });
            aVar.h(new u56(0, gzsVar3));
            d.a i = aVar.i(new v56(gzsVar4, 0));
            if (str4 != null) {
                i.f(str4, new w56(0, gzsVar2));
            }
            i.m();
        }
    }

    @Override // com.vk.registration.funnels.c
    public List<Pair<TrackingElement.Registration, gzs<String>>> aa() {
        return EmptyList.b;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        P p = this.o;
        if (p == null) {
            p = null;
        }
        if (!p.onActivityResult(i, i2, intent) || intent == null) {
            return;
        }
        intent.putExtra("VkAuthLib__activityResultHandled", true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        r55 r55Var = r55.a;
        this.p = r55.i();
        this.o = tn(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        P p = this.o;
        if (p == null) {
            p = null;
        }
        p.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        xn();
        P p = this.o;
        if (p == null) {
            p = null;
        }
        p.e();
        this.k = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        ecu0 ecu0Var = (ecu0) this.r.getValue();
        if (z) {
            ecu0Var.getClass();
        } else {
            ecu0Var.f(ecu0Var.a.getView());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        P p = this.o;
        if (p == null) {
            p = null;
        }
        p.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ((ecu0) this.r.getValue()).b();
        P p = this.o;
        if (p == null) {
            p = null;
        }
        p.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        P p = this.o;
        if (p == null) {
            p = null;
        }
        p.x(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        P p = this.o;
        if (p == null) {
            p = null;
        }
        p.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        P p = this.o;
        if (p == null) {
            p = null;
        }
        p.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Drawable navigationIcon;
        super.onViewCreated(view, bundle);
        this.h = (AppBarLayout) view.findViewById(R.id.toolbar_layout);
        this.i = (ImageView) view.findViewById(R.id.coordinator_layout_background_image);
        VkAuthToolbar vkAuthToolbar = (VkAuthToolbar) view.findViewById(R.id.toolbar);
        this.j = vkAuthToolbar;
        if (vkAuthToolbar != null) {
            vkAuthToolbar.setNavigationOnClickListener(new s56(this, 0));
        }
        VkAuthToolbar vkAuthToolbar2 = this.j;
        if (vkAuthToolbar2 != null) {
            vkAuthToolbar2.setNavigationContentDescription(getString(R.string.vk_auth_accessibility_back));
        }
        VkAuthToolbar vkAuthToolbar3 = this.j;
        if (vkAuthToolbar3 != null) {
            vkAuthToolbar3.setTitleTextAppearance(R.style.VkAuth_ToolbarTitleTextAppearance);
        }
        VkAuthToolbar vkAuthToolbar4 = this.j;
        if (vkAuthToolbar4 != null && (navigationIcon = vkAuthToolbar4.getNavigationIcon()) != null) {
            sjo.b(navigationIcon, krv0.m(R.attr.vk_ui_icon_accent_themed, requireContext()), PorterDuff.Mode.SRC_IN);
        }
        VkAuthToolbar vkAuthToolbar5 = this.j;
        if (vkAuthToolbar5 != null) {
            ycu0 ycu0Var = this.p;
            if (ycu0Var == null) {
                ycu0Var = null;
            }
            vkAuthToolbar5.setPicture(ycu0Var.b(requireContext()));
        }
        this.k = (VkLoadingButton) view.findViewById(R.id.continue_btn);
        this.l = (ImageView) view.findViewById(R.id.client_icon);
        umu0 umu0Var = r55.g;
        (umu0Var != null ? umu0Var : null).getClass();
        ImageView imageView = this.l;
        if (imageView != null) {
            f4m.j(imageView);
            s3q0 s3q0Var = s3q0.a;
        }
        this.m = (NestedScrollView) view.findViewById(R.id.base_auth_scrollable_content_container);
        ((ecu0) this.r.getValue()).c(view, vn());
    }

    @Override // xsna.x65
    public final void qi(String str) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Toast.makeText(activity, str, 1).show();
        }
    }

    public abstract P tn(Bundle bundle);

    public SchemeStatSak$EventScreen u5() {
        return SchemeStatSak$EventScreen.NOWHERE;
    }

    public final otu0 un() {
        return (otu0) this.q.getValue();
    }

    @Override // xsna.x65
    public final void vf(wbu0.a aVar) {
        x65.a.b(this, aVar);
    }

    public boolean vn() {
        return false;
    }

    @Override // xsna.x65
    public final void wa(String str, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2) {
        x65.a.a(this, getString(R.string.vk_auth_error), str, getString(R.string.vk_ok), gzsVar, null, null, true, gzsVar2, null, 256);
    }

    public final View wn(int i, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.vk_auth_base_scrollable_fragment, viewGroup, false);
        ((AppBarShadowView) inflate.findViewById(R.id.appbar_shadow)).setSeparatorAllowed(false);
        ViewStub viewStub = (ViewStub) inflate.findViewById(R.id.base_auth_content_stub);
        viewStub.setLayoutResource(i);
        View inflate2 = viewStub.inflate();
        this.n = inflate2;
        inflate2.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: xsna.x56
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                ((ecu0) a66.this.r.getValue()).getClass();
                ecu0.a(windowInsets);
                return windowInsets;
            }
        });
        return inflate;
    }

    public void xn() {
    }
}
