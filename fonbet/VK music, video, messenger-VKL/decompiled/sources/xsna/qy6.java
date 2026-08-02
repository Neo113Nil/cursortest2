package xsna;

import com.vk.im.engine.models.ImBgSyncState;

/* compiled from: BgSyncStateStorageImpl.kt */
/* loaded from: classes2.dex */
public final class qy6 implements py6 {
    public final io.reactivex.rxjava3.subjects.d<ImBgSyncState> a = io.reactivex.rxjava3.subjects.d.O0(ImBgSyncState.DISCONNECTED);

    @Override // xsna.py6
    public final io.reactivex.rxjava3.subjects.d<ImBgSyncState> getState() {
        return this.a;
    }
}
