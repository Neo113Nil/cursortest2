package xsna;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.discover.carousel.tracks.MusicTracksCarouselItem;
import com.vk.dto.music.MusicTrack;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;
import java.util.Arrays;
import java.util.List;
import org.chromium.base.TimeUtils;
import xsna.k840;

/* compiled from: MusicTrackCarouselItemHolder.kt */
/* loaded from: classes4.dex */
public final class la50 extends vif0<MusicTracksCarouselItem> {
    public MusicPlaybackLaunchContext n;
    public final u750 o;

    public la50(ViewGroup viewGroup, boolean z) {
        super(new ce50(viewGroup.getContext()), viewGroup);
        this.n = MusicPlaybackLaunchContext.d;
        s750 s750Var = k840.a.e;
        this.o = s750Var == null ? null : s750Var;
        ((ce50) this.itemView).setLayoutParams(new ViewGroup.LayoutParams(z ? -1 : iah0.a(320), iah0.a(60)));
    }

    @Override // xsna.vif0
    public final void i6(MusicTracksCarouselItem musicTracksCarouselItem) {
        MusicTracksCarouselItem musicTracksCarouselItem2 = musicTracksCarouselItem;
        MusicTrack musicTrack = musicTracksCarouselItem2.b;
        if (musicTrack == null) {
            return;
        }
        ce50 ce50Var = (ce50) this.itemView;
        List<MusicTrack> list = musicTracksCarouselItem2.c;
        String str = musicTracksCarouselItem2.d;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext = this.n;
        ce50Var.c = musicTrack;
        ce50Var.d = list;
        ce50Var.e = str;
        ce50Var.b = musicPlaybackLaunchContext;
        TextView textView = ce50Var.j;
        Context context = ce50Var.getContext();
        String str2 = musicTrack.d;
        String str3 = musicTrack.e;
        Float valueOf = Float.valueOf(textView.getTextSize());
        ucp ucpVar = ucp.a;
        textView.setText(ucp.j(s490.d(context, str2, str3, R.attr.vk_ui_text_secondary), valueOf));
        TextView textView2 = ce50Var.k;
        textView2.setText(ucp.j(fai.k(musicTrack), Float.valueOf(textView2.getTextSize())));
        textView2.setVisibility(0);
        bwt0.p0(ce50Var.m, musicTrack.s);
        TextView textView3 = ce50Var.l;
        textView3.setText(String.format("%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(musicTrack.f / 60), Integer.valueOf(musicTrack.f % 60)}, 2)));
        SpannableStringBuilder spannableStringBuilder = ce50Var.g;
        spannableStringBuilder.clear();
        spannableStringBuilder.append(fai.d(musicTrack)).append((CharSequence) "-").append((CharSequence) musicTrack.d).append((CharSequence) ", ");
        spannableStringBuilder.append((CharSequence) f870.p(ce50Var.getContext(), musicTrack.f, musicTrack.s));
        ce50Var.setContentDescription(spannableStringBuilder);
        bwt0.h0(ce50Var, ce50Var);
        ce50Var.setOnLongClickListener(ce50Var);
        ThumbsImageView thumbsImageView = ce50Var.n;
        thumbsImageView.setThumb(musicTrack.Jb());
        ce50Var.a(musicTrack);
        float f = musicTrack.B() ? 0.5f : 1.0f;
        textView.setAlpha(f);
        textView2.setAlpha(f);
        textView3.setEnabled(!musicTrack.B());
        thumbsImageView.setAlpha(f);
        String str4 = "view_recommended_audio_pid:" + musicTrack.Fb() + ':' + this.n.t();
        if (com.vkontakte.android.data.b.i(str4)) {
            return;
        }
        String t = this.n.t();
        String valueOf2 = String.valueOf(musicTrack.b);
        String valueOf3 = String.valueOf(musicTrack.c.b);
        String str5 = musicTrack.y;
        if (str5 == null) {
            str5 = "";
        }
        this.o.V(valueOf2, valueOf3, str5, t);
        com.vkontakte.android.data.b.e(TimeUtils.MILLISECONDS_PER_DAY, str4);
    }
}
