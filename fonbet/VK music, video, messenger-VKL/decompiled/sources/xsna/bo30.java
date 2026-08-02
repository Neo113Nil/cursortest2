package xsna;

import android.content.Context;
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
import com.vk.dto.music.Thumb;
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
import xsna.vvn;

/* compiled from: MsgPartAudioHolder.kt */
/* loaded from: classes2.dex */
public final class bo30 extends hr30<AttachAudio, co30> {
    public ConstraintLayout d;
    public final fo30 e = new fo30();
    public gc4 f;
    public long g;
    public AudioTrack h;
    public kq4 i;
    public com.vk.im.engine.models.messages.a j;
    public co30 k;
    public pk30 l;

    /* compiled from: MsgPartAudioHolder.kt */
    public static final class a implements go30.a {
        public a() {
        }

        @Override // xsna.go30.a
        public final void a() {
            bo30 bo30Var = bo30.this;
            co30 co30Var = bo30Var.k;
            if (co30Var != null) {
                AudioTrack audioTrack = bo30Var.h;
                boolean z = audioTrack != null && ((long) audioTrack.b.b) == co30Var.i && audioTrack.d;
                AudioTrack audioTrack2 = new AudioTrack(co30Var.b, false, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 30, null);
                com.vk.im.engine.models.messages.a aVar = bo30Var.j;
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
                    pk30 pk30Var = bo30Var.l;
                    if (pk30Var != null) {
                        pk30Var.p();
                        return;
                    }
                    return;
                }
                pk30 pk30Var2 = bo30Var.l;
                if (pk30Var2 != null) {
                    pk30Var2.i(arrayList, audioTrack2, Long.valueOf(bo30Var.g));
                }
            }
        }
    }

    @Override // xsna.hr30, xsna.kq4.a
    public final void a(AudioTrack audioTrack) {
        this.h = audioTrack;
        s();
    }

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        int l = n8g.l(krv0.l(R.attr.vk_legacy_text_primary), 102);
        TimeAndStatusView timeAndStatusView = this.e.l;
        if (timeAndStatusView == null) {
            timeAndStatusView = null;
        }
        timeAndStatusView.setTimeTextColor(l);
    }

    @Override // xsna.hr30
    public final void p(co30 co30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        co30 co30Var2 = co30Var;
        this.l = pk30Var;
        this.k = co30Var2;
        kq4 kq4Var = co30Var2.e;
        if (kq4Var != null) {
            kq4Var.c(this);
            this.i = kq4Var;
        }
        this.h = kq4Var != null ? kq4Var.d() : null;
        this.g = co30Var2.d.b;
        this.j = co30Var2.f;
        MusicTrack musicTrack = co30Var2.b;
        fo30 fo30Var = this.e;
        fo30Var.getClass();
        Thumb Jb = musicTrack.Jb();
        fo30Var.r.dispose();
        if (Jb == null) {
            View view = fo30Var.e;
            if (view == null) {
                view = null;
            }
            view.setBackgroundColor(((Number) fo30Var.m.getValue()).intValue());
            ImageView imageView = fo30Var.h;
            if (imageView == null) {
                imageView = null;
            }
            imageView.setVisibility(0);
        } else {
            io.reactivex.rxjava3.internal.operators.observable.m1 a0 = fo30Var.s.c.a0(io.reactivex.rxjava3.android.schedulers.a.b());
            View view2 = fo30Var.e;
            if (view2 == null) {
                view2 = null;
            }
            fo30Var.r = a0.subscribe(new vvn.a(view2));
        }
        ThumbsImageView thumbsImageView = fo30Var.f;
        if (thumbsImageView == null) {
            thumbsImageView = null;
        }
        thumbsImageView.setThumb(Jb);
        boolean B = musicTrack.B();
        ConstraintLayout constraintLayout = fo30Var.b;
        if (constraintLayout == null) {
            constraintLayout = null;
        }
        for (int i = 0; i < constraintLayout.getChildCount(); i++) {
            constraintLayout.getChildAt(i).setAlpha(B ? 0.5f : 1.0f);
        }
        if (B) {
            View view3 = fo30Var.g;
            if (view3 == null) {
                view3 = null;
            }
            f4m.j(view3);
            ImageView imageView2 = fo30Var.d;
            if (imageView2 == null) {
                imageView2 = null;
            }
            f4m.j(imageView2);
        }
        String a2 = ob50.a(musicTrack);
        String f = ob50.f(musicTrack);
        boolean Lb = musicTrack.Lb();
        TextView textView = fo30Var.i;
        if (textView == null) {
            textView = null;
        }
        textView.setText(f);
        TextView textView2 = fo30Var.j;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setText(a2);
        ImageView imageView3 = fo30Var.k;
        if (imageView3 == null) {
            imageView3 = null;
        }
        bwt0.p0(imageView3, Lb);
        TextView textView3 = fo30Var.i;
        if (textView3 == null) {
            textView3 = null;
        }
        textView3.setMaxLines(Lb ? 1 : 2);
        if (musicTrack.B()) {
            ConstraintLayout constraintLayout2 = fo30Var.b;
            if (constraintLayout2 == null) {
                constraintLayout2 = null;
            }
            constraintLayout2.setOnClickListener(new bc(fo30Var, 7));
        } else {
            ThumbsImageView thumbsImageView2 = fo30Var.f;
            if (thumbsImageView2 == null) {
                thumbsImageView2 = null;
            }
            thumbsImageView2.setOnClickListener(new bj6(fo30Var, 4));
        }
        jr30 jr30Var = co30Var2.c;
        TimeAndStatusView timeAndStatusView = fo30Var.l;
        if (timeAndStatusView == null) {
            timeAndStatusView = null;
        }
        hr30.l(timeAndStatusView, jr30Var, false);
        gc4 gc4Var = this.f;
        if (gc4Var == null) {
            gc4Var = null;
        }
        ConstraintLayout constraintLayout3 = this.d;
        gc4Var.a(co30Var2, constraintLayout3 != null ? constraintLayout3 : null);
        s();
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        fo30 fo30Var = this.e;
        fo30Var.getClass();
        ConstraintLayout constraintLayout = (ConstraintLayout) bwt0.I(R.layout.vkim_msg_part_audio_redesign, viewGroup, false);
        fo30Var.b = constraintLayout;
        fo30Var.d = (ImageView) constraintLayout.findViewById(R.id.play_icon);
        ConstraintLayout constraintLayout2 = fo30Var.b;
        if (constraintLayout2 == null) {
            constraintLayout2 = null;
        }
        fo30Var.i = (TextView) constraintLayout2.findViewById(R.id.audio_title);
        ConstraintLayout constraintLayout3 = fo30Var.b;
        if (constraintLayout3 == null) {
            constraintLayout3 = null;
        }
        fo30Var.j = (TextView) constraintLayout3.findViewById(R.id.audio_artist);
        ConstraintLayout constraintLayout4 = fo30Var.b;
        if (constraintLayout4 == null) {
            constraintLayout4 = null;
        }
        fo30Var.e = constraintLayout4.findViewById(R.id.dominant_color);
        ConstraintLayout constraintLayout5 = fo30Var.b;
        if (constraintLayout5 == null) {
            constraintLayout5 = null;
        }
        fo30Var.h = (ImageView) constraintLayout5.findViewById(R.id.empty_thumb_icon);
        ConstraintLayout constraintLayout6 = fo30Var.b;
        if (constraintLayout6 == null) {
            constraintLayout6 = null;
        }
        fo30Var.l = (TimeAndStatusView) constraintLayout6.findViewById(R.id.time_and_status);
        ConstraintLayout constraintLayout7 = fo30Var.b;
        if (constraintLayout7 == null) {
            constraintLayout7 = null;
        }
        ImageView imageView = (ImageView) constraintLayout7.findViewById(R.id.explicit_content);
        fo30Var.k = imageView;
        Context a2 = fo30Var.a();
        e3m.a aVar = e3m.a;
        imageView.setImageDrawable(m33.a(R.drawable.vk_icon_error_circle_fill_gray_12, a2));
        ConstraintLayout constraintLayout8 = fo30Var.b;
        if (constraintLayout8 == null) {
            constraintLayout8 = null;
        }
        fo30Var.g = constraintLayout8.findViewById(R.id.play_icon_background);
        ConstraintLayout constraintLayout9 = fo30Var.b;
        if (constraintLayout9 == null) {
            constraintLayout9 = null;
        }
        ThumbsImageView thumbsImageView = (ThumbsImageView) constraintLayout9.findViewById(R.id.audio_image);
        thumbsImageView.setPostProcessorForSingle(fo30Var.s);
        fo30Var.f = thumbsImageView;
        ConstraintLayout constraintLayout10 = fo30Var.b;
        if (constraintLayout10 == null) {
            constraintLayout10 = null;
        }
        this.d = constraintLayout10;
        if (constraintLayout10 == null) {
            constraintLayout10 = null;
        }
        this.f = new gc4(constraintLayout10.getContext());
        co30 co30Var = this.k;
        final Msg msg = co30Var != null ? co30Var.v : null;
        final Attach attach = co30Var != null ? co30Var.x : null;
        if (msg != null && attach != null) {
            ConstraintLayout constraintLayout11 = this.d;
            if (constraintLayout11 == null) {
                constraintLayout11 = null;
            }
            constraintLayout11.setOnClickListener(new b030(this, msg, attach, 1));
            constraintLayout11.setOnLongClickListener(new View.OnLongClickListener() { // from class: xsna.ao30
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    bo30 bo30Var = bo30.this;
                    pk30 pk30Var = bo30Var.l;
                    if (pk30Var != null) {
                        co30 co30Var2 = bo30Var.k;
                        pk30Var.X(attach, msg, co30Var2 != null ? co30Var2.w : null);
                    }
                    return bo30Var.l != null;
                }
            });
        }
        fo30Var.c = new a();
        ConstraintLayout constraintLayout12 = this.d;
        if (constraintLayout12 == null) {
            return null;
        }
        return constraintLayout12;
    }

    @Override // xsna.hr30
    public final void r() {
        fo30 fo30Var = this.e;
        View view = fo30Var.e;
        if (view == null) {
            view = null;
        }
        view.setBackgroundColor(((Number) fo30Var.m.getValue()).intValue());
        fo30Var.r.dispose();
        View view2 = fo30Var.g;
        if (view2 == null) {
            view2 = null;
        }
        view2.setVisibility(0);
        ImageView imageView = fo30Var.h;
        if (imageView == null) {
            imageView = null;
        }
        f4m.j(imageView);
        ImageView imageView2 = fo30Var.d;
        if (imageView2 == null) {
            imageView2 = null;
        }
        imageView2.setVisibility(0);
        kq4 kq4Var = this.i;
        if (kq4Var != null) {
            kq4Var.b(this);
        }
        this.i = null;
    }

    public final void s() {
        co30 co30Var;
        AudioTrack audioTrack = this.h;
        fo30 fo30Var = this.e;
        if (audioTrack == null || (co30Var = this.k) == null || audioTrack.b.b != co30Var.i) {
            fo30Var.b(false);
        } else {
            fo30Var.b(audioTrack.d);
        }
    }
}
