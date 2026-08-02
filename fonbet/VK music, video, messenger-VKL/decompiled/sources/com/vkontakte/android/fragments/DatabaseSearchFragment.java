package com.vkontakte.android.fragments;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Filterable;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.vk.core.fragments.FragmentImpl;
import com.vkontakte.android.R;
import xsna.dhr0;
import xsna.iah0;
import xsna.jno0;

/* loaded from: classes7.dex */
public abstract class DatabaseSearchFragment<T> extends FragmentImpl {
    public ListAdapter N;
    public c<T> O;

    public class b implements AdapterView.OnItemClickListener {
        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            DatabaseSearchFragment databaseSearchFragment = DatabaseSearchFragment.this;
            Object item = databaseSearchFragment.N.getItem(i);
            c<T> cVar = databaseSearchFragment.O;
            if (cVar != 0) {
                cVar.b(item);
            }
            databaseSearchFragment.dismiss();
        }
    }

    public interface c<T> {
        void b(T t);
    }

    public abstract ListAdapter eo();

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bn(1, 0);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Dialog dialog = this.s;
        if (dialog != null) {
            dialog.getWindow().setSoftInputMode(16);
            this.s.getWindow().setGravity(49);
            this.s.getWindow().setBackgroundDrawableResource(R.drawable.vk_bg_modal_dialog);
        }
        LinearLayout linearLayout = new LinearLayout(getActivity());
        linearLayout.setOrientation(1);
        EditText editText = new EditText(getActivity());
        editText.setInputType(524289);
        if (getArguments() != null && getArguments().containsKey("hint")) {
            editText.setHint(getArguments().getString("hint"));
        }
        jno0.c(editText, R.attr.vk_ui_text_primary);
        editText.setHintTextColor(dhr0.t.c(R.attr.vk_ui_text_secondary));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int a2 = iah0.a(10.0f);
        layoutParams.rightMargin = a2;
        layoutParams.leftMargin = a2;
        layoutParams.bottomMargin = a2;
        layoutParams.topMargin = a2;
        linearLayout.addView(editText, layoutParams);
        ListView listView = new ListView(getActivity());
        linearLayout.addView(listView);
        ListAdapter eo = eo();
        this.N = eo;
        listView.setAdapter(eo);
        editText.addTextChangedListener(new a());
        ((Filterable) this.N).getFilter().filter(null);
        listView.setOnItemClickListener(new b());
        return linearLayout;
    }

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            ((Filterable) DatabaseSearchFragment.this.N).getFilter().filter(editable);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
