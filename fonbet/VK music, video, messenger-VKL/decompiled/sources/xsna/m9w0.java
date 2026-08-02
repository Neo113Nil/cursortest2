package xsna;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.imageloader.view.VKImageView;
import com.vk.vmoji.character.model.ImageListModel;
import com.vk.vmoji.character.model.VmojiProductModel;
import com.vkontakte.android.R;

/* compiled from: VmojiProductLargeHolder.kt */
/* loaded from: classes7.dex */
public final class m9w0 extends u6w0<l9w0> {
    public final caw0 l;
    public final VKImageView m;
    public final TextView n;
    public final ImageView o;
    public final TextView p;
    public final TextView q;
    public final TextView r;

    public m9w0(ViewGroup viewGroup, caw0 caw0Var) {
        super(R.layout.vmoji_character_paid_element_large_item, viewGroup);
        this.l = caw0Var;
        VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.icon);
        this.m = vKImageView;
        this.n = (TextView) this.itemView.findViewById(R.id.badge);
        this.o = (ImageView) this.itemView.findViewById(R.id.state);
        this.p = (TextView) this.itemView.findViewById(R.id.pack_title);
        this.q = (TextView) this.itemView.findViewById(R.id.pack_subtitle);
        this.r = (TextView) this.itemView.findViewById(R.id.pack_subsubtitle);
        vKImageView.setPaintFilterBitmap(true);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(hfz hfzVar) {
        l9w0 l9w0Var = (l9w0) hfzVar;
        VmojiProductModel vmojiProductModel = l9w0Var.b;
        boolean z = l9w0Var.c;
        VKImageView vKImageView = this.m;
        if (z) {
            vKImageView.y0(cn70.a() * 2.0f, dhr0.t.c(R.attr.vk_legacy_accent));
        } else {
            vKImageView.y0(cn70.a() * 0.33f, this.itemView.getContext().getColor(R.color.vk_black_alpha8));
        }
        vKImageView.load(ImageListModel.Ab(vmojiProductModel.e, cn70.b(104)));
        this.p.setText(vmojiProductModel.c);
        p8w0.b(this.n, vmojiProductModel.g);
        p8w0.e(this.o, vmojiProductModel.f);
        p8w0.c(this.q, this.r, vmojiProductModel.h);
        jjc.g(vKImageView, new h9i0(7, l9w0Var, this));
    }
}
