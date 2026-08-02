package xsna;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.dto.music.Artist;
import com.vk.dto.music.MusicTrack;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: AudioPlaylistHolder.kt */
/* loaded from: classes4.dex */
public final class fcb0 extends se50<MusicTrack> implements View.OnClickListener {
    public final izs<MusicTrack, s3q0> n;
    public final pw4 o;
    public final AppCompatTextView p;
    public final AppCompatTextView q;
    public final AppCompatImageView r;
    public final AppCompatImageView s;
    public MusicTrack t;
    public e6o u;

    public fcb0(ua40 ua40Var, qi3 qi3Var, pw4 pw4Var) {
        super(ua40Var);
        this.n = qi3Var;
        this.o = pw4Var;
        this.p = ua40Var.getTitleView();
        this.q = ua40Var.getSubtitleView();
        AppCompatImageView actionView = ua40Var.getActionView();
        this.r = actionView;
        this.s = ua40Var.getExplicitView();
        View view = this.itemView;
        View.OnClickListener onClickListener = this.u;
        view.setOnClickListener(onClickListener == null ? this : onClickListener);
        qog0 qog0Var = new qog0(dhr0.t.c(R.attr.vk_ui_background_secondary));
        qog0Var.f(true);
        actionView.setBackground(qog0Var);
        actionView.setPadding(12, 12, 12, 12);
    }

    @Override // xsna.se50
    public final void b6(MusicTrack musicTrack) {
        String str;
        MusicTrack musicTrack2 = musicTrack;
        this.t = musicTrack2;
        AppCompatTextView appCompatTextView = this.p;
        appCompatTextView.setText(s490.d(appCompatTextView.getContext(), musicTrack2.d, musicTrack2.e, R.attr.vk_ui_text_secondary));
        AppCompatTextView appCompatTextView2 = this.q;
        float textSize = appCompatTextView2.getTextSize();
        ucp ucpVar = ucp.a;
        StringBuilder sb = new StringBuilder();
        List<Artist> list = musicTrack2.t;
        if (list != null) {
            str = s490.i(list);
        } else {
            str = musicTrack2.h;
            if (str == null) {
                str = "";
            }
        }
        sb.append(str);
        sb.append(' ');
        sb.append(s490.c(musicTrack2.u));
        appCompatTextView2.setText(ucp.j(drm0.p0(sb.toString()).toString(), Float.valueOf(textSize)));
        bwt0.p0(this.s, musicTrack2.s);
        boolean booleanValue = ((Boolean) this.o.invoke(musicTrack2)).booleanValue();
        AppCompatImageView appCompatImageView = this.r;
        if (booleanValue) {
            omw.d(appCompatImageView, R.drawable.vk_icon_pause_24, R.attr.vk_ui_icon_primary);
        } else {
            omw.d(appCompatImageView, R.drawable.vk_icon_play_24, R.attr.vk_ui_icon_primary);
        }
        appCompatTextView.setEnabled(!musicTrack2.B());
        appCompatTextView2.setEnabled(!musicTrack2.B());
        appCompatImageView.setAlpha(musicTrack2.B() ? 0.5f : 1.0f);
    }

    @Override // xsna.se50
    public final void j6(s6o s6oVar) {
        e6o a = s6oVar.a(this, s6oVar.e);
        this.u = a;
        this.itemView.setOnClickListener(a);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MusicTrack musicTrack;
        if (jjc.b() || (musicTrack = this.t) == null) {
            return;
        }
        this.n.invoke(musicTrack);
    }
}
