package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.music.Thumb;
import com.vk.music.snippet.api.presentation.model.SnippetSectionType;
import com.vk.music.snippet.ui.presentation.base.view.SnippetBlurBackgroundView;
import com.vk.music.snippet.ui.presentation.base.view.SnippetLinesProgressView;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: SnippetSectionItemView.kt */
/* loaded from: classes3.dex */
public final class tck0 extends ConstraintLayout {
    public static final int E = iah0.a(82);
    public static final float F = iah0.b(8.0f);
    public final TextView A;
    public final View B;
    public final androidx.recyclerview.widget.g0 C;
    public mck0 D;
    public final RecyclerView t;
    public final SnippetBlurBackgroundView u;
    public final View v;
    public final SnippetLinesProgressView w;
    public final ThumbsImageView x;
    public final TextView y;
    public final ImageView z;

    public tck0(Context context) {
        super(context, null);
        LayoutInflater.from(context).inflate(R.layout.music_snippet_pack_item, (ViewGroup) this, true);
        this.u = (SnippetBlurBackgroundView) findViewById(R.id.snippet_background_blur_image);
        this.v = findViewById(R.id.snippet_blur_overlay);
        this.t = (RecyclerView) findViewById(R.id.snippets_horizontal_recycler);
        this.w = (SnippetLinesProgressView) findViewById(R.id.snippet_progress_view);
        this.x = (ThumbsImageView) findViewById(R.id.snippet_playlist_thumb);
        this.y = (TextView) findViewById(R.id.snippet_playlist_name);
        this.z = (ImageView) findViewById(R.id.snippet_playlist_star);
        this.A = (TextView) findViewById(R.id.snippet_playlist_description);
        this.B = findViewById(R.id.snippet_playlist_background);
        this.C = new androidx.recyclerview.widget.g0();
    }

    public final int getCurrentPosition() {
        RecyclerView.o layoutManager = this.t.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            return linearLayoutManager.s();
        }
        return -1;
    }

    public final RecyclerView getHorizontalRecycler() {
        return this.t;
    }

    public final void setCurrentTrackNum(int i) {
        this.w.setCurrentTrackNum(i);
    }

    public final void setOnPlaylistClickListener(gzs<s3q0> gzsVar) {
        bwt0.i0(this.B, new j2i(1, gzsVar));
    }

    public final void setPlaylistDescription(String str) {
        this.A.setText(str);
    }

    public final void setPlaylistName(String str) {
        this.y.setText(str);
    }

    public final void setThumb(Thumb thumb) {
        ThumbsImageView thumbsImageView = this.x;
        thumbsImageView.setThumb(thumb);
        Context context = thumbsImageView.getContext();
        e3m.a aVar = e3m.a;
        thumbsImageView.setOverlayImage(m33.a(R.drawable.player_ad_gradient, context));
    }

    public final void setTracksCount(int i) {
        this.w.setTracksCount(i);
    }

    public final void setTypeStyle(SnippetSectionType snippetSectionType) {
        SnippetSectionType snippetSectionType2 = SnippetSectionType.EXCLUSIVE_ALBUM;
        ImageView imageView = this.z;
        if (snippetSectionType == snippetSectionType2) {
            imageView.setVisibility(0);
        } else {
            f4m.j(imageView);
        }
        SnippetSectionType snippetSectionType3 = SnippetSectionType.ARTIST_MIX;
        ThumbsImageView thumbsImageView = this.x;
        if (snippetSectionType == snippetSectionType3) {
            thumbsImageView.setCornerRadius(e3m.a(R.dimen.music_snippet_playlist_thumb_size, getContext()));
        } else {
            thumbsImageView.setCornerRadius(F);
        }
    }
}
