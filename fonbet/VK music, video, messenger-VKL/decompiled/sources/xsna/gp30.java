package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachAudio;
import com.vk.dto.music.MusicTrack;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.external.AudioTrack;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.e3m;
import xsna.go30;
import xsna.r5b0;

/* compiled from: MsgPartCompactAudioHolder.kt */
/* loaded from: classes2.dex */
public final class gp30 extends hr30<AttachAudio, co30> {
    public final ip30 d = new ip30();
    public long e;
    public AudioTrack f;
    public com.vk.im.engine.models.messages.a g;
    public ConstraintLayout h;
    public kq4 i;
    public co30 j;
    public pk30 k;

    /* compiled from: MsgPartCompactAudioHolder.kt */
    public static final class a implements go30.a {
        public a() {
        }

        @Override // xsna.go30.a
        public final void a() {
            gp30 gp30Var = gp30.this;
            co30 co30Var = gp30Var.j;
            if (co30Var != null) {
                AudioTrack audioTrack = gp30Var.f;
                boolean z = audioTrack != null && ((long) audioTrack.b.b) == co30Var.i && audioTrack.d;
                AudioTrack audioTrack2 = new AudioTrack(co30Var.b, false, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 30, null);
                com.vk.im.engine.models.messages.a aVar = gp30Var.g;
                if (aVar == null) {
                    aVar = null;
                }
                ArrayList m9 = aVar.m9(AttachAudio.class, true, false);
                ArrayList arrayList = new ArrayList(c5g.u(m9, 10));
                Iterator it = m9.iterator();
                while (it.hasNext()) {
                    arrayList.add(new AudioTrack((AttachAudio) it.next()));
                }
                if (z) {
                    pk30 pk30Var = gp30Var.k;
                    if (pk30Var != null) {
                        pk30Var.p();
                        return;
                    }
                    return;
                }
                pk30 pk30Var2 = gp30Var.k;
                if (pk30Var2 != null) {
                    pk30Var2.i(arrayList, audioTrack2, Long.valueOf(gp30Var.e));
                }
            }
        }
    }

