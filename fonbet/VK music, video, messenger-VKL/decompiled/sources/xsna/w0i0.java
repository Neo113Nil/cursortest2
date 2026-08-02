package xsna;

import com.vk.im.engine.models.sync.ImBgSyncMode;
import com.vk.im.engine.models.sync.SyncStartCause;
import com.vk.im.engine.models.sync.SyncStopCause;

/* compiled from: SecondaryMessagesSynchronizer.kt */
/* loaded from: classes.dex */
public interface w0i0 {
    void a(SyncStopCause syncStopCause);

    void b(ImBgSyncMode imBgSyncMode, SyncStartCause syncStartCause);
}
