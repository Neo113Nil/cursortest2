package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import xsna.c9z0;
import xsna.cjy0;
import xsna.yey0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class i9y0 extends RecyclerView.Adapter {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public yey0.a e;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class a extends FrameLayout {
        @Override // android.widget.FrameLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            if (size == 0) {
                size = 0;
            }
            if (size2 == 0) {
                size2 = 0;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, mode), View.MeasureSpec.makeMeasureSpec(size2, mode2));
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class b extends RecyclerView.e0 {
        public final whz0 l;
        public final FrameLayout m;

        public b(a aVar, whz0 whz0Var, FrameLayout frameLayout) {
            super(aVar);
            this.l = whz0Var;
            this.m = frameLayout;
        }
    }

    public i9y0(Context context) {
        this.c = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        if (i == 0) {
            return 1;
        }
        return i == this.d.size() - 1 ? 2 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        cjy0.a aVar;
        b bVar = (b) e0Var;
        yey0.a aVar2 = this.e;
        if (aVar2 != null && (aVar = yey0.this.f) != null) {
            ((c9z0.a) aVar).b(i);
        }
        ArrayList arrayList = this.d;
        a5z0 a5z0Var = i < arrayList.size() ? (a5z0) arrayList.get(i) : null;
        kiw kiwVar = a5z0Var != null ? a5z0Var.t : null;
        if (kiwVar != null) {
            whz0 whz0Var = bVar.l;
            int i2 = kiwVar.b;
            int i3 = kiwVar.c;
            whz0Var.e = i2;
            whz0Var.d = i3;
            Bitmap a2 = kiwVar.a();
            if (a2 != null) {
                whz0Var.setImageBitmap(a2);
            } else {
                o2z0.e(kiwVar, whz0Var, null);
            }
        }
        bVar.l.setContentDescription("card_" + i);
        bVar.m.setOnClickListener(new vr6(this, 12));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context context = this.c;
        a aVar = new a(context);
        aVar.setLayoutParams(new RelativeLayout.LayoutParams(-2, -1));
        whz0 whz0Var = new whz0(context);
        c1z0.n(whz0Var, "card_media_view");
        aVar.addView(whz0Var, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        if (viewGroup.isClickable()) {
            c1z0.h(frameLayout, 0, 1153821432);
        }
        aVar.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        return new b(aVar, whz0Var, frameLayout);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewRecycled(RecyclerView.e0 e0Var) {
        a5z0 a5z0Var;
        kiw kiwVar;
        b bVar = (b) e0Var;
        int adapterPosition = bVar.getAdapterPosition();
        whz0 whz0Var = bVar.l;
        if (adapterPosition > 0) {
            ArrayList arrayList = this.d;
            if (adapterPosition < arrayList.size()) {
                a5z0Var = (a5z0) arrayList.get(adapterPosition);
                whz0Var.setImageData(null);
                kiwVar = a5z0Var == null ? a5z0Var.t : null;
                if (kiwVar != null) {
                    o2z0.d(kiwVar, whz0Var);
                }
                bVar.m.setOnClickListener(null);
            }
        }
        a5z0Var = null;
        whz0Var.setImageData(null);
        if (a5z0Var == null) {
        }
        if (kiwVar != null) {
        }
        bVar.m.setOnClickListener(null);
    }
}
