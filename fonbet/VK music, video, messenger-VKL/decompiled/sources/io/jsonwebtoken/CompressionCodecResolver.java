package io.jsonwebtoken;

/* loaded from: classes8.dex */
public interface CompressionCodecResolver {
    CompressionCodec resolveCompressionCodec(Header header) throws CompressionException;
}
