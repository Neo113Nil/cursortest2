package xsna;

import com.vk.dto.common.ClipVideoFile;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: ClipVideoFileDislikesStore.kt */
/* loaded from: classes18.dex */
public final class zed {
    public static final ConcurrentHashMap.KeySetView a = ConcurrentHashMap.newKeySet();

    public static boolean a(ClipVideoFile clipVideoFile) {
        return a.contains(clipVideoFile.a1());
    }
}
