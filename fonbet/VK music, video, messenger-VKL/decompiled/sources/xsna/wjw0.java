package xsna;

import com.vk.music.offline.impl.sync.MusicOfflineSyncServiceHelper;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class wjw0 implements izs {
    public final /* synthetic */ int b = 0;

    public /* synthetic */ wjw0() {
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((it80) obj).a != 0);
            default:
                MusicOfflineSyncServiceHelper.h("audio.getMigrationPlaylistIds", (Throwable) obj);
                return s3q0.a;
        }
    }

    public /* synthetic */ wjw0(MusicOfflineSyncServiceHelper musicOfflineSyncServiceHelper) {
    }
}
