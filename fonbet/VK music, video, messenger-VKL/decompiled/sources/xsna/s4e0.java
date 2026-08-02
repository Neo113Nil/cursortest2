package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.my.target.core.ui.views.nativeslider.CardRecyclerLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.c9z0;
import xsna.cjy0;
import xsna.v4e0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class s4e0 extends RecyclerView implements cjy0 {
    public final CardRecyclerLayoutManager b;
    public final u4e0 c;
    public boolean d;
    public boolean e;
    public cjy0.a f;
    public boolean g;
    public final c h;
    public int i;
    public a j;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static abstract class a extends RecyclerView.Adapter<b> {
        public final ArrayList c = new ArrayList();
        public final ArrayList d = new ArrayList();
        public c e;

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.c.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(b bVar, int i) {
            cjy0.a aVar;
            v4e0 v4e0Var = bVar.l;
            ArrayList arrayList = new ArrayList(this.c);
            ArrayList arrayList2 = new ArrayList(this.d);
            if (i < arrayList.size() && arrayList.size() == arrayList2.size()) {
                v4e0.a aVar2 = (v4e0.a) arrayList.get(i);
                kiw kiwVar = ((dw50) arrayList2.get(i)).d;
                if (kiwVar != null) {
                    v4e0Var.o().b(kiwVar.b, kiwVar.c);
                    if (kiwVar.a() != null) {
                        v4e0Var.o().getImageView().setImageBitmap(kiwVar.a());
                    } else {
                        o2z0.e(kiwVar, v4e0Var.o().getImageView(), null);
                    }
                }
                v4e0Var.w3(aVar2);
                c cVar = this.e;
                if (cVar != null && (aVar = s4e0.this.f) != null) {
                    ((c9z0.a) aVar).b(i);
                }
            }
            v4e0Var.getView().setContentDescription("card_" + i);
            v4e0Var.getView().setOnClickListener(new yb(this, 9));
            v4e0Var.Y3(new uzb(this, 8));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final b onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new b(x0());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onViewRecycled(b bVar) {
            dw50 dw50Var;
            kiw kiwVar;
            b bVar2 = bVar;
            int layoutPosition = bVar2.getLayoutPosition();
            v4e0 v4e0Var = bVar2.l;
            whz0 whz0Var = (whz0) v4e0Var.o().getImageView();
            whz0Var.setImageData(null);
            if (layoutPosition > 0) {
                ArrayList arrayList = this.d;
                if (layoutPosition < arrayList.size() && (dw50Var = (dw50) arrayList.get(layoutPosition)) != null && (kiwVar = dw50Var.d) != null) {
                    o2z0.d(kiwVar, whz0Var);
                }
            }
            v4e0Var.getView().setOnClickListener(null);
            v4e0Var.Y3(null);
            super.onViewRecycled(bVar2);
        }

        @NonNull
        public abstract h11 x0();

        @SuppressLint({"NotifyDataSetChanged"})
        public void y0(@NonNull List<dw50> list) {
            ArrayList arrayList = this.c;
            arrayList.clear();
            ArrayList arrayList2 = this.d;
            arrayList2.clear();
            for (dw50 dw50Var : list) {
                arrayList.add(new d(dw50Var));
                arrayList2.add(dw50Var);
            }
            notifyDataSetChanged();
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class b extends RecyclerView.e0 {
        public final v4e0 l;

        public b(v4e0 v4e0Var) {
            super(v4e0Var.getView());
            v4e0Var.getView().setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
            this.l = v4e0Var;
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class c {
        public c() {
        }

        public final void a(View view, int i) {
            View findContainingItemView;
            s4e0 s4e0Var = s4e0.this;
            CardRecyclerLayoutManager cardRecyclerLayoutManager = s4e0Var.b;
            if (s4e0Var.g || (findContainingItemView = cardRecyclerLayoutManager.findContainingItemView(view)) == null) {
                return;
            }
            if (cardRecyclerLayoutManager.findViewByPosition(cardRecyclerLayoutManager.s()) != findContainingItemView) {
                s4e0Var.smoothScrollBy(s4e0Var.c.calculateDistanceToFinalSnap(cardRecyclerLayoutManager, findContainingItemView)[0], 0);
                return;
            }
            int position = cardRecyclerLayoutManager.getPosition(findContainingItemView);
            cjy0.a aVar = s4e0Var.f;
            if (aVar == null || position < 0) {
                return;
            }
            ((c9z0.a) aVar).d(findContainingItemView, position, i);
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static final class d extends v4e0.a {
        public final dw50 a;

        public d(dw50 dw50Var) {
            this.a = dw50Var;
        }

        @Override // xsna.v4e0.a
        public final String a() {
            return this.a.c;
        }

        @Override // xsna.v4e0.a
        public final String b() {
            return this.a.h;
        }

        @Override // xsna.v4e0.a
        public final String c() {
            return this.a.b;
        }

        @Override // xsna.v4e0.a
        public final String d() {
            return this.a.e;
        }

        @Override // xsna.v4e0.a
        public final String e() {
            return this.a.g;
        }

        @Override // xsna.v4e0.a
        public final String f() {
            return this.a.f;
        }

        @Override // xsna.v4e0.a
        public final String g() {
            return this.a.a;
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static final class e extends RecyclerView.n {
        public final int b;

        public e(int i) {
            this.b = i / 2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            super.getItemOffsets(rect, view, recyclerView, a0Var);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (a0Var.b() == 1) {
                return;
            }
            int i = this.b;
            if (childAdapterPosition == 0) {
                rect.right = i;
            } else if (childAdapterPosition == a0Var.b() - 1) {
                rect.left = i;
            } else {
                rect.right = i;
                rect.left = i;
            }
        }
    }

    public s4e0(@NonNull Context context, int i) {
        super(context, null, 0);
        this.h = new c();
        this.i = -1;
        getContext();
        this.b = new CardRecyclerLayoutManager();
        setHasFixedSize(true);
        int d2 = c1z0.d(i == -1 ? 16 : i, context);
        u4e0 u4e0Var = new u4e0(d2, this);
        this.c = u4e0Var;
        u4e0Var.attachToRecyclerView(this);
        addItemDecoration(new e(d2));
        addOnScrollListener(new t4e0(this));
    }

    public final void a() {
        CardRecyclerLayoutManager cardRecyclerLayoutManager = this.b;
        int s = cardRecyclerLayoutManager.s();
        if (s >= 0 && this.i != s) {
            this.i = s;
            if (this.f == null || cardRecyclerLayoutManager.findViewByPosition(s) == null) {
                return;
            }
            cjy0.a aVar = this.f;
            ((c9z0.a) aVar).b.e(new int[]{this.i}, getContext());
        }
    }

    @Override // xsna.cjy0
    public final void dispose() {
        a aVar = this.j;
        if (aVar != null) {
            aVar.c.clear();
            aVar.notifyDataSetChanged();
        }
    }

    @Override // xsna.cjy0
    @Nullable
    public Parcelable getState() {
        return this.b.onSaveInstanceState();
    }

    @Override // xsna.cjy0
    @NonNull
    public int[] getVisibleCardNumbers() {
        CardRecyclerLayoutManager cardRecyclerLayoutManager = this.b;
        int v = cardRecyclerLayoutManager.v();
        int x = cardRecyclerLayoutManager.x();
        if (v < 0 || x < 0) {
            return new int[0];
        }
        if (c1z0.a(cardRecyclerLayoutManager.findViewByPosition(v)) < 50.0f) {
            v++;
        }
        if (c1z0.a(cardRecyclerLayoutManager.findViewByPosition(x)) < 50.0f) {
            x--;
        }
        if (v > x) {
            return new int[0];
        }
        if (v == x) {
            return new int[]{v};
        }
        int i = (x - v) + 1;
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = v;
            v++;
        }
        return iArr;
    }

    @Override // xsna.cjy0
    public final void h(@NonNull Parcelable parcelable) {
        a aVar = this.j;
        if (aVar != null) {
            Iterator it = aVar.d.iterator();
            while (it.hasNext()) {
                aVar.c.add(new d((dw50) it.next()));
            }
            aVar.notifyDataSetChanged();
        }
        this.b.onRestoreInstanceState(parcelable);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void onScrollStateChanged(int i) {
        super.onScrollStateChanged(i);
        boolean z = i != 0;
        this.g = z;
        if (z) {
            return;
        }
        a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(@Nullable RecyclerView.Adapter adapter) {
        if (adapter instanceof a) {
            setPromoCardAdapter((a) adapter);
        } else {
            gu8.c(null, "PromoCardRecyclerView: You must use setPromoCardAdapter(PromoCardAdapter) method with custom CardRecyclerView");
        }
    }

    public void setPromoCardAdapter(@Nullable a aVar) {
        if (aVar == null) {
            return;
        }
        this.j = aVar;
        aVar.e = this.h;
        pu50 pu50Var = new pu50(this, 9);
        CardRecyclerLayoutManager cardRecyclerLayoutManager = this.b;
        cardRecyclerLayoutManager.s = pu50Var;
        setLayoutManager(cardRecyclerLayoutManager);
        super.swapAdapter(this.j, true);
    }

    @Override // xsna.cjy0
    public void setPromoCardSliderListener(@Nullable cjy0.a aVar) {
        this.f = aVar;
    }
}
