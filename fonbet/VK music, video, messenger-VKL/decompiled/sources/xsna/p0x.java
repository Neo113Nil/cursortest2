package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.ProgressView;
import com.vk.core.view.VideoRestrictionView;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.dto.attaches.AttachWithImage;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vk.im.ui.views.msg.bubble.MsgBubbleView;
import com.vkontakte.android.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import kotlin.collections.EmptyList;
import xsna.as30;
import xsna.hr30;
import xsna.xfz;

/* compiled from: InlinePreviewVC.kt */
/* loaded from: classes2.dex */
public final class p0x implements h4w {
    public final Context b;
    public View c;
    public FrescoImageView d;
    public TimeAndStatusView e;
    public r3e0 f;
    public View g;
    public View h;
    public AttachWithImage i;
    public final ek30 j;
    public final fk30 k;
    public io.reactivex.rxjava3.disposables.c l;
    public final l1t0 m;
    public g34 n;

    public p0x(Context context) {
        this.b = context;
        this.j = new ek30(context, 0);
        this.k = new fk30(context);
        int i = VideoRestrictionView.d;
        VideoRestrictionView.a.a(iah0.a(2), context);
        this.m = fxc0.B().Q();
    }

    @Override // xsna.xfz.a
    public final void b() {
        r3e0 r3e0Var = this.f;
        if (r3e0Var == null) {
            r3e0Var = null;
        }
        r3e0Var.e();
        g34 g34Var = this.n;
        if (g34Var != null) {
            AttachWithImage attachWithImage = this.i;
            if (attachWithImage == null) {
                attachWithImage = null;
            }
            g34Var.a(attachWithImage.xb(), null);
        }
        this.n = null;
    }

    @Override // xsna.xfz.a
    public final void bind(wp10 wp10Var) {
        q0x q0xVar = (q0x) wp10Var;
        this.i = q0xVar.j;
        g34 g34Var = q0xVar.l;
        this.n = g34Var;
        if (g34Var != null) {
            g34Var.a(q0xVar.n, this);
        }
        if (q0xVar.f) {
            FrescoImageView frescoImageView = this.d;
            if (frescoImageView == null) {
                frescoImageView = null;
            }
            frescoImageView.setMaximumWidth(Integer.MAX_VALUE);
        } else {
            FrescoImageView frescoImageView2 = this.d;
            FrescoImageView frescoImageView3 = frescoImageView2 == null ? null : frescoImageView2;
            if (frescoImageView2 == null) {
                frescoImageView2 = null;
            }
            frescoImageView3.setMaximumWidth(e3m.a(R.dimen.msg_bubble_max_width, frescoImageView2.getContext()));
        }
        AttachWithImage attachWithImage = this.i;
        AttachWithImage attachWithImage2 = attachWithImage == null ? null : attachWithImage;
        AttachVideo attachVideo = attachWithImage2 instanceof AttachVideo ? (AttachVideo) attachWithImage2 : null;
        VideoFile videoFile = attachVideo != null ? attachVideo.b : null;
        r3e0 r3e0Var = this.f;
        if (r3e0Var == null) {
            r3e0Var = null;
        }
        if (attachWithImage == null) {
            attachWithImage = null;
        }
        r3e0Var.a(attachWithImage);
        StringBuilder sb = hr30.b;
        jr30 jr30Var = q0xVar.i;
        TimeAndStatusView timeAndStatusView = this.e;
        if (timeAndStatusView == null) {
            timeAndStatusView = null;
        }
        hr30.a.a(timeAndStatusView, jr30Var, true);
        Context context = this.b;
        int m0 = q0xVar.m0(context);
        int g = q0xVar.g(context);
        View view = this.h;
        float f = m0;
        float f2 = g;
        this.m.a(view == null ? null : view, f, f, f2, f2);
        FrescoImageView frescoImageView4 = this.d;
        if (frescoImageView4 == null) {
            frescoImageView4 = null;
        }
        frescoImageView4.m(m0, m0, g, g);
        this.j.c(m0, m0, g, g);
        boolean U0 = q0xVar.U0();
        FrescoImageView frescoImageView5 = this.d;
        if (frescoImageView5 == null) {
            frescoImageView5 = null;
        }
        frescoImageView5.setColorFilter(U0 ? this.k : null);
        if (videoFile == null) {
            FrescoImageView frescoImageView6 = this.d;
            if (frescoImageView6 == null) {
                frescoImageView6 = null;
            }
            AttachWithImage attachWithImage3 = this.i;
            if (attachWithImage3 == null) {
                attachWithImage3 = null;
            }
            frescoImageView6.setLocalImage(attachWithImage3.d());
            AttachWithImage attachWithImage4 = this.i;
            if (attachWithImage4 == null) {
                attachWithImage4 = null;
            }
            frescoImageView6.setRemoteImage(attachWithImage4.f());
            frescoImageView6.setVisibility(0);
            View view2 = this.h;
            f4m.j(view2 != null ? view2 : null);
            return;
        }
        AttachWithImage attachWithImage5 = this.i;
        if (attachWithImage5 == null) {
            attachWithImage5 = null;
        }
        ImageList f3 = attachWithImage5.f();
        View view3 = this.h;
        View view4 = view3 == null ? null : view3;
        FrescoImageView frescoImageView7 = this.d;
        this.m.d(view4, videoFile, frescoImageView7 == null ? null : frescoImageView7, new cq3(15, this, f3), new igh(this, 19), null);
        boolean p0 = q0xVar.p0();
        int Y = q0xVar.Y(context);
        int a = e3m.a(videoFile.C2() ? R.dimen.msg_clip_max_height : R.dimen.msg_content_max_height, context);
        l1t0 l1t0Var = this.m;
        if (p0) {
            View view5 = this.h;
            if (view5 == null) {
                view5 = null;
            }
            l1t0Var.b(Y, a, view5);
            View view6 = this.h;
            l1t0Var.f(Y, a, view6 != null ? view6 : null);
            return;
        }
        int width = (int) (a * (videoFile.getWidth() / videoFile.getHeight()));
        View view7 = this.h;
        if (view7 == null) {
            view7 = null;
        }
        l1t0Var.b(width, a, view7);
        View view8 = this.h;
        l1t0Var.f(videoFile.getWidth(), videoFile.getHeight(), view8 != null ? view8 : null);
    }

