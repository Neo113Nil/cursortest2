package xsna;

import android.content.Context;
import com.vk.core.ui.bottomsheet.actionsheet.a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import xsna.dh6;

/* compiled from: AdsMoreMenuActionSheet.kt */
/* loaded from: classes17.dex */
public final class f11 {
    public final Context a;
    public final hkh0 b;
    public final List<vu0> c;
    public dw20 d;

    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Integer.valueOf(((vu0) t).a), Integer.valueOf(((vu0) t2).a));
        }
    }

    /* compiled from: AdsMoreMenuActionSheet.kt */
    public static final class b implements dh6.a {
        public b() {
        }

        @Override // xsna.dh6.a
        public final void a() {
            f11.this.b.b();
        }

        @Override // xsna.dh6.a
        public final void b() {
            f11.this.b.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f11(Context context, hkh0 hkh0Var, List<? extends vu0> list) {
        this.a = context;
        this.b = hkh0Var;
        this.c = list;
    }

    public final void a() {
        a.C0785a c0785a = new a.C0785a();
        List D0 = j5g.D0(new a(), this.c);
        ArrayList arrayList = new ArrayList(c5g.u(D0, 10));
        Iterator it = D0.iterator();
        while (it.hasNext()) {
            arrayList.add(((vu0) it.next()).a());
        }
        c0785a.b = arrayList;
        c0785a.c = new v9(this, 1);
        c0785a.e = new b();
        this.d = c0785a.a(this.a, "ads_more_menu_bottom_sheet");
    }
}
