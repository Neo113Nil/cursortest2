package ru.ok.media.utils;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.ironsource.X3;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

@Keep
/* loaded from: classes9.dex */
public class DataSample {
    private List<ByteBuffer> buffers;
    private volatile boolean released;

    public DataSample(List<ByteBuffer> list) {
        this.buffers = list;
    }

    public List<ByteBuffer> getBuffers() {
        return this.buffers;
    }

    public final void release() {
        if (this.released) {
            return;
        }
        this.released = true;
        doRelease();
    }

    public int remaining() {
        Iterator<ByteBuffer> it = this.buffers.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().remaining();
        }
        return i;
    }

    public void setBuffers(List<ByteBuffer> list) {
        this.buffers = list;
    }

    public void skip(int i) {
        for (ByteBuffer byteBuffer : this.buffers) {
            int min = Math.min(i, byteBuffer.remaining());
            byteBuffer.position(byteBuffer.position() + min);
            i -= min;
            if (i <= 0) {
                return;
            }
        }
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("{released: ");
        sb.append(this.released);
        sb.append(", n: ");
        sb.append(this.buffers.size());
        if (!this.buffers.isEmpty()) {
            sb.append(", buffers: [");
            String str = "";
            for (ByteBuffer byteBuffer : this.buffers) {
                sb.append(str);
                if (byteBuffer == null) {
                    sb.append("null");
                } else {
                    sb.append(byteBuffer.remaining());
                }
                str = ", ";
            }
            sb.append(X3.j.e);
        }
        sb.append("}");
        return sb.toString();
    }

    public void doRelease() {
    }
}
