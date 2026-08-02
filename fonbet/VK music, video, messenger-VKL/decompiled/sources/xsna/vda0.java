package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.photo.Photo;
import com.vkontakte.android.R;

/* compiled from: PhotoViewHolder.kt */
/* loaded from: classes4.dex */
public final class vda0 extends vif0<ucv0> implements View.OnClickListener {
    public static final /* synthetic */ int r = 0;
    public final kdg0 n;
    public final wzs<Photo, Boolean, s3q0> o;
    public final VkImage p;
    public final ImageView q;

    public vda0(ViewGroup viewGroup, kdg0 kdg0Var, m00 m00Var, p40 p40Var) {
        super(tf3.b(viewGroup, R.layout.media_picker_photo_vk_list_item, viewGroup, false));
        this.n = kdg0Var;
        this.o = m00Var;
        VkImage vkImage = (VkImage) this.itemView.findViewById(R.id.image);
        this.p = vkImage;
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.checkbox);
        this.q = imageView;
        vkImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
        vkImage.setPlaceholderImage(new zoo(R.attr.vk_ui_background_secondary));
        vkImage.y0(iah0.b(0.5f), dhr0.t.c(R.attr.vk_ui_image_border_alpha));
        vkImage.setDontLoadAgainIfSameResource(true);
        if (vkImage.getContentDescription() == null) {
            vkImage.setContentDescription(this.itemView.getContext().getString(R.string.accessibility_photo));
        }
        imageView.setOnClickListener(this);
        bwt0.i0(this.itemView, new nm1(21, p40Var, this));
    }

    @Override // xsna.vif0
    public final void i6(ucv0 ucv0Var) {
        ucv0 ucv0Var2 = ucv0Var;
        Photo photo = ucv0Var2.a;
        uda0 uda0Var = new uda0(3, this, vda0.class, "getUrlToLoad", "getUrlToLoad(Lcom/vk/dto/photo/Photo;II)Ljava/lang/String;", 0);
        kdg0 kdg0Var = this.n;
        VkImage vkImage = this.p;
        kdg0Var.i(vkImage, photo, false, uda0Var);
        this.itemView.setTag(photo);
        vkImage.setContentDescription(ucv0Var2.c);
        int i = ucv0Var2.d;
        ImageView imageView = this.q;
        imageView.setImageResource(i);
        iut0.q(imageView, new cl(ucv0Var2.b ? R.string.media_item_checked_checkbox_accessibly : R.string.media_item_unchecked_checkbox_accessibly));
        imageView.setContentDescription(ucv0Var2.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        view.performHapticFeedback(0);
        T t = this.m;
        this.o.invoke(((ucv0) t).a, Boolean.valueOf(((ucv0) t).b));
    }

    public final VkImage q6() {
        return this.p;
    }
}