    @Override // xsna.hr30, xsna.kq4.a
    public final void a(AudioTrack audioTrack) {
        this.f = audioTrack;
        s();
    }

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        int i = bubbleColors.h;
        ip30 ip30Var = this.d;
        TimeAndStatusView timeAndStatusView = ip30Var.i;
        if (timeAndStatusView == null) {
            timeAndStatusView = null;
        }
        timeAndStatusView.setTimeTextColor(i);
        int i2 = bubbleColors.g;
        TextView textView = ip30Var.f;
        if (textView == null) {
            textView = null;
        }
        textView.setTextColor(i2);
        int i3 = bubbleColors.i;
        TextView textView2 = ip30Var.g;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setTextColor(i3);
        int i4 = bubbleColors.r;
        ip30Var.l = i4;
        ThumbsImageView thumbsImageView = ip30Var.d;
        ThumbsImageView thumbsImageView2 = thumbsImageView != null ? thumbsImageView : null;
        thumbsImageView2.setBackground(ColorStateList.valueOf(i4).withAlpha(25).getDefaultColor());
        thumbsImageView2.setColorTint(i4);
    }

    @Override // xsna.hr30
    public final void p(co30 co30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        co30 co30Var2 = co30Var;
        this.k = pk30Var;
        this.j = co30Var2;
        kq4 kq4Var = co30Var2.e;
        if (kq4Var != null) {
            kq4Var.c(this);
            this.i = kq4Var;
        }
        this.f = kq4Var != null ? kq4Var.d() : null;
        this.e = co30Var2.d.b;
        this.g = co30Var2.f;
        MusicTrack musicTrack = co30Var2.b;
        ip30 ip30Var = this.d;
        ThumbsImageView thumbsImageView = ip30Var.d;
        if (thumbsImageView == null) {
            thumbsImageView = null;
        }
        thumbsImageView.setThumb(musicTrack.Jb());
        TextView textView = ip30Var.f;
        if (textView == null) {
            textView = null;
        }
        textView.setText(ob50.f(musicTrack));
        TextView textView2 = ip30Var.g;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setText(ob50.a(musicTrack));
        ImageView imageView = ip30Var.h;
        if (imageView == null) {
            imageView = null;
        }
        awt0.v(imageView, musicTrack.Lb());
        boolean B = musicTrack.B();
        ConstraintLayout constraintLayout = ip30Var.b;
        if (constraintLayout == null) {
            constraintLayout = null;
        }
        for (int i = 0; i < constraintLayout.getChildCount(); i++) {
            constraintLayout.getChildAt(i).setAlpha(B ? 0.5f : 1.0f);
        }
        jr30 jr30Var = co30Var2.c;
        TimeAndStatusView timeAndStatusView = ip30Var.i;
        hr30.l(timeAndStatusView != null ? timeAndStatusView : null, jr30Var, false);
        s();
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ip30 ip30Var = this.d;
        ip30Var.getClass();
        ConstraintLayout constraintLayout = (ConstraintLayout) bwt0.I(R.layout.vkim_msg_part_compact_audio, viewGroup, false);
        ip30Var.b = constraintLayout;
        ip30Var.d = (ThumbsImageView) constraintLayout.findViewById(R.id.audio_image);
        ConstraintLayout constraintLayout2 = ip30Var.b;
        if (constraintLayout2 == null) {
            constraintLayout2 = null;
        }
        ip30Var.f = (TextView) constraintLayout2.findViewById(R.id.track_name);
        ConstraintLayout constraintLayout3 = ip30Var.b;
        if (constraintLayout3 == null) {
            constraintLayout3 = null;
        }
        ip30Var.g = (TextView) constraintLayout3.findViewById(R.id.track_artist);
        ConstraintLayout constraintLayout4 = ip30Var.b;
        if (constraintLayout4 == null) {
            constraintLayout4 = null;
        }
        ip30Var.i = (TimeAndStatusView) constraintLayout4.findViewById(R.id.time_and_status);
        ConstraintLayout constraintLayout5 = ip30Var.b;
        if (constraintLayout5 == null) {
            constraintLayout5 = null;
        }
        ImageView imageView = (ImageView) constraintLayout5.findViewById(R.id.explicit_content);
        ip30Var.h = imageView;
        Context a2 = ip30Var.a();
        e3m.a aVar = e3m.a;
        imageView.setImageDrawable(m33.a(R.drawable.vk_icon_error_circle_fill_gray_12, a2));
        ConstraintLayout constraintLayout6 = ip30Var.b;
        if (constraintLayout6 == null) {
            constraintLayout6 = null;
        }
        ImageView imageView2 = (ImageView) constraintLayout6.findViewById(R.id.audio_playing_indicator);
        r5b0.b bVar = new r5b0.b(imageView2.getContext());
        bVar.a(R.integer.msg_part_compact_audio_playing_indicator_rect_count);
        bVar.d(R.dimen.msg_part_compact_audio_playing_indicator_rect_corners);
        bVar.g(R.dimen.msg_part_compact_audio_playing_indicator_rect_width);
        bVar.e(R.dimen.msg_part_compact_audio_playing_indicator_rect_height);
        bVar.f(R.dimen.msg_part_compact_audio_playing_indicator_rect_min_height);
        bVar.c(R.color.vk_white);
        bVar.b(R.dimen.msg_part_compact_audio_playing_indicator_gap);
        bVar.j = new float[]{cn70.c(10), cn70.c(16), cn70.c(18), cn70.c(10)};
        imageView2.setImageDrawable(new r5b0(bVar));
        ip30Var.e = imageView2;
        ConstraintLayout constraintLayout7 = ip30Var.b;
        if (constraintLayout7 == null) {
            constraintLayout7 = null;
        }
        constraintLayout7.setOnClickListener(new asq(ip30Var, 2));
        ConstraintLayout constraintLayout8 = ip30Var.b;
        if (constraintLayout8 == null) {
            constraintLayout8 = null;
        }
        this.h = constraintLayout8;
        co30 co30Var = this.j;
        final Msg msg = co30Var != null ? co30Var.v : null;
        final Attach attach = co30Var != null ? co30Var.x : null;
        if (msg != null && attach != null) {
            if (constraintLayout8 == null) {
                constraintLayout8 = null;
            }
            constraintLayout8.setOnClickListener(new ep30(this, msg, attach, 0));
            constraintLayout8.setOnLongClickListener(new View.OnLongClickListener() { // from class: xsna.fp30
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    gp30 gp30Var = gp30.this;
                    pk30 pk30Var = gp30Var.k;
                    if (pk30Var != null) {
                        co30 co30Var2 = gp30Var.j;
                        pk30Var.X(attach, msg, co30Var2 != null ? co30Var2.w : null);
                    }
                    return gp30Var.k != null;
                }
            });
        }
        ip30Var.c = new a();
        ConstraintLayout constraintLayout9 = this.h;
        if (constraintLayout9 == null) {
            return null;
        }
        return constraintLayout9;
    }

    @Override // xsna.hr30
    public final void r() {
        this.d.getClass();
        this.k = null;
        kq4 kq4Var = this.i;
        if (kq4Var != null) {
            kq4Var.b(this);
        }
        this.i = null;
    }

    public final void s() {
        co30 co30Var;
        AudioTrack audioTrack = this.f;
        ip30 ip30Var = this.d;
        if (audioTrack == null || (co30Var = this.j) == null || audioTrack.b.b != co30Var.i) {
            ip30Var.b(false);
        } else {
            ip30Var.b(audioTrack.d);
        }
    }
}
