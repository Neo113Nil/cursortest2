package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.im.ui.views.WaveFormView;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Ref$DoubleRef;
import kotlin.jvm.internal.Ref$LongRef;
import xsna.h7u0;
import xsna.j7u0;
import xsna.qv4;
import xsna.zlv;

/* compiled from: AudioRecordComponent.kt */
/* loaded from: classes2.dex */
public final class vu4 extends j8i {
    public static final b G = new b();
    public long A;
    public String B;
    public io.reactivex.rxjava3.disposables.b C;
    public final av4 D;
    public final c E;
    public MotionEvent F;
    public final Context i;
    public final gzs<ViewGroup> j;
    public final gzs<ViewGroup> k;
    public final a l;
    public final mxv m;
    public final long n;
    public final kkm o;
    public final boolean p;
    public final int q;
    public final int r;
    public final int s;
    public final g t;
    public zlv u;
    public final Handler v = new Handler(Looper.getMainLooper());
    public final uv4 w;
    public final ir4 x;
    public final f y;
    public final e z;

    /* compiled from: AudioRecordComponent.kt */
    public static final class b implements g {
        @Override // xsna.vu4.g
        public final pv4 a(Context context, f fVar, kkm kkmVar, boolean z, int i, int i2, int i3) {
            return new pv4(context, fVar, kkmVar, z, i, i2, i3);
        }
    }

    /* compiled from: AudioRecordComponent.kt */
    public final class c {
        public final ArrayList a = new ArrayList();
        public final long b = SystemClock.uptimeMillis();

        public c() {
        }

        public final d a(qv4 qv4Var, String str) {
            vu4 vu4Var = vu4.this;
            return new d(qv4Var, vu4Var.w.c(), vu4Var.x.isPlaying(), vu4Var.d, vu4Var.e, (SystemClock.uptimeMillis() - this.b) / 1000, str);
        }

        public final void b(String str) {
            this.a.add(a(vu4.this.D.b(), str));
        }
    }

    /* compiled from: AudioRecordComponent.kt */
    public static final class d {
        public final qv4 a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final long f;
        public final String g;

