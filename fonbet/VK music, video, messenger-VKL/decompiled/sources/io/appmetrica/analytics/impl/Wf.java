package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes8.dex */
public final class Wf implements ProtobufStateStorage {
    public final String a;
    public final IBinaryDataHelper b;
    public final ProtobufStateSerializer c;
    public final ProtobufConverter d;

    public Wf(@NonNull String str, @NonNull IBinaryDataHelper iBinaryDataHelper, @NonNull ProtobufStateSerializer<MessageNano> protobufStateSerializer, @NonNull ProtobufConverter<Object, MessageNano> protobufConverter) {
        this.a = str;
        this.b = iBinaryDataHelper;
        this.c = protobufStateSerializer;
        this.d = protobufConverter;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final void delete() {
        this.b.remove(this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    @NonNull
    public final Object read() {
        try {
            byte[] bArr = this.b.get(this.a);
            if (bArr != null && bArr.length != 0) {
                return this.d.toModel((MessageNano) this.c.toState(bArr));
            }
            return this.d.toModel((MessageNano) this.c.defaultValue());
        } catch (Throwable unused) {
            return this.d.toModel((MessageNano) this.c.defaultValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final void save(@NonNull Object obj) {
        this.b.insert(this.a, this.c.toByteArray((MessageNano) this.d.fromModel(obj)));
    }
}
