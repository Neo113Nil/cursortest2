package xsna;

import java.util.NoSuchElementException;

/* compiled from: MediaChunkIterator.java */
/* loaded from: classes12.dex */
public interface bq10 {
    public static final a a = new a();

    /* compiled from: MediaChunkIterator.java */
    public class a implements bq10 {
        @Override // xsna.bq10
        public final long a() {
            throw new NoSuchElementException();
        }

        @Override // xsna.bq10
        public final long b() {
            throw new NoSuchElementException();
        }

        @Override // xsna.bq10
        public final boolean next() {
            return false;
        }
    }

    long a();

    long b();

    boolean next();
}
