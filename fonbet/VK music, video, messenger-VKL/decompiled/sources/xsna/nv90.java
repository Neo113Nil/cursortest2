package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.tabs.TabLayout;
import com.vk.core.view.components.segmented.control.VkSegmentedControl;
import com.vk.search.models.VkRelation;
import com.vk.search.params.api.VkPeopleSearchParams;
import com.vk.search.params.api.di.SearchParamsComponent;
import com.vkontakte.android.R;
import java.util.HashSet;
import xsna.om6;

/* compiled from: PeopleSearchParamsView.kt */
/* loaded from: classes5.dex */
public final class nv90 extends om6<VkPeopleSearchParams> {
    public TabLayout.g k;
    public TabLayout.g l;
    public TabLayout.g m;
    public Spinner n;
    public Spinner o;
    public Spinner p;
    public xbq q;

    /* compiled from: PeopleSearchParamsView.kt */
    public final class a {
        public a() {
        }

        public final VkPeopleSearchParams a() {
            return nv90.this.getSearchParams();
        }

        public final void b(VkPeopleSearchParams vkPeopleSearchParams) {
            nv90 nv90Var = nv90.this;
            if (nv90Var.getSearchParams() != vkPeopleSearchParams) {
                nv90Var.getSearchParams().h5(vkPeopleSearchParams);
            }
            nv90Var.i();
        }
    }

