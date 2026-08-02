package com.vkontakte.android.fragments.videos;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.libvideo.api.di.VideoApiHelperComponent;
import com.vk.libvideo.repositories.VideoApiHelperRepository;
import com.vk.video.ui.albums.fragments.AbsVideoListFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.ui.layout.ExpandableBarLayout;
import io.reactivex.rxjava3.core.q;
import java.util.ArrayList;
import xsna.abg0;
import xsna.d1x;
import xsna.dhr0;
import xsna.e3m;
import xsna.enj;
import xsna.gu9;
import xsna.izs;
import xsna.j6i;
import xsna.l0i0;
import xsna.m7m;
import xsna.s3q0;
import xsna.wvv0;

/* loaded from: classes7.dex */
public class SearchVideoListFragment extends AbsVideoListFragment {
    public String X0;
    public boolean Y0;
    public int a1;
    public ExpandableBarLayout c1;
    public l0i0 d1;
    public View h1;
    public boolean i1;
    public boolean Z0 = true;
    public int b1 = 2;
    public final c e1 = new c();
    public final a f1 = new a();
    public final b g1 = new b();
    public final VideoApiHelperRepository j1 = ((VideoApiHelperComponent) j6i.b(m7m.d(this), VideoApiHelperComponent.class)).N4();

    public class a implements izs<Boolean, s3q0> {
        public a() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(Boolean bool) {
            Boolean bool2 = bool;
            SearchVideoListFragment searchVideoListFragment = SearchVideoListFragment.this;
            if (searchVideoListFragment.i1 && !bool2.booleanValue()) {
                searchVideoListFragment.i1 = false;
                searchVideoListFragment.Fo();
            }
            return s3q0.a;
        }
    }

    public class b implements izs<Float, s3q0> {
        public b() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(Float f) {
            SearchVideoListFragment.this.h1.setRotation(f.floatValue() * 180.0f);
            return s3q0.a;
        }
    }

