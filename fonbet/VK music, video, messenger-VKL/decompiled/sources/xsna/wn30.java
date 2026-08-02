package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachArtist;
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
import java.util.List;
import xsna.zn30;

/* compiled from: MsgPartArtistHolder.kt */
/* loaded from: classes2.dex */
public final class wn30 extends hr30<AttachArtist, xn30> {
    public ConstraintLayout d;
    public Long e;
    public AudioTrack f;
    public xn30 g;
    public AudioTrack h;
    public List<MusicTrack> i;
    public final yn30 j = new yn30(R.layout.vkim_msg_part_artist_redesign);
    public pk30 k;
    public gc4 l;

    /* compiled from: MsgPartArtistHolder.kt */
    public final class a implements zn30.a {
        public a() {
        }

        @Override // xsna.zn30.a
        public final void a() {
            boolean z;
            MusicTrack musicTrack;
            wn30 wn30Var = wn30.this;
            AudioTrack audioTrack = wn30Var.f;
            boolean z2 = false;
            if (audioTrack == null || (musicTrack = audioTrack.b) == null) {
                z = false;
            } else {
                List<MusicTrack> list = wn30Var.i;
                if (list == null) {
                    list = null;
                }
                z = list.contains(musicTrack);
            }
            if (z) {
                AudioTrack audioTrack2 = wn30Var.f;
                if (audioTrack2 != null && audioTrack2.d) {
                    z2 = true;
                }
            }
            if (z2) {
                pk30 pk30Var = wn30Var.k;
                if (pk30Var != null) {
                    pk30Var.p();
                    return;
                }
                return;
            }
            pk30 pk30Var2 = wn30Var.k;
            if (pk30Var2 != null) {
                List<MusicTrack> list2 = wn30Var.i;
                pk30Var2.i(wn30.s(wn30Var, list2 != null ? list2 : null), wn30Var.h, wn30Var.e);
            }
        }

        @Override // xsna.zn30.a
        public final void b(MusicTrack musicTrack) {
            wn30 wn30Var = wn30.this;
            AudioTrack audioTrack = wn30Var.f;
            if (audioTrack != null && audioTrack.b.b == musicTrack.b && audioTrack.d) {
                pk30 pk30Var = wn30Var.k;
                if (pk30Var != null) {
                    pk30Var.p();
                    return;
                }
                return;
            }
            pk30 pk30Var2 = wn30Var.k;
            if (pk30Var2 != null) {
                List<MusicTrack> list = wn30Var.i;
                if (list == null) {
                    list = null;
                }
                pk30Var2.i(wn30.s(wn30Var, list), new AudioTrack(musicTrack, false, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 30, null), wn30Var.e);
            }
        }

        @Override // xsna.zn30.a
        public final void c() {
            pk30 pk30Var;
            wn30 wn30Var = wn30.this;
            xn30 xn30Var = wn30Var.g;
            Msg msg = xn30Var != null ? xn30Var.v : null;
            Attach attach = xn30Var != null ? xn30Var.x : null;
            if (msg == null || attach == null || (pk30Var = wn30Var.k) == null) {
                return;
            }
            pk30Var.R(attach, msg, xn30Var != null ? xn30Var.w : null);
        }

