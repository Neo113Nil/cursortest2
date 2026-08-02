package xsna;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.dto.music.MusicTrack;
import com.vkontakte.android.R;

/* compiled from: AudioPlaylistHolder.kt */
/* loaded from: classes4.dex */
public final class gk1 extends se50<MusicTrack> implements View.OnClickListener {
    public final izs<MusicTrack, s3q0> n;
    public final s8 o;
    public final ow4 p;
    public final AppCompatTextView q;
    public final AppCompatImageView r;
    public final AppCompatTextView s;
    public final AppCompatImageView t;
    public MusicTrack u;
    public e6o v;

    public gk1(na40 na40Var, qi3 qi3Var, s8 s8Var, ow4 ow4Var) {
        super(na40Var);
        this.n = qi3Var;
        this.o = s8Var;
        this.p = ow4Var;
        this.q = na40Var.getTitleView();
        this.r = na40Var.getActionView();
        this.s = na40Var.getPositionView();
        this.t = na40Var.getExplicitView();
        View view = this.itemView;
        View.OnClickListener onClickListener = this.v;
        view.setOnClickListener(onClickListener == null ? this : onClickListener);
    }

    @Override // xsna.se50
    public final void b6(MusicTrack musicTrack) {
        MusicTrack musicTrack2 = musicTrack;
        this.u = musicTrack2;
        AppCompatTextView appCompatTextView = this.q;
        Context context = appCompatTextView.getContext();
        ucp ucpVar = ucp.a;
        CharSequence p0 = drm0.p0(ucp.i(musicTrack2.d));
        StringBuilder sb = new StringBuilder();
        String str = musicTrack2.e;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append(' ');
        sb.append(s490.c(musicTrack2.u));
        appCompatTextView.setText(s490.d(context, p0, drm0.p0(sb.toString()).toString(), R.attr.vk_ui_text_secondary));
        String valueOf = String.valueOf(getAdapterPosition() + 1);
        AppCompatTextView appCompatTextView2 = this.s;
        appCompatTextView2.setText(valueOf);
        bwt0.p0(this.t, musicTrack2.s);
        boolean booleanValue = ((Boolean) this.o.invoke(musicTrack2)).booleanValue();
        AppCompatImageView appCompatImageView = this.r;
        if (booleanValue) {
            bwt0.p0(appCompatTextView2, false);
            bwt0.p0(appCompatImageView, true);
            omw.d(appCompatImageView, R.drawable.vk_icon_pause_24, R.attr.vk_ui_icon_accent);
        } else if (((Boolean) this.p.invoke(musicTrack2)).booleanValue()) {
            bwt0.p0(appCompatTextView2, false);
            bwt0.p0(appCompatImageView, true);
            omw.d(appCompatImageView, R.drawable.vk_icon_play_24, R.attr.vk_ui_icon_accent);
        } else {
            bwt0.p0(appCompatTextView2, true);
            bwt0.p0(appCompatImageView, false);
        }
        appCompatTextView.setEnabled(!musicTrack2.B());
        appCompatTextView2.setEnabled(!musicTrack2.B());
        appCompatImageView.setAlpha(musicTrack2.B() ? 0.5f : 1.0f);
    }

    @Override // xsna.se50
    public final void j6(s6o s6oVar) {
        e6o a = s6oVar.a(this, s6oVar.e);
        this.v = a;
        this.itemView.setOnClickListener(a);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MusicTrack musicTrack;
        if (jjc.b() || (musicTrack = this.u) == null) {
            return;
        }
        this.n.invoke(musicTrack);
    }
}
