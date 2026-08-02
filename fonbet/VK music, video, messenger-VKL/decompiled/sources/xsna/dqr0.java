package xsna;

import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.xha0;

/* compiled from: VerticalizationPickerViewPagerAdapter.kt */
/* loaded from: classes16.dex */
public final class dqr0 extends androidx.recyclerview.widget.x<xha0, RecyclerView.e0> {

    /* compiled from: VerticalizationPickerViewPagerAdapter.kt */
    public static final class a extends RecyclerView.e0 {
        public final View l;
        public final ImageView m;

        public a(View view) {
            super(view);
            this.l = this.itemView.findViewById(R.id.picker_page_default_bg);
            ImageView imageView = (ImageView) this.itemView.findViewById(R.id.picker_page_default_image);
            this.m = imageView;
            bwt0.d(imageView, iah0.b(18.0f), (r4 & 2) != 0, (r4 & 4) != 0);
        }
    }

    /* compiled from: VerticalizationPickerViewPagerAdapter.kt */
    public static final class b extends RecyclerView.e0 {
        public final VKImageView l;

        public b(View view) {
            super(view);
            VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.picker_page_verticalized_image);
            this.l = vKImageView;
            vKImageView.setDontLoadAgainIfSameResource(true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        xha0 item = getItem(i);
        if (item instanceof xha0.b) {
            return R.layout.item_verticalization_picker_page_verticalized;
        }
        if (item instanceof xha0.a) {
            return R.layout.item_verticalization_picker_page_default;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        xha0 item = getItem(i);
        if (e0Var instanceof b) {
            ((b) e0Var).l.load(((xha0.b) item).c);
            return;
        }
        if (e0Var instanceof a) {
            a aVar = (a) e0Var;
            xha0.a aVar2 = (xha0.a) item;
            View view = aVar.l;
            view.setBackground(new BitmapDrawable(view.getResources(), aVar2.c));
            aVar.m.setImageBitmap(aVar2.d);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View b2 = tf3.b(viewGroup, i, viewGroup, false);
        return i == R.layout.item_verticalization_picker_page_verticalized ? new b(b2) : new a(b2);
    }
}
