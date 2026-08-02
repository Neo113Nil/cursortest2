package io.jsonwebtoken.io;

/* loaded from: classes8.dex */
public interface Decoder<T, R> {
    R decode(T t) throws DecodingException;
}
