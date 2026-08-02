package ru.ok.android.webrtc.asr_online.data_channels;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.protocol.mappings.MappingProcessor;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class AsrRecvDataPackage {
    public static final Companion Companion = new Companion(null);
    public final CallParticipant.ParticipantId a;
    public final String b;
    public final byte c;
    public final byte d;
    public final int e;
    public final long f;
    public final long g;

    public static final class Companion {
        public Companion(zcl zclVar) {
        }

        public final AsrRecvDataPackage fromByteArray(byte[] bArr, MappingProcessor mappingProcessor) {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            byte b = wrap.get();
            byte b2 = wrap.get();
            int i = wrap.getShort() & 65535;
            int i2 = wrap.getInt() & 268435455;
            long j = wrap.getInt() & 4294967295L;
            long j2 = wrap.getInt() & 4294967295L;
            String charBuffer = StandardCharsets.UTF_8.decode(wrap.slice()).toString();
            mappingProcessor.query(i2);
            return new AsrRecvDataPackage(mappingProcessor.query(i2), charBuffer, b, b2, i, j, j2);
        }
    }

    public AsrRecvDataPackage(CallParticipant.ParticipantId participantId, String str, byte b, byte b2, int i, long j, long j2) {
        this.a = participantId;
        this.b = str;
        this.c = b;
        this.d = b2;
        this.e = i;
        this.f = j;
        this.g = j2;
    }

    public static final AsrRecvDataPackage fromByteArray(byte[] bArr, MappingProcessor mappingProcessor) {
        return Companion.fromByteArray(bArr, mappingProcessor);
    }

    public final long getDuration() {
        return this.g;
    }

    public final byte getMsgType() {
        return this.d;
    }

    public final CallParticipant.ParticipantId getParticipantId() {
        return this.a;
    }

    public final int getSequenceNum() {
        return this.e;
    }

    public final String getText() {
        return this.b;
    }

    public final long getTimeStamp() {
        return this.f;
    }

    public final byte getVersion() {
        return this.c;
    }
}
