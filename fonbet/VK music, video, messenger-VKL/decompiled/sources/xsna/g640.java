package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: MultiStoryHolder.kt */
/* loaded from: classes16.dex */
public final class g640 extends hf6<h640> {
    public final izs<Integer, s3q0> m;
    public final ImageView n;

    public g640(View view, bjk bjkVar) {
        super(view);
        this.m = bjkVar;
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.photo);
        this.n = imageView;
        imageView.setClipToOutline(true);
        bwt0.i0(imageView, new fju(this, 10));
    }

    @Override // xsna.hf6
    public final void W5(h640 h640Var) {
        h640 h640Var2 = h640Var;
        Bitmap bitmap = h640Var2.a;
        ImageView imageView = this.n;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            Context context = this.itemView.getContext();
            e3m.a aVar = e3m.a;
            imageView.setImageDrawable(new ColorDrawable(context.getColor(R.color.vk_white)));
        }
        imageView.setSelected(h640Var2.b);
        imageView.setContentDescription(h640Var2.c ? this.itemView.getContext().getString(R.string.accessibility_video) : this.itemView.getContext().getString(R.string.accessibility_photo));
    }
}
