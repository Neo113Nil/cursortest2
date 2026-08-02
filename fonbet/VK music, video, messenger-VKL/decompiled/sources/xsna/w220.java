package xsna;

import android.content.Context;
import android.os.Trace;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.vk.toggle.b;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: MemoryMappedFeatureSource.kt */
/* loaded from: classes11.dex */
public final class w220 {
    public final ReentrantReadWriteLock a = new ReentrantReadWriteLock();
    public x220<a, b.d> b;
    public final String c;
    public final String d;
    public final AtomicInteger e;
    public izs<? super Throwable, s3q0> f;

    /* compiled from: MemoryMappedFeatureSource.kt */
    /* loaded from: classes6.dex */
    public static final class a {
        public final CharSequence a;

        public a(CharSequence charSequence) {
            this.a = charSequence;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (a.class.equals(obj != null ? obj.getClass() : null)) {
                return TextUtils.equals(this.a, ((a) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return thl0.a(new StringBuilder("Key(key="), this.a, ')');
        }
    }

    public w220(String str) {
        String str2;
        Context context = e43.a;
        if (context != null) {
            if ((context == null ? null : context).getFilesDir() != null) {
                StringBuilder sb = new StringBuilder();
                Context context2 = e43.a;
                sb.append((context2 != null ? context2 : null).getFilesDir().getAbsolutePath());
                sb.append("/toggles/");
                str2 = sb.toString();
                this.c = str2;
                this.d = str.concat(".scheme_2");
                this.e = new AtomicInteger(0);
            }
        }
        str2 = "";
        this.c = str2;
        this.d = str.concat(".scheme_2");
        this.e = new AtomicInteger(0);
    }

    public final void a() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.a;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            nbr.l(new File(this.c));
            s3q0 s3q0Var = s3q0.a;
        } finally {
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    public final void b() {
        Trace.beginSection(ndp0.f("MemoryMappedFeatureSource.prepareStorage"));
        try {
            File file = new File(this.c, this.d);
            if (file.exists()) {
                FileChannel channel = new RandomAccessFile(file.getAbsolutePath(), "rw").getChannel();
                try {
                    this.b = new x220<>(channel.map(FileChannel.MapMode.READ_WRITE, 0L, PlaybackStateCompat.ACTION_PLAY_FROM_URI).load(), new cdy(), new bkr0());
                    s3q0 s3q0Var = s3q0.a;
                    channel.close();
                } finally {
                }
            }
            s3q0 s3q0Var2 = s3q0.a;
        } finally {
            Trace.endSection();
        }
    }
}
