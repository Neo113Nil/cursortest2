package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Thumb;
import com.vk.im.engine.models.attaches.AttachPlaylist;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.external.AudioTrack;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vk.imageloader.view.VKImageView;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.e3m;
import xsna.zn30;

/* compiled from: MsgPartPlaylistHolder.kt */
/* loaded from: classes2.dex */
public final class ss30 extends hr30<AttachPlaylist, ts30> {
    public ConstraintLayout d;
    public Long e;
    public AudioTrack f;
    public ts30 g;
    public AudioTrack h;
    public List<MusicTrack> i;
    public final us30 j = new us30();
    public kq4 k;
    public pk30 l;
    public gc4 m;

    /* compiled from: MsgPartPlaylistHolder.kt */
    public final class a implements zn30.a {
        public a() {
        }

        @Override // xsna.zn30.a
        public final void a() {
            boolean z;
            MusicTrack musicTrack;
            ss30 ss30Var = ss30.this;
            AudioTrack audioTrack = ss30Var.f;
            boolean z2 = false;
            if (audioTrack == null || (musicTrack = audioTrack.b) == null) {
                z = false;
            } else {
                List<MusicTrack> list = ss30Var.i;
                if (list == null) {
                    list = null;
                }
                z = list.contains(musicTrack);
            }
            if (z) {
                AudioTrack audioTrack2 = ss30Var.f;
                if (audioTrack2 != null && audioTrack2.d) {
                    z2 = true;
                }
            }
            if (z2) {
                pk30 pk30Var = ss30Var.l;
                if (pk30Var != null) {
                    pk30Var.p();
                    return;
                }
                return;
            }
            pk30 pk30Var2 = ss30Var.l;
            if (pk30Var2 != null) {
                List<MusicTrack> list2 = ss30Var.i;
                pk30Var2.i(ss30.s(ss30Var, list2 != null ? list2 : null), ss30Var.h, ss30Var.e);
            }
        }

        @Override // xsna.zn30.a
        public final void b(MusicTrack musicTrack) {
            ss30 ss30Var = ss30.this;
            AudioTrack audioTrack = ss30Var.f;
            if (audioTrack != null && audioTrack.b.b == musicTrack.b && audioTrack.d) {
                pk30 pk30Var = ss30Var.l;
                if (pk30Var != null) {
                    pk30Var.p();
                    return;
                }
                return;
            }
            pk30 pk30Var2 = ss30Var.l;
            if (pk30Var2 != null) {
                List<MusicTrack> list = ss30Var.i;
                if (list == null) {
                    list = null;
                }
                pk30Var2.i(ss30.s(ss30Var, list), new AudioTrack(musicTrack, false, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 30, null), ss30Var.e);
            }
        }

        @Override // xsna.zn30.a
        public final void c() {
            pk30 pk30Var;
            ss30 ss30Var = ss30.this;
            ts30 ts30Var = ss30Var.g;
            Msg msg = ts30Var != null ? ts30Var.D : null;
            Attach attach = ts30Var != null ? ts30Var.F : null;
            if (msg == null || attach == null || (pk30Var = ss30Var.l) == null) {
                return;
            }
            pk30Var.R(attach, msg, ts30Var != null ? ts30Var.E : null);
        }

