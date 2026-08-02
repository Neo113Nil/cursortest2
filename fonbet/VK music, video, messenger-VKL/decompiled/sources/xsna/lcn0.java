package xsna;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.picture.VkImage;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.superapp.ui.widgets.tile.OverlapIcons;
import com.vk.superapp.ui.widgets.tile.TileBackground;
import com.vk.superapp.ui.widgets.tile.TileBackgroundImage;
import com.vk.superapp.ui.widgets.tile.TileStyle;
import com.vk.superapp.ui.widgets.tile.TileType;
import com.vkontakte.android.R;

/* compiled from: SuperAppTileWidgetOverlappedIconHolder.kt */
/* loaded from: classes6.dex */
public final class lcn0 extends jcn0 {
    public final VkImage F;
    public final AppCompatImageView G;
    public final AppCompatTextView H;

    public lcn0(View view, u7n0 u7n0Var) {
        super(view, u7n0Var);
        this.F = (VkImage) this.itemView.findViewById(R.id.overlapped_icon);
        this.G = (AppCompatImageView) this.itemView.findViewById(R.id.overlapped_image_verified);
        this.H = (AppCompatTextView) this.itemView.findViewById(R.id.overlapped_image_subicon_text);
    }

    @Override // xsna.jcn0, xsna.fcn0, xsna.hf6
    /* renamed from: g6 */
    public final void W5(men0 men0Var) {
        OverlapIcons overlapIcons;
        WebImageSize f;
        OverlapIcons overlapIcons2;
        OverlapIcons overlapIcons3;
        TileBackgroundImage tileBackgroundImage;
        TileBackground tileBackground = men0Var.c().o.b;
        if (tileBackground != null && (overlapIcons3 = tileBackground.e) != null && (tileBackgroundImage = overlapIcons3.b) != null) {
            j6(tileBackgroundImage);
        }
        Boolean bool = null;
        TileBackgroundImage tileBackgroundImage2 = (tileBackground == null || (overlapIcons2 = tileBackground.e) == null) ? null : overlapIcons2.c;
        TileStyle tileStyle = tileBackgroundImage2 != null ? tileBackgroundImage2.c : null;
        WebImage webImage = tileBackgroundImage2 != null ? tileBackgroundImage2.b : null;
        TileType tileType = tileStyle != null ? tileStyle.b : null;
        TileType tileType2 = TileType.CIRCLE;
        Drawable drawable = this.itemView.getContext().getDrawable(tileType == tileType2 ? R.drawable.vk_tile_image_background_circle : R.drawable.vk_tile_image_background_16dp);
        VkImage vkImage = this.F;
        vkImage.setBackground(drawable);
        kto0 h6 = h6();
        p1d0 p1d0Var = new p1d0(this, 21);
        h6.getClass();
        kto0.a(tileBackgroundImage2, this.G, this.H, p1d0Var);
        zq70.E(vkImage, 8.0d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
        vkImage.setRound((tileStyle != null ? tileStyle.b : null) == tileType2);
        vkImage.o0((webImage == null || (f = webImage.f(fcn0.y)) == null) ? null : f.b, null);
        if (tileBackground != null && (overlapIcons = tileBackground.e) != null) {
            bool = overlapIcons.d;
        }
        vkImage.setElevation(epx.f(bool, Boolean.TRUE) ? cn70.c(3) : cn70.c(1));
        super.W5(men0Var);
    }
}
