package xsna;

import android.view.ViewGroup;
import xsna.g9m;
import xsna.g9m.a;
import xsna.xtt0;

/* compiled from: DialogAdapter.kt */
/* loaded from: classes8.dex */
public interface m37<ViewBindingType extends xtt0, ItemType extends g9m.a> {
    void a(ViewBindingType viewbindingtype, ItemType itemtype);

    xtt0 b(int i, ViewGroup viewGroup);

    default int getItemViewType(int i) {
        return 0;
    }
}
