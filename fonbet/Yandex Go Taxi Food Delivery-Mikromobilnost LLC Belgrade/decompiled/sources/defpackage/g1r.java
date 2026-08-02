package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.File;
import java.io.RandomAccessFile;
import java.security.SecureRandom;

/* loaded from: classes4.dex */
public final class g1r {
    public static boolean a(File file) {
        if (!file.exists()) {
            return false;
        }
        SecureRandom secureRandom = new SecureRandom();
        byte[] generateSeed = secureRandom.generateSeed(8192);
        long length = (file.length() / PlaybackStateCompat.ACTION_PLAY_FROM_URI) + 1;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        long j = 0;
        try {
            randomAccessFile.seek(0L);
            if (0 <= length) {
                while (true) {
                    secureRandom.nextBytes(generateSeed);
                    randomAccessFile.write(generateSeed);
                    if (j == length) {
                        break;
                    }
                    j++;
                }
            }
            randomAccessFile.close();
            return true;
        } finally {
        }
    }
}
