package xsna;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: Box.java */
/* loaded from: classes12.dex */
public interface ga8 {
    void getBox(WritableByteChannel writableByteChannel) throws IOException;

    yej getParent();

    long getSize();

    String getType();

    void parse(xuk xukVar, ByteBuffer byteBuffer, long j, pa8 pa8Var) throws IOException;

    void setParent(yej yejVar);
}
