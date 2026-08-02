package xsna;

import com.vk.dto.common.id.UserId;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: SpoilerPhotoManagerImpl.kt */
/* loaded from: classes2.dex */
public final class fmk0 implements emk0 {
    public static final fmk0 a = new fmk0();
    public static final ConcurrentHashMap.KeySetView<String, Boolean> b = ConcurrentHashMap.newKeySet();

    @Override // xsna.emk0
    public final void a(long j, UserId userId) {
        StringBuilder sb = new StringBuilder();
        sb.append(userId);
        sb.append('_');
        sb.append(j);
        b.add(sb.toString());
    }

    public final boolean b(long j, UserId userId) {
        StringBuilder sb = new StringBuilder();
        sb.append(userId);
        sb.append('_');
        sb.append(j);
        return b.contains(sb.toString());
    }
}
