package xsna;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: ViewGroup.kt */
/* loaded from: classes11.dex */
public final class mxt0 {
    public static final View a(int i, ViewGroup viewGroup) {
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        StringBuilder b = ji.b(i, "Index: ", ", Size: ");
        b.append(viewGroup.getChildCount());
        throw new IndexOutOfBoundsException(b.toString());
    }

    public static final jxt0 b(ViewGroup viewGroup) {
        return new jxt0(viewGroup);
    }
}
