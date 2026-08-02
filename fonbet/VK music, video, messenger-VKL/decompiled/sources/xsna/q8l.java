package xsna;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.NoSuchElementException;

/* compiled from: DecoderUtils.kt */
/* loaded from: classes3.dex */
public final class q8l {
    public static final q8l a = new q8l();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003a, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static MediaCodecInfo a() {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                String[] supportedTypes = codecInfoAt.getSupportedTypes();
                int i2 = 0;
                while (true) {
                    if (i2 < supportedTypes.length) {
                        int i3 = i2 + 1;
                        try {
                            if (brm0.w(supportedTypes[i2], "video/avc", true)) {
                                return codecInfoAt;
                            }
                            i2 = i3;
                        } catch (ArrayIndexOutOfBoundsException e) {
                            throw new NoSuchElementException(e.getMessage());
                        }
                    }
                }
            }
        }
        return null;
    }
}
