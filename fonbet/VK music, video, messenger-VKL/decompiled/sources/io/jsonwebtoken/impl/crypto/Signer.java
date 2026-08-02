package io.jsonwebtoken.impl.crypto;

import io.jsonwebtoken.security.SignatureException;

/* loaded from: classes8.dex */
public interface Signer {
    byte[] sign(byte[] bArr) throws SignatureException;
}
