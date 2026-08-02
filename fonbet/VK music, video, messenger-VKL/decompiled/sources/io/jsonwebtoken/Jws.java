package io.jsonwebtoken;

/* loaded from: classes8.dex */
public interface Jws<B> extends Jwt<JwsHeader, B> {
    String getSignature();
}
