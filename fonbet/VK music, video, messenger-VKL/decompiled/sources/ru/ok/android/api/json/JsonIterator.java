package ru.ok.android.api.json;

import androidx.annotation.NonNull;
import androidx.credentials.provider.CredentialEntry;
import com.ironsource.X3;
import com.vungle.ads.internal.protos.Sdk;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import ru.ok.android.commons.convert.Hex;
import ru.ok.android.commons.io.NothingnessWriter;

/* loaded from: classes9.dex */
final class JsonIterator implements Closeable {
    public static final int SNIPPET_SIZE = 32;

    @NonNull
    private final Reader in;
    private int pos;
    private int tip = Integer.MIN_VALUE;
    private final char[] snippet = new char[32];

    @Target({ElementType.METHOD, ElementType.LOCAL_VARIABLE, ElementType.FIELD, ElementType.PARAMETER})
    @Retention(RetentionPolicy.SOURCE)
    public @interface RawToken {
        public static final int RAW_EOF = 0;
        public static final int RAW_NAME_SEPARATOR = 58;
        public static final int RAW_STRING = 34;
        public static final int RAW_VALUE_SEPARATOR = 44;
    }

    public JsonIterator(@NonNull Reader reader) {
        this.in = reader;
    }

    private void appendNextNumberTo(@NonNull Appendable appendable) throws IOException {
        int read;
        int i = this.tip;
        if (i == 45) {
            appendable.append((char) i);
            i = read();
        }
        if (i == 48) {
            appendable.append((char) i);
            read = read();
        } else {
            if (i < 49 || i > 57) {
                throw JsonSyntaxException.unexpectedChar(i, getPosition(), getSnippet());
            }
            appendable.append((char) i);
            read = read();
            while (read >= 48 && read <= 57) {
                appendable.append((char) read);
                read = read();
            }
        }
        if (read == 46) {
            appendable.append((char) read);
            int read2 = read();
            if (read2 < 48 || read2 > 57) {
                throw JsonSyntaxException.unexpectedChar(read2, getPosition(), getSnippet());
            }
            appendable.append((char) read2);
            read = read();
            while (read >= 48 && read <= 57) {
                appendable.append((char) read);
                read = read();
            }
        }
        if (read == 101 || read == 69) {
            appendable.append((char) read);
            int read3 = read();
            if (read3 == 43 || read3 == 45) {
                appendable.append((char) read3);
                read3 = read();
            }
            if (read3 < 48 || read3 > 57) {
                throw JsonSyntaxException.unexpectedChar(read3, getPosition(), getSnippet());
            }
            appendable.append((char) read3);
            read = read();
            while (read >= 48 && read <= 57) {
                appendable.append((char) read);
                read = read();
            }
        }
        if (read == 9 || read == 10 || read == 13 || read == 32) {
            this.tip = Integer.MIN_VALUE;
        } else {
            this.tip = read;
        }
    }

    private void appendNextStringTo(@NonNull Appendable appendable) throws IOException {
        int read;
        appendable.append((char) this.tip);
        loop0: while (true) {
            int read2 = read();
            if (read2 <= 31) {
                throw JsonSyntaxException.unexpectedChar(read2, getPosition(), getSnippet());
            }
            appendable.append((char) read2);
            if (read2 == 34) {
                this.tip = Integer.MIN_VALUE;
                return;
            }
            if (read2 == 92) {
                int read3 = read();
                if (read3 == 34 || read3 == 47 || read3 == 92 || read3 == 98 || read3 == 102 || read3 == 110 || read3 == 114 || read3 == 116) {
                    appendable.append((char) read3);
                } else {
                    if (read3 != 117) {
                        throw JsonSyntaxException.unexpectedChar(read3, getPosition(), getSnippet());
                    }
                    appendable.append((char) read3);
                    for (int i = 0; i < 4; i++) {
                        read = read();
                        if ((read < 48 || read > 57) && ((read < 97 || read > 102) && (read < 65 || read > 70))) {
                            break loop0;
                        }
                        appendable.append((char) read);
                    }
                }
            }
        }
        throw JsonSyntaxException.unexpectedChar(read, getPosition(), getSnippet());
    }

