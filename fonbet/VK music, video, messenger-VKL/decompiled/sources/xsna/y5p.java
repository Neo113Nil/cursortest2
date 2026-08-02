package xsna;

import android.util.SparseArray;
import com.vkontakte.android.R;
import java.util.Iterator;

/* compiled from: EduContactsItemDecoration.kt */
/* loaded from: classes2.dex */
public final class y5p extends wd {
    @Override // xsna.wd
    public final SparseArray<CharSequence> o() {
        SparseArray<CharSequence> sparseArray = new SparseArray<>();
        Iterator<? extends hfz> it = this.n.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (p(it.next(), 8)) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            String str = this.p;
            sparseArray.put(i2, str != null ? this.m.a(8, str) : this.b.getString(R.string.members));
        }
        for (Object obj : this.n) {
            int i3 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            hfz hfzVar = (hfz) obj;
            if (hfzVar instanceof t8j) {
                ((t8j) hfzVar).getClass();
            }
            i = i3;
        }
        return sparseArray;
    }
}
