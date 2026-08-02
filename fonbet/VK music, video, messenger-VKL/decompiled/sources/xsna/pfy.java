package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.imageloader.view.VKImageView;
import com.vk.stickers.ContextUser;
import com.vkontakte.android.R;

/* compiled from: KeyboardHeaderHolder.kt */
/* loaded from: classes6.dex */
public final class pfy extends qf6 {
    public final y4l0 l;
    public final TextView m;
    public final ImageButton n;
    public final ImageView o;
    public final ImageButton p;
    public final VKImageView q;
    public final View r;

    public pfy(ViewGroup viewGroup, y4l0 y4l0Var) {
        super(viewGroup, R.layout.sticker_keyboard_header, 0);
        this.l = y4l0Var;
        this.m = (TextView) this.itemView.findViewById(R.id.pack_name);
        this.n = (ImageButton) this.itemView.findViewById(R.id.pack_style_settings_btn);
        this.o = (ImageView) this.itemView.findViewById(R.id.pack_style_indicator);
        this.p = (ImageButton) this.itemView.findViewById(R.id.gift_button);
        this.q = (VKImageView) this.itemView.findViewById(R.id.context_user_avatar);
        this.r = this.itemView.findViewById(R.id.context_user_check);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    @Override // xsna.vfz
    /* renamed from: W5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i6(hfz hfzVar) {
        sfy sfyVar = (sfy) hfzVar;
        gzs<ContextUser> gzsVar = sfyVar.e;
        this.m.setText(sfyVar.b);
        StickerStockItem stickerStockItem = sfyVar.d;
        ImageView imageView = this.o;
        ImageButton imageButton = this.n;
        View view = this.r;
        ImageButton imageButton2 = this.p;
        VKImageView vKImageView = this.q;
        if (stickerStockItem != null) {
            boolean z = false;
            if (!stickerStockItem.Bb() && stickerStockItem.i && !stickerStockItem.m && sfyVar.c >= 0) {
                ContextUser invoke = gzsVar.invoke();
                UserId invoke2 = sfyVar.f.invoke();
                if (invoke == null || invoke2 == null || invoke.b.b != invoke2.b) {
                    imageButton2.setVisibility(0);
                    ContextUser invoke3 = gzsVar.invoke();
                    if (invoke3 == null || !invoke3.zb(stickerStockItem)) {
                        f4m.j(vKImageView);
                        f4m.j(view);
                    } else {
                        vKImageView.load(invoke3.d);
                        vKImageView.setVisibility(0);
                        view.setVisibility(0);
                    }
                    bwt0.p0(imageButton, stickerStockItem.J.isEmpty() || !stickerStockItem.Ib());
                    if (!stickerStockItem.Ib()) {
                        t6g0 t6g0Var = t6g0.b;
                        if (t6g0.d().p0(stickerStockItem)) {
                            z = true;
                        }
                    }
                    bwt0.p0(imageView, z);
                }
            }
            f4m.j(imageButton2);
            f4m.j(vKImageView);
            f4m.j(view);
            bwt0.p0(imageButton, stickerStockItem.J.isEmpty() || !stickerStockItem.Ib());
            if (!stickerStockItem.Ib()) {
            }
            bwt0.p0(imageView, z);
        } else {
            f4m.j(imageButton2);
            f4m.j(vKImageView);
            f4m.j(view);
            f4m.j(imageButton);
            f4m.j(imageView);
        }
        bwt0.i0(imageButton2, new k8(20, this, sfyVar));
        bwt0.i0(imageButton, new hn0(17, this, sfyVar));
    }
}
