package xsna;

import androidx.recyclerview.widget.m;
import xsna.g9m;
import xsna.g9m.a;

/* compiled from: DiffUtilCallback.kt */
/* loaded from: classes8.dex */
public final class qxm<ItemType extends g9m.a> extends m.e<ItemType> {
    @Override // androidx.recyclerview.widget.m.e
    public final boolean areContentsTheSame(Object obj, Object obj2) {
        return ((g9m.a) obj).equals((g9m.a) obj2);
    }

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areItemsTheSame(Object obj, Object obj2) {
        return ((g9m.a) obj).a == ((g9m.a) obj2).a;
    }
}
