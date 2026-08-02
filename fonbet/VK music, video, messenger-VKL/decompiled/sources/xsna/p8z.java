package xsna;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: ReadWrite.kt */
/* loaded from: classes8.dex */
public final class p8z implements uki0<String> {
    public final BufferedReader a;

    /* compiled from: ReadWrite.kt */
    public static final class a implements Iterator<String>, gcy {
        public String b;
        public boolean c;

        public a() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.b == null && !this.c) {
                String readLine = p8z.this.a.readLine();
                this.b = readLine;
                if (readLine == null) {
                    this.c = true;
                }
            }
            return this.b != null;
        }

        @Override // java.util.Iterator
        public final String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.b;
            this.b = null;
            return str;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public p8z(BufferedReader bufferedReader) {
        this.a = bufferedReader;
    }

    @Override // xsna.uki0
    public final Iterator<String> iterator() {
        return new a();
    }
}
