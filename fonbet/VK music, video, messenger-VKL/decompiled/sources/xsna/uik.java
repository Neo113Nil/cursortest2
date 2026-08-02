package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.features.crop.models.params.CropAspectRatioFormat;
import com.vk.photo.editor.features.crop.models.stat.CropStatEvent;
import java.util.ArrayList;
import kotlin.jvm.internal.Ref$FloatRef;
import xsna.hfk;
import xsna.uik;

/* compiled from: Cropper.kt */
/* loaded from: classes4.dex */
public final class uik {
    public final kik a;
    public final efk b;
    public final yhk c;
    public final c5p d;
    public final hfk e;
    public sot f;
    public AnimatorSet g;
    public ValueAnimator h;
    public final zik i;
    public sf2 j;
    public CropAspectRatioFormat k = CropAspectRatioFormat.CropFree;
    public boolean l;
    public boolean m;
    public boolean n;
    public jfk o;
    public final c p;
    public final b q;

    /* compiled from: Cropper.kt */
    public static final class a extends AnimatorListenerAdapter {
        public final /* synthetic */ gzs<s3q0> c;

        public a(gzs<s3q0> gzsVar) {
            this.c = gzsVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            uik uikVar = uik.this;
            jfk jfkVar = uikVar.o;
            if (jfkVar != null) {
                jfkVar.h(true, this.c);
            }
            uikVar.e(true, true, true, true);
            uikVar.g = null;
        }
    }

