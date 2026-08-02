package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.vk.search.models.VkRelation;
import com.vkontakte.android.R;

/* compiled from: VkRelationAdapter.java */
/* loaded from: classes5.dex */
public final class wfv0 extends ArrayAdapter<VkRelation> {
    public boolean b;

    public wfv0(Context context, VkRelation[] vkRelationArr) {
        super(context, R.layout.vk_discover_search_spinner_selected, vkRelationArr);
        this.b = true;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, @NonNull ViewGroup viewGroup) {
        View dropDownView = super.getDropDownView(i, view, viewGroup);
        VkRelation item = getItem(i);
        if ((dropDownView instanceof TextView) && item != null) {
            ((TextView) dropDownView).setText(item.a(getContext(), this.b));
        }
        return dropDownView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final long getItemId(int i) {
        if (getItem(i) == null) {
            return 0L;
        }
        return r3.id;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    @NonNull
    public final View getView(int i, View view, @NonNull ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        VkRelation item = getItem(i);
        if ((view2 instanceof TextView) && item != null) {
            ((TextView) view2).setText(item.a(getContext(), this.b));
        }
        return view2;
    }
}
