package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.Thumb;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AudioPlaylistAttachment;
import xsna.gd60;

/* compiled from: AudioPlaylistCommentsHolder.kt */
/* loaded from: classes4.dex */
public final class ht4 extends m56<AudioPlaylistAttachment> implements View.OnClickListener {
    public final ThumbsImageView D;
    public final TextView E;
    public final TextView F;

    public ht4(ViewGroup viewGroup) {
        super(R.layout.attach_audio_music_comment_attachment, viewGroup);
        ThumbsImageView thumbsImageView = (ThumbsImageView) this.itemView.findViewById(R.id.audio_attachment_image);
        thumbsImageView.g(cn70.a() * 6.0f, cn70.a() * 6.0f, cn70.a() * 6.0f, cn70.a() * 6.0f);
        this.D = thumbsImageView;
        this.E = (TextView) this.itemView.findViewById(R.id.audio_attachment_title);
        this.F = (TextView) this.itemView.findViewById(R.id.audio_attachment_description);
        this.itemView.setOnClickListener(this);
        this.itemView.findViewById(R.id.audio_attachment_artist_listen_btn).setOnClickListener(this);
        thumbsImageView.h(R.drawable.vk_icon_playlist_36);
    }

    @Override // xsna.m56
    public final void T6(AudioPlaylistAttachment audioPlaylistAttachment) {
        Playlist playlist = audioPlaylistAttachment.f;
        Thumb thumb = playlist.m;
        CharSequence charSequence = playlist.h;
        ThumbsImageView thumbsImageView = this.D;
        if (thumb != null) {
            thumbsImageView.setThumb(thumb);
        } else {
            thumbsImageView.setThumbs(playlist.p);
        }
        int i = playlist.d;
        TextView textView = this.F;
        if (i == 0) {
            textView.setText(textView.getContext().getString(R.string.music_title_playlist));
        } else if (i != 1) {
            textView.setText(textView.getContext().getString(R.string.music_title_playlist_chat));
        } else {
            textView.setText(c9b0.g(textView.getContext(), playlist));
        }
        boolean u = xx1.u(playlist);
        TextView textView2 = this.E;
        if (!u) {
            charSequence = s490.d(textView2.getContext(), charSequence, playlist.i, R.attr.vk_ui_text_secondary);
        }
        textView2.setText(charSequence);
    }

    @Override // xsna.m56, android.view.View.OnClickListener
    public final void onClick(View view) {
        AudioPlaylistAttachment audioPlaylistAttachment;
        if (view == null || jjc.b() || (audioPlaylistAttachment = (AudioPlaylistAttachment) this.C) == null) {
            return;
        }
        gd60 a = hd60.a();
        Context context = this.itemView.getContext();
        Playlist playlist = audioPlaylistAttachment.f;
        MusicPlaybackLaunchContext Fb = MusicPlaybackLaunchContext.Fb(this.u);
        gd60.a aVar = gd60.a;
        a.d1(context, playlist, null, Fb);
    }
}
