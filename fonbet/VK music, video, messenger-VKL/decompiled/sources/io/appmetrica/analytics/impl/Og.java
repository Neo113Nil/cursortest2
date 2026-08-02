package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.List;

/* loaded from: classes8.dex */
public final class Og implements ProtobufConverter {
    public final Pn a;
    public final W b;
    public final C5187t6 c;
    public final Ll d;
    public final Se e;
    public final Te f;

    public Og() {
        this(new Pn(), new W(new Hn()), new C5187t6(), new Ll(), new Se(), new Te());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4928j6 fromModel(@NonNull Ng ng) {
        C4928j6 c4928j6 = new C4928j6();
        c4928j6.f = StringUtils.correctIllFormedString((String) WrapUtils.getOrDefault(ng.a, c4928j6.f));
        C4714ao c4714ao = ng.b;
        if (c4714ao != null) {
            Qn qn = c4714ao.a;
            if (qn != null) {
                c4928j6.a = this.a.fromModel(qn);
            }
            V v = c4714ao.b;
            if (v != null) {
                c4928j6.b = this.b.fromModel(v);
            }
            List<Nl> list = c4714ao.c;
            if (list != null) {
                c4928j6.e = this.d.fromModel(list);
            }
            c4928j6.c = (String) WrapUtils.getOrDefault(c4714ao.g, c4928j6.c);
            c4928j6.d = this.c.a(c4714ao.h);
            if (!TextUtils.isEmpty(c4714ao.d)) {
                c4928j6.i = this.e.fromModel(c4714ao.d);
            }
            if (!TextUtils.isEmpty(c4714ao.e)) {
                c4928j6.j = c4714ao.e.getBytes();
            }
            if (!vo.a(c4714ao.f)) {
                c4928j6.k = this.f.fromModel(c4714ao.f);
            }
        }
        return c4928j6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Og(Pn pn, W w, C5187t6 c5187t6, Ll ll, Se se, Te te) {
        this.a = pn;
        this.b = w;
        this.c = c5187t6;
        this.d = ll;
        this.e = se;
        this.f = te;
    }

    @NonNull
    public final Ng a(@NonNull C4928j6 c4928j6) {
        throw new UnsupportedOperationException();
    }
}
