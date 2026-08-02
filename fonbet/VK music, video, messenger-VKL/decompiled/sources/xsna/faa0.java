package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.lists.ListDataSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;

/* compiled from: PhotoListAdapter.kt */
/* loaded from: classes4.dex */
public final class faa0 extends zoj0<ucv0, vda0> implements nd90<ucv0>, zzc0, w8i {
    public final m00 e;
    public final p40 f;
    public final s9 g;
    public final int h;
    public final PhotoAlbum i;
    public final Object j;
    public final nv9 k;

    public faa0() {
        throw null;
    }

    public faa0(m00 m00Var, p40 p40Var, s9 s9Var, PhotoAlbum photoAlbum) {
        super(new com.vk.lists.a(new z5a0()));
        this.e = m00Var;
        this.f = p40Var;
        this.g = s9Var;
        this.h = 2;
        this.i = photoAlbum;
        this.j = msy.a(LazyThreadSafetyMode.NONE, new hvz(this, 23));
        this.k = new nv9();
    }

    public static void K0(faa0 faa0Var, ucv0 ucv0Var) {
        faa0Var.x0(ucv0Var);
    }

    @Override // xsna.zzc0
    public final String B(int i, int i2) {
        return ((ucv0) this.c.c(i)).a.Db(iah0.a(200), false).d.d;
    }

    @Override // xsna.zzc0
    public final int G(int i) {
        return 1;
    }

    public final void L0(int i) {
        Iterator it = ((ArrayList) y0()).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            if (i == ((ucv0) next).a.c) {
                D0(i2);
                return;
            }
            i2 = i3;
        }
    }

    public final void N0(List<? extends Photo> list) {
        List<ucv0> y0 = y0();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) y0).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((ucv0) next).b) {
                arrayList.add(next);
            }
        }
        Set S0 = j5g.S0(arrayList);
        Set S02 = j5g.S0(list);
        Set g = izi0.g(S0, S02);
        Set g2 = izi0.g(S02, S0);
        ((ListDataSet) this.c).H(new b7(17, g, g2), new l22(24, g, g2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return this.h;
    }

    @Override // xsna.zoj0, xsna.nd90
    public final void h0(List<ucv0> list) {
        if (list == null) {
            return;
        }
        n0(list);
        this.g.invoke(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((vda0) e0Var).V5(this.c.c(i));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new vda0(viewGroup, (kdg0) this.j.getValue(), this.e, this.f);
    }
}
