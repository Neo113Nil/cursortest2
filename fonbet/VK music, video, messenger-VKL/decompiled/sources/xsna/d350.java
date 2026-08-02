package xsna;

import android.content.Context;
import android.view.ViewGroup;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.music.Artist;
import com.vk.imageloader.view.VKCircleImageView;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: MusicRecommendationResultOnBoardingVh.kt */
/* loaded from: classes3.dex */
public final class d350 extends se50<Artist> {
    public final VKCircleImageView n;
    public final int o;

    public d350(ViewGroup viewGroup) {
        super(R.layout.item_recommendation_onboarding_result, viewGroup);
        VKCircleImageView vKCircleImageView = (VKCircleImageView) this.itemView.findViewById(R.id.item_recommendation_onboarding_image);
        float b = iah0.b(4.0f);
        Context context = vKCircleImageView.getContext();
        e3m.a aVar = e3m.a;
        vKCircleImageView.y0(b, context.getColor(R.color.vk_white));
        this.n = vKCircleImageView;
        this.o = e3m.a(R.dimen.music_recommendation_on_boarding_finish_image_size, this.itemView.getContext());
    }

    @Override // xsna.se50
    public final void b6(Artist artist) {
        String str;
        ImageSize Cb;
        VKCircleImageView vKCircleImageView = this.n;
        vKCircleImageView.setEmptyImagePlaceholder(R.drawable.bg_artist_resommendation_placeholder);
        Image image = artist.f;
        if (image == null || (Cb = image.Cb(this.o, false, false)) == null || (str = Cb.d.d) == null) {
            str = "";
        }
        vKCircleImageView.s0(str);
    }
}
