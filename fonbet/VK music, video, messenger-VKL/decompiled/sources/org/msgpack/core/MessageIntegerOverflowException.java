package org.msgpack.core;

import java.math.BigInteger;

/* loaded from: classes8.dex */
public class MessageIntegerOverflowException extends MessageTypeException {
    private final BigInteger bigInteger;

    public MessageIntegerOverflowException(BigInteger bigInteger) {
        this.bigInteger = bigInteger;
    }

    public final BigInteger d() {
        return this.bigInteger;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.bigInteger.toString();
    }
}
