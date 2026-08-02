package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;

@gsq0(with = a.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ld580;", "", "Companion", "a", "c580", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class d580 {
    public static final c580 Companion = new c580();
    public final List a;

    public static final class a extends vfx {
        public final SerialDescriptor a = c.Companion.serializer().getDescriptor();

        @Override // defpackage.vfx
        public final Object a(ncx ncxVar) {
            Object t = ncxVar.t();
            if (!(t instanceof c)) {
                yci0.v(t, "Invalid OrderRequirements received: ");
                return null;
            }
            ListBuilder a = rcc.a();
            for (Map.Entry entry : ((Map) t).entrySet()) {
                String str = (String) entry.getKey();
                Object obj = (b) entry.getValue();
                boolean z = obj instanceof d;
                EmptyList emptyList = EmptyList.a;
                if (z) {
                    d dVar = (d) obj;
                    if (dVar.b()) {
                        a.add(gi.f(str, "", emptyList, new qf70(dVar.a())));
                    } else if (qcx.f(dVar) != null) {
                        a.add(gi.e(str, ""));
                    } else {
                        a.add(gi.f(str, "", emptyList, new of70(qcx.j(dVar))));
                    }
                } else if (obj instanceof kotlinx.serialization.json.a) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (b bVar : (Iterable) obj) {
                        if (arrayList != null) {
                            try {
                                int j = qcx.j(qcx.n(bVar));
                                arrayList.add(Integer.valueOf(j));
                                arrayList2.add(String.valueOf(j));
                            } catch (NumberFormatException unused) {
                                arrayList2.add(qcx.n(bVar).a());
                                arrayList = null;
                            }
                        } else {
                            arrayList2.add(qcx.n(bVar).a());
                        }
                    }
                    a.add(gi.f(str, "", emptyList, (arrayList == null || arrayList.isEmpty()) ? arrayList2.size() > 1 ? crb1.h(arrayList2) : new qf70((String) arrayList2.get(0)) : arrayList.size() > 1 ? crb1.g(arrayList) : new of70(((Number) arrayList.get(0)).intValue())));
                }
            }
            return new d580(a.j());
        }

        @Override // defpackage.vfx
        public final void b(vcx vcxVar, Object obj) {
            SerialDescriptor serialDescriptor = this.a;
            yjd b = vcxVar.b(serialDescriptor);
            int i = 0;
            for (b580 b580Var : ((d580) obj).a) {
                int i2 = i + 1;
                b.o(serialDescriptor, i, b580Var.a);
                Serializable k0 = q5z.k0(b580Var.b());
                if (k0 instanceof Collection) {
                    i += 2;
                    b.e(serialDescriptor, i2, cm2.a, k0);
                } else if (k0 instanceof Boolean) {
                    i += 2;
                    b.n(serialDescriptor, i2, ((Boolean) k0).booleanValue());
                } else if (k0 instanceof String) {
                    i += 2;
                    b.o(serialDescriptor, i2, (String) k0);
                } else if (!(k0 instanceof Integer)) {
                    yci0.v(k0, "Invalid requirement value received on serialization ");
                    return;
                } else {
                    i += 2;
                    b.A(i2, ((Number) k0).intValue(), serialDescriptor);
                }
            }
            b.c(serialDescriptor);
        }

        @Override // defpackage.myi
        public final SerialDescriptor getDescriptor() {
            return this.a;
        }
    }

    public d580(List list) {
        this.a = list;
    }

    public d580() {
        this(0);
    }

    public /* synthetic */ d580(int i) {
        this(EmptyList.a);
    }
}
