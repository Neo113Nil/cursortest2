package xsna;

import com.vk.camera.clips.drafts.sync.api.di.ClipsDraftSyncComponent;
import com.vk.dto.common.id.UserId;

/* compiled from: ClipsDraftsTableNameProviderVk.kt */
/* loaded from: classes14.dex */
public final class tud {
    public final UserId a;

    public tud(UserId userId) {
        this.a = userId;
    }

    public final String a() {
        ClipsDraftSyncComponent.a aVar = ClipsDraftSyncComponent.Companion;
        long j = this.a.b;
        aVar.getClass();
        return "drafts_" + j;
    }
}
