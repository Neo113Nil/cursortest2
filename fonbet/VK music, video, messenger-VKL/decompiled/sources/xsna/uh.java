package xsna;

import com.vk.music.offline.api.model.MusicOfflineCacheStorage;

/* compiled from: AbstractSharedFlow.kt */
/* loaded from: classes11.dex */
public final class uh {
    public static final spj[] a = new spj[0];
    public static final uh b = new uh();
    public static xsl c;

    public static MusicOfflineCacheStorage a(String str) {
        if (str != null) {
            return MusicOfflineCacheStorage.valueOf(str);
        }
        return null;
    }

    public synchronized wsl b() {
        xsl xslVar;
        xslVar = c;
        if (xslVar == null) {
            throw new IllegalStateException("Manager not initialized");
        }
        return xslVar;
    }
}
