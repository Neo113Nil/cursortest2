package coil.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import coil.view.Scale;
import com.caverock.androidsvg.g;
import com.caverock.androidsvg.l;
import com.caverock.androidsvg.m;
import com.caverock.androidsvg.q;
import defpackage.hyg;
import defpackage.jl40;
import defpackage.m810;
import defpackage.ny61;
import defpackage.pt3;
import defpackage.qg70;
import defpackage.qq6;
import defpackage.sls;
import defpackage.tml0;
import defpackage.w511;
import defpackage.wis0;
import defpackage.xxg;
import defpackage.yga1;
import defpackage.zev;
import defpackage.zxg;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.a;

/* loaded from: classes10.dex */
public final class d implements hyg {
    public final zev a;
    public final qg70 b;
    public final boolean c;

    public d(zev zevVar, qg70 qg70Var, boolean z) {
        this.a = zevVar;
        this.b = qg70Var;
        this.c = z;
    }

    @Override // defpackage.hyg
    public final Object a(Continuation continuation) {
        return a.r(new sls() { // from class: coil.decode.SvgDecoder$decode$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                float d;
                float b;
                Pair pair;
                int i;
                int i2;
                float max;
                qq6 source = d.this.a.source();
                try {
                    l f = new q().f(source.p2());
                    source.close();
                    RectF c = f.c();
                    if (!d.this.c || c == null) {
                        d = f.d();
                        b = f.b();
                    } else {
                        d = c.width();
                        b = c.height();
                    }
                    qg70 qg70Var = d.this.b;
                    Scale scale = qg70Var.e;
                    wis0 wis0Var = qg70Var.d;
                    if (jl40.l(wis0Var, wis0.c)) {
                        pair = new Pair(Float.valueOf(d > 0.0f ? d : 512.0f), Float.valueOf(b > 0.0f ? b : 512.0f));
                    } else {
                        pair = new Pair(Float.valueOf(yga1.d(wis0Var.a, scale)), Float.valueOf(yga1.d(wis0Var.b, scale)));
                    }
                    float floatValue = ((Number) pair.getFirst()).floatValue();
                    float floatValue2 = ((Number) pair.getSecond()).floatValue();
                    g gVar = null;
                    if (d <= 0.0f || b <= 0.0f) {
                        int b2 = m810.b(floatValue);
                        int b3 = m810.b(floatValue2);
                        i = b2;
                        i2 = b3;
                    } else {
                        float f2 = floatValue / d;
                        float f3 = floatValue2 / b;
                        int i3 = zxg.a[d.this.b.e.ordinal()];
                        if (i3 == 1) {
                            max = Math.max(f2, f3);
                        } else {
                            if (i3 != 2) {
                                w511.b();
                                return null;
                            }
                            max = Math.min(f2, f3);
                        }
                        i = (int) (max * d);
                        i2 = (int) (max * b);
                    }
                    if (c == null && d > 0.0f && b > 0.0f) {
                        f.i(d, b);
                    }
                    tml0 tml0Var = f.a;
                    if (tml0Var == null) {
                        ny61.g("SVG document is empty");
                        return null;
                    }
                    tml0Var.r = q.t("100%");
                    tml0 tml0Var2 = f.a;
                    if (tml0Var2 == null) {
                        ny61.g("SVG document is empty");
                        return null;
                    }
                    tml0Var2.s = q.t("100%");
                    Bitmap.Config config = d.this.b.b;
                    if (config == null || config == Bitmap.Config.HARDWARE) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
                    String str = (String) d.this.b.l.b("coil#css");
                    if (str != null) {
                        gVar = new g();
                        gVar.a(str);
                    }
                    Canvas canvas = new Canvas(createBitmap);
                    if (gVar == null) {
                        gVar = new g();
                    }
                    g gVar2 = gVar;
                    if (gVar2.b == null) {
                        gVar2.b = new pt3(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), 1);
                    }
                    new m(canvas).I(f, gVar2);
                    return new xxg(new BitmapDrawable(d.this.b.a.getResources(), createBitmap), true);
                } finally {
                }
            }
        }, (ContinuationImpl) continuation);
    }
}
