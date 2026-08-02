package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.pf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5093pf implements ProtobufConverter {
    public final Bf a;
    public final C4963kf b;

    public C5093pf() {
        this(new Bf(), new C4963kf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5297xf fromModel(@NonNull C5041nf c5041nf) {
        C5297xf c5297xf = new C5297xf();
        c5297xf.a = this.a.fromModel(c5041nf.a);
        c5297xf.b = new C5272wf[c5041nf.b.size()];
        Iterator<C5015mf> it = c5041nf.b.iterator();
        int i = 0;
        while (it.hasNext()) {
            c5297xf.b[i] = this.b.fromModel(it.next());
            i++;
        }
        return c5297xf;
    }

    public C5093pf(Bf bf, C4963kf c4963kf) {
        this.a = bf;
        this.b = c4963kf;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5041nf toModel(@NonNull C5297xf c5297xf) {
        Af model;
        ArrayList arrayList = new ArrayList(c5297xf.b.length);
        for (C5272wf c5272wf : c5297xf.b) {
            arrayList.add(this.b.toModel(c5272wf));
        }
        C5247vf c5247vf = c5297xf.a;
        if (c5247vf == null) {
            model = this.a.toModel(new C5247vf());
        } else {
            model = this.a.toModel(c5247vf);
        }
        return new C5041nf(model, arrayList);
    }
}
