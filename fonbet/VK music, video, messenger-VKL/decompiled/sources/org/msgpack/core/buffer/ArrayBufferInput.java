package org.msgpack.core.buffer;

import xsna.jvi;

/* loaded from: classes8.dex */
public class ArrayBufferInput implements MessageBufferInput {
    private MessageBuffer buffer;
    private boolean isEmpty;

    public ArrayBufferInput(MessageBuffer messageBuffer) {
        this.buffer = messageBuffer;
        if (messageBuffer == null) {
            this.isEmpty = true;
        } else {
            this.isEmpty = false;
        }
    }

    @Override // org.msgpack.core.buffer.MessageBufferInput, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.buffer = null;
        this.isEmpty = true;
    }

    @Override // org.msgpack.core.buffer.MessageBufferInput
    public MessageBuffer next() {
        if (this.isEmpty) {
            return null;
        }
        this.isEmpty = true;
        return this.buffer;
    }

    public MessageBuffer reset(MessageBuffer messageBuffer) {
        MessageBuffer messageBuffer2 = this.buffer;
        this.buffer = messageBuffer;
        if (messageBuffer == null) {
            this.isEmpty = true;
            return messageBuffer2;
        }
        this.isEmpty = false;
        return messageBuffer2;
    }

    public ArrayBufferInput(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public void reset(byte[] bArr) {
        jvi.c(bArr, "input array is null");
        reset(MessageBuffer.wrap(bArr));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ArrayBufferInput(byte[] bArr, int i, int i2) {
        this(MessageBuffer.wrap(bArr, i, i2));
        jvi.c(bArr, "input array is null");
    }

    public void reset(byte[] bArr, int i, int i2) {
        jvi.c(bArr, "input array is null");
        reset(MessageBuffer.wrap(bArr, i, i2));
    }
}
