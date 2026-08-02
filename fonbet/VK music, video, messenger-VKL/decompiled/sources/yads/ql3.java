package yads;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import kotlin.Lazy;
import xsna.bpn0;

/* loaded from: classes10.dex */
public abstract class ql3 {
    public static final Lazy a = new bpn0(pl3.b);

    public static final void a(final ViewGroup viewGroup, final boolean z) {
        ((Handler) a.getValue()).post(new Runnable() { // from class: xsna.xaz0
            @Override // java.lang.Runnable
            public final void run() {
                yads.ql3.b(viewGroup, z);
            }
        });
    }

    public static final void b(ViewGroup viewGroup, boolean z) {
        int childCount;
        if (viewGroup == null || viewGroup.getChildCount() <= 0 || (childCount = viewGroup.getChildCount() - (!z ? 1 : 0)) <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(childCount);
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof wo) {
                arrayList.add(childAt);
            }
        }
        viewGroup.removeViews(0, childCount);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((wo) arrayList.get(i2)).c();
        }
        arrayList.clear();
    }
}
