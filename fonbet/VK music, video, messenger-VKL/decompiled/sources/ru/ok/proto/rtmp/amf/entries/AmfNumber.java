package ru.ok.proto.rtmp.amf.entries;

import java.nio.ByteBuffer;
import ru.ok.proto.rtmp.amf.AmfEntry;

/* loaded from: classes9.dex */
public class AmfNumber implements AmfEntry {
    private double value;

    public AmfNumber() {
    }

    public static double deserializeStatic(ByteBuffer byteBuffer) {
        return byteBuffer.getDouble();
    }

    @Override // ru.ok.proto.rtmp.amf.AmfEntry
    public void deserialize(ByteBuffer byteBuffer) {
        this.value = deserializeStatic(byteBuffer);
    }

    @Override // ru.ok.proto.rtmp.amf.AmfEntry
    public int getSize() {
        return 8;
    }

    @Override // ru.ok.proto.rtmp.amf.AmfEntry
    public byte getType() {
        return (byte) 0;
    }

    public double getValue() {
        return this.value;
    }

    @Override // ru.ok.proto.rtmp.amf.AmfEntry
    public void serialize(ByteBuffer byteBuffer) {
        byteBuffer.putDouble(this.value);
    }

    public void setValue(double d) {
        this.value = d;
    }

    public String toString() {
        return Double.toString(this.value);
    }

    public AmfNumber(double d) {
        this.value = d;
    }
}
