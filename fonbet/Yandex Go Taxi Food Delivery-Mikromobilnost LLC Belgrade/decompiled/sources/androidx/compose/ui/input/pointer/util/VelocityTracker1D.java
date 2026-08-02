package androidx.compose.ui.input.pointer.util;

import defpackage.ixv;
import defpackage.k4o;
import defpackage.ny61;
import defpackage.qa91;
import defpackage.w511;
import defpackage.yog;
import kotlin.Metadata;

/* loaded from: classes10.dex */
public final class VelocityTracker1D {
    public final boolean a;
    public final Strategy b;
    public final int c;
    public final yog[] d;
    public int e;
    public final float[] f;
    public final float[] g;
    public final float[] h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;", "", "Lsq2", "Impulse", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Strategy {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Strategy[] $VALUES;
        public static final Strategy Impulse;
        public static final Strategy Lsq2;

        static {
            Strategy strategy = new Strategy("Lsq2", 0);
            Lsq2 = strategy;
            Strategy strategy2 = new Strategy("Impulse", 1);
            Impulse = strategy2;
            Strategy[] strategyArr = {strategy, strategy2};
            $VALUES = strategyArr;
            $ENTRIES = kotlin.enums.a.a(strategyArr);
        }

        public static Strategy valueOf(String str) {
            return (Strategy) Enum.valueOf(Strategy.class, str);
        }

        public static Strategy[] values() {
            return (Strategy[]) $VALUES.clone();
        }
    }

    public VelocityTracker1D(boolean z, Strategy strategy) {
        this.a = z;
        this.b = strategy;
        if (z && strategy.equals(Strategy.Lsq2)) {
            ny61.r("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int i = b.a[strategy.ordinal()];
        int i2 = 2;
        if (i != 1) {
            if (i != 2) {
                w511.b();
                throw null;
            }
            i2 = 3;
        }
        this.c = i2;
        this.d = new yog[20];
        this.f = new float[20];
        this.g = new float[20];
        this.h = new float[3];
    }

    public final void a(float f, long j) {
        int i = (this.e + 1) % 20;
        this.e = i;
        yog[] yogVarArr = this.d;
        yog yogVar = yogVarArr[i];
        if (yogVar != null) {
            yogVar.a = j;
            yogVar.b = f;
        } else {
            yog yogVar2 = new yog();
            yogVar2.a = j;
            yogVar2.b = f;
            yogVarArr[i] = yogVar2;
        }
    }

    public final float b(float f) {
        Strategy strategy;
        float[] fArr;
        float[] fArr2;
        float f2;
        boolean z;
        int i;
        float f3;
        float signum;
        float f4 = 0.0f;
        if (f <= 0.0f) {
            ixv.b("maximumVelocity should be a positive value. You specified=" + f);
        }
        int i2 = this.e;
        yog[] yogVarArr = this.d;
        yog yogVar = yogVarArr[i2];
        if (yogVar == null) {
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            int i3 = 0;
            yog yogVar2 = yogVar;
            while (true) {
                yog yogVar3 = yogVarArr[i2];
                boolean z2 = this.a;
                strategy = this.b;
                fArr = this.f;
                fArr2 = this.g;
                if (yogVar3 != null) {
                    long j = yogVar.a;
                    f2 = f4;
                    int i4 = i2;
                    long j2 = yogVar3.a;
                    float f5 = j - j2;
                    z = z2;
                    i = 1;
                    float abs = Math.abs(j2 - yogVar2.a);
                    yogVar2 = (strategy == Strategy.Lsq2 || z) ? yogVar3 : yogVar;
                    if (f5 > 100.0f || abs > 40.0f) {
                        break;
                    }
                    fArr[i3] = yogVar3.b;
                    fArr2[i3] = -f5;
                    i2 = (i4 == 0 ? 20 : i4) - 1;
                    i3++;
                    if (i3 >= 20) {
                        break;
                    }
                    f4 = f2;
                } else {
                    f2 = f4;
                    z = z2;
                    i = 1;
                    break;
                }
            }
            if (i3 >= this.c) {
                int i5 = b.a[strategy.ordinal()];
                if (i5 == i) {
                    int i6 = i3 - i;
                    float f6 = fArr2[i6];
                    int i7 = i6;
                    float f7 = f2;
                    while (i7 > 0) {
                        int i8 = i7 - 1;
                        float f8 = fArr2[i8];
                        if (f6 != f8) {
                            float f9 = (z ? -fArr[i8] : fArr[i7] - fArr[i8]) / (f6 - f8);
                            f7 += Math.abs(f9) * (f9 - (Math.signum(f7) * ((float) Math.sqrt(Math.abs(f7) * 2.0f))));
                            if (i7 == i6) {
                                f7 *= 0.5f;
                            }
                        }
                        i7--;
                        f6 = f8;
                    }
                    signum = Math.signum(f7) * ((float) Math.sqrt(Math.abs(f7) * 2.0f));
                } else {
                    if (i5 != 2) {
                        w511.b();
                        return f2;
                    }
                    try {
                        float[] fArr3 = this.h;
                        qa91.e(fArr2, fArr, i3, fArr3);
                        signum = fArr3[i];
                    } catch (IllegalArgumentException unused) {
                        signum = f2;
                    }
                }
                f3 = signum * 1000.0f;
            } else {
                f3 = f2;
            }
        }
        if (f3 == f2 || Float.isNaN(f3)) {
            return f2;
        }
        if (f3 <= f2) {
            float f10 = -f;
            if (f3 < f10) {
                return f10;
            }
        } else if (f3 > f) {
            f3 = f;
        }
        return f3;
    }

    public VelocityTracker1D() {
        this((Strategy) null, 3);
    }

    public /* synthetic */ VelocityTracker1D(Strategy strategy, int i) {
        this(false, (i & 2) != 0 ? Strategy.Lsq2 : strategy);
    }

    public VelocityTracker1D(int i) {
        this(true, Strategy.Impulse);
    }
}
