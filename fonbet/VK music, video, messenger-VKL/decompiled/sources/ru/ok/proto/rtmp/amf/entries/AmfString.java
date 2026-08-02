package ru.ok.proto.rtmp.amf.entries;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import ru.ok.proto.rtmp.amf.AmfEntry;
import xsna.i5s;
import xsna.wr;

/* loaded from: classes9.dex */
public class AmfString implements AmfEntry {
    private String value;

    public AmfString() {
    }

    public static String deserializeStatic(ByteBuffer byteBuffer) {
        byte[] bArr;
        int i;
        int i2 = 65535 & byteBuffer.getShort();
        if (byteBuffer.hasArray()) {
            bArr = byteBuffer.array();
            i = byteBuffer.position() + byteBuffer.arrayOffset();
            wr.c(i2, byteBuffer);
        } else {
            bArr = new byte[i2];
            byteBuffer.get(bArr);
            i = 0;
        }
        return new String(bArr, i, i2, Charset.forName(C.UTF8_NAME));
    }

    public static int getSizeStatic(String str) {
        return str.getBytes(Charset.forName(C.UTF8_NAME)).length + 2;
    }

    public static void serializeStatic(ByteBuffer byteBuffer, String str) {
        byte[] bytes = str.getBytes(Charset.forName(C.UTF8_NAME));
        byteBuffer.putShort((short) bytes.length);
        byteBuffer.put(bytes);
    }

    @Override // ru.ok.proto.rtmp.amf.AmfEntry
    public void deserialize(ByteBuffer byteBuffer) {
        this.value = deserializeStatic(byteBuffer);
    }

    @Override // ru.ok.proto.rtmp.amf.AmfEntry
    public int getSize() {
        return getSizeStatic(this.value);
    }

    @Override // ru.ok.proto.rtmp.amf.AmfEntry
    public byte getType() {
        return (byte) 2;
    }

    public String getValue() {
        return this.value;
    }

    @Override // ru.ok.proto.rtmp.amf.AmfEntry
    public void serialize(ByteBuffer byteBuffer) {
        serializeStatic(byteBuffer, this.value);
    }

    public void setValue(String str) {
        this.value = str;
    }

    public String toString() {
        return i5s.a(new StringBuilder("\""), this.value, "\"");
    }

    public AmfString(String str) {
        this.value = str;
    }
}
