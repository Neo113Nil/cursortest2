package xsna;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import xsna.c9z0;
import xsna.cjy0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class yey0 extends RecyclerView implements ucz0 {
    public final b b;
    public final a c;
    public final i9y0 d;
    public boolean e;
    public cjy0.a f;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class a {
        public a() {
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class b extends LinearLayoutManager {
        public b630 r;
        public int s;

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final void measureChildWithMargins(View view, int i, int i2) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            int width = getWidth();
            if (getHeight() <= 0 || width <= 0) {
                return;
            }
            if (getItemViewType(view) == 1) {
                ((ViewGroup.MarginLayoutParams) pVar).rightMargin = this.s;
            } else if (getItemViewType(view) == 2) {
                ((ViewGroup.MarginLayoutParams) pVar).leftMargin = this.s;
            } else {
                int i3 = this.s;
                ((ViewGroup.MarginLayoutParams) pVar).leftMargin = i3;
                ((ViewGroup.MarginLayoutParams) pVar).rightMargin = i3;
            }
            super.measureChildWithMargins(view, i, i2);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final void onLayoutCompleted(RecyclerView.a0 a0Var) {
            yey0 yey0Var;
            cjy0.a aVar;
            super.onLayoutCompleted(a0Var);
            b630 b630Var = this.r;
            if (b630Var == null || (aVar = (yey0Var = (yey0) b630Var.c).f) == null) {
                return;
            }
            ((c9z0.a) aVar).b.e(yey0Var.getVisibleCardNumbers(), yey0Var.getContext());
        }
    }

    public yey0(Context context) {
        super(context, null, 0);
        this.c = new a();
        b bVar = new b(0, false);
        this.b = bVar;
        bVar.s = c1z0.d(4, context);
        this.d = new i9y0(getContext());
        setHasFixedSize(true);
    }

    private void setCardLayoutManager(b bVar) {
        bVar.r = new b630(this, 27);
        super.setLayoutManager(bVar);
    }

    @Override // xsna.cjy0
    public final void dispose() {
        i9y0 i9y0Var = this.d;
        i9y0Var.d.clear();
        i9y0Var.notifyDataSetChanged();
        i9y0Var.e = null;
    }

    @Override // xsna.cjy0
    @Nullable
    public Parcelable getState() {
        return this.b.onSaveInstanceState();
    }

    @Override // xsna.cjy0
    @NonNull
    public int[] getVisibleCardNumbers() {
        b bVar = this.b;
        int v = bVar.v();
        int x = bVar.x();
        if (v < 0 || x < 0) {
            return new int[0];
        }
        if (c1z0.a(bVar.findViewByPosition(v)) < 50.0f) {
            v++;
        }
        if (c1z0.a(bVar.findViewByPosition(x)) < 50.0f) {
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
    public final void h(Parcelable parcelable) {
        this.b.onRestoreInstanceState(parcelable);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void onScrollStateChanged(int i) {
        cjy0.a aVar;
        super.onScrollStateChanged(i);
        boolean z = i != 0;
        this.e = z;
        if (z || (aVar = this.f) == null) {
            return;
        }
        ((c9z0.a) aVar).b.e(getVisibleCardNumbers(), getContext());
    }

    @Override // xsna.cjy0
    public void setPromoCardSliderListener(@Nullable cjy0.a aVar) {
        this.f = aVar;
    }

    @Override // xsna.ucz0
    public void setupCards(@NonNull List<a5z0> list) {
        i9y0 i9y0Var = this.d;
        i9y0Var.d.addAll(list);
        if (isClickable()) {
            i9y0Var.e = this.c;
        }
        setCardLayoutManager(this.b);
        swapAdapter(i9y0Var, true);
    }

    @Override // xsna.ucz0
    @NonNull
    public View getView() {
        return this;
    }
}
