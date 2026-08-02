package xsna;

import com.vk.music.offline.api.domain.download.AudioDownloadManager;
import com.vk.music.offline.impl.di.OfflineAudioComponentImpl;

/* compiled from: OfflineAudioComponentImpl.kt */
/* loaded from: classes.dex */
public final class ht70 implements AudioDownloadManager.b {
    public final /* synthetic */ OfflineAudioComponentImpl a;

    public ht70(OfflineAudioComponentImpl offlineAudioComponentImpl) {
        this.a = offlineAudioComponentImpl;
    }

    @Override // com.vk.music.offline.api.domain.download.AudioDownloadManager.b
    public final void a(String str, AudioDownloadManager.State state, Exception exc) {
        qcy<Object>[] qcyVarArr = OfflineAudioComponentImpl.M;
        ((com.vk.music.offline.api.domain.download.a) this.a.v.getValue()).e(str, state);
    }
}
