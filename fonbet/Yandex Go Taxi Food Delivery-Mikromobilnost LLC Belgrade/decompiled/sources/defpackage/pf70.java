package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.d;

/* loaded from: classes9.dex */
public final class pf70 extends vfx {
    public static final pf70 a = new pf70();

    /* JADX WARN: Multi-variable type inference failed */
    public static rf70 c(b bVar) {
        if (bVar instanceof JsonNull) {
            return null;
        }
        if (bVar instanceof d) {
            d dVar = (d) bVar;
            if (dVar.b()) {
                return new qf70(dVar.a());
            }
            Boolean f = qcx.f(dVar);
            if (f != null) {
                return new mf70(f.booleanValue());
            }
            Integer k = qcx.k(dVar);
            if (k != null) {
                return new of70(k.intValue());
            }
            return null;
        }
        if (!(bVar instanceof a)) {
            g8e.A(jst.e, "Unexpected format for OptionValue");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar2 : (Iterable) bVar) {
            a.getClass();
            rf70 c = c(bVar2);
            if (c != null) {
                arrayList.add(c);
            }
        }
        return new nf70(arrayList);
    }

    @Override // defpackage.vfx
    public final Object a(ncx ncxVar) {
        return c(ncxVar.t());
    }

    @Override // defpackage.vfx
    public final void b(vcx vcxVar, Object obj) {
        int i;
        rf70 rf70Var = (rf70) obj;
        if (rf70Var == null) {
            vcxVar.y();
            return;
        }
        if (rf70Var instanceof qf70) {
            vcxVar.t(((qf70) rf70Var).b());
            return;
        }
        if (rf70Var instanceof of70) {
            vcxVar.q(((of70) rf70Var).a);
            return;
        }
        if (rf70Var instanceof mf70) {
            vcxVar.l(((mf70) rf70Var).a);
            return;
        }
        if (!(rf70Var instanceof nf70)) {
            w511.b();
            return;
        }
        SerialDescriptor descriptor = a.Companion.serializer().getDescriptor();
        nf70 nf70Var = (nf70) rf70Var;
        ((ArrayList) nf70Var.b()).size();
        yjd b = vcxVar.b(descriptor);
        Iterator it = ((ArrayList) nf70Var.b()).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            rf70 rf70Var2 = (rf70) it.next();
            if (rf70Var2 instanceof qf70) {
                i = i2 + 1;
                b.o(descriptor, i2, ((qf70) rf70Var2).b());
            } else if (rf70Var2 instanceof of70) {
                i = i2 + 1;
                b.A(i2, ((of70) rf70Var2).a, descriptor);
            } else {
                if (!(rf70Var2 instanceof mf70)) {
                    if (rf70Var2 instanceof nf70) {
                        yci0.m("OptionValueDto.Multiple does not support wrap into OptionValueDto.Multiple");
                        return;
                    } else {
                        w511.b();
                        return;
                    }
                }
                i = i2 + 1;
                b.n(descriptor, i2, ((mf70) rf70Var2).a);
            }
            i2 = i;
        }
        b.c(descriptor);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b.Companion.serializer().getDescriptor();
    }
}