        public d(qv4 qv4Var, boolean z, boolean z2, boolean z3, boolean z4, long j, String str) {
            this.a = qv4Var;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.e = z4;
            this.f = j;
            this.g = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && this.b == dVar.b && this.c == dVar.c && this.d == dVar.d && this.e == dVar.e && this.f == dVar.f && this.g.equals(dVar.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + bh10.a(qoy.b(qoy.b(qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("{state=");
            sb.append(this.a);
            sb.append(",method=");
            sb.append(this.g);
            sb.append(",recording=");
            sb.append(this.b);
            sb.append(",playing=");
            sb.append(this.c);
            sb.append(",created=");
            sb.append(this.d);
            sb.append(",started=");
            sb.append(this.e);
            sb.append(",time=");
            return efz.b(this.f, "}\n", sb);
        }
    }

    /* compiled from: AudioRecordComponent.kt */
    public final class e extends o56 {
        public e() {
        }

        @Override // xsna.o56, xsna.kr4
        public final void a(ir4 ir4Var, bgk0 bgk0Var, ur4 ur4Var) {
            w(ir4Var, ur4Var);
        }

        @Override // xsna.o56, xsna.kr4
        public final void c(ir4 ir4Var, bgk0 bgk0Var, ur4 ur4Var) {
            w(ir4Var, ur4Var);
        }

        @Override // xsna.o56, xsna.kr4
        public final void d(ir4 ir4Var, ur4 ur4Var, Uri uri, Throwable th) {
            edw edwVar = edw.a;
            edw.d(R.string.error, vu4.this.i, true);
            com.vk.metrics.eventtracking.b.a.q(th);
        }

        @Override // xsna.o56, xsna.kr4
        public final void e(ir4 ir4Var, bgk0 bgk0Var, ur4 ur4Var) {
            w(ir4Var, ur4Var);
        }

        @Override // xsna.o56, xsna.kr4
        public final void i(ir4 ir4Var, ur4 ur4Var) {
            w(ir4Var, ur4Var);
        }

        @Override // xsna.o56, xsna.kr4
        public final void m(ir4 ir4Var, ur4 ur4Var, Throwable th) {
            edw edwVar = edw.a;
            edw.d(R.string.error, vu4.this.i, true);
            com.vk.metrics.eventtracking.b.a.q(th);
        }

        @Override // xsna.o56, xsna.kr4
        public final void r(ir4 ir4Var, bgk0 bgk0Var, ur4 ur4Var, float f) {
            av4 av4Var = vu4.this.D;
            if ((av4Var.b() instanceof qv4.b) && Integer.MAX_VALUE == ur4Var.a) {
                qv4 b = av4Var.b();
                if (!(b instanceof qv4.b)) {
                    b = null;
                }
                qv4.b bVar = (qv4.b) b;
                if (bVar != null) {
                    av4Var.a.onNext(qv4.b.b(bVar, f, false, false, 55));
                    return;
                }
                throw new IllegalStateException("expected=" + fpf0.a(qv4.b.class).l() + ", was=" + av4Var.b());
            }
        }

        @Override // xsna.o56, xsna.kr4
        public final void s(ir4 ir4Var, bgk0 bgk0Var, ur4 ur4Var) {
            w(ir4Var, ur4Var);
        }

        public final void w(ir4 ir4Var, ur4 ur4Var) {
            av4 av4Var = vu4.this.D;
            if (av4Var.b() instanceof qv4.b) {
                boolean z = ir4Var.isPlaying() && Integer.MAX_VALUE == ur4Var.a;
                qv4 b = av4Var.b();
                if (!(b instanceof qv4.b)) {
                    b = null;
                }
                qv4.b bVar = (qv4.b) b;
                if (bVar != null) {
                    av4Var.a.onNext(qv4.b.b(bVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z, false, 47));
                    return;
                }
                throw new IllegalStateException("expected=" + fpf0.a(qv4.b.class).l() + ", was=" + av4Var.b());
            }
        }
    }

    /* compiled from: AudioRecordComponent.kt */
    public final class f implements zlv.a {
        public f() {
        }

        @Override // xsna.zlv.a
        public final void a() {
            ViewGroup invoke;
            vu4 vu4Var = vu4.this;
            gzs<ViewGroup> gzsVar = vu4Var.k;
            if (gzsVar != null && (invoke = gzsVar.invoke()) != null) {
                invoke.setVisibility(4);
            }
            vu4Var.l.I();
        }

        @Override // xsna.zlv.a
        public final boolean a0() {
            vu4 vu4Var = vu4.this;
            vu4Var.E.b("handleBackPress");
            av4 av4Var = vu4Var.D;
            if (av4Var.b() instanceof qv4.d) {
                vu4Var.X0();
                return true;
            }
            qv4 b = av4Var.b();
            qv4.b bVar = b instanceof qv4.b ? (qv4.b) b : null;
            if (bVar == null || !bVar.g) {
                av4Var.a();
                return vu4Var.l.a0();
            }
            vu4Var.f1();
            return true;
        }

        @Override // xsna.zlv.a
        public final void b() {
            vu4.this.e1(true, false);
        }

        @Override // xsna.zlv.a
        public final void c() {
            vu4.this.e1(true, true);
        }

        @Override // xsna.zlv.a
        public final void d(boolean z) {
            av4 av4Var = vu4.this.D;
            qv4 b = av4Var.b();
            if (b instanceof qv4.d) {
                av4Var.a.onNext(qv4.d.b((qv4.d) b, null, 0, 0L, z, false, 247));
            }
        }

        @Override // xsna.zlv.a
        public final void e() {
            vu4.this.f1();
        }

        @Override // xsna.zlv.a
        public final void f() {
            vu4.this.e1(false, false);
        }

        @Override // xsna.zlv.a
        public final void g() {
            vu4 vu4Var = vu4.this;
            av4 av4Var = vu4Var.D;
            qv4 b = av4Var.b();
            if (!(b instanceof qv4.d)) {
                b = null;
            }
            qv4.d dVar = (qv4.d) b;
            if (dVar != null) {
                av4Var.a.onNext(qv4.d.b(dVar, null, 0, 0L, false, false, 239));
                vu4Var.l.g();
            } else {
                throw new IllegalStateException("expected=" + fpf0.a(qv4.d.class).l() + ", was=" + av4Var.b());
            }
        }

        @Override // xsna.zlv.a
        public final void h(boolean z) {
            qv4 b;
            vu4 vu4Var = vu4.this;
            av4 av4Var = vu4Var.D;
            io.reactivex.rxjava3.subjects.d<qv4> dVar = av4Var.a;
            qv4 b2 = av4Var.b();
            if (b2 instanceof qv4.d) {
                b = qv4.d.b((qv4.d) b2, null, 0, 0L, false, z, 127);
            } else {
                if (!(b2 instanceof qv4.b)) {
                    throw new IllegalStateException("state=" + b2);
                }
                b = qv4.b.b((qv4.b) b2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, z, 31);
            }
            dVar.onNext(b);
            vu4Var.l.getClass();
        }

        @Override // xsna.zlv.a
        public final void onCancel() {
            vu4.this.X0();
        }

        @Override // xsna.zlv.a
        public final void onDismiss() {
            ViewGroup invoke;
            vu4 vu4Var = vu4.this;
            gzs<ViewGroup> gzsVar = vu4Var.k;
            if (gzsVar != null && (invoke = gzsVar.invoke()) != null) {
                invoke.setVisibility(0);
            }
            vu4Var.l.onDismiss();
            vu4Var.H0();
        }
    }

    /* compiled from: AudioRecordComponent.kt */
    public interface g {
        pv4 a(Context context, f fVar, kkm kkmVar, boolean z, int i, int i2, int i3);
    }

    /* compiled from: Handler.kt */
    public static final class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            vu4.this.b1(false);
        }
    }

    public vu4(Context context, gzs gzsVar, hz30 hz30Var, a aVar, mxv mxvVar, long j, kkm kkmVar, boolean z, int i, int i2, int i3, g gVar) {
        this.i = context;
        this.j = gzsVar;
        this.k = hz30Var;
        this.l = aVar;
        this.m = mxvVar;
        this.n = j;
        this.o = kkmVar;
        this.p = z;
        this.q = i;
        this.r = i2;
        this.s = i3;
        this.t = gVar;
        a1w a1wVar = q1w.a;
        this.w = new uv4((a1wVar == null ? null : a1wVar).r().h.a());
        this.x = mxvVar.m();
        this.y = new f();
        this.z = new e();
        this.B = "";
        this.D = new av4();
        this.E = new c();
    }

    @Override // xsna.j8i
    public final View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        this.E.b("onCreateView");
        pv4 a2 = this.t.a(this.i, this.y, this.o, this.p, this.s, this.r, this.q);
        this.u = a2;
        Context context = a2.a;
        int i = a2.g;
        int i2 = a2.e;
        kkm kkmVar = a2.c;
        byte b2 = 0;
        View inflate = layoutInflater.inflate(R.layout.vkim_audio_recording, viewGroup, false);
        a2.i = inflate;
        inflate.setVisibility(4);
        View view = a2.i;
        if (view == null) {
            view = null;
        }
        a2.k = (WaveFormView) view.findViewById(R.id.vkim_wave);
        View view2 = a2.i;
        if (view2 == null) {
            view2 = null;
        }
        a2.l = (ViewGroup) view2.findViewById(R.id.vkim_wave_container);
        View view3 = a2.i;
        if (view3 == null) {
            view3 = null;
        }
        a2.m = (TextView) view3.findViewById(R.id.vkim_voice_time);
        View view4 = a2.i;
        if (view4 == null) {
            view4 = null;
        }
        a2.n = view4.findViewById(R.id.vkim_audio_send);
        View view5 = a2.i;
        if (view5 == null) {
            view5 = null;
        }
        a2.o = view5.findViewById(R.id.vkim_play_pause);
        View view6 = a2.i;
        if (view6 == null) {
            view6 = null;
        }
        a2.p = (AppCompatImageView) view6.findViewById(R.id.vkim_play_pause_icon);
        View view7 = a2.i;
        if (view7 == null) {
            view7 = null;
        }
        a2.q = (ViewGroup) view7.findViewById(R.id.vkim_cancel_container);
        View view8 = a2.i;
        if (view8 == null) {
            view8 = null;
        }
        a2.r = (TextView) view8.findViewById(R.id.vkim_cancel);
        View view9 = a2.i;
        if (view9 == null) {
            view9 = null;
        }
        a2.s = (ImageView) view9.findViewById(R.id.vkim_cancel_arrow_img);
        View view10 = a2.i;
        if (view10 == null) {
            view10 = null;
        }
        a2.t = (ImageView) view10.findViewById(R.id.vkim_cancel_mic_image);
        View view11 = a2.i;
        if (view11 == null) {
            view11 = null;
        }
        a2.u = view11.findViewById(R.id.vkim_proccessing_progress);
        View view12 = a2.i;
        if (view12 == null) {
            view12 = null;
        }
        a2.v = view12.findViewById(R.id.vkim_voice_record_hold);
        View view13 = a2.i;
        if (view13 == null) {
            view13 = null;
        }
        a2.w = (AppCompatImageView) view13.findViewById(R.id.vkim_hold_arrow);
        View view14 = a2.i;
        if (view14 == null) {
            view14 = null;
        }
        a2.x = (AppCompatImageView) view14.findViewById(R.id.vkim_hold_lock);
        View view15 = a2.i;
        if (view15 == null) {
            view15 = null;
        }
        awt0.h(view15, new ov4(0, a2.b, zlv.a.class, "onBackPressed", "onBackPressed()Z", 0), false);
        View view16 = a2.u;
        if (view16 == null) {
            view16 = null;
        }
        view16.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ImageView imageView = a2.t;
        if (imageView == null) {
            imageView = null;
        }
        bwt0.p0(imageView, false);
        ImageView imageView2 = a2.t;
        if (imageView2 == null) {
            imageView2 = null;
        }
        imageView2.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ImageView imageView3 = a2.t;
        if (imageView3 == null) {
            imageView3 = null;
        }
        kkmVar.e(imageView3, new bv4(b2, b2));
        TextView textView = a2.m;
        if (textView == null) {
            textView = null;
        }
        kkmVar.c(textView, R.attr.vk_legacy_accent);
        WaveFormView waveFormView = a2.k;
        if (waveFormView == null) {
            waveFormView = null;
        }
        waveFormView.setWaveForm(new byte[]{0});
        WaveFormView waveFormView2 = a2.k;
        if (waveFormView2 == null) {
            waveFormView2 = null;
        }
        waveFormView2.setEnabled(false);
        ViewGroup viewGroup2 = a2.q;
        if (viewGroup2 == null) {
            viewGroup2 = null;
        }
        View view17 = a2.u;
        if (view17 == null) {
            view17 = null;
        }
        View findViewById = viewGroup2.findViewById(R.id.vkim_cancel);
        View findViewById2 = viewGroup2.findViewById(R.id.vkim_processing_label);
        if (i2 < e3m.a(R.dimen.vkim_audio_hold_container_height, context) * 0.75f) {
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = 0;
            bVar.i = viewGroup2.getId();
            s3q0 s3q0Var = s3q0.a;
            findViewById.setLayoutParams(bVar);
            ViewGroup.LayoutParams layoutParams2 = findViewById2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
            ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin = 0;
            bVar2.i = viewGroup2.getId();
            findViewById2.setLayoutParams(bVar2);
            ViewGroup.LayoutParams layoutParams3 = view17.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar3 = (ConstraintLayout.b) layoutParams3;
            ((ViewGroup.MarginLayoutParams) bVar3).bottomMargin = 0;
            bVar3.i = viewGroup2.getId();
            view17.setLayoutParams(bVar3);
        } else {
            ViewGroup.LayoutParams layoutParams4 = findViewById.getLayoutParams();
            if (layoutParams4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar4 = (ConstraintLayout.b) layoutParams4;
            ((ViewGroup.MarginLayoutParams) bVar4).bottomMargin = e3m.a(R.dimen.vkim_audio_hold_container_cancel_margin, context);
            bVar4.i = -1;
            s3q0 s3q0Var2 = s3q0.a;
            findViewById.setLayoutParams(bVar4);
            ViewGroup.LayoutParams layoutParams5 = findViewById2.getLayoutParams();
            if (layoutParams5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar5 = (ConstraintLayout.b) layoutParams5;
            ((ViewGroup.MarginLayoutParams) bVar5).bottomMargin = e3m.a(R.dimen.vkim_audio_hold_container_cancel_margin, context);
            bVar5.i = -1;
            findViewById2.setLayoutParams(bVar5);
            ViewGroup.LayoutParams layoutParams6 = view17.getLayoutParams();
            if (layoutParams6 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar6 = (ConstraintLayout.b) layoutParams6;
            ((ViewGroup.MarginLayoutParams) bVar6).bottomMargin = e3m.a(R.dimen.vkim_audio_hold_container_cancel_margin, context);
            bVar6.i = -1;
            view17.setLayoutParams(bVar6);
        }
        ViewGroup viewGroup3 = a2.q;
        if (viewGroup3 == null) {
            viewGroup3 = null;
        }
        viewGroup3.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ViewGroup viewGroup4 = a2.q;
        if (viewGroup4 == null) {
            viewGroup4 = null;
        }
        ViewGroup.LayoutParams layoutParams7 = viewGroup4.getLayoutParams();
        if (layoutParams7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams7.height = i2;
        viewGroup4.setLayoutParams(layoutParams7);
        ViewGroup viewGroup5 = a2.q;
        if (viewGroup5 == null) {
            viewGroup5 = null;
        }
        viewGroup5.setBackground(new ColorDrawable(a2.f));
        TextView textView2 = a2.r;
        if (textView2 == null) {
            textView2 = null;
        }
        int i3 = 5;
        jjc.g(textView2, new ha(a2, i3));
        TextView textView3 = a2.r;
        if (textView3 == null) {
            textView3 = null;
        }
        textView3.setTextColor(i);
        ImageView imageView4 = a2.s;
        if (imageView4 == null) {
            imageView4 = null;
        }
        jjc.g(imageView4, new i50(a2, i3));
        ImageView imageView5 = a2.s;
        if (imageView5 == null) {
            imageView5 = null;
        }
        imageView5.setColorFilter(i);
        View view18 = a2.n;
        if (view18 == null) {
            view18 = null;
        }
        int i4 = 7;
        jjc.g(view18, new yx0(a2, i4));
        View view19 = a2.n;
        if (view19 == null) {
            view19 = null;
        }
        int i5 = 6;
        bwt0.k0(view19, new d7(a2, i5));
        View view20 = a2.o;
        if (view20 == null) {
            view20 = null;
        }
        jjc.g(view20, new vs(a2, i4));
        ViewGroup viewGroup6 = a2.l;
        if (viewGroup6 == null) {
            viewGroup6 = null;
        }
        viewGroup6.setOnTouchListener(new ev4(a2, 0));
        View view21 = a2.i;
        if (view21 == null) {
            view21 = null;
        }
        qu4 qu4Var = new qu4(view21);
        boolean z = a2.d;
        qu4Var.u = z;
        qu4Var.c.setBackground(z ? null : qu4Var.r);
        bwt0.p0(qu4Var.k, !z);
        a2.j = qu4Var;
        View view22 = a2.i;
        View view23 = view22 != null ? view22 : null;
        this.j.invoke().addView(view23);
        io.reactivex.rxjava3.internal.operators.observable.y yVar = new io.reactivex.rxjava3.internal.operators.observable.y(this.D.a.a0(asu0.a.d()), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
        defpackage.z zVar = new defpackage.z(new com.vk.movika.sdk.base.data.a(this, i4), i5);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        I0(yVar.E(zVar, lVar, kVar, kVar).subscribe(new f40(new e1(this, i4), 2), new bw(new v5(this, 10), i5)));
        this.x.v(this.z);
        return view23;
    }

    @Override // xsna.j8i
    public final void N0() {
        View a2;
        this.E.b("onDestroyView");
        ir4 ir4Var = this.x;
        ur4 b2 = ir4Var.b();
        if (b2 != null && Integer.MAX_VALUE == b2.a) {
            ir4Var.E(jw5.h);
        }
        ir4Var.y(this.z);
        zlv zlvVar = this.u;
        if (zlvVar != null && (a2 = zlvVar.a()) != null) {
            this.j.invoke().removeView(a2);
        }
        this.u = null;
        MotionEvent motionEvent = this.F;
        if (motionEvent != null) {
            motionEvent.recycle();
            this.F = null;
        }
    }

    @Override // xsna.j8i
    public final void Q0() {
        this.E.b("onStartView");
    }

    @Override // xsna.j8i
    public final void R0() {
        this.E.b("onStopView");
        ir4 ir4Var = this.x;
        ur4 b2 = ir4Var.b();
        if (b2 != null && Integer.MAX_VALUE == b2.a) {
            ir4Var.q(jw5.h);
        }
        this.v.removeCallbacksAndMessages(null);
        if (this.D.b() instanceof qv4.d) {
            e1(false, false);
        }
    }

    public final void X0() {
        c cVar = this.E;
        cVar.b("cancelRecording");
        this.l.h1();
        av4 av4Var = this.D;
        qv4 b2 = av4Var.b();
        qv4.d dVar = b2 instanceof qv4.d ? (qv4.d) b2 : null;
        if (dVar == null || !dVar.h) {
            if (!(av4Var.b() instanceof qv4.d)) {
                av4Var.a();
                return;
            }
            qv4 b3 = av4Var.b();
            qv4.d dVar2 = (qv4.d) (b3 instanceof qv4.d ? b3 : null);
            if (dVar2 != null) {
                av4Var.a.onNext(qv4.d.b(dVar2, null, 0, 0L, false, false, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE));
                this.w.a(cVar.a.toString());
            } else {
                throw new IllegalStateException("expected=" + fpf0.a(qv4.d.class).l() + ", was=" + av4Var.b());
            }
        }
    }

    public final void Y0() {
        if (this.d) {
            return;
        }
        D0(this.i, this.j.invoke(), null, null);
        MotionEvent motionEvent = this.F;
        if (motionEvent != null) {
            this.u.d(motionEvent);
        }
        MotionEvent motionEvent2 = this.F;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
            this.F = null;
        }
    }

    public final void Z0(Throwable th) {
        this.E.b("releaseOnError");
        edw edwVar = edw.a;
        edw.d(R.string.error, this.i, true);
        this.D.a();
        com.vk.metrics.eventtracking.b.a.q(th);
        uv4 uv4Var = this.w;
        if (uv4Var.c()) {
            uv4Var.a(null);
        }
    }

    public final void a1(AttachAudioMsg attachAudioMsg, boolean z) {
        this.E.b("sendAttachAudioMsg");
        this.x.q(jw5.h);
        a aVar = this.l;
        if (z) {
            aVar.s2(attachAudioMsg, new qc(this, 2));
        } else {
            aVar.i1(attachAudioMsg);
            this.D.a();
        }
    }

    public final void b1(boolean z) {
        this.E.b("startRecording");
        Y0();
        View view = this.g;
        if (view != null) {
            view.setKeepScreenOn(true);
        }
        this.A = SystemClock.uptimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append(this.n);
        sb.append('-');
        sb.append(this.A);
        this.B = sb.toString();
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.C = bVar;
        String str = this.B;
        uv4 uv4Var = this.w;
        bVar.b(new io.reactivex.rxjava3.internal.operators.observable.a0(new io.reactivex.rxjava3.internal.operators.observable.c0(uv4Var.d(str, true), new pm1(new ru4(this, z, 0), 3), io.reactivex.rxjava3.internal.functions.a.c), new uu4(this, 0)).subscribe(new cp0(new p40(this, 5), 2), new is1(new s9(this, 6), 2)));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        io.reactivex.rxjava3.subjects.f<Integer> fVar = new io.reactivex.rxjava3.subjects.f<>();
        uv4Var.b = fVar;
        rv4 rv4Var = new rv4((byte) 0, 0);
        Ref$LongRef ref$LongRef = new Ref$LongRef();
        Ref$DoubleRef ref$DoubleRef = new Ref$DoubleRef();
        Ref$DoubleRef ref$DoubleRef2 = new Ref$DoubleRef();
        bVar.b(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, new vtg0(new brf(ref$DoubleRef, rv4Var, ref$LongRef, ref$DoubleRef2), 0)).U(new oe40(new gqe0(ref$DoubleRef2, 1), 7)).U(new k7(new tb4(1), 2)).subscribe(new js1(new t9(this, 6), 3), new ew(new ix2(this, 4), 1)));
    }

    public final boolean c1(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return d1(motionEvent);
        }
        bpn0 bpn0Var = enj.a;
        final Activity h2 = e3m.h(this.i);
        PermissionHelper.a.getClass();
        final String[] strArr = PermissionHelper.n;
        if (PermissionHelper.p(h2, strArr) == PermissionHelper.PermissionResult.ALLOWED) {
            return d1(motionEvent);
        }
        int i = h7u0.p;
        h7u0.a aVar = new h7u0.a(h2, 0, new j7u0.e(strArr), 2);
        aVar.U(R.string.vkim_permissions_microphone);
        aVar.c0(R.string.ok, new DialogInterface.OnClickListener() { // from class: xsna.su4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                h90.i(h2, strArr, 228);
            }
        });
        aVar.W(R.string.cancel, new tu4());
        aVar.m();
        return false;
    }

    public final boolean d1(MotionEvent motionEvent) {
        zlv zlvVar = this.u;
        if (zlvVar != null) {
            zlvVar.d(motionEvent);
        } else if (motionEvent.getAction() == 0) {
            this.F = MotionEvent.obtain(motionEvent);
        }
        int action = motionEvent.getAction();
        Handler handler = this.v;
        if (action == 0) {
            handler.postDelayed(new h(), 200L);
            return true;
        }
        if (action != 1 && action != 3) {
            return false;
        }
        MotionEvent motionEvent2 = this.F;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
            this.F = null;
        }
        handler.removeCallbacksAndMessages(null);
        return true;
    }

