package xsna;

import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

/* compiled from: Streams.java */
/* loaded from: classes.dex */
public final class kpm0 {
    public static b9y a(JsonReader jsonReader) throws JsonParseException {
        boolean z;
        try {
            try {
                jsonReader.peek();
                z = false;
            } catch (EOFException e) {
                e = e;
                z = true;
            }
            try {
                return TypeAdapters.B.b(jsonReader);
            } catch (EOFException e2) {
                e = e2;
                if (z) {
                    return u9y.b;
                }
                throw new JsonSyntaxException(e);
            }
        } catch (MalformedJsonException e3) {
            throw new JsonSyntaxException(e3);
        } catch (IOException e4) {
            throw new JsonIOException(e4);
        } catch (NumberFormatException e5) {
            throw new JsonSyntaxException(e5);
        }
    }

    /* compiled from: Streams.java */
    /* loaded from: classes13.dex */
    public static final class a extends Writer {
        public final Appendable b;
        public final C3196a c = new C3196a();

        /* compiled from: Streams.java */
        /* renamed from: xsna.kpm0$a$a, reason: collision with other inner class name */
        public static class C3196a implements CharSequence {
            public char[] b;

            @Override // java.lang.CharSequence
            public final char charAt(int i) {
                return this.b[i];
            }

            @Override // java.lang.CharSequence
            public final int length() {
                return this.b.length;
            }

            @Override // java.lang.CharSequence
            public final CharSequence subSequence(int i, int i2) {
                return new String(this.b, i, i2 - i);
            }
        }

        public a(Appendable appendable) {
            this.b = appendable;
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i, int i2) throws IOException {
            C3196a c3196a = this.c;
            c3196a.b = cArr;
            this.b.append(c3196a, i, i2 + i);
        }

        @Override // java.io.Writer
        public final void write(int i) throws IOException {
            this.b.append((char) i);
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
        }
    }
}
