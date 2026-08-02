package xsna;

import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.media.player.video.view.SimpleVideoView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class ktd implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ktd(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ClipsDraftVk clipsDraftVk = (ClipsDraftVk) this.d;
                ClipsDraftPersistentStore.b.getClass();
                ClipsDraftPersistentStore.f(clipsDraftVk, this.c);
                break;
            default:
                SimpleVideoView.g((SimpleVideoView) this.d, this.c);
                break;
        }
    }
}
