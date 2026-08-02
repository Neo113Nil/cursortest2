package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* renamed from: io.appmetrica.analytics.impl.om, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5074om {
    public final ProtobufStateStorage a;
    public final Go b;

    public C5074om(ProtobufStateStorage protobufStateStorage, Go go) {
        this.a = protobufStateStorage;
        this.b = go;
    }

    public C5074om(Context context) {
        this(((AbstractC4739bn) Zm.a(C5203tm.class)).create(context), C5342za.k().D().a());
    }
}
