package xsna;

import com.vk.music.offline.impl.di.OfflineAudioComponentImpl;

/* compiled from: OfflineAudioComponentImpl.kt */
/* loaded from: classes.dex */
public final class gt70 implements t9v {
    public Object a;

    @Override // xsna.t9v
    public void b(String str, String str2, String str3) {
        OfflineAudioComponentImpl offlineAudioComponentImpl = (OfflineAudioComponentImpl) this.a;
        qcy<Object>[] qcyVarArr = OfflineAudioComponentImpl.M;
        offlineAudioComponentImpl.Ef().b(str, str2, str3);
    }

    @Override // xsna.t9v
    public void c(String str, float f, long j) {
        OfflineAudioComponentImpl offlineAudioComponentImpl = (OfflineAudioComponentImpl) this.a;
        qcy<Object>[] qcyVarArr = OfflineAudioComponentImpl.M;
        offlineAudioComponentImpl.Ef().c(str, f, j);
    }
}
