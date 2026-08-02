package androidx.compose.ui.platform;

import defpackage.ae00;
import defpackage.t18;
import defpackage.wx40;
import defpackage.xy40;
import defpackage.y5w;
import defpackage.yey;
import defpackage.yr31;

/* loaded from: classes.dex */
public final class o extends yr31 {
    public final wx40 b = y5w.a();

    public static final class a {
        public final yey a;
        public final yey b;
        public boolean c;
        public t18 d;

        public a() {
            yey yeyVar = new yey(0);
            this.a = yeyVar;
            this.b = yeyVar;
        }
    }

    @Override // defpackage.yr31
    public final void V() {
        wx40 wx40Var = this.b;
        int[] iArr = wx40Var.b;
        Object[] objArr = wx40Var.c;
        long[] jArr = wx40Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        xy40 xy40Var = (xy40) objArr[i4];
                        Object[] objArr2 = xy40Var.a;
                        int i6 = xy40Var.b;
                        for (int i7 = 0; i7 < i6; i7++) {
                            a aVar = (a) objArr2[i7];
                            t18 t18Var = aVar.d;
                            if (t18Var != null) {
                                t18Var.cancel();
                            }
                            aVar.d = null;
                            ae00 ae00Var = aVar.a.a;
                            ae00Var.b = true;
                            ae00Var.a = false;
                            ae00Var.a();
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
