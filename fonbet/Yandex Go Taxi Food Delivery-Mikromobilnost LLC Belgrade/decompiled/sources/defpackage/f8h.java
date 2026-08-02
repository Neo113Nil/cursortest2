package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.yandex.quark.js.event.a;
import com.yandex.quark.js.event.c;
import com.yandex.quark.js.event.d;
import com.yandex.quark.js.event.e;
import com.yandex.quark.js.event.f;
import com.yandex.quark.js.event.g;
import com.yandex.quark.js.event.h;
import com.yandex.quark.js.event.i;
import com.yandex.quark.js.implementation.common.CapabilityMessageClassNotFoundException;
import defpackage.yp6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.collections.b;
import okio.ByteString;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.alice.protos.endpoint.js.TAnyCapabilityHolder;
import ru.yandex.alice.protos.endpoint.js.TCapability;

/* loaded from: classes8.dex */
public final class f8h implements h38 {
    public static final List d = scc.g("ru.yandex.alice.protos.endpoint.capabilities", "ru.yandex.alice.protos.endpoint.capabilities.quark.chat", "ru.yandex.alice.protos.endpoint.capabilities.quark.webchat", "ru.yandex.alice.protos.endpoint.capabilities.app_notification", "ru.yandex.alice.protos.endpoint.capabilities.quark.file.download", "ru.yandex.alice.protos.endpoint.capabilities.js", "ru.yandex.alice.protos.endpoint.capabilities.satellite", "ru.yandex.alice.protos.endpoint.capabilities.quark.speechmode", "ru.yandex.alice.protos.endpoint.capabilities.yango", "ru.yandex.alice.protos.endpoint.capabilities.deeplinks");
    public final Set a;
    public final a38 b = new a38();
    public final t830 c = new t830(b.f(), true);

    public f8h(Set set) {
        this.a = set;
    }

    @Override // defpackage.h38
    public final syj0 a(clc clcVar) {
        if (clcVar.equals(akc.c) || (clcVar instanceof zjc) || (clcVar instanceof ikc) || (clcVar instanceof nkc) || (clcVar instanceof rkc) || (clcVar instanceof zkc)) {
            return new lyj0(clcVar);
        }
        if (clcVar instanceof ekc) {
            ekc ekcVar = (ekc) clcVar;
            syj0 c = c(((dkc) ekcVar.a()).b());
            if (c instanceof lyj0) {
                return new lyj0(new ekc(((dkc) ekcVar.a()).a(), (png) ((lyj0) c).a, ((dkc) ekcVar.a()).c(), ((dkc) ekcVar.a()).d()));
            }
            if (c instanceof jyj0) {
                return c;
            }
            w511.b();
            return null;
        }
        if (!(clcVar instanceof vkc)) {
            w511.b();
            return null;
        }
        vkc vkcVar = (vkc) clcVar;
        syj0 c2 = c(((ukc) vkcVar.a()).b());
        if (c2 instanceof lyj0) {
            return new lyj0(new vkc(((ukc) vkcVar.a()).a(), (png) ((lyj0) c2).a));
        }
        if (c2 instanceof jyj0) {
            return c2;
        }
        w511.b();
        return null;
    }

    @Override // defpackage.h38
    public final syj0 b(i iVar) {
        if ((iVar instanceof a) || (iVar instanceof com.yandex.quark.js.event.b) || (iVar instanceof e) || (iVar instanceof f) || (iVar instanceof h) || (iVar instanceof c)) {
            return new lyj0(iVar);
        }
        boolean z = iVar instanceof g;
        Set set = this.a;
        if (z) {
            g gVar = (g) iVar;
            if (set.contains(((ieo) gVar.a()).b())) {
                return new lyj0(gVar);
            }
            syj0 d2 = d(((ieo) gVar.a()).c());
            if (d2 instanceof lyj0) {
                return new lyj0(new g(ieo.a((ieo) gVar.a(), (png) ((lyj0) d2).a)));
            }
            if (d2 instanceof jyj0) {
                return d2;
            }
            w511.b();
            return null;
        }
        if (!(iVar instanceof d)) {
            w511.b();
            return null;
        }
        d dVar = (d) iVar;
        if (set.contains(((zdo) dVar.a()).b())) {
            return new lyj0(dVar);
        }
        syj0 d3 = d(((zdo) dVar.a()).c());
        if (d3 instanceof lyj0) {
            return new lyj0(new d(zdo.a((zdo) dVar.a(), (png) ((lyj0) d3).a)));
        }
        if (d3 instanceof jyj0) {
            return d3;
        }
        w511.b();
        return null;
    }

