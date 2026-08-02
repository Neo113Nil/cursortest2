package xsna;

import androidx.compose.runtime.a;
import xsna.avw;
import xsna.avw.a;

/* compiled from: InfiniteTransition.kt */
/* loaded from: classes11.dex */
public final class dvw {
    public static final avw.a a(avw avwVar, float f, float f2, yuw yuwVar, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-644770905, 4536, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:296)");
        }
        avw.a b = b(avwVar, Float.valueOf(f), Float.valueOf(f2), rte0.e, yuwVar, aVar, 33208, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return b;
    }

    public static final avw.a b(avw avwVar, Number number, Number number2, jtp0 jtp0Var, yuw yuwVar, androidx.compose.runtime.a aVar, int i, int i2) {
        avw avwVar2;
        final Number number3;
        final Number number4;
        final yuw yuwVar2;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1062847727, i, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:245)");
        }
        Object x = aVar.x();
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (x == c0012a) {
            avwVar2 = avwVar;
            number3 = number;
            number4 = number2;
            yuwVar2 = yuwVar;
            avw.a aVar2 = avwVar2.new a(number3, number4, jtp0Var, yuwVar2);
            aVar.R(aVar2);
            x = aVar2;
        } else {
            avwVar2 = avwVar;
            number3 = number;
            number4 = number2;
            yuwVar2 = yuwVar;
        }
        final avw.a aVar3 = (avw.a) x;
        boolean z = (((57344 & i) ^ 24576) > 16384 && aVar.y(yuwVar2)) || (i & 24576) == 16384;
        Object x2 = aVar.x();
        if (z || x2 == c0012a) {
            x2 = new gzs() { // from class: xsna.bvw
                @Override // xsna.gzs
                public final Object invoke() {
                    avw.a aVar4 = aVar3;
                    Number number5 = aVar4.b;
                    Number number6 = number3;
                    boolean equals = number6.equals(number5);
                    Number number7 = number4;
                    if (!equals || !number7.equals(aVar4.c)) {
                        aVar4.b = number6;
                        aVar4.c = number7;
                        yuw yuwVar3 = yuwVar2;
                        aVar4.f = yuwVar3;
                        aVar4.g = new w3o0<>(yuwVar3, aVar4.d, number6, number7, null);
                        ((zak0) avw.this.b).setValue(Boolean.TRUE);
                        aVar4.h = false;
                        aVar4.i = true;
                    }
                    return s3q0.a;
                }
            };
            aVar.R(x2);
        }
        bap.i((gzs) x2, aVar, 0);
        boolean y = aVar.y(avwVar2);
        Object x3 = aVar.x();
        if (y || x3 == c0012a) {
            x3 = new ya(19, avwVar2, aVar3);
            aVar.R(x3);
        }
        bap.c(aVar3, (izs) x3, aVar, 6);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return aVar3;
    }

    public static final avw c(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1013651573, 0, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:44)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = new avw();
            aVar.R(x);
        }
        avw avwVar = (avw) x;
        avwVar.a(0, aVar);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return avwVar;
    }
}
