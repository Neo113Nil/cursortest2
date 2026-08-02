package xsna;

import one.video.streaming.oktp.TransportWriter;

/* compiled from: TransportWriterBase.java */
/* loaded from: classes8.dex */
public abstract class cpp0 implements TransportWriter {
    protected nd7 bitrateCounter = new nd7();
    protected long bytesDropped;
    protected long bytesSent;
    private final int guaranteedMTU;
    private final int maxMTU;

    public cpp0(int i, int i2) {
        this.guaranteedMTU = i;
        this.maxMTU = i2;
    }

    @Override // one.video.streaming.oktp.TransportWriter
    public long getBitrate() {
        return (long) this.bitrateCounter.d.get().doubleValue();
    }

    @Override // one.video.streaming.oktp.TransportWriter
    public long getBytesDropped() {
        return this.bytesDropped;
    }

    @Override // one.video.streaming.oktp.TransportWriter
    public long getBytesSent() {
        return this.bytesSent;
    }

    @Override // one.video.streaming.oktp.TransportWriter
    public int getGuaranteedMTU() {
        return this.guaranteedMTU;
    }

    @Override // one.video.streaming.oktp.TransportWriter
    public int getMaxMTU() {
        return this.maxMTU;
    }

    @Override // one.video.streaming.oktp.TransportWriter
    public void setEncryptionKey(byte[] bArr) {
    }
}
