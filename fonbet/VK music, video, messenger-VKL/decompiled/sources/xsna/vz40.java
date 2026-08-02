package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* compiled from: MusicPlaylistFooterViewHolder.kt */
/* loaded from: classes3.dex */
public final class vz40 extends se50<Pair<? extends Playlist, ? extends List<? extends MusicTrack>>> {
    public final TextView n;

    public vz40(ViewGroup viewGroup) {
        super(R.layout.music_playlist_footer, viewGroup);
        this.n = (TextView) this.itemView;
    }

    @Override // xsna.se50
    public final void b6(Pair<? extends Playlist, ? extends List<? extends MusicTrack>> pair) {
        String f;
        String quantityString;
        Pair<? extends Playlist, ? extends List<? extends MusicTrack>> pair2 = pair;
        Playlist i = pair2.i();
        int i2 = 0;
        if (i != null) {
            Context context = this.itemView.getContext();
            List<? extends MusicTrack> j = pair2.j();
            f = enj.f(R.plurals.music_songs, j.size(), context);
            Iterator<? extends MusicTrack> it = j.iterator();
            while (it.hasNext()) {
                i2 += it.next().f;
            }
            String n = f870.n(i2, context);
            int i3 = i.u;
            if (i3 == 0) {
                quantityString = "";
            } else {
                quantityString = context.getResources().getQuantityString(R.plurals.music_snippet_listenings, i3 < 1000 ? i3 : 1000, uqm0.f(i3));
            }
            if (!drm0.N(n) && !drm0.N(quantityString) && i.Eb()) {
                f = context.getString(R.string.music_dot_delimiter, f, context.getString(R.string.music_dot_delimiter, n, quantityString));
            } else if (!drm0.N(n)) {
                f = context.getString(R.string.music_dot_delimiter, f, n);
            }
        } else {
            Context context2 = this.itemView.getContext();
            List<? extends MusicTrack> j2 = pair2.j();
            int size = j2.size();
            Iterator<? extends MusicTrack> it2 = j2.iterator();
            while (it2.hasNext()) {
                i2 += it2.next().f;
            }
            String n2 = f870.n(i2, context2);
            f = TextUtils.isEmpty(n2) ? enj.f(R.plurals.music_songs, size, context2) : context2.getString(R.string.music_dot_delimiter, enj.f(R.plurals.music_songs, size, context2), n2);
        }
        this.n.setText(f);
    }
}
