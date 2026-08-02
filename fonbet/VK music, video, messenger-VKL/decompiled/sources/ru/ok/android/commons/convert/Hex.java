package ru.ok.android.commons.convert;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import ru.ok.proto.rtmp.amf.AmfConstants;
import xsna.tgw;

/* loaded from: classes9.dex */
public final class Hex {
    private Hex() {
    }

    public static void appendHex(@NonNull Appendable appendable, @NonNull byte[] bArr) throws IOException {
        appendHex(appendable, bArr, 0, bArr.length);
    }

    public static void appendHexByte(@NonNull StringBuilder sb, int i) {
        try {
            appendHexByte((Appendable) sb, i);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public static void appendHexChar(@NonNull Appendable appendable, int i) throws IOException {
        appendable.append((char) halfByteToHex((i >> 12) & 15));
        appendable.append((char) halfByteToHex((i >> 8) & 15));
        appendable.append((char) halfByteToHex((i >> 4) & 15));
        appendable.append((char) halfByteToHex(i & 15));
    }

    private static int halfByteToHex(int i) {
        return i <= 9 ? i + 48 : i + 87;
    }

    private static int halfByteToHexUpperCase(int i) {
        return i <= 9 ? i + 48 : i + 55;
    }

    public static char hexToChar(char c, char c2, char c3, char c4) {
        return (char) ((hexToHalfByte(c) << 12) | ((char) ((hexToHalfByte(c2) << 8) | ((char) ((hexToHalfByte(c3) << 4) | ((char) hexToHalfByte(c4)))))));
    }

    private static int hexToHalfByte(int i) {
        if (i >= 48 && i <= 57) {
            return i - 48;
        }
        if (i >= 97 && i <= 102) {
            return i - 87;
        }
        if (i < 65 || i > 70) {
            throw new IllegalArgumentException(tgw.b(i, "Not a hex char '", "'"));
        }
        return i - 55;
    }

    @NonNull
    public static char[] toHexChars(@NonNull byte[] bArr) {
        return toHexChars(bArr, 0, bArr.length);
    }

    @NonNull
    public static String toHexString(@NonNull byte[] bArr) {
        return toHexString(bArr, 0, bArr.length);
    }

    public static void writeHex(@NonNull OutputStream outputStream, @NonNull byte[] bArr) throws IOException {
        writeHex(outputStream, bArr, 0, bArr.length);
    }

    public static void writeHexByte(@NonNull OutputStream outputStream, int i) throws IOException {
        outputStream.write(halfByteToHex((i >> 4) & 15));
        outputStream.write(halfByteToHex(i & 15));
    }

    public static void writeHexByteUpperCase(@NonNull OutputStream outputStream, int i) throws IOException {
        outputStream.write(halfByteToHexUpperCase((i >> 4) & 15));
        outputStream.write(halfByteToHexUpperCase(i & 15));
    }

    public static void writeHexChar(@NonNull OutputStream outputStream, int i) throws IOException {
        outputStream.write(halfByteToHex((i >> 12) & 15));
        outputStream.write(halfByteToHex((i >> 8) & 15));
        outputStream.write(halfByteToHex((i >> 4) & 15));
        outputStream.write(halfByteToHex(i & 15));
    }

    public static void appendHex(@NonNull Appendable appendable, @NonNull byte[] bArr, int i, int i2) throws IOException {
        int i3 = i2 + i;
        while (i < i3) {
            appendHexByte(appendable, bArr[i]);
            i++;
        }
    }

    @NonNull
    public static char[] toHexChars(@NonNull byte[] bArr, int i, int i2) {
        char[] cArr = new char[i2 * 2];
        int i3 = i2 + i;
        int i4 = 0;
        while (i < i3) {
            byte b = bArr[i];
            int i5 = i4 + 1;
            cArr[i4] = (char) halfByteToHex((b >> 4) & 15);
            i4 += 2;
            cArr[i5] = (char) halfByteToHex(b & AmfConstants.TYPE_XML_DOCUMENT_MARKER);
            i++;
        }
        return cArr;
    }

    @NonNull
    public static String toHexString(@NonNull byte[] bArr, int i, int i2) {
        return new String(toHexChars(bArr, i, i2));
    }

    public static void writeHex(@NonNull OutputStream outputStream, @NonNull byte[] bArr, int i, int i2) throws IOException {
        int i3 = i2 + i;
        while (i < i3) {
            writeHexByte(outputStream, bArr[i]);
            i++;
        }
    }

    public static void appendHexByte(@NonNull Appendable appendable, int i) throws IOException {
        appendable.append((char) halfByteToHex((i >> 4) & 15));
        appendable.append((char) halfByteToHex(i & 15));
    }

    public static void writeHexChar(@NonNull Writer writer, int i) throws IOException {
        writer.write(halfByteToHex((i >> 12) & 15));
        writer.write(halfByteToHex((i >> 8) & 15));
        writer.write(halfByteToHex((i >> 4) & 15));
        writer.write(halfByteToHex(i & 15));
    }
}
