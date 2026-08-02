package xsna;

import com.vk.music.offline.api.domain.download.AudioDownloadManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: CompositeAudioDownloadManagerListener.kt */
/* loaded from: classes.dex */
public final class msi implements AudioDownloadManager.b {
    public final CopyOnWriteArrayList<AudioDownloadManager.b> a = new CopyOnWriteArrayList<>();

    @Override // com.vk.music.offline.api.domain.download.AudioDownloadManager.b
    public final void a(String str, AudioDownloadManager.State state, Exception exc) {
        Iterator<AudioDownloadManager.b> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().a(str, state, exc);
        }
    }
}
