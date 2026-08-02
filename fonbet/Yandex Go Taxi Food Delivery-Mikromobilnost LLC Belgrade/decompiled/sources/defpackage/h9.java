package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;

/* loaded from: classes8.dex */
public abstract class h9 extends vfx {
    public static final e9 Companion = new e9();
    public static final KSerializer c;
    public static final i8u d;
    public final asq0 a;
    public final i3y b;

    static {
        KSerializer serializer = b.Companion.serializer();
        c = serializer;
        d = new i8u("kotlin.collections.LinkedHashMap", auu0.b, serializer.getDescriptor());
    }

    public h9() {
        String c2 = qoi0.a(getClass()).c();
        String replace = c2 != null ? c2.replace('$', '.') : null;
        if (replace == null) {
            ny61.g("Required value was null.");
            throw null;
        }
        this.a = d6z.g(replace, new SerialDescriptor[0]);
        this.b = a.b(LazyThreadSafetyMode.PUBLICATION, new d9(0, this));
    }

    public static void d(vcx vcxVar, KSerializer kSerializer, Object obj, String str, String str2) {
        sbx d2 = vcxVar.d();
        d2.getClass();
        c m = qcx.m(gwk0.J(d2, obj, kSerializer));
        if (m.containsKey(str)) {
            vcxVar.p(m);
            return;
        }
        SerialDescriptor serialDescriptor = d;
        yjd b = vcxVar.b(serialDescriptor);
        int i = 0;
        if (str2 != null) {
            b.o(serialDescriptor, 0, str);
            b.o(serialDescriptor, 1, str2);
            i = 2;
        }
        for (Map.Entry entry : m.a.entrySet()) {
            String str3 = (String) entry.getKey();
            Object obj2 = (b) entry.getValue();
            int i2 = i + 1;
            b.o(serialDescriptor, i, str3);
            i += 2;
            b.e(serialDescriptor, i2, c, obj2);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.vfx
    public final Object a(ncx ncxVar) {
        String str;
        KSerializer kSerializer;
        b t = ncxVar.t();
        g9 g9Var = (g9) this.b.getValue();
        if (g9Var.d != null || !(t instanceof JsonNull)) {
            if ((t instanceof c ? (c) t : null) == null) {
                xfo.j("Invalid element received for serialized: ", qoi0.a(getClass()).d(), ", element ", t);
                return null;
            }
            b bVar = (b) ((c) t).get(e());
            if (bVar == null) {
                str = null;
            } else {
                if (!(bVar instanceof d)) {
                    xfo.j("Invalid element received for serialized: ", qoi0.a(getClass()).d(), ", element ", t);
                    return null;
                }
                str = qcx.g((d) bVar);
            }
            if (str == null || (kSerializer = (KSerializer) g9Var.b.get(str)) == null) {
                lb7 lb7Var = g9Var.d;
                kSerializer = lb7Var != null ? (KSerializer) lb7Var.b : null;
            }
            if (kSerializer != null) {
                return ncxVar.d().a(kSerializer, t);
            }
        }
        return null;
    }

    @Override // defpackage.vfx
    public final void b(vcx vcxVar, Object obj) {
        if (obj == null) {
            vcxVar.y();
            return;
        }
        vcxVar.C();
        g9 g9Var = (g9) this.b.getValue();
        g0c a = qoi0.a(obj.getClass());
        HashMap hashMap = g9Var.c;
        String str = g9Var.a;
        lb7 lb7Var = g9Var.d;
        f9 f9Var = (f9) hashMap.get(a);
        if (f9Var != null) {
            d(vcxVar, f9Var.b, obj, str, f9Var.a);
            return;
        }
        if (lb7Var == null) {
            vcxVar.y();
        } else if (a.equals((g0c) lb7Var.c)) {
            d(vcxVar, (KSerializer) lb7Var.b, obj, str, null);
        } else {
            xfo.j("Invalid class received ", a, " in serializer ", qoi0.a(getClass()).d());
        }
    }

    public abstract lb7 c();

    public String e() {
        return "type";
    }

    public abstract List f();

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.a;
    }
}
