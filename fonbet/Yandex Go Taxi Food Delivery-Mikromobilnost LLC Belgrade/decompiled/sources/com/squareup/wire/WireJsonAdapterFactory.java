package com.squareup.wire;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.wire.internal.EnumJsonFormatter;
import com.squareup.wire.internal.ReflectionKt;
import com.squareup.wire.internal.RuntimeMessageAdapter;
import defpackage.jl40;
import defpackage.vg10;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B-\b\u0007\u0012\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u00002\u0010\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\fJ\u0012\u0010\n\u001a\u00020\u00002\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0005J,\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u001e\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/wire/WireJsonAdapterFactory;", "Lcom/squareup/moshi/JsonAdapter$Factory;", "typeUrlToAdapter", "", "", "Lcom/squareup/wire/ProtoAdapter;", "writeIdentityValues", "", "<init>", "(Ljava/util/Map;Z)V", "plus", "adapters", "", "adapter", "create", "Lcom/squareup/moshi/JsonAdapter;", "type", "Ljava/lang/reflect/Type;", "annotations", "", "", "moshi", "Lcom/squareup/moshi/Moshi;", "wire-moshi-adapter"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WireJsonAdapterFactory implements JsonAdapter.Factory {
    private final Map<String, ProtoAdapter<?>> typeUrlToAdapter;
    private final boolean writeIdentityValues;

    public /* synthetic */ WireJsonAdapterFactory(Map map, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? b.f() : map, (i & 2) != 0 ? false : z);
    }

    @Override // com.squareup.moshi.JsonAdapter.Factory
    public JsonAdapter<?> create(Type type, Set<? extends Annotation> annotations, Moshi moshi) {
        Class<?> rawType = Types.getRawType(type);
        if (!annotations.isEmpty()) {
            return null;
        }
        if (jl40.l(rawType, AnyMessage.class)) {
            return new AnyMessageJsonAdapter(moshi, this.typeUrlToAdapter);
        }
        if (Message.class.isAssignableFrom(rawType)) {
            RuntimeMessageAdapter createRuntimeMessageAdapter = ReflectionKt.createRuntimeMessageAdapter((Class) type, this.writeIdentityValues, rawType.getClassLoader());
            return new MessageJsonAdapter(createRuntimeMessageAdapter, MoshiJsonIntegration.INSTANCE.jsonAdapters(createRuntimeMessageAdapter, moshi), moshi.adapter(Types.newParameterizedType(List.class, String.class))).nullSafe();
        }
        if (WireEnum.class.isAssignableFrom(rawType)) {
            return new EnumJsonAdapter(new EnumJsonFormatter(RuntimeEnumAdapter.INSTANCE.create((Class) type))).nullSafe();
        }
        return null;
    }

    public final WireJsonAdapterFactory plus(List<? extends ProtoAdapter<?>> adapters) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.typeUrlToAdapter);
        for (ProtoAdapter<?> protoAdapter : adapters) {
            String typeUrl = protoAdapter.getTypeUrl();
            if (typeUrl == null) {
                vg10.i("recompile ", protoAdapter.getType(), " to use it with WireJsonAdapterFactory");
                return null;
            }
            linkedHashMap.put(typeUrl, protoAdapter);
        }
        return new WireJsonAdapterFactory(linkedHashMap, this.writeIdentityValues);
    }

    public WireJsonAdapterFactory(Map<String, ? extends ProtoAdapter<?>> map) {
        this(map, false, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WireJsonAdapterFactory(Map<String, ? extends ProtoAdapter<?>> map, boolean z) {
        this.typeUrlToAdapter = map;
        this.writeIdentityValues = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WireJsonAdapterFactory() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public final WireJsonAdapterFactory plus(ProtoAdapter<?> adapter) {
        return plus(Collections.singletonList(adapter));
    }
}
