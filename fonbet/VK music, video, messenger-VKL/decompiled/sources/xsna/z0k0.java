package xsna;

import androidx.compose.foundation.gestures.Orientation;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.tra0;

/* compiled from: Slider.kt */
/* loaded from: classes11.dex */
public final class z0k0 implements cp10 {
    public final /* synthetic */ g1k0 a;

    public z0k0(g1k0 g1k0Var) {
        this.a = g1k0Var;
    }

    @Override // xsna.cp10
    public final dp10 b(ep10 ep10Var, List<? extends zo10> list, long j) {
        int i;
        int max;
        int i2;
        int i3;
        int b;
        g1k0 g1k0Var = this.a;
        float[] fArr = g1k0Var.f;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            zo10 zo10Var = list.get(i4);
            if (vua0.o(zo10Var) == j0k0.THUMB) {
                final tra0 N = zo10Var.N(j);
                int size2 = list.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    zo10 zo10Var2 = list.get(i5);
                    if (vua0.o(zo10Var2) == j0k0.TRACK) {
                        Orientation orientation = g1k0Var.l;
                        Orientation orientation2 = Orientation.Vertical;
                        final tra0 N2 = orientation == orientation2 ? zo10Var2.N(o6j.b(0, s6j.j(0, -N.c, 1, j), 0, 0, 0, 14)) : zo10Var2.N(o6j.b(0, s6j.j(-N.b, 0, 2, j), 0, 0, 0, 11));
                        final Ref$IntRef ref$IntRef = new Ref$IntRef();
                        bwf<Float> bwfVar = g1k0Var.b;
                        float floatValue = bwfVar.getStart().floatValue();
                        float floatValue2 = bwfVar.c().floatValue();
                        float f = swe0.f(g1k0Var.c(), bwfVar.getStart().floatValue(), bwfVar.c().floatValue());
                        float f2 = x0k0.a;
                        float f3 = floatValue2 - floatValue;
                        float f4 = swe0.f(f3 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : (f - floatValue) / f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                        if (!epx.a(f4, rl3.M(fArr))) {
                            epx.a(f4, fArr.length == 0 ? null : Float.valueOf(fArr[fArr.length - 1]));
                        }
                        N2.g0(x0k0.d);
                        if (g1k0Var.l == orientation2) {
                            i = Math.max(N2.b, N.b);
                            int i6 = N.c;
                            int i7 = N2.c;
                            max = i6 + i7;
                            i2 = (i - N2.b) / 2;
                            i3 = i6 / 2;
                            b = (i - N.b) / 2;
                            ref$IntRef.element = an10.b(i7 * f4);
                        } else {
                            i = N.b + N2.b;
                            max = Math.max(N2.c, N.c);
                            i2 = N.b / 2;
                            i3 = (max - N2.c) / 2;
                            b = an10.b(N2.b * f4);
                            ref$IntRef.element = (max - N.c) / 2;
                        }
                        final int i8 = i3;
                        final int i9 = i2;
                        final int i10 = b;
                        ((wak0) g1k0Var.g).C(i);
                        ((wak0) g1k0Var.h).C(max);
                        return ep10Var.Q(i, max, jgp.b, new izs() { // from class: xsna.y0k0
                            @Override // xsna.izs
                            public final Object invoke(Object obj) {
                                tra0.a aVar = (tra0.a) obj;
                                tra0.a.x(aVar, tra0.this, i9, i8);
                                tra0.a.x(aVar, N, i10, ref$IntRef.element);
                                return s3q0.a;
                            }
                        });
                    }
                }
                hgz.c("Collection contains no element matching the predicate.");
                throw new KotlinNothingValueException();
            }
        }
        hgz.c("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }
}
