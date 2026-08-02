package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.vk.core.view.VKTabLayout;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.d;
import com.vkontakte.android.R;
import java.util.Arrays;

/* compiled from: EducationParameterView.kt */
/* loaded from: classes5.dex */
public final class k8p {
    public final eoh a;
    public final Context b;
    public final VKTabLayout c;
    public boolean d;
    public final TextView e;
    public final TextView f;
    public final Spinner g;
    public Integer h;
    public b[] i;
    public final s5k j;
    public boolean k;
    public final View l;

    /* compiled from: EducationParameterView.kt */
    public final class a extends ArrayAdapter<b> {
        public a(Context context, b[] bVarArr) {
            super(context, R.layout.search_params_dropdown_item_selected, bVarArr);
            setDropDownViewResource(R.layout.search_params_dropdown_item);
        }

        @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
        public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
            b item;
            View dropDownView = super.getDropDownView(i, view, viewGroup);
            if ((dropDownView instanceof TextView) && (item = getItem(i)) != null) {
                if (epx.f(item.a, k8p.this.h)) {
                    ((TextView) dropDownView).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, dhr0.t.b(R.drawable.vk_icon_done_outline_24, R.attr.vk_ui_icon_accent), (Drawable) null);
                } else {
                    ((TextView) dropDownView).setCompoundDrawables(null, null, null, null);
                }
            }
            return dropDownView;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i, view, viewGroup);
            b item = getItem(i);
            if (item != null) {
                String str = item.c;
                TextView textView = view2 instanceof TextView ? (TextView) view2 : null;
                if (textView != null) {
                    if (!epx.f(str, item.b)) {
                        textView.setText(str);
                    }
                    jno0.c(textView, item.a == null ? R.attr.vk_ui_text_secondary : R.attr.vk_ui_text_primary);
                    return view2;
                }
            }
            return view2;
        }
    }

    /* compiled from: EducationParameterView.kt */
    public static final class b {
        public final Integer a;
        public final String b;
        public final String c;

        public b(Integer num, String str, String str2) {
            this.a = num;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            Integer num = this.a;
            return this.c.hashCode() + urd0.a((num == null ? 0 : num.hashCode()) * 31, 31, this.b);
        }

        public final String toString() {
            return this.b;
        }
    }

    public k8p(View view, eoh eohVar) {
        this.a = eohVar;
        this.b = view.getContext();
        VKTabLayout vKTabLayout = (VKTabLayout) bwt0.p(view, R.id.institution_type_tab_layout, null, null, 6);
        this.c = vKTabLayout;
        TextView textView = (TextView) bwt0.p(view, R.id.city_value, null, null, 6);
        this.e = textView;
        TextView textView2 = (TextView) bwt0.p(view, R.id.institution_value, null, null, 6);
        this.f = textView2;
        Spinner spinner = (Spinner) bwt0.p(view, R.id.year_spinner, null, null, 6);
        this.g = spinner;
        this.i = a(null);
        this.j = new s5k(1);
        View findViewById = view.findViewById(R.id.apply_button);
        this.l = findViewById;
        TabLayout.g p = vKTabLayout.p();
        p.f = LayoutInflater.from(p.h.getContext()).inflate(R.layout.search_params_education_tab_item, (ViewGroup) p.h, false);
        p.r();
        ((TextView) p.f).setText(R.string.search_params_institution_type_school);
        TabLayout.g p2 = vKTabLayout.p();
        p2.f = LayoutInflater.from(p2.h.getContext()).inflate(R.layout.search_params_education_tab_item, (ViewGroup) p2.h, false);
        p2.r();
        ((TextView) p2.f).setText(R.string.search_params_institution_type_university);
        vKTabLayout.h(p);
        vKTabLayout.h(p2);
        vKTabLayout.addOnLayoutChangeListener(new j8p(0, this, e43.l(p, p2)));
        vKTabLayout.f(new l8p(this));
        textView.setOnClickListener(new lo3(this, 2));
        textView2.setOnClickListener(new dm7(this, 2));
        textView2.setText(textView2.getContext().getString(R.string.search_params_institution_not_selected));
        jno0.c(textView2, R.attr.vk_ui_text_secondary);
        c(textView2, false);
        this.h = null;
        c(spinner, false);
        d();
        Drawable background = spinner.getBackground();
        StateListDrawable stateListDrawable = background instanceof StateListDrawable ? (StateListDrawable) background : null;
        Drawable current = stateListDrawable != null ? stateListDrawable.getCurrent() : null;
        LayerDrawable layerDrawable = current instanceof LayerDrawable ? (LayerDrawable) current : null;
        if (layerDrawable != null) {
            Drawable drawable = layerDrawable.getDrawable(0);
            GradientDrawable gradientDrawable = drawable instanceof GradientDrawable ? (GradientDrawable) drawable : null;
            if (gradientDrawable != null) {
                gradientDrawable.setCornerRadius(iah0.b(8.0f));
            }
        }
        spinner.setOnItemSelectedListener(new m8p(this));
        findViewById.setOnClickListener(new ko3(this, 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(TextView textView, d.a aVar, int i) {
        String str = (String) aVar.a;
        if (str == null) {
            str = textView.getContext().getString(i);
        }
        textView.setText(str);
        jno0.c(textView, aVar.a == 0 ? R.attr.vk_ui_text_secondary : R.attr.vk_ui_text_primary);
        c(textView, aVar.b);
    }

    public static void c(View view, boolean z) {
        view.setAlpha(z ? 1.0f : 0.64f);
        view.setClickable(z);
        view.setEnabled(z);
    }

    public final b[] a(k9x k9xVar) {
        b bVar;
        int i = k9xVar != null ? k9xVar.c - k9xVar.b : 1;
        int i2 = k9xVar != null ? k9xVar.b : 0;
        b[] bVarArr = new b[i];
        for (int i3 = 0; i3 < i; i3++) {
            if (i3 == 0) {
                Context context = this.b;
                bVar = new b(null, context.getString(R.string.search_params_any_date_title), context.getString(R.string.search_params_date_not_selected));
            } else {
                int i4 = (i2 + i3) - 1;
                Integer valueOf = Integer.valueOf(i4);
                String valueOf2 = String.valueOf(i4);
                bVar = new b(valueOf, valueOf2, valueOf2);
            }
            bVarArr[i3] = bVar;
        }
        return bVarArr;
    }

    public final void d() {
        this.k = true;
        b[] bVarArr = this.i;
        int binarySearch = Arrays.binarySearch(bVarArr, 0, bVarArr.length, new b(this.h, "", ""), this.j);
        if (binarySearch < 0) {
            binarySearch = 0;
        }
        this.g.setSelection(binarySearch);
        this.k = false;
    }
}
