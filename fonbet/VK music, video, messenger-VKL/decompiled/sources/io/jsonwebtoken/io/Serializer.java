package io.jsonwebtoken.io;

/* loaded from: classes8.dex */
public interface Serializer<T> {
    byte[] serialize(T t) throws SerializationException;
}
