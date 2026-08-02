package defpackage;

import java.util.HashMap;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import ru.yandex.taxi.common_models.net.CacheStatus;

/* loaded from: classes9.dex */
public final class nn11 extends vfx {
    public final h3y a;
    public final KSerializer b = qke.n(CacheStatus.Companion.serializer());
    public final asq0 c = d6z.f("ru.yandex.taxi.common_models.net.TypedExperiments.Container", new SerialDescriptor[0], new ceu0(16));

    public nn11(h3y h3yVar) {
        this.a = h3yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c9  */
    @Override // defpackage.vfx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ncx ncxVar) {
        String g;
        CacheStatus cacheStatus;
        qn11 qn11Var;
        b t = ncxVar.t();
        if (t instanceof c) {
            c cVar = (c) t;
            b bVar = (b) cVar.get("name");
            if (bVar != null && (g = qcx.g(qcx.n(bVar))) != null) {
                b bVar2 = (b) cVar.get("version");
                String g2 = bVar2 != null ? qcx.g(qcx.n(bVar2)) : null;
                try {
                    sbx d = ncxVar.d();
                    KSerializer kSerializer = this.b;
                    b bVar3 = (b) ((c) t).get("cache_status");
                    if (bVar3 == null) {
                        bVar3 = JsonNull.INSTANCE;
                    }
                    cacheStatus = (CacheStatus) d.a(kSerializer, bVar3);
                } catch (Exception unused) {
                    cacheStatus = null;
                }
                b bVar4 = (b) cVar.get("value");
                clw0 clw0Var = (clw0) ((dlw0) this.a.get()).a.get(g);
                KSerializer kSerializer2 = clw0Var != null ? (KSerializer) clw0Var.e.getValue() : null;
                if (bVar4 == null || kSerializer2 == null) {
                    return new un11(null, g, g2, cacheStatus, bVar4);
                }
                try {
                    qn11Var = (qn11) ncxVar.d().a(kSerializer2, bVar4);
                } catch (MissingFieldException e) {
                    jst.e.k(e, "Failed to parse typed experiment '" + g + "'");
                    qn11Var = null;
                    if (qn11Var instanceof rn11) {
                    }
                    return new un11(qn11Var, g, g2, cacheStatus, bVar4);
                } catch (Exception e2) {
                    jst.e.x(e2, "Failed to parse typed experiment '" + g + "'");
                    qn11Var = null;
                    if (qn11Var instanceof rn11) {
                    }
                    return new un11(qn11Var, g, g2, cacheStatus, bVar4);
                }
                if (qn11Var instanceof rn11) {
                    ((rn11) qn11Var).b = bVar4;
                }
                return new un11(qn11Var, g, g2, cacheStatus, bVar4);
            }
        }
        return null;
    }

    @Override // defpackage.vfx
    public final void b(vcx vcxVar, Object obj) {
        un11 un11Var = (un11) obj;
        if (un11Var == null) {
            vcxVar.y();
            return;
        }
        String str = un11Var.c;
        qn11 qn11Var = un11Var.a;
        String str2 = un11Var.b;
        b bVar = un11Var.e;
        if (bVar == null) {
            rn11 rn11Var = qn11Var instanceof rn11 ? (rn11) qn11Var : null;
            bVar = rn11Var != null ? rn11Var.b : null;
        }
        if (bVar != null) {
            boolean z = vcxVar.d().a.f;
            HashMap hashMap = new HashMap(3);
            hashMap.put("name", qcx.c(str2));
            if (str != null || z) {
                hashMap.put("version", qcx.c(str));
            }
            hashMap.put("value", bVar);
            vcxVar.p(new c(hashMap));
            return;
        }
        clw0 clw0Var = (clw0) ((dlw0) this.a.get()).a.get(str2);
        KSerializer kSerializer = clw0Var != null ? (KSerializer) clw0Var.e.getValue() : null;
        asq0 asq0Var = this.c;
        yjd b = vcxVar.b(asq0Var);
        b.o(asq0Var, 0, str2);
        if (str != null) {
            b.o(asq0Var, 1, str);
        }
        if (qn11Var != null && kSerializer != null) {
            b.e(asq0Var, 2, kSerializer, qn11Var);
        }
        b.c(asq0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.c;
    }
}
