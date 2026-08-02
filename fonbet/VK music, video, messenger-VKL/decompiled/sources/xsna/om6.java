package xsna;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.vk.search.params.api.City;
import com.vk.search.params.api.SearchParamsWithCity;
import com.vk.superapp.api.dto.identity.WebCity;
import com.vk.toggle.Features;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.cities.CitySelectFragment;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: BaseSearchParamsView.kt */
/* loaded from: classes5.dex */
public abstract class om6<T extends SearchParamsWithCity> extends FrameLayout implements w8i {
    public static final /* synthetic */ int j = 0;
    public final T b;
    public final Activity c;
    public boolean d;
    public final mm6 e;
    public final TextView f;
    public TextView g;
    public exh0 h;
    public final bpn0 i;

    /* compiled from: BaseSearchParamsView.kt */
    public static class a<T> extends ArrayAdapter<T> {
        public a(Activity activity) {
            super(activity, R.layout.vk_discover_search_spinner_selected);
            setDropDownViewResource(R.layout.vk_discover_search_spinner_dropdown);
        }
    }

    /* compiled from: BaseSearchParamsView.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<City, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(City city) {
            ((om6) this.receiver).setSelectedCity(city);
            return s3q0.a;
        }
    }

    public om6(T t, Activity activity) {
        super(activity);
        this.b = t;
        this.c = activity;
        this.e = new mm6(this, 0);
        this.i = new bpn0(new zg(this, 6));
        this.d = true;
        setBackgroundColor(-1);
        setOnClickListener(new nm6());
        View inflate = LayoutInflater.from(getContext()).inflate(g(), (ViewGroup) this, true);
        h(inflate);
        this.f = (TextView) hvt0.a(R.id.tv_reset, inflate, new ul1(this, 9));
        int i = 7;
        TextView textView = (TextView) hvt0.a(R.id.tv_cities, inflate, new com.vk.movika.sdk.base.observable.g(this, i));
        this.g = textView;
        if (textView != null) {
            Context context = getContext();
            int f = e3m.f(R.attr.vk_ui_field_background, context);
            int f2 = e3m.f(R.attr.vk_ui_field_background, context);
            int f3 = e3m.f(R.attr.vk_ui_stroke_accent, context);
            int f4 = e3m.f(R.attr.vk_ui_field_border_alpha, context);
            int i2 = wvv0.a;
            textView.setBackground(wvv0.a(context, R.drawable.vkui_bg_edittext, f, f2, f3, f4));
        }
        this.d = false;
        f(t);
        i();
    }

    public static s3q0 a(om6 om6Var) {
        Features.Type type = Features.Type.FEATURE_SEARCH_GLOBAL_NEW_CITY_PICKER;
        type.getClass();
        if (com.vk.toggle.b.A.a(type)) {
            om6Var.k(om6Var.getCityParameterInteractor().c(om6Var.getContext(), "search_params_view_city").a.a(), "search_city_param");
        } else {
            CitySelectFragment citySelectFragment = new CitySelectFragment();
            citySelectFragment.setArguments(om6Var.getCityListArguments());
            citySelectFragment.O = om6Var.e;
            ComponentCallbacks2 componentCallbacks2 = om6Var.c;
            if (componentCallbacks2 instanceof xbs) {
                citySelectFragment.Fn(((xbs) componentCallbacks2).n(), "search_city_param");
            }
        }
        return s3q0.a;
    }

    public static void b(om6 om6Var, WebCity webCity) {
        om6Var.setSelectedCity(webCity);
    }

    private final pnh0 getCityParameterInteractor() {
        return (pnh0) this.i.getValue();
    }

    private final FragmentManager getDialogFragmentManager() {
        vbs n;
        FragmentManager b2;
        exh0 exh0Var = this.h;
        if (exh0Var != null && (b2 = exh0Var.b()) != null) {
            return b2;
        }
        ComponentCallbacks2 componentCallbacks2 = this.c;
        xbs xbsVar = componentCallbacks2 instanceof xbs ? (xbs) componentCallbacks2 : null;
        if (xbsVar == null || (n = xbsVar.n()) == null) {
            return null;
        }
        return n.a;
    }

    private final void setSelectedCity(WebCity webCity) {
        setSelectedCity(webCity != null ? new City(webCity.b, webCity.c, null, null, 12, null) : null);
    }

    public abstract Object d();

    public boolean e() {
        return true;
    }

    public void f(T t) {
        setSelectedCity(t.b);
    }

    public abstract int g();

    public final Activity getActivity() {
        return this.c;
    }

    public final boolean getBlockChanges() {
        return this.d;
    }

    public Bundle getCityListArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("hint", this.c.getString(R.string.vk_discover_search_choose_a_city));
        bundle.putBoolean("show_none", this.b.d() > 0);
        return bundle;
    }

    public final exh0 getDialogNavigator() {
        return this.h;
    }

    public final T getSearchParams() {
        return this.b;
    }

    public final TextView getSelectCityButton() {
        return this.g;
    }

    public abstract void h(View view);

    public void i() {
        ysg0<Object> ysg0Var = ysg0.b;
        T t = this.b;
        ysg0Var.a(new kru0(t));
        TextView textView = this.f;
        if (textView != null) {
            textView.setVisibility(t.I() ? 8 : 0);
        }
    }

    public void j(FragmentManager fragmentManager, f5z f5zVar) {
        fragmentManager.l0("search_params_view_city", f5zVar, getCityParameterInteractor().a(new b(1, this, om6.class, "setSelectedCity", "setSelectedCity(Lcom/vk/search/params/api/City;)V", 0)));
    }

    public final void k(dw20 dw20Var, String str) {
        FragmentManager dialogFragmentManager = getDialogFragmentManager();
        if (dialogFragmentManager == null) {
            return;
        }
        exh0 exh0Var = this.h;
        if (exh0Var != null) {
            exh0Var.a(dw20Var);
        } else {
            dw20Var.Td(dialogFragmentManager, str);
        }
    }

    public void l(FragmentManager fragmentManager) {
        fragmentManager.f("search_params_view_city");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        FragmentManager dialogFragmentManager = getDialogFragmentManager();
        if (dialogFragmentManager == null) {
            return;
        }
        ComponentCallbacks2 componentCallbacks2 = this.c;
        f5z f5zVar = componentCallbacks2 instanceof f5z ? (f5z) componentCallbacks2 : null;
        if (f5zVar == null) {
            return;
        }
        j(dialogFragmentManager, f5zVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        FragmentManager dialogFragmentManager = getDialogFragmentManager();
        if (dialogFragmentManager == null) {
            return;
        }
        l(dialogFragmentManager);
    }

    public final void setBlockChanges(boolean z) {
        this.d = z;
    }

    public final void setDialogNavigator(exh0 exh0Var) {
        if (this.h == exh0Var) {
            return;
        }
        FragmentManager dialogFragmentManager = getDialogFragmentManager();
        exh0 exh0Var2 = this.h;
        if (exh0Var2 != null) {
            exh0Var2.release();
        }
        this.h = exh0Var;
        if (dialogFragmentManager == null || dialogFragmentManager == exh0Var.b()) {
            return;
        }
        l(dialogFragmentManager);
        FragmentManager b2 = exh0Var.b();
        ComponentCallbacks2 componentCallbacks2 = this.c;
        f5z f5zVar = componentCallbacks2 instanceof f5z ? (f5z) componentCallbacks2 : null;
        if (f5zVar == null) {
            return;
        }
        j(b2, f5zVar);
    }

    public final void setSelectCityButton(TextView textView) {
        this.g = textView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSelectedCity(City city) {
        if (this.d) {
            return;
        }
        T t = this.b;
        if (city != null && city.b > 0) {
            t.b = city;
            TextView textView = this.g;
            if (textView != null) {
                textView.setText(city.c);
            }
            TextView textView2 = this.g;
            if (textView2 != null) {
                textView2.setSelected(true);
            }
        } else {
            t.b = null;
            TextView textView3 = this.g;
            if (textView3 != null) {
                textView3.setText(R.string.vk_discover_search_city);
            }
            TextView textView4 = this.g;
            if (textView4 != null) {
                textView4.setSelected(false);
            }
        }
        i();
    }
}
