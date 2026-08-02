package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.features.collage.model.CollageAspectRatioFormat;
import com.vk.photo.editor.features.collage.model.stat.CollageStatEvent;
import com.vk.photo.editor.features.colorgrading.a;
import com.vk.photo.editor.features.crop.models.stat.CropStatEvent;
import com.vk.photo.editor.features.markup.draw.model.stat.DrawStatEvent;
import com.vk.photo.editor.features.markup.text.model.stat.TextStatEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;

/* compiled from: PhotoParams.kt */
/* loaded from: classes4.dex */
public final class maa0 {
    /* JADX WARN: Removed duplicated region for block: B:125:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x039c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final haa0 a(haa0 haa0Var, Map<f5p, ? extends g5p> map) {
        Integer num;
        Integer num2;
        CropStatEvent.Format format;
        ArrayList arrayList;
        float f;
        HashMap hashMap;
        List list;
        List list2;
        boolean z;
        boolean z2;
        Integer num3;
        Integer num4;
        Iterator it;
        Iterator it2;
        Iterator it3;
        f0g f0gVar;
        CollageAspectRatioFormat collageAspectRatioFormat;
        w0g w0gVar;
        aa00 aa00Var;
        String str;
        tnt tntVar;
        Collection values;
        Set keySet;
        vlo vloVar;
        vlo vloVar2;
        vlo vloVar3;
        vlo vloVar4;
        Map<f5p, ? extends g5p> map2 = map;
        ot20 ot20Var = ot20.a;
        g5p g5pVar = map2.get(ot20Var);
        dc0 dc0Var = g5pVar instanceof dc0 ? (dc0) g5pVar : null;
        if (dc0Var != null) {
            map2 = b(dc0Var.a, map2);
        }
        g5p g5pVar2 = map2.get(jik.a);
        cc0 cc0Var = g5pVar2 instanceof cc0 ? (cc0) g5pVar2 : null;
        g5p g5pVar3 = map2.get(hg5.a);
        ag5 ag5Var = g5pVar3 instanceof ag5 ? (ag5) g5pVar3 : null;
        g5p g5pVar4 = map2.get(ler.a);
        edr edrVar = g5pVar4 instanceof edr ? (edr) g5pVar4 : null;
        g5p g5pVar5 = map2.get(y2g.a);
        bc0 bc0Var = g5pVar5 instanceof bc0 ? (bc0) g5pVar5 : null;
        g5p g5pVar6 = map2.get(k6g.a);
        com.vk.photo.editor.features.colorgrading.a aVar = g5pVar6 instanceof com.vk.photo.editor.features.colorgrading.a ? (com.vk.photo.editor.features.colorgrading.a) g5pVar6 : null;
        g5p g5pVar7 = map2.get(hjo.a);
        nio nioVar = g5pVar7 instanceof nio ? (nio) g5pVar7 : null;
        List<uap> list3 = (nioVar == null || (vloVar4 = nioVar.a) == null) ? null : vloVar4.a;
        if (list3 == null) {
            list3 = EmptyList.b;
        }
        g5p g5pVar8 = map2.get(xmo0.a);
        fko0 fko0Var = g5pVar8 instanceof fko0 ? (fko0) g5pVar8 : null;
        List<uap> list4 = (fko0Var == null || (vloVar3 = fko0Var.a) == null) ? null : vloVar3.a;
        if (list4 == null) {
            list4 = EmptyList.b;
        }
        g5p g5pVar9 = map2.get(t7l0.a);
        q5l0 q5l0Var = g5pVar9 instanceof q5l0 ? (q5l0) g5pVar9 : null;
        List<uap> list5 = (q5l0Var == null || (vloVar2 = q5l0Var.a) == null) ? null : vloVar2.a;
        if (list5 == null) {
            list5 = EmptyList.b;
        }
        g5p g5pVar10 = map2.get(uf10.a);
        nf10 nf10Var = g5pVar10 instanceof nf10 ? (nf10) g5pVar10 : null;
        List<uap> list6 = (nf10Var == null || (vloVar = nf10Var.a) == null) ? null : vloVar.a;
        if (list6 == null) {
            list6 = EmptyList.b;
        }
        ArrayList u0 = j5g.u0(list6, j5g.u0(list5, j5g.u0(list4, list3)));
        boolean z3 = cc0Var != null ? cc0Var.d : true;
        if (z3 || cc0Var == null) {
            num = null;
            num2 = null;
            format = null;
        } else {
            tnt tntVar2 = cc0Var.a;
            Integer valueOf = Integer.valueOf((int) ((tntVar2.g / tntVar2.n) * 100));
            num2 = Integer.valueOf((int) (tntVar2.i + tntVar2.h));
            num = valueOf;
            format = fhk.a(cc0Var.c);
        }
        boolean I = ag5Var != null ? ag5Var.I() : true;
        boolean z4 = !I;
        boolean I2 = edrVar != null ? edrVar.I() : true;
        boolean z5 = !I2;
        if (aVar != null) {
            a.b bVar = aVar.k;
            a.C1454a c1454a = aVar.j;
            hashMap = new HashMap();
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float f2 = aVar.a;
            if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                arrayList = u0;
            } else {
                arrayList = u0;
                hashMap.put("brightness", Float.valueOf(f2));
            }
            float f3 = aVar.b;
            if (f3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                hashMap.put("contrast", Float.valueOf(f3));
            }
            float f4 = aVar.c;
            if (f4 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                hashMap.put("saturation", Float.valueOf(f4));
            }
            float f5 = aVar.d;
            if (f5 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                hashMap.put("temperature", Float.valueOf(f5));
            }
            float f6 = aVar.e;
            if (f6 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                hashMap.put("sharpness", Float.valueOf(f6));
            }
            float f7 = aVar.f;
            if (f7 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                hashMap.put("grain", Float.valueOf(f7));
            }
            float f8 = aVar.g;
            if (f8 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                hashMap.put("vignette", Float.valueOf(f8));
            }
            float f9 = aVar.h;
            if (f9 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                hashMap.put("lights", Float.valueOf(f9));
            }
            float f10 = aVar.i;
            if (f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                hashMap.put("darks", Float.valueOf(f10));
            }
            if (!c1454a.B) {
                hashMap.put("colorHueRed", Float.valueOf(c1454a.a));
                hashMap.put("colorSaturationRed", Float.valueOf(c1454a.b));
                hashMap.put("colorLightnessRed", Float.valueOf(c1454a.c));
                hashMap.put("colorHueOrange", Float.valueOf(c1454a.d));
                hashMap.put("colorSaturationOrange", Float.valueOf(c1454a.e));
                hashMap.put("colorLightnessOrange", Float.valueOf(c1454a.f));
                hashMap.put("colorHueYellow", Float.valueOf(c1454a.g));
                hashMap.put("colorSaturationYellow", Float.valueOf(c1454a.h));
                hashMap.put("colorLightnessYellow", Float.valueOf(c1454a.i));
                hashMap.put("colorHueGreen", Float.valueOf(c1454a.j));
                hashMap.put("colorSaturationGreen", Float.valueOf(c1454a.k));
                hashMap.put("colorLightnessGreen", Float.valueOf(c1454a.l));
                hashMap.put("colorHueCyan", Float.valueOf(c1454a.m));
                hashMap.put("colorSaturationCyan", Float.valueOf(c1454a.n));
                hashMap.put("colorLightnessCyan", Float.valueOf(c1454a.o));
                hashMap.put("colorHueMagenta", Float.valueOf(c1454a.p));
                hashMap.put("colorSaturationMagenta", Float.valueOf(c1454a.q));
                hashMap.put("colorLightnessMagenta", Float.valueOf(c1454a.r));
            }
            if (!bVar.b()) {
                hashMap.put("darkColorId", Float.valueOf(bVar.a));
                hashMap.put("lightColorId", Float.valueOf(bVar.b));
                hashMap.put("darkColorLevel", Float.valueOf(bVar.c));
                hashMap.put("lightColorLevel", Float.valueOf(bVar.d));
            }
        } else {
            arrayList = u0;
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            hashMap = null;
        }
        if (hashMap == null || (keySet = hashMap.keySet()) == null || (list = j5g.O0(keySet)) == null) {
            list = EmptyList.b;
        }
        List list7 = list;
        if (hashMap == null || (values = hashMap.values()) == null || (list2 = j5g.O0(values)) == null) {
            list2 = EmptyList.b;
        }
        List list8 = list2;
        boolean z6 = map2.get(ot20Var) instanceof dc0;
        boolean z7 = !z3;
        if (!z3 && cc0Var != null) {
            tnt tntVar3 = cc0Var.a;
            if (tntVar3.i + tntVar3.h != f) {
                z = true;
                if (!z3 && cc0Var != null) {
                    tntVar = cc0Var.a;
                    if (tntVar.g != tntVar.n) {
                        z2 = true;
                        if (ag5Var != null) {
                            Float valueOf2 = Float.valueOf(ag5Var.a);
                            if (I) {
                                valueOf2 = null;
                            }
                            if (valueOf2 != null) {
                                num3 = Integer.valueOf((int) valueOf2.floatValue());
                                String str2 = (edrVar != null || (aa00Var = edrVar.a) == null || (str = aa00Var.b) == null || I2) ? null : str;
                                if (edrVar != null) {
                                    Integer valueOf3 = Integer.valueOf(edrVar.b);
                                    if (!I2) {
                                        num4 = valueOf3;
                                        String k = (bc0Var != null || (w0gVar = bc0Var.b) == null) ? null : wp80.k(w0gVar);
                                        CollageStatEvent.Format a = (bc0Var != null || (collageAspectRatioFormat = bc0Var.c) == null) ? null : ehk.a(collageAspectRatioFormat);
                                        Integer valueOf4 = bc0Var != null ? Integer.valueOf(an10.b(bc0Var.d)) : null;
                                        Integer valueOf5 = bc0Var != null ? Integer.valueOf(an10.b(bc0Var.e)) : null;
                                        String str3 = (bc0Var != null || (f0gVar = bc0Var.f) == null) ? null : f0gVar.a;
                                        ArrayList arrayList2 = new ArrayList();
                                        it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            Object meta = ((uap) it.next()).getMeta();
                                            f5l0 f5l0Var = meta instanceof f5l0 ? (f5l0) meta : null;
                                            if (f5l0Var != null) {
                                                arrayList2.add(f5l0Var);
                                            }
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        it2 = arrayList.iterator();
                                        while (it2.hasNext()) {
                                            Object meta2 = ((uap) it2.next()).getMeta();
                                            TextStatEvent.e eVar = meta2 instanceof TextStatEvent.e ? (TextStatEvent.e) meta2 : null;
                                            if (eVar != null) {
                                                arrayList3.add(eVar);
                                            }
                                        }
                                        ArrayList arrayList4 = new ArrayList();
                                        it3 = arrayList.iterator();
                                        while (it3.hasNext()) {
                                            Object meta3 = ((uap) it3.next()).getMeta();
                                            DrawStatEvent.b bVar2 = meta3 instanceof DrawStatEvent.b ? (DrawStatEvent.b) meta3 : null;
                                            if (bVar2 != null) {
                                                arrayList4.add(bVar2);
                                            }
                                        }
                                        return new haa0(z7, z, z2, num, num2, z4, num3, z5, str2, num4, format, k, a, valueOf4, valueOf5, str3, arrayList2, arrayList3, arrayList4, haa0Var.t, haa0Var.u, (List<String>) list7, (List<Float>) list8, z6);
                                    }
                                }
                                num4 = null;
                                if (bc0Var != null) {
                                }
                                if (bc0Var != null) {
                                }
                                if (bc0Var != null) {
                                }
                                if (bc0Var != null) {
                                }
                                if (bc0Var != null) {
                                }
                                ArrayList arrayList22 = new ArrayList();
                                it = arrayList.iterator();
                                while (it.hasNext()) {
                                }
                                ArrayList arrayList32 = new ArrayList();
                                it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                }
                                ArrayList arrayList42 = new ArrayList();
                                it3 = arrayList.iterator();
                                while (it3.hasNext()) {
                                }
                                return new haa0(z7, z, z2, num, num2, z4, num3, z5, str2, num4, format, k, a, valueOf4, valueOf5, str3, arrayList22, arrayList32, arrayList42, haa0Var.t, haa0Var.u, (List<String>) list7, (List<Float>) list8, z6);
                            }
                        }
                        num3 = null;
                        if (edrVar != null) {
                        }
                        if (edrVar != null) {
                        }
                        num4 = null;
                        if (bc0Var != null) {
                        }
                        if (bc0Var != null) {
                        }
                        if (bc0Var != null) {
                        }
                        if (bc0Var != null) {
                        }
                        if (bc0Var != null) {
                        }
                        ArrayList arrayList222 = new ArrayList();
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                        }
                        ArrayList arrayList322 = new ArrayList();
                        it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                        }
                        ArrayList arrayList422 = new ArrayList();
                        it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                        }
                        return new haa0(z7, z, z2, num, num2, z4, num3, z5, str2, num4, format, k, a, valueOf4, valueOf5, str3, arrayList222, arrayList322, arrayList422, haa0Var.t, haa0Var.u, (List<String>) list7, (List<Float>) list8, z6);
                    }
                }
                z2 = false;
                if (ag5Var != null) {
                }
                num3 = null;
                if (edrVar != null) {
                }
                if (edrVar != null) {
                }
                num4 = null;
                if (bc0Var != null) {
                }
                if (bc0Var != null) {
                }
                if (bc0Var != null) {
                }
                if (bc0Var != null) {
                }
                if (bc0Var != null) {
                }
                ArrayList arrayList2222 = new ArrayList();
                it = arrayList.iterator();
                while (it.hasNext()) {
                }
                ArrayList arrayList3222 = new ArrayList();
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                }
                ArrayList arrayList4222 = new ArrayList();
                it3 = arrayList.iterator();
                while (it3.hasNext()) {
                }
                return new haa0(z7, z, z2, num, num2, z4, num3, z5, str2, num4, format, k, a, valueOf4, valueOf5, str3, arrayList2222, arrayList3222, arrayList4222, haa0Var.t, haa0Var.u, (List<String>) list7, (List<Float>) list8, z6);
            }
        }
        z = false;
        if (!z3) {
            tntVar = cc0Var.a;
            if (tntVar.g != tntVar.n) {
            }
        }
        z2 = false;
        if (ag5Var != null) {
        }
        num3 = null;
        if (edrVar != null) {
        }
        if (edrVar != null) {
        }
        num4 = null;
        if (bc0Var != null) {
        }
        if (bc0Var != null) {
        }
        if (bc0Var != null) {
        }
        if (bc0Var != null) {
        }
        if (bc0Var != null) {
        }
        ArrayList arrayList22222 = new ArrayList();
        it = arrayList.iterator();
        while (it.hasNext()) {
        }
        ArrayList arrayList32222 = new ArrayList();
        it2 = arrayList.iterator();
        while (it2.hasNext()) {
        }
        ArrayList arrayList42222 = new ArrayList();
        it3 = arrayList.iterator();
        while (it3.hasNext()) {
        }
        return new haa0(z7, z, z2, num, num2, z4, num3, z5, str2, num4, format, k, a, valueOf4, valueOf5, str3, arrayList22222, arrayList32222, arrayList42222, haa0Var.t, haa0Var.u, (List<String>) list7, (List<Float>) list8, z6);
    }

    public static final LinkedHashMap b(HashMap hashMap, Map map) {
        Object obj = hashMap.get(ot20.a);
        dc0 dc0Var = obj instanceof dc0 ? (dc0) obj : null;
        if (dc0Var != null) {
            hashMap = b(dc0Var.a, hashMap);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(hashMap);
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            f5p f5pVar = (f5p) ((Map.Entry) it.next()).getKey();
            g5p g5pVar = (g5p) map.get(f5pVar);
            if (g5pVar != null && !g5pVar.I()) {
                linkedHashMap.put(f5pVar, map.get(f5pVar));
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            f5p f5pVar2 = (f5p) entry.getKey();
            g5p g5pVar2 = (g5p) entry.getValue();
            if (!linkedHashMap.containsKey(f5pVar2)) {
                linkedHashMap.put(f5pVar2, g5pVar2);
            }
        }
        return linkedHashMap;
    }
}
