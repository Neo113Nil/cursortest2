package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.music.Artist;
import com.vk.music.view.ThumbsImageView;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AudioArtistAttachment;

/* compiled from: AudioArtistHolder.kt */
/* loaded from: classes4.dex */
public final class bc4 extends m56<AudioArtistAttachment> implements View.OnClickListener, blc0 {
    public final fa40 D;
    public final ThumbsImageView E;
    public final TextView F;
    public final View G;
    public final View H;
    public final View I;
    public final hh7 J;
    public View.OnClickListener K;
    public e6o L;
    public e6o M;

    public bc4(ViewGroup viewGroup, fa40 fa40Var) {
        super(R.layout.attach_audio_artist, viewGroup);
        this.D = fa40Var;
        ThumbsImageView thumbsImageView = (ThumbsImageView) this.itemView.findViewById(R.id.audio_attachment_image);
        thumbsImageView.g(cn70.a() * 6.0f, cn70.a() * 6.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.E = thumbsImageView;
        TextView textView = (TextView) this.itemView.findViewById(R.id.audio_attachment_title);
        this.F = textView;
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.chevron);
        this.G = this.itemView.findViewById(R.id.audio_attachment_artist_remove_button);
        this.H = this.itemView.findViewById(R.id.audio_attachment_artist_listen_btn);
        this.I = this.itemView.findViewById(R.id.audio_attachment_artist_overlay);
        X6();
        omw.d(imageView, R.drawable.vk_icon_chevron_16, R.attr.vk_ui_icon_secondary);
        this.J = new hh7(50, thumbsImageView.getContext().getColor(R.color.music_artist_bg_color));
        com.vk.typography.b.k(textView, FontFamily.DISPLAY_DEMIBOLD, Float.valueOf(21.0f), 4);
        bwt0.t0(textView, cn70.b(0), 0, cn70.b(0), 0, 10);
        f4m.s(cn70.b(16), textView);
        f4m.r(cn70.b(16), imageView);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        ConstraintLayout.b bVar = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
        if (bVar != null) {
            bVar.t = 0;
            bVar.u = imageView.getId();
            bVar.J = 2;
        }
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        ConstraintLayout.b bVar2 = layoutParams2 instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams2 : null;
        if (bVar2 != null) {
            bVar2.s = textView.getId();
            bVar2.v = 0;
            bVar2.J = 2;
        }
    }

    @Override // xsna.blc0
    public final void D1(boolean z) {
        View view = this.G;
        if (view != null) {
            bwt0.p0(view, z);
        }
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        ba baVar = s6oVar.e;
        this.L = s6oVar.a(this, baVar);
        View.OnClickListener onClickListener = this.K;
        if (onClickListener != null) {
            this.M = s6oVar.a(onClickListener, baVar);
        }
        X6();
    }

    @Override // xsna.m56
    public final void T6(AudioArtistAttachment audioArtistAttachment) {
        AudioArtistAttachment audioArtistAttachment2 = audioArtistAttachment;
        Artist artist = audioArtistAttachment2.f;
        this.F.setText(artist.c);
        hh7 hh7Var = artist.g ? this.J : null;
        ThumbsImageView thumbsImageView = this.E;
        thumbsImageView.setPostProcessorForSingle(hh7Var);
        thumbsImageView.setThumb(audioArtistAttachment2.g);
    }

    public final void X6() {
        View view;
        View.OnClickListener onClickListener = this.L;
        if (onClickListener == null) {
            onClickListener = this;
        }
        this.H.setOnClickListener(onClickListener);
        this.I.setOnClickListener(onClickListener);
        View.OnClickListener onClickListener2 = this.K;
        if (onClickListener2 == null || (view = this.G) == null) {
            return;
        }
        e6o e6oVar = this.M;
        if (e6oVar != null) {
            onClickListener2 = e6oVar;
        }
        view.setOnClickListener(onClickListener2);
    }

    @Override // xsna.blc0
    public final void j1(View.OnClickListener onClickListener) {
        this.K = onClickListener;
        s6o s6oVar = this.q;
        this.M = s6oVar != null ? s6oVar.a(onClickListener, s6oVar.e) : null;
        X6();
    }

    @Override // xsna.m56, android.view.View.OnClickListener
    public final void onClick(View view) {
        if (jjc.b()) {
            return;
        }
        if (view.getId() != R.id.audio_attachment_artist_listen_btn) {
            W6(view);
            return;
        }
        AudioArtistAttachment audioArtistAttachment = (AudioArtistAttachment) this.C;
        if (audioArtistAttachment == null) {
            return;
        }
        this.D.a(audioArtistAttachment.f.b, audioArtistAttachment.h);
    }

    @Override // xsna.blc0
    public final void p5() {
    }

    @Override // xsna.blc0
    public final void Z1(x64 x64Var) {
    }
}
