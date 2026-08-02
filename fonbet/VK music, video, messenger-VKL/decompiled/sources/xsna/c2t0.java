package xsna;

import android.util.Size;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.vk.core.view.components.cell.VkCell;
import com.vk.newsfeed.posting.mediapicker.videovk.presentation.VkVideoPickerFragment;
import kotlin.collections.EmptyList;
import xsna.g3t0;

/* compiled from: VideoPickerAdapter.kt */
/* loaded from: classes4.dex */
public final class c2t0 extends androidx.recyclerview.widget.x<m0w0, g3t0> implements vic {
    public static final a d = new a();
    public final VkVideoPickerFragment c;

    /* compiled from: VideoPickerAdapter.kt */
    public static final class a extends m.e<m0w0> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(m0w0 m0w0Var, m0w0 m0w0Var2) {
            return m0w0Var.equals(m0w0Var2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(m0w0 m0w0Var, m0w0 m0w0Var2) {
            return epx.f(m0w0Var.a.a1(), m0w0Var2.a.a1());
        }
    }

    public c2t0(VkVideoPickerFragment vkVideoPickerFragment) {
        super(d);
        this.c = vkVideoPickerFragment;
    }

    @Override // xsna.vic, com.vk.lists.c.i
    public final void clear() {
        submitList(EmptyList.b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        VkCell.Left.c.a aVar;
        g3t0 g3t0Var = (g3t0) e0Var;
        m0w0 item = getItem(i);
        VkCell vkCell = g3t0Var.m;
        g3t0Var.n = item.a;
        VkCell.Left.Main.e eVar = new VkCell.Left.Main.e(new g3t0.c(item), new Size(-1, -2));
        if (item.k) {
            aVar = new VkCell.Left.c.a((gzs) new cq6(0, g3t0Var, g3t0.class, "handleCheckboxClick", "handleCheckboxClick()V", 0, 6), item.b, true);
        } else {
            aVar = null;
        }
        VkCell.Left.Companion.getClass();
        vkCell.setLeft(new VkCell.Left.b(eVar, aVar));
        vkCell.setMiddle(item.f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new g3t0(this.c, viewGroup);
    }
}
