package defpackage;

import defpackage.iyi;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.EmptySet;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonDecodingException;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;

/* loaded from: classes9.dex */
public class kex extends c8 {
    public final c f;
    public final SerialDescriptor g;
    public int h;
    public boolean i;

    public /* synthetic */ kex(sbx sbxVar, c cVar, String str, int i) {
        this(sbxVar, cVar, (i & 4) != 0 ? null : str, (SerialDescriptor) null);
    }

    @Override // defpackage.c8, defpackage.n7x0, kotlinx.serialization.encoding.Decoder
    public final boolean D() {
        return !this.i && super.D();
    }

    @Override // defpackage.w150
    public String W(SerialDescriptor serialDescriptor, int i) {
        sbx sbxVar = this.c;
        ddx.e(sbxVar, serialDescriptor);
        String f = serialDescriptor.f(i);
        if (this.e.j && !a0().a.keySet().contains(f)) {
            iyi iyiVar = sbxVar.c;
            iyi.a aVar = ddx.a;
            ou ouVar = new ou(27, serialDescriptor, sbxVar);
            ConcurrentHashMap concurrentHashMap = iyiVar.a;
            Map map = (Map) concurrentHashMap.get(serialDescriptor);
            Object obj = null;
            Object obj2 = map != null ? map.get(aVar) : null;
            if (obj2 == null) {
                obj2 = null;
            }
            if (obj2 == null) {
                obj2 = ouVar.invoke();
                Object obj3 = concurrentHashMap.get(serialDescriptor);
                if (obj3 == null) {
                    obj3 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(serialDescriptor, obj3);
                }
                ((Map) obj3).put(aVar, obj2);
            }
            Map map2 = (Map) obj2;
            Iterator it = a0().a.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Integer num = (Integer) map2.get((String) next);
                if (num != null && num.intValue() == i) {
                    obj = next;
                    break;
                }
            }
            String str = (String) obj;
            if (str != null) {
                return str;
            }
        }
        return f;
    }

    @Override // defpackage.c8
    public b Y(String str) {
        return (b) kotlin.collections.b.g(str, a0());
    }

    @Override // defpackage.c8, defpackage.n7x0, kotlinx.serialization.encoding.Decoder
    public final sjd b(SerialDescriptor serialDescriptor) {
        SerialDescriptor serialDescriptor2 = this.g;
        if (serialDescriptor != serialDescriptor2) {
            return super.b(serialDescriptor);
        }
        b Z = Z();
        String h = serialDescriptor2.h();
        boolean z = Z instanceof c;
        sbx sbxVar = this.c;
        if (z) {
            return new kex(sbxVar, (c) Z, this.d, serialDescriptor2);
        }
        String str = "Expected " + qoi0.a(c.class).d() + ", but had " + qoi0.a(Z.getClass()).d() + " as the serialized body of " + h;
        String X = X();
        String obj = sbxVar.a.n ? qje.G(-1, Z.toString()).toString() : null;
        throw new JsonDecodingException(qje.n(-1, str, X, null, obj), str, X, obj, -1, null);
    }

    @Override // defpackage.c8, defpackage.n7x0, defpackage.sjd
    public void c(SerialDescriptor serialDescriptor) {
        Set h;
        sbx sbxVar = this.c;
        if (ddx.d(sbxVar, serialDescriptor) || (serialDescriptor.getKind() instanceof s5e0)) {
            return;
        }
        ddx.e(sbxVar, serialDescriptor);
        if (this.e.j) {
            Set f = uh6.f(serialDescriptor);
            iyi iyiVar = sbxVar.c;
            iyi.a aVar = ddx.a;
            Map map = (Map) iyiVar.a.get(serialDescriptor);
            Object obj = map != null ? map.get(aVar) : null;
            if (obj == null) {
                obj = null;
            }
            Map map2 = (Map) obj;
            Set keySet = map2 != null ? map2.keySet() : null;
            if (keySet == null) {
                keySet = EmptySet.a;
            }
            h = v4r0.h(f, keySet);
        } else {
            h = uh6.f(serialDescriptor);
        }
        for (String str : a0().a.keySet()) {
            if (!h.contains(str) && !jl40.l(str, this.d)) {
                String l = unr0.l('\'', "Encountered an unknown key '", str);
                String X = X();
                String obj2 = sbxVar.a.n ? qje.G(-1, a0().toString()).toString() : null;
                throw new JsonDecodingException(qje.n(-1, l, X, "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.", obj2), l, X, obj2, -1, "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.");
            }
        }
    }

    @Override // defpackage.c8
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public c a0() {
        return this.f;
    }

    public final boolean e0(SerialDescriptor serialDescriptor, int i) {
        boolean z = (this.c.a.f || serialDescriptor.i(i) || !serialDescriptor.d(i).b()) ? false : true;
        this.i = z;
        return z;
    }

    @Override // defpackage.sjd
    public int v(SerialDescriptor serialDescriptor) {
        while (this.h < serialDescriptor.e()) {
            int i = this.h;
            this.h = i + 1;
            String W = W(serialDescriptor, i);
            int i2 = this.h - 1;
            this.i = false;
            if (a0().containsKey(W) || e0(serialDescriptor, i2)) {
                if (this.e.h) {
                    boolean i3 = serialDescriptor.i(i2);
                    SerialDescriptor d = serialDescriptor.d(i2);
                    if (!i3 || d.b() || !(((b) a0().get(W)) instanceof JsonNull)) {
                        if (jl40.l(d.getKind(), fsq0.g) && (!d.b() || !(((b) a0().get(W)) instanceof JsonNull))) {
                            b bVar = (b) a0().get(W);
                            d dVar = bVar instanceof d ? (d) bVar : null;
                            String g = dVar != null ? qcx.g(dVar) : null;
                            if (g != null) {
                                sbx sbxVar = this.c;
                                int b = ddx.b(d, sbxVar, g);
                                boolean z = !sbxVar.a.f && d.b();
                                if (b == -3 && ((i3 || z) && !e0(serialDescriptor, i2))) {
                                }
                            }
                        }
                    }
                }
                return i2;
            }
        }
        return -1;
    }

    public kex(sbx sbxVar, c cVar, String str, SerialDescriptor serialDescriptor) {
        super(sbxVar, str);
        this.f = cVar;
        this.g = serialDescriptor;
    }
}
