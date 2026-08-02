package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AudioArtistAttachment;
import xsna.gd60;

/* compiled from: AudioArtistCommentsHolder.kt */
/* loaded from: classes4.dex */
public final class ac4 extends m56<AudioArtistAttachment> implements View.OnClickListener {
    public static final int F = iah0.a(8);
    public final ThumbsImageView D;
    public final TextView E;

    public ac4(ViewGroup viewGroup, boolean z) {
        super(R.layout.attach_audio_music_comment_attachment, viewGroup);
        float a = iah0.a(6);
        ThumbsImageView thumbsImageView = (ThumbsImageView) this.itemView.findViewById(R.id.audio_attachment_image);
        thumbsImageView.g(a, a, a, a);
        this.D = thumbsImageView;
        this.E = (TextView) this.itemView.findViewById(R.id.audio_attachment_title);
        this.itemView.setOnClickListener(this);
        this.itemView.findViewById(R.id.audio_attachment_artist_listen_btn).setOnClickListener(this);
        thumbsImageView.h(R.drawable.ic_artist_36);
        View view = this.itemView;
        int i = F;
        f4m.s(z ? 0 : i, view);
        f4m.r(z ? 0 : i, this.itemView);
    }

    @Override // xsna.m56
    public final void T6(AudioArtistAttachment audioArtistAttachment) {
        AudioArtistAttachment audioArtistAttachment2 = audioArtistAttachment;
        this.D.setThumb(audioArtistAttachment2.g);
        this.E.setText(audioArtistAttachment2.f.c);
    }

    @Override // xsna.m56, android.view.View.OnClickListener
    public final void onClick(View view) {
        AudioArtistAttachment audioArtistAttachment;
        if (jjc.b() || (audioArtistAttachment = (AudioArtistAttachment) this.C) == null || view == null) {
            return;
        }
        gd60 a = hd60.a();
        Context context = view.getContext();
        String str = audioArtistAttachment.f.b;
        gd60.a aVar = gd60.a;
        a.p(context, str, null);
    }
}
