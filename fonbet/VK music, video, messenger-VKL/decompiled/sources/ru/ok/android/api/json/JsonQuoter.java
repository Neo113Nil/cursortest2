package ru.ok.android.api.json;

import androidx.annotation.NonNull;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.io.Writer;
import ru.ok.android.commons.convert.Hex;

/* loaded from: classes9.dex */
public final class JsonQuoter {
    private JsonQuoter() {
    }

    private static void appendEscaped(@NonNull Appendable appendable, @NonNull String str, int i, int i2) throws IOException {
        int i3 = i;
        while (i < i2) {
            char charAt = str.charAt(i);
            if (!unreserved(charAt)) {
                if (i3 < i) {
                    appendable.append(str, i3, i);
                }
                appendReserved(appendable, charAt);
                i3 = i + 1;
            }
            i++;
        }
        if (i3 < i2) {
            appendable.append(str, i3, i2);
        }
    }

    public static void appendQuoted(@NonNull Appendable appendable, @NonNull String str) throws IOException {
        appendable.append('\"');
        appendEscaped(appendable, str, 0, str.length());
        appendable.append('\"');
    }

    private static void appendReserved(@NonNull Appendable appendable, int i) throws IOException {
        appendable.append('\\');
        if (i == 12) {
            appendable.append('f');
            return;
        }
        if (i == 13) {
            appendable.append('r');
            return;
        }
        if (i == 34 || i == 47 || i == 92) {
            appendable.append((char) i);
            return;
        }
        switch (i) {
            case 8:
                appendable.append('b');
                break;
            case 9:
                appendable.append('t');
                break;
            case 10:
                appendable.append('n');
                break;
            default:
                appendable.append('u');
                Hex.appendHexChar(appendable, i);
                break;
        }
    }

    private static boolean unreserved(int i) {
        return (i == 92 || i == 34 || i <= 31) ? false : true;
    }

    private static void writeEscaped(@NonNull Writer writer, @NonNull String str, int i, int i2) throws IOException {
        int i3 = i2 + i;
        int i4 = i;
        while (i < i3) {
            char charAt = str.charAt(i);
            if (!unreserved(charAt)) {
                if (i > i4) {
                    writer.write(str, i4, i - i4);
                }
                writeReserved(writer, charAt);
                i4 = i + 1;
            }
            i++;
        }
        if (i3 > i4) {
            writer.write(str, i4, i3 - i4);
        }
    }

    public static void writeQuoted(@NonNull Writer writer, @NonNull String str) throws IOException {
        writer.write(34);
        writeEscaped(writer, str, 0, str.length());
        writer.write(34);
    }

    private static void writeReserved(@NonNull Writer writer, int i) throws IOException {
        writer.write(92);
        if (i == 12) {
            writer.write(102);
            return;
        }
        if (i == 13) {
            writer.write(Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
            return;
        }
        if (i == 34 || i == 47 || i == 92) {
            writer.write(i);
            return;
        }
        switch (i) {
            case 8:
                writer.write(98);
                break;
            case 9:
                writer.write(116);
                break;
            case 10:
                writer.write(110);
                break;
            default:
                writer.write(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE);
                Hex.writeHexChar(writer, i);
                break;
        }
    }
}
