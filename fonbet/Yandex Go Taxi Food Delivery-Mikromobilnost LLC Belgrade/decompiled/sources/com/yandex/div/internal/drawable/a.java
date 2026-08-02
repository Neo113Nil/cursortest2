package com.yandex.div.internal.drawable;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import defpackage.i3y;
import defpackage.j73;
import defpackage.o5i0;
import defpackage.p5i0;
import defpackage.q5i0;
import defpackage.r5i0;
import defpackage.s5i0;
import defpackage.sls;
import defpackage.t5i0;
import defpackage.u5i0;
import defpackage.w511;

/* loaded from: classes11.dex */
public final class a {
    public static final float a(float f, float f2, float f3, float f4) {
        return (float) Math.sqrt(((float) Math.pow(f - f3, 2.0d)) + ((float) Math.pow(f2 - f4, 2.0d)));
    }

    public static RadialGradient b(u5i0 u5i0Var, q5i0 q5i0Var, q5i0 q5i0Var2, int[] iArr, float[] fArr, int i, int i2) {
        float f;
        float f2;
        float floatValue;
        if (q5i0Var instanceof o5i0) {
            f = ((o5i0) q5i0Var).a;
        } else {
            if (!(q5i0Var instanceof p5i0)) {
                w511.b();
                return null;
            }
            f = ((p5i0) q5i0Var).a * i;
        }
        final float f3 = f;
        if (q5i0Var2 instanceof o5i0) {
            f2 = ((o5i0) q5i0Var2).a;
        } else {
            if (!(q5i0Var2 instanceof p5i0)) {
                w511.b();
                return null;
            }
            f2 = ((p5i0) q5i0Var2).a * i2;
        }
        final float f4 = f2;
        final float f5 = i;
        final float f6 = i2;
        i3y a = kotlin.a.a(new sls() { // from class: com.yandex.div.internal.drawable.RadialGradientDrawable$Companion$createRadialGradient$distancesToCorners$2
            final /* synthetic */ float $leftCord = 0.0f;
            final /* synthetic */ float $topCord = 0.0f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return new Float[]{Float.valueOf(a.a(f3, f4, this.$leftCord, this.$topCord)), Float.valueOf(a.a(f3, f4, f5, this.$topCord)), Float.valueOf(a.a(f3, f4, f5, f6)), Float.valueOf(a.a(f3, f4, this.$leftCord, f6))};
            }
        });
        i3y a2 = kotlin.a.a(new sls() { // from class: com.yandex.div.internal.drawable.RadialGradientDrawable$Companion$createRadialGradient$distancesToSides$2
            final /* synthetic */ float $leftCord = 0.0f;
            final /* synthetic */ float $topCord = 0.0f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return new Float[]{Float.valueOf(Math.abs(f3 - this.$leftCord)), Float.valueOf(Math.abs(f3 - f5)), Float.valueOf(Math.abs(f4 - f6)), Float.valueOf(Math.abs(f4 - this.$topCord))};
            }
        });
        if (u5i0Var instanceof s5i0) {
            floatValue = ((s5i0) u5i0Var).a;
        } else {
            if (!(u5i0Var instanceof t5i0)) {
                w511.b();
                return null;
            }
            int i3 = r5i0.a[((t5i0) u5i0Var).a.ordinal()];
            if (i3 == 1) {
                floatValue = j73.S((Float[]) a.getValue()).floatValue();
            } else if (i3 == 2) {
                floatValue = j73.P((Float[]) a.getValue()).floatValue();
            } else if (i3 == 3) {
                floatValue = j73.S((Float[]) a2.getValue()).floatValue();
            } else {
                if (i3 != 4) {
                    w511.b();
                    return null;
                }
                floatValue = j73.P((Float[]) a2.getValue()).floatValue();
            }
        }
        if (floatValue <= 0.0f) {
            floatValue = 0.01f;
        }
        return new RadialGradient(f3, f4, floatValue, iArr, fArr, Shader.TileMode.CLAMP);
    }
}
