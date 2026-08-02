package xsna;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.Group;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.vk.common.view.BottomSheetWebView;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vkontakte.android.R;
import xsna.dh6;
import xsna.dw20;
import xsna.ify;

/* compiled from: WebViewBottomSheet.kt */
/* loaded from: classes2.dex */
public final class hix0 extends dw20 {
    public static final /* synthetic */ int l1 = 0;
    public Toolbar f1;
    public BottomSheetWebView g1;
    public Group h1;
    public f98 i1;
    public boolean j1;
    public final b k1 = new b();

    public static final void Yn(hix0 hix0Var) {
        BottomSheetWebView bottomSheetWebView = hix0Var.g1;
        if (bottomSheetWebView == null || !bottomSheetWebView.canGoBack()) {
            Toolbar toolbar = hix0Var.f1;
            if (toolbar != null) {
                toolbar.setNavigationIcon(dhr0.t.b(R.drawable.vk_icon_cancel_outline_28, R.attr.vk_ui_icon_accent_themed));
                return;
            }
            return;
        }
        Toolbar toolbar2 = hix0Var.f1;
        if (toolbar2 != null) {
            toolbar2.setNavigationIcon(dhr0.t.b(R.drawable.vk_icon_arrow_left_outline_28, R.attr.vk_ui_icon_accent_themed));
        }
    }

    @Override // xsna.dw20
    public final boolean a0() {
        BottomSheetWebView bottomSheetWebView = this.g1;
        if (bottomSheetWebView == null || !bottomSheetWebView.canGoBack()) {
            return false;
        }
        bottomSheetWebView.goBack();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        MenuItem add = menu.add(0, R.id.vk_menu_more, 0, R.string.accessibility_actions);
        add.setShowAsAction(2);
        add.setIcon(dhr0.t.b(R.drawable.vk_icon_more_vertical_28, R.attr.vk_ui_icon_accent_themed));
        add.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: xsna.gix0
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                hix0 hix0Var = hix0.this;
                View findViewById = hix0Var.f1.findViewById(R.id.vk_menu_more);
                int l = krv0.l(R.attr.vk_ui_icon_accent);
                findViewById.getContext();
                e.b bVar = new e.b(findViewById, null, null, l, 6);
                bVar.w = R.layout.ds_internal_context_menu_item;
                bVar.m = iah0.a(12);
                VkContextMenu.c.c(bVar, R.string.refresh_page, null, false, null, new sgt0(hix0Var, 11), 24);
                bVar.j();
                return false;
            }
        });
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Context context;
        super.onDestroyView();
        int i = ify.a;
        ify.g(this.k1);
        this.f1 = null;
        BottomSheetWebView bottomSheetWebView = this.g1;
        if (bottomSheetWebView != null && (context = bottomSheetWebView.getContext()) != null) {
            context.setTheme(dhr0.C().c);
        }
        this.g1 = null;
        this.h1 = null;
    }

    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.webview_bottom_sheet, (ViewGroup) null, false);
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(dhr0.t.b(R.drawable.vk_icon_cancel_outline_28, R.attr.vk_ui_icon_accent_themed));
        toolbar.setNavigationContentDescription(R.string.accessibility_close);
        toolbar.setNavigationOnClickListener(new en9(this, 14));
        toolbar.setTitle(requireArguments().getString(NativeAdContent.ViewTag.AD_TITLE));
        onCreateOptionsMenu(toolbar.getMenu(), kn().getMenuInflater());
        toolbar.setOnTouchListener(new mko0(this, 1));
        this.f1 = toolbar;
        BottomSheetWebView bottomSheetWebView = (BottomSheetWebView) inflate.findViewById(R.id.webview);
        bottomSheetWebView.getContext().setTheme(dhr0.M() ? R.style.VkWebViewDarkTheme : R.style.VkWebViewLightTheme);
        bottomSheetWebView.getSettings().setAllowFileAccess(true);
        bottomSheetWebView.getSettings().setDomStorageEnabled(true);
        bottomSheetWebView.getSettings().setCacheMode(-1);
        bottomSheetWebView.getSettings().setSupportMultipleWindows(true);
        bottomSheetWebView.getSettings().setJavaScriptEnabled(true);
        bottomSheetWebView.setWebViewClient(new jix0(this));
        f98 f98Var = this.i1;
        bottomSheetWebView.setWebChromeClient(new iix0(new v6j(f98Var), this, f98Var));
        bottomSheetWebView.loadUrl(requireArguments().getString("URL", ""));
        this.g1 = bottomSheetWebView;
        this.h1 = (Group) inflate.findViewById(R.id.error_group);
        bwt0.i0(inflate.findViewById(R.id.error_retry), new skj0(this, 29));
        inflate.setClipToOutline(true);
        inflate.setOutlineProvider(new t0w0(4, iah0.b(12.0f), false, false));
        dw20.Rn(this, inflate, 4);
        int i = ify.a;
        ify.a(this.k1);
        return super.yn(bundle);
    }

    /* compiled from: WebViewBottomSheet.kt */
    public static final class b implements ify.a {
        public b() {
        }

        @Override // xsna.ify.a
        public final void x0(int i) {
            Dialog dialog = hix0.this.s;
            nw20 nw20Var = dialog instanceof nw20 ? (nw20) dialog : null;
            if (nw20Var == null) {
                return;
            }
            i0q0.d(100L, new sx3(nw20Var, 14));
        }

        @Override // xsna.ify.a
        public final void Y0() {
        }
    }

    /* compiled from: WebViewBottomSheet.kt */
    public static final class a extends dw20.b {
        public final String e;
        public final String f;
        public final f98 g;

        public a(Context context, String str, String str2, f98 f98Var, dh6.a aVar) {
            super(context, aVar);
            this.e = str;
            this.f = str2;
            this.g = f98Var;
            c(new ts90(0.72f, 2));
            F0(true);
            x(0);
            u(0);
            G0();
            l(dhr0.t.c(R.attr.vk_ui_background_content));
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            hix0 hix0Var = new hix0();
            Bundle bundle = new Bundle();
            bundle.putString(NativeAdContent.ViewTag.AD_TITLE, this.e);
            bundle.putString("URL", this.f);
            hix0Var.setArguments(bundle);
            n(new C3001a(hix0Var));
            hix0Var.i1 = this.g;
            return hix0Var;
        }

        /* compiled from: WebViewBottomSheet.kt */
        /* renamed from: xsna.hix0$a$a, reason: collision with other inner class name */
        public static final class C3001a extends ModalBottomSheetBehavior.d {
            public final /* synthetic */ hix0 a;

            public C3001a(hix0 hix0Var) {
                this.a = hix0Var;
            }

            @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
            public final void b(int i, View view) {
                BottomSheetWebView bottomSheetWebView;
                ModalBottomSheetBehavior<ViewGroup> modalBottomSheetBehavior;
                hix0 hix0Var = this.a;
                if (i != 1 || (bottomSheetWebView = hix0Var.g1) == null || !bottomSheetWebView.getInterceptScrollEvent() || hix0Var.j1) {
                    if (i == 5) {
                        hix0Var.dismiss();
                    }
                } else {
                    Dialog dialog = hix0Var.s;
                    nw20 nw20Var = dialog instanceof nw20 ? (nw20) dialog : null;
                    if (nw20Var == null || (modalBottomSheetBehavior = nw20Var.i) == null) {
                        return;
                    }
                    modalBottomSheetBehavior.O(3);
                }
            }

            @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
            public final void a(View view, float f) {
            }
        }
    }
}
