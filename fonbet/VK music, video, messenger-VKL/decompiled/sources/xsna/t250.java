package xsna;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ContentType;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.music.Artist;
import com.vk.imageloader.view.VKCircleImageView;
import com.vk.music.onboarding.impl.model.RecommendationOnBoardingModel;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: MusicRecommendationOnboardingArtistVh.kt */
/* loaded from: classes3.dex */
public final class t250 extends se50<Artist> implements View.OnClickListener {
    public final fsv<Artist> n;
    public final RecommendationOnBoardingModel o;
    public final k7a p;
    public final VKCircleImageView q;
    public final ImageView r;
    public final TextView s;
    public final ImageView t;
    public final rcc u;
    public final rcc v;
    public final ProgressBar w;
    public final int x;

    /* compiled from: MusicRecommendationOnboardingArtistVh.kt */
    public static final class a implements View.OnTouchListener {
        public static void a(View view, float f, long j, OvershootInterpolator overshootInterpolator) {
            ViewPropertyAnimator duration = view.animate().scaleX(f).scaleY(f).setDuration(j);
            if (overshootInterpolator != null) {
                duration.setInterpolator(overshootInterpolator);
            }
            duration.start();
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                a(view, 0.8f, 60L, null);
                return true;
            }
            if (actionMasked != 1) {
                if (actionMasked != 3) {
                    return true;
                }
                a(view, 1.0f, 200L, null);
                return true;
            }
            a(view, 1.0f, 200L, new OvershootInterpolator(3.0f));
            vvr0.d();
            view.performClick();
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t250(ViewGroup viewGroup, com.vk.music.onboarding.impl.b bVar, RecommendationOnBoardingModel recommendationOnBoardingModel) {
        super(R.layout.holder_music_recommendation_on_boarding_artist, viewGroup);
        k7a k7aVar = new k7a();
        this.n = bVar;
        this.o = recommendationOnBoardingModel;
        this.p = k7aVar;
        FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.holder_music_recommendation_on_boarding_artist_image_container);
        frameLayout.setOnTouchListener(new a());
        frameLayout.setOnClickListener(this);
        VKCircleImageView vKCircleImageView = (VKCircleImageView) this.itemView.findViewById(R.id.holder_music_recommendation_on_boarding_artist_image);
        float b = iah0.b(0.5f);
        Context context = vKCircleImageView.getContext();
        e3m.a aVar = e3m.a;
        vKCircleImageView.y0(b, context.getColor(R.color.vk_black_alpha8));
        this.q = vKCircleImageView;
        this.r = (ImageView) this.itemView.findViewById(R.id.holder_music_recommendation_on_boarding_artist_image_overlay);
        this.s = (TextView) this.itemView.findViewById(R.id.holder_music_recommendation_on_boarding_artist_name);
        this.t = (ImageView) this.itemView.findViewById(R.id.holder_music_recommendation_on_boarding_artist_heart);
        this.u = new rcc(l8g.g(this.itemView.getContext().getColor(R.color.vk_red_nice), 60));
        this.v = new rcc(this.itemView.getContext().getColor(R.color.vk_black_alpha60));
        this.w = (ProgressBar) this.itemView.findViewById(R.id.holder_music_recommendation_on_boarding_artist_progress);
        this.x = e3m.a(R.dimen.music_recommendation_on_boarding_image_width, this.itemView.getContext());
    }

    @Override // xsna.se50
    public final void b6(Artist artist) {
        String str;
        ImageSize Cb;
        Artist artist2 = artist;
        boolean F = this.o.F(artist2);
        String str2 = artist2.c;
        this.s.setText(str2);
        View view = this.itemView;
        StringBuilder e = fw3.e(str2);
        if (F) {
            e.append(" ");
            e.append(this.itemView.getContext().getString(R.string.accessibility_like));
        }
        view.setContentDescription(e.toString());
        if (F) {
            cp2.c(this.t, 200L, 0L, null, null, 14);
        } else {
            cp2.d(this.t, 200L, null, null, 30);
        }
        ContentType contentType = ContentType.ARTIST_BIG;
        CatalogDataType catalogDataType = CatalogDataType.DATA_TYPE_ARTIST;
        CatalogViewType catalogViewType = CatalogViewType.LIST;
        k7a k7aVar = this.p;
        VKCircleImageView vKCircleImageView = this.q;
        k7aVar.b(vKCircleImageView, contentType, catalogDataType, catalogViewType, -1.0f);
        k7aVar.d(vKCircleImageView, catalogDataType, catalogViewType, -1.0f);
        Image image = artist2.f;
        if (image == null || (Cb = image.Cb(this.x, false, false)) == null || (str = Cb.d.d) == null) {
            str = "";
        }
        vKCircleImageView.s0(str);
        this.r.setImageDrawable(F ? this.u : null);
        bwt0.p0(this.w, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.vk.core.utils.newtork.b.a.getClass();
        if (!com.vk.core.utils.newtork.b.d()) {
            cvk.v(R.string.music_player_snack_bar_internet_connection_problems, 50);
            return;
        }
        Artist artist = (Artist) this.l;
        if (artist == null) {
            return;
        }
        RecommendationOnBoardingModel recommendationOnBoardingModel = this.o;
        boolean F = recommendationOnBoardingModel.F(artist);
        ProgressBar progressBar = this.w;
        if (bwt0.K(progressBar)) {
            return;
        }
        fsv<Artist> fsvVar = this.n;
        if (F) {
            fsvVar.Ig(view.getId(), this.l);
            return;
        }
        if (!recommendationOnBoardingModel.y(artist)) {
            cvk.v(R.string.music_recommendation_onboarding_toast_max_favorite_artist, 50);
            return;
        }
        this.r.setImageDrawable(this.v);
        bwt0.p0(progressBar, true);
        bwt0.p0(this.t, false);
        fsvVar.Ig(view.getId(), this.l);
    }
}
