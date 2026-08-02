package xsna;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.core.view.components.picture.VkImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.superapp.ui.widgets.tile.TileBackground;
import com.vk.superapp.ui.widgets.tile.TileBackgroundImage;
import com.vk.superapp.ui.widgets.tile.TileStyle;
import com.vk.superapp.ui.widgets.tile.TileType;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: SuperAppTileWidgetGridIconHolder.kt */
/* loaded from: classes6.dex */
public final class kcn0 extends fcn0 implements lhp0 {
    public final List<VkImage> C;
    public final List<AppCompatImageView> D;
    public final List<AppCompatTextView> E;

    public kcn0(View view, u7n0 u7n0Var) {
        super(view, u7n0Var);
        VkImage vkImage = (VkImage) this.itemView.findViewById(R.id.first_image_view);
        VkImage vkImage2 = (VkImage) this.itemView.findViewById(R.id.second_image_view);
        VkImage vkImage3 = (VkImage) this.itemView.findViewById(R.id.third_image_view);
        VkImage vkImage4 = (VkImage) this.itemView.findViewById(R.id.fourth_image_view);
        AppCompatImageView appCompatImageView = (AppCompatImageView) this.itemView.findViewById(R.id.first_verified_image_view);
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) this.itemView.findViewById(R.id.second_verified_image_view);
        AppCompatImageView appCompatImageView3 = (AppCompatImageView) this.itemView.findViewById(R.id.third_verified_image_view);
        AppCompatImageView appCompatImageView4 = (AppCompatImageView) this.itemView.findViewById(R.id.fourth_verified_image_view);
        AppCompatTextView appCompatTextView = (AppCompatTextView) this.itemView.findViewById(R.id.first_image_subicon_text);
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) this.itemView.findViewById(R.id.second_image_subicon_text);
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) this.itemView.findViewById(R.id.third_image_subicon_text);
        AppCompatTextView appCompatTextView4 = (AppCompatTextView) this.itemView.findViewById(R.id.fourth_image_subicon_text);
        this.C = e43.l(vkImage, vkImage2, vkImage3, vkImage4);
        this.D = e43.l(appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4);
        this.E = e43.l(appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4);
    }

    @Override // xsna.fcn0, xsna.hf6
    /* renamed from: g6 */
    public final void W5(men0 men0Var) {
        List<TileBackgroundImage> list;
        TileStyle tileStyle;
        WebImageSize f;
        TileStyle tileStyle2;
        TileBackground tileBackground = men0Var.c().o.b;
        if (tileBackground != null && (list = tileBackground.b) != null) {
            int i = 0;
            for (Object obj : this.C) {
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                VkImage vkImage = (VkImage) obj;
                TileBackgroundImage tileBackgroundImage = (TileBackgroundImage) j5g.b0(i, list);
                TileType tileType = (tileBackgroundImage == null || (tileStyle2 = tileBackgroundImage.c) == null) ? null : tileStyle2.b;
                TileType tileType2 = TileType.CIRCLE;
                vkImage.setBackground(this.itemView.getContext().getDrawable(tileType == tileType2 ? R.drawable.vk_tile_image_background_circle : R.drawable.vk_tile_image_background_10dp));
                kto0 h6 = h6();
                AppCompatImageView appCompatImageView = this.D.get(i);
                AppCompatTextView appCompatTextView = this.E.get(i);
                so40 so40Var = new so40(this, 27);
                h6.getClass();
                kto0.a(tileBackgroundImage, appCompatImageView, appCompatTextView, so40Var);
                TileBackgroundImage tileBackgroundImage2 = (TileBackgroundImage) j5g.b0(i, list);
                String str = (tileBackgroundImage2 == null || (f = tileBackgroundImage2.b.f(fcn0.z)) == null) ? null : f.b;
                vkImage.setCornerRadius(cn70.a() * 8.0f);
                vkImage.setRound(((tileBackgroundImage == null || (tileStyle = tileBackgroundImage.c) == null) ? null : tileStyle.b) == tileType2);
                vkImage.o0(str, null);
                i = i2;
            }
        }
        super.W5(men0Var);
    }
}