        @Override // xsna.zn30.a
        public final void d() {
            wn30 wn30Var = wn30.this;
            pk30 pk30Var = wn30Var.k;
            if (pk30Var != null) {
                List<MusicTrack> list = wn30Var.i;
                if (list == null) {
                    list = null;
                }
                pk30Var.i(e43.r(wn30.s(wn30Var, list)), null, wn30Var.e);
            }
        }
    }

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class b implements View.OnLongClickListener {
        public b() {
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            wn30 wn30Var = wn30.this;
            pk30 pk30Var = wn30Var.k;
            xn30 xn30Var = wn30Var.g;
            Boolean bool = null;
            bool = null;
            bool = null;
            Msg msg = xn30Var != null ? xn30Var.v : null;
            Attach attach = xn30Var != null ? xn30Var.x : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.X(attach, msg, xn30Var != null ? xn30Var.w : null);
                bool = Boolean.TRUE;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
    }

    public static final ArrayList s(wn30 wn30Var, List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new AudioTrack((MusicTrack) it.next(), false, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 30, null));
        }
        return arrayList;
    }

    @Override // xsna.hr30, xsna.kq4.a
    public final void a(AudioTrack audioTrack) {
        this.f = audioTrack;
        t();
    }

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        int l = n8g.l(krv0.l(R.attr.vk_legacy_text_primary), 102);
        TimeAndStatusView timeAndStatusView = this.j.i;
        if (timeAndStatusView == null) {
            timeAndStatusView = null;
        }
        timeAndStatusView.setTimeTextColor(l);
    }

    @Override // xsna.hr30
    public final void p(xn30 xn30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        xn30 xn30Var2 = xn30Var;
        List<MusicTrack> list = xn30Var2.i;
        this.k = pk30Var;
        this.g = xn30Var2;
        kq4 kq4Var = xn30Var2.j;
        if (kq4Var != null) {
            kq4Var.c(this);
        }
        this.f = kq4Var != null ? kq4Var.d() : null;
        this.e = Long.valueOf(xn30Var2.f.b);
        yn30 yn30Var = this.j;
        yn30Var.getClass();
        Thumb thumb = new Thumb(xn30Var2.h.Kb());
        yn30Var.m.dispose();
        yn30Var.b();
        ThumbsImageView thumbsImageView = yn30Var.x;
        if (thumbsImageView == null) {
            thumbsImageView = null;
        }
        thumbsImageView.setPostProcessorForSingle(yn30Var.n);
        ThumbsImageView thumbsImageView2 = yn30Var.x;
        if (thumbsImageView2 == null) {
            thumbsImageView2 = null;
        }
        thumbsImageView2.setThumb(thumb);
        TextView textView = yn30Var.w;
        if (textView == null) {
            textView = null;
        }
        textView.setText(xn30Var2.c);
        TextView textView2 = yn30Var.v;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setText(xn30Var2.e);
        yn30Var.a(list.isEmpty());
        yn30Var.l.a(list);
        this.i = list;
        gc4 gc4Var = this.l;
        if (gc4Var == null) {
            gc4Var = null;
        }
        ConstraintLayout constraintLayout = this.d;
        if (constraintLayout == null) {
            constraintLayout = null;
        }
        gc4Var.a(xn30Var2, constraintLayout);
        jr30 jr30Var = xn30Var2.b;
        TimeAndStatusView timeAndStatusView = yn30Var.i;
        hr30.l(timeAndStatusView != null ? timeAndStatusView : null, jr30Var, false);
        t();
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        yn30 yn30Var = this.j;
        View d = yn30Var.d(viewGroup);
        d.setOnLongClickListener(new b());
        this.d = (ConstraintLayout) d;
        this.l = new gc4(d.getContext());
        yn30Var.k = new a();
        ConstraintLayout constraintLayout = this.d;
        if (constraintLayout == null) {
            return null;
        }
        return constraintLayout;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.hr30
    public final void r() {
        kq4 kq4Var;
        yn30 yn30Var = this.j;
        Iterator it = ((List) yn30Var.l.d.getValue()).iterator();
        while (it.hasNext()) {
            f4m.j(((ghp0) it.next()).b);
        }
        View view = yn30Var.e;
        if (view == null) {
            view = null;
        }
        view.setBackgroundColor(((Number) yn30Var.s.getValue()).intValue());
        yn30Var.m.dispose();
        this.k = null;
        this.h = null;
        xn30 xn30Var = this.g;
        if (xn30Var == null || (kq4Var = xn30Var.j) == null) {
            return;
        }
        kq4Var.b(this);
    }

    public final void t() {
        AudioTrack audioTrack = this.f;
        yn30 yn30Var = this.j;
        if (audioTrack != null) {
            MusicTrack musicTrack = audioTrack.b;
            List<MusicTrack> list = this.i;
            if (list == null) {
                list = null;
            }
            if (list.contains(musicTrack)) {
                this.h = audioTrack;
                List<MusicTrack> list2 = this.i;
                yn30Var.i(audioTrack, j5g.H0(list2 != null ? list2 : null, 3).indexOf(musicTrack));
                return;
            }
        }
        yn30Var.h();
    }
}
