package xsna;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.vk.search.models.VkPeopleSearchParams;
import com.vk.search.models.VkRelation;
import com.vk.superapp.api.dto.common.SearchParams;
import com.vk.superapp.api.dto.identity.WebCity;
import com.vkontakte.android.R;

/* compiled from: VkBaseSearchParamsView.kt */
/* loaded from: classes5.dex */
public abstract class teu0<T extends SearchParams> extends FrameLayout {
    public static final /* synthetic */ int g = 0;
    public final VkPeopleSearchParams b;
    public final Fragment c;
    public boolean d;
    public final FragmentActivity e;
    public TextView f;

    /* compiled from: VkBaseSearchParamsView.kt */
    public static class a<T> extends ArrayAdapter<T> {
        public a(FragmentActivity fragmentActivity) {
            super(fragmentActivity, R.layout.vk_discover_search_spinner_selected);
            setDropDownViewResource(R.layout.vk_discover_search_spinner_dropdown);
        }
    }

    public teu0(VkPeopleSearchParams vkPeopleSearchParams, lgv0 lgv0Var) {
        super(lgv0Var.kn());
        Drawable findDrawableByLayerId;
        this.b = vkPeopleSearchParams;
        this.c = lgv0Var;
        this.d = true;
        this.e = lgv0Var.kn();
        this.d = true;
        setBackgroundColor(-1);
        setOnClickListener(new imp(1));
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.vk_search_params_people_no_country, (ViewGroup) this, true);
        lcv0 lcv0Var = (lcv0) this;
        lcv0Var.h = (TextView) hvt0.a(R.id.tv_any, inflate, new whg0(lcv0Var, 27));
        int i = 14;
        lcv0Var.i = (TextView) hvt0.a(R.id.tv_male, inflate, new xim0(lcv0Var, i));
        lcv0Var.j = (TextView) hvt0.a(R.id.tv_female, inflate, new yka0(lcv0Var, 28));
        ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{android.R.attr.state_selected}, new int[0]}, new int[]{e3m.f(R.attr.vk_ui_text_contrast_themed, lcv0Var.getContext()), e3m.f(R.attr.vk_ui_text_primary, lcv0Var.getContext())});
        TextView textView = lcv0Var.h;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
        TextView textView2 = lcv0Var.i;
        if (textView2 != null) {
            textView2.setTextColor(colorStateList);
        }
        TextView textView3 = lcv0Var.j;
        if (textView3 != null) {
            textView3.setTextColor(colorStateList);
        }
        lcv0Var.k = (Spinner) inflate.findViewById(R.id.spinner_age_from);
        lcv0Var.l = (Spinner) inflate.findViewById(R.id.spinner_age_to);
        a aVar = new a(lcv0Var.getActivity());
        aVar.add(lcv0Var.getContext().getString(R.string.vk_from));
        a aVar2 = new a(lcv0Var.getActivity());
        aVar2.add(lcv0Var.getContext().getString(R.string.vk_to));
        while (i < 81) {
            aVar.add(lcv0Var.getContext().getString(R.string.vk_age_from, Integer.valueOf(i)));
            aVar2.add(lcv0Var.getContext().getString(R.string.vk_age_to, Integer.valueOf(i)));
            i++;
        }
        Spinner spinner = lcv0Var.k;
        if (spinner != null) {
            spinner.setAdapter((SpinnerAdapter) aVar);
        }
        Spinner spinner2 = lcv0Var.l;
        if (spinner2 != null) {
            spinner2.setAdapter((SpinnerAdapter) aVar2);
        }
        Spinner spinner3 = lcv0Var.k;
        if (spinner3 != null) {
            spinner3.setOnItemSelectedListener(new icv0(lcv0Var));
        }
        Spinner spinner4 = lcv0Var.l;
        if (spinner4 != null) {
            spinner4.setOnItemSelectedListener(new jcv0(lcv0Var));
        }
        lcv0Var.m = (Spinner) inflate.findViewById(R.id.spinner_relationships);
        wfv0 wfv0Var = new wfv0(lcv0Var.getContext(), VkRelation.values());
        wfv0Var.setDropDownViewResource(R.layout.vk_discover_search_spinner_dropdown);
        Spinner spinner5 = lcv0Var.m;
        if (spinner5 != null) {
            spinner5.setAdapter((SpinnerAdapter) wfv0Var);
        }
        Spinner spinner6 = lcv0Var.m;
        if (spinner6 != null) {
            spinner6.setOnItemSelectedListener(new kcv0(lcv0Var, wfv0Var));
        }
        int f = e3m.f(R.attr.vk_ui_icon_secondary, lcv0Var.getContext());
        for (Spinner spinner7 : e43.l(lcv0Var.k, lcv0Var.l, lcv0Var.m)) {
            Drawable background = spinner7 != null ? spinner7.getBackground() : null;
            LayerDrawable layerDrawable = background instanceof LayerDrawable ? (LayerDrawable) background : null;
            if (layerDrawable != null && (findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.layer_icon)) != null) {
                findDrawableByLayerId.setColorFilter(new PorterDuffColorFilter(f, PorterDuff.Mode.SRC_ATOP));
            }
        }
        TextView textView4 = (TextView) hvt0.a(R.id.tv_cities, inflate, new kyq0(lcv0Var, 8));
        this.f = textView4;
        if (textView4 != null) {
            int i2 = wvv0.a;
            textView4.setBackground(wvv0.b(getContext()));
        }
        TextView textView5 = (TextView) hvt0.a(R.id.tv_apply_params, inflate, new ujm0(lcv0Var, 13));
        if (textView5 != null) {
            sp.t(textView5);
        }
        this.d = false;
        a(vkPeopleSearchParams);
        c();
    }

    private final void setSelectedCity(WebCity webCity) {
        if (this.d) {
            return;
        }
        VkPeopleSearchParams vkPeopleSearchParams = this.b;
        if (webCity == null || webCity.b <= 0) {
            vkPeopleSearchParams.zb(null);
            TextView textView = this.f;
            if (textView != null) {
                textView.setText(R.string.vk_discover_search_city);
            }
            TextView textView2 = this.f;
            if (textView2 != null) {
                textView2.setSelected(false);
            }
        } else {
            vkPeopleSearchParams.zb(webCity);
            TextView textView3 = this.f;
            if (textView3 != null) {
                textView3.setText(webCity.c);
            }
            TextView textView4 = this.f;
            if (textView4 != null) {
                textView4.setSelected(true);
            }
        }
        c();
    }

    public void a(T t) {
        setSelectedCity(t.c);
    }

    public final void b(int i, int i2, Intent intent) {
        if (i == 747 && i2 == -1) {
            setSelectedCity(intent != null ? (WebCity) intent.getParcelableExtra("city") : null);
        }
    }

    public final void c() {
        ysg0.b.a(new lru0(this.b));
    }

    public final FragmentActivity getActivity() {
        return this.e;
    }

    public final boolean getBlockChanges() {
        return this.d;
    }

    public final Fragment getFragment() {
        return this.c;
    }

    public final T getSearchParams() {
        return this.b;
    }

    public final TextView getSelectCityButton() {
        return this.f;
    }

    public final void setBlockChanges(boolean z) {
        this.d = z;
    }

    public final void setSelectCityButton(TextView textView) {
        this.f = textView;
    }
}
