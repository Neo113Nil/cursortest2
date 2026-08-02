package defpackage;

import android.graphics.Color;
import android.view.animation.Interpolator;
import com.airbnb.lottie.model.content.LBlendMode;
import com.airbnb.lottie.model.content.Mask$MaskMode;
import com.airbnb.lottie.model.layer.Layer$LayerType;
import com.airbnb.lottie.model.layer.Layer$MatteType;
import com.airbnb.lottie.parser.moshi.c;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class pxx {
    public static final hzk a = hzk.n("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");
    public static final hzk b = hzk.n("d", "a");
    public static final hzk c = hzk.n("ty", "nm");

    public static mxx a(c cVar, nsz nszVar) {
        boolean z;
        String str;
        String str2;
        Float f;
        boolean z2;
        float f2;
        Float f3;
        char c2;
        String str3;
        Mask$MaskMode mask$MaskMode;
        float f4;
        Float valueOf = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(1.0f);
        Layer$MatteType layer$MatteType = Layer$MatteType.NONE;
        LBlendMode lBlendMode = LBlendMode.NORMAL;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        cVar.c();
        boolean z3 = false;
        Layer$MatteType layer$MatteType2 = layer$MatteType;
        LBlendMode lBlendMode2 = lBlendMode;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        boolean z4 = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z5 = false;
        ge2 ge2Var = null;
        Layer$LayerType layer$LayerType = null;
        String str4 = null;
        cot cotVar = null;
        oo2 oo2Var = null;
        ae2 ae2Var = null;
        lb7 lb7Var = null;
        be2 be2Var = null;
        float f10 = 1.0f;
        long j = 0;
        String str5 = null;
        String str6 = "UNSET";
        long j2 = -1;
        while (cVar.hasNext()) {
            switch (cVar.o(a)) {
                case 0:
                    str2 = str5;
                    str6 = cVar.nextString();
                    str5 = str2;
                    break;
                case 1:
                    f = valueOf;
                    str2 = str5;
                    j = cVar.nextInt();
                    valueOf = f;
                    str5 = str2;
                    break;
                case 2:
                    str2 = str5;
                    str4 = cVar.nextString();
                    str5 = str2;
                    break;
                case 3:
                    f = valueOf;
                    str2 = str5;
                    z2 = z3;
                    f2 = f10;
                    int nextInt = cVar.nextInt();
                    layer$LayerType = Layer$LayerType.UNKNOWN;
                    if (nextInt < layer$LayerType.ordinal()) {
                        layer$LayerType = Layer$LayerType.values()[nextInt];
                    }
                    z3 = z2;
                    f10 = f2;
                    valueOf = f;
                    str5 = str2;
                    break;
                case 4:
                    f = valueOf;
                    str2 = str5;
                    j2 = cVar.nextInt();
                    valueOf = f;
                    str5 = str2;
                    break;
                case 5:
                    f = valueOf;
                    str2 = str5;
                    i = (int) (zw21.c() * cVar.nextInt());
                    valueOf = f;
                    str5 = str2;
                    break;
                case 6:
                    f = valueOf;
                    str2 = str5;
                    i2 = (int) (zw21.c() * cVar.nextInt());
                    valueOf = f;
                    str5 = str2;
                    break;
                case 7:
                    f = valueOf;
                    str2 = str5;
                    i3 = Color.parseColor(cVar.nextString());
                    valueOf = f;
                    str5 = str2;
                    break;
                case 8:
                    str2 = str5;
                    ge2Var = he2.c(cVar, nszVar);
                    str5 = str2;
                    break;
                case 9:
                    f = valueOf;
                    str2 = str5;
                    z2 = z3;
                    f2 = f10;
                    int nextInt2 = cVar.nextInt();
                    if (nextInt2 >= Layer$MatteType.values().length) {
                        nszVar.a("Unsupported matte type: " + nextInt2);
                    } else {
                        layer$MatteType2 = Layer$MatteType.values()[nextInt2];
                        int i4 = oxx.a[layer$MatteType2.ordinal()];
                        if (i4 == 1) {
                            nszVar.a("Unsupported matte type: Luma");
                        } else if (i4 == 2) {
                            nszVar.a("Unsupported matte type: Luma Inverted");
                        }
                        nszVar.o++;
                    }
                    z3 = z2;
                    f10 = f2;
                    valueOf = f;
                    str5 = str2;
                    break;
                case 10:
                    f2 = f10;
                    cVar.a();
                    while (cVar.hasNext()) {
                        cVar.c();
                        Mask$MaskMode mask$MaskMode2 = null;
                        ae2 ae2Var2 = null;
                        ae2 ae2Var3 = null;
                        boolean z6 = false;
                        while (cVar.hasNext()) {
                            String nextName = cVar.nextName();
                            nextName.getClass();
                            switch (nextName.hashCode()) {
                                case 111:
                                    f3 = valueOf;
                                    if (nextName.equals("o")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 3588:
                                    f3 = valueOf;
                                    if (nextName.equals("pt")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 104433:
                                    f3 = valueOf;
                                    if (nextName.equals("inv")) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 3357091:
                                    f3 = valueOf;
                                    if (nextName.equals("mode")) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                default:
                                    f3 = valueOf;
                                    c2 = 65535;
                                    break;
                            }
                            switch (c2) {
                                case 0:
                                    str3 = str5;
                                    ae2Var2 = bb1.D(cVar, nszVar);
                                    break;
                                case 1:
                                    str3 = str5;
                                    ae2Var3 = new ae2(ukx.a(cVar, nszVar, zw21.c(), mhr0.a, false), 4);
                                    break;
                                case 2:
                                    z6 = cVar.nextBoolean();
                                    str3 = str5;
                                    break;
                                case 3:
                                    String nextString = cVar.nextString();
                                    nextString.getClass();
                                    switch (nextString) {
                                        case "a":
                                            mask$MaskMode = Mask$MaskMode.MASK_MODE_ADD;
                                            break;
                                        case "i":
                                            nszVar.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                            mask$MaskMode = Mask$MaskMode.MASK_MODE_INTERSECT;
                                            break;
                                        case "n":
                                            mask$MaskMode = Mask$MaskMode.MASK_MODE_NONE;
                                            break;
                                        case "s":
                                            mask$MaskMode = Mask$MaskMode.MASK_MODE_SUBTRACT;
                                            break;
                                        default:
                                            lgz.b("Unknown mask mode " + nextName + ". Defaulting to Add.");
                                            mask$MaskMode = Mask$MaskMode.MASK_MODE_ADD;
                                            break;
                                    }
                                    mask$MaskMode2 = mask$MaskMode;
                                    str3 = str5;
                                    break;
                                default:
                                    cVar.skipValue();
                                    str3 = str5;
                                    break;
                            }
                            valueOf = f3;
                            str5 = str3;
                        }
                        cVar.e();
                        arrayList.add(new cy00(mask$MaskMode2, ae2Var3, ae2Var2, z6));
                        valueOf = valueOf;
                        str5 = str5;
                    }
                    f = valueOf;
                    str2 = str5;
                    z2 = false;
                    nszVar.o += arrayList.size();
                    cVar.d();
                    z3 = z2;
                    f10 = f2;
                    valueOf = f;
                    str5 = str2;
                    break;
                case 11:
                    f2 = f10;
                    cVar.a();
                    while (cVar.hasNext()) {
                        ehe a2 = fhe.a(cVar, nszVar);
                        if (a2 != null) {
                            arrayList2.add(a2);
                        }
                    }
                    cVar.d();
                    f = valueOf;
                    str2 = str5;
                    z2 = false;
                    z3 = z2;
                    f10 = f2;
                    valueOf = f;
                    str5 = str2;
                    break;
                case 12:
                    f4 = f10;
                    cVar.c();
                    while (cVar.hasNext()) {
                        int o = cVar.o(b);
                        if (o == 0) {
                            ae2Var = new ae2(ukx.a(cVar, nszVar, zw21.c(), rxl.a, false), 5);
                        } else if (o != 1) {
                            cVar.v();
                            cVar.skipValue();
                        } else {
                            cVar.a();
                            if (cVar.hasNext()) {
                                lb7Var = fe2.a(cVar, nszVar);
                            }
                            while (cVar.hasNext()) {
                                cVar.skipValue();
                            }
                            cVar.d();
                        }
                    }
                    cVar.e();
                    f10 = f4;
                    z3 = false;
                    break;
                case 13:
                    f4 = f10;
                    cVar.a();
                    ArrayList arrayList3 = new ArrayList();
                    while (cVar.hasNext()) {
                        cVar.c();
                        while (cVar.hasNext()) {
                            int o2 = cVar.o(c);
                            if (o2 == 0) {
                                int nextInt3 = cVar.nextInt();
                                if (nextInt3 == 29) {
                                    cotVar = b76.a(cVar, nszVar);
                                } else if (nextInt3 == 25) {
                                    oo2Var = new zmm().a(cVar, nszVar);
                                }
                            } else if (o2 != 1) {
                                cVar.v();
                                cVar.skipValue();
                            } else {
                                arrayList3.add(cVar.nextString());
                            }
                        }
                        cVar.e();
                    }
                    cVar.d();
                    nszVar.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList3);
                    f10 = f4;
                    z3 = false;
                    break;
                case 14:
                    f10 = (float) cVar.nextDouble();
                    z3 = false;
                    break;
                case 15:
                    f9 = (float) cVar.nextDouble();
                    z3 = false;
                    break;
                case 16:
                    f4 = f10;
                    f7 = (float) (cVar.nextDouble() * zw21.c());
                    f10 = f4;
                    z3 = false;
                    break;
                case 17:
                    f4 = f10;
                    f8 = (float) (cVar.nextDouble() * zw21.c());
                    f10 = f4;
                    z3 = false;
                    break;
                case 18:
                    f5 = (float) cVar.nextDouble();
                    break;
                case 19:
                    f6 = (float) cVar.nextDouble();
                    break;
                case 20:
                    be2Var = bb1.C(cVar, nszVar, z3);
                    break;
                case 21:
                    str5 = cVar.nextString();
                    break;
                case 22:
                    z5 = cVar.nextBoolean();
                    break;
                case 23:
                    if (cVar.nextInt() != 1) {
                        z4 = z3;
                        break;
                    } else {
                        z4 = true;
                        break;
                    }
                case 24:
                    int nextInt4 = cVar.nextInt();
                    if (nextInt4 < LBlendMode.values().length) {
                        lBlendMode2 = LBlendMode.values()[nextInt4];
                        break;
                    } else {
                        nszVar.a("Unsupported Blend Mode: " + nextInt4);
                        lBlendMode2 = LBlendMode.NORMAL;
                        break;
                    }
                default:
                    cVar.v();
                    cVar.skipValue();
                    f = valueOf;
                    str2 = str5;
                    z2 = z3;
                    f2 = f10;
                    z3 = z2;
                    f10 = f2;
                    valueOf = f;
                    str5 = str2;
                    break;
            }
        }
        Float f11 = valueOf;
        String str7 = str5;
        float f12 = f10;
        cVar.e();
        ArrayList arrayList4 = new ArrayList();
        if (f5 > 0.0f) {
            z = z4;
            str = str7;
            arrayList4.add(new rkx(nszVar, f11, f11, (Interpolator) null, 0.0f, Float.valueOf(f5)));
        } else {
            z = z4;
            str = str7;
        }
        if (f6 <= 0.0f) {
            f6 = nszVar.m;
        }
        arrayList4.add(new rkx(nszVar, valueOf2, valueOf2, (Interpolator) null, f5, Float.valueOf(f6)));
        arrayList4.add(new rkx(nszVar, f11, f11, (Interpolator) null, f6, Float.valueOf(Float.MAX_VALUE)));
        if (str6.endsWith(".ai") || "ai".equals(str)) {
            nszVar.a("Convert your Illustrator layers to shape layers.");
        }
        if (z) {
            ge2 ge2Var2 = ge2Var == null ? new ge2() : ge2Var;
            ge2Var2.m = z;
            ge2Var = ge2Var2;
        }
        return new mxx(arrayList2, nszVar, str6, j, layer$LayerType, j2, str4, arrayList, ge2Var, i, i2, i3, f12, f9, f7, f8, ae2Var, lb7Var, arrayList4, layer$MatteType2, be2Var, z5, cotVar, oo2Var, lBlendMode2);
    }
}
