package ru.ok.media.video;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.util.Collection;
import ru.ok.media.utils.ParsableBitArray;
import xsna.ji;
import xsna.ne7;
import xsna.r490;
import xsna.uf3;
import xsna.wr;

/* loaded from: classes9.dex */
public class H264Util {
    private static byte[] STARTCODE = {0, 0, 0, 1};
    private static final String TAG = "Publisher";

    public static class VideoHeadersInfo {
        private final int frameHeight;
        private final int frameWidth;

        public VideoHeadersInfo(int i, int i2) {
            this.frameWidth = i;
            this.frameHeight = i2;
        }

        public int getFrameHeight() {
            return this.frameHeight;
        }

        public int getFrameWidth() {
            return this.frameWidth;
        }
    }

    public static boolean annexBToMP4(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i) {
        if (byteBuffer.get() != 0 || byteBuffer.get() != 0 || byteBuffer.get() != 0 || byteBuffer.get() != 1) {
            ne7.J(TAG, "No startcode at nalu start");
            return false;
        }
        int position = byteBuffer.position();
        skipTillNextStartCode(byteBuffer);
        int position2 = byteBuffer.position() - position;
        byteBuffer.position(position);
        writeInteger(byteBuffer2, position2, i);
        copyBytes(byteBuffer, byteBuffer2, position2);
        return true;
    }

