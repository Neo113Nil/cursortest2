package com.vk.webapp.community_picker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.BaseMvpFragment;
import com.vk.imageloader.view.VKImageView;
import com.vk.movika.sdk.base.logic.interactor.i;
import com.vk.superapp.api.dto.app.AppsGroupsContainer;
import com.vk.superapp.api.dto.group.WebGroup;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.bwt0;
import xsna.fnj;
import xsna.iah0;
import xsna.ies;
import xsna.le3;
import xsna.me3;
import xsna.myc0;
import xsna.oz50;
import xsna.u1u0;
import xsna.vds;
import xsna.vic;
import xsna.vif0;
import xsna.z00;

/* compiled from: AppsCommunityPickerFragment.kt */
/* loaded from: classes7.dex */
public final class AppsCommunityPickerFragment extends BaseMvpFragment<le3> implements ies, vds {
    public static final int U = iah0.a(480.0f);
    public final a T = new a();

    /* compiled from: AppsCommunityPickerFragment.kt */
    public static final class b extends oz50 {
    }

    /* compiled from: AppsCommunityPickerFragment.kt */
    public final class c extends vif0<AppsGroupsContainer> {
        public final VKImageView n;
        public final TextView o;
        public final TextView p;

        public c(AppsCommunityPickerFragment appsCommunityPickerFragment, ViewGroup viewGroup) {
            super(viewGroup, R.layout.apps_community_picker_item, 0);
            VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.icon);
            this.n = vKImageView;
            this.o = (TextView) this.itemView.findViewById(R.id.title);
            this.p = (TextView) this.itemView.findViewById(R.id.description);
            vKImageView.setPlaceholderImage(R.drawable.group_placeholder);
            bwt0.i0(this.itemView, new i(3, appsCommunityPickerFragment, this));
        }

        @Override // xsna.vif0
        public final void i6(AppsGroupsContainer appsGroupsContainer) {
            AppsGroupsContainer appsGroupsContainer2 = appsGroupsContainer;
            WebGroup webGroup = appsGroupsContainer2.b;
            this.n.load(webGroup.d);
            this.o.setText(webGroup.c);
            String str = appsGroupsContainer2.d;
            boolean f = myc0.f(str);
            TextView textView = this.p;
            if (!f) {
                textView.setVisibility(8);
            } else {
                bwt0.p0(textView, true);
                textView.setText(str);
            }
        }
    }

    public AppsCommunityPickerFragment() {
        this.S = new me3(this);
    }

    @Override // xsna.vds
    public final int Q0() {
        return 1;
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        P p = this.S;
        if (arguments == null || p == 0) {
            return;
        }
        le3 le3Var = (le3) p;
        List<AppsGroupsContainer> parcelableArrayList = arguments.getParcelableArrayList("groups");
        if (parcelableArrayList == null) {
            parcelableArrayList = EmptyList.b;
        }
        le3Var.r4(parcelableArrayList);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.layout_apps_community_picker, viewGroup, false);
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        if (!fnj.d(requireContext())) {
            u1u0.k(toolbar, R.drawable.vk_icon_cancel_24, R.string.accessibility_cancel);
            toolbar.setNavigationOnClickListener(new z00(this, 1));
        }
        toolbar.setTitle(getString(R.string.groups));
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recycler);
        getActivity();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.T);
        return inflate;
    }

    /* compiled from: AppsCommunityPickerFragment.kt */
    public final class a extends RecyclerView.Adapter<c> implements vic {
        public List<AppsGroupsContainer> c = EmptyList.b;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.c.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(c cVar, int i) {
            cVar.V5(this.c.get(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final c onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new c(AppsCommunityPickerFragment.this, viewGroup);
        }

        @Override // xsna.vic, com.vk.lists.c.i
        public final void clear() {
        }
    }
}
