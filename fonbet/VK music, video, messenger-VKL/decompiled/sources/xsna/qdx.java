package xsna;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.Base64;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.image.VkEnhancedImageView;
import java.nio.ByteBuffer;
import xsna.hso0;

/* compiled from: InterestingStoriesAdapter.kt */
/* loaded from: classes6.dex */
public final class qdx extends androidx.recyclerview.widget.x<dfx, a> {
    public izs<? super String, s3q0> c;

    /* compiled from: InterestingStoriesAdapter.kt */
    public static final class a extends RecyclerView.e0 {
        public final efx l;

        public a(efx efxVar) {
            super(efxVar);
            this.l = efxVar;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        dfx item = getItem(i);
        efx efxVar = ((a) e0Var).l;
        efxVar.setName(item.b);
        String str = item.c;
        String str2 = item.d;
        VkEnhancedImageView vkEnhancedImageView = efxVar.b;
        vkEnhancedImageView.s0(str);
        if (str2 != null) {
            hso0.b a2 = hso0.a(Base64.decode(str2, 3));
            Bitmap createBitmap = Bitmap.createBitmap(a2.a, a2.b, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(a2.c));
            vkEnhancedImageView.setPlaceholderImage(new BitmapDrawable(efxVar.getContext().getResources(), createBitmap));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        efx efxVar = new efx(viewGroup.getContext());
        a aVar = new a(efxVar);
        efxVar.setOnClickListener(new a6u(1, aVar, this));
        return aVar;
    }
}