    public SearchVideoListFragment() {
        to(R.layout.video_search);
        setRetainInstance(true);
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public final void Fo() {
        String str = this.X0;
        if (str == null || str.length() == 0) {
            return;
        }
        this.z0 = true;
        this.f0 = false;
        qo();
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment, me.grishka.appkit.views.UsableRecyclerView.p
    public final void M() {
        l0i0 l0i0Var = this.d1;
        if (l0i0Var != null) {
            l0i0Var.h.T4();
            l0i0Var.j.requestFocus();
        }
    }

    @Override // com.vk.video.ui.albums.fragments.AbsVideoListFragment
    public final String Mo() {
        return "search";
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // com.vk.video.ui.albums.fragments.AbsVideoListFragment
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q<VKList<VideoFile>> No(int i, int i2) {
        VideoApiHelperRepository.SearchVideosParams.Sort sort;
        VideoApiHelperRepository.SearchVideosParams.Sort sort2;
        int i3;
        int i4 = this.b1;
        VideoApiHelperRepository.SearchVideosParams.Length length = null;
        if (i4 == 0) {
            sort = VideoApiHelperRepository.SearchVideosParams.Sort.DATE_ADDED;
        } else if (i4 == 1) {
            sort = VideoApiHelperRepository.SearchVideosParams.Sort.DURATION;
        } else {
            if (i4 != 2) {
                sort2 = null;
                i3 = this.a1;
                if (i3 != 1) {
                    length = VideoApiHelperRepository.SearchVideosParams.Length.SHORT;
                } else if (i3 == 2) {
                    length = VideoApiHelperRepository.SearchVideosParams.Length.LONG;
                }
                return this.j1.d(new VideoApiHelperRepository.SearchVideosParams(this.X0, Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(this.Y0), length, Boolean.valueOf(this.Z0), sort2, null, null));
            }
            sort = VideoApiHelperRepository.SearchVideosParams.Sort.RELEVANCE;
        }
        sort2 = sort;
        i3 = this.a1;
        if (i3 != 1) {
        }
        return this.j1.d(new VideoApiHelperRepository.SearchVideosParams(this.X0, Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(this.Y0), length, Boolean.valueOf(this.Z0), sort2, null, null));
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        ExpandableBarLayout expandableBarLayout = this.c1;
        if (expandableBarLayout == null || !expandableBarLayout.j) {
            return false;
        }
        expandableBarLayout.a();
        return true;
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment
    public final void i0() {
        super.i0();
        Go(getString(R.string.nothing_found));
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        Go(getString(R.string.news_search_explain));
    }

    @Override // com.vkontakte.android.fragments.base.GridFragment, com.vkontakte.android.fragments.VKRecyclerFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bo(new ArrayList(), false);
        this.h1 = view.findViewById(R.id.search_icon);
        ExpandableBarLayout expandableBarLayout = (ExpandableBarLayout) view.findViewById(R.id.expandable);
        this.c1 = expandableBarLayout;
        expandableBarLayout.setProgressListener(this.g1);
        this.c1.setOpenListener(this.f1);
        ArrayAdapter<CharSequence> createFromResource = ArrayAdapter.createFromResource(getActivity(), R.array.video_search_length, R.layout.catalog_spinner_selected);
        createFromResource.setDropDownViewResource(R.layout.catalog_spinner_dropdown);
        Spinner spinner = (Spinner) this.c1.findViewById(R.id.duration_spinner);
        spinner.setAdapter((SpinnerAdapter) createFromResource);
        ArrayAdapter<CharSequence> createFromResource2 = ArrayAdapter.createFromResource(getActivity(), R.array.video_search_sort_options, R.layout.catalog_spinner_selected);
        createFromResource2.setDropDownViewResource(R.layout.catalog_spinner_dropdown);
        Spinner spinner2 = (Spinner) this.c1.findViewById(R.id.sort_spinner);
        spinner2.setAdapter((SpinnerAdapter) createFromResource2);
        CompoundButton compoundButton = (CompoundButton) this.c1.findViewById(R.id.hd_only);
        c cVar = this.e1;
        compoundButton.setOnCheckedChangeListener(cVar);
        ((CompoundButton) this.c1.findViewById(R.id.safe_search)).setOnCheckedChangeListener(cVar);
        spinner.setOnItemSelectedListener(cVar);
        spinner2.setOnItemSelectedListener(cVar);
        FragmentActivity activity = getActivity();
        abg0 abg0Var = dhr0.t;
        int c2 = abg0Var.c(R.attr.vk_ui_field_background);
        int c3 = abg0Var.c(R.attr.vk_ui_field_background);
        int c4 = abg0Var.c(R.attr.vk_ui_stroke_accent);
        int c5 = abg0Var.c(R.attr.vk_ui_field_border_alpha);
        int i = wvv0.a;
        int f = e3m.f(R.attr.vk_ui_icon_medium, activity);
        Drawable a2 = wvv0.a(activity, R.drawable.vkui_spinner_default_bg, c2, c3, c4, c5);
        if (a2 != null) {
            enj.a(a2, R.id.layer_icon, f);
        }
        spinner.setBackground(a2);
        spinner2.setBackground(a2);
        d1x a3 = gu9.a(requireContext());
        spinner.setPopupBackgroundDrawable(a3);
        spinner2.setPopupBackgroundDrawable(a3);
    }

    public class c implements CompoundButton.OnCheckedChangeListener, AdapterView.OnItemSelectedListener {
        public c() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            int id = compoundButton.getId();
            SearchVideoListFragment searchVideoListFragment = SearchVideoListFragment.this;
            if (id == R.id.hd_only) {
                if (searchVideoListFragment.Y0 != z) {
                    searchVideoListFragment.Y0 = z;
                    searchVideoListFragment.i1 = true;
                    return;
                }
                return;
            }
            if (id != R.id.safe_search || searchVideoListFragment.Z0 == z) {
                return;
            }
            searchVideoListFragment.Z0 = z;
            searchVideoListFragment.i1 = true;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int i2;
            int id = adapterView.getId();
            SearchVideoListFragment searchVideoListFragment = SearchVideoListFragment.this;
            if (id == R.id.duration_spinner) {
                if (searchVideoListFragment.a1 != i) {
                    searchVideoListFragment.a1 = i;
                    searchVideoListFragment.i1 = true;
                    return;
                }
                return;
            }
            if (id != R.id.sort_spinner || (i2 = new int[]{2, 0, 1}[i]) == searchVideoListFragment.b1) {
                return;
            }
            searchVideoListFragment.b1 = i2;
            searchVideoListFragment.i1 = true;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }
}
