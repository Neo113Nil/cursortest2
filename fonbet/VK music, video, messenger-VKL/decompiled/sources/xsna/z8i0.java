package xsna;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: SelectLanguageAdapter.kt */
/* loaded from: classes6.dex */
public final class z8i0 extends ArrayAdapter<mai0> {
    public z8i0(Activity activity) {
        super(activity, R.layout.im_language_spinner_selected);
        setDropDownViewResource(R.layout.im_language_spinner_dropdown);
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return false;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        View dropDownView = super.getDropDownView(i, view, viewGroup);
        mai0 item = getItem(i);
        TextView textView = (TextView) dropDownView;
        textView.setText(item.a.g());
        textView.setTextColor(item.b ? dhr0.t.c(R.attr.vk_legacy_text_muted) : dhr0.t.c(R.attr.vk_legacy_text_tertiary));
        return textView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        mai0 item = getItem(i);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.im_language_spinner_selected, viewGroup, false);
        }
        TextView textView = (TextView) view;
        textView.setTextColor(dhr0.t.c(R.attr.vk_legacy_text_primary));
        textView.setText(item.a.g());
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return getItem(i).b;
    }
}
