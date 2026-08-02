package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.music.Artist;
import com.vk.lists.b;
import com.vk.music.onboarding.impl.model.RecommendationOnBoardingModel;

/* compiled from: MusicRecommendationOnboardingArtistsAdapter.kt */
/* loaded from: classes3.dex */
public final class u250 extends g940<Artist, se50<Artist>> {
    public final com.vk.music.onboarding.impl.b e;
    public final RecommendationOnBoardingModel f;

    /* compiled from: MusicRecommendationOnboardingArtistsAdapter.kt */
    public static final class a extends b.a<Artist> {
        @Override // com.vk.lists.b.a
        public final boolean a(Artist artist, Artist artist2) {
            return artist.equals(artist2);
        }

        @Override // com.vk.lists.b.a
        public final boolean b(Artist artist, Artist artist2) {
            return epx.f(artist.b, artist2.b);
        }
    }

    public u250(com.vk.music.onboarding.impl.b bVar, RecommendationOnBoardingModel recommendationOnBoardingModel) {
        super(new com.vk.lists.b(new a()));
        this.e = bVar;
        this.f = recommendationOnBoardingModel;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return Long.parseLong(((Artist) this.c.c(i)).b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new t250(viewGroup, this.e, this.f);
    }
}
