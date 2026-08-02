package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class ajy0 extends BaseAdapter {
    public ArrayList b;
    public xw70 c;

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.b.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return (b520) this.b.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        noy0 noy0Var = new noy0(viewGroup.getContext());
        b520 b520Var = (b520) this.b.get(i);
        noy0Var.setData(b520Var);
        noy0Var.setOnClickListener(new pgr(5, this, b520Var));
        return noy0Var;
    }
}
