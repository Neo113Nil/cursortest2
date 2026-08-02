package defpackage;

import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.ShapeStroke$LineCapType;
import com.airbnb.lottie.model.content.ShapeStroke$LineJoinType;
import com.airbnb.lottie.parser.moshi.c;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes10.dex */
public abstract class mzt {
    public static final hzk a = hzk.n("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");
    public static final hzk b = hzk.n("p", "k");
    public static final hzk c = hzk.n("n", "v");

    public static kzt a(c cVar, nsz nszVar) {
        GradientType gradientType;
        ae2 ae2Var;
        String str;
        ArrayList arrayList = new ArrayList();
        GradientType gradientType2 = null;
        String str2 = null;
        ce2 ce2Var = null;
        ae2 ae2Var2 = null;
        ae2 ae2Var3 = null;
        be2 be2Var = null;
        ShapeStroke$LineCapType shapeStroke$LineCapType = null;
        ShapeStroke$LineJoinType shapeStroke$LineJoinType = null;
        be2 be2Var2 = null;
        float f = 0.0f;
        boolean z = false;
        ae2 ae2Var4 = null;
        while (cVar.hasNext()) {
            switch (cVar.o(a)) {
                case 0:
                    str2 = cVar.nextString();
                    gradientType2 = gradientType2;
                    break;
                case 1:
                    gradientType = gradientType2;
                    ae2Var = ae2Var4;
                    str = str2;
                    cVar.c();
                    int i = -1;
                    while (cVar.hasNext()) {
                        int o = cVar.o(b);
                        if (o == 0) {
                            i = cVar.nextInt();
                        } else if (o != 1) {
                            cVar.v();
                            cVar.skipValue();
                        } else {
                            ce2Var = new ce2(ukx.a(cVar, nszVar, 1.0f, new dn60(i, 4, (byte) 0), false));
                        }
                    }
                    cVar.e();
                    gradientType2 = gradientType;
                    ae2Var4 = ae2Var;
                    str2 = str;
                    break;
                case 2:
                    ae2Var4 = bb1.D(cVar, nszVar);
                    break;
                case 3:
                    ae2Var = ae2Var4;
                    str = str2;
                    gradientType2 = cVar.nextInt() == 1 ? GradientType.LINEAR : GradientType.RADIAL;
                    ae2Var4 = ae2Var;
                    str2 = str;
                    break;
                case 4:
                    ae2Var2 = bb1.E(cVar, nszVar);
                    break;
                case 5:
                    ae2Var3 = bb1.E(cVar, nszVar);
                    break;
                case 6:
                    str = str2;
                    be2Var = bb1.C(cVar, nszVar, true);
                    str2 = str;
                    break;
                case 7:
                    gradientType = gradientType2;
                    ae2Var = ae2Var4;
                    str = str2;
                    shapeStroke$LineCapType = ShapeStroke$LineCapType.values()[cVar.nextInt() - 1];
                    gradientType2 = gradientType;
                    ae2Var4 = ae2Var;
                    str2 = str;
                    break;
                case 8:
                    gradientType = gradientType2;
                    ae2Var = ae2Var4;
                    str = str2;
                    shapeStroke$LineJoinType = ShapeStroke$LineJoinType.values()[cVar.nextInt() - 1];
                    gradientType2 = gradientType;
                    ae2Var4 = ae2Var;
                    str2 = str;
                    break;
                case 9:
                    f = (float) cVar.nextDouble();
                    gradientType2 = gradientType2;
                    ae2Var4 = ae2Var4;
                    break;
                case 10:
                    z = cVar.nextBoolean();
                    break;
                case 11:
                    cVar.a();
                    while (cVar.hasNext()) {
                        cVar.c();
                        GradientType gradientType3 = gradientType2;
                        be2 be2Var3 = null;
                        String str3 = null;
                        while (cVar.hasNext()) {
                            ae2 ae2Var5 = ae2Var4;
                            int o2 = cVar.o(c);
                            if (o2 != 0) {
                                String str4 = str2;
                                if (o2 != 1) {
                                    cVar.v();
                                    cVar.skipValue();
                                } else {
                                    be2Var3 = bb1.C(cVar, nszVar, true);
                                }
                                ae2Var4 = ae2Var5;
                                str2 = str4;
                            } else {
                                str3 = cVar.nextString();
                                ae2Var4 = ae2Var5;
                            }
                        }
                        ae2 ae2Var6 = ae2Var4;
                        String str5 = str2;
                        cVar.e();
                        if (str3.equals("o")) {
                            be2Var2 = be2Var3;
                        } else if (str3.equals("d") || str3.equals("g")) {
                            arrayList.add(be2Var3);
                        }
                        gradientType2 = gradientType3;
                        ae2Var4 = ae2Var6;
                        str2 = str5;
                    }
                    gradientType = gradientType2;
                    ae2Var = ae2Var4;
                    str = str2;
                    cVar.d();
                    if (arrayList.size() == 1) {
                        arrayList.add((be2) arrayList.get(0));
                    }
                    gradientType2 = gradientType;
                    ae2Var4 = ae2Var;
                    str2 = str;
                    break;
                default:
                    cVar.v();
                    cVar.skipValue();
                    break;
            }
        }
        ae2 ae2Var7 = ae2Var4;
        return new kzt(str2, gradientType2, ce2Var, ae2Var7 == null ? new ae2(Collections.singletonList(new rkx(100)), 1) : ae2Var7, ae2Var2, ae2Var3, be2Var, shapeStroke$LineCapType, shapeStroke$LineJoinType, f, arrayList, be2Var2, z);
    }
}
