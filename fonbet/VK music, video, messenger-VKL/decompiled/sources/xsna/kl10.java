package xsna;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.ListPopupWindow;

/* compiled from: MaterialAutoCompleteTextView.java */
/* loaded from: classes13.dex */
public final class kl10 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ ll10 b;

    public kl10(ll10 ll10Var) {
        this.b = ll10Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ll10 ll10Var = this.b;
        ListPopupWindow listPopupWindow = ll10Var.f;
        ll10.a(ll10Var, i < 0 ? listPopupWindow.getSelectedItem() : ll10Var.getAdapter().getItem(i));
        AdapterView.OnItemClickListener onItemClickListener = ll10Var.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i < 0) {
                view = listPopupWindow.getSelectedView();
                i = listPopupWindow.getSelectedItemPosition();
                j = listPopupWindow.getSelectedItemId();
            }
            onItemClickListener.onItemClick(listPopupWindow.getListView(), view, i, j);
        }
        listPopupWindow.dismiss();
    }
}
