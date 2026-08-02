package defpackage;

import androidx.compose.ui.graphics.Path$Direction;
import com.yandex.xplat.common.JSONItemKind;
import com.yandex.xplat.common.JSONParsingError;
import com.yandex.xplat.common.YSError;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;
import ru.yandex.taxi.layers.domain.model.BubbleType;

/* loaded from: classes5.dex */
public abstract class mbb1 {
    public static final String a(y3x y3xVar) {
        String valueOf;
        JSONItemKind jSONItemKind = y3xVar.a;
        switch (uex.a[jSONItemKind.ordinal()]) {
            case 1:
                valueOf = String.valueOf(((t6w) y3xVar).b);
                break;
            case 2:
                valueOf = String.valueOf(((s5m) y3xVar).b);
                break;
            case 3:
                valueOf = oyr.p("\"", ((ktu0) y3xVar).b, "\"");
                break;
            case 4:
                if (((u96) y3xVar).b) {
                    valueOf = "true";
                    break;
                } else {
                    valueOf = "false";
                    break;
                }
            case 5:
                valueOf = "null";
                break;
            case 6:
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : ((wj00) y3xVar).b.entrySet()) {
                    Object value = entry.getValue();
                    arrayList.add("\"" + ((String) entry.getKey()) + "\": " + a((y3x) value));
                }
                valueOf = oyr.p("{", a.X(arrayList, Extension.FIX_SPACE, null, null, null, 62), "}");
                break;
            case 7:
                ArrayList arrayList2 = ((n53) y3xVar).b;
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(a((y3x) it.next()));
                }
                valueOf = oyr.p("[", a.X(arrayList3, Extension.FIX_SPACE, null, null, null, 62), "]");
                break;
            default:
                w511.b();
                return null;
        }
        return unr0.p("<JSONItem kind: ", c(jSONItemKind), ", value: ", valueOf, ">");
    }

    public static final Serializable b(y3x y3xVar) {
        int i = uex.a[y3xVar.a.ordinal()];
        if (i == 1) {
            t6w t6wVar = (t6w) y3xVar;
            boolean z = t6wVar.c;
            long j = t6wVar.b;
            return z ? Long.valueOf(j) : Integer.valueOf((int) j);
        }
        if (i == 2) {
            return Double.valueOf(((s5m) y3xVar).b);
        }
        if (i == 3) {
            return ((ktu0) y3xVar).b;
        }
        if (i == 4) {
            return Boolean.valueOf(((u96) y3xVar).b);
        }
        if (i != 6) {
            if (i != 7) {
                return null;
            }
            ArrayList arrayList = ((n53) y3xVar).b;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(b((y3x) it.next()));
            }
            return arrayList2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((wj00) y3xVar).b.entrySet()) {
            Object value = entry.getValue();
            String str = (String) entry.getKey();
            Serializable b = b((y3x) value);
            if (b != null) {
                linkedHashMap.put(str, b);
            }
        }
        return linkedHashMap;
    }

    public static final String c(JSONItemKind jSONItemKind) {
        switch (uex.a[jSONItemKind.ordinal()]) {
            case 1:
                return "integer";
            case 2:
                return "double";
            case 3:
                return "string";
            case 4:
                return "boolean";
            case 5:
                return "nullItem";
            case 6:
                return PolicyMappingsExtension.MAP;
            case 7:
                return "array";
            default:
                w511.b();
                return null;
        }
    }

    public static final tyj0 d(y3x y3xVar, tls tlsVar) {
        try {
            return coa1.i(tlsVar.invoke(y3xVar));
        } catch (RuntimeException e) {
            if (e instanceof YSError) {
                return coa1.h(new JSONParsingError(unr0.p("Failed to deserialize JSONItem: \"", a(y3xVar), "\", error: \"", ((YSError) e).getMessage(), "\""), null));
            }
            return coa1.h(new JSONParsingError("Failed to deserialize JSONItem: \"" + a(y3xVar) + "\", unkown error: \"" + e + "\"", null));
        }
    }

    public static final BubbleType e(rl6 rl6Var) {
        dxu0 dxu0Var = rl6Var.k;
        Integer num = dxu0Var != null ? dxu0Var.h : null;
        return (num != null && num.intValue() == 16) ? BubbleType.MEDIUM_OR_LARGE_CORNER_RADIUS_16 : f(rl6Var);
    }

    public static final BubbleType f(rl6 rl6Var) {
        Object obj;
        List list = rl6Var.a;
        if (list == null || list.isEmpty()) {
            return BubbleType.PLAIN_TEXT;
        }
        List list2 = list;
        List list3 = rl6Var.b;
        Iterator it = a.m0(list3 != null ? list3 : EmptyList.a, list2).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((xl6) obj) instanceof nm6) {
                break;
            }
        }
        if (((xl6) obj) != null) {
            return BubbleType.PLAIN_TEXT;
        }
        if (list.size() <= 1) {
            list = null;
        }
        return list != null ? BubbleType.MEDIUM_OR_LARGE : BubbleType.SMALL;
    }

    public static final boolean g(ix80 ix80Var, float f, float f2) {
        if (ix80Var instanceof gx80) {
            zii0 zii0Var = ((gx80) ix80Var).a;
            if (zii0Var.a <= f && f < zii0Var.c && zii0Var.b <= f2 && f2 < zii0Var.d) {
                return true;
            }
        } else {
            if (!(ix80Var instanceof hx80)) {
                if (ix80Var instanceof fx80) {
                    return i(f, f2, ((fx80) ix80Var).a);
                }
                w511.b();
                return false;
            }
            sxk0 sxk0Var = ((hx80) ix80Var).a;
            float f3 = sxk0Var.a;
            long j = sxk0Var.f;
            long j2 = sxk0Var.h;
            long j3 = sxk0Var.g;
            float f4 = sxk0Var.d;
            float f5 = sxk0Var.b;
            float f6 = sxk0Var.c;
            long j4 = sxk0Var.e;
            if (f >= f3 && f < f6 && f2 >= f5 && f2 < f4) {
                int i = (int) (j4 >> 32);
                int i2 = (int) (j >> 32);
                if (Float.intBitsToFloat(i2) + Float.intBitsToFloat(i) <= sxk0Var.h()) {
                    int i3 = (int) (j2 >> 32);
                    int i4 = (int) (j3 >> 32);
                    if (Float.intBitsToFloat(i4) + Float.intBitsToFloat(i3) <= sxk0Var.h()) {
                        int i5 = (int) (j4 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                        float intBitsToFloat = Float.intBitsToFloat(i5);
                        int i6 = (int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                        if (Float.intBitsToFloat(i6) + intBitsToFloat <= sxk0Var.c()) {
                            int i7 = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                            float intBitsToFloat2 = Float.intBitsToFloat(i7);
                            int i8 = (int) (j3 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                            if (Float.intBitsToFloat(i8) + intBitsToFloat2 <= sxk0Var.c()) {
                                float intBitsToFloat3 = Float.intBitsToFloat(i) + f3;
                                float intBitsToFloat4 = Float.intBitsToFloat(i5) + f5;
                                float intBitsToFloat5 = f6 - Float.intBitsToFloat(i2);
                                float intBitsToFloat6 = Float.intBitsToFloat(i7) + f5;
                                float intBitsToFloat7 = f6 - Float.intBitsToFloat(i4);
                                float intBitsToFloat8 = f4 - Float.intBitsToFloat(i8);
                                float intBitsToFloat9 = f4 - Float.intBitsToFloat(i6);
                                float intBitsToFloat10 = Float.intBitsToFloat(i3) + f3;
                                if (f < intBitsToFloat3 && f2 < intBitsToFloat4) {
                                    return j(f, f2, intBitsToFloat3, intBitsToFloat4, sxk0Var.e);
                                }
                                if (f < intBitsToFloat10 && f2 > intBitsToFloat9) {
                                    return j(f, f2, intBitsToFloat10, intBitsToFloat9, sxk0Var.h);
                                }
                                if (f > intBitsToFloat5 && f2 < intBitsToFloat6) {
                                    return j(f, f2, intBitsToFloat5, intBitsToFloat6, sxk0Var.f);
                                }
                                if (f <= intBitsToFloat7 || f2 <= intBitsToFloat8) {
                                    return true;
                                }
                                return j(f, f2, intBitsToFloat7, intBitsToFloat8, sxk0Var.g);
                            }
                        }
                    }
                }
                jb2 a = nb2.a();
                a.f(sxk0Var, Path$Direction.CounterClockwise);
                return i(f, f2, a);
            }
        }
        return false;
    }

    public static final boolean i(float f, float f2, rq90 rq90Var) {
        zii0 zii0Var = new zii0(f - 0.005f, f2 - 0.005f, f + 0.005f, f2 + 0.005f);
        jb2 a = nb2.a();
        a.e(zii0Var, Path$Direction.CounterClockwise);
        jb2 a2 = nb2.a();
        a2.n(rq90Var, a, 1);
        boolean isEmpty = a2.a.isEmpty();
        a2.o();
        a.o();
        return !isEmpty;
    }

    public static final boolean j(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        return ((f6 * f6) / (intBitsToFloat2 * intBitsToFloat2)) + ((f5 * f5) / (intBitsToFloat * intBitsToFloat)) <= 1.0f;
    }
}
