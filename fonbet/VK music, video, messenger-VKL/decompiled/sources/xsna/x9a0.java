package xsna;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: PhotoHistoryAttachesVC.kt */
/* loaded from: classes2.dex */
public final class x9a0 extends ae6 {
    public static final int t = cn70.b(1);
    public static final int u = cn70.b(120);
    public final Context l;
    public final boolean m;
    public final String n;
    public final String o;
    public final j5a0 p;
    public final Object q;
    public igu r;
    public final RecyclerView.o s;

    public x9a0(Context context, m5a0 m5a0Var, boolean z, kkm kkmVar) {
        super(m5a0Var);
        RecyclerView.o oVar;
        this.l = context;
        this.m = z;
        this.n = context.getString(R.string.vkim_history_attaches_empty_list_photo);
        this.o = context.getString(R.string.vkim_history_attaches_tab_photo);
        a1y a1yVar = new a1y(m5a0Var, 3);
        j5a0 j5a0Var = new j5a0(false);
        j5a0Var.y0(new k5a0(a1yVar, z));
        j5a0Var.y0(new tsz(kkmVar));
        this.p = j5a0Var;
        this.q = msy.a(LazyThreadSafetyMode.NONE, new gd70(this, 6));
        if (z) {
            oVar = new GridLayoutManager(i());
        } else {
            FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(context);
            flexboxLayoutManager.I(0);
            flexboxLayoutManager.J(1);
            if (flexboxLayoutManager.d != 3) {
                flexboxLayoutManager.d = 3;
                flexboxLayoutManager.requestLayout();
            }
            oVar = flexboxLayoutManager;
        }
        this.s = oVar;
    }

    @Override // xsna.ae6, xsna.f8v
    public final View c(Context context, ViewGroup viewGroup) {
        View c = super.c(context, viewGroup);
        if (this.m) {
            RecyclerView recyclerView = this.d;
            if (recyclerView == null) {
                recyclerView = null;
            }
            int i = i();
            int i2 = t;
            igu iguVar = new igu(i, i2, i2);
            this.r = iguVar;
            recyclerView.addItemDecoration(iguVar);
        }
        return c;
    }

    @Override // xsna.ae6
    public final qul e() {
        return this.p;
    }

    @Override // xsna.ae6
    public final String f() {
        return this.n;
    }

    @Override // xsna.ae6
    public final RecyclerView.o g() {
        return this.s;
    }

    @Override // xsna.f8v
    public final String getTitle() {
        return this.o;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public final int i() {
        boolean s = iah0.s(this.l);
        ?? r1 = this.q;
        return (s ? ((Point) r1.getValue()).x : ((Point) r1.getValue()).y) / u;
    }
}
