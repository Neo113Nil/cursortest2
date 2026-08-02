package xsna;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.dto.music.MusicTrack;
import com.vkontakte.android.R;
import xsna.r5b0;

/* compiled from: PlaylistTracksVC.kt */
/* loaded from: classes2.dex */
public final class ghp0 {
    public final uv20 a;
    public final View b;
    public final TextView c;
    public final TextView d;
    public final ImageView e;
    public final ImageView f;
    public MusicTrack g;

    public ghp0(ConstraintLayout constraintLayout, int i, uv20 uv20Var) {
        this.a = uv20Var;
        View findViewById = constraintLayout.findViewById(i);
        findViewById.setOnClickListener(new ep6(this, 9));
        this.b = findViewById;
        this.c = (TextView) findViewById.findViewById(R.id.track_name);
        this.d = (TextView) findViewById.findViewById(R.id.track_artist);
        this.e = (ImageView) findViewById.findViewById(R.id.explicit_content);
        ImageView imageView = (ImageView) findViewById.findViewById(R.id.audio_playing_indicator);
        r5b0.b bVar = new r5b0.b(findViewById.getContext());
        bVar.a(R.integer.msg_part_compact_audio_playing_indicator_rect_count);
        bVar.d(R.dimen.msg_part_compact_audio_playing_indicator_rect_corners);
        bVar.g(R.dimen.msg_part_compact_audio_playing_indicator_rect_width);
        bVar.e(R.dimen.msg_part_compact_audio_playing_indicator_rect_height);
        bVar.f(R.dimen.msg_part_compact_audio_playing_indicator_rect_min_height);
        bVar.c(R.color.vk_azure_300);
        bVar.b(R.dimen.msg_part_compact_audio_playing_indicator_gap);
        bVar.j = new float[]{cn70.c(10), cn70.c(16), cn70.c(18), cn70.c(10)};
        imageView.setImageDrawable(new r5b0(bVar));
        this.f = imageView;
    }

    public final void a() {
        TextView textView = this.c;
        if (textView == null) {
            textView = null;
        }
        textView.setTextColor(krv0.l(R.attr.vk_legacy_text_primary));
        ImageView imageView = this.f;
        if (imageView == null) {
            imageView = null;
        }
        f4m.j(imageView);
        ImageView imageView2 = this.f;
        (imageView2 != null ? imageView2 : null).setActivated(false);
    }
}
