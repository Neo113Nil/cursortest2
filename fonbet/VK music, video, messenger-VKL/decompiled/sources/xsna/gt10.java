package xsna;

import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.mediapicker.VkMediaPicker;
import com.vk.core.view.mediapicker.views.AspectRatioLinearLayout;
import com.vkontakte.android.R;
import java.util.List;
import xsna.ehw;

/* compiled from: MediaPickerAdapter.kt */
/* loaded from: classes17.dex */
public final class gt10 extends gf6<xp10> {
    public final VkMediaPicker.CellAspectRation e;
    public final VkMediaPicker f;
    public Size g;

    /* compiled from: MediaPickerAdapter.kt */
    public interface a {
        void C();

        void C0();

        void D();

        void G0(uai0 uai0Var);

        void P0();

        void Z1(uai0 uai0Var);

        void u2(uai0 uai0Var);

        void v2();
    }

    public gt10(VkMediaPicker.CellAspectRation cellAspectRation, VkMediaPicker vkMediaPicker) {
        super(new com.vk.lists.a(zp10.a), 2);
        this.e = cellAspectRation;
        this.f = vkMediaPicker;
    }

    @Override // xsna.gf6
    public final hf6 K0(int i, View view) {
        ek90.a.getClass();
        int i2 = ek90.c;
        VkMediaPicker vkMediaPicker = this.f;
        if (i == i2) {
            return new dk90(view, vkMediaPicker);
        }
        VkMediaPicker.CellAspectRation cellAspectRation = this.e;
        if (i == R.layout.ds_camera_cell_holder) {
            return new qg9(view, cellAspectRation, vkMediaPicker);
        }
        eg9.a.getClass();
        if (i == eg9.c) {
            return new fg9(view, vkMediaPicker);
        }
        if (i == R.layout.ds_image_cell_holder) {
            return new ghw(view, cellAspectRation, vkMediaPicker, new s1x(this, 8));
        }
        hsa0.a.getClass();
        if (i == hsa0.b) {
            jsa0 jsa0Var = new jsa0(view);
            ((AspectRatioLinearLayout) view).setAspectRation(cellAspectRation.i());
            return jsa0Var;
        }
        w6s.a.getClass();
        if (i == w6s.c) {
            u6s u6sVar = new u6s(view);
            FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.loading_view_container);
            frameLayout.addView(x6s.a.b(u6sVar.itemView.getContext(), frameLayout).itemView);
            return u6sVar;
        }
        k6s.a.getClass();
        if (i == k6s.c) {
            return new i6s(view, vkMediaPicker);
        }
        throw new IllegalStateException(lhg.a(i, "Unsupported viewType = "));
    }

    public final void O0() {
        Size size = this.g;
        RecyclerView recyclerView = this.d;
        RecyclerView.o layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        int i = iah0.f().widthPixels / (gridLayoutManager != null ? gridLayoutManager.s : 1);
        Size size2 = new Size(i, (int) (this.e.i() * i));
        this.g = size2;
        if (size == null || size.equals(size2)) {
            return;
        }
        notifyItemRangeChanged(0, E0());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i, List list) {
        hf6 hf6Var = (hf6) e0Var;
        Object a0 = j5g.a0(list);
        if ((a0 instanceof ehw.b) && (hf6Var instanceof ghw)) {
            ((ghw) hf6Var).b6((ehw.b) a0);
        } else {
            onBindViewHolder(hf6Var, i);
        }
    }
}