    private int expectHexRead() throws IOException {
        int read = read();
        if ((read < 48 || read > 57) && ((read < 97 || read > 102) && (read < 65 || read > 70))) {
            throw JsonSyntaxException.unexpectedChar(read, getPosition(), getSnippet());
        }
        return read;
    }

    private int expectRead(int i) throws IOException {
        int read = read();
        if (read == i) {
            return read;
        }
        throw JsonSyntaxException.unexpectedChar(read, getPosition(), getSnippet());
    }

    @NonNull
    private String nextAsIs() throws IOException {
        String str;
        int i = this.tip;
        if (i == 44) {
            str = StringUtils.COMMA;
        } else if (i == 58) {
            str = StringUtils.PROCESS_POSTFIX_DELIMITER;
        } else if (i == 91) {
            str = X3.j.d;
        } else if (i == 93) {
            str = X3.j.e;
        } else if (i == 102) {
            expectRead(97);
            expectRead(108);
            expectRead(Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE);
            expectRead(101);
            str = CredentialEntry.FALSE_STRING;
        } else if (i == 110) {
            expectRead(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE);
            expectRead(108);
            expectRead(108);
            str = "null";
        } else if (i == 116) {
            expectRead(Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
            expectRead(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE);
            expectRead(101);
            str = "true";
        } else if (i == 123) {
            str = "{";
        } else {
            if (i != 125) {
                throw new AssertionError();
            }
            str = "}";
        }
        this.tip = Integer.MIN_VALUE;
        return str;
    }

    private int read() throws IOException {
        try {
            int read = this.in.read();
            if (read == -1) {
                return read;
            }
            char[] cArr = this.snippet;
            int i = this.pos;
            cArr[i % 32] = (char) read;
            this.pos = i + 1;
            return read;
        } catch (IOException e) {
            this.tip = Integer.MIN_VALUE;
            throw e;
        }
    }

    private int tip() throws IOException {
        int read;
        int i = this.tip;
        if (i >= -1) {
            return i;
        }
        while (true) {
            read = read();
            if (read == 9 || read == 10 || read == 13 || read == 32 || (read == 65279 && this.pos == 1)) {
            }
        }
        this.tip = read;
        return read;
    }

    public void appendNextTo(@NonNull Appendable appendable) throws IOException {
        int tip = tip();
        if (tip == -1) {
            throw new IllegalStateException("EOF");
        }
        if (tip == 34) {
            appendNextStringTo(appendable);
            return;
        }
        if (tip != 91 && tip != 93 && tip != 102 && tip != 110 && tip != 116 && tip != 123 && tip != 125 && tip != 44) {
            if (tip != 45) {
                switch (tip) {
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        break;
                    case 58:
                        break;
                    default:
                        throw JsonSyntaxException.unexpectedChar(this.tip, getPosition(), getSnippet());
                }
            }
            appendNextNumberTo(appendable);
            return;
        }
        appendable.append(nextAsIs());
    }

    public void appendNextUnquotedStringTo(@NonNull Appendable appendable) throws IOException {
        if (tip() != 34) {
            throw new IllegalStateException("Not at string");
        }
        while (true) {
            int read = read();
            if (read == 34) {
                this.tip = Integer.MIN_VALUE;
                return;
            }
            if (read <= 31) {
                throw JsonSyntaxException.unexpectedChar(read, getPosition(), getSnippet());
            }
            if (read != 92) {
                appendable.append((char) read);
            } else {
                int read2 = read();
                if (read2 == 34 || read2 == 47 || read2 == 92) {
                    appendable.append((char) read2);
                } else if (read2 == 98) {
                    appendable.append('\b');
                } else if (read2 == 102) {
                    appendable.append('\f');
                } else if (read2 == 110) {
                    appendable.append('\n');
                } else if (read2 == 114) {
                    appendable.append('\r');
                } else if (read2 == 116) {
                    appendable.append('\t');
                } else {
                    if (read2 != 117) {
                        throw JsonSyntaxException.unexpectedChar(read2, getPosition(), getSnippet());
                    }
                    appendable.append(Hex.hexToChar((char) expectHexRead(), (char) expectHexRead(), (char) expectHexRead(), (char) expectHexRead()));
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.tip = Integer.MIN_VALUE;
        this.in.close();
    }

    public int expectNext(int i) throws IOException {
        int whatsNext = whatsNext();
        if (whatsNext == i) {
            return whatsNext;
        }
        throw JsonSyntaxException.unexpectedToken(whatsNext, getPosition(), getSnippet());
    }

    public long getPosition() {
        return this.pos;
    }

    public String getSnippet() {
        StringBuilder sb = new StringBuilder(32);
        int i = this.pos;
        char[] cArr = this.snippet;
        if (i < 32) {
            sb.append(cArr, 0, i);
        } else {
            int i2 = i % 32;
            sb.append(cArr, i2, 32 - i2);
            sb.append(cArr, 0, i2);
        }
        return sb.toString();
    }

    @NonNull
    public String next() throws IOException {
        int tip = tip();
        if (tip == -1) {
            throw new IllegalStateException("EOF");
        }
        if (tip == 34) {
            StringBuilder sb = new StringBuilder();
            appendNextStringTo(sb);
            return sb.toString();
        }
        if (tip != 91 && tip != 93 && tip != 102 && tip != 110 && tip != 116 && tip != 123 && tip != 125 && tip != 44) {
            if (tip != 45) {
                switch (tip) {
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        break;
                    case 58:
                        break;
                    default:
                        throw JsonSyntaxException.unexpectedChar(this.tip, getPosition(), getSnippet());
                }
            }
            StringBuilder sb2 = new StringBuilder();
            appendNextNumberTo(sb2);
            return sb2.toString();
        }
        return nextAsIs();
    }

    @NonNull
    public String nextUnquotedString() throws IOException {
        StringBuilder sb = new StringBuilder();
        appendNextUnquotedStringTo(sb);
        return sb.toString();
    }

    public void skipNext() throws IOException {
        int tip = tip();
        if (tip == -1) {
            throw new IllegalStateException("EOF");
        }
        if (tip == 34) {
            appendNextStringTo(NothingnessWriter.INSTANCE);
            return;
        }
        if (tip != 91 && tip != 93) {
            if (tip == 102 || tip == 110 || tip == 116) {
                nextAsIs();
                return;
            }
            if (tip != 123 && tip != 125 && tip != 44) {
                if (tip != 45) {
                    switch (tip) {
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                            break;
                        case 58:
                            break;
                        default:
                            throw JsonSyntaxException.unexpectedChar(this.tip, getPosition(), getSnippet());
                    }
                }
                appendNextNumberTo(NothingnessWriter.INSTANCE);
                return;
            }
        }
        this.tip = Integer.MIN_VALUE;
    }

    public int whatsNext() throws IOException {
        int tip = tip();
        if (tip == -1) {
            return 0;
        }
        int i = 34;
        if (tip != 34) {
            i = 91;
            if (tip != 91) {
                i = 93;
                if (tip != 93) {
                    if (tip == 102) {
                        return 98;
                    }
                    int i2 = 110;
                    if (tip != 110) {
                        if (tip == 116) {
                            return 98;
                        }
                        i2 = 123;
                        if (tip != 123) {
                            i2 = 125;
                            if (tip != 125) {
                                i2 = 44;
                                if (tip != 44) {
                                    if (tip == 45) {
                                        return 49;
                                    }
                                    switch (tip) {
                                        case 48:
                                        case 49:
                                        case 50:
                                        case 51:
                                        case 52:
                                        case 53:
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                            return 49;
                                        case 58:
                                            return 58;
                                        default:
                                            throw JsonSyntaxException.unexpectedChar(this.tip, getPosition(), getSnippet());
                                    }
                                }
                            }
                        }
                    }
                    return i2;
                }
            }
        }
        return i;
    }
}
