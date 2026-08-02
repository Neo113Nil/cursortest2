package xsna;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import xsna.lrv0;

/* compiled from: CommunityEditDescriptionBottomSheet.kt */
/* loaded from: classes18.dex */
public final class c2h extends dw20 {
    public static final /* synthetic */ int p1 = 0;
    public String f1 = "";
    public final vfe g1 = new vfe(3);
    public final io.reactivex.rxjava3.disposables.b h1 = new io.reactivex.rxjava3.disposables.b();
    public final a2h i1 = new lrv0.a() { // from class: xsna.a2h
        @Override // xsna.lrv0.a
        public final void xb() {
            int i = c2h.p1;
            c2h.this.tn();
        }
    };
    public ImageView j1;
    public ViewGroup k1;
    public VkInputSelect l1;
    public VkText m1;
    public VkSpinner n1;
    public VkSimpleButton o1;

    public final void Yn() {
        VkInputSelect vkInputSelect = this.l1;
        if (vkInputSelect == null) {
            vkInputSelect = null;
        }
        mhy.d(vkInputSelect);
        VkSpinner vkSpinner = this.n1;
        if (vkSpinner == null) {
            vkSpinner = null;
        }
        vkSpinner.setVisibility(8);
        ViewGroup viewGroup = this.k1;
        (viewGroup != null ? viewGroup : null).setVisibility(0);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int f = e3m.f(R.attr.vk_ui_background_content, requireContext());
        Window window = kn().getWindow();
        int[] iArr = u1u0.a;
        window.addFlags(Integer.MIN_VALUE);
        window.setNavigationBarColor(f);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.h1.dispose();
    }

    @Override // xsna.dw20, xsna.dh6, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        TypedValue typedValue = krv0.a;
        krv0.k(this.i1);
    }

    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        View decorView;
        TypedValue typedValue = krv0.a;
        krv0.a(this.i1);
        View inflate = View.inflate(requireContext(), R.layout.community_edit_description_bottom_sheet, null);
        this.j1 = (ImageView) inflate.findViewById(R.id.close_button);
        this.k1 = (ViewGroup) inflate.findViewById(R.id.content_container);
        this.l1 = (VkInputSelect) inflate.findViewById(R.id.description);
        this.m1 = (VkText) inflate.findViewById(R.id.description_length_counter);
        this.n1 = (VkSpinner) inflate.findViewById(R.id.progress_bar);
        this.o1 = (VkSimpleButton) inflate.findViewById(R.id.ready_button);
        com.google.android.material.bottomsheet.b bVar = (com.google.android.material.bottomsheet.b) super.yn(bundle);
        bVar.setContentView(inflate);
        bVar.o().X(3);
        Window window = bVar.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        }
        VkInputSelect vkInputSelect = this.l1;
        if (vkInputSelect == null) {
            vkInputSelect = null;
        }
        mhy.j(vkInputSelect);
        ImageView imageView = this.j1;
        if (imageView == null) {
            imageView = null;
        }
        jjc.g(imageView, new dg(this, 29));
        VkSimpleButton vkSimpleButton = this.o1;
        if (vkSimpleButton == null) {
            vkSimpleButton = null;
        }
        jjc.g(vkSimpleButton, new i4e(this, 9));
        VkInputSelect vkInputSelect2 = this.l1;
        if (vkInputSelect2 == null) {
            vkInputSelect2 = null;
        }
        vkInputSelect2.g.addTextChangedListener(new w0v0(new m1y0(this, 1)));
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("DESCRIPTION_KEY") : null;
        if (string == null) {
            string = "";
        }
        this.f1 = string;
        VkInputSelect vkInputSelect3 = this.l1;
        if (vkInputSelect3 == null) {
            vkInputSelect3 = null;
        }
        vkInputSelect3.setText(string);
        VkInputSelect vkInputSelect4 = this.l1;
        (vkInputSelect4 != null ? vkInputSelect4 : null).setSelection(this.f1.length());
        return bVar;
    }
}
