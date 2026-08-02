package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.bo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4740bo implements ProtobufConverter {
    public final Pn a;
    public final W b;
    public final C5187t6 c;
    public final Ll d;
    public final Se e;
    public final Te f;

    public C4740bo() {
        this(new Pn(), new W(new Hn()), new C5187t6(), new Ll(), new Se(), new Te());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4877h6 fromModel(@NonNull C4714ao c4714ao) {
        C4877h6 c4877h6 = new C4877h6();
        Qn qn = c4714ao.a;
        if (qn != null) {
            c4877h6.a = this.a.fromModel(qn);
        }
        V v = c4714ao.b;
        if (v != null) {
            c4877h6.b = this.b.fromModel(v);
        }
        List<Nl> list = c4714ao.c;
        if (list != null) {
            c4877h6.e = this.d.fromModel(list);
        }
        String str = c4714ao.g;
        if (str != null) {
            c4877h6.c = str;
        }
        c4877h6.d = this.c.a(c4714ao.h);
        if (!TextUtils.isEmpty(c4714ao.d)) {
            c4877h6.h = this.e.fromModel(c4714ao.d);
        }
        if (!TextUtils.isEmpty(c4714ao.e)) {
            c4877h6.i = c4714ao.e.getBytes();
        }
        if (!vo.a(c4714ao.f)) {
            c4877h6.j = this.f.fromModel(c4714ao.f);
        }
        return c4877h6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C4740bo(Pn pn, W w, C5187t6 c5187t6, Ll ll, Se se, Te te) {
        this.b = w;
        this.a = pn;
        this.c = c5187t6;
        this.d = ll;
        this.e = se;
        this.f = te;
    }

    @NonNull
    public final C4714ao a(@NonNull C4877h6 c4877h6) {
        throw new UnsupportedOperationException();
    }
}
