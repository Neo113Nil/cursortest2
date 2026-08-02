package com.yandex.div.core.view2.divs.gallery;

import android.view.ViewGroup;
import androidx.recyclerview.widget.x0;
import com.yandex.div.core.view2.f;
import defpackage.aw5;
import defpackage.cxk;
import defpackage.hgk;
import defpackage.sls;
import defpackage.wrk;
import defpackage.zik;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a extends zik {
    public final aw5 B;
    public final hgk C;
    public final f D;
    public int E;
    public int F;
    public float G;
    public final WeakHashMap H;
    public long I;

    public a(List list, aw5 aw5Var, hgk hgkVar, f fVar, com.yandex.div.core.state.b bVar) {
        super(aw5Var, bVar, list);
        this.B = aw5Var;
        this.C = hgkVar;
        this.D = fVar;
        this.F = 1;
        this.H = new WeakHashMap();
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        cxk cxkVar = (cxk) g().get(i);
        WeakHashMap weakHashMap = this.H;
        Long l = (Long) weakHashMap.get(cxkVar);
        if (l != null) {
            return l.longValue();
        }
        long j = this.I;
        this.I = 1 + j;
        weakHashMap.put(cxkVar, Long.valueOf(j));
        return j;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        aw5 aw5Var = this.B;
        DivGalleryItemLayout divGalleryItemLayout = new DivGalleryItemLayout(aw5Var.a.getContext());
        divGalleryItemLayout.setOrientation(new sls() { // from class: com.yandex.div.core.view2.divs.gallery.DivGalleryAdapter$onCreateViewHolder$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return Integer.valueOf(a.this.E);
            }
        });
        divGalleryItemLayout.setColumnCount(new sls() { // from class: com.yandex.div.core.view2.divs.gallery.DivGalleryAdapter$onCreateViewHolder$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return Integer.valueOf(a.this.F);
            }
        });
        divGalleryItemLayout.setCrossSpacing(new sls() { // from class: com.yandex.div.core.view2.divs.gallery.DivGalleryAdapter$onCreateViewHolder$3
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return Float.valueOf(a.this.G);
            }
        });
        return new wrk(aw5Var, divGalleryItemLayout, this.C, this.D);
    }
}
