package xsna;

import android.graphics.Rect;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import ru.ok.android.utils.Logger;

/* compiled from: LottieCompositionMoshiParser.java */
/* loaded from: classes12.dex */
public final class r700 {
    public static final JsonReader.a a = JsonReader.a.a(Logger.METHOD_W, "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
    public static final JsonReader.a b = JsonReader.a.a("id", "layers", Logger.METHOD_W, "h", TtmlNode.TAG_P, "u");
    public static final JsonReader.a c = JsonReader.a.a("list");
    public static final JsonReader.a d = JsonReader.a.a("cm", "tm", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_RATE);

    public static i700 a(com.airbnb.lottie.parser.moshi.a aVar) throws IOException {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float c2 = b3r0.c();
        x500<Layer> x500Var = new x500<>();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        wik0<r4s> wik0Var = new wik0<>();
        i700 i700Var = new i700();
        aVar.beginObject();
        float f7 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int i = 0;
        int i2 = 0;
        float f8 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f9 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        while (aVar.hasNext()) {
            float f10 = c2;
            switch (aVar.s(a)) {
                case 0:
                    f = f7;
                    i = (int) aVar.n();
                    c2 = f10;
                    f7 = f;
                    break;
                case 1:
                    f = f7;
                    i2 = (int) aVar.n();
                    c2 = f10;
                    f7 = f;
                    break;
                case 2:
                    f = f7;
                    f8 = (float) aVar.n();
                    c2 = f10;
                    f7 = f;
                    break;
                case 3:
                    f = f7;
                    f9 = ((float) aVar.n()) - 0.01f;
                    c2 = f10;
                    f7 = f;
                    break;
                case 4:
                    f7 = (float) aVar.n();
                    c2 = f10;
                    break;
                case 5:
                    f = f7;
                    f2 = f8;
                    f3 = f9;
                    String[] split = aVar.p().split("\\.");
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    int parseInt3 = Integer.parseInt(split[2]);
                    if (parseInt < 4 || (parseInt <= 4 && (parseInt2 < 4 || (parseInt2 <= 4 && parseInt3 < 0)))) {
                        i700Var.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    c2 = f10;
                    f8 = f2;
                    f9 = f3;
                    f7 = f;
                    break;
                case 6:
                    f = f7;
                    f2 = f8;
                    f3 = f9;
                    aVar.beginArray();
                    int i3 = 0;
                    while (aVar.hasNext()) {
                        Layer a2 = iny.a(aVar, i700Var);
                        if (a2.e == Layer.LayerType.IMAGE) {
                            i3++;
                        }
                        arrayList.add(a2);
                        x500Var.put(a2.d, a2);
                        if (i3 > 4) {
                            n100.b("You have " + i3 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                    }
                    aVar.endArray();
                    c2 = f10;
                    f8 = f2;
                    f9 = f3;
                    f7 = f;
                    break;
                case 7:
                    f = f7;
                    f2 = f8;
                    f3 = f9;
                    aVar.beginArray();
                    while (aVar.hasNext()) {
                        ArrayList arrayList3 = new ArrayList();
                        x500 x500Var2 = new x500();
                        aVar.beginObject();
                        String str = null;
                        String str2 = null;
                        String str3 = null;
                        int i4 = 0;
                        int i5 = 0;
                        while (aVar.hasNext()) {
                            int s = aVar.s(b);
                            if (s == 0) {
                                str = aVar.p();
                            } else if (s == 1) {
                                aVar.beginArray();
                                while (aVar.hasNext()) {
                                    Layer a3 = iny.a(aVar, i700Var);
                                    x500Var2.put(a3.d, a3);
                                    arrayList3.add(a3);
                                }
                                aVar.endArray();
                            } else if (s == 2) {
                                i4 = aVar.o();
                            } else if (s == 3) {
                                i5 = aVar.o();
                            } else if (s == 4) {
                                str2 = aVar.p();
                            } else if (s != 5) {
                                aVar.t();
                                aVar.skipValue();
                            } else {
                                str3 = aVar.p();
                            }
                        }
                        aVar.endObject();
                        if (str2 != null) {
                            hashMap2.put(str, new q800(i4, i5, str, str2, str3));
                        } else {
                            hashMap.put(str, arrayList3);
                        }
                    }
                    aVar.endArray();
                    c2 = f10;
                    f8 = f2;
                    f9 = f3;
                    f7 = f;
                    break;
                case 8:
                    f = f7;
                    f2 = f8;
                    float f11 = f9;
                    aVar.beginObject();
                    while (aVar.hasNext()) {
                        if (aVar.s(c) != 0) {
                            aVar.t();
                            aVar.skipValue();
                        } else {
                            aVar.beginArray();
                            while (aVar.hasNext()) {
                                JsonReader.a aVar2 = e5s.a;
                                aVar.beginObject();
                                String str4 = null;
                                String str5 = null;
                                String str6 = null;
                                while (aVar.hasNext()) {
                                    int s2 = aVar.s(e5s.a);
                                    if (s2 != 0) {
                                        float f12 = f11;
                                        if (s2 == 1) {
                                            str5 = aVar.p();
                                        } else if (s2 == 2) {
                                            str6 = aVar.p();
                                        } else if (s2 != 3) {
                                            aVar.t();
                                            aVar.skipValue();
                                        } else {
                                            aVar.n();
                                        }
                                        f11 = f12;
                                    } else {
                                        str4 = aVar.p();
                                    }
                                }
                                aVar.endObject();
                                hashMap3.put(str5, new o4s(str4, str5, str6));
                                f11 = f11;
                            }
                            aVar.endArray();
                        }
                    }
                    f3 = f11;
                    aVar.endObject();
                    c2 = f10;
                    f8 = f2;
                    f9 = f3;
                    f7 = f;
                    break;
                case 9:
                    f = f7;
                    f2 = f8;
                    f4 = f9;
                    aVar.beginArray();
                    while (aVar.hasNext()) {
                        JsonReader.a aVar3 = s4s.a;
                        ArrayList arrayList4 = new ArrayList();
                        aVar.beginObject();
                        double d2 = 0.0d;
                        String str7 = null;
                        String str8 = null;
                        char c3 = 0;
                        while (aVar.hasNext()) {
                            int s3 = aVar.s(s4s.a);
                            if (s3 == 0) {
                                c3 = aVar.p().charAt(0);
                            } else if (s3 == 1) {
                                aVar.n();
                            } else if (s3 == 2) {
                                d2 = aVar.n();
                            } else if (s3 == 3) {
                                str7 = aVar.p();
                            } else if (s3 == 4) {
                                str8 = aVar.p();
                            } else if (s3 != 5) {
                                aVar.t();
                                aVar.skipValue();
                            } else {
                                aVar.beginObject();
                                while (aVar.hasNext()) {
                                    if (aVar.s(s4s.b) != 0) {
                                        aVar.t();
                                        aVar.skipValue();
                                    } else {
                                        aVar.beginArray();
                                        while (aVar.hasNext()) {
                                            arrayList4.add((a6j0) fij.a(aVar, i700Var));
                                        }
                                        aVar.endArray();
                                    }
                                }
                                aVar.endObject();
                            }
                        }
                        aVar.endObject();
                        r4s r4sVar = new r4s(arrayList4, c3, d2, str7, str8);
                        wik0Var.h(r4sVar.hashCode(), r4sVar);
                    }
                    aVar.endArray();
                    f3 = f4;
                    c2 = f10;
                    f8 = f2;
                    f9 = f3;
                    f7 = f;
                    break;
                case 10:
                    aVar.beginArray();
                    while (aVar.hasNext()) {
                        aVar.beginObject();
                        String str9 = null;
                        float f13 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float f14 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        while (aVar.hasNext()) {
                            int s4 = aVar.s(d);
                            if (s4 != 0) {
                                f5 = f7;
                                if (s4 == 1) {
                                    f6 = f8;
                                    f9 = f9;
                                    f13 = (float) aVar.n();
                                } else if (s4 != 2) {
                                    aVar.t();
                                    aVar.skipValue();
                                } else {
                                    f6 = f8;
                                    f9 = f9;
                                    f14 = (float) aVar.n();
                                }
                                f7 = f5;
                                f8 = f6;
                            } else {
                                f5 = f7;
                                str9 = aVar.p();
                            }
                            f7 = f5;
                        }
                        aVar.endObject();
                        arrayList2.add(new go00(f13, f14, str9));
                        f9 = f9;
                        f8 = f8;
                        f7 = f7;
                    }
                    f = f7;
                    f2 = f8;
                    f4 = f9;
                    aVar.endArray();
                    f3 = f4;
                    c2 = f10;
                    f8 = f2;
                    f9 = f3;
                    f7 = f;
                    break;
                default:
                    aVar.t();
                    aVar.skipValue();
                    f = f7;
                    f2 = f8;
                    f3 = f9;
                    c2 = f10;
                    f8 = f2;
                    f9 = f3;
                    f7 = f;
                    break;
            }
        }
        float f15 = c2;
        float f16 = f7;
        Rect rect = new Rect(0, 0, (int) (i * f15), (int) (i2 * f15));
        float c4 = b3r0.c();
        i700Var.k = rect;
        i700Var.l = f8;
        i700Var.m = f9;
        i700Var.n = f16;
        i700Var.j = arrayList;
        i700Var.i = x500Var;
        i700Var.c = hashMap;
        i700Var.d = hashMap2;
        i700Var.e = c4;
        i700Var.h = wik0Var;
        i700Var.f = hashMap3;
        i700Var.g = arrayList2;
        return i700Var;
    }
}
