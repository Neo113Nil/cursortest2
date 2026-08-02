package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.music.Episode;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PodcastAttachment;

/* compiled from: PodcastRestrictedHolder.kt */
/* loaded from: classes4.dex */
public final class fjb0 extends m56<PodcastAttachment> implements blc0 {
    public final TextView D;
    public final View E;

    public fjb0(ViewGroup viewGroup) {
        super(R.layout.attach_podcast_restricted, viewGroup);
        this.D = (TextView) this.itemView.findViewById(R.id.description);
        this.E = this.itemView.findViewById(R.id.attach_podcast_remove_button);
    }

    @Override // xsna.blc0
    public final void D1(boolean z) {
        bwt0.p0(this.E, z);
    }

    @Override // xsna.m56
    public final void T6(PodcastAttachment podcastAttachment) {
        Episode episode = podcastAttachment.f.w;
        this.D.setText(episode != null ? episode.h : null);
    }

    @Override // xsna.blc0
    public final void j1(View.OnClickListener onClickListener) {
        this.E.setOnClickListener(onClickListener);
    }

    @Override // xsna.blc0
    public final void p5() {
    }

    @Override // xsna.blc0
    public final void Z1(x64 x64Var) {
    }
}
