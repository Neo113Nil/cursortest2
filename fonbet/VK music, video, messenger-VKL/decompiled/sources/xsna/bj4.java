package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.dto.music.Episode;
import com.vk.dto.music.MusicTrack;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlaySource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;
import java.util.List;
import java.util.Locale;

/* compiled from: AudioBookPlaylistViewHolder.kt */
/* loaded from: classes3.dex */
public final class bj4 extends se50<MusicTrack> implements View.OnClickListener {
    public final u2b0 n;
    public final AppCompatTextView o;
    public final ThumbsImageView p;
    public final AppCompatTextView q;

    public bj4(ViewGroup viewGroup, u2b0 u2b0Var) {
        super(tf3.b(viewGroup, R.layout.audio_book_item_playlist, viewGroup, false));
        this.n = u2b0Var;
        this.o = (AppCompatTextView) this.itemView.findViewById(R.id.tv_title);
        this.p = (ThumbsImageView) this.itemView.findViewById(R.id.audio_image);
        this.q = (AppCompatTextView) this.itemView.findViewById(R.id.tv_duration);
        this.itemView.setOnClickListener(this);
    }

    @Override // xsna.se50
    public final void b6(MusicTrack musicTrack) {
        MusicTrack musicTrack2 = musicTrack;
        this.o.setText(musicTrack2.d);
        this.p.setThumb(musicTrack2.Jb());
        long j = musicTrack2.f;
        Episode episode = musicTrack2.w;
        long j2 = episode != null ? episode.d : 0L;
        AppCompatTextView appCompatTextView = this.q;
        appCompatTextView.setText(j2 > 0 ? pq3.c(appCompatTextView.getContext(), 1000 * j, j2).toString().toLowerCase(Locale.getDefault()) : f870.q(j));
        appCompatTextView.setContentDescription(f870.o(j, this.itemView.getContext()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MusicTrack musicTrack = (MusicTrack) this.l;
        if (musicTrack == null) {
            return;
        }
        this.n.N0(new lqk0((StartPlaySource) null, musicTrack, (List) null, (MusicPlaybackLaunchContext) null, 0, ShuffleMode.SHUFFLE_OFF, PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 829));
    }
}
