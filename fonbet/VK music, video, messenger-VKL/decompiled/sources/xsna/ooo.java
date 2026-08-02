package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.vk.dto.posting.DonutPostingSettings;

/* compiled from: DurationsAdapter.kt */
/* loaded from: classes4.dex */
public final class ooo extends ArrayAdapter<DonutPostingSettings.Duration> {
    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        View dropDownView = super.getDropDownView(i, view, viewGroup);
        TextView textView = dropDownView instanceof TextView ? (TextView) dropDownView : null;
        if (textView != null) {
            DonutPostingSettings.Duration item = getItem(i);
            textView.setText(item != null ? item.c : null);
        }
        return dropDownView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        TextView textView = view2 instanceof TextView ? (TextView) view2 : null;
        if (textView != null) {
            DonutPostingSettings.Duration item = getItem(i);
            textView.setText(item != null ? item.c : null);
        }
        return view2;
    }
}