    /* compiled from: Cropper.kt */
    public static final class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message.what == 0) {
                uik uikVar = uik.this;
                hfk hfkVar = uikVar.e;
                uikVar.b(hfkVar.a(hfkVar.getCropAspectRatio()), new o6(11));
            }
        }
    }

    /* compiled from: Cropper.kt */
    public static final class c implements hfk.a {
        public c() {
        }

        @Override // xsna.hfk.a
        public final void a(boolean z) {
            uik uikVar = uik.this;
            uikVar.q.removeMessages(0);
            jfk jfkVar = uikVar.o;
            if (jfkVar != null) {
                jfkVar.h(false, new se0(17));
            }
            uikVar.e(false, false, true, false);
            sf2 sf2Var = uikVar.j;
            if (sf2Var != null) {
                ((gik) sf2Var.b).L(true);
            }
            if (z) {
                return;
            }
            uikVar.d.b(CropStatEvent.d.a);
        }

        @Override // xsna.hfk.a
        public final void b() {
            uik uikVar = uik.this;
            uikVar.e(true, true, true, true);
            b bVar = uikVar.q;
            bVar.removeMessages(0);
            bVar.sendMessage(Message.obtain(bVar, 0));
        }

        @Override // xsna.hfk.a
        public final void d(final float f, final boolean z) {
            ValueAnimator valueAnimator;
            final uik uikVar = uik.this;
            gzs gzsVar = new gzs() { // from class: xsna.sik
                @Override // xsna.gzs
                public final Object invoke() {
                    uik uikVar2 = uik.this;
                    uik.b bVar = uikVar2.q;
                    jfk jfkVar = uikVar2.o;
                    if (jfkVar != null) {
                        tnt tntVar = jfkVar.j;
                        hfk hfkVar = jfkVar.c;
                        if (z) {
                            jfkVar.d.b(CropStatEvent.b.a);
                        }
                        float f2 = tntVar.h;
                        float d = jfk.d(jfkVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
                        float f3 = tntVar.g;
                        float f4 = f;
                        float f5 = f4 - f2;
                        tntVar.o.postRotate(f5, hfkVar.getCenterX(), hfkVar.getCenterY());
                        tntVar.h += f5;
                        float d2 = jfk.d(jfkVar, f4, 2);
                        float f6 = tntVar.g;
                        if (d2 > f6 || d == f3) {
                            tntVar.a(d2 / f6, hfkVar.getCenterX(), hfkVar.getCenterY());
                        }
                        jfkVar.h(false, new se0(17));
                    }
                    if (bVar.hasMessages(0)) {
                        bVar.removeMessages(0);
                        bVar.sendMessage(Message.obtain(bVar, 0));
                    }
                    sf2 sf2Var = uikVar2.j;
                    if (sf2Var != null) {
                        ((gik) sf2Var.b).L(true);
                    }
                    return s3q0.a;
                }
            };
            if (!uikVar.m || (valueAnimator = uikVar.h) == null) {
                gzsVar.invoke();
            } else {
                we2.a(valueAnimator, gzsVar);
            }
        }
    }

    public uik(kik kikVar, efk efkVar, yhk yhkVar, c5p c5pVar) {
        this.a = kikVar;
        this.b = efkVar;
        this.c = yhkVar;
        this.d = c5pVar;
        this.e = yhkVar.getOverlay$android_release();
        this.i = new zik(yhkVar, efkVar, hfk.V, hfk.W);
        fyt0.b(kikVar, new l2k(this, 1));
        this.p = new c();
        this.q = new b(Looper.getMainLooper());
    }

    public final void a() {
        AnimatorSet animatorSet = this.g;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        AnimatorSet animatorSet2 = this.g;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.q.removeMessages(0);
        jfk jfkVar = this.o;
        if (jfkVar != null) {
            jfkVar.e();
        }
        jfk jfkVar2 = this.o;
        if (jfkVar2 != null) {
            jfkVar2.h(false, new qzg(this, 6));
        }
    }

    public final void b(RectF rectF, gzs<s3q0> gzsVar) {
        int i;
        e(false, false, false, false);
        AnimatorSet animatorSet = this.g;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.g = animatorSet2;
        animatorSet2.addListener(new a(gzsVar));
        float width = rectF.width();
        hfk hfkVar = this.e;
        final float max = Math.max(width / hfkVar.getCropWidth(), rectF.height() / hfkVar.getCropHeight());
        final float centerX = rectF.centerX() - hfkVar.getCenterX();
        final float centerY = rectF.centerY() - hfkVar.getCenterY();
        if (centerY == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && centerX == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && max == 1.0f && rectF.equals(hfkVar.getCropRect())) {
            this.g = null;
            jfk jfkVar = this.o;
            if (jfkVar != null) {
                jfkVar.h(true, gzsVar);
            }
            e(true, true, true, true);
            return;
        }
        final jfk jfkVar2 = this.o;
        final float centerX2 = hfkVar.getCenterX();
        final float centerY2 = hfkVar.getCenterY();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        if (jfkVar2 == null) {
            i = 1;
        } else {
            final float f = max * jfkVar2.j.g;
            final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
            ref$FloatRef.element = 1.0f;
            final Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
            final Ref$FloatRef ref$FloatRef3 = new Ref$FloatRef();
            i = 1;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.qm2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    float f2 = 1;
                    float b2 = u11.b(max, f2, floatValue, f2);
                    Ref$FloatRef ref$FloatRef4 = ref$FloatRef;
                    float f3 = ref$FloatRef4.element;
                    float f4 = b2 / f3;
                    ref$FloatRef4.element = f3 * f4;
                    jfk jfkVar3 = jfkVar2;
                    jfkVar3.j.a(f4, centerX2, centerY2);
                    float f5 = centerX * floatValue;
                    float f6 = floatValue * centerY;
                    Ref$FloatRef ref$FloatRef5 = ref$FloatRef2;
                    float f7 = f5 - ref$FloatRef5.element;
                    Ref$FloatRef ref$FloatRef6 = ref$FloatRef3;
                    float f8 = f6 - ref$FloatRef6.element;
                    tnt tntVar = jfkVar3.j;
                    float f9 = tntVar.g;
                    float f10 = f;
                    tntVar.c((f7 * f9) / f10, (f8 * f9) / f10);
                    ref$FloatRef5.element = f5;
                    ref$FloatRef6.element = f6;
                    jfkVar3.i();
                }
            });
        }
        AnimatorSet animatorSet3 = this.g;
        if (animatorSet3 != null) {
            ye2 ye2Var = h7e0.a;
            int i2 = 19;
            xe2 xe2Var = new xe2("x0", new pqz(i2), hfkVar, z6e0.b);
            float[] fArr = new float[i];
            fArr[0] = rectF.left;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(hfkVar, xe2Var, fArr);
            ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
            xe2 xe2Var2 = new xe2("y0", new k990(12), hfkVar, d7e0.b);
            float[] fArr2 = new float[i];
            fArr2[0] = rectF.top;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(hfkVar, xe2Var2, fArr2);
            ofFloat3.setInterpolator(new AccelerateDecelerateInterpolator());
            xe2 xe2Var3 = new xe2("x1", new ulz(i2), hfkVar, b7e0.b);
            float[] fArr3 = new float[i];
            fArr3[0] = rectF.right;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(hfkVar, xe2Var3, fArr3);
            ofFloat4.setInterpolator(new AccelerateDecelerateInterpolator());
            xe2 xe2Var4 = new xe2("y1", new rvq(23), hfkVar, f7e0.b);
            float[] fArr4 = new float[i];
            fArr4[0] = rectF.bottom;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(hfkVar, xe2Var4, fArr4);
            ofFloat5.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            Animator[] animatorArr = new Animator[5];
            animatorArr[0] = ofFloat2;
            animatorArr[i] = ofFloat3;
            animatorArr[2] = ofFloat4;
            animatorArr[3] = ofFloat5;
            animatorArr[4] = ofFloat;
            animatorSet3.playTogether(animatorArr);
        }
        AnimatorSet animatorSet4 = this.g;
        if (animatorSet4 != null) {
            animatorSet4.start();
        }
    }

    public final void c(boolean z, gzs<s3q0> gzsVar) {
        if (z == this.l) {
            return;
        }
        this.l = z;
        this.q.removeMessages(0);
        hfk hfkVar = this.e;
        zik zikVar = this.i;
        if (z) {
            e(true, true, true, true);
            gzsVar.invoke();
            zikVar.getClass();
            l3p.a("cropperPaddings", new s6(zikVar, 29));
        } else {
            zikVar.getClass();
            l3p.a("cropperPaddings", new wik(zikVar, 0));
            e(false, false, false, false);
            b(hfkVar.a(hfkVar.getCropAspectRatio()), new com.vk.movika.sdk.base.ui.p(6, this, gzsVar));
        }
        this.b.setCropping(z);
        this.c.setTouchesEnabled$android_release(z);
        hfkVar.setCropping(z);
    }

    public final void d(boolean z) {
        c290 c290Var;
        AnimatorSet animatorSet;
        hfk hfkVar = this.e;
        if (!hfkVar.H || (c290Var = hfkVar.K) == null) {
            return;
        }
        hfk hfkVar2 = c290Var.a;
        if (c290Var.b) {
            AnimatorSet animatorSet2 = c290Var.e;
            if (animatorSet2 != null) {
                if (z == c290Var.f) {
                    return;
                }
                animatorSet2.cancel();
                c290Var.e = null;
            }
            AnimatorSet animatorSet3 = c290Var.g;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
                c290Var.g = null;
            }
            AnimatorSet animatorSet4 = c290Var.i;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
                c290Var.i = null;
            }
            c290Var.f = z;
            c290Var.e = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            ObjectAnimator a2 = c290.a(hfkVar2, true, z);
            if (a2 != null) {
                arrayList.add(a2);
            }
            arrayList.add(c290.e(hfkVar2, false));
            AnimatorSet animatorSet5 = c290Var.e;
            if (animatorSet5 != null) {
                animatorSet5.playTogether(arrayList);
            }
            if (!z && (animatorSet = c290Var.e) != null) {
                animatorSet.setStartDelay(800L);
            }
            AnimatorSet animatorSet6 = c290Var.e;
            if (animatorSet6 != null) {
                c290.d(animatorSet6, z, new su80(c290Var, 1));
            }
        }
    }

    public final void e(boolean z, boolean z2, boolean z3, boolean z4) {
        sf2 sf2Var = this.j;
        if (sf2Var != null && z) {
            boolean z5 = this.l;
        }
        if (sf2Var != null && z4) {
            boolean z6 = this.l;
        }
        sot sotVar = this.f;
        boolean z7 = false;
        if (sotVar != null) {
            sotVar.g = z2 && this.l;
        }
        if (z3 && this.l) {
            z7 = true;
        }
        this.e.setTouchEnabled(z7);
    }
}
