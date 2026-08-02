package xsna;

import android.view.LayoutInflater;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.FastScroller;
import xsna.wej;

/* compiled from: ContactsAdapter.kt */
/* loaded from: classes2.dex */
public final class saj extends qul implements FastScroller.b {
    public final boolean h;
    public final boolean i;

    /* compiled from: ContactsAdapter.kt */
    public interface a extends dp8, l270, e8g0, i8j, e960, gei0, leb, lfp {
    }

    public saj(LayoutInflater layoutInflater, RecyclerView.u uVar, wej.a aVar, boolean z, boolean z2) {
        super(false);
        this.h = z;
        this.i = z2;
        x0(cq8.class, new iea(this, layoutInflater, aVar, 2));
        x0(f8g0.class, new yf7(this, layoutInflater, aVar, 2));
        x0(t8j.class, new isg(this, layoutInflater, aVar, 1));
        x0(swa.class, new xxh(this, layoutInflater, aVar, 1));
        x0(m270.class, new sx4(this, layoutInflater, aVar, 3));
        x0(f960.class, new rm0(8, layoutInflater, aVar));
        x0(a770.class, new o1e(layoutInflater, 9));
        x0(b770.class, new ya(14, layoutInflater, aVar));
        x0(hei0.class, new jwi(this, layoutInflater, uVar, aVar, 1));
        x0(kjq.class, new ab(8, layoutInflater, aVar));
    }

    @Override // com.vk.core.view.FastScroller.b
    public final CharSequence f(int i) {
        CharSequence name;
        CharSequence subSequence;
        hfz hfzVar = this.d.get(i);
        b8j b8jVar = hfzVar instanceof b8j ? (b8j) hfzVar : null;
        return (b8jVar == null || (name = b8jVar.getName()) == null || (subSequence = name.subSequence(0, 1)) == null) ? "★" : subSequence;
    }
}
