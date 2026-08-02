package xsna;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Size;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.concurrent.TimeUnit;
import xsna.gzw;
import xsna.ikv0;

/* compiled from: CommunityEditShortNameBottomSheet.kt */
/* loaded from: classes18.dex */
public final class d2h extends dw20 {
    public static final /* synthetic */ int p1 = 0;
    public String f1 = "";
    public final shb g1;
    public final io.reactivex.rxjava3.disposables.b h1;
    public final awg i1;
    public VkImageSimple j1;
    public ViewGroup k1;
    public VkText l1;
    public VkInputSelect m1;
    public View n1;
    public VkSimpleButton o1;

    public d2h() {
        zqu zquVar = new zqu();
        po40 po40Var = new po40();
        shb shbVar = new shb();
        shbVar.a = zquVar;
        shbVar.b = po40Var;
        this.g1 = shbVar;
        this.h1 = new io.reactivex.rxjava3.disposables.b();
        this.i1 = new awg(this, 1);
    }

    public final void Yn() {
        VkInputSelect vkInputSelect = this.m1;
        if (vkInputSelect == null) {
            vkInputSelect = null;
        }
        mhy.d(vkInputSelect);
        View view = this.n1;
        if (view == null) {
            view = null;
        }
        view.setVisibility(8);
        ViewGroup viewGroup = this.k1;
        (viewGroup != null ? viewGroup : null).setVisibility(0);
    }

    public final void Zn(Throwable th) {
        Window window;
        String t = th instanceof VKApiExecutionException ? ((VKApiExecutionException) th).t() : requireContext().getString(R.string.error);
        Dialog dialog = this.s;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        ikv0.a aVar = new ikv0.a(requireContext());
        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_dismiss_substract_24, Integer.valueOf(R.attr.vk_ui_accent_red), (Size) null, 12);
        aVar.u = new ikv0.d(t, (String) null, (ikv0.d.a) null, 6);
        aVar.f = getView();
        aVar.p(window);
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

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
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
        View inflate = View.inflate(requireContext(), R.layout.community_edit_shortname_bottom_sheet, null);
        this.j1 = (VkImageSimple) inflate.findViewById(R.id.close_button);
        this.k1 = (ViewGroup) inflate.findViewById(R.id.content_container);
        VkInputSelect vkInputSelect = (VkInputSelect) inflate.findViewById(R.id.short_address);
        vkInputSelect.setHint(a0a.d);
        this.m1 = vkInputSelect;
        this.l1 = (VkText) inflate.findViewById(R.id.short_address_error);
        this.n1 = inflate.findViewById(R.id.progress_bar);
        this.o1 = (VkSimpleButton) inflate.findViewById(R.id.ready_button);
        com.google.android.material.bottomsheet.b bVar = (com.google.android.material.bottomsheet.b) super.yn(bundle);
        bVar.setContentView(inflate);
        bVar.o().X(3);
        Window window = bVar.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        }
        VkInputSelect vkInputSelect2 = this.m1;
        if (vkInputSelect2 == null) {
            vkInputSelect2 = null;
        }
        mhy.j(vkInputSelect2);
        VkImageSimple vkImageSimple = this.j1;
        if (vkImageSimple == null) {
            vkImageSimple = null;
        }
        jjc.g(vkImageSimple, new t1e(this, 7));
        VkSimpleButton vkSimpleButton = this.o1;
        if (vkSimpleButton == null) {
            vkSimpleButton = null;
        }
        jjc.g(vkSimpleButton, new m4g(this, 4));
        VkInputSelect vkInputSelect3 = this.m1;
        if (vkInputSelect3 == null) {
            vkInputSelect3 = null;
        }
        io.reactivex.rxjava3.internal.operators.observable.y yVar = new io.reactivex.rxjava3.internal.operators.observable.y(new gzw.a(new qno0(vkInputSelect3.getEditText())), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
        az azVar = new az(new wze(this, 6), 18);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        this.h1.b(yVar.E(azVar, lVar, kVar, kVar).y(600L, TimeUnit.MILLISECONDS).U(new fq1(new bz(13), 9)).subscribe(new ez(new com.vk.movika.sdk.base.observable.g(this, 24), 15)));
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("INITIAL_ADDRESS_KEY") : null;
        if (string == null) {
            string = "";
        }
        this.f1 = string;
        VkInputSelect vkInputSelect4 = this.m1;
        if (vkInputSelect4 == null) {
            vkInputSelect4 = null;
        }
        vkInputSelect4.setText(string);
        VkInputSelect vkInputSelect5 = this.m1;
        if (vkInputSelect5 == null) {
            vkInputSelect5 = null;
        }
        vkInputSelect5.setSelection(this.f1.length());
        VkSimpleButton vkSimpleButton2 = this.o1;
        (vkSimpleButton2 != null ? vkSimpleButton2 : null).setEnabled(false);
        return bVar;
    }
}
