package yads;

import android.media.MediaFormat;

/* loaded from: classes10.dex */
public abstract class rm1 {
    public static void a(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }
}
