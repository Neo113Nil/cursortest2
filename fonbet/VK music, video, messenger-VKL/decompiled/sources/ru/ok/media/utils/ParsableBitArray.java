package ru.ok.media.utils;

/* loaded from: classes9.dex */
public final class ParsableBitArray {
    private int bitOffset;
    private int byteOffset;
    private byte[] data;

    public ParsableBitArray() {
    }

    private int getUnsignedByte(int i) {
        return this.data[i] & 255;
    }

    private int readExpGolombCodeNum() {
        int i = 0;
        while (!readBit()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? readBits(i) : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7 */
    private int readUnsignedByte() {
        byte b;
        int i = this.bitOffset;
        if (i != 0) {
            byte[] bArr = this.data;
            int i2 = this.byteOffset;
            b = ((bArr[i2 + 1] & 255) >>> (8 - i)) | ((bArr[i2] & 255) << i);
        } else {
            b = this.data[this.byteOffset];
        }
        this.byteOffset++;
        return b & 255;
    }

    public byte[] getData() {
        return this.data;
    }

    public int getPosition() {
        return (this.byteOffset * 8) + this.bitOffset;
    }

    public boolean readBit() {
        return readBits(1) == 1;
    }

    public int readBits(int i) {
        return (int) readBitsLong(i);
    }

    public long readBitsLong(int i) {
        long j = 0;
        if (i == 0) {
            return 0L;
        }
        while (i >= 8) {
            i -= 8;
            j |= readUnsignedByte() << i;
        }
        if (i > 0) {
            int i2 = this.bitOffset + i;
            byte b = (byte) (255 >> (8 - i));
            if (i2 > 8) {
                j |= b & ((getUnsignedByte(this.byteOffset) << (i2 - 8)) | (getUnsignedByte(this.byteOffset + 1) >> (16 - i2)));
                this.byteOffset++;
            } else {
                j |= b & (getUnsignedByte(this.byteOffset) >> (8 - i2));
                if (i2 == 8) {
                    this.byteOffset++;
                }
            }
            this.bitOffset = i2 % 8;
        }
        return j;
    }

    public int readSignedExpGolombCodedInt() {
        int readExpGolombCodeNum = readExpGolombCodeNum();
        return ((readExpGolombCodeNum + 1) / 2) * (readExpGolombCodeNum % 2 == 0 ? -1 : 1);
    }

    public int readUnsignedExpGolombCodedInt() {
        return readExpGolombCodeNum();
    }

    public void reset(byte[] bArr) {
        this.data = bArr;
        this.byteOffset = 0;
        this.bitOffset = 0;
    }

    public void setPosition(int i) {
        int i2 = i / 8;
        this.byteOffset = i2;
        this.bitOffset = i - (i2 * 8);
    }

    public void skipBits(int i) {
        int i2 = (i / 8) + this.byteOffset;
        this.byteOffset = i2;
        int i3 = (i % 8) + this.bitOffset;
        this.bitOffset = i3;
        if (i3 > 7) {
            this.byteOffset = i2 + 1;
            this.bitOffset = i3 - 8;
        }
    }

    public ParsableBitArray(byte[] bArr) {
        this.data = bArr;
    }
}
