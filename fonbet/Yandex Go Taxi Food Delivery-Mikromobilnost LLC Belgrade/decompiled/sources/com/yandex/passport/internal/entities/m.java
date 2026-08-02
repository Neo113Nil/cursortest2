package com.yandex.passport.internal.entities;

import com.yandex.passport.api.PassportPartition;
import defpackage.d6z;
import defpackage.h2f0;
import defpackage.ncx;
import defpackage.ny61;
import defpackage.qcx;
import defpackage.s43;
import defpackage.scc;
import defpackage.tcc;
import defpackage.yjd;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes15.dex */
public final class m implements KSerializer {
    public static final m a = new m();
    public static final s43 b = new s43(d6z.a("partition", h2f0.o), 1);

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        if (!(decoder instanceof ncx)) {
            ny61.g("Failed requirement.");
            return null;
        }
        kotlinx.serialization.json.a l = qcx.l(((ncx) decoder).t());
        ArrayList arrayList = new ArrayList(tcc.n(l, 10));
        Iterator it = l.a.iterator();
        while (it.hasNext()) {
            arrayList.add(qcx.n((kotlinx.serialization.json.b) it.next()).a());
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(PassportPartition.m231boximpl(PassportPartition.m232constructorimpl((String) it2.next())));
        }
        return new Partitions(arrayList2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Partitions partitions = (Partitions) obj;
        kotlin.collections.a.H(partitions);
        s43 s43Var = b;
        yjd r = encoder.r(s43Var);
        int i = 0;
        for (Object obj2 : partitions) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            r.o(s43Var, i, ((PassportPartition) obj2).m240unboximpl());
            i = i2;
        }
        r.c(s43Var);
    }
}
