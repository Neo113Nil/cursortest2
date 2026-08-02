package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.music.view.ThumbsImageView;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AudioCuratorAttachment;

/* compiled from: AudioCuratorHolder.kt */
/* loaded from: classes4.dex */
public final class om4 extends m56<AudioCuratorAttachment> implements View.OnClickListener, blc0 {
    public final xf40 D;
    public final ThumbsImageView E;
    public final TextView F;
    public final View G;
    public final View H;

    public om4(ViewGroup viewGroup, xf40 xf40Var) {
        super(R.layout.attach_audio_artist, viewGroup);
        this.D = xf40Var;
        ThumbsImageView thumbsImageView = (ThumbsImageView) this.itemView.findViewById(R.id.audio_attachment_image);
        thumbsImageView.g(cn70.a() * 6.0f, cn70.a() * 6.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.E = thumbsImageView;
        TextView textView = (TextView) this.itemView.findViewById(R.id.audio_attachment_title);
        this.F = textView;
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.chevron);
        View findViewById = this.itemView.findViewById(R.id.audio_attachment_artist_listen_btn);
        this.G = findViewById;
        this.H = this.itemView.findViewById(R.id.audio_attachment_artist_remove_button);
        findViewById.setOnClickListener(this);
        this.itemView.findViewById(R.id.audio_attachment_artist_overlay).setOnClickListener(this);
        omw.d(imageView, R.drawable.vk_icon_chevron_16, R.attr.vk_ui_icon_secondary);
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
        View view = this.H;
        if (view != null) {
            bwt0.p0(view, z);
        }
    }

    @Override // xsna.m56
    public final void T6(AudioCuratorAttachment audioCuratorAttachment) {
        AudioCuratorAttachment audioCuratorAttachment2 = audioCuratorAttachment;
        this.F.setText(audioCuratorAttachment2.f.c);
        this.E.setThumb(audioCuratorAttachment2.g);
    }

    @Override // xsna.blc0
    public final void j1(View.OnClickListener onClickListener) {
        View view = this.H;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
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
        AudioCuratorAttachment audioCuratorAttachment = (AudioCuratorAttachment) this.C;
        if (audioCuratorAttachment == null) {
            return;
        }
        String str = audioCuratorAttachment.f.b;
        String str2 = audioCuratorAttachment.h;
        this.D.getClass();
        xf40.b(str, str2);
    }

    @Override // xsna.blc0
    public final void p5() {
    }

    @Override // xsna.blc0
    public final void Z1(x64 x64Var) {
    }
}
