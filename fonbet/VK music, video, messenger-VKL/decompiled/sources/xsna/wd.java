package xsna;

import android.content.Context;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.im.ui.components.contacts.SortOrder;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: AbstractContactsItemDecoration.kt */
/* loaded from: classes2.dex */
public abstract class wd extends m2i0 implements vaj {
    public vej m;
    public List<? extends hfz> n;
    public SortOrder o;
    public String p;

    public wd(Context context, boolean z, int i, com.vk.movika.sdk.android.defaultplayer.layout.a aVar) {
        super(context, true, z, i, 40);
        this.m = aVar;
        this.n = EmptyList.b;
        this.o = SortOrder.BY_ONLINE;
    }

    @Override // xsna.vaj
    public final void e(vej vejVar) {
        this.m = vejVar;
    }

    @Override // xsna.vaj
    public final void i(List<? extends hfz> list, SortOrder sortOrder) {
        this.n = list;
        this.o = sortOrder;
        this.h = o();
    }

    public abstract SparseArray<CharSequence> o();

    public final boolean p(hfz hfzVar, int i) {
        etx0 etx0Var = hfzVar instanceof etx0 ? (etx0) hfzVar : null;
        return etx0Var != null && etx0Var.getType() == i;
    }

    @Override // xsna.vaj
    public final RecyclerView.n a() {
        return this;
    }
}
