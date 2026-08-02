package xsna;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.picture.VkImage;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.superapp.ui.widgets.tile.TileBackground;
import com.vk.superapp.ui.widgets.tile.TileBackgroundImage;
import com.vk.superapp.ui.widgets.tile.TileStyle;
import com.vk.superapp.ui.widgets.tile.TileType;
import com.vkontakte.android.R;

/* compiled from: SuperAppTileWidgetBigIconHolder.kt */
/* loaded from: classes6.dex */
public class jcn0 extends fcn0 implements lhp0 {
    public final VkImage C;
    public final AppCompatImageView D;
    public final AppCompatTextView E;

    public jcn0(View view, u7n0 u7n0Var) {
        super(view, u7n0Var);
        this.C = (VkImage) this.itemView.findViewById(R.id.icon);
        this.D = (AppCompatImageView) this.itemView.findViewById(R.id.image_verified);
        this.E = (AppCompatTextView) this.itemView.findViewById(R.id.image_subicon_text);
    }

    @Override // xsna.fcn0, xsna.hf6
    /* renamed from: g6 */
    public void W5(men0 men0Var) {
        TileBackgroundImage tileBackgroundImage;
        TileBackground tileBackground = men0Var.c().o.b;
        if (tileBackground != null && (tileBackgroundImage = tileBackground.c) != null) {
            j6(tileBackgroundImage);
        }
        super.W5(men0Var);
    }

    public final void j6(TileBackgroundImage tileBackgroundImage) {
        TileStyle tileStyle = tileBackgroundImage.c;
        WebImage webImage = tileBackgroundImage.b;
        TileType tileType = tileStyle != null ? tileStyle.b : null;
        TileType tileType2 = TileType.CIRCLE;
        Drawable drawable = this.itemView.getContext().getDrawable(tileType == tileType2 ? R.drawable.vk_tile_image_background_circle : R.drawable.vk_tile_image_background_16dp);
        VkImage vkImage = this.C;
        vkImage.setBackground(drawable);
        kto0 h6 = h6();
        icn0 icn0Var = new icn0(this, 0);
        h6.getClass();
        kto0.a(tileBackgroundImage, this.D, this.E, icn0Var);
        zq70.E(vkImage, 8.0d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
        vkImage.setRound((tileStyle != null ? tileStyle.b : null) == tileType2);
        WebImageSize f = webImage.f(fcn0.y);
        vkImage.o0(f != null ? f.b : null, null);
    }
}
