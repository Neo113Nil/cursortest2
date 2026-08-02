package xsna;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.translate.impl.models.LanguageModel;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: SelectLanguageTranslateVc.kt */
/* loaded from: classes6.dex */
public final class i9i0 implements pm6 {
    public final LayoutInflater a;
    public final d9i0 b;
    public final View c;
    public final VkInputSelect d;
    public final VkInputSelect e;
    public List<mai0> f;
    public List<mai0> g;
    public LanguageModel h;
    public LanguageModel i;

    /* JADX WARN: Multi-variable type inference failed */
    public i9i0(LayoutInflater layoutInflater, ViewGroup viewGroup, d9i0 d9i0Var) {
        this.a = layoutInflater;
        this.b = d9i0Var;
        layoutInflater.getContext();
        View inflate = layoutInflater.inflate(R.layout.vkim_select_translate_language, viewGroup, false);
        inflate.setClipToOutline(true);
        inflate.setOutlineProvider(new s0w0(e3m.a(R.dimen.vk_ui_spacing_size_xl, inflate.getContext()), 4));
        this.c = inflate;
        VkTopBar vkTopBar = (VkTopBar) inflate.findViewById(R.id.select_language_title);
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(inflate.getContext().getString(R.string.vkim_translate_language_picker_title), (e4) null, (VkTopBar.Middle.Text.Title.a) null, (VkTopBar.Middle.Text.Title.Size) null, 14), null, null, null, 14));
        vkTopBar.setBefore(new VkTopBar.c.d(0 == true ? 1 : 0, new mqe0(this, 5), 0 == true ? 1 : 0, null, 13));
        vkTopBar.setAfter(null);
        VkInputSelect vkInputSelect = (VkInputSelect) inflate.findViewById(R.id.select_language_original_picker);
        vkInputSelect.getEditText().setFocusable(false);
        vkInputSelect.getEditText().setFocusableInTouchMode(false);
        jjc.g(vkInputSelect, new mz80(12, this, vkInputSelect));
        this.d = vkInputSelect;
        VkInputSelect vkInputSelect2 = (VkInputSelect) inflate.findViewById(R.id.select_language_translate_picker);
        vkInputSelect2.getEditText().setFocusable(false);
        vkInputSelect2.getEditText().setFocusableInTouchMode(false);
        jjc.g(vkInputSelect2, new h9i0(0, this, vkInputSelect2));
        this.e = vkInputSelect2;
        VkText vkText = (VkText) inflate.findViewById(R.id.select_language_original_picker_title);
        abg0 abg0Var = dhr0.t;
        vkText.setTextColor(abg0Var.c(R.attr.vk_ui_text_subhead));
        ((VkText) inflate.findViewById(R.id.select_language_translate_picker_title)).setTextColor(abg0Var.c(R.attr.vk_ui_text_subhead));
        jjc.g((VkButton) inflate.findViewById(R.id.select_language_apply_button), new gib0(this, 8));
        EmptyList emptyList = EmptyList.b;
        this.f = emptyList;
        this.g = emptyList;
    }

    @Override // xsna.pm6
    public final void a(c9i0 c9i0Var) {
        zha0 zha0Var = c9i0Var.a;
        LanguageModel languageModel = zha0Var.a;
        this.h = languageModel;
        zha0 zha0Var2 = c9i0Var.b;
        LanguageModel languageModel2 = zha0Var2.a;
        this.i = languageModel2;
        this.f = zha0Var.b;
        this.g = zha0Var2.b;
        this.d.setText(languageModel.g());
        this.e.setText(languageModel2.g());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(View view, List<mai0> list, LanguageModel languageModel, izs<? super LanguageModel, s3q0> izsVar) {
        String str;
        this.a.getContext();
        int c = dhr0.t.c(R.attr.vk_ui_text_secondary);
        List<mai0> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (mai0 mai0Var : list2) {
            boolean z = mai0Var.b;
            LanguageModel languageModel2 = mai0Var.a;
            if (z) {
                str = languageModel2.g();
            } else {
                SpannableString spannableString = new SpannableString(languageModel2.g());
                spannableString.setSpan(new ForegroundColorSpan(c), 0, spannableString.length(), 33);
                str = spannableString;
            }
            arrayList.add(new VkContextMenu.a(str, null, null, epx.f(languageModel2, languageModel), false, new s(mai0Var, izsVar), 22));
        }
        int l = krv0.l(R.attr.vk_ui_icon_accent);
        view.getContext();
        e.b bVar = new e.b(view, null, null, l, 6);
        bVar.w = R.layout.ds_internal_context_menu_item;
        bVar.h(arrayList);
        bVar.l(false);
    }

    @Override // xsna.pm6
    public final View getView() {
        return this.c;
    }
}
