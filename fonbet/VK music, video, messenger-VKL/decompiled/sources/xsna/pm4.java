package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AudioCuratorAttachment;
import xsna.gd60;

/* compiled from: AudioCuratorSmallHolder.kt */
/* loaded from: classes4.dex */
public class pm4 extends m56<AudioCuratorAttachment> implements View.OnClickListener {
    public final ThumbsImageView D;
    public final TextView E;

    public pm4(ViewGroup viewGroup, int i) {
        super(i, viewGroup);
        float a = iah0.a(6);
        ThumbsImageView thumbsImageView = (ThumbsImageView) this.itemView.findViewById(R.id.audio_attachment_image);
        thumbsImageView.g(a, a, a, a);
        this.D = thumbsImageView;
        this.E = (TextView) this.itemView.findViewById(R.id.audio_attachment_title);
        this.itemView.setOnClickListener(this);
        this.itemView.findViewById(R.id.audio_attachment_artist_listen_btn).setOnClickListener(this);
        thumbsImageView.h(R.drawable.vk_icon_users_outline_28);
        ((TextView) this.itemView.findViewById(R.id.audio_attachment_description)).setText(R.string.attach_curator);
    }

    @Override // xsna.m56
    public final void T6(AudioCuratorAttachment audioCuratorAttachment) {
        AudioCuratorAttachment audioCuratorAttachment2 = audioCuratorAttachment;
        this.D.setThumb(audioCuratorAttachment2.g);
        this.E.setText(audioCuratorAttachment2.f.c);
    }

    @Override // xsna.m56, android.view.View.OnClickListener
    public final void onClick(View view) {
        AudioCuratorAttachment audioCuratorAttachment;
        if (view == null || jjc.b() || (audioCuratorAttachment = (AudioCuratorAttachment) this.C) == null) {
            return;
        }
        gd60 a = hd60.a();
        Context context = view.getContext();
        String str = audioCuratorAttachment.f.b;
        gd60.a aVar = gd60.a;
        a.s1(context, str, null);
    }
}
