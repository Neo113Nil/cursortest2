package org.msgpack.core.buffer;

import java.nio.ByteBuffer;
import xsna.jvi;

/* loaded from: classes8.dex */
public class ByteBufferInput implements MessageBufferInput {
    private ByteBuffer input;
    private boolean isRead = false;

    public ByteBufferInput(ByteBuffer byteBuffer) {
        jvi.c(byteBuffer, "input ByteBuffer is null");
        this.input = byteBuffer.slice();
    }

    @Override // org.msgpack.core.buffer.MessageBufferInput
    public MessageBuffer next() {
        if (this.isRead) {
            return null;
        }
        MessageBuffer wrap = MessageBuffer.wrap(this.input);
        this.isRead = true;
        return wrap;
    }

    public ByteBuffer reset(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.input;
        jvi.c(byteBuffer, "input ByteBuffer is null");
        this.input = byteBuffer.slice();
        this.isRead = false;
        return byteBuffer2;
    }

    @Override // org.msgpack.core.buffer.MessageBufferInput, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
