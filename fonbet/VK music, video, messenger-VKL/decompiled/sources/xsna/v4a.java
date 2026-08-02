package xsna;

import android.util.SparseArray;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: CatalogErrorViewConfiguration.kt */
/* loaded from: classes16.dex */
public final class v4a implements gxp {
    public final SparseArray<by2> b;
    public final boolean c;

    /* compiled from: CatalogErrorViewConfiguration.kt */
    public static final class a {
        public final SparseArray<by2> a = new SparseArray<>();
        public boolean b;

        public final v4a a() {
            return new v4a(this.a, this.b);
        }

        public final void b(by2 by2Var) {
            this.a.put(104, by2Var);
        }
    }

    public v4a(SparseArray sparseArray, boolean z) {
        this.b = sparseArray;
        this.c = z;
    }

    @Override // xsna.gxp
    public final by2 c(Throwable th) {
        Object obj;
        if (!(th instanceof VKApiExecutionException)) {
            j03.a.getClass();
            return new by2(j03.c(th), 14, null);
        }
        VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
        int s = vKApiExecutionException.s();
        SparseArray<by2> sparseArray = this.b;
        by2 by2Var = sparseArray.get(s);
        if (by2Var == null && this.c && vKApiExecutionException.R()) {
            List<VKApiExecutionException> v = vKApiExecutionException.v();
            if (v != null) {
                List<VKApiExecutionException> list = v;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(sparseArray.get(((VKApiExecutionException) it.next()).s()));
                }
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (((by2) obj) != null) {
                        break;
                    }
                }
                by2Var = (by2) obj;
            } else {
                by2Var = null;
            }
        }
        if (by2Var != null) {
            return by2Var;
        }
        j03.a.getClass();
        return new by2(j03.c(th), 14, null);
    }
}
