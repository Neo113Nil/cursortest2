package com.vkontakte.android.fragments.cities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListAdapter;
import com.vk.superapp.api.dto.identity.WebCity;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.DatabaseSearchFragment;
import xsna.dhr0;
import xsna.e43;
import xsna.ies;
import xsna.nds;
import xsna.nku0;
import xsna.oz50;
import xsna.sp;
import xsna.t11;

/* loaded from: classes7.dex */
public class CitySelectFragment extends DatabaseSearchFragment<WebCity> implements ies, nds {
    public static final /* synthetic */ int Q = 0;
    public boolean P = false;

    public class a implements DatabaseSearchFragment.c<WebCity> {
        public a() {
        }

        @Override // com.vkontakte.android.fragments.DatabaseSearchFragment.c
        public final void b(WebCity webCity) {
            Intent intent = new Intent();
            intent.putExtra("city", webCity);
            CitySelectFragment.this.Mf(-1, intent);
        }
    }

    public static class b extends oz50 {
    }

    @Override // xsna.nds
    public final boolean W9() {
        return dhr0.L();
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        Mf(0, null);
        return true;
    }

    @Override // com.vkontakte.android.fragments.DatabaseSearchFragment
    public final ListAdapter eo() {
        boolean containsKey = getArguments().containsKey("static_cities");
        nku0 nku0Var = new nku0(e43.a, containsKey, new t11(8));
        nku0Var.c = getArguments().getInt("country");
        nku0Var.e.clear();
        nku0Var.f.clear();
        nku0Var.notifyDataSetChanged();
        nku0Var.b.filter(null);
        nku0Var.j = getArguments().getBoolean("show_none");
        if (containsKey) {
            nku0Var.m = getArguments().getParcelableArrayList("static_cities");
        }
        return nku0Var;
    }

    @Override // xsna.nds, xsna.xoo0
    public final int l2() {
        return dhr0.t.c(R.attr.vk_ui_background_modal);
    }

    @Override // com.vkontakte.android.fragments.DatabaseSearchFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            boolean z = getArguments().getBoolean("from_builder", false);
            this.P = z;
            if (z) {
                this.O = new a();
            }
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (!this.P || getView() == null) {
            return;
        }
        sp.u(getView(), true);
    }
}
