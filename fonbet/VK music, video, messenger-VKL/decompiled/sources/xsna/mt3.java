package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.discover.carousel.artist.ArtistsCarousel;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.common.PostActions;
import com.vkontakte.android.R;

/* compiled from: ArtistsCarouselHolder.kt */
/* loaded from: classes4.dex */
public final class mt3 extends vu9<ArtistsCarousel> implements View.OnClickListener {
    public final View J;

    public mt3(ViewGroup viewGroup) {
        super(viewGroup, R.layout.carousel_holder_without_header, new ot3());
        View findViewById = this.itemView.findViewById(R.id.hide);
        this.J = findViewById;
        findViewById.setOnClickListener(this);
        this.F.removeItemDecoration(this.H);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List<com.vk.dto.discover.carousel.artist.ArtistsCarouselItem>] */
    @Override // xsna.qi6
    public final void E6(NewsEntry newsEntry) {
        ArtistsCarousel artistsCarousel = (ArtistsCarousel) newsEntry;
        R6(artistsCarousel);
        RecyclerView.Adapter<?> adapter = this.C;
        ot3 ot3Var = adapter instanceof ot3 ? (ot3) adapter : null;
        if (ot3Var != null) {
            ot3Var.d = artistsCarousel.o;
            ot3Var.notifyDataSetChanged();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        s980 s980Var;
        if (epx.f(view, this.J)) {
            u1c0 J0 = J0();
            int i = J0 != null ? J0.k : 0;
            ArtistsCarousel artistsCarousel = (ArtistsCarousel) q6();
            if (artistsCarousel == null || (s980Var = this.y) == null) {
                return;
            }
            s980Var.d9(artistsCarousel, t6(), PostActions.ACTION_IGNORE.h(), i);
        }
    }
}