    public static ByteBuffer configFromMP4(ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining() * 2);
        byte b = byteBuffer.get();
        if (b != 1) {
            ne7.J(TAG, "mp4 config version is unsupported: " + ((int) b));
            return null;
        }
        byteBuffer.position(byteBuffer.position() + 4);
        int i = byteBuffer.get() & 31;
        do {
            int i2 = 65535 & byteBuffer.getShort();
            int i3 = byteBuffer.get(byteBuffer.position()) & 31;
            if (7 == i3 || 8 == i3) {
                allocate.putInt(1);
                copyBytes(byteBuffer, allocate, i2);
            } else {
                wr.c(i2, byteBuffer);
            }
            i--;
            if (i == 0) {
                wr.c(1, byteBuffer);
            }
        } while (byteBuffer.remaining() > 2);
        allocate.limit(allocate.position());
        allocate.rewind();
        return allocate;
    }

    public static byte[] convertToMP4Config(Collection<ByteBuffer> collection, int i, boolean z) {
        int i2;
        byte[] bArr;
        ne7.m(TAG, "convertToMP4Config() - reserveBytes=" + i + ", buffers=" + collection);
        if (collection != null) {
            i2 = 0;
            for (ByteBuffer byteBuffer : collection) {
                ne7.m(TAG, "convertToMP4Config() - buffer=" + r490.f(byteBuffer, true));
                i2 += byteBuffer.remaining();
            }
        } else {
            i2 = 0;
        }
        byte[] bArr2 = null;
        if (i2 == 0) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i + i2 + 80);
        allocate.position(allocate.position() + i);
        allocate.put((byte) 1);
        int position = allocate.position();
        allocate.put((byte) 0);
        int position2 = allocate.position();
        allocate.put((byte) 0);
        int position3 = allocate.position();
        allocate.put((byte) 0);
        allocate.put((byte) -1);
        int position4 = allocate.position();
        allocate.put((byte) 0);
        byte b = 0;
        for (ByteBuffer byteBuffer2 : collection) {
            int position5 = byteBuffer2.position();
            while (byteBuffer2.remaining() > 4) {
                if (7 != (byteBuffer2.get(byteBuffer2.position() + 4) & 31)) {
                    wr.c(4, byteBuffer2);
                    skipTillNextStartCode(byteBuffer2);
                } else {
                    int position6 = allocate.position();
                    int position7 = allocate.position() + 2;
                    if (annexBToMP4(byteBuffer2, allocate, 2)) {
                        b = (byte) (b + 1);
                        bArr = bArr2;
                        allocate.put(position7, (byte) (allocate.get(position7) | 96));
                        byte b2 = allocate.get(position6 + 3);
                        byte b3 = allocate.get(position6 + 4);
                        byte b4 = allocate.get(position6 + 5);
                        allocate.put(position, b2);
                        allocate.put(position2, b3);
                        allocate.put(position3, b4);
                    } else {
                        bArr = bArr2;
                        skipTillNextStartCode(byteBuffer2);
                    }
                    bArr2 = bArr;
                }
            }
            byteBuffer2.position(position5);
        }
        byte[] bArr3 = bArr2;
        if (b == 0) {
            return bArr3;
        }
        allocate.put(position4, (byte) (b | 224));
        int position8 = allocate.position();
        allocate.put((byte) 0);
        byte b5 = 0;
        for (ByteBuffer byteBuffer3 : collection) {
            int position9 = byteBuffer3.position();
            while (byteBuffer3.remaining() > 4) {
                if (8 != (byteBuffer3.get(byteBuffer3.position() + 4) & 31)) {
                    wr.c(4, byteBuffer3);
                    skipTillNextStartCode(byteBuffer3);
                } else {
                    int position10 = allocate.position() + 2;
                    if (annexBToMP4(byteBuffer3, allocate, 2)) {
                        b5 = (byte) (b5 + 1);
                        allocate.put(position10, (byte) (allocate.get(position10) | 96));
                    } else {
                        skipTillNextStartCode(byteBuffer3);
                    }
                }
            }
            byteBuffer3.position(position9);
        }
        allocate.put(position8, b5);
        allocate.limit(allocate.position());
        allocate.position(0);
        byte[] bArr4 = new byte[allocate.remaining()];
        allocate.get(bArr4);
        return bArr4;
    }

    private static void copyBytes(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(byteBuffer.position() + i);
        byteBuffer2.put(byteBuffer);
        byteBuffer.limit(limit);
    }

    private static int copyTillSequence(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2) {
        int position = byteBuffer.position();
        int i3 = -858993460;
        while (true) {
            if (byteBuffer.remaining() <= 0) {
                break;
            }
            byte b = byteBuffer.get();
            i3 = (i3 << 8) | (b & 255);
            byteBuffer2.put(b);
            if ((i3 & i2) == i) {
                byteBuffer.position(byteBuffer.position() - 4);
                byteBuffer2.position(byteBuffer2.position() - 4);
                break;
            }
        }
        return byteBuffer.position() - position;
    }

    public static ByteBuffer getAllNalus(ByteBuffer byteBuffer, int i) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        int i2 = -858993460;
        boolean z = false;
        while (byteBuffer.remaining() > 0) {
            byte b = byteBuffer.get();
            i2 = (i2 << 8) | (b & 255);
            if (i2 == 1) {
                if (z) {
                    allocate.position(allocate.position() - 3);
                }
                byte b2 = byteBuffer.get();
                boolean z2 = i == -1 || (b2 & 31) == i;
                if (z2) {
                    allocate.putInt(1);
                    allocate.put(b2);
                }
                z = z2;
            } else if (z) {
                allocate.put(b);
            }
        }
        allocate.limit(allocate.position());
        allocate.rewind();
        ByteBuffer allocate2 = ByteBuffer.allocate(allocate.remaining());
        allocate2.put(allocate.array(), 0, allocate.remaining());
        allocate2.rewind();
        return allocate2;
    }

    @NonNull
    public static VideoHeadersInfo getVideoSize(byte[] bArr) {
        int readUnsignedExpGolombCodedInt;
        int i;
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr);
        parsableBitArray.skipBits(40);
        int readBits = parsableBitArray.readBits(8);
        parsableBitArray.skipBits(16);
        parsableBitArray.readUnsignedExpGolombCodedInt();
        if (readBits == 100 || readBits == 110 || readBits == 122 || readBits == 244 || readBits == 44 || readBits == 83 || readBits == 86 || readBits == 118 || readBits == 128 || readBits == 138) {
            readUnsignedExpGolombCodedInt = parsableBitArray.readUnsignedExpGolombCodedInt();
            if (readUnsignedExpGolombCodedInt == 3) {
                parsableBitArray.skipBits(1);
            }
            parsableBitArray.readUnsignedExpGolombCodedInt();
            parsableBitArray.readUnsignedExpGolombCodedInt();
            parsableBitArray.skipBits(1);
            if (parsableBitArray.readBit()) {
                int i2 = readUnsignedExpGolombCodedInt == 3 ? 12 : 8;
                int i3 = 0;
                while (i3 < i2) {
                    if (parsableBitArray.readBit()) {
                        skipScalingList(parsableBitArray, i3 < 6 ? 16 : 64);
                    }
                    i3++;
                }
            }
        } else {
            readUnsignedExpGolombCodedInt = 1;
        }
        parsableBitArray.readUnsignedExpGolombCodedInt();
        long readUnsignedExpGolombCodedInt2 = parsableBitArray.readUnsignedExpGolombCodedInt();
        if (readUnsignedExpGolombCodedInt2 == 0) {
            parsableBitArray.readUnsignedExpGolombCodedInt();
        } else if (readUnsignedExpGolombCodedInt2 == 1) {
            parsableBitArray.skipBits(1);
            parsableBitArray.readSignedExpGolombCodedInt();
            parsableBitArray.readSignedExpGolombCodedInt();
            long readUnsignedExpGolombCodedInt3 = parsableBitArray.readUnsignedExpGolombCodedInt();
            for (int i4 = 0; i4 < readUnsignedExpGolombCodedInt3; i4++) {
                parsableBitArray.readUnsignedExpGolombCodedInt();
            }
        }
        parsableBitArray.readUnsignedExpGolombCodedInt();
        parsableBitArray.skipBits(1);
        int readUnsignedExpGolombCodedInt4 = parsableBitArray.readUnsignedExpGolombCodedInt() + 1;
        int readUnsignedExpGolombCodedInt5 = parsableBitArray.readUnsignedExpGolombCodedInt() + 1;
        boolean readBit = parsableBitArray.readBit();
        int i5 = (2 - (readBit ? 1 : 0)) * readUnsignedExpGolombCodedInt5;
        if (!readBit) {
            parsableBitArray.skipBits(1);
        }
        parsableBitArray.skipBits(1);
        int i6 = readUnsignedExpGolombCodedInt4 * 16;
        int i7 = i5 * 16;
        if (parsableBitArray.readBit()) {
            int readUnsignedExpGolombCodedInt6 = parsableBitArray.readUnsignedExpGolombCodedInt();
            int readUnsignedExpGolombCodedInt7 = parsableBitArray.readUnsignedExpGolombCodedInt();
            int readUnsignedExpGolombCodedInt8 = parsableBitArray.readUnsignedExpGolombCodedInt();
            int readUnsignedExpGolombCodedInt9 = parsableBitArray.readUnsignedExpGolombCodedInt();
            if (readUnsignedExpGolombCodedInt == 0) {
                i = 2 - (readBit ? 1 : 0);
            } else {
                int i8 = readUnsignedExpGolombCodedInt == 3 ? 1 : 2;
                i = (2 - (readBit ? 1 : 0)) * (readUnsignedExpGolombCodedInt == 1 ? 2 : 1);
                r6 = i8;
            }
            i6 = uf3.a(readUnsignedExpGolombCodedInt6, readUnsignedExpGolombCodedInt7, r6, i6);
            i7 = uf3.a(readUnsignedExpGolombCodedInt8, readUnsignedExpGolombCodedInt9, i, i7);
        }
        return new VideoHeadersInfo(i6, i7);
    }

    public static VideoHeadersInfo getVideoSizeFromMP4Config(byte[] bArr) {
        if (bArr == null) {
            ne7.n(TAG, "getVideoSizeFromMP4Config() - mp4Config is null");
            return null;
        }
        ByteBuffer configFromMP4 = configFromMP4(ByteBuffer.wrap(bArr));
        if (configFromMP4 == null) {
            ne7.n(TAG, "getVideoSizeFromMP4Config() - failed to extract config from mp4Config");
            return null;
        }
        ByteBuffer allNalus = getAllNalus(configFromMP4, 7);
        if (allNalus == null) {
            ne7.n(TAG, "getVideoSizeFromMP4Config() - no SPS found in mp4Config");
            return null;
        }
        byte[] bArr2 = new byte[allNalus.remaining()];
        allNalus.get(bArr2);
        return getVideoSize(bArr2);
    }

    public static void mp4ToAnnexB(int i, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        while (byteBuffer.remaining() > i) {
            int readUnsigned = readUnsigned(byteBuffer, i);
            if (readUnsigned > 5000000 || readUnsigned > byteBuffer.remaining()) {
                StringBuilder b = ji.b(readUnsigned, "nal unit size is incorrect: ", "; remaining: ");
                b.append(byteBuffer.remaining());
                throw new RuntimeException(b.toString());
            }
            byteBuffer2.put(STARTCODE);
            copyBytes(byteBuffer, byteBuffer2, readUnsigned);
        }
    }

    public static int peekLengthSize(ByteBuffer byteBuffer) {
        return (byteBuffer.get(byteBuffer.position() + 4) & 3) + 1;
    }

    private static int readUnsigned(ByteBuffer byteBuffer, int i) {
        int i2 = 0;
        while (true) {
            int i3 = i - 1;
            if (i <= 0) {
                return i2;
            }
            i2 = (byteBuffer.get() & 255) | (i2 << 8);
            i = i3;
        }
    }

    private static void skipScalingList(ParsableBitArray parsableBitArray, int i) {
        int i2 = 8;
        int i3 = 8;
        for (int i4 = 0; i4 < i; i4++) {
            if (i2 != 0) {
                i2 = ((parsableBitArray.readSignedExpGolombCodedInt() + i3) + 256) % 256;
            }
            if (i2 != 0) {
                i3 = i2;
            }
        }
    }

    private static void skipTillNextStartCode(ByteBuffer byteBuffer) {
        skipTillSequence(byteBuffer, 1, -1);
    }

    private static void skipTillSequence(ByteBuffer byteBuffer, int i, int i2) {
        int i3 = -858993460;
        while (byteBuffer.remaining() > 0) {
            i3 = (i3 << 8) | (byteBuffer.get() & 255);
            if ((i3 & i2) == i) {
                byteBuffer.position(byteBuffer.position() - 4);
                return;
            }
        }
    }

    private static void writeInteger(ByteBuffer byteBuffer, long j, int i) {
        for (int i2 = (i - 1) * 8; i2 >= 0; i2 -= 8) {
            byteBuffer.put((byte) (j >>> i2));
        }
    }
}
