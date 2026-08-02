package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.vk.common.view.settings.SettingsCheckBoxView;
import com.vk.search.params.api.VkGroupsSearchParams;
import com.vk.search.params.api.domain.model.SearchLocation;
import com.vkontakte.android.R;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.om6;

/* compiled from: GroupsSearchParamsView.kt */
/* loaded from: classes5.dex */
public final class vqu extends om6<VkGroupsSearchParams> {
    public static final /* synthetic */ int p = 0;
    public Spinner k;
    public Spinner l;
    public SettingsCheckBoxView m;
    public final bpn0 n;
    public final boolean o;

    /* compiled from: GroupsSearchParamsView.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<SearchLocation, s3q0> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.izs
        public final s3q0 invoke(SearchLocation searchLocation) {
            vqu vquVar = (vqu) this.receiver;
            int i = vqu.p;
            ((VkGroupsSearchParams) vquVar.getSearchParams()).f = searchLocation;
            ((VkGroupsSearchParams) vquVar.getSearchParams()).b = null;
            vquVar.f(vquVar.b);
            return s3q0.a;
        }
    }

    public vqu(VkGroupsSearchParams vkGroupsSearchParams, Activity activity) {
        super(vkGroupsSearchParams, activity);
        this.n = new bpn0(new w4u(this, 1));
        this.o = true;
        TextView textView = (TextView) findViewById(R.id.tv_cities_title);
        if (textView != null) {
            getLocationParameterInteractor().getClass();
            textView.setText(R.string.search_params_location_param_title);
        }
        TextView selectCityButton = getSelectCityButton();
        if (selectCityButton != null) {
            selectCityButton.setOnClickListener(new ep6(this, 2));
        }
        f(getSearchParams());
    }

    private final cwh0 getLocationParameterInteractor() {
        return (cwh0) this.n.getValue();
    }

    public static void m(vqu vquVar) {
        vquVar.k(vquVar.getLocationParameterInteractor().b(vquVar.getContext(), "search_params_view_location", vquVar.getSearchParams().f).a.a(), "search_location_param");
    }

    @Override // xsna.om6
    public final Object d() {
        return new eru0(getSearchParams());
    }

    @Override // xsna.om6
    public final int g() {
        return R.layout.search_params_groups_no_country;
    }

    @Override // xsna.om6
    public final void h(View view) {
        this.k = (Spinner) view.findViewById(R.id.spinner_type);
        om6.a aVar = new om6.a(getActivity());
        Iterator<E> it = VkGroupsSearchParams.CommunityType.h().iterator();
        while (it.hasNext()) {
            aVar.add(getActivity().getString(((VkGroupsSearchParams.CommunityType) it.next()).j()));
        }
        Spinner spinner = this.k;
        if (spinner != null) {
            spinner.setAdapter((SpinnerAdapter) aVar);
        }
        Spinner spinner2 = this.k;
        if (spinner2 != null) {
            spinner2.setOnItemSelectedListener(new uqu(this));
        }
        Spinner spinner3 = (Spinner) view.findViewById(R.id.spinner_sort);
        this.l = spinner3;
        if (spinner3 != null) {
            spinner3.setSelected(true);
        }
        om6.a aVar2 = new om6.a(getActivity());
        Iterator<E> it2 = VkGroupsSearchParams.SortType.h().iterator();
        while (it2.hasNext()) {
            aVar2.add(getActivity().getString(((VkGroupsSearchParams.SortType) it2.next()).j()));
        }
        Spinner spinner4 = this.l;
        if (spinner4 != null) {
            spinner4.setAdapter((SpinnerAdapter) aVar2);
        }
        Spinner spinner5 = this.l;
        if (spinner5 != null) {
            spinner5.setOnItemSelectedListener(new tqu(this));
        }
        SettingsCheckBoxView settingsCheckBoxView = (SettingsCheckBoxView) view.findViewById(R.id.cb_only_future);
        this.m = settingsCheckBoxView;
        if (settingsCheckBoxView != null) {
            settingsCheckBoxView.setPadding(0, 0, 0, 0);
        }
        SettingsCheckBoxView settingsCheckBoxView2 = this.m;
        if (settingsCheckBoxView2 != null) {
            settingsCheckBoxView2.setTitle(getActivity().getString(R.string.discover_search_only_future));
        }
        SettingsCheckBoxView settingsCheckBoxView3 = this.m;
        if (settingsCheckBoxView3 != null) {
            settingsCheckBoxView3.setOnCheckedChangesListener(new l29(this, 2));
        }
    }

    @Override // xsna.om6
    public final void j(FragmentManager fragmentManager, f5z f5zVar) {
        super.j(fragmentManager, f5zVar);
        fragmentManager.l0("search_params_view_location", f5zVar, getLocationParameterInteractor().a(new a(1, this, vqu.class, "onSelectLocation", "onSelectLocation(Lcom/vk/search/params/api/domain/model/SearchLocation;)V", 0)));
    }

    @Override // xsna.om6
    public final void l(FragmentManager fragmentManager) {
        super.l(fragmentManager);
        fragmentManager.e("search_params_view_location");
    }

    @Override // xsna.om6
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void f(VkGroupsSearchParams vkGroupsSearchParams) {
        String string;
        super.f(vkGroupsSearchParams);
        Spinner spinner = this.k;
        if (spinner != null) {
            spinner.setSelection(vkGroupsSearchParams.c.i());
        }
        Spinner spinner2 = this.l;
        if (spinner2 != null) {
            spinner2.setSelection(vkGroupsSearchParams.d.i());
        }
        SettingsCheckBoxView settingsCheckBoxView = this.m;
        if (settingsCheckBoxView != null) {
            settingsCheckBoxView.setChecked(vkGroupsSearchParams.e);
        }
        if (this.o) {
            TextView selectCityButton = getSelectCityButton();
            if (selectCityButton != null) {
                SearchLocation searchLocation = vkGroupsSearchParams.f;
                if (searchLocation instanceof SearchLocation.City) {
                    string = ((SearchLocation.City) searchLocation).b.c;
                } else if (searchLocation instanceof SearchLocation.CurrentLocation) {
                    string = ((SearchLocation.CurrentLocation) searchLocation).b;
                } else {
                    if (searchLocation != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Context context = getContext();
                    getLocationParameterInteractor().getClass();
                    string = context.getString(R.string.search_params_location_not_selected);
                }
                selectCityButton.setText(string);
            }
            TextView selectCityButton2 = getSelectCityButton();
            if (selectCityButton2 != null) {
                selectCityButton2.setSelected(vkGroupsSearchParams.f != null);
            }
        }
        o();
        i();
    }

    public final void o() {
        if (getSearchParams().c == VkGroupsSearchParams.CommunityType.EVENT) {
            SettingsCheckBoxView settingsCheckBoxView = this.m;
            if (settingsCheckBoxView != null) {
                settingsCheckBoxView.setVisibility(0);
                return;
            }
            return;
        }
        SettingsCheckBoxView settingsCheckBoxView2 = this.m;
        if (settingsCheckBoxView2 != null) {
            settingsCheckBoxView2.setChecked(false);
        }
        SettingsCheckBoxView settingsCheckBoxView3 = this.m;
        if (settingsCheckBoxView3 != null) {
            settingsCheckBoxView3.setVisibility(8);
        }
    }
}
