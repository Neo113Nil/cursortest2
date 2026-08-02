package com.yandex.messaging.core.net.entities.proto;

import com.squareup.wire.ProtoAdapter;
import defpackage.m5j0;
import defpackage.oq6;
import defpackage.qje;
import defpackage.t8o;
import defpackage.wg10;
import kotlin.text.Regex;

/* loaded from: classes15.dex */
public class ProtoRequestBody<T> extends m5j0 {
    public final ProtoAdapter b;
    public final t8o c;

    public ProtoRequestBody(ProtoAdapter protoAdapter, t8o t8oVar) {
        this.b = protoAdapter;
        this.c = t8oVar;
    }

    @Override // defpackage.m5j0
    public final long a() {
        return this.b.encodedSize(this.c);
    }

    @Override // defpackage.m5j0
    public final wg10 b() {
        Regex regex = wg10.e;
        try {
            return qje.o("application/protobuf");
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // defpackage.m5j0
    public final void d(oq6 oq6Var) {
        this.b.encode(oq6Var, (oq6) this.c);
    }
}
