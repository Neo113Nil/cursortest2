package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.imageloader.ImageScreenSize;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.xha0;

/* compiled from: VerticalizationPickerPreviewAdapter.kt */
/* loaded from: classes16.dex */
public final class bqr0 extends androidx.recyclerview.widget.x<xha0, RecyclerView.e0> {
    public final gda0 c;

    /* compiled from: VerticalizationPickerPreviewAdapter.kt */
    public static final class a extends RecyclerView.e0 {
        public final View l;
        public final ImageView m;
        public final ImageView n;

        public a(View view, gda0 gda0Var) {
            super(view);
            this.l = this.itemView.findViewById(R.id.picker_preview_default_selector);
            ImageView imageView = (ImageView) this.itemView.findViewById(R.id.picker_preview_default_blur);
            this.m = imageView;
            this.n = (ImageView) this.itemView.findViewById(R.id.picker_preview_default_image);
            bwt0.d(imageView, iah0.b(8.0f), (r4 & 2) != 0, (r4 & 4) != 0);
            this.itemView.setOnClickListener(new n2q(6, gda0Var, this));
        }
    }

    /* compiled from: VerticalizationPickerPreviewAdapter.kt */
    public static final class b extends RecyclerView.e0 {
        public final View l;
        public final VKImageView m;

        public b(View view, gda0 gda0Var) {
            super(view);
            this.l = this.itemView.findViewById(R.id.picker_preview_verticalized_selector);
            VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.picker_preview_verticalized_image);
            this.m = vKImageView;
            bwt0.d(vKImageView, iah0.b(8.0f), (r4 & 2) != 0, (r4 & 4) != 0);
            vKImageView.setDontLoadAgainIfSameResource(true);
            this.itemView.setOnClickListener(new k1f(3, gda0Var, this));
        }
    }

    public bqr0(gda0 gda0Var) {
        super(new rxm(true));
        this.c = gda0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        xha0 item = getItem(i);
        if (item instanceof xha0.b) {
            return R.layout.item_verticalization_picker_preview_verticalized;
        }
        if (item instanceof xha0.a) {
            return R.layout.item_verticalization_picker_preview_default;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        xha0 item = getItem(i);
        if (e0Var instanceof b) {
            b bVar = (b) e0Var;
            xha0.b bVar2 = (xha0.b) item;
            bVar.l.setSelected(bVar2.b);
            bVar.m.O0(bVar2.c, ImageScreenSize.SIZE_48DP);
            return;
        }
        if (e0Var instanceof a) {
            a aVar = (a) e0Var;
            xha0.a aVar2 = (xha0.a) item;
            aVar.l.setSelected(aVar2.b);
            aVar.m.setImageBitmap(aVar2.c);
            aVar.n.setImageBitmap(aVar2.d);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View b2 = tf3.b(viewGroup, i, viewGroup, false);
        gda0 gda0Var = this.c;
        return i == R.layout.item_verticalization_picker_preview_verticalized ? new b(b2, gda0Var) : new a(b2, gda0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i, List<Object> list) {
        if (j5g.a0(list) instanceof fei0) {
            xha0 item = getItem(i);
            if (e0Var instanceof b) {
                ((b) e0Var).l.setSelected(((xha0.b) item).b);
                return;
            } else {
                if (e0Var instanceof a) {
                    ((a) e0Var).l.setSelected(((xha0.a) item).b);
                    return;
                }
                return;
            }
        }
        onBindViewHolder(e0Var, i);
    }
}