    public final void e1(boolean z, boolean z2) {
        c cVar = this.E;
        cVar.b("stopRecordingAndSend");
        av4 av4Var = this.D;
        qv4 b2 = av4Var.b();
        qv4.d dVar = b2 instanceof qv4.d ? (qv4.d) b2 : null;
        if (dVar == null || !dVar.h) {
            if (av4Var.b() instanceof qv4.d) {
                qv4 b3 = av4Var.b();
                qv4.d dVar2 = b3 instanceof qv4.d ? (qv4.d) b3 : null;
                this.w.e(cVar.a.toString(), (dVar2 == null || dVar2.g) ? false : true, z, z2);
            } else if (av4Var.b() instanceof qv4.b) {
                qv4 b4 = av4Var.b();
                qv4.b bVar = b4 instanceof qv4.b ? (qv4.b) b4 : null;
                wu4 wu4Var = bVar != null ? new wu4(bVar.c, bVar.d, bVar.e) : null;
                AttachAudioMsg attachAudioMsg = new AttachAudioMsg();
                attachAudioMsg.j = wu4Var.a.toString();
                attachAudioMsg.C0((int) wu4Var.c);
                attachAudioMsg.g = wu4Var.b;
                a1(attachAudioMsg, z2);
            }
        }
    }

    public final void f1() {
        this.E.b("togglePlayPause");
        av4 av4Var = this.D;
        qv4 b2 = av4Var.b();
        qv4.b bVar = b2 instanceof qv4.b ? (qv4.b) b2 : null;
        wu4 wu4Var = bVar != null ? new wu4(bVar.c, bVar.d, bVar.e) : null;
        qv4 b3 = av4Var.b();
        qv4.b bVar2 = b3 instanceof qv4.b ? (qv4.b) b3 : null;
        lza0 lza0Var = jw5.h;
        ir4 ir4Var = this.x;
        if (bVar2 != null && bVar2.g) {
            ir4Var.q(lza0Var);
            return;
        }
        if (wu4Var != null) {
            long j = Integer.MAX_VALUE;
            int i = (int) wu4Var.c;
            Context context = e43.a;
            ur4 ur4Var = new ur4(Integer.MAX_VALUE, 0L, j, 0L, 0, (context != null ? context : null).getString(R.string.vkim_msg_audiomsg_single), i, Collections.singletonList(wu4Var.a));
            ir4Var.r(lza0Var, Collections.singletonList(ur4Var));
            ir4Var.C(lza0Var, ur4Var);
            ir4Var.p(lza0Var);
        }
    }

    /* compiled from: AudioRecordComponent.kt */
    public interface a {
        default boolean a0() {
            return false;
        }

        default void I() {
        }

        default void Z() {
        }

        default void g() {
        }

        default void h1() {
        }

        default void onDismiss() {
        }

        default void p0() {
        }

        default void i1(AttachAudioMsg attachAudioMsg) {
        }

        default void r1(AttachAudioMsg attachAudioMsg) {
        }

        default void s2(AttachAudioMsg attachAudioMsg, qc qcVar) {
        }
    }
}
