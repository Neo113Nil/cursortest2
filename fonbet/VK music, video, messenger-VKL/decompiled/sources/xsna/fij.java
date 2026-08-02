package xsna;

import android.graphics.Path;
import androidx.annotation.Nullable;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.MergePaths;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: ContentModelParser.java */
/* loaded from: classes12.dex */
public final class fij {
    public static final JsonReader.a a = JsonReader.a.a("ty", "d");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:29:0x072b A[LOOP:1: B:27:0x0725->B:29:0x072b, LOOP_END] */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static eij a(com.airbnb.lottie.parser.moshi.a aVar, i700 i700Var) throws IOException {
        String str;
        char c;
        eij adcVar;
        eij y5j0Var;
        eij fbuVar;
        eij a6j0Var;
        char c2;
        ShapeTrimPath.Type type;
        aVar.beginObject();
        int i = 2;
        while (true) {
            if (!aVar.hasNext()) {
                str = null;
                break;
            }
            int s = aVar.s(a);
            if (s == 0) {
                str = aVar.p();
                break;
            }
            if (s != 1) {
                aVar.t();
                aVar.skipValue();
            } else {
                i = aVar.o();
            }
        }
        if (str == null) {
            return null;
        }
        boolean z = false;
        switch (str.hashCode()) {
            case 3239:
                if (str.equals("el")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3270:
                if (str.equals("fl")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3295:
                if (str.equals("gf")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3307:
                if (str.equals("gr")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3308:
                if (str.equals("gs")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 3488:
                if (str.equals("mm")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 3633:
                if (str.equals(DownloadCommon.DOWNLOAD_REPORT_RETRY_COUNT)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 3634:
                if (str.equals("rd")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 3646:
                if (str.equals("rp")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 3669:
                if (str.equals(com.mbridge.msdk.foundation.entity.b.JSON_KEY_SH)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 3679:
                if (str.equals("sr")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 3681:
                if (str.equals("st")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 3705:
                if (str.equals("tm")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 3710:
                if (str.equals("tr")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                JsonReader.a aVar2 = cdc.a;
                boolean z2 = i == 3;
                boolean z3 = false;
                String str2 = null;
                fg2 fg2Var = null;
                uf2 uf2Var = null;
                while (aVar.hasNext()) {
                    int s2 = aVar.s(cdc.a);
                    if (s2 == 0) {
                        str2 = aVar.p();
                    } else if (s2 == 1) {
                        fg2Var = tf2.b(aVar, i700Var);
                    } else if (s2 == 2) {
                        uf2Var = r490.o(aVar, i700Var);
                    } else if (s2 == 3) {
                        z3 = aVar.m();
                    } else if (s2 != 4) {
                        aVar.t();
                        aVar.skipValue();
                    } else {
                        z2 = aVar.o() == 3;
                    }
                }
                adcVar = new adc(str2, fg2Var, uf2Var, z2, z3);
                y5j0Var = adcVar;
                while (aVar.hasNext()) {
                    aVar.skipValue();
                }
                aVar.endObject();
                return y5j0Var;
            case 1:
                JsonReader.a aVar3 = z5j0.a;
                int i2 = 1;
                boolean z4 = false;
                boolean z5 = false;
                pf2 pf2Var = null;
                String str3 = null;
                mf2 mf2Var = null;
                while (aVar.hasNext()) {
                    int s3 = aVar.s(z5j0.a);
                    if (s3 == 0) {
                        str3 = aVar.p();
                    } else if (s3 == 1) {
                        mf2Var = r490.k(aVar, i700Var);
                    } else if (s3 == 2) {
                        pf2Var = r490.n(aVar, i700Var);
                    } else if (s3 == 3) {
                        z4 = aVar.m();
                    } else if (s3 == 4) {
                        i2 = aVar.o();
                    } else if (s3 != 5) {
                        aVar.t();
                        aVar.skipValue();
                    } else {
                        z5 = aVar.m();
                    }
                }
                if (pf2Var == null) {
                    pf2Var = new pf2(Collections.singletonList(new nhy(100)), 0);
                }
                y5j0Var = new y5j0(str3, z4, i2 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, mf2Var, pf2Var, z5);
                while (aVar.hasNext()) {
                }
                aVar.endObject();
                return y5j0Var;
            case 2:
                JsonReader.a aVar4 = hbu.a;
                Path.FillType fillType = Path.FillType.WINDING;
                boolean z6 = false;
                pf2 pf2Var2 = null;
                String str4 = null;
                GradientType gradientType = null;
                of2 of2Var = null;
                uf2 uf2Var2 = null;
                uf2 uf2Var3 = null;
                while (aVar.hasNext()) {
                    switch (aVar.s(hbu.a)) {
                        case 0:
                            str4 = aVar.p();
                            break;
                        case 1:
                            aVar.beginObject();
                            int i3 = -1;
                            while (aVar.hasNext()) {
                                int s4 = aVar.s(hbu.b);
                                if (s4 == 0) {
                                    i3 = aVar.o();
                                } else if (s4 != 1) {
                                    aVar.t();
                                    aVar.skipValue();
                                } else {
                                    of2Var = r490.m(aVar, i700Var, i3);
                                }
                            }
                            aVar.endObject();
                            break;
                        case 2:
                            pf2Var2 = r490.n(aVar, i700Var);
                            break;
                        case 3:
                            gradientType = aVar.o() == 1 ? GradientType.LINEAR : GradientType.RADIAL;
                            break;
                        case 4:
                            uf2Var2 = r490.o(aVar, i700Var);
                            break;
                        case 5:
                            uf2Var3 = r490.o(aVar, i700Var);
                            break;
                        case 6:
                            fillType = aVar.o() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                            break;
                        case 7:
                            z6 = aVar.m();
                            break;
                        default:
                            aVar.t();
                            aVar.skipValue();
                            break;
                    }
                }
                if (pf2Var2 == null) {
                    pf2Var2 = new pf2(Collections.singletonList(new nhy(100)), 0);
                }
                fbuVar = new fbu(str4, gradientType, fillType, of2Var, pf2Var2, uf2Var2, uf2Var3, z6);
                y5j0Var = fbuVar;
                while (aVar.hasNext()) {
                }
                aVar.endObject();
                return y5j0Var;
            case 3:
                JsonReader.a aVar5 = b6j0.a;
                ArrayList arrayList = new ArrayList();
                String str5 = null;
                while (aVar.hasNext()) {
                    int s5 = aVar.s(b6j0.a);
                    if (s5 == 0) {
                        str5 = aVar.p();
                    } else if (s5 == 1) {
                        z = aVar.m();
                    } else if (s5 != 2) {
                        aVar.skipValue();
                    } else {
                        aVar.beginArray();
                        while (aVar.hasNext()) {
                            eij a2 = a(aVar, i700Var);
                            if (a2 != null) {
                                arrayList.add(a2);
                            }
                        }
                        aVar.endArray();
                    }
                }
                a6j0Var = new a6j0(str5, arrayList, z);
                y5j0Var = a6j0Var;
                while (aVar.hasNext()) {
                }
                aVar.endObject();
                return y5j0Var;
            case 4:
                JsonReader.a aVar6 = kbu.a;
                ArrayList arrayList2 = new ArrayList();
                boolean z7 = false;
                float f = 0.0f;
                pf2 pf2Var3 = null;
                String str6 = null;
                GradientType gradientType2 = null;
                of2 of2Var2 = null;
                uf2 uf2Var4 = null;
                uf2 uf2Var5 = null;
                nf2 nf2Var = null;
                ShapeStroke.LineCapType lineCapType = null;
                ShapeStroke.LineJoinType lineJoinType = null;
                nf2 nf2Var2 = null;
                while (aVar.hasNext()) {
                    switch (aVar.s(kbu.a)) {
                        case 0:
                            str6 = aVar.p();
                            break;
                        case 1:
                            aVar.beginObject();
                            int i4 = -1;
                            while (aVar.hasNext()) {
                                int s6 = aVar.s(kbu.b);
                                if (s6 == 0) {
                                    i4 = aVar.o();
                                } else if (s6 != 1) {
                                    aVar.t();
                                    aVar.skipValue();
                                } else {
                                    of2Var2 = r490.m(aVar, i700Var, i4);
                                }
                            }
                            aVar.endObject();
                            break;
                        case 2:
                            pf2Var3 = r490.n(aVar, i700Var);
                            break;
                        case 3:
                            gradientType2 = aVar.o() == 1 ? GradientType.LINEAR : GradientType.RADIAL;
                            break;
                        case 4:
                            uf2Var4 = r490.o(aVar, i700Var);
                            break;
                        case 5:
                            uf2Var5 = r490.o(aVar, i700Var);
                            break;
                        case 6:
                            nf2Var = r490.l(aVar, i700Var, true);
                            break;
                        case 7:
                            lineCapType = ShapeStroke.LineCapType.values()[aVar.o() - 1];
                            break;
                        case 8:
                            lineJoinType = ShapeStroke.LineJoinType.values()[aVar.o() - 1];
                            break;
                        case 9:
                            f = (float) aVar.n();
                            break;
                        case 10:
                            z7 = aVar.m();
                            break;
                        case 11:
                            aVar.beginArray();
                            while (aVar.hasNext()) {
                                aVar.beginObject();
                                String str7 = null;
                                nf2 nf2Var3 = null;
                                while (aVar.hasNext()) {
                                    int s7 = aVar.s(kbu.c);
                                    if (s7 == 0) {
                                        str7 = aVar.p();
                                    } else if (s7 != 1) {
                                        aVar.t();
                                        aVar.skipValue();
                                    } else {
                                        nf2Var3 = r490.l(aVar, i700Var, true);
                                    }
                                }
                                aVar.endObject();
                                if (str7.equals("o")) {
                                    nf2Var2 = nf2Var3;
                                } else if (str7.equals("d") || str7.equals(com.vungle.ads.internal.task.g.e)) {
                                    arrayList2.add(nf2Var3);
                                }
                            }
                            aVar.endArray();
                            if (arrayList2.size() != 1) {
                                break;
                            } else {
                                arrayList2.add((nf2) arrayList2.get(0));
                                break;
                            }
                            break;
                        default:
                            aVar.t();
                            aVar.skipValue();
                            break;
                    }
                }
                if (pf2Var3 == null) {
                    pf2Var3 = new pf2(Collections.singletonList(new nhy(100)), 0);
                }
                fbuVar = new com.airbnb.lottie.model.content.a(str6, gradientType2, of2Var2, pf2Var3, uf2Var4, uf2Var5, nf2Var, lineCapType, lineJoinType, f, arrayList2, nf2Var2, z7);
                y5j0Var = fbuVar;
                while (aVar.hasNext()) {
                }
                aVar.endObject();
                return y5j0Var;
            case 5:
                JsonReader.a aVar7 = z820.a;
                MergePaths.MergePathsMode mergePathsMode = null;
                String str8 = null;
                while (aVar.hasNext()) {
                    int s8 = aVar.s(z820.a);
                    if (s8 == 0) {
                        str8 = aVar.p();
                    } else if (s8 == 1) {
                        int o = aVar.o();
                        mergePathsMode = o != 1 ? o != 2 ? o != 3 ? o != 4 ? o != 5 ? MergePaths.MergePathsMode.MERGE : MergePaths.MergePathsMode.EXCLUDE_INTERSECTIONS : MergePaths.MergePathsMode.INTERSECT : MergePaths.MergePathsMode.SUBTRACT : MergePaths.MergePathsMode.ADD : MergePaths.MergePathsMode.MERGE;
                    } else if (s8 != 2) {
                        aVar.t();
                        aVar.skipValue();
                    } else {
                        z = aVar.m();
                    }
                }
                MergePaths mergePaths = new MergePaths(str8, mergePathsMode, z);
                i700Var.a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                y5j0Var = mergePaths;
                while (aVar.hasNext()) {
                }
                aVar.endObject();
                return y5j0Var;
            case 6:
                JsonReader.a aVar8 = oif0.a;
                boolean z8 = false;
                String str9 = null;
                fg2 fg2Var2 = null;
                uf2 uf2Var6 = null;
                nf2 nf2Var4 = null;
                while (aVar.hasNext()) {
                    int s9 = aVar.s(oif0.a);
                    if (s9 == 0) {
                        str9 = aVar.p();
                    } else if (s9 == 1) {
                        fg2Var2 = tf2.b(aVar, i700Var);
                    } else if (s9 == 2) {
                        uf2Var6 = r490.o(aVar, i700Var);
                    } else if (s9 == 3) {
                        nf2Var4 = r490.l(aVar, i700Var, true);
                    } else if (s9 != 4) {
                        aVar.skipValue();
                    } else {
                        z8 = aVar.m();
                    }
                }
                adcVar = new nif0(str9, fg2Var2, uf2Var6, nf2Var4, z8);
                y5j0Var = adcVar;
                while (aVar.hasNext()) {
                }
                aVar.endObject();
                return y5j0Var;
            case 7:
                JsonReader.a aVar9 = cpg0.a;
                String str10 = null;
                nf2 nf2Var5 = null;
                while (aVar.hasNext()) {
                    int s10 = aVar.s(cpg0.a);
                    if (s10 == 0) {
                        str10 = aVar.p();
                    } else if (s10 == 1) {
                        nf2Var5 = r490.l(aVar, i700Var, true);
                    } else if (s10 != 2) {
                        aVar.skipValue();
                    } else {
                        z = aVar.m();
                    }
                }
                if (!z) {
                    y5j0Var = new xog0(str10, nf2Var5);
                    while (aVar.hasNext()) {
                    }
                    aVar.endObject();
                    return y5j0Var;
                }
                y5j0Var = null;
                while (aVar.hasNext()) {
                }
                aVar.endObject();
                return y5j0Var;
            case '\b':
                JsonReader.a aVar10 = s0g0.a;
                boolean z9 = false;
                String str11 = null;
                nf2 nf2Var6 = null;
                nf2 nf2Var7 = null;
                dg2 dg2Var = null;
                while (aVar.hasNext()) {
                    int s11 = aVar.s(s0g0.a);
                    if (s11 == 0) {
                        str11 = aVar.p();
                    } else if (s11 == 1) {
                        nf2Var6 = r490.l(aVar, i700Var, false);
                    } else if (s11 == 2) {
                        nf2Var7 = r490.l(aVar, i700Var, false);
                    } else if (s11 == 3) {
                        dg2Var = eg2.c(aVar, i700Var);
                    } else if (s11 != 4) {
                        aVar.skipValue();
                    } else {
                        z9 = aVar.m();
                    }
                }
                adcVar = new q0g0(str11, nf2Var6, nf2Var7, dg2Var, z9);
                y5j0Var = adcVar;
                while (aVar.hasNext()) {
                }
                aVar.endObject();
                return y5j0Var;
            case '\t':
                JsonReader.a aVar11 = h6j0.a;
                int i5 = 0;
                boolean z10 = false;
                wf2 wf2Var = null;
                String str12 = null;
                while (aVar.hasNext()) {
                    int s12 = aVar.s(h6j0.a);
                    if (s12 == 0) {
                        str12 = aVar.p();
                    } else if (s12 == 1) {
                        i5 = aVar.o();
                    } else if (s12 == 2) {
                        wf2Var = new wf2(rhy.a(aVar, i700Var, b3r0.c(), w5j0.b, false), 0);
                    } else if (s12 != 3) {
                        aVar.skipValue();
                    } else {
                        z10 = aVar.m();
                    }
                }
                a6j0Var = new f6j0(str12, i5, wf2Var, z10);
                y5j0Var = a6j0Var;
                while (aVar.hasNext()) {
                }
                aVar.endObject();
                return y5j0Var;
            case '\n':
                JsonReader.a aVar12 = wub0.a;
                boolean z11 = i == 3;
                boolean z12 = false;
                String str13 = null;
                PolystarShape.Type type2 = null;
                nf2 nf2Var8 = null;
                fg2 fg2Var3 = null;
                nf2 nf2Var9 = null;
                nf2 nf2Var10 = null;
                nf2 nf2Var11 = null;
                nf2 nf2Var12 = null;
                nf2 nf2Var13 = null;
                while (aVar.hasNext()) {
                    switch (aVar.s(wub0.a)) {
                        case 0:
                            str13 = aVar.p();
                            break;
                        case 1:
                            type2 = PolystarShape.Type.a(aVar.o());
                            break;
                        case 2:
                            nf2Var8 = r490.l(aVar, i700Var, false);
                            break;
                        case 3:
                            fg2Var3 = tf2.b(aVar, i700Var);
                            break;
                        case 4:
                            nf2Var9 = r490.l(aVar, i700Var, false);
                            break;
                        case 5:
                            nf2Var11 = r490.l(aVar, i700Var, true);
                            break;
                        case 6:
                            nf2Var13 = r490.l(aVar, i700Var, false);
                            break;
                        case 7:
                            nf2Var10 = r490.l(aVar, i700Var, true);
                            break;
                        case 8:
                            nf2Var12 = r490.l(aVar, i700Var, false);
                            break;
                        case 9:
                            z12 = aVar.m();
                            break;
                        case 10:
                            if (aVar.o() != 3) {
                                z11 = false;
                                break;
                            } else {
                                z11 = true;
                                break;
                            }
                        default:
                            aVar.t();
                            aVar.skipValue();
                            break;
                    }
                }
                adcVar = new PolystarShape(str13, type2, nf2Var8, fg2Var3, nf2Var9, nf2Var10, nf2Var11, nf2Var12, nf2Var13, z12, z11);
                y5j0Var = adcVar;
                while (aVar.hasNext()) {
                }
                aVar.endObject();
                return y5j0Var;
            case 11:
                JsonReader.a aVar13 = i6j0.a;
                ArrayList arrayList3 = new ArrayList();
                boolean z13 = false;
                float f2 = 0.0f;
                pf2 pf2Var4 = null;
                ShapeStroke.LineCapType lineCapType2 = null;
                ShapeStroke.LineJoinType lineJoinType2 = null;
                String str14 = null;
                nf2 nf2Var14 = null;
                mf2 mf2Var2 = null;
                nf2 nf2Var15 = null;
                while (aVar.hasNext()) {
                    switch (aVar.s(i6j0.a)) {
                        case 0:
                            str14 = aVar.p();
                            break;
                        case 1:
                            mf2Var2 = r490.k(aVar, i700Var);
                            break;
                        case 2:
                            nf2Var15 = r490.l(aVar, i700Var, true);
                            break;
                        case 3:
                            pf2Var4 = r490.n(aVar, i700Var);
                            break;
                        case 4:
                            lineCapType2 = ShapeStroke.LineCapType.values()[aVar.o() - 1];
                            break;
                        case 5:
                            lineJoinType2 = ShapeStroke.LineJoinType.values()[aVar.o() - 1];
                            break;
                        case 6:
                            f2 = (float) aVar.n();
                            break;
                        case 7:
                            z13 = aVar.m();
                            break;
                        case 8:
                            aVar.beginArray();
                            while (aVar.hasNext()) {
                                aVar.beginObject();
                                String str15 = null;
                                nf2 nf2Var16 = null;
                                while (aVar.hasNext()) {
                                    int s13 = aVar.s(i6j0.b);
                                    if (s13 == 0) {
                                        str15 = aVar.p();
                                    } else if (s13 != 1) {
                                        aVar.t();
                                        aVar.skipValue();
                                    } else {
                                        nf2Var16 = r490.l(aVar, i700Var, true);
                                    }
                                }
                                aVar.endObject();
                                str15.getClass();
                                switch (str15.hashCode()) {
                                    case 100:
                                        if (str15.equals("d")) {
                                            c2 = 0;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 103:
                                        if (str15.equals(com.vungle.ads.internal.task.g.e)) {
                                            c2 = 1;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 111:
                                        if (str15.equals("o")) {
                                            c2 = 2;
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
                                    case 1:
                                        arrayList3.add(nf2Var16);
                                        break;
                                    case 2:
                                        nf2Var14 = nf2Var16;
                                        break;
                                }
                            }
                            aVar.endArray();
                            if (arrayList3.size() != 1) {
                                break;
                            } else {
                                arrayList3.add((nf2) arrayList3.get(0));
                                break;
                            }
                        default:
                            aVar.skipValue();
                            break;
                    }
                }
                if (pf2Var4 == null) {
                    pf2Var4 = new pf2(Collections.singletonList(new nhy(100)), 0);
                }
                pf2 pf2Var5 = pf2Var4;
                if (lineCapType2 == null) {
                    lineCapType2 = ShapeStroke.LineCapType.BUTT;
                }
                ShapeStroke.LineCapType lineCapType3 = lineCapType2;
                if (lineJoinType2 == null) {
                    lineJoinType2 = ShapeStroke.LineJoinType.MITER;
                }
                y5j0Var = new ShapeStroke(str14, nf2Var14, arrayList3, mf2Var2, pf2Var5, nf2Var15, lineCapType3, lineJoinType2, f2, z13);
                while (aVar.hasNext()) {
                }
                aVar.endObject();
                return y5j0Var;
            case '\f':
                JsonReader.a aVar14 = k6j0.a;
                boolean z14 = false;
                String str16 = null;
                ShapeTrimPath.Type type3 = null;
                nf2 nf2Var17 = null;
                nf2 nf2Var18 = null;
                nf2 nf2Var19 = null;
                while (aVar.hasNext()) {
                    int s14 = aVar.s(k6j0.a);
                    if (s14 == 0) {
                        nf2Var17 = r490.l(aVar, i700Var, false);
                    } else if (s14 == 1) {
                        nf2Var18 = r490.l(aVar, i700Var, false);
                    } else if (s14 == 2) {
                        nf2Var19 = r490.l(aVar, i700Var, false);
                    } else if (s14 == 3) {
                        str16 = aVar.p();
                    } else if (s14 == 4) {
                        int o2 = aVar.o();
                        if (o2 == 1) {
                            type = ShapeTrimPath.Type.SIMULTANEOUSLY;
                        } else {
                            if (o2 != 2) {
                                throw new IllegalArgumentException(lhg.a(o2, "Unknown trim path type "));
                            }
                            type = ShapeTrimPath.Type.INDIVIDUALLY;
                        }
                        type3 = type;
                    } else if (s14 != 5) {
                        aVar.skipValue();
                    } else {
                        z14 = aVar.m();
                    }
                }
                adcVar = new ShapeTrimPath(str16, type3, nf2Var17, nf2Var18, nf2Var19, z14);
                y5j0Var = adcVar;
                while (aVar.hasNext()) {
                }
                aVar.endObject();
                return y5j0Var;
            case '\r':
                y5j0Var = eg2.c(aVar, i700Var);
                while (aVar.hasNext()) {
                }
                aVar.endObject();
                return y5j0Var;
            default:
                n100.b("Unknown shape type ".concat(str));
                y5j0Var = null;
                while (aVar.hasNext()) {
                }
                aVar.endObject();
                return y5j0Var;
        }
    }
}
