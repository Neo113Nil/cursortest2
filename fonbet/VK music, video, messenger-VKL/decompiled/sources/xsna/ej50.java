package xsna;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Build;
import android.os.FileUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.log.L;
import com.vk.media.recorder.h;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Muxer.java */
/* loaded from: classes3.dex */
public final class ej50 {

    @NonNull
    public final File a;
    public long b;
    public final boolean e;
    public final boolean f;
    public final q9f0 g;
    public MediaMuxer h;
    public boolean i;
    public final ArrayList<a> c = new ArrayList<>();
    public final Object d = new Object();
    public int j = -1;
    public int k = -1;

    /* compiled from: Muxer.java */
    public static final class a {
        public final int a;
        public final MediaCodec.BufferInfo b;
        public final ByteBuffer c;

        public a(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            this.a = i;
            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
            this.b = bufferInfo2;
            bufferInfo2.set(bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.capacity());
            this.c = allocate;
            int position = byteBuffer.position();
            allocate.limit(byteBuffer.limit());
            allocate.position(position);
            allocate.put(byteBuffer);
            allocate.position(position);
        }
    }

    public ej50(@NonNull File file, boolean z, boolean z2, @Nullable q9f0 q9f0Var) throws IOException {
        System.currentTimeMillis();
        this.a = file;
        this.e = z;
        this.f = z2;
        this.g = q9f0Var;
        this.h = new MediaMuxer(file.getAbsolutePath(), 0);
        System.currentTimeMillis();
    }

    public final int a(MediaFormat mediaFormat) {
        try {
            return this.h.addTrack(mediaFormat);
        } catch (Exception e) {
            L.j(e, "failed to add track, format=" + mediaFormat);
            return -1;
        }
    }

    public final void b(File file) {
        if (!file.exists() || file.delete()) {
            return;
        }
        file.delete();
    }

    public final void c(MediaCodec.BufferInfo bufferInfo) {
        q9f0 q9f0Var = this.g;
        if (q9f0Var != null) {
            long j = bufferInfo.presentationTimeUs;
            v2s0 v2s0Var = (v2s0) q9f0Var.c;
            synchronized (v2s0Var.i) {
                try {
                    c020 c020Var = v2s0Var.b;
                    long j2 = c020Var.a;
                    long j3 = c020Var.b;
                    if (c020Var.c) {
                        c020Var.a = j2 > j ? j : j2;
                        if (j3 >= j) {
                            j = j3;
                        }
                        c020Var.b = j;
                    } else {
                        c020Var.a = j;
                        c020Var.b = j;
                        c020Var.c = true;
                    }
                    if (j2 == c020Var.a && c020Var.b == j3) {
                        return;
                    }
                    long a2 = c020Var.a();
                    h.a aVar = v2s0Var.p;
                    if (aVar.a.get()) {
                        return;
                    }
                    aVar.e.obtainMessage(3, (int) a2, 0).sendToTarget();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final boolean d() {
        boolean z;
        synchronized (this.d) {
            z = this.h == null;
        }
        return z;
    }

    public final boolean e(File file, File file2) {
        boolean z;
        long copy;
        try {
            z = file.renameTo(file2);
        } catch (Exception e) {
            L.j(e, "failed to rename file");
            z = false;
        }
        if (!z) {
            try {
                z = Files.move(file.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING) != null;
            } catch (Exception e2) {
                L.j(e2, "failed to move file");
            }
        }
        if (!z && Build.VERSION.SDK_INT >= 29) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        copy = FileUtils.copy(fileInputStream, fileOutputStream);
                        z = copy >= file.length();
                        fileOutputStream.close();
                        fileInputStream.close();
                    } finally {
                    }
                } finally {
                }
            } catch (Exception e3) {
                L.j(e3, "failed to copy file");
            }
            if (z) {
                b(file);
            }
        }
        if (z) {
            return true;
        }
        b(file2);
        return false;
    }

    public final boolean f(@NonNull MediaFormat mediaFormat) {
        String string;
        Iterator<a> it;
        boolean z;
        synchronized (this.d) {
            try {
                if (this.h == null) {
                    return false;
                }
                if (!this.i && (string = mediaFormat.getString("mime")) != null) {
                    String lowerCase = string.toLowerCase();
                    if (this.e && this.j < 0 && lowerCase.startsWith("video/")) {
                        int a2 = a(mediaFormat);
                        this.j = a2;
                        if (a2 < 0) {
                            return false;
                        }
                    } else if (this.f && this.k < 0 && lowerCase.startsWith("audio/")) {
                        int a3 = a(mediaFormat);
                        this.k = a3;
                        if (a3 < 0) {
                            return false;
                        }
                    }
                    if (this.e == (this.j != -1)) {
                        if (this.f == (this.k != -1)) {
                            try {
                                this.h.start();
                                this.i = true;
                                it = this.c.iterator();
                            } catch (Exception e) {
                                L.j(e, "failed to start");
                            }
                            while (it.hasNext()) {
                                a next = it.next();
                                try {
                                    this.h.writeSampleData(next.a, next.c, next.b);
                                    z = true;
                                } catch (Exception e2) {
                                    L.j(e2, "failed to write sample");
                                    z = false;
                                }
                                if (!z) {
                                    return false;
                                }
                            }
                            this.c.clear();
                        }
                    }
                }
                return true;
            } finally {
            }
        }
    }

    public final boolean g(boolean z, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int i = z ? this.j : this.k;
        if (i < 0) {
            return false;
        }
        if (!this.i) {
            this.c.add(new a(i, byteBuffer, bufferInfo));
            return true;
        }
        try {
            this.h.writeSampleData(i, byteBuffer, bufferInfo);
            return true;
        } catch (Exception e) {
            L.j(e, "failed to write sample");
            return false;
        }
    }
}
