package xsna;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.PathMotion;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$attr;
import com.google.android.material.R$id;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: MaterialContainerTransform.java */
/* loaded from: classes13.dex */
public final class em10 extends Transition {
    public static final String[] m = {"materialContainerTransition:bounds", "materialContainerTransition:shapeAppearance"};
    public static final d n = new d(new c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.25f), new c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f), new c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f), new c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.75f));
    public static final d o = new d(new c(0.6f, 0.9f), new c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f), new c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.9f), new c(0.3f, 0.9f));
    public static final d p = new d(new c(0.1f, 0.4f), new c(0.1f, 1.0f), new c(0.1f, 1.0f), new c(0.1f, 0.9f));
    public static final d q = new d(new c(0.6f, 0.9f), new c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.9f), new c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.9f), new c(0.2f, 0.9f));

    @Nullable
    public com.google.android.material.shape.a h;

    @Nullable
    public com.google.android.material.shape.a i;
    public boolean b = false;
    public boolean c = false;
    public final int d = R.id.content;
    public final int e = -1;
    public final int f = -1;
    public final int g = 1375731712;
    public final boolean j = true;
    public final float k = -1.0f;
    public final float l = -1.0f;

    /* compiled from: MaterialContainerTransform.java */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ e b;

        public a(e eVar) {
            this.b = eVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            e eVar = this.b;
            if (eVar.I != animatedFraction) {
                eVar.d(animatedFraction);
            }
        }
    }

    /* compiled from: MaterialContainerTransform.java */
    public class b extends wmp0 {
        public final /* synthetic */ View a;
        public final /* synthetic */ e b;
        public final /* synthetic */ View c;
        public final /* synthetic */ View d;

        public b(View view, e eVar, View view2, View view3) {
            this.a = view;
            this.b = eVar;
            this.c = view2;
            this.d = view3;
        }

        @Override // xsna.wmp0, android.transition.Transition.TransitionListener
        public final void onTransitionEnd(@NonNull Transition transition) {
            em10 em10Var = em10.this;
            em10Var.removeListener(this);
            if (em10Var.b) {
                return;
            }
            this.c.setAlpha(1.0f);
            this.d.setAlpha(1.0f);
            this.a.getOverlay().remove(this.b);
        }

        @Override // xsna.wmp0, android.transition.Transition.TransitionListener
        public final void onTransitionStart(@NonNull Transition transition) {
            this.a.getOverlay().add(this.b);
            this.c.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.d.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    /* compiled from: MaterialContainerTransform.java */
    public static class c {
        public final float a;
        public final float b;

        public c(float f, float f2) {
            this.a = f;
            this.b = f2;
        }
    }

    /* compiled from: MaterialContainerTransform.java */
    public static class d {

        @NonNull
        public final c a;

        @NonNull
        public final c b;

        @NonNull
        public final c c;

        @NonNull
        public final c d;

        public d(c cVar, c cVar2, c cVar3, c cVar4) {
            this.a = cVar;
            this.b = cVar2;
            this.c = cVar3;
            this.d = cVar4;
        }
    }

    /* compiled from: MaterialContainerTransform.java */
    public static final class e extends Drawable {
        public final d A;
        public final uiq B;
        public final imr C;
        public wiq D;
        public kmr E;
        public RectF F;
        public float G;
        public float H;
        public float I;
        public final View a;
        public final RectF b;
        public final com.google.android.material.shape.a c;
        public final float d;
        public final View e;
        public final RectF f;
        public final com.google.android.material.shape.a g;
        public final float h;
        public final Paint i;
        public final Paint j;
        public final Paint k;
        public final Paint l;
        public final Paint m;
        public final pg10 n;
        public final PathMeasure o;
        public final float p;
        public final float[] q;
        public final boolean r;
        public final float s;
        public final float t;
        public final boolean u;
        public final MaterialShapeDrawable v;
        public final RectF w;
        public final RectF x;
        public final RectF y;
        public final RectF z;

        public e(PathMotion pathMotion, View view, RectF rectF, com.google.android.material.shape.a aVar, float f, View view2, RectF rectF2, com.google.android.material.shape.a aVar2, float f2, int i, boolean z, boolean z2, uiq uiqVar, imr imrVar, d dVar) {
            Paint paint = new Paint();
            this.i = paint;
            Paint paint2 = new Paint();
            this.j = paint2;
            Paint paint3 = new Paint();
            this.k = paint3;
            this.l = new Paint();
            Paint paint4 = new Paint();
            this.m = paint4;
            this.n = new pg10();
            this.q = new float[]{rectF.centerX(), rectF.top};
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            this.v = materialShapeDrawable;
            Paint paint5 = new Paint();
            new Path();
            this.a = view;
            this.b = rectF;
            this.c = aVar;
            this.d = f;
            this.e = view2;
            this.f = rectF2;
            this.g = aVar2;
            this.h = f2;
            this.r = z;
            this.u = z2;
            this.B = uiqVar;
            this.C = imrVar;
            this.A = dVar;
            WindowManager windowManager = (WindowManager) view.getContext().getSystemService("window");
            windowManager.getDefaultDisplay().getMetrics(new DisplayMetrics());
            this.s = r9.widthPixels;
            this.t = r9.heightPixels;
            paint.setColor(0);
            paint2.setColor(0);
            paint3.setColor(0);
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(0));
            materialShapeDrawable.setShadowCompatibilityMode(2);
            materialShapeDrawable.setShadowBitmapDrawingEnable(false);
            materialShapeDrawable.setShadowColor(-7829368);
            RectF rectF3 = new RectF(rectF);
            this.w = rectF3;
            this.x = new RectF(rectF3);
            RectF rectF4 = new RectF(rectF3);
            this.y = rectF4;
            this.z = new RectF(rectF4);
            PointF pointF = new PointF(rectF.centerX(), rectF.top);
            PointF pointF2 = new PointF(rectF2.centerX(), rectF2.top);
            PathMeasure pathMeasure = new PathMeasure(pathMotion.getPath(pointF.x, pointF.y, pointF2.x, pointF2.y), false);
            this.o = pathMeasure;
            this.p = pathMeasure.getLength();
            paint4.setStyle(Paint.Style.FILL);
            RectF rectF5 = fnp0.a;
            paint4.setShader(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, i, Shader.TileMode.CLAMP));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }

        public final void a(Canvas canvas) {
            c(canvas, this.k);
            Rect bounds = getBounds();
            RectF rectF = this.y;
            float f = rectF.left;
            float f2 = rectF.top;
            float f3 = this.E.b;
            int i = this.D.b;
            if (i <= 0) {
                return;
            }
            int save = canvas.save();
            canvas.translate(f, f2);
            canvas.scale(f3, f3);
            if (i < 255) {
                RectF rectF2 = fnp0.a;
                rectF2.set(bounds);
                canvas.saveLayerAlpha(rectF2, i);
            }
            this.e.draw(canvas);
            canvas.restoreToCount(save);
        }

        public final void b(Canvas canvas) {
            c(canvas, this.j);
            Rect bounds = getBounds();
            RectF rectF = this.w;
            float f = rectF.left;
            float f2 = rectF.top;
            float f3 = this.E.a;
            int i = this.D.a;
            if (i <= 0) {
                return;
            }
            int save = canvas.save();
            canvas.translate(f, f2);
            canvas.scale(f3, f3);
            if (i < 255) {
                RectF rectF2 = fnp0.a;
                rectF2.set(bounds);
                canvas.saveLayerAlpha(rectF2, i);
            }
            this.a.draw(canvas);
            canvas.restoreToCount(save);
        }

        public final void c(Canvas canvas, Paint paint) {
            if (paint.getColor() == 0 || paint.getAlpha() <= 0) {
                return;
            }
            canvas.drawRect(getBounds(), paint);
        }

        public final void d(float f) {
            float f2;
            float f3;
            float f4;
            RectF rectF;
            Path path;
            c cVar;
            Path path2;
            float f5;
            pg10 pg10Var;
            this.I = f;
            this.m.setAlpha((int) (this.r ? fnp0.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 255.0f, f) : fnp0.c(255.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f)));
            float f6 = this.p;
            PathMeasure pathMeasure = this.o;
            float[] fArr = this.q;
            pathMeasure.getPosTan(f6 * f, fArr, null);
            float f7 = fArr[0];
            float f8 = fArr[1];
            if (f > 1.0f || f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (f > 1.0f) {
                    f3 = (f - 1.0f) / 0.00999999f;
                    f2 = 0.99f;
                } else {
                    f2 = 0.01f;
                    f3 = (f / 0.01f) * (-1.0f);
                }
                pathMeasure.getPosTan(f6 * f2, fArr, null);
                float f9 = fArr[0];
                float f10 = fArr[1];
                f7 = u11.b(f7, f9, f3, f7);
                f8 = u11.b(f8, f10, f3, f8);
            }
            float f11 = f8;
            float f12 = f7;
            d dVar = this.A;
            c cVar2 = dVar.b;
            c cVar3 = dVar.a;
            c cVar4 = dVar.c;
            float f13 = cVar2.a;
            float f14 = dVar.b.b;
            RectF rectF2 = this.b;
            float width = rectF2.width();
            float height = rectF2.height();
            RectF rectF3 = this.f;
            kmr c = this.C.c(f, f13, f14, width, height, rectF3.width(), rectF3.height());
            this.E = c;
            float f15 = c.c / 2.0f;
            float f16 = c.d + f11;
            RectF rectF4 = this.w;
            rectF4.set(f12 - f15, f11, f15 + f12, f16);
            kmr kmrVar = this.E;
            float f17 = kmrVar.e / 2.0f;
            float f18 = kmrVar.f + f11;
            RectF rectF5 = this.y;
            rectF5.set(f12 - f17, f11, f17 + f12, f18);
            RectF rectF6 = this.x;
            rectF6.set(rectF4);
            RectF rectF7 = this.z;
            rectF7.set(rectF5);
            float f19 = cVar4.a;
            float f20 = cVar4.b;
            kmr kmrVar2 = this.E;
            imr imrVar = this.C;
            boolean a = imrVar.a(kmrVar2);
            RectF rectF8 = a ? rectF6 : rectF7;
            float d = fnp0.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, f19, f20, f, false);
            if (!a) {
                d = 1.0f - d;
            }
            imrVar.b(rectF8, d, this.E);
            this.F = new RectF(Math.min(rectF6.left, rectF7.left), Math.min(rectF6.top, rectF7.top), Math.max(rectF6.right, rectF7.right), Math.max(rectF6.bottom, rectF7.bottom));
            c cVar5 = dVar.d;
            pg10 pg10Var2 = this.n;
            Path path3 = pg10Var2.c;
            Path path4 = pg10Var2.b;
            float f21 = cVar5.a;
            float f22 = cVar5.b;
            com.google.android.material.shape.a aVar = this.c;
            if (f < f21) {
                f5 = f;
                pg10Var = pg10Var2;
                rectF = rectF6;
                f4 = 1.0f;
                path = path3;
                cVar = cVar3;
                path2 = path4;
            } else {
                com.google.android.material.shape.a aVar2 = this.g;
                if (f > f22) {
                    aVar = aVar2;
                    pg10Var = pg10Var2;
                    rectF = rectF6;
                    f4 = 1.0f;
                    path = path3;
                    cVar = cVar3;
                    path2 = path4;
                    f5 = f;
                } else {
                    uuj uujVar = aVar.e;
                    uuj uujVar2 = aVar.h;
                    uuj uujVar3 = aVar.g;
                    f4 = 1.0f;
                    uuj uujVar4 = aVar.f;
                    com.google.android.material.shape.a aVar3 = (uujVar.a(rectF4) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && uujVar4.a(rectF4) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && uujVar3.a(rectF4) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && uujVar2.a(rectF4) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? aVar2 : aVar;
                    aVar3.getClass();
                    new wog0();
                    new wog0();
                    new wog0();
                    new wog0();
                    new ryo();
                    new ryo();
                    new ryo();
                    new ryo();
                    wuj wujVar = aVar3.a;
                    wuj wujVar2 = aVar3.b;
                    wuj wujVar3 = aVar3.c;
                    wuj wujVar4 = aVar3.d;
                    ryo ryoVar = aVar3.i;
                    ryo ryoVar2 = aVar3.j;
                    ryo ryoVar3 = aVar3.k;
                    ryo ryoVar4 = aVar3.l;
                    rectF = rectF6;
                    path = path3;
                    cVar = cVar3;
                    path2 = path4;
                    mc mcVar = new mc(fnp0.d(aVar.e.a(rectF4), aVar2.e.a(rectF7), f21, f22, f, false));
                    mc mcVar2 = new mc(fnp0.d(uujVar4.a(rectF4), aVar2.f.a(rectF7), f21, f22, f, false));
                    mc mcVar3 = new mc(fnp0.d(uujVar2.a(rectF4), aVar2.h.a(rectF7), f21, f22, f, false));
                    uuj uujVar5 = aVar2.g;
                    f5 = f;
                    mc mcVar4 = new mc(fnp0.d(uujVar3.a(rectF4), uujVar5.a(rectF7), f21, f22, f5, false));
                    com.google.android.material.shape.a aVar4 = new com.google.android.material.shape.a();
                    aVar4.a = wujVar;
                    aVar4.b = wujVar2;
                    aVar4.c = wujVar3;
                    aVar4.d = wujVar4;
                    aVar4.e = mcVar;
                    aVar4.f = mcVar2;
                    aVar4.g = mcVar4;
                    aVar4.h = mcVar3;
                    aVar4.i = ryoVar;
                    aVar4.j = ryoVar2;
                    aVar4.k = ryoVar3;
                    aVar4.l = ryoVar4;
                    aVar = aVar4;
                    pg10Var = pg10Var2;
                }
            }
            pg10Var.e = aVar;
            pg10Var.d.a(aVar, 1.0f, rectF, null, path2);
            Path path5 = path2;
            Path path6 = path;
            pg10Var.d.a(pg10Var.e, 1.0f, rectF7, null, path6);
            pg10Var.a.op(path5, path6, Path.Op.UNION);
            this.G = fnp0.c(this.d, this.h, f5);
            float centerX = ((this.F.centerX() / (this.s / 2.0f)) - f4) * 0.3f;
            float centerY = (this.F.centerY() / this.t) * 1.5f;
            float f23 = this.G;
            float f24 = (int) (centerY * f23);
            this.H = f24;
            this.l.setShadowLayer(f23, (int) (centerX * f23), f24, 754974720);
            c cVar6 = cVar;
            this.D = this.B.a(f5, cVar6.a, cVar6.b);
            Paint paint = this.j;
            if (paint.getColor() != 0) {
                paint.setAlpha(this.D.a);
            }
            Paint paint2 = this.k;
            if (paint2.getColor() != 0) {
                paint2.setAlpha(this.D.b);
            }
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public final void draw(@NonNull Canvas canvas) {
            Paint paint = this.m;
            if (paint.getAlpha() > 0) {
                canvas.drawRect(getBounds(), paint);
            }
            boolean z = this.u;
            pg10 pg10Var = this.n;
            if (z && this.G > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                canvas.save();
                canvas.clipPath(pg10Var.a, Region.Op.DIFFERENCE);
                if (Build.VERSION.SDK_INT > 28) {
                    com.google.android.material.shape.a aVar = pg10Var.e;
                    boolean e = aVar.e(this.F);
                    Paint paint2 = this.l;
                    if (e) {
                        float a = aVar.e.a(this.F);
                        canvas.drawRoundRect(this.F, a, a, paint2);
                    } else {
                        canvas.drawPath(pg10Var.a, paint2);
                    }
                } else {
                    RectF rectF = this.F;
                    int i = (int) rectF.left;
                    int i2 = (int) rectF.top;
                    int i3 = (int) rectF.right;
                    int i4 = (int) rectF.bottom;
                    MaterialShapeDrawable materialShapeDrawable = this.v;
                    materialShapeDrawable.setBounds(i, i2, i3, i4);
                    materialShapeDrawable.setElevation(this.G);
                    materialShapeDrawable.setShadowVerticalOffset((int) this.H);
                    materialShapeDrawable.setShapeAppearanceModel(pg10Var.e);
                    materialShapeDrawable.draw(canvas);
                }
                canvas.restore();
            }
            canvas.clipPath(pg10Var.a);
            c(canvas, this.i);
            if (this.D.c) {
                b(canvas);
                a(canvas);
            } else {
                a(canvas);
                b(canvas);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public final int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public final void setAlpha(int i) {
            throw new UnsupportedOperationException("Setting alpha on is not supported");
        }

        @Override // android.graphics.drawable.Drawable
        public final void setColorFilter(@Nullable ColorFilter colorFilter) {
            throw new UnsupportedOperationException("Setting a color filter is not supported");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(@NonNull TransitionValues transitionValues, int i, @Nullable com.google.android.material.shape.a aVar) {
        RectF b2;
        if (i != -1) {
            View view = transitionValues.view;
            RectF rectF = fnp0.a;
            View findViewById = view.findViewById(i);
            if (findViewById == null) {
                findViewById = fnp0.a(i, view);
            }
            transitionValues.view = findViewById;
        } else if (transitionValues.view.getTag(R$id.mtrl_motion_snapshot_view) instanceof View) {
            View view2 = (View) transitionValues.view.getTag(R$id.mtrl_motion_snapshot_view);
            transitionValues.view.setTag(R$id.mtrl_motion_snapshot_view, null);
            transitionValues.view = view2;
        }
        View view3 = transitionValues.view;
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        if (!view3.isLaidOut() && view3.getWidth() == 0 && view3.getHeight() == 0) {
            return;
        }
        if (view3.getParent() == null) {
            RectF rectF2 = fnp0.a;
            b2 = new RectF(view3.getLeft(), view3.getTop(), view3.getRight(), view3.getBottom());
        } else {
            b2 = fnp0.b(view3);
        }
        transitionValues.values.put("materialContainerTransition:bounds", b2);
        Map map = transitionValues.values;
        if (aVar == null) {
            if (view3.getTag(R$id.mtrl_motion_snapshot_view) instanceof com.google.android.material.shape.a) {
                aVar = (com.google.android.material.shape.a) view3.getTag(R$id.mtrl_motion_snapshot_view);
            } else {
                Context context = view3.getContext();
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R$attr.transitionShapeAppearance});
                int resourceId = obtainStyledAttributes.getResourceId(0, -1);
                obtainStyledAttributes.recycle();
                if (resourceId != -1) {
                    aVar = com.google.android.material.shape.a.a(resourceId, 0, context).a();
                } else if (view3 instanceof l6j0) {
                    aVar = ((l6j0) view3).getShapeAppearanceModel();
                } else {
                    wog0 wog0Var = new wog0();
                    wog0 wog0Var2 = new wog0();
                    wog0 wog0Var3 = new wog0();
                    wog0 wog0Var4 = new wog0();
                    mc mcVar = new mc(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    mc mcVar2 = new mc(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    mc mcVar3 = new mc(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    mc mcVar4 = new mc(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    ryo ryoVar = new ryo();
                    ryo ryoVar2 = new ryo();
                    ryo ryoVar3 = new ryo();
                    ryo ryoVar4 = new ryo();
                    com.google.android.material.shape.a aVar2 = new com.google.android.material.shape.a();
                    aVar2.a = wog0Var;
                    aVar2.b = wog0Var2;
                    aVar2.c = wog0Var3;
                    aVar2.d = wog0Var4;
                    aVar2.e = mcVar;
                    aVar2.f = mcVar2;
                    aVar2.g = mcVar3;
                    aVar2.h = mcVar4;
                    aVar2.i = ryoVar;
                    aVar2.j = ryoVar2;
                    aVar2.k = ryoVar3;
                    aVar2.l = ryoVar4;
                    aVar = aVar2;
                }
            }
        }
        map.put("materialContainerTransition:shapeAppearance", aVar.g(new o860(b2, 11)));
    }

    @Override // android.transition.Transition
    public final void captureEndValues(@NonNull TransitionValues transitionValues) {
        a(transitionValues, this.f, this.i);
    }

    @Override // android.transition.Transition
    public final void captureStartValues(@NonNull TransitionValues transitionValues) {
        a(transitionValues, this.e, this.h);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v1 xsna.em10$e, still in use, count: 2, list:
          (r3v1 xsna.em10$e) from 0x01a4: MOVE (r23v9 xsna.em10$e) = (r3v1 xsna.em10$e) (LINE:421)
          (r3v1 xsna.em10$e) from 0x01b6: MOVE (r23v11 xsna.em10$e) = (r3v1 xsna.em10$e) (LINE:439)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // android.transition.Transition
    @androidx.annotation.Nullable
    public final android.animation.Animator createAnimator(@androidx.annotation.NonNull android.view.ViewGroup r23, @androidx.annotation.Nullable android.transition.TransitionValues r24, @androidx.annotation.Nullable android.transition.TransitionValues r25) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.em10.createAnimator(android.view.ViewGroup, android.transition.TransitionValues, android.transition.TransitionValues):android.animation.Animator");
    }

    @Override // android.transition.Transition
    @Nullable
    public final String[] getTransitionProperties() {
        return m;
    }

    @Override // android.transition.Transition
    public final void setPathMotion(@Nullable PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.c = true;
    }
}
