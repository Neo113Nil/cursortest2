package com.ybsdk.core.design.spoiler;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.jxi;
import defpackage.kp50;
import defpackage.lhc;
import defpackage.pvt0;
import defpackage.qvt0;
import defpackage.sb2;
import defpackage.tje;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Stack;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u0000 h2\u00020\u0001:\u0002ijB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J?\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001e\u0010\u0017J\u0017\u0010 \u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010$\u001a\u00020\u00132\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0006H\u0017¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u0006¢\u0006\u0004\b)\u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0016\u0010,\u001a\u0004\u0018\u00010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001c\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u0011018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R$\u0010A\u001a\u0012\u0012\u0004\u0012\u00020\u00110?j\b\u0012\u0004\u0012\u00020\u0011`@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010D\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020<0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010I\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u00105R\u0016\u0010J\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010L\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010KR$\u0010N\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\u00068\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bN\u00105\"\u0004\bO\u0010!R\u0016\u0010Q\u001a\u00020P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR$\u0010T\u001a\u0004\u0018\u00010S8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR(\u0010Z\u001a\b\u0012\u0004\u0012\u0002060.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010`\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010K\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR$\u0010g\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\be\u0010'\"\u0004\bf\u0010!¨\u0006k"}, d2 = {"Lcom/ybsdk/core/design/spoiler/SpoilerEffect;", "Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "left", "top", "right", "bottom", "", RemoteBioParameters.X, RemoteBioParameters.Y, "", "isOutOfBounds", "(IIIIFF)Z", "Lcom/ybsdk/core/design/spoiler/SpoilerEffect$a;", "newParticle", "Lzy11;", "generateRandomLocation", "(Lcom/ybsdk/core/design/spoiler/SpoilerEffect$a;)V", "updateMaxParticles", "()V", "setBounds", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "invalidateSelf", CaretView.ALPHA_PROPERTY, "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "color", "setColor", "Landroid/content/Context;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "", "particlePaints", "[Landroid/graphics/Paint;", "Ljava/util/Stack;", "particlesPool", "Ljava/util/Stack;", "maxParticles", CA20Status.STATUS_USER_I, "", "particleRands", "[F", "", "renderCount", "[I", "Landroid/graphics/RectF;", "visibleRect", "Landroid/graphics/RectF;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "particles", "Ljava/util/ArrayList;", "", "lastDrawTime", "J", "", "spaces", "Ljava/util/List;", "mAlpha", "invalidateParent", "Z", "enableAlpha", "value", "lastColor", "setLastColor", "Landroid/graphics/PorterDuffColorFilter;", "filter", "Landroid/graphics/PorterDuffColorFilter;", "Landroid/view/View;", "parentView", "Landroid/view/View;", "getParentView", "()Landroid/view/View;", "setParentView", "(Landroid/view/View;)V", "particlePoints", "[[F", "getParticlePoints", "()[[F", "setParticlePoints", "([[F)V", "drawPoints", "getDrawPoints", "()Z", "setDrawPoints", "(Z)V", "getMaxParticlesCount", "setMaxParticlesCount", "maxParticlesCount", "Companion", "a", "pvt0", "core-design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SpoilerEffect extends Drawable {
    private static final int FPS = 30;
    private static final int MAX_PARTICLES_PER_ENTITY = 100;
    private static final int PARTICLES_PER_CHARACTER = 10;
    private static final int RAND_REPEAT = 14;
    private static final float VERTICAL_PADDING_DP = 2.5f;
    private static final int renderDelayMs = 34;
    private final Context context;
    private boolean drawPoints;
    private final boolean enableAlpha;
    private PorterDuffColorFilter filter;
    private boolean invalidateParent;
    private int lastColor;
    private long lastDrawTime;
    private int mAlpha;
    private int maxParticles;
    private final Paint paint = null;
    private View parentView;
    private final Paint[] particlePaints;
    private float[][] particlePoints;
    private final float[] particleRands;
    private final ArrayList<a> particles;
    private final Stack<a> particlesPool;
    private final int[] renderCount;
    private final List<RectF> spaces;
    private RectF visibleRect;
    public static final pvt0 Companion = new pvt0();
    private static final float[] ALPHAS = {0.3f, 0.6f, 1.0f};
    private static final Random random = new Random();

    public static final class a {
        public float a;
        public float b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;
        public int h;
    }

    public SpoilerEffect(Context context) {
        this.context = context;
        float[] fArr = ALPHAS;
        this.particlePaints = new Paint[fArr.length];
        this.particlesPool = new Stack<>();
        this.particleRands = new float[14];
        this.renderCount = new int[fArr.length];
        this.particles = new ArrayList<>();
        this.spaces = new ArrayList();
        this.mAlpha = 255;
        this.filter = new PorterDuffColorFilter(this.lastColor, PorterDuff.Mode.SRC_IN);
        int length = fArr.length;
        float[][] fArr2 = new float[length][];
        for (int i = 0; i < length; i++) {
            fArr2[i] = new float[200];
        }
        this.particlePoints = fArr2;
        int length2 = ALPHAS.length;
        for (int i2 = 0; i2 < length2; i2++) {
            Paint[] paintArr = this.particlePaints;
            Paint paint = new Paint();
            if (i2 == 0) {
                paint.setStrokeWidth(kp50.q(1.8f));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeCap(Paint.Cap.ROUND);
            } else {
                paint.setStrokeWidth(kp50.q(1.8f));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeCap(Paint.Cap.ROUND);
            }
            paintArr[i2] = paint;
        }
        this.enableAlpha = true;
        setColor(0);
    }

    private final void generateRandomLocation(a newParticle) {
        float f = getBounds().left;
        Random random2 = random;
        newParticle.a = (random2.nextFloat() * getBounds().width()) + f;
        newParticle.b = (random2.nextFloat() * getBounds().height()) + getBounds().top;
    }

    private final boolean isOutOfBounds(int left, int top, int right, int bottom, float x, float y) {
        if (x < left || x > right || y < kp50.q(VERTICAL_PADDING_DP) + top || y > bottom - kp50.q(VERTICAL_PADDING_DP)) {
            return true;
        }
        int size = this.spaces.size();
        for (int i = 0; i < size; i++) {
            if (this.spaces.get(i).contains(x, y)) {
                return true;
            }
        }
        return false;
    }

    private final void setLastColor(int i) {
        this.lastColor = i;
        this.filter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ArrayList<a> arrayList;
        if (!this.drawPoints) {
            Context context = this.context;
            qvt0 qvt0Var = qvt0.l;
            if (qvt0Var == null) {
                qvt0Var = new qvt0(context);
                qvt0.l = qvt0Var;
            }
            qvt0Var.b(this.context).setColorFilter(this.filter);
            float f = getBounds().left;
            float f2 = getBounds().top;
            float f3 = getBounds().right;
            float f4 = getBounds().bottom;
            Context context2 = this.context;
            qvt0 qvt0Var2 = qvt0.l;
            if (qvt0Var2 == null) {
                qvt0Var2 = new qvt0(context2);
                qvt0.l = qvt0Var2;
            }
            canvas.drawRect(f, f2, f3, f4, qvt0Var2.b(this.context));
            invalidateSelf();
            Context context3 = this.context;
            qvt0 qvt0Var3 = qvt0.l;
            if (qvt0Var3 == null) {
                qvt0Var3 = new qvt0(context3);
                qvt0.l = qvt0Var3;
            }
            if (System.currentTimeMillis() - qvt0Var3.g <= 32 || qvt0Var3.i) {
                return;
            }
            qvt0Var3.g = System.currentTimeMillis();
            qvt0Var3.i = true;
            tje.N(qvt0Var3.a, null, null, new SpoilerEffectBitmapFactory$checkUpdate$1(qvt0Var3, qvt0Var3.c, null), 3);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int min = (int) Math.min(currentTimeMillis - this.lastDrawTime, 34L);
        this.lastDrawTime = currentTimeMillis;
        int i = getBounds().left;
        int i2 = getBounds().top;
        int i3 = getBounds().right;
        int i4 = getBounds().bottom;
        int length = ALPHAS.length;
        for (int i5 = 0; i5 < length; i5++) {
            this.renderCount[i5] = 0;
        }
        int i6 = 0;
        while (true) {
            int size = this.particles.size();
            arrayList = this.particles;
            if (i6 >= size) {
                break;
            }
            a aVar = arrayList.get(i6);
            float f5 = min;
            float min2 = Math.min(aVar.g + f5, aVar.f);
            aVar.g = min2;
            if (min2 >= aVar.f || isOutOfBounds(i, i2, i3, i4, aVar.a, aVar.b)) {
                if (this.particlesPool.size() < this.maxParticles) {
                    this.particlesPool.push(aVar);
                }
                this.particles.remove(i6);
            } else {
                float f6 = (aVar.e * f5) / 500.0f;
                float f7 = (aVar.c * f6) + aVar.a;
                aVar.a = f7;
                float f8 = (aVar.d * f6) + aVar.b;
                aVar.b = f8;
                int i7 = aVar.h;
                float[] fArr = this.particlePoints[i7];
                int[] iArr = this.renderCount;
                int i8 = iArr[i7];
                int i9 = i8 * 2;
                fArr[i9] = f7;
                fArr[i9 + 1] = f8;
                iArr[i7] = i8 + 1;
                i6++;
            }
        }
        int size2 = arrayList.size();
        int i10 = this.maxParticles;
        if (size2 < i10) {
            int size3 = i10 - this.particles.size();
            float f9 = -1.0f;
            Arrays.fill(this.particleRands, -1.0f);
            int i11 = 0;
            while (i11 < size3) {
                int i12 = i11 % 14;
                float f10 = this.particleRands[i12];
                if (f10 == f9) {
                    f10 = random.nextFloat();
                    this.particleRands[i12] = f10;
                }
                float f11 = f10;
                a pop = !this.particlesPool.isEmpty() ? this.particlesPool.pop() : new a();
                int i13 = 0;
                while (true) {
                    generateRandomLocation(pop);
                    int i14 = i13 + 1;
                    if (isOutOfBounds(i, i2, i3, i4, pop.a, pop.b) && i14 < 4) {
                        i13 = i14;
                    }
                }
                double d = ((f11 * 3.141592653589793d) * 2.0d) - 3.141592653589793d;
                float cos = (float) Math.cos(d);
                float sin = (float) Math.sin(d);
                pop.c = cos;
                pop.d = sin;
                pop.g = 0.0f;
                Random random2 = random;
                pop.f = Math.abs(random2.nextInt(2000)) + 1000;
                pop.e = (f11 * 6.0f) + 4.0f;
                pop.h = random2.nextInt(ALPHAS.length);
                this.particles.add(pop);
                int i15 = pop.h;
                float[] fArr2 = this.particlePoints[i15];
                int[] iArr2 = this.renderCount;
                int i16 = iArr2[i15];
                int i17 = i16 * 2;
                fArr2[i17] = pop.a;
                fArr2[i17 + 1] = pop.b;
                iArr2[i15] = i16 + 1;
                i11++;
                f9 = -1.0f;
            }
        }
        int length2 = ALPHAS.length;
        for (int length3 = this.enableAlpha ? 0 : ALPHAS.length - 1; length3 < length2; length3++) {
            int size4 = this.particles.size();
            int i18 = 0;
            int i19 = 0;
            for (int i20 = 0; i20 < size4; i20++) {
                a aVar2 = this.particles.get(i20);
                RectF rectF = this.visibleRect;
                if ((rectF == null || rectF.contains(aVar2.a, aVar2.b)) && (aVar2.h == length3 || !this.enableAlpha)) {
                    float[] fArr3 = this.particlePoints[length3];
                    int i21 = (i20 - i19) * 2;
                    fArr3[i21] = aVar2.a;
                    fArr3[i21 + 1] = aVar2.b;
                    i18 += 2;
                } else {
                    i19++;
                }
            }
            canvas.drawPoints(this.particlePoints[length3], 0, i18, this.particlePaints[length3]);
        }
    }

    public final boolean getDrawPoints() {
        return this.drawPoints;
    }

    /* renamed from: getMaxParticlesCount, reason: from getter */
    public final int getMaxParticles() {
        return this.maxParticles;
    }

    @Override // android.graphics.drawable.Drawable
    @jxi
    public int getOpacity() {
        return -2;
    }

    public final View getParentView() {
        return this.parentView;
    }

    public final float[][] getParticlePoints() {
        return this.particlePoints;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        super.invalidateSelf();
        View view = this.parentView;
        if (view != null) {
            if (view.getParent() == null || !this.invalidateParent) {
                view.invalidate();
            } else {
                ((View) view.getParent()).invalidate();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.mAlpha = alpha;
        int length = ALPHAS.length;
        for (int i = 0; i < length; i++) {
            this.particlePaints[i].setAlpha((int) (ALPHAS[i] * alpha));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int left, int top, int right, int bottom) {
        super.setBounds(left, top, right, bottom);
        Iterator<a> it = this.particles.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!getBounds().contains((int) next.a, (int) next.b)) {
                it.remove();
            }
            if (this.particlesPool.size() < this.maxParticles) {
                this.particlesPool.push(next);
            }
        }
    }

    public final void setColor(int color) {
        if (this.lastColor != color) {
            int length = ALPHAS.length;
            for (int i = 0; i < length; i++) {
                this.particlePaints[i].setColor(lhc.f(color, (int) (this.mAlpha * ALPHAS[i])));
            }
            setLastColor(color);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        for (Paint paint : this.particlePaints) {
            paint.setColorFilter(colorFilter);
        }
    }

    public final void setDrawPoints(boolean z) {
        this.drawPoints = z;
    }

    public final void setMaxParticlesCount(int i) {
        this.maxParticles = i;
        while (this.particles.size() + this.particlesPool.size() < i) {
            this.particlesPool.push(new a());
        }
    }

    public final void setParentView(View view) {
        this.parentView = view;
    }

    public final void setParticlePoints(float[][] fArr) {
        this.particlePoints = fArr;
    }

    public final void updateMaxParticles() {
        setMaxParticlesCount(sb2.k((getBounds().width() / kp50.r(6)) * 10, 10, 100));
    }
}
