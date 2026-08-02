package xsna;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/* compiled from: FileLock.jvmAndroid.kt */
/* loaded from: classes12.dex */
public final class i9r {
    public final Object a;
    public Object b;

    public i9r(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }

    public void a() {
        String str = (String) this.a;
        if (((FileChannel) this.b) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.b = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th) {
            FileChannel fileChannel = (FileChannel) this.b;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.b = null;
            throw new IllegalStateException(zr.a("Unable to lock file: '", str, "'."), th);
        }
    }

    public i9r(String str) {
        this.a = str.concat(".lck");
    }
}
