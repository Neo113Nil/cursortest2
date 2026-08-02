package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.dto.music.MusicTrack;
import com.vk.im.external.AudioTrack;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.e3m;
import xsna.vvn;

/* compiled from: MsgPartAudioCollectionVC.kt */
/* loaded from: classes2.dex */
public abstract class zn30 implements hux0 {
    public final int b;
    public ConstraintLayout c;
    public TextView d;
    public View e;
    public ImageView f;
    public ImageView g;
    public View h;
    public TimeAndStatusView i;
    public List<? extends View> j;
    public a k;
    public final ueb0 l = new ueb0();
    public io.reactivex.rxjava3.disposables.c m = new io.reactivex.rxjava3.disposables.f(io.reactivex.rxjava3.internal.functions.a.b);
    public final vvn n = new vvn();
    public final Object o;
    public final Object p;
    public final Object q;
    public final Object r;
    public final Object s;
    public final Object t;
    public final Object u;

    /* compiled from: MsgPartAudioCollectionVC.kt */
    public interface a {
        void a();

        void b(MusicTrack musicTrack);

        void c();

        void d();
    }

    public zn30(int i) {
        this.b = i;
        zf20 zf20Var = new zf20(this, 3);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.o = msy.a(lazyThreadSafetyMode, zf20Var);
        this.p = msy.a(lazyThreadSafetyMode, new x3i(this, 24));
        this.q = msy.a(lazyThreadSafetyMode, new y3i(this, 27));
        this.r = msy.a(lazyThreadSafetyMode, new f5x(this, 13));
        this.s = msy.a(lazyThreadSafetyMode, new ag20(this, 2));
        this.t = msy.a(lazyThreadSafetyMode, new xis(this, 19));
        this.u = msy.a(lazyThreadSafetyMode, new m1y(this, 9));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(boolean z) {
        ImageView imageView = this.f;
        if (imageView == null) {
            imageView = null;
        }
        boolean z2 = !z;
        awt0.v(imageView, z2);
        ImageView imageView2 = this.g;
        if (imageView2 == null) {
            imageView2 = null;
        }
        awt0.v(imageView2, z2);
        List<? extends View> list = this.j;
        if (list == null) {
            list = null;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            awt0.v((View) it.next(), z2);
        }
        TimeAndStatusView timeAndStatusView = this.i;
        f4m.t(z ? cn70.b(7) : ((Number) this.u.getValue()).intValue(), timeAndStatusView != null ? timeAndStatusView : null);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void b() {
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = this.n.c.a0(io.reactivex.rxjava3.android.schedulers.a.b());
        View view = this.e;
        if (view == null) {
            view = null;
        }
        this.m = a0.subscribe(new vvn.b(view, ((Number) this.s.getValue()).intValue()));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    public final void c(List<? extends View> list) {
        for (View view : list) {
            if (gz80.a(28)) {
                view.setElevation(cn70.c(4));
                view.setOutlineSpotShadowColor(((Number) this.t.getValue()).intValue());
            } else {
                view.setElevation(cn70.c(2));
            }
        }
    }

    public final View d(ViewGroup viewGroup) {
        ConstraintLayout constraintLayout = (ConstraintLayout) bwt0.I(this.b, viewGroup, false);
        this.c = constraintLayout;
        uv20 uv20Var = new uv20(this, 2);
        ueb0 ueb0Var = this.l;
        ueb0Var.getClass();
        ueb0Var.a = new ghp0(constraintLayout, R.id.first_track, uv20Var);
        ueb0Var.b = new ghp0(constraintLayout, R.id.second_track, uv20Var);
        ueb0Var.c = new ghp0(constraintLayout, R.id.third_track, uv20Var);
        f();
        ConstraintLayout constraintLayout2 = this.c;
        if (constraintLayout2 == null) {
            constraintLayout2 = null;
        }
        this.f = (ImageView) constraintLayout2.findViewById(R.id.play_button_icon);
        ConstraintLayout constraintLayout3 = this.c;
        if (constraintLayout3 == null) {
            constraintLayout3 = null;
        }
        this.d = (TextView) constraintLayout3.findViewById(R.id.play_button_text);
        ConstraintLayout constraintLayout4 = this.c;
        if (constraintLayout4 == null) {
            constraintLayout4 = null;
        }
        this.e = constraintLayout4.findViewById(R.id.dominant_color);
        ConstraintLayout constraintLayout5 = this.c;
        if (constraintLayout5 == null) {
            constraintLayout5 = null;
        }
        this.i = (TimeAndStatusView) constraintLayout5.findViewById(R.id.time_and_status);
        ConstraintLayout constraintLayout6 = this.c;
        if (constraintLayout6 == null) {
            constraintLayout6 = null;
        }
        View findViewById = constraintLayout6.findViewById(R.id.play_button_wrapper);
        findViewById.setOnClickListener(new wcd(this, 6));
        this.h = findViewById;
        ImageView imageView = this.f;
        if (imageView == null) {
            imageView = null;
        }
        TextView textView = this.d;
        if (textView == null) {
            textView = null;
        }
        List<? extends View> l = e43.l(findViewById, imageView, textView);
        this.j = l;
        if (l == null) {
            l = null;
        }
        c(l);
        ConstraintLayout constraintLayout7 = this.c;
        if (constraintLayout7 == null) {
            constraintLayout7 = null;
        }
        ImageView imageView2 = (ImageView) constraintLayout7.findViewById(R.id.shuffle_button);
        imageView2.setOnClickListener(new pc3(this, 5));
        c(Collections.singletonList(imageView2));
        this.g = imageView2;
        g();
        ConstraintLayout constraintLayout8 = this.c;
        if (constraintLayout8 != null) {
            return constraintLayout8;
        }
        return null;
    }

    public final Context e() {
        ConstraintLayout constraintLayout = this.c;
        if (constraintLayout == null) {
            constraintLayout = null;
        }
        return constraintLayout.getContext();
    }

    public abstract void f();

    @Override // xsna.hux0
    public final TimeAndStatusView getTimeAndStatusView() {
        TimeAndStatusView timeAndStatusView = this.i;
        if (timeAndStatusView != null) {
            return timeAndStatusView;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void h() {
        ImageView imageView = this.f;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setImageDrawable((Drawable) this.o.getValue());
        View view = this.h;
        (view != null ? view : null).setContentDescription((String) this.q.getValue());
        Iterator it = ((List) this.l.d.getValue()).iterator();
        while (it.hasNext()) {
            ((ghp0) it.next()).a();
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void i(AudioTrack audioTrack, int i) {
        if (!audioTrack.d) {
            h();
            return;
        }
        ImageView imageView = this.f;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setImageDrawable((Drawable) this.p.getValue());
        View view = this.h;
        if (view == null) {
            view = null;
        }
        view.setContentDescription((String) this.r.getValue());
        ueb0 ueb0Var = this.l;
        ueb0Var.getClass();
        ?? r0 = ueb0Var.d;
        if (!audioTrack.d || i < 0) {
            Iterator it = ((List) r0.getValue()).iterator();
            while (it.hasNext()) {
                ((ghp0) it.next()).a();
            }
            return;
        }
        int i2 = 0;
        for (Object obj : (List) r0.getValue()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            ghp0 ghp0Var = (ghp0) obj;
            if (i2 == i) {
                TextView textView = ghp0Var.c;
                if (textView == null) {
                    textView = null;
                }
                Context context = ghp0Var.b.getContext();
                e3m.a aVar = e3m.a;
                textView.setTextColor(context.getColor(R.color.vk_azure_300));
                ImageView imageView2 = ghp0Var.f;
                if (imageView2 == null) {
                    imageView2 = null;
                }
                imageView2.setVisibility(0);
                ImageView imageView3 = ghp0Var.f;
                if (imageView3 == null) {
                    imageView3 = null;
                }
                imageView3.setActivated(true);
            } else {
                ghp0Var.a();
            }
            i2 = i3;
        }
    }

    @Override // xsna.hux0
    public final void X3() {
    }

    public void g() {
    }
}
