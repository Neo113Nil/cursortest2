package xsna;

import android.graphics.Color;
import android.view.animation.Interpolator;
import com.airbnb.lottie.model.content.LBlendMode;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.content.TextRangeUnits;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.ironsource.B5;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import ru.ok.android.utils.Logger;
import ru.ok.tracer.base.ucum.UcumUtils;

/* compiled from: LayerParser.java */
/* loaded from: classes12.dex */
public final class iny {
    public static final JsonReader.a a = JsonReader.a.a("nm", "ind", "refId", "ty", "parent", "sw", com.mbridge.msdk.foundation.entity.b.JSON_KEY_SH, "sc", "ks", TtmlNode.TAG_TT, "masksProperties", "shapes", "t", "ef", "sr", "st", Logger.METHOD_W, "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");
    public static final JsonReader.a b = JsonReader.a.a("d", "a");
    public static final JsonReader.a c = JsonReader.a.a("ty", "nm");

    /* compiled from: LayerParser.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            a = iArr;
            try {
                iArr[Layer.MatteType.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Layer.MatteType.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v37 */
    /* JADX WARN: Type inference failed for: r15v40 */
    /* JADX WARN: Type inference failed for: r15v43 */
    /* JADX WARN: Type inference failed for: r15v46 */
    /* JADX WARN: Type inference failed for: r15v49 */
    /* JADX WARN: Type inference failed for: r15v50 */
    /* JADX WARN: Type inference failed for: r15v56 */
    public static Layer a(com.airbnb.lottie.parser.moshi.a aVar, i700 i700Var) throws IOException {
        boolean z;
        String str;
        Float f;
        String str2;
        float f2;
        char c2;
        char c3;
        Float f3;
        float f4;
        String str3;
        Float f5;
        nf2 nf2Var;
        nf2 nf2Var2;
        nf2 nf2Var3;
        ?? r15;
        float f6;
        Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Float valueOf2 = Float.valueOf(1.0f);
        Layer.MatteType matteType = Layer.MatteType.NONE;
        LBlendMode lBlendMode = LBlendMode.NORMAL;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        aVar.beginObject();
        boolean z2 = false;
        Layer.MatteType matteType2 = matteType;
        LBlendMode lBlendMode2 = lBlendMode;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        boolean z3 = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z4 = false;
        dg2 dg2Var = null;
        Layer.LayerType layerType = null;
        String str4 = null;
        qus qusVar = null;
        m22 m22Var = null;
        yf2 yf2Var = null;
        zf2 zf2Var = null;
        nf2 nf2Var4 = null;
        float f12 = 1.0f;
        long j = 0;
        String str5 = null;
        String str6 = "UNSET";
        long j2 = -1;
        while (aVar.hasNext()) {
            boolean z5 = true;
            switch (aVar.s(a)) {
                case 0:
                    str6 = aVar.p();
                    break;
                case 1:
                    f = valueOf;
                    str2 = str5;
                    j = aVar.o();
                    str5 = str2;
                    valueOf = f;
                    break;
                case 2:
                    str4 = aVar.p();
                    break;
                case 3:
                    f = valueOf;
                    str2 = str5;
                    f2 = f12;
                    int o = aVar.o();
                    layerType = Layer.LayerType.UNKNOWN;
                    if (o < layerType.ordinal()) {
                        layerType = Layer.LayerType.values()[o];
                    }
                    f12 = f2;
                    str5 = str2;
                    valueOf = f;
                    break;
                case 4:
                    f = valueOf;
                    j2 = aVar.o();
                    valueOf = f;
                    break;
                case 5:
                    f = valueOf;
                    str2 = str5;
                    i = (int) (b3r0.c() * aVar.o());
                    str5 = str2;
                    valueOf = f;
                    break;
                case 6:
                    f = valueOf;
                    str2 = str5;
                    i2 = (int) (b3r0.c() * aVar.o());
                    str5 = str2;
                    valueOf = f;
                    break;
                case 7:
                    f = valueOf;
                    i3 = Color.parseColor(aVar.p());
                    valueOf = f;
                    break;
                case 8:
                    dg2Var = eg2.c(aVar, i700Var);
                    break;
                case 9:
                    f = valueOf;
                    str2 = str5;
                    f2 = f12;
                    int o2 = aVar.o();
                    if (o2 >= Layer.MatteType.values().length) {
                        i700Var.a("Unsupported matte type: " + o2);
                    } else {
                        matteType2 = Layer.MatteType.values()[o2];
                        int i4 = a.a[matteType2.ordinal()];
                        if (i4 == 1) {
                            i700Var.a("Unsupported matte type: Luma");
                        } else if (i4 == 2) {
                            i700Var.a("Unsupported matte type: Luma Inverted");
                        }
                        i700Var.o++;
                    }
                    f12 = f2;
                    str5 = str2;
                    valueOf = f;
                    break;
                case 10:
                    f = valueOf;
                    str2 = str5;
                    f2 = f12;
                    aVar.beginArray();
                    while (aVar.hasNext()) {
                        aVar.beginObject();
                        Mask.MaskMode maskMode = null;
                        wf2 wf2Var = null;
                        pf2 pf2Var = null;
                        boolean z6 = false;
                        while (aVar.hasNext()) {
                            String A = aVar.A();
                            A.getClass();
                            switch (A.hashCode()) {
                                case 111:
                                    if (A.equals("o")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 3588:
                                    if (A.equals("pt")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 104433:
                                    if (A.equals("inv")) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 3357091:
                                    if (A.equals(X3.a.t)) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            switch (c2) {
                                case 0:
                                    pf2Var = r490.n(aVar, i700Var);
                                    break;
                                case 1:
                                    wf2Var = new wf2(rhy.a(aVar, i700Var, b3r0.c(), w5j0.b, false), 0);
                                    break;
                                case 2:
                                    z6 = aVar.m();
                                    break;
                                case 3:
                                    String p = aVar.p();
                                    p.getClass();
                                    switch (p.hashCode()) {
                                        case 97:
                                            if (p.equals("a")) {
                                                c3 = 0;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 105:
                                            if (p.equals("i")) {
                                                c3 = 1;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 110:
                                            if (p.equals(B5.q)) {
                                                c3 = 2;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case INVALID_INDEX_URL_VALUE:
                                            if (p.equals(UcumUtils.UCUM_SECONDS)) {
                                                c3 = 3;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        default:
                                            c3 = 65535;
                                            break;
                                    }
                                    switch (c3) {
                                        case 0:
                                            maskMode = Mask.MaskMode.MASK_MODE_ADD;
                                            break;
                                        case 1:
                                            i700Var.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                            maskMode = Mask.MaskMode.MASK_MODE_INTERSECT;
                                            break;
                                        case 2:
                                            maskMode = Mask.MaskMode.MASK_MODE_NONE;
                                            break;
                                        case 3:
                                            maskMode = Mask.MaskMode.MASK_MODE_SUBTRACT;
                                            break;
                                        default:
                                            n100.b("Unknown mask mode " + A + ". Defaulting to Add.");
                                            maskMode = Mask.MaskMode.MASK_MODE_ADD;
                                            break;
                                    }
                                    break;
                                default:
                                    aVar.skipValue();
                                    break;
                            }
                        }
                        aVar.endObject();
                        arrayList.add(new Mask(maskMode, wf2Var, pf2Var, z6));
                    }
                    z2 = false;
                    i700Var.o += arrayList.size();
                    aVar.endArray();
                    f12 = f2;
                    str5 = str2;
                    valueOf = f;
                    break;
                case 11:
                    f = valueOf;
                    str2 = str5;
                    f2 = f12;
                    aVar.beginArray();
                    while (aVar.hasNext()) {
                        eij a2 = fij.a(aVar, i700Var);
                        if (a2 != null) {
                            arrayList2.add(a2);
                        }
                    }
                    aVar.endArray();
                    z2 = false;
                    f12 = f2;
                    str5 = str2;
                    valueOf = f;
                    break;
                case 12:
                    f3 = valueOf;
                    f4 = f12;
                    aVar.beginObject();
                    while (aVar.hasNext()) {
                        int s = aVar.s(b);
                        if (s == 0) {
                            str3 = str5;
                            yf2Var = new yf2(rhy.a(aVar, i700Var, b3r0.c(), aun.b, false), 0);
                        } else if (s != 1) {
                            aVar.t();
                            aVar.skipValue();
                        } else {
                            aVar.beginArray();
                            if (aVar.hasNext()) {
                                JsonReader.a aVar2 = ag2.a;
                                aVar.beginObject();
                                cg2 cg2Var = null;
                                bg2 bg2Var = null;
                                while (aVar.hasNext()) {
                                    int s2 = aVar.s(ag2.a);
                                    if (s2 != 0) {
                                        boolean z7 = true;
                                        if (s2 != 1) {
                                            aVar.t();
                                            aVar.skipValue();
                                        } else {
                                            aVar.beginObject();
                                            mf2 mf2Var = null;
                                            mf2 mf2Var2 = null;
                                            nf2 nf2Var5 = null;
                                            nf2 nf2Var6 = null;
                                            pf2 pf2Var2 = null;
                                            while (aVar.hasNext()) {
                                                int s3 = aVar.s(ag2.c);
                                                if (s3 == 0) {
                                                    mf2Var = r490.k(aVar, i700Var);
                                                } else if (s3 == z7) {
                                                    mf2Var2 = r490.k(aVar, i700Var);
                                                } else if (s3 == 2) {
                                                    nf2Var5 = r490.l(aVar, i700Var, z7);
                                                } else if (s3 == 3) {
                                                    nf2Var6 = r490.l(aVar, i700Var, z7);
                                                } else if (s3 != 4) {
                                                    aVar.t();
                                                    aVar.skipValue();
                                                } else {
                                                    pf2Var2 = r490.n(aVar, i700Var);
                                                }
                                                z7 = true;
                                            }
                                            aVar.endObject();
                                            cg2Var = new cg2(mf2Var, mf2Var2, nf2Var5, nf2Var6, pf2Var2);
                                        }
                                    } else {
                                        aVar.beginObject();
                                        pf2 pf2Var3 = null;
                                        pf2 pf2Var4 = null;
                                        pf2 pf2Var5 = null;
                                        TextRangeUnits textRangeUnits = null;
                                        while (aVar.hasNext()) {
                                            int s4 = aVar.s(ag2.b);
                                            if (s4 != 0) {
                                                String str7 = str5;
                                                if (s4 == 1) {
                                                    pf2Var4 = r490.n(aVar, i700Var);
                                                } else if (s4 == 2) {
                                                    pf2Var5 = r490.n(aVar, i700Var);
                                                } else if (s4 != 3) {
                                                    aVar.t();
                                                    aVar.skipValue();
                                                } else {
                                                    int o3 = aVar.o();
                                                    int i5 = 1;
                                                    if (o3 != 1) {
                                                        if (o3 != 2) {
                                                            i700Var.a("Unsupported text range units: " + o3);
                                                            textRangeUnits = TextRangeUnits.INDEX;
                                                        } else {
                                                            i5 = 1;
                                                        }
                                                    }
                                                    textRangeUnits = o3 == i5 ? TextRangeUnits.PERCENT : TextRangeUnits.INDEX;
                                                }
                                                str5 = str7;
                                            } else {
                                                pf2Var3 = r490.n(aVar, i700Var);
                                            }
                                        }
                                        String str8 = str5;
                                        aVar.endObject();
                                        if (pf2Var3 == null && pf2Var4 != null) {
                                            pf2Var3 = new pf2(Collections.singletonList(new nhy(0)), 0);
                                        }
                                        bg2Var = new bg2(pf2Var3, pf2Var4, pf2Var5, textRangeUnits);
                                        str5 = str8;
                                    }
                                }
                                str3 = str5;
                                aVar.endObject();
                                zf2Var = new zf2(cg2Var, bg2Var);
                            } else {
                                str3 = str5;
                            }
                            while (aVar.hasNext()) {
                                aVar.skipValue();
                            }
                            aVar.endArray();
                        }
                        str5 = str3;
                    }
                    aVar.endObject();
                    f12 = f4;
                    valueOf = f3;
                    z2 = false;
                    break;
                case 13:
                    f4 = f12;
                    aVar.beginArray();
                    ArrayList arrayList3 = new ArrayList();
                    while (aVar.hasNext()) {
                        aVar.beginObject();
                        while (aVar.hasNext()) {
                            int s5 = aVar.s(c);
                            if (s5 == 0) {
                                int o4 = aVar.o();
                                if (o4 == 29) {
                                    JsonReader.a aVar3 = sg7.a;
                                    qusVar = null;
                                    while (aVar.hasNext()) {
                                        if (aVar.s(sg7.a) != 0) {
                                            aVar.t();
                                            aVar.skipValue();
                                        } else {
                                            aVar.beginArray();
                                            while (aVar.hasNext()) {
                                                aVar.beginObject();
                                                boolean z8 = false;
                                                qus qusVar2 = null;
                                                while (aVar.hasNext()) {
                                                    int s6 = aVar.s(sg7.b);
                                                    if (s6 == 0) {
                                                        z8 = aVar.o() == 0 ? z5 : false;
                                                    } else if (s6 != z5) {
                                                        aVar.t();
                                                        aVar.skipValue();
                                                    } else if (z8) {
                                                        qusVar2 = new qus(r490.l(aVar, i700Var, z5));
                                                    } else {
                                                        aVar.skipValue();
                                                    }
                                                }
                                                aVar.endObject();
                                                if (qusVar2 != null) {
                                                    qusVar = qusVar2;
                                                }
                                            }
                                            aVar.endArray();
                                        }
                                    }
                                } else if (o4 == 25) {
                                    kmo kmoVar = new kmo();
                                    while (aVar.hasNext()) {
                                        if (aVar.s(kmo.f) != 0) {
                                            aVar.t();
                                            aVar.skipValue();
                                        } else {
                                            aVar.beginArray();
                                            while (aVar.hasNext()) {
                                                aVar.beginObject();
                                                String str9 = "";
                                                while (aVar.hasNext()) {
                                                    int s7 = aVar.s(kmo.g);
                                                    if (s7 == 0) {
                                                        str9 = aVar.p();
                                                    } else if (s7 == z5) {
                                                        str9.getClass();
                                                        switch (str9.hashCode()) {
                                                            case 353103893:
                                                                if (str9.equals("Distance")) {
                                                                    r15 = 0;
                                                                    break;
                                                                }
                                                                r15 = -1;
                                                                break;
                                                            case 397447147:
                                                                if (str9.equals("Opacity")) {
                                                                    r15 = z5;
                                                                    break;
                                                                }
                                                                r15 = -1;
                                                                break;
                                                            case 1041377119:
                                                                if (str9.equals("Direction")) {
                                                                    r15 = 2;
                                                                    break;
                                                                }
                                                                r15 = -1;
                                                                break;
                                                            case 1379387491:
                                                                if (str9.equals("Shadow Color")) {
                                                                    r15 = 3;
                                                                    break;
                                                                }
                                                                r15 = -1;
                                                                break;
                                                            case 1383710113:
                                                                if (str9.equals("Softness")) {
                                                                    r15 = 4;
                                                                    break;
                                                                }
                                                                r15 = -1;
                                                                break;
                                                            default:
                                                                r15 = -1;
                                                                break;
                                                        }
                                                        switch (r15) {
                                                            case 0:
                                                                kmoVar.d = r490.l(aVar, i700Var, z5);
                                                                break;
                                                            case 1:
                                                                kmoVar.b = r490.l(aVar, i700Var, false);
                                                                break;
                                                            case 2:
                                                                kmoVar.c = r490.l(aVar, i700Var, false);
                                                                break;
                                                            case 3:
                                                                kmoVar.a = r490.k(aVar, i700Var);
                                                                break;
                                                            case 4:
                                                                kmoVar.e = r490.l(aVar, i700Var, z5);
                                                                break;
                                                            default:
                                                                aVar.skipValue();
                                                                break;
                                                        }
                                                    } else {
                                                        aVar.t();
                                                        aVar.skipValue();
                                                    }
                                                    z5 = true;
                                                }
                                                aVar.endObject();
                                                z5 = true;
                                            }
                                            aVar.endArray();
                                            z5 = true;
                                        }
                                    }
                                    mf2 mf2Var3 = kmoVar.a;
                                    if (mf2Var3 == null || (nf2Var = kmoVar.b) == null || (nf2Var2 = kmoVar.c) == null) {
                                        f5 = valueOf;
                                    } else {
                                        f5 = valueOf;
                                        nf2 nf2Var7 = kmoVar.d;
                                        if (nf2Var7 != null && (nf2Var3 = kmoVar.e) != null) {
                                            m22Var = new m22(mf2Var3, nf2Var, nf2Var2, nf2Var7, nf2Var3);
                                            valueOf = f5;
                                            z5 = true;
                                        }
                                    }
                                    m22Var = null;
                                    valueOf = f5;
                                    z5 = true;
                                }
                            } else if (s5 != z5) {
                                aVar.t();
                                aVar.skipValue();
                            } else {
                                arrayList3.add(aVar.p());
                            }
                            f5 = valueOf;
                            valueOf = f5;
                            z5 = true;
                        }
                        aVar.endObject();
                        z5 = true;
                    }
                    f3 = valueOf;
                    aVar.endArray();
                    i700Var.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList3);
                    f12 = f4;
                    valueOf = f3;
                    z2 = false;
                    break;
                case 14:
                    f12 = (float) aVar.n();
                    z2 = false;
                    break;
                case 15:
                    f11 = (float) aVar.n();
                    z2 = false;
                    break;
                case 16:
                    f6 = f12;
                    f9 = (float) (aVar.n() * b3r0.c());
                    f12 = f6;
                    z2 = false;
                    break;
                case 17:
                    f6 = f12;
                    f10 = (float) (aVar.n() * b3r0.c());
                    f12 = f6;
                    z2 = false;
                    break;
                case 18:
                    f7 = (float) aVar.n();
                    break;
                case 19:
                    f8 = (float) aVar.n();
                    break;
                case 20:
                    nf2Var4 = r490.l(aVar, i700Var, z2);
                    break;
                case 21:
                    str5 = aVar.p();
                    break;
                case 22:
                    z4 = aVar.m();
                    break;
                case 23:
                    if (aVar.o() != 1) {
                        z3 = z2;
                        break;
                    } else {
                        z3 = true;
                        break;
                    }
                case 24:
                    int o5 = aVar.o();
                    if (o5 < LBlendMode.values().length) {
                        lBlendMode2 = LBlendMode.values()[o5];
                        break;
                    } else {
                        i700Var.a("Unsupported Blend Mode: " + o5);
                        lBlendMode2 = LBlendMode.NORMAL;
                        break;
                    }
                default:
                    aVar.t();
                    aVar.skipValue();
                    f = valueOf;
                    str2 = str5;
                    f2 = f12;
                    f12 = f2;
                    str5 = str2;
                    valueOf = f;
                    break;
            }
        }
        Float f13 = valueOf;
        String str10 = str5;
        float f14 = f12;
        aVar.endObject();
        ArrayList arrayList4 = new ArrayList();
        if (f7 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            z = z3;
            str = str10;
            arrayList4.add(new nhy(i700Var, f13, f13, (Interpolator) null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.valueOf(f7)));
        } else {
            z = z3;
            str = str10;
        }
        if (f8 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f8 = i700Var.m;
        }
        arrayList4.add(new nhy(i700Var, valueOf2, valueOf2, (Interpolator) null, f7, Float.valueOf(f8)));
        arrayList4.add(new nhy(i700Var, f13, f13, (Interpolator) null, f8, Float.valueOf(Float.MAX_VALUE)));
        if (str6.endsWith(".ai") || "ai".equals(str)) {
            i700Var.a("Convert your Illustrator layers to shape layers.");
        }
        if (z) {
            if (dg2Var == null) {
                dg2Var = new dg2();
            }
            dg2 dg2Var2 = dg2Var;
            dg2Var2.m = z;
            dg2Var = dg2Var2;
        }
        return new Layer(arrayList2, i700Var, str6, j, layerType, j2, str4, arrayList, dg2Var, i, i2, i3, f14, f11, f9, f10, yf2Var, zf2Var, arrayList4, matteType2, nf2Var4, z4, qusVar, m22Var, lBlendMode2);
    }
}
