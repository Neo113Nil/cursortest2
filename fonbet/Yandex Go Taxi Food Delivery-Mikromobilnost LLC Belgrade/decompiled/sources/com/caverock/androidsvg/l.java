package com.caverock.androidsvg;

import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.RectF;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import defpackage.ny61;
import defpackage.pt3;
import defpackage.tml0;
import defpackage.w97;
import defpackage.wml0;
import defpackage.yml0;
import java.util.HashMap;

/* loaded from: classes10.dex */
public final class l {
    public tml0 a;
    public w97 b;
    public HashMap c;

    /* JADX WARN: Multi-variable type inference failed */
    public static yml0 e(wml0 wml0Var, String str) {
        yml0 e;
        yml0 yml0Var = (yml0) wml0Var;
        if (str.equals(yml0Var.c)) {
            return yml0Var;
        }
        for (Object obj : wml0Var.getChildren()) {
            if (obj instanceof yml0) {
                yml0 yml0Var2 = (yml0) obj;
                if (str.equals(yml0Var2.c)) {
                    return yml0Var2;
                }
                if ((obj instanceof wml0) && (e = e((wml0) obj, str)) != null) {
                    return e;
                }
            }
        }
        return null;
    }

    public final pt3 a() {
        SVG$Unit sVG$Unit;
        SVG$Unit sVG$Unit2;
        SVG$Unit sVG$Unit3;
        SVG$Unit sVG$Unit4;
        float f;
        float f2;
        SVG$Unit sVG$Unit5;
        tml0 tml0Var = this.a;
        j jVar = tml0Var.r;
        j jVar2 = tml0Var.s;
        float f3 = -1.0f;
        if (jVar == null || jVar.g() || (sVG$Unit = jVar.b) == (sVG$Unit2 = SVG$Unit.percent) || sVG$Unit == (sVG$Unit3 = SVG$Unit.em) || sVG$Unit == (sVG$Unit4 = SVG$Unit.ex)) {
            return new pt3(f3, f3, f3, f3, 1);
        }
        float c = jVar.c();
        if (jVar2 == null) {
            pt3 pt3Var = this.a.o;
            if (pt3Var == null) {
                f = c;
                float f4 = 0.0f;
                return new pt3(f4, f4, c, f, 1);
            }
            f2 = (pt3Var.e * c) / pt3Var.d;
        } else {
            if (jVar2.g() || (sVG$Unit5 = jVar2.b) == sVG$Unit2 || sVG$Unit5 == sVG$Unit3 || sVG$Unit5 == sVG$Unit4) {
                return new pt3(f3, f3, f3, f3, 1);
            }
            f2 = jVar2.c();
        }
        f = f2;
        float f42 = 0.0f;
        return new pt3(f42, f42, c, f, 1);
    }

    public final float b() {
        if (this.a != null) {
            return a().e;
        }
        ny61.g("SVG document is empty");
        return 0.0f;
    }

    public final RectF c() {
        tml0 tml0Var = this.a;
        if (tml0Var == null) {
            ny61.g("SVG document is empty");
            return null;
        }
        pt3 pt3Var = tml0Var.o;
        if (pt3Var == null) {
            return null;
        }
        pt3Var.getClass();
        return new RectF(pt3Var.b, pt3Var.c, pt3Var.a(), pt3Var.b());
    }

    public final float d() {
        if (this.a != null) {
            return a().d;
        }
        ny61.g("SVG document is empty");
        return 0.0f;
    }

    public final Picture f(int i, int i2, g gVar) {
        Picture picture = new Picture();
        Canvas beginRecording = picture.beginRecording(i, i2);
        if (gVar == null || gVar.b == null) {
            if (gVar == null) {
                gVar = new g();
            } else {
                g gVar2 = new g();
                gVar2.a = null;
                gVar2.b = null;
                gVar2.a = gVar.a;
                gVar2.b = gVar.b;
                gVar = gVar2;
            }
            float f = 0.0f;
            gVar.b = new pt3(f, f, i, i2, 1);
        }
        new m(beginRecording).I(this, gVar);
        picture.endRecording();
        return picture;
    }

    public final Picture g(g gVar) {
        j jVar;
        pt3 pt3Var;
        tml0 tml0Var = this.a;
        pt3 pt3Var2 = tml0Var.o;
        if (gVar != null && (pt3Var = gVar.b) != null) {
            return f((int) Math.ceil(pt3Var.a()), (int) Math.ceil(gVar.b.b()), gVar);
        }
        j jVar2 = tml0Var.r;
        if (jVar2 != null) {
            SVG$Unit sVG$Unit = jVar2.b;
            SVG$Unit sVG$Unit2 = SVG$Unit.percent;
            if (sVG$Unit != sVG$Unit2 && (jVar = tml0Var.s) != null && jVar.b != sVG$Unit2) {
                return f((int) Math.ceil(jVar2.c()), (int) Math.ceil(this.a.s.c()), gVar);
            }
        }
        if (jVar2 != null && pt3Var2 != null) {
            return f((int) Math.ceil(jVar2.c()), (int) Math.ceil((pt3Var2.e * r0) / pt3Var2.d), gVar);
        }
        j jVar3 = tml0Var.s;
        if (jVar3 == null || pt3Var2 == null) {
            return f(512, 512, gVar);
        }
        return f((int) Math.ceil((pt3Var2.d * r0) / pt3Var2.e), (int) Math.ceil(jVar3.c()), gVar);
    }

    public final yml0 h(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        String replace = str.replace("\\\n", "").replace("\\A", "\n");
        if (replace.length() <= 1 || !replace.startsWith(ShimmerDivHandler.NUMBER_SING)) {
            return null;
        }
        String substring = replace.substring(1);
        HashMap hashMap = this.c;
        if (substring == null || substring.length() == 0) {
            return null;
        }
        if (substring.equals(this.a.c)) {
            return this.a;
        }
        if (hashMap.containsKey(substring)) {
            return (yml0) hashMap.get(substring);
        }
        yml0 e = e(this.a, substring);
        hashMap.put(substring, e);
        return e;
    }

    public final void i(float f, float f2) {
        tml0 tml0Var = this.a;
        if (tml0Var == null) {
            ny61.g("SVG document is empty");
        } else {
            float f3 = 0.0f;
            tml0Var.o = new pt3(f3, f3, f, f2, 1);
        }
    }
}
