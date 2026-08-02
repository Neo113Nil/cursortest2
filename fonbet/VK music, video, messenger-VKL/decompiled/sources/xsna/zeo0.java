package xsna;

import android.graphics.Matrix;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.features.markup.text.model.stat.TextStatEvent;
import com.vk.photo.editor.markup.element.text.layout.AllLinesDrawStaticLayout;
import xsna.jio0;
import xsna.lw5;
import xsna.y8g;

/* compiled from: TextElement.kt */
/* loaded from: classes4.dex */
public final class zeo0 implements skp0, uap, kc80, jio, x980 {
    public TextStatEvent.e a;
    public String c;
    public afo0 d;
    public final TextPaint g;
    public StaticLayout h;
    public s5j0 i;
    public Matrix b = new Matrix();
    public final hif0 e = new hif0(0);
    public kif0 f = kif0.c;

    /* compiled from: TextElement.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public zeo0(String str, afo0 afo0Var, TextStatEvent.e eVar) {
        this.a = eVar;
        this.c = str;
        this.d = afo0Var;
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        this.g = textPaint;
        StaticLayout build = StaticLayout.Builder.obtain("", 0, 0, textPaint, 0).build();
        this.h = build;
        tni.j(build);
        this.h.getHeight();
        i();
    }

    @Override // xsna.jio
    public final void a(mlo mloVar) {
        mloVar.b(new iyd0(this, 9));
    }

    @Override // xsna.kc80
    public final boolean b(MotionEvent motionEvent) {
        j();
        return ine0.j(this.e.f, motionEvent.getX(), motionEvent.getY());
    }

    @Override // xsna.skp0
    public final Matrix c() {
        return this.b;
    }

    @Override // xsna.uap
    public final uap copy() {
        zeo0 zeo0Var = new zeo0(this.c, this.d, this.a);
        zeo0Var.b = new Matrix(this.b);
        return zeo0Var;
    }

    @Override // xsna.x980
    public final void d(Matrix matrix) {
        this.b.postConcat(matrix);
        i();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zeo0)) {
            return false;
        }
        zeo0 zeo0Var = (zeo0) obj;
        if (!epx.f(this.c, zeo0Var.c) || !epx.f(this.d, zeo0Var.d) || !epx.f(this.b, zeo0Var.b)) {
            return false;
        }
        j();
        zeo0Var.j();
        if (!epx.f(this.e, zeo0Var.e)) {
            return false;
        }
        j();
        kif0 kif0Var = this.f;
        j();
        return epx.f(kif0Var, this.f);
    }

    @Override // xsna.uap
    public final Object getMeta() {
        return this.a;
    }

    public final int h() {
        afo0 afo0Var = this.d;
        jio0 jio0Var = afo0Var.a;
        float f = jio0Var.b - jio0Var.e;
        lw5.a aVar = afo0Var.b.f;
        return (int) ((f - aVar.a) - aVar.c);
    }

    @Override // xsna.uap
    public final int hashCode() {
        int hashCode = (this.b.hashCode() + ((this.d.hashCode() + urd0.a(super.hashCode() * 31, 31, this.c)) * 31)) * 31;
        j();
        int hashCode2 = (this.e.hashCode() + hashCode) * 31;
        j();
        return this.f.hashCode() + hashCode2;
    }

    public final void i() {
        float j = tni.j(this.h);
        int height = this.h.getHeight();
        jio0 jio0Var = this.d.a;
        float f = jio0Var.d;
        jio0.a aVar = jio0Var.c;
        float f2 = aVar.d;
        float f3 = aVar.c;
        TextPaint textPaint = this.g;
        textPaint.setTextSize(((f2 - f3) * f) + f3);
        textPaint.setTypeface(this.d.a.c.b);
        textPaint.setPathEffect(this.d.a.i.provide());
        this.d.a.f.getClass();
        float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        textPaint.setShadowLayer(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
        String str = this.c;
        int h = h();
        jio0 jio0Var2 = this.d.a;
        AllLinesDrawStaticLayout allLinesDrawStaticLayout = new AllLinesDrawStaticLayout(str, textPaint, h, jio0Var2.g, jio0Var2.h.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false);
        this.h = allLinesDrawStaticLayout;
        this.i = cdi.r(allLinesDrawStaticLayout, this.d.b);
        j();
        if (j != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && height != 0) {
            int height2 = this.h.getHeight();
            float j2 = tni.j(this.h);
            float f5 = (height - height2) / 2.0f;
            int i = a.$EnumSwitchMapping$0[this.d.a.g.ordinal()];
            if (i == 1) {
                f4 = (j - j2) / 2.0f;
            } else if (i == 2) {
                f4 = j - j2;
            }
            float c = nn10.c(this.b);
            float f6 = j2 / 2.0f;
            float f7 = height2 / 2.0f;
            this.b.postRotate(c, f6, f7);
            this.b.postTranslate(f4, f5);
            this.b.postRotate(-c, f6, f7);
        }
        y8g y8gVar = this.d.a.a;
        tni.j(this.h);
        this.h.getHeight();
        if (y8gVar instanceof y8g.c) {
            textPaint.setColor(((y8g.c) y8gVar).a);
        } else {
            if (y8gVar instanceof y8g.b) {
                throw null;
            }
            textPaint.setColor(0);
            textPaint.setShader(null);
        }
    }

    public final void j() {
        float j = tni.j(this.h);
        float height = this.h.getHeight();
        hif0 hif0Var = this.e;
        hif0Var.a.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        hif0Var.b.set(j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        hif0Var.c.set(j, height);
        hif0Var.d.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, height);
        float[] a2 = hif0Var.a();
        this.b.mapPoints(a2);
        edi.A(hif0Var, a2);
        this.f = edi.D(hif0Var);
    }
}
