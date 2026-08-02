package xsna;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: AtomicFile.java */
/* loaded from: classes.dex */
public final class q04 {
    public final File a;
    public final File b;

    /* compiled from: AtomicFile.java */
    /* loaded from: classes12.dex */
    public static final class a extends OutputStream {
        public final FileOutputStream b;
        public boolean c = false;

        public a(File file) throws FileNotFoundException {
            this.b = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            FileOutputStream fileOutputStream = this.b;
            if (this.c) {
                return;
            }
            this.c = true;
            flush();
            try {
                fileOutputStream.getFD().sync();
            } catch (IOException e) {
                ahn.G("Failed to sync file descriptor:", e);
            }
            fileOutputStream.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() throws IOException {
            this.b.flush();
        }

        @Override // java.io.OutputStream
        public final void write(int i) throws IOException {
            this.b.write(i);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) throws IOException {
            this.b.write(bArr);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) throws IOException {
            this.b.write(bArr, i, i2);
        }
    }

    public q04(File file) {
        this.a = file;
        this.b = new File(file.getPath() + ".bak");
    }

    public final a a() throws IOException {
        File file = this.a;
        if (file.exists()) {
            File file2 = this.b;
            if (file2.exists()) {
                file.delete();
            } else if (!file.renameTo(file2)) {
                ahn.F("Couldn't rename file " + file + " to backup file " + file2);
            }
        }
        try {
            return new a(file);
        } catch (FileNotFoundException e) {
            File parentFile = file.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException(z9r.a(file, "Couldn't create "), e);
            }
            try {
                return new a(file);
            } catch (FileNotFoundException e2) {
                throw new IOException(z9r.a(file, "Couldn't create "), e2);
            }
        }
    }
}
