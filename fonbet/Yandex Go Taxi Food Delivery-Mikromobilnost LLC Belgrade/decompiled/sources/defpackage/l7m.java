package defpackage;

import androidx.media3.exoplayer.offline.e;
import androidx.media3.exoplayer.scheduler.Requirements;

/* loaded from: classes10.dex */
public interface l7m {
    void onDownloadChanged(e eVar, u6m u6mVar, Exception exc);

    void onDownloadRemoved(e eVar, u6m u6mVar);

    default void onDownloadsPausedChanged(e eVar, boolean z) {
    }

    void onIdle(e eVar);

    void onInitialized(e eVar);

    void onRequirementsStateChanged(e eVar, Requirements requirements, int i);

    void onWaitingForRequirementsChanged(e eVar, boolean z);
}
