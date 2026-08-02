package ru.ok.android.webrtc.animoji.recv;

import android.graphics.Color;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import ru.ok.android.webrtc.animoji.util.AnimojiDataPackagePayload;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class AnimojiRecvDataPackage {
    public static final Companion Companion = new Companion(null);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final byte e;
    public final AnimojiDataPackagePayload f;

    public static final class Companion {
        public Companion(zcl zclVar) {
        }

        public final AnimojiRecvDataPackage fromByteArray(byte[] bArr) {
            AnimojiDataPackagePayload animojiData;
            AnimojiDataPackagePayload unknown;
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            byte b = wrap.get();
            int i = wrap.getShort() & 65535;
            int i2 = wrap.getInt();
            int i3 = b == 1 ? 65535 & wrap.getShort() : wrap.getInt();
            byte b2 = wrap.get();
            ByteBuffer slice = wrap.slice();
            slice.order(ByteOrder.LITTLE_ENDIAN);
            int i4 = 0;
            if (b == 1) {
                int remaining = slice.remaining() / 4;
                float[] fArr = new float[remaining];
                while (i4 < remaining) {
                    fArr[i4] = slice.getFloat();
                    i4++;
                }
                animojiData = new AnimojiDataPackagePayload.AnimojiData(fArr);
            } else if (b2 == 0) {
                int remaining2 = slice.remaining();
                float[] fArr2 = new float[remaining2];
                while (i4 < remaining2) {
                    AnimojiRecvDataPackage.Companion.getClass();
                    fArr2[i4] = (slice.get() & 255) * 0.003921569f;
                    i4++;
                }
                animojiData = new AnimojiDataPackagePayload.AnimojiData(fArr2);
            } else {
                if (b2 != 1) {
                    unknown = b2 != 2 ? new AnimojiDataPackagePayload.Unknown(slice) : new AnimojiDataPackagePayload.BgColor(Color.rgb(slice.get() & 255, slice.get() & 255, slice.get() & 255));
                    return new AnimojiRecvDataPackage(b, i, i2, i3, b2, unknown);
                }
                animojiData = AnimojiDataPackagePayload.EOS.INSTANCE;
            }
            unknown = animojiData;
            return new AnimojiRecvDataPackage(b, i, i2, i3, b2, unknown);
        }
    }

    public AnimojiRecvDataPackage(int i, int i2, int i3, int i4, byte b, AnimojiDataPackagePayload animojiDataPackagePayload) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = b;
        this.f = animojiDataPackagePayload;
    }

    public static final AnimojiRecvDataPackage fromByteArray(byte[] bArr) {
        return Companion.fromByteArray(bArr);
    }

    public final byte getFlags() {
        return this.e;
    }

    public final AnimojiDataPackagePayload getPayload() {
        return this.f;
    }

    public final int getSequenceNo() {
        return this.b;
    }

    public final int getSsrc() {
        return this.d;
    }

    public final int getTimestampMs() {
        return this.c;
    }

    public final int getVersion() {
        return this.a;
    }
}
