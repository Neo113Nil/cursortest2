package xsna;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.imageloader.view.VKImageView;
import com.vk.vmoji.character.model.ImageListModel;
import com.vk.vmoji.character.model.VmojiProductModel;
import com.vkontakte.android.R;

/* compiled from: VmojiProductHolder.kt */
/* loaded from: classes7.dex */
public final class k9w0 extends u6w0<l9w0> {
    public static final int p = cn70.b(73);
    public static final float q = cn70.a() * 0.33f;
    public static final float r = cn70.a() * 2.0f;
    public final b8w0 l;
    public final VKImageView m;
    public final ImageView n;
    public final TextView o;

    public k9w0(ViewGroup viewGroup, b8w0 b8w0Var) {
        super(R.layout.vmoji_character_paid_element_item, viewGroup);
        this.l = b8w0Var;
        VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.icon);
        this.m = vKImageView;
        this.n = (ImageView) this.itemView.findViewById(R.id.state);
        this.o = (TextView) this.itemView.findViewById(R.id.badge);
        vKImageView.setPaintFilterBitmap(true);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(hfz hfzVar) {
        l9w0 l9w0Var = (l9w0) hfzVar;
        VmojiProductModel vmojiProductModel = l9w0Var.b;
        p8w0.e(this.n, vmojiProductModel.f);
        p8w0.b(this.o, vmojiProductModel.g);
        boolean z = l9w0Var.c;
        VKImageView vKImageView = this.m;
        if (z) {
            vKImageView.y0(r, dhr0.t.c(R.attr.vk_legacy_accent));
        } else {
            vKImageView.y0(q, this.itemView.getContext().getColor(R.color.vk_black_alpha8));
        }
        vKImageView.load(ImageListModel.Ab(vmojiProductModel.e, p));
        jjc.g(vKImageView, new mz80(21, l9w0Var, this));
    }
}
