package io.jsonwebtoken.io;

/* loaded from: classes8.dex */
public interface Encoder<T, R> {
    R encode(T t) throws EncodingException;
}
