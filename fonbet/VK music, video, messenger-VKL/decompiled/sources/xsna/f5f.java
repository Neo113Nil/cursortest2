package xsna;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.stikers.ClipsStickersView;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.Pair;

/* compiled from: ClipsStickersAnimatedDrawer.kt */
/* loaded from: classes5.dex */
public final class f5f extends g5f {
    public final utx0 B;
    public final utx0 C;
    public final utx0 D;
    public final utx0 E;
    public final xtx0 F;
    public final r7z G;
    public final RectF H;

    public f5f(ClipsStickersView clipsStickersView, cng0 cng0Var) {
        super(clipsStickersView, cng0Var);
        this.y = new vn00(y8g0.b(R.dimen.guidelines_clips_default_bot_space), y8g0.b(R.dimen.guidelines_clips_left_space), y8g0.b(R.dimen.guidelines_clips_top_space), y8g0.b(R.dimen.guidelines_clips_right_space));
        Paint paint = new Paint();
        paint.setColor(e43.a.getColor(R.color.story_editor_line));
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(30);
        Paint paint2 = new Paint();
        paint2.setColor(e43.a.getColor(R.color.vk_white));
        paint2.setStrokeWidth(iah0.b(1.5f));
        clipsStickersView.getContext();
        this.B = new utx0();
        this.C = new utx0();
        this.D = new utx0();
        this.E = new utx0();
        this.F = new xtx0();
        this.G = r7z.e;
        this.H = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public static ValueAnimator z(int i, int i2, long j) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration(j);
        return ofInt;
    }

    @Override // xsna.zh
    public final void i(Canvas canvas) {
        xtx0 xtx0Var = this.F;
        Pair<Boolean, Boolean> pair = new Pair<>(Boolean.valueOf(xtx0Var.a.a), Boolean.valueOf(xtx0Var.a()));
        uru uruVar = xtx0Var.b;
        ypa ypaVar = this.g;
        List l = e43.l(ypaVar.a, ypaVar.b);
        x(pair, uruVar, new a5f(l, canvas, uruVar, 0), new xm6(uruVar, this, pair), new z4f(xtx0Var, 0));
        Pair<Boolean, Boolean> pair2 = new Pair<>(Boolean.valueOf(xtx0Var.a.b), Boolean.valueOf(xtx0Var.d()));
        uru uruVar2 = xtx0Var.c;
        List l2 = e43.l(ypaVar.c, ypaVar.d);
        x(pair2, uruVar2, new a5f(l2, canvas, uruVar2, 0), new xm6(uruVar2, this, pair2), new com.vk.movika.sdk.android.defaultplayer.interactive.a(xtx0Var, 24));
    }

    @Override // xsna.zh
    public final emv k() {
        return this.C;
    }

    @Override // xsna.zh
    public final hmv l() {
        return this.F;
    }

    @Override // xsna.zh
    public final emv m() {
        return this.D;
    }

    @Override // xsna.zh
    public final emv n() {
        return this.E;
    }

    @Override // xsna.zh
    public final emv o() {
        return this.B;
    }

    public final void x(Pair<Boolean, Boolean> pair, uru uruVar, gzs<s3q0> gzsVar, gzs<? extends ValueAnimator> gzsVar2, gzs<s3q0> gzsVar3) {
        ValueAnimator valueAnimator;
        boolean booleanValue = pair.d().booleanValue();
        boolean booleanValue2 = pair.g().booleanValue();
        if (booleanValue == booleanValue2) {
            if (booleanValue2 || ((valueAnimator = uruVar.b) != null && valueAnimator.isRunning())) {
                gzsVar.invoke();
                return;
            }
            return;
        }
        Paint paint = uruVar.a;
        ValueAnimator valueAnimator2 = uruVar.b;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            valueAnimator2.cancel();
        }
        ValueAnimator invoke = gzsVar2.invoke();
        invoke.addUpdateListener(new com.vk.movika.sdk.android.defaultplayer.control.r(1, paint, this));
        invoke.addListener(new e5f(this, uruVar));
        uruVar.b = invoke;
        invoke.start();
        gzsVar3.invoke();
    }

    public final void y(final Canvas canvas, final utx0 utx0Var, r7z r7zVar, final RectF rectF) {
        Boolean valueOf = Boolean.valueOf(utx0Var.a.c);
        ttx0 ttx0Var = utx0Var.g;
        qcy<?>[] qcyVarArr = utx0.h;
        Boolean value = ttx0Var.getValue(utx0Var, qcyVarArr[2]);
        value.getClass();
        x(new Pair<>(valueOf, value), utx0Var.d, new gzs() { // from class: xsna.b5f
            @Override // xsna.gzs
            public final Object invoke() {
                Paint paint = utx0Var.d.a;
                f5f.this.getClass();
                canvas.drawRect(rectF, paint);
                return s3q0.a;
            }
        }, new f5(this, utx0Var), new g5(utx0Var, 22));
        w98 w98Var = utx0Var.a;
        x(new Pair<>(Boolean.valueOf(w98Var.b), Boolean.valueOf(utx0Var.d())), utx0Var.c, new s2b(this, canvas, r7zVar, utx0Var), new j70(this, utx0Var), new c5f(utx0Var, 0));
        Boolean valueOf2 = Boolean.valueOf(w98Var.a);
        Boolean value2 = utx0Var.e.getValue(utx0Var, qcyVarArr[0]);
        value2.getClass();
        x(new Pair<>(valueOf2, value2), utx0Var.b, new d5f(this, canvas, r7zVar, utx0Var), new ic(this, utx0Var), new defpackage.h(utx0Var, 25));
    }
}