        @Override // xsna.zn30.a
        public final void d() {
            ss30 ss30Var = ss30.this;
            pk30 pk30Var = ss30Var.l;
            if (pk30Var != null) {
                List<MusicTrack> list = ss30Var.i;
                if (list == null) {
                    list = null;
                }
                pk30Var.i(e43.r(ss30.s(ss30Var, list)), null, ss30Var.e);
            }
        }
    }

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class b implements View.OnLongClickListener {
        public b() {
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            ss30 ss30Var = ss30.this;
            pk30 pk30Var = ss30Var.l;
            ts30 ts30Var = ss30Var.g;
            Boolean bool = null;
            bool = null;
            bool = null;
            Msg msg = ts30Var != null ? ts30Var.D : null;
            Attach attach = ts30Var != null ? ts30Var.F : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.X(attach, msg, ts30Var != null ? ts30Var.E : null);
                bool = Boolean.TRUE;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
    }

    public static final ArrayList s(ss30 ss30Var, List list) {
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

    /* JADX WARN: Type inference failed for: r3v33, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.hr30
    public final void p(ts30 ts30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        ts30 ts30Var2 = ts30Var;
        List<MusicTrack> list = ts30Var2.j;
        this.l = pk30Var;
        this.g = ts30Var2;
        kq4 kq4Var = ts30Var2.r;
        if (kq4Var != null) {
            kq4Var.c(this);
            this.k = kq4Var;
        }
        this.f = kq4Var != null ? kq4Var.d() : null;
        this.e = Long.valueOf(ts30Var2.o.b);
        us30 us30Var = this.j;
        us30Var.getClass();
        String str = ts30Var2.l;
        List<Thumb> list2 = ts30Var2.d;
        us30Var.m.dispose();
        if (list2.isEmpty()) {
            View view = us30Var.e;
            if (view == null) {
                view = null;
            }
            view.setBackgroundColor(((Number) us30Var.s.getValue()).intValue());
        } else {
            us30Var.b();
        }
        heb0 heb0Var = us30Var.z;
        vvn vvnVar = us30Var.n;
        heb0Var.d = new v01(us30Var, 6);
        heb0Var.h = vvnVar;
        int size = list2.size();
        if (size == 0 || size == 1) {
            ThumbsImageView thumbsImageView = heb0Var.a;
            if (thumbsImageView == null) {
                thumbsImageView = null;
            }
            thumbsImageView.setOnClickListener(heb0Var.d);
        } else {
            ThumbsImageView thumbsImageView2 = heb0Var.c;
            if (thumbsImageView2 == null) {
                thumbsImageView2 = null;
            }
            thumbsImageView2.setOnClickListener(heb0Var.d);
        }
        int size2 = list2.size();
        if (size2 == 1) {
            ThumbsImageView thumbsImageView3 = heb0Var.a;
            if (thumbsImageView3 == null) {
                thumbsImageView3 = null;
            }
            vvn vvnVar2 = heb0Var.h;
            if (vvnVar2 == null) {
                vvnVar2 = null;
            }
            thumbsImageView3.setPostProcessorForSingle(vvnVar2);
            thumbsImageView3.setThumb((Thumb) j5g.Y(list2));
            heb0Var.a(thumbsImageView3);
            ThumbsImageView thumbsImageView4 = heb0Var.b;
            if (thumbsImageView4 == null) {
                thumbsImageView4 = null;
            }
            thumbsImageView4.setVisibility(4);
            ThumbsImageView thumbsImageView5 = heb0Var.c;
            if (thumbsImageView5 == null) {
                thumbsImageView5 = null;
            }
            thumbsImageView5.setVisibility(4);
        } else if (size2 == 2) {
            ThumbsImageView thumbsImageView6 = heb0Var.a;
            if (thumbsImageView6 == null) {
                thumbsImageView6 = null;
            }
            thumbsImageView6.setThumb(list2.get(1));
            ThumbsImageView thumbsImageView7 = heb0Var.b;
            if (thumbsImageView7 == null) {
                thumbsImageView7 = null;
            }
            thumbsImageView7.setVisibility(4);
            ThumbsImageView thumbsImageView8 = heb0Var.c;
            if (thumbsImageView8 == null) {
                thumbsImageView8 = null;
            }
            vvn vvnVar3 = heb0Var.h;
            if (vvnVar3 == null) {
                vvnVar3 = null;
            }
            thumbsImageView8.setPostProcessorForSingle(vvnVar3);
            thumbsImageView8.setThumb(list2.get(0));
        } else if (size2 != 3) {
            ThumbsImageView thumbsImageView9 = heb0Var.a;
            if (thumbsImageView9 == null) {
                thumbsImageView9 = null;
            }
            thumbsImageView9.setThumb(null);
            heb0Var.a(thumbsImageView9);
            ThumbsImageView thumbsImageView10 = heb0Var.b;
            if (thumbsImageView10 == null) {
                thumbsImageView10 = null;
            }
            thumbsImageView10.setVisibility(4);
            ThumbsImageView thumbsImageView11 = heb0Var.c;
            if (thumbsImageView11 == null) {
                thumbsImageView11 = null;
            }
            thumbsImageView11.setVisibility(4);
        } else {
            ThumbsImageView thumbsImageView12 = heb0Var.a;
            if (thumbsImageView12 == null) {
                thumbsImageView12 = null;
            }
            thumbsImageView12.setThumb(list2.get(2));
            ThumbsImageView thumbsImageView13 = heb0Var.b;
            if (thumbsImageView13 == null) {
                thumbsImageView13 = null;
            }
            thumbsImageView13.setThumb(list2.get(1));
            ThumbsImageView thumbsImageView14 = heb0Var.c;
            if (thumbsImageView14 == null) {
                thumbsImageView14 = null;
            }
            vvn vvnVar4 = heb0Var.h;
            if (vvnVar4 == null) {
                vvnVar4 = null;
            }
            thumbsImageView14.setPostProcessorForSingle(vvnVar4);
            thumbsImageView14.setThumb(list2.get(0));
        }
        TextView textView = us30Var.w;
        if (textView == null) {
            textView = null;
        }
        textView.setText(ts30Var2.m);
        if (ts30Var2.k) {
            TextView textView2 = us30Var.w;
            if (textView2 == null) {
                textView2 = null;
            }
            Context e = us30Var.e();
            e3m.a aVar = e3m.a;
            textView2.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, m33.a(R.drawable.vk_icon_error_circle_fill_gray_12, e), (Drawable) null);
            TextView textView3 = us30Var.w;
            if (textView3 == null) {
                textView3 = null;
            }
            textView3.setCompoundDrawablePadding(cn70.b(4));
        } else {
            TextView textView4 = us30Var.w;
            if (textView4 == null) {
                textView4 = null;
            }
            textView4.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        Image image = ts30Var2.p;
        if (image == null || image.b.isEmpty()) {
            VKImageView vKImageView = us30Var.y;
            if (vKImageView == null) {
                vKImageView = null;
            }
            f4m.j(vKImageView);
        } else {
            VKImageView vKImageView2 = us30Var.y;
            if (vKImageView2 == null) {
                vKImageView2 = null;
            }
            vKImageView2.setVisibility(0);
            ImageSize Cb = image.Cb(us30.A, false, true);
            vKImageView2.load(Cb != null ? Cb.d.d : null);
        }
        TextView textView5 = us30Var.v;
        if (textView5 == null) {
            textView5 = null;
        }
        textView5.setText(str);
        TextView textView6 = us30Var.v;
        if (textView6 == null) {
            textView6 = null;
        }
        awt0.v(textView6, !drm0.N(str));
        TextView textView7 = us30Var.x;
        if (textView7 == null) {
            textView7 = null;
        }
        textView7.setText(ts30Var2.n);
        us30Var.a(list.isEmpty());
        us30Var.l.a(list);
        this.i = list;
        gc4 gc4Var = this.m;
        if (gc4Var == null) {
            gc4Var = null;
        }
        ConstraintLayout constraintLayout = this.d;
        if (constraintLayout == null) {
            constraintLayout = null;
        }
        gc4Var.a(ts30Var2, constraintLayout);
        jr30 jr30Var = ts30Var2.b;
        TimeAndStatusView timeAndStatusView = us30Var.i;
        hr30.l(timeAndStatusView != null ? timeAndStatusView : null, jr30Var, false);
        t();
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        us30 us30Var = this.j;
        View d = us30Var.d(viewGroup);
        d.setOnLongClickListener(new b());
        this.d = (ConstraintLayout) d;
        this.m = new gc4(d.getContext());
        us30Var.k = new a();
        ConstraintLayout constraintLayout = this.d;
        if (constraintLayout == null) {
            return null;
        }
        return constraintLayout;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.hr30
    public final void r() {
        us30 us30Var = this.j;
        Iterator it = ((List) us30Var.l.d.getValue()).iterator();
        while (it.hasNext()) {
            f4m.j(((ghp0) it.next()).b);
        }
        View view = us30Var.e;
        if (view == null) {
            view = null;
        }
        view.setBackgroundColor(((Number) us30Var.s.getValue()).intValue());
        us30Var.m.dispose();
        heb0 heb0Var = us30Var.z;
        ThumbsImageView thumbsImageView = heb0Var.a;
        ?? r3 = heb0Var.f;
        if (thumbsImageView == null) {
            thumbsImageView = null;
        }
        thumbsImageView.setVisibility(0);
        thumbsImageView.setThumb(null);
        thumbsImageView.setPostProcessorForSingle(null);
        ThumbsImageView thumbsImageView2 = heb0Var.a;
        if (thumbsImageView2 == null) {
            thumbsImageView2 = null;
        }
        thumbsImageView2.setCornerRadius(heb0.i);
        ViewGroup.LayoutParams layoutParams = thumbsImageView2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = ((Number) r3.getValue()).intValue();
        layoutParams.width = ((Number) r3.getValue()).intValue();
        thumbsImageView2.setLayoutParams(layoutParams);
        ThumbsImageView thumbsImageView3 = heb0Var.b;
        if (thumbsImageView3 == null) {
            thumbsImageView3 = null;
        }
        thumbsImageView3.setVisibility(0);
        thumbsImageView3.setThumb(null);
        thumbsImageView3.setPostProcessorForSingle(null);
        ThumbsImageView thumbsImageView4 = heb0Var.c;
        if (thumbsImageView4 == null) {
            thumbsImageView4 = null;
        }
        thumbsImageView4.setVisibility(0);
        thumbsImageView4.setThumb(null);
        thumbsImageView4.setPostProcessorForSingle(null);
        heb0Var.d = null;
        this.h = null;
        kq4 kq4Var = this.k;
        if (kq4Var != null) {
            kq4Var.b(this);
        }
        this.k = null;
    }

    public final void t() {
        AudioTrack audioTrack = this.f;
        us30 us30Var = this.j;
        if (audioTrack != null) {
            MusicTrack musicTrack = audioTrack.b;
            List<MusicTrack> list = this.i;
            if (list == null) {
                list = null;
            }
            if (list.contains(musicTrack)) {
                this.h = audioTrack;
                List<MusicTrack> list2 = this.i;
                us30Var.i(audioTrack, j5g.H0(list2 != null ? list2 : null, 3).indexOf(musicTrack));
                return;
            }
        }
        us30Var.h();
    }
}