    public final syj0 c(png pngVar) {
        Object obj;
        a38 a38Var = this.b;
        try {
            String a = pngVar.a();
            if (a == null) {
                obj = pngVar;
            } else {
                rbx rbxVar = sbx.d;
                rbxVar.getClass();
                kotlinx.serialization.json.c cVar = (kotlinx.serialization.json.c) rbxVar.b(kotlinx.serialization.json.c.Companion.serializer(), a);
                if (cVar.a.size() != 2) {
                    throw new IllegalArgumentException(("Capability state must contain exactly 2 entries, but found " + cVar.a.size()).toString());
                }
                kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) cVar.get("json_capability");
                kotlinx.serialization.json.c m = bVar != null ? qcx.m(bVar) : null;
                if (m == null) {
                    throw new IllegalArgumentException("Json representation must have json_capability");
                }
                Map map = m.a;
                String str = (String) a38Var.e.get((String) kotlin.collections.a.O(map.keySet()));
                if (str == null) {
                    throw new IllegalArgumentException(("Cannot find json name for capability type: " + kotlin.collections.a.O(map.keySet())).toString());
                }
                Object obj2 = m.get(kotlin.collections.a.O(map.keySet()));
                kotlinx.serialization.json.c cVar2 = obj2 instanceof kotlinx.serialization.json.c ? (kotlinx.serialization.json.c) obj2 : null;
                if (cVar2 == null) {
                    throw new IllegalArgumentException("Capability value must be a JSON object");
                }
                String str2 = (String) a38Var.a.get(str);
                if (str2 == null) {
                    throw new IllegalArgumentException("Unknown capability JSON name: ".concat(str).toString());
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(cVar2);
                linkedHashMap.put("@type", qcx.c(str2));
                obj = vvb1.s(new kotlinx.serialization.json.c(linkedHashMap).toString(), pngVar.b());
            }
        } catch (Throwable th) {
            obj = new Result.Failure(th);
        }
        return q5z.i0(obj);
    }

    public final syj0 d(png pngVar) {
        Object obj;
        a38 a38Var = this.b;
        try {
            String a = pngVar.a();
            if (a == null) {
                obj = pngVar;
            } else {
                rbx rbxVar = sbx.d;
                rbxVar.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap((Map) rbxVar.b(kotlinx.serialization.json.c.Companion.serializer(), a));
                kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) linkedHashMap.remove("@type");
                String str = null;
                if (bVar != null) {
                    kotlinx.serialization.json.d n = qcx.n(bVar);
                    if (!n.b()) {
                        n = null;
                    }
                    if (n != null) {
                        str = n.a();
                    }
                }
                if (str == null) {
                    throw new IllegalArgumentException("Capability state must contain @type");
                }
                String str2 = (String) a38Var.b.get(str);
                if (str2 == null) {
                    throw new IllegalArgumentException("Unknown capability type: ".concat(str).toString());
                }
                String str3 = (String) a38Var.c.get(str2);
                if (str3 == null) {
                    throw new IllegalArgumentException("Unknown json name: ".concat(str2).toString());
                }
                TAnyCapabilityHolder tAnyCapabilityHolder = new TAnyCapabilityHolder(e(str3, new kotlinx.serialization.json.c(linkedHashMap)), TCapability.ECapabilityType.valueOf(str3.concat("Type")), null, 4, null);
                Object C = q5z.C(this.c.b(TAnyCapabilityHolder.class, tAnyCapabilityHolder));
                if (C == null) {
                    throw new IllegalArgumentException("Error parsing json capability to proto");
                }
                obj = vvb1.s((String) C, TAnyCapabilityHolder.ADAPTER.encode(tAnyCapabilityHolder));
            }
        } catch (Throwable th) {
            obj = new Result.Failure(th);
        }
        return q5z.i0(obj);
    }

    public final ByteString e(String str, kotlinx.serialization.json.c cVar) {
        String concat = "T".concat(str);
        List list = d;
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((String) it.next()) + Extension.DOT_CHAR + concat);
        }
        Class cls = (Class) kotlin.sequences.b.j(kotlin.sequences.b.o(new h73(1, arrayList), new suf(this)));
        if (cls == null) {
            throw new CapabilityMessageClassNotFoundException("Capability message class not found: " + concat + " in " + list);
        }
        Object C = q5z.C(this.c.a(cls, cVar.toString()));
        if (C == null) {
            w511.f("Error decoding capability JSON to message: ".concat(concat));
            return null;
        }
        byte[] encode = ((ProtoAdapter) cls.getDeclaredField("ADAPTER").get(null)).encode(C);
        yp6.a aVar = j.a;
        int length = encode.length;
        j.b(encode.length, 0L, length);
        return new ByteString(f73.m(0, length, encode));
    }
}
