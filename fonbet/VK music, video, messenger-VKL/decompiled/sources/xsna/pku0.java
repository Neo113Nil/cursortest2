package xsna;

import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import androidx.fragment.app.FragmentActivity;
import com.vk.superapp.api.dto.identity.WebCity;
import com.vkontakte.android.R;
import xsna.pku0;

/* compiled from: VkCitySelectFragment.kt */
/* loaded from: classes5.dex */
public final class pku0 extends uhv0 {
    public b h;
    public nku0 i;
    public ProgressBar j;
    public final a k = new a();

    /* compiled from: VkCitySelectFragment.kt */
    public static final class a extends DataSetObserver {
        public a() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            super.onChanged();
            ProgressBar progressBar = pku0.this.j;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        }
    }

    /* compiled from: VkCitySelectFragment.kt */
    public static final class b {
        public b() {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() == null || !requireArguments().getBoolean("from_builder", false)) {
            return;
        }
        this.h = new b();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(requireContext());
        ProgressBar progressBar = new ProgressBar(getActivity());
        progressBar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        f4m.m(17, progressBar);
        this.j = progressBar;
        frameLayout.addView(progressBar);
        LinearLayout linearLayout = new LinearLayout(getActivity());
        linearLayout.setOrientation(1);
        EditText editText = new EditText(getActivity());
        editText.setInputType(524289);
        if (getArguments() != null && requireArguments().containsKey("hint")) {
            editText.setHint(requireArguments().getString("hint"));
        }
        editText.setTextColor(krv0.m(R.attr.vk_legacy_text_primary, editText.getContext()));
        editText.setHintTextColor(krv0.m(R.attr.vk_legacy_text_secondary, editText.getContext()));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int a2 = iah0.a(10.0f);
        layoutParams.rightMargin = a2;
        layoutParams.leftMargin = a2;
        layoutParams.bottomMargin = a2;
        layoutParams.topMargin = a2;
        linearLayout.addView(editText, layoutParams);
        ListView listView = new ListView(getActivity());
        linearLayout.addView(listView);
        boolean containsKey = requireArguments().containsKey("static_cities");
        nku0 nku0Var = new nku0(requireContext(), containsKey, new azk0(4));
        nku0Var.c = requireArguments().getInt("country");
        nku0Var.e.clear();
        nku0Var.f.clear();
        nku0Var.notifyDataSetChanged();
        nku0Var.b.filter(null);
        if (containsKey) {
            nku0Var.m = requireArguments().getParcelableArrayList("static_cities");
        }
        nku0Var.registerDataSetObserver(this.k);
        this.i = nku0Var;
        listView.setAdapter((ListAdapter) nku0Var);
        editText.addTextChangedListener(new c());
        this.i.getFilter().filter(null);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: xsna.oku0
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                pku0 pku0Var = pku0.this;
                WebCity webCity = pku0Var.i.g.get(i);
                pku0.b bVar = pku0Var.h;
                if (bVar != null) {
                    Intent intent = new Intent();
                    intent.putExtra("city", webCity);
                    FragmentActivity activity = pku0.this.getActivity();
                    if (activity != null) {
                        activity.setResult(-1, intent);
                        activity.finish();
                    }
                }
            }
        });
        frameLayout.addView(linearLayout);
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        nku0 nku0Var = this.i;
        if (nku0Var != null) {
            nku0Var.unregisterDataSetObserver(this.k);
        }
    }

    /* compiled from: VkCitySelectFragment.kt */
    public static final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            pku0.this.i.getFilter().filter(editable);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
