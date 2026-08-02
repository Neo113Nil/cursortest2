package ru.ok.android.webrtc.animoji.send;

import android.graphics.Color;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.animoji.util.AnimojiDataPackagePayload;
import ru.ok.android.webrtc.animoji.util.DataChannelSendablePackage;
import xsna.epx;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class AnimojiSendDataPackage implements DataChannelSendablePackage {
    public static final Companion Companion = new Companion(null);
    public static final int FLOAT_SIZE = 4;
    public static final float FLOAT_TO_BYTE = 255.0f;
    public static final int HEADER_SIZE = 10;
    public static final int HEADER_SIZE_V2 = 12;
    public final int a;
    public final int b;
    public final AnimojiDataPackagePayload.AnimojiSendPackagePayload c;

    public static final class Companion {
        public Companion(zcl zclVar) {
        }

        public final AnimojiSendDataPackage create(int i, int i2, AnimojiDataPackagePayload.AnimojiSendPackagePayload animojiSendPackagePayload) {
            if (i == 1 && (animojiSendPackagePayload instanceof AnimojiDataPackagePayload.BgColor)) {
                return null;
            }
            return new AnimojiSendDataPackage(i, i2, animojiSendPackagePayload, null);
        }
    }

    public AnimojiSendDataPackage(int i, int i2, AnimojiDataPackagePayload.AnimojiSendPackagePayload animojiSendPackagePayload, zcl zclVar) {
        this.a = i;
        this.b = i2;
        this.c = animojiSendPackagePayload;
    }

    public final AnimojiDataPackagePayload.AnimojiSendPackagePayload getPayload() {
        return this.c;
    }

    public final int getTimestampMs() {
        return this.b;
    }

    public final int getVersion() {
        return this.a;
    }

    @Override // ru.ok.android.webrtc.animoji.util.DataChannelSendablePackage
    public byte[] toByteArray(int i) {
        int i2;
        float[] fArr;
        int i3 = 0;
        int i4 = 1;
        if (this.a == 1) {
            AnimojiDataPackagePayload.AnimojiSendPackagePayload animojiSendPackagePayload = this.c;
            boolean z = animojiSendPackagePayload instanceof AnimojiDataPackagePayload.EOS;
            if (animojiSendPackagePayload instanceof AnimojiDataPackagePayload.AnimojiData) {
                fArr = ((AnimojiDataPackagePayload.AnimojiData) animojiSendPackagePayload).getData();
            } else {
                if (!z) {
                    if (animojiSendPackagePayload instanceof AnimojiDataPackagePayload.BgColor) {
                        throw new IllegalStateException("Internal error AnimojiSendDataPackage");
                    }
                    throw new NoWhenBranchMatchedException();
                }
                fArr = new float[0];
            }
            byte[] bArr = new byte[(fArr.length * 4) + 10];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            byte b = z ? (byte) 1 : (byte) 0;
            wrap.put((byte) 1);
            wrap.putShort((short) i);
            wrap.putInt(this.b);
            wrap.putShort((short) 0);
            wrap.put(b);
            wrap.order(ByteOrder.LITTLE_ENDIAN);
            int length = fArr.length;
            while (i3 < length) {
                wrap.putFloat(fArr[i3]);
                i3++;
            }
            return bArr;
        }
        AnimojiDataPackagePayload.AnimojiSendPackagePayload animojiSendPackagePayload2 = this.c;
        if (animojiSendPackagePayload2 instanceof AnimojiDataPackagePayload.AnimojiData) {
            i2 = ((AnimojiDataPackagePayload.AnimojiData) animojiSendPackagePayload2).getData().length;
        } else if (animojiSendPackagePayload2 instanceof AnimojiDataPackagePayload.BgColor) {
            i2 = 3;
        } else {
            if (!(animojiSendPackagePayload2 instanceof AnimojiDataPackagePayload.EOS)) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = 0;
        }
        byte[] bArr2 = new byte[i2 + 12];
        ByteBuffer wrap2 = ByteBuffer.wrap(bArr2);
        AnimojiDataPackagePayload.AnimojiSendPackagePayload animojiSendPackagePayload3 = this.c;
        if (animojiSendPackagePayload3 instanceof AnimojiDataPackagePayload.AnimojiData) {
            i4 = 0;
        } else if (animojiSendPackagePayload3 instanceof AnimojiDataPackagePayload.BgColor) {
            i4 = 2;
        } else if (!(animojiSendPackagePayload3 instanceof AnimojiDataPackagePayload.EOS)) {
            throw new NoWhenBranchMatchedException();
        }
        wrap2.put((byte) 2);
        wrap2.putShort((short) i);
        wrap2.putInt(this.b);
        wrap2.putInt(0);
        wrap2.put((byte) i4);
        wrap2.order(ByteOrder.LITTLE_ENDIAN);
        AnimojiDataPackagePayload.AnimojiSendPackagePayload animojiSendPackagePayload4 = this.c;
        if (animojiSendPackagePayload4 instanceof AnimojiDataPackagePayload.AnimojiData) {
            int length2 = ((AnimojiDataPackagePayload.AnimojiData) animojiSendPackagePayload4).getData().length;
            while (i3 < length2) {
                wrap2.put((byte) (r8[i3] * 255.0f));
                i3++;
            }
        } else {
            if (animojiSendPackagePayload4 instanceof AnimojiDataPackagePayload.BgColor) {
                byte red = (byte) Color.red(((AnimojiDataPackagePayload.BgColor) animojiSendPackagePayload4).getColor());
                byte green = (byte) Color.green(((AnimojiDataPackagePayload.BgColor) this.c).getColor());
                byte blue = (byte) Color.blue(((AnimojiDataPackagePayload.BgColor) this.c).getColor());
                wrap2.put(red);
                wrap2.put(green);
                wrap2.put(blue);
                return bArr2;
            }
            if (!epx.f(animojiSendPackagePayload4, AnimojiDataPackagePayload.EOS.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return bArr2;
    }
}
