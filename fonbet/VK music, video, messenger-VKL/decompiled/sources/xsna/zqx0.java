package xsna;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: WindowInsetsRulers.kt */
/* loaded from: classes11.dex */
public interface zqx0 {
    public static final a a = a.a;

    /* compiled from: WindowInsetsRulers.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final arx0 b;
        public static final arx0 c;
        public static final arx0 d;
        public static final arx0 e;
        public static final arx0 f;
        public static final arx0 g;
        public static final arx0 h;
        public static final arx0 i;
        public static final arx0 j;

        static {
            arx0 arx0Var = new arx0("caption bar");
            b = arx0Var;
            arx0 arx0Var2 = new arx0("display cutout");
            c = arx0Var2;
            arx0 arx0Var3 = new arx0("ime");
            d = arx0Var3;
            arx0 arx0Var4 = new arx0("mandatory system gestures");
            e = arx0Var4;
            arx0 arx0Var5 = new arx0("navigation bars");
            f = arx0Var5;
            arx0 arx0Var6 = new arx0("status bars");
            g = arx0Var6;
            char c2 = 2;
            zqx0[] zqx0VarArr = {arx0Var6, arx0Var5, arx0Var};
            ArrayList arrayList = new ArrayList(3);
            for (int i2 = 0; i2 < 3; i2++) {
                arrayList.add(zqx0VarArr[i2].a());
            }
            iif0[] iif0VarArr = (iif0[]) arrayList.toArray(new iif0[0]);
            new b1x((iif0[]) Arrays.copyOf(iif0VarArr, iif0VarArr.length));
            ArrayList arrayList2 = new ArrayList(3);
            for (int i3 = 0; i3 < 3; i3++) {
                arrayList2.add(zqx0VarArr[i3].b());
            }
            iif0[] iif0VarArr2 = (iif0[]) arrayList2.toArray(new iif0[0]);
            new b1x((iif0[]) Arrays.copyOf(iif0VarArr2, iif0VarArr2.length));
            arx0 arx0Var7 = new arx0("system gestures");
            h = arx0Var7;
            arx0 arx0Var8 = new arx0("tappable element");
            i = arx0Var8;
            arx0 arx0Var9 = new arx0(com.ironsource.mediationsdk.d.h);
            j = arx0Var9;
            zqx0[] zqx0VarArr2 = {arx0Var6, arx0Var5, arx0Var, arx0Var2, arx0Var3, arx0Var8};
            ArrayList arrayList3 = new ArrayList(6);
            int i4 = 0;
            while (i4 < 6) {
                arrayList3.add(zqx0VarArr2[i4].a());
                i4++;
                c2 = c2;
            }
            char c3 = c2;
            iif0[] iif0VarArr3 = (iif0[]) arrayList3.toArray(new iif0[0]);
            new b1x((iif0[]) Arrays.copyOf(iif0VarArr3, iif0VarArr3.length));
            ArrayList arrayList4 = new ArrayList(6);
            for (int i5 = 0; i5 < 6; i5++) {
                arrayList4.add(zqx0VarArr2[i5].b());
            }
            iif0[] iif0VarArr4 = (iif0[]) arrayList4.toArray(new iif0[0]);
            new b1x((iif0[]) Arrays.copyOf(iif0VarArr4, iif0VarArr4.length));
            zqx0[] zqx0VarArr3 = new zqx0[4];
            zqx0VarArr3[0] = arx0Var4;
            zqx0VarArr3[1] = arx0Var7;
            zqx0VarArr3[c3] = arx0Var8;
            zqx0VarArr3[3] = arx0Var9;
            ArrayList arrayList5 = new ArrayList(4);
            for (int i6 = 0; i6 < 4; i6++) {
                arrayList5.add(zqx0VarArr3[i6].a());
            }
            iif0[] iif0VarArr5 = (iif0[]) arrayList5.toArray(new iif0[0]);
            new b1x((iif0[]) Arrays.copyOf(iif0VarArr5, iif0VarArr5.length));
            ArrayList arrayList6 = new ArrayList(4);
            for (int i7 = 0; i7 < 4; i7++) {
                arrayList6.add(zqx0VarArr3[i7].b());
            }
            iif0[] iif0VarArr6 = (iif0[]) arrayList6.toArray(new iif0[0]);
            new b1x((iif0[]) Arrays.copyOf(iif0VarArr6, iif0VarArr6.length));
            zqx0[] zqx0VarArr4 = new zqx0[9];
            zqx0VarArr4[0] = arx0Var6;
            zqx0VarArr4[1] = arx0Var5;
            zqx0VarArr4[c3] = arx0Var;
            zqx0VarArr4[3] = arx0Var3;
            zqx0VarArr4[4] = arx0Var7;
            zqx0VarArr4[5] = arx0Var4;
            zqx0VarArr4[6] = arx0Var8;
            zqx0VarArr4[7] = arx0Var2;
            zqx0VarArr4[8] = arx0Var9;
            ArrayList arrayList7 = new ArrayList(9);
            for (int i8 = 0; i8 < 9; i8++) {
                arrayList7.add(zqx0VarArr4[i8].a());
            }
            iif0[] iif0VarArr7 = (iif0[]) arrayList7.toArray(new iif0[0]);
            new b1x((iif0[]) Arrays.copyOf(iif0VarArr7, iif0VarArr7.length));
            ArrayList arrayList8 = new ArrayList(9);
            for (int i9 = 0; i9 < 9; i9++) {
                arrayList8.add(zqx0VarArr4[i9].b());
            }
            iif0[] iif0VarArr8 = (iif0[]) arrayList8.toArray(new iif0[0]);
            new b1x((iif0[]) Arrays.copyOf(iif0VarArr8, iif0VarArr8.length));
        }
    }

    iif0 a();

    iif0 b();
}
