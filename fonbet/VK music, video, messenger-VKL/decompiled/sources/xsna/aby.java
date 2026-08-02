package xsna;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.EmptySet;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import xsna.gmi0;
import xsna.z2m;

/* compiled from: TreeJsonDecoder.kt */
/* loaded from: classes8.dex */
public class aby extends bf {
    public final JsonObject g;
    public final SerialDescriptor h;
    public int i;
    public boolean j;

    public /* synthetic */ aby(j8y j8yVar, JsonObject jsonObject, String str, int i) {
        this(j8yVar, jsonObject, (i & 4) != 0 ? null : str, (SerialDescriptor) null);
    }

    @Override // xsna.bf, kotlinx.serialization.encoding.Decoder
    public final boolean G() {
        return !this.j && super.G();
    }

    @Override // xsna.au50
    public String Q(SerialDescriptor serialDescriptor, int i) {
        j8y j8yVar = this.d;
        t9y.c(serialDescriptor, j8yVar);
        String d = serialDescriptor.d(i);
        if (this.f.j && !W().b.keySet().contains(d)) {
            z2m z2mVar = j8yVar.c;
            i5 i5Var = new i5(15, serialDescriptor, j8yVar);
            ConcurrentHashMap concurrentHashMap = z2mVar.a;
            Map map = (Map) concurrentHashMap.get(serialDescriptor);
            Object obj = null;
            z2m.a<Map<String, Integer>> aVar = t9y.a;
            Object obj2 = map != null ? map.get(aVar) : null;
            if (obj2 == null) {
                obj2 = null;
            }
            if (obj2 == null) {
                obj2 = i5Var.invoke();
                Object obj3 = concurrentHashMap.get(serialDescriptor);
                if (obj3 == null) {
                    obj3 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(serialDescriptor, obj3);
                }
                ((Map) obj3).put(aVar, obj2);
            }
            Map map2 = (Map) obj2;
            Iterator<T> it = W().b.keySet().iterator();
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
        return d;
    }

    @Override // xsna.bf
    public JsonElement U(String str) {
        return (JsonElement) pn00.h(str, W());
    }

    @Override // xsna.bf
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public JsonObject W() {
        return this.g;
    }

    @Override // xsna.bf, kotlinx.serialization.encoding.Decoder
    public final ssi d(SerialDescriptor serialDescriptor) {
        SerialDescriptor serialDescriptor2 = this.h;
        if (serialDescriptor != serialDescriptor2) {
            return super.d(serialDescriptor);
        }
        JsonElement V = V();
        String f = serialDescriptor2.f();
        if (V instanceof JsonObject) {
            return new aby(this.d, (JsonObject) V, this.e, serialDescriptor2);
        }
        throw ne7.d("Expected " + fpf0.a(JsonObject.class).l() + ", but had " + fpf0.a(V.getClass()).l() + " as the serialized body of " + f + " at element: " + T(), V.toString(), -1);
    }

    @Override // xsna.bf, xsna.ssi
    public void e(SerialDescriptor serialDescriptor) {
        Set j;
        q8y q8yVar = this.f;
        if (q8yVar.b || (serialDescriptor.getKind() instanceof rub0)) {
            return;
        }
        j8y j8yVar = this.d;
        t9y.c(serialDescriptor, j8yVar);
        if (q8yVar.j) {
            Set f = fvr.f(serialDescriptor);
            Map map = (Map) j8yVar.c.a.get(serialDescriptor);
            Object obj = map != null ? map.get(t9y.a) : null;
            if (obj == null) {
                obj = null;
            }
            Map map2 = (Map) obj;
            Set keySet = map2 != null ? map2.keySet() : null;
            if (keySet == null) {
                keySet = EmptySet.b;
            }
            j = izi0.j(f, keySet);
        } else {
            j = fvr.f(serialDescriptor);
        }
        for (String str : W().b.keySet()) {
            if (!j.contains(str) && !epx.f(str, this.e)) {
                String jsonObject = W().toString();
                StringBuilder a = t33.a("Encountered an unknown key '", str, "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: ");
                a.append((Object) ne7.D(-1, jsonObject));
                throw ne7.c(-1, a.toString());
            }
        }
    }

    @Override // xsna.ssi
    public int m(SerialDescriptor serialDescriptor) {
        while (this.i < serialDescriptor.c()) {
            int i = this.i;
            this.i = i + 1;
            String Q = Q(serialDescriptor, i);
            int i2 = this.i - 1;
            this.j = false;
            boolean containsKey = W().containsKey(Q);
            j8y j8yVar = this.d;
            if (!containsKey) {
                boolean z = (j8yVar.a.f || serialDescriptor.i(i2) || !serialDescriptor.h(i2).b()) ? false : true;
                this.j = z;
                if (!z) {
                    continue;
                }
            }
            if (this.f.h) {
                boolean i3 = serialDescriptor.i(i2);
                SerialDescriptor h = serialDescriptor.h(i2);
                if (!i3 || h.b() || !(U(Q) instanceof JsonNull)) {
                    if (epx.f(h.getKind(), gmi0.b.a) && (!h.b() || !(U(Q) instanceof JsonNull))) {
                        JsonElement U = U(Q);
                        String str = null;
                        JsonPrimitive jsonPrimitive = U instanceof JsonPrimitive ? (JsonPrimitive) U : null;
                        if (jsonPrimitive != null) {
                            qzw qzwVar = c9y.a;
                            if (!(jsonPrimitive instanceof JsonNull)) {
                                str = jsonPrimitive.c();
                            }
                        }
                        if (str != null) {
                            int a = t9y.a(h, j8yVar, str);
                            boolean z2 = !j8yVar.a.f && h.b();
                            if (a == -3) {
                                if (!i3 && !z2) {
                                }
                            }
                        }
                    }
                }
            }
            return i2;
        }
        return -1;
    }

    public aby(j8y j8yVar, JsonObject jsonObject, String str, SerialDescriptor serialDescriptor) {
        super(j8yVar, jsonObject, str);
        this.g = jsonObject;
        this.h = serialDescriptor;
    }
}
