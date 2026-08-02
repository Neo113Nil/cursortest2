package xsna;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.ArrayList;

/* compiled from: SelectLanguageTranslateOldVc.kt */
/* loaded from: classes6.dex */
public final class g9i0 implements pm6 {
    public final d9i0 a;
    public final View b;
    public final z8i0 c;
    public final Spinner d;
    public final z8i0 e;
    public final Spinner f;

    public g9i0(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, d9i0 d9i0Var) {
        this.a = d9i0Var;
        View inflate = layoutInflater.inflate(R.layout.vkim_select_translate_language_old, viewGroup, false);
        inflate.setClipToOutline(true);
        inflate.setOutlineProvider(new s0w0(cn70.b(12), 4));
        this.b = inflate;
        z8i0 z8i0Var = new z8i0(activity);
        this.c = z8i0Var;
        Spinner spinner = (Spinner) inflate.findViewById(R.id.select_language_original_picker);
        spinner.setAdapter((SpinnerAdapter) z8i0Var);
        spinner.setOnItemSelectedListener(new f9i0(new v4w(this, 28)));
        this.d = spinner;
        z8i0 z8i0Var2 = new z8i0(activity);
        this.e = z8i0Var2;
        Spinner spinner2 = (Spinner) inflate.findViewById(R.id.select_language_translate_picker);
        spinner2.setAdapter((SpinnerAdapter) z8i0Var2);
        spinner2.setOnItemSelectedListener(new f9i0(new e9i0(this, 0)));
        this.f = spinner2;
        TextView textView = (TextView) inflate.findViewById(R.id.select_language_apply_button);
        textView.setOutlineProvider(new s0w0(cn70.b(12), 6));
        textView.setClipToOutline(true);
        textView.setBackgroundDrawable(xus.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, e3m.f(R.attr.vk_ui_icon_accent, textView.getContext()), 0, 254));
        textView.setClickable(true);
        textView.setTextColor(-1);
        jjc.g(textView, new hs00(this, 28));
    }

    @Override // xsna.pm6
    public final void a(c9i0 c9i0Var) {
        zha0 zha0Var = c9i0Var.a;
        this.d.setSelection(zha0Var.c);
        zha0 zha0Var2 = c9i0Var.b;
        this.f.setSelection(zha0Var2.c);
        ArrayList arrayList = zha0Var.b;
        z8i0 z8i0Var = this.c;
        z8i0Var.clear();
        z8i0Var.addAll(arrayList);
        z8i0Var.notifyDataSetChanged();
        ArrayList arrayList2 = zha0Var2.b;
        z8i0 z8i0Var2 = this.e;
        z8i0Var2.clear();
        z8i0Var2.addAll(arrayList2);
        z8i0Var2.notifyDataSetChanged();
    }

    @Override // xsna.pm6
    public final View getView() {
        return this.b;
    }
}
