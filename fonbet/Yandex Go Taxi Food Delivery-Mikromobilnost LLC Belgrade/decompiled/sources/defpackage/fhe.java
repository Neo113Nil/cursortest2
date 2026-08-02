package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.parser.moshi.c;
import java.util.Collections;
import ru.CryptoPro.JCP.tools.HexString;
import ru.yandex.video.m3.player.ui.debug.internal.providers.SessionColorProviderImpl;

/* loaded from: classes.dex */
public abstract class fhe {
    public static final hzk a = hzk.n("ty", "d");

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static ehe a(c cVar, nsz nszVar) {
        ae2 ae2Var;
        String str;
        ehe a2;
        String str2;
        cVar.c();
        int i = 2;
        while (true) {
            ae2Var = null;
            a2 = null;
            str2 = null;
            if (!cVar.hasNext()) {
                str = null;
                break;
            }
            int o = cVar.o(a);
            if (o == 0) {
                str = cVar.nextString();
                break;
            }
            if (o != 1) {
                cVar.v();
                cVar.skipValue();
            } else {
                i = cVar.nextInt();
            }
        }
        if (str == null) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 3239:
                if (str.equals("el")) {
                    c = 0;
                    break;
                }
                break;
            case SessionColorProviderImpl.LONG_SESSION_MAX_STALLED_LENGTH_MS_YELLOW_BOUND /* 3270 */:
                if (str.equals("fl")) {
                    c = 1;
                    break;
                }
                break;
            case 3295:
                if (str.equals("gf")) {
                    c = 2;
                    break;
                }
                break;
            case 3307:
                if (str.equals("gr")) {
                    c = 3;
                    break;
                }
                break;
            case 3308:
                if (str.equals("gs")) {
                    c = 4;
                    break;
                }
                break;
            case 3488:
                if (str.equals("mm")) {
                    c = 5;
                    break;
                }
                break;
            case 3633:
                if (str.equals("rc")) {
                    c = 6;
                    break;
                }
                break;
            case 3634:
                if (str.equals("rd")) {
                    c = 7;
                    break;
                }
                break;
            case 3646:
                if (str.equals("rp")) {
                    c = '\b';
                    break;
                }
                break;
            case 3669:
                if (str.equals("sh")) {
                    c = '\t';
                    break;
                }
                break;
            case 3679:
                if (str.equals("sr")) {
                    c = '\n';
                    break;
                }
                break;
            case 3681:
                if (str.equals("st")) {
                    c = 11;
                    break;
                }
                break;
            case 3705:
                if (str.equals("tm")) {
                    c = '\f';
                    break;
                }
                break;
            case 3710:
                if (str.equals("tr")) {
                    c = HexString.LF;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                a2 = zub.a(cVar, nszVar, i);
                break;
            case 1:
                hzk hzkVar = phr0.a;
                int i2 = 1;
                String str3 = null;
                ae2 ae2Var2 = null;
                boolean z = false;
                boolean z2 = false;
                while (cVar.hasNext()) {
                    int o2 = cVar.o(phr0.a);
                    if (o2 == 0) {
                        str3 = cVar.nextString();
                    } else if (o2 == 1) {
                        ae2Var2 = bb1.B(cVar, nszVar);
                    } else if (o2 == 2) {
                        ae2Var = bb1.D(cVar, nszVar);
                    } else if (o2 == 3) {
                        z = cVar.nextBoolean();
                    } else if (o2 == 4) {
                        i2 = cVar.nextInt();
                    } else if (o2 != 5) {
                        cVar.v();
                        cVar.skipValue();
                    } else {
                        z2 = cVar.nextBoolean();
                    }
                }
                if (ae2Var == null) {
                    ae2Var = new ae2(Collections.singletonList(new rkx(100)), 1);
                }
                a2 = new ohr0(str3, z, i2 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, ae2Var2, ae2Var, z2);
                break;
            case 2:
                a2 = hyt.a(cVar, nszVar);
                break;
            case 3:
                a2 = rhr0.a(cVar, nszVar);
                break;
            case 4:
                a2 = mzt.a(cVar, nszVar);
                break;
            case 5:
                a2 = nr10.a(cVar);
                nszVar.a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case 6:
                hzk hzkVar2 = hji0.a;
                String str4 = null;
                ie2 ie2Var = null;
                ae2 ae2Var3 = null;
                be2 be2Var = null;
                boolean z3 = false;
                while (cVar.hasNext()) {
                    int o3 = cVar.o(hji0.a);
                    if (o3 == 0) {
                        str4 = cVar.nextString();
                    } else if (o3 == 1) {
                        ie2Var = de2.b(cVar, nszVar);
                    } else if (o3 == 2) {
                        ae2Var3 = bb1.E(cVar, nszVar);
                    } else if (o3 == 3) {
                        be2Var = bb1.C(cVar, nszVar, true);
                    } else if (o3 != 4) {
                        cVar.skipValue();
                    } else {
                        z3 = cVar.nextBoolean();
                    }
                }
                a2 = new fji0(str4, ie2Var, ae2Var3, be2Var, z3);
                break;
            case 7:
                a2 = iyk0.a(cVar, nszVar);
                break;
            case '\b':
                a2 = v0j0.a(cVar, nszVar);
                break;
            case '\t':
                hzk hzkVar3 = eir0.a;
                ae2 ae2Var4 = null;
                int i3 = 0;
                boolean z4 = false;
                while (cVar.hasNext()) {
                    int o4 = cVar.o(eir0.a);
                    if (o4 == 0) {
                        str2 = cVar.nextString();
                    } else if (o4 == 1) {
                        i3 = cVar.nextInt();
                    } else if (o4 == 2) {
                        ae2Var4 = new ae2(ukx.a(cVar, nszVar, zw21.c(), mhr0.a, false), 4);
                    } else if (o4 != 3) {
                        cVar.skipValue();
                    } else {
                        z4 = cVar.nextBoolean();
                    }
                }
                a2 = new cir0(str2, i3, ae2Var4, z4);
                break;
            case '\n':
                a2 = z5e0.a(cVar, nszVar, i);
                break;
            case 11:
                a2 = rir0.a(cVar, nszVar);
                break;
            case '\f':
                a2 = tir0.a(cVar, nszVar);
                break;
            case '\r':
                a2 = he2.c(cVar, nszVar);
                break;
            default:
                lgz.b("Unknown shape type ".concat(str));
                break;
        }
        while (cVar.hasNext()) {
            cVar.skipValue();
        }
        cVar.e();
        return a2;
    }
}
