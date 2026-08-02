package xsna;

import android.text.TextUtils;
import android.view.View;
import com.vk.dto.stickers.StickerItem;
import com.vk.stickers.views.VKStickerImageView;
import com.vk.stickers.views.animation.VKAnimationView;
import com.vkontakte.android.R;
import xsna.o8l0;

/* compiled from: StickerAdapterItems.kt */
/* loaded from: classes2.dex */
public final class b8l0 extends vfz<d8l0> {
    public static final /* synthetic */ int p = 0;
    public final o8l0.a l;
    public final VKStickerImageView m;
    public final VKAnimationView n;
    public StickerItem o;

    public b8l0(View view, o8l0.a aVar) {
        super(view);
        this.l = aVar;
        VKStickerImageView vKStickerImageView = (VKStickerImageView) view.findViewById(R.id.sticker_image);
        this.m = vKStickerImageView;
        VKAnimationView vKAnimationView = (VKAnimationView) view.findViewById(R.id.animated_sticker);
        this.n = vKAnimationView;
        bwt0.i0(vKStickerImageView, new e810(this, 29));
        bwt0.i0(vKAnimationView, new n3b0(this, 15));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(d8l0 d8l0Var) {
        d8l0 d8l0Var2 = d8l0Var;
        StickerItem stickerItem = d8l0Var2.b;
        this.o = stickerItem;
        String a = stickerItem.a(dhr0.M());
        View view = this.itemView;
        StickerItem stickerItem2 = this.o;
        if (stickerItem2 == null) {
            stickerItem2 = null;
        }
        view.setTag(R.id.id, Integer.valueOf(stickerItem2.b));
        boolean isEmpty = TextUtils.isEmpty(a);
        VKAnimationView vKAnimationView = this.n;
        VKStickerImageView vKStickerImageView = this.m;
        if (!isEmpty && d8l0Var2.c) {
            vKStickerImageView.setVisibility(8);
            vKAnimationView.setVisibility(0);
            StickerItem stickerItem3 = this.o;
            vKAnimationView.v0((stickerItem3 != null ? stickerItem3 : null).b, a, true);
            return;
        }
        vKStickerImageView.setVisibility(0);
        vKAnimationView.setVisibility(8);
        t6g0 t6g0Var = t6g0.b;
        kcl0 d = t6g0.d();
        StickerItem stickerItem4 = this.o;
        if (stickerItem4 == null) {
            stickerItem4 = null;
        }
        String z0 = d.z0(stickerItem4, h9l0.d, dhr0.M());
        StickerItem stickerItem5 = this.o;
        vKStickerImageView.setOnLoadCallback(new cgr0(vKStickerImageView, (stickerItem5 != null ? stickerItem5 : null).b));
        vKStickerImageView.T0(z0);
    }
}
