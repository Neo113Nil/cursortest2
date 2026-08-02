package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.music.player.MusicCountDownTimer;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;
import java.util.concurrent.TimeUnit;
import xsna.k840;
import xsna.nh4;

/* compiled from: AudioBookBottomSheetRenderExtension.kt */
/* loaded from: classes3.dex */
public final class vd4 implements gm50, MusicCountDownTimer.a {
    public final nh4 b;
    public final nh4.c c;
    public final View d;
    public final com.vk.music.player.d e;
    public final ud4 f;
    public final TextView g;
    public final View h;
    public final ThumbsImageView i;
    public final TextView j;
    public final TextView k;
    public final ImageView l;
    public final RecyclerView m;
    public final wc4 n;

    public vd4(Context context, nh4 nh4Var, nh4.c cVar) {
        this.b = nh4Var;
        this.c = cVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.modal_bottom_sheet_audiobook_redesigned, (ViewGroup) null, false);
        this.d = inflate;
        com.vk.music.player.d dVar = k840.a.f;
        this.e = dVar != null ? dVar : null;
        this.f = new ud4(this);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.header);
        this.g = (TextView) linearLayout.findViewById(R.id.audio_bottom_sheet_header_remaining_time);
        this.h = linearLayout.findViewById(R.id.top_divider);
        ConstraintLayout constraintLayout = (ConstraintLayout) linearLayout.findViewById(R.id.include);
        this.i = (ThumbsImageView) constraintLayout.findViewById(R.id.audio_image);
        this.j = (TextView) constraintLayout.findViewById(R.id.audio_title);
        this.k = (TextView) constraintLayout.findViewById(R.id.audio_artist);
        this.l = (ImageView) constraintLayout.findViewById(R.id.iv_explicit);
        ((FrameLayout) constraintLayout.findViewById(R.id.audion_actions)).setVisibility(8);
        this.m = (RecyclerView) inflate.findViewById(R.id.rv_action_list);
        this.n = new wc4(new k00(this, 3));
        inflate.setBackground(gu9.c(R.attr.vk_ui_background_contrast_themed, context));
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.b;
    }

    @Override // com.vk.music.player.MusicCountDownTimer.a
    public final void n0() {
        this.g.setVisibility(4);
    }

    @Override // com.vk.music.player.MusicCountDownTimer.a
    public final void s0(long j) {
        TextView textView = this.g;
        Context context = textView.getContext();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        int hours = (int) timeUnit.toHours(j);
        int minutes = (int) timeUnit.toMinutes(j);
        textView.setText(context.getString(R.string.music_sleep_timer_remaining_time, hours > 0 ? enj.f(R.plurals.music_hours, hours, context) : minutes > 0 ? enj.f(R.plurals.music_minutes, minutes, context) : enj.f(R.plurals.music_seconds, (int) timeUnit.toSeconds(j), context)));
    }

    @Override // com.vk.music.player.MusicCountDownTimer.a
    public final void u0() {
    }
}
