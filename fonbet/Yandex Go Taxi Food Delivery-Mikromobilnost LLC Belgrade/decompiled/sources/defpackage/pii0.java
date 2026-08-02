package defpackage;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes10.dex */
public final class pii0 implements yk31 {
    public final izn b;
    public final int c;
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [mrj] */
    public pii0(ar7 ar7Var, int i) {
        Map map;
        j94 j94Var;
        char c = 2;
        int i2 = i == 2 ? 2 : 1;
        this.c = i2;
        izn j = ar7Var.j();
        if (i2 != 2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            TreeMap treeMap = new TreeMap(new gvc());
            a84 a84Var = kgg0.a;
            Iterator it = new ArrayList(kgg0.i).iterator();
            while (it.hasNext()) {
                kgg0 kgg0Var = (kgg0) it.next();
                char c2 = c;
                d6z.y("Currently only support ConstantQuality", Objects.nonNull(kgg0Var));
                mzn o = j.o(kgg0Var.c(i2));
                if (o != null) {
                    o.toString();
                    sgb1.g(3, "CapabilitiesByQuality");
                    if (o.d().isEmpty()) {
                        j94Var = null;
                    } else {
                        int c3 = o.c();
                        int a = o.a();
                        List b = o.b();
                        List d = o.d();
                        d6z.m("Should contain at least one VideoProfile.", !d.isEmpty());
                        j94Var = new j94(c3, a, ly3.w(b), ly3.w(d), !b.isEmpty() ? (jzn) b.get(0) : null, (lzn) d.get(0));
                    }
                    if (j94Var == null) {
                        kgg0Var.toString();
                        sgb1.g(5, "CapabilitiesByQuality");
                    } else {
                        treeMap.put(j94Var.f.j(), kgg0Var);
                        linkedHashMap.put(kgg0Var, j94Var);
                    }
                }
                c = c2;
            }
            char c4 = c;
            if (linkedHashMap.isEmpty()) {
                sgb1.d("CapabilitiesByQuality", "No supported EncoderProfiles");
            } else {
                ArrayDeque arrayDeque = new ArrayDeque(linkedHashMap.values());
            }
            if (new ArrayList(linkedHashMap.keySet()).isEmpty()) {
                sgb1.g(5, "RecorderVideoCapabilities");
                kgg0[] kgg0VarArr = new kgg0[3];
                kgg0VarArr[0] = kgg0.c;
                kgg0VarArr[1] = kgg0.b;
                kgg0VarArr[c4] = kgg0.a;
                j = new apf(ar7Var, Arrays.asList(kgg0VarArr));
            }
            a73 a73Var = vbj.a;
            yxf0 yxf0Var = new yxf0();
            yxf0Var.a = j;
            ArrayList c5 = a73Var.c(ExtraSupportedQualityQuirk.class);
            if (!c5.isEmpty()) {
                d6z.y(null, c5.size() == 1);
                ((ExtraSupportedQualityQuirk) c5.get(0)).getClass();
                if ("motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL)) {
                    if ("1".equals(ar7Var.c()) && !j.s(4)) {
                        mzn o2 = j.o(1);
                        lzn lznVar = (o2 == null || o2.d().isEmpty()) ? null : (lzn) o2.d().get(0);
                        if (lznVar != null) {
                            rl31 a2 = sl31.a(lznVar.h());
                            Range Q2 = a2 != null ? a2.Q2() : i94.e;
                            Size size = vjs0.d;
                            e64 e = kzn.e(o2.c(), o2.a(), o2.b(), Collections.singletonList(new f64(lznVar.d(), lznVar.h(), ll31.d(lznVar.b(), lznVar.a(), lznVar.a(), lznVar.e(), lznVar.e(), size.getWidth(), lznVar.k(), size.getHeight(), lznVar.g(), Q2), lznVar.e(), size.getWidth(), size.getHeight(), lznVar.i(), lznVar.a(), lznVar.c(), lznVar.f())));
                            HashMap hashMap = new HashMap();
                            hashMap.put(4, e);
                            Size j2 = lznVar.j();
                            map = hashMap;
                            if (size.getHeight() * size.getWidth() > j2.getHeight() * j2.getWidth()) {
                                hashMap.put(1, e);
                                map = hashMap;
                            }
                        }
                    }
                    map = null;
                } else {
                    map = Collections.EMPTY_MAP;
                }
                if (map != null) {
                    yxf0Var.b = new HashMap(map);
                }
            }
            q6c0 q6c0Var = new q6c0(yxf0Var, a73Var);
            Iterator it2 = ar7Var.b().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                q8n q8nVar = (q8n) it2.next();
                Integer valueOf = Integer.valueOf(q8nVar.a);
                int i3 = q8nVar.b;
                if (valueOf.equals(3) && i3 == 10) {
                    q6c0Var = new mrj(q6c0Var);
                    break;
                }
            }
            j = new sgg0(q6c0Var, ar7Var, a73Var);
        } else if (!ar7Var.h()) {
            j = izn.b2;
        }
        this.b = j;
        for (q8n q8nVar2 : ar7Var.b()) {
            n28 n28Var = new n28(new jdj(this.b, q8nVar2), this.c);
            if (!new ArrayList(n28Var.a.keySet()).isEmpty()) {
                this.d.put(q8nVar2, n28Var);
            }
        }
        ar7Var.t();
    }

    @Override // defpackage.yk31
    public final ArrayList a(q8n q8nVar) {
        n28 e = e(q8nVar);
        return e == null ? new ArrayList() : new ArrayList(e.a.keySet());
    }

    @Override // defpackage.yk31
    public final Set b() {
        return this.d.keySet();
    }

    @Override // defpackage.yk31
    public final qo31 c(kgg0 kgg0Var, q8n q8nVar) {
        n28 e = e(q8nVar);
        if (e == null) {
            return null;
        }
        return e.a(kgg0Var);
    }

    @Override // defpackage.yk31
    public final qo31 d(Size size, q8n q8nVar) {
        Object value;
        n28 e = e(q8nVar);
        if (e == null) {
            return null;
        }
        TreeMap treeMap = e.b;
        Size size2 = vjs0.a;
        Map.Entry ceilingEntry = treeMap.ceilingEntry(size);
        if (ceilingEntry != null) {
            value = ceilingEntry.getValue();
        } else {
            Map.Entry floorEntry = treeMap.floorEntry(size);
            value = floorEntry != null ? floorEntry.getValue() : null;
        }
        kgg0 kgg0Var = (kgg0) value;
        if (kgg0Var == null) {
            kgg0Var = kgg0.g;
        }
        Objects.toString(kgg0Var);
        Objects.toString(size);
        sgb1.g(3, "CapabilitiesByQuality");
        if (kgg0Var == kgg0.g) {
            return null;
        }
        qo31 a = e.a(kgg0Var);
        if (a != null) {
            return a;
        }
        ny61.f("Camera advertised available quality but did not produce EncoderProfiles for advertised quality.");
        return null;
    }

    public final n28 e(q8n q8nVar) {
        Object obj;
        boolean z;
        boolean b = q8nVar.b();
        HashMap hashMap = this.d;
        if (b) {
            return (n28) hashMap.get(q8nVar);
        }
        HashMap hashMap2 = this.e;
        if (hashMap2.containsKey(q8nVar)) {
            return (n28) hashMap2.get(q8nVar);
        }
        Set keySet = hashMap.keySet();
        if (q8nVar.b()) {
            z = keySet.contains(q8nVar);
        } else {
            Iterator it = keySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                q8n q8nVar2 = (q8n) obj;
                d6z.y("Fully specified range is not actually fully specified.", q8nVar2.b());
                int i = q8nVar.b;
                if (i == 0 || i == q8nVar2.b) {
                    d6z.y("Fully specified range is not actually fully specified.", q8nVar2.b());
                    int i2 = q8nVar.a;
                    if (i2 != 0) {
                        int i3 = q8nVar2.a;
                        if ((i2 == 2 && i3 != 1) || i2 == i3) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = obj != null;
        }
        n28 n28Var = z ? new n28(new jdj(this.b, q8nVar), this.c) : null;
        hashMap2.put(q8nVar, n28Var);
        return n28Var;
    }
}
