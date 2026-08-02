package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* renamed from: io.appmetrica.analytics.impl.bn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC4739bn implements InterfaceC4713an {
    @NonNull
    public abstract IBinaryDataHelper a(@NonNull Context context);

    @NonNull
    public abstract ProtobufStateStorage<Object> a(@NonNull Context context, @NonNull IBinaryDataHelper iBinaryDataHelper);

    @NonNull
    public abstract IBinaryDataHelper b(@NonNull Context context);

    @Override // io.appmetrica.analytics.impl.InterfaceC4713an, io.appmetrica.analytics.coreapi.internal.data.ProtobufBinaryStateStorageFactory
    @NonNull
    public final ProtobufStateStorage<Object> create(@NonNull Context context) {
        return a(context, a(context));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4713an, io.appmetrica.analytics.coreapi.internal.data.ProtobufBinaryStateStorageFactory
    @NonNull
    public final ProtobufStateStorage<Object> createForMigration(@NonNull Context context) {
        return a(context, b(context));
    }
}
