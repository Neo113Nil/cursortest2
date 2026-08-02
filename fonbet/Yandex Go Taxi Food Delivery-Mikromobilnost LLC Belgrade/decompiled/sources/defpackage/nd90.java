package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* loaded from: classes9.dex */
public final class nd90 extends vfx {
    public final h3y a;
    public final asq0 b;

    public nd90(h3y h3yVar) {
        this.a = h3yVar;
        SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
        if (evu0.J("ru.yandex.taxi.common_models.net.Parameters.Container")) {
            ny61.g("Blank serial names are prohibited");
            throw null;
        }
        h0c h0cVar = new h0c("ru.yandex.taxi.common_models.net.Parameters.Container");
        h0cVar.a("name", auu0.b, (r3 & 8) == 0);
        h0cVar.a("value", c.Companion.serializer().getDescriptor(), (r3 & 8) == 0);
        this.b = new asq0("ru.yandex.taxi.common_models.net.Parameters.Container", ovu0.g, h0cVar.c.size(), j73.d0(serialDescriptorArr), h0cVar);
    }

    @Override // defpackage.vfx
    public final Object a(ncx ncxVar) {
        String g;
        b t = ncxVar.t();
        hd90 hd90Var = null;
        if (t instanceof c) {
            c cVar = (c) t;
            b bVar = (b) cVar.get("name");
            if (bVar != null && (g = qcx.g(qcx.n(bVar))) != null) {
                b bVar2 = (b) cVar.get("value");
                KSerializer kSerializer = (KSerializer) ((kd90) this.a.get()).a.get(g);
                if (bVar2 == null || kSerializer == null) {
                    return new fd90(g, null);
                }
                try {
                    hd90Var = (hd90) ncxVar.d().a(kSerializer, bVar2);
                } catch (MissingFieldException e) {
                    jst.e.k(e, "Failed to parse parameter '" + g + "'");
                } catch (Exception e2) {
                    jst.e.x(e2, "Failed to parse parameter '" + g + "'");
                }
                return new fd90(g, hd90Var);
            }
        }
        return null;
    }

    @Override // defpackage.vfx
    public final void b(vcx vcxVar, Object obj) {
        fd90 fd90Var = (fd90) obj;
        if (fd90Var == null) {
            vcxVar.y();
            return;
        }
        vcxVar.C();
        String str = fd90Var.a;
        KSerializer kSerializer = (KSerializer) ((kd90) this.a.get()).a.get(str);
        asq0 asq0Var = this.b;
        yjd b = vcxVar.b(asq0Var);
        b.o(asq0Var, 0, str);
        hd90 hd90Var = fd90Var.b;
        if (hd90Var == null || kSerializer == null) {
            b.g(asq0Var, 1, c.Companion.serializer(), null);
        } else {
            b.e(asq0Var, 1, kSerializer, hd90Var);
        }
        b.c(asq0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.b;
    }
}