    @Override // xsna.g34.a
    public final void c(int i) {
        r3e0 r3e0Var = this.f;
        if (r3e0Var == null) {
            r3e0Var = null;
        }
        r3e0Var.c(i);
        View view = this.g;
        bwt0.p0(view != null ? view : null, true);
    }

    @Override // xsna.g34.a
    public final void e(int i, int i2, int i3) {
        r3e0 r3e0Var = this.f;
        if (r3e0Var == null) {
            r3e0Var = null;
        }
        r3e0Var.d(i, i2, i3);
        View view = this.g;
        bwt0.p0(view != null ? view : null, i2 == 0);
    }

    @Override // xsna.g34.a
    public final void f(int i) {
        r3e0 r3e0Var = this.f;
        if (r3e0Var == null) {
            r3e0Var = null;
        }
        r3e0Var.b(i);
        View view = this.g;
        bwt0.p0(view != null ? view : null, true);
    }

    @Override // xsna.xfz.a
    public final dnt0 getPresenter() {
        throw new UnsupportedOperationException();
    }

    @Override // xsna.xfz.a
    public final View i(MsgBubbleView msgBubbleView, final as30.a aVar) {
        Context context = this.b;
        View inflate = e3m.b(context).inflate(R.layout.vkim_msg_part_media, (ViewGroup) msgBubbleView, false);
        this.c = inflate;
        jjc.g(inflate, new dwg(aVar, 23));
        View view = this.c;
        if (view == null) {
            view = null;
        }
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: xsna.o0x
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                as30.a.this.c();
                return true;
            }
        });
        View view2 = this.c;
        if (view2 == null) {
            view2 = null;
        }
        View findViewById = view2.findViewById(R.id.play);
        this.g = findViewById;
        jjc.g(findViewById, new k7f(aVar, 23));
        View view3 = this.c;
        if (view3 == null) {
            view3 = null;
        }
        this.e = (TimeAndStatusView) view3.findViewById(R.id.timeAndStatus);
        View view4 = this.c;
        if (view4 == null) {
            view4 = null;
        }
        FrescoImageView frescoImageView = (FrescoImageView) view4.findViewById(R.id.image);
        this.d = frescoImageView;
        frescoImageView.setPlaceholder(this.j);
        View view5 = this.c;
        if (view5 == null) {
            view5 = null;
        }
        this.f = new r3e0((ProgressView) view5.findViewById(R.id.upload), null, new aj6(aVar, 4));
        View c = l1t0.c(this.m, context, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 22);
        View view6 = this.c;
        if (view6 == null) {
            view6 = null;
        }
        ViewGroup viewGroup = view6 instanceof ViewGroup ? (ViewGroup) view6 : null;
        if (viewGroup != null) {
            viewGroup.addView(c);
        }
        this.h = c;
        View view7 = this.c;
        if (view7 == null) {
            return null;
        }
        return view7;
    }

    @Override // xsna.h4w
    public final boolean isActive() {
        return false;
    }

    @Override // xsna.h4w
    public final Collection<Integer> v(String str) {
        File i1;
        AttachWithImage attachWithImage = this.i;
        if (attachWithImage != null) {
            ftx0 ftx0Var = attachWithImage instanceof ftx0 ? (ftx0) attachWithImage : null;
            if (epx.f((ftx0Var == null || (i1 = ftx0Var.i1()) == null) ? null : i1.getPath(), str)) {
                AttachWithImage attachWithImage2 = this.i;
                return Collections.singletonList(Integer.valueOf((attachWithImage2 != null ? attachWithImage2 : null).xb()));
            }
        }
        return EmptyList.b;
    }

    @Override // xsna.xfz.a
    public final void a(xfz.a.C4001a c4001a) {
    }

    @Override // xsna.xfz.a
    public final void g(ArrayList arrayList) {
    }
}