    public static s3q0 m(nv90 nv90Var, int i) {
        if (i == 0) {
            nv90Var.setGender(0);
        } else if (i == 1) {
            nv90Var.setGender(2);
        } else if (i == 2) {
            nv90Var.setGender(1);
        }
        return s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAgeFrom(int i) {
        Spinner spinner;
        if (getBlockChanges()) {
            return;
        }
        getSearchParams().d = i;
        if (getSearchParams().e < getSearchParams().d && getSearchParams().e > 0 && (spinner = this.o) != null) {
            spinner.setSelection(getSearchParams().d - 13);
        }
        Spinner spinner2 = this.n;
        if (spinner2 != null) {
            spinner2.setSelected(getSearchParams().d != 0);
        }
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAgeTo(int i) {
        Spinner spinner;
        if (getBlockChanges()) {
            return;
        }
        getSearchParams().e = i;
        if (getSearchParams().d > getSearchParams().e && getSearchParams().e > 0 && (spinner = this.n) != null) {
            spinner.setSelection(getSearchParams().e - 13);
        }
        Spinner spinner2 = this.o;
        if (spinner2 != null) {
            spinner2.setSelected(getSearchParams().e != 0);
        }
        i();
    }

    private final void setGender(int i) {
        SpinnerAdapter adapter;
        if (getBlockChanges()) {
            return;
        }
        getSearchParams().c = i;
        if (i == 1) {
            TabLayout.g gVar = this.m;
            if (gVar != null) {
                gVar.j();
            }
        } else if (i != 2) {
            TabLayout.g gVar2 = this.k;
            if (gVar2 != null) {
                gVar2.j();
            }
        } else {
            TabLayout.g gVar3 = this.l;
            if (gVar3 != null) {
                gVar3.j();
            }
        }
        Spinner spinner = this.p;
        if (spinner != null && (adapter = spinner.getAdapter()) != null) {
            wfv0 wfv0Var = (wfv0) adapter;
            boolean z = i != 1;
            if (wfv0Var.b != z) {
                wfv0Var.b = z;
                wfv0Var.notifyDataSetChanged();
            }
        }
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRelationship(VkRelation vkRelation) {
        if (getBlockChanges()) {
            return;
        }
        VkPeopleSearchParams searchParams = getSearchParams();
        if (vkRelation == null) {
            VkRelation vkRelation2 = VkPeopleSearchParams.i;
            vkRelation = VkPeopleSearchParams.i;
        }
        searchParams.f = vkRelation;
        Spinner spinner = this.p;
        if (spinner != null) {
            VkRelation vkRelation3 = getSearchParams().f;
            VkRelation vkRelation4 = VkPeopleSearchParams.i;
            spinner.setSelected(vkRelation3 != VkPeopleSearchParams.i);
        }
        i();
    }

    @Override // xsna.om6
    public final Object d() {
        return new mru0(getSearchParams(), true);
    }

    @Override // xsna.om6
    public final boolean e() {
        return this.q == null;
    }

    @Override // xsna.om6
    public final void f(VkPeopleSearchParams vkPeopleSearchParams) {
        VkPeopleSearchParams vkPeopleSearchParams2 = vkPeopleSearchParams;
        super.f(vkPeopleSearchParams2);
        setGender(vkPeopleSearchParams2.c);
        int i = vkPeopleSearchParams2.d;
        if (i < 14 || i > 80) {
            Spinner spinner = this.n;
            if (spinner != null) {
                spinner.setSelection(0);
            }
        } else {
            Spinner spinner2 = this.n;
            if (spinner2 != null) {
                spinner2.setSelection(i - 13);
            }
        }
        int i2 = vkPeopleSearchParams2.e;
        if (i2 < 14 || i2 > 80) {
            Spinner spinner3 = this.o;
            if (spinner3 != null) {
                spinner3.setSelection(0);
            }
        } else {
            Spinner spinner4 = this.o;
            if (spinner4 != null) {
                spinner4.setSelection(i2 - 13);
            }
        }
        Spinner spinner5 = this.p;
        if (spinner5 != null) {
            VkRelation vkRelation = vkPeopleSearchParams2.f;
            if (vkRelation != null) {
                SpinnerAdapter adapter = spinner5.getAdapter();
                int count = adapter.getCount();
                int i3 = 0;
                while (true) {
                    if (i3 >= count) {
                        spinner5.setSelection(0);
                        break;
                    } else {
                        if (vkRelation.equals(adapter.getItem(i3))) {
                            spinner5.setSelection(i3);
                            break;
                        }
                        i3++;
                    }
                }
            } else {
                spinner5.setSelection(0);
            }
        }
        i();
    }

    @Override // xsna.om6
    public final int g() {
        q();
        return this.q != null ? R.layout.search_params_people_filter_dialog : R.layout.vk_search_params_people_no_country_vkui;
    }

    @Override // xsna.om6
    public final void h(View view) {
        Drawable background;
        q();
        VkSegmentedControl vkSegmentedControl = (VkSegmentedControl) view.findViewById(R.id.tv_gender);
        vkSegmentedControl.setCustomTabView(new f410(vkSegmentedControl, 19));
        vkSegmentedControl.setSegmentSize(VkSegmentedControl.SegmentSize.Medium);
        Context context = vkSegmentedControl.getContext();
        HashSet hashSet = iah0.a;
        if (fnj.d(context)) {
            vkSegmentedControl.setForceScrolling(false);
        }
        TabLayout.g p = vkSegmentedControl.p();
        p.p(R.string.vk_discover_search_gender_any);
        vkSegmentedControl.i(p, true);
        p.n(R.id.tv_any);
        this.k = p;
        TabLayout.g p2 = vkSegmentedControl.p();
        p2.p(R.string.vk_discover_search_gender_male);
        vkSegmentedControl.i(p2, false);
        p2.n(R.id.tv_male);
        this.l = p2;
        TabLayout.g p3 = vkSegmentedControl.p();
        p3.p(R.string.vk_discover_search_gender_female);
        vkSegmentedControl.i(p3, false);
        p3.n(R.id.tv_female);
        this.m = p3;
        vkSegmentedControl.setOnSelectTabPosition(new hb40(this, 7));
        this.n = (Spinner) view.findViewById(R.id.spinner_age_from);
        this.o = (Spinner) view.findViewById(R.id.spinner_age_to);
        om6.a aVar = new om6.a(getActivity());
        aVar.add(getActivity().getResources().getString(R.string.vk_from));
        om6.a aVar2 = new om6.a(getActivity());
        aVar2.add(getActivity().getResources().getString(R.string.vk_to));
        for (int i = 14; i < 81; i++) {
            aVar.add(getActivity().getResources().getString(R.string.vk_age_from, Integer.valueOf(i)));
            aVar2.add(getActivity().getResources().getString(R.string.vk_age_to, Integer.valueOf(i)));
        }
        Spinner spinner = this.n;
        if (spinner != null) {
            spinner.setAdapter((SpinnerAdapter) aVar);
        }
        Spinner spinner2 = this.o;
        if (spinner2 != null) {
            spinner2.setAdapter((SpinnerAdapter) aVar2);
        }
        Spinner spinner3 = this.n;
        if (spinner3 != null) {
            spinner3.setOnItemSelectedListener(new ov90(this));
        }
        Spinner spinner4 = this.o;
        if (spinner4 != null) {
            spinner4.setOnItemSelectedListener(new pv90(this));
        }
        this.p = (Spinner) view.findViewById(R.id.spinner_relationships);
        wfv0 wfv0Var = new wfv0(getActivity(), VkRelation.values());
        wfv0Var.setDropDownViewResource(R.layout.vk_discover_search_spinner_dropdown);
        Spinner spinner5 = this.p;
        if (spinner5 != null) {
            spinner5.setAdapter((SpinnerAdapter) wfv0Var);
        }
        Spinner spinner6 = this.p;
        if (spinner6 != null) {
            spinner6.setOnItemSelectedListener(new qv90(this, wfv0Var));
        }
        int f = e3m.f(R.attr.vk_ui_icon_medium, getContext());
        for (Spinner spinner7 : e43.l(this.n, this.o, this.p)) {
            if (spinner7 != null && (background = spinner7.getBackground()) != null) {
                enj.a(background, R.id.layer_icon, f);
            }
        }
        xbq xbqVar = this.q;
        if (xbqVar != null) {
            xbqVar.a(view);
        }
    }

    @Override // xsna.om6
    public final void i() {
        super.i();
        xbq xbqVar = this.q;
        if (xbqVar != null) {
            xbqVar.d(getSearchParams());
        }
    }

    @Override // xsna.om6
    public final void j(FragmentManager fragmentManager, f5z f5zVar) {
        super.j(fragmentManager, f5zVar);
        xbq xbqVar = this.q;
        if (xbqVar != null) {
            xbqVar.c(fragmentManager, f5zVar);
        }
    }

    @Override // xsna.om6
    public final void l(FragmentManager fragmentManager) {
        super.l(fragmentManager);
        xbq xbqVar = this.q;
        if (xbqVar != null) {
            xbqVar.b(fragmentManager);
        }
    }

    public final void q() {
        if (this.q == null) {
            a aVar = new a();
            ((SearchParamsComponent) ((k7m) m7m.f(this)).a(fpf0.a(SearchParamsComponent.class))).Ub();
            this.q = new zbq(aVar);
        }
    }
}
