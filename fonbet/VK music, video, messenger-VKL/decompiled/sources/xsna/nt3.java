package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.drawee.generic.RoundingParams;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.discover.carousel.artist.ArtistsCarouselItem;
import com.vk.dto.music.Artist;
import com.vk.imageloader.view.VKImageView;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.newsfeed.common.util.ImageUtils;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import org.chromium.base.TimeUtils;
import xsna.dek0;
import xsna.k840;

/* compiled from: ArtistsCarouselItemHolder.kt */
/* loaded from: classes4.dex */
public final class nt3 extends vif0<ArtistsCarouselItem> implements View.OnClickListener {
    public final String n;
    public final TextView o;
    public final VKImageView p;
    public final ImageUtils q;
    public final u750 r;

    public nt3(ViewGroup viewGroup, String str) {
        super(viewGroup, R.layout.artist_carousel_item, 0);
        float[] fArr;
        this.n = str;
        this.o = (TextView) this.itemView.findViewById(R.id.title);
        bwt0.p0((ImageView) this.itemView.findViewById(R.id.icon_meta), false);
        VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.icon);
        this.p = vKImageView;
        this.q = new ImageUtils();
        s750 s750Var = k840.a.e;
        this.r = s750Var == null ? null : s750Var;
        int i = dek0.a;
        RoundingParams roundingParams = vKImageView.getHierarchy().c;
        dek0.b(vKImageView, null, new dek0.a((roundingParams == null || (fArr = roundingParams.c) == null) ? -1.0f : fArr[0], true), 2);
        bwt0.h0(this, this.itemView);
    }

    @Override // xsna.vif0
    public final void i6(ArtistsCarouselItem artistsCarouselItem) {
        ImageSize Cb;
        float[] fArr;
        Artist artist = artistsCarouselItem.b;
        if (artist == null) {
            return;
        }
        this.o.setText(artist.c);
        ImageUtils.ContentType contentType = ImageUtils.ContentType.Artist;
        VKImageView vKImageView = this.p;
        RoundingParams roundingParams = vKImageView.getHierarchy().c;
        float f = (roundingParams == null || (fArr = roundingParams.c) == null) ? -1.0f : fArr[0];
        LinkedHashMap linkedHashMap = this.q.a;
        String str = null;
        if ((contentType == null ? -1 : ImageUtils.a.$EnumSwitchMapping$0[contentType.ordinal()]) == 1) {
            Context context = vKImageView.getContext();
            String a = n23.a(f, "2131238622_");
            Drawable drawable = (Drawable) linkedHashMap.get(a);
            Drawable drawable2 = drawable;
            if (drawable == null) {
                hny hnyVar = new hny(context);
                hnyVar.d(R.drawable.vk_icon_music_mic_24, R.attr.vk_ui_vkontakte_color_placeholder_icon_foreground_secondary);
                hnyVar.c(f, R.attr.vk_ui_image_placeholder);
                linkedHashMap.put(a, hnyVar);
                drawable2 = hnyVar;
            }
            vKImageView.setEmptyImagePlaceholder(drawable2);
        } else {
            Context context2 = vKImageView.getContext();
            String valueOf = String.valueOf(f);
            Drawable drawable3 = (Drawable) linkedHashMap.get(valueOf);
            Drawable drawable4 = drawable3;
            if (drawable3 == null) {
                hny hnyVar2 = new hny(context2);
                hnyVar2.c(f, R.attr.vk_ui_image_placeholder);
                linkedHashMap.put(valueOf, hnyVar2);
                drawable4 = hnyVar2;
            }
            vKImageView.setEmptyImagePlaceholder(drawable4);
            vKImageView.setBackgroundImage(null);
        }
        Image image = artist.f;
        if (image != null && (Cb = image.Cb(b6().getDimensionPixelSize(R.dimen.artist_carousel_item_content_item_width), true, false)) != null) {
            str = Cb.d.d;
        }
        vKImageView.s0(str);
        String str2 = artist.b;
        StringBuilder sb = new StringBuilder("view_recommended_artist_id:");
        sb.append(str2);
        sb.append(':');
        String str3 = this.n;
        sb.append(str3);
        String sb2 = sb.toString();
        if (com.vkontakte.android.data.b.i(sb2)) {
            return;
        }
        this.r.p(str2, artist.j, MusicPlaybackLaunchContext.Fb(str3).t());
        com.vkontakte.android.data.b.e(TimeUtils.MILLISECONDS_PER_DAY, sb2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Artist artist = ((ArtistsCarouselItem) this.m).b;
        if (artist != null) {
            this.r.G(artist.b, artist.j, MusicPlaybackLaunchContext.Fb(this.n).t());
            fl4 g = lyd.g();
            Context context = view.getContext();
            int i = fl4.a;
            g.H(context, artist);
        }
    }
}
