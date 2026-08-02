package ru.ok.android.processing;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import xsna.tgw;

/* loaded from: classes9.dex */
public abstract class PCMWrapper {

    @NonNull
    final byte[] rawData;
    private final int shift;
    public final int size;

    public static class PCM16 extends PCMWrapper {
        public /* synthetic */ PCM16(byte[] bArr, int i, int i2, int i3) {
            this(bArr, i, i2);
        }

        @Override // ru.ok.android.processing.PCMWrapper
        public short get16(int i) {
            int ix = ix(i);
            byte[] bArr = this.rawData;
            return (short) (((bArr[ix + 1] << 8) & 65280) + (bArr[ix] & 255));
        }

        @Override // ru.ok.android.processing.PCMWrapper
        public byte get8(int i) {
            return this.rawData[ix(i) + 1];
        }

        @Override // ru.ok.android.processing.PCMWrapper
        public float getF(int i) {
            return (float) (((get16(i) + 32768) / 32767.5d) - 1.0d);
        }

        @Override // ru.ok.android.processing.PCMWrapper
        public int ix(int i) {
            return super.ix(i << 1);
        }

        @NonNull
        public String toString() {
            StringBuilder sb = new StringBuilder("PCM 16 bit (");
            sb.append(this.size);
            sb.append(") {");
            if (this.size > 0) {
                sb.append((int) get16(0));
                for (int i = 1; i < this.size; i++) {
                    sb.append(", ");
                    sb.append((int) get16(i));
                }
            }
            sb.append('}');
            return sb.toString();
        }

        private PCM16(@NonNull byte[] bArr, int i, int i2) {
            super(bArr, i2 >> 1, i, 0);
        }
    }

    public static class PCM8 extends PCMWrapper {
        public /* synthetic */ PCM8(byte[] bArr, int i, int i2, int i3) {
            this(bArr, i, i2);
        }

        @Override // ru.ok.android.processing.PCMWrapper
        public short get16(int i) {
            return (short) ((this.rawData[ix(i)] * 257) + 128);
        }

        @Override // ru.ok.android.processing.PCMWrapper
        public byte get8(int i) {
            return this.rawData[ix(i)];
        }

        @Override // ru.ok.android.processing.PCMWrapper
        public float getF(int i) {
            return (float) (((get8(i) + 128) / 127.5d) - 1.0d);
        }

        @NonNull
        public String toString() {
            StringBuilder sb = new StringBuilder("PCM 8 bit (");
            sb.append(this.size);
            sb.append(") {");
            if (this.size > 0) {
                sb.append((int) get8(0));
                for (int i = 1; i < this.size; i++) {
                    sb.append(", ");
                    sb.append((int) get8(i));
                }
            }
            sb.append('}');
            return sb.toString();
        }

        private PCM8(@NonNull byte[] bArr, int i, int i2) {
            super(bArr, i2, i, 0);
        }
    }

    public static class PCMFloat extends PCMWrapper {
        private final ByteBuffer byteBuffer;

        public /* synthetic */ PCMFloat(byte[] bArr, int i, int i2, int i3) {
            this(bArr, i, i2);
        }

        @Override // ru.ok.android.processing.PCMWrapper
        public short get16(int i) {
            return (short) (((int) ((getF(i) + 1.0d) * 32767.5d)) - 32768);
        }

        @Override // ru.ok.android.processing.PCMWrapper
        public byte get8(int i) {
            return (byte) (((int) ((getF(i) + 1.0d) * 127.5d)) - 128);
        }

        @Override // ru.ok.android.processing.PCMWrapper
        public float getF(int i) {
            return this.byteBuffer.getFloat(ix(i));
        }

        @Override // ru.ok.android.processing.PCMWrapper
        public int ix(int i) {
            return i << 2;
        }

        @NonNull
        public String toString() {
            StringBuilder sb = new StringBuilder("PCM float (");
            sb.append(this.size);
            sb.append(") {");
            if (this.size > 0) {
                sb.append(getF(0));
                for (int i = 1; i < this.size; i++) {
                    sb.append(", ");
                    sb.append(getF(i));
                }
            }
            sb.append('}');
            return sb.toString();
        }

        private PCMFloat(@NonNull byte[] bArr, int i, int i2) {
            super(bArr, i2 >> 2, i, 0);
            this.byteBuffer = ByteBuffer.wrap(bArr, i, i2).order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    public /* synthetic */ PCMWrapper(byte[] bArr, int i, int i2, int i3) {
        this(bArr, i, i2);
    }

    public static PCMWrapper wrap(int i, @NonNull byte[] bArr, int i2, int i3) {
        int i4 = 0;
        if (i == 2) {
            return new PCM16(bArr, i2, i3, i4);
        }
        if (i == 3) {
            return new PCM8(bArr, i2, i3, i4);
        }
        if (i == 4) {
            return new PCMFloat(bArr, i2, i3, i4);
        }
        throw new IllegalArgumentException(tgw.b(i, "Audio format ", " is not supported. Please, use PCM 8 bit / 16 bit / float"));
    }

    public abstract short get16(int i);

    public abstract byte get8(int i);

    public abstract float getF(int i);

    public int ix(int i) {
        return i + this.shift;
    }

    private PCMWrapper(@NonNull byte[] bArr, int i, int i2) {
        this.rawData = bArr;
        this.size = i;
        this.shift = i2;
    }
}
